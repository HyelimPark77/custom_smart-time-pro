package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AccountCreateOrder;
import com.sma.smartv3.model.AccountIntegralData;
import com.sma.smartv3.model.AccountOrderData;
import com.sma.smartv3.model.AccountPoints;
import com.sma.smartv3.model.DeductionConfig;
import com.sma.smartv3.model.OrderContentData;
import com.sma.smartv3.model.UserAloneGameDetail;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.network.AccountIntegralDetails;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.CreateOrder;
import com.sma.smartv3.network.DeleteAccountOrderList;
import com.sma.smartv3.network.GetAppConfigInfo;
import com.sma.smartv3.network.GetFreeMember;
import com.sma.smartv3.network.GetFreePoints;
import com.sma.smartv3.network.GetGameDetail;
import com.sma.smartv3.network.GetOrderStatus;
import com.sma.smartv3.network.GetUserMember;
import com.sma.smartv3.network.GetUserPoints;
import com.sma.smartv3.network.GetUserUnreadMessagesCount;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleCache;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nOrderManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderManager.kt\ncom/sma/smartv3/biz/OrderManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,563:1\n235#2,11:564\n246#2:576\n256#2:586\n235#2,11:587\n246#2:599\n256#2:609\n153#2,11:610\n164#2:622\n174#2:632\n235#2,11:633\n246#2:645\n256#2:655\n235#2,11:656\n246#2:668\n256#2:678\n235#2,11:679\n246#2:691\n256#2:701\n235#2,11:702\n246#2:714\n256#2:724\n235#2,11:725\n246#2:737\n256#2:747\n235#2,11:748\n246#2:760\n256#2:770\n235#2,11:771\n246#2:783\n256#2:793\n235#2,11:794\n246#2:806\n256#2:816\n235#2,11:818\n246#2:830\n256#2:840\n1#3:575\n1#3:598\n1#3:621\n1#3:644\n1#3:667\n1#3:690\n1#3:713\n1#3:736\n1#3:759\n1#3:782\n1#3:805\n1#3:817\n1#3:829\n278#4,8:577\n298#4:585\n278#4,8:600\n298#4:608\n226#4,8:623\n245#4:631\n278#4,8:646\n298#4:654\n278#4,8:669\n298#4:677\n278#4,8:692\n298#4:700\n278#4,8:715\n298#4:723\n278#4,8:738\n298#4:746\n278#4,8:761\n298#4:769\n278#4,8:784\n298#4:792\n278#4,8:807\n298#4:815\n278#4,8:831\n298#4:839\n*S KotlinDebug\n*F\n+ 1 OrderManager.kt\ncom/sma/smartv3/biz/OrderManager\n*L\n130#1:564,11\n130#1:576\n130#1:586\n158#1:587,11\n158#1:599\n158#1:609\n194#1:610,11\n194#1:622\n194#1:632\n221#1:633,11\n221#1:645\n221#1:655\n248#1:656,11\n248#1:668\n248#1:678\n277#1:679,11\n277#1:691\n277#1:701\n309#1:702,11\n309#1:714\n309#1:724\n339#1:725,11\n339#1:737\n339#1:747\n368#1:748,11\n368#1:760\n368#1:770\n401#1:771,11\n401#1:783\n401#1:793\n426#1:794,11\n426#1:806\n426#1:816\n520#1:818,11\n520#1:830\n520#1:840\n130#1:575\n158#1:598\n194#1:621\n221#1:644\n248#1:667\n277#1:690\n309#1:713\n339#1:736\n368#1:759\n401#1:782\n426#1:805\n520#1:829\n130#1:577,8\n130#1:585\n158#1:600,8\n158#1:608\n194#1:623,8\n194#1:631\n221#1:646,8\n221#1:654\n248#1:669,8\n248#1:677\n277#1:692,8\n277#1:700\n309#1:715,8\n309#1:723\n339#1:738,8\n339#1:746\n368#1:761,8\n368#1:769\n401#1:784,8\n401#1:792\n426#1:807,8\n426#1:815\n520#1:831,8\n520#1:839\n*E\n"})
public final class OrderManager {

    @aa1
    public static final String I0IIOi = null;
    public static boolean IO = false;

    @aa1
    public static final String IiI10X = null;

    @aa1
    public static final String O00 = null;

    @tb1
    public static DeductionConfig OIX0iXi = null;
    public static boolean OIi0 = false;

    @aa1
    public static final OrderManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = "OrderManager";

