package com.sma.smartv3.biz.voice;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresPermission;
import androidx.core.content.ContextCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.exoplayer.ExoPlayer;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.of3;
import com.android.mltcode.paycertificationapi.pf3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qf3;
import com.android.mltcode.paycertificationapi.rf3;
import com.android.mltcode.paycertificationapi.sf3;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tf3;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.RomUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.VoiceService;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.entity.Languages;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nRecordingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingManager.kt\ncom/sma/smartv3/biz/voice/RecordingManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"})
public final class RecordingManager {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private static volatile RecordingManager instance;

    @aa1
    private final String TAG;

    @tb1
    private AudioManager audioManager;
    private boolean isRecording;
    private boolean isStartTimers;

    @tb1
    private AudioRecord mAudioRecord;
    private int mBufferSize;

    @aa1
    private final Handler mHandler;
    private boolean mIsStream;

    @aa1
    private final RecordingManager$mTimerTask$1 mTimerTask;

    @aa1
    private final MediaItem mTipItem;

    @aa1
    private final Lazy mTipPlayer$delegate;
    private boolean playEnded;

    @tb1
    private ExoPlayer player;

    @tb1
    private OnRecordingCallback recordingCallback;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final RecordingManager getInstance() {
            return RecordingManager.access$getInstance$cp();
        }

        public final void setInstance(@aa1 RecordingManager r2) {
            Intrinsics.X0O(r2, "<set-?>");
            RecordingManager.access$setInstance$cp(r2);
        }

