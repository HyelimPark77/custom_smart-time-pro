package com.sma.smartv3.util;

import android.app.Activity;
import android.view.View;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.wd1;
import com.android.mltcode.paycertificationapi.yb2;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.G5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.OffLineAuthInfo;
import com.sma.smartv3.model.OffLineGenerateFileVo;
import com.sma.smartv3.model.OffLineUserSession;
import com.sma.smartv3.network.GetGomoreAuthKey;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleOptionalMapAuthInfo;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nOffLineMapManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,190:1\n18#2,2:191\n15#2:193\n15#2:224\n18#2,2:225\n15#2:227\n27#2,2:250\n18#2,2:252\n15#2:254\n304#3,11:194\n323#3:223\n312#3,3:228\n323#3:249\n282#3,11:255\n301#3:275\n383#4,18:205\n383#4,18:231\n278#4,8:266\n298#4:274\n*S KotlinDebug\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt\n*L\n45#1:191,2\n45#1:193\n94#1:224\n103#1:225,2\n103#1:227\n133#1:250,2\n154#1:252,2\n154#1:254\n54#1:194,11\n54#1:223\n109#1:228,3\n109#1:249\n160#1:255,11\n160#1:275\n54#1:205,18\n109#1:231,18\n160#1:266,8\n160#1:274\n*E\n"})
public final class OffLineMapManagerKt {

    @aa1
    public static final String OXO1 = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCntVNj2x3Kw/0EndhE8+zOianIG0TdPtMrAwWPRwHLdNsd02lE4KsmkZW/9Ac1uno54vydj7D6/Bb0UAKJ5LaocX6nZ66DtYVKPS2Vr45F0shSnzJTGInk68EwrdWRWmZuNccVkDfntIKCjcbw5ha1lZ9EG66hBrJEJHR0Ru2/kwIDAQAB";

    @aa1
    public static final String XIi00iiXO = "https://map.iipii.net/user/login";

    @aa1
    public static final String iO = "https://map.iipii.net/optionalMap/generateFile";

    public static /* synthetic */ void I0IIOi(double r18, double r20, double r22, double r24, double r26, double r28, Activity r30, View r31, Function1 r32, int r33, Object r34) {
        if ((r33 & 64) == 0) goto L5;
        Activity r15 = null;
    L7:
        if ((r33 & 128) == 0) goto L9;
        View r16 = null;
    L11:
        if ((r33 & 256) == 0) goto L14;
        Function1 r17 = null;
    L15:
        XOO0ii0(r18, r20, r22, r24, r26, r28, r15, r16, r17);
        return;
    L14:
        r17 = r32;
        goto L15
    L9:
        r16 = r31;
        goto L11
    L5:
        r15 = r30;
        goto L7
    }

    public static /* synthetic */ void IO(String r1, String r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "18928414055";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = yb2.OXO1.OXO1("666666", OXO1);
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = null;
    L11:
        OIi0(r1, r2, r3);
    }

