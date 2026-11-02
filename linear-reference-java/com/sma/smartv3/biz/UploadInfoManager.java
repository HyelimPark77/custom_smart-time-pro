package com.sma.smartv3.biz;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.ns;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.GetWeatherForecast;
import com.sma.smartv3.network.GetWeatherRealtime;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.network.UploadNoLoginUserInfo;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nUploadInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadInfoManager.kt\ncom/sma/smartv3/biz/UploadInfoManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,252:1\n90#2:253\n19#2:254\n15#2:255\n90#2:256\n19#2:313\n15#2:314\n90#2:315\n90#2:376\n848#3,30:257\n878#3,3:288\n891#3,4:300\n905#3:312\n99#3,16:316\n123#3:355\n176#3,11:356\n196#3:375\n1#4:287\n226#5,8:291\n245#5:299\n252#5,7:304\n270#5:311\n116#5,23:332\n252#5,7:367\n270#5:374\n*S KotlinDebug\n*F\n+ 1 UploadInfoManager.kt\ncom/sma/smartv3/biz/UploadInfoManager\n*L\n64#1:253\n68#1:254\n68#1:255\n71#1:256\n156#1:313\n156#1:314\n159#1:315\n243#1:376\n123#1:257,30\n123#1:288,3\n123#1:300,4\n123#1:312\n184#1:316,16\n184#1:355\n211#1:356,11\n211#1:375\n123#1:287\n123#1:291,8\n123#1:299\n123#1:304,7\n123#1:311\n184#1:332,23\n211#1:367,7\n211#1:374\n*E\n"})
public final class UploadInfoManager {

    @aa1
    public static final UploadInfoManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = null;

    @tb1
    public static ms iO;

    static {
        OXO1 = new UploadInfoManager();
        XIi00iiXO = "UploadInfoManager";
    }

