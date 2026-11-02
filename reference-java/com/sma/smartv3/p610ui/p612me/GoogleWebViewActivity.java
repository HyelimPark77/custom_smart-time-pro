package com.sma.smartv3.p610ui.p612me;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.GooglePayOrderData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetGooglePayCheckOrder;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.smart.playlib.SmartGooglePlayUtil;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nGoogleWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleWebViewActivity.kt\ncom/sma/smartv3/ui/me/GoogleWebViewActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,155:1\n325#2,11:156\n336#2:168\n347#2:187\n1#3:167\n383#4,18:169\n*S KotlinDebug\n*F\n+ 1 GoogleWebViewActivity.kt\ncom/sma/smartv3/ui/me/GoogleWebViewActivity\n*L\n115#1:156,11\n115#1:168\n115#1:187\n115#1:167\n115#1:169,18\n*E\n"})
public class GoogleWebViewActivity extends WebViewActivity {
    private long lastCheckOrderTime;

    @tb1
    private SmartGooglePlayUtil smartGooglePlayUtil;

    @aa1
    private String productId = "";

    @aa1
    private String orderNum = "";

    @aa1
    private String lastCheckOrderNum = "";

    @aa1
    private String lastCheckOrderToken = "";

    public static final class OXO1 implements SmartGooglePlayUtil.XIi00iiXO {
        public OXO1() {
        }

        @Override // com.smart.playlib.SmartGooglePlayUtil.XIi00iiXO
        public void XO0O10(String str) {
            a01.OXO1.IiI10X().put(b01.iIIIiIO0, str);
        }

        @Override // com.smart.playlib.SmartGooglePlayUtil.XIi00iiXO
        /* JADX INFO: renamed from: iO */
        public void mo38556iO(String msg) {
            Intrinsics.X0O(msg, "msg");
            i1O0OXO1O.OXO1.XIi00iiXO("smartGooglePlayUtil pay fail: " + msg);
            ToastUtils.showLong(R.string.voice_assistant_network_error);
        }

