package com.sma.smartv3.p610ui.p612me.item;

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
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.p610ui.p612me.item.MeADPCBannerItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MeADPCBannerItem extends BaseDslItem {
    private ADPCAdContainerView adContainerView;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;

    @aa1
    private final String TAG = "MeADPCBannerItem";
    private final boolean initEvent = true;

    public static final class OXO1 extends ADPCAdListener {
        public OXO1() {
        }

        public void onADClosed(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeADPCBannerItem.this.TAG + " -> Ad State : Closed");
            MeADPCBannerItem.this.isLoaded = false;
            MeADPCBannerItem.this.initView();
        }

        public void onADError(ADPCAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeADPCBannerItem.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            MeADPCBannerItem.this.isLoaded = false;
            MeADPCBannerItem.this.isLoading = false;
            MeADPCBannerItem.this.initView();
        }

        public void onADPresent(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeADPCBannerItem.this.TAG + " -> Ad State : Present");
        }

        public void onADReceive(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeADPCBannerItem.this.TAG + " -> Ad State : Loaded");
            MeADPCBannerItem.this.isLoaded = true;
            MeADPCBannerItem.this.isLoading = false;
            MeADPCBannerItem.this.initView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0$0(MeADPCBannerItem meADPCBannerItem, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(meADPCBannerItem.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + meADPCBannerItem.isLoaded + ", isLoading: " + meADPCBannerItem.isLoading);
            if (meADPCBannerItem.isLoaded || meADPCBannerItem.isLoading) {
                return;
            }
            meADPCBannerItem.isFirstLoad = false;
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.adContainerView);
        Intrinsics.XXI(viewM3483v);
        ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) viewM3483v;
        this.adContainerView = aDPCAdContainerView;
        if (aDPCAdContainerView == null) {
            Intrinsics.XXO("adContainerView");
            aDPCAdContainerView = null;
        }
        ADPCAdContainerView aDPCAdContainerView2 = aDPCAdContainerView;
        aDPCAdContainerView2.setAdListener(new OXO1());
        aDPCAdContainerView2.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.ae0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                MeADPCBannerItem.bindView$lambda$0$0(this.f5477IO, lifecycleOwner, event);
            }
        });
        if (this.isFirstLoad) {
            return;
        }
        this.isFirstLoad = true;
        this.isLoading = true;
        int dimension = (int) (aDPCAdContainerView2.getContext().getResources().getDisplayMetrics().widthPixels - (aDPCAdContainerView2.getResources().getDimension(R.dimen.ab_banner_margin) * 2));
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : loadAdView viewWidth:" + dimension + ", id:" + aDPCAdContainerView2.getAdUnitId());
        ADPCAdContainerView.loadAdView$default(aDPCAdContainerView2, null, dimension, true, null, 9, null);
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
        return R.layout.me_item_banner_adpc;
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
