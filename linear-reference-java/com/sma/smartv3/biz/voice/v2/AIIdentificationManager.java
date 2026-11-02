package com.sma.smartv3.biz.voice.v2;

import android.app.Application;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.I0i0;
import com.android.mltcode.paycertificationapi.I0iOXO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X0I1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX01;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.ai.speech.realtime.full.connection.Runner;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.biz.voice.ai.WebSocketManager;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.network.GetAIAudioToText;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.entity.Languages;
import java.io.File;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Comparator;
import java.util.Timer;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIIdentificationManager {

    @aa1
    public static final AIIdentificationManager INSTANCE = null;

    @aa1
    private static final String TAG = null;
    private static boolean isPhoneRecord;
    private static boolean isRealTimeRunning;
    private static boolean isSendResults;

    @aa1
    private static String mCompleteText;

    @aa1
    private static String mContentResult;
    private static int mDeviceSelectedAIMode;

    @tb1
    private static Runner mFullRunner;

    @tb1
    private static OnIdentificationCallback mIdentificationCallback;

    @tb1
    private static PipedInputStream mInputStream;

    @aa1
    private static final File mOpusFile = null;

    @tb1
    private static PipedOutputStream mOutputStream;

    @aa1
    private static final File mPcmFile = null;

    @aa1
    private static String mProcessComplete;

    @aa1
    private static final File mWavFile = null;

    @aa1
    private static final AIIdentificationManager$mWebSocketCallBack$1 mWebSocketCallBack = null;

    @aa1
    private static final MicrosoftSDKManage.iO microsoftCallBack = null;

    public interface OnIdentificationCallback {

        public static final class DefaultImpls {
            @Deprecated
            public static void onComplete(@aa1 OnIdentificationCallback r1, @aa1 String r2) {
                Intrinsics.X0O(r2, "text");
                OnIdentificationCallback.access$onComplete$jd(r1, r2);
            }

            @Deprecated
            public static void onEndSuccess(@aa1 OnIdentificationCallback r0) {
                OnIdentificationCallback.access$onEndSuccess$jd(r0);
            }

            @Deprecated
            public static void onIdentificationError(@aa1 OnIdentificationCallback r1, @aa1 String r2) {
                Intrinsics.X0O(r2, "msg");
                OnIdentificationCallback.access$onIdentificationError$jd(r1, r2);
            }

            @Deprecated
            public static void onProcessComplete(@aa1 OnIdentificationCallback r1, @aa1 String r2) {
                Intrinsics.X0O(r2, "text");
                OnIdentificationCallback.access$onProcessComplete$jd(r1, r2);
            }

            @Deprecated
            public static void onStartSuccess(@aa1 OnIdentificationCallback r0) {
                OnIdentificationCallback.access$onStartSuccess$jd(r0);
            }
        }

        static /* synthetic */ void access$onComplete$jd(OnIdentificationCallback r0, String r1) {
            super.onComplete(r1);
        }

        static /* synthetic */ void access$onEndSuccess$jd(OnIdentificationCallback r0) {
            super.onEndSuccess();
        }

        static /* synthetic */ void access$onIdentificationError$jd(OnIdentificationCallback r0, String r1) {
            super.onIdentificationError(r1);
        }

        static /* synthetic */ void access$onProcessComplete$jd(OnIdentificationCallback r0, String r1) {
            super.onProcessComplete(r1);
        }

        static /* synthetic */ void access$onStartSuccess$jd(OnIdentificationCallback r0) {
            super.onStartSuccess();
        }

        default void onComplete(@aa1 String r2) {
            Intrinsics.X0O(r2, "text");
        }

        default void onEndSuccess() {
        }

        default void onIdentificationError(@aa1 String r2) {
            Intrinsics.X0O(r2, "msg");
        }

        default void onProcessComplete(@aa1 String r2) {
            Intrinsics.X0O(r2, "text");
        }

        default void onStartSuccess() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.sma.smartv3.biz.voice.v2.AIIdentificationManager$mWebSocketCallBack$1] */
    static {
        INSTANCE = new AIIdentificationManager();
        TAG = "AIManagerV2 Identification";
        mOpusFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.opus");
        mPcmFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.pcm");
        mWavFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.wav");
        mCompleteText = "";
        mDeviceSelectedAIMode = -1;
        mContentResult = "";
        mProcessComplete = "";
        microsoftCallBack = new AIIdentificationManager$microsoftCallBack$1();
        mWebSocketCallBack = new AIIdentificationManager$mWebSocketCallBack$1();
    }

    private AIIdentificationManager() {
    }

    public static /* synthetic */ long OXO1(File r2) {
        return savePcmFile$lambda$0$0(r2);
    }

    public static /* synthetic */ void XIi00iiXO(long r0, long r2) {
        serviceIdentificationAudio$lambda$0(r0, r2);
    }

    public static /* synthetic */ Unit XO0O10() {
        return savePcmFile$lambda$0();
    }

    public static final /* synthetic */ Runner access$getMFullRunner$p() {
        return mFullRunner;
    }

    public static final /* synthetic */ OnIdentificationCallback access$getMIdentificationCallback$p() {
        return mIdentificationCallback;
    }

    public static final /* synthetic */ PipedInputStream access$getMInputStream$p() {
        return mInputStream;
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return TAG;
    }

    public static final /* synthetic */ boolean access$isRealTimeRunning$p() {
        return isRealTimeRunning;
    }

    public static final /* synthetic */ void access$pollCheckStop(AIIdentificationManager r0) {
        r0.pollCheckStop();
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

    public static final /* synthetic */ void access$stopRealTime(AIIdentificationManager r0) {
        r0.stopRealTime();
    }

    public static /* synthetic */ long iO(Function1 r0, Object r1) {
        return savePcmFile$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ void identificationBegins$default(AIIdentificationManager r1, boolean r2, OnIdentificationCallback r3, boolean r4, int r5, RecordingManager.OnRecordingCallback r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = false;
    L9:
        if ((r7 & 8) == 0) goto L11;
        r5 = -1;
    L11:
        r1.identificationBegins(r2, r3, r4, r5, r6);
    }

    private final void onWebSocketManagerStart() {
        WebSocketManager r0 = WebSocketManager.INSTANCE;
        r0.sendStartListenMessage(false);
        r0.setMOnCallback(mWebSocketCallBack);
    }

    private final void pollCheckStop() {
        final Timer r0 = new Timer();
        r0.schedule(new AIIdentificationManager$pollCheckStop$timerTask$1(r0), 500, 500);
    }

    private final void savePcmFile() {
        ThreadsKt.iO(false, false, null, null, 0, new iX01(), 31, null);
    }

    private static final Unit savePcmFile$lambda$0() {
        VoiceManagerV2 r0 = VoiceManagerV2.INSTANCE;
        if (r0.getMSavePcmTime().length() <= 0) goto L27;
        Thread.sleep(2000);
        File r1 = new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm");
        if (r1.exists() == true) goto L7;
        FileUtils.createOrExistsDir(r1);
    L7:
        q62 r2 = q62.OXO1;
        if (r2.XOX() == false) goto L17;
        if (r2.iX0iiiXi() == false) goto L17;
        VoiceManager r3 = VoiceManager.INSTANCE;
        if (r3.isSupportDevicePhoneVoiceAIChat() == false) goto L17;
        if (r3.isVoiceAIIdentify() == true) goto L17;
        FileUtils.copy(mOpusFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + r0.getMSavePcmTime() + ".opus"));
    L20:
        File[] r4 = r1.listFiles();
        if (r4 == null) goto L25;
        final Function1 r5 = new X0I1();
        Comparator r6 = Comparator.comparingLong(new I0i0(r5));
        Intrinsics.O10IXXX0X(r6, "comparingLong(...)");
        ArraysKt___ArraysJvmKt.O1I(r4, r6);
        if (r4.length <= 10) goto L25;
        ((File) ArraysKt___ArraysKt.IO0(r4)).delete();
    L25:
        r0.setMSavePcmTime("");
    L17:
        if (r0.isVoiceAiChatContext() == false) goto L19;
        FileUtils.copy(mOpusFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + r0.getMSavePcmTime() + ".opus"));
        goto L20
    L19:
        FileUtils.copy(mPcmFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + r0.getMSavePcmTime() + ".pcm"));
    L27:
        return Unit.OXO1;
    }

    private static final long savePcmFile$lambda$0$0(File r2) {
        return r2.lastModified();
    }

    private static final long savePcmFile$lambda$0$1(Function1 r0, Object r1) {
        return ((Number) r0.invoke(r1)).longValue();
    }

    private final void serviceIdentificationAudio(File r8, final O1XIiIO<String> r9) {
        String r0 = AIManager.OXO1.XiOIii1(mDeviceSelectedAIMode);
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        String r2 = r1.getBaseUrl(GetAIAudioToText.URL_V2);
        Application r3 = Utils.getApp();
        Intrinsics.O10IXXX0X(r3, "getApp(...)");
        if (UtilsKt.IiiXiI0I(r3) == false) goto L5;
        String r4 = Languages.DEFAULT_LANGUAGE_ZH;
    L6:
        i1O0OXO1O.OXO1.OXO1(TAG + " serviceIdentificationAudio -> " + r8 + "  toLang = " + r4 + " , model = " + r0);
        AndroidNetworking.upload(r2).addHeaders(r1.getHeadersMap()).addQueryParameter("model", r0).addQueryParameter("toLang", r4).addMultipartFile("audioFile", r8).setTag("serviceIdentificationAudio").setPriority(Priority.HIGH).build().setUploadProgressListener(new I0iOXO()).getAsJSONObject(new AnonymousClass2(r9));
        return;
    L5:
        r4 = Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void serviceIdentificationAudio$default(AIIdentificationManager r0, File r1, O1XIiIO r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.serviceIdentificationAudio(r1, r2);
    }

    private static final void serviceIdentificationAudio$lambda$0(long r0, long r2) {
    }

    private final void serviceIdentify() {
        File r0 = mWavFile;
        if (r0.exists() == false) goto L5;
        r0.delete();
    L5:
        new gq1(16000, 16, 2).OXO1(mPcmFile.getPath(), r0.getPath());
        INSTANCE.serviceIdentificationAudio(r0, new AIIdentificationManager$serviceIdentify$1$1());
    }

    private final void startRealTime() {
        if (q62.OXO1.XOX() == false) goto L6;
        return;
    L6:
        if (isRealTimeRunning == false) goto L8;
        return;
    L8:
        i1O0OXO1O.OXO1.OXO1(TAG + " -> startRealTime");
        ThreadUtils.executeByIo(new C34171());
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

    public final void deleteFile() {
        FileUtils.delete(mOpusFile);
        FileUtils.delete(mPcmFile);
        FileUtils.delete(mWavFile);
    }

    @aa1
    public final String getMCompleteText() {
        return mCompleteText;
    }

    @aa1
    public final String getMContentResult() {
        return mContentResult;
    }

    public final int getMDeviceSelectedAIMode() {
        return mDeviceSelectedAIMode;
    }

    @aa1
    public final String getMProcessComplete() {
        return mProcessComplete;
    }

    @aa1
    public final MicrosoftSDKManage.iO getMicrosoftCallBack() {
        return microsoftCallBack;
    }

    public final void identificationBegins(boolean r12, @aa1 OnIdentificationCallback r13, boolean r14, int r15, @aa1 RecordingManager.OnRecordingCallback r16) {
        Intrinsics.X0O(r13, "identificationCallback");
        Intrinsics.X0O(r16, "recordingCallBack");
        q62 r2 = q62.OXO1;
        if (q62.OiO0IOX(r2, null, 1, null) == false) goto L5;
        RecordingManager.Companion.getInstance().playTip();
    L5:
        mDeviceSelectedAIMode = r15;
        isPhoneRecord = r12;
        mCompleteText = "";
        AITranslationManager r17 = AITranslationManager.INSTANCE;
        LanguageTranslationData r3 = r17.getLanguageTranslationData();
        if (VoiceManagerV2.INSTANCE.isTranslation() == false) goto L8;
        LanguageTranslationData r18 = r17.getToLanguageTranslationData();
    L9:
        mIdentificationCallback = r13;
        if (isPhoneRecord == false) goto L25;
        if (r2.X11I() == false) goto L16;
        i1O0OXO1O.OXO1.OXO1(TAG + " start isPhoneRecord =" + isPhoneRecord + " MicrosoftSDKManage languageTranslationData=" + r3);
        MicrosoftSDKManage.O1O.OXO1().iIX0i(r3.getAsrLanguage(), isPhoneRecord, r18.getTtsViuceName(), r18.getAsrLanguage(), r14 ^ true);
        return;
    L16:
        if (r2.OIXOOi() == false) goto L18;
    L22:
        AISparkChainManager.OXO1.IO0iXO0O();
        i1O0OXO1O r19 = i1O0OXO1O.OXO1;
        String r4 = TAG;
        r19.OXO1(r4 + " start isPhoneRecord =" + isPhoneRecord + " SparkChainAIManage");
        RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), r16, false, false, r4, 4, null);
        return;
    L18:
        if (mDeviceSelectedAIMode == 2) goto L22;
        i1O0OXO1O r110 = i1O0OXO1O.OXO1;
        String r5 = TAG;
        r110.OXO1(r5 + " start isPhoneRecord =" + isPhoneRecord + " identification");
        startRealTime();
        RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), r16, true, false, r5, 4, null);
        return;
    L25:
        if (isWebSocket() == false) goto L29;
        onWebSocketManagerStart();
        return;
    L29:
        if (r2.X11I() == false) goto L33;
        i1O0OXO1O.OXO1.OXO1(TAG + " start isPhoneRecord =" + isPhoneRecord + " MicrosoftSDKManage languageTranslationData=" + r3);
        MicrosoftSDKManage.O1O.OXO1().iIX0i(r3.getAsrLanguage(), isPhoneRecord, r18.getTtsViuceName(), r18.getAsrLanguage(), false);
        return;
    L33:
        if (r2.OIXOOi() == true) goto L40;
        if (r15 == 2) goto L40;
        i1O0OXO1O.OXO1.OXO1(TAG + " start isPhoneRecord =" + isPhoneRecord + " identification");
        if (r2.IiX1ii() == false) goto L44;
        startRealTime();
        return;
    L44:
        return;
    L40:
        AISparkChainManager r111 = AISparkChainManager.OXO1;
        r111.IO0iXO0O();
        i1O0OXO1O.OXO1.OXO1(TAG + " start isPhoneRecord =" + isPhoneRecord + " SparkChainAIManage");
        if (r111.iOO1ii1() == false) goto L45;
        RecordingManager.Companion.getInstance().startRealTimeASR(r16);
        return;
    L45:
        return;
    L8:
        r18 = r17.getLanguageTranslationData();
        goto L9
    }

    public final void identificationCompleted() {
        i1O0OXO1O.OXO1.OXO1(TAG + " end isPhoneRecord =" + isPhoneRecord);
        if (isPhoneRecord == false) goto L6;
        RecordingManager.Companion.getInstance().stopRecording();
    L6:
        if (isWebSocket() == false) goto L8;
        WebSocketManager.INSTANCE.sendStopListenMessage();
    L28:
        if (isWebSocket() == true) goto L47;
        q62 r0 = q62.OXO1;
        if (r0.X11I() == true) goto L47;
        if (r0.OIXOOi() == true) goto L47;
        if (mDeviceSelectedAIMode == 2) goto L47;
        if (r0.XOX() == false) goto L40;
        serviceIdentify();
        goto L47
    L40:
        if (r0.IiX1ii() == true) goto L47;
        if (TextUtils.isEmpty(r0.iIiiO()) == false) goto L46;
        ToastUtils.showLong(R.string.no_ai_key);
        OnIdentificationCallback r1 = mIdentificationCallback;
        if (r1 == null) goto L47;
        r1.onIdentificationError(UtilsKt.XXO(R.string.no_ai_key));
        goto L47
    L46:
        gq1 r2 = new gq1(16000, 16, 2);
        VoiceManager r3 = VoiceManager.INSTANCE;
        r2.OXO1(r3.getMPcmFile().getPath(), r3.getMWavFile().getPath());
        INSTANCE.oldOpenAiChatCompletion();
    L47:
        savePcmFile();
        return;
    L8:
        q62 r4 = q62.OXO1;
        if (r4.X11I() == false) goto L15;
        if (isPhoneRecord == false) goto L13;
        MicrosoftSDKManage.O1O.OXO1().XOIO11O();
        goto L28
    L13:
        MicrosoftSDKManage.O1O.OXO1().Xi();
        goto L28
    L15:
        if (r4.OIXOOi() == true) goto L19;
        if (mDeviceSelectedAIMode != 2) goto L28;
    L19:
        if (AISparkChainManager.OXO1.iOO1ii1() == true) goto L21;
        ToastUtils.showLong(UtilsKt.XXO(R.string.speech_recognition_error), new Object[0]);
        OnIdentificationCallback r5 = mIdentificationCallback;
        if (r5 == null) goto L28;
        r5.onIdentificationError("Authorize error");
        goto L28
    L21:
        if (isPhoneRecord == false) goto L23;
        RecordingManager.Companion.getInstance().stopRecording();
        goto L28
    L23:
        RecordingManager.realTimeASRend$default(RecordingManager.Companion.getInstance(), 0, 0, 3, null);
        goto L28
    }

    public final void identificationProcess(@aa1 byte[] r8) {
        Intrinsics.X0O(r8, "byte");
        if (isWebSocket() == false) goto L6;
        WebSocketManager.INSTANCE.sendAudioStreamWithBuffer(r8);
    L5:
        byte[] r2 = r8;
    L22:
        q62 r9 = q62.OXO1;
        if (r9.XOX() == false) goto L33;
        if (r9.iX0iiiXi() == false) goto L33;
        VoiceManager r10 = VoiceManager.INSTANCE;
        if (r10.isSupportDevicePhoneVoiceAIChat() == false) goto L33;
        if (r10.isVoiceAIIdentify() == true) goto L33;
        FileIOUtils.writeFileFromBytesByStream(mOpusFile, r2, true);
        return;
    L33:
        if (VoiceManagerV2.INSTANCE.isVoiceAiChatContext() == false) goto L36;
        FileIOUtils.writeFileFromBytesByStream(mOpusFile, r2, true);
        return;
    L36:
        FileIOUtils.writeFileFromBytesByStream(mPcmFile, r2, true);
        return;
    L6:
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L10;
        MicrosoftSDKManage.O1O.OXO1().Oi(r8);
        goto L5
    L10:
        if (r0.OIXOOi() == true) goto L20;
        if (mDeviceSelectedAIMode == 2) goto L20;
        if (r0.XOX() == true) goto L5;
        if (r0.IiX1ii() == false) goto L5;
        sendRealTime(r8);
    L20:
        if (AISparkChainManager.OXO1.iOO1ii1() == false) goto L5;
        r2 = r8;
        RecordingManager.realTimeASRing$default(RecordingManager.Companion.getInstance(), r2, 0, r8.length, 2, null);
        goto L22
    }

    public final boolean isPhoneRecord() {
        return isPhoneRecord;
    }

    public final boolean isSendResults() {
        return isSendResults;
    }

    public final boolean isWebSocket() {
        q62 r0 = q62.OXO1;
        if (r0.XOX() == false) goto L11;
        if (r0.iX0iiiXi() == false) goto L11;
        VoiceManager r1 = VoiceManager.INSTANCE;
        if (r1.isSupportDevicePhoneVoiceAIChat() == false) goto L11;
        if (r1.isVoiceAIIdentify() == true) goto L11;
        return true;
    L11:
        if (VoiceManagerV2.INSTANCE.isVoiceAiChatContext() == true) goto L16;
        return false;
    L16:
        return true;
    }

    public final void oldOpenAiChatCompletion() {
        VoiceManager.INSTANCE.openAiTranscriptionsAudio(mWavFile, new AnonymousClass1());
    }

    public final void sendRealTime(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "bytes");
        PipedOutputStream r0 = mOutputStream;     // Catch: Exception -> L7
        if (r0 == null) goto L12;
        r0.write(r2);     // Catch: Exception -> L7
        return;
    L12:
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
    }

    public final void setMCompleteText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        mCompleteText = r2;
    }

    public final void setMContentResult(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        mContentResult = r2;
    }

    public final void setMDeviceSelectedAIMode(int r1) {
        mDeviceSelectedAIMode = r1;
    }

    public final void setMProcessComplete(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        mProcessComplete = r2;
    }

    public final void setPhoneRecord(boolean r1) {
        isPhoneRecord = r1;
    }

    public final void setSendResults(boolean r1) {
        isSendResults = r1;
    }
}
