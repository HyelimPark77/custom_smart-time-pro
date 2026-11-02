package com.sma.smartv3.biz.wx;

import android.app.Application;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1111;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ki1;
import com.android.mltcode.paycertificationapi.n77;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r77;
import com.android.mltcode.paycertificationapi.s77;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.t77;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u77;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.v77;
import com.android.mltcode.paycertificationapi.w77;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.baidu.ai.speech.realtime.full.connection.Runner;
import com.baidu.ai.speech.realtime.full.download.Result;
import com.baidu.ai.speech.realtime.full.download.SimpleDownloader;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.HttpLoggingInterceptor;
import com.sma.smartv3.biz.voice.OpusManager;
import com.sma.smartv3.biz.wx.data.Message;
import com.sma.smartv3.biz.wx.data.WxLoginQrCode;
import com.sma.smartv3.biz.wx.data.WxLoginQrCodeState;
import com.sma.smartv3.biz.wx.data.WxProfile;
import com.sma.smartv3.biz.wx.data.WxResponse;
import com.sma.smartv3.biz.wx.data.WxSendTextResult;
import com.sma.smartv3.biz.wx.data.WxSnsSync;
import com.sma.smartv3.biz.wx.data.WxString;
import com.sma.smartv3.biz.wx.data.WxUserInfo;
import com.sma.smartv3.model.WeatherRealtime;
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
import java.lang.reflect.Type;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1388:1\n90#2:1389\n15#2:1390\n*S KotlinDebug\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager\n*L\n636#1:1389\n973#1:1390\n*E\n"})
public final class WxManager {
    public static boolean I0IIOi = false;

    @tb1
    public static Runner I0iXXO = null;
    public static boolean I1XOi1 = false;

    @aa1
    public static final WxManager$mBleHandleCallback$1 IIX1OXO = null;

    @tb1
    public static n77 IO = null;

    @aa1
    public static final File IiI10X = null;

    @aa1
    public static final File O00 = null;

    @tb1
    public static OpusManager O10IXXX0X = null;
    public static volatile boolean OIX0iXi = false;

    @tb1
    public static ki1 OIi0 = null;

    @aa1
    public static final WxManager OXO1 = null;

    @tb1
    public static XiOIO OiIIX101O = null;

    @aa1
    public static String X0O = null;

    @tb1
    public static PipedOutputStream X1ii = null;

    @aa1
    public static final String XIi00iiXO = "WxManager";
    public static Application XO0O10;

    @aa1
    public static final File XOO0ii0 = null;

    @tb1
    public static XiOIO XX0;

    @tb1
    public static PipedInputStream XXI;

    @aa1
    public static WxManager$mWsStatusListener$1 XiOIO;
    public static int XiOIii1;

    @tb1
    public static XiOIO iIiiO;

    @aa1
    public static final String iO = null;

    public static final class OXO1 extends TimerTask {
        public final /* synthetic */ Timer IO;

        public OXO1(Timer r1) {
            this.IO = r1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (WxManager.OIX0iXi() == null) goto L8;
            Runner r0 = WxManager.OIX0iXi();
            Intrinsics.XXI(r0);
            if (r0.isClosed() == false) goto L8;
            WxManager r1 = WxManager.OXO1;
            WxManager.II1Xi0(false);
        L8:
            if (WxManager.IIX1OXO() == true) goto L11;
            cancel();
            this.IO.cancel();
            WxManager.iX(WxManager.OXO1);
            return;
        }
    }

    public static final class XIi00iiXO extends ThreadUtils.SimpleTask<Void> {

        public static final class OXO1 extends SimpleDownloader {
            public OXO1() {
            }

            @Override // com.baidu.ai.speech.realtime.full.download.SimpleDownloader
            public void onFailure(String r4) {
                Intrinsics.X0O(r4, "reason");
                i1O0OXO1O.OXO1.OXO1("WxManager onFailure -> " + r4);
                WxManager.iIiiO(WxManager.OXO1, UtilsKt.XXO(R.string.speech_recognition_error));
            }

