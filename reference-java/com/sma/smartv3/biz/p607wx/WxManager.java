package com.sma.smartv3.biz.p607wx;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1111;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1I11I0i0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ki1;
import com.android.mltcode.paycertificationapi.n77;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.q77;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ud5;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.androidnetworking.interfaces.UploadProgressListener;
import com.baidu.p559ai.speech.realtime.full.connection.Runner;
import com.baidu.p559ai.speech.realtime.full.download.Result;
import com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.HttpLoggingInterceptor;
import com.sma.smartv3.biz.p607wx.WxManager;
import com.sma.smartv3.biz.p607wx.data.Message;
import com.sma.smartv3.biz.p607wx.data.WxLoginQrCode;
import com.sma.smartv3.biz.p607wx.data.WxLoginQrCodeState;
import com.sma.smartv3.biz.p607wx.data.WxMessage;
import com.sma.smartv3.biz.p607wx.data.WxProfile;
import com.sma.smartv3.biz.p607wx.data.WxResponse;
import com.sma.smartv3.biz.p607wx.data.WxSendTextResult;
import com.sma.smartv3.biz.p607wx.data.WxSnsSync;
import com.sma.smartv3.biz.p607wx.data.WxString;
import com.sma.smartv3.biz.p607wx.data.WxUserInfo;
import com.sma.smartv3.biz.voice.OpusManager;
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
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okio.ByteString;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1388:1\n90#2:1389\n15#2:1390\n*S KotlinDebug\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager\n*L\n636#1:1389\n973#1:1390\n*E\n"})
public final class WxManager {
    public static boolean I0IIOi = false;

    @tb1
    public static Runner I0iXXO = null;
    public static boolean I1XOi1 = false;

    @aa1
    public static final WxManager$mBleHandleCallback$1 IIX1OXO;

    /* JADX INFO: renamed from: IO */
    @tb1
    public static n77 f50956IO = null;

    @aa1
    public static final File IiI10X;

    @aa1
    public static final File O00;

    @tb1
    public static OpusManager O10IXXX0X = null;
    public static volatile boolean OIX0iXi = false;

    @tb1
    public static ki1 OIi0 = null;

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
    public static final File XOO0ii0;

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
    public static final WxManager OXO1 = new WxManager();

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final String f50957iO = "该账号需要重新登录！loginState == MMLoginStateNoLogin ";

    public static final class OXO1 extends TimerTask {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Timer f50958IO;

        public OXO1(Timer timer) {
            this.f50958IO = timer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (WxManager.I0iXXO != null) {
                Runner runner = WxManager.I0iXXO;
                Intrinsics.XXI(runner);
                if (runner.isClosed()) {
                    WxManager wxManager = WxManager.OXO1;
                    WxManager.OIX0iXi = false;
                }
            }
            if (WxManager.OIX0iXi) {
                return;
            }
            cancel();
            this.f50958IO.cancel();
            WxManager.OXO1.XXOXi();
        }
    }

    public static final class XIi00iiXO extends ThreadUtils.SimpleTask<Void> {

        public static final class OXO1 extends SimpleDownloader {
            @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
            public void onFailure(String reason) {
                Intrinsics.X0O(reason, "reason");
                i1O0OXO1O.OXO1.OXO1("WxManager onFailure -> " + reason);
                WxManager.OXO1.Xi1i0XOX0(UtilsKt.XXO(R.string.speech_recognition_error));
            }

