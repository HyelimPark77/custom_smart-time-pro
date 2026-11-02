package com.sma.smartv3.p610ui.p611ai.item;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.biz.p242ad.ADPAdError;
import com.sma.smartv3.biz.p242ad.ADPAdListener;
import com.sma.smartv3.p610ui.p611ai.item.AIADPBannerItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIADPBannerItem extends BaseDslItem {
    private ADPAdContainerView adContainerView;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;
    private boolean isVisibility;
    private int mViewWidth;

    @aa1
    private final String TAG = "AIADPBannerItem";
    private final boolean initEvent = true;

    public static final class OXO1 extends ADPAdListener {
        public OXO1() {
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdClose(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPBannerItem.this.TAG + " -> Ad State : Closed");
            AIADPBannerItem.this.isLoaded = false;
            AIADPBannerItem.this.initView();
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdFailed(ADPAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPBannerItem.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            AIADPBannerItem.this.isLoaded = false;
            AIADPBannerItem.this.isLoading = false;
            AIADPBannerItem.this.initView();
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdLoaded(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPBannerItem.this.TAG + " -> Ad State : Loaded");
            AIADPBannerItem.this.isLoaded = true;
            AIADPBannerItem.this.isLoading = false;
            AIADPBannerItem.this.initView();
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdOpen(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPBannerItem.this.TAG + " -> Ad State : Open");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0$0(AIADPBannerItem aIADPBannerItem, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(aIADPBannerItem.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + aIADPBannerItem.isLoaded + ", isLoading: " + aIADPBannerItem.isLoading);
            if (aIADPBannerItem.isLoaded || aIADPBannerItem.isLoading) {
                return;
            }
            aIADPBannerItem.isFirstLoad = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0$1(AIADPBannerItem aIADPBannerItem, ADPAdContainerView aDPAdContainerView) {
        if (aIADPBannerItem.isFirstLoad || !aIADPBannerItem.isVisibility) {
            return;
        }
        aIADPBannerItem.isFirstLoad = true;
        aIADPBannerItem.isLoading = true;
        aIADPBannerItem.mViewWidth = aDPAdContainerView.getWidth();
        i1O0OXO1O.OXO1.OXO1(aIADPBannerItem.TAG + " -> Ad State : loadAdView viewWidth:" + aDPAdContainerView.getWidth() + ", id:" + aDPAdContainerView.getAdUnitId());
    }

    private final void loadAd() {
        ADPAdContainerView aDPAdContainerView;
        if (this.mViewWidth == 0) {
            ADPAdContainerView aDPAdContainerView2 = this.adContainerView;
            if (aDPAdContainerView2 == null) {
                Intrinsics.XXO("adContainerView");
                aDPAdContainerView2 = null;
            }
            float f = aDPAdContainerView2.getContext().getResources().getDisplayMetrics().widthPixels;
            ADPAdContainerView aDPAdContainerView3 = this.adContainerView;
            if (aDPAdContainerView3 == null) {
                Intrinsics.XXO("adContainerView");
                aDPAdContainerView3 = null;
            }
            this.mViewWidth = (int) (f - (aDPAdContainerView3.getContext().getResources().getDimension(R.dimen.ab_banner_margin) * 2));
        }
        ADPAdContainerView aDPAdContainerView4 = this.adContainerView;
        if (aDPAdContainerView4 == null) {
            Intrinsics.XXO("adContainerView");
            aDPAdContainerView = null;
        } else {
            aDPAdContainerView = aDPAdContainerView4;
        }
        ADPAdContainerView.loadAdView$default(aDPAdContainerView, null, this.mViewWidth, true, null, 9, null);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.adContainerView);
        Intrinsics.XXI(viewM3483v);
        final ADPAdContainerView aDPAdContainerView = (ADPAdContainerView) viewM3483v;
        this.adContainerView = aDPAdContainerView;
        if (aDPAdContainerView == null) {
            Intrinsics.XXO("adContainerView");
            aDPAdContainerView = null;
        }
        aDPAdContainerView.setAdListener(new OXO1());
        aDPAdContainerView.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.X01IiOiIi
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                AIADPBannerItem.bindView$lambda$0$0(this.f3921IO, lifecycleOwner, event);
            }
        });
        aDPAdContainerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.mltcode.paycertificationapi.II1Xi0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AIADPBannerItem.bindView$lambda$0$1(this.f1557IO, aDPAdContainerView);
            }
        });
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    public final int getMViewWidth() {
        return this.mViewWidth;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!this.isLoaded);
    }

    public final boolean isVisibility() {
        return this.isVisibility;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_banner_adp;
    }

    @sf5(tag = I01XX0.IOi1O0)
    public final void onAIViewVisibilityChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State :  onAIViewVisibilityChange  isVisibility = " + this.isVisibility);
        if (this.isVisibility) {
            return;
        }
        this.isVisibility = true;
        loadAd();
    }

    @sf5(tag = I01XX0.I0XXi0X)
    public final void onAdStateChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        boolean zXi0I = q62.OXO1.Xi0I();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : onAdStateChange " + zXi0I);
        if (zXi0I) {
            this.isFirstLoad = false;
        }
    }

    public final void setMViewWidth(int i) {
        this.mViewWidth = i;
    }

    public final void setVisibility(boolean z) {
        this.isVisibility = z;
    }
}