    @aa1
    public static final String XO0O10 = null;

    @aa1
    public static final String XOO0ii0 = null;

    @aa1
    public static String iO;

    static {
        OXO1 = new OrderManager();
        iO = "";
        XO0O10 = "Member";
        O00 = "GameMember";
        IiI10X = "Game";
        XOO0ii0 = "WatchFace";
        I0IIOi = "Translate";
    }

    public OrderManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0iXXO(OrderManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.OIX0iXi(r1);
    }

    public static /* synthetic */ boolean O00(OrderManager r0, long r1, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r3 = 3;
    L6:
        return r0.XO0O10(r1, r3);
    }

    public static /* synthetic */ String OX(OrderManager r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "2";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = "";
    L9:
        if ((r4 & 4) == 0) goto L14;
        r3 = iO;
        if (r3.length() != 0) goto L14;
        r3 = OXO1.XiOIii1();
    L14:
        return r0.OII(r1, r2, r3);
    }

    public static /* synthetic */ String X11iII1O1(OrderManager r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.I1();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = XO0O10;
    L9:
        return r0.iX1O1(r1, r2);
    }

    public static /* synthetic */ void XIi00iiXO(OrderManager r0, String r1, String r2, Activity r3, Function1 r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.OXO1(r1, r2, r3, r4);
    }

    public static /* synthetic */ boolean XOO0ii0(OrderManager r0, long r1, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r3 = 3;
    L6:
        return r0.IiI10X(r1, r3);
    }

    public static /* synthetic */ String iIiiO(OrderManager r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L8;
        r3 = iO;
        if (r3.length() != 0) goto L8;
        r3 = OXO1.XiOIii1();
    L8:
        return r0.XiOIO(r1, r2, r3);
    }

