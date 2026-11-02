package com.sma.smartv3.biz.p242ad;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.adp.sdk.ADP;
import com.adp.sdk.dto.AdError;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.sma.smartv3.biz.p242ad.ADPAdManager;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ADPAdManager {

    @aa1
    private static final String TAG = "ADPAdManager";

    @aa1
    public static final ADPAdManager INSTANCE = new ADPAdManager();

    @aa1
    private static final List<String> TEST_DEVICE_HASHED_IDS = CollectionsKt__CollectionsKt.iXiX011("E6F3C043C1A3BECA4DDA296F23244C38", "673FC5F2276AE844B7135C868589CFC3");

    private ADPAdManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAdMobConsent$lambda$0$0(GoogleMobileAdsConsentManager googleMobileAdsConsentManager, Function2 function2, String str) {
        if (str != null) {
            i1O0OXO1O.OXO1.OXO1("gatherConsent error: " + str);
        }
        i1O0OXO1O.OXO1.OXO1("gatherConsent canRequestAds: " + googleMobileAdsConsentManager.getCanRequestAds() + ", isPrivacyOptionsRequired: " + googleMobileAdsConsentManager.isPrivacyOptionsRequired());
        function2.invoke2(Boolean.valueOf(googleMobileAdsConsentManager.getCanRequestAds()), Boolean.valueOf(googleMobileAdsConsentManager.isPrivacyOptionsRequired()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPrivacyOptionsForm$lambda$0(FormError formError) {
        if (formError != null) {
            ToastUtils.showLong(formError.getMessage(), new Object[0]);
        }
    }

    public final void getAdMobConsent(@aa1 Activity activity, @aa1 final Function2<? super Boolean, ? super Boolean, Unit> callback) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(callback, "callback");
        GoogleMobileAdsConsentManager.Companion companion = GoogleMobileAdsConsentManager.Companion;
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.O10IXXX0X(applicationContext, "getApplicationContext(...)");
        final GoogleMobileAdsConsentManager companion2 = companion.getInstance(applicationContext);
        companion2.gatherConsent(activity, new GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener() { // from class: com.android.mltcode.paycertificationapi.X0O
            @Override // com.sma.smartv3.biz.ad.GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener
            public final void consentGatheringComplete(String str) {
                ADPAdManager.getAdMobConsent$lambda$0$0(companion2, callback, str);
            }
        });
    }

    @aa1
    public final List<String> getTEST_DEVICE_HASHED_IDS() {
        return TEST_DEVICE_HASHED_IDS;
    }

    public final void initSdk(@aa1 Application context, @aa1 String appid) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(appid, "appid");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("ADPAdManager initADPAd");
        i1o0oxo1o.OXO1("ADPAdManager initADPAd -> appid: " + appid);
        ADP.initialize(appid, context, new ADP.InitCallback() { // from class: com.sma.smartv3.biz.ad.ADPAdManager.initSdk.1
            @Override // com.adp.sdk.ADP.InitCallback
            public void onError(AdError adError) {
                i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
                StringBuilder sb = new StringBuilder();
                sb.append("ADPAdManager initADPAd -> onError: ");
                sb.append(adError != null ? adError.getCode() : null);
                sb.append(", ");
                sb.append(adError != null ? adError.getMessage() : null);
                i1o0oxo1o2.OXO1(sb.toString());
            }

            @Override // com.adp.sdk.ADP.InitCallback
            public void onSuccess() {
                i1O0OXO1O.OXO1.OXO1("ADPAdManager initADPAd -> onSuccess");
            }
        });
    }

    public final void showPrivacyOptionsForm(@aa1 Activity activity) {
        Intrinsics.X0O(activity, "activity");
        GoogleMobileAdsConsentManager.Companion companion = GoogleMobileAdsConsentManager.Companion;
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.O10IXXX0X(applicationContext, "getApplicationContext(...)");
        companion.getInstance(applicationContext).showPrivacyOptionsForm(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.android.mltcode.paycertificationapi.O10IXXX0X
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                ADPAdManager.showPrivacyOptionsForm$lambda$0(formError);
            }
        });
    }
}
