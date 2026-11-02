package com.sma.smartv3.biz.p242ad;

import android.app.Activity;
import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.sma.smartv3.biz.p242ad.GoogleMobileAdsConsentManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
public final class GoogleMobileAdsConsentManager {

    @aa1
    public static final Companion Companion = new Companion(null);

    @tb1
    private static volatile GoogleMobileAdsConsentManager instance;

    @aa1
    private final ConsentInformation consentInformation;

    @SourceDebugExtension({"SMAP\nGoogleMobileAdsConsentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMobileAdsConsentManager.kt\ncom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @tb1
        public final GoogleMobileAdsConsentManager getInstance() {
            return GoogleMobileAdsConsentManager.instance;
        }

        public final void setInstance(@tb1 GoogleMobileAdsConsentManager googleMobileAdsConsentManager) {
            GoogleMobileAdsConsentManager.instance = googleMobileAdsConsentManager;
        }

        private Companion() {
        }

        @aa1
        public final GoogleMobileAdsConsentManager getInstance(@aa1 Context context) {
            GoogleMobileAdsConsentManager companion;
            Intrinsics.X0O(context, "context");
            GoogleMobileAdsConsentManager companion2 = getInstance();
            if (companion2 != null) {
                return companion2;
            }
            synchronized (this) {
                Companion companion3 = GoogleMobileAdsConsentManager.Companion;
                companion = companion3.getInstance();
                if (companion == null) {
                    companion = new GoogleMobileAdsConsentManager(context, null);
                    companion3.setInstance(companion);
                }
            }
            return companion;
        }
    }

    public interface OnConsentGatheringCompleteListener {
        void consentGatheringComplete(@tb1 String str);
    }

    public /* synthetic */ GoogleMobileAdsConsentManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsent$lambda$1(Activity activity, final OnConsentGatheringCompleteListener onConsentGatheringCompleteListener) {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.android.mltcode.paycertificationapi.II0IXXiX
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                GoogleMobileAdsConsentManager.gatherConsent$lambda$1$0(onConsentGatheringCompleteListener, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsent$lambda$1$0(OnConsentGatheringCompleteListener onConsentGatheringCompleteListener, FormError formError) {
        String str;
        if (formError != null) {
            str = formError.getErrorCode() + ": " + formError.getMessage();
        } else {
            str = null;
        }
        onConsentGatheringCompleteListener.consentGatheringComplete(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsent$lambda$2(OnConsentGatheringCompleteListener onConsentGatheringCompleteListener, FormError formError) {
        String str;
        if (formError != null) {
            str = formError.getErrorCode() + ": " + formError.getMessage();
        } else {
            str = null;
        }
        onConsentGatheringCompleteListener.consentGatheringComplete(str);
    }

    public final void gatherConsent(@aa1 final Activity activity, @aa1 final OnConsentGatheringCompleteListener onConsentGatheringCompleteListener) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(onConsentGatheringCompleteListener, "onConsentGatheringCompleteListener");
        ConsentRequestParameters consentRequestParametersBuild = new ConsentRequestParameters.Builder().setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).build()).build();
        i1O0OXO1O.OXO1.OXO1("requestConsentInfoUpdate");
        this.consentInformation.requestConsentInfoUpdate(activity, consentRequestParametersBuild, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.android.mltcode.paycertificationapi.IIiXIO1X0
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                GoogleMobileAdsConsentManager.gatherConsent$lambda$1(activity, onConsentGatheringCompleteListener);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.android.mltcode.paycertificationapi.XOI0O1
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                GoogleMobileAdsConsentManager.gatherConsent$lambda$2(onConsentGatheringCompleteListener, formError);
            }
        });
    }

    public final boolean getCanRequestAds() {
        return this.consentInformation.canRequestAds();
    }

    public final boolean isPrivacyOptionsRequired() {
        return this.consentInformation.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
    }

    public final void reset() {
        this.consentInformation.reset();
    }

    public final void showPrivacyOptionsForm(@aa1 Activity activity, @aa1 ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(onConsentFormDismissedListener, "onConsentFormDismissedListener");
        UserMessagingPlatform.showPrivacyOptionsForm(activity, onConsentFormDismissedListener);
    }

    private GoogleMobileAdsConsentManager(Context context) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(context);
        Intrinsics.O10IXXX0X(consentInformation, "getConsentInformation(...)");
        this.consentInformation = consentInformation;
    }
}
