package com.sma.smartv3.ui.me.item;

import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ae0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
public final class MeADPCBannerItem extends BaseDslItem {

    @aa1
    private final String TAG;
    private ADPCAdContainerView adContainerView;
    private final boolean initEvent;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;

    public static final class OXO1 extends ADPCAdListener {
        public final /* synthetic */ MeADPCBannerItem OXO1;

        public OXO1(MeADPCBannerItem r1) {
            this.OXO1 = r1;
        }

        public void onADClosed(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Closed");
            MeADPCBannerItem.access$setLoaded$p(this.OXO1, false);
            this.OXO1.initView();
        }

        public void onADError(ADPCAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
            MeADPCBannerItem.access$setLoaded$p(this.OXO1, false);
            MeADPCBannerItem.access$setLoading$p(this.OXO1, false);
            this.OXO1.initView();
        }

        public void onADPresent(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Present");
        }

        public void onADReceive(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeADPCBannerItem.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
            MeADPCBannerItem.access$setLoaded$p(this.OXO1, true);
            MeADPCBannerItem.access$setLoading$p(this.OXO1, false);
            this.OXO1.initView();
        }
    }

    public MeADPCBannerItem() {
        this.TAG = "MeADPCBannerItem";
        this.initEvent = true;
    }

    public static /* synthetic */ void O00(MeADPCBannerItem r0, LifecycleOwner r1, Lifecycle.Event r2) {
        bindView$lambda$0$0(r0, r1, r2);
    }

    public static final /* synthetic */ String access$getTAG$p(MeADPCBannerItem r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setLoaded$p(MeADPCBannerItem r0, boolean r1) {
        r0.isLoaded = r1;
    }

    public static final /* synthetic */ void access$setLoading$p(MeADPCBannerItem r0, boolean r1) {
        r0.isLoading = r1;
    }

    private static final void bindView$lambda$0$0(MeADPCBannerItem r4, LifecycleOwner r5, Lifecycle.Event r6) {
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
    public void bindView(@aa1 DslViewHolder r8) {
        Intrinsics.X0O(r8, "itemHolder");
        View r9 = r8.v(R.id.adContainerView);
        Intrinsics.XXI(r9);
        ADPCAdContainerView r10 = (ADPCAdContainerView) r9;
        this.adContainerView = r10;
        if (r10 != null) goto L5;
        Intrinsics.XXO("adContainerView");
        r10 = null;
    L5:
        ADPCAdContainerView r0 = r10;
        r0.setAdListener(new OXO1(this));
        r0.setHostActivityObserver(new ae0(this));
        if (this.isFirstLoad == true) goto L9;
        this.isFirstLoad = true;
        this.isLoading = true;
        int r2 = (int) (r0.getContext().getResources().getDisplayMetrics().widthPixels - (r0.getResources().getDimension(R.dimen.ab_banner_margin) * 2));
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : loadAdView viewWidth:" + r2 + ", id:" + r0.getAdUnitId());
        ADPCAdContainerView.loadAdView$default(r0, null, r2, true, null, 9, null);
        return;
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
    public final void onAdStateChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        boolean r5 = q62.OXO1.Xi0I();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : onAdStateChange " + r5);
        if (r5 == false) goto L6;
        this.isFirstLoad = false;
        return;
    }
}