            @Override // com.baidu.ai.speech.realtime.full.download.SimpleDownloader
            public void onMessage(Result r5) {
                Intrinsics.X0O(r5, "result");
                i1O0OXO1O.OXO1.OXO1("WxManager onMessage -> " + r5.getOrignalJsonStr());
                if (r5.isError() == false) goto L5;
                return;
            L5:
                if (r5.isFin() == false) goto L13;
                String r6 = r5.getResult();
                if (TextUtils.isEmpty(r6) == true) goto L10;
                WxManager r0 = WxManager.OXO1;
                Intrinsics.XXI(r6);
                WxManager.XX0(r0, r6);
                return;
            L10:
                WxManager.iIiiO(WxManager.OXO1, UtilsKt.XXO(R.string.speech_recognition_error));
                return;
            }
        }

        public XIi00iiXO() {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            WxManager r0 = WxManager.OXO1;
            WxManager.II1Xi0(true);
            WxManager.OII(new PipedInputStream());
            WxManager.iOOX010X(new PipedOutputStream(WxManager.I0iXXO()));
            WxManager.XiOIii1(new Runner(WxManager.I0iXXO(), 2));
            Runner r1 = WxManager.OIX0iXi();
            if (r1 == null) goto L5;
            r1.run(new OXO1());
        L5:
            WxManager.XiOIO(r0);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.sma.smartv3.biz.wx.WxManager$mWsStatusListener$1] */
    static {
        OXO1 = new WxManager();
        iO = "该账号需要重新登录！loginState == MMLoginStateNoLogin ";
        sz0 r0 = sz0.OXO1;
        O00 = uz0.iO(r0, "wx_opus.ogg");
        IiI10X = uz0.iO(r0, "wx_opus.pcm");
        XOO0ii0 = uz0.iO(r0, "wx_opus.wav");
        X0O = "mac";
        I1XOi1 = true;
        IIX1OXO = new WxManager$mBleHandleCallback$1();
        XiOIO = new WxManager$mWsStatusListener$1();
    }

    public WxManager() {
    }

    public static final void I0(long r0, long r2) {
    }

    public static final /* synthetic */ String I0IIOi(WxManager r0) {
        return r0.iXiiiO();
    }

    public static final /* synthetic */ PipedInputStream I0iXXO() {
        return XXI;
    }

    public static final /* synthetic */ void I1(ki1 r0) {
        OIi0 = r0;
    }

    public static final /* synthetic */ boolean I1XOi1() {
        return I1XOi1;
    }

    public static final /* synthetic */ void II1Xi0(boolean r0) {
        OIX0iXi = r0;
    }

    public static final /* synthetic */ boolean IIX1OXO() {
        return OIX0iXi;
    }

