package com.sma.smartv3.ui.me;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ax6;
import com.android.mltcode.paycertificationapi.bx6;
import com.android.mltcode.paycertificationapi.cx6;
import com.android.mltcode.paycertificationapi.dx6;
import com.android.mltcode.paycertificationapi.ex6;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yw6;
import com.android.mltcode.paycertificationapi.zw6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.AccessToken;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class WebViewActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    private static final int TYPE_CHAIN_BREAKAGE = 0;
    private static final int TYPE_HELP_GUIDE = 0;
    private static final int TYPE_NO_TITLE = 0;
    private static final int TYPE_PROVACY_POLICY = 0;
    private static final int TYPE_TRANSLATE_BUY = 0;
    private static final int TYPE_USER_AGREEMENT = 0;
    private static final int TYPE_USER_WEB_TITLE = 0;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleLeft$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    private boolean isAllowDirectBack;
    private boolean isUseWebViewTitle;

    @aa1
    private String orderType;

    @aa1
    private final Lazy titleLl$delegate;

    @aa1
    private final Lazy webView$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public final int IiI10X() {
            return WebViewActivity.access$getTYPE_USER_AGREEMENT$cp();
        }

        public final int O00() {
            return WebViewActivity.access$getTYPE_TRANSLATE_BUY$cp();
        }

        public final int OXO1() {
            return WebViewActivity.access$getTYPE_CHAIN_BREAKAGE$cp();
        }

        public final int XIi00iiXO() {
            return WebViewActivity.access$getTYPE_HELP_GUIDE$cp();
        }

        public final int XO0O10() {
            return WebViewActivity.access$getTYPE_PROVACY_POLICY$cp();
        }

        public final int XOO0ii0() {
            return WebViewActivity.access$getTYPE_USER_WEB_TITLE$cp();
        }

        public final int iO() {
            return WebViewActivity.access$getTYPE_NO_TITLE$cp();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO extends WebChromeClient {
        public XIi00iiXO() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView r1, String r2, String r3, JsResult r4) {
            i1O0OXO1O.OXO1.OXO1("webView onJsAlert ");
            if (r4 == null) goto L7;
            r4.confirm();
            return true;
        L7:
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest r3) {
            i1O0OXO1O.OXO1.OXO1("webView onPermissionRequest ");
            if (r3 == null) goto L5;
            r3.grant(r3.getResources());
        L5:
            if (r3 == null) goto L8;
            r3.getOrigin();
            return;
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

        public static /* synthetic */ payStatusData copy$default(payStatusData r0, String r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.result;
        L6:
            return r0.copy(r1);
        }

        @aa1
        public final String component1() {
            return this.result;
        }

        @aa1
        public final payStatusData copy(@aa1 String r2) {
            Intrinsics.X0O(r2, "result");
            return new payStatusData(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof payStatusData) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.XOO0ii0(this.result, ((payStatusData) r4).result) == true) goto L11;
            return false;
        L11:
            return true;
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
            return "payStatusData(result=" + this.result + I000IiI1O.iO.iO;
        }

        public payStatusData(@aa1 String r2) {
            Intrinsics.X0O(r2, "result");
            this.result = r2;
        }

        public /* synthetic */ payStatusData(String r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "";
        L5:
            this(r1);
        }
    }

    static {
        Companion = new OXO1(null);
        TYPE_PROVACY_POLICY = -1;
        TYPE_USER_AGREEMENT = 1;
        TYPE_USER_WEB_TITLE = 2;
        TYPE_CHAIN_BREAKAGE = 3;
        TYPE_TRANSLATE_BUY = 4;
        TYPE_NO_TITLE = 99;
    }

    public WebViewActivity() {
        this.webView$delegate = LazyKt__LazyJVMKt.iO(new yw6(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new zw6(this));
        this.abhTitleLeft$delegate = LazyKt__LazyJVMKt.iO(new ax6(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new bx6(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new cx6(this));
        this.titleLl$delegate = LazyKt__LazyJVMKt.iO(new dx6(this));
        this.orderType = "";
    }

    public static /* synthetic */ TextView I0iXXO(WebViewActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout I1XOi1(WebViewActivity r0) {
        return titleLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ WebView O10IXXX0X(WebViewActivity r0) {
        return webView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(WebViewActivity r0, String r1) {
        reviseWebViewTitle$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView X0O(WebViewActivity r0) {
        return abhTitleLeft_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X1ii(WebViewActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(WebViewActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(WebViewActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleLeft_delegate$lambda$0(WebViewActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_left);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(WebViewActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(WebViewActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ int access$getTYPE_CHAIN_BREAKAGE$cp() {
        return TYPE_CHAIN_BREAKAGE;
    }

    public static final /* synthetic */ int access$getTYPE_HELP_GUIDE$cp() {
        return TYPE_HELP_GUIDE;
    }

    public static final /* synthetic */ int access$getTYPE_NO_TITLE$cp() {
        return TYPE_NO_TITLE;
    }

    public static final /* synthetic */ int access$getTYPE_PROVACY_POLICY$cp() {
        return TYPE_PROVACY_POLICY;
    }

    public static final /* synthetic */ int access$getTYPE_TRANSLATE_BUY$cp() {
        return TYPE_TRANSLATE_BUY;
    }

    public static final /* synthetic */ int access$getTYPE_USER_AGREEMENT$cp() {
        return TYPE_USER_AGREEMENT;
    }

    public static final /* synthetic */ int access$getTYPE_USER_WEB_TITLE$cp() {
        return TYPE_USER_WEB_TITLE;
    }

    private final ImageView getAbhTitleLeft() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final LinearLayout getTitleLl() {
        return (LinearLayout) getValue();
    }

    private static final void reviseWebViewTitle$lambda$0(WebViewActivity r0, String r1) {
        r0.getAbhTitleCenter().setText(r1);
    }

    private static final LinearLayout titleLl_delegate$lambda$0(WebViewActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.abh_title);
    }

    private static final WebView webView_delegate$lambda$0(WebViewActivity r1) {
        return (WebView) r1.findViewById(R.id.webView);
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    @aa1
    public final String getOrderType() {
        return this.orderType;
    }

    public final WebView getWebView() {
        return (WebView) getValue();
    }

    public void init(@tb1 Bundle r1) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void initView() {
        int r0 = getMArg1();
        if (r0 != TYPE_PROVACY_POLICY) goto L6;
        getAbhTitleCenter().setText(R.string.privacy_policy);
    L21:
        WebSettings r1 = getWebView().getSettings();
        r1.setJavaScriptEnabled(true);
        r1.setUseWideViewPort(true);
        r1.setLoadWithOverviewMode(true);
        r1.setJavaScriptCanOpenWindowsAutomatically(true);
        r1.setLoadsImagesAutomatically(true);
        r1.setDomStorageEnabled(true);
        r1.setMediaPlaybackRequiresUserGesture(false);
        r1.setAllowFileAccess(true);
        if (getMArg1() == TYPE_USER_WEB_TITLE) goto L24;
    L25:
        r1.setUserAgentString("Chrome Mobile");
    L26:
        r1.setCacheMode(2);
        getWebView().setWebViewClient(new AnonymousClass2(this));
        String r6 = getMArg0();
        if (r6 == null) goto L40;
        LogUtils.d(new Object[]{"webView url " + r6});
        if (oe5.O0(r6, "http://openapi.baidu.com/oauth/2.0/authorize", false, 2, null) == false) goto L31;
        getWebView().clearCache(true);
        getWebView().clearHistory();
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    L31:
        getWebView().loadUrl(r6);
        Uri r2 = Uri.parse(oe5.IXO0OOi(r6, qu0.IiI10X, "", false, 4, null));     // Catch: Exception -> L35
        String r3 = r2.getQueryParameter("orderType");     // Catch: Exception -> L35
        if (r3 != null) goto L37;
        r3 = "";
    L37:
        this.orderType = r3;     // Catch: Exception -> L35
        String r4 = r2.getQueryParameter("identity");     // Catch: Exception -> L35
        i1O0OXO1O.OXO1.OXO1("webView orderType = " + this.orderType + " , pid = " + r4);     // Catch: Exception -> L35
    L35:
        e = move-exception;
        i1O0OXO1O.OXO1.OXO1("webView orderType = " + this.orderType + " , e = " + e);
    L40:
        getWebView().addJavascriptInterface(this, "android");
        getWebView().setWebChromeClient(new XIi00iiXO());
        return;
    L24:
        if (getMArg1() != TYPE_NO_TITLE) goto L26;
    L6:
        if (r0 != TYPE_HELP_GUIDE) goto L9;
        getAbhTitleCenter().setText(R.string.help_guide);
        goto L21
    L9:
        if (r0 != TYPE_USER_AGREEMENT) goto L12;
        getAbhTitleCenter().setText(R.string.user_agreement);
        goto L21
    L12:
        if (r0 != TYPE_CHAIN_BREAKAGE) goto L15;
        getAbhTitleCenter().setText(R.string.guide_chain_breakage);
        goto L21
    L15:
        if (r0 != TYPE_TRANSLATE_BUY) goto L18;
        getAbhTitleCenter().setText(R.string.translate_buy);
        goto L21
    L18:
        if (r0 != TYPE_NO_TITLE) goto L20;
        getAbhTitleLeft().setVisibility(8);
        getAbhTitleCenter().setVisibility(8);
        getAbhTitleOtherRight().setVisibility(8);
        getAbhTitleRight().setVisibility(8);
        getTitleLl().setVisibility(8);
        goto L21
    L20:
        this.isUseWebViewTitle = true;
        goto L21
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
    public boolean onKeyDown(int r2, @tb1 KeyEvent r3) {
        if (getWebView().canGoBack() == false) goto L11;
        if (r2 != 4) goto L11;
        if (this.isAllowDirectBack == true) goto L11;
        getWebView().goBack();
        return true;
    L11:
        return super.onKeyDown(r2, r3);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (getWebView().canGoBack() == true) goto L5;
    L8:
        finish();
        return;
    L5:
        if (this.isAllowDirectBack == true) goto L8;
        getWebView().goBack();
    }

    @JavascriptInterface
    public final void payStatusCallBackFall() {
        LogUtils.d(new Object[]{"webView payStatusCallBackFall"});
        if (OrderManager.OXO1.XXX11i() == true) goto L6;
        finish();
        return;
    }

    @JavascriptInterface
    public final void payStatusCallBackSuccess() {
        LogUtils.d(new Object[]{"webView payStatusCallBackSuccess"});
        I01XX0.XIi00iiXO(I01XX0.XXI0XOIX, null, 2, null);
        if (OrderManager.OXO1.XXX11i() == true) goto L6;
        finish();
        return;
    }

    @JavascriptInterface
    public final void prizeInfoSubmit() {
        LogUtils.d(new Object[]{"webView prizeInfoSubmit "});
        finish();
    }

    @JavascriptInterface
    public final void returnAllowDirectBack() {
        this.isAllowDirectBack = true;
    }

    @JavascriptInterface
    public final void reviseWebViewTitle(@aa1 final String r3) {
        Intrinsics.X0O(r3, "title");
        LogUtils.d(new Object[]{"webView reviseWebViewTitle webView.title = " + r3});
        runOnUiThread(new ex6(this, r3));
    }

    public final void setAllowDirectBack(boolean r1) {
        this.isAllowDirectBack = r1;
    }

    public final void setOrderType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderType = r2;
    }

    public final void setUseWebViewTitle(boolean r1) {
        this.isUseWebViewTitle = r1;
    }

    @JavascriptInterface
    public final void toContact(@aa1 String r7) {
        Intrinsics.X0O(r7, "type");
        LogUtils.d(new Object[]{"webView toContact : type = " + r7});
        int r0 = r7.hashCode();
        if (r0 == (-1106239763)) goto L20;
        if (r0 == 28903346) goto L15;
        if (r0 == 497130182) goto L10;
        return;
    L10:
        if (r7.equals(AccessToken.DEFAULT_GRAPH_DOMAIN) == false) goto L25;
        UtilsKt.X1ii(this, i72.OXO1.i010I());
        return;
    L25:
        return;
    L15:
        if (r7.equals("instagram") == false) goto L26;
        UtilsKt.O10IXXX0X(this, i72.OXO1.IXXOO());
        return;
    L26:
        return;
    L20:
        if (r7.equals("outlook") == true) goto L22;
        return;
    L22:
        UtilsKt.XXI(this, i72.OXO1.iOOX010X(), null, null, 12, null);
    }

    @JavascriptInterface
    public final void toPermissionsSettings() {
        LogUtils.d(new Object[]{"webView toPermissionsSettings"});
        hr1 r0 = hr1.OXO1;
        Application r1 = Utils.getApp();
        Intrinsics.O10IXXX0X(r1, "getApp(...)");
        r0.Ii0i(r1);
    }

    @JavascriptInterface
    public final void toSettings() {
        LogUtils.d(new Object[]{"webView toSettings"});
        startActivity(new Intent("android.settings.SETTINGS"));
    }
}