        @Override // com.smart.playlib.SmartGooglePlayUtil.XIi00iiXO
        public void onSuccess(String str) {
            i1O0OXO1O.OXO1.XIi00iiXO("smartGooglePlayUtil pay onSuccess: " + str);
            if (str == null) {
                return;
            }
            a01.OXO1.IiI10X().put(b01.iIIIiIO0, str);
            GoogleWebViewActivity.this.googlePayCheckOrder(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadTranslationUrl() {
        getWebView().loadUrl(oe5.IXO0OOi(Api.INSTANCE.getBASE_URL(), "/kotlinweb", "", false, 4, null) + "/orderDetail/#/translateOrderEn?result=1&orderType=Translate");
    }

    @aa1
    public final String getLastCheckOrderNum() {
        return this.lastCheckOrderNum;
    }

    public final long getLastCheckOrderTime() {
        return this.lastCheckOrderTime;
    }

    @aa1
    public final String getLastCheckOrderToken() {
        return this.lastCheckOrderToken;
    }

    @aa1
    public final String getOrderNum() {
        return this.orderNum;
    }

    @aa1
    public final String getProductId() {
        return this.productId;
    }

    @tb1
    public final SmartGooglePlayUtil getSmartGooglePlayUtil() {
        return this.smartGooglePlayUtil;
    }

    public final void googlePayCheckOrder(@aa1 String purchaseToken) {
        Intrinsics.X0O(purchaseToken, "purchaseToken");
        if (this.lastCheckOrderTime == 0 || !Intrinsics.XOO0ii0(this.lastCheckOrderToken, purchaseToken) || System.currentTimeMillis() - this.lastCheckOrderTime >= 1000) {
            this.lastCheckOrderTime = System.currentTimeMillis();
            this.lastCheckOrderNum = this.orderNum;
            this.lastCheckOrderToken = purchaseToken;
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            String appPackageName = AppUtils.getAppPackageName();
            Intrinsics.O10IXXX0X(appPackageName, "getAppPackageName(...)");
            String string = getString(R.string.app_name);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            HashMap<String, String> checkOrderBody = RequestBodyKt.getCheckOrderBody(appPackageName, string, this.productId, purchaseToken, this.orderNum);
            final O1XIiIO<GooglePayOrderData> o1XIiIO = new O1XIiIO<GooglePayOrderData>() { // from class: com.sma.smartv3.ui.me.GoogleWebViewActivity.googlePayCheckOrder.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(GooglePayOrderData googlePayOrderData) {
                    i1O0OXO1O.OXO1.OXO1("smartGooglePlayUtil handleResponse -> " + googlePayOrderData + ", orderType = " + GoogleWebViewActivity.this.getOrderType());
                    SmartGooglePlayUtil smartGooglePlayUtil = GoogleWebViewActivity.this.getSmartGooglePlayUtil();
                    if (smartGooglePlayUtil != null) {
                        smartGooglePlayUtil.I0iXXO();
                    }
                    a01.OXO1.IiI10X().remove(b01.iIIIiIO0);
                    String orderType = GoogleWebViewActivity.this.getOrderType();
                    if (!Intrinsics.XOO0ii0(orderType, "")) {
                        OrderManager orderManager = OrderManager.OXO1;
                        if (!Intrinsics.XOO0ii0(orderType, orderManager.m38111iX())) {
                            if (Intrinsics.XOO0ii0(orderType, orderManager.i010I())) {
                                GoogleWebViewActivity.this.getWebView().loadUrl(i0O111.OXO1.O10IXXX0X("1"));
                                return;
                            } else if (Intrinsics.XOO0ii0(orderType, orderManager.IXXOO())) {
                                GoogleWebViewActivity.this.loadTranslationUrl();
                                return;
                            } else {
                                GoogleWebViewActivity.this.payStatusCallBackSuccess();
                                return;
                            }
                        }
                    }
                    GoogleWebViewActivity.this.getWebView().loadUrl(OrderManager.m38106OX(OrderManager.OXO1, "1", null, null, 6, null));
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.OXO1("smartGooglePlayUtil handleError -> error = " + error + " , orderType = " + GoogleWebViewActivity.this.getOrderType());
                    SmartGooglePlayUtil smartGooglePlayUtil = GoogleWebViewActivity.this.getSmartGooglePlayUtil();
                    if (smartGooglePlayUtil != null) {
                        smartGooglePlayUtil.I0iXXO();
                    }
                    a01.OXO1.IiI10X().remove(b01.iIIIiIO0);
                    String orderType = GoogleWebViewActivity.this.getOrderType();
                    if (!Intrinsics.XOO0ii0(orderType, "")) {
                        OrderManager orderManager = OrderManager.OXO1;
                        if (!Intrinsics.XOO0ii0(orderType, orderManager.m38111iX())) {
                            if (Intrinsics.XOO0ii0(orderType, orderManager.i010I())) {
                                GoogleWebViewActivity.this.getWebView().loadUrl(i0O111.OXO1.O10IXXX0X("2"));
                                return;
                            } else {
                                GoogleWebViewActivity.this.payStatusCallBackSuccess();
                                return;
                            }
                        }
                    }
                    GoogleWebViewActivity.this.getWebView().loadUrl(OrderManager.m38106OX(OrderManager.OXO1, "2", null, null, 6, null));
                }
            };
            Map<String, String> headersMap = netWorkUtils.getHeadersMap();
            final Activity activity = null;
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
            String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetGooglePayCheckOrder.URL);
            String str = strConvertBaseUrl + GetGooglePayCheckOrder.URL;
            Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(checkOrderBody);
            mapX111IO.putAll(headersMap);
            Unit unit = Unit.OXO1;
            netWorkUtils.printParam(str, mapX111IO);
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + GetGooglePayCheckOrder.URL;
            final O1XIiIO<Response<GooglePayOrderData>> o1XIiIO2 = new O1XIiIO<Response<GooglePayOrderData>>() { // from class: com.sma.smartv3.ui.me.GoogleWebViewActivity$googlePayCheckOrder$$inlined$postJsonV2$default$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<GooglePayOrderData> response) {
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
            AndroidNetworking.post(str2).addHeaders(headersMap).addApplicationJsonBody(checkOrderBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, GooglePayOrderData.class), new ParsedRequestListener<Response<GooglePayOrderData>>() { // from class: com.sma.smartv3.ui.me.GoogleWebViewActivity$googlePayCheckOrder$$inlined$postJsonV2$default$2
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<GooglePayOrderData> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO2.handleResponse(response);
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    o1XIiIO2.handleError(String.valueOf(aNError));
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.p612me.WebViewActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        if (q62.OXO1.iO1()) {
            this.smartGooglePlayUtil = SmartGooglePlayUtil.XOO0ii0.OXO1();
        }
    }

    @JavascriptInterface
    public final void overseasPay(@aa1 String data) {
        SmartGooglePlayUtil smartGooglePlayUtil;
        Intrinsics.X0O(data, "data");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.XIi00iiXO("overseasPay  " + data);
        try {
            JSONObject jSONObject = new JSONObject(data);
            String string = jSONObject.getString("eleId");
            Intrinsics.O10IXXX0X(string, "getString(...)");
            this.productId = string;
            String string2 = jSONObject.getString("orderNum");
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            this.orderNum = string2;
            boolean z = StringsKt__StringsKt.iIi011O(data, "isSubscribeGoods", false, 2, null) ? jSONObject.getBoolean("isSubscribeGoods") : false;
            q62 q62Var = q62.OXO1;
            if (!q62Var.iO1() || this.productId.length() <= 0 || this.orderNum.length() <= 0) {
                i1o0oxo1o.XIi00iiXO("overseasPay error :  isSupportGooglePay = " + q62Var.iO1() + " ,  " + this.orderNum + " , " + this.productId);
                ToastUtils.showLong(R.string.voice_assistant_network_error);
                return;
            }
            if (this.productId.length() > 0) {
                String string3 = a01.OXO1.IiI10X().getString(b01.iIIIiIO0);
                if (!Intrinsics.XOO0ii0(string3, "") && (smartGooglePlayUtil = this.smartGooglePlayUtil) != null) {
                    Intrinsics.XXI(string3);
                    smartGooglePlayUtil.XXI(string3);
                }
                SmartGooglePlayUtil smartGooglePlayUtil2 = this.smartGooglePlayUtil;
                if (smartGooglePlayUtil2 != null) {
                    smartGooglePlayUtil2.X0O(this.productId, this, z);
                }
            } else {
                ToastUtils.showLong("error : productId is null", new Object[0]);
            }
            SmartGooglePlayUtil smartGooglePlayUtil3 = this.smartGooglePlayUtil;
            if (smartGooglePlayUtil3 != null) {
                smartGooglePlayUtil3.XiOIii1(new OXO1());
            }
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO("overseasPay error : " + e.getMessage());
            ToastUtils.showLong(R.string.voice_assistant_network_error);
        }
    }

    public final void setLastCheckOrderNum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.lastCheckOrderNum = str;
    }

    public final void setLastCheckOrderTime(long j) {
        this.lastCheckOrderTime = j;
    }

    public final void setLastCheckOrderToken(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.lastCheckOrderToken = str;
    }

    public final void setOrderNum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.orderNum = str;
    }

    public final void setProductId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.productId = str;
    }

    public final void setSmartGooglePlayUtil(@tb1 SmartGooglePlayUtil smartGooglePlayUtil) {
        this.smartGooglePlayUtil = smartGooglePlayUtil;
    }
}
