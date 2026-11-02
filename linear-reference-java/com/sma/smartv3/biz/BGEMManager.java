package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.BGEMMeasurementData;
import com.sma.smartv3.model.BGEMRangeAnalysisResult;
import com.sma.smartv3.model.BGEMResponse;
import com.sma.smartv3.model.BGEMUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BGEMAnalysis;
import com.sma.smartv3.network.BGEMUserAuthorise;
import com.sma.smartv3.network.BGEMUserUpdate;
import com.sma.smartv3.network.BGEMeasurementByDate;
import com.sma.smartv3.network.BGEMeasurementById;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nBGEMManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BGEMManager.kt\ncom/sma/smartv3/biz/BGEMManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,158:1\n19#2:159\n15#2:160\n19#2:184\n15#2:185\n235#3,11:161\n246#3:173\n256#3:183\n235#3,11:186\n246#3:198\n256#3:208\n349#3,12:209\n371#3:239\n153#3,11:240\n164#3:252\n174#3:262\n153#3,11:263\n164#3:275\n174#3:285\n1#4:172\n1#4:197\n1#4:251\n1#4:274\n278#5,8:174\n298#5:182\n278#5,8:199\n298#5:207\n383#5,18:221\n226#5,8:253\n245#5:261\n226#5,8:276\n245#5:284\n*S KotlinDebug\n*F\n+ 1 BGEMManager.kt\ncom/sma/smartv3/biz/BGEMManager\n*L\n32#1:159\n32#1:160\n55#1:184\n55#1:185\n33#1:161,11\n33#1:173\n33#1:183\n56#1:186,11\n56#1:198\n56#1:208\n82#1:209,12\n82#1:239\n117#1:240,11\n117#1:252\n117#1:262\n142#1:263,11\n142#1:275\n142#1:285\n33#1:172\n56#1:197\n117#1:251\n142#1:274\n33#1:174,8\n33#1:182\n56#1:199,8\n56#1:207\n82#1:221,18\n117#1:253,8\n117#1:261\n142#1:276,8\n142#1:284\n*E\n"})
public final class BGEMManager {

    @aa1
    public static final BGEMManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = "BGEMManager";

    static {
        OXO1 = new BGEMManager();
    }

