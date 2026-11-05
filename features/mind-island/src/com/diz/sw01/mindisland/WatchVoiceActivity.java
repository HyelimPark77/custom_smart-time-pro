package com.diz.sw01.mindisland;

import android.Manifest;
import android.app.Activity;
import android.bluetooth.*;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.*;
import android.os.*;
import android.speech.*;
import android.widget.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/** User-started, on-device watch speech. Nothing is persisted by this screen. */
public final class WatchVoiceActivity extends Activity {
    private final Handler handler=new Handler(Looper.getMainLooper());
    private final AtomicBoolean cancelled=new AtomicBoolean();
    private AudioManager audio;
    private BluetoothAdapter adapter;
    private volatile BluetoothHeadset headset;
    private volatile AudioRecord recorder;
    private volatile boolean capturing;
    private SpeechRecognizer recognizer;
    private ParcelFileDescriptor[] pipe;
    private byte[] pcm;
    private TextView status,result,routeView;
    private Button start,apply;
    private RadioGroup choices;
    private boolean busy,verifiedWatch,rawCaptureEnded;
    private volatile int generation;
    private String recognized="",signalSummary="";
    private final StringBuilder segments=new StringBuilder();
    private static final String[] KEYS={"sun","clear","cloud","rain","wind"};

    @Override public void onCreate(Bundle state){
        setTheme(android.R.style.Theme_Material_Light_NoActionBar);
        super.onCreate(state);
        audio=getSystemService(AudioManager.class);
        adapter=getSystemService(BluetoothManager.class).getAdapter();
        connectProfile();
        ScrollView scroll=new ScrollView(this);LinearLayout box=new LinearLayout(this);box.setOrientation(1);
        int pad=(int)(20*getResources().getDisplayMetrics().density);box.setPadding(pad,pad,pad,pad);scroll.addView(box);
        label(box,"워치로 마음 말하기",24);
        label(box,"시작 후 안내가 나오면 워치에 ‘오늘 마음 흐림’처럼 말해 주세요. 6초 입력 후 결과를 확인합니다.\n전화용 Bluetooth 연결이 필요합니다. 음성은 파일로 저장하지 않습니다.",16);
        routeView=label(box,"워치 연결을 확인한 뒤 시작합니다.",14);
        status=label(box,"시작 전",18);
        start=new Button(this);start.setText("워치로 말하기 시작");box.addView(start);start.setOnClickListener(v->begin());
        Button stop=new Button(this);stop.setText("중단");box.addView(stop);stop.setOnClickListener(v->cancelSession("입력을 중단했습니다. 다시 시작할 수 있어요."));
        result=label(box,"인식 문구: —",18);
        choices=new RadioGroup(this);for(int i=0;i<MoodParser.LABELS.length;i++){RadioButton b=new RadioButton(this);b.setId(100+i);b.setText(MoodParser.LABELS[i]);choices.addView(b);}box.addView(choices);
        choices.setOnCheckedChangeListener((g,id)->apply.setEnabled(!recognized.isEmpty()&&id>=100&&id<105));
        apply=new Button(this);apply.setText("확인한 마음 날씨 적용");apply.setEnabled(false);box.addView(apply);
        apply.setOnClickListener(v->{int index=choices.getCheckedRadioButtonId()-100;if(index<0||index>=KEYS.length||recognized.isEmpty())return;
            setResult(RESULT_OK,new Intent().putExtra("weather",KEYS[index]).putExtra("transcript",recognized));finish();});
        label(box,"적용 후 마음섬 화면에서 ‘오늘의 마음 남기기’를 눌러야 저장됩니다. 인식이 어려우면 뒤로 돌아가 직접 선택해 주세요.",14);
        setContentView(scroll);
        if(Build.VERSION.SDK_INT>=30){
            getWindow().setDecorFitsSystemWindows(false);
            scroll.setOnApplyWindowInsetsListener((view,insets)->{
                android.graphics.Insets safe=insets.getInsets(android.view.WindowInsets.Type.systemBars()|android.view.WindowInsets.Type.displayCutout());
                view.setPadding(safe.left,safe.top,safe.right,safe.bottom);return android.view.WindowInsets.CONSUMED;
            });scroll.requestApplyInsets();
        }
    }
    private TextView label(LinearLayout box,String value,int size){TextView t=new TextView(this);t.setText(value);t.setTextSize(size);t.setPadding(0,12,0,16);box.addView(t);return t;}
    private boolean profileRequested;
    private void connectProfile(){
        if(adapter==null||profileRequested||(Build.VERSION.SDK_INT>=31&&checkSelfPermission(Manifest.permission.BLUETOOTH_CONNECT)!=PackageManager.PERMISSION_GRANTED))return;
        profileRequested=true;
        try{profileRequested=adapter.getProfileProxy(this,new BluetoothProfile.ServiceListener(){
            public void onServiceConnected(int profile,BluetoothProfile proxy){headset=(BluetoothHeadset)proxy;}
            public void onServiceDisconnected(int profile){headset=null;profileRequested=false;}
        },BluetoothProfile.HEADSET);}catch(SecurityException e){profileRequested=false;}
    }
    private void begin(){
        if(busy||capturing)return;
        if(Build.VERSION.SDK_INT<33){status.setText("워치 음성 입력은 Android 13 이상에서 지원합니다. 마음섬에서 직접 선택해 주세요.");return;}
        if(checkSelfPermission(Manifest.permission.RECORD_AUDIO)!=PackageManager.PERMISSION_GRANTED||checkSelfPermission(Manifest.permission.BLUETOOTH_CONNECT)!=PackageManager.PERMISSION_GRANTED){requestPermissions(new String[]{Manifest.permission.RECORD_AUDIO,Manifest.permission.BLUETOOTH_CONNECT},1);status.setText("권한 확인 후 시작을 다시 눌러주세요.");return;}
        if(!SpeechRecognizer.isOnDeviceRecognitionAvailable(this)){status.setText("기기 내 음성 인식기를 사용할 수 없습니다. 직접 선택해 주세요.");return;}
        connectProfile();
        if(headset==null){status.setText("전화용 Bluetooth 상태 확인 중입니다. 잠시 후 시작을 눌러주세요.");return;}
        final int token=++generation;cancelled.set(false);busy=true;capturing=true;verifiedWatch=false;rawCaptureEnded=false;recognized="";
        apply.setEnabled(false);choices.clearCheck();start.setEnabled(false);result.setText("인식 문구: —");routeView.setText("입력 경로 확인 중");status.setText("워치의 전화용 Bluetooth 연결 확인 중…");
        new Thread(()->capture(token),"MindIslandWatchVoice").start();
    }
    private void update(int token,Runnable action){handler.post(()->{if(token==generation&&!cancelled.get())action.run();});}

