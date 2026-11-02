package com.sma.smartv3.biz.ad;

import android.app.Activity;
import android.view.ViewGroup;
import com.adp.sdk.ADPBannerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.ScreenUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ADPAdBanner {

    @aa1
    private final String adUnitId;

    @aa1
    private ADPBannerView adView;
    private final int adWidth;

    @aa1
    private final Activity context;

    public ADPAdBanner(@aa1 Activity r2, @aa1 String r3, int r4, @aa1 final ADPAdListener r5) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "adUnitId");
        Intrinsics.X0O(r5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.context = r2;
        this.adUnitId = r3;
        this.adWidth = r4;
        ADPBannerView r0 = new ADPBannerView(r2);
        r0.setAdUnitId(r3);
        r0.setAdViewListener(new ADPAdBanner$adView$1$1(r5, this));
        if (r4 != 0) goto L5;
        r4 = ScreenUtils.getScreenWidth();
    L5:
        r0.setWidth(r4);
        this.adView = r0;
    }

    public final void destroy() {
        destroy();
    }

    @aa1
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final int getAdWidth() {
        return this.adWidth;
    }

    @aa1
    public final Activity getContext() {
        return this.context;
    }

    public final void loadAd(@aa1 ViewGroup r2) {
        Intrinsics.X0O(r2, "containerView");
        r2.removeAllViews();
        r2.addView(this.adView);
        loadAd();
    }

    public /* synthetic */ ADPAdBanner(Activity r1, String r2, int r3, ADPAdListener r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        this(r1, r2, r3, r4);
    }
}
