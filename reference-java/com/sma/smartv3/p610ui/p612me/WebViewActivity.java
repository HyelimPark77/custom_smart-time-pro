package com.sma.smartv3.p610ui.p612me;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.AccessToken;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class WebViewActivity extends BaseActivity {
    private static final int TYPE_HELP_GUIDE = 0;
    private boolean isAllowDirectBack;
    private boolean isUseWebViewTitle;

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private static final int TYPE_PROVACY_POLICY = -1;
    private static final int TYPE_USER_AGREEMENT = 1;
    private static final int TYPE_USER_WEB_TITLE = 2;
    private static final int TYPE_CHAIN_BREAKAGE = 3;
    private static final int TYPE_TRANSLATE_BUY = 4;
    private static final int TYPE_NO_TITLE = 99;

    @aa1
    private final Lazy webView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yw6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewActivity.webView_delegate$lambda$0(this.f12471IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zw6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewActivity.abhTitleCenter_delegate$lambda$0(this.f12708IO);
        }
    });

    @aa1
    private final Lazy abhTitleLeft$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ax6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewActivity.abhTitleLeft_delegate$lambda$0(this.f5605IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bx6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewActivity.abhTitleRight_delegate$lambda$0(this.f5845IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cx6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewActivity.abhTitleOtherRight_delegate$lambda$0(this.f6077IO);
        }
    });

    @aa1
    private final Lazy titleLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dx6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewActivity.titleLl_delegate$lambda$0(this.f6293IO);
        }
    });

    @aa1
    private String orderType = "";

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int IiI10X() {
            return WebViewActivity.TYPE_USER_AGREEMENT;
        }

        public final int O00() {
            return WebViewActivity.TYPE_TRANSLATE_BUY;
        }

        public final int OXO1() {
            return WebViewActivity.TYPE_CHAIN_BREAKAGE;
        }

        public final int XIi00iiXO() {
            return WebViewActivity.TYPE_HELP_GUIDE;
        }

        public final int XO0O10() {
            return WebViewActivity.TYPE_PROVACY_POLICY;
        }

        public final int XOO0ii0() {
            return WebViewActivity.TYPE_USER_WEB_TITLE;
        }

        /* JADX INFO: renamed from: iO */
        public final int m38573iO() {
            return WebViewActivity.TYPE_NO_TITLE;
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            i1O0OXO1O.OXO1.OXO1("webView onJsAlert ");
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            i1O0OXO1O.OXO1.OXO1("webView onPermissionRequest ");
            if (permissionRequest != null) {
                permissionRequest.grant(permissionRequest.getResources());
            }
            if (permissionRequest != null) {
                permissionRequest.getOrigin();
            }
        }
    }

    @Keep
    public static final class payStatusData {

        @aa1
        private final String result;

        /* JADX WARN: Multi-variable type inference failed */
        public payStatusData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ payStatusData copy$default(payStatusData paystatusdata, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paystatusdata.result;
            }
            return paystatusdata.copy(str);
        }

        @aa1
        public final String component1() {
            return this.result;
        }

        @aa1
        public final payStatusData copy(@aa1 String result) {
            Intrinsics.X0O(result, "result");
            return new payStatusData(result);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof payStatusData) && Intrinsics.XOO0ii0(this.result, ((payStatusData) obj).result);
        }

        @aa1
        public final String getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @aa1
        public String toString() {
            return "payStatusData(result=" + this.result + I000IiI1O.C2156iO.f1007iO;
        }

        public payStatusData(@aa1 String result) {
            Intrinsics.X0O(result, "result");
            this.result = result;
        }

        public /* synthetic */ payStatusData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(WebViewActivity webViewActivity) {
        return (TextView) webViewActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleLeft_delegate$lambda$0(WebViewActivity webViewActivity) {
        return (ImageView) webViewActivity.findViewById(R.id.abh_title_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(WebViewActivity webViewActivity) {
        return (ImageView) webViewActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(WebViewActivity webViewActivity) {
        return (ImageView) webViewActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleLeft() {
        return (ImageView) this.abhTitleLeft$delegate.getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final LinearLayout getTitleLl() {
        return (LinearLayout) this.titleLl$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reviseWebViewTitle$lambda$0(WebViewActivity webViewActivity, String str) {
        webViewActivity.getAbhTitleCenter().setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout titleLl_delegate$lambda$0(WebViewActivity webViewActivity) {
        return (LinearLayout) webViewActivity.findViewById(R.id.abh_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView webView_delegate$lambda$0(WebViewActivity webViewActivity) {
        return (WebView) webViewActivity.findViewById(R.id.webView);
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    @aa1
    public final String getOrderType() {
        return this.orderType;
    }

    public final WebView getWebView() {
        return (WebView) this.webView$delegate.getValue();
    }

    public void init(@tb1 Bundle bundle) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void initView() {
        int mArg1 = getMArg1();
        if (mArg1 == TYPE_PROVACY_POLICY) {
            getAbhTitleCenter().setText(R.string.privacy_policy);
        } else if (mArg1 == TYPE_HELP_GUIDE) {
            getAbhTitleCenter().setText(R.string.help_guide);
        } else if (mArg1 == TYPE_USER_AGREEMENT) {
            getAbhTitleCenter().setText(R.string.user_agreement);
        } else if (mArg1 == TYPE_CHAIN_BREAKAGE) {
            getAbhTitleCenter().setText(R.string.guide_chain_breakage);
        } else if (mArg1 == TYPE_TRANSLATE_BUY) {
            getAbhTitleCenter().setText(R.string.translate_buy);
        } else if (mArg1 == TYPE_NO_TITLE) {
            getAbhTitleLeft().setVisibility(8);
            getAbhTitleCenter().setVisibility(8);
            getAbhTitleOtherRight().setVisibility(8);
            getAbhTitleRight().setVisibility(8);
            getTitleLl().setVisibility(8);
        } else {
            this.isUseWebViewTitle = true;
        }
        WebSettings settings = getWebView().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        if (getMArg1() != TYPE_USER_WEB_TITLE || getMArg1() == TYPE_NO_TITLE) {
            settings.setUserAgentString("Chrome Mobile");
        }
        settings.setCacheMode(2);
        getWebView().setWebViewClient(new WebViewClient() { // from class: com.sma.smartv3.ui.me.WebViewActivity.initView.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                LogUtils.m11131v("webViewClient onPageFinished -> url=" + str);
                if (!WebViewActivity.this.isUseWebViewTitle() || webView == null) {
                    return;
                }
                LogUtils.m11131v(" view.title -> =" + webView.getTitle());
                LogUtils.m11131v(" view.url -> =" + str);
                XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(WebViewActivity.this), null, null, new WebViewActivity$initView$2$onPageFinished$1(WebViewActivity.this, webView, null), 3, null);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                LogUtils.m11131v("webViewClient onPageStarted -> url=" + str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Intrinsics.X0O(view, "view");
                Intrinsics.X0O(url, "url");
                LogUtils.m11131v("shouldOverrideUrlLoading -> url=" + url);
                if (oe5.m2764O0(url, "wexin://", false, 2, null) || oe5.m2764O0(url, "alipays://", false, 2, null) || oe5.m2764O0(url, "mqqapi://", false, 2, null)) {
                    try {
                        WebViewActivity webViewActivity = WebViewActivity.this;
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(url));
                        webViewActivity.startActivity(intent);
                    } catch (Exception unused) {
                        ToastUtils.showLong(WebViewActivity.this.getString(R.string.pay_error_tip), new Object[0]);
                    }
                    return true;
                }
                if (oe5.m2764O0(url, "https://www.codingiot.net/cofit/?code=", false, 2, null) || oe5.m2764O0(url, "https://www.codingiot.net/smarttimepro/?code=", false, 2, null)) {
                    WebViewActivity webViewActivity2 = WebViewActivity.this;
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(oe5.IXO0OOi(url, "https", "apphttps", false, 4, null)));
                    webViewActivity2.startActivity(intent2);
                    WebViewActivity.this.finish();
                    return true;
                }
                if (!oe5.m2764O0(url, "https://api.whatsapp.com", false, 2, null)) {
                    return super.shouldOverrideUrlLoading(view, url);
                }
                WebViewActivity webViewActivity3 = WebViewActivity.this;
                Intent intent3 = new Intent();
                intent3.setAction("android.intent.action.VIEW");
                intent3.setData(Uri.parse(url));
                webViewActivity3.startActivity(intent3);
                return true;
            }
        });
        String mArg0 = getMArg0();
        if (mArg0 != null) {
            LogUtils.m11128d("webView url " + mArg0);
            if (oe5.m2764O0(mArg0, "http://openapi.baidu.com/oauth/2.0/authorize", false, 2, null)) {
                getWebView().clearCache(true);
                getWebView().clearHistory();
                CookieManager.getInstance().removeAllCookies(null);
                CookieManager.getInstance().flush();
            }
            getWebView().loadUrl(mArg0);
            try {
                Uri uri = Uri.parse(oe5.IXO0OOi(mArg0, qu0.IiI10X, "", false, 4, null));
                String queryParameter = uri.getQueryParameter("orderType");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                this.orderType = queryParameter;
                String queryParameter2 = uri.getQueryParameter("identity");
                i1O0OXO1O.OXO1.OXO1("webView orderType = " + this.orderType + " , pid = " + queryParameter2);
            } catch (Exception e) {
                i1O0OXO1O.OXO1.OXO1("webView orderType = " + this.orderType + " , e = " + e);
            }
        }
        getWebView().addJavascriptInterface(this, "android");
        getWebView().setWebChromeClient(new XIi00iiXO());
    }

    public final boolean isAllowDirectBack() {
        return this.isAllowDirectBack;
    }

    public final boolean isUseWebViewTitle() {
        return this.isUseWebViewTitle;
    }

    public int layoutId() {
        return R.layout.activity_main_webview;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWebView().destroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @tb1 KeyEvent keyEvent) {
        if (!getWebView().canGoBack() || i != 4 || this.isAllowDirectBack) {
            return super.onKeyDown(i, keyEvent);
        }
        getWebView().goBack();
        return true;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!getWebView().canGoBack() || this.isAllowDirectBack) {
            finish();
        } else {
            getWebView().goBack();
        }
    }

    @JavascriptInterface
    public final void payStatusCallBackFall() {
        LogUtils.m11128d("webView payStatusCallBackFall");
        if (OrderManager.OXO1.XXX11i()) {
            return;
        }
        finish();
    }

    @JavascriptInterface
    public final void payStatusCallBackSuccess() {
        LogUtils.m11128d("webView payStatusCallBackSuccess");
        I01XX0.XIi00iiXO(I01XX0.XXI0XOIX, null, 2, null);
        if (OrderManager.OXO1.XXX11i()) {
            return;
        }
        finish();
    }

    @JavascriptInterface
    public final void prizeInfoSubmit() {
        LogUtils.m11128d("webView prizeInfoSubmit ");
        finish();
    }

    @JavascriptInterface
    public final void returnAllowDirectBack() {
        this.isAllowDirectBack = true;
    }

    @JavascriptInterface
    public final void reviseWebViewTitle(@aa1 final String title) {
        Intrinsics.X0O(title, "title");
        LogUtils.m11128d("webView reviseWebViewTitle webView.title = " + title);
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ex6
            @Override // java.lang.Runnable
            public final void run() {
                WebViewActivity.reviseWebViewTitle$lambda$0(this.f6515IO, title);
            }
        });
    }

    public final void setAllowDirectBack(boolean z) {
        this.isAllowDirectBack = z;
    }

    public final void setOrderType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.orderType = str;
    }

    public final void setUseWebViewTitle(boolean z) {
        this.isUseWebViewTitle = z;
    }

    @JavascriptInterface
    public final void toContact(@aa1 String type) {
        Intrinsics.X0O(type, "type");
        LogUtils.m11128d("webView toContact : type = " + type);
        int iHashCode = type.hashCode();
        if (iHashCode == -1106239763) {
            if (type.equals("outlook")) {
                UtilsKt.XXI(this, i72.OXO1.iOOX010X(), null, null, 12, null);
            }
        } else if (iHashCode == 28903346) {
            if (type.equals("instagram")) {
                UtilsKt.O10IXXX0X(this, i72.OXO1.IXXOO());
            }
        } else if (iHashCode == 497130182 && type.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
            UtilsKt.X1ii(this, i72.OXO1.i010I());
        }
    }

    @JavascriptInterface
    public final void toPermissionsSettings() {
        LogUtils.m11128d("webView toPermissionsSettings");
        hr1 hr1Var = hr1.OXO1;
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        hr1Var.Ii0i(app);
    }

    @JavascriptInterface
    public final void toSettings() {
        LogUtils.m11128d("webView toSettings");
        startActivity(new Intent("android.settings.SETTINGS"));
    }
}
