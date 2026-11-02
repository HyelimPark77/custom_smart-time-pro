package com.sma.smartv3.biz.p242ad;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class ADPAdListener {
    public void onAdClicked(@aa1 String adUnitId) {
        Intrinsics.X0O(adUnitId, "adUnitId");
    }

    public void onAdClose(@aa1 String adUnitId) {
        Intrinsics.X0O(adUnitId, "adUnitId");
    }

    public void onAdFailed(@aa1 ADPAdError error, @aa1 String adUnitId) {
        Intrinsics.X0O(error, "error");
        Intrinsics.X0O(adUnitId, "adUnitId");
    }

    public void onAdLoaded(@aa1 String adUnitId) {
        Intrinsics.X0O(adUnitId, "adUnitId");
    }

    public void onAdOpen(@aa1 String adUnitId) {
        Intrinsics.X0O(adUnitId, "adUnitId");
    }
}
