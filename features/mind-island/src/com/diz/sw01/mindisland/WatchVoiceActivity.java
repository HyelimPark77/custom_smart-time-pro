package com.diz.sw01.mindisland;

import android.Manifest;
import android.app.Activity;
import android.bluetooth.*;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.Gravity;
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
    private ScrollView voiceScroll;
    private LinearLayout inputCard,confirmationCard;
    private boolean busy,verifiedWatch,rawCaptureEnded;
    private volatile int generation;
    private String recognized="",signalSummary="";
    private final StringBuilder segments=new StringBuilder();
    private static final int CAPTURE_SECONDS=6;
    private static final int BYTES_PER_SECOND=32000;
    private static final int CAPTURE_BYTES=CAPTURE_SECONDS*BYTES_PER_SECOND;
    private static final String[] KEYS={"sun","clear","cloud","rain","wind"};

    @Override public void onCreate(Bundle state){
        setTheme(android.R.style.Theme_Material_Light_NoActionBar);
        super.onCreate(state);
        audio=getSystemService(AudioManager.class);
        adapter=getSystemService(BluetoothManager.class).getAdapter();
        connectProfile();
        getWindow().setStatusBarColor(Color.parseColor("#F9F6FF"));
        getWindow().setNavigationBarColor(Color.parseColor("#F9F6FF"));
        getWindow().getDecorView().setSystemUiVisibility(android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR|android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        ScrollView scroll=new ScrollView(this);voiceScroll=scroll;scroll.setFillViewport(true);
        scroll.setBackground(new GradientDrawable(GradientDrawable.Orientation.TL_BR,new int[]{Color.parseColor("#F9F6FF"),Color.parseColor("#FDF5FC"),Color.parseColor("#EFFAF6")}));
        LinearLayout box=new LinearLayout(this);box.setOrientation(1);box.setPadding(dp(20),dp(14),dp(20),dp(28));scroll.addView(box);
        LinearLayout header=new LinearLayout(this);header.setGravity(Gravity.CENTER_VERTICAL);box.addView(header);
        Button back=new Button(this);back.setText("←");back.setTextSize(24);back.setTextColor(Color.parseColor("#61438A"));back.setContentDescription("마음 날씨로 돌아가기");back.setBackground(rounded("#FFFFFF",25));header.addView(back,new LinearLayout.LayoutParams(dp(48),dp(48)));back.setOnClickListener(v->finish());
        LinearLayout title=new LinearLayout(this);title.setOrientation(1);LinearLayout.LayoutParams titleParams=new LinearLayout.LayoutParams(0,-2,1);titleParams.setMargins(dp(12),0,0,0);header.addView(title,titleParams);
        TextView wordmark=label(title,"마음섬",20);wordmark.setTypeface(null,Typeface.BOLD);label(title,"워치로 마음 말하기",11);
        LinearLayout buddy=card(box,new String[]{"#EEE2FF","#FFE8F2"});buddy.setOrientation(0);buddy.setGravity(Gravity.CENTER_VERTICAL);
        ImageView mascot=new ImageView(this);mascot.setScaleType(ImageView.ScaleType.FIT_CENTER);mascot.setImportantForAccessibility(android.view.View.IMPORTANT_FOR_ACCESSIBILITY_NO);
        try(InputStream image=getAssets().open("mind-island/mascots.png")){mascot.setImageBitmap(android.graphics.BitmapFactory.decodeStream(image));}catch(IOException ignored){}
        buddy.addView(mascot,new LinearLayout.LayoutParams(dp(86),dp(100)));
        LinearLayout greeting=new LinearLayout(this);greeting.setOrientation(1);buddy.addView(greeting,new LinearLayout.LayoutParams(0,-2,1));
        TextView welcome=label(greeting,"어떤 마음이든\n들려줘도 괜찮아요.",18);welcome.setTypeface(null,Typeface.BOLD);label(greeting,"토끼와 별 친구가 기다려요 ♡",11);
        TextView heading=label(box,"말로 남기는 나의 마음 날씨",24);heading.setTypeface(null,Typeface.BOLD);heading.setPadding(0,dp(24),0,dp(6));
        label(box,"연결 확인 → 6초 말하기 → 마음 확인",12);
        LinearLayout input=card(box,new String[]{"#FFFFFF","#FFFFFF"});inputCard=input;
        routeView=label(input,"워치와 전화용 Bluetooth로 연결해 주세요.",12);
        status=label(input,"준비되면 시작해 주세요.",18);status.setTypeface(null,Typeface.BOLD);
        label(input,"안내가 나오면 ‘오늘 마음 흐림’처럼 말해 주세요.",12);
        start=button(input,"워치로 말하기 시작",true);start.setOnClickListener(v->begin());
        Button stop=button(input,"말하기 중단",false);stop.setOnClickListener(v->cancelSession("입력을 중단했습니다. 다시 시작할 수 있어요."));
        LinearLayout confirmation=card(box,new String[]{"#FFFFFF","#FFFFFF"});confirmationCard=confirmation;
        TextView resultTitle=label(confirmation,"내가 말한 마음",17);resultTitle.setTypeface(null,Typeface.BOLD);
        result=label(confirmation,"말한 내용이 여기에 나타나요.",14);result.setBackground(rounded("#F8F3FF",14));result.setPadding(dp(12),dp(12),dp(12),dp(12));
        label(confirmation,"마음 날씨는 직접 바꿔도 괜찮아요.",12);
        choices=new RadioGroup(this);choices.setOrientation(0);choices.setBaselineAligned(false);
        String[] icons={"☀","◒","☁","☂","〰"};
        for(int i=0;i<MoodParser.LABELS.length;i++){
            RadioButton b=new RadioButton(this);b.setId(100+i);b.setButtonDrawable(null);b.setGravity(Gravity.CENTER);b.setTextColor(Color.parseColor("#61438A"));b.setTextSize(12);b.setPadding(dp(2),dp(10),dp(2),dp(10));
            android.text.SpannableString caption=new android.text.SpannableString(icons[i]+"\n"+MoodParser.LABELS[i]);caption.setSpan(new android.text.style.AbsoluteSizeSpan(26,true),0,icons[i].length(),0);b.setText(caption);
            if(i==1||i==4){MoodWeatherDrawable icon=new MoodWeatherDrawable(i==1);icon.setBounds(0,0,dp(32),dp(32));b.setText(MoodParser.LABELS[i]);b.setCompoundDrawables(null,icon,null,null);b.setCompoundDrawablePadding(dp(3));}
            StateListDrawable background=new StateListDrawable();background.addState(new int[]{android.R.attr.state_checked},outlined("#F0E3FF","#A47BC5",18));background.addState(new int[]{},outlined("#FFFAFC","#EADFF2",18));b.setBackground(background);
            LinearLayout.LayoutParams option=new LinearLayout.LayoutParams(0,dp(84),1);if(i>0)option.setMargins(dp(5),0,0,0);choices.addView(b,option);
        }
        LinearLayout.LayoutParams choiceParams=new LinearLayout.LayoutParams(-1,-2);choiceParams.setMargins(0,dp(10),0,dp(8));confirmation.addView(choices,choiceParams);
        choices.setOnCheckedChangeListener((g,id)->apply.setEnabled(!recognized.isEmpty()&&id>=100&&id<105));
        apply=button(confirmation,"이 마음 날씨로 적용하기",true);apply.setEnabled(false);
        apply.setOnClickListener(v->{int index=choices.getCheckedRadioButtonId()-100;if(index<0||index>=KEYS.length||recognized.isEmpty())return;
            setResult(RESULT_OK,new Intent().putExtra("weather",KEYS[index]).putExtra("transcript",recognized));finish();});
        label(confirmation,"적용한 뒤 마음섬의 저장 버튼을 눌러야 기록돼요.",11);
        TextView privacy=label(box,"음성은 파일로 저장하지 않아요.\n말하기가 어렵다면 직접 골라도 괜찮아요.",12);privacy.setGravity(Gravity.CENTER);privacy.setPadding(0,dp(22),0,dp(6));
        Button manual=button(box,"마음 날씨 직접 선택하기",false);manual.setOnClickListener(v->finish());
        setContentView(scroll);
        if(Build.VERSION.SDK_INT>=30){
            getWindow().setDecorFitsSystemWindows(false);
            scroll.setOnApplyWindowInsetsListener((view,insets)->{
                android.graphics.Insets safe=insets.getInsets(android.view.WindowInsets.Type.systemBars()|android.view.WindowInsets.Type.displayCutout());
                view.setPadding(safe.left,safe.top,safe.right,safe.bottom);return android.view.WindowInsets.CONSUMED;
            });scroll.requestApplyInsets();
        }
    }
    private int dp(int value){return Math.round(value*getResources().getDisplayMetrics().density);}
    private GradientDrawable rounded(String color,int radius){GradientDrawable d=new GradientDrawable();d.setColor(Color.parseColor(color));d.setCornerRadius(dp(radius));return d;}
    private GradientDrawable outlined(String fill,String stroke,int radius){GradientDrawable d=rounded(fill,radius);d.setStroke(dp(1),Color.parseColor(stroke));return d;}
    private TextView label(LinearLayout box,String value,int size){TextView t=new TextView(this);t.setText(value);t.setTextSize(size);t.setTextColor(Color.parseColor(size>=17?"#61438A":"#8B789C"));t.setLineSpacing(dp(2),1);t.setPadding(0,dp(4),0,dp(6));box.addView(t);return t;}
    private LinearLayout card(LinearLayout box,String[] colors){LinearLayout c=new LinearLayout(this);c.setOrientation(1);c.setPadding(dp(17),dp(18),dp(17),dp(18));GradientDrawable d=new GradientDrawable(GradientDrawable.Orientation.TL_BR,new int[]{Color.parseColor(colors[0]),Color.parseColor(colors[1])});d.setCornerRadius(dp(24));d.setStroke(dp(1),Color.parseColor("#E9DFF4"));c.setBackground(d);LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,-2);p.setMargins(0,dp(18),0,dp(2));box.addView(c,p);return c;}
    private Button button(LinearLayout box,String text,boolean primary){Button b=new Button(this);b.setText(text);b.setTextSize(14);b.setAllCaps(false);b.setTypeface(null,Typeface.BOLD);b.setPadding(dp(10),dp(10),dp(10),dp(10));
        if(primary){StateListDrawable bg=new StateListDrawable();bg.addState(new int[]{-android.R.attr.state_enabled},rounded("#DDD2EB",18));GradientDrawable active=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#9272D3"),Color.parseColor("#B184D8")});active.setCornerRadius(dp(18));bg.addState(new int[]{},active);b.setBackground(bg);b.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{-android.R.attr.state_enabled},new int[]{}},new int[]{Color.parseColor("#8B789C"),Color.WHITE}));}
        else{b.setBackground(outlined("#FFFAFF","#E6D7F3",18));b.setTextColor(Color.parseColor("#8255A8"));}
        LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,dp(50));p.setMargins(0,dp(10),0,0);box.addView(b,p);return b;}
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
        voiceScroll.post(()->voiceScroll.smoothScrollTo(0,Math.max(0,inputCard.getTop()-dp(12))));
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
            byte[] buffer=new byte[3200];ByteArrayOutputStream memory=new ByteArrayOutputStream(CAPTURE_BYTES);
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
            while(!cancelled.get()&&total<CAPTURE_BYTES) {
                int n=recorder.read(buffer,0,Math.min(buffer.length,CAPTURE_BYTES-total));
                if(n<=0)throw new IllegalStateException("음성 입력이 끊겼습니다.");
                AudioDeviceInfo current=recorder.getRoutedDevice();
                if(current==null||current.getType()!=AudioDeviceInfo.TYPE_BLUETOOTH_SCO||!target.getAddress().equalsIgnoreCase(current.getAddress()))throw new IllegalStateException("입력 장치가 바뀌어 인식을 중단했습니다.");
                memory.write(buffer,0,n);total+=n;
                long chunkSquares=0;
                for(int j=0;j+1<n;j+=2){int sample=(short)((buffer[j]&255)|(buffer[j+1]<<8));chunkSquares+=(long)sample*sample;peak=Math.max(peak,Math.abs(sample));}
                squareSum+=chunkSquares;
                if(Math.sqrt(chunkSquares/(double)Math.max(1,n/2))>200)activeChunks++;
                int seconds=(total+BYTES_PER_SECOND-1)/BYTES_PER_SECOND;
                if(seconds!=lastSeconds){lastSeconds=seconds;final int remain=Math.max(0,CAPTURE_SECONDS-seconds);update(token,()->status.setText("워치 가까이 말해 주세요"+" · 남은 "+remain+"초"));}
            }
            Arrays.fill(buffer,(byte)0);
            if(cancelled.get())return;
            captured=memory.toByteArray();rawCaptureEnded=true;
            final int rms=(int)Math.sqrt(squareSum/(double)(CAPTURE_BYTES/2)),max=peak,chunks=activeChunks;


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
        if(!recognized.isEmpty())voiceScroll.post(()->voiceScroll.smoothScrollTo(0,Math.max(0,confirmationCard.getTop()-dp(12))));
    }
    private void finishRecognition(){busy=false;start.setEnabled(!capturing);if(recognizer!=null){recognizer.destroy();recognizer=null;}if(pipe!=null){for(ParcelFileDescriptor fd:pipe)try{fd.close();}catch(Exception ignored){}pipe=null;}if(pcm!=null){Arrays.fill(pcm,(byte)0);pcm=null;}}
    private void cancelSession(String message){generation++;cancelled.set(true);recognized="";apply.setEnabled(false);AudioRecord r=recorder;if(r!=null)try{r.stop();}catch(Exception ignored){}finishRecognition();status.setText(message);}
    @Override protected void onPause(){super.onPause();cancelSession("화면을 벗어나 입력을 중단했습니다.");}
    @Override protected void onDestroy(){cancelSession("종료했습니다.");if(adapter!=null&&headset!=null)adapter.closeProfileProxy(BluetoothProfile.HEADSET,headset);super.onDestroy();}
}
