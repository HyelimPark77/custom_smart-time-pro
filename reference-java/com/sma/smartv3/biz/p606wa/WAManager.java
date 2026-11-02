package com.sma.smartv3.biz.p606wa;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.device.ads.DtbConstants;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo4;
import com.android.mltcode.paycertificationapi.i1I11I0i0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ki1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ud5;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.baidu.p559ai.speech.realtime.full.connection.Runner;
import com.baidu.p559ai.speech.realtime.full.download.Result;
import com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.C11921G5;
import com.ironsource.C12056Ne;
import com.sma.smartv3.biz.p606wa.WAManager;
import com.sma.smartv3.biz.p606wa.data.WAMessage;
import com.sma.smartv3.biz.p606wa.data.WAProfile;
import com.sma.smartv3.biz.p606wa.data.WAResponse;
import com.sma.smartv3.biz.p606wa.data.WAToken;
import com.sma.smartv3.biz.p606wa.data.WAUserInfo;
import com.sma.smartv3.biz.p607wx.WxManager;
import com.sma.smartv3.biz.voice.OpusManager;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleChatApp;
import com.szabh.smable3.entity.BleChatMessage;
import com.szabh.smable3.entity.BleVoice;
import java.io.File;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;
import org.eclipse.paho.android.service.MqttServiceConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWAManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WAManager.kt\ncom/sma/smartv3/biz/wa/WAManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1031:1\n15#2:1032\n*S KotlinDebug\n*F\n+ 1 WAManager.kt\ncom/sma/smartv3/biz/wa/WAManager\n*L\n773#1:1032\n*E\n"})
public final class WAManager {

    @aa1
    public static final File I0IIOi;
    public static volatile boolean I0iXXO = false;

    @aa1
    public static final Handler I1XOi1;

    @aa1
    public static final WAManager$mBleHandleCallback$1 IIX1OXO;

    /* JADX INFO: renamed from: IO */
    @tb1
    public static ki1 f50946IO = null;

    @aa1
    public static final File IiI10X;

    @aa1
    public static final File O00;

    @tb1
    public static PipedOutputStream O10IXXX0X = null;

    @tb1
    public static bo4 OIX0iXi = null;
    public static boolean OIi0 = false;

    @aa1
    public static final WAManager OXO1 = new WAManager();

    @tb1
    public static OpusManager X0O = null;

    @tb1
    public static PipedInputStream X1ii = null;

    @aa1
    public static final String XIi00iiXO = "WAManager";
    public static Application XO0O10 = null;

    @aa1
    public static final File XOO0ii0;

    @tb1
    public static XiOIO XX0 = null;

    @tb1
    public static Runner XXI = null;

    @aa1
    public static OXO1 XiOIO = null;

    @tb1
    public static XiOIO iIiiO = null;

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final String f50947iO = "THISISMYSECURETOKEN";

    public static final class OXO1 implements bo4.XIi00iiXO {
        public static final void XO0O10() {
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            WAManager wAManager = WAManager.OXO1;
            i1o0oxo1o.OXO1("WAManager subscribe -> " + wAManager.XXO());
            bo4 bo4Var = WAManager.OIX0iXi;
            if (bo4Var != null) {
                bo4Var.X1ii(MqttServiceConstants.SUBSCRIBE_ACTION, wAManager.XXO());
            }
        }

