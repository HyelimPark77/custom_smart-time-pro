package com.sma.smartv3.biz.voice;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aj6;
import com.android.mltcode.paycertificationapi.bj6;
import com.android.mltcode.paycertificationapi.cj6;
import com.android.mltcode.paycertificationapi.dj6;
import com.android.mltcode.paycertificationapi.ej6;
import com.android.mltcode.paycertificationapi.gq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1iXIO;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.wi6;
import com.android.mltcode.paycertificationapi.xi6;
import com.android.mltcode.paycertificationapi.yi6;
import com.android.mltcode.paycertificationapi.zi6;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.baidu.ai.speech.realtime.full.connection.Runner;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.ironsource.G5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.AIWatchFaceManager;
import com.sma.smartv3.biz.VoiceService;
import com.sma.smartv3.biz.dcs.DcsToken;
import com.sma.smartv3.biz.voice.ai.WebSocketManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetAIAudioToText;
import com.sma.smartv3.network.GetDcsToken;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.BleVoice;
import com.szabh.smable3.entity.Languages;
import java.io.File;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "")
@SourceDebugExtension({"SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,2515:1\n1869#2,2:2516\n1563#2:2522\n1634#2,2:2523\n1636#2:2526\n1563#2:2534\n1634#2,2:2535\n1636#2:2538\n1869#2,2:2541\n1#3:2518\n39#4,3:2519\n42#4:2525\n44#4,2:2527\n31#4,2:2529\n39#4,3:2531\n42#4:2537\n44#4,2:2539\n31#4,2:2543\n18#4,2:2578\n15#4:2580\n176#5,11:2545\n196#5:2564\n183#5,4:2565\n196#5:2577\n252#6,7:2556\n270#6:2563\n252#6,7:2569\n270#6:2576\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager\n*L\n508#1:2516,2\n681#1:2522\n681#1:2523,2\n681#1:2526\n1388#1:2534\n1388#1:2535,2\n1388#1:2538\n1391#1:2541,2\n681#1:2519,3\n681#1:2525\n681#1:2527,2\n685#1:2529,2\n1388#1:2531,3\n1388#1:2537\n1388#1:2539,2\n1396#1:2543,2\n1664#1:2578,2\n1664#1:2580\n1603#1:2545,11\n1603#1:2564\n1637#1:2565,4\n1637#1:2577\n1603#1:2556,7\n1603#1:2563\n1637#1:2569,7\n1637#1:2576\n*E\n"})
public final class VoiceManager {
    private static final long CONVENTIONAL_IDENTIFY_TIME = 0;
    private static final long FIRST_IDENTIFY_TIME = 0;

    @aa1
    public static final VoiceManager INSTANCE = null;
    private static final long SECOND_IDENTIFY_TIME = 0;

    @aa1
    private static final String TAG = "AIManager VoiceManager";

    @aa1
    private static final String TAG_OPENAICHATCOMPLETION = "openAiChatCompletion";
    private static boolean isActivityData;
    private static boolean isAiTaskRunning;
    private static boolean isEndInOperation;
    private static volatile boolean isRealTimeRunning;
    private static boolean isReceiveRecordPacket;
    private static boolean isRecordBluetooth;
    private static boolean isSendResults;
    private static boolean isSpeechRecRunning;
    private static int mAIMode;

    @aa1
    private static final O1XIiIO<AIAnswer> mAISparkChainManagerCallback = null;
    private static Application mApp;

    @aa1
    private static final VoiceManager$mBleHandleCallback$1 mBleHandleCallback = null;

    @aa1
    private static String mContentResult;

    @tb1
    private static ThreadUtils.SimpleTask<Void> mDuserTask;

    @tb1
    private static Runner mFullRunner;

    @tb1
    private static PipedInputStream mInputStream;
    private static int mLanguage;

    @tb1
    private static Function3<? super Integer, ? super Integer, ? super Integer, Boolean> mListener;

    @tb1
    private static ThreadUtils.SimpleTask<Void> mOpenAiTask;

    @aa1
    private static final File mOpusFile = null;

    @tb1
    private static OpusManager mOpusManager;

    @tb1
    private static PipedOutputStream mOutputStream;

    @aa1
    private static final File mPcmFile = null;

    @aa1
    private static String mSavePcmTime;
    private static int mToLanguage;
    private static int mVoiceMode;
    private static int mVoiceType;

    @aa1
    private static final File mWavFile = null;

    @aa1
    private static final MicrosoftSDKManage.iO microsoftCallBack = null;

    @aa1
    private static String microsoftLanguage;
    private static long microsoftTime;

    @aa1
    private static String microsoftTtsLanguage;

    @aa1
    private static String microsoftTtsName;

    @aa1
    private static final RecordingManager.OnRecordingCallback recordingCallBack = null;
    private static boolean resetCallBack;

    /* JADX WARN: Type inference failed for: r1v6, types: [com.sma.smartv3.biz.voice.VoiceManager$mBleHandleCallback$1] */
    static {
        INSTANCE = new VoiceManager();
        mOpusFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.opus");
        mSavePcmTime = "";
        mPcmFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.pcm");
        mWavFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.wav");
        mLanguage = -1;
        mToLanguage = -1;
        mAIMode = -1;
        mVoiceType = -1;
        mBleHandleCallback = new VoiceManager$mBleHandleCallback$1();
        microsoftLanguage = "zh-CN";
        microsoftTtsName = "zh-CN-XiaoxiaoNeural";
        microsoftTtsLanguage = "zh-CN";
        isRecordBluetooth = true;
        mContentResult = "";
        microsoftCallBack = new VoiceManager$microsoftCallBack$1();
        recordingCallBack = new VoiceManager$recordingCallBack$1();
        FIRST_IDENTIFY_TIME = 2000;
        SECOND_IDENTIFY_TIME = 1000;
        CONVENTIONAL_IDENTIFY_TIME = 100;
        microsoftTime = 2000;
        mAISparkChainManagerCallback = new VoiceManager$mAISparkChainManagerCallback$1();
    }

    private VoiceManager() {
    }

    public static /* synthetic */ void AIChat$default(VoiceManager r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = "tag";
    L5:
        r0.AIChat(r1, r2);
    }

    public static /* synthetic */ Unit I0IIOi(boolean r0) {
        return oldReceiveRecordPacketSC$lambda$0(r0);
    }

    public static /* synthetic */ Unit IiI10X(boolean r0) {
        return newReceiveRecordPacket$lambda$0(r0);
    }

    public static /* synthetic */ void O00(long r0, long r2) {
        openAiTranscriptionsAudio$lambda$0(r0, r2);
    }

    public static /* synthetic */ void OIi0(long r0, long r2) {
        aiTranscriptionsAudio$lambda$0(r0, r2);
    }

    public static /* synthetic */ long OXO1(File r2) {
        return savePcmFile$lambda$0$0(r2);
    }

    public static /* synthetic */ Unit XIi00iiXO() {
        return savePcmFile$lambda$0();
    }

