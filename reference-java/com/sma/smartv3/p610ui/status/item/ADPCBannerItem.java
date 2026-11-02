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
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.p610ui.status.item.ADPCBannerItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ADPCBannerItem extends BaseDslItem {
    private ADPCAdContainerView adContainerView;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;

    @aa1
    private final String TAG = "ADPCBannerItem";
    private final boolean initEvent = true;

    public static final class OXO1 extends ADPCAdListener {
        public OXO1() {
        }

        public void onADClosed(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPCBannerItem.this.TAG + " -> Ad State : Closed");
            ADPCBannerItem.this.isLoaded = false;
            ADPCBannerItem.this.initView();
        }

        public void onADError(ADPCAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPCBannerItem.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            ADPCBannerItem.this.isLoaded = false;
            ADPCBannerItem.this.isLoading = false;
            ADPCBannerItem.this.initView();
        }

        public void onADPresent(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPCBannerItem.this.TAG + " -> Ad State : Present");
        }

        public void onADReceive(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPCBannerItem.this.TAG + " -> Ad State : Loaded");
            ADPCBannerItem.this.isLoaded = true;
            ADPCBannerItem.this.isLoading = false;
            ADPCBannerItem.this.initView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0$0(ADPCBannerItem aDPCBannerItem, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(aDPCBannerItem.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + aDPCBannerItem.isLoaded + ", isLoading: " + aDPCBannerItem.isLoading);
            if (aDPCBannerItem.isLoaded || aDPCBannerItem.isLoading) {
                return;
            }
            aDPCBannerItem.isFirstLoad = false;
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        ADPCAdContainerView aDPCAdContainerView;
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.adContainerView);
        Intrinsics.XXI(viewM3483v);
        ADPCAdContainerView aDPCAdContainerView2 = (ADPCAdContainerView) viewM3483v;
        this.adContainerView = aDPCAdContainerView2;
        if (aDPCAdContainerView2 == null) {
            Intrinsics.XXO("adContainerView");
            aDPCAdContainerView2 = null;
        }
        aDPCAdContainerView2.setAdListener(new OXO1());
        aDPCAdContainerView2.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.iIiiO
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ADPCBannerItem.bindView$lambda$0$0(this.f7963IO, lifecycleOwner, event);
            }
        });
        if (this.isFirstLoad) {
            return;
        }
        this.isFirstLoad = true;
        this.isLoading = true;
        int dimension = (int) (aDPCAdContainerView2.getContext().getResources().getDisplayMetrics().widthPixels - (aDPCAdContainerView2.getResources().getDimension(R.dimen.ab_banner_margin) * 2));
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : loadAdView viewWidth:" + dimension + ", id:" + aDPCAdContainerView2.getAdUnitId());
        ADPCAdContainerView aDPCAdContainerView3 = this.adContainerView;
        if (aDPCAdContainerView3 == null) {
            Intrinsics.XXO("adContainerView");
            aDPCAdContainerView = null;
        } else {
            aDPCAdContainerView = aDPCAdContainerView3;
        }
        ADPCAdContainerView.loadAdView$default(aDPCAdContainerView, null, dimension, true, null, 9, null);
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
        return R.layout.status_item_banner_adpc;
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