        private Companion() {
        }
    }

    public interface OnRecordingCallback {

        public static final class DefaultImpls {
            @Deprecated
            public static void onBeforeRecording(@aa1 OnRecordingCallback r0) {
                OnRecordingCallback.access$onBeforeRecording$jd(r0);
            }

            @Deprecated
            public static void onRecordResult(@aa1 OnRecordingCallback r0, @tb1 AITranslation r1) {
                OnRecordingCallback.access$onRecordResult$jd(r0, r1);
            }

            @Deprecated
            public static void onRecordResultError(@aa1 OnRecordingCallback r1, @aa1 String r2) {
                Intrinsics.X0O(r2, "error");
                OnRecordingCallback.access$onRecordResultError$jd(r1, r2);
            }

            @Deprecated
            public static void onRecordResultLanguage(@aa1 OnRecordingCallback r0, @tb1 AISpeech r1) {
                OnRecordingCallback.access$onRecordResultLanguage$jd(r0, r1);
            }

            @Deprecated
            public static void onStartRecording(@aa1 OnRecordingCallback r0) {
                OnRecordingCallback.access$onStartRecording$jd(r0);
            }

            @Deprecated
            public static void onStopRecording(@aa1 OnRecordingCallback r0) {
                OnRecordingCallback.access$onStopRecording$jd(r0);
            }
        }

        static /* synthetic */ void access$onBeforeRecording$jd(OnRecordingCallback r0) {
            super.onBeforeRecording();
        }

        static /* synthetic */ void access$onRecordResult$jd(OnRecordingCallback r0, AITranslation r1) {
            super.onRecordResult(r1);
        }

        static /* synthetic */ void access$onRecordResultError$jd(OnRecordingCallback r0, String r1) {
            super.onRecordResultError(r1);
        }

        static /* synthetic */ void access$onRecordResultLanguage$jd(OnRecordingCallback r0, AISpeech r1) {
            super.onRecordResultLanguage(r1);
        }

        static /* synthetic */ void access$onStartRecording$jd(OnRecordingCallback r0) {
            super.onStartRecording();
        }

        static /* synthetic */ void access$onStopRecording$jd(OnRecordingCallback r0) {
            super.onStopRecording();
        }

        default void onBeforeRecording() {
        }

        default void onRecordResult(@tb1 AITranslation r1) {
        }

        default void onRecordResultError(@aa1 String r2) {
            Intrinsics.X0O(r2, "error");
        }

        default void onRecordResultLanguage(@tb1 AISpeech r1) {
        }

        default void onStartRecording() {
        }

        default void onStopRecording() {
        }
    }

    public static final class ScoStateReceiver extends BroadcastReceiver {
        public ScoStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@aa1 Context r2, @aa1 Intent r3) {
            Intrinsics.X0O(r2, "context");
            Intrinsics.X0O(r3, SDKConstants.PARAM_INTENT);
            if (Intrinsics.XOO0ii0("android.media.ACTION_SCO_AUDIO_STATE_UPDATED", r3.getAction()) == false) goto L20;
            int r4 = r3.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            if (r4 == (-1)) goto L18;
            if (r4 != 0) goto L8;
            i1O0OXO1O.OXO1.OXO1("RecordingManager SCO Audio State: DISCONNECTED");
            return;
        L8:
            if (r4 != 1) goto L10;
            i1O0OXO1O.OXO1.OXO1("RecordingManager SCO Audio State: CONNECTED");
            RecordingManager.Companion.getInstance().setScoOnOpen();
            return;
        L10:
            if (r4 != 2) goto L21;
            i1O0OXO1O.OXO1.OXO1("RecordingManager SCO Audio State: CONNECTING");
            return;
        L21:
            return;
        L18:
            i1O0OXO1O.OXO1.OXO1("RecordingManager SCO Audio State: ERROR");
            return;
        }
    }

    static {
        Companion r0 = new Companion(null);
        Companion = r0;
        monitor-enter(r0);
        RecordingManager r1 = new RecordingManager();     // Catch: Throwable -> L8
        instance = r1;     // Catch: Throwable -> L8
        monitor-exit(r0);
        instance = r1;
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.sma.smartv3.biz.voice.RecordingManager$mTimerTask$1] */
    public RecordingManager() {
        this.TAG = "RecordingManager";
        this.mHandler = new Handler(Looper.getMainLooper());
        MediaItem r0 = new MediaItem.Builder().setUri(Uri.parse("file:///android_asset/voice_start_audio.mp3")).build();
        Intrinsics.O10IXXX0X(r0, "build(...)");
        this.mTipItem = r0;
        this.mTimerTask = new RecordingManager$mTimerTask$1(this);
        this.playEnded = true;
        this.mTipPlayer$delegate = LazyKt__LazyJVMKt.iO(new tf3(this));
    }

    public static /* synthetic */ Unit IiI10X(PermissionStatus r0) {
        return recordPermission$lambda$0(r0);
    }

    public static /* synthetic */ void O00(RecordingManager r0) {
        playTip$lambda$0(r0);
    }

    public static /* synthetic */ void OXO1(RecordingManager r0) {
        playStartTipVideo$lambda$0(r0);
    }

    public static /* synthetic */ ExoPlayer XIi00iiXO(RecordingManager r0) {
        return mTipPlayer_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XO0O10(Ref.IntRef r0, RecordingManager r1, Ref.BooleanRef r2) {
        return recordAudio$lambda$0(r0, r1, r2);
    }

    public static final /* synthetic */ void access$cancelTimer(RecordingManager r0) {
        r0.cancelTimer();
    }

    public static final /* synthetic */ RecordingManager access$getInstance$cp() {
        return instance;
    }

    public static final /* synthetic */ OnRecordingCallback access$getRecordingCallback$p(RecordingManager r0) {
        return r0.recordingCallback;
    }

    public static final /* synthetic */ String access$getTAG$p(RecordingManager r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setInstance$cp(RecordingManager r0) {
        instance = r0;
    }

    private final void adjustSystemVolume(int r4) {
        if (this.audioManager != null) goto L5;
        Object r0 = Utils.getApp().getSystemService("audio");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) r0;
    L5:
        AudioManager r1 = this.audioManager;
        Intrinsics.XXI(r1);
        int r5 = (r4 * r1.getStreamMaxVolume(3)) / 100;
        AudioManager r2 = this.audioManager;
        Intrinsics.XXI(r2);
        r2.setStreamVolume(3, r5, 0);
    }

    private final void cancelTimer() {
        if (this.isStartTimers == false) goto L6;
        this.isStartTimers = false;
        this.mHandler.removeCallbacks(this.mTimerTask);
        return;
    }

    private final ExoPlayer getMTipPlayer() {
        return (ExoPlayer) getValue();
    }

    public static /* synthetic */ void iO(RecordingManager r0) {
        recordAudio$lambda$1(r0);
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    private final void initialRecorder() {
        this.mBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        this.mAudioRecord = new AudioRecord(0, 16000, 16, 2, this.mBufferSize);
    }

    private static final ExoPlayer mTipPlayer_delegate$lambda$0(final RecordingManager r3) {
        if (r3.player != null) goto L5;
        r3.player = new ExoPlayer.Builder(Utils.getApp()).build();
    L5:
        ExoPlayer r0 = r3.player;
        if (r0 == null) goto L8;
        r0.setMediaItem(r3.mTipItem);
    L8:
        ExoPlayer r1 = r3.player;
        if (r1 == null) goto L11;
        r1.setPlaybackParameters(new PlaybackParameters(2.0f));
    L11:
        ExoPlayer r2 = r3.player;
        if (r2 == null) goto L14;
        r2.addListener(new RecordingManager$mTipPlayer$2$1(r3));
    L14:
        ExoPlayer r4 = r3.player;
        if (r4 == null) goto L18;
        r4.prepare();
    L18:
        return r3.player;
    }

    private static final void playStartTipVideo$lambda$0(RecordingManager r0) {
        r0.playTip();
    }

    private static final void playTip$lambda$0(RecordingManager r2) {
        ExoPlayer r0 = r2.getMTipPlayer();
        if (r0 != null) goto L5;
    L7:
        ExoPlayer r1 = r2.getMTipPlayer();
        if (r1 != null) goto L10;
    L12:
        ExoPlayer r3 = r2.getMTipPlayer();
        if (r3 != null) goto L15;
    L22:
        r2.playEnded = false;
        ExoPlayer r4 = r2.getMTipPlayer();
        if (r4 == null) goto L26;
        r4.play();
        return;
    L26:
        return;
    L15:
        if (r3.getPlaybackState() != 4) goto L22;
    L16:
        ExoPlayer r5 = r2.getMTipPlayer();
        if (r5 == null) goto L19;
        r5.setMediaItem(r2.mTipItem);
    L19:
        ExoPlayer r6 = r2.getMTipPlayer();
        if (r6 == null) goto L22;
        r6.prepare();
        goto L22
    L10:
        if (r1.getPlaybackState() != 1) goto L12;
    L5:
        if (r0.isPlaying() != true) goto L7;
    }

    public static /* synthetic */ void realTimeASRend$default(RecordingManager r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L9;
        if (q62.OiO0IOX(q62.OXO1, null, 1, null) == false) goto L7;
        r2 = 900;
        goto L9
    L7:
        r2 = 10000;
    L9:
        if ((r4 & 2) == 0) goto L11;
        r3 = r1.mBufferSize;
    L11:
        r1.realTimeASRend(r2, r3);
    }

    public static /* synthetic */ void realTimeASRing$default(RecordingManager r1, byte[] r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L9;
        if (q62.OiO0IOX(q62.OXO1, null, 1, null) == false) goto L7;
        r3 = 900;
        goto L9
    L7:
        r3 = 10000;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = r1.mBufferSize;
    L11:
        r1.realTimeASRing(r2, r3, r4);
    }

    private static final Unit recordAudio$lambda$0(Ref.IntRef r13, RecordingManager r14, Ref.BooleanRef r15) {
        FileOutputStream r2 = null;
        if (q62.OiO0IOX(q62.OXO1, null, 1, null) == false) goto L73;
        r13.element = 900;
        r14.playStartTipVideo();
    L73:
        AudioRecord r4 = r14.mAudioRecord;     // Catch: Throwable -> L10 Exception -> L57
        if (r4 != null) goto L69;
    L14:
        OnRecordingCallback r5 = r14.recordingCallback;     // Catch: Throwable -> L10 Exception -> L57
        if (r5 == null) goto L17;
        r5.onStartRecording();     // Catch: Throwable -> L10 Exception -> L12
    L12:
        e = move-exception;
        Exception r16 = e;
        RecordingManager r6 = r14;
    L59:
        r16.printStackTrace();     // Catch: Throwable -> L10
        if (r2 == null) goto L62;
        r2.close();     // Catch: Throwable -> L10
    L62:
        if (r2 == null) goto L64;
        r2.close();
    L64:
        r6.isRecording = false;
        return Unit.OXO1;
    L17:
        FileOutputStream r7 = new FileOutputStream(VoiceManager.INSTANCE.getMPcmFile());     // Catch: Throwable -> L10 Exception -> L57
        int r8 = r14.mBufferSize;     // Catch: Throwable -> L25 Exception -> L35
        byte[] r9 = new byte[r8];     // Catch: Throwable -> L25 Exception -> L35
        startRealTimeASR$default(r14, null, 1, null);     // Catch: Throwable -> L25 Exception -> L35
        i1O0OXO1O.OXO1.OXO1(r14.TAG + " recording...  isRecording = " + r14.isRecording);     // Catch: Throwable -> L25 Exception -> L35
    L20:
        if (r14.isRecording == false) goto L37;
        AudioRecord r10 = r14.mAudioRecord;     // Catch: Throwable -> L25 Exception -> L35
        if (r10 != null) goto L76;
    L30:
        r7.write(r9);     // Catch: Throwable -> L25 Exception -> L35
        r7.flush();     // Catch: Throwable -> L25 Exception -> L35
        r6 = r14;
        realTimeASRing$default(r6, r9, r13.element, 0, 4, null);     // Catch: Throwable -> L25 Exception -> L33
        i1O0OXO1O.OXO1.OXO1(r6.TAG + " recording...  isRecording = " + r6.isRecording + " bytes = " + r8 + " mBufferSize= " + r6.mBufferSize);     // Catch: Throwable -> L25 Exception -> L33
        r14 = r6;
    L33:
        e = e;
    L34:
        r16 = e;
    L29:
        r2 = r7;
        goto L59
    L76:
        r10.read(r9, 0, r8);     // Catch: Throwable -> L25 Exception -> L27
    L27:
        e = move-exception;
        r16 = e;
        r6 = r14;
        goto L29
    L37:
        r6 = r14;
        AudioRecord r17 = r6.mAudioRecord;     // Catch: Throwable -> L25 Exception -> L33
        if (r17 == null) goto L40;
        r17.stop();     // Catch: Throwable -> L25 Exception -> L33
    L40:
        AudioRecord r18 = r6.mAudioRecord;     // Catch: Throwable -> L25 Exception -> L33
        if (r18 == null) goto L43;
        r18.release();     // Catch: Throwable -> L25 Exception -> L33
    L43:
        OnRecordingCallback r19 = r6.recordingCallback;     // Catch: Throwable -> L25 Exception -> L33
        if (r19 == null) goto L46;
        r19.onStopRecording();     // Catch: Throwable -> L25 Exception -> L33
    L46:
        r7.flush();     // Catch: Throwable -> L25 Exception -> L33
        q62 r110 = q62.OXO1;     // Catch: Throwable -> L25 Exception -> L33
        if (q62.OiO0IOX(r110, null, 1, null) == false) goto L50;
        DcsTtsPlayer.playAssetsFile$default(DcsTtsPlayer.INSTANCE, "voice_end_cycle_audio.mp3", true, null, 4, null);     // Catch: Throwable -> L25 Exception -> L33
    L50:
        if (r110.OIXOOi() == false) goto L53;
        realTimeASRend$default(r6, r13.element, 0, 2, null);     // Catch: Throwable -> L25 Exception -> L33
    L55:
        r15.element = false;     // Catch: Throwable -> L25 Exception -> L33
        r7.close();
        goto L64
    L53:
        if (r15.element == false) goto L55;
        VoiceManager.INSTANCE.recognition();     // Catch: Throwable -> L25 Exception -> L33
    L25:
        th = move-exception;
        Throwable r111 = th;
        r2 = r7;
    L66:
        if (r2 == null) goto L81;
        r2.close();
        throw r111;
    L81:
        throw r111;
    L35:
        e = e;
        r6 = r14;
        goto L34
    L69:
        r4.startRecording();     // Catch: Throwable -> L10 Exception -> L12
    L57:
        e = move-exception;
        r6 = r14;
        r16 = e;
    L10:
        th = move-exception;
        r111 = th;
        goto L66
    }

    private static final void recordAudio$lambda$1(RecordingManager r0) {
        r0.playTip();
    }

    public static /* synthetic */ void recordPermission$default(RecordingManager r0, OnRecordingCallback r1, boolean r2, boolean r3, String r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = true;
    L8:
        r0.recordPermission(r1, r2, r3, r4);
    }

    private static final Unit recordPermission$lambda$0(PermissionStatus r1) {
        Intrinsics.X0O(r1, "it");
        if (r1 != PermissionStatus.GRANTED) goto L6;
        VoiceService.I1.XIi00iiXO();
    L6:
        return Unit.OXO1;
    }

    public static /* synthetic */ void setOutputStream$default(RecordingManager r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.setOutputStream(r1);
    }

    public static /* synthetic */ void startRealTimeASR$default(RecordingManager r0, OnRecordingCallback r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.startRealTimeASR(r1);
    }

    private final void startTimer() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " start timer");     // Catch: Exception -> L4
        this.mHandler.removeCallbacks(this.mTimerTask);     // Catch: Exception -> L4
        this.isStartTimers = true;     // Catch: Exception -> L4
        this.mHandler.postDelayed(this.mTimerTask, 20000);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
    }

    public final void closeBluetooth() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " closeBluetooth");
        AudioManager r0 = this.audioManager;
        if (r0 == null) goto L5;
        r0.setBluetoothScoOn(false);
    L5:
        AudioManager r1 = this.audioManager;
        if (r1 == null) goto L8;
        r1.stopBluetoothSco();
    L8:
        AudioManager r2 = this.audioManager;
        if (r2 == null) goto L12;
        r2.setMode(0);
        return;
    }

    public final boolean getPlayEnded() {
        return this.playEnded;
    }

    public final void init(@aa1 Application r2) {
        Intrinsics.X0O(r2, "mApp");
        if (this.audioManager != null) goto L6;
        Object r3 = Utils.getApp().getSystemService("audio");
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) r3;
    L6:
        if (this.player != null) goto L8;
    L9:
        ExoPlayer r4 = getMTipPlayer();
        if (r4 == null) goto L12;
        r4.setMediaItem(this.mTipItem);
    L12:
        ExoPlayer r5 = getMTipPlayer();
        if (r5 == null) goto L17;
        r5.prepare();
        return;
    L17:
        return;
    L8:
        if (getMTipPlayer() == null) goto L9;
    }

    public final boolean isRecording() {
        return this.isRecording;
    }

    public final void playStartTipVideo() {
        Handler r0 = this.mHandler;
        Runnable r1 = new sf3(this);
        if (this.player != null) goto L5;
        long r2 = 1300;
    L6:
        r0.postDelayed(r1, r2);
        return;
    L5:
        r2 = 1000;
        goto L6
    }

    public final void playTip() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " playTip playEnded = " + this.playEnded);
        if (this.playEnded == true) goto L5;
        return;
    L5:
        this.mHandler.post(new rf3(this));
    }

    public final void realTimeASRend(int r14, int r15) {
        if (q62.OXO1.OIXOOi() == false) goto L6;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " realTimeSendASRData start query");
        AISparkChainManager.X11iII1O1(AISparkChainManager.OXO1, new byte[10], true, r15, null, false, r14, null, null, 216, null);
        return;
    }

    public final void realTimeASRing(@aa1 byte[] r13, int r14, int r15) {
        Intrinsics.X0O(r13, "bytes");
        if (q62.OXO1.OIXOOi() == false) goto L36;
        AISparkChainManager r1 = AISparkChainManager.OXO1;
        VoiceManager r0 = VoiceManager.INSTANCE;
        String r3 = "cn";
        if (r0.isSupportAIVoiceTranslation() == true) goto L28;
        if (r0.isSupportEarPhoneVoiceTranslation() == true) goto L28;
        String r2 = Locale.getDefault().getLanguage();
        if (Intrinsics.XOO0ii0(r2, Languages.DEFAULT_LANGUAGE_ZH) == false) goto L13;
    L11:
        String r8 = r3;
        AISparkChainManager.X11iII1O1(r1, r13, false, r15, new AnonymousClass1(this), false, r14, r8, null, 146, null);
        return;
    L13:
        if (Intrinsics.XOO0ii0(r2, "in") == false) goto L15;
        r2 = "id";
    L15:
        Iterator<T> r4 = LanguageTranslationKt.getTranslationLanguageList().iterator();
    L17:
        if (r4.hasNext() == false) goto L21;
        Object r5 = r4.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r5).getRtasrLanguage(), r2) == false) goto L17;
    L22:
        LanguageTranslationData r6 = (LanguageTranslationData) r5;
        if (r6 == null) goto L26;
        r3 = r6.getAsrLanguage();
        if (r3 != null) goto L11;
    L26:
        r3 = Languages.DEFAULT_LANGUAGE;
        goto L11
    L21:
        r5 = null;
    L28:
        if (r0.isActivityData() == false) goto L30;
        r3 = r0.getMicrosoftLanguage();
        goto L11
    L30:
        r3 = LanguageTranslationKt.getTranslationLanguageASRLanguage(Languages.INSTANCE.formatAISparkTargetLang(r0.getMLanguage(), "cn"));
        goto L11
    }

    public final void recordAudio() {
        if (this.isRecording == true) goto L10;
        OnRecordingCallback r0 = this.recordingCallback;
        if (r0 == null) goto L7;
        r0.onBeforeRecording();
    L7:
        setStartBluetooth();
        DcsTtsPlayer.INSTANCE.initSegmentation();
        this.isRecording = true;
        final Ref.BooleanRef r1 = new Ref.BooleanRef();
        r1.element = true;
        initialRecorder();
        final Ref.IntRef r2 = new Ref.IntRef();
        r2.element = 10000;
        ThreadsKt.iO(true, false, null, null, 0, new of3(r2, this, r1), 30, null);
        return;
    L10:
        if (q62.OiO0IOX(q62.OXO1, null, 1, null) == false) goto L13;
        this.mHandler.post(new pf3(this));
        return;
    }

    public final void recordPermission(@aa1 OnRecordingCallback r4, boolean r5, boolean r6, @aa1 String r7) {
        Intrinsics.X0O(r4, "callback");
        Intrinsics.X0O(r7, "name");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " name:" + r7 + "  isOutputStream:" + r5 + "  ");
        setOutputStream(r5);
        if (r6 == false) goto L5;
        setRecordingCallback(r4);
    L5:
        PermissionUtils r8 = PermissionUtils.permission(new String[]{PermissionConstants.MICROPHONE, "android.permission.MODIFY_AUDIO_SETTINGS"});
        Intrinsics.O10IXXX0X(r8, "permission(...)");
        ds1.XIi00iiXO(r8, UtilsKt.XXO(R.string.microphone_explain_title), UtilsKt.XXO(R.string.microphone_explain_content), new qf3());
    }

    public final void registerSCOReceiver(@aa1 Application r4) {
        Intrinsics.X0O(r4, "mApp");
        if (Build.VERSION.SDK_INT < 34) goto L6;
        ContextCompat.registerReceiver(r4, new ScoStateReceiver(), new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
        return;
    L6:
        r4.registerReceiver(new ScoStateReceiver(), new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
    }

    public final void setOutputStream(boolean r1) {
        this.mIsStream = r1;
    }

    public final void setPlayEnded(boolean r1) {
        this.playEnded = r1;
    }

    public final void setRecording(boolean r1) {
        this.isRecording = r1;
    }

    public final void setRecordingCallback(@aa1 OnRecordingCallback r2) {
        Intrinsics.X0O(r2, "callback");
        if (this.recordingCallback == null) goto L5;
        this.recordingCallback = null;
    L5:
        this.recordingCallback = r2;
    }

    public final void setScoOnOpen() {
        AudioManager r0 = this.audioManager;
        if (r0 == null) goto L6;
        r0.setBluetoothScoOn(true);
        return;
    }

    public final void setStartBluetooth() {
        if (this.audioManager != null) goto L5;
        Object r0 = Utils.getApp().getSystemService("audio");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) r0;
    L5:
        AudioManager r1 = this.audioManager;
        if (r1 == null) goto L8;
        boolean r2 = r1.isBluetoothScoOn();
    L9:
        i1O0OXO1O r3 = i1O0OXO1O.OXO1;
        String r4 = this.TAG;
        VoiceManager r5 = VoiceManager.INSTANCE;
        boolean r6 = r5.isRecordBluetooth();
        AudioManager r7 = this.audioManager;
        Integer r8 = null;
        if (r7 == null) goto L12;
        Integer r9 = Integer.valueOf(r7.getMode());
    L13:
        AudioManager r10 = this.audioManager;
        if (r10 == null) goto L16;
        Boolean r11 = Boolean.valueOf(r10.isBluetoothScoOn());
    L17:
        r3.OXO1(r4 + "  startBluetoothSco isRecordBluetooth = " + r6 + " , isOn = " + r2 + ", , mode = " + r9 + "  , isBluetoothScoOn = " + r11);
        if (r5.isRecordBluetooth() == false) goto L37;
        if (r2 == false) goto L21;
    L43:
        String r12 = this.TAG;
        AudioManager r13 = this.audioManager;
        if (r13 == null) goto L46;
        r8 = Integer.valueOf(r13.getMode());
    L46:
        r3.OXO1(r12 + " startBluetoothSco end  mode = " + r8);
        return;
    L21:
        if (RomUtils.isMeizu() == false) goto L25;
        AudioManager r14 = this.audioManager;
        if (r14 == null) goto L28;
        r14.setMode(3);
    L28:
        AudioManager r15 = this.audioManager;
        if (r15 == null) goto L31;
        r15.setSpeakerphoneOn(false);
    L31:
        AudioManager r16 = this.audioManager;
        if (r16 == null) goto L34;
        r16.setMicrophoneMute(false);
    L34:
        AudioManager r17 = this.audioManager;
        if (r17 == null) goto L43;
        r17.startBluetoothSco();
        goto L43
    L25:
        AudioManager r18 = this.audioManager;
        if (r18 == null) goto L28;
        r18.setMode(2);
        goto L28
    L37:
        AudioManager r19 = this.audioManager;
        if (r19 == null) goto L40;
        r19.setMode(0);
    L40:
        AudioManager r20 = this.audioManager;
        if (r20 == null) goto L43;
        r20.setBluetoothScoOn(false);
        goto L43
    L16:
        r11 = null;
        goto L17
    L12:
        r9 = null;
        goto L13
    L8:
        r2 = false;
        goto L9
    }

    public final void startRealTimeASR(@tb1 OnRecordingCallback r4) {
        if (r4 == null) goto L4;
        setRecordingCallback(r4);
    L4:
        AISparkChainManager.XXO(AISparkChainManager.OXO1, 0, false, 3, null);
    }

    public final void startRecord() {
        recordAudio();
    }

    public final void stopRecording() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " stopRecording");
        if (this.isRecording == false) goto L6;
        this.isRecording = false;
        return;
    }
}
