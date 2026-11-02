package com.bestmafen.androidbase;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.SimpleWebViewActivity;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSimpleWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleWebViewActivity.kt\ncom/bestmafen/androidbase/SimpleWebViewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class SimpleWebViewActivity extends BaseActivity {

    @aa1
    private final Lazy webView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mi4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SimpleWebViewActivity.webView_delegate$lambda$0(this.f9708IO);
        }
    });

    public static final class OXO1 extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.X0O(view, "view");
            Intrinsics.X0O(url, "url");
            LogUtils.m11131v("shouldOverrideUrlLoading -> url=" + url);
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    private final WebView getWebView() {
        return (WebView) this.webView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView webView_delegate$lambda$0(SimpleWebViewActivity simpleWebViewActivity) {
        return (WebView) simpleWebViewActivity.findViewById(C4238R.id.webView);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        WebSettings settings = getWebView().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setUserAgentString("Chrome Mobile");
        getWebView().setWebViewClient(new OXO1());
        String mArg0 = getMArg0();
        if (mArg0 != null) {
            getWebView().loadUrl(mArg0);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return C4238R.layout.activity_simple_webview;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWebView().destroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @tb1 KeyEvent keyEvent) {
        if (!getWebView().canGoBack() || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        getWebView().goBack();
        return true;
    }
}