    public static final /* synthetic */ String IO(WxManager r0) {
        return r0.OX110i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IX1XiI(WxManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.iOI(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IXOIIIO(WxManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.X1(r1);
    }

    public static final /* synthetic */ boolean IXXOO(WxManager r0) {
        return r0.I0XXi0X();
    }

    public static /* synthetic */ Unit IiI10X(Function1 r0, boolean r1) {
        return iI(r0, r1);
    }

    public static /* synthetic */ Unit O00(boolean r0) {
        return XXX11i(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O001I(WxManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.iXiX011(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O0O(WxManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.iXi(r1, r2);
    }

    public static final void O1(long r0, long r2) {
    }

    public static final /* synthetic */ OpusManager O10IXXX0X() {
        return O10IXXX0X;
    }

    public static final /* synthetic */ void OII(PipedInputStream r0) {
        XXI = r0;
    }

    public static final /* synthetic */ Runner OIX0iXi() {
        return I0iXXO;
    }

    public static final /* synthetic */ XiOIO OIi0() {
        return iIiiO;
    }

    public static final /* synthetic */ void OX(String r0) {
        X0O = r0;
    }

    public static /* synthetic */ Unit OXO1(String r0) {
        return X0i1O(r0);
    }

    public static final /* synthetic */ void OiIIX101O(boolean r0) {
        I1XOi1 = r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X00XIX1(WxManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.iOiXi11II(r1);
    }

    public static final /* synthetic */ void X01IiOiIi(n77 r0) {
        IO = r0;
    }

    public static final /* synthetic */ n77 X0O() {
        return IO;
    }

    public static final Unit X0i1O(String r1) {
        Intrinsics.X0O(r1, "it");
        if (TextUtils.isEmpty(r1) == true) goto L6;
        WxManager r0 = OXO1;
        r0.X111IO(r1);
        r0.O101();
    L6:
        return Unit.OXO1;
    }

    public static final Unit X1IX(boolean r1) {
        if (r1 == false) goto L5;
        OXO1.iOiXi11II(new w77());
    L5:
        return Unit.OXO1;
    }

    public static final /* synthetic */ ki1 X1ii() {
        return OIi0;
    }

    public static /* synthetic */ void XIi00iiXO(long r0, long r2) {
        O1(r0, r2);
    }

    public static /* synthetic */ Unit XO0O10(boolean r0) {
        return X1IX(r0);
    }

    public static final /* synthetic */ WxLoginQrCodeState XOO0ii0(WxManager r0) {
        return r0.iOO1ii1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XOXiX0(WxManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.XOIX(r1);
    }

    public static final /* synthetic */ void XX0(WxManager r0, String r1) {
        r0.i100IXOX(r1);
    }

    public static final /* synthetic */ String XXI() {
        return X0O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XXIIO1i11(WxManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.O1O(r1);
    }

    public static final Unit XXX11i(boolean r1) {
        if (r1 == false) goto L10;
        n77 r2 = IO;
        if (r2 != null) goto L6;
    L8:
        OXO1.IO0iXO0O();
    L9:
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginStatus 已登");
        OXO1.iIi1();
    L12:
        return Unit.OXO1;
    L6:
        if (r2.OXO1() != true) goto L8;
    L10:
        OXO1.iXiX011(new t77());
        goto L12
    }

    public static final /* synthetic */ void XiOIO(WxManager r0) {
        r0.XXiO0i();
    }

    public static final /* synthetic */ void XiOIii1(Runner r0) {
        I0iXXO = r0;
    }

    public static final /* synthetic */ void i010I(boolean r0) {
        I0IIOi = r0;
    }

    public static final Unit iI(Function1 r1, boolean r2) {
        if (r2 == false) goto L12;
        n77 r3 = IO;
        if (r3 != null) goto L6;
    L8:
        OXO1.IO0iXO0O();
    L9:
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginStatus 已登");
        OXO1.iIi1();
        if (r1 == null) goto L19;
        r1.invoke(Boolean.TRUE);
    L19:
        return Unit.OXO1;
    L6:
        if (r3.OXO1() != true) goto L8;
    L12:
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginStatus 未登录");
        n77 r4 = IO;
        if (r4 == null) goto L15;
        r4.XOO0ii0();
    L15:
        OXO1.X00O0();
        if (r1 == null) goto L19;
        r1.invoke(Boolean.FALSE);
        goto L19
    }

    public static final /* synthetic */ void iIiiO(WxManager r0, String r1) {
        r0.Xi1i0XOX0(r1);
    }

    public static /* synthetic */ void iO(long r0, long r2) {
        I0(r0, r2);
    }

    public static final /* synthetic */ void iOOX010X(PipedOutputStream r0) {
        X1ii = r0;
    }

    public static final /* synthetic */ void iX(WxManager r0) {
        r0.XXOXi();
    }

    public static /* synthetic */ void iii0(WxManager r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = Utils.getApp().getString(R.string.request_error);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
    L5:
        r0.Xi1i0XOX0(r1);
    }

    public final boolean I0XXi0X() {
        String r0 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager syncCheckLoginStatus -> " + r0);
        Ref.BooleanRef r1 = new Ref.BooleanRef();
        I100X1.XOO0ii0(null, new WxManager$syncCheckLoginStatus$1(r0, r1, null), 1, null);
        return r1.element;
    }

    @tb1
    public final WxProfile IO0II0i() {
        SPUtils r0 = a01.OXO1.iO();
        return (WxProfile) new Gson().fromJson(r0.getString(WxProfile.class.getName()), WxProfile.class);
    }

    public final void IO0iXO0O() {
        String r0 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager initWsManager " + r0);
        n77 r1 = IO;
        Application r2 = null;
        if (r1 == null) goto L7;
        if (r1 == null) goto L6;
        r1.XOO0ii0();
    L6:
        IO = null;
    L7:
        Application r3 = XO0O10;
        if (r3 != null) goto L10;
        Intrinsics.XXO("mApp");
    L11:
        n77.O00 r4 = new n77.O00(r2);
        OkHttpClient.Builder r5 = new OkHttpClient().newBuilder();
        HttpLoggingInterceptor r6 = new HttpLoggingInterceptor(HttpLoggingInterceptor.OXO1.OXO1);
        r6.O00(HttpLoggingInterceptor.Level.BODY);
        Unit r7 = Unit.OXO1;
        n77 r8 = r4.OIi0(r5.addInterceptor(r6).build()).XXI(true).X1ii(IiiXiI0I() + "?key=" + r0).I0iXXO(kotlin.collections.OXO1.I1()).I0IIOi();
        IO = r8;
        if (r8 == null) goto L14;
        r8.II1Xi0(XiOIO);
    L14:
        n77 r9 = IO;
        if (r9 == null) goto L17;
        r9.iO();
    L17:
        iX1O1();
        return;
    L10:
        r2 = r3;
        goto L11
    }

    public final void IOi1O0() {
        AndroidNetworking.upload(iiIOiX()).addMultipartParameter("key", iIXi1iiXI()).setTag(iiIOiX()).setPriority(Priority.HIGH).build().setUploadProgressListener(new r77()).getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{Object.class}), new WxManager$wakeUpLogin$2());
    }

    public final void IX0IXOi(@aa1 String r4) {
        Intrinsics.X0O(r4, "authKey");
        a01.OXO1.IiI10X().put("WX_AUTH_KEY_" + BleCache.INSTANCE.getMBleAddress(), r4);
    }

    public final String IXI() {
        return DtbConstants.HTTPS + XXO() + "/api/message/SendVoice";
    }

    public final void IXiOXO() {
        XIIO11I();
        XX0 = I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WxManager$startPollingCheckLoginStatus$1(null), 3, null);
    }

    @aa1
    public final File Ii0X0X() {
        return XOO0ii0;
    }

    public final String Ii0i() {
        return DtbConstants.HTTPS + XXO() + "/wechat/message/SendTextMessage";
    }

    @aa1
    public final String Ii1iii0() {
        return iO;
    }

    public final String IiiXiI0I() {
        return "wss://" + XXO() + "/wechat/ws/GetSyncMsg";
    }

    public final boolean O0O0X0iOi() {
        n77 r0 = IO;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.OXO1();
    }

    public final void O101() {
        XXI0XOIX();
        OiIIX101O = I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WxManager$startPollingCheckLoginQrcodeStatus$1(null), 3, null);
    }

    public final void O1O(@tb1 final Function1<? super Boolean, Unit> r5) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        n77 r1 = IO;
        if (r1 == null) goto L5;
        Boolean r2 = Boolean.valueOf(r1.OXO1());
    L6:
        r0.OXO1("WxManager checkLoginStatus " + r2);
        X1(new v77(r5));
        return;
    L5:
        r2 = null;
        goto L6
    }

    public final String OO() {
        return DtbConstants.HTTPS + XXO() + "/wechat/sns/GetSnsSync";
    }

    public final String OX110i() {
        return DtbConstants.HTTPS + XXO() + "/wechat/user/GetProfile";
    }

    public final void Oi(@aa1 Application r3) {
        Intrinsics.X0O(r3, "app");
        i1O0OXO1O.OXO1.OXO1("WxManager -> init");
        XO0O10 = r3;
        BleConnector.INSTANCE.addHandleCallback(IIX1OXO);
        if (O10IXXX0X != null) goto L11;
        O10IXXX0X = new OpusManager();     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("WxManager -> opus init error！！！");
        return;
    }

    public final void X00O0() {
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoginFailedToDevice");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(15, 6, null, null, null, 28, null), false, false, 24, null);
    }

    @aa1
    public final String X00Xi1X(@aa1 Message r9) {
        Intrinsics.X0O(r9, "message");
        String r1 = r9.getPush_content();
        if (StringsKt__StringsKt.iIi011O(r1, " : ", false, 2, null) == false) goto L5;
        String r0 = (String) StringsKt__StringsKt.i1I(r1, new String[]{" : "}, false, 0, 6, null).get(1);
    L7:
        if (TextUtils.isEmpty(r0) == false) goto L9;
        r0 = r9.getContent().getStr();
    L9:
        int r10 = r9.getMsg_type();
        if (r10 != 3) goto L12;
        UtilsKt.XXO(R.string.chat_image);
    L29:
        if (r0.length() <= 100) goto L32;
        String r11 = r0.substring(0, 100);
        Intrinsics.O10IXXX0X(r11, "substring(...)");
        return r11;
    L32:
        return r0;
    L12:
        if (r10 != 34) goto L14;
        UtilsKt.XXO(R.string.chat_voice);
        goto L29
    L14:
        if (r10 != 42) goto L16;
        UtilsKt.XXO(R.string.chat_vcard);
        goto L29
    L16:
        if (r10 != 43) goto L18;
        UtilsKt.XXO(R.string.chat_video);
        goto L29
    L18:
        if (r10 != 48) goto L20;
        UtilsKt.XXO(R.string.chat_location);
        goto L29
    L20:
        if (r10 != 49) goto L29;
        UtilsKt.XXO(R.string.chat_type_unknown);
        goto L29
    L5:
        r0 = "";
        goto L7
    }

    public final void X0iO() {
        I1XOi1 = false;
        String r1 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingVerificationUrl -> " + r1);
        AndroidNetworking.post(X100O()).addQueryParameter("key", r1).setTag(X100O()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{WxLoginQrCode.class}), new WxManager$sendLoggingVerificationUrl$1());
    }

    public final void X1(@tb1 final Function1<? super Boolean, Unit> r5) {
        String r0 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager getProfile -> " + r0);
        AndroidNetworking.get(OX110i()).addQueryParameter("key", r0).setTag(OX110i()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{WxProfile.class}), new WxManager$getProfile$1(r5));
    }

    public final String X100O() {
        return DtbConstants.HTTPS + XXO() + "/api/wechat/login/VerifyCodeSlideV2";
    }

    public final void X111IO(@aa1 String r14) {
        Intrinsics.X0O(r14, "text");
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoginQrcodeToDevice -> " + r14);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(15, 1, null, null, r14, 12, null), false, false, 24, null);
    }

    public final String X11I() {
        return DtbConstants.HTTPS + XXO() + "/api/login/GetLoginQrCodeNew";
    }

    public final void X11iII1O1() {
        X1(new s77());
    }

    public final void X1OI(int r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, long r21) {
        Intrinsics.X0O(r16, "fromUserId");
        Intrinsics.X0O(r17, "fromUserName");
        Intrinsics.X0O(r18, "toUserId");
        Intrinsics.X0O(r19, "toUserName");
        Intrinsics.X0O(r20, "content");
        i1O0OXO1O.OXO1.OXO1("WxManager sendTextMessageToDevice -> " + r15 + ", f:" + r16 + ", f:" + r17 + ", t:" + r18 + ", t:" + r19 + ", " + r20);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_MESSAGE, BleKeyFlag.UPDATE, new BleChatMessage(15, 0, r15, r16, r17, r18, r19, r21, r20), false, false, 24, null);
    }

    public final void XIIO11I() {
        XiOIO r0 = XX0;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        XX0 = null;
    }

    @aa1
    public final File XO0X10iO() {
        return IiI10X;
    }

    public final void XOIX(@tb1 final Function1<? super Boolean, Unit> r5) {
        String r0 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager getSnsSync -> " + r0);
        AndroidNetworking.post(OO()).addQueryParameter("key", r0).setTag(OO()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{WxSnsSync.class}), new WxManager$getSnsSync$1(r5));
    }

    public final String XOO0XOOii() {
        return DtbConstants.HTTPS + XXO() + "/api/login/VerifyCode";
    }

    public final String XOX0O0() {
        return DtbConstants.HTTPS + XXO() + "/wechat/login/LogOut";
    }

    public final void XX00i10X() {
        i1O0OXO1O.OXO1.OXO1("WxManager initWx");
        if (q62.OXO1.ii1() == false) goto L6;
        I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WxManager$initWx$1(null), 3, null);
        return;
    }