    public final void I0IIOi(final int r10, @aa1 final Function1<? super AccountIntegralData, Unit> r11) {
        Intrinsics.X0O(r11, "callback");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getAccountIntegralDetails -> " + r0);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getAccountDetails(r0, r10);
        final O1XIiIO<AccountIntegralData> r3 = new OrderManager$getAccountIntegralDetails$1(r11, r10);
        Map<String, String> r12 = r1.getHeadersMap();
        final Activity r13 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AccountIntegralDetails.URL);
        String r6 = r5 + AccountIntegralDetails.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r2);
        r7.putAll(r12);
        Unit r8 = Unit.OXO1;
        r1.printParam(r6, r7);
        NetWork r9 = NetWork.OXO1;
        String r14 = r5 + AccountIntegralDetails.URL;
        final O1XIiIO<Response<AccountIntegralData>> r15 = new OrderManager$getAccountIntegralDetails$$inlined$postV2$default$1(r13, r3, r4);
        AndroidNetworking.post(r14).addHeaders(r12).addBodyParameter(r2).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AccountIntegralData.class}), new OrderManager$getAccountIntegralDetails$$inlined$postV2$default$2(r15));
    }

    @aa1
    public final String I1() {
        if (i72.OXO1.XO0X10iO() == false) goto L6;
        return "orderDetail/#/selectPoints";
    L6:
        return "orderDetail/#/selectOrder";
    }

    @aa1
    public final String I1XOi1() {
        return iO;
    }

    @aa1
    public final String II1Xi0() {
        return IiI10X;
    }

    @tb1
    public final DeductionConfig IIX1OXO() {
        return OIX0iXi;
    }

    @aa1
    public final String IO() {
        i72.OXO1.XO0X10iO();
        return "orderDetail/#/membershipPay";
    }

    @aa1
    public final String IXXOO() {
        return I0IIOi;
    }

    public final boolean IiI10X(long r7, int r9) {
        if (r7 != 0) goto L5;
        return true;
    L5:
        long r4 = System.currentTimeMillis() - r7;
        if (r4 >= 0) goto L9;
        return false;
    L9:
        if (r4 <= (r9 * 86400000)) goto L11;
        return true;
    L11:
        return false;
    }

    public final void O10IXXX0X(@aa1 String r10, @aa1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r10, GetGameDetail.GAME_ID);
        Intrinsics.X0O(r11, "callback");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getGameDetail -> " + r0 + "  ,  gid = " + r10);
        if (r0.length() != 0) goto L6;
        r11.invoke(Boolean.FALSE);
        return;
    L6:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getUserGameDetailBody(r10);
        final O1XIiIO<UserAloneGameDetail> r2 = new OrderManager$getGameDetail$1(r11);
        Map<String, String> r13 = r1.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetGameDetail.URL);
        String r6 = r5 + GetGameDetail.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r1.printParam(r6, r7);
        NetWork r9 = NetWork.OXO1;
        String r14 = r5 + GetGameDetail.URL;
        final O1XIiIO<Response<UserAloneGameDetail>> r15 = new OrderManager$getGameDetail$$inlined$postV2$default$1(r3, r2, r4);
        AndroidNetworking.post(r14).addHeaders(r13).addBodyParameter(r12).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{UserAloneGameDetail.class}), new OrderManager$getGameDetail$$inlined$postV2$default$2(r15));
    }

    public final void O1O(@aa1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r11, "callback");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getUserMember -> " + r0);
        if (r0.length() != 0) goto L6;
        r11.invoke(Boolean.FALSE);
        return;
    L6:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getUserPointsMemberBody(r0);
        final O1XIiIO<UserMember> r3 = new OrderManager$getUserMember$1(r11);
        Map<String, String> r12 = r1.getHeadersMap();
        final Activity r4 = null;
        final uq r5 = r1.loadPopup(null, null);
        String r6 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetUserMember.URL);
        String r7 = r6 + GetUserMember.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r2);
        r8.putAll(r12);
        Unit r9 = Unit.OXO1;
        r1.printParam(r7, r8);
        NetWork r10 = NetWork.OXO1;
        String r13 = r6 + GetUserMember.URL;
        final O1XIiIO<Response<UserMember>> r14 = new OrderManager$getUserMember$$inlined$postV2$default$1(r4, r3, r5);
        AndroidNetworking.post(r13).addHeaders(r12).addBodyParameter(r2).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{UserMember.class}), new OrderManager$getUserMember$$inlined$postV2$default$2(r14));
    }

    @aa1
    public final String OII(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "result");
        Intrinsics.X0O(r3, "orderType");
        Intrinsics.X0O(r4, "payWeb");
        return StringsKt__StringsKt.iX1X1(iX1O1(r4, r3) + "&result=" + r2).toString();
    }

    public final void OIX0iXi(@tb1 final Function1<? super DeductionConfig, Unit> r11) {
        DeductionConfig r0 = OIX0iXi;
        if (r0 == null) goto L7;
        if (r11 == null) goto L9;
        r11.invoke(r0);
        return;
    L9:
        return;
    L7:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getAppDeductionConfigBody();
        final O1XIiIO<DeductionConfig> r3 = new OrderManager$getDeductionConfig$1(r11);
        Map<String, String> r12 = r1.getHeadersMap();
        final Activity r4 = null;
        final uq r5 = r1.loadPopup(null, null);
        String r6 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetAppConfigInfo.URL);
        String r7 = r6 + GetAppConfigInfo.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r2);
        r8.putAll(r12);
        Unit r9 = Unit.OXO1;
        r1.printParam(r7, r8);
        NetWork r10 = NetWork.OXO1;
        String r13 = r6 + GetAppConfigInfo.URL;
        final O1XIiIO<Response<DeductionConfig>> r14 = new OrderManager$getDeductionConfig$$inlined$postV2$default$1(r4, r3, r5);
        AndroidNetworking.post(r13).addHeaders(r12).addBodyParameter(r2).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{DeductionConfig.class}), new OrderManager$getDeductionConfig$$inlined$postV2$default$2(r14));
    }

    public final void OIi0(@aa1 final String r9, final int r10, @aa1 final Function1<? super AccountOrderData, Unit> r11) {
        Intrinsics.X0O(r9, "orderType");
        Intrinsics.X0O(r11, "callback");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getAccountOrderList -> " + r0);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getAccountOrderSelectList(r0, r9, r10);
        final O1XIiIO<AccountOrderData> r3 = new OrderManager$getAccountOrderList$1(r10, r9, r11);
        Map<String, String> r12 = r1.getHeadersMap();
        final Activity r13 = null;
        final uq r14 = r1.loadPopup(null, null);
        String r4 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/order/select");
        Map<String, ? extends Object> r6 = kotlin.collections.OXO1.X111IO(r2);
        r6.putAll(r12);
        Unit r7 = Unit.OXO1;
        r1.printParam(r4 + "/order/select", r6);
        NetWork r5 = NetWork.OXO1;
        String r8 = r4 + "/order/select";
        final O1XIiIO<Response<AccountOrderData>> r15 = new OrderManager$getAccountOrderList$$inlined$postV2$default$1(r13, r3, r14);
        AndroidNetworking.post(r8).addHeaders(r12).addBodyParameter(r2).setTag(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AccountOrderData.class}), new OrderManager$getAccountOrderList$$inlined$postV2$default$2(r15));
    }

    public final void OXO1(@aa1 String r9, @aa1 String r10, @tb1 final Activity r11, @aa1 final Function1<? super AccountCreateOrder, Unit> r12) {
        Intrinsics.X0O(r9, "orderType");
        Intrinsics.X0O(r10, "eleId");
        Intrinsics.X0O(r12, "callback");
        String r2 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager createOrder -> " + r2);
        if (r2.length() != 0) goto L6;
        ToastUtils.showLong(UtilsKt.XXO(R.string.login_required_tip), new Object[0]);
        return;
    L6:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap r13 = RequestBodyKt.getCreateOrder$default(r2, r9, r10, null, 8, null);
        final O1XIiIO<AccountCreateOrder> r14 = new OrderManager$createOrder$1(r12);
        Map<String, String> r15 = r1.getHeadersMap();
        final uq r3 = r1.loadPopup(r11, null);
        String r4 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), CreateOrder.URL);
        String r5 = r4 + CreateOrder.URL;
        Map<String, ? extends Object> r6 = kotlin.collections.OXO1.X111IO(r13);
        r6.putAll(r15);
        Unit r7 = Unit.OXO1;
        r1.printParam(r5, r6);
        NetWork r8 = NetWork.OXO1;
        String r16 = r4 + CreateOrder.URL;
        final O1XIiIO<Response<AccountCreateOrder>> r17 = new OrderManager$createOrder$$inlined$postV2$default$1(r11, r14, r3);
        AndroidNetworking.post(r16).addHeaders(r15).addBodyParameter(r13).setTag(r16).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AccountCreateOrder.class}), new OrderManager$createOrder$$inlined$postV2$default$2(r17));
    }

    @aa1
    public final String OiIIX101O(@aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r5, "orderNum");
        Intrinsics.X0O(r6, "payType");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getPayInfoUrl -> " + r0);
        if (r0.length() != 0) goto L7;
        return "";
    L7:
        return Api.INSTANCE.getBASE_URL() + "//aliPay/wapPay?payType=" + r6 + "&orderNum=" + r5;
    }

    public final String X01IiOiIi() {
        return oe5.IXO0OOi(Api.INSTANCE.getBASE_URL(), "kotlinweb", "", false, 4, null);
    }

    @aa1
    public final String X0O() {
        if (i72.OXO1.XO0X10iO() == false) goto L6;
        return "orderMember/#/memberDetailEn";
    L6:
        return "orderMember/#/memberDetail";
    }

    public final void X0i1O(@tb1 DeductionConfig r1) {
        OIX0iXi = r1;
    }

    public final void X1IX(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        iO = r2;
    }

    public final void X1ii(@aa1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r11, "callback");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getFreePoints -> " + r0);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getFreePointsBody(r0);
        final O1XIiIO<String> r3 = new OrderManager$getFreePoints$1(r11);
        Map<String, String> r12 = r1.getHeadersMap();
        final Activity r4 = null;
        final uq r5 = r1.loadPopup(null, null);
        String r6 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetFreePoints.URL);
        String r7 = r6 + GetFreePoints.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r2);
        r8.putAll(r12);
        Unit r9 = Unit.OXO1;
        r1.printParam(r7, r8);
        NetWork r10 = NetWork.OXO1;
        String r13 = r6 + GetFreePoints.URL;
        final O1XIiIO<Response<String>> r14 = new OrderManager$getFreePoints$$inlined$postV2$default$1(r4, r3, r5);
        AndroidNetworking.post(r13).addHeaders(r12).addBodyParameter(r2).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new OrderManager$getFreePoints$$inlined$postV2$default$2(r14));
    }

    public final boolean XO0O10(long r3, int r5) {
        long r4 = r3 - System.currentTimeMillis();
        if (r4 < (r5 * 86400000)) goto L5;
        return false;
    L5:
        if (r4 <= 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final void XX0(@aa1 String r9, @aa1 String r10, @aa1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r9, "orderNum");
        Intrinsics.X0O(r10, "orderType");
        Intrinsics.X0O(r11, "callback");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getOrderStatus -> " + r0);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getOrderStatusBody(r0, r9, r10);
        final O1XIiIO<OrderContentData> r13 = new OrderManager$getOrderStatus$1(r11);
        Map<String, String> r14 = r1.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r1.loadPopup(null, null);
        String r4 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetOrderStatus.URL);
        String r5 = r4 + GetOrderStatus.URL;
        Map<String, ? extends Object> r6 = kotlin.collections.OXO1.X111IO(r12);
        r6.putAll(r14);
        Unit r7 = Unit.OXO1;
        r1.printParam(r5, r6);
        NetWork r8 = NetWork.OXO1;
        String r15 = r4 + GetOrderStatus.URL;
        final O1XIiIO<Response<OrderContentData>> r16 = new OrderManager$getOrderStatus$$inlined$postV2$default$1(r2, r13, r3);
        AndroidNetworking.post(r15).addHeaders(r14).addBodyParameter(r12).setTag(r15).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{OrderContentData.class}), new OrderManager$getOrderStatus$$inlined$postV2$default$2(r16));
    }

    public final void XXI(@aa1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r11, "callback");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getFreeMember -> " + r0);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getUserPointsMemberBody(r0);
        final O1XIiIO<String> r3 = new OrderManager$getFreeMember$1(r11);
        Map<String, String> r12 = r1.getHeadersMap();
        final Activity r4 = null;
        final uq r5 = r1.loadPopup(null, null);
        String r6 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetFreeMember.URL);
        String r7 = r6 + GetFreeMember.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r2);
        r8.putAll(r12);
        Unit r9 = Unit.OXO1;
        r1.printParam(r7, r8);
        NetWork r10 = NetWork.OXO1;
        String r13 = r6 + GetFreeMember.URL;
        final O1XIiIO<Response<String>> r14 = new OrderManager$getFreeMember$$inlined$postV2$default$1(r4, r3, r5);
        AndroidNetworking.post(r13).addHeaders(r12).addBodyParameter(r2).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new OrderManager$getFreeMember$$inlined$postV2$default$2(r14));
    }

    public final void XXIIO1i11() {
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getUserPoints -> " + r0);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getUserPointsMemberBody(r0);
        final O1XIiIO<AccountPoints> r3 = new OrderManager$getUserPoints$1();
        Map<String, String> r4 = r1.getHeadersMap();
        final Activity r5 = null;
        final uq r6 = r1.loadPopup(null, null);
        String r7 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetUserPoints.URL);
        String r8 = r7 + GetUserPoints.URL;
        Map<String, ? extends Object> r9 = kotlin.collections.OXO1.X111IO(r2);
        r9.putAll(r4);
        Unit r10 = Unit.OXO1;
        r1.printParam(r8, r9);
        NetWork r11 = NetWork.OXO1;
        String r12 = r7 + GetUserPoints.URL;
        final O1XIiIO<Response<AccountPoints>> r13 = new OrderManager$getUserPoints$$inlined$postV2$default$1(r5, r3, r6);
        AndroidNetworking.post(r12).addHeaders(r4).addBodyParameter(r2).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AccountPoints.class}), new OrderManager$getUserPoints$$inlined$postV2$default$2(r13));
    }

    public final boolean XXX11i() {
        return OIi0;
    }

    @aa1
    public final String XiOIO(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "orderNum");
        Intrinsics.X0O(r3, "orderType");
        Intrinsics.X0O(r4, "payWeb");
        if (i72.OXO1.O001I().length() != 0) goto L7;
        return "";
    L7:
        return iX1O1(r4, r3) + "&orderNum=" + r2;
    }

    @aa1
    public final String XiOIii1() {
        if (i72.OXO1.XO0X10iO() == false) goto L6;
        return "orderDetail/#/pointsDetail";
    L6:
        return "orderDetail/#/orderDetail";
    }

    @aa1
    public final String i010I() {
        return O00;
    }

    public final void iI() {
        i72 r0 = i72.OXO1;
        String r1 = r0.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getUserUnreadMessagesCount -> " + r1);
        if (r1.length() != 0) goto L6;
        return;
    L6:
        if (r0.XX1Oi() == false) goto L9;
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r3 = RequestBodyKt.getUserIdBody(r1);
        final O1XIiIO<Integer> r4 = new OrderManager$getUserUnreadMessagesCount$1();
        Map<String, String> r5 = r2.getHeadersMap();
        final Activity r6 = null;
        final uq r7 = r2.loadPopup(null, null);
        String r8 = r2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetUserUnreadMessagesCount.URL);
        String r9 = r8 + GetUserUnreadMessagesCount.URL;
        Map<String, ? extends Object> r10 = kotlin.collections.OXO1.X111IO(r3);
        r10.putAll(r5);
        Unit r11 = Unit.OXO1;
        r2.printParam(r9, r10);
        NetWork r12 = NetWork.OXO1;
        String r13 = r8 + GetUserUnreadMessagesCount.URL;
        final O1XIiIO<Response<Integer>> r14 = new OrderManager$getUserUnreadMessagesCount$$inlined$getV2$default$1(r6, r4, r7);
        AndroidNetworking.get(r13).addQueryParameter(r3).setTag(r13).addHeaders(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Integer.class}), new OrderManager$getUserUnreadMessagesCount$$inlined$getV2$default$2(r14));
        return;
    }

    public final void iIXi1iiXI(boolean r1) {
        IO = r1;
    }

    public final void iO(@aa1 String r10, @aa1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r10, "orderId");
        Intrinsics.X0O(r11, "callback");
        String r0 = i72.OXO1.O001I();
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.deleteAccountOrderBody(r0, r10);
        final O1XIiIO<String> r2 = new OrderManager$deleteOrderList$1(r11);
        Map<String, String> r13 = r1.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), DeleteAccountOrderList.URL);
        String r6 = r5 + DeleteAccountOrderList.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r1.printParam(r6, r7);
        NetWork r9 = NetWork.OXO1;
        String r14 = r5 + DeleteAccountOrderList.URL;
        final O1XIiIO<Response<String>> r15 = new OrderManager$deleteOrderList$$inlined$postV2$default$1(r3, r2, r4);
        AndroidNetworking.post(r14).addHeaders(r13).addBodyParameter(r12).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new OrderManager$deleteOrderList$$inlined$postV2$default$2(r15));
    }

    @aa1
    public final String iOO1ii1() {
        return XOO0ii0;
    }

    public final boolean iOOX010X() {
        return IO;
    }

    @aa1
    public final String iX() {
        return XO0O10;
    }

    @aa1
    public final String iX1O1(@aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r10, "payUrl");
        Intrinsics.X0O(r11, "orderType");
        if (Intrinsics.XOO0ii0(r11, XO0O10) == false) goto L5;
        iO = r10;
    L5:
        i72 r0 = i72.OXO1;
        if (r0.O001I().length() != 0) goto L8;
        return "";
    L8:
        OIi0 = Intrinsics.XOO0ii0(r10, I1());
        IO = true;
        String r1 = StringsKt__StringsKt.iX1X1("").toString();
        q62 r2 = q62.OXO1;
        String r3 = r1 + "&supCreate=" + r2.OXXiX0() + "&internalFlag=" + r0.XI1OX0IO() + "&pid=58";
        if (gk4.I0IIOi().XX0() == false) goto L12;
        r3 = r3 + StringsKt__StringsKt.iX1X1("&dark=dark").toString();
    L12:
        if (r2.OiO() == false) goto L15;
        r3 = r3 + StringsKt__StringsKt.iX1X1("&deviceType=ring").toString();
    L15:
        if (r11.length() <= 0) goto L17;
        r3 = r3 + StringsKt__StringsKt.iX1X1("&orderType=" + r11).toString();
    L17:
        BleCache r12 = BleCache.INSTANCE;
        if (r12.getMBleAddress().length() <= 0) goto L21;
        r3 = r3 + StringsKt__StringsKt.iX1X1("&mac=" + oe5.IXO0OOi(r12.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null)).toString();
    L21:
        if (r12.getMBleName().length() <= 0) goto L23;
        r3 = (r3 + StringsKt__StringsKt.iX1X1("&bleName=" + r12.getMBleName()).toString()) + StringsKt__StringsKt.iX1X1("&flag=" + r12.getMFirmwareFlag()).toString();
    L23:
        String r13 = StringsKt__StringsKt.iX1X1(X01IiOiIi() + r10 + "?identity=" + r0.O001I() + r3).toString();
        i1O0OXO1O r14 = i1O0OXO1O.OXO1;
        StringBuilder r4 = new StringBuilder();
        r4.append("OrderManager getVipPayWebUrl -> ");
        r4.append(r13);
        r14.OXO1(r4.toString());
        return r13;
    }

    public final void iXiX011(boolean r1) {
        OIi0 = r1;
    }
}
