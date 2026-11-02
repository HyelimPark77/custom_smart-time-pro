package com.sma.smartv3.biz.ad;

import android.app.Activity;
import android.content.Context;
import com.android.mltcode.paycertificationapi.II0IXXiX;
import com.android.mltcode.paycertificationapi.IIiXIO1X0;
import com.android.mltcode.paycertificationapi.XOI0O1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
public final class GoogleMobileAdsConsentManager {

    @aa1
    public static final Companion Companion = null;

    @tb1
    private static volatile GoogleMobileAdsConsentManager instance;

    @aa1
    private final ConsentInformation consentInformation;

    @SourceDebugExtension({"SMAP\nGoogleMobileAdsConsentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMobileAdsConsentManager.kt\ncom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @tb1
        public final GoogleMobileAdsConsentManager getInstance() {
            return GoogleMobileAdsConsentManager.access$getInstance$cp();
        }

        public final void setInstance(@tb1 GoogleMobileAdsConsentManager r1) {
            GoogleMobileAdsConsentManager.access$setInstance$cp(r1);
        }

        private Companion() {
        }

        @aa1
        public final GoogleMobileAdsConsentManager getInstance(@aa1 Context r4) {
            Intrinsics.X0O(r4, "context");
            GoogleMobileAdsConsentManager r0 = getInstance();
            if (r0 != null) goto L15;
            monitor-enter(this);
            Companion r1 = GoogleMobileAdsConsentManager.Companion;     // Catch: Throwable -> L9
            GoogleMobileAdsConsentManager r2 = r1.getInstance();     // Catch: Throwable -> L9
            if (r2 != null) goto L11;
            r2 = new GoogleMobileAdsConsentManager(r4, null);     // Catch: Throwable -> L9
            r1.setInstance(r2);     // Catch: Throwable -> L9
        L11:
            monitor-exit(this);
            return r2;
        L9:
            th = move-exception;
            throw th;
        L15:
            return r0;
        }
    }

    public interface OnConsentGatheringCompleteListener {
        void consentGatheringComplete(@tb1 String r1);
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ GoogleMobileAdsConsentManager(Context r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    public static /* synthetic */ void OXO1(OnConsentGatheringCompleteListener r0, FormError r1) {
        gatherConsent$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(OnConsentGatheringCompleteListener r0, FormError r1) {
        gatherConsent$lambda$2(r0, r1);
    }

    public static final /* synthetic */ GoogleMobileAdsConsentManager access$getInstance$cp() {
        return instance;
    }

    public static final /* synthetic */ void access$setInstance$cp(GoogleMobileAdsConsentManager r0) {
        instance = r0;
    }

    private static final void gatherConsent$lambda$1(Activity r1, final OnConsentGatheringCompleteListener r2) {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(r1, new II0IXXiX(r2));
    }

    private static final void gatherConsent$lambda$1$0(OnConsentGatheringCompleteListener r2, FormError r3) {
        if (r3 == null) goto L4;
        String r4 = r3.getErrorCode() + ": " + r3.getMessage();
    L5:
        r2.consentGatheringComplete(r4);
        return;
    L4:
        r4 = null;
        goto L5
    }

    private static final void gatherConsent$lambda$2(OnConsentGatheringCompleteListener r2, FormError r3) {
        if (r3 == null) goto L4;
        String r4 = r3.getErrorCode() + ": " + r3.getMessage();
    L5:
        r2.consentGatheringComplete(r4);
        return;
    L4:
        r4 = null;
        goto L5
    }

    public static /* synthetic */ void iO(Activity r0, OnConsentGatheringCompleteListener r1) {
        gatherConsent$lambda$1(r0, r1);
    }

    public final void gatherConsent(@aa1 final Activity r5, @aa1 final OnConsentGatheringCompleteListener r6) {
        Intrinsics.X0O(r5, "activity");
        Intrinsics.X0O(r6, "onConsentGatheringCompleteListener");
        ConsentDebugSettings r0 = new ConsentDebugSettings.Builder(r5).build();
        ConsentRequestParameters r1 = new ConsentRequestParameters.Builder().setConsentDebugSettings(r0).build();
        i1O0OXO1O.OXO1.OXO1("requestConsentInfoUpdate");
        requestConsentInfoUpdate(r5, r1, new IIiXIO1X0(r5, r6), new XOI0O1(r6));
    }

    public final boolean getCanRequestAds() {
        return canRequestAds();
    }

    public final boolean isPrivacyOptionsRequired() {
        if (getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED) goto L6;
        return true;
    L6:
        return false;
    }

    public final void reset() {
        reset();
    }

    public final void showPrivacyOptionsForm(@aa1 Activity r2, @aa1 ConsentForm.OnConsentFormDismissedListener r3) {
        Intrinsics.X0O(r2, "activity");
        Intrinsics.X0O(r3, "onConsentFormDismissedListener");
        UserMessagingPlatform.showPrivacyOptionsForm(r2, r3);
    }

    private GoogleMobileAdsConsentManager(Context r2) {
        ConsentInformation r3 = UserMessagingPlatform.getConsentInformation(r2);
        Intrinsics.O10IXXX0X(r3, "getConsentInformation(...)");
        this.consentInformation = r3;
    }
}