    public final String XX1Oi() {
        return DtbConstants.HTTPS + XXO() + "/wechat/user/GetMyQrCode";
    }

    public final void XXI0XOIX() {
        XiOIO r0 = OiIIX101O;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        OiIIX101O = null;
    }

    public final String XXO() {
        i72 r0 = i72.OXO1;
        if (r0.X00XIX1() == false) goto L5;
        return X1111.XOO0ii0;
    L5:
        if (r0.OiO() == true) goto L11;
        return "ai-dev.iot-solution.net";
    L11:
        return X1111.XOO0ii0;
    }

    public final void XXOXi() {
        i1O0OXO1O.OXO1.OXO1("WxManager -> stopRealTime");
        PipedInputStream r2 = XXI;     // Catch: Throwable -> L6 Exception -> L8
        if (r2 == null) goto L10;
        r2.close();     // Catch: Throwable -> L6 Exception -> L8
    L10:
        PipedOutputStream r3 = X1ii;     // Catch: Throwable -> L6 Exception -> L8
        if (r3 == null) goto L13;
        r3.close();     // Catch: Throwable -> L6 Exception -> L8
    L13:
        XXI = null;
        X1ii = null;
        I0iXXO = null;
        OIX0iXi = false;
        return;
    L6:
        th = move-exception;
        XXI = null;
        X1ii = null;
        I0iXXO = null;
        OIX0iXi = false;
        throw th;
    L8:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L6
        XXI = null;
        X1ii = null;
        I0iXXO = null;
        OIX0iXi = false;
    }

