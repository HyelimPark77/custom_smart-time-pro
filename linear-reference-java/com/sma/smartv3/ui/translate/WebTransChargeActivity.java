package com.sma.smartv3.ui.translate;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.qw6;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.binding.BaseBindingActivity;
import com.sma.smartv3.databinding.ActivityTranslateChargeWebBinding;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class WebTransChargeActivity extends BaseBindingActivity<ActivityTranslateChargeWebBinding> {
    private boolean isAllowDirectBack;

    @aa1
    private final WebChromeClient webChromeClient;

    @aa1
    private final WebViewClient webViewClient;

    public static final class OXO1 extends WebChromeClient {
        public OXO1() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView r1, String r2, String r3, JsResult r4) {
            i1O0OXO1O.OXO1.OXO1("binding.webView onJsAlert ");
            if (r4 == null) goto L7;
            r4.confirm();
            return true;
        L7:
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest r3) {
            i1O0OXO1O.OXO1.OXO1("binding.webView onPermissionRequest ");
            if (r3 == null) goto L5;
            r3.grant(r3.getResources());
        L5:
            if (r3 == null) goto L8;
            r3.getOrigin();
            return;
        }
    }

    @SourceDebugExtension({"SMAP\nWebTransChargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebTransChargeActivity.kt\ncom/sma/smartv3/ui/translate/WebTransChargeActivity$webViewClient$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,177:1\n29#2:178\n*S KotlinDebug\n*F\n+ 1 WebTransChargeActivity.kt\ncom/sma/smartv3/ui/translate/WebTransChargeActivity$webViewClient$1\n*L\n140#1:178\n*E\n"})
    public static final class XIi00iiXO extends WebViewClient {
        public final /* synthetic */ WebTransChargeActivity OXO1;

        public XIi00iiXO(WebTransChargeActivity r1) {
            this.OXO1 = r1;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView r1, String r2) {
            super.onPageFinished(r1, r2);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView r1, String r2, Bitmap r3) {
            super.onPageStarted(r1, r2, r3);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView r13, String r14) {
            Intrinsics.X0O(r14, "url");
            if (oe5.O0(r14, "wexin://", false, 2, null) == true) goto L26;
            if (oe5.O0(r14, "alipays://", false, 2, null) == true) goto L26;
            if (oe5.O0(r14, "mqqapi://", false, 2, null) == true) goto L26;
            if (oe5.O0(r14, "https://www.codingiot.net/cofit/?code=", false, 2, null) == false) goto L12;
        L20:
            WebTransChargeActivity r15 = this.OXO1;
            Intent r0 = new Intent();
            r0.setAction("android.intent.action.VIEW");
            r0.setData(Uri.parse(oe5.IXO0OOi(r14, "https", "apphttps", false, 4, null)));
            r15.startActivity(r0);
            this.OXO1.finish();
            return true;
        L12:
            if (oe5.O0(r14, "https://www.codingiot.net/smarttimepro/?code=", false, 2, null) == true) goto L20;
            if (oe5.O0(r14, "https://api.whatsapp.com", false, 2, null) == false) goto L19;
            WebTransChargeActivity r16 = this.OXO1;
            Intent r1 = new Intent();
            r1.setAction("android.intent.action.VIEW");
            r1.setData(Uri.parse(r14));
            r16.startActivity(r1);
            return true;
        L19:
            return super.shouldOverrideUrlLoading(r13, r14);
        L26:
            WebTransChargeActivity r17 = this.OXO1;     // Catch: Exception -> L24
            Intent r18 = new Intent();     // Catch: Exception -> L24
            r18.setAction("android.intent.action.VIEW");     // Catch: Exception -> L24
            r18.setData(Uri.parse(r14));     // Catch: Exception -> L24
            r17.startActivity(r18);     // Catch: Exception -> L24
        L25:
            return true;
        L24:
            ToastUtils.showLong(this.OXO1.getString(R.string.pay_error_tip), new Object[0]);
            goto L25
        }
    }

    public WebTransChargeActivity() {
        this.webChromeClient = new OXO1();
        this.webViewClient = new XIi00iiXO(this);
    }

    public static /* synthetic */ void I0iXXO(WebTransChargeActivity r0, View r1) {
        initWebview$lambda$0(r0, r1);
    }

    private final void initWebview(String r5) {
        ((ImageView) findViewById(R.id.abh_title_left)).setOnClickListener(new qw6(this));
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.translate_buy));
        WebSettings r0 = getBinding().webView.getSettings();
        r0.setJavaScriptEnabled(true);
        r0.setUseWideViewPort(true);
        r0.setLoadWithOverviewMode(true);
        r0.setJavaScriptCanOpenWindowsAutomatically(true);
        r0.setLoadsImagesAutomatically(true);
        r0.setDomStorageEnabled(true);
        r0.setMediaPlaybackRequiresUserGesture(false);
        r0.setAllowFileAccess(true);
        int r1 = getMArg1();
        WebViewActivity.OXO1 r2 = WebViewActivity.Companion;
        if (r1 == r2.XOO0ii0()) goto L5;
    L6:
        r0.setUserAgentString("Chrome Mobile");
    L7:
        r0.setCacheMode(2);
        getBinding().webView.loadUrl(r5);
        getBinding().webView.setWebChromeClient(this.webChromeClient);
        getBinding().webView.setWebViewClient(this.webViewClient);
        return;
    L5:
        if (getMArg1() != r2.iO()) goto L7;
        goto L6
    }

    private static final void initWebview$lambda$0(WebTransChargeActivity r0, View r1) {
        r0.finish();
    }

    @aa1
    public final WebChromeClient getWebChromeClient() {
        return this.webChromeClient;
    }

    @aa1
    public final WebViewClient getWebViewClient() {
        return this.webViewClient;
    }

    @Override // com.sma.smartv3.binding.BaseBindingActivity
    public /* bridge */ /* synthetic */ ViewBinding inflateBinding(LayoutInflater r1) {
        return inflateBinding(r1);
    }

    public final boolean isAllowDirectBack() {
        return this.isAllowDirectBack;
    }

    @Override // skin.support.app.SkinCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getBinding().webView.destroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, @tb1 KeyEvent r3) {
        if (getBinding().webView.canGoBack() == false) goto L11;
        if (r2 != 4) goto L11;
        if (this.isAllowDirectBack == true) goto L11;
        getBinding().webView.goBack();
        return true;
    L11:
        return super.onKeyDown(r2, r3);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (getBinding().webView.canGoBack() == true) goto L5;
    L8:
        finish();
        return;
    L5:
        if (this.isAllowDirectBack == true) goto L8;
        getBinding().webView.goBack();
    }

    @Override // com.sma.smartv3.binding.BaseBindingActivity
    public void onViewCreated() {
        String r0 = getIntent().getStringExtra("url");
        if (r0 != null) goto L5;
        r0 = "";
    L5:
        i1O0OXO1O.OXO1.OXO1("WebTransChargeUrl:" + r0);
        initWebview(r0);
    }

    @JavascriptInterface
    public final void returnAllowDirectBack() {
        this.isAllowDirectBack = true;
    }

    public final void setAllowDirectBack(boolean r1) {
        this.isAllowDirectBack = r1;
    }

    @Override // com.sma.smartv3.binding.BaseBindingActivity
    @aa1
    public ActivityTranslateChargeWebBinding inflateBinding(@aa1 LayoutInflater r2) {
        Intrinsics.X0O(r2, "inflater");
        ActivityTranslateChargeWebBinding r3 = ActivityTranslateChargeWebBinding.inflate(getLayoutInflater());
        Intrinsics.O10IXXX0X(r3, "inflate(...)");
        return r3;
    }
}
