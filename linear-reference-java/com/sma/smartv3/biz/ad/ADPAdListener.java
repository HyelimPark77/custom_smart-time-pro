package com.sma.smartv3.biz.ad;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class ADPAdListener {
    public ADPAdListener() {
    }

    public void onAdClicked(@aa1 String r2) {
        Intrinsics.X0O(r2, "adUnitId");
    }

    public void onAdClose(@aa1 String r2) {
        Intrinsics.X0O(r2, "adUnitId");
    }

    public void onAdFailed(@aa1 ADPAdError r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "error");
        Intrinsics.X0O(r3, "adUnitId");
    }

    public void onAdLoaded(@aa1 String r2) {
        Intrinsics.X0O(r2, "adUnitId");
    }

    public void onAdOpen(@aa1 String r2) {
        Intrinsics.X0O(r2, "adUnitId");
    }
}