        @Override // com.android.mltcode.paycertificationapi.bo4.XIi00iiXO
        public void OXO1(Exception e) {
            Intrinsics.X0O(e, "e");
            i1O0OXO1O.OXO1.OXO1("WAManager onConnectError: " + e.getLocalizedMessage());
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:56:0x0139  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.android.mltcode.paycertificationapi.bo4.XIi00iiXO
        public void XIi00iiXO(String event, Object... args) {
            int i;
            WAUserInfo wAUserInfoIIXi1iiXI;
            Intrinsics.X0O(event, "event");
            Intrinsics.X0O(args, "args");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("WAManager onMessage -> " + event + " , time = " + System.currentTimeMillis() + ud5.I0iXXO);
            if (args.length == 0) {
                return;
            }
            Object obj = args[0];
            if (obj instanceof JSONObject) {
                try {
                    Intrinsics.X1ii(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObjectOptJSONObject = ((JSONObject) obj).optJSONObject(C12056Ne.f29563n);
                    Gson gson = new Gson();
                    Intrinsics.XXI(jSONObjectOptJSONObject);
                    WAMessage wAMessage = (WAMessage) gson.fromJson(jSONObjectOptJSONObject.toString(), WAMessage.class);
                    i1o0oxo1o.OXO1("WAManager onMessage message: " + wAMessage);
                    if (wAMessage.isGroupMsg()) {
                        return;
                    }
                    String pushname = wAMessage.getSender().getPushname();
                    String from = wAMessage.getFrom();
                    String pushname2 = "";
                    String to = wAMessage.getTo();
                    if (!wAMessage.getSender().isMe() && (wAUserInfoIIXi1iiXI = WAManager.OXO1.iIXi1iiXI()) != null) {
                        i1o0oxo1o.OXO1("WAManager onMessage profile: " + wAUserInfoIIXi1iiXI);
                        pushname2 = wAUserInfoIIXi1iiXI.getPushname();
                    }
                    String str = pushname2;
                    String type = wAMessage.getType();
                    switch (type.hashCode()) {
                        case -1890252483:
                            if (!type.equals("sticker")) {
                                i = R.string.chat_other;
                            } else {
                                i = R.string.chat_expression;
                            }
                            break;
                        case 111344:
                            if (!type.equals("ptt")) {
                                i = R.string.chat_other;
                            } else {
                                i = R.string.chat_voice;
                            }
                            break;
                        case 12013407:
                            if (!type.equals("poll_creation")) {
                                i = R.string.chat_other;
                            } else {
                                i = R.string.chat_poll_creation;
                            }
                            break;
                        case 100313435:
                            if (!type.equals("image")) {
                                i = R.string.chat_other;
                            } else {
                                i = R.string.chat_image;
                            }
                            break;
                        case 112021638:
                            if (!type.equals("vcard")) {
                                i = R.string.chat_other;
                            } else {
                                i = R.string.chat_vcard;
                            }
                            break;
                        case 112202875:
                            if (!type.equals("video")) {
                                i = R.string.chat_other;
                            } else if (!wAMessage.isGif()) {
                                i = R.string.chat_video;
                            } else {
                                i = R.string.chat_gif;
                            }
                            break;
                        case 862878436:
                            if (!type.equals("event_creation")) {
                                i = R.string.chat_other;
                            } else {
                                i = R.string.chat_event_creation;
                            }
                            break;
                        case 1901043637:
                            if (!type.equals("location")) {
                                i = R.string.chat_other;
                            } else {
                                i = R.string.chat_location;
                            }
                            break;
                        default:
                            i = R.string.chat_other;
                            break;
                    }
                    String strXXO = UtilsKt.XXO(i);
                    String type2 = wAMessage.getType();
                    switch (type2.hashCode()) {
                        case 3052376:
                            if (type2.equals("chat")) {
                                strXXO = wAMessage.getContent();
                            }
                            break;
                        case 12013407:
                            if (type2.equals("poll_creation")) {
                                strXXO = strXXO + wAMessage.getPollName();
                            }
                            break;
                        case 112021638:
                            if (type2.equals("vcard")) {
                                strXXO = strXXO + wAMessage.getVcardFormattedName();
                            }
                            break;
                        case 862878436:
                            if (type2.equals("event_creation")) {
                                strXXO = strXXO + wAMessage.getEventName();
                            }
                            break;
                        default:
                            break;
                    }
                    WAManager.OXO1.IXOIIIO(0, from, pushname, to, str, strXXO, ((long) WxManager.OXO1.XXiIiX10()) + (wAMessage.getT() * ((long) 1000)));
                } catch (Exception e) {
                    e.printStackTrace();
                    i1O0OXO1O.OXO1.OXO1("WAManager onMessage -> e:" + e.getLocalizedMessage());
                }
            }
        }

        @Override // com.android.mltcode.paycertificationapi.bo4.XIi00iiXO
        public void onConnected() {
            i1O0OXO1O.OXO1.OXO1("WAManager onConnected");
            WAManager.I1XOi1.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.zl6
                @Override // java.lang.Runnable
                public final void run() {
                    WAManager.OXO1.XO0O10();
                }
            }, 2000L);
        }

