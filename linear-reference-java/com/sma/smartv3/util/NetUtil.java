package com.sma.smartv3.util;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.dto.ThirdPartyDeviceData;
import com.sma.smartv3.model.AITranslatorText;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.ToTranslatorText;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.model.ThirdPartyDeviceFilterData;
import com.sma.smartv3.util.net.NetResult;
import com.sma.smartv3.util.websocket.data.TranslateOrderEntity;
import com.sma.smartv3.util.websocket.data.TranslationTime;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n19#2:165\n15#2:166\n176#3,11:167\n196#3:186\n235#3,11:187\n246#3:199\n256#3:209\n252#4,7:178\n270#4:185\n278#4,8:200\n298#4:208\n1#5:198\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil\n*L\n57#1:165\n57#1:166\n68#1:167,11\n68#1:186\n92#1:187,11\n92#1:199\n92#1:209\n68#1:178,7\n68#1:185\n92#1:200,8\n92#1:208\n92#1:198\n*E\n"})
public final class NetUtil {

    @aa1
    public static final NetUtil OXO1 = null;

    static {
        OXO1 = new NetUtil();
    }

    public NetUtil() {
    }

    @tb1
    public final Object IiI10X(@aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 Continuation<? super NetResult<AITranslatorText>> r13) {
        final SafeContinuation r0 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(r13));
        HashMap r14 = OXO1.XXX11i(new Pair[]{TuplesKt.OXO1(ToTranslatorText.FLAG_TEXT_FORM, r10), TuplesKt.OXO1(ToTranslatorText.FLAG_TRANSLATION_LANGUAGE, r12), TuplesKt.OXO1(ToTranslatorText.FLAG_ORIGINAL_LANGUAGE, r11), TuplesKt.OXO1("source", "microsoft")});
        NetWorkUtils r15 = NetWorkUtils.INSTANCE;
        final O1XIiIO<AITranslatorText> r16 = new NetUtil$getTransText$2$1(r0);
        Map<String, String> r1 = r15.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r15.loadPopup(null, null);
        String r4 = r15.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ToTranslatorText.URL);
        String r6 = r4 + ToTranslatorText.URL;
        Map<String, ? extends Object> r7 = OXO1.X111IO(r14);
        r7.putAll(r1);
        Unit r8 = Unit.OXO1;
        r15.printParam(r6, r7);
        NetWork r17 = NetWork.OXO1;
        String r18 = r4 + ToTranslatorText.URL;
        final O1XIiIO<Response<AITranslatorText>> r5 = new NetUtil$getTransText$lambda$0$$inlined$postV2$default$1(r2, r16, r3);
        AndroidNetworking.post(r18).addHeaders(r1).addBodyParameter(r14).setTag(r18).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AITranslatorText.class}), new NetUtil$getTransText$lambda$0$$inlined$postV2$default$2(r5));
        Object r19 = r0.XIi00iiXO();
        if (r19 != pb.I0iXXO()) goto L5;
        DebugProbesKt.iO(r13);
    L5:
        return r19;
    }

    @tb1
    public final Object O00(int r33, int r34, @aa1 Continuation<? super NetResult<TranslateOrderEntity>> r35) {
        final SafeContinuation r0 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(r35));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        AppUser r4 = (AppUser) r2;
        if (r4.getIdentity().length() != 0) goto L9;
        Result.Companion r5 = Result.Companion;
        r0.resumeWith(Result.m6974constructorimpl(new NetResult.OXO1(UtilsKt.XXO(R.string.user_no_login))));
    L10:
        Object r6 = r0.XIi00iiXO();
        if (r6 != pb.I0iXXO()) goto L13;
        DebugProbesKt.iO(r35);
    L13:
        return r6;
    L9:
        HashMap r7 = OXO1.XXX11i(new Pair[]{TuplesKt.OXO1("identity", r4.getIdentity()), TuplesKt.OXO1("pageNum", String.valueOf(r33)), TuplesKt.OXO1("pageSize", String.valueOf(r34)), TuplesKt.OXO1("orderType", "Translate")});
        NetWorkUtils r8 = NetWorkUtils.INSTANCE;
        final O1XIiIO<TranslateOrderEntity> r9 = new NetUtil$getTransOrderList$2$1(r0);
        final Activity r10 = null;
        final uq r11 = r8.loadPopup(null, null);
        String r12 = r8.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/order/select");
        r8.printParam(r12 + "/order/select", r7);
        NetWork r13 = NetWork.OXO1;
        String r14 = r12 + "/order/select";
        final O1XIiIO<Response<TranslateOrderEntity>> r15 = new NetUtil$getTransOrderList$lambda$0$$inlined$post$default$1(r10, r9, r11);
        AndroidNetworking.post(r14).addBodyParameter(r7).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{TranslateOrderEntity.class}), new NetUtil$getTransOrderList$lambda$0$$inlined$post$default$2(r15));
        goto L10
    }

    @aa1
    public final ii0iIIX0<NetResult<ThirdPartyDeviceData>> OXO1(@aa1 String r3) {
        Intrinsics.X0O(r3, "text");
        return iX0XiO.iIX0i(iX0XiO.X00O0(new NetUtil$activeThirdDevice$1(r3, null)), IXOX0Xiii.iO());
    }

    @aa1
    public final ii0iIIX0<NetResult<TranslationTime>> XIi00iiXO() {
        return iX0XiO.iIX0i(iX0XiO.X00O0(new NetUtil$getMockTranslationTime$1(null)), IXOX0Xiii.iO());
    }

    @tb1
    public final Object XO0O10(@aa1 Continuation<? super Unit> r4) {
        Object r5 = I100X1.I0IIOi(IXOX0Xiii.iO(), new NetUtil$getThirdDeviceInfo$2(null), r4);
        if (r5 != pb.I0iXXO()) goto L6;
        return r5;
    L6:
        return Unit.OXO1;
    }

    @tb1
    public final Object XOO0ii0(@aa1 String r4, @aa1 String r5, @aa1 Continuation<? super String> r6) {
        return I100X1.I0IIOi(IXOX0Xiii.iO(), new NetUtil$text2Audio$2(r5, r4, null), r6);
    }

    @aa1
    public final ii0iIIX0<NetResult<List<ThirdPartyDeviceFilterData>>> iO() {
        return iX0XiO.iIX0i(iX0XiO.X00O0(new NetUtil$getSupportedThirdDevice$1(null)), IXOX0Xiii.iO());
    }
}
