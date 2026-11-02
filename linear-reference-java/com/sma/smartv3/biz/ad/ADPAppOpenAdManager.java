package com.sma.smartv3.biz.ad;

import android.app.Activity;
import android.view.ViewGroup;
import com.adp.sdk.ADPSplash;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ADPAppOpenAdManager {

    @aa1
    public static final ADPAppOpenAdManager INSTANCE = null;

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

    static {
        INSTANCE = new ADPAppOpenAdManager();
    }

    private ADPAppOpenAdManager() {
    }

    private final boolean isAdAvailable() {
        if (splashAd == null) goto L6;
        return true;
    L6:
        return false;
    }

    public static /* synthetic */ void loadAd$default(ADPAppOpenAdManager r0, Activity r1, ViewGroup r2, String r3, ADPAdListener r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        r0.loadAd(r1, r2, r3, r4);
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

    public final void loadAd(@aa1 Activity r3, @aa1 ViewGroup r4, @aa1 final String r5, @tb1 final ADPAdListener r6) {
        Intrinsics.X0O(r3, "context");
        Intrinsics.X0O(r4, "adContainer");
        Intrinsics.X0O(r5, "unitId");
        if (isAdAvailable() == true) goto L22;
        i1O0OXO1O.OXO1.OXO1("ADPAppOpenAdManager loadAd -> id: " + r5);
        ADPSplash r7 = new ADPSplash(r3.getApplication());
        splashAd = r7;
        r7.setAdUnitId(r5);
        ADPSplash r8 = splashAd;
        if (r8 == null) goto L8;
        r8.setAdViewListener(new AnonymousClass1(r6, r5));
    L8:
        isShowingAd = true;
        ADPSplash r9 = splashAd;
        if (r9 == null) goto L11;
        r9.setDurationTime(5);
    L11:
        ADPSplash r10 = splashAd;
        if (r10 == null) goto L14;
        r10.setIntervals(1800);
    L14:
        ADPSplash r11 = splashAd;
        if (r11 == null) goto L17;
        r11.setTimeoutTime(5);
    L17:
        ADPSplash r12 = splashAd;
        if (r12 == null) goto L21;
        r12.loadAd(r3);
        return;
    L21:
        return;
    }

    public final void setAdDismiss(boolean r1) {
        isAdDismiss = r1;
    }

    public final void setClicked(boolean r1) {
        isClicked = r1;
    }

    public final void setLeftActivity(boolean r1) {
        isLeftActivity = r1;
    }

    public final void setShowAdCompleteListener(@tb1 OnShowADPAdCompleteListener r1) {
        showAdCompleteListener = r1;
    }

    public final void setShowingAd(boolean r1) {
        isShowingAd = r1;
    }
}
