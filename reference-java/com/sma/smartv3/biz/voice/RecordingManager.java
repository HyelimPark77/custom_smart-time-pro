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
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.RomUtils;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.VoiceService;
import com.sma.smartv3.biz.voice.RecordingManager;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nRecordingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingManager.kt\ncom/sma/smartv3/biz/voice/RecordingManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"})
public final class RecordingManager {

    @aa1
    public static final Companion Companion;

    @aa1
    private static volatile RecordingManager instance;

    @tb1
    private AudioManager audioManager;
    private boolean isRecording;
    private boolean isStartTimers;

    @tb1
    private AudioRecord mAudioRecord;
    private int mBufferSize;
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

    @aa1
    private final String TAG = "RecordingManager";

    @aa1
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final RecordingManager getInstance() {
            return RecordingManager.instance;
        }

        public final void setInstance(@aa1 RecordingManager recordingManager) {
            Intrinsics.X0O(recordingManager, "<set-?>");
            RecordingManager.instance = recordingManager;
        }

        private Companion() {
        }
    }

    public interface OnRecordingCallback {

        public static final class DefaultImpls {
            @Deprecated
            public static void onBeforeRecording(@aa1 OnRecordingCallback onRecordingCallback) {
                OnRecordingCallback.super.onBeforeRecording();
            }

            @Deprecated
            public static void onRecordResult(@aa1 OnRecordingCallback onRecordingCallback, @tb1 AITranslation aITranslation) {
                OnRecordingCallback.super.onRecordResult(aITranslation);
            }

            @Deprecated
            public static void onRecordResultError(@aa1 OnRecordingCallback onRecordingCallback, @aa1 String error) {
                Intrinsics.X0O(error, "error");
                OnRecordingCallback.super.onRecordResultError(error);
            }

            @Deprecated
            public static void onRecordResultLanguage(@aa1 OnRecordingCallback onRecordingCallback, @tb1 AISpeech aISpeech) {
                OnRecordingCallback.super.onRecordResultLanguage(aISpeech);
            }

            @Deprecated
            public static void onStartRecording(@aa1 OnRecordingCallback onRecordingCallback) {
                OnRecordingCallback.super.onStartRecording();
            }

            @Deprecated
            public static void onStopRecording(@aa1 OnRecordingCallback onRecordingCallback) {
                OnRecordingCallback.super.onStopRecording();
            }
        }

        default void onBeforeRecording() {
        }

        default void onRecordResult(@tb1 AITranslation aITranslation) {
        }

        default void onRecordResultError(@aa1 String error) {
            Intrinsics.X0O(error, "error");
        }

        default void onRecordResultLanguage(@tb1 AISpeech aISpeech) {
        }

        default void onStartRecording() {
        }

        default void onStopRecording() {
        }
    }

    public static final class ScoStateReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@aa1 Context context, @aa1 Intent intent) {
            Intrinsics.X0O(context, "context");
            Intrinsics.X0O(intent, "intent");
            if (Intrinsics.XOO0ii0("android.media.ACTION_SCO_AUDIO_STATE_UPDATED", intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
                if (intExtra == -1) {
                    i1O0OXO1O.OXO1.OXO1("RecordingManager SCO Audio State: ERROR");
                    return;
                }
                if (intExtra == 0) {
                    i1O0OXO1O.OXO1.OXO1("RecordingManager SCO Audio State: DISCONNECTED");
                    return;
                }
                if (intExtra == 1) {
                    i1O0OXO1O.OXO1.OXO1("RecordingManager SCO Audio State: CONNECTED");
                    RecordingManager.Companion.getInstance().setScoOnOpen();
                } else {
                    if (intExtra != 2) {
                        return;
                    }
                    i1O0OXO1O.OXO1.OXO1("RecordingManager SCO Audio State: CONNECTING");
                }
            }
        }
    }

    static {
        RecordingManager recordingManager;
        Companion companion = new Companion(null);
        Companion = companion;
        synchronized (companion) {
            recordingManager = new RecordingManager();
            instance = recordingManager;
        }
        instance = recordingManager;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.sma.smartv3.biz.voice.RecordingManager$mTimerTask$1] */
    public RecordingManager() {
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(Uri.parse("file:///android_asset/voice_start_audio.mp3")).build();
        Intrinsics.O10IXXX0X(mediaItemBuild, "build(...)");
        this.mTipItem = mediaItemBuild;
        this.mTimerTask = new Runnable() { // from class: com.sma.smartv3.biz.voice.RecordingManager$mTimerTask$1
            @Override // java.lang.Runnable
            public void run() {
                i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " timeout to stop timer");
                this.this$0.setRecording(false);
                AISparkChainManager.OXO1.O0O0X0iOi();
                this.this$0.closeBluetooth();
                DcsTtsPlayer.INSTANCE.stop();
                VoiceService.f50915I1.XO0O10();
            }
        };
        this.playEnded = true;
        this.mTipPlayer$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return RecordingManager.mTipPlayer_delegate$lambda$0(this.f11244IO);
            }
        });
    }

    private final void adjustSystemVolume(int i) {
        if (this.audioManager == null) {
            Object systemService = Utils.getApp().getSystemService("audio");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.audioManager = (AudioManager) systemService;
        }
        AudioManager audioManager = this.audioManager;
        Intrinsics.XXI(audioManager);
        int streamMaxVolume = (i * audioManager.getStreamMaxVolume(3)) / 100;
        AudioManager audioManager2 = this.audioManager;
        Intrinsics.XXI(audioManager2);
        audioManager2.setStreamVolume(3, streamMaxVolume, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimer() {
        if (this.isStartTimers) {
            this.isStartTimers = false;
            this.mHandler.removeCallbacks(this.mTimerTask);
        }
    }

    private final ExoPlayer getMTipPlayer() {
        return (ExoPlayer) this.mTipPlayer$delegate.getValue();
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    private final void initialRecorder() {
        this.mBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        this.mAudioRecord = new AudioRecord(0, 16000, 16, 2, this.mBufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExoPlayer mTipPlayer_delegate$lambda$0(final RecordingManager recordingManager) {
        if (recordingManager.player == null) {
            recordingManager.player = new ExoPlayer.Builder(Utils.getApp()).build();
        }
        ExoPlayer exoPlayer = recordingManager.player;
        if (exoPlayer != null) {
            exoPlayer.setMediaItem(recordingManager.mTipItem);
        }
        ExoPlayer exoPlayer2 = recordingManager.player;
        if (exoPlayer2 != null) {
            exoPlayer2.setPlaybackParameters(new PlaybackParameters(2.0f));
        }
        ExoPlayer exoPlayer3 = recordingManager.player;
        if (exoPlayer3 != null) {
            exoPlayer3.addListener(new Player.Listener() { // from class: com.sma.smartv3.biz.voice.RecordingManager$mTipPlayer$2$1
                @Override // androidx.media3.common.Player.Listener
                public void onEvents(Player player, Player.Events events) {
                    Intrinsics.X0O(player, "player");
                    Intrinsics.X0O(events, "events");
                    super.onEvents(player, events);
                    if (events.contains(11)) {
                        long currentPosition = player.getCurrentPosition();
                        long duration = player.getDuration();
                        if (duration >= currentPosition) {
                            i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " onEvents  events = " + events + "  == 11   currentPosition = " + currentPosition + "  duration = " + duration);
                        }
                    }
                }

                @Override // androidx.media3.common.Player.Listener
                public void onPlaybackStateChanged(int i) {
                    i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + "  onPlaybackStateChanged " + i);
                    if (i == 4) {
                        this.this$0.setPlayEnded(true);
                    }
                }
            });
        }
        ExoPlayer exoPlayer4 = recordingManager.player;
        if (exoPlayer4 != null) {
            exoPlayer4.prepare();
        }
        return recordingManager.player;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playTip$lambda$0(RecordingManager recordingManager) {
        ExoPlayer mTipPlayer;
        ExoPlayer mTipPlayer2 = recordingManager.getMTipPlayer();
        if (mTipPlayer2 == null || !mTipPlayer2.isPlaying()) {
            ExoPlayer mTipPlayer3 = recordingManager.getMTipPlayer();
            if ((mTipPlayer3 != null && mTipPlayer3.getPlaybackState() == 1) || ((mTipPlayer = recordingManager.getMTipPlayer()) != null && mTipPlayer.getPlaybackState() == 4)) {
                ExoPlayer mTipPlayer4 = recordingManager.getMTipPlayer();
                if (mTipPlayer4 != null) {
                    mTipPlayer4.setMediaItem(recordingManager.mTipItem);
                }
                ExoPlayer mTipPlayer5 = recordingManager.getMTipPlayer();
                if (mTipPlayer5 != null) {
                    mTipPlayer5.prepare();
                }
            }
            recordingManager.playEnded = false;
            ExoPlayer mTipPlayer6 = recordingManager.getMTipPlayer();
            if (mTipPlayer6 != null) {
                mTipPlayer6.play();
            }
        }
    }

    public static /* synthetic */ void realTimeASRend$default(RecordingManager recordingManager, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = q62.OiO0IOX(q62.OXO1, null, 1, null) ? 900 : 10000;
        }
        if ((i3 & 2) != 0) {
            i2 = recordingManager.mBufferSize;
        }
        recordingManager.realTimeASRend(i, i2);
    }

    public static /* synthetic */ void realTimeASRing$default(RecordingManager recordingManager, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = q62.OiO0IOX(q62.OXO1, null, 1, null) ? 900 : 10000;
        }
        if ((i3 & 4) != 0) {
            i2 = recordingManager.mBufferSize;
        }
        recordingManager.realTimeASRing(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:61:0x0104 A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #5 {all -> 0x001c, blocks: (B:6:0x0014, B:8:0x0018, B:14:0x0025, B:16:0x0029, B:17:0x002c, B:59:0x00ff, B:61:0x0104), top: B:73:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    public static final Unit recordAudio$lambda$0(Ref.IntRef intRef, RecordingManager recordingManager, Ref.BooleanRef booleanRef) throws Throwable {
        Throwable th;
        RecordingManager recordingManager2;
        Exception exc;
        FileOutputStream fileOutputStream = null;
        if (q62.OiO0IOX(q62.OXO1, null, 1, null)) {
            intRef.element = 900;
            recordingManager.playStartTipVideo();
        }
        try {
            try {
                AudioRecord audioRecord = recordingManager.mAudioRecord;
                if (audioRecord != null) {
                    try {
                        audioRecord.startRecording();
                    } catch (Exception e) {
                        exc = e;
                        recordingManager2 = recordingManager;
                        exc.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        recordingManager2.isRecording = false;
                        return Unit.OXO1;
                    }
                }
                OnRecordingCallback onRecordingCallback = recordingManager.recordingCallback;
                if (onRecordingCallback != null) {
                    onRecordingCallback.onStartRecording();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(VoiceManager.INSTANCE.getMPcmFile());
                try {
                    try {
                        int i = recordingManager.mBufferSize;
                        byte[] bArr = new byte[i];
                        startRealTimeASR$default(recordingManager, null, 1, null);
                        i1O0OXO1O.OXO1.OXO1(recordingManager.TAG + " recording...  isRecording = " + recordingManager.isRecording);
                        while (recordingManager.isRecording) {
                            AudioRecord audioRecord2 = recordingManager.mAudioRecord;
                            if (audioRecord2 != null) {
                                try {
                                    audioRecord2.read(bArr, 0, i);
                                } catch (Exception e2) {
                                    exc = e2;
                                    recordingManager2 = recordingManager;
                                    fileOutputStream = fileOutputStream2;
                                    exc.printStackTrace();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    recordingManager2.isRecording = false;
                                    return Unit.OXO1;
                                }
                            }
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.flush();
                            recordingManager2 = recordingManager;
                            try {
                                realTimeASRing$default(recordingManager2, bArr, intRef.element, 0, 4, null);
                                i1O0OXO1O.OXO1.OXO1(recordingManager2.TAG + " recording...  isRecording = " + recordingManager2.isRecording + " bytes = " + i + " mBufferSize= " + recordingManager2.mBufferSize);
                                recordingManager = recordingManager2;
                            } catch (Exception e3) {
                                e = e3;
                                exc = e;
                                fileOutputStream = fileOutputStream2;
                                exc.printStackTrace();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                recordingManager2.isRecording = false;
                                return Unit.OXO1;
                            }
                        }
                        recordingManager2 = recordingManager;
                        AudioRecord audioRecord3 = recordingManager2.mAudioRecord;
                        if (audioRecord3 != null) {
                            audioRecord3.stop();
                        }
                        AudioRecord audioRecord4 = recordingManager2.mAudioRecord;
                        if (audioRecord4 != null) {
                            audioRecord4.release();
                        }
                        OnRecordingCallback onRecordingCallback2 = recordingManager2.recordingCallback;
                        if (onRecordingCallback2 != null) {
                            onRecordingCallback2.onStopRecording();
                        }
                        fileOutputStream2.flush();
                        q62 q62Var = q62.OXO1;
                        if (q62.OiO0IOX(q62Var, null, 1, null)) {
                            DcsTtsPlayer.playAssetsFile$default(DcsTtsPlayer.INSTANCE, "voice_end_cycle_audio.mp3", true, null, 4, null);
                        }
                        if (q62Var.OIXOOi()) {
                            realTimeASRend$default(recordingManager2, intRef.element, 0, 2, null);
                        } else if (booleanRef.element) {
                            VoiceManager.INSTANCE.recognition();
                        }
                        booleanRef.element = false;
                        fileOutputStream2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    recordingManager2 = recordingManager;
                }
            } catch (Exception e5) {
                recordingManager2 = recordingManager;
                exc = e5;
            }
            recordingManager2.isRecording = false;
            return Unit.OXO1;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static /* synthetic */ void recordPermission$default(RecordingManager recordingManager, OnRecordingCallback onRecordingCallback, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        recordingManager.recordPermission(onRecordingCallback, z, z2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordPermission$lambda$0(PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            VoiceService.f50915I1.XIi00iiXO();
        }
        return Unit.OXO1;
    }

    public static /* synthetic */ void setOutputStream$default(RecordingManager recordingManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        recordingManager.setOutputStream(z);
    }

    public static /* synthetic */ void startRealTimeASR$default(RecordingManager recordingManager, OnRecordingCallback onRecordingCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            onRecordingCallback = null;
        }
        recordingManager.startRealTimeASR(onRecordingCallback);
    }

    private final void startTimer() {
        try {
            i1O0OXO1O.OXO1.OXO1(this.TAG + " start timer");
            this.mHandler.removeCallbacks(this.mTimerTask);
            this.isStartTimers = true;
            this.mHandler.postDelayed(this.mTimerTask, 20000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void closeBluetooth() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " closeBluetooth");
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            audioManager.setBluetoothScoOn(false);
        }
        AudioManager audioManager2 = this.audioManager;
        if (audioManager2 != null) {
            audioManager2.stopBluetoothSco();
        }
        AudioManager audioManager3 = this.audioManager;
        if (audioManager3 != null) {
            audioManager3.setMode(0);
        }
    }

    public final boolean getPlayEnded() {
        return this.playEnded;
    }

    public final void init(@aa1 Application mApp) {
        Intrinsics.X0O(mApp, "mApp");
        if (this.audioManager == null) {
            Object systemService = Utils.getApp().getSystemService("audio");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.audioManager = (AudioManager) systemService;
        }
        if (this.player == null || getMTipPlayer() == null) {
            ExoPlayer mTipPlayer = getMTipPlayer();
            if (mTipPlayer != null) {
                mTipPlayer.setMediaItem(this.mTipItem);
            }
            ExoPlayer mTipPlayer2 = getMTipPlayer();
            if (mTipPlayer2 != null) {
                mTipPlayer2.prepare();
            }
        }
    }

    public final boolean isRecording() {
        return this.isRecording;
    }

    public final void playStartTipVideo() {
        this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.sf3
            @Override // java.lang.Runnable
            public final void run() {
                this.f11017IO.playTip();
            }
        }, this.player == null ? 1300L : 1000L);
    }

    public final void playTip() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " playTip playEnded = " + this.playEnded);
        if (this.playEnded) {
            this.mHandler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.rf3
                @Override // java.lang.Runnable
                public final void run() {
                    RecordingManager.playTip$lambda$0(this.f10803IO);
                }
            });
        }
    }

    public final void realTimeASRend(int i, int i2) {
        if (q62.OXO1.OIXOOi()) {
            i1O0OXO1O.OXO1.OXO1(this.TAG + " realTimeSendASRData start query");
            AISparkChainManager.X11iII1O1(AISparkChainManager.OXO1, new byte[10], true, i2, null, false, i, null, null, 216, null);
        }
    }

    public final void realTimeASRing(@aa1 byte[] bytes, int i, int i2) {
        Object next;
        Intrinsics.X0O(bytes, "bytes");
        if (q62.OXO1.OIXOOi()) {
            AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            String microsoftLanguage = "cn";
            if (voiceManager.isSupportAIVoiceTranslation() || voiceManager.isSupportEarPhoneVoiceTranslation()) {
                microsoftLanguage = voiceManager.isActivityData() ? voiceManager.getMicrosoftLanguage() : LanguageTranslationKt.getTranslationLanguageASRLanguage(Languages.INSTANCE.formatAISparkTargetLang(voiceManager.getMLanguage(), "cn"));
            } else {
                String language = Locale.getDefault().getLanguage();
                if (!Intrinsics.XOO0ii0(language, Languages.DEFAULT_LANGUAGE_ZH)) {
                    if (Intrinsics.XOO0ii0(language, "in")) {
                        language = "id";
                    }
                    Iterator<T> it = LanguageTranslationKt.getTranslationLanguageList().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), language));
                    LanguageTranslationData languageTranslationData = (LanguageTranslationData) next;
                    if (languageTranslationData == null || (microsoftLanguage = languageTranslationData.getAsrLanguage()) == null) {
                        microsoftLanguage = Languages.DEFAULT_LANGUAGE;
                    }
                }
            }
            AISparkChainManager.X11iII1O1(aISparkChainManager, bytes, false, i2, new O1XIiIO<AITranslation>() { // from class: com.sma.smartv3.biz.voice.RecordingManager.realTimeASRing.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.OXO1(RecordingManager.this.TAG + " realTimeSendASRData handleError -> " + error);
                    RecordingManager.this.cancelTimer();
                    OnRecordingCallback onRecordingCallback = RecordingManager.this.recordingCallback;
                    if (onRecordingCallback != null) {
                        onRecordingCallback.onRecordResultError(error);
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleResponse(AITranslation aITranslation) {
                    RecordingManager.this.cancelTimer();
                    i1O0OXO1O.OXO1.OXO1(RecordingManager.this.TAG + " realTimeSendASRData handleResponse -> " + (aITranslation != null ? aITranslation.getText() : null));
                    OnRecordingCallback onRecordingCallback = RecordingManager.this.recordingCallback;
                    if (onRecordingCallback != null) {
                        onRecordingCallback.onRecordResult(aITranslation);
                    }
                }
            }, false, i, microsoftLanguage, null, 146, null);
        }
    }

    public final void recordAudio() {
        if (this.isRecording) {
            if (q62.OiO0IOX(q62.OXO1, null, 1, null)) {
                this.mHandler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.pf3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10354IO.playTip();
                    }
                });
                return;
            }
            return;
        }
        OnRecordingCallback onRecordingCallback = this.recordingCallback;
        if (onRecordingCallback != null) {
            onRecordingCallback.onBeforeRecording();
        }
        setStartBluetooth();
        DcsTtsPlayer.INSTANCE.initSegmentation();
        this.isRecording = true;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        initialRecorder();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 10000;
        ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.of3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return RecordingManager.recordAudio$lambda$0(intRef, this, booleanRef);
            }
        }, 30, null);
    }

    public final void recordPermission(@aa1 OnRecordingCallback callback, boolean z, boolean z2, @aa1 String name) {
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(name, "name");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " name:" + name + "  isOutputStream:" + z + "  ");
        setOutputStream(z);
        if (z2) {
            setRecordingCallback(callback);
        }
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.MICROPHONE, "android.permission.MODIFY_AUDIO_SETTINGS");
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, UtilsKt.XXO(R.string.microphone_explain_title), UtilsKt.XXO(R.string.microphone_explain_content), new Function1() { // from class: com.android.mltcode.paycertificationapi.qf3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordingManager.recordPermission$lambda$0((PermissionStatus) obj);
            }
        });
    }

    public final void registerSCOReceiver(@aa1 Application mApp) {
        Intrinsics.X0O(mApp, "mApp");
        if (Build.VERSION.SDK_INT >= 34) {
            ContextCompat.registerReceiver(mApp, new ScoStateReceiver(), new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
        } else {
            mApp.registerReceiver(new ScoStateReceiver(), new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        }
    }

    public final void setOutputStream(boolean z) {
        this.mIsStream = z;
    }

    public final void setPlayEnded(boolean z) {
        this.playEnded = z;
    }

    public final void setRecording(boolean z) {
        this.isRecording = z;
    }

    public final void setRecordingCallback(@aa1 OnRecordingCallback callback) {
        Intrinsics.X0O(callback, "callback");
        if (this.recordingCallback != null) {
            this.recordingCallback = null;
        }
        this.recordingCallback = callback;
    }

    public final void setScoOnOpen() {
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            audioManager.setBluetoothScoOn(true);
        }
    }

    public final void setStartBluetooth() {
        if (this.audioManager == null) {
            Object systemService = Utils.getApp().getSystemService("audio");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.audioManager = (AudioManager) systemService;
        }
        AudioManager audioManager = this.audioManager;
        boolean zIsBluetoothScoOn = audioManager != null ? audioManager.isBluetoothScoOn() : false;
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = this.TAG;
        VoiceManager voiceManager = VoiceManager.INSTANCE;
        boolean zIsRecordBluetooth = voiceManager.isRecordBluetooth();
        AudioManager audioManager2 = this.audioManager;
        Integer numValueOf = audioManager2 != null ? Integer.valueOf(audioManager2.getMode()) : null;
        AudioManager audioManager3 = this.audioManager;
        i1o0oxo1o.OXO1(str + "  startBluetoothSco isRecordBluetooth = " + zIsRecordBluetooth + " , isOn = " + zIsBluetoothScoOn + ", , mode = " + numValueOf + "  , isBluetoothScoOn = " + (audioManager3 != null ? Boolean.valueOf(audioManager3.isBluetoothScoOn()) : null));
        if (!voiceManager.isRecordBluetooth()) {
            AudioManager audioManager4 = this.audioManager;
            if (audioManager4 != null) {
                audioManager4.setMode(0);
            }
            AudioManager audioManager5 = this.audioManager;
            if (audioManager5 != null) {
                audioManager5.setBluetoothScoOn(false);
            }
        } else if (!zIsBluetoothScoOn) {
            if (RomUtils.isMeizu()) {
                AudioManager audioManager6 = this.audioManager;
                if (audioManager6 != null) {
                    audioManager6.setMode(3);
                }
            } else {
                AudioManager audioManager7 = this.audioManager;
                if (audioManager7 != null) {
                    audioManager7.setMode(2);
                }
            }
            AudioManager audioManager8 = this.audioManager;
            if (audioManager8 != null) {
                audioManager8.setSpeakerphoneOn(false);
            }
            AudioManager audioManager9 = this.audioManager;
            if (audioManager9 != null) {
                audioManager9.setMicrophoneMute(false);
            }
            AudioManager audioManager10 = this.audioManager;
            if (audioManager10 != null) {
                audioManager10.startBluetoothSco();
            }
        }
        String str2 = this.TAG;
        AudioManager audioManager11 = this.audioManager;
        i1o0oxo1o.OXO1(str2 + " startBluetoothSco end  mode = " + (audioManager11 != null ? Integer.valueOf(audioManager11.getMode()) : null));
    }

    public final void startRealTimeASR(@tb1 OnRecordingCallback onRecordingCallback) {
        if (onRecordingCallback != null) {
            setRecordingCallback(onRecordingCallback);
        }
        AISparkChainManager.XXO(AISparkChainManager.OXO1, 0, false, 3, null);
    }

    public final void startRecord() {
        recordAudio();
    }

    public final void stopRecording() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " stopRecording");
        if (this.isRecording) {
            this.isRecording = false;
        }
    }
}