    public final synchronized int XXiIiX10() {
        monitor-enter(this);
        int r0 = (XiOIii1 + 1) % 10000;     // Catch: Throwable -> L6
        XiOIii1 = r0;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    public final void XXiO0i() {
        Timer r0 = new Timer();
        r0.schedule(new OXO1(r0), 500, 500);
    }

    public final void Xi1i0XOX0(String r16) {
        BleVoice r0 = new BleVoice(0, 1, 0, null, System.currentTimeMillis(), r16, 12, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r0, false, false, 24, null);
    }

    public final void Xii() {
        i1O0OXO1O.OXO1.OXO1("WxManager sendVerificationToDevice");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(15, 8, null, null, null, 28, null), false, false, 24, null);
    }

    public final void Xii11I() {
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingToDevice");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(15, 4, null, null, null, 28, null), false, false, 24, null);
    }

    public final int i0X000X0O() {
        return XiOIii1;
    }

    public final void i100IXOX(String r11) {
        BleVoice r0 = new BleVoice(0, 0, 0, null, System.currentTimeMillis(), r11, 14, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r0, false, false, 24, null);
    }

    @aa1
    public final File i11I() {
        return O00;
    }

    public final void iI0I(byte[] r2) {
        PipedOutputStream r0 = X1ii;     // Catch: Exception -> L6
        if (r0 == null) goto L11;
        r0.write(r2);     // Catch: Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public final void iIX0i(@aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r6, "toUserName");
        Intrinsics.X0O(r7, "content");
        String r0 = iIXi1iiXI();
        String r1 = "{  \"MsgItem\": [    {      \"AtWxIDList\": [],      \"ImageContent\": \"\",      \"MsgType\": 0,      \"TextContent\": \"" + r7 + "\",      \"ToUserName\": \"" + r6 + "\"    }  ]}";
        i1O0OXO1O.OXO1.OXO1("WxManager sendTextMessage -> " + r0 + ", " + r6 + ", " + r7);
        if (TextUtils.isEmpty(r6) == false) goto L5;
        return;
    L5:
        ANRequest.PostRequestBuilder r8 = AndroidNetworking.post(Ii0i()).addQueryParameter("key", r0);
        byte[] r9 = r1.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r9, "getBytes(...)");
        r8.addByteBody(r9).setTag(Ii0i()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{WxSendTextResult[].class}), new WxManager$sendTextMessage$1());
    }

    @aa1
    public final String iIXi1iiXI() {
        String r0 = a01.OXO1.IiI10X().getString("WX_AUTH_KEY_" + BleCache.INSTANCE.getMBleAddress());
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }

    public final void iIi0(int r1) {
        XiOIii1 = r1;
    }

    public final void iIi1() {
        WxProfile r0 = IO0II0i();
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoginSuccessToDevice");
        BleConnector r3 = BleConnector.INSTANCE;
        BleKey r4 = BleKey.CHAT_APP;
        BleKeyFlag r5 = BleKeyFlag.UPDATE;
        if (r0 == null) goto L12;
        WxUserInfo r2 = r0.getUserInfo();
        if (r2 == null) goto L12;
        WxString r6 = r2.getUserName();
        if (r6 == null) goto L12;
        String r7 = r6.getStr();
        if (r7 == null) goto L12;
        String r9 = r7;
    L13:
        if (r0 == null) goto L22;
        WxUserInfo r1 = r0.getUserInfo();
        if (r1 == null) goto L22;
        WxString r8 = r1.getNickName();
        if (r8 == null) goto L22;
        String r10 = r8.getStr();
        if (r10 == null) goto L22;
        String r11 = r10;
    L23:
        BaseBleConnector.sendObject$default(r3, r4, r5, new BleChatApp(15, 5, r9, r11, null, 16, null), false, false, 24, null);
        return;
    L22:
        r11 = "";
    L12:
        r9 = "";
        goto L13
    }

    public final void iOI(@tb1 final Function1<? super Boolean, Unit> r6) {
        String r0 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager logout -> " + r0);
        AndroidNetworking.get(XOX0O0()).addQueryParameter("key", r0).setTag(XOX0O0()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{String.class}), new WxManager$logout$1(r6));
        n77 r7 = IO;
        if (r7 == null) goto L5;
        r7.XOO0ii0();
    L5:
        XiOIO r8 = iIiiO;
        if (r8 == null) goto L9;
        XiOIO.OXO1.XIi00iiXO(r8, null, 1, null);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.sma.smartv3.biz.wx.data.WxLoginQrCodeState] */
    public final WxLoginQrCodeState iOO1ii1() {
        String r0 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus -> " + r0);
        Ref.ObjectRef r1 = new Ref.ObjectRef();
        r1.element = WxLoginQrCodeState.NotScanned;
        I100X1.XOO0ii0(null, new WxManager$checkLoginQrcodeStatus$1(r0, r1, null), 1, null);
        return (WxLoginQrCodeState) r1.element;
    }

    public final void iOX() {
        if (OIX0iXi == false) goto L5;
        return;
    L5:
        i1O0OXO1O.OXO1.OXO1("WxManager -> startRealTime");
        ThreadUtils.executeByIo(new XIi00iiXO());
    }

    public final void iOiXi11II(@tb1 final Function1<? super String, Unit> r7) {
        String r0 = iIXi1iiXI();
        SPUtils r1 = a01.OXO1.OXO1();
        WeatherRealtime r2 = (WeatherRealtime) new Gson().fromJson(r1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (r2 == null) goto L6;
        String r3 = r2.getName();
        if (r3 == null) goto L6;
    L7:
        i1O0OXO1O.OXO1.OXO1("WxManager getLoginQrCode -> " + r0 + ", " + r3 + ", " + X0O);
        ANRequest.PostRequestBuilder r4 = AndroidNetworking.post(X11I()).addQueryParameter("key", r0).addQueryParameter("city", r3).addQueryParameter("ipadOrmac", X0O);
        byte[] r5 = "{\"Check\": true,\"Proxy\": \"socks5://root:z567456781@47.115.60.222:7888\"}".getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r5, "getBytes(...)");
        r4.addByteBody(r5).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setTag(X11I()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{WxLoginQrCode.class}), new WxManager$getLoginQrCode$1(r7));
        return;
    L6:
        r3 = "";
        goto L7
    }

    public final void iX1O1() {
        XiOIO r0 = iIiiO;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        iIiiO = I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WxManager$checkWsManagerConnected$1(null), 3, null);
    }

    public final void iXi(@aa1 String r6, @tb1 final Function1<? super Boolean, Unit> r7) {
        Intrinsics.X0O(r6, "code");
        String r1 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingVerificationUrl -> " + r1);
        AndroidNetworking.post(XOO0XOOii()).addQueryParameter("key", r1).addQueryParameter("code", r6).setTag(XOO0XOOii()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{WxLoginQrCode.class}), new WxManager$sendCodeVerificationLogin$1(r7));
    }

    public final void iXiX011(@tb1 final Function1<? super Boolean, Unit> r5) {
        i1O0OXO1O.OXO1.OXO1("WxManager getAuthKey");
        AndroidNetworking.post(iiiO()).addQueryParameter("key", "stay33").setTag(iiiO()).setPriority(Priority.HIGH).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{String[].class}), new WxManager$getAuthKey$1(r5));
    }

    public final String iXiiiO() {
        return DtbConstants.HTTPS + XXO() + "/wechat/login/CheckLoginStatus";
    }

    public final void iiII(@aa1 String r9, @aa1 final File r10) {
        Intrinsics.X0O(r9, "toUser");
        Intrinsics.X0O(r10, "file");
        String r3 = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager sendVoice -> " + I0IIOi + ", " + r3 + ", " + r9 + ", " + r10);
        if (I0IIOi == false) goto L5;
        return;
    L5:
        if (FileUtils.isFileExists(r10) == false) goto L10;
        I0IIOi = true;
        AndroidNetworking.upload(IXI()).addMultipartParameter("key", r3).addMultipartParameter("toUser", r9).addMultipartFile("file", r10).setTag(IXI()).setPriority(Priority.HIGH).build().setUploadProgressListener(new u77()).getAsParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{Object.class}), new WxManager$sendVoice$2(r10));
        return;
    }

    public final String iiIOiX() {
        return DtbConstants.HTTPS + XXO() + "/wechat/login/WakeUpLogin";
    }

    public final String iiiO() {
        return DtbConstants.HTTPS + XXO() + "/wechat/admin/GenAuthKey1";
    }
}
