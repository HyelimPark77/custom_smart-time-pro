package com.sma.smartv3.biz.p242ad;

import android.app.Activity;
import android.view.ViewGroup;
import com.adp.sdk.ADPBannerView;
import com.adp.sdk.dto.AdError;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.ScreenUtils;
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

    public ADPAdBanner(@aa1 Activity context, @aa1 String adUnitId, int i, @aa1 final ADPAdListener listener) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(adUnitId, "adUnitId");
        Intrinsics.X0O(listener, "listener");
        this.context = context;
        this.adUnitId = adUnitId;
        this.adWidth = i;
        ADPBannerView aDPBannerView = new ADPBannerView(context);
        aDPBannerView.setAdUnitId(adUnitId);
        aDPBannerView.setAdViewListener(new ADPBannerView.AdViewListener() { // from class: com.sma.smartv3.biz.ad.ADPAdBanner$adView$1$1
            @Override // com.adp.sdk.ADPBannerView.AdViewListener
            public void onAdClicked(ADPBannerView aDPBannerView2) {
                listener.onAdClicked(this.getAdUnitId());
            }

            @Override // com.adp.sdk.ADPBannerView.AdViewListener
            public void onAdClose(ADPBannerView aDPBannerView2) {
                listener.onAdClose(this.getAdUnitId());
            }

            @Override // com.adp.sdk.ADPBannerView.AdViewListener
            public void onAdFailed(ADPBannerView aDPBannerView2, AdError p1) {
                Intrinsics.X0O(p1, "p1");
                listener.onAdFailed(new ADPAdError(p1), this.getAdUnitId());
            }

            @Override // com.adp.sdk.ADPBannerView.AdViewListener
            public void onAdLoaded(ADPBannerView aDPBannerView2) {
                listener.onAdLoaded(this.getAdUnitId());
            }

            @Override // com.adp.sdk.ADPBannerView.AdViewListener
            public void onAdOpen(ADPBannerView aDPBannerView2) {
                listener.onAdOpen(this.getAdUnitId());
            }
        });
        aDPBannerView.setWidth(i == 0 ? ScreenUtils.getScreenWidth() : i);
        this.adView = aDPBannerView;
    }

    public final void destroy() {
        this.adView.destroy();
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

    public final void loadAd(@aa1 ViewGroup containerView) {
        Intrinsics.X0O(containerView, "containerView");
        containerView.removeAllViews();
        containerView.addView(this.adView);
        this.adView.loadAd();
    }

    public /* synthetic */ ADPAdBanner(Activity activity, String str, int i, ADPAdListener aDPAdListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, str, (i2 & 4) != 0 ? 0 : i, aDPAdListener);
    }
}
