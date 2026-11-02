package com.sma.smartv3.ui.fitness_site;

import android.app.Activity;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.IXOXIiO10;
import com.android.mltcode.paycertificationapi.OO00i1i1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.biz.fitness_site.fitbit.FitbitManager;
import com.sma.smartv3.pro.R;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes19.dex */
public final class FitbitAuthActivity extends BaseActivity {

    @aa1
    private String verifier;

    @aa1
    private final Lazy wevView$delegate;

    public static final class OXO1 extends WebViewClient {
        public final /* synthetic */ FitbitAuthActivity OXO1;

        public OXO1(FitbitAuthActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ Unit OXO1(FitbitAuthActivity r0, boolean r1) {
            return XIi00iiXO(r0, r1);
        }

        public static final Unit XIi00iiXO(FitbitAuthActivity r0, boolean r1) {
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
            if (oe5.O0(r13, "argomtechselect", false, 2, null) == true) goto L5;
        L7:
            r12.loadUrl(r13);
        L8:
            return true;
        L5:
            if (StringsKt__StringsKt.iIi011O(r13, "code", false, 2, null) == false) goto L7;
            LogUtils.d(new Object[]{"authorize OK"});
            String r5 = r13.substring(StringsKt__StringsKt.OO1101010(r13, "code=", 0, false, 6, null));
            Intrinsics.O10IXXX0X(r5, "substring(...)");
            String r14 = (String) StringsKt__StringsKt.iI0OIOO((CharSequence) StringsKt__StringsKt.iI0OIOO(r5, new char[]{Typography.XO0O10}, false, 0, 6, null).get(0), new char[]{'='}, false, 0, 6, null).get(1);
            FitbitManager r15 = FitbitManager.INSTANCE;
            Activity r0 = FitbitAuthActivity.access$getMContext(this.OXO1);
            String r1 = FitbitAuthActivity.access$getVerifier$p(this.OXO1);
            final FitbitAuthActivity r2 = this.OXO1;
            r15.getToken(r0, r14, r1, new OO00i1i1(r2));
            goto L8
        }
    }

    public FitbitAuthActivity() {
        this.wevView$delegate = LazyKt__LazyJVMKt.iO(new IXOXIiO10(this));
        this.verifier = "";
    }

    public static /* synthetic */ WebView OIX0iXi(FitbitAuthActivity r0) {
        return wevView_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ Activity access$getMContext(FitbitAuthActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ String access$getVerifier$p(FitbitAuthActivity r0) {
        return r0.verifier;
    }

    private final WebView getWevView() {
        return (WebView) getValue();
    }

    private static final WebView wevView_delegate$lambda$0(FitbitAuthActivity r1) {
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
        r0.setUserAgentString("Chrome Mobile");
        getWevView().setWebViewClient(new OXO1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_webview;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    @RequiresApi(26)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        byte[] r1 = new byte[32];
        new SecureRandom().nextBytes(r1);
        String r2 = Base64.encodeToString(r1, 11);
        Intrinsics.O10IXXX0X(r2, "encodeToString(...)");
        this.verifier = r2;
        Charset r3 = Charset.forName("US-ASCII");
        Intrinsics.O10IXXX0X(r3, "forName(...)");
        byte[] r4 = r2.getBytes(r3);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        MessageDigest r5 = MessageDigest.getInstance("SHA-256");
        r5.update(r4, 0, r4.length);
        String r0 = Base64.encodeToString(r5.digest(), 11);
        Intrinsics.O10IXXX0X(r0, "encodeToString(...)");
        ((WebView) findViewById(R.id.webView)).loadUrl("https://www.fitbit.com/oauth2/authorize?client_id=" + getString(R.string.fitbit_client_id) + "&code_challenge=" + r0 + "&code_challenge_method=S256&response_type=code&scope=activity%20heartrate%20location%20nutrition%20oxygen_saturation%20profile%20respiratory_rate%20settings%20sleep%20social%20temperature%20weight");
    }
}
