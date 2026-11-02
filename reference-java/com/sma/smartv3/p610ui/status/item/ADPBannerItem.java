package com.sma.smartv3.p610ui.status.item;

import android.view.View;
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
import com.sma.smartv3.p610ui.status.item.ADPBannerItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ADPBannerItem extends BaseDslItem {
    private ADPAdContainerView adContainerView;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;

    @aa1
    private final String TAG = "ADPBannerItem";
    private final boolean initEvent = true;

    public static final class OXO1 extends ADPAdListener {
        public OXO1() {
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdClose(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPBannerItem.this.TAG + " -> Ad State : Closed");
            ADPBannerItem.this.isLoaded = false;
            ADPBannerItem.this.initView();
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdFailed(ADPAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPBannerItem.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            ADPBannerItem.this.isLoaded = false;
            ADPBannerItem.this.isLoading = false;
            ADPBannerItem.this.initView();
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdLoaded(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPBannerItem.this.TAG + " -> Ad State : Loaded");
            ADPBannerItem.this.isLoaded = true;
            ADPBannerItem.this.isLoading = false;
            ADPBannerItem.this.initView();
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdOpen(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPBannerItem.this.TAG + " -> Ad State : Open");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0$0(ADPBannerItem aDPBannerItem, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(aDPBannerItem.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + aDPBannerItem.isLoaded + ", isLoading: " + aDPBannerItem.isLoading);
            if (aDPBannerItem.isLoaded || aDPBannerItem.isLoading) {
                return;
            }
            aDPBannerItem.isFirstLoad = false;
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        ADPAdContainerView aDPAdContainerView;
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.adContainerView);
        Intrinsics.XXI(viewM3483v);
        ADPAdContainerView aDPAdContainerView2 = (ADPAdContainerView) viewM3483v;
        this.adContainerView = aDPAdContainerView2;
        if (aDPAdContainerView2 == null) {
            Intrinsics.XXO("adContainerView");
            aDPAdContainerView2 = null;
        }
        aDPAdContainerView2.setAdListener(new OXO1());
        aDPAdContainerView2.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.I1XOi1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ADPBannerItem.bindView$lambda$0$0(this.f1458IO, lifecycleOwner, event);
            }
        });
        if (this.isFirstLoad) {
            return;
        }
        this.isFirstLoad = true;
        this.isLoading = true;
        int dimension = (int) (aDPAdContainerView2.getContext().getResources().getDisplayMetrics().widthPixels - (aDPAdContainerView2.getResources().getDimension(R.dimen.ab_banner_margin) * 2));
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : loadAdView viewWidth:" + dimension + ", id:" + aDPAdContainerView2.getAdUnitId());
        ADPAdContainerView aDPAdContainerView3 = this.adContainerView;
        if (aDPAdContainerView3 == null) {
            Intrinsics.XXO("adContainerView");
            aDPAdContainerView = null;
        } else {
            aDPAdContainerView = aDPAdContainerView3;
        }
        ADPAdContainerView.loadAdView$default(aDPAdContainerView, null, dimension, true, null, 9, null);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!this.isLoaded);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_banner_adp;
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
}
