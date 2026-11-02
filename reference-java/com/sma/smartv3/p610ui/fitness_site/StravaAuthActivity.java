package com.sma.smartv3.p610ui.fitness_site;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.biz.fitness_site.strava.StravaManager;
import com.sma.smartv3.p610ui.fitness_site.StravaAuthActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes19.dex */
public final class StravaAuthActivity extends BaseActivity {

    @aa1
    private final Lazy wevView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mb5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StravaAuthActivity.wevView_delegate$lambda$0(this.f9668IO);
        }
    });

    public static final class OXO1 extends WebViewClient {
        public OXO1() {
        }

        public static final Unit XIi00iiXO(StravaAuthActivity stravaAuthActivity, boolean z) {
            if (z) {
                stravaAuthActivity.setResult(-1);
            }
            stravaAuthActivity.finish();
            return Unit.OXO1;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.X0O(view, "view");
            Intrinsics.X0O(url, "url");
            LogUtils.m11131v("shouldOverrideUrlLoading -> url=" + url);
            if (!oe5.m2764O0(url, StravaManager.URL_CALLBACK, false, 2, null)) {
                view.loadUrl(url);
            } else if (StringsKt__StringsKt.iIi011O(url, "code", false, 2, null) && StringsKt__StringsKt.iIi011O(url, "activity:write", false, 2, null)) {
                LogUtils.m11128d("authorize OK");
                String strSubstring = url.substring(StringsKt__StringsKt.OO1101010(url, "code=", 0, false, 6, null));
                Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                String str = (String) StringsKt__StringsKt.iI0OIOO((CharSequence) StringsKt__StringsKt.iI0OIOO(strSubstring, new char[]{Typography.XO0O10}, false, 0, 6, null).get(0), new char[]{'='}, false, 0, 6, null).get(1);
                StravaManager stravaManager = StravaManager.INSTANCE;
                Activity mContext = StravaAuthActivity.this.getMContext();
                final StravaAuthActivity stravaAuthActivity = StravaAuthActivity.this;
                stravaManager.getToken(mContext, str, new Function1() { // from class: com.android.mltcode.paycertificationapi.nb5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return StravaAuthActivity.OXO1.XIi00iiXO(stravaAuthActivity, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                StravaAuthActivity.this.finish();
            }
            return true;
        }
    }

    private final WebView getWevView() {
        return (WebView) this.wevView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView wevView_delegate$lambda$0(StravaAuthActivity stravaAuthActivity) {
        return (WebView) stravaAuthActivity.findViewById(R.id.webView);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        WebSettings settings = getWevView().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        getWevView().setWebViewClient(new OXO1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_webview;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((WebView) findViewById(R.id.webView)).loadUrl("https://www.strava.com/oauth/mobile/authorize?client_id=" + getString(R.string.strava_client_id) + "&redirect_uri=http://localhost/auth/callback&response_type=code&scope=activity:write");
    }
}
