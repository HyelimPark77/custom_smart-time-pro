package com.sma.smartv3.p610ui.launcher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.RomUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.iflytek.sparkchain.core.rtasr.RTASR;
import com.iflytek.sparkchain.core.rtasr.RTASRCallbacks;
import com.iflytek.sparkchain.plugins.utils.Utils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.Languages;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
@RequiresApi(api = 23)
public class TestRecordingActivity extends AppCompatActivity {
    private AudioManager audioManager;
    TextView chatOutputText;
    private AudioRecord mAudioRecord;
    private int mBufferSize;
    private RTASR mRTASR;
    private AudioDeviceInfo targetAudioDevice;
    private final String rtAsrApiKey = "0c997b55309fdb251dcb1b8cc6c87959";
    private boolean isRecording = false;
    OIi0 scoStateReceiver = new OIi0();
    Handler handler = new Handler();
    boolean isrun = false;
    File outputFile = new File(PathUtils.getExternalAppDataPath() + "/files/recorddemo.pcm");

    public class I0IIOi implements RTASRCallbacks {

        public class OXO1 implements Runnable {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ RTASR.RtAsrResult f54618IO;

            public OXO1(final RTASR.RtAsrResult val$result) {
                this.f54618IO = val$result;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestRecordingActivity.this.chatOutputText.setText(TestRecordingActivity.this.chatOutputText.getText().toString() + "data:" + this.f54618IO.getData() + "\nstatus:" + this.f54618IO.getStatus() + "\nsrc:" + this.f54618IO.getTransResult().getSrc() + "\ndst:" + this.f54618IO.getTransResult().getDst() + "\ntransstatus:" + this.f54618IO.getTransResult().getStatus() + "\n\n");
            }
        }

