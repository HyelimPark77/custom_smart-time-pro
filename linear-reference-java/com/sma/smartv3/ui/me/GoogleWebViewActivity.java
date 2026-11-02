package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.GooglePayOrderData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetGooglePayCheckOrder;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.smart.playlib.SmartGooglePlayUtil;
import java.lang.reflect.Type;
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

    @aa1
    private String lastCheckOrderNum;
    private long lastCheckOrderTime;

    @aa1
    private String lastCheckOrderToken;

    @aa1
    private String orderNum;

    @aa1
    private String productId;

    @tb1
    private SmartGooglePlayUtil smartGooglePlayUtil;

    public static final class OXO1 implements SmartGooglePlayUtil.XIi00iiXO {
        public final /* synthetic */ GoogleWebViewActivity OXO1;

        public OXO1(GoogleWebViewActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.smart.playlib.SmartGooglePlayUtil.XIi00iiXO
        public void XO0O10(String r3) {
            a01.OXO1.IiI10X().put(b01.iIIIiIO0, r3);
        }

        @Override // com.smart.playlib.SmartGooglePlayUtil.XIi00iiXO
        public void iO(String r4) {
            Intrinsics.X0O(r4, "msg");
            i1O0OXO1O.OXO1.XIi00iiXO("smartGooglePlayUtil pay fail: " + r4);
            ToastUtils.showLong(R.string.voice_assistant_network_error);
        }

        @Override // com.smart.playlib.SmartGooglePlayUtil.XIi00iiXO
        public void onSuccess(String r4) {
            i1O0OXO1O.OXO1.XIi00iiXO("smartGooglePlayUtil pay onSuccess: " + r4);
            if (r4 != null) goto L5;
            return;
        L5:
            a01.OXO1.IiI10X().put(b01.iIIIiIO0, r4);
            this.OXO1.googlePayCheckOrder(r4);
        }
    }

    public GoogleWebViewActivity() {
        this.productId = "";
        this.orderNum = "";
        this.lastCheckOrderNum = "";
        this.lastCheckOrderToken = "";
    }

    public static final /* synthetic */ void access$loadTranslationUrl(GoogleWebViewActivity r0) {
        r0.loadTranslationUrl();
    }

    private final void loadTranslationUrl() {
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

    public final void googlePayCheckOrder(@aa1 String r11) {
        Intrinsics.X0O(r11, "purchaseToken");
        if (this.lastCheckOrderTime != 0) goto L5;
    L9:
        this.lastCheckOrderTime = System.currentTimeMillis();
        this.lastCheckOrderNum = this.orderNum;
        this.lastCheckOrderToken = r11;
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = AppUtils.getAppPackageName();
        Intrinsics.O10IXXX0X(r1, "getAppPackageName(...)");
        String r2 = getString(R.string.app_name);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        HashMap<String, String> r12 = RequestBodyKt.getCheckOrderBody(r1, r2, this.productId, r11, this.orderNum);
        final O1XIiIO<GooglePayOrderData> r3 = new AnonymousClass1(this);
        Map<String, String> r4 = r0.getHeadersMap();
        final Activity r5 = null;
        final uq r6 = r0.loadPopup(null, null);
        String r7 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetGooglePayCheckOrder.URL);
        String r8 = r7 + GetGooglePayCheckOrder.URL;
        Map<String, ? extends Object> r9 = kotlin.collections.OXO1.X111IO(r12);
        r9.putAll(r4);
        Unit r10 = Unit.OXO1;
        r0.printParam(r8, r9);
        NetWork r13 = NetWork.OXO1;
        String r14 = r7 + GetGooglePayCheckOrder.URL;
        final O1XIiIO<Response<GooglePayOrderData>> r15 = new GoogleWebViewActivity$googlePayCheckOrder$$inlined$postJsonV2$default$1(r5, r3, r6);
        AndroidNetworking.post(r14).addHeaders(r4).addApplicationJsonBody(r12).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{GooglePayOrderData.class}), new GoogleWebViewActivity$googlePayCheckOrder$$inlined$postJsonV2$default$2(r15));
        return;
    L5:
        if (Intrinsics.XOO0ii0(this.lastCheckOrderToken, r11) == false) goto L9;
        if ((System.currentTimeMillis() - this.lastCheckOrderTime) >= 1000) goto L9;
    }

    @Override // com.sma.smartv3.ui.me.WebViewActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        if (q62.OXO1.iO1() == false) goto L6;
        this.smartGooglePlayUtil = SmartGooglePlayUtil.XOO0ii0.OXO1();
        return;
    }

    @JavascriptInterface
    public final void overseasPay(@aa1 String r8) {
        Intrinsics.X0O(r8, "data");
        i1O0OXO1O r2 = i1O0OXO1O.OXO1;
        r2.XIi00iiXO("overseasPay  " + r8);
        JSONObject r4 = new JSONObject(r8);     // Catch: Exception -> L6
        String r5 = r4.getString("eleId");     // Catch: Exception -> L6
        Intrinsics.O10IXXX0X(r5, "getString(...)");     // Catch: Exception -> L6
        this.productId = r5;     // Catch: Exception -> L6
        String r6 = r4.getString("orderNum");     // Catch: Exception -> L6
        Intrinsics.O10IXXX0X(r6, "getString(...)");     // Catch: Exception -> L6
        this.orderNum = r6;     // Catch: Exception -> L6
        if (StringsKt__StringsKt.iIi011O(r8, "isSubscribeGoods", false, 2, null) == false) goto L8;
        boolean r9 = r4.getBoolean("isSubscribeGoods");     // Catch: Exception -> L6
    L9:
        q62 r0 = q62.OXO1;     // Catch: Exception -> L6
        if (r0.iO1() == true) goto L12;
    L30:
        r2.XIi00iiXO("overseasPay error :  isSupportGooglePay = " + r0.iO1() + " ,  " + this.orderNum + " , " + this.productId);     // Catch: Exception -> L6
        ToastUtils.showLong(R.string.voice_assistant_network_error);     // Catch: Exception -> L6
        return;
    L12:
        if (this.productId.length() <= 0) goto L30;
        if (this.orderNum.length() <= 0) goto L30;
        if (this.productId.length() <= 0) goto L25;
        String r1 = a01.OXO1.IiI10X().getString(b01.iIIIiIO0);     // Catch: Exception -> L6
        if (Intrinsics.XOO0ii0(r1, "") == true) goto L22;
        SmartGooglePlayUtil r3 = this.smartGooglePlayUtil;     // Catch: Exception -> L6
        if (r3 == null) goto L22;
        Intrinsics.XXI(r1);     // Catch: Exception -> L6
        r3.XXI(r1);     // Catch: Exception -> L6
    L22:
        SmartGooglePlayUtil r7 = this.smartGooglePlayUtil;     // Catch: Exception -> L6
        if (r7 == null) goto L26;
        r7.X0O(this.productId, this, r9);     // Catch: Exception -> L6
    L26:
        SmartGooglePlayUtil r10 = this.smartGooglePlayUtil;     // Catch: Exception -> L6
        if (r10 == null) goto L35;
        r10.XiOIii1(new OXO1(this));     // Catch: Exception -> L6
        return;
    L35:
        return;
    L25:
        ToastUtils.showLong("error : productId is null", new Object[0]);     // Catch: Exception -> L6
        goto L26
    L8:
        r9 = false;
    L6:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO("overseasPay error : " + e.getMessage());
        ToastUtils.showLong(R.string.voice_assistant_network_error);
    }

    public final void setLastCheckOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.lastCheckOrderNum = r2;
    }

    public final void setLastCheckOrderTime(long r1) {
        this.lastCheckOrderTime = r1;
    }

    public final void setLastCheckOrderToken(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.lastCheckOrderToken = r2;
    }

    public final void setOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderNum = r2;
    }

    public final void setProductId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.productId = r2;
    }

    public final void setSmartGooglePlayUtil(@tb1 SmartGooglePlayUtil r1) {
        this.smartGooglePlayUtil = r1;
    }
}
