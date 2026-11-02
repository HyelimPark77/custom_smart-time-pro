package com.bestmafen.androidbase;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.mi4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSimpleWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleWebViewActivity.kt\ncom/bestmafen/androidbase/SimpleWebViewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class SimpleWebViewActivity extends BaseActivity {

    @aa1
    private final Lazy webView$delegate;

    public static final class OXO1 extends WebViewClient {
        public OXO1() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView r3, String r4) {
            Intrinsics.X0O(r3, "view");
            Intrinsics.X0O(r4, "url");
            LogUtils.v(new Object[]{"shouldOverrideUrlLoading -> url=" + r4});
            return super.shouldOverrideUrlLoading(r3, r4);
        }
    }

    public SimpleWebViewActivity() {
        this.webView$delegate = LazyKt__LazyJVMKt.iO(new mi4(this));
    }

    public static /* synthetic */ WebView OIX0iXi(SimpleWebViewActivity r0) {
        return webView_delegate$lambda$0(r0);
    }

    private final WebView getWebView() {
        return (WebView) getValue();
    }

    private static final WebView webView_delegate$lambda$0(SimpleWebViewActivity r1) {
        return (WebView) r1.findViewById(R.id.webView);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        WebSettings r0 = getWebView().getSettings();
        r0.setJavaScriptEnabled(true);
        r0.setUseWideViewPort(true);
        r0.setLoadWithOverviewMode(true);
        r0.setJavaScriptCanOpenWindowsAutomatically(true);
        r0.setLoadsImagesAutomatically(true);
        r0.setUserAgentString("Chrome Mobile");
        getWebView().setWebViewClient(new OXO1());
        String r1 = getMArg0();
        if (r1 == null) goto L6;
        getWebView().loadUrl(r1);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_simple_webview;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWebView().destroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, @tb1 KeyEvent r3) {
        if (getWebView().canGoBack() == false) goto L9;
        if (r2 != 4) goto L9;
        getWebView().goBack();
        return true;
    L9:
        return super.onKeyDown(r2, r3);
    }
}