    private void capture(int token) {
        int oldMode=audio.getMode();AudioDeviceInfo oldDevice=audio.getCommunicationDevice();
        byte[] captured=null;
        BluetoothHeadset sessionHeadset=null;
        BluetoothDevice openedDevice=null;
        try {
            AudioDeviceInfo target=null;
            for(AudioDeviceInfo d:audio.getAvailableCommunicationDevices()) if(d.getType()==AudioDeviceInfo.TYPE_BLUETOOTH_SCO) {
                if(target!=null)throw new IllegalStateException("통화용 Bluetooth 기기가 여러 개입니다. 워치만 연결한 뒤 다시 시험해 주세요.");target=d;
            }
            {
                sessionHeadset=headset;
                if(sessionHeadset==null)throw new IllegalStateException("전화용 Bluetooth 상태 확인 중입니다. 잠시 후 다시 눌러주세요.");
                BluetoothDevice watch=null;
                for(BluetoothDevice d:sessionHeadset.getConnectedDevices()) {
                    if(d.getName()!=null&&d.getName().toLowerCase(java.util.Locale.ROOT).startsWith("diz-sw01")) {
                        if(watch!=null)throw new IllegalStateException("Diz-SW01이 여러 대 연결되어 있습니다.");
                        watch=d;
                    }
                }
                if(watch==null)throw new IllegalStateException("Diz-SW01의 전화용 연결이 확인되지 않았습니다.");
                update(token,()->status.setText("전화용 연결 확인 · 워치 음성 오디오 여는 중…"));
                if(!sessionHeadset.isAudioConnected(watch)) {
                    if(!sessionHeadset.startVoiceRecognition(watch))throw new IllegalStateException("전화용 연결은 있지만 워치가 음성 오디오 열기 요청을 수락하지 않았습니다.");
                    openedDevice=watch;
                }
                for(int i=0;i<80&&!cancelled.get()&&!sessionHeadset.isAudioConnected(watch);i++)Thread.sleep(100);
                if(!sessionHeadset.isAudioConnected(watch))throw new IllegalStateException("워치가 음성 오디오 연결을 완료하지 않았습니다.");
                target=null;
                for(AudioDeviceInfo d:audio.getAvailableCommunicationDevices())if(d.getType()==AudioDeviceInfo.TYPE_BLUETOOTH_SCO&&watch.getAddress().equalsIgnoreCase(d.getAddress()))target=d;
                if(target==null)throw new IllegalStateException("전화용 연결은 있지만 워치 음성 오디오가 8초 안에 열리지 않았습니다.");
            }
            audio.setMode(AudioManager.MODE_IN_COMMUNICATION);
            if(!audio.setCommunicationDevice(target))throw new IllegalStateException("워치 오디오 경로 선택에 실패했습니다.");
            for(int i=0;i<35&&!cancelled.get();i++) {
                AudioDeviceInfo active=audio.getCommunicationDevice();if(active!=null&&active.getType()==AudioDeviceInfo.TYPE_BLUETOOTH_SCO)break;Thread.sleep(100);
            }
            int min=AudioRecord.getMinBufferSize(16000,AudioFormat.CHANNEL_IN_MONO,AudioFormat.ENCODING_PCM_16BIT);
            if(min<=0)throw new IllegalStateException("16kHz 음성 입력을 열 수 없습니다.");
            recorder=new AudioRecord.Builder().setAudioSource(MediaRecorder.AudioSource.VOICE_COMMUNICATION)
                .setAudioFormat(new AudioFormat.Builder().setSampleRate(16000).setChannelMask(AudioFormat.CHANNEL_IN_MONO).setEncoding(AudioFormat.ENCODING_PCM_16BIT).build())
                .setBufferSizeInBytes(Math.max(min,6400)).build();
            if(recorder.getState()!=AudioRecord.STATE_INITIALIZED)throw new IllegalStateException("마이크 초기화에 실패했습니다.");
            AudioDeviceInfo watchInput=null;
            for(AudioDeviceInfo d:audio.getDevices(AudioManager.GET_DEVICES_INPUTS))if(d.getType()==AudioDeviceInfo.TYPE_BLUETOOTH_SCO&&target.getAddress().equalsIgnoreCase(d.getAddress()))watchInput=d;
            if(watchInput==null)throw new IllegalStateException("워치의 출력 연결은 있지만 마이크 입력 장치가 없습니다.");
            if(!recorder.setPreferredDevice(watchInput))throw new IllegalStateException("워치 마이크 직접 선택이 거부됐습니다.");
            recorder.startRecording();
            byte[] buffer=new byte[3200];ByteArrayOutputStream memory=new ByteArrayOutputStream(192000);
            int waited=0;
            while(!cancelled.get()&&waited<35) {
                int n=recorder.read(buffer,0,buffer.length);
                if(n<0)throw new IllegalStateException("마이크 읽기에 실패했습니다: "+n);
                AudioDeviceInfo routed=recorder.getRoutedDevice();
                if(routed!=null&&routed.getType()==AudioDeviceInfo.TYPE_BLUETOOTH_SCO&&target.getAddress().equalsIgnoreCase(routed.getAddress())) {verifiedWatch=true;break;}
                waited++;Thread.sleep(50);
            }
            if(!verifiedWatch) {
                throw new IllegalStateException("워치 마이크 입력을 확인하지 못했습니다. 전화용 연결을 확인한 뒤 다시 시도해 주세요.");
            }
            update(token,()->routeView.setText("실제 입력 경로: Bluetooth SCO 워치 마이크 확인"));

            update(token,()->status.setText("워치 가까이 말해 주세요"+" · 남은 6초"));
            int total=0,lastSeconds=-1;
            long squareSum=0;int peak=0,activeChunks=0;
            while(!cancelled.get()&&total<192000) {
                int n=recorder.read(buffer,0,Math.min(buffer.length,192000-total));
                if(n<=0)throw new IllegalStateException("음성 입력이 끊겼습니다.");
                AudioDeviceInfo current=recorder.getRoutedDevice();
                if(current==null||current.getType()!=AudioDeviceInfo.TYPE_BLUETOOTH_SCO||!target.getAddress().equalsIgnoreCase(current.getAddress()))throw new IllegalStateException("입력 장치가 바뀌어 인식을 중단했습니다.");
                memory.write(buffer,0,n);total+=n;
                long chunkSquares=0;
                for(int j=0;j+1<n;j+=2){int sample=(short)((buffer[j]&255)|(buffer[j+1]<<8));chunkSquares+=(long)sample*sample;peak=Math.max(peak,Math.abs(sample));}
                squareSum+=chunkSquares;
                if(Math.sqrt(chunkSquares/(double)Math.max(1,n/2))>200)activeChunks++;
                int seconds=(total+31999)/32000;
                if(seconds!=lastSeconds){lastSeconds=seconds;final int remain=Math.max(0,6-seconds);update(token,()->status.setText("워치 가까이 말해 주세요"+" · 남은 "+remain+"초"));}
            }
            Arrays.fill(buffer,(byte)0);
            if(cancelled.get())return;
            captured=memory.toByteArray();rawCaptureEnded=true;
            final int rms=(int)Math.sqrt(squareSum/96000.0),max=peak,chunks=activeChunks;


            // Limit gain by both RMS and peak to avoid clipping. This cannot repair unintelligible audio.
            final double gain=rms==0?1:Math.max(1,Math.min(6,Math.min(1800.0/rms,28000.0/Math.max(1,max))));
            for(int j=0;j+1<captured.length;j+=2){int sample=(short)((captured[j]&255)|(captured[j+1]<<8));int scaled=(int)Math.round(sample*gain);captured[j]=(byte)scaled;captured[j+1]=(byte)(scaled>>8);}
            signalSummary="입력 6초 · RMS "+rms+" / 최대 "+max+" / 소리 감지 구간 "+chunks+"개\n인식용 음량 보정 "+String.format(java.util.Locale.ROOT,"%.1f",gain)+"배";
            update(token,()->routeView.setText("워치에서 입력을 받았어요. 인식 문구를 확인해 주세요."));
        } catch(Exception e) {
            final String message=e.getMessage();update(token,()->{status.setText("입력 확인 실패: "+message);busy=false;start.setEnabled(true);});
        } finally {
            AudioRecord r=recorder;recorder=null;if(r!=null){try{r.stop();}catch(Exception ignored){}r.release();}
            if(openedDevice!=null&&sessionHeadset!=null)try{sessionHeadset.stopVoiceRecognition(openedDevice);}catch(Exception ignored){}
            try{if(oldDevice!=null)audio.setCommunicationDevice(oldDevice);else audio.clearCommunicationDevice();audio.setMode(oldMode);}catch(Exception ignored){}
            capturing=false;
            handler.post(()->{if(!busy)start.setEnabled(true);});
        }
        if(captured!=null) {
            final byte[] bytes=captured;
            handler.post(()->{if(token!=generation||cancelled.get()){Arrays.fill(bytes,(byte)0);return;}pcm=bytes;recognize(token);});
        }
    }


