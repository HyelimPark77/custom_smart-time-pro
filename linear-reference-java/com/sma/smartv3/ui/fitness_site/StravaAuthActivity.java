package com.sma.smartv3.ui.fitness_site;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.mb5;
import com.android.mltcode.paycertificationapi.nb5;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.biz.fitness_site.strava.StravaManager;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes19.dex */
public final class StravaAuthActivity extends BaseActivity {

    @aa1
    private final Lazy wevView$delegate;

    public static final class OXO1 extends WebViewClient {
        public final /* synthetic */ StravaAuthActivity OXO1;

        public OXO1(StravaAuthActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ Unit OXO1(StravaAuthActivity r0, boolean r1) {
            return XIi00iiXO(r0, r1);
        }

        public static final Unit XIi00iiXO(StravaAuthActivity r0, boolean r1) {
            if (r1 == false) goto L4;
            r0.setResult(-1);
        L4:
            r0.finish();
            return Unit.OXO1;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView r12, String r13) {
            Intrinsics.X0O(r12, "view");
            Intrinsics.X0O(r13, "url");
            LogUtils.v(new Object[]{"shouldOverrideUrlLoading -> url=" + r13});
            if (oe5.O0(r13, StravaManager.URL_CALLBACK, false, 2, null) == true) goto L5;
            r12.loadUrl(r13);
        L11:
            return true;
        L5:
            if (StringsKt__StringsKt.iIi011O(r13, "code", false, 2, null) == true) goto L7;
        L9:
            this.OXO1.finish();
            goto L11
        L7:
            if (StringsKt__StringsKt.iIi011O(r13, "activity:write", false, 2, null) == false) goto L9;
            LogUtils.d(new Object[]{"authorize OK"});
            String r5 = r13.substring(StringsKt__StringsKt.OO1101010(r13, "code=", 0, false, 6, null));
            Intrinsics.O10IXXX0X(r5, "substring(...)");
            String r14 = (String) StringsKt__StringsKt.iI0OIOO((CharSequence) StringsKt__StringsKt.iI0OIOO(r5, new char[]{Typography.XO0O10}, false, 0, 6, null).get(0), new char[]{'='}, false, 0, 6, null).get(1);
            StravaManager r15 = StravaManager.INSTANCE;
            Activity r0 = StravaAuthActivity.access$getMContext(this.OXO1);
            final StravaAuthActivity r1 = this.OXO1;
            r15.getToken(r0, r14, new nb5(r1));
            goto L11
        }
    }

    public StravaAuthActivity() {
        this.wevView$delegate = LazyKt__LazyJVMKt.iO(new mb5(this));
    }

    public static /* synthetic */ WebView OIX0iXi(StravaAuthActivity r0) {
        return wevView_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ Activity access$getMContext(StravaAuthActivity r0) {
        return r0.getMContext();
    }

    private final WebView getWevView() {
        return (WebView) getValue();
    }

    private static final WebView wevView_delegate$lambda$0(StravaAuthActivity r1) {
        return (WebView) r1.findViewById(R.id.webView);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        WebSettings r0 = getWevView().getSettings();
        r0.setJavaScriptEnabled(true);
        r0.setUseWideViewPort(true);
        r0.setLoadWithOverviewMode(true);
        r0.setJavaScriptCanOpenWindowsAutomatically(true);
        r0.setLoadsImagesAutomatically(true);
        getWevView().setWebViewClient(new OXO1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_webview;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((WebView) findViewById(R.id.webView)).loadUrl("https://www.strava.com/oauth/mobile/authorize?client_id=" + getString(R.string.strava_client_id) + "&redirect_uri=http://localhost/auth/callback&response_type=code&scope=activity:write");
    }
}