        public I0IIOi() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError error, Object usrTag) {
            Log.d(Utils.TAG, "errorcode:" + error.getCode());
            Log.d(Utils.TAG, "errortag:" + ((String) usrTag));
            TestRecordingActivity.this.isrun = false;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult result, Object usrTag) {
            Log.d(Utils.TAG, "data:" + result.getData());
            Log.d(Utils.TAG, "RawResult:" + result.getRawResult());
            Log.d(Utils.TAG, "data status:" + result.getStatus());
            Log.d(Utils.TAG, "src:" + result.getTransResult().getSrc());
            Log.d(Utils.TAG, "dst:" + result.getTransResult().getDst());
            Log.d(Utils.TAG, "transstatus:" + result.getTransResult().getStatus());
            Log.d(Utils.TAG, "sid:" + result.getSid());
            Log.d(Utils.TAG, "tag:" + ((String) usrTag));
            TestRecordingActivity.this.runOnUiThread(new OXO1(result));
            if (result.getStatus() == 3) {
                TestRecordingActivity.this.isrun = false;
            }
        }
    }

    public class IiI10X implements Runnable {
        public IiI10X() {
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 2, insn: 0x0051: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:9:0x0051 */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            FileOutputStream fileOutputStream;
            Exception e;
            FileOutputStream fileOutputStream2;
            FileOutputStream fileOutputStream3 = null;
            try {
                try {
                    try {
                        TestRecordingActivity.this.mAudioRecord.startRecording();
                        fileOutputStream = new FileOutputStream(TestRecordingActivity.this.outputFile);
                        try {
                            int i = TestRecordingActivity.this.mBufferSize;
                            byte[] bArr = new byte[i];
                            Log.d(Utils.TAG, "111111111111111111 mBufferSize  " + TestRecordingActivity.this.mBufferSize);
                            while (TestRecordingActivity.this.isRecording) {
                                TestRecordingActivity.this.mAudioRecord.read(bArr, 0, i);
                                fileOutputStream.write(bArr);
                                fileOutputStream.flush();
                            }
                            TestRecordingActivity.this.mAudioRecord.stop();
                            TestRecordingActivity.this.mAudioRecord.release();
                            TestRecordingActivity.this.closeBluetooth();
                            Log.d(Utils.TAG, "111111111111111111 closeBluetooth  isRecording = " + TestRecordingActivity.this.isRecording);
                            TestRecordingActivity.this.testRtasr2();
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            Log.d(Utils.TAG, "111111111111111111 m  6 e " + e.toString());
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream3 = fileOutputStream2;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    fileOutputStream = null;
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream3 != null) {
                        fileOutputStream3.close();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    public class O00 implements RTASRCallbacks {

        public class OXO1 implements Runnable {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ RTASR.RtAsrResult f54621IO;

            public OXO1(final RTASR.RtAsrResult val$result) {
                this.f54621IO = val$result;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestRecordingActivity.this.chatOutputText.setText(this.f54621IO.getData());
            }
        }

        public O00() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError error, Object usrTag) {
            TestRecordingActivity.this.isrun = false;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult result, Object usrTag) {
            TestRecordingActivity.this.runOnUiThread(new OXO1(result));
            if (result.getStatus() == 3) {
                TestRecordingActivity.this.isrun = false;
            }
        }
    }

    public class OIi0 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
                if (intExtra == -1) {
                    TestRecordingActivity.this.chatOutputText.setText("SCO Audio State: ERROR  错误");
                    Log.d(Utils.TAG, "111111111111111111 SCO Audio State: ERROR  错误");
                    return;
                }
                if (intExtra == 0) {
                    Log.d(Utils.TAG, "111111111111111111 SCO Audio State: DISCONNECTED   断开 ");
                    TestRecordingActivity.this.chatOutputText.setText("SCO Audio State: DISCONNECTED   断开");
                } else if (intExtra == 1) {
                    TestRecordingActivity.this.audioManager.setBluetoothScoOn(true);
                    TestRecordingActivity.this.chatOutputText.setText("SCO Audio State: CONNECTED   处理连接后状态 -->  正常可以用了---->  打开!!!");
                    Log.d(Utils.TAG, "111111111111111111 SCO Audio State: CONNECTED  处理连接后状态");
                } else {
                    if (intExtra != 2) {
                        return;
                    }
                    Log.d(Utils.TAG, "111111111111111111 SCO Audio State: CONNECTING   连接中状态  ");
                    TestRecordingActivity.this.chatOutputText.setText("SCO Audio State: CONNECTING   连接中状态--> 连接中-->");
                }
            }
        }

        public OIi0() {
        }
    }

    public class OXO1 implements View.OnClickListener {
        public OXO1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    public class XIi00iiXO implements View.OnClickListener {
        public XIi00iiXO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TestRecordingActivity.this.chatOutputText.setText("");
            TestRecordingActivity.this.start();
        }
    }

    public class XO0O10 implements Runnable {
        public XO0O10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(Utils.TAG, "111111111111111111   SCO Audio  开始  " + TestRecordingActivity.this.audioManager.isBluetoothScoOn());
            TestRecordingActivity.this.chatOutputText.setText("SCO Audio State:   开始 --> 连接");
            TestRecordingActivity.this.audioManager.startBluetoothSco();
            if (Build.BRAND.equals("HUAWEI") || RomUtils.isOppo()) {
                TestRecordingActivity.this.audioManager.setMode(2);
                TestRecordingActivity.this.audioManager.setMicrophoneMute(false);
                TestRecordingActivity.this.audioManager.setSpeakerphoneOn(false);
            } else {
                TestRecordingActivity.this.audioManager.setMode(2);
                TestRecordingActivity.this.audioManager.setMicrophoneMute(false);
                TestRecordingActivity.this.audioManager.setSpeakerphoneOn(false);
            }
            TestRecordingActivity.this.startRecording();
        }
    }

    public class XOO0ii0 implements Runnable {
        public XOO0ii0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TestRecordingActivity.this.chatOutputText.setText(TestRecordingActivity.this.chatOutputText.getText().toString() + "\n  开始解析录音文件  \n");
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.launcher.TestRecordingActivity$iO */
    public class ViewOnClickListenerC18837iO implements View.OnClickListener {
        public ViewOnClickListenerC18837iO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TestRecordingActivity.this.stopRecording();
            TestRecordingActivity.this.audioManager.stopBluetoothSco();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeBluetooth() {
        this.audioManager.setBluetoothScoOn(false);
        this.audioManager.stopBluetoothSco();
        this.audioManager.setMode(0);
    }

    private int initSDK() {
        RTASR rtasr = new RTASR("0c997b55309fdb251dcb1b8cc6c87959");
        this.mRTASR = rtasr;
        rtasr.registerCallbacks(new O00());
        this.mRTASR.transType("normal");
        this.mRTASR.lang("cn");
        this.mRTASR.targetLang(Languages.DEFAULT_LANGUAGE);
        return this.mRTASR.start("xdx");
    }

    private void initSDK2() {
    }

    private void initialRecorder() {
        this.mBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        if (ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != 0) {
            ToastUtils.showLong("没有录音权限");
            return;
        }
        AudioRecord audioRecord = new AudioRecord(0, 16000, 16, 2, this.mBufferSize);
        this.mAudioRecord = audioRecord;
        if (audioRecord.getState() != 1) {
            Log.e("AudioRecord", "Initialization failed.");
        } else {
            Log.d("AudioRecord", "Initialized successfully.");
        }
    }

    private void listener() {
        findViewById(R.id.start_init).setOnClickListener(new OXO1());
        findViewById(R.id.test_btn).setOnClickListener(new XIi00iiXO());
        findViewById(R.id.test_btn2).setOnClickListener(new ViewOnClickListenerC18837iO());
        IntentFilter intentFilter = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        if (Build.VERSION.SDK_INT >= 34) {
            ContextCompat.registerReceiver(this, this.scoStateReceiver, intentFilter, 2);
        } else {
            registerReceiver(this.scoStateReceiver, intentFilter);
        }
    }

    private void setStartBluetooth() {
        this.handler.postDelayed(new XO0O10(), 100L);
        Log.d(Utils.TAG, "getMode 当前的数据是 111:" + this.audioManager.getMode() + "   Build.BRAND = " + Build.BRAND + "  ,  Build.VERSION.SDK_INT  = " + Build.VERSION.SDK_INT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start() {
        setStartBluetooth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRecording() {
        if (this.isRecording) {
            return;
        }
        this.isRecording = true;
        Log.d(Utils.TAG, "111111111111111111 isRecording  " + this.isRecording);
        initialRecorder();
        new Thread(new IiI10X()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRecording() {
        if (this.isRecording) {
            this.isRecording = false;
        }
    }

    private void testRtasr(byte[] bytes, int mBufferSize) {
        if (this.mRTASR == null) {
            initSDK();
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bArr = new byte[mBufferSize];
            while (true) {
                int i = byteArrayInputStream.read(bArr);
                if (-1 == i) {
                    byteArrayInputStream.close();
                    return;
                } else if (i > 0) {
                    this.mRTASR.write((byte[]) bArr.clone());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void testRtasr2() {
        runOnUiThread(new XOO0ii0());
        if (this.isrun) {
            return;
        }
        this.isrun = true;
        RTASR rtasr = new RTASR("0c997b55309fdb251dcb1b8cc6c87959");
        this.mRTASR = rtasr;
        rtasr.registerCallbacks(new I0IIOi());
        this.mRTASR.transType("normal");
        this.mRTASR.lang("cn");
        if (this.mRTASR.start("tag") != 0) {
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(this.outputFile);
            byte[] bArr = new byte[320];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (-1 == i) {
                    fileInputStream.close();
                    this.mRTASR.stop();
                    return;
                } else if (i > 0) {
                    this.mRTASR.write((byte[]) bArr.clone());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init() {
        listener();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spark_api_rtasr);
        this.chatOutputText = (TextView) findViewById(R.id.chat_output_text);
        initSDK2();
        init();
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.audioManager = audioManager;
        if (Build.VERSION.SDK_INT >= 28) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(1)) {
                if (audioDeviceInfo.getType() == 7) {
                    this.targetAudioDevice = audioDeviceInfo;
                }
                this.chatOutputText.setText(((Object) this.chatOutputText.getText()) + "\n  当前的音频输入设备 type =>  " + audioDeviceInfo.getType() + "  id =   " + audioDeviceInfo.getId());
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.audioManager.stopBluetoothSco();
        unregisterReceiver(this.scoStateReceiver);
    }

    public void playUri(Uri uri) {
    }
}
