package com.sma.smartv3.biz.voice.ai;

import android.app.Application;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.fw6;
import com.android.mltcode.paycertificationapi.gw6;
import com.android.mltcode.paycertificationapi.hw6;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.n77;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.Utils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.C2985d4;
import com.sma.androidnetworklib.HttpLoggingInterceptor;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.util.UtilsKt;
import com.smart.opus.OpusConstants;
import com.smart.opus.SmartOpus;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import okio.ByteString;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWebSocketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketManager.kt\ncom/sma/smartv3/biz/voice/ai/WebSocketManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,654:1\n774#2:655\n865#2,2:656\n1869#2,2:658\n1#3:660\n*S KotlinDebug\n*F\n+ 1 WebSocketManager.kt\ncom/sma/smartv3/biz/voice/ai/WebSocketManager\n*L\n379#1:655\n379#1:656,2\n382#1:658,2\n*E\n"})
public final class WebSocketManager {
    private static final long AUDIO_BUFFER_TIMEOUT = 3000;
    private static final long IDLE_TIMEOUT = 0;

    @aa1
    public static final WebSocketManager INSTANCE = null;

    @aa1
    public static final String TAG = "WebSocketManager";

    @aa1
    private static final List<TimestampedAudioData> audioBuffer = null;

    @tb1
    private static Timer idleTimer;
    private static boolean isInit;
    private static boolean isMuted;
    private static boolean isWsConnected;
    private static boolean isWsConnecting;
    private static long lastAudioTime;
    private static Application mApp;
    private static final int mFrameBytes = 0;
    private static final int mFrameDuration = 0;
    private static final int mFrameSize = 0;

    @tb1
    private static OnCallback mOnCallback;

    @tb1
    private static SmartOpus mOpus;

    @tb1
    private static PcmPlayer mPcmPlayer;

    @aa1
    private static String mSessionId;

    @tb1
    private static String mToken;

    @tb1
    private static n77 mWsManager;

    @aa1
    private static WebSocketManager$mWsStatusListener$1 mWsStatusListener;

    @tb1
    private static String pendingMessage;

    public interface OnCallback {
        void onEmotion(@aa1 String r1);

        void onSttText(@aa1 String r1, boolean r2);

        void onTtsStart();

        void onTtsStop();

        void onTtsText(@aa1 String r1, boolean r2);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.sma.smartv3.biz.voice.ai.WebSocketManager$mWsStatusListener$1] */
    static {
        INSTANCE = new WebSocketManager();
        mSessionId = "";
        mFrameDuration = 20;
        int r0 = (20 * 16000) / 1000;
        mFrameSize = r0;
        mFrameBytes = r0 * 2;
        audioBuffer = new ArrayList();
        IDLE_TIMEOUT = 600000;
        mWsStatusListener = new WebSocketManager$mWsStatusListener$1();
    }

    private WebSocketManager() {
    }

    public static /* synthetic */ void OXO1(PcmPlayer.PlayState r0) {
        initPlayer$lambda$0(r0);
    }

