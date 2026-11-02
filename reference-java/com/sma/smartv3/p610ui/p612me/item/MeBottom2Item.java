package com.sma.smartv3.p610ui.p612me.item;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.biz.p242ad.ADPAdError;
import com.sma.smartv3.biz.p242ad.ADPAdListener;
import com.sma.smartv3.p610ui.p612me.item.MeBottom2Item;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class MeBottom2Item extends BaseDslItem {

    @tb1
    private ADPAdContainerView adpAdContainerView;

    @tb1
    private ADPCAdContainerView adpcAdContainerView;
    private LinearLayout btContactUs;
    public View btExerciseCourse;
    private LinearLayout btFAQ;
    public View btFeedBack;
    public View btFirmwareRepair;
    public View btFont;
    private LinearLayout btHelp;
    private View btLanguageRepair;
    public View btPermissionSetting;
    private LinearLayout btTalk;
    public View btThemeSwitch;
    public View btUiRepair;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;
    private boolean isVisibility;
    public ImageView ivRemind;

    @tb1
    private View.OnClickListener mOnClick;
    private int mViewWidth;

    @aa1
    private final String TAG = "MeBottom2Item";
    private final boolean initEvent = true;

    public static final class OXO1 extends ADPCAdListener {
        public final /* synthetic */ ADPCAdContainerView XIi00iiXO;

        public OXO1(ADPCAdContainerView aDPCAdContainerView) {
            this.XIi00iiXO = aDPCAdContainerView;
        }

        public void onADClosed(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeBottom2Item.this.TAG + " -> Ad State : Closed");
            MeBottom2Item.this.isLoaded = false;
            this.XIi00iiXO.setVisibility(8);
        }

        public void onADError(ADPCAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeBottom2Item.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            MeBottom2Item.this.isLoaded = false;
            MeBottom2Item.this.isLoading = false;
            this.XIi00iiXO.setVisibility(8);
        }

        public void onADPresent(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.XIi00iiXO(MeBottom2Item.this.TAG + " -> Ad State : 广告展示  展示中  我的页面  顶层");
            i1o0oxo1o.OXO1(MeBottom2Item.this.TAG + " -> Ad State : Present");
        }

        public void onADReceive(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(MeBottom2Item.this.TAG + " -> Ad State : Loaded");
            i1o0oxo1o.OXO1(MeBottom2Item.this.TAG + " -> Ad State : 广告加载  加载中  我的页面  顶层");
            MeBottom2Item.this.isLoaded = true;
            MeBottom2Item.this.isLoading = false;
            this.XIi00iiXO.setVisibility(0);
        }
    }

    public static final class XIi00iiXO extends ADPAdListener {
        public final /* synthetic */ ADPAdContainerView XIi00iiXO;

        public XIi00iiXO(ADPAdContainerView aDPAdContainerView) {
            this.XIi00iiXO = aDPAdContainerView;
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdClose(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeBottom2Item.this.TAG + " -> Ad State : Closed");
            MeBottom2Item.this.isLoaded = false;
            this.XIi00iiXO.setVisibility(8);
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdFailed(ADPAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MeBottom2Item.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            MeBottom2Item.this.isLoaded = false;
            MeBottom2Item.this.isLoading = false;
            this.XIi00iiXO.setVisibility(8);
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdLoaded(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(MeBottom2Item.this.TAG + " -> Ad State : Loaded");
            i1o0oxo1o.OXO1(MeBottom2Item.this.TAG + " -> Ad State : 广告加载  加载中  我的页面  顶层");
            MeBottom2Item.this.isLoaded = true;
            MeBottom2Item.this.isLoading = false;
            this.XIi00iiXO.setVisibility(0);
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdOpen(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(MeBottom2Item.this.TAG + " -> Ad State : Open");
            i1o0oxo1o.XIi00iiXO(MeBottom2Item.this.TAG + " -> Ad State : 广告展示  展示中  我的页面  顶层");
        }
    }

    private final void loadAd() {
        ADPAdContainerView aDPAdContainerView;
        if (this.mViewWidth == 0) {
            LinearLayout linearLayout = this.btContactUs;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.XXO("btContactUs");
                linearLayout = null;
            }
            float f = linearLayout.getContext().getResources().getDisplayMetrics().widthPixels;
            LinearLayout linearLayout3 = this.btContactUs;
            if (linearLayout3 == null) {
                Intrinsics.XXO("btContactUs");
            } else {
                linearLayout2 = linearLayout3;
            }
            this.mViewWidth = (int) (f - (linearLayout2.getContext().getResources().getDimension(R.dimen.ab_banner_margin) * 2));
        }
        i72 i72Var = i72.OXO1;
        if (!i72Var.X11I() && i72Var.IX0iIX()) {
            ADPCAdContainerView aDPCAdContainerView = this.adpcAdContainerView;
            if (aDPCAdContainerView != null) {
                ADPCAdContainerView.loadAdView$default(aDPCAdContainerView, null, this.mViewWidth, true, null, 9, null);
                return;
            }
            return;
        }
        if (i72Var.X11I() || !i72Var.IOi1O0() || (aDPAdContainerView = this.adpAdContainerView) == null) {
            return;
        }
        ADPAdContainerView.loadAdView$default(aDPAdContainerView, null, this.mViewWidth, true, null, 9, null);
    }

    private final void showAd() {
        i72 i72Var = i72.OXO1;
        if (!i72Var.X11I() && i72Var.IX0iIX()) {
            final ADPCAdContainerView aDPCAdContainerView = this.adpcAdContainerView;
            if (aDPCAdContainerView != null) {
                aDPCAdContainerView.setVisibility(0);
                aDPCAdContainerView.setAdListener(new OXO1(aDPCAdContainerView));
                aDPCAdContainerView.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.de0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        MeBottom2Item.showAd$lambda$0$0(this.f6167IO, lifecycleOwner, event);
                    }
                });
                aDPCAdContainerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.mltcode.paycertificationapi.ee0
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        MeBottom2Item.showAd$lambda$0$1(this.f6399IO, aDPCAdContainerView);
                    }
                });
                return;
            }
            return;
        }
        if (!i72Var.X11I() && i72Var.IOi1O0()) {
            final ADPAdContainerView aDPAdContainerView = this.adpAdContainerView;
            if (aDPAdContainerView != null) {
                aDPAdContainerView.setVisibility(0);
                aDPAdContainerView.setAdListener(new XIi00iiXO(aDPAdContainerView));
                aDPAdContainerView.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.fe0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        MeBottom2Item.showAd$lambda$1$0(this.f6624IO, lifecycleOwner, event);
                    }
                });
                aDPAdContainerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.mltcode.paycertificationapi.ge0
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        MeBottom2Item.showAd$lambda$1$1(this.f6862IO, aDPAdContainerView);
                    }
                });
                return;
            }
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : hide");
        ADPCAdContainerView aDPCAdContainerView2 = this.adpcAdContainerView;
        if (aDPCAdContainerView2 != null) {
            aDPCAdContainerView2.setVisibility(8);
        }
        ADPAdContainerView aDPAdContainerView2 = this.adpAdContainerView;
        if (aDPAdContainerView2 != null) {
            aDPAdContainerView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$0$0(MeBottom2Item meBottom2Item, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(meBottom2Item.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + meBottom2Item.isLoaded + ", isLoading: " + meBottom2Item.isLoading);
            if (meBottom2Item.isLoaded || meBottom2Item.isLoading) {
                return;
            }
            meBottom2Item.isFirstLoad = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$0$1(MeBottom2Item meBottom2Item, ADPCAdContainerView aDPCAdContainerView) {
        if (meBottom2Item.isFirstLoad || !meBottom2Item.isVisibility) {
            return;
        }
        meBottom2Item.isFirstLoad = true;
        meBottom2Item.isLoading = true;
        meBottom2Item.mViewWidth = aDPCAdContainerView.getWidth();
        i1O0OXO1O.OXO1.OXO1(meBottom2Item.TAG + " -> Ad State : loadAdView viewWidth:" + aDPCAdContainerView.getWidth() + ", id:" + aDPCAdContainerView.getAdUnitId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$1$0(MeBottom2Item meBottom2Item, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(meBottom2Item.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + meBottom2Item.isLoaded + ", isLoading: " + meBottom2Item.isLoading);
            if (meBottom2Item.isLoaded || meBottom2Item.isLoading) {
                return;
            }
            meBottom2Item.isFirstLoad = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$1$1(MeBottom2Item meBottom2Item, ADPAdContainerView aDPAdContainerView) {
        if (meBottom2Item.isFirstLoad || !meBottom2Item.isVisibility) {
            return;
        }
        meBottom2Item.isFirstLoad = true;
        meBottom2Item.isLoading = true;
        meBottom2Item.mViewWidth = aDPAdContainerView.getWidth();
        i1O0OXO1O.OXO1.OXO1(meBottom2Item.TAG + " -> Ad State : loadAdView viewWidth:" + aDPAdContainerView.getWidth() + ", id:" + aDPAdContainerView.getAdUnitId());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.ivRemind);
        Intrinsics.XXI(viewM3483v);
        setIvRemind((ImageView) viewM3483v);
        View viewM3483v2 = itemHolder.m3483v(R.id.btExercise);
        Intrinsics.XXI(viewM3483v2);
        setBtExerciseCourse(viewM3483v2);
        View viewM3483v3 = itemHolder.m3483v(R.id.btFirmwareRepair);
        Intrinsics.XXI(viewM3483v3);
        setBtFirmwareRepair(viewM3483v3);
        View viewM3483v4 = itemHolder.m3483v(R.id.btUiRepair);
        Intrinsics.XXI(viewM3483v4);
        setBtUiRepair(viewM3483v4);
        View viewM3483v5 = itemHolder.m3483v(R.id.btSwitch);
        Intrinsics.XXI(viewM3483v5);
        setBtThemeSwitch(viewM3483v5);
        View viewM3483v6 = itemHolder.m3483v(R.id.btFeedBack);
        Intrinsics.XXI(viewM3483v6);
        setBtFeedBack(viewM3483v6);
        View viewM3483v7 = itemHolder.m3483v(R.id.btFont);
        Intrinsics.XXI(viewM3483v7);
        setBtFont(viewM3483v7);
        View viewM3483v8 = itemHolder.m3483v(R.id.btPermissionSetting);
        Intrinsics.XXI(viewM3483v8);
        setBtPermissionSetting(viewM3483v8);
        View viewM3483v9 = itemHolder.m3483v(R.id.btHelp);
        Intrinsics.XXI(viewM3483v9);
        this.btHelp = (LinearLayout) viewM3483v9;
        View viewM3483v10 = itemHolder.m3483v(R.id.btTalk);
        Intrinsics.XXI(viewM3483v10);
        this.btTalk = (LinearLayout) viewM3483v10;
        View viewM3483v11 = itemHolder.m3483v(R.id.btContactUs);
        Intrinsics.XXI(viewM3483v11);
        this.btContactUs = (LinearLayout) viewM3483v11;
        View viewM3483v12 = itemHolder.m3483v(R.id.btFAQ);
        Intrinsics.XXI(viewM3483v12);
        this.btFAQ = (LinearLayout) viewM3483v12;
        itemHolder.click(R.id.btExercise, this.mOnClick);
        itemHolder.click(R.id.btSwitch, this.mOnClick);
        itemHolder.click(R.id.btFont, this.mOnClick);
        itemHolder.click(R.id.btFirmwareRepair, this.mOnClick);
        itemHolder.click(R.id.btUiRepair, this.mOnClick);
        itemHolder.click(R.id.btSetting, this.mOnClick);
        itemHolder.click(R.id.btAbout, this.mOnClick);
        itemHolder.click(R.id.btFeedBack, this.mOnClick);
        itemHolder.click(R.id.btFont, this.mOnClick);
        itemHolder.click(R.id.btPermissionSetting, this.mOnClick);
        itemHolder.click(R.id.btHelp, this.mOnClick);
        itemHolder.click(R.id.btTalk, this.mOnClick);
        itemHolder.click(R.id.btContactUs, this.mOnClick);
        itemHolder.click(R.id.btFAQ, this.mOnClick);
        this.adpAdContainerView = (ADPAdContainerView) itemHolder.m3483v(R.id.adpAdContainerView);
        this.adpcAdContainerView = (ADPCAdContainerView) itemHolder.m3483v(R.id.adpcAdContainerView);
        showAd();
    }

    @tb1
    public final ADPAdContainerView getAdpAdContainerView() {
        return this.adpAdContainerView;
    }

    @tb1
    public final ADPCAdContainerView getAdpcAdContainerView() {
        return this.adpcAdContainerView;
    }

    @aa1
    public final View getBtExerciseCourse() {
        View view = this.btExerciseCourse;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btExerciseCourse");
        return null;
    }

    @aa1
    public final View getBtFeedBack() {
        View view = this.btFeedBack;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btFeedBack");
        return null;
    }

    @aa1
    public final View getBtFirmwareRepair() {
        View view = this.btFirmwareRepair;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btFirmwareRepair");
        return null;
    }

    @aa1
    public final View getBtFont() {
        View view = this.btFont;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btFont");
        return null;
    }

    @aa1
    public final View getBtPermissionSetting() {
        View view = this.btPermissionSetting;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btPermissionSetting");
        return null;
    }

    @aa1
    public final View getBtThemeSwitch() {
        View view = this.btThemeSwitch;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btThemeSwitch");
        return null;
    }

    @aa1
    public final View getBtUiRepair() {
        View view = this.btUiRepair;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btUiRepair");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final ImageView getIvRemind() {
        ImageView imageView = this.ivRemind;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("ivRemind");
        return null;
    }

    @tb1
    public final View.OnClickListener getMOnClick() {
        return this.mOnClick;
    }

    public final int getMViewWidth() {
        return this.mViewWidth;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        getBtThemeSwitch().setVisibility((Build.VERSION.SDK_INT <= 28 || !i72.OXO1.X1OI()) ? 8 : 0);
        i72 i72Var = i72.OXO1;
        if (i72Var.X00Xi1X()) {
            getBtFont().setVisibility(8);
            getBtUiRepair().setVisibility(8);
            getBtFirmwareRepair().setVisibility(8);
        } else {
            View btFont = getBtFont();
            q62 q62Var = q62.OXO1;
            btFont.setVisibility(q62Var.XIIO11I() ? 0 : 8);
            getBtUiRepair().setVisibility((q62Var.I0i0() && q62Var.X1i()) ? 0 : 8);
            getBtFirmwareRepair().setVisibility(q62Var.iii0() ? 0 : 8);
        }
        getBtExerciseCourse().setVisibility(q62.OXO1.iiIOiX() != 0 ? 0 : 8);
        getBtPermissionSetting().setVisibility(i72Var.X00O0() ? 0 : 8);
        getBtFeedBack().setVisibility(i72Var.IX1XiI() ? 0 : 8);
        LinearLayout linearLayout = this.btHelp;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.XXO("btHelp");
            linearLayout = null;
        }
        linearLayout.setVisibility(i72Var.IX0IXOi() ? 0 : 8);
        LinearLayout linearLayout3 = this.btTalk;
        if (linearLayout3 == null) {
            Intrinsics.XXO("btTalk");
            linearLayout3 = null;
        }
        linearLayout3.setVisibility(i72Var.iIX0i() ? 0 : 8);
        LinearLayout linearLayout4 = this.btContactUs;
        if (linearLayout4 == null) {
            Intrinsics.XXO("btContactUs");
            linearLayout4 = null;
        }
        linearLayout4.setVisibility(i72Var.m2050Oi() ? 0 : 8);
        LinearLayout linearLayout5 = this.btFAQ;
        if (linearLayout5 == null) {
            Intrinsics.XXO("btFAQ");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.setVisibility(i72Var.iOI() ? 0 : 8);
    }

    public final boolean isVisibility() {
        return this.isVisibility;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_me_item_bottom;
    }

    @sf5(tag = I01XX0.f1085O1)
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
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : onAdStateChange");
        showAd();
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void onBindStateChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }

    @sf5(tag = I01XX0.iIXi1iiXI)
    public final void onNewVersionShow(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        getIvRemind().setVisibility(0);
    }

    public final void setAdpAdContainerView(@tb1 ADPAdContainerView aDPAdContainerView) {
        this.adpAdContainerView = aDPAdContainerView;
    }

    public final void setAdpcAdContainerView(@tb1 ADPCAdContainerView aDPCAdContainerView) {
        this.adpcAdContainerView = aDPCAdContainerView;
    }

    public final void setBtExerciseCourse(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btExerciseCourse = view;
    }

    public final void setBtFeedBack(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btFeedBack = view;
    }

    public final void setBtFirmwareRepair(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btFirmwareRepair = view;
    }

    public final void setBtFont(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btFont = view;
    }

    public final void setBtPermissionSetting(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btPermissionSetting = view;
    }

    public final void setBtThemeSwitch(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btThemeSwitch = view;
    }

    public final void setBtUiRepair(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btUiRepair = view;
    }

    public final void setIvRemind(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.ivRemind = imageView;
    }

    public final void setMOnClick(@tb1 View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
    }

    public final void setMViewWidth(int i) {
        this.mViewWidth = i;
    }

    public final void setVisibility(boolean z) {
        this.isVisibility = z;
    }
}
