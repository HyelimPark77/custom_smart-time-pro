package com.sma.smartv3.p610ui.p612me.item;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
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
import com.sma.smartv3.p610ui.p612me.item.MainBottomItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class MainBottomItem extends BaseDslItem {

    @tb1
    private ADPAdContainerView adpAdContainerView;

    @tb1
    private ADPCAdContainerView adpcAdContainerView;
    public View btExerciseCourse;
    public View btFeedBack;
    public View btFirmwareRepair;
    public View btFont;
    public View btPermissionSetting;
    public View btThemeSwitch;
    public View btUiRepair;
    public View btUserInfo;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;
    private boolean isVisibility;
    public ImageView ivRemind;

    @tb1
    private View.OnClickListener mOnClick;

    @aa1
    private final String TAG = "MainBottomItem";
    private final boolean initEvent = true;

    public static final class OXO1 extends ADPCAdListener {
        public final /* synthetic */ ADPCAdContainerView XIi00iiXO;

        public OXO1(ADPCAdContainerView aDPCAdContainerView) {
            this.XIi00iiXO = aDPCAdContainerView;
        }

        public void onADClosed(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.this.TAG + " -> Ad State : Closed");
            MainBottomItem.this.isLoaded = false;
            this.XIi00iiXO.setVisibility(8);
        }

        public void onADError(ADPCAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            MainBottomItem.this.isLoaded = false;
            MainBottomItem.this.isLoading = false;
            this.XIi00iiXO.setVisibility(8);
        }

        public void onADPresent(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.this.TAG + " -> Ad State : Present");
        }

        public void onADReceive(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.this.TAG + " -> Ad State : Loaded");
            MainBottomItem.this.isLoaded = true;
            MainBottomItem.this.isLoading = false;
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
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.this.TAG + " -> Ad State : Closed");
            MainBottomItem.this.isLoaded = false;
            this.XIi00iiXO.setVisibility(8);
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdFailed(ADPAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
            MainBottomItem.this.isLoaded = false;
            MainBottomItem.this.isLoading = false;
            this.XIi00iiXO.setVisibility(8);
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdLoaded(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.this.TAG + " -> Ad State : Loaded");
            MainBottomItem.this.isLoaded = true;
            MainBottomItem.this.isLoading = false;
            this.XIi00iiXO.setVisibility(0);
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdOpen(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.this.TAG + " -> Ad State : Open");
        }
    }

    private final void showAd() {
        i72 i72Var = i72.OXO1;
        if (!i72Var.X11I() && i72Var.IX0iIX()) {
            final ADPCAdContainerView aDPCAdContainerView = this.adpcAdContainerView;
            if (aDPCAdContainerView != null) {
                aDPCAdContainerView.setVisibility(0);
                aDPCAdContainerView.setAdListener(new OXO1(aDPCAdContainerView));
                aDPCAdContainerView.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.c10
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        MainBottomItem.showAd$lambda$0$0(this.f5874IO, lifecycleOwner, event);
                    }
                });
                aDPCAdContainerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.mltcode.paycertificationapi.d10
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        MainBottomItem.showAd$lambda$0$1(this.f6104IO, aDPCAdContainerView);
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
                aDPAdContainerView.setHostActivityObserver(new LifecycleEventObserver() { // from class: com.android.mltcode.paycertificationapi.e10
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        MainBottomItem.showAd$lambda$1$0(this.f6316IO, lifecycleOwner, event);
                    }
                });
                aDPAdContainerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.mltcode.paycertificationapi.f10
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        MainBottomItem.showAd$lambda$1$1(this.f6554IO, aDPAdContainerView);
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
    public static final void showAd$lambda$0$0(MainBottomItem mainBottomItem, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(mainBottomItem.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + mainBottomItem.isLoaded + ", isLoading: " + mainBottomItem.isLoading);
            if (mainBottomItem.isLoaded || mainBottomItem.isLoading) {
                return;
            }
            mainBottomItem.isFirstLoad = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$0$1(MainBottomItem mainBottomItem, ADPCAdContainerView aDPCAdContainerView) {
        if (mainBottomItem.isFirstLoad || !mainBottomItem.isVisibility) {
            return;
        }
        mainBottomItem.isFirstLoad = true;
        mainBottomItem.isLoading = true;
        int width = aDPCAdContainerView.getWidth();
        i1O0OXO1O.OXO1.OXO1(mainBottomItem.TAG + " -> Ad State : loadAdView viewWidth:" + width + ", id:" + aDPCAdContainerView.getAdUnitId());
        ADPCAdContainerView.loadAdView$default(aDPCAdContainerView, null, width, true, null, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$1$0(MainBottomItem mainBottomItem, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            i1O0OXO1O.OXO1.OXO1(mainBottomItem.TAG + " -> Ad State : Lifecycle, Event: " + event + ", isLoaded: " + mainBottomItem.isLoaded + ", isLoading: " + mainBottomItem.isLoading);
            if (mainBottomItem.isLoaded || mainBottomItem.isLoading) {
                return;
            }
            mainBottomItem.isFirstLoad = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$1$1(MainBottomItem mainBottomItem, ADPAdContainerView aDPAdContainerView) {
        if (mainBottomItem.isFirstLoad || !mainBottomItem.isVisibility) {
            return;
        }
        mainBottomItem.isFirstLoad = true;
        mainBottomItem.isLoading = true;
        int width = aDPAdContainerView.getWidth();
        i1O0OXO1O.OXO1.OXO1(mainBottomItem.TAG + " -> Ad State : loadAdView viewWidth:" + width + ", id:" + aDPAdContainerView.getAdUnitId());
        ADPAdContainerView.loadAdView$default(aDPAdContainerView, null, width, true, null, 9, null);
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
        View viewM3483v3 = itemHolder.m3483v(R.id.btUserInfo);
        Intrinsics.XXI(viewM3483v3);
        setBtUserInfo(viewM3483v3);
        View viewM3483v4 = itemHolder.m3483v(R.id.btFirmwareRepair);
        Intrinsics.XXI(viewM3483v4);
        setBtFirmwareRepair(viewM3483v4);
        View viewM3483v5 = itemHolder.m3483v(R.id.btUiRepair);
        Intrinsics.XXI(viewM3483v5);
        setBtUiRepair(viewM3483v5);
        View viewM3483v6 = itemHolder.m3483v(R.id.btSwitch);
        Intrinsics.XXI(viewM3483v6);
        setBtThemeSwitch(viewM3483v6);
        View viewM3483v7 = itemHolder.m3483v(R.id.btFeedBack);
        Intrinsics.XXI(viewM3483v7);
        setBtFeedBack(viewM3483v7);
        View viewM3483v8 = itemHolder.m3483v(R.id.btFont);
        Intrinsics.XXI(viewM3483v8);
        setBtFont(viewM3483v8);
        View viewM3483v9 = itemHolder.m3483v(R.id.btPermissionSetting);
        Intrinsics.XXI(viewM3483v9);
        setBtPermissionSetting(viewM3483v9);
        itemHolder.click(R.id.btExercise, this.mOnClick);
        itemHolder.click(R.id.btUserInfo, this.mOnClick);
        itemHolder.click(R.id.btSwitch, this.mOnClick);
        itemHolder.click(R.id.btFont, this.mOnClick);
        itemHolder.click(R.id.btFirmwareRepair, this.mOnClick);
        itemHolder.click(R.id.btUiRepair, this.mOnClick);
        itemHolder.click(R.id.btSetting, this.mOnClick);
        itemHolder.click(R.id.btAbout, this.mOnClick);
        itemHolder.click(R.id.btFeedBack, this.mOnClick);
        itemHolder.click(R.id.btFont, this.mOnClick);
        itemHolder.click(R.id.btPermissionSetting, this.mOnClick);
        this.adpcAdContainerView = (ADPCAdContainerView) itemHolder.m3483v(R.id.adpcAdContainerView);
        this.adpAdContainerView = (ADPAdContainerView) itemHolder.m3483v(R.id.adpAdContainerView);
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

    @aa1
    public final View getBtUserInfo() {
        View view = this.btUserInfo;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btUserInfo");
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
        getBtUserInfo().setVisibility(i72Var.m2039I0() ? 0 : 8);
        getBtPermissionSetting().setVisibility(i72Var.X00O0() ? 0 : 8);
        getBtFeedBack().setVisibility(i72Var.IX1XiI() ? 0 : 8);
    }

    public final boolean isVisibility() {
        return this.isVisibility;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.me_item_bottom;
    }

    @sf5(tag = I01XX0.f1085O1)
    public final void onAIViewVisibilityChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        boolean zXi0I = q62.OXO1.Xi0I();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State :  onAIViewVisibilityChange " + zXi0I);
        if (zXi0I) {
            this.isVisibility = true;
        }
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

    public final void setBtUserInfo(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btUserInfo = view;
    }

    public final void setIvRemind(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.ivRemind = imageView;
    }

    public final void setMOnClick(@tb1 View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
    }

    public final void setVisibility(boolean z) {
        this.isVisibility = z;
    }
}
