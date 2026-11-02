package com.sma.smartv3.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.xp5;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.reflect.TypeToken;
import com.iflytek.sparkchain.utils.constants.ErrorCode;
import com.microsoft.cognitiveservices.speech.AudioDataStream;
import com.microsoft.cognitiveservices.speech.AutoDetectSourceLanguageConfig;
import com.microsoft.cognitiveservices.speech.AutoDetectSourceLanguageResult;
import com.microsoft.cognitiveservices.speech.CancellationDetails;
import com.microsoft.cognitiveservices.speech.Connection;
import com.microsoft.cognitiveservices.speech.ConnectionEventArgs;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.ResultReason;
import com.microsoft.cognitiveservices.speech.SessionEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionCanceledEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionResult;
import com.microsoft.cognitiveservices.speech.SpeechRecognizer;
import com.microsoft.cognitiveservices.speech.SpeechSynthesisCancellationDetails;
import com.microsoft.cognitiveservices.speech.SpeechSynthesisEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechSynthesisOutputFormat;
import com.microsoft.cognitiveservices.speech.SpeechSynthesisResult;
import com.microsoft.cognitiveservices.speech.SpeechSynthesisWordBoundaryEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechSynthesizer;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.audio.AudioStreamFormat;
import com.microsoft.cognitiveservices.speech.audio.PullAudioInputStreamCallback;
import com.microsoft.cognitiveservices.speech.util.EventHandler;
import com.microsoft.cognitiveservices.speech.util.EventHandlerImpl;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.StatManager;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AITranslatorText;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.model.LeftAndRightPlayControl;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.ToTranslatorText;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMicrosoftSDKManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicrosoftSDKManage.kt\ncom/sma/smartv3/util/MicrosoftSDKManage\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,1241:1\n27#2,2:1242\n27#2,2:1244\n27#2,2:1246\n27#2,2:1271\n235#3,11:1248\n246#3:1260\n256#3:1270\n1#4:1259\n1#4:1273\n278#5,8:1261\n298#5:1269\n*S KotlinDebug\n*F\n+ 1 MicrosoftSDKManage.kt\ncom/sma/smartv3/util/MicrosoftSDKManage\n*L\n339#1:1242,2\n384#1:1244,2\n404#1:1246,2\n882#1:1271,2\n724#1:1248,11\n724#1:1260\n724#1:1270\n724#1:1259\n724#1:1261,8\n724#1:1269\n*E\n"})
public final class MicrosoftSDKManage {

    @aa1
    public static final XIi00iiXO O1O;

    @aa1
    public static volatile MicrosoftSDKManage XXIIO1i11;

    @tb1
    public ExecutorService I0IIOi;

    @tb1
    public SpeechRecognizer I0iXXO;

    /* JADX INFO: renamed from: I1 */
    public int f54908I1;
    public boolean I1XOi1;

    @tb1
    public XOO0ii0 II1Xi0;
    public boolean IIX1OXO;

    /* JADX INFO: renamed from: IO */
    @tb1
    public OXO1 f54909IO;
    public boolean IXXOO;

    @tb1
    public AudioRecord IiI10X;

    @tb1
    public AudioStreamFormat O00;

    @tb1
    public InterfaceC19048iO O10IXXX0X;

    @tb1
    public AudioConfig OIX0iXi;

    @tb1
    public O00 OIi0;

    /* JADX INFO: renamed from: OX */
    @tb1
    public List<String> f54910OX;

    @tb1
    public Connection X01IiOiIi;

    @tb1
    public Connection X0O;

    @tb1
    public SpeechConfig XOO0ii0;
    public boolean XX0;
    public boolean XiOIO;

    @tb1
    public AudioTrack i010I;

    @tb1
    public SpeechSynthesizer iOOX010X;

    @aa1
    public final String OXO1 = "MicrosoftSDKManage";

    @aa1
    public String XIi00iiXO = "";

    /* JADX INFO: renamed from: iO */
    @aa1
    public final String f54911iO = "eastus";
    public final int XO0O10 = 16000;

    @aa1
    public final ArrayList<String> XXI = new ArrayList<>();

    @aa1
    public final ArrayList<String> X1ii = new ArrayList<>();

    @aa1
    public final Handler iIiiO = new Handler(Looper.getMainLooper());
    public boolean OiIIX101O = true;

    @aa1
    public String XiOIii1 = "zh-CN";

    @aa1
    public String OII = "zh-CN-XiaomoNeural";

    /* JADX INFO: renamed from: iX */
    @aa1
    public final Object f54912iX = new Object();
    public boolean iOO1ii1 = true;

