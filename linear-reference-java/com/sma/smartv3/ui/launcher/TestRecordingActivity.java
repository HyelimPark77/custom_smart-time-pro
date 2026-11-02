package com.sma.smartv3.ui.launcher;

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
import com.android.mltcode.paycertificationapi.vo5;
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
    Handler handler;
    private boolean isRecording;
    boolean isrun;
    private AudioRecord mAudioRecord;
    private int mBufferSize;
    private RTASR mRTASR;
    File outputFile;
    private final String rtAsrApiKey;
    OIi0 scoStateReceiver;
    private AudioDeviceInfo targetAudioDevice;

    public class I0IIOi implements RTASRCallbacks {
        public final /* synthetic */ TestRecordingActivity OXO1;

        public class OXO1 implements Runnable {
            public final /* synthetic */ I0IIOi I1;
            public final /* synthetic */ RTASR.RtAsrResult IO;

            public OXO1(final I0IIOi this$1, final RTASR.RtAsrResult val$result) {
                this.I1 = this$1;
                this.IO = val$result;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.I1.OXO1.chatOutputText.setText(this.I1.OXO1.chatOutputText.getText().toString() + "data:" + this.IO.getData() + "\nstatus:" + this.IO.getStatus() + "\nsrc:" + this.IO.getTransResult().getSrc() + "\ndst:" + this.IO.getTransResult().getDst() + "\ntransstatus:" + this.IO.getTransResult().getStatus() + "\n\n");
            }
        }

        public I0IIOi(final TestRecordingActivity this$0) {
            this.OXO1 = this$0;
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
            this.OXO1.isrun = false;
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
            this.OXO1.runOnUiThread(new OXO1(this, result));
            if (result.getStatus() != 3) goto L6;
            this.OXO1.isrun = false;
            return;
        }
    }

    public class IiI10X implements Runnable {
        public final /* synthetic */ TestRecordingActivity IO;

        public IiI10X(final TestRecordingActivity this$0) {
            this.IO = this$0;
        }

        /* JADX WARN: Not initialized variable reg: 2, insn: 0x0051: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:9:0x0051 */
        @Override // java.lang.Runnable
        public void run() {
            FileOutputStream r1 = null;
            TestRecordingActivity.XXI(this.IO).startRecording();     // Catch: Throwable -> L17 Exception -> L19
            FileOutputStream r2 = new FileOutputStream(this.IO.outputFile);     // Catch: Throwable -> L17 Exception -> L19
            int r3 = TestRecordingActivity.X1ii(this.IO);     // Catch: Throwable -> L8 Exception -> L10
            byte[] r4 = new byte[r3];     // Catch: Throwable -> L8 Exception -> L10
            Log.d(Utils.TAG, "111111111111111111 mBufferSize  " + TestRecordingActivity.X1ii(this.IO));     // Catch: Throwable -> L8 Exception -> L10
        L6:
            if (TestRecordingActivity.I0iXXO(this.IO) == false) goto L12;
            TestRecordingActivity.XXI(this.IO).read(r4, 0, r3);     // Catch: Throwable -> L8 Exception -> L10
            r2.write(r4);     // Catch: Throwable -> L8 Exception -> L10
            r2.flush();     // Catch: Throwable -> L8 Exception -> L10
            goto L6
        L12:
            TestRecordingActivity.XXI(this.IO).stop();     // Catch: Throwable -> L8 Exception -> L10
            TestRecordingActivity.XXI(this.IO).release();     // Catch: Throwable -> L8 Exception -> L10
            TestRecordingActivity.O10IXXX0X(this.IO);     // Catch: Throwable -> L8 Exception -> L10
            Log.d(Utils.TAG, "111111111111111111 closeBluetooth  isRecording = " + TestRecordingActivity.I0iXXO(this.IO));     // Catch: Throwable -> L8 Exception -> L10
            TestRecordingActivity.XiOIO(this.IO);     // Catch: Throwable -> L8 Exception -> L10
            r2.flush();     // Catch: Throwable -> L8 Exception -> L10
            r2.close();     // Catch: IOException -> L15
            return;
        L10:
            Exception e = e;
        L21:
            e.printStackTrace();     // Catch: Throwable -> L8
            Log.d(Utils.TAG, "111111111111111111 m  6 e " + e.toString());     // Catch: Throwable -> L8
            if (r2 == null) goto L40;
            r2.close();     // Catch: IOException -> L15
            return;
        L40:
            return;
        L8:
            th = th;
            r1 = r2;
        L25:
            if (r1 != null) goto L32;
        L30:
            throw th;
        L32:
            r1.close();     // Catch: IOException -> L28
        L28:
            e = move-exception;
            e.printStackTrace();
        L19:
            e = move-exception;
            r2 = null;
            e = e;
        L17:
            th = th;
        L15:
            e = move-exception;
            e.printStackTrace();
        }
    }

    public class O00 implements RTASRCallbacks {
        public final /* synthetic */ TestRecordingActivity OXO1;

        public class OXO1 implements Runnable {
            public final /* synthetic */ O00 I1;
            public final /* synthetic */ RTASR.RtAsrResult IO;

            public OXO1(final O00 this$1, final RTASR.RtAsrResult val$result) {
                this.I1 = this$1;
                this.IO = val$result;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.I1.OXO1.chatOutputText.setText(this.IO.getData());
            }
        }

        public O00(final TestRecordingActivity this$0) {
            this.OXO1 = this$0;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError error, Object usrTag) {
            this.OXO1.isrun = false;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult result, Object usrTag) {
            this.OXO1.runOnUiThread(new OXO1(this, result));
            if (result.getStatus() != 3) goto L6;
            this.OXO1.isrun = false;
            return;
        }
    }

    public class OIi0 extends BroadcastReceiver {
        public final /* synthetic */ TestRecordingActivity OXO1;

        public /* synthetic */ OIi0(TestRecordingActivity r1, vo5 r2) {
            this(r1);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction()) == false) goto L20;
            int r2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            if (r2 == (-1)) goto L18;
            if (r2 != 0) goto L8;
            Log.d(Utils.TAG, "111111111111111111 SCO Audio State: DISCONNECTED   断开 ");
            this.OXO1.chatOutputText.setText("SCO Audio State: DISCONNECTED   断开");
            return;
        L8:
            if (r2 != 1) goto L10;
            TestRecordingActivity.OIX0iXi(this.OXO1).setBluetoothScoOn(true);
            this.OXO1.chatOutputText.setText("SCO Audio State: CONNECTED   处理连接后状态 -->  正常可以用了---->  打开!!!");
            Log.d(Utils.TAG, "111111111111111111 SCO Audio State: CONNECTED  处理连接后状态");
            return;
        L10:
            if (r2 != 2) goto L21;
            Log.d(Utils.TAG, "111111111111111111 SCO Audio State: CONNECTING   连接中状态  ");
            this.OXO1.chatOutputText.setText("SCO Audio State: CONNECTING   连接中状态--> 连接中-->");
            return;
        L21:
            return;
        L18:
            this.OXO1.chatOutputText.setText("SCO Audio State: ERROR  错误");
            Log.d(Utils.TAG, "111111111111111111 SCO Audio State: ERROR  错误");
            return;
        }

        public OIi0(final TestRecordingActivity this$0) {
            this.OXO1 = this$0;
        }
    }

    public class OXO1 implements View.OnClickListener {
        public final /* synthetic */ TestRecordingActivity IO;

        public OXO1(final TestRecordingActivity this$0) {
            this.IO = this$0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    public class XIi00iiXO implements View.OnClickListener {
        public final /* synthetic */ TestRecordingActivity IO;

        public XIi00iiXO(final TestRecordingActivity this$0) {
            this.IO = this$0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            this.IO.chatOutputText.setText("");
            TestRecordingActivity.X0O(this.IO);
        }
    }

    public class XO0O10 implements Runnable {
        public final /* synthetic */ TestRecordingActivity IO;

        public XO0O10(final TestRecordingActivity this$0) {
            this.IO = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(Utils.TAG, "111111111111111111   SCO Audio  开始  " + TestRecordingActivity.OIX0iXi(this.IO).isBluetoothScoOn());
            this.IO.chatOutputText.setText("SCO Audio State:   开始 --> 连接");
            TestRecordingActivity.OIX0iXi(this.IO).startBluetoothSco();
            if (Build.BRAND.equals("HUAWEI") == false) goto L5;
        L8:
            TestRecordingActivity.OIX0iXi(this.IO).setMode(2);
            TestRecordingActivity.OIX0iXi(this.IO).setMicrophoneMute(false);
            TestRecordingActivity.OIX0iXi(this.IO).setSpeakerphoneOn(false);
        L9:
            TestRecordingActivity.I1XOi1(this.IO);
            return;
        L5:
            if (RomUtils.isOppo() == true) goto L8;
            TestRecordingActivity.OIX0iXi(this.IO).setMode(2);
            TestRecordingActivity.OIX0iXi(this.IO).setMicrophoneMute(false);
            TestRecordingActivity.OIX0iXi(this.IO).setSpeakerphoneOn(false);
            goto L9
        }
    }

    public class XOO0ii0 implements Runnable {
        public final /* synthetic */ TestRecordingActivity IO;

        public XOO0ii0(final TestRecordingActivity this$0) {
            this.IO = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.IO.chatOutputText.setText(this.IO.chatOutputText.getText().toString() + "\n  开始解析录音文件  \n");
        }
    }

    public class iO implements View.OnClickListener {
        public final /* synthetic */ TestRecordingActivity IO;

        public iO(final TestRecordingActivity this$0) {
            this.IO = this$0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TestRecordingActivity.IIX1OXO(this.IO);
            TestRecordingActivity.OIX0iXi(this.IO).stopBluetoothSco();
        }
    }

    public TestRecordingActivity() {
        this.rtAsrApiKey = "0c997b55309fdb251dcb1b8cc6c87959";
        this.isRecording = false;
        this.scoStateReceiver = new OIi0(this, null);
        this.handler = new Handler();
        this.isrun = false;
        this.outputFile = new File(PathUtils.getExternalAppDataPath() + "/files/recorddemo.pcm");
    }

    public static /* bridge */ /* synthetic */ boolean I0iXXO(TestRecordingActivity r0) {
        return r0.isRecording;
    }

    public static /* bridge */ /* synthetic */ void I1XOi1(TestRecordingActivity r0) {
        r0.startRecording();
    }

    public static /* bridge */ /* synthetic */ void IIX1OXO(TestRecordingActivity r0) {
        r0.stopRecording();
    }

    public static /* bridge */ /* synthetic */ void O10IXXX0X(TestRecordingActivity r0) {
        r0.closeBluetooth();
    }

    public static /* bridge */ /* synthetic */ AudioManager OIX0iXi(TestRecordingActivity r0) {
        return r0.audioManager;
    }

    public static /* bridge */ /* synthetic */ void X0O(TestRecordingActivity r0) {
        r0.start();
    }

    public static /* bridge */ /* synthetic */ int X1ii(TestRecordingActivity r0) {
        return r0.mBufferSize;
    }

    public static /* bridge */ /* synthetic */ AudioRecord XXI(TestRecordingActivity r0) {
        return r0.mAudioRecord;
    }

    public static /* bridge */ /* synthetic */ void XiOIO(TestRecordingActivity r0) {
        r0.testRtasr2();
    }

    private void closeBluetooth() {
        this.audioManager.setBluetoothScoOn(false);
        this.audioManager.stopBluetoothSco();
        this.audioManager.setMode(0);
    }

    private int initSDK() {
        RTASR r0 = new RTASR("0c997b55309fdb251dcb1b8cc6c87959");
        this.mRTASR = r0;
        r0.registerCallbacks(new O00(this));
        transType("normal");
        lang("cn");
        targetLang(Languages.DEFAULT_LANGUAGE);
        return start("xdx");
    }

    private void initSDK2() {
    }

    private void initialRecorder() {
        this.mBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        if (ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0) goto L6;
        ToastUtils.showLong("没有录音权限");
        return;
    L6:
        AudioRecord r1 = new AudioRecord(0, 16000, 16, 2, this.mBufferSize);
        this.mAudioRecord = r1;
        if (r1.getState() == 1) goto L10;
        Log.e("AudioRecord", "Initialization failed.");
        return;
    L10:
        Log.d("AudioRecord", "Initialized successfully.");
    }

    private void listener() {
        findViewById(R.id.start_init).setOnClickListener(new OXO1(this));
        findViewById(R.id.test_btn).setOnClickListener(new XIi00iiXO(this));
        findViewById(R.id.test_btn2).setOnClickListener(new iO(this));
        IntentFilter r0 = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        if (Build.VERSION.SDK_INT < 34) goto L6;
        ContextCompat.registerReceiver(this, this.scoStateReceiver, r0, 2);
        return;
    L6:
        registerReceiver(this.scoStateReceiver, r0);
    }

    private void setStartBluetooth() {
        this.handler.postDelayed(new XO0O10(this), 100);
        Log.d(Utils.TAG, "getMode 当前的数据是 111:" + this.audioManager.getMode() + "   Build.BRAND = " + Build.BRAND + "  ,  Build.VERSION.SDK_INT  = " + Build.VERSION.SDK_INT);
    }

    private void start() {
        setStartBluetooth();
    }

    private void startRecording() {
        if (this.isRecording == true) goto L6;
        this.isRecording = true;
        Log.d(Utils.TAG, "111111111111111111 isRecording  " + this.isRecording);
        initialRecorder();
        new Thread(new IiI10X(this)).start();
        return;
    }

    private void stopRecording() {
        if (this.isRecording == false) goto L6;
        this.isRecording = false;
        return;
    }

    private void testRtasr(byte[] bytes, int mBufferSize) {
        if (this.mRTASR != null) goto L16;
        initSDK();
    L16:
        ByteArrayInputStream r0 = new ByteArrayInputStream(bytes);     // Catch: Exception -> L10
        byte[] r3 = new byte[mBufferSize];     // Catch: Exception -> L10
    L6:
        int r4 = r0.read(r3);     // Catch: Exception -> L10
        if ((-1) == r4) goto L12;
        if (r4 <= 0) goto L6;
        write((byte[]) r3.clone());     // Catch: Exception -> L10
        goto L6
    L12:
        r0.close();     // Catch: Exception -> L10
        return;
    L10:
        e = move-exception;
        e.printStackTrace();
    }

    private void testRtasr2() {
        runOnUiThread(new XOO0ii0(this));
        if (this.isrun == true) goto L26;
        this.isrun = true;
        RTASR r0 = new RTASR("0c997b55309fdb251dcb1b8cc6c87959");
        this.mRTASR = r0;
        r0.registerCallbacks(new I0IIOi(this));
        transType("normal");
        lang("cn");
        if (start("tag") != 0) goto L25;
        FileInputStream r1 = new FileInputStream(this.outputFile);     // Catch: Exception -> L12
        byte[] r2 = new byte[320];     // Catch: Exception -> L12
    L8:
        int r3 = r1.read(r2);     // Catch: Exception -> L12
        if ((-1) == r3) goto L14;
        if (r3 <= 0) goto L8;
        write((byte[]) r2.clone());     // Catch: Exception -> L12
        goto L8
    L14:
        r1.close();     // Catch: Exception -> L12
        stop();     // Catch: Exception -> L12
        return;
    L12:
        e = move-exception;
        e.printStackTrace();
        return;
    L25:
        return;
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
        AudioManager r7 = (AudioManager) getSystemService("audio");
        this.audioManager = r7;
        if (Build.VERSION.SDK_INT < 28) goto L10;
        AudioDeviceInfo[] r8 = r7.getDevices(1);
        int r0 = r8.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L14;
        AudioDeviceInfo r2 = r8[r1];
        if (r2.getType() != 7) goto L9;
        this.targetAudioDevice = r2;
    L9:
        this.chatOutputText.setText(this.chatOutputText.getText() + "\n  当前的音频输入设备 type =>  " + r2.getType() + "  id =   " + r2.getId());
        r1 = r1 + 1;
        goto L5
    L14:
        return;
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