        @Override // com.android.mltcode.paycertificationapi.bo4.XIi00iiXO
        public void onDisconnected() {
            i1O0OXO1O.OXO1.OXO1("WAManager onDisconnected");
        }
    }

    public static final class XIi00iiXO extends TimerTask {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Timer f50948IO;

        public XIi00iiXO(Timer timer) {
            this.f50948IO = timer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (WAManager.XXI != null) {
                Runner runner = WAManager.XXI;
                Intrinsics.XXI(runner);
                if (runner.isClosed()) {
                    WAManager wAManager = WAManager.OXO1;
                    WAManager.I0iXXO = false;
                }
            }
            if (WAManager.I0iXXO) {
                return;
            }
            cancel();
            this.f50948IO.cancel();
            WAManager.OXO1.iiIOiX();
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.wa.WAManager$iO */
    public static final class C15520iO extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: com.sma.smartv3.biz.wa.WAManager$iO$OXO1 */
        public static final class OXO1 extends SimpleDownloader {
            @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
            public void onFailure(String reason) {
                Intrinsics.X0O(reason, "reason");
                i1O0OXO1O.OXO1.OXO1("WAManager onFailure -> " + reason);
                WAManager.OXO1.iOiXi11II(UtilsKt.XXO(R.string.speech_recognition_error));
            }

            @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
            public void onMessage(Result result) {
                Intrinsics.X0O(result, "result");
                i1O0OXO1O.OXO1.OXO1("WAManager onMessage -> " + result.getOrignalJsonStr());
                if (result.isError() || !result.isFin()) {
                    return;
                }
                String result2 = result.getResult();
                if (TextUtils.isEmpty(result2)) {
                    WAManager.OXO1.iOiXi11II(UtilsKt.XXO(R.string.speech_recognition_error));
                    return;
                }
                WAManager wAManager = WAManager.OXO1;
                Intrinsics.XXI(result2);
                wAManager.XXiIiX10(result2);
            }
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() throws IOException {
            WAManager wAManager = WAManager.OXO1;
            WAManager.I0iXXO = true;
            WAManager.X1ii = new PipedInputStream();
            WAManager.O10IXXX0X = new PipedOutputStream(WAManager.X1ii);
            WAManager.XXI = new Runner(WAManager.X1ii, 2);
            Runner runner = WAManager.XXI;
            if (runner != null) {
                runner.run(new OXO1());
            }
            wAManager.m38140OO();
            return null;
        }
    }

    static {
        sz0 sz0Var = sz0.OXO1;
        O00 = uz0.m3192iO(sz0Var, "wa_opus.ogg");
        IiI10X = uz0.m3192iO(sz0Var, "wa_opus.pcm");
        XOO0ii0 = uz0.m3192iO(sz0Var, "wa_opus.wav");
        I0IIOi = uz0.m3192iO(sz0Var, "wa_opus.json");
        I1XOi1 = new Handler(Looper.getMainLooper());
        IIX1OXO = new WAManager$mBleHandleCallback$1();
        XiOIO = new OXO1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IiiXiI0I(WAManager wAManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wAManager.IXI(function1);
    }

    /* JADX INFO: renamed from: OX */
    public static final Unit m38137OX(boolean z) {
        if (z) {
            bo4 bo4Var = OIX0iXi;
            if (bo4Var == null || !bo4Var.XOO0ii0()) {
                OXO1.X11I();
            }
            i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatus 已登");
            OXO1.Ii0X0X();
        } else {
            i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatus 未登录");
            OXO1.i11I();
        }
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OX110i(WAManager wAManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wAManager.XX1Oi(function1);
    }

    public static /* synthetic */ void X00XIX1(WAManager wAManager, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Utils.getApp().getString(R.string.request_error);
            Intrinsics.O10IXXX0X(str, "getString(...)");
        }
        wAManager.iOiXi11II(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X01IiOiIi(WAManager wAManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wAManager.iOOX010X(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0i1O(WAManager wAManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wAManager.X1IX(function1);
    }

    /* JADX INFO: renamed from: I1 */
    public final boolean m38139I1() throws InterruptedException {
        String strII1Xi0 = II1Xi0();
        i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatusBlock -> " + strII1Xi0);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        i1I11I0i0.XIi00iiXO(null, new WAManager$checkLoginStatusBlock$1(strII1Xi0, booleanRef, null), 1, null);
        return booleanRef.element;
    }

    @aa1
    public final String II1Xi0() {
        String string = a01.OXO1.IiI10X().getString("WA_AUTH_TOKEN_" + BleCache.INSTANCE.getMBleAddress());
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }

    public final void IO0II0i(@aa1 String toUser, @aa1 File file) {
        Intrinsics.X0O(toUser, "toUser");
        Intrinsics.X0O(file, "file");
        String strII1Xi0 = II1Xi0();
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("WAManager sendVoice -> " + OIi0 + ", " + strII1Xi0 + ", " + toUser + ", " + file);
        if (OIi0 || !FileUtils.isFileExists(file)) {
            i1o0oxo1o.OXO1("WAManager sendVoice -> sending, please wait");
            return;
        }
        OIi0 = true;
        String str = "{\"phone\": \"" + toUser + "\",\"isGroup\": false,\"base64Ptt\": \"" + Base64.encodeToString(FileIOUtils.readFile2BytesByChannel(file), 2) + "\"}";
        FileIOUtils.writeFileFromString(I0IIOi, str);
        ANRequest.PostRequestBuilder postRequestBuilderAddHeaders = AndroidNetworking.post(O001I()).setContentType(C11921G5.f28906L).addHeaders("Authorization", "Bearer " + strII1Xi0).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap());
        byte[] bytes = str.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        postRequestBuilderAddHeaders.addByteBody(bytes).setTag((Object) O001I()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAResponse.class), new ParsedRequestListener<WAResponse>() { // from class: com.sma.smartv3.biz.wa.WAManager$sendVoice$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WAResponse response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WAManager sendTextMessage onResponse -> " + response);
                WAManager wAManager = WAManager.OXO1;
                WAManager.OIi0 = false;
                if (Intrinsics.XOO0ii0(response.getStatus(), "success")) {
                    return;
                }
                wAManager.OII();
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WAManager sendTextMessage onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                WAManager wAManager = WAManager.OXO1;
                WAManager.OIi0 = false;
            }
        });
    }

    public final void IXI(@tb1 Function1<? super String, Unit> function1) {
        XOO0XOOii();
        iIiiO = XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WAManager$startPollingGetLoginQrCode$1(function1, null), 3, null);
    }

    public final void IXOIIIO(int i, @aa1 String fromUserId, @aa1 String fromUserName, @aa1 String toUserId, @aa1 String toUserName, @aa1 String content, long j) {
        Intrinsics.X0O(fromUserId, "fromUserId");
        Intrinsics.X0O(fromUserName, "fromUserName");
        Intrinsics.X0O(toUserId, "toUserId");
        Intrinsics.X0O(toUserName, "toUserName");
        Intrinsics.X0O(content, "content");
        i1O0OXO1O.OXO1.OXO1("WAManager sendTextMessageToDevice -> " + i + ", f:" + fromUserId + ", f:" + fromUserName + ", t:" + toUserId + ", t:" + toUserName + ", " + content);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_MESSAGE, BleKeyFlag.UPDATE, new BleChatMessage(6, 0, i, fromUserId, fromUserName, toUserId, toUserName, j, content), false, false, 24, null);
    }

    public final String IXXOO() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/start-session";
    }

