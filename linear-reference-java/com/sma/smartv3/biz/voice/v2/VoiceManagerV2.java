package com.sma.smartv3.biz.voice.v2;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.fj6;
import com.android.mltcode.paycertificationapi.gj6;
import com.android.mltcode.paycertificationapi.hj6;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.AIWatchFaceManager;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.OpusManager;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceMessage;
import com.sma.smartv3.biz.voice.VoicePlayer;
import com.sma.smartv3.biz.voice.ai.WebSocketManager;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleVoice;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nVoiceManagerV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManagerV2.kt\ncom/sma/smartv3/biz/voice/v2/VoiceManagerV2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,797:1\n39#2,3:798\n42#2:804\n44#2,2:806\n31#2,2:808\n1563#3:801\n1634#3,2:802\n1636#3:805\n1869#3,2:810\n*S KotlinDebug\n*F\n+ 1 VoiceManagerV2.kt\ncom/sma/smartv3/biz/voice/v2/VoiceManagerV2\n*L\n261#1:798,3\n261#1:804\n261#1:806,2\n267#1:808,2\n261#1:801\n261#1:802,2\n261#1:805\n748#1:810,2\n*E\n"})
public final class VoiceManagerV2 {
    private static final long FIRST_IDENTIFY_TIME = 0;

    @aa1
    public static final VoiceManagerV2 INSTANCE = null;

    @aa1
    private static final String TAG = "AIManagerV2 VoiceManagerV2";

    @aa1
    private static final VoiceManagerV2$identificationCallback$1 identificationCallback = null;
    private static boolean isAloneCallback;
    private static boolean isSpeechRecRunning;
    private static int mAIMode;

    @aa1
    private static final VoiceManagerV2$mAIModelCallback$1 mAIModelCallback = null;
    private static Application mApp;

    @aa1
    private static final VoiceManagerV2$mBleHandleCallback$1 mBleHandleCallback = null;

    @aa1
    private static final Handler mHandler = null;

    @aa1
    private static final File mOpusFile = null;

    @tb1
    private static OpusManager mOpusManager;

    @aa1
    private static String mSavePcmTime;

    @aa1
    private static final Lazy mVoiceHandleCallbacks$delegate = null;
    private static int mVoiceMode;
    private static long microsoftTime;

