package com.sma.smartv3.biz.voice.p244ai;

import android.app.Application;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.n77;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q77;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.Utils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.C12616d4;
import com.sma.androidnetworklib.HttpLoggingInterceptor;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.voice.p244ai.PcmPlayer;
import com.sma.smartv3.biz.voice.p244ai.TimestampedAudioData;
import com.sma.smartv3.biz.voice.p244ai.WebSocketManager;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.util.UtilsKt;
import com.smart.opus.OpusConstants;
import com.smart.opus.SmartOpus;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWebSocketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketManager.kt\ncom/sma/smartv3/biz/voice/ai/WebSocketManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,654:1\n774#2:655\n865#2,2:656\n1869#2,2:658\n1#3:660\n*S KotlinDebug\n*F\n+ 1 WebSocketManager.kt\ncom/sma/smartv3/biz/voice/ai/WebSocketManager\n*L\n379#1:655\n379#1:656,2\n382#1:658,2\n*E\n"})
public final class WebSocketManager {
    private static final long AUDIO_BUFFER_TIMEOUT = 3000;

    @aa1
    public static final String TAG = "WebSocketManager";

    @tb1
    private static Timer idleTimer;
    private static boolean isInit;
    private static boolean isMuted;
    private static boolean isWsConnected;
    private static boolean isWsConnecting;
    private static long lastAudioTime;
    private static Application mApp;
    private static final int mFrameBytes;
    private static final int mFrameSize;

    @tb1
    private static OnCallback mOnCallback;

    @tb1
    private static SmartOpus mOpus;

    @tb1
    private static PcmPlayer mPcmPlayer;

    @tb1
    private static String mToken;

    @tb1
    private static n77 mWsManager;

    @tb1
    private static String pendingMessage;

    @aa1
    public static final WebSocketManager INSTANCE = new WebSocketManager();

    @aa1
    private static String mSessionId = "";
    private static final int mFrameDuration = 20;

    @aa1
    private static final List<TimestampedAudioData> audioBuffer = new ArrayList();
    private static final long IDLE_TIMEOUT = 600000;

