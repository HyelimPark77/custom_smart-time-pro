package com.sma.smartv3.biz.wa;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbConstants;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ki1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ud5;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.wl6;
import com.android.mltcode.paycertificationapi.zl6;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.baidu.ai.speech.realtime.full.connection.Runner;
import com.baidu.ai.speech.realtime.full.download.Result;
import com.baidu.ai.speech.realtime.full.download.SimpleDownloader;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.G5;
import com.ironsource.Ne;
import com.sma.smartv3.biz.voice.OpusManager;
import com.sma.smartv3.biz.wa.data.WAMessage;
import com.sma.smartv3.biz.wa.data.WAProfile;
import com.sma.smartv3.biz.wa.data.WAResponse;
import com.sma.smartv3.biz.wa.data.WAToken;
import com.sma.smartv3.biz.wa.data.WAUserInfo;
import com.sma.smartv3.biz.wx.WxManager;
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
    public static final File I0IIOi = null;
    public static volatile boolean I0iXXO = false;

    @aa1
    public static final Handler I1XOi1 = null;

    @aa1
    public static final WAManager$mBleHandleCallback$1 IIX1OXO = null;

    @tb1
    public static ki1 IO = null;

    @aa1
    public static final File IiI10X = null;

    @aa1
    public static final File O00 = null;

    @tb1
    public static PipedOutputStream O10IXXX0X = null;

    @tb1
    public static bo4 OIX0iXi = null;
    public static boolean OIi0 = false;

    @aa1
    public static final WAManager OXO1 = null;

    @tb1
    public static OpusManager X0O = null;

    @tb1
    public static PipedInputStream X1ii = null;

    @aa1
    public static final String XIi00iiXO = "WAManager";
    public static Application XO0O10 = null;

    @aa1
    public static final File XOO0ii0 = null;

    @tb1
    public static XiOIO XX0 = null;

    @tb1
    public static Runner XXI = null;

    @aa1
    public static OXO1 XiOIO = null;

    @tb1
    public static XiOIO iIiiO = null;

    @aa1
    public static final String iO = "THISISMYSECURETOKEN";

    public static final class OXO1 implements bo4.XIi00iiXO {
        public OXO1() {
        }

        public static final void XO0O10() {
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            WAManager r1 = WAManager.OXO1;
            r0.OXO1("WAManager subscribe -> " + WAManager.I0iXXO(r1));
            bo4 r2 = WAManager.OIX0iXi();
            if (r2 == null) goto L6;
            r2.X1ii(MqttServiceConstants.SUBSCRIBE_ACTION, WAManager.I0iXXO(r1));
            return;
        }

        public static /* synthetic */ void iO() {
            XO0O10();
        }

        @Override // com.android.mltcode.paycertificationapi.bo4.XIi00iiXO
        public void OXO1(Exception r4) {
            Intrinsics.X0O(r4, "e");
            i1O0OXO1O.OXO1.OXO1("WAManager onConnectError: " + r4.getLocalizedMessage());
        }

        @Override // com.android.mltcode.paycertificationapi.bo4.XIi00iiXO
        public void XIi00iiXO(String r11, Object... r12) {
            Intrinsics.X0O(r11, NotificationCompat.CATEGORY_EVENT);
            Intrinsics.X0O(r12, "args");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            r0.OXO1("WAManager onMessage -> " + r11 + " , time = " + System.currentTimeMillis() + ud5.I0iXXO);
            if (r12.length != 0) goto L5;
            return;
        L5:
            Object r13 = r12[0];
            if ((r13 instanceof JSONObject) == false) goto L85;
            Intrinsics.X1ii(r13, "null cannot be cast to non-null type org.json.JSONObject");     // Catch: Exception -> L17
            JSONObject r14 = ((JSONObject) r13).optJSONObject(Ne.n);     // Catch: Exception -> L17
            Gson r15 = new Gson();     // Catch: Exception -> L17
            Intrinsics.XXI(r14);     // Catch: Exception -> L17
            WAMessage r16 = (WAMessage) r15.fromJson(r14.toString(), WAMessage.class);     // Catch: Exception -> L17
            r0.OXO1("WAManager onMessage message: " + r16);     // Catch: Exception -> L17
            if (r16.isGroupMsg() == true) goto L84;
            String r4 = r16.getSender().getPushname();     // Catch: Exception -> L17
            String r3 = r16.getFrom();     // Catch: Exception -> L17
            String r17 = "";
            String r5 = r16.getTo();     // Catch: Exception -> L17
            if (r16.getSender().isMe() == true) goto L16;
            WAUserInfo r1 = WAManager.OXO1.iIXi1iiXI();     // Catch: Exception -> L17
            if (r1 == null) goto L16;
            r0.OXO1("WAManager onMessage profile: " + r1);     // Catch: Exception -> L17
            r17 = r1.getPushname();     // Catch: Exception -> L17
        L16:
            String r6 = r17;
            String r18 = r16.getType();     // Catch: Exception -> L17
            switch(r18.hashCode()) {
                case -1890252483: goto L55;
                case 111344: goto L51;
                case 12013407: goto L47;
                case 100313435: goto L43;
                case 112021638: goto L39;
                case 112202875: goto L32;
                case 862878436: goto L28;
                case 1901043637: goto L24;
                default: goto L56;
            };
        L56:
            int r19 = R.string.chat_other;
        L58:
            String r110 = UtilsKt.XXO(r19);     // Catch: Exception -> L17
            String r2 = r16.getType();     // Catch: Exception -> L17
            switch(r2.hashCode()) {
                case 3052376: goto L75;
                case 12013407: goto L71;
                case 112021638: goto L67;
                case 862878436: goto L62;
                default: goto L65;
            };     // Catch: Exception -> L17
        L65:
            String r7 = r110;
            WAManager.OXO1.IXOIIIO(0, r3, r4, r5, r6, r7, ((long) WxManager.OXO1.XXiIiX10()) + (r16.getT() * ((long) 1000)));     // Catch: Exception -> L17
            return;
        L62:
            if (r2.equals("event_creation") == false) goto L65;
            r110 = r110 + r16.getEventName();     // Catch: Exception -> L17
            goto L65
        L67:
            if (r2.equals("vcard") == false) goto L65;
            r110 = r110 + r16.getVcardFormattedName();     // Catch: Exception -> L17
            goto L65
        L71:
            if (r2.equals("poll_creation") == false) goto L65;
            r110 = r110 + r16.getPollName();     // Catch: Exception -> L17
            goto L65
        L75:
            if (r2.equals("chat") == false) goto L65;
            r110 = r16.getContent();     // Catch: Exception -> L17
            goto L65
        L24:
            if (r18.equals("location") == false) goto L56;
            r19 = R.string.chat_location;
            goto L58
        L28:
            if (r18.equals("event_creation") == false) goto L56;
            r19 = R.string.chat_event_creation;
            goto L58
        L32:
            if (r18.equals("video") == false) goto L56;
            if (r16.isGif() == false) goto L37;
            r19 = R.string.chat_gif;
            goto L58
        L37:
            r19 = R.string.chat_video;
            goto L58
        L39:
            if (r18.equals("vcard") == false) goto L56;
            r19 = R.string.chat_vcard;
            goto L58
        L43:
            if (r18.equals("image") == false) goto L56;
            r19 = R.string.chat_image;
            goto L58
        L47:
            if (r18.equals("poll_creation") == false) goto L56;
            r19 = R.string.chat_poll_creation;
            goto L58
        L51:
            if (r18.equals("ptt") == false) goto L56;
            r19 = R.string.chat_voice;
            goto L58
        L55:
            if (r18.equals("sticker") == false) goto L56;
            r19 = R.string.chat_expression;
            goto L58
        L84:
            return;
        L17:
            e = move-exception;
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("WAManager onMessage -> e:" + e.getLocalizedMessage());
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.bo4.XIi00iiXO
        public void onConnected() {
            i1O0OXO1O.OXO1.OXO1("WAManager onConnected");
            WAManager.XOO0ii0().postDelayed(new zl6(), 2000);
        }

        @Override // com.android.mltcode.paycertificationapi.bo4.XIi00iiXO
        public void onDisconnected() {
            i1O0OXO1O.OXO1.OXO1("WAManager onDisconnected");
        }
    }

    public static final class XIi00iiXO extends TimerTask {
        public final /* synthetic */ Timer IO;

        public XIi00iiXO(Timer r1) {
            this.IO = r1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (WAManager.IiI10X() == null) goto L8;
            Runner r0 = WAManager.IiI10X();
            Intrinsics.XXI(r0);
            if (r0.isClosed() == false) goto L8;
            WAManager r1 = WAManager.OXO1;
            WAManager.XX0(false);
        L8:
            if (WAManager.XXI() == true) goto L11;
            cancel();
            this.IO.cancel();
            WAManager.XiOIii1(WAManager.OXO1);
            return;
        }
    }

    public static final class iO extends ThreadUtils.SimpleTask<Void> {

        public static final class OXO1 extends SimpleDownloader {
            public OXO1() {
            }

            @Override // com.baidu.ai.speech.realtime.full.download.SimpleDownloader
            public void onFailure(String r4) {
                Intrinsics.X0O(r4, "reason");
                i1O0OXO1O.OXO1.OXO1("WAManager onFailure -> " + r4);
                WAManager.O10IXXX0X(WAManager.OXO1, UtilsKt.XXO(R.string.speech_recognition_error));
            }

            @Override // com.baidu.ai.speech.realtime.full.download.SimpleDownloader
            public void onMessage(Result r5) {
                Intrinsics.X0O(r5, "result");
                i1O0OXO1O.OXO1.OXO1("WAManager onMessage -> " + r5.getOrignalJsonStr());
                if (r5.isError() == false) goto L5;
                return;
            L5:
                if (r5.isFin() == false) goto L13;
                String r6 = r5.getResult();
                if (TextUtils.isEmpty(r6) == true) goto L10;
                WAManager r0 = WAManager.OXO1;
                Intrinsics.XXI(r6);
                WAManager.X0O(r0, r6);
                return;
            L10:
                WAManager.O10IXXX0X(WAManager.OXO1, UtilsKt.XXO(R.string.speech_recognition_error));
                return;
            }
        }

        public iO() {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WAManager r0 = WAManager.OXO1;
            WAManager.XX0(true);
            WAManager.IIX1OXO(new PipedInputStream());
            WAManager.iIiiO(new PipedOutputStream(WAManager.I0IIOi()));
            WAManager.I1XOi1(new Runner(WAManager.I0IIOi(), 2));
            Runner r1 = WAManager.IiI10X();
            if (r1 == null) goto L5;
            r1.run(new OXO1());
        L5:
            WAManager.X1ii(r0);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    static {
        OXO1 = new WAManager();
        sz0 r0 = sz0.OXO1;
        O00 = uz0.iO(r0, "wa_opus.ogg");
        IiI10X = uz0.iO(r0, "wa_opus.pcm");
        XOO0ii0 = uz0.iO(r0, "wa_opus.wav");
        I0IIOi = uz0.iO(r0, "wa_opus.json");
        I1XOi1 = new Handler(Looper.getMainLooper());
        IIX1OXO = new WAManager$mBleHandleCallback$1();
        XiOIO = new OXO1();
    }

    public WAManager() {
    }

    public static final /* synthetic */ PipedInputStream I0IIOi() {
        return X1ii;
    }

    public static final /* synthetic */ String I0iXXO(WAManager r0) {
        return r0.XXO();
    }

    public static final /* synthetic */ void I1XOi1(Runner r0) {
        XXI = r0;
    }

    public static final /* synthetic */ void IIX1OXO(PipedInputStream r0) {
        X1ii = r0;
    }

    public static final /* synthetic */ OpusManager IO() {
        return X0O;
    }

    public static final /* synthetic */ Runner IiI10X() {
        return XXI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IiiXiI0I(WAManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.IXI(r1);
    }

    public static final /* synthetic */ String O00(WAManager r0) {
        return r0.XXIIO1i11();
    }

    public static final /* synthetic */ void O10IXXX0X(WAManager r0, String r1) {
        r0.iOiXi11II(r1);
    }

    public static final /* synthetic */ bo4 OIX0iXi() {
        return OIX0iXi;
    }

    public static final /* synthetic */ ki1 OIi0() {
        return IO;
    }

    public static final Unit OX(boolean r1) {
        if (r1 == false) goto L10;
        bo4 r2 = OIX0iXi;
        if (r2 != null) goto L6;
    L8:
        OXO1.X11I();
    L9:
        i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatus 已登");
        OXO1.Ii0X0X();
    L12:
        return Unit.OXO1;
    L6:
        if (r2.XOO0ii0() != true) goto L8;
    L10:
        i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatus 未登录");
        OXO1.i11I();
        goto L12
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OX110i(WAManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.XX1Oi(r1);
    }

    public static /* synthetic */ Unit OXO1(boolean r0) {
        return OX(r0);
    }

    public static final /* synthetic */ void OiIIX101O(boolean r0) {
        OIi0 = r0;
    }

    public static /* synthetic */ void X00XIX1(WAManager r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = Utils.getApp().getString(R.string.request_error);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
    L5:
        r0.iOiXi11II(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X01IiOiIi(WAManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.iOOX010X(r1);
    }

    public static final /* synthetic */ void X0O(WAManager r0, String r1) {
        r0.XXiIiX10(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0i1O(WAManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.X1IX(r1);
    }

    public static final /* synthetic */ void X1ii(WAManager r0) {
        r0.OO();
    }

    public static final /* synthetic */ boolean XIi00iiXO(WAManager r0) {
        return r0.I1();
    }

    public static final /* synthetic */ String XO0O10(WAManager r0) {
        return r0.iOO1ii1();
    }

    public static final /* synthetic */ Handler XOO0ii0() {
        return I1XOi1;
    }

    public static final /* synthetic */ void XX0(boolean r0) {
        I0iXXO = r0;
    }

    public static final /* synthetic */ boolean XXI() {
        return I0iXXO;
    }

    public static final /* synthetic */ void XiOIO(ki1 r0) {
        IO = r0;
    }

    public static final /* synthetic */ void XiOIii1(WAManager r0) {
        r0.iiIOiX();
    }

    public static final /* synthetic */ void iIiiO(PipedOutputStream r0) {
        O10IXXX0X = r0;
    }

    public static final /* synthetic */ String iO(WAManager r0) {
        return r0.IXXOO();
    }

    public final boolean I1() {
        String r0 = II1Xi0();
        i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatusBlock -> " + r0);
        Ref.BooleanRef r1 = new Ref.BooleanRef();
        I100X1.XOO0ii0(null, new WAManager$checkLoginStatusBlock$1(r0, r1, null), 1, null);
        return r1.element;
    }

    @aa1
    public final String II1Xi0() {
        String r0 = a01.OXO1.IiI10X().getString("WA_AUTH_TOKEN_" + BleCache.INSTANCE.getMBleAddress());
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }

    public final void IO0II0i(@aa1 String r6, @aa1 File r7) {
        Intrinsics.X0O(r6, "toUser");
        Intrinsics.X0O(r7, "file");
        String r0 = II1Xi0();
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;
        r1.OXO1("WAManager sendVoice -> " + OIi0 + ", " + r0 + ", " + r6 + ", " + r7);
        if (OIi0 == false) goto L5;
    L9:
        r1.OXO1("WAManager sendVoice -> sending, please wait");
        return;
    L5:
        if (FileUtils.isFileExists(r7) == false) goto L9;
        OIi0 = true;
        String r8 = "{\"phone\": \"" + r6 + "\",\"isGroup\": false,\"base64Ptt\": \"" + Base64.encodeToString(FileIOUtils.readFile2BytesByChannel(r7), 2) + "\"}";
        FileIOUtils.writeFileFromString(I0IIOi, r8);
        ANRequest.PostRequestBuilder r9 = AndroidNetworking.post(O001I()).setContentType(G5.L).addHeaders("Authorization", "Bearer " + r0).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap());
        byte[] r10 = r8.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r10, "getBytes(...)");
        r9.addByteBody(r10).setTag(O001I()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAResponse.class), new WAManager$sendVoice$1());
    }

    public final void IXI(@tb1 Function1<? super String, Unit> r8) {
        XOO0XOOii();
        iIiiO = I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WAManager$startPollingGetLoginQrCode$1(r8, null), 3, null);
    }

    public final void IXOIIIO(int r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, long r21) {
        Intrinsics.X0O(r16, "fromUserId");
        Intrinsics.X0O(r17, "fromUserName");
        Intrinsics.X0O(r18, "toUserId");
        Intrinsics.X0O(r19, "toUserName");
        Intrinsics.X0O(r20, "content");
        i1O0OXO1O.OXO1.OXO1("WAManager sendTextMessageToDevice -> " + r15 + ", f:" + r16 + ", f:" + r17 + ", t:" + r18 + ", t:" + r19 + ", " + r20);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_MESSAGE, BleKeyFlag.UPDATE, new BleChatMessage(6, 0, r15, r16, r17, r18, r19, r21, r20), false, false, 24, null);
    }

    public final String IXXOO() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/start-session";
    }

    public final void Ii0X0X() {
        WAUserInfo r0 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WAManager sendLoginSuccessToDevice");
        BleConnector r3 = BleConnector.INSTANCE;
        BleKey r4 = BleKey.CHAT_APP;
        BleKeyFlag r5 = BleKeyFlag.UPDATE;
        if (r0 == null) goto L8;
        String r2 = r0.getPhoneNumber();
        if (r2 == null) goto L8;
        String r9 = r2;
    L9:
        if (r0 == null) goto L14;
        String r1 = r0.getPushname();
        if (r1 == null) goto L14;
        String r10 = r1;
    L15:
        BaseBleConnector.sendObject$default(r3, r4, r5, new BleChatApp(6, 5, r9, r10, null, 16, null), false, false, 24, null);
        return;
    L14:
        r10 = "";
    L8:
        r9 = "";
        goto L9
    }

    public final void Ii0i() {
        XOXiX0();
        XX0 = I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WAManager$startPollingCheckLoginStatus$1(null), 3, null);
    }

    public final void Ii1iii0(@aa1 Application r3) {
        Intrinsics.X0O(r3, "app");
        i1O0OXO1O.OXO1.OXO1("WAManager -> init");
        XO0O10 = r3;
        BleConnector.INSTANCE.addHandleCallback(IIX1OXO);
        if (X0O != null) goto L11;
        X0O = new OpusManager();     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("WAManager -> opus init error！！！");
        return;
    }

    public final String O001I() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/send-voice-base64";
    }

    public final String O1O() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/logout-session";
    }

    public final void OII() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        bo4 r1 = OIX0iXi;
        if (r1 == null) goto L5;
        Boolean r2 = Boolean.valueOf(r1.XOO0ii0());
    L6:
        r0.OXO1("WAManager checkLoginStatus " + r2);
        X1IX(new wl6());
        return;
    L5:
        r2 = null;
        goto L6
    }

    public final void OO() {
        Timer r0 = new Timer();
        r0.schedule(new XIi00iiXO(r0), 500, 500);
    }

    public final void X00Xi1X(byte[] r2) {
        PipedOutputStream r0 = O10IXXX0X;     // Catch: Exception -> L6
        if (r0 == null) goto L11;
        r0.write(r2);     // Catch: Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public final void X1(@aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r6, "toUserName");
        Intrinsics.X0O(r7, "content");
        String r0 = II1Xi0();
        String r1 = "{\"phone\": \"" + r6 + "\",\"isGroup\": false,\"isNewsletter\": false,\"isLid\": false,\"message\": \"" + r7 + "\"}";
        i1O0OXO1O.OXO1.OXO1("WAManager sendTextMessage -> " + r0 + ", " + r6 + ", " + r7 + ", " + r1);
        if (TextUtils.isEmpty(r6) == false) goto L5;
        return;
    L5:
        ANRequest.PostRequestBuilder r8 = AndroidNetworking.post(iXiX011()).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setContentType(G5.L).addHeaders("Authorization", "Bearer " + r0);
        byte[] r9 = r1.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r9, "getBytes(...)");
        r8.addByteBody(r9).setTag(iXiX011()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAResponse.class), new WAManager$sendTextMessage$1());
    }

    public final boolean X100O() {
        bo4 r0 = OIX0iXi;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.XOO0ii0();
    }

    public final void X11I() {
        i1O0OXO1O.OXO1.OXO1("WAManager initWsManager");
        bo4 r0 = OIX0iXi;
        Application r1 = null;
        if (r0 == null) goto L7;
        if (r0 == null) goto L6;
        r0.IiI10X();
    L6:
        OIX0iXi = null;
    L7:
        Application r2 = XO0O10;
        if (r2 != null) goto L10;
        Intrinsics.XXO("mApp");
    L11:
        bo4.OXO1 r3 = new bo4.OXO1(r1).I0IIOi(iXiiiO());
        io.socket.client.OXO1.C0645OXO1 r4 = new io.socket.client.OXO1.C0645OXO1();
        r4.XIi00iiXO = "/whatsapp/socket.io";
        r4.XX0 = 10000;
        r4.OiIIX101O = 20000;
        r4.XiOIO = true;
        bo4 r5 = r3.XOO0ii0(r4).IiI10X(XiOIO).O00();
        OIX0iXi = r5;
        if (r5 == null) goto L15;
        r5.O00();
        return;
    L15:
        return;
    L10:
        r1 = r2;
        goto L11
    }

    @aa1
    public final File X11iII1O1() {
        return I0IIOi;
    }

    public final void X1IX(@tb1 final Function1<? super Boolean, Unit> r5) {
        String r0 = II1Xi0();
        i1O0OXO1O.OXO1.OXO1("WAManager getProfile -> " + r0);
        AndroidNetworking.get(iOO1ii1()).addHeaders("Authorization", "Bearer " + r0).setTag(iOO1ii1()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAProfile.class), new WAManager$getProfile$1(r5));
    }

    public final void XO0X10iO(@aa1 String r14) {
        Intrinsics.X0O(r14, "text");
        i1O0OXO1O.OXO1.OXO1("WAManager sendLoginQrcodeToDevice -> " + r14);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(6, 1, null, null, r14, 12, null), false, false, 24, null);
    }

    public final void XOIX() {
        if (I0iXXO == false) goto L5;
        return;
    L5:
        i1O0OXO1O.OXO1.OXO1("WAManager -> startRealTime");
        ThreadUtils.executeByIo(new iO());
    }

    public final void XOO0XOOii() {
        XiOIO r0 = iIiiO;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        iIiiO = null;
    }

    public final void XOX0O0(@aa1 String r4) {
        Intrinsics.X0O(r4, "token");
        a01.OXO1.IiI10X().put("WA_AUTH_TOKEN_" + BleCache.INSTANCE.getMBleAddress(), r4);
    }

    public final void XOXiX0() {
        XiOIO r0 = XX0;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        XX0 = null;
    }

    public final void XX1Oi(@tb1 final Function1<? super Boolean, Unit> r5) {
        String r0 = II1Xi0();
        i1O0OXO1O.OXO1.OXO1("WAManager logout -> " + r0);
        AndroidNetworking.post(O1O()).addHeaders("Authorization", "Bearer " + r0).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setTag(O1O()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAResponse.class), new WAManager$logout$1(r5));
        bo4 r6 = OIX0iXi;
        if (r6 == null) goto L6;
        r6.IiI10X();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String XXIIO1i11() {
        Ref.ObjectRef r0 = new Ref.ObjectRef();
        r0.element = "";
        I100X1.XOO0ii0(null, new WAManager$getLoginQrCodeBlock$1(r0, null), 1, null);
        return (String) r0.element;
    }

    public final String XXO() {
        return a01.OXO1.IiI10X().getString("WA_SESSION_" + BleCache.INSTANCE.getMBleAddress());
    }

    @aa1
    public final File XXX11i() {
        return XOO0ii0;
    }

    public final void XXiIiX10(String r11) {
        BleVoice r0 = new BleVoice(0, 0, 0, null, System.currentTimeMillis(), r11, 14, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r0, false, false, 24, null);
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
    public final File iI() {
        return O00;
    }

    @tb1
    public final WAUserInfo iIXi1iiXI() {
        SPUtils r0 = a01.OXO1.iO();
        return (WAUserInfo) new Gson().fromJson(r0.getString(WAUserInfo.class.getName()), WAUserInfo.class);
    }

    public final String iOO1ii1() {
        return DtbConstants.HTTPS + i010I() + "/whatsapp/api/" + XXO() + "/host-device";
    }

    public final void iOOX010X(@tb1 final Function1<? super Boolean, Unit> r4) {
        i1O0OXO1O.OXO1.OXO1("WAManager getAuthToken");
        AndroidNetworking.post(iX()).setTag(iX()).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.get(WAToken.class), new WAManager$getAuthToken$1(r4));
    }

    public final void iOiXi11II(String r16) {
        BleVoice r0 = new BleVoice(0, 1, 0, null, System.currentTimeMillis(), r16, 12, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r0, false, false, 24, null);
    }

    public final String iX() {
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

    public final void iiIOiX() {
        PipedInputStream r2 = X1ii;     // Catch: Throwable -> L6 Exception -> L8
        if (r2 == null) goto L10;
        r2.close();     // Catch: Throwable -> L6 Exception -> L8
    L10:
        PipedOutputStream r3 = O10IXXX0X;     // Catch: Throwable -> L6 Exception -> L8
        if (r3 == null) goto L13;
        r3.close();     // Catch: Throwable -> L6 Exception -> L8
    L13:
        X1ii = null;
        O10IXXX0X = null;
        XXI = null;
        I0iXXO = false;
        return;
    L8:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L6
        X1ii = null;
        O10IXXX0X = null;
        XXI = null;
        I0iXXO = false;
        return;
    L6:
        th = move-exception;
        X1ii = null;
        O10IXXX0X = null;
        XXI = null;
        I0iXXO = false;
        throw th;
    }

    public final void iiiO() {
        i1O0OXO1O.OXO1.OXO1("WAManager initWA");
        if (q62.OXO1.O00X() == false) goto L6;
        I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WAManager$initWA$1(null), 3, null);
        return;
    }
}
