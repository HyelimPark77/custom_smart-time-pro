package com.sma.smartv3.p610ui.translate;

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
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.binding.BaseBindingActivity;
import com.sma.smartv3.databinding.ActivityTranslateChargeWebBinding;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class WebTransChargeActivity extends BaseBindingActivity<ActivityTranslateChargeWebBinding> {
    private boolean isAllowDirectBack;

    @aa1
    private final WebChromeClient webChromeClient = new OXO1();

    @aa1
    private final WebViewClient webViewClient = new XIi00iiXO();

    public static final class OXO1 extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            i1O0OXO1O.OXO1.OXO1("binding.webView onJsAlert ");
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            i1O0OXO1O.OXO1.OXO1("binding.webView onPermissionRequest ");
            if (permissionRequest != null) {
                permissionRequest.grant(permissionRequest.getResources());
            }
            if (permissionRequest != null) {
                permissionRequest.getOrigin();
            }
        }
    }

    @SourceDebugExtension({"SMAP\nWebTransChargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebTransChargeActivity.kt\ncom/sma/smartv3/ui/translate/WebTransChargeActivity$webViewClient$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,177:1\n29#2:178\n*S KotlinDebug\n*F\n+ 1 WebTransChargeActivity.kt\ncom/sma/smartv3/ui/translate/WebTransChargeActivity$webViewClient$1\n*L\n140#1:178\n*E\n"})
    public static final class XIi00iiXO extends WebViewClient {
        public XIi00iiXO() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String url) {
            Intrinsics.X0O(url, "url");
            if (oe5.m2764O0(url, "wexin://", false, 2, null) || oe5.m2764O0(url, "alipays://", false, 2, null) || oe5.m2764O0(url, "mqqapi://", false, 2, null)) {
                try {
                    WebTransChargeActivity webTransChargeActivity = WebTransChargeActivity.this;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(url));
                    webTransChargeActivity.startActivity(intent);
                } catch (Exception unused) {
                    ToastUtils.showLong(WebTransChargeActivity.this.getString(R.string.pay_error_tip), new Object[0]);
                }
                return true;
            }
            if (oe5.m2764O0(url, "https://www.codingiot.net/cofit/?code=", false, 2, null) || oe5.m2764O0(url, "https://www.codingiot.net/smarttimepro/?code=", false, 2, null)) {
                WebTransChargeActivity webTransChargeActivity2 = WebTransChargeActivity.this;
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse(oe5.IXO0OOi(url, "https", "apphttps", false, 4, null)));
                webTransChargeActivity2.startActivity(intent2);
                WebTransChargeActivity.this.finish();
                return true;
            }
            if (!oe5.m2764O0(url, "https://api.whatsapp.com", false, 2, null)) {
                return super.shouldOverrideUrlLoading(webView, url);
            }
            WebTransChargeActivity webTransChargeActivity3 = WebTransChargeActivity.this;
            Intent intent3 = new Intent();
            intent3.setAction("android.intent.action.VIEW");
            intent3.setData(Uri.parse(url));
            webTransChargeActivity3.startActivity(intent3);
            return true;
        }
    }

    private final void initWebview(String str) {
        ((ImageView) findViewById(R.id.abh_title_left)).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.qw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10697IO.finish();
            }
        });
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.translate_buy));
        WebSettings settings = getBinding().webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        int mArg1 = getMArg1();
        WebViewActivity.OXO1 oxo1 = WebViewActivity.Companion;
        if (mArg1 != oxo1.XOO0ii0() || getMArg1() == oxo1.m38573iO()) {
            settings.setUserAgentString("Chrome Mobile");
        }
        settings.setCacheMode(2);
        getBinding().webView.loadUrl(str);
        getBinding().webView.setWebChromeClient(this.webChromeClient);
        getBinding().webView.setWebViewClient(this.webViewClient);
    }

    @aa1
    public final WebChromeClient getWebChromeClient() {
        return this.webChromeClient;
    }

    @aa1
    public final WebViewClient getWebViewClient() {
        return this.webViewClient;
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
    public boolean onKeyDown(int i, @tb1 KeyEvent keyEvent) {
        if (!getBinding().webView.canGoBack() || i != 4 || this.isAllowDirectBack) {
            return super.onKeyDown(i, keyEvent);
        }
        getBinding().webView.goBack();
        return true;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!getBinding().webView.canGoBack() || this.isAllowDirectBack) {
            finish();
        } else {
            getBinding().webView.goBack();
        }
    }

    @Override // com.sma.smartv3.binding.BaseBindingActivity
    public void onViewCreated() {
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        i1O0OXO1O.OXO1.OXO1("WebTransChargeUrl:" + stringExtra);
        initWebview(stringExtra);
    }

    @JavascriptInterface
    public final void returnAllowDirectBack() {
        this.isAllowDirectBack = true;
    }

    public final void setAllowDirectBack(boolean z) {
        this.isAllowDirectBack = z;
    }

    @Override // com.sma.smartv3.binding.BaseBindingActivity
    @aa1
    public ActivityTranslateChargeWebBinding inflateBinding(@aa1 LayoutInflater inflater) {
        Intrinsics.X0O(inflater, "inflater");
        ActivityTranslateChargeWebBinding activityTranslateChargeWebBindingInflate = ActivityTranslateChargeWebBinding.inflate(getLayoutInflater());
        Intrinsics.O10IXXX0X(activityTranslateChargeWebBindingInflate, "inflate(...)");
        return activityTranslateChargeWebBindingInflate;
    }
}