    private void recognize(final int token){
        status.setText("입력 완료 · 인식 결과를 기다려 주세요.");segments.setLength(0);
        try{
            pipe=ParcelFileDescriptor.createPipe();recognizer=SpeechRecognizer.createOnDeviceSpeechRecognizer(this);
            recognizer.setRecognitionListener(new RecognitionListener(){
                public void onReadyForSpeech(Bundle b){} public void onBeginningOfSpeech(){} public void onRmsChanged(float r){} public void onBufferReceived(byte[] b){} public void onEndOfSpeech(){} public void onPartialResults(Bundle b){} public void onEvent(int n,Bundle b){}
                public void onError(int error){if(token!=generation)return;status.setText(error==SpeechRecognizer.ERROR_NO_MATCH?"문장을 찾지 못했어요. 다시 말하거나 직접 선택해 주세요.":"음성 인식을 완료하지 못했어요 ("+error+"). 다시 시도하거나 직접 선택해 주세요.");finishRecognition();}
                public void onSegmentResults(Bundle b){if(token!=generation)return;ArrayList<String> words=b.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);if(words!=null&&!words.isEmpty()&&!words.get(0).isEmpty()){if(segments.length()>0)segments.append(' ');segments.append(words.get(0));result.setText("인식 문구: "+segments);}}
                public void onEndOfSegmentedSession(){if(token==generation)complete(segments.toString());}
                public void onResults(Bundle b){if(token!=generation)return;ArrayList<String> words=b.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);complete(words==null||words.isEmpty()?segments.toString():words.get(0));}
            });
            Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM).putExtra(RecognizerIntent.EXTRA_LANGUAGE,"ko-KR").putExtra(RecognizerIntent.EXTRA_PREFER_OFFLINE,true).putExtra(RecognizerIntent.EXTRA_AUDIO_SOURCE,pipe[0]).putExtra(RecognizerIntent.EXTRA_SEGMENTED_SESSION,RecognizerIntent.EXTRA_AUDIO_SOURCE).putExtra(RecognizerIntent.EXTRA_AUDIO_SOURCE_CHANNEL_COUNT,1).putExtra(RecognizerIntent.EXTRA_AUDIO_SOURCE_ENCODING,AudioFormat.ENCODING_PCM_16BIT).putExtra(RecognizerIntent.EXTRA_AUDIO_SOURCE_SAMPLING_RATE,16000);
            recognizer.startListening(intent);
            final byte[] data=pcm;final ParcelFileDescriptor writer=pipe[1];
            new Thread(()->{try(OutputStream out=new ParcelFileDescriptor.AutoCloseOutputStream(writer)){for(int i=0;i<data.length&&!cancelled.get()&&token==generation;i+=3200){out.write(data,i,Math.min(3200,data.length-i));Thread.sleep(100);}}catch(Exception ignored){}},"MindIslandSpeechPipe").start();
            handler.postDelayed(()->{if(token==generation&&busy){status.setText("음성 인식 응답이 늦어 중단했어요. 다시 시도해 주세요.");finishRecognition();}},20000);
        }catch(Exception e){status.setText("음성 인식기를 시작하지 못했어요. 직접 선택해 주세요.");finishRecognition();}
    }
    private void complete(String value){
        recognized=value==null?"":value.trim();result.setText("인식 문구: "+(recognized.isEmpty()?"없음":recognized));
        int index=MoodParser.parse(recognized);if(index>=0)choices.check(100+index);
        apply.setEnabled(!recognized.isEmpty()&&choices.getCheckedRadioButtonId()>=100);
        status.setText(recognized.isEmpty()?"문장을 찾지 못했어요. 다시 말하거나 직접 선택해 주세요.":index>=0?"마음 날씨를 확인하거나 수정한 뒤 적용해 주세요.":"문구를 확인하고 마음 날씨를 직접 골라 주세요.");finishRecognition();
    }
    private void finishRecognition(){busy=false;start.setEnabled(!capturing);if(recognizer!=null){recognizer.destroy();recognizer=null;}if(pipe!=null){for(ParcelFileDescriptor fd:pipe)try{fd.close();}catch(Exception ignored){}pipe=null;}if(pcm!=null){Arrays.fill(pcm,(byte)0);pcm=null;}}
    private void cancelSession(String message){generation++;cancelled.set(true);recognized="";apply.setEnabled(false);AudioRecord r=recorder;if(r!=null)try{r.stop();}catch(Exception ignored){}finishRecognition();status.setText(message);}
    @Override protected void onPause(){super.onPause();cancelSession("화면을 벗어나 입력을 중단했습니다.");}
    @Override protected void onDestroy(){cancelSession("종료했습니다.");if(adapter!=null&&headset!=null)adapter.closeProfileProxy(BluetoothProfile.HEADSET,headset);super.onDestroy();}
}
