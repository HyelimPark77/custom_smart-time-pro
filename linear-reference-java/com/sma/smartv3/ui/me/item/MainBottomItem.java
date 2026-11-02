package com.sma.smartv3.ui.me.item;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c10;
import com.android.mltcode.paycertificationapi.d10;
import com.android.mltcode.paycertificationapi.e10;
import com.android.mltcode.paycertificationapi.f10;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.biz.ad.ADPAdError;
import com.sma.smartv3.biz.ad.ADPAdListener;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ad.ADPAdContainerView;
import com.sma.smartv3.view.ad.ADPCAdContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class MainBottomItem extends BaseDslItem {

    @aa1
    private final String TAG;

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
    private final boolean initEvent;
    private boolean isFirstLoad;
    private boolean isLoaded;
    private boolean isLoading;
    private boolean isVisibility;
    public ImageView ivRemind;

    @tb1
    private View.OnClickListener mOnClick;

    public static final class OXO1 extends ADPCAdListener {
        public final /* synthetic */ MainBottomItem OXO1;
        public final /* synthetic */ ADPCAdContainerView XIi00iiXO;

        public OXO1(MainBottomItem r1, ADPCAdContainerView r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        public void onADClosed(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.access$getTAG$p(this.OXO1) + " -> Ad State : Closed");
            MainBottomItem.access$setLoaded$p(this.OXO1, false);
            this.XIi00iiXO.setVisibility(8);
        }

        public void onADError(ADPCAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
            MainBottomItem.access$setLoaded$p(this.OXO1, false);
            MainBottomItem.access$setLoading$p(this.OXO1, false);
            this.XIi00iiXO.setVisibility(8);
        }

        public void onADPresent(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.access$getTAG$p(this.OXO1) + " -> Ad State : Present");
        }

        public void onADReceive(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
            MainBottomItem.access$setLoaded$p(this.OXO1, true);
            MainBottomItem.access$setLoading$p(this.OXO1, false);
            this.XIi00iiXO.setVisibility(0);
        }
    }

    public static final class XIi00iiXO extends ADPAdListener {
        public final /* synthetic */ MainBottomItem OXO1;
        public final /* synthetic */ ADPAdContainerView XIi00iiXO;

        public XIi00iiXO(MainBottomItem r1, ADPAdContainerView r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdClose(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.access$getTAG$p(this.OXO1) + " -> Ad State : Closed");
            MainBottomItem.access$setLoaded$p(this.OXO1, false);
            this.XIi00iiXO.setVisibility(8);
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdFailed(ADPAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
            MainBottomItem.access$setLoaded$p(this.OXO1, false);
            MainBottomItem.access$setLoading$p(this.OXO1, false);
            this.XIi00iiXO.setVisibility(8);
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdLoaded(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
            MainBottomItem.access$setLoaded$p(this.OXO1, true);
            MainBottomItem.access$setLoading$p(this.OXO1, false);
            this.XIi00iiXO.setVisibility(0);
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdOpen(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(MainBottomItem.access$getTAG$p(this.OXO1) + " -> Ad State : Open");
        }
    }

    public MainBottomItem() {
        this.TAG = "MainBottomItem";
        this.initEvent = true;
    }

    public static /* synthetic */ void I0IIOi(MainBottomItem r0, LifecycleOwner r1, Lifecycle.Event r2) {
        showAd$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void IiI10X(MainBottomItem r0, LifecycleOwner r1, Lifecycle.Event r2) {
        showAd$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ void O00(MainBottomItem r0, ADPAdContainerView r1) {
        showAd$lambda$1$1(r0, r1);
    }

    public static /* synthetic */ void XOO0ii0(MainBottomItem r0, ADPCAdContainerView r1) {
        showAd$lambda$0$1(r0, r1);
    }

    public static final /* synthetic */ String access$getTAG$p(MainBottomItem r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setLoaded$p(MainBottomItem r0, boolean r1) {
        r0.isLoaded = r1;
    }

    public static final /* synthetic */ void access$setLoading$p(MainBottomItem r0, boolean r1) {
        r0.isLoading = r1;
    }

    private final void showAd() {
        i72 r0 = i72.OXO1;
        if (r0.X11I() == true) goto L11;
        if (r0.IX0iIX() == false) goto L11;
        final ADPCAdContainerView r1 = this.adpcAdContainerView;
        if (r1 == null) goto L25;
        r1.setVisibility(0);
        r1.setAdListener(new OXO1(this, r1));
        r1.setHostActivityObserver(new c10(this));
        r1.getViewTreeObserver().addOnGlobalLayoutListener(new d10(this, r1));
        return;
    L25:
        return;
    L11:
        if (r0.X11I() == false) goto L13;
    L18:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : hide");
        ADPCAdContainerView r2 = this.adpcAdContainerView;
        if (r2 == null) goto L21;
        r2.setVisibility(8);
    L21:
        ADPAdContainerView r3 = this.adpAdContainerView;
        if (r3 == null) goto L27;
        r3.setVisibility(8);
        return;
    L27:
        return;
    L13:
        if (r0.IOi1O0() == false) goto L18;
        final ADPAdContainerView r4 = this.adpAdContainerView;
        if (r4 == null) goto L26;
        r4.setVisibility(0);
        r4.setAdListener(new XIi00iiXO(this, r4));
        r4.setHostActivityObserver(new e10(this));
        r4.getViewTreeObserver().addOnGlobalLayoutListener(new f10(this, r4));
        return;
    }

    private static final void showAd$lambda$0$0(MainBottomItem r4, LifecycleOwner r5, Lifecycle.Event r6) {
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

    private static final void showAd$lambda$0$1(MainBottomItem r8, ADPCAdContainerView r9) {
        if (r8.isFirstLoad == false) goto L5;
        return;
    L5:
        if (r8.isVisibility == false) goto L9;
        r8.isFirstLoad = true;
        r8.isLoading = true;
        int r3 = r9.getWidth();
        i1O0OXO1O.OXO1.OXO1(r8.TAG + " -> Ad State : loadAdView viewWidth:" + r3 + ", id:" + r9.getAdUnitId());
        ADPCAdContainerView.loadAdView$default(r9, null, r3, true, null, 9, null);
        return;
    }

    private static final void showAd$lambda$1$0(MainBottomItem r4, LifecycleOwner r5, Lifecycle.Event r6) {
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

    private static final void showAd$lambda$1$1(MainBottomItem r8, ADPAdContainerView r9) {
        if (r8.isFirstLoad == false) goto L5;
        return;
    L5:
        if (r8.isVisibility == false) goto L9;
        r8.isFirstLoad = true;
        r8.isLoading = true;
        int r3 = r9.getWidth();
        i1O0OXO1O.OXO1.OXO1(r8.TAG + " -> Ad State : loadAdView viewWidth:" + r3 + ", id:" + r9.getAdUnitId());
        ADPAdContainerView.loadAdView$default(r9, null, r3, true, null, 9, null);
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r10) {
        Intrinsics.X0O(r10, "itemHolder");
        View r0 = r10.v(R.id.ivRemind);
        Intrinsics.XXI(r0);
        setIvRemind((ImageView) r0);
        View r1 = r10.v(R.id.btExercise);
        Intrinsics.XXI(r1);
        setBtExerciseCourse(r1);
        View r2 = r10.v(R.id.btUserInfo);
        Intrinsics.XXI(r2);
        setBtUserInfo(r2);
        View r3 = r10.v(R.id.btFirmwareRepair);
        Intrinsics.XXI(r3);
        setBtFirmwareRepair(r3);
        View r4 = r10.v(R.id.btUiRepair);
        Intrinsics.XXI(r4);
        setBtUiRepair(r4);
        View r5 = r10.v(R.id.btSwitch);
        Intrinsics.XXI(r5);
        setBtThemeSwitch(r5);
        View r6 = r10.v(R.id.btFeedBack);
        Intrinsics.XXI(r6);
        setBtFeedBack(r6);
        View r7 = r10.v(R.id.btFont);
        Intrinsics.XXI(r7);
        setBtFont(r7);
        View r8 = r10.v(R.id.btPermissionSetting);
        Intrinsics.XXI(r8);
        setBtPermissionSetting(r8);
        r10.click(R.id.btExercise, this.mOnClick);
        r10.click(R.id.btUserInfo, this.mOnClick);
        r10.click(R.id.btSwitch, this.mOnClick);
        r10.click(R.id.btFont, this.mOnClick);
        r10.click(R.id.btFirmwareRepair, this.mOnClick);
        r10.click(R.id.btUiRepair, this.mOnClick);
        r10.click(R.id.btSetting, this.mOnClick);
        r10.click(R.id.btAbout, this.mOnClick);
        r10.click(R.id.btFeedBack, this.mOnClick);
        r10.click(R.id.btFont, this.mOnClick);
        r10.click(R.id.btPermissionSetting, this.mOnClick);
        this.adpcAdContainerView = (ADPCAdContainerView) r10.v(R.id.adpcAdContainerView);
        this.adpAdContainerView = (ADPAdContainerView) r10.v(R.id.adpAdContainerView);
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
        View r0 = this.btExerciseCourse;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btExerciseCourse");
        return null;
    }

    @aa1
    public final View getBtFeedBack() {
        View r0 = this.btFeedBack;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btFeedBack");
        return null;
    }

    @aa1
    public final View getBtFirmwareRepair() {
        View r0 = this.btFirmwareRepair;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btFirmwareRepair");
        return null;
    }

    @aa1
    public final View getBtFont() {
        View r0 = this.btFont;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btFont");
        return null;
    }

    @aa1
    public final View getBtPermissionSetting() {
        View r0 = this.btPermissionSetting;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btPermissionSetting");
        return null;
    }

    @aa1
    public final View getBtThemeSwitch() {
        View r0 = this.btThemeSwitch;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btThemeSwitch");
        return null;
    }

    @aa1
    public final View getBtUiRepair() {
        View r0 = this.btUiRepair;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btUiRepair");
        return null;
    }

    @aa1
    public final View getBtUserInfo() {
        View r0 = this.btUserInfo;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btUserInfo");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final ImageView getIvRemind() {
        ImageView r0 = this.ivRemind;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("ivRemind");
        return null;
    }

    @tb1
    public final View.OnClickListener getMOnClick() {
        return this.mOnClick;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        View r0 = getBtThemeSwitch();
        int r3 = 0;
        if (Build.VERSION.SDK_INT > 28) goto L5;
    L7:
        int r1 = 8;
    L8:
        r0.setVisibility(r1);
        i72 r2 = i72.OXO1;
        if (r2.X00Xi1X() == true) goto L25;
        View r4 = getBtFont();
        q62 r5 = q62.OXO1;
        if (r5.XIIO11I() == false) goto L13;
        int r6 = 0;
    L14:
        r4.setVisibility(r6);
        View r7 = getBtUiRepair();
        if (r5.I0i0() == true) goto L17;
    L19:
        int r8 = 8;
    L20:
        r7.setVisibility(r8);
        View r9 = getBtFirmwareRepair();
        if (r5.iii0() == false) goto L23;
        int r10 = 0;
    L24:
        r9.setVisibility(r10);
    L26:
        View r11 = getBtExerciseCourse();
        if (q62.OXO1.iiIOiX() == 0) goto L29;
        int r12 = 0;
    L30:
        r11.setVisibility(r12);
        View r13 = getBtUserInfo();
        if (r2.I0() == false) goto L33;
        int r14 = 0;
    L34:
        r13.setVisibility(r14);
        View r15 = getBtPermissionSetting();
        if (r2.X00O0() == false) goto L37;
        int r16 = 0;
    L38:
        r15.setVisibility(r16);
        View r17 = getBtFeedBack();
        if (r2.IX1XiI() == true) goto L42;
        r3 = 8;
    L42:
        r17.setVisibility(r3);
        return;
    L37:
        r16 = 8;
        goto L38
    L33:
        r14 = 8;
        goto L34
    L29:
        r12 = 8;
        goto L30
    L23:
        r10 = 8;
        goto L24
    L17:
        if (r5.X1i() == false) goto L19;
        r8 = 0;
        goto L20
    L13:
        r6 = 8;
        goto L14
    L25:
        getBtFont().setVisibility(8);
        getBtUiRepair().setVisibility(8);
        getBtFirmwareRepair().setVisibility(8);
        goto L26
    L5:
        if (i72.OXO1.X1OI() == false) goto L7;
        r1 = 0;
        goto L8
    }

    public final boolean isVisibility() {
        return this.isVisibility;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.me_item_bottom;
    }

    @sf5(tag = I01XX0.O1)
    public final void onAIViewVisibilityChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        boolean r5 = q62.OXO1.Xi0I();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State :  onAIViewVisibilityChange " + r5);
        if (r5 == false) goto L6;
        this.isVisibility = true;
        return;
    }

    @sf5(tag = I01XX0.I0XXi0X)
    public final void onAdStateChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> Ad State : onAdStateChange");
        showAd();
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void onBindStateChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }

    @sf5(tag = I01XX0.iIXi1iiXI)
    public final void onNewVersionShow(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        getIvRemind().setVisibility(0);
    }

    public final void setAdpAdContainerView(@tb1 ADPAdContainerView r1) {
        this.adpAdContainerView = r1;
    }

    public final void setAdpcAdContainerView(@tb1 ADPCAdContainerView r1) {
        this.adpcAdContainerView = r1;
    }

    public final void setBtExerciseCourse(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btExerciseCourse = r2;
    }

    public final void setBtFeedBack(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btFeedBack = r2;
    }

    public final void setBtFirmwareRepair(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btFirmwareRepair = r2;
    }

    public final void setBtFont(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btFont = r2;
    }

    public final void setBtPermissionSetting(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btPermissionSetting = r2;
    }

    public final void setBtThemeSwitch(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btThemeSwitch = r2;
    }

    public final void setBtUiRepair(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btUiRepair = r2;
    }

    public final void setBtUserInfo(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btUserInfo = r2;
    }

    public final void setIvRemind(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ivRemind = r2;
    }

    public final void setMOnClick(@tb1 View.OnClickListener r1) {
        this.mOnClick = r1;
    }

    public final void setVisibility(boolean r1) {
        this.isVisibility = r1;
    }
}
