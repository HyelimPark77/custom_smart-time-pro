package com.sma.smartv3.biz.ad;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.adp.sdk.ADP;
import com.android.mltcode.paycertificationapi.O10IXXX0X;
import com.android.mltcode.paycertificationapi.X0O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.ump.FormError;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ADPAdManager {

    @aa1
    public static final ADPAdManager INSTANCE = null;

    @aa1
    private static final String TAG = "ADPAdManager";

    @aa1
    private static final List<String> TEST_DEVICE_HASHED_IDS = null;

    static {
        INSTANCE = new ADPAdManager();
        TEST_DEVICE_HASHED_IDS = CollectionsKt__CollectionsKt.iXiX011(new String[]{"E6F3C043C1A3BECA4DDA296F23244C38", "673FC5F2276AE844B7135C868589CFC3"});
    }

    private ADPAdManager() {
    }

    public static /* synthetic */ void OXO1(FormError r0) {
        showPrivacyOptionsForm$lambda$0(r0);
    }

    public static /* synthetic */ void XIi00iiXO(GoogleMobileAdsConsentManager r0, Function2 r1, String r2) {
        getAdMobConsent$lambda$0$0(r0, r1, r2);
    }

    private static final void getAdMobConsent$lambda$0$0(GoogleMobileAdsConsentManager r3, Function2 r4, String r5) {
        if (r5 == null) goto L4;
        i1O0OXO1O.OXO1.OXO1("gatherConsent error: " + r5);
    L4:
        i1O0OXO1O.OXO1.OXO1("gatherConsent canRequestAds: " + r3.getCanRequestAds() + ", isPrivacyOptionsRequired: " + r3.isPrivacyOptionsRequired());
        r4.invoke(Boolean.valueOf(r3.getCanRequestAds()), Boolean.valueOf(r3.isPrivacyOptionsRequired()));
    }

    private static final void showPrivacyOptionsForm$lambda$0(FormError r1) {
        if (r1 == null) goto L5;
        ToastUtils.showLong(r1.getMessage(), new Object[0]);
        return;
    }

    public final void getAdMobConsent(@aa1 Activity r4, @aa1 final Function2<? super Boolean, ? super Boolean, Unit> r5) {
        Intrinsics.X0O(r4, "activity");
        Intrinsics.X0O(r5, "callback");
        GoogleMobileAdsConsentManager.Companion r0 = GoogleMobileAdsConsentManager.Companion;
        Context r1 = r4.getApplicationContext();
        Intrinsics.O10IXXX0X(r1, "getApplicationContext(...)");
        final GoogleMobileAdsConsentManager r2 = r0.getInstance(r1);
        r2.gatherConsent(r4, new X0O(r2, r5));
    }

    @aa1
    public final List<String> getTEST_DEVICE_HASHED_IDS() {
        return TEST_DEVICE_HASHED_IDS;
    }

    public final void initSdk(@aa1 Application r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "context");
        Intrinsics.X0O(r5, "appid");
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1("ADPAdManager initADPAd");
        r0.OXO1("ADPAdManager initADPAd -> appid: " + r5);
        ADP.initialize(r5, r4, new AnonymousClass1());
    }

    public final void showPrivacyOptionsForm(@aa1 Activity r4) {
        Intrinsics.X0O(r4, "activity");
        GoogleMobileAdsConsentManager.Companion r0 = GoogleMobileAdsConsentManager.Companion;
        Context r1 = r4.getApplicationContext();
        Intrinsics.O10IXXX0X(r1, "getApplicationContext(...)");
        r0.getInstance(r1).showPrivacyOptionsForm(r4, new O10IXXX0X());
    }
}
