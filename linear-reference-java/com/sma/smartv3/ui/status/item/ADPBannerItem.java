package com.sma.smartv3.ui.status.item;

import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I1XOi1;
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

/* JADX INFO: loaded from: classes3.dex */
public final class ADPBannerItem extends BaseDslItem {

    @aa1
    private final String TAG;
    private ADPAdContainerView adContainerView;
    private final boolean initEvent;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;

    public static final class OXO1 extends ADPAdListener {
        public final /* synthetic */ ADPBannerItem OXO1;

        public OXO1(ADPBannerItem r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdClose(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Closed");
            ADPBannerItem.access$setLoaded$p(this.OXO1, false);
            this.OXO1.initView();
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdFailed(ADPAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
            ADPBannerItem.access$setLoaded$p(this.OXO1, false);
            ADPBannerItem.access$setLoading$p(this.OXO1, false);
            this.OXO1.initView();
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdLoaded(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
            ADPBannerItem.access$setLoaded$p(this.OXO1, true);
            ADPBannerItem.access$setLoading$p(this.OXO1, false);
            this.OXO1.initView();
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdOpen(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ADPBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Open");
        }
    }

    public ADPBannerItem() {
        this.TAG = "ADPBannerItem";
        this.initEvent = true;
    }

    public static /* synthetic */ void O00(ADPBannerItem r0, LifecycleOwner r1, Lifecycle.Event r2) {
        bindView$lambda$0$0(r0, r1, r2);
    }

    public static final /* synthetic */ String access$getTAG$p(ADPBannerItem r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setLoaded$p(ADPBannerItem r0, boolean r1) {
        r0.isLoaded = r1;
    }

    public static final /* synthetic */ void access$setLoading$p(ADPBannerItem r0, boolean r1) {
        r0.isLoading = r1;
    }

    private static final void bindView$lambda$0$0(ADPBannerItem r4, LifecycleOwner r5, Lifecycle.Event r6) {
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

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r11) {
        Intrinsics.X0O(r11, "itemHolder");
        View r12 = r11.v(R.id.adContainerView);
        Intrinsics.XXI(r12);
        ADPAdContainerView r13 = (ADPAdContainerView) r12;
        this.adContainerView = r13;
        if (r13 != null) goto L5;
        Intrinsics.XXO("adContainerView");
        r13 = null;
    L5:
        r13.setAdListener(new OXO1(this));
        r13.setHostActivityObserver(new I1XOi1(this));
        if (this.isFirstLoad == true) goto L13;
        this.isFirstLoad = true;
        this.isLoading = true;
        int r5 = (int) (r13.getContext().getResources().getDisplayMetrics().widthPixels - (r13.getResources().getDimension(R.dimen.ab_banner_margin) * 2));
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : loadAdView viewWidth:" + r5 + ", id:" + r13.getAdUnitId());
        ADPAdContainerView r14 = this.adContainerView;
        if (r14 != null) goto L10;
        Intrinsics.XXO("adContainerView");
        ADPAdContainerView r3 = null;
    L11:
        ADPAdContainerView.loadAdView$default(r3, null, r5, true, null, 9, null);
        return;
    L10:
        r3 = r14;
        goto L11
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
    public final void onAdStateChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        boolean r5 = q62.OXO1.Xi0I();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : onAdStateChange " + r5);
        if (r5 == false) goto L6;
        this.isFirstLoad = false;
        return;
    }
}