    public static final class IiI10X extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@aa1 Context context, @aa1 Intent intent) {
            Intrinsics.X0O(context, "context");
            Intrinsics.X0O(intent, "intent");
            if (Intrinsics.XOO0ii0("android.media.ACTION_SCO_AUDIO_STATE_UPDATED", intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
                if (intExtra == -1) {
                    i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.O1O.OXO1().OXO1 + " RecordingManager SCO Audio State: ERROR");
                    return;
                }
                if (intExtra == 0) {
                    i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.O1O.OXO1().OXO1 + " RecordingManager SCO Audio State: DISCONNECTED");
                    return;
                }
                if (intExtra == 1) {
                    i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.O1O.OXO1().OXO1 + " RecordingManager SCO Audio State: CONNECTED");
                    RecordingManager.Companion.getInstance().setScoOnOpen();
                    return;
                }
                if (intExtra != 2) {
                    return;
                }
                i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.O1O.OXO1().OXO1 + " RecordingManager SCO Audio State: CONNECTING");
            }
        }
    }

    public static final class O00 {
        public volatile boolean I0IIOi;

        @aa1
        public final ReentrantLock IiI10X;
        public int O00;
        public final int OXO1;

        @aa1
        public final byte[] XIi00iiXO;
        public int XO0O10;
        public final Condition XOO0ii0;

        /* JADX INFO: renamed from: iO */
        public int f54913iO;

        public O00() {
            this(0, 1, null);
        }

        public static /* synthetic */ int I0IIOi(O00 o00, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return o00.XOO0ii0(bArr, i, i2);
        }

        public static /* synthetic */ int XO0O10(O00 o00, byte[] bArr, int i, int i2, long j, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                j = 200;
            }
            return o00.m38830iO(bArr, i4, i5, j);
        }

        public final void IiI10X() {
            this.IiI10X.lock();
            try {
                this.O00 = 0;
                this.f54913iO = 0;
                this.XO0O10 = 0;
            } finally {
                this.IiI10X.unlock();
            }
        }

        public final void O00() {
            this.IiI10X.lock();
            try {
                this.I0IIOi = false;
                this.O00 = 0;
                this.f54913iO = 0;
                this.XO0O10 = 0;
            } finally {
                this.IiI10X.unlock();
            }
        }

        public final void OXO1() {
            this.IiI10X.lock();
            try {
                this.I0IIOi = true;
                this.O00 = 0;
                this.f54913iO = 0;
                this.XO0O10 = 0;
                this.XOO0ii0.signalAll();
            } finally {
                this.IiI10X.unlock();
            }
        }

        public final int XIi00iiXO() {
            this.IiI10X.lock();
            try {
                return this.O00;
            } finally {
                this.IiI10X.unlock();
            }
        }

        public final int XOO0ii0(@aa1 byte[] data, int i, int i2) {
            Intrinsics.X0O(data, "data");
            if (this.I0IIOi || i2 <= 0) {
                return 0;
            }
            this.IiI10X.lock();
            try {
                int i3 = this.OXO1;
                int i4 = this.O00;
                int i5 = i3 - i4;
                if (i2 > i5) {
                    int i6 = i2 - i5;
                    this.f54913iO = (this.f54913iO + i6) % i3;
                    this.O00 = i4 - i6;
                }
                int iMin = Math.min(i2, i3 - this.XO0O10);
                System.arraycopy(data, i, this.XIi00iiXO, this.XO0O10, iMin);
                if (iMin < i2) {
                    System.arraycopy(data, i + iMin, this.XIi00iiXO, 0, i2 - iMin);
                }
                this.XO0O10 = (this.XO0O10 + i2) % this.OXO1;
                this.O00 += i2;
                this.XOO0ii0.signalAll();
                return i2;
            } finally {
                this.IiI10X.unlock();
            }
        }

        /* JADX INFO: renamed from: iO */
        public final int m38830iO(@aa1 byte[] out, int i, int i2, long j) {
            Intrinsics.X0O(out, "out");
            if (i2 <= 0) {
                return 0;
            }
            this.IiI10X.lock();
            try {
                try {
                    if (this.O00 == 0) {
                        if (!this.I0IIOi) {
                            this.XOO0ii0.await(j, TimeUnit.MILLISECONDS);
                            if (this.O00 == 0) {
                            }
                        }
                        return 0;
                    }
                    int iMin = Math.min(i2, this.O00);
                    int iMin2 = Math.min(iMin, this.OXO1 - this.f54913iO);
                    System.arraycopy(this.XIi00iiXO, this.f54913iO, out, i, iMin2);
                    if (iMin2 < iMin) {
                        System.arraycopy(this.XIi00iiXO, 0, out, i + iMin2, iMin - iMin2);
                    }
                    this.f54913iO = (this.f54913iO + iMin) % this.OXO1;
                    this.O00 -= iMin;
                    return iMin;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } finally {
                this.IiI10X.unlock();
            }
        }

        public O00(int i) {
            this.OXO1 = i;
            this.XIi00iiXO = new byte[i];
            ReentrantLock reentrantLock = new ReentrantLock();
            this.IiI10X = reentrantLock;
            this.XOO0ii0 = reentrantLock.newCondition();
        }

        public /* synthetic */ O00(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1048576 : i);
        }
    }

    public static final class OXO1 extends PullAudioInputStreamCallback {

        @tb1
        public O00 OXO1;

        public final void OXO1(@aa1 O00 buffer) {
            Intrinsics.X0O(buffer, "buffer");
            this.OXO1 = buffer;
        }

        @Override // com.microsoft.cognitiveservices.speech.audio.PullAudioInputStreamCallback
        public void close() {
            try {
                O00 o00 = this.OXO1;
                if (o00 != null) {
                    o00.OXO1();
                }
                this.OXO1 = null;
                RecordingManager.Companion.getInstance().setRecording(false);
                XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
                AudioRecord audioRecordIi1iii0 = xIi00iiXO.OXO1().Ii1iii0();
                if (audioRecordIi1iii0 != null) {
                    audioRecordIi1iii0.stop();
                    audioRecordIi1iii0.release();
                    xIi00iiXO.OXO1().X0iO(null);
                }
            } catch (Exception e) {
                e.printStackTrace();
                i1O0OXO1O.OXO1.OXO1("MicrosoftSDKManage close e = " + e);
            }
        }

        @Override // com.microsoft.cognitiveservices.speech.audio.PullAudioInputStreamCallback
        public int read(@tb1 byte[] bArr) {
            O00 o00;
            int i;
            XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
            if (!xIi00iiXO.OXO1().X00XIX1()) {
                if (bArr == null || (o00 = this.OXO1) == null || o00 == null) {
                    return 0;
                }
                return o00.m38830iO(bArr, 0, bArr.length, 150L);
            }
            if (xIi00iiXO.OXO1().Ii1iii0() != null && bArr != null) {
                try {
                    synchronized (xIi00iiXO.OXO1()) {
                        try {
                            AudioRecord audioRecordIi1iii0 = xIi00iiXO.OXO1().Ii1iii0();
                            long j = audioRecordIi1iii0 != null ? audioRecordIi1iii0.read(bArr, 0, bArr.length) : 0L;
                            FileIOUtils.writeFileFromBytesByStream(VoiceManager.INSTANCE.getMPcmFile(), bArr, true);
                            i = (int) j;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return i;
                } catch (Exception e) {
                    i1O0OXO1O.OXO1.OXO1(e.toString());
                }
            }
            return 0;
        }
    }

    public static final class XIi00iiXO {
        public /* synthetic */ XIi00iiXO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final MicrosoftSDKManage OXO1() {
            return MicrosoftSDKManage.XXIIO1i11;
        }

        public final void XIi00iiXO(@aa1 MicrosoftSDKManage microsoftSDKManage) {
            Intrinsics.X0O(microsoftSDKManage, "<set-?>");
            MicrosoftSDKManage.XXIIO1i11 = microsoftSDKManage;
        }

        public XIi00iiXO() {
        }
    }

    public interface XO0O10<T> {
        void OXO1(T t);
    }

    public static final class XOO0ii0 implements Runnable {

        /* JADX INFO: renamed from: IO */
        @tb1
        public String f54915IO;

        /* JADX INFO: renamed from: I1 */
        @aa1
        public String f54914I1 = "";

        @aa1
        public LeftAndRightPlayControl iX1O1 = LeftAndRightPlayControl.LEFT_AND_RIGHT;
        public int X11iII1O1 = -1;

        public final void O00(@aa1 LeftAndRightPlayControl leftOrRight) {
            Intrinsics.X0O(leftOrRight, "leftOrRight");
            this.iX1O1 = leftOrRight;
        }

        public final void OXO1(int i) {
            this.X11iII1O1 = i;
        }

        public final void XIi00iiXO(@aa1 String ttsName) {
            Intrinsics.X0O(ttsName, "ttsName");
            this.f54914I1 = ttsName;
        }

        public final void XO0O10(@tb1 String str) {
            this.f54915IO = str;
        }

        /* JADX INFO: renamed from: iO */
        public final void m38831iO(int i) {
            Object systemService = Utils.getApp().getSystemService("audio");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
            Intrinsics.XXI(devices);
            AudioDeviceInfo audioDeviceInfo = null;
            AudioDeviceInfo audioDeviceInfo2 = null;
            for (AudioDeviceInfo audioDeviceInfo3 : devices) {
                if (audioDeviceInfo3.getType() == 8) {
                    audioDeviceInfo2 = audioDeviceInfo3;
                } else if (audioDeviceInfo3.getType() == 2) {
                    audioDeviceInfo = audioDeviceInfo3;
                }
            }
            if (i == 2) {
                if (audioDeviceInfo != null) {
                    AudioTrack audioTrack = MicrosoftSDKManage.O1O.OXO1().i010I;
                    if (audioTrack != null) {
                        audioTrack.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                AudioTrack audioTrack2 = MicrosoftSDKManage.O1O.OXO1().i010I;
                if (audioTrack2 != null) {
                    audioTrack2.setPreferredDevice(null);
                    return;
                }
                return;
            }
            if (i != 8) {
                AudioTrack audioTrack3 = MicrosoftSDKManage.O1O.OXO1().i010I;
                if (audioTrack3 != null) {
                    audioTrack3.setPreferredDevice(null);
                    return;
                }
                return;
            }
            if (audioDeviceInfo2 != null) {
                AudioTrack audioTrack4 = MicrosoftSDKManage.O1O.OXO1().i010I;
                if (audioTrack4 != null) {
                    audioTrack4.setPreferredDevice(audioDeviceInfo2);
                    return;
                }
                return;
            }
            AudioTrack audioTrack5 = MicrosoftSDKManage.O1O.OXO1().i010I;
            if (audioTrack5 != null) {
                audioTrack5.setPreferredDevice(null);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            XIi00iiXO xIi00iiXO;
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            XIi00iiXO xIi00iiXO2 = MicrosoftSDKManage.O1O;
            i1o0oxo1o.OXO1(xIi00iiXO2.OXO1().OXO1 + " run content = " + this.f54915IO);
            try {
                DcsTtsPlayer.INSTANCE.getMTtsFilePcm().delete();
                m38831iO(this.X11iII1O1);
                AudioTrack audioTrack = xIi00iiXO2.OXO1().i010I;
                if (audioTrack != null) {
                    audioTrack.play();
                }
                synchronized (xIi00iiXO2.OXO1().f54912iX) {
                    xIi00iiXO2.OXO1().IXXOO = false;
                    Unit unit = Unit.OXO1;
                }
                if (xIi00iiXO2.OXO1().iOOX010X == null) {
                    i1o0oxo1o.OXO1(xIi00iiXO2.OXO1().OXO1 + " synthesizer = null.");
                    return;
                }
                if (xIi00iiXO2.OXO1().iOO1ii1) {
                    if (!Intrinsics.XOO0ii0(this.f54914I1, xIi00iiXO2.OXO1().iXiiiO())) {
                        SpeechConfig speechConfig = xIi00iiXO2.OXO1().XOO0ii0;
                        if (speechConfig != null) {
                            speechConfig.setSpeechSynthesisOutputFormat(SpeechSynthesisOutputFormat.Raw24Khz16BitMonoPcm);
                        }
                        SpeechConfig speechConfig2 = xIi00iiXO2.OXO1().XOO0ii0;
                        if (speechConfig2 != null) {
                            speechConfig2.setSpeechSynthesisVoiceName(this.f54914I1);
                        }
                        xIi00iiXO2.OXO1().iOOX010X = new SpeechSynthesizer(xIi00iiXO2.OXO1().XOO0ii0, (AudioConfig) null);
                    }
                    xIi00iiXO2.OXO1().iOO1ii1 = false;
                    StatManager.m38112iO(StatManager.OXO1, 10, null, 2, null);
                    SpeechSynthesizer speechSynthesizer = xIi00iiXO2.OXO1().iOOX010X;
                    Intrinsics.XXI(speechSynthesizer);
                    SpeechSynthesisResult speechSynthesisResult = speechSynthesizer.StartSpeakingTextAsync(this.f54915IO).get();
                    Intrinsics.O10IXXX0X(speechSynthesisResult, "get(...)");
                    AudioDataStream audioDataStreamFromResult = AudioDataStream.fromResult(speechSynthesisResult);
                    byte[] bArr = new byte[2400];
                    String str = xIi00iiXO2.OXO1().OXO1;
                    LeftAndRightPlayControl leftAndRightPlayControl = this.iX1O1;
                    i1o0oxo1o.OXO1(str + " microsoftLeftOrRight = " + leftAndRightPlayControl + " " + (leftAndRightPlayControl != LeftAndRightPlayControl.RIGHT) + " " + (leftAndRightPlayControl != LeftAndRightPlayControl.LEFT));
                    while (true) {
                        xIi00iiXO = MicrosoftSDKManage.O1O;
                        if (xIi00iiXO.OXO1().IXXOO || audioDataStreamFromResult.readData(bArr) == 0) {
                            break;
                            break;
                        }
                        byte[] bArr2 = new byte[4800];
                        for (int i = 0; i < 4800; i++) {
                            bArr2[i] = 0;
                        }
                        int iM39480iO = ProgressionUtilKt.m39480iO(0, 2399, 2);
                        if (iM39480iO >= 0) {
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 * 2;
                                LeftAndRightPlayControl leftAndRightPlayControl2 = this.iX1O1;
                                LeftAndRightPlayControl leftAndRightPlayControl3 = LeftAndRightPlayControl.RIGHT;
                                bArr2[i3] = leftAndRightPlayControl2 != leftAndRightPlayControl3 ? bArr[i2] : (byte) 0;
                                bArr2[i3 + 1] = leftAndRightPlayControl2 != leftAndRightPlayControl3 ? bArr[i2 + 1] : (byte) 0;
                                int i4 = i3 + 2;
                                LeftAndRightPlayControl leftAndRightPlayControl4 = LeftAndRightPlayControl.LEFT;
                                bArr2[i4] = leftAndRightPlayControl2 != leftAndRightPlayControl4 ? bArr[i2] : (byte) 0;
                                bArr2[i3 + 3] = leftAndRightPlayControl2 != leftAndRightPlayControl4 ? bArr[i2 + 1] : (byte) 0;
                                if (i2 == iM39480iO) {
                                    break;
                                } else {
                                    i2 += 2;
                                }
                            }
                        }
                        AudioTrack audioTrack2 = MicrosoftSDKManage.O1O.OXO1().i010I;
                        if (audioTrack2 != null) {
                            audioTrack2.write(bArr2, 0, 4800);
                        }
                        FileIOUtils.writeFileFromBytesByStream(DcsTtsPlayer.INSTANCE.getMTtsFilePcm(), bArr, true);
                    }
                    xIi00iiXO.OXO1().iOO1ii1 = true;
                    audioDataStreamFromResult.close();
                }
            } catch (Exception e) {
                i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.O1O.OXO1().OXO1 + " unexpected " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.util.MicrosoftSDKManage$iO */
    public interface InterfaceC19048iO {

        /* JADX INFO: renamed from: com.sma.smartv3.util.MicrosoftSDKManage$iO$OXO1 */
        public static final class OXO1 {
            @Deprecated
            public static void OXO1(@aa1 InterfaceC19048iO interfaceC19048iO, int i, @aa1 String str, @aa1 String detectedLanguage) {
                Intrinsics.X0O(str, "str");
                Intrinsics.X0O(detectedLanguage, "detectedLanguage");
                InterfaceC19048iO.super.onIdentifyResultsDetectedLanguage(i, str, detectedLanguage);
            }
        }

        void onIdentifyResults(int i, @aa1 String str);

        default void onIdentifyResultsDetectedLanguage(int i, @aa1 String str, @aa1 String detectedLanguage) {
            Intrinsics.X0O(str, "str");
            Intrinsics.X0O(detectedLanguage, "detectedLanguage");
        }

        void onStartTransmission();

        void onStopTransmission();
    }

    static {
        MicrosoftSDKManage microsoftSDKManage;
        XIi00iiXO xIi00iiXO = new XIi00iiXO(null);
        O1O = xIi00iiXO;
        synchronized (xIi00iiXO) {
            microsoftSDKManage = new MicrosoftSDKManage();
            XXIIO1i11 = microsoftSDKManage;
        }
        XXIIO1i11 = microsoftSDKManage;
    }

    public static final void I0IIOI(MicrosoftSDKManage microsoftSDKManage, Object obj, ConnectionEventArgs connectionEventArgs) {
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Recognizer connection established.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0iOXO(MicrosoftSDKManage microsoftSDKManage, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        microsoftSDKManage.m38826OI(str, str2, function1);
    }

    public static final void IO0II0i(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechSynthesisEventArgs e) {
        Intrinsics.X0O(e, "e");
        String string = SpeechSynthesisCancellationDetails.fromResult(e.getResult()).toString();
        Intrinsics.O10IXXX0X(string, "toString(...)");
        LogUtils.m11128d(microsoftSDKManage.OXO1 + " Error synthesizing. Result ID. = " + e.getResult().getResultId() + " , Error detail = " + System.lineSeparator() + string + System.lineSeparator() + "    Did you update the subscription info?");
        e.close();
    }

    public static final void IOIi00(MicrosoftSDKManage microsoftSDKManage, Object obj, ConnectionEventArgs connectionEventArgs) {
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Recognizer connection disconnected.");
    }

    public static final void IOi1O0(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechRecognitionEventArgs speechRecognitionResultEventArgs) {
        Intrinsics.X0O(speechRecognitionResultEventArgs, "speechRecognitionResultEventArgs");
        SpeechRecognitionResult result = speechRecognitionResultEventArgs.getResult();
        String text = result.getText();
        String language = AutoDetectSourceLanguageResult.fromResult(result).getLanguage();
        microsoftSDKManage.XXI.add(text);
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Intermediate result received:  ---> " + TextUtils.join(" ", microsoftSDKManage.XXI));
        InterfaceC19048iO interfaceC19048iO = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO != null) {
            interfaceC19048iO.onIdentifyResults(1, TextUtils.join(ProxyConfig.MATCH_ALL_SCHEMES, microsoftSDKManage.X1ii) + ProxyConfig.MATCH_ALL_SCHEMES + TextUtils.join(" ", microsoftSDKManage.XXI));
        }
        InterfaceC19048iO interfaceC19048iO2 = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO2 != null) {
            String str = TextUtils.join(ProxyConfig.MATCH_ALL_SCHEMES, microsoftSDKManage.X1ii) + ProxyConfig.MATCH_ALL_SCHEMES + TextUtils.join(" ", microsoftSDKManage.XXI);
            Intrinsics.XXI(language);
            interfaceC19048iO2.onIdentifyResultsDetectedLanguage(1, str, language);
        }
        ArrayList<String> arrayList = microsoftSDKManage.XXI;
        arrayList.remove(arrayList.size() - 1);
    }

    public static final void IX0iIX(MicrosoftSDKManage microsoftSDKManage, Object obj, SessionEventArgs sessionEventArgs) {
        Intrinsics.X0O(sessionEventArgs, "sessionEventArgs");
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + "  sessionStarted:  --->");
    }

    public static final void IXOIIIO(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechSynthesisEventArgs e) {
        Intrinsics.X0O(e, "e");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(microsoftSDKManage.OXO1 + " Synthesis finished.");
        i1o0oxo1o.OXO1(microsoftSDKManage.OXO1 + " First byte latency: " + e.getResult().getProperties().getProperty(PropertyId.SpeechServiceResponse_SynthesisFirstByteLatencyMs) + " ms.");
        i1o0oxo1o.OXO1(microsoftSDKManage.OXO1 + " Finish latency: " + e.getResult().getProperties().getProperty(PropertyId.SpeechServiceResponse_SynthesisFinishLatencyMs) + " ms.");
        e.close();
    }

    public static final void Ii0X0X(MicrosoftSDKManage microsoftSDKManage, Object obj, ConnectionEventArgs connectionEventArgs) {
        microsoftSDKManage.I1XOi1 = true;
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Connection established..");
    }

    public static final void Ii0i(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechSynthesisWordBoundaryEventArgs e) {
        Intrinsics.X0O(e, "e");
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Word boundary. Text offset " + e.getTextOffset() + ", length " + e.getWordLength() + "; audio offset " + (e.getAudioOffset() / ((long) 10000)) + " ms.");
    }

    /* JADX INFO: renamed from: O1 */
    public static final void m38819O1(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechRecognitionEventArgs speechRecognitionResultEventArgs) {
        Intrinsics.X0O(speechRecognitionResultEventArgs, "speechRecognitionResultEventArgs");
        SpeechRecognitionResult result = speechRecognitionResultEventArgs.getResult();
        String text = result.getText();
        String language = AutoDetectSourceLanguageResult.fromResult(result).getLanguage();
        microsoftSDKManage.X1ii.add(text);
        microsoftSDKManage.XXI.clear();
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + "  Final result received:  -> " + text + " , detectedLanguage: " + language + "  , mSpeechCallback = " + (microsoftSDKManage.O10IXXX0X != null));
        InterfaceC19048iO interfaceC19048iO = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO != null) {
            String strJoin = TextUtils.join(ProxyConfig.MATCH_ALL_SCHEMES, microsoftSDKManage.X1ii);
            Intrinsics.O10IXXX0X(strJoin, "join(...)");
            interfaceC19048iO.onIdentifyResults(2, strJoin);
        }
        InterfaceC19048iO interfaceC19048iO2 = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO2 != null) {
            String strJoin2 = TextUtils.join(ProxyConfig.MATCH_ALL_SCHEMES, microsoftSDKManage.X1ii);
            Intrinsics.O10IXXX0X(strJoin2, "join(...)");
            Intrinsics.XXI(language);
            interfaceC19048iO2.onIdentifyResultsDetectedLanguage(2, strJoin2, language);
        }
    }

    public static final void O101(MicrosoftSDKManage microsoftSDKManage, Void r1) {
        InterfaceC19048iO interfaceC19048iO = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO != null) {
            interfaceC19048iO.onStartTransmission();
        }
    }

    public static final void O1iXiI(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechRecognitionEventArgs speechRecognitionResultEventArgs) {
        Intrinsics.X0O(speechRecognitionResultEventArgs, "speechRecognitionResultEventArgs");
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + "  canceled:  ---> Reason=  " + speechRecognitionResultEventArgs.getResult().getReason());
    }

    public static final void OXi001(MicrosoftSDKManage microsoftSDKManage, Object obj, SessionEventArgs sessionEventArgs) {
        Intrinsics.X0O(sessionEventArgs, "sessionEventArgs");
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + "  sessionStopped:  --->");
    }

    public static final void X00Xi1X(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechSynthesisEventArgs e) {
        Intrinsics.X0O(e, "e");
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Synthesis started..");
        e.close();
    }

    public static final void X0I1(MicrosoftSDKManage microsoftSDKManage, Void r3) {
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Continuous recognition stopped");
        microsoftSDKManage.XXX11i();
        InterfaceC19048iO interfaceC19048iO = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO != null) {
            interfaceC19048iO.onStopTransmission();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static final void m38821X1(Object obj, SpeechSynthesisEventArgs e) {
        Intrinsics.X0O(e, "e");
        e.close();
    }

    public static /* synthetic */ void X11iII1O1(MicrosoftSDKManage microsoftSDKManage, String str, String str2, LeftAndRightPlayControl leftAndRightPlayControl, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = microsoftSDKManage.OII;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        microsoftSDKManage.iX1O1(str, str2, leftAndRightPlayControl, i);
    }

    public static /* synthetic */ void X1OI(MicrosoftSDKManage microsoftSDKManage, String str, boolean z, String str2, String str3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "zh-CN";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = "zh-CN-XiaomoNeural";
        }
        if ((i & 8) != 0) {
            str3 = "zh-CN";
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        microsoftSDKManage.iIX0i(str, z, str2, str3, z2);
    }

    public static final void XIIO11I(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechRecognitionEventArgs speechRecognitionResultEventArgs) {
        Intrinsics.X0O(speechRecognitionResultEventArgs, "speechRecognitionResultEventArgs");
        String text = speechRecognitionResultEventArgs.getResult().getText();
        microsoftSDKManage.X1ii.add(text);
        microsoftSDKManage.XXI.clear();
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + "  Final result received:  -> " + text + " ,  mSpeechCallback = " + (microsoftSDKManage.O10IXXX0X != null));
        InterfaceC19048iO interfaceC19048iO = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO != null) {
            String strJoin = TextUtils.join(" ", microsoftSDKManage.X1ii);
            Intrinsics.O10IXXX0X(strJoin, "join(...)");
            interfaceC19048iO.onIdentifyResults(2, strJoin);
        }
    }

    public static final Unit XOO0XOOii(MicrosoftSDKManage microsoftSDKManage, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            microsoftSDKManage.XIO11I();
            microsoftSDKManage.IXiOXO();
        }
        return Unit.OXO1;
    }

    public static /* synthetic */ void XOXiX0(MicrosoftSDKManage microsoftSDKManage, InterfaceC19048iO interfaceC19048iO, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC19048iO = null;
        }
        microsoftSDKManage.XOIX(interfaceC19048iO);
    }

    public static final void XXI0XOIX(MicrosoftSDKManage microsoftSDKManage, Object obj, SpeechRecognitionEventArgs speechRecognitionResultEventArgs) {
        Intrinsics.X0O(speechRecognitionResultEventArgs, "speechRecognitionResultEventArgs");
        microsoftSDKManage.XXI.add(speechRecognitionResultEventArgs.getResult().getText());
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Intermediate result received:  ---> " + TextUtils.join(" ", microsoftSDKManage.XXI));
        InterfaceC19048iO interfaceC19048iO = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO != null) {
            interfaceC19048iO.onIdentifyResults(1, TextUtils.join(" ", microsoftSDKManage.X1ii) + TextUtils.join(" ", microsoftSDKManage.XXI));
        }
        ArrayList<String> arrayList = microsoftSDKManage.XXI;
        arrayList.remove(arrayList.size() - 1);
    }

    public static final void XXOXi(MicrosoftSDKManage microsoftSDKManage, Void r1) {
        InterfaceC19048iO interfaceC19048iO = microsoftSDKManage.O10IXXX0X;
        if (interfaceC19048iO != null) {
            interfaceC19048iO.onStartTransmission();
        }
    }

    public static final void XXiIiX10(MicrosoftSDKManage microsoftSDKManage, Object obj, ConnectionEventArgs connectionEventArgs) {
        microsoftSDKManage.I1XOi1 = false;
        i1O0OXO1O.OXO1.OXO1(microsoftSDKManage.OXO1 + " Disconnected..");
    }

    public static /* synthetic */ void i100IXOX(MicrosoftSDKManage microsoftSDKManage, InterfaceC19048iO interfaceC19048iO, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        microsoftSDKManage.iIi1(interfaceC19048iO, str);
    }

    /* JADX INFO: renamed from: iI */
    public static /* synthetic */ void m38822iI(MicrosoftSDKManage microsoftSDKManage, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = microsoftSDKManage.OII;
        }
        microsoftSDKManage.XXIIO1i11(str, str2);
    }

    public static /* synthetic */ void iIi0(MicrosoftSDKManage microsoftSDKManage, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        microsoftSDKManage.m38825I0(z);
    }

    public static final void iOX(MicrosoftSDKManage microsoftSDKManage, SpeechRecognitionResult result) {
        Intrinsics.X0O(result, "result");
        String text = result.getText();
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null) && !microsoftSDKManage.XiOIO) {
            DcsTtsPlayer.playAssetsFile$default(DcsTtsPlayer.INSTANCE, "voice_end_cycle_audio.mp3", true, null, 4, null);
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(microsoftSDKManage.OXO1 + " setOnTaskCompletedListener  result: ---> " + text);
        if (result.getReason() != ResultReason.RecognizedSpeech) {
            ResultReason reason = result.getReason();
            ResultReason resultReason = ResultReason.Canceled;
            String errorDetails = reason == resultReason ? CancellationDetails.fromResult(result).getErrorDetails() : "";
            String str = "Recognition failed with " + result.getReason() + ". Did you enter your subscription?" + System.lineSeparator() + errorDetails;
            i1o0oxo1o.OXO1(microsoftSDKManage.OXO1 + " setOnTaskCompletedListener error : ---> " + str);
            if (result.getReason() == resultReason) {
                InterfaceC19048iO interfaceC19048iO = microsoftSDKManage.O10IXXX0X;
                if (interfaceC19048iO != null) {
                    interfaceC19048iO.onIdentifyResults(2, "");
                }
            } else {
                InterfaceC19048iO interfaceC19048iO2 = microsoftSDKManage.O10IXXX0X;
                if (interfaceC19048iO2 != null) {
                    interfaceC19048iO2.onIdentifyResults(2, "");
                }
                if (q62.OiO0IOX(q62Var, null, 1, null)) {
                    m38822iI(microsoftSDKManage, UtilsKt.XXO(R.string.speech_recognition_error), null, 2, null);
                }
            }
        } else {
            InterfaceC19048iO interfaceC19048iO3 = microsoftSDKManage.O10IXXX0X;
            if (interfaceC19048iO3 != null) {
                Intrinsics.XXI(text);
                interfaceC19048iO3.onIdentifyResults(2, text);
            }
        }
        microsoftSDKManage.X0i1O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iiII(MicrosoftSDKManage microsoftSDKManage, String str, boolean z, String str2, String str3, boolean z2, String str4, List list, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "zh-CN";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = "zh-CN-XiaomoNeural";
        }
        if ((i & 8) != 0) {
            str3 = "zh-CN";
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            str4 = "";
        }
        if ((i & 64) != 0) {
            list = CollectionsKt__CollectionsKt.iXiX011("zh-CN", "en-US");
        }
        if ((i & 128) != 0) {
            z3 = true;
        }
        microsoftSDKManage.Xii(str, z, str2, str3, z2, str4, list, z3);
    }

    public static final Object iii0(Future future, XO0O10 xo0o10) {
        xo0o10.OXO1(future.get());
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m38825I0(boolean z) {
        this.f54908I1 = 0;
        if (this.OIX0iXi == null) {
            X11I();
        }
        this.X1ii.clear();
        XIO11I();
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " startContinuousRecognitionAsync");
        if (this.I0iXXO == null) {
            I0XXi0X(z);
        }
        SpeechRecognizer speechRecognizer = this.I0iXXO;
        Intrinsics.XXI(speechRecognizer);
        Future<Void> futureStartContinuousRecognitionAsync = speechRecognizer.startContinuousRecognitionAsync();
        Intrinsics.XXI(futureStartContinuousRecognitionAsync);
        Xi1i0XOX0(futureStartContinuousRecognitionAsync, new XO0O10() { // from class: com.android.mltcode.paycertificationapi.xq0
            @Override // com.sma.smartv3.util.MicrosoftSDKManage.XO0O10
            public final void OXO1(Object obj) {
                MicrosoftSDKManage.O101(this.OXO1, (Void) obj);
            }
        });
    }

    public final void I0XXi0X(boolean z) {
        EventHandlerImpl<ConnectionEventArgs> eventHandlerImpl;
        EventHandlerImpl<ConnectionEventArgs> eventHandlerImpl2;
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.OXO1 + "  isAutoEnd: " + this.OiIIX101O + "  ");
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        LogUtils.m11128d(mDeviceInfo != null ? mDeviceInfo.getMPrototype() : null);
        LogUtils.m11128d(String.valueOf(this.I0iXXO == null));
        if (this.I0iXXO == null) {
            i1o0oxo1o.OXO1(this.OXO1 + " build reco");
            i1o0oxo1o.OXO1(this.OXO1 + " languageList: " + this.f54910OX + " ");
            List<String> listIXiX011 = this.f54910OX;
            if (listIXiX011 == null) {
                listIXiX011 = CollectionsKt__CollectionsKt.iXiX011("zh-CN", "ja-JP");
            }
            AutoDetectSourceLanguageConfig autoDetectSourceLanguageConfigFromLanguages = AutoDetectSourceLanguageConfig.fromLanguages(listIXiX011);
            i1o0oxo1o.OXO1(this.OXO1 + " languageList: " + this.f54910OX + " ");
            if (z) {
                i1o0oxo1o.OXO1(this.OXO1 + " isMoreLanguage: " + z + " ");
                this.I0iXXO = new SpeechRecognizer(this.XOO0ii0, autoDetectSourceLanguageConfigFromLanguages, this.OIX0iXi);
            } else {
                this.I0iXXO = new SpeechRecognizer(this.XOO0ii0, this.XiOIii1, this.OIX0iXi);
            }
            SpeechRecognizer speechRecognizer = this.I0iXXO;
            Intrinsics.XXI(speechRecognizer);
            speechRecognizer.recognizing.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.pq0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.IOi1O0(this.OXO1, obj, (SpeechRecognitionEventArgs) obj2);
                }
            });
            SpeechRecognizer speechRecognizer2 = this.I0iXXO;
            Intrinsics.XXI(speechRecognizer2);
            speechRecognizer2.recognized.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.qq0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.m38819O1(this.OXO1, obj, (SpeechRecognitionEventArgs) obj2);
                }
            });
            SpeechRecognizer speechRecognizer3 = this.I0iXXO;
            Intrinsics.XXI(speechRecognizer3);
            speechRecognizer3.canceled.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.rq0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.O1iXiI(this.OXO1, obj, (SpeechRecognitionCanceledEventArgs) obj2);
                }
            });
            SpeechRecognizer speechRecognizer4 = this.I0iXXO;
            Intrinsics.XXI(speechRecognizer4);
            speechRecognizer4.sessionStarted.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.sq0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.IX0iIX(this.OXO1, obj, (SessionEventArgs) obj2);
                }
            });
            SpeechRecognizer speechRecognizer5 = this.I0iXXO;
            Intrinsics.XXI(speechRecognizer5);
            speechRecognizer5.sessionStopped.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.tq0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.OXi001(this.OXO1, obj, (SessionEventArgs) obj2);
                }
            });
        }
        Connection connectionFromRecognizer = Connection.fromRecognizer(this.I0iXXO);
        this.X0O = connectionFromRecognizer;
        if (connectionFromRecognizer != null && (eventHandlerImpl2 = connectionFromRecognizer.connected) != null) {
            eventHandlerImpl2.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.uq0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.I0IIOI(this.OXO1, obj, (ConnectionEventArgs) obj2);
                }
            });
        }
        Connection connection = this.X0O;
        if (connection != null && (eventHandlerImpl = connection.disconnected) != null) {
            eventHandlerImpl.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.vq0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.IOIi00(this.OXO1, obj, (ConnectionEventArgs) obj2);
                }
            });
        }
        Connection connection2 = this.X0O;
        if (connection2 != null) {
            connection2.openConnection(true);
        }
    }

    public final void I0i0() {
        SpeechRecognizer speechRecognizer = this.I0iXXO;
        if (speechRecognizer != null) {
            speechRecognizer.stopContinuousRecognitionAsync();
        }
        SpeechRecognizer speechRecognizer2 = this.I0iXXO;
        if (speechRecognizer2 != null) {
            speechRecognizer2.close();
        }
        this.I0iXXO = null;
    }

    public final void IO0iXO0O(@aa1 String ttsName) {
        Intrinsics.X0O(ttsName, "ttsName");
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " setAudioTTSName ttsVoiceName = " + ttsName);
        this.OII = ttsName;
    }

    public final void IX0IXOi(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.XiOIii1 = str;
    }

    public final void IX1XiI() {
    }

    public final void IXI() {
        Connection connection = this.X01IiOiIi;
        if (connection != null) {
            Intrinsics.XXI(connection);
            connection.openConnection(true);
            return;
        }
        i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " Please initialize the speech synthesizer first.");
    }

    public final void IXiOXO() {
        if (this.OiIIX101O) {
            SpeechRecognizer speechRecognizer = new SpeechRecognizer(this.XOO0ii0, this.XiOIii1, this.OIX0iXi);
            this.I0iXXO = speechRecognizer;
            Intrinsics.XXI(speechRecognizer);
            Future<SpeechRecognitionResult> futureRecognizeOnceAsync = speechRecognizer.recognizeOnceAsync();
            InterfaceC19048iO interfaceC19048iO = this.O10IXXX0X;
            if (interfaceC19048iO != null) {
                interfaceC19048iO.onStartTransmission();
            }
            Intrinsics.XXI(futureRecognizeOnceAsync);
            Xi1i0XOX0(futureRecognizeOnceAsync, new XO0O10() { // from class: com.android.mltcode.paycertificationapi.nq0
                @Override // com.sma.smartv3.util.MicrosoftSDKManage.XO0O10
                public final void OXO1(Object obj) {
                    MicrosoftSDKManage.iOX(this.OXO1, (SpeechRecognitionResult) obj);
                }
            });
            return;
        }
        if (this.OIX0iXi == null) {
            X11I();
        }
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        LogUtils.m11128d(mDeviceInfo != null ? mDeviceInfo.getMPrototype() : null);
        LogUtils.m11128d(String.valueOf(this.I0iXXO == null));
        if (q62.OiO0IOX(q62.OXO1, null, 1, null) || this.I0iXXO == null) {
            SpeechRecognizer speechRecognizer2 = new SpeechRecognizer(this.XOO0ii0, this.XiOIii1, this.OIX0iXi);
            this.I0iXXO = speechRecognizer2;
            Intrinsics.XXI(speechRecognizer2);
            speechRecognizer2.recognizing.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.yq0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.XXI0XOIX(this.OXO1, obj, (SpeechRecognitionEventArgs) obj2);
                }
            });
            SpeechRecognizer speechRecognizer3 = this.I0iXXO;
            Intrinsics.XXI(speechRecognizer3);
            speechRecognizer3.recognized.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.br0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.XIIO11I(this.OXO1, obj, (SpeechRecognitionEventArgs) obj2);
                }
            });
        }
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " startContinuousRecognitionAsync");
        SpeechRecognizer speechRecognizer4 = this.I0iXXO;
        Intrinsics.XXI(speechRecognizer4);
        Future<Void> futureStartContinuousRecognitionAsync = speechRecognizer4.startContinuousRecognitionAsync();
        Intrinsics.XXI(futureStartContinuousRecognitionAsync);
        Xi1i0XOX0(futureStartContinuousRecognitionAsync, new XO0O10() { // from class: com.android.mltcode.paycertificationapi.cr0
            @Override // com.sma.smartv3.util.MicrosoftSDKManage.XO0O10
            public final void OXO1(Object obj) {
                MicrosoftSDKManage.XXOXi(this.OXO1, (Void) obj);
            }
        });
    }

    @tb1
    public final AudioRecord Ii1iii0() {
        return this.IiI10X;
    }

    public final void IiiXiI0I() {
        Connection connection = this.X0O;
        if (connection != null) {
            if (connection != null) {
                connection.openConnection(true);
            }
        } else {
            i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " Please initialize SpeechRecognizer.");
        }
    }

    @aa1
    public final Handler O001I() {
        return this.iIiiO;
    }

    public final void O0O(boolean z) {
        this.XX0 = z;
    }

    public final void O0O0X0iOi(int i) {
        this.f54908I1 = i;
    }

    /* JADX INFO: renamed from: OI */
    public final void m38826OI(@aa1 String text, @aa1 String translationLanguage, @tb1 final Function1<? super String, Unit> function1) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(translationLanguage, "translationLanguage");
        final Activity activity = null;
        StatManager.m38112iO(StatManager.OXO1, 9, null, 2, null);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> translatorTextBody = RequestBodyKt.getTranslatorTextBody(text, translationLanguage);
        final O1XIiIO<AITranslatorText> o1XIiIO = new O1XIiIO<AITranslatorText>() { // from class: com.sma.smartv3.util.MicrosoftSDKManage$toTranslatorText$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AITranslatorText aITranslatorText) {
                if (aITranslatorText == null || aITranslatorText.getText() == null) {
                    Function1<String, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(UtilsKt.XXO(R.string.failed_in_translation));
                        return;
                    }
                    return;
                }
                Function1<String, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(aITranslatorText.getText());
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(this.OXO1 + "  toTranslatorText  error = " + error);
                Function1<String, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(UtilsKt.XXO(R.string.failed_in_translation));
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ToTranslatorText.URL);
        String str = strConvertBaseUrl + ToTranslatorText.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(translatorTextBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + ToTranslatorText.URL;
        final O1XIiIO<Response<AITranslatorText>> o1XIiIO2 = new O1XIiIO<Response<AITranslatorText>>() { // from class: com.sma.smartv3.util.MicrosoftSDKManage$toTranslatorText$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AITranslatorText> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) translatorTextBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AITranslatorText.class), new ParsedRequestListener<Response<AITranslatorText>>() { // from class: com.sma.smartv3.util.MicrosoftSDKManage$toTranslatorText$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AITranslatorText> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    /* JADX INFO: renamed from: OO */
    public final void m38827OO() {
        O00 o00 = new O00(1048576);
        this.OIi0 = o00;
        Intrinsics.XXI(o00);
        o00.IiI10X();
        OXO1 oxo1 = this.f54909IO;
        if (oxo1 != null) {
            O00 o01 = this.OIi0;
            Intrinsics.XXI(o01);
            oxo1.OXO1(o01);
        }
    }

    public final void OX110i() {
        try {
            boolean z = true;
            if (this.XOO0ii0 == null) {
                this.XOO0ii0 = SpeechConfig.fromSubscription(this.XIi00iiXO, this.f54911iO);
                if (this.I0IIOi == null) {
                    this.I0IIOi = Executors.newSingleThreadExecutor();
                }
                X11I();
                XO0X10iO();
                IXI();
                this.O00 = AudioStreamFormat.getWaveFormatPCM(this.XO0O10, (short) 16, (short) 1);
            }
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str = this.OXO1;
            if (this.XOO0ii0 == null) {
                z = false;
            }
            i1o0oxo1o.OXO1(str + " init sdk speechConfig = " + z + " ");
        } catch (Exception e) {
            i1O0OXO1O.OXO1.OXO1(this.OXO1 + " init sdk speechConfig = " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: Oi */
    public final void m38828Oi(@aa1 byte[] bytes) {
        Intrinsics.X0O(bytes, "bytes");
        O00 o00 = this.OIi0;
        if (o00 != null) {
            O00.I0IIOi(o00, bytes, 0, 0, 6, null);
        }
    }

    public final void X00O0(boolean z) {
        this.IIX1OXO = z;
    }

    public final boolean X00XIX1() {
        return this.XX0;
    }

    public final void X0i1O() {
        SpeechRecognizer speechRecognizer = this.I0iXXO;
        if (speechRecognizer != null) {
            speechRecognizer.close();
        }
        XOIO11O();
        RecordingManager.Companion.getInstance().closeBluetooth();
        InterfaceC19048iO interfaceC19048iO = this.O10IXXX0X;
        if (interfaceC19048iO != null) {
            interfaceC19048iO.onStopTransmission();
        }
        this.OIX0iXi = null;
    }

    public final void X0iO(@tb1 AudioRecord audioRecord) {
        this.IiI10X = audioRecord;
    }

    public final void X100O() {
        if (this.i010I == null) {
            this.i010I = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(ErrorCode.ERROR_TTS_INVALID_PARA).setChannelMask(12).build(), AudioTrack.getMinBufferSize(ErrorCode.ERROR_TTS_INVALID_PARA, 12, 2) * 2, 1, 0);
        }
    }

    public final void X111IO(@tb1 ExecutorService executorService) {
        this.I0IIOi = executorService;
    }

    public final void X11I() {
        if (this.f54909IO == null) {
            this.f54909IO = new OXO1();
        }
        if (this.OIX0iXi == null) {
            this.OIX0iXi = AudioConfig.fromStreamInput(this.f54909IO);
        }
    }

    public final void X1IX() {
        SpeechRecognizer speechRecognizer = this.I0iXXO;
        if (speechRecognizer != null) {
            speechRecognizer.close();
        }
        iX01();
        this.I0iXXO = null;
    }

    @SuppressLint({"MissingPermission"})
    public final void XIO11I() {
        q62.OiO0IOX(q62.OXO1, null, 1, null);
        RecordingManager.Companion companion = RecordingManager.Companion;
        companion.getInstance().setRecording(true);
        this.IiI10X = new AudioRecord(0, this.XO0O10, 16, 2, AudioRecord.getMinBufferSize(this.XO0O10, 16, 2));
        companion.getInstance().setStartBluetooth();
        AudioRecord audioRecord = this.IiI10X;
        if (audioRecord != null) {
            audioRecord.startRecording();
        }
    }

    public final void XO0X10iO() {
        EventHandlerImpl<SpeechSynthesisWordBoundaryEventArgs> eventHandlerImpl;
        EventHandlerImpl<SpeechSynthesisEventArgs> eventHandlerImpl2;
        EventHandlerImpl<SpeechSynthesisEventArgs> eventHandlerImpl3;
        EventHandlerImpl<SpeechSynthesisEventArgs> eventHandlerImpl4;
        EventHandlerImpl<SpeechSynthesisEventArgs> eventHandlerImpl5;
        EventHandlerImpl<ConnectionEventArgs> eventHandlerImpl6;
        EventHandlerImpl<ConnectionEventArgs> eventHandlerImpl7;
        if (this.iOOX010X != null) {
            SpeechConfig speechConfig = this.XOO0ii0;
            Intrinsics.XXI(speechConfig);
            speechConfig.close();
            Connection connection = this.X01IiOiIi;
            if (connection != null) {
                connection.close();
            }
            SpeechSynthesizer speechSynthesizer = this.iOOX010X;
            if (speechSynthesizer != null) {
                speechSynthesizer.close();
            }
        }
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " Initializing synthesizer...");
        if (this.XOO0ii0 == null) {
            this.XOO0ii0 = SpeechConfig.fromSubscription(this.XIi00iiXO, this.f54911iO);
        }
        if (this.II1Xi0 == null) {
            this.II1Xi0 = new XOO0ii0();
        }
        X100O();
        SpeechConfig speechConfig2 = this.XOO0ii0;
        if (speechConfig2 != null) {
            speechConfig2.setSpeechSynthesisOutputFormat(SpeechSynthesisOutputFormat.Raw24Khz16BitMonoPcm);
        }
        SpeechConfig speechConfig3 = this.XOO0ii0;
        if (speechConfig3 != null) {
            speechConfig3.setProperty(PropertyId.SpeechServiceConnection_LanguageIdMode, "Continuous");
        }
        SpeechSynthesizer speechSynthesizer2 = new SpeechSynthesizer(this.XOO0ii0, (AudioConfig) null);
        this.iOOX010X = speechSynthesizer2;
        Connection connectionFromSpeechSynthesizer = Connection.fromSpeechSynthesizer(speechSynthesizer2);
        this.X01IiOiIi = connectionFromSpeechSynthesizer;
        if (connectionFromSpeechSynthesizer != null && (eventHandlerImpl7 = connectionFromSpeechSynthesizer.connected) != null) {
            eventHandlerImpl7.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.dr0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.Ii0X0X(this.OXO1, obj, (ConnectionEventArgs) obj2);
                }
            });
        }
        Connection connection2 = this.X01IiOiIi;
        if (connection2 != null && (eventHandlerImpl6 = connection2.disconnected) != null) {
            eventHandlerImpl6.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.er0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.XXiIiX10(this.OXO1, obj, (ConnectionEventArgs) obj2);
                }
            });
        }
        SpeechSynthesizer speechSynthesizer3 = this.iOOX010X;
        if (speechSynthesizer3 != null && (eventHandlerImpl5 = speechSynthesizer3.SynthesisStarted) != null) {
            eventHandlerImpl5.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.fr0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.X00Xi1X(this.OXO1, obj, (SpeechSynthesisEventArgs) obj2);
                }
            });
        }
        SpeechSynthesizer speechSynthesizer4 = this.iOOX010X;
        if (speechSynthesizer4 != null && (eventHandlerImpl4 = speechSynthesizer4.Synthesizing) != null) {
            eventHandlerImpl4.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.gr0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.m38821X1(obj, (SpeechSynthesisEventArgs) obj2);
                }
            });
        }
        SpeechSynthesizer speechSynthesizer5 = this.iOOX010X;
        if (speechSynthesizer5 != null && (eventHandlerImpl3 = speechSynthesizer5.SynthesisCompleted) != null) {
            eventHandlerImpl3.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.hr0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.IXOIIIO(this.OXO1, obj, (SpeechSynthesisEventArgs) obj2);
                }
            });
        }
        SpeechSynthesizer speechSynthesizer6 = this.iOOX010X;
        if (speechSynthesizer6 != null && (eventHandlerImpl2 = speechSynthesizer6.SynthesisCanceled) != null) {
            eventHandlerImpl2.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.ir0
                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    MicrosoftSDKManage.IO0II0i(this.OXO1, obj, (SpeechSynthesisEventArgs) obj2);
                }
            });
        }
        SpeechSynthesizer speechSynthesizer7 = this.iOOX010X;
        if (speechSynthesizer7 == null || (eventHandlerImpl = speechSynthesizer7.WordBoundary) == null) {
            return;
        }
        eventHandlerImpl.addEventListener(new EventHandler() { // from class: com.android.mltcode.paycertificationapi.oq0
            @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
            public final void onEvent(Object obj, Object obj2) {
                MicrosoftSDKManage.Ii0i(this.OXO1, obj, (SpeechSynthesisWordBoundaryEventArgs) obj2);
            }
        });
    }

    public final void XOIO11O() {
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " stopAudio recorder.isNull = " + (this.IiI10X == null));
        try {
            if (this.IiI10X != null) {
                RecordingManager.Companion.getInstance().setRecording(false);
                AudioRecord audioRecord = this.IiI10X;
                if (audioRecord != null) {
                    audioRecord.stop();
                }
                AudioRecord audioRecord2 = this.IiI10X;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
                this.IiI10X = null;
            }
        } catch (Exception unused) {
        }
    }

    public final void XOIX(@tb1 InterfaceC19048iO interfaceC19048iO) {
        if (interfaceC19048iO != null) {
            i100IXOX(this, interfaceC19048iO, null, 2, null);
        }
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.MICROPHONE, "android.permission.MODIFY_AUDIO_SETTINGS");
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, UtilsKt.XXO(R.string.microphone_explain_title), UtilsKt.XXO(R.string.microphone_explain_content), new Function1() { // from class: com.android.mltcode.paycertificationapi.ar0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MicrosoftSDKManage.XOO0XOOii(this.f5545IO, (PermissionStatus) obj);
            }
        });
    }

    public final boolean XOX0O0() {
        return this.OiIIX101O;
    }

    public final void XX00i10X(boolean z) {
        this.OiIIX101O = z;
    }

    public final void XX1Oi() {
        XXIIO1i11 = new MicrosoftSDKManage();
        this.XOO0ii0 = null;
        this.OIX0iXi = null;
        this.O10IXXX0X = null;
        a01.OXO1.OXO1().remove(ExternalKeyManager.class.getName());
        VoiceManager voiceManager = VoiceManager.INSTANCE;
        voiceManager.sendTranslationResultInput(UtilsKt.XXO(R.string.fail));
        voiceManager.sendTranslationResultOutput(UtilsKt.XXO(R.string.microsoft_sdk_unbind_tip));
    }

    public final void XXIIO1i11(@aa1 String text, @aa1 String ttsName) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(ttsName, "ttsName");
        if (this.XIi00iiXO.length() == 0 || this.XOO0ii0 == null) {
            a01.OXO1.OXO1().remove(ExternalKeyManager.class.getName());
            ToastUtils.showLong(R.string.microsoft_sdk_unbind_tip);
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            voiceManager.sendTranslationResultInput(UtilsKt.XXO(R.string.fail));
            voiceManager.sendTranslationResultOutput(UtilsKt.XXO(R.string.microsoft_sdk_unbind_tip));
            return;
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.OXO1 + " audioSpeech ttsVoiceName = " + ttsName);
        this.OII = ttsName;
        DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
        dcsTtsPlayer.stop();
        if (this.X01IiOiIi == null) {
            i1o0oxo1o.XIi00iiXO(this.OXO1 + " Please initialize the speech synthesizer first.");
            return;
        }
        if (!this.I1XOi1) {
            IXI();
        }
        if (dcsTtsPlayer.getMTtsFile().exists()) {
            dcsTtsPlayer.getMTtsFile().delete();
        }
        try {
            this.X01IiOiIi = Connection.fromSpeechSynthesizer(this.iOOX010X);
            i1o0oxo1o.OXO1(this.OXO1 + " audioSpeech text = " + text + " " + (this.II1Xi0 == null));
            XOO0ii0 xOO0ii0 = this.II1Xi0;
            if (xOO0ii0 != null) {
                xOO0ii0.XIi00iiXO(ttsName);
            }
            XOO0ii0 xOO0ii1 = this.II1Xi0;
            if (xOO0ii1 != null) {
                xOO0ii1.O00(LeftAndRightPlayControl.LEFT_AND_RIGHT);
            }
            XOO0ii0 xOO0ii2 = this.II1Xi0;
            if (xOO0ii2 != null) {
                xOO0ii2.XO0O10(xp5.m3312iO(text));
            }
            ExecutorService executorService = this.I0IIOi;
            if (executorService != null) {
                executorService.execute(this.II1Xi0);
            }
        } catch (Exception unused) {
            iX01();
        }
    }

    @aa1
    public final String XXO() {
        return this.XiOIii1;
    }

    public final void XXX11i() {
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " closeAudioInputStream");
        O00 o00 = this.OIi0;
        if (o00 != null) {
            o00.OXO1();
        }
        this.OIi0 = null;
        OXO1 oxo1 = this.f54909IO;
        if (oxo1 != null) {
            oxo1.close();
        }
    }

    public final void XXiO0i(boolean z) {
        this.XiOIO = z;
    }

    /* JADX INFO: renamed from: Xi */
    public final void m38829Xi() {
        if (this.I0iXXO != null) {
            i1O0OXO1O.OXO1.OXO1(this.OXO1 + " stopAudioStreamInput stopped");
            SpeechRecognizer speechRecognizer = this.I0iXXO;
            Intrinsics.XXI(speechRecognizer);
            Future<Void> futureStopContinuousRecognitionAsync = speechRecognizer.stopContinuousRecognitionAsync();
            Intrinsics.XXI(futureStopContinuousRecognitionAsync);
            Xi1i0XOX0(futureStopContinuousRecognitionAsync, new XO0O10() { // from class: com.android.mltcode.paycertificationapi.wq0
                @Override // com.sma.smartv3.util.MicrosoftSDKManage.XO0O10
                public final void OXO1(Object obj) {
                    MicrosoftSDKManage.X0I1(this.OXO1, (Void) obj);
                }
            });
        }
    }

    public final <T> void Xi1i0XOX0(final Future<T> future, final XO0O10<T> xo0o10) {
        ExecutorService executorService = this.I0IIOi;
        if (executorService != null) {
            executorService.submit(new Callable() { // from class: com.android.mltcode.paycertificationapi.zq0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MicrosoftSDKManage.iii0(future, xo0o10);
                }
            });
        }
    }

    public final void Xii(@aa1 String mLanguage, boolean z, @aa1 String ttsName, @aa1 String ttsLanguage, boolean z2, @aa1 String name, @aa1 List<String> languages, boolean z3) {
        SpeechConfig speechConfig;
        Intrinsics.X0O(mLanguage, "mLanguage");
        Intrinsics.X0O(ttsName, "ttsName");
        Intrinsics.X0O(ttsLanguage, "ttsLanguage");
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(languages, "languages");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.OXO1 + "  startAudioStreamInput name=" + name + "  mLanguage: ---> " + mLanguage + " , phoneRecord = " + z + " , ttsName = " + ttsName + " , ttsLanguage = " + ttsLanguage);
        try {
            if (this.XIi00iiXO.length() == 0) {
                String strXiOIii1 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
                if (strXiOIii1.length() <= 0) {
                    a01.OXO1.OXO1().remove(ExternalKeyManager.class.getName());
                    VoiceManager voiceManager = VoiceManager.INSTANCE;
                    voiceManager.sendTranslationResultInput(UtilsKt.XXO(R.string.fail));
                    voiceManager.sendTranslationResultOutput(UtilsKt.XXO(R.string.microsoft_sdk_unbind_tip));
                    return;
                }
                iI0I(strXiOIii1);
            }
            iX01();
            DcsTtsPlayer.INSTANCE.stop();
            i1o0oxo1o.OXO1(this.OXO1 + "  startAudioStreamInput  Language: ---> " + this.XiOIii1 + " , reco = " + (this.I0iXXO == null));
            this.I0iXXO = null;
            this.f54910OX = languages;
            this.XiOIii1 = mLanguage;
            this.OII = ttsName;
            X11I();
            this.XX0 = z;
            this.OiIIX101O = z2;
            FileUtils.delete(VoiceManager.INSTANCE.getMPcmFile());
            this.X1ii.clear();
            i1o0oxo1o.OXO1(this.OXO1 + " startAudioStreamInput  Language: ---> " + this.XiOIii1 + " , reco = " + (this.I0iXXO == null));
            if (!z3 && (speechConfig = this.XOO0ii0) != null) {
                speechConfig.setSpeechRecognitionLanguage(this.XiOIii1);
            }
            i1o0oxo1o.OXO1(this.OXO1 + " speechRecognitionLanguage");
            I0XXi0X(z3);
            StatManager.m38112iO(StatManager.OXO1, 8, null, 2, null);
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + "  e = " + e + "  ");
        }
    }

    public final void Xii11I(boolean z) {
        this.I1XOi1 = z;
    }

    public final boolean i0X000X0O() {
        return this.I1XOi1;
    }

    public final boolean i11I() {
        return this.IIX1OXO;
    }

    public final void iI0I(@aa1 String key) {
        Intrinsics.X0O(key, "key");
        this.XIi00iiXO = key;
        VoiceManager.INSTANCE.initMicrosoftSDKManage();
    }

    public final void iIX0i(@aa1 String mLanguage, boolean z, @aa1 String ttsName, @aa1 String ttsLanguage, boolean z2) {
        Intrinsics.X0O(mLanguage, "mLanguage");
        Intrinsics.X0O(ttsName, "ttsName");
        Intrinsics.X0O(ttsLanguage, "ttsLanguage");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.OXO1 + "  startAudioStreamInput  mLanguage: ---> " + mLanguage + " , phoneRecord = " + z + " , ttsName = " + ttsName + " , ttsLanguage = " + ttsLanguage);
        try {
            if (this.XIi00iiXO.length() == 0) {
                String strXiOIii1 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
                if (strXiOIii1.length() <= 0) {
                    a01.OXO1.OXO1().remove(ExternalKeyManager.class.getName());
                    VoiceManager voiceManager = VoiceManager.INSTANCE;
                    voiceManager.sendTranslationResultInput(UtilsKt.XXO(R.string.fail));
                    voiceManager.sendTranslationResultOutput(UtilsKt.XXO(R.string.microsoft_sdk_unbind_tip));
                    return;
                }
                iI0I(strXiOIii1);
            }
            iX01();
            DcsTtsPlayer.INSTANCE.stop();
            if (this.I0iXXO != null && !Intrinsics.XOO0ii0(this.XiOIii1, mLanguage)) {
                this.I0iXXO = null;
            }
            this.XiOIii1 = mLanguage;
            this.OII = ttsName;
            X11I();
            this.XX0 = z;
            this.OiIIX101O = z2;
            this.X1ii.clear();
            i1o0oxo1o.OXO1(this.OXO1 + " startAudioStreamInput  Language: ---> " + this.XiOIii1 + " , reco = " + (this.I0iXXO == null));
            SpeechConfig speechConfig = this.XOO0ii0;
            if (speechConfig != null) {
                speechConfig.setSpeechRecognitionLanguage(this.XiOIii1);
            }
            StatManager.m38112iO(StatManager.OXO1, 8, null, 2, null);
            if (this.XX0) {
                XOXiX0(this, null, 1, null);
            } else {
                m38827OO();
                IXiOXO();
            }
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + "  e = " + e + "  ");
        }
    }

    public final int iIXi1iiXI() {
        return this.f54908I1;
    }

    public final void iIi1(@aa1 InterfaceC19048iO callback, @aa1 String name) {
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(name, "name");
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " setSpeechCallback name=" + name);
        this.O10IXXX0X = callback;
    }

    public final void iOI(@tb1 List<String> list) {
        this.f54910OX = list;
    }

    public final boolean iOiXi11II() {
        return this.XiOIO;
    }

    public final void iX01() {
        SpeechSynthesizer speechSynthesizer;
        try {
            if (this.iOOX010X != null && !XXIIO1i11.iOO1ii1 && (speechSynthesizer = this.iOOX010X) != null) {
                speechSynthesizer.StopSpeakingAsync();
            }
            if (this.i010I != null) {
                synchronized (this.f54912iX) {
                    this.IXXOO = true;
                    Unit unit = Unit.OXO1;
                }
                AudioTrack audioTrack = this.i010I;
                if (audioTrack != null) {
                    audioTrack.pause();
                }
                AudioTrack audioTrack2 = this.i010I;
                if (audioTrack2 != null) {
                    audioTrack2.flush();
                }
            }
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " stopSynthesizing Exception e = " + e);
        }
    }

    public final void iX1O1(@aa1 String text, @aa1 String ttsName, @aa1 LeftAndRightPlayControl leftOrRight, int i) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(ttsName, "ttsName");
        Intrinsics.X0O(leftOrRight, "leftOrRight");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.OXO1 + " audioSpeech ttsVoiceName = " + ttsName);
        this.OII = ttsName;
        if (this.X01IiOiIi == null) {
            i1o0oxo1o.XIi00iiXO(this.OXO1 + " Please initialize the speech synthesizer first.");
            return;
        }
        if (!this.I1XOi1) {
            IXI();
        }
        DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
        if (dcsTtsPlayer.getMTtsFile().exists()) {
            dcsTtsPlayer.getMTtsFile().delete();
        }
        try {
            this.X01IiOiIi = Connection.fromSpeechSynthesizer(this.iOOX010X);
            XOO0ii0 xOO0ii0 = new XOO0ii0();
            this.II1Xi0 = xOO0ii0;
            xOO0ii0.XIi00iiXO(ttsName);
            XOO0ii0 xOO0ii1 = this.II1Xi0;
            if (xOO0ii1 != null) {
                xOO0ii1.O00(leftOrRight);
            }
            XOO0ii0 xOO0ii2 = this.II1Xi0;
            if (xOO0ii2 != null) {
                xOO0ii2.XO0O10(text);
            }
            XOO0ii0 xOO0ii3 = this.II1Xi0;
            if (xOO0ii3 != null) {
                xOO0ii3.OXO1(i);
            }
            i1o0oxo1o.OXO1(this.OXO1 + " audioSpeech text = " + text + " " + (this.II1Xi0 == null));
            ExecutorService executorService = this.I0IIOi;
            if (executorService != null) {
                executorService.execute(this.II1Xi0);
            }
        } catch (Exception unused) {
            iX01();
        }
    }

    public final void iXi(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.OII = str;
    }

    @tb1
    public final List<String> iXiX011() {
        return this.f54910OX;
    }

    @aa1
    public final String iXiiiO() {
        return this.OII;
    }

    public final void iiIOiX(@aa1 Application mApp) {
        Intrinsics.X0O(mApp, "mApp");
        if (this.IIX1OXO) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            ContextCompat.registerReceiver(mApp, new IiI10X(), new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
        } else {
            mApp.registerReceiver(new IiI10X(), new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        }
        this.IIX1OXO = true;
    }

    @tb1
    public final ExecutorService iiiO() {
        return this.I0IIOi;
    }
}
