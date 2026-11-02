package com.sma.smartv3.ui.ai.item;

import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i010I;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ad.ADPCAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIADPCBannerItem extends BaseDslItem {

    @aa1
    private final String TAG;
    private ADPCAdContainerView adContainerView;
    private final boolean initEvent;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;
    private boolean isVisibility;
    private int mViewWidth;

    public static final class OXO1 extends ADPCAdListener {
        public final /* synthetic */ AIADPCBannerItem OXO1;
        public final /* synthetic */ ADPCAdContainerView XIi00iiXO;

        public OXO1(AIADPCBannerItem r1, ADPCAdContainerView r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        public void onADClosed(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Closed");
            AIADPCBannerItem.access$setLoaded$p(this.OXO1, false);
            this.OXO1.initView();
        }

        public void onADError(ADPCAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
            AIADPCBannerItem.access$setLoaded$p(this.OXO1, false);
            AIADPCBannerItem.access$setLoading$p(this.OXO1, false);
            this.OXO1.initView();
        }

        public void onADPresent(String r4) {
            Intrinsics.X0O(r4, "adUnitId");
            i1O0OXO1O r5 = i1O0OXO1O.OXO1;
            r5.OXO1(AIADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Present");
            r5.XIi00iiXO(AIADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : ai页面  展示.... 广告展示了 -->  id:" + this.XIi00iiXO.getAdUnitId());
        }

        public void onADReceive(String r4) {
            Intrinsics.X0O(r4, "adUnitId");
            i1O0OXO1O r5 = i1O0OXO1O.OXO1;
            r5.OXO1(AIADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
            r5.OXO1(AIADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : ai页面  加载.... 广告加载.了 -->  id:" + this.XIi00iiXO.getAdUnitId());
            AIADPCBannerItem.access$setLoaded$p(this.OXO1, true);
            AIADPCBannerItem.access$setLoading$p(this.OXO1, false);
            this.OXO1.initView();
        }
    }

    public AIADPCBannerItem() {
        this.TAG = "AIADPCBannerItem";
        this.initEvent = true;
    }

    public static /* synthetic */ void IiI10X(AIADPCBannerItem r0, ADPCAdContainerView r1) {
        bindView$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ void O00(AIADPCBannerItem r0, LifecycleOwner r1, Lifecycle.Event r2) {
        bindView$lambda$0$0(r0, r1, r2);
    }

    public static final /* synthetic */ String access$getTAG$p(AIADPCBannerItem r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setLoaded$p(AIADPCBannerItem r0, boolean r1) {
        r0.isLoaded = r1;
    }

    public static final /* synthetic */ void access$setLoading$p(AIADPCBannerItem r0, boolean r1) {
        r0.isLoading = r1;
    }

    private static final void bindView$lambda$0$0(AIADPCBannerItem r4, LifecycleOwner r5, Lifecycle.Event r6) {
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

    private static final void bindView$lambda$0$1(AIADPCBannerItem r4, ADPCAdContainerView r5) {
        if (r4.isFirstLoad == false) goto L5;
        return;
    L5:
        if (r4.isVisibility == false) goto L9;
        r4.isFirstLoad = true;
        r4.isLoading = true;
        r4.mViewWidth = r5.getWidth();
        i1O0OXO1O.OXO1.OXO1(r4.TAG + " -> Ad State : loadAdView isVisibility = " + r4.isVisibility + " viewWidth:" + r5.getWidth() + ", id:" + r5.getAdUnitId());
        return;
    }

    private final void loadAd() {
        if (this.mViewWidth != 0) goto L11;
        ADPCAdContainerView r0 = this.adContainerView;
        if (r0 != null) goto L7;
        Intrinsics.XXO("adContainerView");
        r0 = null;
    L7:
        float r1 = r0.getContext().getResources().getDisplayMetrics().widthPixels;
        ADPCAdContainerView r3 = this.adContainerView;
        if (r3 != null) goto L10;
        Intrinsics.XXO("adContainerView");
        r3 = null;
    L10:
        this.mViewWidth = (int) (r1 - (r3.getContext().getResources().getDimension(R.dimen.ab_banner_margin) * 2));
    L11:
        ADPCAdContainerView r2 = this.adContainerView;
        if (r2 != null) goto L14;
        Intrinsics.XXO("adContainerView");
        ADPCAdContainerView r4 = null;
    L15:
        ADPCAdContainerView.loadAdView$default(r4, null, this.mViewWidth, true, null, 9, null);
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
        final ADPCAdContainerView r5 = (ADPCAdContainerView) r4;
        this.adContainerView = r5;
        if (r5 != null) goto L5;
        Intrinsics.XXO("adContainerView");
        r5 = null;
    L5:
        r5.setAdListener(new OXO1(this, r5));
        r5.setHostActivityObserver(new i010I(this));
        r5.getViewTreeObserver().addOnGlobalLayoutListener(new iX(this, r5));
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