    @aa1
    private static WebSocketManager$mWsStatusListener$1 mWsStatusListener = new q77() { // from class: com.sma.smartv3.biz.voice.ai.WebSocketManager$mWsStatusListener$1
        @Override // com.android.mltcode.paycertificationapi.q77
        public void onClosed(int i, String reason) {
            Intrinsics.X0O(reason, "reason");
            i1O0OXO1O.OXO1.XIi00iiXO("WebSocketManager onClosed: " + i + ", " + reason);
            WebSocketManager.INSTANCE.updateConnectionState(false);
        }

        @Override // com.android.mltcode.paycertificationapi.q77
        public void onClosing(int i, String reason) {
            Intrinsics.X0O(reason, "reason");
            i1O0OXO1O.OXO1.XIi00iiXO("WebSocketManager onClosing: " + i + ", " + reason);
            WebSocketManager.INSTANCE.updateConnectionState(false);
        }

        @Override // com.android.mltcode.paycertificationapi.q77
        public void onFailure(Throwable t, Response response) {
            Intrinsics.X0O(t, "t");
            i1O0OXO1O.OXO1.XIi00iiXO("WebSocketManager onFailure: " + t + ", " + response);
            WebSocketManager.INSTANCE.updateConnectionState(false);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.android.mltcode.paycertificationapi.q77
        public void onMessage(String text) {
            WebSocketManager.OnCallback mOnCallback2;
            Intrinsics.X0O(text, "text");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("WebSocketManager onMessage: " + text);
            try {
                if (Intrinsics.XOO0ii0(text, "ping")) {
                    return;
                }
                WebSocketManager webSocketManager = WebSocketManager.INSTANCE;
                webSocketManager.resetIdleTimer();
                JSONObject jSONObject = new JSONObject(text);
                String strOptString = jSONObject.optString(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
                Intrinsics.XXI(strOptString);
                if (strOptString.length() > 0) {
                    i1o0oxo1o.OXO1("WebSocketManager Update sessionId: " + strOptString);
                    WebSocketManager.mSessionId = strOptString;
                }
                String strOptString2 = jSONObject.optString("type");
                if (strOptString2 != null) {
                    switch (strOptString2.hashCode()) {
                        case -1624760229:
                            if (strOptString2.equals("emotion")) {
                                String strOptString3 = jSONObject.optString("emotion");
                                Intrinsics.XXI(strOptString3);
                                if (strOptString3.length() > 0) {
                                    i1o0oxo1o.OXO1("WebSocketManager emotion -> " + strOptString3);
                                    return;
                                }
                                return;
                            }
                            break;
                        case -905826493:
                            if (strOptString2.equals("server")) {
                                String strOptString4 = jSONObject.optString("msg");
                                double dOptDouble = jSONObject.optDouble("duration");
                                Intrinsics.XXI(strOptString4);
                                if (strOptString4.length() > 0) {
                                    i1o0oxo1o.OXO1("WebSocketManager server -> " + strOptString4 + " " + dOptDouble);
                                    return;
                                }
                                return;
                            }
                            break;
                        case 107245:
                            if (strOptString2.equals("llm")) {
                                String strOptString5 = jSONObject.optString("emotion");
                                Intrinsics.XXI(strOptString5);
                                if (strOptString5.length() > 0) {
                                    i1o0oxo1o.OXO1("WebSocketManager llm -> emotion = " + strOptString5);
                                    WebSocketManager.OnCallback mOnCallback3 = webSocketManager.getMOnCallback();
                                    if (mOnCallback3 != null) {
                                        mOnCallback3.onEmotion(strOptString5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            break;
                        case 114227:
                            if (strOptString2.equals("stt")) {
                                String strOptString6 = jSONObject.optString("text");
                                Intrinsics.XXI(strOptString6);
                                if (strOptString6.length() > 0) {
                                    i1o0oxo1o.OXO1("WebSocketManager stt -> " + strOptString6);
                                    WebSocketManager.OnCallback mOnCallback4 = webSocketManager.getMOnCallback();
                                    if (mOnCallback4 != null) {
                                        mOnCallback4.onSttText(strOptString6, true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            break;
                        case 115187:
                            if (strOptString2.equals("tts")) {
                                String strOptString7 = jSONObject.optString("state");
                                String strOptString8 = jSONObject.optString("text");
                                i1o0oxo1o.OXO1("WebSocketManager tts -> " + strOptString7 + ", text:" + strOptString8);
                                if (Intrinsics.XOO0ii0(strOptString7, "start")) {
                                    return;
                                }
                                if (Intrinsics.XOO0ii0(strOptString7, "sentence_start")) {
                                    Intrinsics.XXI(strOptString8);
                                    if (strOptString8.length() > 0) {
                                        WebSocketManager.OnCallback mOnCallback5 = webSocketManager.getMOnCallback();
                                        if (mOnCallback5 != null) {
                                            mOnCallback5.onTtsText(strOptString8, false);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if ((Intrinsics.XOO0ii0(strOptString7, "stop") || Intrinsics.XOO0ii0(strOptString7, "sentence_end")) && (mOnCallback2 = webSocketManager.getMOnCallback()) != null) {
                                    Intrinsics.XXI(strOptString8);
                                    mOnCallback2.onTtsText(strOptString8, true);
                                    return;
                                }
                                return;
                            }
                            break;
                        case 99162322:
                            if (strOptString2.equals("hello")) {
                                if (WebSocketManager.isWsConnecting) {
                                    webSocketManager.updateConnectionState(true);
                                    return;
                                }
                                return;
                            }
                            break;
                        case 109757538:
                            if (strOptString2.equals("start")) {
                                return;
                            }
                            break;
                    }
                }
                i1o0oxo1o.OXO1("WebSocketManager 收到未知类型消息 -> " + strOptString2 + ", 原始数据：" + text);
            } catch (Exception e) {
                e.printStackTrace();
                i1O0OXO1O.OXO1.OXO1("WebSocketManager 解析消息失败 -> " + e.getLocalizedMessage() + ", 原始数据：" + text);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.q77
        public void onOpen(Response response) throws JSONException {
            Intrinsics.X0O(response, "response");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "hello");
            jSONObject.put("version", 1);
            jSONObject.put("transport", "websocket");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("format", "opus");
            jSONObject2.put("sample_rate", 16000);
            jSONObject2.put("channels", 1);
            jSONObject2.put("frame_duration", WebSocketManager.INSTANCE.getMFrameDuration());
            Unit unit = Unit.OXO1;
            jSONObject.put("audio_params", jSONObject2);
            i1O0OXO1O.OXO1.OXO1("WebSocketManager onOpen hello: " + jSONObject);
            n77 n77Var = WebSocketManager.mWsManager;
            if (n77Var != null) {
                n77Var.I0IIOi(jSONObject.toString());
            }
        }

        @Override // com.android.mltcode.paycertificationapi.q77
        public void onReconnect() {
            i1O0OXO1O.OXO1.OXO1("WebSocketManager onReconnect");
        }

        @Override // com.android.mltcode.paycertificationapi.q77
        public void onMessage(ByteString bytes) {
            Intrinsics.X0O(bytes, "bytes");
            WebSocketManager webSocketManager = WebSocketManager.INSTANCE;
            webSocketManager.resetIdleTimer();
            SmartOpus smartOpus = WebSocketManager.mOpus;
            byte[] bArrDecode$default = smartOpus != null ? SmartOpus.decode$default(smartOpus, bytes.toByteArray(), OpusConstants.FrameSize.Companion.fromValue(1920), 0, 4, (Object) null) : null;
            if (bArrDecode$default != null) {
                PcmPlayer mPcmPlayer2 = webSocketManager.getMPcmPlayer();
                if (mPcmPlayer2 != null) {
                    mPcmPlayer2.write(bArrDecode$default);
                    return;
                }
                return;
            }
            i1O0OXO1O.OXO1.OXO1("WebSocketManager onMessage 解码失败");
        }
    };

    public interface OnCallback {
        void onEmotion(@aa1 String str);

        void onSttText(@aa1 String str, boolean z);

        void onTtsStart();

        void onTtsStop();

        void onTtsText(@aa1 String str, boolean z);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.sma.smartv3.biz.voice.ai.WebSocketManager$mWsStatusListener$1] */
    static {
        int i = (20 * 16000) / 1000;
        mFrameSize = i;
        mFrameBytes = i * 2;
    }

    private WebSocketManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIdleTimeout() {
        if (System.currentTimeMillis() - lastAudioTime > IDLE_TIMEOUT) {
            i1O0OXO1O.OXO1.OXO1("WebSocketManager Idle timeout, unInitWsManager");
            unInitWsManager();
        }
    }

    public static /* synthetic */ void init$default(WebSocketManager webSocketManager, Application application, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        webSocketManager.init(application, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$0(boolean z, boolean z2) {
        if (z2) {
            mToken = UtilsKt.XiOIii1(ExternalKeyManager.AI_KEY);
            if (z) {
                INSTANCE.initWsManager();
            }
        } else {
            i1O0OXO1O.OXO1.OXO1("WebSocketManager ak error");
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPlayer$lambda$0(PcmPlayer.PlayState playState) {
        OnCallback onCallback;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager onPlayStateChanged " + playState);
        if (playState == PcmPlayer.PlayState.playing) {
            OnCallback onCallback2 = mOnCallback;
            if (onCallback2 != null) {
                onCallback2.onTtsStart();
                return;
            }
            return;
        }
        if (playState != PcmPlayer.PlayState.stopped || (onCallback = mOnCallback) == null) {
            return;
        }
        onCallback.onTtsStop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetIdleTimer() {
        lastAudioTime = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendAudioStreamWithBuffer$lambda$0$0(long j, TimestampedAudioData it) {
        Intrinsics.X0O(it, "it");
        return j - it.getTimestamp() > 3000;
    }

    private final void sendBufferedAudio() {
        List<TimestampedAudioData> list = audioBuffer;
        synchronized (list) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<TimestampedAudioData> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (jCurrentTimeMillis - ((TimestampedAudioData) obj).getTimestamp() <= 3000) {
                        arrayList.add(obj);
                    }
                }
                i1O0OXO1O.OXO1.OXO1("WebSocketManager sendBufferedAudio -> total:" + audioBuffer.size() + ", valid:" + arrayList.size());
                for (TimestampedAudioData timestampedAudioData : arrayList) {
                    if (isWsConnected) {
                        INSTANCE.sendAudioStream(timestampedAudioData.getData());
                    }
                }
                audioBuffer.clear();
                Unit unit = Unit.OXO1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void sendPendingMessage() {
        String str = pendingMessage;
        if (str != null) {
            n77 n77Var = mWsManager;
            Boolean boolValueOf = n77Var != null ? Boolean.valueOf(n77Var.I0IIOi(str)) : null;
            i1O0OXO1O.OXO1.OXO1("WebSocketManager sendPendingMessage " + str + ", " + boolValueOf);
            pendingMessage = null;
        }
    }

    public static /* synthetic */ void sendStartListenMessage$default(WebSocketManager webSocketManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        webSocketManager.sendStartListenMessage(z);
    }

    private final void startIdleTimer() {
        stopIdleTimer();
        i1O0OXO1O.OXO1.OXO1("WebSocketManager startIdleTimer");
        Timer timer = new Timer();
        idleTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.sma.smartv3.biz.voice.ai.WebSocketManager.startIdleTimer.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                WebSocketManager.INSTANCE.checkIdleTimeout();
            }
        }, 1000L, 1000L);
    }

    private final void stopIdleTimer() {
        i1O0OXO1O.OXO1.OXO1("WebSocketManager stopIdleTimer");
        Timer timer = idleTimer;
        if (timer != null) {
            timer.cancel();
        }
        idleTimer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConnectionState(boolean z) {
        isWsConnected = z;
        isWsConnecting = false;
        if (!z) {
            stopIdleTimer();
            return;
        }
        startIdleTimer();
        sendBufferedAudio();
        sendPendingMessage();
    }

    public final void destroy() {
        i1O0OXO1O.OXO1.OXO1("WebSocketManager destroy");
        unInitWsManager();
    }

    @tb1
    public final byte[] encodeAudioStream(@aa1 byte[] pcmData, int i) {
        Intrinsics.X0O(pcmData, "pcmData");
        SmartOpus smartOpus = mOpus;
        if (smartOpus != null) {
            return smartOpus.encode(pcmData, OpusConstants.FrameSize.Companion.fromValue(i));
        }
        return null;
    }

    @aa1
    public final String getAI_SERVER_URL() {
        return Intrinsics.XOO0ii0(Api.INSTANCE.getBASE_URL(), iX1IIO10.OXO1) ? "wss://ai-dev.iot-solution.net/xiaozhi/v1/" : "wss://ai-c.iot-solution.net/xiaozhi/v1/";
    }

    public final int getMFrameBytes() {
        return mFrameBytes;
    }

    public final int getMFrameDuration() {
        return mFrameDuration;
    }

    public final int getMFrameSize() {
        return mFrameSize;
    }

    @tb1
    public final OnCallback getMOnCallback() {
        return mOnCallback;
    }

    @tb1
    public final PcmPlayer getMPcmPlayer() {
        return mPcmPlayer;
    }

    public final void init(@aa1 Application app, final boolean z) {
        Intrinsics.X0O(app, "app");
        if (isInit) {
            return;
        }
        isInit = true;
        mApp = app;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager init");
        try {
            mOpus = new SmartOpus();
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("WebSocketManager Opus -> init error！！！");
        }
        initPlayer();
        if (TextUtils.isEmpty(mToken)) {
            DeviceInfoChecker.OXO1.iIiiO(ExternalKeyManager.AI_KEY, new Function1() { // from class: com.android.mltcode.paycertificationapi.hw6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WebSocketManager.init$lambda$0(z, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        mToken = UtilsKt.XiOIii1(ExternalKeyManager.AI_KEY);
        if (z) {
            initWsManager();
        }
    }

    public final void initPlayer() {
        SmartOpus smartOpus = mOpus;
        if (smartOpus != null) {
            smartOpus.decoderInit(OpusConstants.SampleRate.Companion._16000(), OpusConstants.Channels.Companion.mono());
        }
        SmartOpus smartOpus2 = mOpus;
        if (smartOpus2 != null) {
            smartOpus2.encoderInit(OpusConstants.SampleRate.Companion._16000(), OpusConstants.Channels.Companion.mono(), OpusConstants.Application.Companion.voip());
        }
        PcmPlayer pcmPlayer = mPcmPlayer;
        if (pcmPlayer != null && pcmPlayer != null) {
            pcmPlayer.release();
        }
        PcmPlayer pcmPlayer2 = new PcmPlayer(new PcmPlayer.OnListener() { // from class: com.android.mltcode.paycertificationapi.fw6
            @Override // com.sma.smartv3.biz.voice.ai.PcmPlayer.OnListener
            public final void onPlayStateChanged(PcmPlayer.PlayState playState) {
                WebSocketManager.initPlayer$lambda$0(playState);
            }
        });
        mPcmPlayer = pcmPlayer2;
        pcmPlayer2.init(4, 16000, 2);
    }

    public final void initWsManager() {
        Application application = null;
        if (!isInit) {
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            init$default(this, app, false, 2, null);
            return;
        }
        if (isWsConnecting) {
            return;
        }
        isWsConnecting = true;
        String mBleAddress = BleCache.INSTANCE.getMBleAddress();
        if (mBleAddress.length() == 0) {
            mBleAddress = "b7:ca:6b:ef:77:e2";
        }
        String str = mBleAddress;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager initWsManager -> " + str);
        Map<String, String> mapIi0i = OXO1.Ii0i(OXO1.XXX11i(TuplesKt.OXO1("Authorization", "Bearer " + mToken), TuplesKt.OXO1("Protocol-Version", "1"), TuplesKt.OXO1("Device-Id", oe5.IXO0OOi(str, CertificateUtil.DELIMITER, "", false, 4, null)), TuplesKt.OXO1("Client-Id", "web_test_client")), NetWorkUtils.INSTANCE.getHeadersMap());
        n77 n77Var = mWsManager;
        if (n77Var != null && n77Var.OXO1()) {
            n77 n77Var2 = mWsManager;
            if (n77Var2 != null) {
                n77Var2.XOO0ii0();
            }
            mWsManager = null;
        }
        Application application2 = mApp;
        if (application2 == null) {
            Intrinsics.XXO("mApp");
        } else {
            application = application2;
        }
        n77.O00 o00 = new n77.O00(application);
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(HttpLoggingInterceptor.OXO1.OXO1);
        httpLoggingInterceptor.O00(HttpLoggingInterceptor.Level.BODY);
        Unit unit = Unit.OXO1;
        n77 n77VarI0IIOi = o00.OIi0(builderNewBuilder.addInterceptor(httpLoggingInterceptor).build()).XXI(true).X1ii(getAI_SERVER_URL()).I0iXXO(mapIi0i).m2705IO(false).OIX0iXi(false).I0IIOi();
        mWsManager = n77VarI0IIOi;
        if (n77VarI0IIOi != null) {
            n77VarI0IIOi.II1Xi0(mWsStatusListener);
        }
        n77 n77Var3 = mWsManager;
        if (n77Var3 != null) {
            n77Var3.mo2514iO();
        }
    }

    public final void sendAbortListenMessage() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", "abort");
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        n77 n77Var = mWsManager;
        Boolean boolValueOf = n77Var != null ? Boolean.valueOf(n77Var.I0IIOi(jSONObject.toString())) : null;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendAbortListenMessage " + jSONObject + ", " + boolValueOf);
    }

    public final void sendAbortMessage() {
        List<TimestampedAudioData> list = audioBuffer;
        synchronized (list) {
            list.clear();
            Unit unit = Unit.OXO1;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        jSONObject.put("type", "abort");
        jSONObject.put("reason", "wake_word_detected");
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendAbortMessage " + jSONObject);
        n77 n77Var = mWsManager;
        if (n77Var != null) {
            n77Var.I0IIOi(jSONObject.toString());
        }
        PcmPlayer pcmPlayer = mPcmPlayer;
        if (pcmPlayer != null) {
            pcmPlayer.stop();
        }
    }

    public final void sendAudioStream(@aa1 byte[] data) {
        Intrinsics.X0O(data, "data");
        n77 n77Var = mWsManager;
        if (n77Var != null) {
            n77Var.XO0O10(ByteString.Companion.m40028of(Arrays.copyOf(data, data.length)));
        }
    }

    public final void sendAudioStreamWithBuffer(@aa1 byte[] data) {
        Intrinsics.X0O(data, "data");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (isWsConnected) {
            sendAudioStream(data);
            resetIdleTimer();
            return;
        }
        List<TimestampedAudioData> list = audioBuffer;
        synchronized (list) {
            try {
                if (list.size() < 200) {
                    list.add(new TimestampedAudioData(data, jCurrentTimeMillis));
                } else {
                    list.remove(0);
                    list.add(new TimestampedAudioData(data, jCurrentTimeMillis));
                }
                OIXO1IIOO.iIX0i(list, new Function1() { // from class: com.android.mltcode.paycertificationapi.gw6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(WebSocketManager.sendAudioStreamWithBuffer$lambda$0$0(jCurrentTimeMillis, (TimestampedAudioData) obj));
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
        if (isWsConnecting) {
            return;
        }
        initWsManager();
    }

    public final void sendImageMessage(@aa1 String text, @aa1 String imgUrl) throws JSONException {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(imgUrl, "imgUrl");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", text);
        jSONObject.put("type", "listen");
        jSONObject.put("state", "detect");
        jSONObject.put("source", "text");
        jSONObject.put("imgUrl", imgUrl);
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendImageMessage " + jSONObject);
        n77 n77Var = mWsManager;
        if (n77Var != null) {
            n77Var.I0IIOi(jSONObject.toString());
        }
    }

    public final void sendListenMessage() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "listen");
        jSONObject.put("state", "start");
        jSONObject.put(C12616d4.a.f34183t, "auto");
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendListenMessage " + jSONObject);
        n77 n77Var = mWsManager;
        if (n77Var != null) {
            n77Var.I0IIOi(jSONObject.toString());
        }
    }

    public final void sendStartListenMessage(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "listen");
        jSONObject.put("state", "start");
        jSONObject.put(C12616d4.a.f34183t, z ? "auto" : "manual");
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        n77 n77Var = mWsManager;
        Boolean boolValueOf = n77Var != null ? Boolean.valueOf(n77Var.I0IIOi(jSONObject.toString())) : null;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendStartListenMessage " + jSONObject + ", " + boolValueOf);
    }

    public final void sendStopListenMessage() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "listen");
        jSONObject.put("state", "stop");
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        n77 n77Var = mWsManager;
        Boolean boolValueOf = n77Var != null ? Boolean.valueOf(n77Var.I0IIOi(jSONObject.toString())) : null;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendStopListenMessage " + jSONObject + ", " + boolValueOf);
    }

    public final void sendTextMessage(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", text);
        jSONObject.put("type", "listen");
        jSONObject.put("state", "detect");
        jSONObject.put("source", "text");
        if (!isWsConnected) {
            pendingMessage = jSONObject.toString();
            i1O0OXO1O.OXO1.OXO1("WebSocketManager sendTextMessage: Connection not ready, cached latest message");
            if (isWsConnecting) {
                return;
            }
            initWsManager();
            return;
        }
        n77 n77Var = mWsManager;
        Boolean boolValueOf = n77Var != null ? Boolean.valueOf(n77Var.I0IIOi(jSONObject.toString())) : null;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendTextMessage " + jSONObject + ", " + boolValueOf);
    }

    public final void setMOnCallback(@tb1 OnCallback onCallback) {
        mOnCallback = onCallback;
    }

    public final void setMPcmPlayer(@tb1 PcmPlayer pcmPlayer) {
        mPcmPlayer = pcmPlayer;
    }

    public final void stopSpeaking() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "speak");
        jSONObject.put("state", "stop");
        jSONObject.put(C12616d4.a.f34183t, "auto");
        i1O0OXO1O.OXO1.OXO1("WebSocketManager stopSpeaking " + jSONObject);
        n77 n77Var = mWsManager;
        if (n77Var != null) {
            n77Var.I0IIOi(jSONObject.toString());
        }
    }

    public final void toggleMute() throws JSONException {
        isMuted = !isMuted;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", isMuted ? "voice_mute" : "voice_unmute");
        i1O0OXO1O.OXO1.OXO1("WebSocketManager toggleMute " + jSONObject);
        n77 n77Var = mWsManager;
        if (n77Var != null) {
            n77Var.I0IIOi(jSONObject.toString());
        }
    }

    public final void unInitWsManager() {
        i1O0OXO1O.OXO1.OXO1("WebSocketManager unInitWsManager");
        n77 n77Var = mWsManager;
        if (n77Var != null) {
            n77Var.XOO0ii0();
        }
        mWsManager = null;
        isWsConnected = false;
        isWsConnecting = false;
        List<TimestampedAudioData> list = audioBuffer;
        synchronized (list) {
            list.clear();
            Unit unit = Unit.OXO1;
        }
        stopIdleTimer();
    }
}