    public static /* synthetic */ Unit XO0O10(String r0) {
        return sendContentResult$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit XOO0ii0(String r0, boolean r1) {
        return voiceQuery$lambda$0(r0, r1);
    }

    public static final /* synthetic */ int access$getMAIMode$p() {
        return mAIMode;
    }

    public static final /* synthetic */ Application access$getMApp$p() {
        return mApp;
    }

    public static final /* synthetic */ Runner access$getMFullRunner$p() {
        return mFullRunner;
    }

    public static final /* synthetic */ PipedInputStream access$getMInputStream$p() {
        return mInputStream;
    }

    public static final /* synthetic */ boolean access$isAiTaskRunning$p() {
        return isAiTaskRunning;
    }

    public static final /* synthetic */ boolean access$isRealTimeRunning$p() {
        return isRealTimeRunning;
    }

    public static final /* synthetic */ void access$oldOpenAiChatCompletion(VoiceManager r0) {
        r0.oldOpenAiChatCompletion();
    }

    public static final /* synthetic */ void access$pcmToWav(VoiceManager r0) {
        r0.pcmToWav();
    }

    public static final /* synthetic */ void access$pollCheckStop(VoiceManager r0) {
        r0.pollCheckStop();
    }

    public static final /* synthetic */ void access$sendContentResult(VoiceManager r0, String r1) {
        r0.sendContentResult(r1);
    }

    public static final /* synthetic */ void access$sendError(VoiceManager r0, String r1) {
        r0.sendError(r1);
    }

    public static final /* synthetic */ void access$sendMsg(VoiceManager r0, String r1) {
        r0.sendMsg(r1);
    }

    public static final /* synthetic */ void access$sendRealTime(VoiceManager r0, byte[] r1) {
        r0.sendRealTime(r1);
    }

    public static final /* synthetic */ void access$setAiTaskRunning$p(boolean r0) {
        isAiTaskRunning = r0;
    }

    public static final /* synthetic */ void access$setMAIMode$p(int r0) {
        mAIMode = r0;
    }

    public static final /* synthetic */ void access$setMFullRunner$p(Runner r0) {
        mFullRunner = r0;
    }

    public static final /* synthetic */ void access$setMInputStream$p(PipedInputStream r0) {
        mInputStream = r0;
    }

    public static final /* synthetic */ void access$setMOutputStream$p(PipedOutputStream r0) {
        mOutputStream = r0;
    }

    public static final /* synthetic */ void access$setRealTimeRunning$p(boolean r0) {
        isRealTimeRunning = r0;
    }

    public static final /* synthetic */ void access$stopRealTime(VoiceManager r0) {
        r0.stopRealTime();
    }

    public static final /* synthetic */ void access$translateITS(VoiceManager r0, String r1, String r2, String r3, String r4) {
        r0.translateITS(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void aiTranscriptionsAudio$default(VoiceManager r0, File r1, O1XIiIO r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.aiTranscriptionsAudio(r1, r2);
    }

    private static final void aiTranscriptionsAudio$lambda$0(long r0, long r2) {
    }

    private final void aiTranscriptionsAudioFile(File r2) {
        aiTranscriptionsAudio(r2, new C33971());
    }

    public static /* synthetic */ void checkBaiduAuth$default(VoiceManager r1, Activity r2, View r3, Function1 r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L8;
        r3 = null;
    L8:
        r1.checkBaiduAuth(r2, r3, r4);
    }

    private final void deleteFiles() {
        FileUtils.delete(mOpusFile);
        FileUtils.delete(mPcmFile);
        FileUtils.delete(mWavFile);
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        String r0 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.O10IXXX0X(r0, "format(...)");
        mSavePcmTime = r0;
    }

    public static /* synthetic */ long iO(Function1 r0, Object r1) {
        return savePcmFile$lambda$0$1(r0, r1);
    }

    private static final Unit newReceiveRecordPacket$lambda$0(boolean r3) {
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> decodeStream  opus to pcm error " + r3);
        if (r3 == false) goto L13;
        VoiceManager r4 = INSTANCE;
        if (r4.isSupportAIVoiceTranslation() == true) goto L7;
    L11:
        r4.pcmToWav();
        goto L13
    L7:
        if (mLanguage == (-1)) goto L11;
        if (mToLanguage == (-1)) goto L11;
        r4.sendAISparkChainTranslation();
    L13:
        return Unit.OXO1;
    }

    private final void oldOpenAiChatCompletion() {
        openAiTranscriptionsAudio(mWavFile, new C34011());
    }

    private static final Unit oldReceiveRecordPacketSC$lambda$0(boolean r4) {
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager mOpusManager -> decodeStream  opus to pcm  " + r4);
        if (r4 == false) goto L19;
        VoiceManager r5 = INSTANCE;
        if (r5.isSupportAIVoiceTranslation() == true) goto L7;
    L11:
        q62 r0 = q62.OXO1;
        if (r0.OIXOOi() == false) goto L15;
        r5.sendAISparkChainIdentify();
        goto L19
    L15:
        if (r0.IiX1ii() == false) goto L17;
        r5.recognition();
        goto L19
    L17:
        new gq1(16000, 16, 2).OXO1(mPcmFile.getPath(), mWavFile.getPath());
        r5.oldOpenAiChatCompletion();
        goto L19
    L7:
        if (mLanguage == (-1)) goto L11;
        if (mToLanguage == (-1)) goto L11;
        r5.sendAISparkChainTranslation();
    L19:
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openAiCheck$default(VoiceManager r1, String r2, O1XIiIO r3, Activity r4, View r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r6 & 8) == 0) goto L11;
        r5 = null;
    L11:
        r1.openAiCheck(r2, r3, r4, r5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openAiTranscriptionsAudio$default(VoiceManager r0, File r1, O1XIiIO r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.openAiTranscriptionsAudio(r1, r2);
    }

    private static final void openAiTranscriptionsAudio$lambda$0(long r0, long r2) {
    }

    private final void pcmToWav() {
        gq1 r0 = new gq1(16000, 16, 2);
        String r1 = mPcmFile.getPath();
        File r2 = mWavFile;
        r0.OXO1(r1, r2.getPath());
        INSTANCE.aiTranscriptionsAudioFile(r2);
    }

    private final void pollCheckStop() {
        final Timer r0 = new Timer();
        r0.schedule(new VoiceManager$pollCheckStop$timerTask$1(r0), 500, 500);
    }

    public static /* synthetic */ void postEvent$default(VoiceManager r0, String r1, Object r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = new Object();
    L5:
        r0.postEvent(r1, r2);
    }

    private final void savePcmFile() {
        ThreadsKt.iO(false, false, null, null, 0, new xi6(), 31, null);
    }

    private static final Unit savePcmFile$lambda$0() {
        if (mSavePcmTime.length() <= 0) goto L14;
        Thread.sleep(2000);
        File r0 = new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm");
        if (r0.exists() == true) goto L7;
        FileUtils.createOrExistsDir(r0);
    L7:
        FileUtils.copy(mPcmFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + mSavePcmTime + ".pcm"));
        File[] r1 = r0.listFiles();
        if (r1 == null) goto L12;
        final Function1 r2 = new yi6();
        Comparator r3 = Comparator.comparingLong(new zi6(r2));
        Intrinsics.O10IXXX0X(r3, "comparingLong(...)");
        ArraysKt___ArraysJvmKt.O1I(r1, r3);
        if (r1.length <= 10) goto L12;
        ((File) ArraysKt___ArraysKt.IO0(r1)).delete();
    L12:
        mSavePcmTime = "";
    L14:
        return Unit.OXO1;
    }

    private static final long savePcmFile$lambda$0$0(File r2) {
        return r2.lastModified();
    }

    private static final long savePcmFile$lambda$0$1(Function1 r0, Object r1) {
        return ((Number) r0.invoke(r1)).longValue();
    }

    private final void sendContentResult(String r9) {
        if (StringsKt__StringsKt.iX1X1(r9).toString().length() != 0) goto L7;
        sendTranslationResultInput(UtilsKt.XXO(R.string.speech_recognition_error));
        return;
    L7:
        if (isVoiceAIIdentify() == false) goto L10;
        sendTranslationResultInput(r9);
        return;
    L10:
        monitor-enter(r9);
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager  sendContentResult  str");     // Catch: Throwable -> L18
        VoiceManager r0 = INSTANCE;     // Catch: Throwable -> L18
        r0.sendTranslationResultInput(r9);     // Catch: Throwable -> L18
        if (r0.isSupportAIVoiceWatchface() == false) goto L20;
        String r3 = r9;
        AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, r3, null, mAIMode, 2, null);     // Catch: Throwable -> L16
    L27:
        Unit r10 = Unit.OXO1;     // Catch: Throwable -> L16
        monitor-exit(r3);
        return;
    L20:
        r3 = r9;
        if (r0.isSupportEarPhoneVoiceTranslation() == false) goto L23;
    L26:
        String r11 = Languages.INSTANCE.formatMicrosoftTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);     // Catch: Throwable -> L16
        MicrosoftSDKManage.XIi00iiXO r1 = MicrosoftSDKManage.O1O;     // Catch: Throwable -> L16
        r1.OXO1().IXI();     // Catch: Throwable -> L16
        r1.OXO1().OI(r3, r11, new dj6());     // Catch: Throwable -> L16
        goto L27
    L23:
        if (r0.isSupportAIVoiceTranslation() == true) goto L26;
        r0.toAIChatManagerHandleResponse(r3);     // Catch: Throwable -> L16
    L16:
        th = th;
    L17:
        Throwable r12 = th;
        monitor-exit(r3);
        throw r12;
    L18:
        th = th;
        r3 = r9;
        goto L17
    }

    private static final Unit sendContentResult$lambda$0$0(String r2) {
        Intrinsics.X0O(r2, "it");
        DcsTtsPlayer.INSTANCE.stop();
        INSTANCE.sendTranslationResultOutput(r2);
        MicrosoftSDKManage.O1O.OXO1().XXIIO1i11(r2, microsoftTtsName);
        mContentResult = "";
        return Unit.OXO1;
    }

    private final void sendError(String r2) {
        isSpeechRecRunning = false;
        sendMsg(r2);
    }

    public static /* synthetic */ void sendError$default(VoiceManager r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = Utils.getApp().getString(R.string.request_error);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
    L5:
        r0.sendError(r1);
    }

    private final void sendMsg(String r11) {
        long r5 = System.currentTimeMillis();
        int r1 = 0;
        int r2 = 0;
        BleVoice.BleDeviceEmotion r4 = null;
        senAudioTextToDevice(new BleVoice(r1, r2, mVoiceMode, r4, r5, r11, 10, null));
    }

    private final void sendRealTime(byte[] r2) {
        PipedOutputStream r0 = mOutputStream;     // Catch: Exception -> L6
        if (r0 == null) goto L11;
        r0.write(r2);     // Catch: Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public static /* synthetic */ void setLanguageType$default(VoiceManager r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        r1.setLanguageType(r2, r3);
    }

    private final void startRealTime() {
        if (isRealTimeRunning == false) goto L5;
        return;
    L5:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager -> startRealTime");
        ThreadUtils.executeByIo(new C34121());
    }

    public static /* synthetic */ void startTransfer$default(VoiceManager r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        r0.startTransfer(r1);
    }

    private final void stopRealTime() {
        PipedInputStream r2 = mInputStream;     // Catch: Throwable -> L6 Exception -> L8
        if (r2 == null) goto L10;
        r2.close();     // Catch: Throwable -> L6 Exception -> L8
    L10:
        PipedOutputStream r3 = mOutputStream;     // Catch: Throwable -> L6 Exception -> L8
        if (r3 == null) goto L13;
        r3.close();     // Catch: Throwable -> L6 Exception -> L8
    L13:
        mInputStream = null;
        mOutputStream = null;
        mFullRunner = null;
        isRealTimeRunning = false;
        return;
    L8:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L6
        mInputStream = null;
        mOutputStream = null;
        mFullRunner = null;
        isRealTimeRunning = false;
        return;
    L6:
        th = move-exception;
        mInputStream = null;
        mOutputStream = null;
        mFullRunner = null;
        isRealTimeRunning = false;
        throw th;
    }

    private final void toAIChatManagerHandleResponse(String r28) {
        if (isVoiceAIIdentify() == false) goto L7;
        sendMsg(r28);
        return;
    L7:
        if (isSupportAIVoiceWatchface() == false) goto L10;
        AIWatchFaceManager.XiOIii1(AIWatchFaceManager.OXO1, r28, null, 0, 6, null);
        return;
    L10:
        sendMsg(r28);
        JsonArray r1 = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L16
        Intrinsics.XXI(r1);     // Catch: Exception -> L16
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));     // Catch: Exception -> L16
        Iterator<JsonElement> r3 = r1.iterator();     // Catch: Exception -> L16
    L13:
        if (r3.hasNext() == false) goto L17;
        r2.add(new Gson().fromJson(r3.next(), VoiceMessage.class));     // Catch: Exception -> L16
    L17:
        List r13 = CollectionsKt___CollectionsKt.OO0Oi10(r2);
        VoiceManager r14 = INSTANCE;
        postEvent$default(r14, I01XX0.X111IO, null, 2, null);
        r13.add(new VoiceMessage(0, null, 1, r28, null, 0, 0, 115, null));
        r13.add(new VoiceMessage(0, null, 2, "", null, 1, mAIMode, 19, null));
        a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(r13));
        postEvent$default(r14, I01XX0.X00O0, null, 2, null);
        if (i72.OXO1.I0IIOI() == false) goto L28;
        int r4 = mAIMode;
        if (r4 < 0) goto L28;
        if (r4 > 3) goto L28;
        if (r4 != 2) goto L27;
        q62 r5 = q62.OXO1;
        if (r5.OIXOOi() == false) goto L27;
        AISparkChainManager.OXO1.iXiiiO(r28, mAISparkChainManagerCallback, r5.iXOII(), true);
        return;
    L27:
        AIChat(r28, "toAIChatManagerHandleResponse");
        return;
    L28:
        q62 r6 = q62.OXO1;
        if (r6.OIXOOi() == false) goto L32;
        AISparkChainManager.OXO1.iXiiiO(r28, mAISparkChainManagerCallback, r6.iXOII(), true);
        return;
    L32:
        if (r6.XOX() == false) goto L35;
        AIChat(r28, "toAIChatManagerHandleResponse isUseAIService");
        return;
    L35:
        if (r6.IiX1ii() == false) goto L37;
        voiceQuery(r28);
        return;
    L37:
        openAiChatCompletion(r28);
        return;
    L16:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L17
    }

    private final void translateITS(final String r4, String r5, final String r6, String r7) {
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager  translateITS leftLang = " + r5 + " , rightLang = " + r6);
        AISparkChainManager r0 = AISparkChainManager.OXO1;
        if (r7.length() != 0) goto L5;
        r7 = r4;
    L5:
        r0.IX1XiI(r7, r5, r6, new C34162(r4, r6));
    }

    public static /* synthetic */ void translateITS$default(VoiceManager r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = "cn";
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = Languages.DEFAULT_LANGUAGE;
    L9:
        if ((r5 & 8) == 0) goto L11;
        r4 = "";
    L11:
        r0.translateITS(r1, r2, r3, r4);
    }

    private static final Unit voiceQuery$lambda$0(String r0, boolean r1) {
        if (r1 == false) goto L5;
        INSTANCE.duserStreamChat(r0);
    L5:
        return Unit.OXO1;
    }

    public final void AIChat(@aa1 final String r11, @aa1 String r12) {
        Intrinsics.X0O(r11, "query");
        Intrinsics.X0O(r12, "tag");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager AIChat " + r12 + i1iXIO.XO0O10 + r11);
        isAiTaskRunning = true;
        AIManager r0 = AIManager.OXO1;
        AIQuestion r1 = new AIQuestion(AIFunctionType.AI, r11, null, null, false, false, 60, null);
        int r6 = mAIMode;
        r0.iIXi1iiXI(r1, new AnonymousClass1(r11), true, false, q62.OXO1.iXOII(), r6);
    }

    public final void aISparkChainManagerHandleResponse(@tb1 AITranslation r2) {
        if (r2 == null) goto L5;
        toAIChatManagerHandleResponse(r2.getText());
        return;
    L5:
        Application r3 = mApp;
        if (r3 != null) goto L8;
        Intrinsics.XXO("mApp");
        r3 = null;
    L8:
        String r4 = r3.getString(R.string.request_error);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        sendError(r4);
    }

    public final void aiTranscriptionsAudio(@aa1 File r8, @tb1 final O1XIiIO<String> r9) {
        Intrinsics.X0O(r8, "file");
        String r0 = AIManager.OXO1.XiOIii1(mAIMode);
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        String r2 = r1.getBaseUrl(GetAIAudioToText.URL_V2);
        Application r3 = Utils.getApp();
        Intrinsics.O10IXXX0X(r3, "getApp(...)");
        if (UtilsKt.IiiXiI0I(r3) == false) goto L5;
        String r4 = Languages.DEFAULT_LANGUAGE_ZH;
    L6:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager aiTranscriptionsAudio -> " + r8 + "  toLang = " + r4 + " , model = " + r0);
        AndroidNetworking.upload(r2).addHeaders(r1.getHeadersMap()).addQueryParameter("model", r0).addQueryParameter("toLang", r4).addMultipartFile("audioFile", r8).setTag("aiTranscriptionsAudio").setPriority(Priority.HIGH).build().setUploadProgressListener(new wi6()).getAsJSONObject(new AnonymousClass2(r9));
        return;
    L5:
        r4 = Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        goto L6
    }

    public final void checkBaiduAuth(@tb1 final Activity r6, @tb1 View r7, @aa1 final Function1<? super Boolean, Unit> r8) {
        Intrinsics.X0O(r8, "callback");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = GetDcsToken.INSTANCE.getURL();
        HashMap<String, String> r2 = RequestBodyKt.getDcsTokenBody();
        final O1XIiIO<DcsToken> r3 = new C33981(r8);
        final uq r9 = r0.loadPopup(r6, r7);
        String r10 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r1);
        r0.printParam(r10 + r1, r2);
        NetWork r4 = NetWork.OXO1;
        String r11 = r10 + r1;
        final O1XIiIO<Response<DcsToken>> r5 = new VoiceManager$checkBaiduAuth$$inlined$post$1(r6, r3, r9);
        AndroidNetworking.post(r11).addBodyParameter(r2).setTag(r11).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{DcsToken.class}), new VoiceManager$checkBaiduAuth$$inlined$post$2(r5));
    }

    public final void destroy() {
        stop();
        BleConnector.INSTANCE.removeHandleCallback(mBleHandleCallback);
        OpusManager r0 = mOpusManager;
        if (r0 == null) goto L5;
        r0.release();
    L5:
        mOpusManager = null;
    }

    public final void duserStreamChat(@aa1 String r5) {
        Intrinsics.X0O(r5, "query");
        isAiTaskRunning = true;
        AIManager r1 = AIManager.OXO1;
        r1.i0X000X0O(true);
        r1.X00XIX1(new C33991());
        q62 r2 = q62.OXO1;
        if (r2.OIXOOi() == false) goto L6;
        AISparkChainManager.OXO1.iXiiiO(r5, mAISparkChainManagerCallback, r2.iXOII(), true);
        return;
    L6:
        r1.I0IIOi(r5, AIFunctionType.AI, 2, r2.iXOII());
    }

    public final void endTransfer() {
        savePcmFile();
    }

    public final void getAiTranslationType(@aa1 BleRecordPacket r2) {
        Intrinsics.X0O(r2, "recordPacket");
        if (isSupportAIVoiceTranslation() == true) goto L7;
        if (isSupportEarPhoneVoiceTranslation() == true) goto L7;
        return;
    L7:
        if (r2.getMStatus() != 0) goto L11;
        mLanguage = r2.getMLanguage();
        mToLanguage = r2.getMToLanguage();
        return;
    }

    public final long getCONVENTIONAL_IDENTIFY_TIME() {
        return CONVENTIONAL_IDENTIFY_TIME;
    }

    public final long getFIRST_IDENTIFY_TIME() {
        return FIRST_IDENTIFY_TIME;
    }

    @aa1
    public final O1XIiIO<AIAnswer> getMAISparkChainManagerCallback() {
        return mAISparkChainManagerCallback;
    }

    @aa1
    public final String getMContentResult() {
        return mContentResult;
    }

    public final int getMLanguage() {
        return mLanguage;
    }

    @tb1
    public final Function3<Integer, Integer, Integer, Boolean> getMListener() {
        return mListener;
    }

    @aa1
    public final File getMOpusFile() {
        return mOpusFile;
    }

    @aa1
    public final File getMPcmFile() {
        return mPcmFile;
    }

    @aa1
    public final String getMSavePcmTime() {
        return mSavePcmTime;
    }

    public final int getMToLanguage() {
        return mToLanguage;
    }

    public final int getMVoiceMode() {
        return mVoiceMode;
    }

    public final int getMVoiceType() {
        return mVoiceType;
    }

    @aa1
    public final File getMWavFile() {
        return mWavFile;
    }

    @aa1
    public final MicrosoftSDKManage.iO getMicrosoftCallBack() {
        return microsoftCallBack;
    }

    @aa1
    public final String getMicrosoftLanguage() {
        return microsoftLanguage;
    }

    public final long getMicrosoftTime() {
        return microsoftTime;
    }

    @aa1
    public final String getMicrosoftTtsLanguage() {
        return microsoftTtsLanguage;
    }

    @aa1
    public final String getMicrosoftTtsName() {
        return microsoftTtsName;
    }

    @aa1
    public final RecordingManager.OnRecordingCallback getRecordingCallBack() {
        return recordingCallBack;
    }

    public final boolean getResetCallBack() {
        return resetCallBack;
    }

    public final long getSECOND_IDENTIFY_TIME() {
        return SECOND_IDENTIFY_TIME;
    }

    public final void goOnTransfer(@aa1 BleRecordPacket r3) {
        Intrinsics.X0O(r3, "recordPacket");
        isSpeechRecRunning = true;
        FileIOUtils.writeFileFromBytesByStream(mOpusFile, r3.getMPacket(), true);
    }

    public final void init(@aa1 Application r3) {
        Intrinsics.X0O(r3, "app");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager -> init");
        O11XO1X.XO0O10().X1ii(this);
        mApp = r3;
        BleConnector.INSTANCE.addHandleCallback(mBleHandleCallback);
        if (mOpusManager == null) goto L15;
    L8:
        RecordingManager.Companion r0 = RecordingManager.Companion;
        r0.getInstance().init(r3);
        r0.getInstance().registerSCOReceiver(r3);
        r0.getInstance().setRecordingCallback(recordingCallBack);
        String r1 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
        if (r1.length() <= 0) goto L12;
        MicrosoftSDKManage.O1O.OXO1().iI0I(r1);
    L12:
        if (q62.OXO1.iX0iiiXi() == false) goto L17;
        WebSocketManager.INSTANCE.init(r3, false);
        return;
    L17:
        return;
    L15:
        mOpusManager = new OpusManager();     // Catch: Exception -> L6
    L6:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager -> opus init error！！！");
        goto L8
    }

    public final void initMicrosoftSDKManage() {
        MicrosoftSDKManage.XIi00iiXO r0 = MicrosoftSDKManage.O1O;
        r0.OXO1().OX110i();
        MicrosoftSDKManage r1 = r0.OXO1();
        Application r2 = mApp;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mApp");
        r2 = null;
    L5:
        r1.iiIOiX(r2);
        r0.OXO1().iIi1(microsoftCallBack, TAG);
        microsoftTime = FIRST_IDENTIFY_TIME;
    }

    public final void initV2(@aa1 Application r2) {
        Intrinsics.X0O(r2, "app");
        mApp = r2;
    }

    public final boolean isActivityData() {
        return isActivityData;
    }

    public final boolean isEndInOperation() {
        return isEndInOperation;
    }

    public final boolean isExpired() {
        Object r0 = new Gson().fromJson(a01.OXO1.IiI10X().getString(DcsToken.class.getName()), DcsToken.class);
        if (r0 != null) goto L5;
        r0 = DcsToken.class.newInstance();
    L5:
        DcsToken r1 = (DcsToken) r0;
        if ((System.currentTimeMillis() - r1.getTimestamp()) <= r1.getExpires_in()) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean isReceiveRecordPacket() {
        return isReceiveRecordPacket;
    }

    public final boolean isRecordBluetooth() {
        return isRecordBluetooth;
    }

    public final boolean isSendResults() {
        return isSendResults;
    }

    public final boolean isSpeechRecRunning() {
        return isSpeechRecRunning;
    }

    public final boolean isSupportAIVoiceTranslation() {
        if (mVoiceMode != 2) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isSupportAIVoiceWatchface() {
        if (mVoiceMode == 1) goto L5;
        return false;
    L5:
        if (q62.OXO1.OiXXXi10() == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean isSupportDevicePhoneVoiceAIChat() {
        if (mVoiceMode != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isSupportEarPhoneVoiceAIChat() {
        if (mVoiceMode != 3) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isSupportEarPhoneVoiceTranslation() {
        if (mVoiceMode != 4) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isTaskRunning() {
        i1O0OXO1O.OXO1.OXO1("isTaskRunning -> " + isAiTaskRunning + ", " + isSpeechRecRunning + I000IiI1O.iO.XO0O10 + isReceiveRecordPacket);
        if (isAiTaskRunning == false) goto L5;
        return true;
    L5:
        if (isSpeechRecRunning == false) goto L7;
        return true;
    L7:
        if (isReceiveRecordPacket == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final boolean isVoiceAIIdentify() {
        if (mVoiceMode != 6) goto L6;
        return true;
    L6:
        return false;
    }

    public final void newReceiveRecordPacket(@aa1 BleRecordPacket r5) {
        Intrinsics.X0O(r5, "recordPacket");
        int r0 = r5.getMStatus();
        if (r0 != 0) goto L5;
    L34:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket newReceiveRecordPacket START");
        startTransfer(r5.getMStatus());
        return;
    L5:
        if (r0 != 1) goto L7;
        goOnTransfer(r5);
        return;
    L7:
        if (r0 != 2) goto L9;
        i1O0OXO1O r6 = i1O0OXO1O.OXO1;
        BleCache r1 = BleCache.INSTANCE;
        r6.OXO1("AIManager VoiceManager BleRecordPacket newReceiveRecordPacket END BleCache.mPlatform = " + r1.getMPlatform());
        if (isSupportEarPhoneVoiceAIChat() == false) goto L14;
    L30:
        RecordingManager.Companion.getInstance().stopRecording();
        endTransfer();
        return;
    L14:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L30;
        File r2 = mOpusFile;
        if (FileUtils.isFileExists(r2) == true) goto L20;
        r6.OXO1("AIManager VoiceManager mOpusManager ->  FileUtils.isFileExists  false ");
        return;
    L20:
        stop();
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI) == true) goto L25;
        OpusManager r7 = mOpusManager;
        if (r7 == null) goto L28;
        String r3 = r2.getPath();
        Intrinsics.O10IXXX0X(r3, "getPath(...)");
        String r4 = mPcmFile.getPath();
        Intrinsics.O10IXXX0X(r4, "getPath(...)");
        r7.decodeFile(r3, r4, new C34001());
    L28:
        endTransfer();
        return;
    L25:
        OpusManager r8 = mOpusManager;
        if (r8 == null) goto L28;
        String r9 = r2.getAbsolutePath();
        Intrinsics.O10IXXX0X(r9, "getAbsolutePath(...)");
        String r10 = mPcmFile.getAbsolutePath();
        Intrinsics.O10IXXX0X(r10, "getAbsolutePath(...)");
        r8.decodeStream(r9, r10, new cj6());
        goto L28
    L9:
        if (r0 == 3) goto L34;
    }

    public final void oldReceiveRecordPacket(@aa1 BleRecordPacket r3) {
        Intrinsics.X0O(r3, "recordPacket");
        if (Intrinsics.XOO0ii0(BleCache.INSTANCE.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI) == false) goto L6;
        oldReceiveRecordPacketSC(r3);
        return;
    L6:
        oldReceiveRecordPacketJL(r3);
    }

    public final void oldReceiveRecordPacketJL(@aa1 BleRecordPacket r8) {
        Intrinsics.X0O(r8, "recordPacket");
        q62 r0 = q62.OXO1;
        if (r0.OIXOOi() == false) goto L5;
    L66:
        int r1 = r8.getMStatus();
        if (r1 == 0) goto L96;
        if (r1 == 1) goto L86;
        if (r1 == 2) goto L76;
        if (r1 != 3) goto L119;
        stop();
        OpusManager r9 = mOpusManager;
        if (r9 == null) goto L113;
        r9.stopDecodeStream();
        return;
    L113:
        return;
    L119:
        return;
    L76:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL END ,  BleCache.mPlatform = " + BleCache.INSTANCE.getMPlatform() + "  isSupportSparkChainAI = " + r0.OIXOOi());
        if (isSupportEarPhoneVoiceAIChat() == false) goto L79;
    L82:
        RecordingManager.Companion.getInstance().stopRecording();
    L83:
        endTransfer();
        return;
    L79:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L82;
        isSpeechRecRunning = false;
        RecordingManager.realTimeASRend$default(RecordingManager.Companion.getInstance(), 0, 0, 3, null);
        goto L83
    L86:
        if (isSupportEarPhoneVoiceAIChat() == false) goto L88;
    L94:
        goOnTransfer(r8);
        return;
    L88:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L94;
        isSpeechRecRunning = true;
        OpusManager r2 = mOpusManager;
        if (r2 == null) goto L114;
        r2.writeAudioStream(r8.getMPacket());
        return;
    L114:
        return;
    L96:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL , isSupportSparkChainAI = " + r0.OIXOOi());
        if (isSupportEarPhoneVoiceAIChat() == false) goto L99;
    L108:
        startTransfer(r8.getMStatus());
        return;
    L99:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L108;
        stop();
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        RecordingManager.startRealTimeASR$default(RecordingManager.Companion.getInstance(), null, 1, null);
        OpusManager r10 = mOpusManager;
        if (r10 == null) goto L104;
        r10.stopDecodeStream();
    L104:
        OpusManager r11 = mOpusManager;
        if (r11 == null) goto L115;
        r11.startDecodeStream(new C34021());
        return;
    L115:
        return;
    L5:
        if (mAIMode == 2) goto L66;
        if (r0.IiX1ii() == false) goto L41;
        int r3 = r8.getMStatus();
        if (r3 == 0) goto L34;
        if (r3 == 1) goto L30;
        if (r3 == 2) goto L19;
        if (r3 != 3) goto L116;
        stopRealTime();
        stop();
        OpusManager r12 = mOpusManager;
        if (r12 == null) goto L110;
        r12.stopDecodeStream();
        return;
    L110:
        return;
    L116:
        return;
    L19:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL END  BleCache.mPlatform = " + BleCache.INSTANCE.getMPlatform());
        isSpeechRecRunning = false;
        if (isSupportEarPhoneVoiceAIChat() == false) goto L22;
    L27:
        RecordingManager.Companion.getInstance().stopRecording();
    L28:
        endTransfer();
        return;
    L22:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L27;
        OpusManager r13 = mOpusManager;
        if (r13 == null) goto L28;
        r13.stopDecodeStream();
        goto L28
    L30:
        isSpeechRecRunning = true;
        OpusManager r4 = mOpusManager;
        if (r4 == null) goto L111;
        r4.writeAudioStream(r8.getMPacket());
        return;
    L111:
        return;
    L34:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL ");
        stopRealTime();
        stop();
        startRealTime();
        OpusManager r14 = mOpusManager;
        if (r14 == null) goto L37;
        r14.stopDecodeStream();
    L37:
        OpusManager r15 = mOpusManager;
        if (r15 == null) goto L112;
        r15.startDecodeStream(new C34032());
        return;
    L112:
        return;
    L41:
        int r5 = r8.getMStatus();
        if (r5 == 0) goto L64;
        if (r5 == 1) goto L62;
        if (r5 == 2) goto L47;
        if (r5 == 3) goto L64;
        return;
    L47:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL  openai  end  BleCache.mPlatform = " + BleCache.INSTANCE.getMPlatform());
        if (isSupportEarPhoneVoiceAIChat() == false) goto L50;
    L60:
        RecordingManager.Companion.getInstance().stopRecording();
        endTransfer();
        return;
    L50:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L60;
        File r16 = mOpusFile;
        if (FileUtils.isFileExists(r16) == false) goto L118;
        stop();
        OpusManager r6 = mOpusManager;
        if (r6 == null) goto L58;
        String r17 = r16.getPath();
        Intrinsics.O10IXXX0X(r17, "getPath(...)");
        String r7 = mPcmFile.getPath();
        Intrinsics.O10IXXX0X(r7, "getPath(...)");
        r6.decodeFile(r17, r7, new AnonymousClass3());
    L58:
        endTransfer();
        return;
    L118:
        return;
    L62:
        goOnTransfer(r8);
        return;
    L64:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL  openai  START");
        startTransfer(r8.getMStatus());
    }

    public final void oldReceiveRecordPacketSC(@aa1 BleRecordPacket r8) {
        Intrinsics.X0O(r8, "recordPacket");
        int r0 = r8.getMStatus();
        if (r0 == 0) goto L48;
        if (r0 == 1) goto L34;
        if (r0 == 2) goto L10;
        if (r0 != 3) goto L65;
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC Suspend 发3退出");
        return;
    L65:
        return;
    L10:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC END --> BleCache.mPlatform = " + BleCache.INSTANCE.getMPlatform());
        stop();
        isEndInOperation = false;
        if (q62.OXO1.OIXOOi() == true) goto L15;
        if (mAIMode == 2) goto L15;
    L19:
        if (isSupportEarPhoneVoiceAIChat() == false) goto L21;
    L31:
        RecordingManager.Companion.getInstance().stopRecording();
        endTransfer();
        return;
    L21:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L31;
        File r9 = mOpusFile;
        if (FileUtils.isFileExists(r9) == false) goto L66;
        OpusManager r1 = mOpusManager;
        if (r1 == null) goto L29;
        String r10 = r9.getAbsolutePath();
        Intrinsics.O10IXXX0X(r10, "getAbsolutePath(...)");
        String r2 = mPcmFile.getAbsolutePath();
        Intrinsics.O10IXXX0X(r2, "getAbsolutePath(...)");
        r1.decodeStream(r10, r2, new aj6());
    L29:
        endTransfer();
        return;
    L66:
        return;
    L15:
        if (r8.getMMode() >= 3) goto L19;
        RecordingManager.realTimeASRend$default(RecordingManager.Companion.getInstance(), 0, 0, 3, null);
        endTransfer();
        return;
    L34:
        if (isEndInOperation == true) goto L36;
        return;
    L36:
        if (q62.OXO1.OIXOOi() == true) goto L40;
        if (mAIMode == 2) goto L40;
    L45:
        goOnTransfer(r8);
        return;
    L40:
        if (r8.getMMode() >= 3) goto L45;
        OpusManager r3 = mOpusManager;
        if (r3 == null) goto L64;
        r3.writeAudioStream(r8.getMPacket());
        return;
    L64:
        return;
    L48:
        if (q62.OXO1.OIXOOi() == true) goto L52;
        if (mAIMode == 2) goto L52;
    L61:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC START");
        startTransfer(r8.getMStatus());
        return;
    L52:
        if (r8.getMStatus() != 0) goto L61;
        if (r8.getMMode() >= 3) goto L61;
        isEndInOperation = true;
        RecordingManager.startRealTimeASR$default(RecordingManager.Companion.getInstance(), null, 1, null);
        OpusManager r4 = mOpusManager;
        if (r4 == null) goto L58;
        r4.stopDecodeStream();
    L58:
        OpusManager r5 = mOpusManager;
        if (r5 == null) goto L61;
        r5.startDecodeStream(new C34041());
        goto L61
    }

    @sf5(tag = I01XX0.i100IXOX)
    public final void onStopVoice(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onStopVoice");
        stop();
    }

    @sf5(tag = I01XX0.iIi1)
    public final void onVoiceQuery(@aa1 String r4) {
        Intrinsics.X0O(r4, "text");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager onVoiceQuery -> app: " + r4);
        mVoiceMode = 0;
        stop();
        sendMsg(r4);
        voiceQuery(r4);
    }

    @Deprecated(message = "这种需要aikey直连openai的方式后面要废弃")
    public final void openAiChatCompletion(@aa1 final String r2) {
        Intrinsics.X0O(r2, "query");
        ThreadUtils.SimpleTask<Void> r0 = new C34051(r2);
        mOpenAiTask = r0;
        ThreadUtils.executeByIo(r0);
    }

    public final void openAiCheck(@aa1 String r8, @tb1 final O1XIiIO<String> r9, @tb1 Activity r10, @tb1 View r11) {
        Intrinsics.X0O(r8, "aikey");
        final uq r0 = null;
        if (r11 == null) goto L6;
        if (r10 == null) goto L6;
        r0 = new uq(r10);
        r0.I1XOi1(r11);
    L6:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager openAiCheck");
        ANRequest.PostRequestBuilder r12 = AndroidNetworking.post(AIManager.XXI).setContentType(G5.L).addHeaders("Authorization", "Bearer " + r8);
        byte[] r13 = AIManager.OiIIX101O(AIManager.OXO1, "hello", false, 0, 4, null).getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r13, "getBytes(...)");
        r12.addByteBody(r13).setPriority(Priority.LOW).setTag("openAiChatCompletion").build().getAsJSONObject(new C34061(r0, r9));
    }

    public final void openAiTranscriptionsAudio(@aa1 File r6, @tb1 final O1XIiIO<String> r7) {
        Intrinsics.X0O(r6, "file");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager openAiTranscriptionsAudio -> " + r6);
        String r1 = q62.OXO1.iIiiO();
        if (r1 != null) goto L5;
    L9:
        if (r7 == null) goto L12;
        r7.handleError("invalid_request_error");
        return;
    L12:
        return;
    L5:
        if (StringsKt__StringsKt.i0XI0(r1) == true) goto L9;
        AndroidNetworking.upload("https://api.openai.com/v1/audio/transcriptions").addHeaders("Authorization", "Bearer " + r1).addMultipartParameter("model", "whisper-1").addMultipartFile("file", r6).setTag("openAiTranscriptionsAudio").setPriority(Priority.HIGH).build().setUploadProgressListener(new ej6()).getAsJSONObject(new C34072(r7));
    }

    public final void postEvent(@aa1 String r2, @aa1 Object r3) {
        Intrinsics.X0O(r2, "tag");
        Intrinsics.X0O(r3, "data");
        O11XO1X.XO0O10().OIX0iXi(r3, r2);
    }

    public final void recognition() {
        if (q62.OXO1.OIXOOi() == false) goto L6;
        sendAISparkChainIdentify();
        return;
    L6:
        ThreadUtils.executeByIo(new C34081());
    }

    public final void refreshToken(@aa1 final Function1<? super Boolean, Unit> r8) {
        Intrinsics.X0O(r8, "callback");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager refreshToken");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = GetDcsToken.INSTANCE.getURL();
        HashMap<String, String> r2 = RequestBodyKt.getDcsTokenBody();
        final O1XIiIO<DcsToken> r3 = new C34091(r8);
        final Activity r9 = null;
        final uq r4 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r1);
        r0.printParam(r5 + r1, r2);
        NetWork r6 = NetWork.OXO1;
        String r7 = r5 + r1;
        final O1XIiIO<Response<DcsToken>> r10 = new VoiceManager$refreshToken$$inlined$post$default$1(r9, r3, r4);
        AndroidNetworking.post(r7).addBodyParameter(r2).setTag(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{DcsToken.class}), new VoiceManager$refreshToken$$inlined$post$default$2(r10));
    }

    public final void resetPlayStatus() {
        JsonArray r2 = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r2);     // Catch: Exception -> L8
        Collection r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r4 = r2.iterator();     // Catch: Exception -> L8
    L5:
        if (r4.hasNext() == false) goto L9;
        r3.add(new Gson().fromJson(r4.next(), VoiceMessage.class));     // Catch: Exception -> L8
    L9:
        List r5 = CollectionsKt___CollectionsKt.OO0Oi10(r3);
        Iterator r6 = r5.iterator();
    L11:
        if (r6.hasNext() == false) goto L15;
        VoiceMessage r7 = (VoiceMessage) r6.next();
        if (r7.getMType() != 3) goto L11;
        r7.setMStatus(0);
        goto L11
    L15:
        a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(r5));
        postEvent$default(INSTANCE, I01XX0.X00O0, null, 2, null);
        return;
    L8:
        r3 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    public final void senAudioTextToDevice(@aa1 BleVoice r10) {
        Intrinsics.X0O(r10, "voice");
        if (q62.OXO1.I0OX() == true) goto L6;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r10, false, false, 24, null);
        return;
    }

    public final void sendAISparkChainIdentify() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1("AIManager VoiceManager sendAISparkChainIdentify  pcm -> wav");
        new gq1(16000, 16, 2).OXO1(mPcmFile.getPath(), mWavFile.getPath());
        r0.OXO1("AIManager VoiceManager sendAISparkChainIdentify  pcm -> wav");
        ThreadUtils.executeByIo(new C34102());
    }

    public final void sendAISparkChainTranslation() {
        if (q62.OXO1.OIXOOi() == true) goto L5;
    L9:
        ToastUtils.showLong("Unauthorized", new Object[0]);
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        BleCache r2 = BleCache.INSTANCE;
        r0.XIi00iiXO("AIManager VoiceManager  translation It does not support sparkAIService, need to configure the current device , " + r2.getMBleName() + "  " + r2.getMFirmwareFlag() + "  " + r2.getMBleAddress() + " ");
        sendTranslationResult("不支持翻译", "Unauthorized");
        return;
    L5:
        if (mAIMode != 2) goto L9;
        ThreadUtils.executeByIo(new C34111());
    }

    public final void sendTranslationResult(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "inputText");
        Intrinsics.X0O(r3, "outputText");
        sendTranslationResultInput(r2);
        sendTranslationResultOutput(r3);
    }

    public final void sendTranslationResultInput(@aa1 String r12) {
        Intrinsics.X0O(r12, "inputText");
        long r6 = System.currentTimeMillis();
        String r8 = StringsKt__StringsKt.iX1X1(r12).toString();
        int r2 = 0;
        int r3 = 0;
        BleVoice.BleDeviceEmotion r5 = null;
        senAudioTextToDevice(new BleVoice(r2, r3, mVoiceMode, r5, r6, r8, 10, null));
    }

    public final void sendTranslationResultOutput(@aa1 String r12) {
        Intrinsics.X0O(r12, "outputText");
        long r6 = System.currentTimeMillis();
        String r8 = StringsKt__StringsKt.iX1X1(r12).toString();
        int r2 = 1;
        int r3 = 0;
        BleVoice.BleDeviceEmotion r5 = null;
        senAudioTextToDevice(new BleVoice(r2, r3, mVoiceMode, r5, r6, r8, 10, null));
    }

    public final void setAIMode(int r1) {
        mAIMode = r1;
    }

    public final void setActivityData(boolean r1) {
        isActivityData = r1;
    }

    public final void setEndInOperation(boolean r1) {
        isEndInOperation = r1;
    }

    public final void setLanguageType(@aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r6, "language");
        Intrinsics.X0O(r7, "mTtsName");
        if (Intrinsics.XOO0ii0(r6, "") == true) goto L5;
    L54:
        microsoftLanguage = r6;
        microsoftTtsName = r7;
        return;
    L5:
        if (Intrinsics.XOO0ii0(r7, "") == false) goto L54;
        Object r0 = null;
        if (isSupportEarPhoneVoiceTranslation() == false) goto L9;
    L30:
        Languages r8 = Languages.INSTANCE;
        String r1 = r8.formatMicrosoftTargetLang(mLanguage, Languages.DEFAULT_LANGUAGE_ZH);
        String r9 = r8.formatMicrosoftTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE_ZH);
        Iterator<T> r10 = LanguageTranslationKt.getTranslationLanguageList().iterator();
    L32:
        if (r10.hasNext() == false) goto L36;
        Object r2 = r10.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r2).getRtasrLanguage(), r1) == false) goto L32;
    L37:
        LanguageTranslationData r3 = (LanguageTranslationData) r2;
        Iterator<T> r11 = LanguageTranslationKt.getTranslationLanguageList().iterator();
    L39:
        if (r11.hasNext() == false) goto L43;
        Object r4 = r11.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r4).getRtasrLanguage(), r9) == false) goto L39;
        r0 = r4;
    L43:
        LanguageTranslationData r5 = (LanguageTranslationData) r0;
        if (r3 == null) goto L46;
        microsoftLanguage = r3.getAsrLanguage();
    L46:
        if (r5 == null) goto L48;
        microsoftTtsName = r5.getTtsViuceName();
        microsoftTtsLanguage = r5.getAsrLanguage();
    L48:
        i1O0OXO1O r12 = i1O0OXO1O.OXO1;
        if (r3 != null) goto L51;
        boolean r13 = true;
    L52:
        r12.OXO1("AIManager VoiceManager formatMicrosoftTargetLang language = " + r1 + " , translationLanguage = " + r13);
        return;
    L51:
        r13 = false;
        goto L52
    L36:
        r2 = null;
        goto L37
    L9:
        if (isSupportAIVoiceTranslation() == true) goto L30;
        Application r14 = mApp;
        if (r14 != null) goto L14;
        Intrinsics.XXO("mApp");
        r14 = null;
    L14:
        String r15 = r14.getResources().getConfiguration().locale.getLanguage();
        if (Intrinsics.XOO0ii0(r15, Languages.DEFAULT_LANGUAGE_ZH) == false) goto L18;
        microsoftLanguage = "zh-CN";
        microsoftTtsName = "zh-CN-XiaoxiaoNeural";
        return;
    L18:
        Iterator<T> r16 = LanguageTranslationKt.getTranslationLanguageList().iterator();
    L20:
        if (r16.hasNext() == false) goto L24;
        Object r17 = r16.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r17).getRtasrLanguage(), r15) == false) goto L20;
        r0 = r17;
    L24:
        LanguageTranslationData r18 = (LanguageTranslationData) r0;
        if (r18 == null) goto L28;
        microsoftLanguage = r18.getAsrLanguage();
        microsoftTtsName = r18.getTtsViuceName();
        return;
    L28:
        microsoftLanguage = "en-US";
        microsoftTtsName = "en-US-AvaMultilingualNeural";
    }

    public final void setMContentResult(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        mContentResult = r2;
    }

    public final void setMLanguage(int r1) {
        mLanguage = r1;
    }

    public final void setMListener(@tb1 Function3<? super Integer, ? super Integer, ? super Integer, Boolean> r1) {
        mListener = r1;
    }

    public final void setMSavePcmTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        mSavePcmTime = r2;
    }

    public final void setMToLanguage(int r1) {
        mToLanguage = r1;
    }

    public final void setMVoiceMode(int r1) {
        mVoiceMode = r1;
    }

    public final void setMVoiceType(int r1) {
        mVoiceType = r1;
    }

    public final void setMicrosoftCallback() {
        setRecordingCallback();
        MicrosoftSDKManage.O1O.OXO1().iIi1(microsoftCallBack, TAG);
    }

    public final void setMicrosoftLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        microsoftLanguage = r2;
    }

    public final void setMicrosoftTime(long r1) {
        microsoftTime = r1;
    }

    public final void setMicrosoftTtsLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        microsoftTtsLanguage = r2;
    }

    public final void setMicrosoftTtsName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        microsoftTtsName = r2;
    }

    public final void setReceiveRecordPacket(boolean r1) {
        isReceiveRecordPacket = r1;
    }

    public final void setRecordBluetooth(boolean r1) {
        isRecordBluetooth = r1;
    }

    public final void setRecordingCallback() {
        RecordingManager.Companion.getInstance().setRecordingCallback(recordingCallBack);
    }

    public final void setResetCallBack(boolean r1) {
        resetCallBack = r1;
    }

    public final void setSendResults(boolean r1) {
        isSendResults = r1;
    }

    public final void setSpeechRecRunning(boolean r1) {
        isSpeechRecRunning = r1;
    }

    public final void startRecord() {
        RecordingManager.Companion.getInstance().startRecord();
    }

    public final void startTransfer(int r4) {
        if (r4 != 0) goto L4;
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager startTransfer delete  File  start = " + r4);
        deleteFiles();
    L4:
        stop();
        if (r4 != 0) goto L16;
        if (isSupportEarPhoneVoiceAIChat() == false) goto L9;
    L14:
        VoiceService.I1.iO();
        voiceRecord();
        goto L16
    L9:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L14;
        OpusManager r5 = mOpusManager;
        if (r5 == null) goto L16;
        r5.stopDecodeStream();
    L16:
        if (q62.OXO1.OIXOOi() == false) goto L19;
        AISparkChainManager.OXO1.Ii0i(false);
        return;
    }

    public final void stop() {
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager -> stop");
        isAiTaskRunning = false;
        isSpeechRecRunning = false;
        ThreadUtils.SimpleTask<Void> r0 = mOpenAiTask;
        if (r0 == null) goto L6;
        ThreadUtils.cancel(r0);
    L6:
        if (Intrinsics.XOO0ii0(BleCache.INSTANCE.getMFirmwareFlag(), "BLACK_SHARK_S1_PRO") == true) goto L10;
        ThreadUtils.SimpleTask<Void> r1 = mDuserTask;
        if (r1 == null) goto L10;
        ThreadUtils.cancel(r1);
    L10:
        AISparkChainManager.OXO1.iOI();
        DcsTtsPlayer.INSTANCE.stop();
        AIWatchFaceManager.OXO1.OII();
        AIManager.OXO1.XO0X10iO();
        resetPlayStatus();
    }

    public final void stopRecording() {
        RecordingManager.Companion.getInstance().stopRecording();
    }

    public final void toMicrosoftIdentify(@aa1 BleRecordPacket r10) {
        Intrinsics.X0O(r10, "recordPacket");
        int r0 = r10.getMStatus();
        if (r0 == 0) goto L37;
        if (r0 != 1) goto L6;
        OpusManager r1 = mOpusManager;
        if (r1 == null) goto L69;
        r1.writeAudioStream(r10.getMPacket());
        return;
    L69:
        return;
    L6:
        if (r0 == 2) goto L15;
        if (r0 != 3) goto L74;
        mVoiceType = r10.getMStatus();
        stop();
        OpusManager r11 = mOpusManager;
        if (r11 == null) goto L12;
        r11.stopDecodeStream();
    L12:
        MicrosoftSDKManage.O1O.OXO1().X1IX();
        return;
    L74:
        return;
    L15:
        if (mVoiceType != 0) goto L67;
        mVoiceType = r10.getMStatus();
        isSpeechRecRunning = false;
        OpusManager r12 = mOpusManager;
        if (r12 == null) goto L20;
        r12.stopDecodeStream();
    L20:
        if (isSupportEarPhoneVoiceAIChat() == false) goto L22;
    L25:
        MicrosoftSDKManage.O1O.OXO1().XOIO11O();
    L26:
        endTransfer();
        if (isActivityData == false) goto L29;
        return;
    L29:
        if (mContentResult.length() <= 0) goto L66;
        isSendResults = true;
        sendContentResult(mContentResult);
        return;
    L66:
        return;
    L22:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L25;
        MicrosoftSDKManage.O1O.OXO1().Xi();
        goto L26
    L67:
        return;
    L37:
        if (mVoiceType == 0) goto L70;
        mVoiceType = r10.getMStatus();
        if (isSpeechRecRunning == false) goto L46;
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager toMicrosoftIdentify isSpeechRecRunning = " + isSpeechRecRunning);
        RecordingManager.Companion r13 = RecordingManager.Companion;
        if (r13.getInstance().isRecording() == true) goto L43;
        return;
    L43:
        if (q62.OiO0IOX(q62.OXO1, null, 1, null) == false) goto L72;
        r13.getInstance().playTip();
        return;
    L72:
        return;
    L46:
        stop();
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        OpusManager r14 = mOpusManager;
        if (r14 == null) goto L49;
        r14.stopDecodeStream();
    L49:
        isSpeechRecRunning = true;
        if (isActivityData == true) goto L53;
        setLanguageType$default(this, null, null, 3, null);
    L53:
        if (isSupportEarPhoneVoiceAIChat() == false) goto L55;
    L64:
        MicrosoftSDKManage.O1O.OXO1().iIX0i(microsoftLanguage, true, microsoftTtsName, microsoftTtsLanguage, !isActivityData);
        return;
    L55:
        if (isSupportEarPhoneVoiceTranslation() == true) goto L64;
        MicrosoftSDKManage.O1O.OXO1().iIX0i(microsoftLanguage, false, microsoftTtsName, microsoftTtsLanguage, false);
        OpusManager r15 = mOpusManager;
        if (r15 == null) goto L60;
        r15.stopDecodeStream();
    L60:
        OpusManager r16 = mOpusManager;
        if (r16 == null) goto L73;
        r16.startDecodeStream(new C34131());
        return;
    L73:
        return;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.sma.smartv3.model.AIAnswer] */
    public final void toWebSocketRecordPacket(@aa1 BleRecordPacket r12) {
        Intrinsics.X0O(r12, "recordPacket");
        int r0 = r12.getMStatus();
        if (r0 == 0) goto L29;
        if (r0 != 1) goto L6;
        Iterator r13 = CollectionsKt___CollectionsKt.X10i(ArraysKt___ArraysKt.O1XIOXO1i(r12.getMPacket()), 40).iterator();
    L26:
        if (r13.hasNext() == false) goto L38;
        WebSocketManager.INSTANCE.sendAudioStreamWithBuffer(CollectionsKt___CollectionsKt.XX0X0((List) r13.next()));
        goto L26
    L38:
        return;
    L6:
        if (r0 == 2) goto L16;
        if (r0 != 3) goto L28;
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket webSocketRecordPacket SUSPEND");
        isSpeechRecRunning = false;
        OpusManager r14 = mOpusManager;
        if (r14 == null) goto L13;
        r14.stopDecodeStream();
    L13:
        WebSocketManager r15 = WebSocketManager.INSTANCE;
        r15.sendAbortMessage();
        r15.sendStopListenMessage();
        return;
    L28:
        return;
    L16:
        if (isSpeechRecRunning == true) goto L19;
        i1O0OXO1O.OXO1.XIi00iiXO("AIManager VoiceManager BleRecordPacket webSocketRecordPacket END isSpeechRecRunning = " + isSpeechRecRunning);
        return;
    L19:
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket webSocketRecordPacket END");
        isSpeechRecRunning = false;
        endTransfer();
        OpusManager r16 = mOpusManager;
        if (r16 == null) goto L22;
        r16.stopDecodeStream();
    L22:
        WebSocketManager.INSTANCE.sendStopListenMessage();
        return;
    L29:
        isSpeechRecRunning = true;
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager BleRecordPacket webSocketRecordPacket START");
        deleteFiles();
        OpusManager r17 = mOpusManager;
        if (r17 == null) goto L32;
        r17.stopDecodeStream();
    L32:
        OpusManager r18 = mOpusManager;
        if (r18 == null) goto L35;
        r18.startDecodeStream(new C34141());
    L35:
        final StringBuilder r19 = new StringBuilder();
        final Ref.ObjectRef r1 = new Ref.ObjectRef();
        r1.element = new AIAnswer(AIFunctionType.AI, null, 0, null, null, 26, null);
        WebSocketManager r2 = WebSocketManager.INSTANCE;
        r2.sendStartListenMessage(false);
        r2.setMOnCallback(new C34152(r19, r1));
    }

    public final void voiceQuery(@aa1 final String r5) {
        Intrinsics.X0O(r5, "query");
        i1O0OXO1O.OXO1.OXO1("AIManager VoiceManager voiceQuery -> " + r5);
        if (isVoiceAIIdentify() == false) goto L7;
        sendMsg(r5);
        return;
    L7:
        if (i72.OXO1.I0IIOI() == false) goto L20;
        int r0 = mAIMode;
        if (r0 < 0) goto L20;
        if (r0 > 3) goto L20;
        if (r0 != 2) goto L18;
        q62 r1 = q62.OXO1;
        if (r1.OIXOOi() == false) goto L18;
        AISparkChainManager.OXO1.iXiiiO(r5, mAISparkChainManagerCallback, r1.iXOII(), true);
        return;
    L18:
        AIChat(r5, "voiceQuery");
        return;
    L20:
        q62 r2 = q62.OXO1;
        if (r2.OIXOOi() == false) goto L25;
        AISparkChainManager.OXO1.iXiiiO(r5, mAISparkChainManagerCallback, r2.iXOII(), true);
        return;
    L25:
        if (r2.XOX() == false) goto L29;
        AIChat(r5, "voiceQuery isUseAIService");
        return;
    L29:
        if (r2.IiX1ii() == false) goto L37;
        if (isExpired() == false) goto L34;
        refreshToken(new bj6(r5));
        return;
    L34:
        duserStreamChat(r5);
        return;
    L37:
        if (TextUtils.isEmpty(r2.iIiiO()) == false) goto L40;
        ToastUtils.showLong(R.string.no_ai_key);
        return;
    L40:
        openAiChatCompletion(r5);
    }

    public final void voiceRecord() {
        AISparkChainManager.OXO1.O0O0X0iOi();
        DcsTtsPlayer.INSTANCE.stop();
        RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), recordingCallBack, false, resetCallBack, TAG, 2, null);
    }
}
