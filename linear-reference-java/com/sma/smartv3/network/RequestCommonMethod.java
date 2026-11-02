package com.sma.smartv3.network;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.UploadInfoManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.BleDevice;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nRequestCommonMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCommonMethod.kt\ncom/sma/smartv3/network/RequestCommonMethod\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,133:1\n183#2,4:134\n196#2:146\n176#2,11:150\n196#2:169\n176#2,11:173\n196#2:192\n252#3,7:138\n270#3:145\n252#3,7:161\n270#3:168\n252#3,7:184\n270#3:191\n19#4:147\n15#4:148\n90#4:149\n18#4,2:170\n15#4:172\n*S KotlinDebug\n*F\n+ 1 RequestCommonMethod.kt\ncom/sma/smartv3/network/RequestCommonMethod\n*L\n56#1:134,4\n56#1:146\n100#1:150,11\n100#1:169\n130#1:173,11\n130#1:192\n56#1:138,7\n56#1:145\n100#1:161,7\n100#1:168\n130#1:184,7\n130#1:191\n77#1:147\n77#1:148\n80#1:149\n115#1:170,2\n115#1:172\n*E\n"})
public final class RequestCommonMethod {

    @aa1
    public static final RequestCommonMethod INSTANCE = null;

    static {
        INSTANCE = new RequestCommonMethod();
    }

    private RequestCommonMethod() {
    }

