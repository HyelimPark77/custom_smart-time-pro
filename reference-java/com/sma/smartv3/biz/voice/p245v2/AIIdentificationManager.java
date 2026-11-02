package com.sma.smartv3.biz.voice.p245v2;

import android.app.Application;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.android.mltcode.paycertificationapi.C2263bm;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ke5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.xp5;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.UploadProgressListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.baidu.p559ai.speech.realtime.full.connection.Runner;
import com.baidu.p559ai.speech.realtime.full.download.Result;
import com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.p605ai.AIBase;
import com.sma.smartv3.biz.p605ai.AIError;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.biz.voice.p244ai.WebSocketManager;
import com.sma.smartv3.biz.voice.p245v2.AIIdentificationManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.network.GetAIAudioToText;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.BleVoice;
import com.szabh.smable3.entity.Languages;
import java.io.File;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.ToLongFunction;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class AIIdentificationManager {
    private static boolean isPhoneRecord;
    private static boolean isRealTimeRunning;
    private static boolean isSendResults;

    @tb1
    private static Runner mFullRunner;

    @tb1
    private static OnIdentificationCallback mIdentificationCallback;

    @tb1
    private static PipedInputStream mInputStream;

    @tb1
    private static PipedOutputStream mOutputStream;

    @aa1
    public static final AIIdentificationManager INSTANCE = new AIIdentificationManager();

    @aa1
    private static final String TAG = "AIManagerV2 Identification";

    @aa1
    private static final File mOpusFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.opus");

    @aa1
    private static final File mPcmFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.pcm");

    @aa1
    private static final File mWavFile = new File(PathUtils.getExternalAppDataPath() + "/files/record.wav");

    @aa1
    private static String mCompleteText = "";
    private static int mDeviceSelectedAIMode = -1;

    @aa1
    private static String mContentResult = "";

    @aa1
    private static String mProcessComplete = "";

    @aa1
    private static final MicrosoftSDKManage.InterfaceC19048iO microsoftCallBack = new MicrosoftSDKManage.InterfaceC19048iO() { // from class: com.sma.smartv3.biz.voice.v2.AIIdentificationManager$microsoftCallBack$1
        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResults(int i, String str) {
            Intrinsics.X0O(str, "str");
            i1O0OXO1O.OXO1.OXO1(AIIdentificationManager.TAG + " microsoftCallBack onIdentifyResults -> status = " + i + " str = " + str + " ");
            if (i == 1 && str.length() > 0 && !VoiceManagerV2.INSTANCE.isSpeechRecRunning()) {
                AIIdentificationManager.INSTANCE.setMProcessComplete(str);
                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                if (onIdentificationCallback != null) {
                    onIdentificationCallback.onProcessComplete(str);
                }
            }
            if (i == 2 && str.length() > 0) {
                AIIdentificationManager aIIdentificationManager = AIIdentificationManager.INSTANCE;
                aIIdentificationManager.setSendResults(false);
                aIIdentificationManager.setMContentResult(str);
            }
            if (q62.OiO0IOX(q62.OXO1, null, 1, null) && i == 2) {
                VoiceManagerV2.INSTANCE.setSpeechRecRunning(false);
            }
            if (i == 2 && str.length() > 0 && !VoiceManagerV2.INSTANCE.isSpeechRecRunning()) {
                AIIdentificationManager.INSTANCE.setSendResults(true);
                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback2 = AIIdentificationManager.mIdentificationCallback;
                if (onIdentificationCallback2 != null) {
                    onIdentificationCallback2.onComplete(str);
                }
            }
            if (i == 2 && str.length() == 0 && !VoiceManagerV2.INSTANCE.isSpeechRecRunning()) {
                AIIdentificationManager.INSTANCE.setSendResults(true);
                DcsTtsPlayer.INSTANCE.stop();
                VoiceManager.INSTANCE.sendTranslationResultInput(UtilsKt.XXO(R.string.request_error));
            }
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public /* bridge */ void onIdentifyResultsDetectedLanguage(int i, String str, String str2) {
            super.onIdentifyResultsDetectedLanguage(i, str, str2);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(AIIdentificationManager.TAG + " onStartTransmission ");
            AIIdentificationManager aIIdentificationManager = AIIdentificationManager.INSTANCE;
            aIIdentificationManager.setSendResults(false);
            aIIdentificationManager.setMProcessComplete("");
            aIIdentificationManager.setMContentResult("");
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStopTransmission() {
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str = AIIdentificationManager.TAG;
            AIIdentificationManager aIIdentificationManager = AIIdentificationManager.INSTANCE;
            i1o0oxo1o.OXO1(str + " microsoftCallBack onStopTransmission -> mContentResult = " + aIIdentificationManager.getMContentResult() + " isSendResults = " + aIIdentificationManager.isSendResults());
            if (aIIdentificationManager.isSendResults()) {
                return;
            }
            aIIdentificationManager.setSendResults(true);
            VoiceManagerV2.INSTANCE.setSpeechRecRunning(false);
            if (aIIdentificationManager.getMContentResult().length() > 0) {
                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                if (onIdentificationCallback != null) {
                    onIdentificationCallback.onComplete(aIIdentificationManager.getMContentResult());
                    return;
                }
                return;
            }
            if (aIIdentificationManager.getMProcessComplete().length() > 0) {
                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback2 = AIIdentificationManager.mIdentificationCallback;
                if (onIdentificationCallback2 != null) {
                    onIdentificationCallback2.onComplete(aIIdentificationManager.getMProcessComplete());
                    return;
                }
                return;
            }
            DcsTtsPlayer.INSTANCE.stop();
            AIIdentificationManager.OnIdentificationCallback onIdentificationCallback3 = AIIdentificationManager.mIdentificationCallback;
            if (onIdentificationCallback3 != null) {
                onIdentificationCallback3.onIdentificationError(UtilsKt.XXO(R.string.request_error));
            }
        }
    };

    @aa1
    private static final AIIdentificationManager$mWebSocketCallBack$1 mWebSocketCallBack = new WebSocketManager.OnCallback() { // from class: com.sma.smartv3.biz.voice.v2.AIIdentificationManager$mWebSocketCallBack$1
        private int index;
        private long lastSendTime = System.currentTimeMillis();
        private final StringBuilder answer = new StringBuilder();
        private AIAnswer mAIAnswer = new AIAnswer(AIFunctionType.AI, null, 0, null, null, 26, null);

        private final void handMessage(AIAnswer aIAnswer) {
            i1O0OXO1O.OXO1.OXO1(AIIdentificationManager.TAG + " AIChat handleResponse -> " + aIAnswer);
            if (aIAnswer != null) {
                int i = this.index + 1;
                this.index = i;
                if (i != 1 && aIAnswer.getEnded() != 1) {
                    byte[] bytes = aIAnswer.getText().getBytes(Charsets.XIi00iiXO);
                    Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
                    if (bytes.length >= BleVoice.Companion.getCONTENT_MAX_LENGTH() || System.currentTimeMillis() - this.lastSendTime <= 600) {
                        return;
                    }
                }
                String text = aIAnswer.getText();
                if (q62.OXO1.OXOI0XII()) {
                    text = text + "\n " + UtilsKt.XXO(R.string.ai_generated_label);
                }
                VoiceManager.INSTANCE.senAudioTextToDevice(new BleVoice(1, 0, VoiceManagerV2.INSTANCE.getVoiceMode(), null, System.currentTimeMillis(), text, 10, null));
                BleConnector.INSTANCE.setDisableStreamLog(true);
                this.lastSendTime = System.currentTimeMillis();
                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                if (onIdentificationCallback != null) {
                    onIdentificationCallback.onProcessComplete(aIAnswer.getText());
                }
            }
        }

        public final StringBuilder getAnswer() {
            return this.answer;
        }

        public final AIAnswer getMAIAnswer() {
            return this.mAIAnswer;
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onEmotion(String emotion) {
            Intrinsics.X0O(emotion, "emotion");
            if (q62.OXO1.Xi1XO00()) {
                VoiceManager.INSTANCE.senAudioTextToDevice(new BleVoice(2, 0, VoiceManagerV2.INSTANCE.getVoiceMode(), xp5.XO0O10(emotion), System.currentTimeMillis(), null, 34, null));
            }
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onSttText(String text, boolean z) {
            Intrinsics.X0O(text, "text");
            LogUtils.m11128d(AIIdentificationManager.TAG + " onSttText  text = " + text + " , isFinal = " + z + "  ");
            AIIdentificationManager.OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
            if (onIdentificationCallback != null) {
                onIdentificationCallback.onComplete(text);
            }
            VoiceManagerV2.sendTranslationResult$default(VoiceManagerV2.INSTANCE, text, null, 2, null);
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsStart() {
            BleConnector bleConnector = BleConnector.INSTANCE;
            BleKey bleKey = BleKey.RECORD_PACKET;
            BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
            BleRecordPacket bleRecordPacket = new BleRecordPacket(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, C2263bm.OXO1, null);
            bleRecordPacket.setMStatus(6);
            Unit unit = Unit.OXO1;
            BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, bleRecordPacket, false, false, 24, null);
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsStop() {
            BleConnector bleConnector = BleConnector.INSTANCE;
            BleKey bleKey = BleKey.RECORD_PACKET;
            BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
            BleRecordPacket bleRecordPacket = new BleRecordPacket(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, C2263bm.OXO1, null);
            bleRecordPacket.setMStatus(7);
            Unit unit = Unit.OXO1;
            BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, bleRecordPacket, false, false, 24, null);
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsText(String text, boolean z) {
            String string;
            Intrinsics.X0O(text, "text");
            LogUtils.m11128d(AIIdentificationManager.TAG + " onTtsText  text = " + text + " , isFinal = " + z + "  ");
            this.answer.append(text);
            this.mAIAnswer.setEnded(OiOX0i.m1037iO(z));
            AIAnswer aIAnswer = this.mAIAnswer;
            if (z) {
                string = this.answer.toString();
                Intrinsics.XXI(string);
            } else {
                string = ((Object) this.answer) + APSSharedUtil.TRUNCATE_SEPARATOR;
            }
            aIAnswer.setText(string);
            handMessage(this.mAIAnswer);
            if (z) {
                this.mAIAnswer = new AIAnswer(AIFunctionType.AI, null, 0, null, null, 26, null);
                ke5.XO0X10iO(this.answer);
                this.index = 0;
                VoiceManagerV2.INSTANCE.getAIModelCallback().onComplete(this.mAIAnswer.getText());
            } else {
                VoiceManagerV2.INSTANCE.getAIModelCallback().onProcessComplete(this.mAIAnswer.getText());
            }
            VoiceManagerV2.INSTANCE.sendTranslationResult(null, this.mAIAnswer.getText());
        }

        public final void setMAIAnswer(AIAnswer aIAnswer) {
            Intrinsics.X0O(aIAnswer, "<set-?>");
            this.mAIAnswer = aIAnswer;
        }
    };

    public interface OnIdentificationCallback {

        public static final class DefaultImpls {
            @Deprecated
            public static void onComplete(@aa1 OnIdentificationCallback onIdentificationCallback, @aa1 String text) {
                Intrinsics.X0O(text, "text");
                OnIdentificationCallback.super.onComplete(text);
            }

            @Deprecated
            public static void onEndSuccess(@aa1 OnIdentificationCallback onIdentificationCallback) {
                OnIdentificationCallback.super.onEndSuccess();
            }

            @Deprecated
            public static void onIdentificationError(@aa1 OnIdentificationCallback onIdentificationCallback, @aa1 String msg) {
                Intrinsics.X0O(msg, "msg");
                OnIdentificationCallback.super.onIdentificationError(msg);
            }

            @Deprecated
            public static void onProcessComplete(@aa1 OnIdentificationCallback onIdentificationCallback, @aa1 String text) {
                Intrinsics.X0O(text, "text");
                OnIdentificationCallback.super.onProcessComplete(text);
            }

            @Deprecated
            public static void onStartSuccess(@aa1 OnIdentificationCallback onIdentificationCallback) {
                OnIdentificationCallback.super.onStartSuccess();
            }
        }

        default void onComplete(@aa1 String text) {
            Intrinsics.X0O(text, "text");
        }

        default void onEndSuccess() {
        }

        default void onIdentificationError(@aa1 String msg) {
            Intrinsics.X0O(msg, "msg");
        }

        default void onProcessComplete(@aa1 String text) {
            Intrinsics.X0O(text, "text");
        }

        default void onStartSuccess() {
        }
    }

    private AIIdentificationManager() {
    }

    public static /* synthetic */ void identificationBegins$default(AIIdentificationManager aIIdentificationManager, boolean z, OnIdentificationCallback onIdentificationCallback, boolean z2, int i, RecordingManager.OnRecordingCallback onRecordingCallback, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        aIIdentificationManager.identificationBegins(z, onIdentificationCallback, z2, i, onRecordingCallback);
    }

    private final void onWebSocketManagerStart() {
        WebSocketManager webSocketManager = WebSocketManager.INSTANCE;
        webSocketManager.sendStartListenMessage(false);
        webSocketManager.setMOnCallback(mWebSocketCallBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollCheckStop() {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.sma.smartv3.biz.voice.v2.AIIdentificationManager$pollCheckStop$timerTask$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (AIIdentificationManager.mFullRunner != null) {
                    Runner runner = AIIdentificationManager.mFullRunner;
                    Intrinsics.XXI(runner);
                    if (runner.isClosed()) {
                        AIIdentificationManager aIIdentificationManager = AIIdentificationManager.INSTANCE;
                        AIIdentificationManager.isRealTimeRunning = false;
                    }
                }
                if (AIIdentificationManager.isRealTimeRunning) {
                    return;
                }
                cancel();
                timer.cancel();
                AIIdentificationManager.INSTANCE.stopRealTime();
            }
        }, 500L, 500L);
    }

    private final void savePcmFile() {
        ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.iX01
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AIIdentificationManager.savePcmFile$lambda$0();
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    /* JADX WARN: Code duplicated, block: B:19:0x00aa  */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0082, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x00aa, please report this as an issue */
    public static final Unit savePcmFile$lambda$0() throws InterruptedException {
        VoiceManagerV2 voiceManagerV2 = VoiceManagerV2.INSTANCE;
        if (voiceManagerV2.getMSavePcmTime().length() > 0) {
            Thread.sleep(2000L);
            File file = new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm");
            if (!file.exists()) {
                FileUtils.createOrExistsDir(file);
            }
            q62 q62Var = q62.OXO1;
            if (q62Var.XOX() && q62Var.iX0iiiXi()) {
                VoiceManager voiceManager = VoiceManager.INSTANCE;
                if (voiceManager.isSupportDevicePhoneVoiceAIChat() && !voiceManager.isVoiceAIIdentify()) {
                    FileUtils.copy(mOpusFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + voiceManagerV2.getMSavePcmTime() + ".opus"));
                } else if (voiceManagerV2.isVoiceAiChatContext()) {
                    FileUtils.copy(mOpusFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + voiceManagerV2.getMSavePcmTime() + ".opus"));
                } else {
                    FileUtils.copy(mPcmFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + voiceManagerV2.getMSavePcmTime() + ".pcm"));
                }
            } else if (voiceManagerV2.isVoiceAiChatContext()) {
                FileUtils.copy(mOpusFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + voiceManagerV2.getMSavePcmTime() + ".opus"));
            } else {
                FileUtils.copy(mPcmFile, new File(PathUtils.getExternalAppDataPath() + "/files/save_pcm/record_" + voiceManagerV2.getMSavePcmTime() + ".pcm"));
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                final Function1 function1 = new Function1() { // from class: com.android.mltcode.paycertificationapi.X0I1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Long.valueOf(((File) obj).lastModified());
                    }
                };
                Comparator comparatorComparingLong = Comparator.comparingLong(new ToLongFunction() { // from class: com.android.mltcode.paycertificationapi.I0i0
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return AIIdentificationManager.savePcmFile$lambda$0$1(function1, obj);
                    }
                });
                Intrinsics.O10IXXX0X(comparatorComparingLong, "comparingLong(...)");
                ArraysKt___ArraysJvmKt.O1I(fileArrListFiles, comparatorComparingLong);
                if (fileArrListFiles.length > 10) {
                    ((File) ArraysKt___ArraysKt.IO0(fileArrListFiles)).delete();
                }
            }
            voiceManagerV2.setMSavePcmTime("");
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long savePcmFile$lambda$0$1(Function1 function1, Object obj) {
        return ((Number) function1.invoke2(obj)).longValue();
    }

    private final void serviceIdentificationAudio(File file, final O1XIiIO<String> o1XIiIO) {
        String strXiOIii1 = AIManager.OXO1.XiOIii1(mDeviceSelectedAIMode);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String baseUrl = netWorkUtils.getBaseUrl(GetAIAudioToText.URL_V2);
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        String language = UtilsKt.IiiXiI0I(app) ? Languages.DEFAULT_LANGUAGE_ZH : Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        i1O0OXO1O.OXO1.OXO1(TAG + " serviceIdentificationAudio -> " + file + "  toLang = " + language + " , model = " + strXiOIii1);
        AndroidNetworking.upload(baseUrl).addHeaders(netWorkUtils.getHeadersMap()).addQueryParameter("model", strXiOIii1).addQueryParameter("toLang", language).addMultipartFile("audioFile", file).setTag((Object) "serviceIdentificationAudio").setPriority(Priority.HIGH).build().setUploadProgressListener(new UploadProgressListener() { // from class: com.android.mltcode.paycertificationapi.I0iOXO
            @Override // com.androidnetworking.interfaces.UploadProgressListener
            public final void onProgress(long j, long j2) {
                AIIdentificationManager.serviceIdentificationAudio$lambda$0(j, j2);
            }
        }).getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.voice.v2.AIIdentificationManager.serviceIdentificationAudio.2
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError anError) {
                AIError aIError;
                Intrinsics.X0O(anError, "anError");
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1(AIIdentificationManager.TAG + " serviceIdentificationAudio onError -> " + anError);
                AIBase aIBase = (AIBase) anError.getErrorAsObject(AIBase.class);
                if (aIBase == null || (aIError = aIBase.getError()) == null) {
                    aIError = new AIError(String.valueOf(anError.getMessage()), null, null, null, 14, null);
                }
                i1o0oxo1o.OXO1(AIIdentificationManager.TAG + "  serviceIdentificationAudio onError -> " + anError.getErrorBody() + ", " + aIError);
                O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                if (o1XIiIO2 != null) {
                    o1XIiIO2.handleError(aIError.getMessage());
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                i1O0OXO1O.OXO1.OXO1(AIIdentificationManager.TAG + " serviceIdentificationAudio onResponse -> " + jSONObject);
                if (jSONObject != null) {
                    try {
                        String string = jSONObject.getString("data");
                        if (string != null) {
                            O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                            if (string.length() > 0) {
                                if (o1XIiIO2 != null) {
                                    o1XIiIO2.handleResponse(string);
                                }
                            } else {
                                ToastUtils.showLong(R.string.speech_recognition_error);
                                if (o1XIiIO2 != null) {
                                    o1XIiIO2.handleError(UtilsKt.XXO(R.string.speech_recognition_error));
                                }
                            }
                        }
                    } catch (Exception e) {
                        i1O0OXO1O.OXO1.OXO1(AIIdentificationManager.TAG + " serviceIdentificationAudio Exception -> " + e);
                        AIError aIError = new AIError(UtilsKt.XXO(R.string.voice_assistant_common_error), null, null, null, 14, null);
                        O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                        if (o1XIiIO3 != null) {
                            o1XIiIO3.handleError(aIError.getMessage());
                        }
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void serviceIdentificationAudio$default(AIIdentificationManager aIIdentificationManager, File file, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        aIIdentificationManager.serviceIdentificationAudio(file, o1XIiIO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void serviceIdentificationAudio$lambda$0(long j, long j2) {
    }

    private final void serviceIdentify() {
        File file = mWavFile;
        if (file.exists()) {
            file.delete();
        }
        new gq1(16000, 16, 2).OXO1(mPcmFile.getPath(), file.getPath());
        INSTANCE.serviceIdentificationAudio(file, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.v2.AIIdentificationManager$serviceIdentify$1$1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:21:0x004a  */
            /* JADX WARN: Code duplicated, block: B:24:0x005a  */
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                switch (error) {
                    case "2004":
                        ToastUtils.showLong(R.string.login_user_info_error);
                        break;
                    case "4006":
                    case "5001":
                    case "5002":
                    case "5003":
                        VoiceManager.INSTANCE.postEvent(b01.II1, error);
                        break;
                    case "null":
                        VoiceManagerV2.INSTANCE.sendError(UtilsKt.XXO(R.string.voice_assistant_common_error));
                        break;
                    default:
                        VoiceManagerV2.INSTANCE.sendError(UtilsKt.XXO(R.string.voice_assistant_network_error));
                        break;
                }
                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                if (onIdentificationCallback != null) {
                    onIdentificationCallback.onIdentificationError(UtilsKt.XXO(R.string.voice_assistant_network_error));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str) {
                if (str == null || str.length() <= 0 || Intrinsics.XOO0ii0(str, JsonUtils.EMPTY_JSON)) {
                    AIIdentificationManager.OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                    if (onIdentificationCallback != null) {
                        onIdentificationCallback.onIdentificationError(UtilsKt.XXO(R.string.voice_assistant_network_error));
                        return;
                    }
                    return;
                }
                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback2 = AIIdentificationManager.mIdentificationCallback;
                if (onIdentificationCallback2 != null) {
                    onIdentificationCallback2.onComplete(str);
                }
            }
        });
    }

    private final void startRealTime() {
        if (q62.OXO1.XOX() || isRealTimeRunning) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(TAG + " -> startRealTime");
        ThreadUtils.executeByIo(new ThreadUtils.SimpleTask<Void>() { // from class: com.sma.smartv3.biz.voice.v2.AIIdentificationManager.startRealTime.1
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public void onSuccess(Void r1) {
            }

            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public Void doInBackground() {
                try {
                    AIIdentificationManager aIIdentificationManager = AIIdentificationManager.INSTANCE;
                    AIIdentificationManager.isRealTimeRunning = true;
                    AIIdentificationManager.mInputStream = new PipedInputStream();
                    AIIdentificationManager.mOutputStream = new PipedOutputStream(AIIdentificationManager.mInputStream);
                    AIIdentificationManager.mFullRunner = new Runner(AIIdentificationManager.mInputStream, 2);
                    Runner runner = AIIdentificationManager.mFullRunner;
                    if (runner != null) {
                        runner.run(new SimpleDownloader() { // from class: com.sma.smartv3.biz.voice.v2.AIIdentificationManager$startRealTime$1$doInBackground$1
                            @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
                            public void onFailure(String reason) {
                                Intrinsics.X0O(reason, "reason");
                                i1O0OXO1O.OXO1.OXO1(AIIdentificationManager.TAG + " onFailure -> " + reason);
                                ToastUtils.showLong(UtilsKt.XXO(R.string.speech_recognition_error) + IiXI1X1OO.O00 + reason, new Object[0]);
                                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                                if (onIdentificationCallback != null) {
                                    onIdentificationCallback.onIdentificationError(UtilsKt.XXO(R.string.speech_recognition_error));
                                }
                            }

                            @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
                            public void onMessage(Result result) {
                                Intrinsics.X0O(result, "result");
                                i1O0OXO1O.OXO1.OXO1(AIIdentificationManager.TAG + " onMessage -> " + result.getOrignalJsonStr());
                                if (result.isError()) {
                                    AIIdentificationManager.OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                                    if (onIdentificationCallback != null) {
                                        String result2 = result.getResult();
                                        Intrinsics.O10IXXX0X(result2, "getResult(...)");
                                        onIdentificationCallback.onIdentificationError(result2);
                                        return;
                                    }
                                    return;
                                }
                                String result3 = result.getResult();
                                if (result.isFin()) {
                                    AIIdentificationManager.OnIdentificationCallback onIdentificationCallback2 = AIIdentificationManager.mIdentificationCallback;
                                    if (onIdentificationCallback2 != null) {
                                        Intrinsics.XXI(result3);
                                        onIdentificationCallback2.onComplete(result3);
                                        return;
                                    }
                                    return;
                                }
                                AIIdentificationManager.OnIdentificationCallback onIdentificationCallback3 = AIIdentificationManager.mIdentificationCallback;
                                if (onIdentificationCallback3 != null) {
                                    Intrinsics.XXI(result3);
                                    onIdentificationCallback3.onProcessComplete(result3);
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    ToastUtils.showLong(UtilsKt.XXO(R.string.speech_recognition_error) + "\n" + e, new Object[0]);
                    OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                    if (onIdentificationCallback != null) {
                        onIdentificationCallback.onIdentificationError(e.toString());
                    }
                }
                AIIdentificationManager.INSTANCE.pollCheckStop();
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stopRealTime() {
        try {
            PipedInputStream pipedInputStream = mInputStream;
            if (pipedInputStream != null) {
                pipedInputStream.close();
            }
            PipedOutputStream pipedOutputStream = mOutputStream;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mInputStream = null;
            mOutputStream = null;
            mFullRunner = null;
            isRealTimeRunning = false;
        }
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
    public final MicrosoftSDKManage.InterfaceC19048iO getMicrosoftCallBack() {
        return microsoftCallBack;
    }

    public final void identificationBegins(boolean z, @aa1 OnIdentificationCallback identificationCallback, boolean z2, int i, @aa1 RecordingManager.OnRecordingCallback recordingCallBack) {
        Intrinsics.X0O(identificationCallback, "identificationCallback");
        Intrinsics.X0O(recordingCallBack, "recordingCallBack");
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            RecordingManager.Companion.getInstance().playTip();
        }
        mDeviceSelectedAIMode = i;
        isPhoneRecord = z;
        mCompleteText = "";
        AITranslationManager aITranslationManager = AITranslationManager.INSTANCE;
        LanguageTranslationData languageTranslationData = aITranslationManager.getLanguageTranslationData();
        LanguageTranslationData toLanguageTranslationData = VoiceManagerV2.INSTANCE.isTranslation() ? aITranslationManager.getToLanguageTranslationData() : aITranslationManager.getLanguageTranslationData();
        mIdentificationCallback = identificationCallback;
        if (isPhoneRecord) {
            if (q62Var.X11I()) {
                i1O0OXO1O.OXO1.OXO1(TAG + " start isPhoneRecord =" + isPhoneRecord + " MicrosoftSDKManage languageTranslationData=" + languageTranslationData);
                MicrosoftSDKManage.O1O.OXO1().iIX0i(languageTranslationData.getAsrLanguage(), isPhoneRecord, toLanguageTranslationData.getTtsViuceName(), toLanguageTranslationData.getAsrLanguage(), z2 ^ true);
                return;
            }
            if (q62Var.OIXOOi() || mDeviceSelectedAIMode == 2) {
                AISparkChainManager.OXO1.IO0iXO0O();
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                String str = TAG;
                i1o0oxo1o.OXO1(str + " start isPhoneRecord =" + isPhoneRecord + " SparkChainAIManage");
                RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), recordingCallBack, false, false, str, 4, null);
                return;
            }
            i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
            String str2 = TAG;
            i1o0oxo1o2.OXO1(str2 + " start isPhoneRecord =" + isPhoneRecord + " identification");
            startRealTime();
            RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), recordingCallBack, true, false, str2, 4, null);
            return;
        }
        if (isWebSocket()) {
            onWebSocketManagerStart();
            return;
        }
        if (q62Var.X11I()) {
            i1O0OXO1O.OXO1.OXO1(TAG + " start isPhoneRecord =" + isPhoneRecord + " MicrosoftSDKManage languageTranslationData=" + languageTranslationData);
            MicrosoftSDKManage.O1O.OXO1().iIX0i(languageTranslationData.getAsrLanguage(), isPhoneRecord, toLanguageTranslationData.getTtsViuceName(), toLanguageTranslationData.getAsrLanguage(), false);
            return;
        }
        if (!q62Var.OIXOOi() && i != 2) {
            i1O0OXO1O.OXO1.OXO1(TAG + " start isPhoneRecord =" + isPhoneRecord + " identification");
            if (q62Var.IiX1ii()) {
                startRealTime();
                return;
            }
            return;
        }
        AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
        aISparkChainManager.IO0iXO0O();
        i1O0OXO1O.OXO1.OXO1(TAG + " start isPhoneRecord =" + isPhoneRecord + " SparkChainAIManage");
        if (aISparkChainManager.iOO1ii1()) {
            RecordingManager.Companion.getInstance().startRealTimeASR(recordingCallBack);
        }
    }

    public final void identificationCompleted() {
        i1O0OXO1O.OXO1.OXO1(TAG + " end isPhoneRecord =" + isPhoneRecord);
        if (isPhoneRecord) {
            RecordingManager.Companion.getInstance().stopRecording();
        }
        if (isWebSocket()) {
            WebSocketManager.INSTANCE.sendStopListenMessage();
        } else {
            q62 q62Var = q62.OXO1;
            if (q62Var.X11I()) {
                if (isPhoneRecord) {
                    MicrosoftSDKManage.O1O.OXO1().XOIO11O();
                } else {
                    MicrosoftSDKManage.O1O.OXO1().m38829Xi();
                }
            } else if (q62Var.OIXOOi() || mDeviceSelectedAIMode == 2) {
                if (!AISparkChainManager.OXO1.iOO1ii1()) {
                    ToastUtils.showLong(UtilsKt.XXO(R.string.speech_recognition_error), new Object[0]);
                    OnIdentificationCallback onIdentificationCallback = mIdentificationCallback;
                    if (onIdentificationCallback != null) {
                        onIdentificationCallback.onIdentificationError("Authorize error");
                    }
                } else if (isPhoneRecord) {
                    RecordingManager.Companion.getInstance().stopRecording();
                } else {
                    RecordingManager.realTimeASRend$default(RecordingManager.Companion.getInstance(), 0, 0, 3, null);
                }
            }
        }
        if (!isWebSocket()) {
            q62 q62Var2 = q62.OXO1;
            if (!q62Var2.X11I() && !q62Var2.OIXOOi() && mDeviceSelectedAIMode != 2) {
                if (q62Var2.XOX()) {
                    serviceIdentify();
                } else if (!q62Var2.IiX1ii()) {
                    if (TextUtils.isEmpty(q62Var2.iIiiO())) {
                        ToastUtils.showLong(R.string.no_ai_key);
                        OnIdentificationCallback onIdentificationCallback2 = mIdentificationCallback;
                        if (onIdentificationCallback2 != null) {
                            onIdentificationCallback2.onIdentificationError(UtilsKt.XXO(R.string.no_ai_key));
                        }
                    } else {
                        gq1 gq1Var = new gq1(16000, 16, 2);
                        VoiceManager voiceManager = VoiceManager.INSTANCE;
                        gq1Var.OXO1(voiceManager.getMPcmFile().getPath(), voiceManager.getMWavFile().getPath());
                        INSTANCE.oldOpenAiChatCompletion();
                    }
                }
            }
        }
        savePcmFile();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    public final void identificationProcess(@aa1 byte[] bArr) {
        byte[] bArr2;
        q62 q62Var;
        VoiceManager voiceManager;
        Intrinsics.X0O(bArr, "byte");
        if (isWebSocket()) {
            WebSocketManager.INSTANCE.sendAudioStreamWithBuffer(bArr);
        } else {
            q62 q62Var2 = q62.OXO1;
            if (q62Var2.X11I()) {
                MicrosoftSDKManage.O1O.OXO1().m38828Oi(bArr);
            } else {
                if (q62Var2.OIXOOi() || mDeviceSelectedAIMode == 2) {
                    if (AISparkChainManager.OXO1.iOO1ii1()) {
                        bArr2 = bArr;
                        RecordingManager.realTimeASRing$default(RecordingManager.Companion.getInstance(), bArr2, 0, bArr.length, 2, null);
                    }
                    q62Var = q62.OXO1;
                    if (q62Var.XOX() && q62Var.iX0iiiXi()) {
                        voiceManager = VoiceManager.INSTANCE;
                        if (voiceManager.isSupportDevicePhoneVoiceAIChat() && !voiceManager.isVoiceAIIdentify()) {
                            FileIOUtils.writeFileFromBytesByStream(mOpusFile, bArr2, true);
                            return;
                        }
                    }
                    if (VoiceManagerV2.INSTANCE.isVoiceAiChatContext()) {
                        FileIOUtils.writeFileFromBytesByStream(mOpusFile, bArr2, true);
                    } else {
                        FileIOUtils.writeFileFromBytesByStream(mPcmFile, bArr2, true);
                    }
                }
                if (!q62Var2.XOX() && q62Var2.IiX1ii()) {
                    sendRealTime(bArr);
                }
            }
        }
        bArr2 = bArr;
        q62Var = q62.OXO1;
        if (q62Var.XOX()) {
            voiceManager = VoiceManager.INSTANCE;
            if (voiceManager.isSupportDevicePhoneVoiceAIChat()) {
                FileIOUtils.writeFileFromBytesByStream(mOpusFile, bArr2, true);
                return;
            }
        }
        if (VoiceManagerV2.INSTANCE.isVoiceAiChatContext()) {
            FileIOUtils.writeFileFromBytesByStream(mOpusFile, bArr2, true);
        } else {
            FileIOUtils.writeFileFromBytesByStream(mPcmFile, bArr2, true);
        }
    }

    public final boolean isPhoneRecord() {
        return isPhoneRecord;
    }

    public final boolean isSendResults() {
        return isSendResults;
    }

    public final boolean isWebSocket() {
        q62 q62Var = q62.OXO1;
        if (q62Var.XOX() && q62Var.iX0iiiXi()) {
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            if (voiceManager.isSupportDevicePhoneVoiceAIChat() && !voiceManager.isVoiceAIIdentify()) {
                return true;
            }
        }
        return VoiceManagerV2.INSTANCE.isVoiceAiChatContext();
    }

    public final void oldOpenAiChatCompletion() {
        VoiceManager.INSTANCE.openAiTranscriptionsAudio(mWavFile, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.v2.AIIdentificationManager.oldOpenAiChatCompletion.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                if (StringsKt__StringsKt.iIi011O(error, "invalid_request_error", false, 2, null)) {
                    OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                    if (onIdentificationCallback != null) {
                        onIdentificationCallback.onIdentificationError(UtilsKt.XXO(R.string.openai_request_error));
                        return;
                    }
                    return;
                }
                OnIdentificationCallback onIdentificationCallback2 = AIIdentificationManager.mIdentificationCallback;
                if (onIdentificationCallback2 != null) {
                    onIdentificationCallback2.onIdentificationError(UtilsKt.XXO(R.string.speech_recognition_error));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str) {
                if (str != null) {
                    VoiceManagerV2.INSTANCE.setSpeechRecRunning(false);
                    OnIdentificationCallback onIdentificationCallback = AIIdentificationManager.mIdentificationCallback;
                    if (onIdentificationCallback != null) {
                        onIdentificationCallback.onComplete(str);
                    }
                }
            }
        });
    }

    public final void sendRealTime(@aa1 byte[] bytes) {
        Intrinsics.X0O(bytes, "bytes");
        try {
            PipedOutputStream pipedOutputStream = mOutputStream;
            if (pipedOutputStream != null) {
                pipedOutputStream.write(bytes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void setMCompleteText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        mCompleteText = str;
    }

    public final void setMContentResult(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        mContentResult = str;
    }

    public final void setMDeviceSelectedAIMode(int i) {
        mDeviceSelectedAIMode = i;
    }

    public final void setMProcessComplete(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        mProcessComplete = str;
    }

    public final void setPhoneRecord(boolean z) {
        isPhoneRecord = z;
    }

    public final void setSendResults(boolean z) {
        isSendResults = z;
    }
}