    @aa1
    private static final VoiceManagerV2$recordCallBack$1 recordCallBack = null;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.sma.smartv3.biz.voice.v2.VoiceManagerV2$mBleHandleCallback$1] */
    static {
        INSTANCE = new VoiceManagerV2();
        mSavePcmTime = "";
        FIRST_IDENTIFY_TIME = 2000;
        microsoftTime = 2000;
        mOpusFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.opus");
        mAIMode = -1;
        mBleHandleCallback = new VoiceManagerV2$mBleHandleCallback$1();
        identificationCallback = new VoiceManagerV2$identificationCallback$1();
        mAIModelCallback = new VoiceManagerV2$mAIModelCallback$1();
        recordCallBack = new VoiceManagerV2$recordCallBack$1();
        mVoiceHandleCallbacks$delegate = LazyKt__LazyJVMKt.iO(new hj6());
        mHandler = new Handler(Looper.getMainLooper());
    }

    private VoiceManagerV2() {
    }

    public static /* synthetic */ void OXO1(Function1 r0) {
        onAllNotifyVoiceHandlers$lambda$0(r0);
    }

    public static /* synthetic */ void XIi00iiXO(Function1 r0) {
        onAloneNotifyVoiceHandlers$lambda$0(r0);
    }

    public static final /* synthetic */ void access$changeOpusManager(VoiceManagerV2 r0) {
        r0.changeOpusManager();
    }

    public static final /* synthetic */ void access$deleteFiles(VoiceManagerV2 r0) {
        r0.deleteFiles();
    }

    public static final /* synthetic */ VoiceManagerV2$identificationCallback$1 access$getIdentificationCallback$p() {
        return identificationCallback;
    }

    public static final /* synthetic */ int access$getMAIMode$p() {
        return mAIMode;
    }

    public static final /* synthetic */ File access$getMOpusFile$p() {
        return mOpusFile;
    }

    public static final /* synthetic */ OpusManager access$getMOpusManager$p() {
        return mOpusManager;
    }

    public static final /* synthetic */ int access$getMVoiceMode$p() {
        return mVoiceMode;
    }

    public static final /* synthetic */ VoiceManagerV2$recordCallBack$1 access$getRecordCallBack$p() {
        return recordCallBack;
    }

    public static final /* synthetic */ void access$notifyCallback(VoiceManagerV2 r0, Function1 r1) {
        r0.notifyCallback(r1);
    }

    public static final /* synthetic */ void access$onAIModelIdentificationError(VoiceManagerV2 r0, String r1, String r2) {
        r0.onAIModelIdentificationError(r1, r2);
    }

    public static final /* synthetic */ void access$setMAIMode$p(int r0) {
        mAIMode = r0;
    }

    public static final /* synthetic */ void access$setMVoiceMode$p(int r0) {
        mVoiceMode = r0;
    }

    private final void addHandleCallback() {
        BleConnector.INSTANCE.addHandleCallback(mBleHandleCallback);
    }

    private final void changeOpusManager() {
        OpusManager r0 = mOpusManager;     // Catch: Exception -> L5
        if (r0 == null) goto L7;
        r0.stopDecodeStream();     // Catch: Exception -> L5
    L7:
        OpusManager r1 = mOpusManager;     // Catch: Exception -> L5
        if (r1 == null) goto L10;
        r1.release();     // Catch: Exception -> L5
    L10:
        mOpusManager = null;     // Catch: Exception -> L5
        mOpusManager = new OpusManager();     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 -> opus init error！！！");
    }

    private final void deleteFiles() {
        FileUtils.delete(mOpusFile);
        AIIdentificationManager.INSTANCE.deleteFile();
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        String r0 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.O10IXXX0X(r0, "format(...)");
        mSavePcmTime = r0;
    }

    private final CopyOnWriteArrayList<VoiceHandleCallback> getMVoiceHandleCallbacks() {
        return (CopyOnWriteArrayList) mVoiceHandleCallbacks$delegate.getValue();
    }

    public static /* synthetic */ CopyOnWriteArrayList iO() {
        return mVoiceHandleCallbacks_delegate$lambda$0();
    }

    private static final CopyOnWriteArrayList mVoiceHandleCallbacks_delegate$lambda$0() {
        return new CopyOnWriteArrayList();
    }

    private final void notifyCallback(Function1<? super VoiceHandleCallback, Unit> r2) {
        if (isAloneCallback == false) goto L6;
        onAloneNotifyVoiceHandlers(r2);
        return;
    L6:
        onAllNotifyVoiceHandlers(r2);
    }

    private final void onAIModelIdentificationError(String r6, String r7) {
        sendTranslationResult(r6, UtilsKt.XXO(R.string.voice_assistant_common_error));
        if (isSupportDevicePhoneVoiceAIChat() == true) goto L17;
        return;
    L17:
        JsonArray r8 = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L10
        Intrinsics.XXI(r8);     // Catch: Exception -> L10
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r8, 10));     // Catch: Exception -> L10
        Iterator<JsonElement> r9 = r8.iterator();     // Catch: Exception -> L10
    L7:
        if (r9.hasNext() == false) goto L11;
        r2.add(new Gson().fromJson(r9.next(), VoiceMessage.class));     // Catch: Exception -> L10
    L11:
        List r10 = CollectionsKt___CollectionsKt.OO0Oi10(r2);
        if (r10.isEmpty() == true) goto L22;
        VoiceMessage r3 = (VoiceMessage) CollectionsKt___CollectionsKt.Xi1XO00(r10);
        if (r3.getMStatus() != 1) goto L23;
        r3.setMStatus(0);
        r3.setMContent(UtilsKt.XXO(R.string.voice_assistant_common_error));
        a01.OXO1.IiI10X().put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(r10));
        I01XX0.XIi00iiXO(I01XX0.X00O0, null, 2, null);
        return;
    L23:
        return;
    L22:
        return;
    L10:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L11
    }

    public static /* synthetic */ void onAIModelIdentificationError$default(VoiceManagerV2 r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        r1.onAIModelIdentificationError(r2, r3);
    }

    public static /* synthetic */ void onAIResultConsumption$default(VoiceManagerV2 r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = -1;
    L8:
        r0.onAIResultConsumption(r1, r2);
    }

    private final void onAllNotifyVoiceHandlers(final Function1<? super VoiceHandleCallback, Unit> r3) {
        mHandler.post(new fj6(r3));
    }

    private static final void onAllNotifyVoiceHandlers$lambda$0(Function1 r2) {
        VoiceManagerV2 r0 = INSTANCE;
        if (r0.getMVoiceHandleCallbacks().isEmpty() == true) goto L8;
        Iterator<T> r1 = r0.getMVoiceHandleCallbacks().iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        VoiceHandleCallback r3 = (VoiceHandleCallback) r1.next();
        Intrinsics.XXI(r3);
        r2.invoke(r3);
        goto L6
    L10:
        return;
    }

    private final void onAloneNotifyVoiceHandlers(final Function1<? super VoiceHandleCallback, Unit> r3) {
        mHandler.post(new gj6(r3));
    }

    private static final void onAloneNotifyVoiceHandlers$lambda$0(Function1 r2) {
        VoiceManagerV2 r0 = INSTANCE;
        if (r0.getMVoiceHandleCallbacks().isEmpty() == true) goto L6;
        Object r1 = CollectionsKt___CollectionsKt.Xi1XO00(r0.getMVoiceHandleCallbacks());
        Intrinsics.O10IXXX0X(r1, "last(...)");
        r2.invoke(r1);
        return;
    }

    private final void removeHandleCallback() {
        BleConnector.INSTANCE.removeHandleCallback(mBleHandleCallback);
    }

    private final void senAudioTextToDevice(BleVoice r10) {
        if (q62.OXO1.I0OX() == true) goto L6;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r10, false, false, 24, null);
        return;
    }

    public static /* synthetic */ void sendError$default(VoiceManagerV2 r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = Utils.getApp().getString(R.string.request_error);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
    L5:
        r0.sendError(r1);
    }

    public static /* synthetic */ void sendTranslationResult$default(VoiceManagerV2 r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        r1.sendTranslationResult(r2, r3);
    }

    private final void sendTranslationResultInput(String r11) {
        long r5 = System.currentTimeMillis();
        String r7 = StringsKt__StringsKt.iX1X1(r11).toString();
        int r1 = 0;
        int r2 = 0;
        BleVoice.BleDeviceEmotion r4 = null;
        senAudioTextToDevice(new BleVoice(r1, r2, mVoiceMode, r4, r5, r7, 10, null));
    }

    private final void startPhoneRecordingIdentification(int r9) {
        mVoiceMode = r9;
        AIIdentificationManager.identificationBegins$default(AIIdentificationManager.INSTANCE, true, identificationCallback, false, -1, recordCallBack, 4, null);
    }

    public final void addVoiceHandleCallback(@aa1 VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "mVoiceHandleCallback");
        if (isVoiceHandlerCallbackExist(r2) == true) goto L6;
        getMVoiceHandleCallbacks().add(r2);
        return;
    }

    public final void destroy() {
        stop();
        removeHandleCallback();
        OpusManager r0 = mOpusManager;
        if (r0 == null) goto L5;
        r0.release();
    L5:
        mOpusManager = null;
    }

    @aa1
    public final AIModelManagerV2.OnAIModelCallback getAIModelCallback() {
        return mAIModelCallback;
    }

    @aa1
    public final String getMSavePcmTime() {
        return mSavePcmTime;
    }

    public final int getVoiceMode() {
        return mVoiceMode;
    }

    public final void init(@aa1 Application r3) {
        Intrinsics.X0O(r3, "app");
        mApp = r3;
        AITranslationManager r0 = AITranslationManager.INSTANCE;
        Application r1 = mApp;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mApp");
        r1 = null;
    L5:
        r0.init(r1);
        addHandleCallback();
        if (mOpusManager == null) goto L19;
    L11:
        RecordingManager.Companion r2 = RecordingManager.Companion;
        r2.getInstance().init(r3);
        r2.getInstance().registerSCOReceiver(r3);
        String r4 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
        if (r4.length() <= 0) goto L15;
        MicrosoftSDKManage.O1O.OXO1().iI0I(r4);
    L15:
        if (q62.OXO1.iX0iiiXi() == false) goto L17;
        WebSocketManager.INSTANCE.init(r3, false);
    L17:
        removeVoiceHandleCallbackAll();
        addVoiceHandleCallback(new AnonymousClass1());
        return;
    L19:
        mOpusManager = new OpusManager();     // Catch: Exception -> L9
    L9:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 -> opus init error！！！");
        goto L11
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
        r0.OXO1().iIi1(AIIdentificationManager.INSTANCE.getMicrosoftCallBack(), TAG);
        microsoftTime = FIRST_IDENTIFY_TIME;
    }

    public final boolean isConductEarPhone() {
        int r0 = mVoiceMode;
        if (r0 != 3) goto L5;
        return true;
    L5:
        if (r0 == 4) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean isSpeechRecRunning() {
        return isSpeechRecRunning;
    }

    public final boolean isSupportAIWatchface() {
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

    public final boolean isTranslation() {
        int r0 = mVoiceMode;
        if (r0 != 2) goto L5;
        return true;
    L5:
        if (r0 == 4) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean isVoiceAIIdentify() {
        if (mVoiceMode != 6) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isVoiceAiChatContext() {
        if (mVoiceMode == 10) goto L5;
        return false;
    L5:
        if (q62.OXO1.Xi1XO00() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean isVoiceHandlerCallbackExist(@aa1 VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "mVoiceHandleCallback");
        return getMVoiceHandleCallbacks().contains(r2);
    }

    public final void onAIResultConsumption(@tb1 String r3, int r4) {
        if (r3 != null) goto L4;
    L10:
        sendTranslationResult(UtilsKt.XXO(R.string.speech_recognition_error), "");
        return;
    L4:
        if (r3.length() <= 0) goto L10;
        if (r4 == (-1)) goto L8;
        mVoiceMode = r4;
    L8:
        AIModelManagerV2.INSTANCE.textAIFunction(r3, mAIModelCallback, mAIMode);
    }

    @sf5(tag = I01XX0.i100IXOX)
    public final void onStopVoice(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onStopVoice");
        stop();
    }

    public final void removeVoiceHandleCallback(@aa1 VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "mVoiceHandleCallback");
        if (isVoiceHandlerCallbackExist(r2) == false) goto L6;
        getMVoiceHandleCallbacks().remove(r2);
        return;
    }

    public final void removeVoiceHandleCallbackAll() {
        getMVoiceHandleCallbacks().clear();
    }

    public final void sendError(@aa1 String r12) {
        Intrinsics.X0O(r12, "text");
        isSpeechRecRunning = false;
        long r6 = System.currentTimeMillis();
        int r2 = 0;
        int r3 = 0;
        BleVoice.BleDeviceEmotion r5 = null;
        senAudioTextToDevice(new BleVoice(r2, r3, mVoiceMode, r5, r6, r12, 10, null));
    }

    public final void sendTranslationResult(@tb1 String r1, @tb1 String r2) {
        if (r1 == null) goto L4;
        sendTranslationResultInput(r1);
    L4:
        if (r2 == null) goto L7;
        sendTranslationResultOutput(r2);
        return;
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

    public final void setAloneCallBack(boolean r1) {
        isAloneCallback = r1;
    }

    public final void setMSavePcmTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        mSavePcmTime = r2;
    }

    public final void setSpeechRecRunning(boolean r1) {
        isSpeechRecRunning = r1;
    }

    public final void stop() {
        RecordingManager.Companion.getInstance().stopRecording();
        MicrosoftSDKManage.O1O.OXO1().iX01();
        AISparkChainManager.OXO1.iOI();
        DcsTtsPlayer.INSTANCE.stop();
        AIWatchFaceManager.OXO1.OII();
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 -> AndroidNetworking.cancelAll stop ");
        AndroidNetworking.cancelAll();
        VoicePlayer.INSTANCE.stop();
    }
}