    public final void Ii0X0X() {
        String pushname;
        String phoneNumber;
        WAUserInfo wAUserInfoIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WAManager sendLoginSuccessToDevice");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(6, 5, (wAUserInfoIIXi1iiXI == null || (phoneNumber = wAUserInfoIIXi1iiXI.getPhoneNumber()) == null) ? "" : phoneNumber, (wAUserInfoIIXi1iiXI == null || (pushname = wAUserInfoIIXi1iiXI.getPushname()) == null) ? "" : pushname, null, 16, null), false, false, 24, null);
    }

    public final void Ii0i() {
        XOXiX0();
        XX0 = XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WAManager$startPollingCheckLoginStatus$1(null), 3, null);
    }

    public final void Ii1iii0(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        i1O0OXO1O.OXO1.OXO1("WAManager -> init");
        XO0O10 = app;
        BleConnector.INSTANCE.addHandleCallback(IIX1OXO);
        if (X0O == null) {
            try {
                X0O = new OpusManager();
            } catch (Exception e) {
                e.printStackTrace();
                i1O0OXO1O.OXO1.OXO1("WAManager -> opus init error！！！");
            }
        }
    }

    public final String O001I() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/send-voice-base64";
    }

    public final String O1O() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/logout-session";
    }

    public final void OII() {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        bo4 bo4Var = OIX0iXi;
        i1o0oxo1o.OXO1("WAManager checkLoginStatus " + (bo4Var != null ? Boolean.valueOf(bo4Var.XOO0ii0()) : null));
        X1IX(new Function1() { // from class: com.android.mltcode.paycertificationapi.wl6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WAManager.m38137OX(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: OO */
    public final void m38140OO() {
        Timer timer = new Timer();
        timer.schedule(new XIi00iiXO(timer), 500L, 500L);
    }

    public final void X00Xi1X(byte[] bArr) {
        try {
            PipedOutputStream pipedOutputStream = O10IXXX0X;
            if (pipedOutputStream != null) {
                pipedOutputStream.write(bArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m38141X1(@aa1 String toUserName, @aa1 String content) {
        Intrinsics.X0O(toUserName, "toUserName");
        Intrinsics.X0O(content, "content");
        String strII1Xi0 = II1Xi0();
        String str = "{\"phone\": \"" + toUserName + "\",\"isGroup\": false,\"isNewsletter\": false,\"isLid\": false,\"message\": \"" + content + "\"}";
        i1O0OXO1O.OXO1.OXO1("WAManager sendTextMessage -> " + strII1Xi0 + ", " + toUserName + ", " + content + ", " + str);
        if (TextUtils.isEmpty(toUserName)) {
            return;
        }
        ANRequest.PostRequestBuilder postRequestBuilderAddHeaders = AndroidNetworking.post(iXiX011()).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setContentType(C11921G5.f28906L).addHeaders("Authorization", "Bearer " + strII1Xi0);
        byte[] bytes = str.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        postRequestBuilderAddHeaders.addByteBody(bytes).setTag((Object) iXiX011()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAResponse.class), new ParsedRequestListener<WAResponse>() { // from class: com.sma.smartv3.biz.wa.WAManager$sendTextMessage$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WAResponse response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WAManager sendTextMessage onResponse -> " + response);
                if (Intrinsics.XOO0ii0(response.getStatus(), "success")) {
                    return;
                }
                WAManager.OXO1.OII();
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WAManager sendTextMessage onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
            }
        });
    }

    public final boolean X100O() {
        bo4 bo4Var = OIX0iXi;
        if (bo4Var != null) {
            return bo4Var.XOO0ii0();
        }
        return false;
    }

    public final void X11I() {
        i1O0OXO1O.OXO1.OXO1("WAManager initWsManager");
        bo4 bo4Var = OIX0iXi;
        Application application = null;
        if (bo4Var != null) {
            if (bo4Var != null) {
                bo4Var.IiI10X();
            }
            OIX0iXi = null;
        }
        Application application2 = XO0O10;
        if (application2 == null) {
            Intrinsics.XXO("mApp");
        } else {
            application = application2;
        }
        bo4.OXO1 oxo1I0IIOi = new bo4.OXO1(application).I0IIOi(iXiiiO());
        io.socket.client.OXO1.C22070OXO1 c22070oxo1 = new io.socket.client.OXO1.C22070OXO1();
        c22070oxo1.XIi00iiXO = "/whatsapp/socket.io";
        c22070oxo1.XX0 = 10000L;
        c22070oxo1.OiIIX101O = 20000L;
        c22070oxo1.XiOIO = true;
        bo4 bo4VarO00 = oxo1I0IIOi.XOO0ii0(c22070oxo1).IiI10X(XiOIO).O00();
        OIX0iXi = bo4VarO00;
        if (bo4VarO00 != null) {
            bo4VarO00.O00();
        }
    }

    @aa1
    public final File X11iII1O1() {
        return I0IIOi;
    }

    public final void X1IX(@tb1 final Function1<? super Boolean, Unit> function1) {
        String strII1Xi0 = II1Xi0();
        i1O0OXO1O.OXO1.OXO1("WAManager getProfile -> " + strII1Xi0);
        AndroidNetworking.get(iOO1ii1()).addHeaders("Authorization", "Bearer " + strII1Xi0).setTag((Object) iOO1ii1()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAProfile.class), new ParsedRequestListener<WAProfile>() { // from class: com.sma.smartv3.biz.wa.WAManager$getProfile$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WAProfile response) {
                Intrinsics.X0O(response, "response");
                LogUtils.m11128d("WAManager getProfile onResponse -> " + response);
                WAUserInfo response2 = response.getResponse();
                if (response2 != null) {
                    a01.OXO1.m1440iO().put(WAUserInfo.class.getName(), new Gson().toJson(response2));
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                a01.OXO1.m1440iO().remove(WAProfile.class.getName());
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WAManager getProfile onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                a01.OXO1.m1440iO().remove(WAProfile.class.getName());
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        });
    }

    public final void XO0X10iO(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        i1O0OXO1O.OXO1.OXO1("WAManager sendLoginQrcodeToDevice -> " + text);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(6, 1, null, null, text, 12, null), false, false, 24, null);
    }

    public final void XOIX() {
        if (I0iXXO) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1("WAManager -> startRealTime");
        ThreadUtils.executeByIo(new C15520iO());
    }

    public final void XOO0XOOii() {
        XiOIO xiOIO = iIiiO;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        iIiiO = null;
    }

    public final void XOX0O0(@aa1 String token) {
        Intrinsics.X0O(token, "token");
        a01.OXO1.IiI10X().put("WA_AUTH_TOKEN_" + BleCache.INSTANCE.getMBleAddress(), token);
    }

    public final void XOXiX0() {
        XiOIO xiOIO = XX0;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        XX0 = null;
    }

    public final void XX1Oi(@tb1 final Function1<? super Boolean, Unit> function1) {
        String strII1Xi0 = II1Xi0();
        i1O0OXO1O.OXO1.OXO1("WAManager logout -> " + strII1Xi0);
        AndroidNetworking.post(O1O()).addHeaders("Authorization", "Bearer " + strII1Xi0).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setTag((Object) O1O()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAResponse.class), new ParsedRequestListener<WAResponse>() { // from class: com.sma.smartv3.biz.wa.WAManager$logout$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WAResponse response) {
                Intrinsics.X0O(response, "response");
                LogUtils.m11128d("WAManager logout onResponse -> " + response);
                a01.OXO1.m1440iO().remove(WAProfile.class.getName());
                if (TextUtils.isEmpty(response.getError())) {
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WAManager logout onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                a01.OXO1.m1440iO().remove(WAProfile.class.getName());
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        });
        bo4 bo4Var = OIX0iXi;
        if (bo4Var != null) {
            bo4Var.IiI10X();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String XXIIO1i11() throws InterruptedException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        i1I11I0i0.XIi00iiXO(null, new WAManager$getLoginQrCodeBlock$1(objectRef, null), 1, null);
        return (String) objectRef.element;
    }

    public final String XXO() {
        return a01.OXO1.IiI10X().getString("WA_SESSION_" + BleCache.INSTANCE.getMBleAddress());
    }

    @aa1
    public final File XXX11i() {
        return XOO0ii0;
    }

    public final void XXiIiX10(String str) {
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, new BleVoice(0, 0, 0, null, System.currentTimeMillis(), str, 14, null), false, false, 24, null);
    }

    public final String i010I() {
        return "ai.iot-solution.net";
    }

    public final void i0X000X0O() {
        i1O0OXO1O.OXO1.OXO1("WAManager sendLoggingToDevice");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(6, 4, null, null, null, 28, null), false, false, 24, null);
    }

    public final void i11I() {
        i1O0OXO1O.OXO1.OXO1("WAManager sendLoginFailedToDevice");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(6, 6, null, null, null, 28, null), false, false, 24, null);
    }

    @aa1
    /* JADX INFO: renamed from: iI */
    public final File m38142iI() {
        return O00;
    }

    @tb1
    public final WAUserInfo iIXi1iiXI() {
        return (WAUserInfo) new Gson().fromJson(a01.OXO1.m1440iO().getString(WAUserInfo.class.getName()), WAUserInfo.class);
    }

    public final String iOO1ii1() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/host-device";
    }

    public final void iOOX010X(@tb1 final Function1<? super Boolean, Unit> function1) {
        i1O0OXO1O.OXO1.OXO1("WAManager getAuthToken");
        AndroidNetworking.post(m38143iX()).setTag((Object) m38143iX()).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAToken.class), new ParsedRequestListener<WAToken>() { // from class: com.sma.smartv3.biz.wa.WAManager$getAuthToken$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WAToken response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WAManager onResponse -> " + response);
                if (TextUtils.isEmpty(response.getToken())) {
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                WAManager.OXO1.XOX0O0(response.getToken());
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WAManager onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        });
    }

    public final void iOiXi11II(String str) {
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, new BleVoice(0, 1, 0, null, System.currentTimeMillis(), str, 12, null), false, false, 24, null);
    }

    /* JADX INFO: renamed from: iX */
    public final String m38143iX() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/THISISMYSECURETOKEN/generate-token";
    }

    @aa1
    public final File iX1O1() {
        return IiI10X;
    }

    public final String iXiX011() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/send-message";
    }

    public final String iXiiiO() {
        return "wss://" + i010I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void iiIOiX() {
        try {
            PipedInputStream pipedInputStream = X1ii;
            if (pipedInputStream != null) {
                pipedInputStream.close();
            }
            PipedOutputStream pipedOutputStream = O10IXXX0X;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            X1ii = null;
            O10IXXX0X = null;
            XXI = null;
            I0iXXO = false;
        }
    }

    public final void iiiO() {
        i1O0OXO1O.OXO1.OXO1("WAManager initWA");
        if (q62.OXO1.O00X()) {
            XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WAManager$initWA$1(null), 3, null);
        }
    }
}