    public static /* synthetic */ String getPhoneWithCode$default(RequestCommonMethod r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "+86";
    L6:
        return r0.getPhoneWithCode(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestVerificationCode$default(RequestCommonMethod r7, Activity r8, View r9, String r10, TextView r11, int r12, O1XIiIO r13, int r14, Object r15) {
        if ((r14 & 16) == 0) goto L5;
        r12 = 0;
    L5:
        int r5 = r12;
        if ((r14 & 32) == 0) goto L8;
        r13 = null;
    L8:
        r7.requestVerificationCode(r8, r9, r10, r11, r5, r13);
    }

    @aa1
    public final String getPhoneWithCode(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "code");
        Intrinsics.X0O(r3, "text");
        return r2 + HelpFormatter.DEFAULT_OPT_PREFIX + r3;
    }

    public final void requestVerificationCode(@aa1 final Activity r6, @tb1 View r7, @aa1 String r8, @aa1 final TextView r9, int r10, @tb1 final O1XIiIO<String> r11) {
        Intrinsics.X0O(r6, "context");
        Intrinsics.X0O(r8, "text");
        Intrinsics.X0O(r9, "showCountDownTimeView");
        if (StringsKt__StringsKt.iIi011O(r8, "@", false, 2, null) == true) goto L13;
        if (r8.length() == 0) goto L13;
        if (UtilsKt.IXOIIIO(r8) == true) goto L11;
        ToastUtils.showShort(R.string.input_phone_format_error);
        return;
    L11:
        r8 = getPhoneWithCode$default(this, null, r8, 1, null);
    L16:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getVerificationCodeBody(r8, r10);
        final O1XIiIO<String> r13 = new AnonymousClass1(r6, r9, r11);
        final uq r14 = r1.loadPopup(r6, r7);
        String r15 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), VerificationCodeRequest.URL);
        r1.printParam(r15 + VerificationCodeRequest.URL, r12);
        NetWork r2 = NetWork.OXO1;
        String r16 = r15 + VerificationCodeRequest.URL;
        final O1XIiIO<Response<String>> r17 = new RequestCommonMethod$requestVerificationCode$$inlined$post$1(r6, r13, r14);
        AndroidNetworking.post(r16).addBodyParameter(r12).setTag(r16).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new RequestCommonMethod$requestVerificationCode$$inlined$post$2(r17));
        return;
    L13:
        if (RegexUtils.isEmail(r8) == true) goto L16;
        ToastUtils.showShort(R.string.email_format_error);
    }

    public final void updateDeviceInfo(@aa1 final O1XIiIO<String> r43) {
        Intrinsics.X0O(r43, "callback");
        final Activity r9 = null;
        if (i72.OXO1.X00110X() == false) goto L20;
        a01 r3 = a01.OXO1;
        SPUtils r11 = r3.IiI10X();
        Object r12 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r13 = new Gson().fromJson(r11.getString(AppUser.class.getName()), AppUser.class);
        if (r13 == null) goto L9;
        r12 = r13;
    L9:
        if (((AppUser) r12).getIdentity().length() != 0) goto L13;
        SPUtils r4 = r3.OXO1();
        AppUser r5 = (AppUser) new Gson().fromJson(r4.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
        if (r5 == null) goto L13;
        r12 = r5;
        boolean r6 = true;
    L14:
        BleDevice r10 = OOiOOO1OI.OXO1.OXO1();
        HashMap r14 = new HashMap();
        AppUser r15 = (AppUser) r12;
        r14.put("identity", r15.getIdentity());
        r14.put("projectId", RequestBodyKt.PROJECT_ID);
        r14.put("bleName", r10.getName());
        r14.put("macAddress", oe5.IXO0OOi(r10.getAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r14.put("platform", String.valueOf(UtilsKt.X1IX()));
        r14.put("devicePrototype", r10.getPrototype());
        r14.put("flag", r10.getFirmwareFlag());
        r14.put("firmwareVersion", r10.getVersion());
        r14.put("uiVersion", BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.UI_PACK_VERSION, null, null, 6, null));
        r14.put("fontVersion", "0.0.1");
        NetWorkUtils r7 = NetWorkUtils.INSTANCE;
        final O1XIiIO<String> r8 = new AnonymousClass2();
        final uq r16 = r7.loadPopup(null, null);
        String r17 = r7.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UpdateDevice2.URL);
        r7.printParam(r17 + UpdateDevice2.URL, r14);
        NetWork r18 = NetWork.OXO1;
        String r19 = r17 + UpdateDevice2.URL;
        final O1XIiIO<Response<String>> r110 = new RequestCommonMethod$updateDeviceInfo$$inlined$post$default$1(r9, r8, r16);
        AndroidNetworking.post(r19).addBodyParameter(r14).setTag(r19).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new RequestCommonMethod$updateDeviceInfo$$inlined$post$default$2(r110));
        r15.setSettings(r10.getSettings());
        if (r6 == false) goto L18;
        UploadInfoManager.OXO1.IO(r15, r43);
        return;
    L18:
        UploadInfoManager.OXO1.I0IIOi(r15, r43);
        return;
    L13:
        r6 = false;
        goto L14
    L20:
        Object r20 = new Gson().fromJson(a01.OXO1.IiI10X().getString(AppUser.class.getName()), AppUser.class);
        if (r20 != null) goto L23;
        r20 = AppUser.class.newInstance();
    L23:
        AppUser r21 = (AppUser) r20;
        BleDevice r111 = OOiOOO1OI.OXO1.OXO1();
        HashMap r112 = new HashMap();
        r112.put("identity", r21.getIdentity());
        r112.put("projectId", String.valueOf(r21.getProjectId()));
        r112.put("name", r111.getName());
        r112.put("address", r111.getAddress());
        r112.put("platform", r111.getPlatform());
        r112.put("prototype", r111.getPrototype());
        r112.put("firmwareFlag", r111.getFirmwareFlag());
        r112.put("agpsType", String.valueOf(r111.getAgpsType()));
        r112.put("version", r111.getVersion());
        r112.put("extraInfo", r111.getExtraInfo());
        r112.put("settings", r111.getSettings());
        NetWorkUtils r22 = NetWorkUtils.INSTANCE;
        final uq r23 = r22.loadPopup(null, null);
        String r24 = r22.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UpdateDevice.URL);
        r22.printParam(r24 + UpdateDevice.URL, r112);
        NetWork r25 = NetWork.OXO1;
        String r26 = r24 + UpdateDevice.URL;
        final O1XIiIO<Response<String>> r27 = new RequestCommonMethod$updateDeviceInfo$$inlined$post$default$3(r9, r43, r23);
        AndroidNetworking.post(r26).addBodyParameter(r112).setTag(r26).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new RequestCommonMethod$updateDeviceInfo$$inlined$post$default$4(r27));
    }
}