            @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
            public void onMessage(Result result) {
                Intrinsics.X0O(result, "result");
                i1O0OXO1O.OXO1.OXO1("WxManager onMessage -> " + result.getOrignalJsonStr());
                if (result.isError() || !result.isFin()) {
                    return;
                }
                String result2 = result.getResult();
                if (TextUtils.isEmpty(result2)) {
                    WxManager.OXO1.Xi1i0XOX0(UtilsKt.XXO(R.string.speech_recognition_error));
                    return;
                }
                WxManager wxManager = WxManager.OXO1;
                Intrinsics.XXI(result2);
                wxManager.i100IXOX(result2);
            }
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() throws IOException {
            WxManager wxManager = WxManager.OXO1;
            WxManager.OIX0iXi = true;
            WxManager.XXI = new PipedInputStream();
            WxManager.X1ii = new PipedOutputStream(WxManager.XXI);
            WxManager.I0iXXO = new Runner(WxManager.XXI, 2);
            Runner runner = WxManager.I0iXXO;
            if (runner != null) {
                runner.run(new OXO1());
            }
            wxManager.XXiO0i();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.sma.smartv3.biz.wx.WxManager$mWsStatusListener$1] */
    static {
        sz0 sz0Var = sz0.OXO1;
        O00 = uz0.m3192iO(sz0Var, "wx_opus.ogg");
        IiI10X = uz0.m3192iO(sz0Var, "wx_opus.pcm");
        XOO0ii0 = uz0.m3192iO(sz0Var, "wx_opus.wav");
        X0O = "mac";
        I1XOi1 = true;
        IIX1OXO = new WxManager$mBleHandleCallback$1();
        XiOIO = new q77() { // from class: com.sma.smartv3.biz.wx.WxManager$mWsStatusListener$1
            public final List<Long> OXO1 = new ArrayList();

            public final List<Long> OXO1() {
                return this.OXO1;
            }

            public final boolean XIi00iiXO(String str) {
                return StringsKt__StringsKt.iIi011O(str, "@", false, 2, null) || StringsKt__StringsKt.iIi011O(str, "gh_", false, 2, null);
            }

            @Override // com.android.mltcode.paycertificationapi.q77
            public void onClosed(int i, String reason) {
                Intrinsics.X0O(reason, "reason");
                i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onClosed: " + i + ", " + reason);
                this.OXO1.clear();
            }

            @Override // com.android.mltcode.paycertificationapi.q77
            public void onClosing(int i, String reason) {
                Intrinsics.X0O(reason, "reason");
                i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onClosing: " + i + ", " + reason);
            }

            @Override // com.android.mltcode.paycertificationapi.q77
            public void onFailure(Throwable t, Response response) {
                Intrinsics.X0O(t, "t");
                i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onFailure: " + t + ", " + response + ud5.I0iXXO);
                XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WxManager$mWsStatusListener$1$onFailure$1(null), 3, null);
            }

            @Override // com.android.mltcode.paycertificationapi.q77
            public void onHeartbeat() {
                i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onHeartbeat");
            }

            @Override // com.android.mltcode.paycertificationapi.q77
            public void onMessage(ByteString bytes) {
                Intrinsics.X0O(bytes, "bytes");
            }

            @Override // com.android.mltcode.paycertificationapi.q77
            public void onOpen(Response response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onOpen");
                this.OXO1.clear();
            }

            @Override // com.android.mltcode.paycertificationapi.q77
            public void onReconnect() {
                i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onReconnect");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.android.mltcode.paycertificationapi.q77
            public void onMessage(String text) {
                Object str;
                Object str2;
                Intrinsics.X0O(text, "text");
                if (Intrinsics.XOO0ii0(text, "pong")) {
                    return;
                }
                try {
                    Message message = ((WxMessage) new Gson().fromJson(text, WxMessage.class)).getMessage();
                    if (message.getMsg_id() != -1 && this.OXO1.contains(Long.valueOf(message.getMsg_id()))) {
                        i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener 过滤重复消息msg_id:" + message.getMsg_id());
                        return;
                    }
                    String str3 = message.getFrom_user_name().getStr();
                    String str4 = message.getTo_user_name().getStr();
                    if (!XIi00iiXO(str3) && !XIi00iiXO(str4)) {
                        int msg_type = message.getMsg_type();
                        if (msg_type != 1 && msg_type != 3 && msg_type != 34 && msg_type != 47 && msg_type != 49 && msg_type != 42 && msg_type != 43) {
                            i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onMessage : 暂不支持的类型 = " + message);
                            return;
                        }
                        this.OXO1.add(Long.valueOf(message.getMsg_id()));
                        String push_content = message.getPush_content();
                        if (StringsKt__StringsKt.iIi011O(push_content, " : ", false, 2, null)) {
                            str = StringsKt__StringsKt.i1I(push_content, new String[]{" : "}, false, 0, 6, null).get(0);
                            str2 = "";
                        } else {
                            str = "";
                            str2 = str;
                        }
                        WxManager wxManager = WxManager.OXO1;
                        String strX00Xi1X = wxManager.X00Xi1X(message);
                        WxProfile wxProfileIO0II0i = wxManager.IO0II0i();
                        if (wxProfileIO0II0i != null) {
                            if (Intrinsics.XOO0ii0(wxProfileIO0II0i.getUserInfo().getUserName().getStr(), str4)) {
                                str2 = wxProfileIO0II0i.getUserInfo().getNickName().getStr();
                            }
                            if (Intrinsics.XOO0ii0(wxProfileIO0II0i.getUserInfo().getUserName().getStr(), str3)) {
                                str = wxProfileIO0II0i.getUserInfo().getNickName().getStr();
                            }
                        }
                        wxManager.X1OI(0, str3, (String) str, str4, str2, strX00Xi1X, ((long) wxManager.XXiIiX10()) + (message.getCreate_time() * ((long) 1000)));
                        return;
                    }
                    i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onMessage : isGroupID = true");
                } catch (Exception e) {
                    e.printStackTrace();
                    i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onMessage : Exception = " + e.getMessage());
                }
            }
        };
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m38146I0(long j, long j2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IX1XiI(WxManager wxManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wxManager.iOI(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IXOIIIO(WxManager wxManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wxManager.m38156X1(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O001I(WxManager wxManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wxManager.iXiX011(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O0O(WxManager wxManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        wxManager.iXi(str, function1);
    }

    /* JADX INFO: renamed from: O1 */
    public static final void m38149O1(long j, long j2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X00XIX1(WxManager wxManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wxManager.iOiXi11II(function1);
    }

    public static final Unit X0i1O(String it) {
        Intrinsics.X0O(it, "it");
        if (!TextUtils.isEmpty(it)) {
            WxManager wxManager = OXO1;
            wxManager.X111IO(it);
            wxManager.O101();
        }
        return Unit.OXO1;
    }

    public static final Unit X1IX(boolean z) {
        if (z) {
            OXO1.iOiXi11II(new Function1() { // from class: com.android.mltcode.paycertificationapi.w77
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WxManager.X0i1O((String) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XOXiX0(WxManager wxManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wxManager.XOIX(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XXIIO1i11(WxManager wxManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        wxManager.O1O(function1);
    }

    public static final Unit XXX11i(boolean z) {
        if (z) {
            n77 n77Var = f50956IO;
            if (n77Var == null || !n77Var.OXO1()) {
                OXO1.IO0iXO0O();
            }
            i1O0OXO1O.OXO1.OXO1("WxManager checkLoginStatus 已登");
            OXO1.iIi1();
        } else {
            OXO1.iXiX011(new Function1() { // from class: com.android.mltcode.paycertificationapi.t77
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WxManager.X1IX(((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: renamed from: iI */
    public static final Unit m38151iI(Function1 function1, boolean z) {
        if (z) {
            n77 n77Var = f50956IO;
            if (n77Var == null || !n77Var.OXO1()) {
                OXO1.IO0iXO0O();
            }
            i1O0OXO1O.OXO1.OXO1("WxManager checkLoginStatus 已登");
            OXO1.iIi1();
            if (function1 != null) {
                function1.invoke2(Boolean.TRUE);
            }
        } else {
            i1O0OXO1O.OXO1.OXO1("WxManager checkLoginStatus 未登录");
            n77 n77Var2 = f50956IO;
            if (n77Var2 != null) {
                n77Var2.XOO0ii0();
            }
            OXO1.X00O0();
            if (function1 != null) {
                function1.invoke2(Boolean.FALSE);
            }
        }
        return Unit.OXO1;
    }

    public static /* synthetic */ void iii0(WxManager wxManager, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Utils.getApp().getString(R.string.request_error);
            Intrinsics.O10IXXX0X(str, "getString(...)");
        }
        wxManager.Xi1i0XOX0(str);
    }

    public final boolean I0XXi0X() throws InterruptedException {
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager syncCheckLoginStatus -> " + strIIXi1iiXI);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        i1I11I0i0.XIi00iiXO(null, new WxManager$syncCheckLoginStatus$1(strIIXi1iiXI, booleanRef, null), 1, null);
        return booleanRef.element;
    }

    @tb1
    public final WxProfile IO0II0i() {
        return (WxProfile) new Gson().fromJson(a01.OXO1.m1440iO().getString(WxProfile.class.getName()), WxProfile.class);
    }

    public final void IO0iXO0O() {
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager initWsManager " + strIIXi1iiXI);
        n77 n77Var = f50956IO;
        Application application = null;
        if (n77Var != null) {
            if (n77Var != null) {
                n77Var.XOO0ii0();
            }
            f50956IO = null;
        }
        Application application2 = XO0O10;
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
        n77 n77VarI0IIOi = o00.OIi0(builderNewBuilder.addInterceptor(httpLoggingInterceptor).build()).XXI(true).X1ii(IiiXiI0I() + "?key=" + strIIXi1iiXI).I0iXXO(kotlin.collections.OXO1.m39417I1()).I0IIOi();
        f50956IO = n77VarI0IIOi;
        if (n77VarI0IIOi != null) {
            n77VarI0IIOi.II1Xi0(XiOIO);
        }
        n77 n77Var2 = f50956IO;
        if (n77Var2 != null) {
            n77Var2.mo2514iO();
        }
        iX1O1();
    }

    public final void IOi1O0() {
        AndroidNetworking.upload(iiIOiX()).addMultipartParameter("key", iIXi1iiXI()).setTag((Object) iiIOiX()).setPriority(Priority.HIGH).build().setUploadProgressListener(new UploadProgressListener() { // from class: com.android.mltcode.paycertificationapi.r77
            @Override // com.androidnetworking.interfaces.UploadProgressListener
            public final void onProgress(long j, long j2) {
                WxManager.m38149O1(j, j2);
            }
        }).getAsParsed(TypeToken.getParameterized(WxResponse.class, Object.class), new ParsedRequestListener<WxResponse<Object>>() { // from class: com.sma.smartv3.biz.wx.WxManager$wakeUpLogin$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<Object> response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WxManager wakeUpLogin onResponse -> " + response);
                if (response.getCode() == 200) {
                    WxManager.OXO1.IXiOXO();
                } else {
                    WxManager.XXIIO1i11(WxManager.OXO1, null, 1, null);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager wakeUpLogin onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
            }
        });
    }

    public final void IX0IXOi(@aa1 String authKey) {
        Intrinsics.X0O(authKey, "authKey");
        a01.OXO1.IiI10X().put("WX_AUTH_KEY_" + BleCache.INSTANCE.getMBleAddress(), authKey);
    }

    public final String IXI() {
        return DtbConstants.HTTPS + XXO() + "/api/message/SendVoice";
    }

    public final void IXiOXO() {
        XIIO11I();
        XX0 = XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WxManager$startPollingCheckLoginStatus$1(null), 3, null);
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
        return f50957iO;
    }

    public final String IiiXiI0I() {
        return "wss://" + XXO() + "/wechat/ws/GetSyncMsg";
    }

    public final boolean O0O0X0iOi() {
        n77 n77Var = f50956IO;
        if (n77Var != null) {
            return n77Var.OXO1();
        }
        return false;
    }

    public final void O101() {
        XXI0XOIX();
        OiIIX101O = XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WxManager$startPollingCheckLoginQrcodeStatus$1(null), 3, null);
    }

    public final void O1O(@tb1 final Function1<? super Boolean, Unit> function1) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        n77 n77Var = f50956IO;
        i1o0oxo1o.OXO1("WxManager checkLoginStatus " + (n77Var != null ? Boolean.valueOf(n77Var.OXO1()) : null));
        m38156X1(new Function1() { // from class: com.android.mltcode.paycertificationapi.v77
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WxManager.m38151iI(function1, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: OO */
    public final String m38154OO() {
        return DtbConstants.HTTPS + XXO() + "/wechat/sns/GetSnsSync";
    }

    public final String OX110i() {
        return DtbConstants.HTTPS + XXO() + "/wechat/user/GetProfile";
    }

    /* JADX INFO: renamed from: Oi */
    public final void m38155Oi(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        i1O0OXO1O.OXO1.OXO1("WxManager -> init");
        XO0O10 = app;
        BleConnector.INSTANCE.addHandleCallback(IIX1OXO);
        if (O10IXXX0X == null) {
            try {
                O10IXXX0X = new OpusManager();
            } catch (Exception e) {
                e.printStackTrace();
                i1O0OXO1O.OXO1.OXO1("WxManager -> opus init error！！！");
            }
        }
    }

    public final void X00O0() {
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoginFailedToDevice");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(15, 6, null, null, null, 28, null), false, false, 24, null);
    }

    @aa1
    public final String X00Xi1X(@aa1 Message message) {
        Intrinsics.X0O(message, "message");
        String push_content = message.getPush_content();
        String str = StringsKt__StringsKt.iIi011O(push_content, " : ", false, 2, null) ? (String) StringsKt__StringsKt.i1I(push_content, new String[]{" : "}, false, 0, 6, null).get(1) : "";
        if (TextUtils.isEmpty(str)) {
            str = message.getContent().getStr();
        }
        int msg_type = message.getMsg_type();
        if (msg_type == 3) {
            UtilsKt.XXO(R.string.chat_image);
        } else if (msg_type == 34) {
            UtilsKt.XXO(R.string.chat_voice);
        } else if (msg_type == 42) {
            UtilsKt.XXO(R.string.chat_vcard);
        } else if (msg_type == 43) {
            UtilsKt.XXO(R.string.chat_video);
        } else if (msg_type == 48) {
            UtilsKt.XXO(R.string.chat_location);
        } else if (msg_type == 49) {
            UtilsKt.XXO(R.string.chat_type_unknown);
        }
        if (str.length() <= 100) {
            return str;
        }
        String strSubstring = str.substring(0, 100);
        Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void X0iO() {
        I1XOi1 = false;
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingVerificationUrl -> " + strIIXi1iiXI);
        AndroidNetworking.post(X100O()).addQueryParameter("key", strIIXi1iiXI).setTag((Object) X100O()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, WxLoginQrCode.class), new ParsedRequestListener<WxResponse<Object>>() { // from class: com.sma.smartv3.biz.wx.WxManager$sendLoggingVerificationUrl$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<Object> response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingVerificationUrl onResponse -> " + response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingVerificationUrl onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public final void m38156X1(@tb1 final Function1<? super Boolean, Unit> function1) {
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager getProfile -> " + strIIXi1iiXI);
        AndroidNetworking.get(OX110i()).addQueryParameter("key", strIIXi1iiXI).setTag((Object) OX110i()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, WxProfile.class), new ParsedRequestListener<WxResponse<WxProfile>>() { // from class: com.sma.smartv3.biz.wx.WxManager$getProfile$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<WxProfile> response) {
                Intrinsics.X0O(response, "response");
                LogUtils.m11128d("WxManager getProfile onResponse -> " + response);
                WxProfile data = response.getData();
                if (data != null) {
                    a01.OXO1.m1440iO().put(WxProfile.class.getName(), new Gson().toJson(data));
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                a01.OXO1.m1440iO().remove(WxProfile.class.getName());
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager getProfile onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                a01.OXO1.m1440iO().remove(WxProfile.class.getName());
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        });
    }

    public final String X100O() {
        return DtbConstants.HTTPS + XXO() + "/api/wechat/login/VerifyCodeSlideV2";
    }

    public final void X111IO(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoginQrcodeToDevice -> " + text);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(15, 1, null, null, text, 12, null), false, false, 24, null);
    }

    public final String X11I() {
        return DtbConstants.HTTPS + XXO() + "/api/login/GetLoginQrCodeNew";
    }

    public final void X11iII1O1() {
        m38156X1(new Function1() { // from class: com.android.mltcode.paycertificationapi.s77
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WxManager.XXX11i(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void X1OI(int i, @aa1 String fromUserId, @aa1 String fromUserName, @aa1 String toUserId, @aa1 String toUserName, @aa1 String content, long j) {
        Intrinsics.X0O(fromUserId, "fromUserId");
        Intrinsics.X0O(fromUserName, "fromUserName");
        Intrinsics.X0O(toUserId, "toUserId");
        Intrinsics.X0O(toUserName, "toUserName");
        Intrinsics.X0O(content, "content");
        i1O0OXO1O.OXO1.OXO1("WxManager sendTextMessageToDevice -> " + i + ", f:" + fromUserId + ", f:" + fromUserName + ", t:" + toUserId + ", t:" + toUserName + ", " + content);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_MESSAGE, BleKeyFlag.UPDATE, new BleChatMessage(15, 0, i, fromUserId, fromUserName, toUserId, toUserName, j, content), false, false, 24, null);
    }

    public final void XIIO11I() {
        XiOIO xiOIO = XX0;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        XX0 = null;
    }

    @aa1
    public final File XO0X10iO() {
        return IiI10X;
    }

    public final void XOIX(@tb1 final Function1<? super Boolean, Unit> function1) {
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager getSnsSync -> " + strIIXi1iiXI);
        AndroidNetworking.post(m38154OO()).addQueryParameter("key", strIIXi1iiXI).setTag((Object) m38154OO()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, WxSnsSync.class), new ParsedRequestListener<WxResponse<WxSnsSync>>() { // from class: com.sma.smartv3.biz.wx.WxManager$getSnsSync$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<WxSnsSync> response) {
                Intrinsics.X0O(response, "response");
                LogUtils.m11128d("WxManager getSnsSync onResponse -> " + response);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager getSnsSync onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        });
    }

    public final String XOO0XOOii() {
        return DtbConstants.HTTPS + XXO() + "/api/login/VerifyCode";
    }

    public final String XOX0O0() {
        return DtbConstants.HTTPS + XXO() + "/wechat/login/LogOut";
    }

    public final void XX00i10X() {
        i1O0OXO1O.OXO1.OXO1("WxManager initWx");
        if (q62.OXO1.ii1()) {
            XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WxManager$initWx$1(null), 3, null);
        }
    }

    public final String XX1Oi() {
        return DtbConstants.HTTPS + XXO() + "/wechat/user/GetMyQrCode";
    }

    public final void XXI0XOIX() {
        XiOIO xiOIO = OiIIX101O;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        OiIIX101O = null;
    }

    public final String XXO() {
        i72 i72Var = i72.OXO1;
        return (i72Var.X00XIX1() || i72Var.OiO()) ? X1111.XOO0ii0 : "ai-dev.iot-solution.net";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void XXOXi() {
        i1O0OXO1O.OXO1.OXO1("WxManager -> stopRealTime");
        try {
            PipedInputStream pipedInputStream = XXI;
            if (pipedInputStream != null) {
                pipedInputStream.close();
            }
            PipedOutputStream pipedOutputStream = X1ii;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            XXI = null;
            X1ii = null;
            I0iXXO = null;
            OIX0iXi = false;
        }
    }

    public final synchronized int XXiIiX10() {
        int i;
        i = (XiOIii1 + 1) % 10000;
        XiOIii1 = i;
        return i;
    }

    public final void XXiO0i() {
        Timer timer = new Timer();
        timer.schedule(new OXO1(timer), 500L, 500L);
    }

    public final void Xi1i0XOX0(String str) {
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, new BleVoice(0, 1, 0, null, System.currentTimeMillis(), str, 12, null), false, false, 24, null);
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

    public final void i100IXOX(String str) {
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, new BleVoice(0, 0, 0, null, System.currentTimeMillis(), str, 14, null), false, false, 24, null);
    }

    @aa1
    public final File i11I() {
        return O00;
    }

    public final void iI0I(byte[] bArr) {
        try {
            PipedOutputStream pipedOutputStream = X1ii;
            if (pipedOutputStream != null) {
                pipedOutputStream.write(bArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void iIX0i(@aa1 String toUserName, @aa1 String content) {
        Intrinsics.X0O(toUserName, "toUserName");
        Intrinsics.X0O(content, "content");
        String strIIXi1iiXI = iIXi1iiXI();
        String str = "{  \"MsgItem\": [    {      \"AtWxIDList\": [],      \"ImageContent\": \"\",      \"MsgType\": 0,      \"TextContent\": \"" + content + "\",      \"ToUserName\": \"" + toUserName + "\"    }  ]}";
        i1O0OXO1O.OXO1.OXO1("WxManager sendTextMessage -> " + strIIXi1iiXI + ", " + toUserName + ", " + content);
        if (TextUtils.isEmpty(toUserName)) {
            return;
        }
        ANRequest.PostRequestBuilder postRequestBuilderAddQueryParameter = AndroidNetworking.post(Ii0i()).addQueryParameter("key", strIIXi1iiXI);
        byte[] bytes = str.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        postRequestBuilderAddQueryParameter.addByteBody(bytes).setTag((Object) Ii0i()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, WxSendTextResult[].class), new ParsedRequestListener<WxResponse<WxSendTextResult[]>>() { // from class: com.sma.smartv3.biz.wx.WxManager$sendTextMessage$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<WxSendTextResult[]> response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WxManager sendTextMessage onResponse -> " + response);
                WxSendTextResult[] data = response.getData();
                WxSendTextResult wxSendTextResult = data != null ? (WxSendTextResult) ArraysKt___ArraysKt.IO1i0IiX(data, 0) : null;
                WxManager wxManager = WxManager.OXO1;
                if (wxManager.Ii1iii0().equals(response.getText())) {
                    wxManager.IOi1O0();
                } else {
                    if (wxSendTextResult == null || wxSendTextResult.isSendSuccess()) {
                        return;
                    }
                    WxManager.XXIIO1i11(wxManager, null, 1, null);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager sendTextMessage onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
            }
        });
    }

    @aa1
    public final String iIXi1iiXI() {
        String string = a01.OXO1.IiI10X().getString("WX_AUTH_KEY_" + BleCache.INSTANCE.getMBleAddress());
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }

    public final void iIi0(int i) {
        XiOIii1 = i;
    }

    public final void iIi1() {
        WxUserInfo userInfo;
        WxString nickName;
        String str;
        WxUserInfo userInfo2;
        WxString userName;
        String str2;
        WxProfile wxProfileIO0II0i = IO0II0i();
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoginSuccessToDevice");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.CHAT_APP, BleKeyFlag.UPDATE, new BleChatApp(15, 5, (wxProfileIO0II0i == null || (userInfo2 = wxProfileIO0II0i.getUserInfo()) == null || (userName = userInfo2.getUserName()) == null || (str2 = userName.getStr()) == null) ? "" : str2, (wxProfileIO0II0i == null || (userInfo = wxProfileIO0II0i.getUserInfo()) == null || (nickName = userInfo.getNickName()) == null || (str = nickName.getStr()) == null) ? "" : str, null, 16, null), false, false, 24, null);
    }

    public final void iOI(@tb1 final Function1<? super Boolean, Unit> function1) {
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager logout -> " + strIIXi1iiXI);
        AndroidNetworking.get(XOX0O0()).addQueryParameter("key", strIIXi1iiXI).setTag((Object) XOX0O0()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, String.class), new ParsedRequestListener<WxResponse<String>>() { // from class: com.sma.smartv3.biz.wx.WxManager$logout$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<String> response) {
                Intrinsics.X0O(response, "response");
                LogUtils.m11128d("WxManager logout onResponse -> " + response);
                a01.OXO1.m1440iO().remove(WxProfile.class.getName());
                if (response.getData() != null) {
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager logout onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                a01.OXO1.m1440iO().remove(WxProfile.class.getName());
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        });
        n77 n77Var = f50956IO;
        if (n77Var != null) {
            n77Var.XOO0ii0();
        }
        XiOIO xiOIO = iIiiO;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.sma.smartv3.biz.wx.data.WxLoginQrCodeState] */
    public final WxLoginQrCodeState iOO1ii1() throws InterruptedException {
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus -> " + strIIXi1iiXI);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = WxLoginQrCodeState.NotScanned;
        i1I11I0i0.XIi00iiXO(null, new WxManager$checkLoginQrcodeStatus$1(strIIXi1iiXI, objectRef, null), 1, null);
        return (WxLoginQrCodeState) objectRef.element;
    }

    public final void iOX() {
        if (OIX0iXi) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1("WxManager -> startRealTime");
        ThreadUtils.executeByIo(new XIi00iiXO());
    }

    public final void iOiXi11II(@tb1 final Function1<? super String, Unit> function1) {
        String name;
        String strIIXi1iiXI = iIXi1iiXI();
        SPUtils sPUtilsOXO1 = a01.OXO1.OXO1();
        WeatherRealtime weatherRealtime = (WeatherRealtime) new Gson().fromJson(sPUtilsOXO1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (weatherRealtime == null || (name = weatherRealtime.getName()) == null) {
            name = "";
        }
        i1O0OXO1O.OXO1.OXO1("WxManager getLoginQrCode -> " + strIIXi1iiXI + ", " + name + ", " + X0O);
        ANRequest.PostRequestBuilder postRequestBuilderAddQueryParameter = AndroidNetworking.post(X11I()).addQueryParameter("key", strIIXi1iiXI).addQueryParameter("city", name).addQueryParameter("ipadOrmac", X0O);
        byte[] bytes = "{\"Check\": true,\"Proxy\": \"socks5://root:z567456781@47.115.60.222:7888\"}".getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        postRequestBuilderAddQueryParameter.addByteBody(bytes).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setTag((Object) X11I()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, WxLoginQrCode.class), new ParsedRequestListener<WxResponse<WxLoginQrCode>>() { // from class: com.sma.smartv3.biz.wx.WxManager$getLoginQrCode$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<WxLoginQrCode> response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("WxManager getLoginQrCode onResponse -> " + response);
                WxLoginQrCode data = response.getData();
                if (data == null) {
                    if (response.getCode() == -3) {
                        WxManager.IX1XiI(WxManager.OXO1, null, 1, null);
                        return;
                    }
                    return;
                }
                String qrCodeUrl = data.getQrCodeUrl();
                if (TextUtils.isEmpty(qrCodeUrl)) {
                    Function1<String, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2("");
                        return;
                    }
                    return;
                }
                String queryParameter = Uri.parse(qrCodeUrl).getQueryParameter("url");
                String str = queryParameter != null ? queryParameter : "";
                i1o0oxo1o.OXO1("WxManager getLoginQrCode getLoginQrCode -> " + str);
                Function1<String, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(str);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                Function1<String, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2("");
                }
            }
        });
    }

    public final void iX1O1() {
        XiOIO xiOIO = iIiiO;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        iIiiO = XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WxManager$checkWsManagerConnected$1(null), 3, null);
    }

    public final void iXi(@aa1 String code, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(code, "code");
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingVerificationUrl -> " + strIIXi1iiXI);
        AndroidNetworking.post(XOO0XOOii()).addQueryParameter("key", strIIXi1iiXI).addQueryParameter("code", code).setTag((Object) XOO0XOOii()).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, WxLoginQrCode.class), new ParsedRequestListener<WxResponse<Object>>() { // from class: com.sma.smartv3.biz.wx.WxManager$sendCodeVerificationLogin$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<Object> response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingVerificationUrl onResponse -> " + response);
                if (response.getCode() == 200) {
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                ToastUtils.showLong(response.getText(), new Object[0]);
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager sendLoggingVerificationUrl onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
                ToastUtils.showLong(UtilsKt.XXO(R.string.request_error), new Object[0]);
            }
        });
    }

    public final void iXiX011(@tb1 final Function1<? super Boolean, Unit> function1) {
        i1O0OXO1O.OXO1.OXO1("WxManager getAuthKey");
        AndroidNetworking.post(iiiO()).addQueryParameter("key", "stay33").setTag((Object) iiiO()).setPriority(Priority.HIGH).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).build().getAsParsed(TypeToken.getParameterized(WxResponse.class, String[].class), new ParsedRequestListener<WxResponse<String[]>>() { // from class: com.sma.smartv3.biz.wx.WxManager$getAuthKey$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<String[]> response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WxManager onResponse -> " + response);
                String[] data = response.getData();
                String str = data != null ? (String) ArraysKt___ArraysKt.IO1i0IiX(data, 0) : null;
                if (TextUtils.isEmpty(str)) {
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                WxManager wxManager = WxManager.OXO1;
                Intrinsics.XXI(str);
                wxManager.IX0IXOi(str);
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        });
    }

    public final String iXiiiO() {
        return DtbConstants.HTTPS + XXO() + "/wechat/login/CheckLoginStatus";
    }

    public final void iiII(@aa1 String toUser, @aa1 final File file) {
        Intrinsics.X0O(toUser, "toUser");
        Intrinsics.X0O(file, "file");
        String strIIXi1iiXI = iIXi1iiXI();
        i1O0OXO1O.OXO1.OXO1("WxManager sendVoice -> " + I0IIOi + ", " + strIIXi1iiXI + ", " + toUser + ", " + file);
        if (I0IIOi || !FileUtils.isFileExists(file)) {
            return;
        }
        I0IIOi = true;
        AndroidNetworking.upload(IXI()).addMultipartParameter("key", strIIXi1iiXI).addMultipartParameter("toUser", toUser).addMultipartFile("file", file).setTag((Object) IXI()).setPriority(Priority.HIGH).build().setUploadProgressListener(new UploadProgressListener() { // from class: com.android.mltcode.paycertificationapi.u77
            @Override // com.androidnetworking.interfaces.UploadProgressListener
            public final void onProgress(long j, long j2) {
                WxManager.m38146I0(j, j2);
            }
        }).getAsParsed(TypeToken.getParameterized(WxResponse.class, Object.class), new ParsedRequestListener<WxResponse<Object>>() { // from class: com.sma.smartv3.biz.wx.WxManager$sendVoice$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(WxResponse<Object> response) {
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("WxManager sendVoice onResponse -> " + response);
                WxManager wxManager = WxManager.OXO1;
                WxManager.I0IIOi = false;
                if (wxManager.Ii1iii0().equals(response.getText())) {
                    wxManager.IOi1O0();
                } else if (response.getData() == null) {
                    WxManager.XXIIO1i11(wxManager, null, 1, null);
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("WxManager sendVoice onError -> errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", errorDetail:" + (aNError != null ? aNError.getErrorDetail() : null));
                WxManager wxManager = WxManager.OXO1;
                WxManager.I0IIOi = false;
                FileUtils.delete(file);
            }
        });
    }

    public final String iiIOiX() {
        return DtbConstants.HTTPS + XXO() + "/wechat/login/WakeUpLogin";
    }

    public final String iiiO() {
        return DtbConstants.HTTPS + XXO() + "/wechat/admin/GenAuthKey1";
    }
}
