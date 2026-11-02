package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
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

    /* JADX INFO: renamed from: IO */
    public static boolean f50891IO = false;

    @tb1
    public static DeductionConfig OIX0iXi = null;
    public static boolean OIi0 = false;

    @aa1
    public static final String XIi00iiXO = "OrderManager";

    @aa1
    public static final OrderManager OXO1 = new OrderManager();

    /* JADX INFO: renamed from: iO */
    @aa1
    public static String f50892iO = "";

    @aa1
    public static final String XO0O10 = "Member";

    @aa1
    public static final String O00 = "GameMember";

    @aa1
    public static final String IiI10X = "Game";

    @aa1
    public static final String XOO0ii0 = "WatchFace";

    @aa1
    public static final String I0IIOi = "Translate";

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0iXXO(OrderManager orderManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        orderManager.OIX0iXi(function1);
    }

    public static /* synthetic */ boolean O00(OrderManager orderManager, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        return orderManager.XO0O10(j, i);
    }

    /* JADX INFO: renamed from: OX */
    public static /* synthetic */ String m38106OX(OrderManager orderManager, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "2";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = f50892iO;
            if (str3.length() == 0) {
                str3 = OXO1.XiOIii1();
            }
        }
        return orderManager.OII(str, str2, str3);
    }

    public static /* synthetic */ String X11iII1O1(OrderManager orderManager, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderManager.m38107I1();
        }
        if ((i & 2) != 0) {
            str2 = XO0O10;
        }
        return orderManager.iX1O1(str, str2);
    }

    public static /* synthetic */ void XIi00iiXO(OrderManager orderManager, String str, String str2, Activity activity, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            activity = null;
        }
        orderManager.OXO1(str, str2, activity, function1);
    }

    public static /* synthetic */ boolean XOO0ii0(OrderManager orderManager, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        return orderManager.IiI10X(j, i);
    }

    public static /* synthetic */ String iIiiO(OrderManager orderManager, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = f50892iO;
            if (str3.length() == 0) {
                str3 = OXO1.XiOIii1();
            }
        }
        return orderManager.XiOIO(str, str2, str3);
    }

    public final void I0IIOi(final int i, @aa1 final Function1<? super AccountIntegralData, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getAccountIntegralDetails -> " + strO001I);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> accountDetails = RequestBodyKt.getAccountDetails(strO001I, i);
        final O1XIiIO<AccountIntegralData> o1XIiIO = new O1XIiIO<AccountIntegralData>() { // from class: com.sma.smartv3.biz.OrderManager$getAccountIntegralDetails$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AccountIntegralData accountIntegralData) {
                i1O0OXO1O.OXO1.OXO1("OrderManager getAccountIntegralDetails handleResponse -> " + accountIntegralData);
                if (accountIntegralData == null) {
                    callback.invoke2(null);
                    return;
                }
                if (i == 1) {
                    a01.OXO1.IiI10X().put(b01.XIO11I + '_' + AccountIntegralData.class.getName(), new Gson().toJson(accountIntegralData), false);
                }
                callback.invoke2(accountIntegralData);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                callback.invoke2(null);
                i1O0OXO1O.OXO1.OXO1("OrderManager getAccountIntegralDetails handleError -> " + error);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AccountIntegralDetails.URL);
        String str = strConvertBaseUrl + AccountIntegralDetails.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(accountDetails);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + AccountIntegralDetails.URL;
        final O1XIiIO<Response<AccountIntegralData>> o1XIiIO2 = new O1XIiIO<Response<AccountIntegralData>>() { // from class: com.sma.smartv3.biz.OrderManager$getAccountIntegralDetails$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AccountIntegralData> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) accountDetails).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AccountIntegralData.class), new ParsedRequestListener<Response<AccountIntegralData>>() { // from class: com.sma.smartv3.biz.OrderManager$getAccountIntegralDetails$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AccountIntegralData> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @aa1
    /* JADX INFO: renamed from: I1 */
    public final String m38107I1() {
        return i72.OXO1.XO0X10iO() ? "orderDetail/#/selectPoints" : "orderDetail/#/selectOrder";
    }

    @aa1
    public final String I1XOi1() {
        return f50892iO;
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
    /* JADX INFO: renamed from: IO */
    public final String m38108IO() {
        i72.OXO1.XO0X10iO();
        return "orderDetail/#/membershipPay";
    }

    @aa1
    public final String IXXOO() {
        return I0IIOi;
    }

    public final boolean IiI10X(long j, int i) {
        if (j == 0) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        return jCurrentTimeMillis >= 0 && jCurrentTimeMillis > ((long) (i * 86400000));
    }

    public final void O10IXXX0X(@aa1 String gid, @aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(gid, "gid");
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getGameDetail -> " + strO001I + "  ,  gid = " + gid);
        if (strO001I.length() == 0) {
            callback.invoke2(Boolean.FALSE);
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> userGameDetailBody = RequestBodyKt.getUserGameDetailBody(gid);
        final O1XIiIO<UserAloneGameDetail> o1XIiIO = new O1XIiIO<UserAloneGameDetail>() { // from class: com.sma.smartv3.biz.OrderManager$getGameDetail$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(UserAloneGameDetail userAloneGameDetail) {
                i1O0OXO1O.OXO1.OXO1("OrderManager getGameDetail handleResponse " + (userAloneGameDetail != null ? userAloneGameDetail.getGid() : null));
                a01.OXO1.IiI10X().put(I01XX0.I0IIOI + '_' + UserAloneGameDetail.class.getName(), new Gson().toJson(userAloneGameDetail), false);
                I01XX0.XIi00iiXO(I01XX0.I0IIOI, null, 2, null);
                callback.invoke2(Boolean.TRUE);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager getGameDetail handleError -> " + error);
                callback.invoke2(Boolean.FALSE);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetGameDetail.URL);
        String str = strConvertBaseUrl + GetGameDetail.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(userGameDetailBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetGameDetail.URL;
        final O1XIiIO<Response<UserAloneGameDetail>> o1XIiIO2 = new O1XIiIO<Response<UserAloneGameDetail>>() { // from class: com.sma.smartv3.biz.OrderManager$getGameDetail$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<UserAloneGameDetail> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) userGameDetailBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, UserAloneGameDetail.class), new ParsedRequestListener<Response<UserAloneGameDetail>>() { // from class: com.sma.smartv3.biz.OrderManager$getGameDetail$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<UserAloneGameDetail> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void O1O(@aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getUserMember -> " + strO001I);
        if (strO001I.length() == 0) {
            callback.invoke2(Boolean.FALSE);
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> userPointsMemberBody = RequestBodyKt.getUserPointsMemberBody(strO001I);
        final O1XIiIO<UserMember> o1XIiIO = new O1XIiIO<UserMember>() { // from class: com.sma.smartv3.biz.OrderManager$getUserMember$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(UserMember userMember) {
                i1O0OXO1O.OXO1.OXO1("OrderManager getUserMember handleResponse -> " + userMember);
                i72 i72Var = i72.OXO1;
                boolean zM2044Ii = i72Var.m2044Ii();
                if (userMember != null) {
                    Function1<Boolean, Unit> function1 = callback;
                    a01.OXO1.IiI10X().put(I01XX0.O101 + '_' + UserMember.class.getName(), new Gson().toJson(userMember), false);
                    I01XX0.XIi00iiXO(I01XX0.O101, null, 2, null);
                    if (zM2044Ii != i72Var.m2044Ii()) {
                        I01XX0.XIi00iiXO(I01XX0.I0XXi0X, null, 2, null);
                    }
                    function1.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager getUserMember handleError -> " + error);
                callback.invoke2(Boolean.FALSE);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetUserMember.URL);
        String str = strConvertBaseUrl + GetUserMember.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(userPointsMemberBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetUserMember.URL;
        final O1XIiIO<Response<UserMember>> o1XIiIO2 = new O1XIiIO<Response<UserMember>>() { // from class: com.sma.smartv3.biz.OrderManager$getUserMember$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<UserMember> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) userPointsMemberBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, UserMember.class), new ParsedRequestListener<Response<UserMember>>() { // from class: com.sma.smartv3.biz.OrderManager$getUserMember$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<UserMember> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @aa1
    public final String OII(@aa1 String result, @aa1 String orderType, @aa1 String payWeb) {
        Intrinsics.X0O(result, "result");
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(payWeb, "payWeb");
        return StringsKt__StringsKt.iX1X1(iX1O1(payWeb, orderType) + "&result=" + result).toString();
    }

    public final void OIX0iXi(@tb1 final Function1<? super DeductionConfig, Unit> function1) {
        DeductionConfig deductionConfig = OIX0iXi;
        if (deductionConfig != null) {
            if (function1 != null) {
                function1.invoke2(deductionConfig);
                return;
            }
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> appDeductionConfigBody = RequestBodyKt.getAppDeductionConfigBody();
        final O1XIiIO<DeductionConfig> o1XIiIO = new O1XIiIO<DeductionConfig>() { // from class: com.sma.smartv3.biz.OrderManager$getDeductionConfig$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(DeductionConfig deductionConfig2) {
                LogUtils.m11128d("getDeductionConfig -> " + deductionConfig2);
                try {
                    if (deductionConfig2 == null) {
                        Function1<DeductionConfig, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(null);
                            return;
                        }
                        return;
                    }
                    OrderManager.OXO1.X0i1O(deductionConfig2);
                    Function1<DeductionConfig, Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(deductionConfig2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<DeductionConfig, Unit> function4 = function1;
                    if (function4 != null) {
                        function4.invoke2(null);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getDeductionConfig -> " + error);
                Function1<DeductionConfig, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetAppConfigInfo.URL);
        String str = strConvertBaseUrl + GetAppConfigInfo.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(appDeductionConfigBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetAppConfigInfo.URL;
        final O1XIiIO<Response<DeductionConfig>> o1XIiIO2 = new O1XIiIO<Response<DeductionConfig>>() { // from class: com.sma.smartv3.biz.OrderManager$getDeductionConfig$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<DeductionConfig> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) appDeductionConfigBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, DeductionConfig.class), new ParsedRequestListener<Response<DeductionConfig>>() { // from class: com.sma.smartv3.biz.OrderManager$getDeductionConfig$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<DeductionConfig> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void OIi0(@aa1 final String orderType, final int i, @aa1 final Function1<? super AccountOrderData, Unit> callback) {
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getAccountOrderList -> " + strO001I);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> accountOrderSelectList = RequestBodyKt.getAccountOrderSelectList(strO001I, orderType, i);
        final O1XIiIO<AccountOrderData> o1XIiIO = new O1XIiIO<AccountOrderData>() { // from class: com.sma.smartv3.biz.OrderManager$getAccountOrderList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AccountOrderData accountOrderData) {
                i1O0OXO1O.OXO1.OXO1("OrderManager getAccountOrderList handleResponse -> " + accountOrderData);
                if (accountOrderData != null) {
                    int i2 = i;
                    String str = orderType;
                    Function1<AccountOrderData, Unit> function1 = callback;
                    if (i2 == 1) {
                        a01.OXO1.IiI10X().put((b01.XOIO11O + str) + '_' + AccountOrderData.class.getName(), new Gson().toJson(accountOrderData), false);
                    }
                    function1.invoke2(accountOrderData);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager getAccountOrderList handleError -> " + error);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/order/select");
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(accountOrderSelectList);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + "/order/select", mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + "/order/select";
        final O1XIiIO<Response<AccountOrderData>> o1XIiIO2 = new O1XIiIO<Response<AccountOrderData>>() { // from class: com.sma.smartv3.biz.OrderManager$getAccountOrderList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AccountOrderData> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addHeaders(headersMap).addBodyParameter((Map<String, String>) accountOrderSelectList).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AccountOrderData.class), new ParsedRequestListener<Response<AccountOrderData>>() { // from class: com.sma.smartv3.biz.OrderManager$getAccountOrderList$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AccountOrderData> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void OXO1(@aa1 String orderType, @aa1 String eleId, @tb1 final Activity activity, @aa1 final Function1<? super AccountCreateOrder, Unit> callback) {
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(eleId, "eleId");
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager createOrder -> " + strO001I);
        if (strO001I.length() == 0) {
            ToastUtils.showLong(UtilsKt.XXO(R.string.login_required_tip), new Object[0]);
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap createOrder$default = RequestBodyKt.getCreateOrder$default(strO001I, orderType, eleId, null, 8, null);
        final O1XIiIO<AccountCreateOrder> o1XIiIO = new O1XIiIO<AccountCreateOrder>() { // from class: com.sma.smartv3.biz.OrderManager$createOrder$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AccountCreateOrder accountCreateOrder) {
                i1O0OXO1O.OXO1.OXO1("OrderManager createOrder handleResponse -> " + accountCreateOrder);
                if (accountCreateOrder != null) {
                    callback.invoke2(accountCreateOrder);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager createOrder handleError -> " + error);
                callback.invoke2(null);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), CreateOrder.URL);
        String str = strConvertBaseUrl + CreateOrder.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(createOrder$default);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + CreateOrder.URL;
        final O1XIiIO<Response<AccountCreateOrder>> o1XIiIO2 = new O1XIiIO<Response<AccountCreateOrder>>() { // from class: com.sma.smartv3.biz.OrderManager$createOrder$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AccountCreateOrder> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) createOrder$default).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AccountCreateOrder.class), new ParsedRequestListener<Response<AccountCreateOrder>>() { // from class: com.sma.smartv3.biz.OrderManager$createOrder$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AccountCreateOrder> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @aa1
    public final String OiIIX101O(@aa1 String orderNum, @aa1 String payType) {
        Intrinsics.X0O(orderNum, "orderNum");
        Intrinsics.X0O(payType, "payType");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getPayInfoUrl -> " + strO001I);
        if (strO001I.length() == 0) {
            return "";
        }
        return Api.INSTANCE.getBASE_URL() + "//aliPay/wapPay?payType=" + payType + "&orderNum=" + orderNum;
    }

    public final String X01IiOiIi() {
        return oe5.IXO0OOi(Api.INSTANCE.getBASE_URL(), "kotlinweb", "", false, 4, null);
    }

    @aa1
    public final String X0O() {
        return i72.OXO1.XO0X10iO() ? "orderMember/#/memberDetailEn" : "orderMember/#/memberDetail";
    }

    public final void X0i1O(@tb1 DeductionConfig deductionConfig) {
        OIX0iXi = deductionConfig;
    }

    public final void X1IX(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        f50892iO = str;
    }

    public final void X1ii(@aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getFreePoints -> " + strO001I);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> freePointsBody = RequestBodyKt.getFreePointsBody(strO001I);
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.OrderManager$getFreePoints$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                i1O0OXO1O.OXO1.OXO1("OrderManager getFreePoints handleResponse -> " + str);
                if (str != null) {
                    Function1<Boolean, Unit> function1 = callback;
                    a01.OXO1.IiI10X().put(I01XX0.iOX + '_' + String.class.getName(), new Gson().toJson(str), false);
                    function1.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager getFreePoints handleError -> " + error);
                callback.invoke2(Boolean.FALSE);
                ToastUtils.showLong(error, new Object[0]);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetFreePoints.URL);
        String str = strConvertBaseUrl + GetFreePoints.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(freePointsBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetFreePoints.URL;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.biz.OrderManager$getFreePoints$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) freePointsBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.biz.OrderManager$getFreePoints$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final boolean XO0O10(long j, int i) {
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        return jCurrentTimeMillis < ((long) (i * 86400000)) && jCurrentTimeMillis > 0;
    }

    public final void XX0(@aa1 String orderNum, @aa1 String orderType, @aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(orderNum, "orderNum");
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getOrderStatus -> " + strO001I);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> orderStatusBody = RequestBodyKt.getOrderStatusBody(strO001I, orderNum, orderType);
        final O1XIiIO<OrderContentData> o1XIiIO = new O1XIiIO<OrderContentData>() { // from class: com.sma.smartv3.biz.OrderManager$getOrderStatus$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(OrderContentData orderContentData) {
                i1O0OXO1O.OXO1.OXO1("OrderManager getOrderStatus handleResponse -> " + orderContentData);
                if (orderContentData == null || !Intrinsics.XOO0ii0(orderContentData.getPayStatus(), "Payed")) {
                    callback.invoke2(Boolean.FALSE);
                } else {
                    callback.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager getOrderStatus handleError -> " + error);
                callback.invoke2(Boolean.FALSE);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetOrderStatus.URL);
        String str = strConvertBaseUrl + GetOrderStatus.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(orderStatusBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetOrderStatus.URL;
        final O1XIiIO<Response<OrderContentData>> o1XIiIO2 = new O1XIiIO<Response<OrderContentData>>() { // from class: com.sma.smartv3.biz.OrderManager$getOrderStatus$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<OrderContentData> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) orderStatusBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, OrderContentData.class), new ParsedRequestListener<Response<OrderContentData>>() { // from class: com.sma.smartv3.biz.OrderManager$getOrderStatus$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<OrderContentData> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void XXI(@aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getFreeMember -> " + strO001I);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> userPointsMemberBody = RequestBodyKt.getUserPointsMemberBody(strO001I);
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.OrderManager$getFreeMember$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                i1O0OXO1O.OXO1.OXO1("OrderManager getFreeMember handleResponse -> " + str);
                if (str != null) {
                    Function1<Boolean, Unit> function1 = callback;
                    a01.OXO1.IiI10X().put(b01.I0IIOI + '_' + String.class.getName(), new Gson().toJson(str), false);
                    function1.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager getFreeMember handleError -> " + error);
                callback.invoke2(Boolean.FALSE);
                ToastUtils.showLong(error, new Object[0]);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetFreeMember.URL);
        String str = strConvertBaseUrl + GetFreeMember.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(userPointsMemberBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetFreeMember.URL;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.biz.OrderManager$getFreeMember$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) userPointsMemberBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.biz.OrderManager$getFreeMember$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void XXIIO1i11() {
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getUserPoints -> " + strO001I);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> userPointsMemberBody = RequestBodyKt.getUserPointsMemberBody(strO001I);
        final O1XIiIO<AccountPoints> o1XIiIO = new O1XIiIO<AccountPoints>() { // from class: com.sma.smartv3.biz.OrderManager$getUserPoints$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AccountPoints accountPoints) {
                i1O0OXO1O.OXO1.OXO1("OrderManager getUserPoints handleResponse -> " + accountPoints);
                if (accountPoints != null) {
                    a01.OXO1.IiI10X().put(I01XX0.iIi0 + '_' + AccountPoints.class.getName(), new Gson().toJson(accountPoints), false);
                    I01XX0.XIi00iiXO(I01XX0.iIi0, null, 2, null);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager getUserPoints handleError -> " + error);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetUserPoints.URL);
        String str = strConvertBaseUrl + GetUserPoints.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(userPointsMemberBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetUserPoints.URL;
        final O1XIiIO<Response<AccountPoints>> o1XIiIO2 = new O1XIiIO<Response<AccountPoints>>() { // from class: com.sma.smartv3.biz.OrderManager$getUserPoints$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AccountPoints> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) userPointsMemberBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AccountPoints.class), new ParsedRequestListener<Response<AccountPoints>>() { // from class: com.sma.smartv3.biz.OrderManager$getUserPoints$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AccountPoints> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final boolean XXX11i() {
        return OIi0;
    }

    @aa1
    public final String XiOIO(@aa1 String orderNum, @aa1 String orderType, @aa1 String payWeb) {
        Intrinsics.X0O(orderNum, "orderNum");
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(payWeb, "payWeb");
        if (i72.OXO1.O001I().length() == 0) {
            return "";
        }
        return iX1O1(payWeb, orderType) + "&orderNum=" + orderNum;
    }

    @aa1
    public final String XiOIii1() {
        return i72.OXO1.XO0X10iO() ? "orderDetail/#/pointsDetail" : "orderDetail/#/orderDetail";
    }

    @aa1
    public final String i010I() {
        return O00;
    }

    /* JADX INFO: renamed from: iI */
    public final void m38109iI() {
        i72 i72Var = i72.OXO1;
        String strO001I = i72Var.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getUserUnreadMessagesCount -> " + strO001I);
        if (strO001I.length() != 0 && i72Var.XX1Oi()) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            HashMap<String, String> userIdBody = RequestBodyKt.getUserIdBody(strO001I);
            final O1XIiIO<Integer> o1XIiIO = new O1XIiIO<Integer>() { // from class: com.sma.smartv3.biz.OrderManager$getUserUnreadMessagesCount$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Integer num) {
                    i1O0OXO1O.OXO1.OXO1("OrderManager getUserUnreadMessagesCount handleResponse -> " + num);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        a01.OXO1.IiI10X().put(I01XX0.IXiOXO, num.intValue());
                        I01XX0.OXO1(I01XX0.IXiOXO, Integer.valueOf(iIntValue));
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.OXO1("OrderManager getUserUnreadMessagesCount handleError -> " + error);
                }
            };
            Map<String, String> headersMap = netWorkUtils.getHeadersMap();
            final Activity activity = null;
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
            String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetUserUnreadMessagesCount.URL);
            String str = strConvertBaseUrl + GetUserUnreadMessagesCount.URL;
            Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(userIdBody);
            mapX111IO.putAll(headersMap);
            Unit unit = Unit.OXO1;
            netWorkUtils.printParam(str, mapX111IO);
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + GetUserUnreadMessagesCount.URL;
            final O1XIiIO<Response<Integer>> o1XIiIO2 = new O1XIiIO<Response<Integer>>() { // from class: com.sma.smartv3.biz.OrderManager$getUserUnreadMessagesCount$$inlined$getV2$default$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<Integer> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity2 = activity;
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    C3006uq c3006uq = c3006uqLoadPopup;
                    LogUtils.m11128d(yn0.I0IIOi + response);
                    if (response == null) {
                        response = new Response<>();
                        response.setCode(-1000);
                    }
                    netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                    if (c3006uq != null) {
                        c3006uq.dismiss();
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
                }
            };
            AndroidNetworking.get(str2).addQueryParameter((Map<String, String>) userIdBody).setTag((Object) str2).addHeaders(headersMap).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Integer.class), new ParsedRequestListener<Response<Integer>>() { // from class: com.sma.smartv3.biz.OrderManager$getUserUnreadMessagesCount$$inlined$getV2$default$2
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<Integer> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO2.handleResponse(response);
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response;
                    StringBuilder sb = new StringBuilder();
                    sb.append("errorCode:");
                    Integer numValueOf = null;
                    sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                    sb.append(", errorBody:");
                    sb.append(aNError != null ? aNError.getErrorBody() : null);
                    LogUtils.m11128d(sb.toString());
                    if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                        numValueOf = Integer.valueOf(response.getCode());
                    } else if (aNError != null) {
                        numValueOf = Integer.valueOf(aNError.getErrorCode());
                    }
                    o1XIiIO2.handleError(String.valueOf(numValueOf));
                }
            });
        }
    }

    public final void iIXi1iiXI(boolean z) {
        f50891IO = z;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38110iO(@aa1 String orderId, @aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(orderId, "orderId");
        Intrinsics.X0O(callback, "callback");
        String strO001I = i72.OXO1.O001I();
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> mapDeleteAccountOrderBody = RequestBodyKt.deleteAccountOrderBody(strO001I, orderId);
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.OrderManager$deleteOrderList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                i1O0OXO1O.OXO1.OXO1("OrderManager deleteOrderList handleResponse -> " + str);
                callback.invoke2(Boolean.TRUE);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("OrderManager deleteOrderList handleError -> " + error);
                callback.invoke2(Boolean.FALSE);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), DeleteAccountOrderList.URL);
        String str = strConvertBaseUrl + DeleteAccountOrderList.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(mapDeleteAccountOrderBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + DeleteAccountOrderList.URL;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.biz.OrderManager$deleteOrderList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) mapDeleteAccountOrderBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.biz.OrderManager$deleteOrderList$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @aa1
    public final String iOO1ii1() {
        return XOO0ii0;
    }

    public final boolean iOOX010X() {
        return f50891IO;
    }

    @aa1
    /* JADX INFO: renamed from: iX */
    public final String m38111iX() {
        return XO0O10;
    }

    @aa1
    public final String iX1O1(@aa1 String payUrl, @aa1 String orderType) {
        Intrinsics.X0O(payUrl, "payUrl");
        Intrinsics.X0O(orderType, "orderType");
        if (Intrinsics.XOO0ii0(orderType, XO0O10)) {
            f50892iO = payUrl;
        }
        i72 i72Var = i72.OXO1;
        if (i72Var.O001I().length() == 0) {
            return "";
        }
        OIi0 = Intrinsics.XOO0ii0(payUrl, m38107I1());
        f50891IO = true;
        String string = StringsKt__StringsKt.iX1X1("").toString();
        q62 q62Var = q62.OXO1;
        String str = string + "&supCreate=" + q62Var.OXXiX0() + "&internalFlag=" + i72Var.XI1OX0IO() + "&pid=58";
        if (gk4.I0IIOi().XX0()) {
            str = str + StringsKt__StringsKt.iX1X1("&dark=dark").toString();
        }
        if (q62Var.OiO()) {
            str = str + StringsKt__StringsKt.iX1X1("&deviceType=ring").toString();
        }
        if (orderType.length() > 0) {
            str = str + StringsKt__StringsKt.iX1X1("&orderType=" + orderType).toString();
        }
        BleCache bleCache = BleCache.INSTANCE;
        if (bleCache.getMBleAddress().length() > 0) {
            str = str + StringsKt__StringsKt.iX1X1("&mac=" + oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null)).toString();
        }
        if (bleCache.getMBleName().length() > 0) {
            str = (str + StringsKt__StringsKt.iX1X1("&bleName=" + bleCache.getMBleName()).toString()) + StringsKt__StringsKt.iX1X1("&flag=" + bleCache.getMFirmwareFlag()).toString();
        }
        String string2 = StringsKt__StringsKt.iX1X1(X01IiOiIi() + payUrl + "?identity=" + i72Var.O001I() + str).toString();
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        StringBuilder sb = new StringBuilder();
        sb.append("OrderManager getVipPayWebUrl -> ");
        sb.append(string2);
        i1o0oxo1o.OXO1(sb.toString());
        return string2;
    }

    public final void iXiX011(boolean z) {
        OIi0 = z;
    }
}
