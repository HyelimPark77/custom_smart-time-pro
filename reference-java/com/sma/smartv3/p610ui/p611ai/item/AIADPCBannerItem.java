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
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.p610ui.p611ai.item.AIADPCBannerItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIADPCBannerItem extends BaseDslItem {
    private ADPCAdContainerView adContainerView;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;
    private boolean isVisibility;
    private int mViewWidth;

    @aa1
    private final String TAG = "AIADPCBannerItem";
    private final boolean initEvent = true;

    public static final class OXO1 extends ADPCAdListener {
        public final /* synthetic */ ADPCAdContainerView XIi00iiXO;

        public OXO1(ADPCAdContainerView aDPCAdContainerView) {
            this.XIi00iiXO = aDPCAdContainerView;
        }

        public void onADClosed(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPCBannerItem.this.TAG + " -> Ad State : Closed");
            AIADPCBannerItem.this.isLoaded = false;
            AIADPCBannerItem.this.initView();
        }

        public void onADError(ADPCAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPCBannerItem.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            AIADPCBannerItem.this.isLoaded = false;
            AIADPCBannerItem.this.isLoading = false;
            AIADPCBannerItem.this.initView();
        }

        public void onADPresent(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(AIADPCBannerItem.this.TAG + " -> Ad State : Present");
            i1o0oxo1o.XIi00iiXO(AIADPCBannerItem.this.TAG + " -> Ad State : ai页面  展示.... 广告展示了 -->  id:" + this.XIi00iiXO.getAdUnitId());
        }

        public void onADReceive(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(AIADPCBannerItem.this.TAG + " -> Ad State : Loaded");
            i1o0oxo1o.OXO1(AIADPCBannerItem.this.TAG + " -> Ad State : ai页面  加载.... 广告加载.了 -->  id:" + this.XIi00iiXO.getAdUnitId());
            AIADPCBannerItem.this.isLoaded = true;
            AIADPCBannerItem.this.isLoading = false;
            AIADPCBannerItem.this.initView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0$0(AIADPCBannerItem aIADPCBannerItem, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(aIADPCBannerItem.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + aIADPCBannerItem.isLoaded + ", isLoading: " + aIADPCBannerItem.isLoading);
            if (aIADPCBannerItem.isLoaded || aIADPCBannerItem.isLoading) {
                return;
            }
            aIADPCBannerItem.isFirstLoad = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0$1(AIADPCBannerItem aIADPCBannerItem, ADPCAdContainerView aDPCAdContainerView) {
        if (aIADPCBannerItem.isFirstLoad || !aIADPCBannerItem.isVisibility) {
            return;
        }
        aIADPCBannerItem.isFirstLoad = true;
        aIADPCBannerItem.isLoading = true;
        aIADPCBannerItem.mViewWidth = aDPCAdContainerView.getWidth();
        i1O0OXO1O.OXO1.OXO1(aIADPCBannerItem.TAG + " -> Ad State : loadAdView isVisibility = " + aIADPCBannerItem.isVisibility + " viewWidth:" + aDPCAdContainerView.getWidth() + ", id:" + aDPCAdContainerView.getAdUnitId());
    }

    private final void loadAd() {
        ADPCAdContainerView aDPCAdContainerView;
        if (this.mViewWidth == 0) {
            ADPCAdContainerView aDPCAdContainerView2 = this.adContainerView;
            if (aDPCAdContainerView2 == null) {
                Intrinsics.XXO("adContainerView");
                aDPCAdContainerView2 = null;
            }
            float f = aDPCAdContainerView2.getContext().getResources().getDisplayMetrics().widthPixels;
            ADPCAdContainerView aDPCAdContainerView3 = this.adContainerView;
            if (aDPCAdContainerView3 == null) {
                Intrinsics.XXO("adContainerView");
                aDPCAdContainerView3 = null;
            }
            this.mViewWidth = (int) (f - (aDPCAdContainerView3.getContext().getResources().getDimension(R.dimen.ab_banner_margin) * 2));
        }
        ADPCAdContainerView aDPCAdContainerView4 = this.adContainerView;
        if (aDPCAdContainerView4 == null) {
            Intrinsics.XXO("adContainerView");
            aDPCAdContainerView = null;
        } else {
            aDPCAdContainerView = aDPCAdContainerView4;
        }
        ADPCAdContainerView.loadAdView$default(aDPCAdContainerView, null, this.mViewWidth, true, null, 9, null);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.adContainerView);
        Intrinsics.XXI(viewM3483v);
        final ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) viewM3483v;
        this.adContainerView = aDPCAdContainerView;
        if (aDPCAdContainerView == null) {
            Intrinsics.XXO("adContainerView");
            aDPCAdContainerView = null;
        }
        aDPCAdContainerView.setAdListener(new OXO1(aDPCAdContainerView));
        aDPCAdContainerView.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.i010I
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                AIADPCBannerItem.bindView$lambda$0$0(this.f7293IO, lifecycleOwner, event);
            }
        });
        aDPCAdContainerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.mltcode.paycertificationapi.iX
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AIADPCBannerItem.bindView$lambda$0$1(this.f8214IO, aDPCAdContainerView);
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
        return R.layout.ai_item_banner_adpc;
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
