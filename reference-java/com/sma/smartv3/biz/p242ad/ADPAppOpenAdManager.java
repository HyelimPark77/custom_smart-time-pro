package com.sma.smartv3.biz.p242ad;

import android.app.Activity;
import android.view.ViewGroup;
import com.adp.sdk.ADPSplash;
import com.adp.sdk.dto.AdError;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ADPAppOpenAdManager {

    @aa1
    public static final ADPAppOpenAdManager INSTANCE = new ADPAppOpenAdManager();

    @aa1
    private static final String TAG = "ADPAppOpenAdManager";
    private static boolean isAdDismiss;
    private static boolean isClicked;
    private static boolean isLeftActivity;
    private static boolean isShowingAd;

    @tb1
    private static OnShowADPAdCompleteListener showAdCompleteListener;

    @tb1
    private static ADPSplash splashAd;

    private ADPAppOpenAdManager() {
    }

    private final boolean isAdAvailable() {
        return splashAd != null;
    }

    public static /* synthetic */ void loadAd$default(ADPAppOpenAdManager aDPAppOpenAdManager, Activity activity, ViewGroup viewGroup, String str, ADPAdListener aDPAdListener, int i, Object obj) {
        if ((i & 8) != 0) {
            aDPAdListener = null;
        }
        aDPAppOpenAdManager.loadAd(activity, viewGroup, str, aDPAdListener);
    }

    public final void destroy() {
        isAdDismiss = false;
        isClicked = false;
        splashAd = null;
    }

    @tb1
    public final OnShowADPAdCompleteListener getShowAdCompleteListener() {
        return showAdCompleteListener;
    }

    public final boolean isAdDismiss() {
        return isAdDismiss;
    }

    public final boolean isClicked() {
        return isClicked;
    }

    public final boolean isLeftActivity() {
        return isLeftActivity;
    }

    public final boolean isShowingAd() {
        return isShowingAd;
    }

    public final void loadAd(@aa1 Activity context, @aa1 ViewGroup adContainer, @aa1 final String unitId, @tb1 final ADPAdListener aDPAdListener) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(adContainer, "adContainer");
        Intrinsics.X0O(unitId, "unitId");
        if (isAdAvailable()) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1("ADPAppOpenAdManager loadAd -> id: " + unitId);
        ADPSplash aDPSplash = new ADPSplash(context.getApplication());
        splashAd = aDPSplash;
        aDPSplash.setAdUnitId(unitId);
        ADPSplash aDPSplash2 = splashAd;
        if (aDPSplash2 != null) {
            aDPSplash2.setAdViewListener(new ADPSplash.AdViewListener() { // from class: com.sma.smartv3.biz.ad.ADPAppOpenAdManager.loadAd.1
                @Override // com.adp.sdk.ADPSplash.AdViewListener
                public void onAdClicked() {
                    i1O0OXO1O.OXO1.OXO1("ADPAppOpenAdManager -> Ad State : Clicked");
                    ADPAppOpenAdManager.INSTANCE.setClicked(true);
                    ADPAdListener aDPAdListener2 = aDPAdListener;
                    if (aDPAdListener2 != null) {
                        aDPAdListener2.onAdOpen(unitId);
                    }
                }

                @Override // com.adp.sdk.ADPSplash.AdViewListener
                public void onAdClose() {
                    i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                    i1o0oxo1o.OXO1("ADPAppOpenAdManager -> Ad State : Closed");
                    ADPAppOpenAdManager aDPAppOpenAdManager = ADPAppOpenAdManager.INSTANCE;
                    aDPAppOpenAdManager.setAdDismiss(true);
                    if (aDPAppOpenAdManager.isLeftActivity()) {
                        i1o0oxo1o.OXO1("ADPAppOpenAdManager -> Ad State : onAdClose. 广告被点击跳转到其它界面或按HOME键压入后台时，忽略此回调");
                        return;
                    }
                    aDPAppOpenAdManager.setShowingAd(false);
                    OnShowADPAdCompleteListener showAdCompleteListener2 = aDPAppOpenAdManager.getShowAdCompleteListener();
                    if (showAdCompleteListener2 != null) {
                        showAdCompleteListener2.onShowAdComplete();
                    }
                    ADPAdListener aDPAdListener2 = aDPAdListener;
                    if (aDPAdListener2 != null) {
                        aDPAdListener2.onAdClose(unitId);
                    }
                }

                @Override // com.adp.sdk.ADPSplash.AdViewListener
                public void onAdFailed(AdError adError) {
                    ADPAppOpenAdManager aDPAppOpenAdManager = ADPAppOpenAdManager.INSTANCE;
                    aDPAppOpenAdManager.setAdDismiss(true);
                    i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ADPAppOpenAdManager -> Ad State : Error, Info: ");
                    sb.append(adError != null ? adError.getMessage() : null);
                    i1o0oxo1o.OXO1(sb.toString());
                    if (aDPAppOpenAdManager.isLeftActivity()) {
                        i1o0oxo1o.OXO1("ADPAppOpenAdManager -> Ad State : onAdFailed. 广告失败了，忽略此回调");
                        return;
                    }
                    aDPAppOpenAdManager.setShowingAd(false);
                    OnShowADPAdCompleteListener showAdCompleteListener2 = aDPAppOpenAdManager.getShowAdCompleteListener();
                    if (showAdCompleteListener2 != null) {
                        showAdCompleteListener2.onShowAdComplete();
                    }
                    if (adError != null) {
                        ADPAdListener aDPAdListener2 = aDPAdListener;
                        if (aDPAdListener2 != null) {
                            aDPAdListener2.onAdFailed(new ADPAdError(adError), unitId);
                            return;
                        }
                        return;
                    }
                    ADPAdListener aDPAdListener3 = aDPAdListener;
                    if (aDPAdListener3 != null) {
                        aDPAdListener3.onAdFailed(new ADPAdError("-1", ""), unitId);
                    }
                }

                @Override // com.adp.sdk.ADPSplash.AdViewListener
                public void onAdLoaded() {
                    i1O0OXO1O.OXO1.OXO1("ADPAppOpenAdManager -> Ad State : Loaded");
                    ADPAdListener aDPAdListener2 = aDPAdListener;
                    if (aDPAdListener2 != null) {
                        aDPAdListener2.onAdLoaded(unitId);
                    }
                }

                @Override // com.adp.sdk.ADPSplash.AdViewListener
                public void onAdOpen() {
                    i1O0OXO1O.OXO1.OXO1("ADPAppOpenAdManager -> Ad State : open");
                    ADPAppOpenAdManager.INSTANCE.setShowingAd(true);
                    ADPAdListener aDPAdListener2 = aDPAdListener;
                    if (aDPAdListener2 != null) {
                        aDPAdListener2.onAdOpen(unitId);
                    }
                }
            });
        }
        isShowingAd = true;
        ADPSplash aDPSplash3 = splashAd;
        if (aDPSplash3 != null) {
            aDPSplash3.setDurationTime(5);
        }
        ADPSplash aDPSplash4 = splashAd;
        if (aDPSplash4 != null) {
            aDPSplash4.setIntervals(1800);
        }
        ADPSplash aDPSplash5 = splashAd;
        if (aDPSplash5 != null) {
            aDPSplash5.setTimeoutTime(5);
        }
        ADPSplash aDPSplash6 = splashAd;
        if (aDPSplash6 != null) {
            aDPSplash6.loadAd(context);
        }
    }

    public final void setAdDismiss(boolean z) {
        isAdDismiss = z;
    }

    public final void setClicked(boolean z) {
        isClicked = z;
    }

    public final void setLeftActivity(boolean z) {
        isLeftActivity = z;
    }

    public final void setShowAdCompleteListener(@tb1 OnShowADPAdCompleteListener onShowADPAdCompleteListener) {
        showAdCompleteListener = onShowADPAdCompleteListener;
    }

    public final void setShowingAd(boolean z) {
        isShowingAd = z;
    }
}