    public static final Unit IiI10X(final String r5, final Activity r6, boolean r7) {
        if (r7 == false) goto L8;
        i1O0OXO1O.OXO1.OXO1("getOffLineAuthInfo ->");
        HashMap r8 = new HashMap();
        r8.put(GetGomoreAuthKey.DEVICE_ID, r5);
        r8.put("type", "0001");
        Object r0 = new Gson().fromJson(a01.OXO1.OXO1().getString(OffLineUserSession.class.getName()), OffLineUserSession.class);
        if (r0 != null) goto L6;
        r0 = OffLineUserSession.class.newInstance();
    L6:
        OffLineUserSession r1 = (OffLineUserSession) r0;
        HashMap r2 = new HashMap();
        r2.put("Content-Type", G5.L);
        r2.put("token", r1.getToken());
        r2.put("userId", r1.getUserId());
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        final O1XIiIO<OffLineAuthInfo> r4 = new OffLineMapManagerKt$getOffLineAuthInfo$1$1(r5);
        final uq r9 = r3.loadPopup(r6, null);
        r3.printParam("https://map.iipii.net/auth/getAuthInfo", OXO1.Ii0i(OXO1.Ii0i(OXO1.I1(), r2), r8));
        NetWork r10 = NetWork.OXO1;
        final O1XIiIO<Response<OffLineAuthInfo>> r11 = new OffLineMapManagerKt$getOffLineAuthInfo$lambda$0$$inlined$postParameterThirdParty$default$1(r6, r4, r9);
        AndroidNetworking.post("https://map.iipii.net/auth/getAuthInfo").addHeaders(r2).addBodyParameter(r8).setTag("https://map.iipii.net/auth/getAuthInfo").setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{OffLineAuthInfo.class}), new OffLineMapManagerKt$getOffLineAuthInfo$lambda$0$$inlined$postParameterThirdParty$default$2(r11));
    L8:
        return Unit.OXO1;
    }

    public static /* synthetic */ void O00(String r0, Activity r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L5;
        r1 = null;
    L5:
        XO0O10(r0, r1);
    }

    public static final void OIi0(@aa1 String r6, @aa1 String r7, @tb1 final Function1<? super Boolean, Unit> r8) {
        Intrinsics.X0O(r6, "phone");
        Intrinsics.X0O(r7, "pwd");
        Object r2 = new Gson().fromJson(a01.OXO1.OXO1().getString(OffLineUserSession.class.getName()), OffLineUserSession.class);
        if (r2 != null) goto L6;
        r2 = OffLineUserSession.class.newInstance();
    L6:
        if (((OffLineUserSession) r2).getToken().length() != 0) goto L9;
        i1O0OXO1O.OXO1.OXO1("offLineUserLogin ->");
        HashMap r3 = new HashMap();
        r3.put("pwd", r7);
        r3.put("phone", r6);
        HashMap r9 = new HashMap();
        r9.put("Content-Type", G5.L);
        NetWorkUtils r10 = NetWorkUtils.INSTANCE;
        final O1XIiIO<OffLineUserSession> r0 = new OffLineMapManagerKt$onOffLineUserLogin$1(r8);
        final Activity r11 = null;
        final uq r1 = r10.loadPopup(null, null);
        r10.printParam(XIi00iiXO, OXO1.Ii0i(OXO1.Ii0i(OXO1.I1(), r9), r3));
        NetWork r12 = NetWork.OXO1;
        final O1XIiIO<Response<OffLineUserSession>> r13 = new OffLineMapManagerKt$onOffLineUserLogin$$inlined$postJsonThirdParty$default$1(r11, r0, r1);
        AndroidNetworking.post(XIi00iiXO).addHeaders(r9).addApplicationJsonBody(r3).setTag(XIi00iiXO).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{OffLineUserSession.class}), new OffLineMapManagerKt$onOffLineUserLogin$$inlined$postJsonThirdParty$default$2(r13));
        return;
    L9:
        if (r8 == null) goto L12;
        r8.invoke(Boolean.TRUE);
        return;
    }

    public static /* synthetic */ Unit OXO1(String r0, Activity r1, boolean r2) {
        return IiI10X(r0, r1, r2);
    }

    public static final /* synthetic */ void XIi00iiXO(String r0) {
        iO(r0);
    }

    public static final void XO0O10(@aa1 final String r1, @tb1 final Activity r2) {
        Intrinsics.X0O(r1, "uuid");
        IO(null, null, new wd1(r1, r2), 3, null);
    }

    public static final void XOO0ii0(double r4, double r6, double r8, double r10, double r12, double r14, @tb1 final Activity r16, @tb1 View r17, @tb1 final Function1<? super OffLineGenerateFileVo, Unit> r18) {
        i1O0OXO1O.OXO1.OXO1("offLineGenerateFile ->");
        HashMap r2 = new HashMap();
        r2.put("minLongitude", Double.valueOf(r4));
        r2.put("minLatitude", Double.valueOf(r6));
        r2.put("maxLongitude", Double.valueOf(r8));
        r2.put("maxLatitude", Double.valueOf(r10));
        a01 r5 = a01.OXO1;
        BleOptionalMapAuthInfo r7 = (BleOptionalMapAuthInfo) new Gson().fromJson(r5.iO().getString(BleOptionalMapAuthInfo.class.getName()), BleOptionalMapAuthInfo.class);
        r2.put("type", 1);
        if (r7 == null) goto L6;
        String r9 = r7.getMUuid();
        if (r9 == null) goto L6;
    L7:
        r2.put("deviceUuid", r9);
        BleCache r11 = BleCache.INSTANCE;
        r2.put("manufacturer", r11.getMPlatform());
        r2.put("model", r11.getMPrototype());
        r2.put("reservedStorage", 0);
        r2.put("locationLat", Double.valueOf(r14));
        r2.put("locationLon", Double.valueOf(r12));
        Object r13 = new Gson().fromJson(r5.OXO1().getString(OffLineUserSession.class.getName()), OffLineUserSession.class);
        if (r13 != null) goto L10;
        r13 = OffLineUserSession.class.newInstance();
    L10:
        OffLineUserSession r15 = (OffLineUserSession) r13;
        HashMap r19 = new HashMap();
        r19.put("Content-Type", G5.L);
        r19.put("token", r15.getToken());
        r19.put("userId", r15.getUserId());
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        final O1XIiIO<OffLineGenerateFileVo> r21 = new OffLineMapManagerKt$getOffLineGenerateFile$1(r18);
        final uq r22 = r20.loadPopup(r16, r17);
        r20.printParam(iO, OXO1.Ii0i(OXO1.Ii0i(OXO1.I1(), r19), r2));
        NetWork r23 = NetWork.OXO1;
        final O1XIiIO<Response<OffLineGenerateFileVo>> r24 = new OffLineMapManagerKt$getOffLineGenerateFile$$inlined$postJsonThirdParty$1(r16, r21, r22);
        AndroidNetworking.post(iO).addHeaders(r19).addApplicationJsonBody(r2).setTag(iO).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{OffLineGenerateFileVo.class}), new OffLineMapManagerKt$getOffLineGenerateFile$$inlined$postJsonThirdParty$2(r24));
        return;
    L6:
        r9 = "";
        goto L7
    }

    public static final void iO(String r7) {
        if (StringsKt__StringsKt.OO1101010(r7, "非法请求", 0, false, 6, null) <= (-1)) goto L7;
        a01.OXO1.OXO1().remove(OffLineUserSession.class.getName());
        ToastUtils.showLong(R.string.request_error);
        return;
    L7:
        if (StringsKt__StringsKt.OO1101010(r7, "12002", 0, false, 6, null) <= (-1)) goto L10;
        ToastUtils.showLong(R.string.map_request_error);
        return;
    L10:
        ToastUtils.showLong(r7, new Object[0]);
    }
}
