package com.sma.smartv3.ui.ai.item;

import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.II1Xi0;
import com.android.mltcode.paycertificationapi.X01IiOiIi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.biz.ad.ADPAdError;
import com.sma.smartv3.biz.ad.ADPAdListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ad.ADPAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIADPBannerItem extends BaseDslItem {

    @aa1
    private final String TAG;
    private ADPAdContainerView adContainerView;
    private final boolean initEvent;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;
    private boolean isVisibility;
    private int mViewWidth;

    public static final class OXO1 extends ADPAdListener {
        public final /* synthetic */ AIADPBannerItem OXO1;

        public OXO1(AIADPBannerItem r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdClose(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Closed");
            AIADPBannerItem.access$setLoaded$p(this.OXO1, false);
            this.OXO1.initView();
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdFailed(ADPAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
            AIADPBannerItem.access$setLoaded$p(this.OXO1, false);
            AIADPBannerItem.access$setLoading$p(this.OXO1, false);
            this.OXO1.initView();
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdLoaded(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
            AIADPBannerItem.access$setLoaded$p(this.OXO1, true);
            AIADPBannerItem.access$setLoading$p(this.OXO1, false);
            this.OXO1.initView();
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdOpen(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Open");
        }
    }

    public AIADPBannerItem() {
        this.TAG = "AIADPBannerItem";
        this.initEvent = true;
    }

    public static /* synthetic */ void IiI10X(AIADPBannerItem r0, LifecycleOwner r1, Lifecycle.Event r2) {
        bindView$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void O00(AIADPBannerItem r0, ADPAdContainerView r1) {
        bindView$lambda$0$1(r0, r1);
    }

    public static final /* synthetic */ String access$getTAG$p(AIADPBannerItem r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setLoaded$p(AIADPBannerItem r0, boolean r1) {
        r0.isLoaded = r1;
    }

    public static final /* synthetic */ void access$setLoading$p(AIADPBannerItem r0, boolean r1) {
        r0.isLoading = r1;
    }

    private static final void bindView$lambda$0$0(AIADPBannerItem r4, LifecycleOwner r5, Lifecycle.Event r6) {
        Intrinsics.X0O(r5, "source");
        Intrinsics.X0O(r6, NotificationCompat.CATEGORY_EVENT);
        if (r6 != Lifecycle.Event.ON_RESUME) goto L10;
        i1O0OXO1O.OXO1.OXO1(r4.TAG + " -> Ad State : Lifecycle, Event: " + r6 + ", isLoaded: " + r4.isLoaded + ", isLoading: " + r4.isLoading);
        if (r4.isLoaded == false) goto L7;
        return;
    L7:
        if (r4.isLoading == true) goto L12;
        r4.isFirstLoad = false;
        return;
    L12:
        return;
    }

    private static final void bindView$lambda$0$1(AIADPBannerItem r3, ADPAdContainerView r4) {
        if (r3.isFirstLoad == false) goto L5;
        return;
    L5:
        if (r3.isVisibility == false) goto L9;
        r3.isFirstLoad = true;
        r3.isLoading = true;
        r3.mViewWidth = r4.getWidth();
        i1O0OXO1O.OXO1.OXO1(r3.TAG + " -> Ad State : loadAdView viewWidth:" + r4.getWidth() + ", id:" + r4.getAdUnitId());
        return;
    }

    private final void loadAd() {
        if (this.mViewWidth != 0) goto L11;
        ADPAdContainerView r0 = this.adContainerView;
        if (r0 != null) goto L7;
        Intrinsics.XXO("adContainerView");
        r0 = null;
    L7:
        float r1 = r0.getContext().getResources().getDisplayMetrics().widthPixels;
        ADPAdContainerView r3 = this.adContainerView;
        if (r3 != null) goto L10;
        Intrinsics.XXO("adContainerView");
        r3 = null;
    L10:
        this.mViewWidth = (int) (r1 - (r3.getContext().getResources().getDimension(R.dimen.ab_banner_margin) * 2));
    L11:
        ADPAdContainerView r2 = this.adContainerView;
        if (r2 != null) goto L14;
        Intrinsics.XXO("adContainerView");
        ADPAdContainerView r4 = null;
    L15:
        ADPAdContainerView.loadAdView$default(r4, null, this.mViewWidth, true, null, 9, null);
        return;
    L14:
        r4 = r2;
        goto L15
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        View r4 = r3.v(R.id.adContainerView);
        Intrinsics.XXI(r4);
        final ADPAdContainerView r5 = (ADPAdContainerView) r4;
        this.adContainerView = r5;
        if (r5 != null) goto L5;
        Intrinsics.XXO("adContainerView");
        r5 = null;
    L5:
        r5.setAdListener(new OXO1(this));
        r5.setHostActivityObserver(new X01IiOiIi(this));
        r5.getViewTreeObserver().addOnGlobalLayoutListener(new II1Xi0(this, r5));
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
    public final void onAIViewVisibilityChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State :  onAIViewVisibilityChange  isVisibility = " + this.isVisibility);
        if (this.isVisibility == true) goto L6;
        this.isVisibility = true;
        loadAd();
        return;
    }

    @sf5(tag = I01XX0.I0XXi0X)
    public final void onAdStateChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        boolean r5 = q62.OXO1.Xi0I();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : onAdStateChange " + r5);
        if (r5 == false) goto L6;
        this.isFirstLoad = false;
        return;
    }

    public final void setMViewWidth(int r1) {
        this.mViewWidth = r1;
    }

    public final void setVisibility(boolean r1) {
        this.isVisibility = r1;
    }
}