    public static /* synthetic */ Unit XIi00iiXO(boolean r0, boolean r1) {
        return init$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$checkIdleTimeout(WebSocketManager r0) {
        r0.checkIdleTimeout();
    }

    public static final /* synthetic */ SmartOpus access$getMOpus$p() {
        return mOpus;
    }

    public static final /* synthetic */ n77 access$getMWsManager$p() {
        return mWsManager;
    }

    public static final /* synthetic */ boolean access$isWsConnecting$p() {
        return isWsConnecting;
    }

    public static final /* synthetic */ void access$resetIdleTimer(WebSocketManager r0) {
        r0.resetIdleTimer();
    }

    public static final /* synthetic */ void access$setMSessionId$p(String r0) {
        mSessionId = r0;
    }

    public static final /* synthetic */ void access$updateConnectionState(WebSocketManager r0, boolean r1) {
        r0.updateConnectionState(r1);
    }

    private final void checkIdleTimeout() {
        if ((System.currentTimeMillis() - lastAudioTime) <= IDLE_TIMEOUT) goto L6;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager Idle timeout, unInitWsManager");
        unInitWsManager();
        return;
    }

    public static /* synthetic */ boolean iO(long r0, TimestampedAudioData r2) {
        return sendAudioStreamWithBuffer$lambda$0$0(r0, r2);
    }

    public static /* synthetic */ void init$default(WebSocketManager r0, Application r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = true;
    L5:
        r0.init(r1, r2);
    }

    private static final Unit init$lambda$0(boolean r0, boolean r1) {
        if (r1 == false) goto L6;
        mToken = UtilsKt.XiOIii1(ExternalKeyManager.AI_KEY);
        if (r0 == false) goto L8;
        INSTANCE.initWsManager();
    L8:
        return Unit.OXO1;
    L6:
        i1O0OXO1O.OXO1.OXO1("WebSocketManager ak error");
        goto L8
    }

    private static final void initPlayer$lambda$0(PcmPlayer.PlayState r3) {
        i1O0OXO1O.OXO1.OXO1("WebSocketManager onPlayStateChanged " + r3);
        if (r3 != PcmPlayer.PlayState.playing) goto L9;
        OnCallback r4 = mOnCallback;
        if (r4 == null) goto L14;
        r4.onTtsStart();
        return;
    L14:
        return;
    L9:
        if (r3 != PcmPlayer.PlayState.stopped) goto L15;
        OnCallback r5 = mOnCallback;
        if (r5 == null) goto L16;
        r5.onTtsStop();
        return;
    L16:
        return;
    }

    private final void resetIdleTimer() {
        lastAudioTime = System.currentTimeMillis();
    }

    private static final boolean sendAudioStreamWithBuffer$lambda$0$0(long r2, TimestampedAudioData r4) {
        Intrinsics.X0O(r4, "it");
        if ((r2 - r4.getTimestamp()) <= 3000) goto L6;
        return true;
    L6:
        return false;
    }

    private final void sendBufferedAudio() {
        List<TimestampedAudioData> r0 = audioBuffer;
        monitor-enter(r0);
        long r1 = System.currentTimeMillis();     // Catch: Throwable -> L10
        ArrayList r4 = new ArrayList();     // Catch: Throwable -> L10
        Iterator<T> r3 = r0.iterator();     // Catch: Throwable -> L10
    L6:
        if (r3.hasNext() == false) goto L12;
        Object r5 = r3.next();     // Catch: Throwable -> L10
        if ((r1 - ((TimestampedAudioData) r5).getTimestamp()) > 3000) goto L6;
        r4.add(r5);     // Catch: Throwable -> L10
        goto L6
    L12:
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendBufferedAudio -> total:" + audioBuffer.size() + ", valid:" + r4.size());     // Catch: Throwable -> L10
        Iterator r2 = r4.iterator();     // Catch: Throwable -> L10
    L14:
        if (r2.hasNext() == false) goto L18;
        TimestampedAudioData r6 = (TimestampedAudioData) r2.next();     // Catch: Throwable -> L10
        if (isWsConnected == false) goto L14;
        INSTANCE.sendAudioStream(r6.getData());     // Catch: Throwable -> L10
        goto L14
    L18:
        audioBuffer.clear();     // Catch: Throwable -> L10
        Unit r7 = Unit.OXO1;     // Catch: Throwable -> L10
        monitor-exit(r0);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    private final void sendPendingMessage() {
        String r0 = pendingMessage;
        if (r0 == null) goto L10;
        n77 r1 = mWsManager;
        if (r1 == null) goto L7;
        Boolean r2 = Boolean.valueOf(r1.I0IIOi(r0));
    L8:
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendPendingMessage " + r0 + ", " + r2);
        pendingMessage = null;
        return;
    L7:
        r2 = null;
        goto L8
    }

    public static /* synthetic */ void sendStartListenMessage$default(WebSocketManager r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.sendStartListenMessage(r1);
    }

    private final void startIdleTimer() {
        stopIdleTimer();
        i1O0OXO1O.OXO1.OXO1("WebSocketManager startIdleTimer");
        Timer r2 = new Timer();
        idleTimer = r2;
        r2.schedule(new AnonymousClass1(), 1000, 1000);
    }

    private final void stopIdleTimer() {
        i1O0OXO1O.OXO1.OXO1("WebSocketManager stopIdleTimer");
        Timer r0 = idleTimer;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        idleTimer = null;
    }

    private final void updateConnectionState(boolean r2) {
        isWsConnected = r2;
        isWsConnecting = false;
        if (r2 == false) goto L6;
        startIdleTimer();
        sendBufferedAudio();
        sendPendingMessage();
        return;
    L6:
        stopIdleTimer();
    }

    public final void destroy() {
        i1O0OXO1O.OXO1.OXO1("WebSocketManager destroy");
        unInitWsManager();
    }

    @tb1
    public final byte[] encodeAudioStream(@aa1 byte[] r3, int r4) {
        Intrinsics.X0O(r3, "pcmData");
        SmartOpus r0 = mOpus;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.encode(r3, OpusConstants.FrameSize.Companion.fromValue(r4));
    }

    @aa1
    public final String getAI_SERVER_URL() {
        if (Intrinsics.XOO0ii0(Api.INSTANCE.getBASE_URL(), iX1IIO10.OXO1) == false) goto L6;
        return "wss://ai-dev.iot-solution.net/xiaozhi/v1/";
    L6:
        return "wss://ai-c.iot-solution.net/xiaozhi/v1/";
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

    public final void init(@aa1 Application r3, final boolean r4) {
        Intrinsics.X0O(r3, "app");
        if (isInit == true) goto L21;
        isInit = true;
        mApp = r3;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager init");
        mOpus = new SmartOpus();     // Catch: Exception -> L8
    L10:
        initPlayer();
        if (TextUtils.isEmpty(mToken) == false) goto L13;
        DeviceInfoChecker.OXO1.iIiiO(ExternalKeyManager.AI_KEY, new hw6(r4));
        return;
    L13:
        mToken = UtilsKt.XiOIii1(ExternalKeyManager.AI_KEY);
        if (r4 == false) goto L20;
        initWsManager();
        return;
    L20:
        return;
    L8:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("WebSocketManager Opus -> init error！！！");
        goto L10
    }

    public final void initPlayer() {
        SmartOpus r0 = mOpus;
        if (r0 == null) goto L5;
        r0.decoderInit(OpusConstants.SampleRate.Companion._16000(), OpusConstants.Channels.Companion.mono());
    L5:
        SmartOpus r1 = mOpus;
        if (r1 == null) goto L8;
        r1.encoderInit(OpusConstants.SampleRate.Companion._16000(), OpusConstants.Channels.Companion.mono(), OpusConstants.Application.Companion.voip());
    L8:
        PcmPlayer r2 = mPcmPlayer;
        if (r2 == null) goto L12;
        if (r2 == null) goto L12;
        r2.release();
    L12:
        PcmPlayer r3 = new PcmPlayer(new fw6());
        mPcmPlayer = r3;
        r3.init(4, 16000, 2);
    }

    public final void initWsManager() {
        Application r1 = null;
        if (isInit == true) goto L7;
        Application r0 = Utils.getApp();
        Intrinsics.O10IXXX0X(r0, "getApp(...)");
        init$default(this, r0, false, 2, null);
        return;
    L7:
        if (isWsConnecting == true) goto L32;
        isWsConnecting = true;
        String r3 = BleCache.INSTANCE.getMBleAddress();
        if (r3.length() != 0) goto L12;
        r3 = "b7:ca:6b:ef:77:e2";
    L12:
        String r4 = r3;
        i1O0OXO1O.OXO1.OXO1("WebSocketManager initWsManager -> " + r4);
        Map<String, String> r5 = OXO1.Ii0i(OXO1.XXX11i(new Pair[]{TuplesKt.OXO1("Authorization", "Bearer " + mToken), TuplesKt.OXO1("Protocol-Version", "1"), TuplesKt.OXO1("Device-Id", oe5.IXO0OOi(r4, CertificateUtil.DELIMITER, "", false, 4, null)), TuplesKt.OXO1("Client-Id", "web_test_client")}), NetWorkUtils.INSTANCE.getHeadersMap());
        n77 r6 = mWsManager;
        if (r6 != null) goto L15;
    L20:
        Application r7 = mApp;
        if (r7 != null) goto L23;
        Intrinsics.XXO("mApp");
    L24:
        n77.O00 r8 = new n77.O00(r1);
        OkHttpClient.Builder r2 = new OkHttpClient().newBuilder();
        HttpLoggingInterceptor r9 = new HttpLoggingInterceptor(HttpLoggingInterceptor.OXO1.OXO1);
        r9.O00(HttpLoggingInterceptor.Level.BODY);
        Unit r10 = Unit.OXO1;
        n77 r11 = r8.OIi0(r2.addInterceptor(r9).build()).XXI(true).X1ii(getAI_SERVER_URL()).I0iXXO(r5).IO(false).OIX0iXi(false).I0IIOi();
        mWsManager = r11;
        if (r11 == null) goto L27;
        r11.II1Xi0(mWsStatusListener);
    L27:
        n77 r12 = mWsManager;
        if (r12 == null) goto L31;
        r12.iO();
        return;
    L31:
        return;
    L23:
        r1 = r7;
        goto L24
    L15:
        if (r6.OXO1() != true) goto L20;
        n77 r13 = mWsManager;
        if (r13 == null) goto L19;
        r13.XOO0ii0();
    L19:
        mWsManager = null;
        goto L20
    }

    public final void sendAbortListenMessage() {
        JSONObject r0 = new JSONObject();
        r0.put("state", "abort");
        r0.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        n77 r1 = mWsManager;
        if (r1 == null) goto L5;
        Boolean r2 = Boolean.valueOf(r1.I0IIOi(r0.toString()));
    L6:
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendAbortListenMessage " + r0 + ", " + r2);
        return;
    L5:
        r2 = null;
        goto L6
    }

    public final void sendAbortMessage() {
        List<TimestampedAudioData> r0 = audioBuffer;
        monitor-enter(r0);
        r0.clear();     // Catch: Throwable -> L13
        Unit r1 = Unit.OXO1;     // Catch: Throwable -> L13
        monitor-exit(r0);
        JSONObject r2 = new JSONObject();
        r2.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        r2.put("type", "abort");
        r2.put("reason", "wake_word_detected");
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendAbortMessage " + r2);
        n77 r3 = mWsManager;
        if (r3 == null) goto L9;
        r3.I0IIOi(r2.toString());
    L9:
        PcmPlayer r4 = mPcmPlayer;
        if (r4 == null) goto L18;
        r4.stop();
        return;
    L18:
        return;
    L13:
        th = move-exception;
        throw th;
    }

    public final void sendAudioStream(@aa1 byte[] r4) {
        Intrinsics.X0O(r4, "data");
        n77 r0 = mWsManager;
        if (r0 == null) goto L6;
        r0.XO0O10(ByteString.Companion.of(Arrays.copyOf(r4, r4.length)));
        return;
    }

    public final void sendAudioStreamWithBuffer(@aa1 byte[] r6) {
        Intrinsics.X0O(r6, "data");
        final long r0 = System.currentTimeMillis();
        if (isWsConnected == false) goto L6;
        sendAudioStream(r6);
        resetIdleTimer();
        return;
    L6:
        List<TimestampedAudioData> r2 = audioBuffer;
        monitor-enter(r2);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (r2.size() >= 200) goto L13;
        r2.add(new TimestampedAudioData(r6, r0));     // Catch: Throwable -> L11
    L14:
        OIXO1IIOO.iIX0i(r2, new gw6(r0));     // Catch: Throwable -> L11
        monitor-exit(r2);
        if (isWsConnecting == true) goto L24;
        initWsManager();
        return;
    L24:
        return;
    L13:
        r2.remove(0);     // Catch: Throwable -> L11
        r2.add(new TimestampedAudioData(r6, r0));     // Catch: Throwable -> L11
        goto L14
    }

    public final void sendImageMessage(@aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r5, "text");
        Intrinsics.X0O(r6, "imgUrl");
        JSONObject r2 = new JSONObject();
        r2.put("text", r5);
        r2.put("type", "listen");
        r2.put("state", "detect");
        r2.put("source", "text");
        r2.put("imgUrl", r6);
        r2.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendImageMessage " + r2);
        n77 r7 = mWsManager;
        if (r7 == null) goto L6;
        r7.I0IIOi(r2.toString());
        return;
    }

    public final void sendListenMessage() {
        JSONObject r0 = new JSONObject();
        r0.put("type", "listen");
        r0.put("state", "start");
        r0.put(C2985d4.a.t, "auto");
        r0.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendListenMessage " + r0);
        n77 r1 = mWsManager;
        if (r1 == null) goto L6;
        r1.I0IIOi(r0.toString());
        return;
    }

    public final void sendStartListenMessage(boolean r5) {
        JSONObject r0 = new JSONObject();
        r0.put("type", "listen");
        r0.put("state", "start");
        if (r5 == false) goto L5;
        String r6 = "auto";
    L6:
        r0.put(C2985d4.a.t, r6);
        r0.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        n77 r7 = mWsManager;
        if (r7 == null) goto L9;
        Boolean r8 = Boolean.valueOf(r7.I0IIOi(r0.toString()));
    L10:
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendStartListenMessage " + r0 + ", " + r8);
        return;
    L9:
        r8 = null;
        goto L10
    L5:
        r6 = "manual";
        goto L6
    }

    public final void sendStopListenMessage() {
        JSONObject r0 = new JSONObject();
        r0.put("type", "listen");
        r0.put("state", "stop");
        r0.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mSessionId);
        n77 r1 = mWsManager;
        if (r1 == null) goto L5;
        Boolean r2 = Boolean.valueOf(r1.I0IIOi(r0.toString()));
    L6:
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendStopListenMessage " + r0 + ", " + r2);
        return;
    L5:
        r2 = null;
        goto L6
    }

    public final void sendTextMessage(@aa1 String r5) {
        Intrinsics.X0O(r5, "text");
        JSONObject r1 = new JSONObject();
        r1.put("text", r5);
        r1.put("type", "listen");
        r1.put("state", "detect");
        r1.put("source", "text");
        if (isWsConnected == false) goto L10;
        n77 r6 = mWsManager;
        if (r6 == null) goto L7;
        Boolean r7 = Boolean.valueOf(r6.I0IIOi(r1.toString()));
    L8:
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendTextMessage " + r1 + ", " + r7);
        return;
    L7:
        r7 = null;
        goto L8
    L10:
        pendingMessage = r1.toString();
        i1O0OXO1O.OXO1.OXO1("WebSocketManager sendTextMessage: Connection not ready, cached latest message");
        if (isWsConnecting == true) goto L14;
        initWsManager();
        return;
    }

    public final void setMOnCallback(@tb1 OnCallback r1) {
        mOnCallback = r1;
    }

    public final void setMPcmPlayer(@tb1 PcmPlayer r1) {
        mPcmPlayer = r1;
    }

    public final void stopSpeaking() {
        JSONObject r0 = new JSONObject();
        r0.put("type", "speak");
        r0.put("state", "stop");
        r0.put(C2985d4.a.t, "auto");
        i1O0OXO1O.OXO1.OXO1("WebSocketManager stopSpeaking " + r0);
        n77 r1 = mWsManager;
        if (r1 == null) goto L6;
        r1.I0IIOi(r0.toString());
        return;
    }

    public final void toggleMute() {
        isMuted = !isMuted;
        JSONObject r0 = new JSONObject();
        if (isMuted == false) goto L5;
        String r1 = "voice_mute";
    L6:
        r0.put("type", r1);
        i1O0OXO1O.OXO1.OXO1("WebSocketManager toggleMute " + r0);
        n77 r2 = mWsManager;
        if (r2 == null) goto L10;
        r2.I0IIOi(r0.toString());
        return;
    L10:
        return;
    L5:
        r1 = "voice_unmute";
        goto L6
    }

    public final void unInitWsManager() {
        i1O0OXO1O.OXO1.OXO1("WebSocketManager unInitWsManager");
        n77 r0 = mWsManager;
        if (r0 == null) goto L5;
        r0.XOO0ii0();
    L5:
        mWsManager = null;
        isWsConnected = false;
        isWsConnecting = false;
        List<TimestampedAudioData> r1 = audioBuffer;
        monitor-enter(r1);
        r1.clear();     // Catch: Throwable -> L11
        Unit r2 = Unit.OXO1;     // Catch: Throwable -> L11
        monitor-exit(r1);
        stopIdleTimer();
        return;
    L11:
        th = move-exception;
        throw th;
    }
}
