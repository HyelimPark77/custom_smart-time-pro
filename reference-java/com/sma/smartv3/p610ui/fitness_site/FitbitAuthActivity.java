package com.sma.smartv3.p610ui.fitness_site;

import android.app.Activity;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.biz.fitness_site.fitbit.FitbitManager;
import com.sma.smartv3.p610ui.fitness_site.FitbitAuthActivity;
import com.sma.smartv3.pro.R;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes19.dex */
public final class FitbitAuthActivity extends BaseActivity {

    @aa1
    private final Lazy wevView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXOXIiO10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FitbitAuthActivity.wevView_delegate$lambda$0(this.f2074IO);
        }
    });

    @aa1
    private String verifier = "";

    public static final class OXO1 extends WebViewClient {
        public OXO1() {
        }

        public static final Unit XIi00iiXO(FitbitAuthActivity fitbitAuthActivity, boolean z) {
            if (z) {
                fitbitAuthActivity.setResult(-1);
            }
            fitbitAuthActivity.finish();
            return Unit.OXO1;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.X0O(view, "view");
            Intrinsics.X0O(url, "url");
            LogUtils.m11131v("shouldOverrideUrlLoading -> url=" + url);
            if (oe5.m2764O0(url, "argomtechselect", false, 2, null) && StringsKt__StringsKt.iIi011O(url, "code", false, 2, null)) {
                LogUtils.m11128d("authorize OK");
                String strSubstring = url.substring(StringsKt__StringsKt.OO1101010(url, "code=", 0, false, 6, null));
                Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                String str = (String) StringsKt__StringsKt.iI0OIOO((CharSequence) StringsKt__StringsKt.iI0OIOO(strSubstring, new char[]{Typography.XO0O10}, false, 0, 6, null).get(0), new char[]{'='}, false, 0, 6, null).get(1);
                FitbitManager fitbitManager = FitbitManager.INSTANCE;
                Activity mContext = FitbitAuthActivity.this.getMContext();
                String str2 = FitbitAuthActivity.this.verifier;
                final FitbitAuthActivity fitbitAuthActivity = FitbitAuthActivity.this;
                fitbitManager.getToken(mContext, str, str2, new Function1() { // from class: com.android.mltcode.paycertificationapi.OO00i1i1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FitbitAuthActivity.OXO1.XIi00iiXO(fitbitAuthActivity, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                view.loadUrl(url);
            }
            return true;
        }
    }

    private final WebView getWevView() {
        return (WebView) this.wevView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView wevView_delegate$lambda$0(FitbitAuthActivity fitbitAuthActivity) {
        return (WebView) fitbitAuthActivity.findViewById(R.id.webView);
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
        settings.setUserAgentString("Chrome Mobile");
        getWevView().setWebViewClient(new OXO1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_webview;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    @RequiresApi(26)
    public void onAttachedToWindow() throws NoSuchAlgorithmException {
        super.onAttachedToWindow();
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        Intrinsics.O10IXXX0X(strEncodeToString, "encodeToString(...)");
        this.verifier = strEncodeToString;
        Charset charsetForName = Charset.forName("US-ASCII");
        Intrinsics.O10IXXX0X(charsetForName, "forName(...)");
        byte[] bytes = strEncodeToString.getBytes(charsetForName);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bytes, 0, bytes.length);
        String strEncodeToString2 = Base64.encodeToString(messageDigest.digest(), 11);
        Intrinsics.O10IXXX0X(strEncodeToString2, "encodeToString(...)");
        ((WebView) findViewById(R.id.webView)).loadUrl("https://www.fitbit.com/oauth2/authorize?client_id=" + getString(R.string.fitbit_client_id) + "&code_challenge=" + strEncodeToString2 + "&code_challenge_method=S256&response_type=code&scope=activity%20heartrate%20location%20nutrition%20oxygen_saturation%20profile%20respiratory_rate%20settings%20sleep%20social%20temperature%20weight");
    }
}