    public UploadInfoManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OIX0iXi(UploadInfoManager r0, AppUser r1, O1XIiIO r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.IO(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OIi0(UploadInfoManager r0, AppUser r1, O1XIiIO r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.I0IIOi(r1, r2);
    }

    public static final /* synthetic */ void OXO1(UploadInfoManager r0) {
        r0.IiI10X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iO(UploadInfoManager r6, double r7, double r9, O1XIiIO r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        r11 = null;
    L5:
        r6.XIi00iiXO(r7, r9, r11);
    }

    public final void I0IIOi(@aa1 AppUser r6, @tb1 final O1XIiIO<String> r7) {
        Intrinsics.X0O(r6, "appUser");
        if (r6.getHeight() == 0.0f) goto L5;
    L8:
        O00(r6);
        LogUtils.d(new Object[]{XIi00iiXO + " uploadLoginUserInfo -> " + r6});
        final Activity r0 = null;
        r6.setThirdPlatform(null);
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        File r2 = uz0.I0IIOi(sz0.OXO1);
        final O1XIiIO<AppUser> r3 = new UploadInfoManager$uploadLoginUserInfo$1(r7);
        final uq r8 = r1.loadPopup(null, null);
        NetWork r4 = NetWork.OXO1;
        String r5 = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> r9 = new UploadInfoManager$uploadLoginUserInfo$$inlined$upload$default$1(r0, r3, r8);
        ANRequest.MultiPartBuilder r10 = AndroidNetworking.upload(r5);
        if (r2.exists() == false) goto L11;
        r10.addMultipartFile("avatar", r2);
    L11:
        r10.addMultipartParameter(r6).setTag(r5).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new UploadInfoManager$uploadLoginUserInfo$$inlined$upload$default$2(r9));
        return;
    L5:
        if (r6.getWeight() != 0.0f) goto L8;
        ToastUtils.showLong(R.string.user_does_not_exist);
    }

    public final void I0iXXO() {
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.OXO1();
        WeatherRealtime r2 = (WeatherRealtime) new Gson().fromJson(r1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        String r3 = XIi00iiXO;
        LogUtils.d(new Object[]{r3 + " uploadPhoneInfo weather -> " + r2});
        SPUtils r4 = r0.IiI10X();
        Object r5 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r6 = new Gson().fromJson(r4.getString(AppUser.class.getName()), AppUser.class);
        if (r6 == null) goto L6;
        r5 = r6;
    L6:
        AppUser r7 = (AppUser) r5;
        if (r7.getIdentity().length() != 0) goto L14;
        SPUtils r8 = r0.OXO1();
        AppUser r9 = (AppUser) new Gson().fromJson(r8.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
        if (r9 == null) goto L12;
        boolean r10 = true;
        r7 = r9;
    L15:
        LogUtils.d(new Object[]{r3 + " uploadPhoneInfo appUser -> " + r10 + " " + r7});
        if (r2 != null) goto L27;
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == true) goto L20;
        return;
    L20:
        if (iO != null) goto L22;
        iO = ns.XIi00iiXO(new UploadInfoManager$uploadPhoneInfo$1(), false, 2, null);
    L22:
        LogUtils.d(new Object[]{r3 + " startLocation"});
        ms r11 = iO;
        if (r11 == null) goto L33;
        r11.IiI10X(R.string.get_weather_and_phone_get_location_desc, false);
        return;
    L33:
        return;
    L27:
        if (TextUtils.isEmpty(r2.getName()) == false) goto L29;
        return;
    L29:
        if (Intrinsics.XOO0ii0(r2.getName(), r7.getCity()) == true) goto L35;
        XOO0ii0();
        return;
    L35:
        return;
    L12:
        OIX0iXi(this, r7, null, 2, null);
        return;
    L14:
        r10 = false;
        goto L15
    }

    public final void IO(@aa1 AppUser r7, @tb1 final O1XIiIO<String> r8) {
        Intrinsics.X0O(r7, "appUser");
        O00(r7);
        r7.setServer(-1);
        LogUtils.d(new Object[]{XIi00iiXO + " uploadNoLoginUserInfo -> " + r7});
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getUploadNoLoginUserInfo(r7);
        final O1XIiIO<AppUser> r1 = new UploadInfoManager$uploadNoLoginUserInfo$1(r8);
        final Activity r10 = null;
        final uq r2 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UploadNoLoginUserInfo.URL);
        r0.printParam(r3 + UploadNoLoginUserInfo.URL, r9);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + UploadNoLoginUserInfo.URL;
        final O1XIiIO<Response<AppUser>> r6 = new UploadInfoManager$uploadNoLoginUserInfo$$inlined$post$default$1(r10, r1, r2);
        AndroidNetworking.post(r5).addBodyParameter(r9).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new UploadInfoManager$uploadNoLoginUserInfo$$inlined$post$default$2(r6));
    }

    public final void IiI10X() {
        ms r0 = iO;
        if (r0 == null) goto L6;
        r0.I0IIOi();
        return;
    }

    public final void O00(@aa1 AppUser r6) {
        Intrinsics.X0O(r6, "appUser");
        r6.setServer(UtilsKt.iIXi1iiXI());
        r6.setProjectId(58);
        r6.setOsVersion(UtilsKt.X11iII1O1());
        r6.setPhoneModel(UtilsKt.XXX11i());
        r6.setPhoneIdentity(UtilsKt.XX1Oi());
        if (TextUtils.isEmpty(r6.getCountry()) == false) goto L5;
        Application r0 = Utils.getApp();
        Intrinsics.O10IXXX0X(r0, "getApp(...)");
        r6.setCountry(UtilsKt.iiiO(r0));
    L5:
        SPUtils r1 = a01.OXO1.OXO1();
        WeatherRealtime r2 = (WeatherRealtime) new Gson().fromJson(r1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (r2 == null) goto L12;
        r6.setCountry(r2.getSys_country());
        if (TextUtils.isEmpty(r2.getName()) == true) goto L10;
        r6.setCity(r2.getName());
    L10:
        r6.setLongitude(r2.getLon());
        r6.setLatitude(r2.getLat());
        return;
    }

    public final void XIi00iiXO(double r19, double r21, @tb1 final O1XIiIO<WeatherRealtime> r23) {
        LogUtils.d(new Object[]{XIi00iiXO + " getCity -> " + r19 + ", " + r21});
        NetWorkUtils r4 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r5 = RequestBodyKt.getWeatherRealtimeBody(r19, r21);
        final O1XIiIO<WeatherRealtime> r6 = new UploadInfoManager$getCity$1(r23);
        Map<String, String> r7 = r4.getHeadersMap();
        final uq r9 = r4.loadPopup(null, null);
        String r10 = r4.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWeatherRealtime.URL);
        i72 r12 = i72.OXO1;
        if (r12.II1Xi0() == true) goto L5;
        r4.printParam(r10 + GetWeatherRealtime.URL, kotlin.collections.OXO1.Ii0i(r5, r7));
        i1O0OXO1O.OXO1.OXO1(OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + r12.II1Xi0());
        NetWork r0 = NetWork.OXO1;
        String r1 = r10 + GetWeatherRealtime.URL;
        final Activity r2 = null;
        final O1XIiIO<Response<WeatherRealtime>> r3 = new UploadInfoManager$getCity$$inlined$getNewApiWeather$default$3(r2, r6, r9);
        AndroidNetworking.post(r1).addBodyParameter(r5).setTag(r1).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WeatherRealtime.class}), new UploadInfoManager$getCity$$inlined$getNewApiWeather$default$4(r3));
        return;
    L5:
        if (oe5.XIIIO(GetWeatherRealtime.URL, GetWeatherRealtime.URL, true) == false) goto L8;
        String r13 = GetWeatherRealtime.URL_V2;
    L11:
        Map<String, String> r14 = kotlin.collections.OXO1.X111IO(r5);
    L17:
        Type r20 = WeatherRealtime.class;
    L22:
        String r8 = r10 + GetWeatherRealtime.URL;
        Map<String, ? extends Object> r11 = kotlin.collections.OXO1.X111IO(r5);
        r11.putAll(r7);
        Unit r15 = Unit.OXO1;
        r4.printParam(r8, r11);
        i1O0OXO1O.OXO1.OXO1(OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork r16 = NetWork.OXO1;
        String r17 = r10 + r13;
        final Activity r18 = null;
        final O1XIiIO<Response<WeatherRealtime>> r22 = new UploadInfoManager$getCity$$inlined$getNewApiWeather$default$1(r18, r6, r9);
        AndroidNetworking.get(r17).addQueryParameter(r14).setTag(r17).addHeaders(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{r20}), new UploadInfoManager$getCity$$inlined$getNewApiWeather$default$2(r22));
        return;
    L13:
        if (r14.containsKey("lat") == false) goto L18;
        String r110 = r14.get("lat");     // Catch: Exception -> L17
        Intrinsics.XXI(r110);     // Catch: Exception -> L17
        r20 = WeatherRealtime.class;
        r14.put("lat", new BigDecimal(r110).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L26
    L20:
        if (r14.containsKey("lon") == false) goto L22;
        String r24 = r14.get("lon");     // Catch: Exception -> L26
        Intrinsics.XXI(r24);     // Catch: Exception -> L26
        r14.put("lon", new BigDecimal(r24).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L26
        goto L22
    L18:
        r20 = WeatherRealtime.class;
        goto L20
    L8:
        if (oe5.XIIIO(GetWeatherRealtime.URL, GetWeatherForecast.URL, true) == false) goto L10;
        r13 = GetWeatherForecast.URL_V2;
        goto L11
    L10:
        r13 = GetWeatherRealtime.URL;
        goto L11
    }

    @aa1
    public final String XO0O10() {
        return XIi00iiXO;
    }

    public final void XOO0ii0() {
        if (BleConnector.INSTANCE.isBound() == false) goto L6;
        RequestCommonMethod.INSTANCE.updateDeviceInfo(new UploadInfoManager$uploadInfo$1());
        return;
    L6:
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L11;
        r3 = r4;
    L11:
        if (((AppUser) r3).getIdentity().length() != 0) goto L15;
        SPUtils r5 = r1.OXO1();
        AppUser r6 = (AppUser) new Gson().fromJson(r5.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
        if (r6 == null) goto L15;
        boolean r7 = true;
        r3 = r6;
    L17:
        if (r7 == false) goto L20;
        OIX0iXi(this, (AppUser) r3, null, 2, null);
        return;
    L20:
        OIi0(this, (AppUser) r3, null, 2, null);
        return;
    L15:
        r7 = false;
        goto L17
    }
}