    public BGEMManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0IIOi(BGEMManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.XOO0ii0(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IO(BGEMManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.OIi0(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IiI10X(BGEMManager r0, String r1, O1XIiIO r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.O00(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XIi00iiXO(BGEMManager r0, Object r1, O1XIiIO r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.OXO1(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XO0O10(BGEMManager r0, String r1, String r2, O1XIiIO r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.iO(r1, r2, r3);
    }

    public final void O00(@aa1 String r10, @tb1 final O1XIiIO<BGEMRangeAnalysisResult> r11) {
        Intrinsics.X0O(r10, "measurementId");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r12 = BGEMeasurementById.INSTANCE.getURL(r10);
        Map<String, String> r1 = kotlin.collections.OXO1.I1();
        final O1XIiIO<BGEMRangeAnalysisResult> r2 = new BGEMManager$measurementById$1(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r12);
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r1);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r5 + r12, r7);
        NetWork r6 = NetWork.OXO1;
        String r14 = r5 + r12;
        final O1XIiIO<Response<BGEMRangeAnalysisResult>> r9 = new BGEMManager$measurementById$$inlined$getV2$default$1(r3, r2, r4);
        AndroidNetworking.get(r14).addQueryParameter(r1).setTag(r14).addHeaders(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{BGEMRangeAnalysisResult.class}), new BGEMManager$measurementById$$inlined$getV2$default$2(r9));
    }

    public final void OIi0(@tb1 final Function1<? super Boolean, Unit> r32) {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r4 = RequestBodyKt.getBGEMUserBody(BGEMUser.Companion.of((AppUser) r1));
        final O1XIiIO<BGEMUser> r5 = new BGEMManager$userUpdate$1(r32);
        Map<String, String> r6 = r3.getHeadersMap();
        final Activity r7 = null;
        final uq r8 = r3.loadPopup(null, null);
        String r9 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BGEMUserUpdate.URL);
        String r10 = r9 + BGEMUserUpdate.URL;
        Map<String, ? extends Object> r11 = kotlin.collections.OXO1.X111IO(r4);
        r11.putAll(r6);
        Unit r12 = Unit.OXO1;
        r3.printParam(r10, r11);
        NetWork r13 = NetWork.OXO1;
        String r14 = r9 + BGEMUserUpdate.URL;
        final O1XIiIO<Response<BGEMUser>> r15 = new BGEMManager$userUpdate$$inlined$postV2$default$1(r7, r5, r8);
        AndroidNetworking.post(r14).addHeaders(r6).addBodyParameter(r4).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{BGEMUser.class}), new BGEMManager$userUpdate$$inlined$postV2$default$2(r15));
    }

    public final void OXO1(@aa1 Object r8, @tb1 final O1XIiIO<BGEMResponse<BGEMMeasurementData>> r9) {
        Intrinsics.X0O(r8, "measurementData");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        final O1XIiIO<JsonObject> r1 = new BGEMManager$analysis$1(r9);
        Map<String, String> r10 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BGEMAnalysis.URL);
        r0.printParam(r4 + BGEMAnalysis.URL, r10);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + BGEMAnalysis.URL;
        final O1XIiIO<Response<JsonObject>> r7 = new BGEMManager$analysis$$inlined$postJsonV2$default$1(r2, r1, r3);
        AndroidNetworking.post(r6).addHeaders(r10).addApplicationJsonBody(r8).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{JsonObject.class}), new BGEMManager$analysis$$inlined$postJsonV2$default$2(r7));
    }

    public final void XOO0ii0(@tb1 final Function1<? super Boolean, Unit> r32) {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r4 = RequestBodyKt.getBGEMUserBody(BGEMUser.Companion.of((AppUser) r1));
        final O1XIiIO<BGEMUser> r5 = new BGEMManager$userAuthorise$1(r32);
        Map<String, String> r6 = r3.getHeadersMap();
        final Activity r7 = null;
        final uq r8 = r3.loadPopup(null, null);
        String r9 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BGEMUserAuthorise.URL);
        String r10 = r9 + BGEMUserAuthorise.URL;
        Map<String, ? extends Object> r11 = kotlin.collections.OXO1.X111IO(r4);
        r11.putAll(r6);
        Unit r12 = Unit.OXO1;
        r3.printParam(r10, r11);
        NetWork r13 = NetWork.OXO1;
        String r14 = r9 + BGEMUserAuthorise.URL;
        final O1XIiIO<Response<BGEMUser>> r15 = new BGEMManager$userAuthorise$$inlined$postV2$default$1(r7, r5, r8);
        AndroidNetworking.post(r14).addHeaders(r6).addBodyParameter(r4).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{BGEMUser.class}), new BGEMManager$userAuthorise$$inlined$postV2$default$2(r15));
    }

    public final void iO(@aa1 String r9, @aa1 String r10, @tb1 final O1XIiIO<BGEMRangeAnalysisResult[]> r11) {
        Intrinsics.X0O(r9, "startDate");
        Intrinsics.X0O(r10, "endDate");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r12 = BGEMeasurementByDate.INSTANCE.getURL(r9, r10);
        Map<String, String> r13 = kotlin.collections.OXO1.I1();
        final O1XIiIO<BGEMRangeAnalysisResult[]> r1 = new BGEMManager$measurementByDate$1(r11);
        Map<String, String> r14 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r12);
        Map<String, ? extends Object> r6 = kotlin.collections.OXO1.X111IO(r13);
        r6.putAll(r14);
        Unit r7 = Unit.OXO1;
        r0.printParam(r4 + r12, r6);
        NetWork r5 = NetWork.OXO1;
        String r15 = r4 + r12;
        final O1XIiIO<Response<BGEMRangeAnalysisResult[]>> r8 = new BGEMManager$measurementByDate$$inlined$getV2$default$1(r2, r1, r3);
        AndroidNetworking.get(r15).addQueryParameter(r13).setTag(r15).addHeaders(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{BGEMRangeAnalysisResult[].class}), new BGEMManager$measurementByDate$$inlined$getV2$default$2(r8));
    }
}
