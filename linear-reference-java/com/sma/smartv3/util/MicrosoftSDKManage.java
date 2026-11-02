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
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ar0;
import com.android.mltcode.paycertificationapi.br0;
import com.android.mltcode.paycertificationapi.cr0;
import com.android.mltcode.paycertificationapi.dr0;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.er0;
import com.android.mltcode.paycertificationapi.fr0;
import com.android.mltcode.paycertificationapi.gr0;
import com.android.mltcode.paycertificationapi.hr0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ir0;
import com.android.mltcode.paycertificationapi.nq0;
import com.android.mltcode.paycertificationapi.oq0;
import com.android.mltcode.paycertificationapi.pq0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qq0;
import com.android.mltcode.paycertificationapi.rq0;
import com.android.mltcode.paycertificationapi.sq0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tq0;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uq0;
import com.android.mltcode.paycertificationapi.vq0;
import com.android.mltcode.paycertificationapi.wq0;
import com.android.mltcode.paycertificationapi.xp5;
import com.android.mltcode.paycertificationapi.xq0;
import com.android.mltcode.paycertificationapi.yq0;
import com.android.mltcode.paycertificationapi.zq0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
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
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public static final XIi00iiXO O1O = null;

    @aa1
    public static volatile MicrosoftSDKManage XXIIO1i11;

    @tb1
    public ExecutorService I0IIOi;

    @tb1
    public SpeechRecognizer I0iXXO;
    public int I1;
    public boolean I1XOi1;

    @tb1
    public XOO0ii0 II1Xi0;
    public boolean IIX1OXO;

    @tb1
    public OXO1 IO;
    public boolean IXXOO;

    @tb1
    public AudioRecord IiI10X;

    @tb1
    public AudioStreamFormat O00;

    @tb1
    public iO O10IXXX0X;

    @aa1
    public String OII;

    @tb1
    public AudioConfig OIX0iXi;

    @tb1
    public O00 OIi0;

    @tb1
    public List<String> OX;

    @aa1
    public final String OXO1;
    public boolean OiIIX101O;

    @tb1
    public Connection X01IiOiIi;

    @tb1
    public Connection X0O;

    @aa1
    public final ArrayList<String> X1ii;

    @aa1
    public String XIi00iiXO;
    public final int XO0O10;

    @tb1
    public SpeechConfig XOO0ii0;
    public boolean XX0;

    @aa1
    public final ArrayList<String> XXI;
    public boolean XiOIO;

    @aa1
    public String XiOIii1;

    @tb1
    public AudioTrack i010I;

    @aa1
    public final Handler iIiiO;

    @aa1
    public final String iO;
    public boolean iOO1ii1;

    @tb1
    public SpeechSynthesizer iOOX010X;

    @aa1
    public final Object iX;

    public static final class IiI10X extends BroadcastReceiver {
        public IiI10X() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@aa1 Context r2, @aa1 Intent r3) {
            Intrinsics.X0O(r2, "context");
            Intrinsics.X0O(r3, SDKConstants.PARAM_INTENT);
            if (Intrinsics.XOO0ii0("android.media.ACTION_SCO_AUDIO_STATE_UPDATED", r3.getAction()) == false) goto L20;
            int r4 = r3.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            if (r4 == (-1)) goto L18;
            if (r4 != 0) goto L8;
            i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.i010I(MicrosoftSDKManage.O1O.OXO1()) + " RecordingManager SCO Audio State: DISCONNECTED");
            return;
        L8:
            if (r4 != 1) goto L10;
            i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.i010I(MicrosoftSDKManage.O1O.OXO1()) + " RecordingManager SCO Audio State: CONNECTED");
            RecordingManager.Companion.getInstance().setScoOnOpen();
            return;
        L10:
            if (r4 != 2) goto L21;
            i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.i010I(MicrosoftSDKManage.O1O.OXO1()) + " RecordingManager SCO Audio State: CONNECTING");
            return;
        L21:
            return;
        L18:
            i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.i010I(MicrosoftSDKManage.O1O.OXO1()) + " RecordingManager SCO Audio State: ERROR");
            return;
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
        public int iO;

        public O00() {
            int r2 = 0;
            this(r2, 1, null);
        }

        public static /* synthetic */ int I0IIOi(O00 r0, byte[] r1, int r2, int r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = r1.length;
        L9:
            return r0.XOO0ii0(r1, r2, r3);
        }

        public static /* synthetic */ int XO0O10(O00 r6, byte[] r7, int r8, int r9, long r10, int r12, Object r13) {
            if ((r12 & 2) == 0) goto L5;
            r8 = 0;
        L5:
            int r2 = r8;
            if ((r12 & 4) == 0) goto L8;
            r9 = r7.length;
        L8:
            int r3 = r9;
            if ((r12 & 8) == 0) goto L12;
            r10 = 200;
        L12:
            return r6.iO(r7, r2, r3, r10);
        }

        public final void IiI10X() {
            this.IiI10X.lock();
            this.O00 = 0;     // Catch: Throwable -> L6
            this.iO = 0;     // Catch: Throwable -> L6
            this.XO0O10 = 0;     // Catch: Throwable -> L6
            this.IiI10X.unlock();
            return;
        L6:
            th = move-exception;
            this.IiI10X.unlock();
            throw th;
        }

        public final void O00() {
            this.IiI10X.lock();
            this.I0IIOi = false;     // Catch: Throwable -> L6
            this.O00 = 0;     // Catch: Throwable -> L6
            this.iO = 0;     // Catch: Throwable -> L6
            this.XO0O10 = 0;     // Catch: Throwable -> L6
            this.IiI10X.unlock();
            return;
        L6:
            th = move-exception;
            this.IiI10X.unlock();
            throw th;
        }

        public final void OXO1() {
            this.IiI10X.lock();
            this.I0IIOi = true;     // Catch: Throwable -> L6
            this.O00 = 0;     // Catch: Throwable -> L6
            this.iO = 0;     // Catch: Throwable -> L6
            this.XO0O10 = 0;     // Catch: Throwable -> L6
            this.XOO0ii0.signalAll();     // Catch: Throwable -> L6
            this.IiI10X.unlock();
            return;
        L6:
            th = move-exception;
            this.IiI10X.unlock();
            throw th;
        }

        public final int XIi00iiXO() {
            this.IiI10X.lock();
            int r0 = this.O00;     // Catch: Throwable -> L6
            this.IiI10X.unlock();
            return r0;
        L6:
            th = move-exception;
            this.IiI10X.unlock();
            throw th;
        }

        public final int XOO0ii0(@aa1 byte[] r6, int r7, int r8) {
            Intrinsics.X0O(r6, "data");
            if (this.I0IIOi == true) goto L20;
            if (r8 <= 0) goto L20;
            this.IiI10X.lock();
            int r0 = this.OXO1;     // Catch: Throwable -> L10
            int r2 = this.O00;     // Catch: Throwable -> L10
            int r3 = r0 - r2;     // Catch: Throwable -> L10
            if (r8 <= r3) goto L12;
            int r4 = r8 - r3;     // Catch: Throwable -> L10
            this.iO = (this.iO + r4) % r0;     // Catch: Throwable -> L10
            this.O00 = r2 - r4;     // Catch: Throwable -> L10
        L12:
            int r1 = Math.min(r8, r0 - this.XO0O10);     // Catch: Throwable -> L10
            System.arraycopy(r6, r7, this.XIi00iiXO, this.XO0O10, r1);     // Catch: Throwable -> L10
            if (r1 >= r8) goto L15;
            System.arraycopy(r6, r7 + r1, this.XIi00iiXO, 0, r8 - r1);     // Catch: Throwable -> L10
        L15:
            this.XO0O10 = (this.XO0O10 + r8) % this.OXO1;     // Catch: Throwable -> L10
            this.O00 += r8;     // Catch: Throwable -> L10
            this.XOO0ii0.signalAll();     // Catch: Throwable -> L10
            this.IiI10X.unlock();
            return r8;
        L10:
            th = move-exception;
            this.IiI10X.unlock();
            throw th;
        L20:
            return 0;
        }

        public final int iO(@aa1 byte[] r4, int r5, int r6, long r7) {
            Intrinsics.X0O(r4, "out");
            if (r6 > 0) goto L5;
            return 0;
        L5:
            this.IiI10X.lock();
        L15:
            th = move-exception;
            this.IiI10X.unlock();
            throw th;
        L23:
            Thread.currentThread().interrupt();     // Catch: Throwable -> L15
        L10:
            this.IiI10X.unlock();
            return 0;
        L7:
            if (this.O00 == 0) goto L9;
        L17:
            int r8 = Math.min(r6, this.O00);     // Catch: Throwable -> L15 InterruptedException -> L23
            int r9 = Math.min(r8, this.OXO1 - this.iO);     // Catch: Throwable -> L15 InterruptedException -> L23
            System.arraycopy(this.XIi00iiXO, this.iO, r4, r5, r9);     // Catch: Throwable -> L15 InterruptedException -> L23
            if (r9 >= r8) goto L20;
            System.arraycopy(this.XIi00iiXO, 0, r4, r5 + r9, r8 - r9);     // Catch: Throwable -> L15 InterruptedException -> L23
        L20:
            this.iO = (this.iO + r8) % this.OXO1;     // Catch: Throwable -> L15 InterruptedException -> L23
            this.O00 -= r8;     // Catch: Throwable -> L15 InterruptedException -> L23
            this.IiI10X.unlock();
            return r8;
        L9:
            if (this.I0IIOi == true) goto L10;
            this.XOO0ii0.await(r7, TimeUnit.MILLISECONDS);     // Catch: Throwable -> L15 InterruptedException -> L23
            if (this.O00 != 0) goto L17;
            goto L17
        }

        public O00(int r1) {
            this.OXO1 = r1;
            this.XIi00iiXO = new byte[r1];
            ReentrantLock r2 = new ReentrantLock();
            this.IiI10X = r2;
            this.XOO0ii0 = r2.newCondition();
        }

        public /* synthetic */ O00(int r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = 1048576;
        L5:
            this(r1);
        }
    }

    public static final class OXO1 extends PullAudioInputStreamCallback {

        @tb1
        public O00 OXO1;

        public OXO1() {
        }

        public final void OXO1(@aa1 O00 r2) {
            Intrinsics.X0O(r2, "buffer");
            this.OXO1 = r2;
        }

        @Override // com.microsoft.cognitiveservices.speech.audio.PullAudioInputStreamCallback
        public void close() {
            O00 r0 = this.OXO1;     // Catch: Exception -> L5
            if (r0 == null) goto L7;
            r0.OXO1();     // Catch: Exception -> L5
        L7:
            this.OXO1 = null;     // Catch: Exception -> L5
            RecordingManager.Companion.getInstance().setRecording(false);     // Catch: Exception -> L5
            XIi00iiXO r1 = MicrosoftSDKManage.O1O;     // Catch: Exception -> L5
            AudioRecord r2 = r1.OXO1().Ii1iii0();     // Catch: Exception -> L5
            if (r2 == null) goto L15;
            r2.stop();     // Catch: Exception -> L5
            r2.release();     // Catch: Exception -> L5
            r1.OXO1().X0iO(null);     // Catch: Exception -> L5
            return;
        L15:
            return;
        L5:
            e = move-exception;
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("MicrosoftSDKManage close e = " + e);
        }

        @Override // com.microsoft.cognitiveservices.speech.audio.PullAudioInputStreamCallback
        public int read(@tb1 byte[] r10) {
            XIi00iiXO r0 = MicrosoftSDKManage.O1O;
            if (r0.OXO1().X00XIX1() == true) goto L5;
            if (r10 == null) goto L31;
            O00 r3 = this.OXO1;
            if (r3 == null) goto L31;
            if (r3 != null) goto L30;
            return 0;
        L30:
            return r3.iO(r10, 0, r10.length, 150);
        L31:
            return 0;
        L5:
            if (r0.OXO1().Ii1iii0() == null) goto L31;
            if (r10 == null) goto L31;
            MicrosoftSDKManage r1 = r0.OXO1();     // Catch: Exception -> L19
            monitor-enter(r1);     // Catch: Exception -> L19
            AudioRecord r2 = r0.OXO1().Ii1iii0();     // Catch: Throwable -> L12
            if (r2 == null) goto L14;
            long r4 = r2.read(r10, 0, r10.length);     // Catch: Throwable -> L12
        L15:
            FileIOUtils.writeFileFromBytesByStream(VoiceManager.INSTANCE.getMPcmFile(), r10, true);     // Catch: Throwable -> L12
            int r11 = (int) r4;
            monitor-exit(r1);     // Catch: Exception -> L19
            return r11;
        L14:
            r4 = 0;
        L12:
            th = move-exception;
            throw th;     // Catch: Exception -> L19
        L19:
            e = move-exception;
            i1O0OXO1O.OXO1.OXO1(e.toString());
            goto L31
        }
    }

    public static final class XIi00iiXO {
        public /* synthetic */ XIi00iiXO(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final MicrosoftSDKManage OXO1() {
            return MicrosoftSDKManage.OII();
        }

        public final void XIi00iiXO(@aa1 MicrosoftSDKManage r2) {
            Intrinsics.X0O(r2, "<set-?>");
            MicrosoftSDKManage.iX(r2);
        }

        public XIi00iiXO() {
        }
    }

    public interface XO0O10<T> {
        void OXO1(T r1);
    }

    public static final class XOO0ii0 implements Runnable {

        @aa1
        public String I1;

        @tb1
        public String IO;
        public int X11iII1O1;

        @aa1
        public LeftAndRightPlayControl iX1O1;

        public XOO0ii0() {
            this.I1 = "";
            this.iX1O1 = LeftAndRightPlayControl.LEFT_AND_RIGHT;
            this.X11iII1O1 = -1;
        }

        public final void O00(@aa1 LeftAndRightPlayControl r2) {
            Intrinsics.X0O(r2, "leftOrRight");
            this.iX1O1 = r2;
        }

        public final void OXO1(int r1) {
            this.X11iII1O1 = r1;
        }

        public final void XIi00iiXO(@aa1 String r2) {
            Intrinsics.X0O(r2, "ttsName");
            this.I1 = r2;
        }

        public final void XO0O10(@tb1 String r1) {
            this.IO = r1;
        }

        public final void iO(int r11) {
            Object r0 = Utils.getApp().getSystemService("audio");
            Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.media.AudioManager");
            AudioDeviceInfo[] r1 = ((AudioManager) r0).getDevices(2);
            Intrinsics.XXI(r1);
            int r2 = r1.length;
            int r4 = 0;
            AudioDeviceInfo r5 = null;
            AudioDeviceInfo r6 = null;
        L4:
            if (r4 >= r2) goto L12;
            AudioDeviceInfo r8 = r1[r4];
            if (r8.getType() != 8) goto L9;
            r6 = r8;
        L11:
            r4 = r4 + 1;
            goto L4
        L9:
            if (r8.getType() != 2) goto L11;
            r5 = r8;
            goto L11
        L12:
            if (r11 == 2) goto L27;
            if (r11 == 8) goto L18;
            AudioTrack r12 = MicrosoftSDKManage.XiOIii1(MicrosoftSDKManage.O1O.OXO1());
            if (r12 == null) goto L40;
            r12.setPreferredDevice(null);
            return;
        L40:
            return;
        L18:
            if (r6 == null) goto L23;
            AudioTrack r13 = MicrosoftSDKManage.XiOIii1(MicrosoftSDKManage.O1O.OXO1());
            if (r13 == null) goto L41;
            r13.setPreferredDevice(r6);
            return;
        L41:
            return;
        L23:
            AudioTrack r14 = MicrosoftSDKManage.XiOIii1(MicrosoftSDKManage.O1O.OXO1());
            if (r14 == null) goto L42;
            r14.setPreferredDevice(null);
            return;
        L42:
            return;
        L27:
            if (r5 == null) goto L32;
            AudioTrack r15 = MicrosoftSDKManage.XiOIii1(MicrosoftSDKManage.O1O.OXO1());
            if (r15 == null) goto L43;
            r15.setPreferredDevice(r5);
            return;
        L43:
            return;
        L32:
            AudioTrack r16 = MicrosoftSDKManage.XiOIii1(MicrosoftSDKManage.O1O.OXO1());
            if (r16 == null) goto L44;
            r16.setPreferredDevice(null);
            return;
        }

        @Override // java.lang.Runnable
        public void run() {
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            XIi00iiXO r1 = MicrosoftSDKManage.O1O;
            r0.OXO1(MicrosoftSDKManage.i010I(r1.OXO1()) + " run content = " + this.IO);
            DcsTtsPlayer.INSTANCE.getMTtsFilePcm().delete();     // Catch: Exception -> L6
            iO(this.X11iII1O1);     // Catch: Exception -> L6
            AudioTrack r2 = MicrosoftSDKManage.XiOIii1(r1.OXO1());     // Catch: Exception -> L6
            if (r2 == null) goto L8;
            r2.play();     // Catch: Exception -> L6
        L8:
            Object r3 = MicrosoftSDKManage.X01IiOiIi(r1.OXO1());     // Catch: Exception -> L6
            monitor-enter(r3);     // Catch: Exception -> L6
            MicrosoftSDKManage.iOO1ii1(r1.OXO1(), false);     // Catch: Throwable -> L73
            Unit r4 = Unit.OXO1;     // Catch: Throwable -> L73
            monitor-exit(r3);     // Catch: Exception -> L6
            if (MicrosoftSDKManage.II1Xi0(r1.OXO1()) != null) goto L17;
            r0.OXO1(MicrosoftSDKManage.i010I(r1.OXO1()) + " synthesizer = null.");     // Catch: Exception -> L6
            return;
        L17:
            if (MicrosoftSDKManage.OX(r1.OXO1()) == true) goto L20;
            return;
        L20:
            if (Intrinsics.XOO0ii0(this.I1, r1.OXO1().iXiiiO()) == true) goto L28;
            SpeechConfig r5 = MicrosoftSDKManage.I1(r1.OXO1());     // Catch: Exception -> L6
            if (r5 == null) goto L24;
            r5.setSpeechSynthesisOutputFormat(SpeechSynthesisOutputFormat.Raw24Khz16BitMonoPcm);     // Catch: Exception -> L6
        L24:
            SpeechConfig r6 = MicrosoftSDKManage.I1(r1.OXO1());     // Catch: Exception -> L6
            if (r6 == null) goto L27;
            r6.setSpeechSynthesisVoiceName(this.I1);     // Catch: Exception -> L6
        L27:
            MicrosoftSDKManage.O1O(r1.OXO1(), new SpeechSynthesizer(MicrosoftSDKManage.I1(r1.OXO1()), null));     // Catch: Exception -> L6
        L28:
            MicrosoftSDKManage.IXXOO(r1.OXO1(), false);     // Catch: Exception -> L6
            StatManager.iO(StatManager.OXO1, 10, null, 2, null);     // Catch: Exception -> L6
            SpeechSynthesizer r7 = MicrosoftSDKManage.II1Xi0(r1.OXO1());     // Catch: Exception -> L6
            Intrinsics.XXI(r7);     // Catch: Exception -> L6
            SpeechSynthesisResult r8 = r7.StartSpeakingTextAsync(this.IO).get();     // Catch: Exception -> L6
            Intrinsics.O10IXXX0X(r8, "get(...)");     // Catch: Exception -> L6
            AudioDataStream r9 = AudioDataStream.fromResult(r8);     // Catch: Exception -> L6
            byte[] r10 = new byte[2400];     // Catch: Exception -> L6
            String r11 = MicrosoftSDKManage.i010I(r1.OXO1());     // Catch: Exception -> L6
            LeftAndRightPlayControl r12 = this.iX1O1;     // Catch: Exception -> L6
            if (r12 == LeftAndRightPlayControl.RIGHT) goto L31;
            boolean r13 = true;
        L33:
            if (r12 == LeftAndRightPlayControl.LEFT) goto L35;
            boolean r14 = true;
        L36:
            r0.OXO1(r11 + " microsoftLeftOrRight = " + r12 + " " + r13 + " " + r14);     // Catch: Exception -> L6
        L37:
            XIi00iiXO r15 = MicrosoftSDKManage.O1O;     // Catch: Exception -> L6
            if (MicrosoftSDKManage.iOOX010X(r15.OXO1()) == true) goto L71;
            if (r9.readData(r10) == 0) goto L71;
            byte[] r16 = new byte[4800];     // Catch: Exception -> L6
            int r17 = 0;
        L43:
            if (r17 >= 4800) goto L45;
            r16[r17] = 0;     // Catch: Exception -> L6
            r17 = r17 + 1;     // Catch: Exception -> L6
            goto L43
        L45:
            int r18 = ProgressionUtilKt.iO(0, 2399, 2);     // Catch: Exception -> L6
            if (r18 < 0) goto L67;
            int r19 = 0;
        L48:
            int r20 = r19 * 2;     // Catch: Exception -> L6
            LeftAndRightPlayControl r110 = this.iX1O1;     // Catch: Exception -> L6
            LeftAndRightPlayControl r111 = LeftAndRightPlayControl.RIGHT;     // Catch: Exception -> L6
            if (r110 == r111) goto L51;
            byte r112 = r10[r19];     // Catch: Exception -> L6
        L52:
            r16[r20] = r112;     // Catch: Exception -> L6
            int r113 = r20 + 1;     // Catch: Exception -> L6
            if (r110 == r111) goto L55;
            byte r114 = r10[r19 + 1];     // Catch: Exception -> L6
        L56:
            r16[r113] = r114;     // Catch: Exception -> L6
            int r115 = r20 + 2;     // Catch: Exception -> L6
            LeftAndRightPlayControl r116 = LeftAndRightPlayControl.LEFT;     // Catch: Exception -> L6
            if (r110 == r116) goto L59;
            byte r117 = r10[r19];     // Catch: Exception -> L6
        L60:
            r16[r115] = r117;     // Catch: Exception -> L6
            int r21 = r20 + 3;     // Catch: Exception -> L6
            if (r110 == r116) goto L63;
            byte r118 = r10[r19 + 1];     // Catch: Exception -> L6
        L64:
            r16[r21] = r118;     // Catch: Exception -> L6
            if (r19 == r18) goto L67;
            r19 = r19 + 2;     // Catch: Exception -> L6
            goto L48
        L63:
            r118 = 0;
            goto L64
        L59:
            r117 = 0;
            goto L60
        L55:
            r114 = 0;
            goto L56
        L51:
            r112 = 0;
        L67:
            AudioTrack r22 = MicrosoftSDKManage.XiOIii1(MicrosoftSDKManage.O1O.OXO1());     // Catch: Exception -> L6
            if (r22 == null) goto L70;
            r22.write(r16, 0, 4800);     // Catch: Exception -> L6
        L70:
            FileIOUtils.writeFileFromBytesByStream(DcsTtsPlayer.INSTANCE.getMTtsFilePcm(), r10, true);     // Catch: Exception -> L6
        L71:
            MicrosoftSDKManage.IXXOO(r15.OXO1(), true);     // Catch: Exception -> L6
            r9.close();     // Catch: Exception -> L6
            return;
        L35:
            r14 = false;
            goto L36
        L31:
            r13 = false;
            goto L33
        L73:
            th = move-exception;
            throw th;     // Catch: Exception -> L6
        L6:
            e = move-exception;
            i1O0OXO1O.OXO1.OXO1(MicrosoftSDKManage.i010I(MicrosoftSDKManage.O1O.OXO1()) + " unexpected " + e.getMessage());
            e.printStackTrace();
        }
    }

    public interface iO {

        public static final class OXO1 {
            @Deprecated
            public static void OXO1(@aa1 iO r1, int r2, @aa1 String r3, @aa1 String r4) {
                Intrinsics.X0O(r3, "str");
                Intrinsics.X0O(r4, "detectedLanguage");
                iO.OXO1(r1, r2, r3, r4);
            }
        }

        static /* synthetic */ void OXO1(iO r0, int r1, String r2, String r3) {
            super.onIdentifyResultsDetectedLanguage(r1, r2, r3);
        }

        void onIdentifyResults(int r1, @aa1 String r2);

        default void onIdentifyResultsDetectedLanguage(int r1, @aa1 String r2, @aa1 String r3) {
            Intrinsics.X0O(r2, "str");
            Intrinsics.X0O(r3, "detectedLanguage");
        }

        void onStartTransmission();

        void onStopTransmission();
    }

    static {
        XIi00iiXO r0 = new XIi00iiXO(null);
        O1O = r0;
        monitor-enter(r0);
        MicrosoftSDKManage r1 = new MicrosoftSDKManage();     // Catch: Throwable -> L8
        XXIIO1i11 = r1;     // Catch: Throwable -> L8
        monitor-exit(r0);
        XXIIO1i11 = r1;
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public MicrosoftSDKManage() {
        this.OXO1 = "MicrosoftSDKManage";
        this.XIi00iiXO = "";
        this.iO = "eastus";
        this.XO0O10 = 16000;
        this.XXI = new ArrayList();
        this.X1ii = new ArrayList();
        this.iIiiO = new Handler(Looper.getMainLooper());
        this.OiIIX101O = true;
        this.XiOIii1 = "zh-CN";
        this.OII = "zh-CN-XiaomoNeural";
        this.iX = new Object();
        this.iOO1ii1 = true;
    }

    public static final void I0IIOI(MicrosoftSDKManage r0, Object r1, ConnectionEventArgs r2) {
        i1O0OXO1O.OXO1.OXO1(r0.OXO1 + " Recognizer connection established.");
    }

    public static /* synthetic */ void I0IIOi(MicrosoftSDKManage r0, Object r1, SpeechSynthesisEventArgs r2) {
        X00Xi1X(r0, r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0iOXO(MicrosoftSDKManage r0, String r1, String r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.OI(r1, r2, r3);
    }

    public static /* synthetic */ void I0iXXO(MicrosoftSDKManage r0, Object r1, ConnectionEventArgs r2) {
        I0IIOI(r0, r1, r2);
    }

    public static final /* synthetic */ SpeechConfig I1(MicrosoftSDKManage r0) {
        return r0.XOO0ii0;
    }

    public static /* synthetic */ void I1XOi1(MicrosoftSDKManage r0, Object r1, SpeechSynthesisEventArgs r2) {
        IXOIIIO(r0, r1, r2);
    }

    public static final /* synthetic */ SpeechSynthesizer II1Xi0(MicrosoftSDKManage r0) {
        return r0.iOOX010X;
    }

    public static /* synthetic */ void IIX1OXO(MicrosoftSDKManage r0, Object r1, ConnectionEventArgs r2) {
        Ii0X0X(r0, r1, r2);
    }

    public static /* synthetic */ void IO(MicrosoftSDKManage r0, Void r1) {
        O101(r0, r1);
    }

    public static final void IO0II0i(MicrosoftSDKManage r4, Object r5, SpeechSynthesisEventArgs r6) {
        Intrinsics.X0O(r6, "e");
        String r7 = SpeechSynthesisCancellationDetails.fromResult(r6.getResult()).toString();
        Intrinsics.O10IXXX0X(r7, "toString(...)");
        LogUtils.d(new Object[]{r4.OXO1 + " Error synthesizing. Result ID. = " + r6.getResult().getResultId() + " , Error detail = " + System.lineSeparator() + r7 + System.lineSeparator() + "    Did you update the subscription info?"});
        r6.close();
    }

    public static final void IOIi00(MicrosoftSDKManage r0, Object r1, ConnectionEventArgs r2) {
        i1O0OXO1O.OXO1.OXO1(r0.OXO1 + " Recognizer connection disconnected.");
    }

    public static final void IOi1O0(MicrosoftSDKManage r6, Object r7, SpeechRecognitionEventArgs r8) {
        Intrinsics.X0O(r8, "speechRecognitionResultEventArgs");
        SpeechRecognitionResult r9 = r8.getResult();
        String r10 = r9.getText();
        String r11 = AutoDetectSourceLanguageResult.fromResult(r9).getLanguage();
        r6.XXI.add(r10);
        i1O0OXO1O.OXO1.OXO1(r6.OXO1 + " Intermediate result received:  ---> " + TextUtils.join(" ", r6.XXI));
        iO r12 = r6.O10IXXX0X;
        if (r12 == null) goto L5;
        r12.onIdentifyResults(1, TextUtils.join(ProxyConfig.MATCH_ALL_SCHEMES, r6.X1ii) + ProxyConfig.MATCH_ALL_SCHEMES + TextUtils.join(" ", r6.XXI));
    L5:
        iO r13 = r6.O10IXXX0X;
        if (r13 == null) goto L8;
        String r1 = TextUtils.join(ProxyConfig.MATCH_ALL_SCHEMES, r6.X1ii) + ProxyConfig.MATCH_ALL_SCHEMES + TextUtils.join(" ", r6.XXI);
        Intrinsics.XXI(r11);
        r13.onIdentifyResultsDetectedLanguage(1, r1, r11);
    L8:
        ArrayList<String> r14 = r6.XXI;
        r14.remove(r14.size() - 1);
    }

    public static final void IX0iIX(MicrosoftSDKManage r0, Object r1, SessionEventArgs r2) {
        Intrinsics.X0O(r2, "sessionEventArgs");
        i1O0OXO1O.OXO1.OXO1(r0.OXO1 + "  sessionStarted:  --->");
    }

    public static final void IXOIIIO(MicrosoftSDKManage r3, Object r4, SpeechSynthesisEventArgs r5) {
        Intrinsics.X0O(r5, "e");
        i1O0OXO1O r6 = i1O0OXO1O.OXO1;
        r6.OXO1(r3.OXO1 + " Synthesis finished.");
        r6.OXO1(r3.OXO1 + " First byte latency: " + r5.getResult().getProperties().getProperty(PropertyId.SpeechServiceResponse_SynthesisFirstByteLatencyMs) + " ms.");
        r6.OXO1(r3.OXO1 + " Finish latency: " + r5.getResult().getProperties().getProperty(PropertyId.SpeechServiceResponse_SynthesisFinishLatencyMs) + " ms.");
        r5.close();
    }

    public static final /* synthetic */ void IXXOO(MicrosoftSDKManage r0, boolean r1) {
        r0.iOO1ii1 = r1;
    }

    public static final void Ii0X0X(MicrosoftSDKManage r0, Object r1, ConnectionEventArgs r2) {
        r0.I1XOi1 = true;
        i1O0OXO1O.OXO1.OXO1(r0.OXO1 + " Connection established..");
    }

    public static final void Ii0i(MicrosoftSDKManage r8, Object r9, SpeechSynthesisWordBoundaryEventArgs r10) {
        Intrinsics.X0O(r10, "e");
        i1O0OXO1O.OXO1.OXO1(r8.OXO1 + " Word boundary. Text offset " + r10.getTextOffset() + ", length " + r10.getWordLength() + "; audio offset " + (r10.getAudioOffset() / ((long) 10000)) + " ms.");
    }

    public static /* synthetic */ Unit IiI10X(MicrosoftSDKManage r0, PermissionStatus r1) {
        return XOO0XOOii(r0, r1);
    }

    public static /* synthetic */ void O00(MicrosoftSDKManage r0, Void r1) {
        XXOXi(r0, r1);
    }

    public static final void O1(MicrosoftSDKManage r4, Object r5, SpeechRecognitionEventArgs r6) {
        Intrinsics.X0O(r6, "speechRecognitionResultEventArgs");
        SpeechRecognitionResult r7 = r6.getResult();
        String r8 = r7.getText();
        String r9 = AutoDetectSourceLanguageResult.fromResult(r7).getLanguage();
        r4.X1ii.add(r8);
        r4.XXI.clear();
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        String r1 = r4.OXO1;
        if (r4.O10IXXX0X == null) goto L5;
        boolean r2 = true;
    L6:
        r0.OXO1(r1 + "  Final result received:  -> " + r8 + " , detectedLanguage: " + r9 + "  , mSpeechCallback = " + r2);
        iO r10 = r4.O10IXXX0X;
        if (r10 == null) goto L9;
        String r3 = TextUtils.join(ProxyConfig.MATCH_ALL_SCHEMES, r4.X1ii);
        Intrinsics.O10IXXX0X(r3, "join(...)");
        r10.onIdentifyResults(2, r3);
    L9:
        iO r11 = r4.O10IXXX0X;
        if (r11 == null) goto L13;
        String r12 = TextUtils.join(ProxyConfig.MATCH_ALL_SCHEMES, r4.X1ii);
        Intrinsics.O10IXXX0X(r12, "join(...)");
        Intrinsics.XXI(r9);
        r11.onIdentifyResultsDetectedLanguage(2, r12, r9);
        return;
    L13:
        return;
    L5:
        r2 = false;
        goto L6
    }

    public static final void O101(MicrosoftSDKManage r0, Void r1) {
        iO r2 = r0.O10IXXX0X;
        if (r2 == null) goto L6;
        r2.onStartTransmission();
        return;
    }

    public static /* synthetic */ void O10IXXX0X(MicrosoftSDKManage r0, Object r1, SpeechRecognitionEventArgs r2) {
        IOi1O0(r0, r1, r2);
    }

    public static final /* synthetic */ void O1O(MicrosoftSDKManage r0, SpeechSynthesizer r1) {
        r0.iOOX010X = r1;
    }

    public static final void O1iXiI(MicrosoftSDKManage r1, Object r2, SpeechRecognitionEventArgs r3) {
        Intrinsics.X0O(r3, "speechRecognitionResultEventArgs");
        i1O0OXO1O.OXO1.OXO1(r1.OXO1 + "  canceled:  ---> Reason=  " + r3.getResult().getReason());
    }

    public static final /* synthetic */ MicrosoftSDKManage OII() {
        return XXIIO1i11;
    }

    public static /* synthetic */ void OIX0iXi(MicrosoftSDKManage r0, Object r1, SessionEventArgs r2) {
        OXi001(r0, r1, r2);
    }

    public static /* synthetic */ void OIi0(MicrosoftSDKManage r0, Object r1, SpeechRecognitionEventArgs r2) {
        XIIO11I(r0, r1, r2);
    }

    public static final /* synthetic */ boolean OX(MicrosoftSDKManage r0) {
        return r0.iOO1ii1;
    }

    public static /* synthetic */ void OXO1(Object r0, SpeechSynthesisEventArgs r1) {
        X1(r0, r1);
    }

    public static final void OXi001(MicrosoftSDKManage r0, Object r1, SessionEventArgs r2) {
        Intrinsics.X0O(r2, "sessionEventArgs");
        i1O0OXO1O.OXO1.OXO1(r0.OXO1 + "  sessionStopped:  --->");
    }

    public static /* synthetic */ void OiIIX101O(MicrosoftSDKManage r0, Object r1, SessionEventArgs r2) {
        IX0iIX(r0, r1, r2);
    }

    public static final void X00Xi1X(MicrosoftSDKManage r1, Object r2, SpeechSynthesisEventArgs r3) {
        Intrinsics.X0O(r3, "e");
        i1O0OXO1O.OXO1.OXO1(r1.OXO1 + " Synthesis started..");
        r3.close();
    }

    public static final /* synthetic */ Object X01IiOiIi(MicrosoftSDKManage r0) {
        return r0.iX;
    }

    public static final void X0I1(MicrosoftSDKManage r2, Void r3) {
        i1O0OXO1O.OXO1.OXO1(r2.OXO1 + " Continuous recognition stopped");
        r2.XXX11i();
        iO r4 = r2.O10IXXX0X;
        if (r4 == null) goto L6;
        r4.onStopTransmission();
        return;
    }

    public static /* synthetic */ void X0O(MicrosoftSDKManage r0, Object r1, SpeechSynthesisEventArgs r2) {
        IO0II0i(r0, r1, r2);
    }

    public static final void X1(Object r0, SpeechSynthesisEventArgs r1) {
        Intrinsics.X0O(r1, "e");
        r1.close();
    }

    public static /* synthetic */ void X11iII1O1(MicrosoftSDKManage r0, String r1, String r2, LeftAndRightPlayControl r3, int r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = r0.OII;
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = -1;
    L8:
        r0.iX1O1(r1, r2, r3, r4);
    }

    public static /* synthetic */ void X1OI(MicrosoftSDKManage r2, String r3, boolean r4, String r5, String r6, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = "zh-CN";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = false;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = "zh-CN-XiaomoNeural";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = "zh-CN";
    L15:
        if ((r8 & 16) == 0) goto L17;
        r7 = false;
    L17:
        r2.iIX0i(r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ Object X1ii(Future r0, XO0O10 r1) {
        return iii0(r0, r1);
    }

    public static final void XIIO11I(MicrosoftSDKManage r3, Object r4, SpeechRecognitionEventArgs r5) {
        Intrinsics.X0O(r5, "speechRecognitionResultEventArgs");
        String r6 = r5.getResult().getText();
        r3.X1ii.add(r6);
        r3.XXI.clear();
        i1O0OXO1O r7 = i1O0OXO1O.OXO1;
        String r0 = r3.OXO1;
        if (r3.O10IXXX0X == null) goto L5;
        boolean r1 = true;
    L6:
        r7.OXO1(r0 + "  Final result received:  -> " + r6 + " ,  mSpeechCallback = " + r1);
        iO r8 = r3.O10IXXX0X;
        if (r8 == null) goto L10;
        String r9 = TextUtils.join(" ", r3.X1ii);
        Intrinsics.O10IXXX0X(r9, "join(...)");
        r8.onIdentifyResults(2, r9);
        return;
    L10:
        return;
    L5:
        r1 = false;
        goto L6
    }

    public static /* synthetic */ void XIi00iiXO(MicrosoftSDKManage r0, SpeechRecognitionResult r1) {
        iOX(r0, r1);
    }

    public static /* synthetic */ void XO0O10(MicrosoftSDKManage r0, Object r1, ConnectionEventArgs r2) {
        IOIi00(r0, r1, r2);
    }

    public static final Unit XOO0XOOii(MicrosoftSDKManage r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        if (r2 != PermissionStatus.GRANTED) goto L6;
        r1.XIO11I();
        r1.IXiOXO();
    L6:
        return Unit.OXO1;
    }

    public static /* synthetic */ void XOO0ii0(MicrosoftSDKManage r0, Object r1, SpeechSynthesisWordBoundaryEventArgs r2) {
        Ii0i(r0, r1, r2);
    }

    public static /* synthetic */ void XOXiX0(MicrosoftSDKManage r0, iO r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.XOIX(r1);
    }

    public static /* synthetic */ void XX0(MicrosoftSDKManage r0, Object r1, SpeechRecognitionEventArgs r2) {
        XXI0XOIX(r0, r1, r2);
    }

    public static /* synthetic */ void XXI(MicrosoftSDKManage r0, Void r1) {
        X0I1(r0, r1);
    }

    public static final void XXI0XOIX(MicrosoftSDKManage r3, Object r4, SpeechRecognitionEventArgs r5) {
        Intrinsics.X0O(r5, "speechRecognitionResultEventArgs");
        r3.XXI.add(r5.getResult().getText());
        i1O0OXO1O.OXO1.OXO1(r3.OXO1 + " Intermediate result received:  ---> " + TextUtils.join(" ", r3.XXI));
        iO r6 = r3.O10IXXX0X;
        if (r6 == null) goto L5;
        r6.onIdentifyResults(1, TextUtils.join(" ", r3.X1ii) + TextUtils.join(" ", r3.XXI));
    L5:
        ArrayList<String> r7 = r3.XXI;
        r7.remove(r7.size() - 1);
    }

    public static final void XXOXi(MicrosoftSDKManage r0, Void r1) {
        iO r2 = r0.O10IXXX0X;
        if (r2 == null) goto L6;
        r2.onStartTransmission();
        return;
    }

    public static final void XXiIiX10(MicrosoftSDKManage r0, Object r1, ConnectionEventArgs r2) {
        r0.I1XOi1 = false;
        i1O0OXO1O.OXO1.OXO1(r0.OXO1 + " Disconnected..");
    }

    public static /* synthetic */ void XiOIO(MicrosoftSDKManage r0, Object r1, SpeechRecognitionEventArgs r2) {
        O1(r0, r1, r2);
    }

    public static final /* synthetic */ AudioTrack XiOIii1(MicrosoftSDKManage r0) {
        return r0.i010I;
    }

    public static final /* synthetic */ String i010I(MicrosoftSDKManage r0) {
        return r0.OXO1;
    }

    public static /* synthetic */ void i100IXOX(MicrosoftSDKManage r0, iO r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = "";
    L5:
        r0.iIi1(r1, r2);
    }

    public static /* synthetic */ void iI(MicrosoftSDKManage r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = r0.OII;
    L5:
        r0.XXIIO1i11(r1, r2);
    }

    public static /* synthetic */ void iIi0(MicrosoftSDKManage r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.I0(r1);
    }

    public static /* synthetic */ void iIiiO(MicrosoftSDKManage r0, Object r1, SpeechRecognitionEventArgs r2) {
        O1iXiI(r0, r1, r2);
    }

    public static /* synthetic */ void iO(MicrosoftSDKManage r0, Object r1, ConnectionEventArgs r2) {
        XXiIiX10(r0, r1, r2);
    }

    public static final /* synthetic */ void iOO1ii1(MicrosoftSDKManage r0, boolean r1) {
        r0.IXXOO = r1;
    }

    public static final /* synthetic */ boolean iOOX010X(MicrosoftSDKManage r0) {
        return r0.IXXOO;
    }

    public static final void iOX(MicrosoftSDKManage r12, SpeechRecognitionResult r13) {
        Intrinsics.X0O(r13, "result");
        String r0 = r13.getText();
        q62 r1 = q62.OXO1;
        if (q62.OiO0IOX(r1, null, 1, null) == true) goto L5;
    L7:
        i1O0OXO1O r4 = i1O0OXO1O.OXO1;
        r4.OXO1(r12.OXO1 + " setOnTaskCompletedListener  result: ---> " + r0);
        if (r13.getReason() == ResultReason.RecognizedSpeech) goto L24;
        ResultReason r2 = r13.getReason();
        ResultReason r5 = ResultReason.Canceled;
        if (r2 != r5) goto L12;
        String r3 = CancellationDetails.fromResult(r13).getErrorDetails();
    L13:
        String r6 = "Recognition failed with " + r13.getReason() + ". Did you enter your subscription?" + System.lineSeparator() + r3;
        r4.OXO1(r12.OXO1 + " setOnTaskCompletedListener error : ---> " + r6);
        if (r13.getReason() != r5) goto L18;
        iO r14 = r12.O10IXXX0X;
        if (r14 == null) goto L27;
        r14.onIdentifyResults(2, "");
    L27:
        r12.X0i1O();
        return;
    L18:
        iO r15 = r12.O10IXXX0X;
        if (r15 == null) goto L22;
        r15.onIdentifyResults(2, "");
    L22:
        if (q62.OiO0IOX(r1, null, 1, null) == false) goto L27;
        iI(r12, UtilsKt.XXO(R.string.speech_recognition_error), null, 2, null);
        goto L27
    L12:
        r3 = "";
        goto L13
    L24:
        iO r16 = r12.O10IXXX0X;
        if (r16 == null) goto L27;
        Intrinsics.XXI(r0);
        r16.onIdentifyResults(2, r0);
        goto L27
    L5:
        if (r12.XiOIO == true) goto L7;
        DcsTtsPlayer.playAssetsFile$default(DcsTtsPlayer.INSTANCE, "voice_end_cycle_audio.mp3", true, null, 4, null);
        goto L7
    }

    public static final /* synthetic */ void iX(MicrosoftSDKManage r0) {
        XXIIO1i11 = r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iiII(MicrosoftSDKManage r2, String r3, boolean r4, String r5, String r6, boolean r7, String r8, List r9, boolean r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = "zh-CN";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = false;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = "zh-CN-XiaomoNeural";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = "zh-CN";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r9 = CollectionsKt__CollectionsKt.iXiX011(new String[]{"zh-CN", "en-US"});
    L24:
        if ((r11 & 128) == 0) goto L26;
        r10 = true;
    L26:
        r2.Xii(r3, r4, r5, r6, r7, r8, r9, r10);
    }

    public static final Object iii0(Future r0, XO0O10 r1) {
        r1.OXO1(r0.get());
        return null;
    }

    public final void I0(boolean r4) {
        this.I1 = 0;
        if (this.OIX0iXi != null) goto L5;
        X11I();
    L5:
        this.X1ii.clear();
        XIO11I();
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " startContinuousRecognitionAsync");
        if (this.I0iXXO != null) goto L8;
        I0XXi0X(r4);
    L8:
        SpeechRecognizer r5 = this.I0iXXO;
        Intrinsics.XXI(r5);
        Future<Void> r6 = r5.startContinuousRecognitionAsync();
        Intrinsics.XXI(r6);
        Xi1i0XOX0(r6, new xq0(this));
    }

    public final void I0XXi0X(boolean r9) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.OXO1 + "  isAutoEnd: " + this.OiIIX101O + "  ");
        BleDeviceInfo r1 = BleCache.INSTANCE.getMDeviceInfo();
        if (r1 == null) goto L5;
        String r2 = r1.getMPrototype();
    L6:
        LogUtils.d(new Object[]{r2});
        if (this.I0iXXO != null) goto L9;
        boolean r3 = true;
    L10:
        LogUtils.d(new Object[]{String.valueOf(r3)});
        if (this.I0iXXO != null) goto L20;
        r0.OXO1(this.OXO1 + " build reco");
        r0.OXO1(this.OXO1 + " languageList: " + this.OX + " ");
        List<String> r4 = this.OX;
        if (r4 != null) goto L15;
        r4 = CollectionsKt__CollectionsKt.iXiX011(new String[]{"zh-CN", "ja-JP"});
    L15:
        AutoDetectSourceLanguageConfig r5 = AutoDetectSourceLanguageConfig.fromLanguages(r4);
        r0.OXO1(this.OXO1 + " languageList: " + this.OX + " ");
        if (r9 == false) goto L18;
        r0.OXO1(this.OXO1 + " isMoreLanguage: " + r9 + " ");
        this.I0iXXO = new SpeechRecognizer(this.XOO0ii0, r5, this.OIX0iXi);
    L19:
        SpeechRecognizer r10 = this.I0iXXO;
        Intrinsics.XXI(r10);
        r10.recognizing.addEventListener(new pq0(this));
        SpeechRecognizer r11 = this.I0iXXO;
        Intrinsics.XXI(r11);
        r11.recognized.addEventListener(new qq0(this));
        SpeechRecognizer r12 = this.I0iXXO;
        Intrinsics.XXI(r12);
        r12.canceled.addEventListener(new rq0(this));
        SpeechRecognizer r13 = this.I0iXXO;
        Intrinsics.XXI(r13);
        r13.sessionStarted.addEventListener(new sq0(this));
        SpeechRecognizer r14 = this.I0iXXO;
        Intrinsics.XXI(r14);
        r14.sessionStopped.addEventListener(new tq0(this));
        goto L20
    L18:
        this.I0iXXO = new SpeechRecognizer(this.XOO0ii0, this.XiOIii1, this.OIX0iXi);
    L20:
        Connection r15 = Connection.fromRecognizer(this.I0iXXO);
        this.X0O = r15;
        if (r15 == null) goto L25;
        EventHandlerImpl<ConnectionEventArgs> r16 = r15.connected;
        if (r16 == null) goto L25;
        r16.addEventListener(new uq0(this));
    L25:
        Connection r17 = this.X0O;
        if (r17 == null) goto L30;
        EventHandlerImpl<ConnectionEventArgs> r18 = r17.disconnected;
        if (r18 == null) goto L30;
        r18.addEventListener(new vq0(this));
    L30:
        Connection r19 = this.X0O;
        if (r19 == null) goto L34;
        r19.openConnection(true);
        return;
    L34:
        return;
    L9:
        r3 = false;
        goto L10
    L5:
        r2 = null;
        goto L6
    }

    public final void I0i0() {
        SpeechRecognizer r0 = this.I0iXXO;
        if (r0 == null) goto L5;
        r0.stopContinuousRecognitionAsync();
    L5:
        SpeechRecognizer r1 = this.I0iXXO;
        if (r1 == null) goto L8;
        r1.close();
    L8:
        this.I0iXXO = null;
    }

    public final void IO0iXO0O(@aa1 String r4) {
        Intrinsics.X0O(r4, "ttsName");
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " setAudioTTSName ttsVoiceName = " + r4);
        this.OII = r4;
    }

    public final void IX0IXOi(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.XiOIii1 = r2;
    }

    public final void IX1XiI() {
    }

    public final void IXI() {
        Connection r0 = this.X01IiOiIi;
        if (r0 != null) goto L6;
        i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " Please initialize the speech synthesizer first.");
        return;
    L6:
        Intrinsics.XXI(r0);
        r0.openConnection(true);
    }

    public final void IXiOXO() {
        if (this.OiIIX101O == false) goto L10;
        SpeechRecognizer r0 = new SpeechRecognizer(this.XOO0ii0, this.XiOIii1, this.OIX0iXi);
        this.I0iXXO = r0;
        Intrinsics.XXI(r0);
        Future<SpeechRecognitionResult> r1 = r0.recognizeOnceAsync();
        iO r2 = this.O10IXXX0X;
        if (r2 == null) goto L7;
        r2.onStartTransmission();
    L7:
        Intrinsics.XXI(r1);
        Xi1i0XOX0(r1, new nq0(this));
        return;
    L10:
        if (this.OIX0iXi != null) goto L12;
        X11I();
    L12:
        BleDeviceInfo r3 = BleCache.INSTANCE.getMDeviceInfo();
        if (r3 == null) goto L15;
        String r4 = r3.getMPrototype();
    L16:
        LogUtils.d(new Object[]{r4});
        if (this.I0iXXO != null) goto L19;
        boolean r5 = true;
    L20:
        LogUtils.d(new Object[]{String.valueOf(r5)});
        if (q62.OiO0IOX(q62.OXO1, null, 1, null) == false) goto L23;
    L24:
        SpeechRecognizer r6 = new SpeechRecognizer(this.XOO0ii0, this.XiOIii1, this.OIX0iXi);
        this.I0iXXO = r6;
        Intrinsics.XXI(r6);
        r6.recognizing.addEventListener(new yq0(this));
        SpeechRecognizer r7 = this.I0iXXO;
        Intrinsics.XXI(r7);
        r7.recognized.addEventListener(new br0(this));
    L25:
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " startContinuousRecognitionAsync");
        SpeechRecognizer r8 = this.I0iXXO;
        Intrinsics.XXI(r8);
        Future<Void> r9 = r8.startContinuousRecognitionAsync();
        Intrinsics.XXI(r9);
        Xi1i0XOX0(r9, new cr0(this));
        return;
    L23:
        if (this.I0iXXO != null) goto L25;
    L19:
        r5 = false;
        goto L20
    L15:
        r4 = null;
        goto L16
    }

    @tb1
    public final AudioRecord Ii1iii0() {
        return this.IiI10X;
    }

    public final void IiiXiI0I() {
        Connection r0 = this.X0O;
        if (r0 != null) goto L6;
        i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " Please initialize SpeechRecognizer.");
        return;
    L6:
        if (r0 == null) goto L9;
        r0.openConnection(true);
        return;
    }

    @aa1
    public final Handler O001I() {
        return this.iIiiO;
    }

    public final void O0O(boolean r1) {
        this.XX0 = r1;
    }

    public final void O0O0X0iOi(int r1) {
        this.I1 = r1;
    }

    public final void OI(@aa1 String r9, @aa1 String r10, @tb1 final Function1<? super String, Unit> r11) {
        Intrinsics.X0O(r9, "text");
        Intrinsics.X0O(r10, ToTranslatorText.FLAG_TRANSLATION_LANGUAGE);
        final Activity r3 = null;
        StatManager.iO(StatManager.OXO1, 9, null, 2, null);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getTranslatorTextBody(r9, r10);
        final O1XIiIO<AITranslatorText> r13 = new MicrosoftSDKManage$toTranslatorText$1(r11, this);
        Map<String, String> r14 = r0.getHeadersMap();
        final uq r1 = r0.loadPopup(null, null);
        String r2 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ToTranslatorText.URL);
        String r5 = r2 + ToTranslatorText.URL;
        Map<String, ? extends Object> r6 = kotlin.collections.OXO1.X111IO(r12);
        r6.putAll(r14);
        Unit r7 = Unit.OXO1;
        r0.printParam(r5, r6);
        NetWork r4 = NetWork.OXO1;
        String r8 = r2 + ToTranslatorText.URL;
        final O1XIiIO<Response<AITranslatorText>> r15 = new MicrosoftSDKManage$toTranslatorText$$inlined$postV2$default$1(r3, r13, r1);
        AndroidNetworking.post(r8).addHeaders(r14).addBodyParameter(r12).setTag(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AITranslatorText.class}), new MicrosoftSDKManage$toTranslatorText$$inlined$postV2$default$2(r15));
    }

    public final void OO() {
        O00 r0 = new O00(1048576);
        this.OIi0 = r0;
        Intrinsics.XXI(r0);
        r0.IiI10X();
        OXO1 r1 = this.IO;
        if (r1 == null) goto L6;
        O00 r2 = this.OIi0;
        Intrinsics.XXI(r2);
        r1.OXO1(r2);
        return;
    }

    public final void OX110i() {
        boolean r2 = true;
        if (this.XOO0ii0 != null) goto L11;
        this.XOO0ii0 = SpeechConfig.fromSubscription(this.XIi00iiXO, this.iO);     // Catch: Exception -> L8
        if (this.I0IIOi != null) goto L10;
        this.I0IIOi = Executors.newSingleThreadExecutor();     // Catch: Exception -> L8
    L10:
        X11I();     // Catch: Exception -> L8
        XO0X10iO();     // Catch: Exception -> L8
        IXI();     // Catch: Exception -> L8
        this.O00 = AudioStreamFormat.getWaveFormatPCM(this.XO0O10, 16, 1);     // Catch: Exception -> L8
    L11:
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;     // Catch: Exception -> L8
        String r3 = this.OXO1;     // Catch: Exception -> L8
        if (this.XOO0ii0 != null) goto L15;
        r2 = false;
    L15:
        r1.OXO1(r3 + " init sdk speechConfig = " + r2 + " ");     // Catch: Exception -> L8
        return;
    L8:
        e = move-exception;
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " init sdk speechConfig = " + e.getMessage());
    }

    public final void Oi(@aa1 byte[] r8) {
        Intrinsics.X0O(r8, "bytes");
        O00 r1 = this.OIi0;
        if (r1 == null) goto L6;
        O00.I0IIOi(r1, r8, 0, 0, 6, null);
        return;
    }

    public final void X00O0(boolean r1) {
        this.IIX1OXO = r1;
    }

    public final boolean X00XIX1() {
        return this.XX0;
    }

    public final void X0i1O() {
        SpeechRecognizer r0 = this.I0iXXO;
        if (r0 == null) goto L5;
        r0.close();
    L5:
        XOIO11O();
        RecordingManager.Companion.getInstance().closeBluetooth();
        iO r1 = this.O10IXXX0X;
        if (r1 == null) goto L8;
        r1.onStopTransmission();
    L8:
        this.OIX0iXi = null;
    }

    public final void X0iO(@tb1 AudioRecord r1) {
        this.IiI10X = r1;
    }

    public final void X100O() {
        if (this.i010I != null) goto L6;
        this.i010I = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(ErrorCode.ERROR_TTS_INVALID_PARA).setChannelMask(12).build(), AudioTrack.getMinBufferSize(ErrorCode.ERROR_TTS_INVALID_PARA, 12, 2) * 2, 1, 0);
        return;
    }

    public final void X111IO(@tb1 ExecutorService r1) {
        this.I0IIOi = r1;
    }

    public final void X11I() {
        if (this.IO != null) goto L6;
        this.IO = new OXO1();
    L6:
        if (this.OIX0iXi != null) goto L9;
        this.OIX0iXi = AudioConfig.fromStreamInput(this.IO);
        return;
    }

    public final void X1IX() {
        SpeechRecognizer r0 = this.I0iXXO;
        if (r0 == null) goto L5;
        r0.close();
    L5:
        iX01();
        this.I0iXXO = null;
    }

    @SuppressLint({"MissingPermission"})
    public final void XIO11I() {
        q62.OiO0IOX(q62.OXO1, null, 1, null);
        RecordingManager.Companion r0 = RecordingManager.Companion;
        r0.getInstance().setRecording(true);
        int r9 = AudioRecord.getMinBufferSize(this.XO0O10, 16, 2);
        this.IiI10X = new AudioRecord(0, this.XO0O10, 16, 2, r9);
        r0.getInstance().setStartBluetooth();
        AudioRecord r1 = this.IiI10X;
        if (r1 == null) goto L6;
        r1.startRecording();
        return;
    }

    public final void XO0X10iO() {
        if (this.iOOX010X == null) goto L10;
        SpeechConfig r0 = this.XOO0ii0;
        Intrinsics.XXI(r0);
        r0.close();
        Connection r1 = this.X01IiOiIi;
        if (r1 == null) goto L7;
        r1.close();
    L7:
        SpeechSynthesizer r2 = this.iOOX010X;
        if (r2 == null) goto L10;
        r2.close();
    L10:
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " Initializing synthesizer...");
        if (this.XOO0ii0 != null) goto L14;
        this.XOO0ii0 = SpeechConfig.fromSubscription(this.XIi00iiXO, this.iO);
    L14:
        if (this.II1Xi0 != null) goto L16;
        this.II1Xi0 = new XOO0ii0();
    L16:
        X100O();
        SpeechConfig r3 = this.XOO0ii0;
        if (r3 == null) goto L19;
        r3.setSpeechSynthesisOutputFormat(SpeechSynthesisOutputFormat.Raw24Khz16BitMonoPcm);
    L19:
        SpeechConfig r4 = this.XOO0ii0;
        if (r4 == null) goto L22;
        r4.setProperty(PropertyId.SpeechServiceConnection_LanguageIdMode, "Continuous");
    L22:
        SpeechSynthesizer r5 = new SpeechSynthesizer(this.XOO0ii0, null);
        this.iOOX010X = r5;
        Connection r6 = Connection.fromSpeechSynthesizer(r5);
        this.X01IiOiIi = r6;
        if (r6 == null) goto L27;
        EventHandlerImpl<ConnectionEventArgs> r7 = r6.connected;
        if (r7 == null) goto L27;
        r7.addEventListener(new dr0(this));
    L27:
        Connection r8 = this.X01IiOiIi;
        if (r8 == null) goto L32;
        EventHandlerImpl<ConnectionEventArgs> r9 = r8.disconnected;
        if (r9 == null) goto L32;
        r9.addEventListener(new er0(this));
    L32:
        SpeechSynthesizer r10 = this.iOOX010X;
        if (r10 == null) goto L37;
        EventHandlerImpl<SpeechSynthesisEventArgs> r11 = r10.SynthesisStarted;
        if (r11 == null) goto L37;
        r11.addEventListener(new fr0(this));
    L37:
        SpeechSynthesizer r12 = this.iOOX010X;
        if (r12 == null) goto L42;
        EventHandlerImpl<SpeechSynthesisEventArgs> r13 = r12.Synthesizing;
        if (r13 == null) goto L42;
        r13.addEventListener(new gr0());
    L42:
        SpeechSynthesizer r14 = this.iOOX010X;
        if (r14 == null) goto L47;
        EventHandlerImpl<SpeechSynthesisEventArgs> r15 = r14.SynthesisCompleted;
        if (r15 == null) goto L47;
        r15.addEventListener(new hr0(this));
    L47:
        SpeechSynthesizer r16 = this.iOOX010X;
        if (r16 == null) goto L52;
        EventHandlerImpl<SpeechSynthesisEventArgs> r17 = r16.SynthesisCanceled;
        if (r17 == null) goto L52;
        r17.addEventListener(new ir0(this));
    L52:
        SpeechSynthesizer r18 = this.iOOX010X;
        if (r18 == null) goto L58;
        EventHandlerImpl<SpeechSynthesisWordBoundaryEventArgs> r19 = r18.WordBoundary;
        if (r19 == null) goto L59;
        r19.addEventListener(new oq0(this));
        return;
    L59:
        return;
    }

    public final void XOIO11O() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        String r1 = this.OXO1;
        if (this.IiI10X != null) goto L5;
        boolean r2 = true;
    L6:
        r0.OXO1(r1 + " stopAudio recorder.isNull = " + r2);
        if (this.IiI10X == null) goto L20;
        RecordingManager.Companion.getInstance().setRecording(false);     // Catch: Exception -> L17
        AudioRecord r3 = this.IiI10X;     // Catch: Exception -> L17
        if (r3 == null) goto L12;
        r3.stop();     // Catch: Exception -> L17
    L12:
        AudioRecord r4 = this.IiI10X;     // Catch: Exception -> L17
        if (r4 == null) goto L15;
        r4.release();     // Catch: Exception -> L17
    L15:
        this.IiI10X = null;     // Catch: Exception -> L17
        return;
    L20:
        return;
    L21:
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void XOIX(@tb1 iO r4) {
        if (r4 == null) goto L4;
        i100IXOX(this, r4, null, 2, null);
    L4:
        PermissionUtils r5 = PermissionUtils.permission(new String[]{PermissionConstants.MICROPHONE, "android.permission.MODIFY_AUDIO_SETTINGS"});
        Intrinsics.O10IXXX0X(r5, "permission(...)");
        ds1.XIi00iiXO(r5, UtilsKt.XXO(R.string.microphone_explain_title), UtilsKt.XXO(R.string.microphone_explain_content), new ar0(this));
    }

    public final boolean XOX0O0() {
        return this.OiIIX101O;
    }

    public final void XX00i10X(boolean r1) {
        this.OiIIX101O = r1;
    }

    public final void XX1Oi() {
        XXIIO1i11 = new MicrosoftSDKManage();
        this.XOO0ii0 = null;
        this.OIX0iXi = null;
        this.O10IXXX0X = null;
        a01.OXO1.OXO1().remove(ExternalKeyManager.class.getName());
        VoiceManager r0 = VoiceManager.INSTANCE;
        r0.sendTranslationResultInput(UtilsKt.XXO(R.string.fail));
        r0.sendTranslationResultOutput(UtilsKt.XXO(R.string.microsoft_sdk_unbind_tip));
    }

    public final void XXIIO1i11(@aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r5, "text");
        Intrinsics.X0O(r6, "ttsName");
        if (this.XIi00iiXO.length() != 0) goto L6;
    L7:
        a01.OXO1.OXO1().remove(ExternalKeyManager.class.getName());
        ToastUtils.showLong(R.string.microsoft_sdk_unbind_tip);
        VoiceManager r7 = VoiceManager.INSTANCE;
        r7.sendTranslationResultInput(UtilsKt.XXO(R.string.fail));
        r7.sendTranslationResultOutput(UtilsKt.XXO(R.string.microsoft_sdk_unbind_tip));
        return;
    L6:
        if (this.XOO0ii0 == null) goto L7;
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.OXO1 + " audioSpeech ttsVoiceName = " + r6);
        this.OII = r6;
        DcsTtsPlayer r1 = DcsTtsPlayer.INSTANCE;
        r1.stop();
        if (this.X01IiOiIi != null) goto L14;
        r0.XIi00iiXO(this.OXO1 + " Please initialize the speech synthesizer first.");
        return;
    L14:
        if (this.I1XOi1 == true) goto L17;
        IXI();
    L17:
        if (r1.getMTtsFile().exists() == false) goto L38;
        r1.getMTtsFile().delete();
    L38:
        this.X01IiOiIi = Connection.fromSpeechSynthesizer(this.iOOX010X);     // Catch: Exception -> L36
        String r2 = this.OXO1;     // Catch: Exception -> L36
        if (this.II1Xi0 != null) goto L22;
        boolean r3 = true;
    L23:
        r0.OXO1(r2 + " audioSpeech text = " + r5 + " " + r3);     // Catch: Exception -> L36
        XOO0ii0 r4 = this.II1Xi0;     // Catch: Exception -> L36
        if (r4 == null) goto L26;
        r4.XIi00iiXO(r6);     // Catch: Exception -> L36
    L26:
        XOO0ii0 r8 = this.II1Xi0;     // Catch: Exception -> L36
        if (r8 == null) goto L29;
        r8.O00(LeftAndRightPlayControl.LEFT_AND_RIGHT);     // Catch: Exception -> L36
    L29:
        XOO0ii0 r9 = this.II1Xi0;     // Catch: Exception -> L36
        if (r9 == null) goto L32;
        r9.XO0O10(xp5.iO(r5));     // Catch: Exception -> L36
    L32:
        ExecutorService r10 = this.I0IIOi;     // Catch: Exception -> L36
        if (r10 == null) goto L40;
        r10.execute(this.II1Xi0);     // Catch: Exception -> L36
        return;
    L40:
        return;
    L22:
        r3 = false;
    L36:
        iX01();
    }

    @aa1
    public final String XXO() {
        return this.XiOIii1;
    }

    public final void XXX11i() {
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " closeAudioInputStream");
        O00 r0 = this.OIi0;
        if (r0 == null) goto L5;
        r0.OXO1();
    L5:
        this.OIi0 = null;
        OXO1 r1 = this.IO;
        if (r1 == null) goto L9;
        r1.close();
        return;
    }

    public final void XXiO0i(boolean r1) {
        this.XiOIO = r1;
    }

    public final void Xi() {
        if (this.I0iXXO == null) goto L6;
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " stopAudioStreamInput stopped");
        SpeechRecognizer r0 = this.I0iXXO;
        Intrinsics.XXI(r0);
        Future<Void> r1 = r0.stopContinuousRecognitionAsync();
        Intrinsics.XXI(r1);
        Xi1i0XOX0(r1, new wq0(this));
        return;
    }

    public final <T> void Xi1i0XOX0(final Future<T> r3, final XO0O10<T> r4) {
        ExecutorService r0 = this.I0IIOi;
        if (r0 == null) goto L6;
        r0.submit(new zq0(r3, r4));
        return;
    }

    public final void Xii(@aa1 String r7, boolean r8, @aa1 String r9, @aa1 String r10, boolean r11, @aa1 String r12, @aa1 List<String> r13, boolean r14) {
        Intrinsics.X0O(r7, "mLanguage");
        Intrinsics.X0O(r9, "ttsName");
        Intrinsics.X0O(r10, "ttsLanguage");
        Intrinsics.X0O(r12, "name");
        Intrinsics.X0O(r13, "languages");
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;
        r1.OXO1(this.OXO1 + "  startAudioStreamInput name=" + r12 + "  mLanguage: ---> " + r7 + " , phoneRecord = " + r8 + " , ttsName = " + r9 + " , ttsLanguage = " + r10);
    L8:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + "  e = " + e + "  ");
        return;
    L4:
        if (this.XIi00iiXO.length() != 0) goto L12;
        String r15 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);     // Catch: Exception -> L8
        if (r15.length() <= 0) goto L10;
        iI0I(r15);     // Catch: Exception -> L8
        goto L12
    L10:
        a01.OXO1.OXO1().remove(ExternalKeyManager.class.getName());     // Catch: Exception -> L8
        VoiceManager r16 = VoiceManager.INSTANCE;     // Catch: Exception -> L8
        r16.sendTranslationResultInput(UtilsKt.XXO(R.string.fail));     // Catch: Exception -> L8
        r16.sendTranslationResultOutput(UtilsKt.XXO(R.string.microsoft_sdk_unbind_tip));     // Catch: Exception -> L8
        return;
    L12:
        iX01();     // Catch: Exception -> L8
        DcsTtsPlayer.INSTANCE.stop();     // Catch: Exception -> L8
        String r17 = this.OXO1;     // Catch: Exception -> L8
        String r18 = this.XiOIii1;     // Catch: Exception -> L8
        boolean r3 = false;
        if (this.I0iXXO != null) goto L15;
        boolean r2 = true;
    L16:
        r1.OXO1(r17 + "  startAudioStreamInput  Language: ---> " + r18 + " , reco = " + r2);     // Catch: Exception -> L8
        this.I0iXXO = null;     // Catch: Exception -> L8
        this.OX = r13;     // Catch: Exception -> L8
        this.XiOIii1 = r7;     // Catch: Exception -> L8
        this.OII = r9;     // Catch: Exception -> L8
        X11I();     // Catch: Exception -> L8
        this.XX0 = r8;     // Catch: Exception -> L8
        this.OiIIX101O = r11;     // Catch: Exception -> L8
        FileUtils.delete(VoiceManager.INSTANCE.getMPcmFile());     // Catch: Exception -> L8
        this.X1ii.clear();     // Catch: Exception -> L8
        String r19 = this.OXO1;     // Catch: Exception -> L8
        String r20 = this.XiOIii1;     // Catch: Exception -> L8
        if (this.I0iXXO != null) goto L19;
        r3 = true;
    L19:
        r1.OXO1(r19 + " startAudioStreamInput  Language: ---> " + r20 + " , reco = " + r3);     // Catch: Exception -> L8
        if (r14 == true) goto L24;
        SpeechConfig r21 = this.XOO0ii0;     // Catch: Exception -> L8
        if (r21 == null) goto L24;
        r21.setSpeechRecognitionLanguage(this.XiOIii1);     // Catch: Exception -> L8
    L24:
        r1.OXO1(this.OXO1 + " speechRecognitionLanguage");     // Catch: Exception -> L8
        I0XXi0X(r14);     // Catch: Exception -> L8
        StatManager.iO(StatManager.OXO1, 8, null, 2, null);     // Catch: Exception -> L8
        return;
    L15:
        r2 = false;
        goto L16
    }

    public final void Xii11I(boolean r1) {
        this.I1XOi1 = r1;
    }

    public final boolean i0X000X0O() {
        return this.I1XOi1;
    }

    public final boolean i11I() {
        return this.IIX1OXO;
    }

    public final void iI0I(@aa1 String r2) {
        Intrinsics.X0O(r2, "key");
        this.XIi00iiXO = r2;
        VoiceManager.INSTANCE.initMicrosoftSDKManage();
    }

    public final void iIX0i(@aa1 String r4, boolean r5, @aa1 String r6, @aa1 String r7, boolean r8) {
        Intrinsics.X0O(r4, "mLanguage");
        Intrinsics.X0O(r6, "ttsName");
        Intrinsics.X0O(r7, "ttsLanguage");
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.OXO1 + "  startAudioStreamInput  mLanguage: ---> " + r4 + " , phoneRecord = " + r5 + " , ttsName = " + r6 + " , ttsLanguage = " + r7);
    L8:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + "  e = " + e + "  ");
        return;
    L4:
        if (this.XIi00iiXO.length() != 0) goto L12;
        String r9 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);     // Catch: Exception -> L8
        if (r9.length() <= 0) goto L10;
        iI0I(r9);     // Catch: Exception -> L8
        goto L12
    L10:
        a01.OXO1.OXO1().remove(ExternalKeyManager.class.getName());     // Catch: Exception -> L8
        VoiceManager r10 = VoiceManager.INSTANCE;     // Catch: Exception -> L8
        r10.sendTranslationResultInput(UtilsKt.XXO(R.string.fail));     // Catch: Exception -> L8
        r10.sendTranslationResultOutput(UtilsKt.XXO(R.string.microsoft_sdk_unbind_tip));     // Catch: Exception -> L8
        return;
    L12:
        iX01();     // Catch: Exception -> L8
        DcsTtsPlayer.INSTANCE.stop();     // Catch: Exception -> L8
        if (this.I0iXXO != null) goto L15;
    L17:
        this.XiOIii1 = r4;     // Catch: Exception -> L8
        this.OII = r6;     // Catch: Exception -> L8
        X11I();     // Catch: Exception -> L8
        this.XX0 = r5;     // Catch: Exception -> L8
        this.OiIIX101O = r8;     // Catch: Exception -> L8
        this.X1ii.clear();     // Catch: Exception -> L8
        String r11 = this.OXO1;     // Catch: Exception -> L8
        String r12 = this.XiOIii1;     // Catch: Exception -> L8
        if (this.I0iXXO != null) goto L20;
        boolean r13 = true;
    L21:
        r0.OXO1(r11 + " startAudioStreamInput  Language: ---> " + r12 + " , reco = " + r13);     // Catch: Exception -> L8
        SpeechConfig r14 = this.XOO0ii0;     // Catch: Exception -> L8
        if (r14 == null) goto L24;
        r14.setSpeechRecognitionLanguage(this.XiOIii1);     // Catch: Exception -> L8
    L24:
        StatManager.iO(StatManager.OXO1, 8, null, 2, null);     // Catch: Exception -> L8
        if (this.XX0 == false) goto L28;
        XOXiX0(this, null, 1, null);     // Catch: Exception -> L8
        return;
    L28:
        OO();     // Catch: Exception -> L8
        IXiOXO();     // Catch: Exception -> L8
        return;
    L20:
        r13 = false;
        goto L21
    L15:
        if (Intrinsics.XOO0ii0(this.XiOIii1, r4) == true) goto L17;
        this.I0iXXO = null;     // Catch: Exception -> L8
        goto L17
    }

    public final int iIXi1iiXI() {
        return this.I1;
    }

    public final void iIi1(@aa1 iO r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "callback");
        Intrinsics.X0O(r5, "name");
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " setSpeechCallback name=" + r5);
        this.O10IXXX0X = r4;
    }

    public final void iOI(@tb1 List<String> r1) {
        this.OX = r1;
    }

    public final boolean iOiXi11II() {
        return this.XiOIO;
    }

    public final void iX01() {
    L9:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " stopSynthesizing Exception e = " + e);
        return;
    L3:
        if (this.iOOX010X == null) goto L12;
        if (XXIIO1i11.iOO1ii1 == true) goto L12;
        SpeechSynthesizer r0 = this.iOOX010X;     // Catch: Exception -> L9
        if (r0 == null) goto L12;
        r0.StopSpeakingAsync();     // Catch: Exception -> L9
    L12:
        if (this.i010I == null) goto L33;
        Object r1 = this.iX;     // Catch: Exception -> L9
        monitor-enter(r1);     // Catch: Exception -> L9
        this.IXXOO = true;     // Catch: Throwable -> L25
        Unit r2 = Unit.OXO1;     // Catch: Throwable -> L25
        monitor-exit(r1);     // Catch: Exception -> L9
        AudioTrack r3 = this.i010I;     // Catch: Exception -> L9
        if (r3 == null) goto L21;
        r3.pause();     // Catch: Exception -> L9
    L21:
        AudioTrack r4 = this.i010I;     // Catch: Exception -> L9
        if (r4 == null) goto L34;
        r4.flush();     // Catch: Exception -> L9
        return;
    L34:
        return;
    L25:
        th = move-exception;
        throw th;     // Catch: Exception -> L9
    }

    public final void iX1O1(@aa1 String r4, @aa1 String r5, @aa1 LeftAndRightPlayControl r6, int r7) {
        Intrinsics.X0O(r4, "text");
        Intrinsics.X0O(r5, "ttsName");
        Intrinsics.X0O(r6, "leftOrRight");
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.OXO1 + " audioSpeech ttsVoiceName = " + r5);
        this.OII = r5;
        if (this.X01IiOiIi != null) goto L7;
        r0.XIi00iiXO(this.OXO1 + " Please initialize the speech synthesizer first.");
        return;
    L7:
        if (this.I1XOi1 == true) goto L9;
        IXI();
    L9:
        DcsTtsPlayer r1 = DcsTtsPlayer.INSTANCE;
        if (r1.getMTtsFile().exists() == false) goto L31;
        r1.getMTtsFile().delete();
    L31:
        this.X01IiOiIi = Connection.fromSpeechSynthesizer(this.iOOX010X);     // Catch: Exception -> L29
        XOO0ii0 r2 = new XOO0ii0();     // Catch: Exception -> L29
        this.II1Xi0 = r2;     // Catch: Exception -> L29
        r2.XIi00iiXO(r5);     // Catch: Exception -> L29
        XOO0ii0 r8 = this.II1Xi0;     // Catch: Exception -> L29
        if (r8 == null) goto L15;
        r8.O00(r6);     // Catch: Exception -> L29
    L15:
        XOO0ii0 r9 = this.II1Xi0;     // Catch: Exception -> L29
        if (r9 == null) goto L18;
        r9.XO0O10(r4);     // Catch: Exception -> L29
    L18:
        XOO0ii0 r10 = this.II1Xi0;     // Catch: Exception -> L29
        if (r10 == null) goto L21;
        r10.OXO1(r7);     // Catch: Exception -> L29
    L21:
        String r11 = this.OXO1;     // Catch: Exception -> L29
        if (this.II1Xi0 != null) goto L24;
        boolean r12 = true;
    L25:
        r0.OXO1(r11 + " audioSpeech text = " + r4 + " " + r12);     // Catch: Exception -> L29
        ExecutorService r13 = this.I0IIOi;     // Catch: Exception -> L29
        if (r13 == null) goto L33;
        r13.execute(this.II1Xi0);     // Catch: Exception -> L29
        return;
    L33:
        return;
    L24:
        r12 = false;
    L29:
        iX01();
    }

    public final void iXi(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.OII = r2;
    }

    @tb1
    public final List<String> iXiX011() {
        return this.OX;
    }

    @aa1
    public final String iXiiiO() {
        return this.OII;
    }

    public final void iiIOiX(@aa1 Application r4) {
        Intrinsics.X0O(r4, "mApp");
        if (this.IIX1OXO == false) goto L6;
        return;
    L6:
        if (Build.VERSION.SDK_INT < 34) goto L8;
        ContextCompat.registerReceiver(r4, new IiI10X(), new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
    L9:
        this.IIX1OXO = true;
        return;
    L8:
        r4.registerReceiver(new IiI10X(), new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        goto L9
    }

    @tb1
    public final ExecutorService iiiO() {
        return this.I0IIOi;
    }
}
