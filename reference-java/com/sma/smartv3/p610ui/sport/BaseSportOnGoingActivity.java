package com.sma.smartv3.p610ui.sport;

import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.p554ui.layout.LayoutKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.III011;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXiOOOX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i01I1i1X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIXXO1;
import com.android.mltcode.paycertificationapi.j65;
import com.android.mltcode.paycertificationapi.js4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.LibExKt;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.LogoPosition;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.map.TextureMapView;
import com.baidu.mapapi.model.LatLng;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.VibrateUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polyline;
import com.google.gson.Gson;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.SportData;
import com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.AnchorBottomSheetBehavior;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.CustomNestedScollView;
import com.sma.smartv3.view.SlideLockView;
import com.sma.smartv3.view.SportEndProgress;
import com.sma.smartv3.view.bubbleview.ArrowDirection;
import com.sma.smartv3.view.bubbleview.BubbleLayout;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.BleAppSportState;
import com.szabh.smable3.entity.BleDeviceSportData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaseSportOnGoingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportOnGoingActivity.kt\ncom/sma/smartv3/ui/sport/BaseSportOnGoingActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,901:1\n19#2:902\n15#2:903\n94#2:904\n90#2:905\n94#2:909\n90#2:910\n255#3:906\n257#3,2:907\n173#4,7:911\n180#4,3:919\n143#4,7:922\n183#4:929\n173#4,7:930\n180#4,3:938\n143#4,7:941\n183#4:948\n173#4,7:949\n180#4,3:957\n143#4,7:960\n183#4:967\n173#4,7:968\n180#4,3:976\n143#4,7:979\n183#4:986\n69#4,3:987\n72#4,5:991\n1#5:918\n1#5:937\n1#5:956\n1#5:975\n1#5:990\n*S KotlinDebug\n*F\n+ 1 BaseSportOnGoingActivity.kt\ncom/sma/smartv3/ui/sport/BaseSportOnGoingActivity\n*L\n111#1:902\n111#1:903\n209#1:904\n209#1:905\n816#1:909\n816#1:910\n704#1:906\n705#1:907,2\n826#1:911,7\n826#1:919,3\n826#1:922,7\n826#1:929\n830#1:930,7\n830#1:938,3\n830#1:941,7\n830#1:948\n834#1:949,7\n834#1:957,3\n834#1:960,7\n834#1:967\n838#1:968,7\n838#1:976,3\n838#1:979,7\n838#1:986\n842#1:987,3\n842#1:991,5\n826#1:918\n830#1:937\n834#1:956\n838#1:975\n842#1:990\n*E\n"})
public abstract class BaseSportOnGoingActivity extends BaseActivity {
    protected AnchorBottomSheetBehavior<CustomNestedScollView> behavior;
    private int cardPanelSubMinHeight;

    @aa1
    private int[] goals;
    private boolean isBaiduMapReady;
    private boolean isGoogleMapReady;
    private final boolean isInChinaMainland;
    private boolean isShowMap;

    @aa1
    private final Lazy mBMapView$delegate;
    private BaiduMap mBaiDuMap;

    @tb1
    private Overlay mBaiduLine;

    @tb1
    private Overlay mBaiduLineEnd;

    @tb1
    private Overlay mBaiduLineStart;

    @aa1
    private final List<LatLng> mBaiduPoints;

    @aa1
    private final Lazy mGMapView$delegate;

    @tb1
    private Polyline mGoogleLine;

    @tb1
    private Marker mGoogleLineEnd;

    @tb1
    private Marker mGoogleLineStart;
    private GoogleMap mGoogleMap;

    @aa1
    private final List<com.google.android.gms.maps.model.LatLng> mGooglePoints;

    @tb1
    private PopupWindow mLongPressPopup;

    @aa1
    private final Lazy mSportCallback$delegate;

    @tb1
    private go0 mSportShortPopup;
    public js4 sportDataOrder;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1Xi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.rootView_delegate$lambda$0(this.f7686IO);
        }
    });

    @aa1
    private final Lazy countdownRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.countdownRl_delegate$lambda$0(this.f5060IO);
        }
    });

    @aa1
    private final Lazy countdownTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO1Ii00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.countdownTv_delegate$lambda$0(this.f4724IO);
        }
    });

    @aa1
    private final Lazy sportProcess$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0XXiIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportProcess_delegate$lambda$0(this.f7456IO);
        }
    });

    @aa1
    private final Lazy sportSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i11iXOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportSet_delegate$lambda$0(this.f7561IO);
        }
    });

    @aa1
    private final Lazy sportPause$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiiOii0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportPause_delegate$lambda$0(this.f8682IO);
        }
    });

    @aa1
    private final Lazy sportOneShowValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX1i1III
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportOneShowValue_delegate$lambda$0(this.f1981IO);
        }
    });

    @aa1
    private final Lazy sportTwoShowValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXIX0OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportTwoShowValue_delegate$lambda$0(this.f5035IO);
        }
    });

    @aa1
    private final Lazy sportThreeShowValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiX1X00i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportThreeShowValue_delegate$lambda$0(this.f5332IO);
        }
    });

    @aa1
    private final Lazy sportFourShowValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XOOII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportFourShowValue_delegate$lambda$0(this.f1224IO);
        }
    });

    @aa1
    private final Lazy sportOneShowValueDesc$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIIIX0i10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportOneShowValueDesc_delegate$lambda$0(this.f2969IO);
        }
    });

    @aa1
    private final Lazy sportTwoShowValueDesc$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiO0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportTwoShowValueDesc_delegate$lambda$0(this.f5289IO);
        }
    });

    @aa1
    private final Lazy sportThreeShowValueDesc$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1XI1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportThreeShowValueDesc_delegate$lambda$0(this.f2787IO);
        }
    });

    @aa1
    private final Lazy sportFourShowValueDesc$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOIIiIOIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportFourShowValueDesc_delegate$lambda$0(this.f4762IO);
        }
    });

    @aa1
    private final Lazy sportEndProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0011OiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportEndProgress_delegate$lambda$0(this.f2865IO);
        }
    });

    @aa1
    private final Lazy mapPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0OIii0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.mapPanel_delegate$lambda$0(this.f2502IO);
        }
    });

    @aa1
    private final Lazy sportRunPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0OXO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportRunPanel_delegate$lambda$0(this.f7402IO);
        }
    });

    @aa1
    private final Lazy sportPausePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXXXIiIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportPausePanel_delegate$lambda$0(this.f5136IO);
        }
    });

    @aa1
    private final Lazy screenLockRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXIii10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.screenLockRl_delegate$lambda$0(this.f3478IO);
        }
    });

    @aa1
    private final Lazy slideLockView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIXX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.slideLockView_delegate$lambda$0(this.f7920IO);
        }
    });

    @aa1
    private final Lazy sportDataLL$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0110iiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportDataLL_delegate$lambda$0(this.f3912IO);
        }
    });

    @aa1
    private final Lazy sportOnGoingFl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIOOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportOnGoingFl_delegate$lambda$0(this.f1622IO);
        }
    });

    @aa1
    private final Lazy cardPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX0Oi10i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.cardPanel_delegate$lambda$0(this.f4950IO);
        }
    });

    @aa1
    private final Lazy cardPanelSub$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOXXXXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.cardPanelSub_delegate$lambda$0(this.f8168IO);
        }
    });

    @aa1
    private final Lazy handleView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOO1O0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.handleView_delegate$lambda$0(this.f8105IO);
        }
    });

    @aa1
    private final Lazy statuesPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1011OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.statuesPanel_delegate$lambda$0(this.f4455IO);
        }
    });

    @aa1
    private final Lazy ivGpsSignal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.ivGpsSignal_delegate$lambda$0(this.f4478IO);
        }
    });

    @aa1
    private final Lazy sportModelName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiO1O0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportModelName_delegate$lambda$0(this.f2259IO);
        }
    });

    @aa1
    private final Lazy sportLeftLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiIOiXiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportLeftLayout_delegate$lambda$0(this.f5265IO);
        }
    });

    @aa1
    private final Lazy sportRightLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXXiO001
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportOnGoingActivity.sportRightLayout_delegate$lambda$0(this.f3562IO);
        }
    });

    public static final class I0IIOi implements CustomGoogleMapView.OXO1 {
        public I0IIOi() {
        }

        @Override // com.sma.smartv3.view.CustomGoogleMapView.OXO1
        public void OXO1(MotionEvent motionEvent) {
            Intrinsics.X0O(motionEvent, "motionEvent");
            if (motionEvent.getAction() == 1) {
                BaseSportOnGoingActivity.this.getSportProcess().requestDisallowInterceptTouchEvent(false);
            } else {
                BaseSportOnGoingActivity.this.getSportProcess().requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public static final class IiI10X implements com.sma.smartv3.ui.sport.XO0O10.OXO1 {
        public IiI10X() {
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        /* JADX INFO: renamed from: IO */
        public void mo38602IO(SportData sportData) {
            Intrinsics.X0O(sportData, "sportData");
            BaseSportOnGoingActivity.this.updateShowData(sportData);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void O00(boolean z) {
            super.O00(z);
            BaseSportOnGoingActivity.this.changeDeviceConnectStatus(z);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void OIi0(Location location) {
            Intrinsics.X0O(location, "location");
            BaseSportOnGoingActivity baseSportOnGoingActivity = BaseSportOnGoingActivity.this;
            baseSportOnGoingActivity.updateMap(baseSportOnGoingActivity.isInChinaMainland, location);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void XO0O10(BleAppSportState sportState) {
            Intrinsics.X0O(sportState, "sportState");
            BaseSportOnGoingActivity.this.handleSportState(sportState.getMState());
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        /* JADX INFO: renamed from: iO */
        public void mo38603iO(int i) {
            try {
                BaseSportOnGoingActivity.this.showGoalDoneDialog(i);
            } catch (Exception e) {
                i1O0OXO1O.OXO1.OXO1("BaseSportOnGoingActivity  onGoalDone  showGoalDoneDialog try Exception = " + e);
            }
        }
    }

    public static final class O00 extends AnchorBottomSheetBehavior.XIi00iiXO {
        public O00() {
        }

        @Override // com.sma.smartv3.view.AnchorBottomSheetBehavior.XIi00iiXO
        public void OXO1(View bottomSheet, float f) {
            Intrinsics.X0O(bottomSheet, "bottomSheet");
            float peekHeight = BaseSportOnGoingActivity.this.getBehavior().getPeekHeight() + ((BaseSportOnGoingActivity.this.getRootView().getHeight() - BaseSportOnGoingActivity.this.getBehavior().getPeekHeight()) * f);
            if (peekHeight > BaseSportOnGoingActivity.this.cardPanelSubMinHeight) {
                RelativeLayout cardPanelSub = BaseSportOnGoingActivity.this.getCardPanelSub();
                Intrinsics.O10IXXX0X(cardPanelSub, "<get-cardPanelSub>(...)");
                LibExKt.X111IO(cardPanelSub, (int) peekHeight);
            } else {
                RelativeLayout cardPanelSub2 = BaseSportOnGoingActivity.this.getCardPanelSub();
                Intrinsics.O10IXXX0X(cardPanelSub2, "<get-cardPanelSub>(...)");
                LibExKt.X111IO(cardPanelSub2, BaseSportOnGoingActivity.this.cardPanelSubMinHeight);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0030  */
        @Override // com.sma.smartv3.view.AnchorBottomSheetBehavior.XIi00iiXO
        public void XIi00iiXO(View bottomSheet, int i) {
            Intrinsics.X0O(bottomSheet, "bottomSheet");
            if (i == 3) {
                BaseSportOnGoingActivity.this.getCardPanel().setRadius(SizeUtils.dp2px(20.0f));
                BaseSportOnGoingActivity.this.getStatuesPanel().setVisibility(8);
                BaseSportOnGoingActivity.this.setSportOneShowValue(55.0f);
            } else if (i == 4) {
                BaseSportOnGoingActivity.this.getCardPanel().setRadius(SizeUtils.dp2px(0.0f));
                BaseSportOnGoingActivity.this.getStatuesPanel().setVisibility(0);
                BaseSportOnGoingActivity.this.setSportOneShowValue(70.0f);
            } else if (i == 5) {
                BaseSportOnGoingActivity.this.getCardPanel().setRadius(SizeUtils.dp2px(20.0f));
                BaseSportOnGoingActivity.this.getStatuesPanel().setVisibility(8);
                BaseSportOnGoingActivity.this.setSportOneShowValue(55.0f);
            }
            BaseSportOnGoingActivity.this.getSportProcess().requestLayout();
        }
    }

    public static final class OIi0 extends CountDownTimer {
        public OIi0() {
            super(4000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VibrateUtils.vibrate(200L);
            BaseSportOnGoingActivity.this.startSport();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            String string;
            if (BaseSportOnGoingActivity.this.getCountdownTv().isShown()) {
                long j2 = j / ((long) 1000);
                BaseSportOnGoingActivity.this.sportStartVoice(j2);
                DINCondBold countdownTv = BaseSportOnGoingActivity.this.getCountdownTv();
                if (j2 > 0) {
                    string = String.valueOf(j2);
                } else {
                    com.sma.smartv3.p610ui.sport.XO0O10.i100IXOX(com.sma.smartv3.p610ui.sport.XO0O10.OXO1, BaseSportOnGoingActivity.this.getMArg1(), false, BaseSportOnGoingActivity.this.getGoals()[0], BaseSportOnGoingActivity.this.getGoals()[1], BaseSportOnGoingActivity.this.getGoals()[2], 2, null);
                    string = BaseSportOnGoingActivity.this.getString(R.string.f54350GO);
                    Intrinsics.XXI(string);
                }
                countdownTv.setText(string);
            }
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[SportDataType.values().length];
            try {
                iArr[SportDataType.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportDataType.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportDataType.PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportDataType.CALORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportDataType.STEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportDataType.SPM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportDataType.ALTITUDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportDataType.HEARTRATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportDataType.SPEED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO implements SportEndProgress.XIi00iiXO {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.view.SportEndProgress.XIi00iiXO
        public void start(boolean z) {
            if (z) {
                BaseSportOnGoingActivity.this.showLongPressTip();
            }
        }
    }

    public static final class XO0O10 implements SlideLockView.InterfaceC19067iO {
        public XO0O10() {
        }

        @Override // com.sma.smartv3.view.SlideLockView.InterfaceC19067iO
        public void OXO1() {
            BaseSportOnGoingActivity.this.getSlideLockView().XiOIii1();
            BaseSportOnGoingActivity.this.getSportRunPanel().setVisibility(0);
            BaseSportOnGoingActivity.this.getScreenLockRl().setVisibility(4);
            if (com.sma.smartv3.p610ui.sport.XO0O10.OXO1.O001I() != 3) {
                BaseSportOnGoingActivity.this.enableBottomSheet();
            }
        }
    }

    public static final class XOO0ii0 implements OnMapReadyCallback {
        public final /* synthetic */ CustomGoogleMapView OXO1;
        public final /* synthetic */ BaseSportOnGoingActivity XIi00iiXO;

        public XOO0ii0(CustomGoogleMapView customGoogleMapView, BaseSportOnGoingActivity baseSportOnGoingActivity) {
            this.OXO1 = customGoogleMapView;
            this.XIi00iiXO = baseSportOnGoingActivity;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public void onMapReady(GoogleMap googleMap) {
            Intrinsics.X0O(googleMap, "googleMap");
            MapsInitializer.initialize(this.OXO1.getContext());
            this.XIi00iiXO.mGoogleMap = googleMap;
            this.XIi00iiXO.isGoogleMapReady = true;
            if (this.XIi00iiXO.mGooglePoints.isEmpty()) {
                return;
            }
            this.XIi00iiXO.updateGoogleMap();
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.BaseSportOnGoingActivity$iO */
    public static final class C18956iO implements SportEndProgress.OXO1 {
        public C18956iO() {
        }

        @Override // com.sma.smartv3.view.SportEndProgress.OXO1
        public void end() {
            BaseSportOnGoingActivity.this.stopSport(true);
        }
    }

    public BaseSportOnGoingActivity() {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mGMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X10O0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseSportOnGoingActivity.mGMapView_delegate$lambda$0(this.f4147IO);
            }
        });
        this.mBMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOIOXiIIX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseSportOnGoingActivity.mBMapView_delegate$lambda$0(this.f1803IO);
            }
        });
        this.isInChinaMainland = a01Var.OXO1().getBoolean(b01.XiOIO, false);
        this.mBaiduPoints = new ArrayList();
        this.mGooglePoints = new ArrayList();
        this.goals = new int[3];
        this.mSportCallback$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I10I0iIOI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseSportOnGoingActivity.mSportCallback_delegate$lambda$0(this.f1301IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout cardPanelSub_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (RelativeLayout) baseSportOnGoingActivity.findViewById(R.id.cardPanelSub);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardView cardPanel_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (CardView) baseSportOnGoingActivity.findViewById(R.id.cardPanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout countdownRl_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (LinearLayout) baseSportOnGoingActivity.findViewById(R.id.countdownRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold countdownTv_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (DINCondBold) baseSportOnGoingActivity.findViewById(R.id.countdownTv);
    }

    private final Overlay createBaiduIcon(int i, LatLng latLng, boolean z) {
        BaiduMap baiduMap = this.mBaiDuMap;
        if (baiduMap == null) {
            Intrinsics.XXO("mBaiDuMap");
            baiduMap = null;
        }
        MarkerOptions markerOptionsZIndex = new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromResource(i)).draggable(false).flat(true).zIndex(9);
        if (z) {
            markerOptionsZIndex.anchor(0.5f, 0.5f);
        }
        Overlay overlayAddOverlay = baiduMap.addOverlay(markerOptionsZIndex);
        Intrinsics.O10IXXX0X(overlayAddOverlay, "addOverlay(...)");
        return overlayAddOverlay;
    }

    public static /* synthetic */ Overlay createBaiduIcon$default(BaseSportOnGoingActivity baseSportOnGoingActivity, int i, LatLng latLng, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBaiduIcon");
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return baseSportOnGoingActivity.createBaiduIcon(i, latLng, z);
    }

    private final TextureMapView getMBMapView() {
        return (TextureMapView) this.mBMapView$delegate.getValue();
    }

    private final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) this.mGMapView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup handleView_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ViewGroup) baseSportOnGoingActivity.findViewById(R.id.fl_handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        CustomLocation customLocationXXIIO1i11 = UtilsKt.XXIIO1i11();
        if (customLocationXXIIO1i11.OXO1() == 0.0d || customLocationXXIIO1i11.IiI10X() == 0.0d) {
            return;
        }
        baseSportOnGoingActivity.updateMap(baseSportOnGoingActivity.isInChinaMainland, new Location(0, 0L, null, 0, 0, (float) customLocationXXIIO1i11.IiI10X(), (float) customLocationXXIIO1i11.XO0O10(), 0, 0, 0, 927, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
        int mArg1 = baseSportOnGoingActivity.getMArg1();
        int[] iArr = baseSportOnGoingActivity.goals;
        com.sma.smartv3.p610ui.sport.XO0O10.i100IXOX(xo0o10, mArg1, false, iArr[0], iArr[1], iArr[2], 2, null);
        baseSportOnGoingActivity.startSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivGpsSignal_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ImageView) baseSportOnGoingActivity.findViewById(R.id.ivGpsSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureMapView mBMapView_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (TextureMapView) baseSportOnGoingActivity.findViewById(R.id.bMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomGoogleMapView mGMapView_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (CustomGoogleMapView) baseSportOnGoingActivity.findViewById(R.id.gMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IiI10X mSportCallback_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return baseSportOnGoingActivity.new IiI10X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup mapPanel_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ViewGroup) baseSportOnGoingActivity.findViewById(R.id.fl_map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup rootView_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ViewGroup) baseSportOnGoingActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout screenLockRl_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (RelativeLayout) baseSportOnGoingActivity.findViewById(R.id.screenLockRl);
    }

    private final void showBaiDuMap() {
        getMBMapView().setVisibility(0);
        TextureMapView mBMapView = getMBMapView();
        mBMapView.showZoomControls(false);
        mBMapView.showScaleControl(false);
        BaiduMap map = getMBMapView().getMap();
        map.setCompassEnable(false);
        Intrinsics.O10IXXX0X(map, "apply(...)");
        this.mBaiDuMap = map;
        this.isBaiduMapReady = true;
        if (!this.mBaiduPoints.isEmpty()) {
            updateBaiduMap();
        }
        BaiduMap baiduMap = this.mBaiDuMap;
        if (baiduMap == null) {
            Intrinsics.XXO("mBaiDuMap");
            baiduMap = null;
        }
        baiduMap.setOnMapTouchListener(new BaiduMap.OnMapTouchListener() { // from class: com.android.mltcode.paycertificationapi.I1Xi1
            @Override // com.baidu.mapapi.map.BaiduMap.OnMapTouchListener
            public final void onTouch(MotionEvent motionEvent) {
                BaseSportOnGoingActivity.showBaiDuMap$lambda$2(this.OXO1, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBaiDuMap$lambda$2(BaseSportOnGoingActivity baseSportOnGoingActivity, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            CustomNestedScollView sportProcess = baseSportOnGoingActivity.getSportProcess();
            if (sportProcess != null) {
                sportProcess.requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        CustomNestedScollView sportProcess2 = baseSportOnGoingActivity.getSportProcess();
        if (sportProcess2 != null) {
            sportProcess2.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final void showGoogleMap() {
        CustomGoogleMapView mGMapView = getMGMapView();
        mGMapView.setVisibility(0);
        mGMapView.onCreate(null);
        mGMapView.getMapAsync(new XOO0ii0(mGMapView, this));
        mGMapView.setOnMapTouchListener(new I0IIOi());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLongPressTip$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        PopupWindow popupWindow = baseSportOnGoingActivity.mLongPressPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    private final void showMapContent(boolean z) {
        this.isShowMap = true;
        if (z) {
            showBaiDuMap();
        } else {
            showGoogleMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlideLockView slideLockView_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (SlideLockView) baseSportOnGoingActivity.findViewById(R.id.slideLockView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup sportDataLL_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ViewGroup) baseSportOnGoingActivity.findViewById(R.id.sportDataLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportEndProgress sportEndProgress_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (SportEndProgress) baseSportOnGoingActivity.findViewById(R.id.sportEndProgress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportFourShowValueDesc_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (PFMedium) baseSportOnGoingActivity.findViewById(R.id.sportFourShowValueDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportFourShowValue_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (DINCondBold) baseSportOnGoingActivity.findViewById(R.id.sportFourShowValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View sportLeftLayout_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return baseSportOnGoingActivity.findViewById(R.id.sport_on_going_left_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportModelName_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (PFMedium) baseSportOnGoingActivity.findViewById(R.id.sportModelName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup sportOnGoingFl_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ViewGroup) baseSportOnGoingActivity.findViewById(R.id.sportOnGoingFl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportOneShowValueDesc_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (PFMedium) baseSportOnGoingActivity.findViewById(R.id.sportOneShowValueDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportOneShowValue_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (DINCondBold) baseSportOnGoingActivity.findViewById(R.id.sportOneShowValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup sportPausePanel_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ViewGroup) baseSportOnGoingActivity.findViewById(R.id.sportPausePanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton sportPause_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ImageButton) baseSportOnGoingActivity.findViewById(R.id.sportPause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomNestedScollView sportProcess_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (CustomNestedScollView) baseSportOnGoingActivity.findViewById(R.id.sportProcess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout sportRightLayout_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (LinearLayout) baseSportOnGoingActivity.findViewById(R.id.sport_on_going_right_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup sportRunPanel_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ViewGroup) baseSportOnGoingActivity.findViewById(R.id.sportRunPanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton sportSet_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ImageButton) baseSportOnGoingActivity.findViewById(R.id.sportSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportThreeShowValueDesc_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (PFMedium) baseSportOnGoingActivity.findViewById(R.id.sportThreeShowValueDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportThreeShowValue_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (DINCondBold) baseSportOnGoingActivity.findViewById(R.id.sportThreeShowValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportTwoShowValueDesc_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (PFMedium) baseSportOnGoingActivity.findViewById(R.id.sportTwoShowValueDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportTwoShowValue_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (DINCondBold) baseSportOnGoingActivity.findViewById(R.id.sportTwoShowValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup statuesPanel_delegate$lambda$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        return (ViewGroup) baseSportOnGoingActivity.findViewById(R.id.status_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stopSport$lambda$0$0(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
        com.sma.smartv3.p610ui.sport.XO0O10.m38654Oi(xo0o10, false, 1, null);
        baseSportOnGoingActivity.handleSportState(xo0o10.O001I());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stopSport$lambda$0$1(BaseSportOnGoingActivity baseSportOnGoingActivity) {
        com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
        com.sma.smartv3.p610ui.sport.XO0O10.X01IiOiIi(xo0o10, false, 1, null);
        xo0o10.XOO0XOOii(baseSportOnGoingActivity.getMSportCallback());
        xo0o10.m38656I1();
        baseSportOnGoingActivity.finish();
        return true;
    }

    private final void updateBaiduMap() {
        if (!this.isBaiduMapReady) {
            i1O0OXO1O.OXO1.OXO1("updateBaiduMap: BaiduMap not ready yet");
            return;
        }
        if (com.sma.smartv3.p610ui.sport.XO0O10.OXO1.X11iII1O1().isEmpty()) {
            return;
        }
        if (this.mBaiDuMap == null) {
            Intrinsics.XXO("mBaiDuMap");
        }
        LatLng latLng = (LatLng) CollectionsKt___CollectionsKt.Xi1XO00(this.mBaiduPoints);
        BaiduMap baiduMap = this.mBaiDuMap;
        BaiduMap baiduMap2 = null;
        if (baiduMap == null) {
            Intrinsics.XXO("mBaiDuMap");
            baiduMap = null;
        }
        baiduMap.setMapStatus(MapStatusUpdateFactory.newLatLng(latLng));
        Overlay overlay = this.mBaiduLineEnd;
        if (overlay != null) {
            overlay.remove();
        }
        this.mBaiduLineEnd = createBaiduIcon(R.drawable.icon_sport_map_end, latLng, true);
        BaiduMap baiduMap3 = this.mBaiDuMap;
        if (baiduMap3 == null) {
            Intrinsics.XXO("mBaiDuMap");
            baiduMap3 = null;
        }
        baiduMap3.setMapStatus(MapStatusUpdateFactory.zoomTo(19.0f));
        if (this.mBaiduPoints.size() > 1) {
            Overlay overlay2 = this.mBaiduLine;
            if (overlay2 != null) {
                overlay2.remove();
            }
            PolylineOptions polylineOptionsPoints = new PolylineOptions().width(14).color(ContextCompat.getColor(getMContext(), R.color.colorAccent)).points(this.mBaiduPoints);
            Intrinsics.O10IXXX0X(polylineOptionsPoints, "points(...)");
            BaiduMap baiduMap4 = this.mBaiDuMap;
            if (baiduMap4 == null) {
                Intrinsics.XXO("mBaiDuMap");
            } else {
                baiduMap2 = baiduMap4;
            }
            this.mBaiduLine = baiduMap2.addOverlay(polylineOptionsPoints);
            Overlay overlay3 = this.mBaiduLineStart;
            if (overlay3 != null) {
                overlay3.remove();
            }
            this.mBaiduLineStart = createBaiduIcon$default(this, R.drawable.icon_sport_map_start, (LatLng) CollectionsKt___CollectionsKt.IIII0iI(this.mBaiduPoints), false, 4, null);
        }
        getMBMapView().setLogoPosition(LogoPosition.logoPostionRightTop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGoogleMap() {
        if (!this.isGoogleMapReady) {
            i1O0OXO1O.OXO1.OXO1("updateGoogleMap: GoogleMap not ready yet");
            return;
        }
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap == null) {
            Intrinsics.XXO("mGoogleMap");
            googleMap = null;
        }
        if (com.sma.smartv3.p610ui.sport.XO0O10.OXO1.X11iII1O1().isEmpty()) {
            return;
        }
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.Xi1XO00(this.mGooglePoints);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18.0f));
        Marker marker = this.mGoogleLineEnd;
        if (marker != null) {
            marker.remove();
        }
        this.mGoogleLineEnd = googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng).anchor(0.5f, 0.5f).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.icon_sport_map_end)));
        if (this.mGooglePoints.size() > 1) {
            Polyline polyline = this.mGoogleLine;
            if (polyline != null) {
                polyline.remove();
            }
            com.google.android.gms.maps.model.PolylineOptions polylineOptions = new com.google.android.gms.maps.model.PolylineOptions();
            polylineOptions.addAll(this.mGooglePoints);
            polylineOptions.width(14.0f);
            polylineOptions.color(ContextCompat.getColor(getMContext(), R.color.map_track_color));
            Unit unit = Unit.OXO1;
            this.mGoogleLine = googleMap.addPolyline(polylineOptions);
            Marker marker2 = this.mGoogleLineStart;
            if (marker2 != null) {
                marker2.remove();
            }
            this.mGoogleLineStart = googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.IIII0iI(this.mGooglePoints)).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.icon_sport_map_start)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMap(boolean z, Location location) {
        if (com.sma.smartv3.p610ui.sport.XO0O10.OXO1.X11iII1O1().size() == 1) {
            this.mBaiduPoints.clear();
            this.mGooglePoints.clear();
        }
        if (z) {
            this.mBaiduPoints.add(new LatLng(location.getMLatitude(), location.getMLongitude()));
            updateBaiduMap();
            return;
        }
        if (isInChina(location.getMLatitude(), location.getMLongitude())) {
            Pair<Double, Double> pairOIi0 = i01I1i1X.OXO1.OIi0(location.getMLatitude(), location.getMLongitude());
            this.mGooglePoints.add(new com.google.android.gms.maps.model.LatLng(pairOIi0.getFirst().doubleValue(), pairOIi0.getSecond().doubleValue()));
        } else {
            this.mGooglePoints.add(new com.google.android.gms.maps.model.LatLng(location.getMLatitude(), location.getMLongitude()));
        }
        try {
            updateGoogleMap();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void updateShowData$default(BaseSportOnGoingActivity baseSportOnGoingActivity, SportData sportData, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateShowData");
        }
        baseSportOnGoingActivity.updateShowData((i & 1) != 0 ? new SportData(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null) : sportData);
    }

    public void changeDeviceConnectStatus(boolean z) {
    }

    public final void checkSportModeView() {
        if (a15.O00(getMArg1())) {
            hideViewFeature(false);
            return;
        }
        com.sma.smartv3.p610ui.sport.XO0O10.OXO1.X0i1O().setMMode(getMArg1());
        setSportDataOrder(j65.OXO1(getSportDataOrder()));
        hideViewFeature(true);
    }

    public void completeSport() {
    }

    public final void dataFourClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 4);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) SportShowDataSelectActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, iIXXO1.OXO1);
    }

    public final void dataOneClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) SportShowDataSelectActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, iIXXO1.OXO1);
    }

    public final void dataThreeClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 3);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) SportShowDataSelectActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, iIXXO1.OXO1);
    }

    public final void dataTwoClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) SportShowDataSelectActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, iIXXO1.OXO1);
    }

    public void disableBottomSheet() {
        getSportProcess().setNestedScrollingEnabled(false);
        getSportProcess().disableNestedInterceptTouchEvent(true);
    }

    public void enableBottomSheet() {
        if (!q62.OXO1.XIXO0iiO(getMArg1())) {
            disableBottomSheet();
        } else {
            getSportProcess().setNestedScrollingEnabled(true);
            getSportProcess().disableNestedInterceptTouchEvent(false);
        }
    }

    @aa1
    public final AnchorBottomSheetBehavior<CustomNestedScollView> getBehavior() {
        AnchorBottomSheetBehavior<CustomNestedScollView> anchorBottomSheetBehavior = this.behavior;
        if (anchorBottomSheetBehavior != null) {
            return anchorBottomSheetBehavior;
        }
        Intrinsics.XXO("behavior");
        return null;
    }

    public final CardView getCardPanel() {
        return (CardView) this.cardPanel$delegate.getValue();
    }

    public final RelativeLayout getCardPanelSub() {
        return (RelativeLayout) this.cardPanelSub$delegate.getValue();
    }

    public final LinearLayout getCountdownRl() {
        return (LinearLayout) this.countdownRl$delegate.getValue();
    }

    public final DINCondBold getCountdownTv() {
        return (DINCondBold) this.countdownTv$delegate.getValue();
    }

    @aa1
    public final int[] getGoals() {
        return this.goals;
    }

    public final ViewGroup getHandleView() {
        return (ViewGroup) this.handleView$delegate.getValue();
    }

    public final ImageView getIvGpsSignal() {
        return (ImageView) this.ivGpsSignal$delegate.getValue();
    }

    @tb1
    public final PopupWindow getMLongPressPopup() {
        return this.mLongPressPopup;
    }

    @aa1
    public final com.sma.smartv3.ui.sport.XO0O10.OXO1 getMSportCallback() {
        return (com.sma.smartv3.ui.sport.XO0O10.OXO1) this.mSportCallback$delegate.getValue();
    }

    @tb1
    public final go0 getMSportShortPopup() {
        return this.mSportShortPopup;
    }

    public final ViewGroup getMapPanel() {
        return (ViewGroup) this.mapPanel$delegate.getValue();
    }

    public final ViewGroup getRootView() {
        return (ViewGroup) this.rootView$delegate.getValue();
    }

    public final RelativeLayout getScreenLockRl() {
        return (RelativeLayout) this.screenLockRl$delegate.getValue();
    }

    public final SlideLockView getSlideLockView() {
        return (SlideLockView) this.slideLockView$delegate.getValue();
    }

    public final ViewGroup getSportDataLL() {
        return (ViewGroup) this.sportDataLL$delegate.getValue();
    }

    @aa1
    public final js4 getSportDataOrder() {
        js4 js4Var = this.sportDataOrder;
        if (js4Var != null) {
            return js4Var;
        }
        Intrinsics.XXO("sportDataOrder");
        return null;
    }

    public final SportEndProgress getSportEndProgress() {
        return (SportEndProgress) this.sportEndProgress$delegate.getValue();
    }

    public final DINCondBold getSportFourShowValue() {
        return (DINCondBold) this.sportFourShowValue$delegate.getValue();
    }

    public final PFMedium getSportFourShowValueDesc() {
        return (PFMedium) this.sportFourShowValueDesc$delegate.getValue();
    }

    public final View getSportLeftLayout() {
        return (View) this.sportLeftLayout$delegate.getValue();
    }

    public final PFMedium getSportModelName() {
        return (PFMedium) this.sportModelName$delegate.getValue();
    }

    public final ViewGroup getSportOnGoingFl() {
        return (ViewGroup) this.sportOnGoingFl$delegate.getValue();
    }

    public final DINCondBold getSportOneShowValue() {
        return (DINCondBold) this.sportOneShowValue$delegate.getValue();
    }

    public final PFMedium getSportOneShowValueDesc() {
        return (PFMedium) this.sportOneShowValueDesc$delegate.getValue();
    }

    public final ImageButton getSportPause() {
        return (ImageButton) this.sportPause$delegate.getValue();
    }

    public final ViewGroup getSportPausePanel() {
        return (ViewGroup) this.sportPausePanel$delegate.getValue();
    }

    public final CustomNestedScollView getSportProcess() {
        return (CustomNestedScollView) this.sportProcess$delegate.getValue();
    }

    public final LinearLayout getSportRightLayout() {
        return (LinearLayout) this.sportRightLayout$delegate.getValue();
    }

    public final ViewGroup getSportRunPanel() {
        return (ViewGroup) this.sportRunPanel$delegate.getValue();
    }

    public final ImageButton getSportSet() {
        return (ImageButton) this.sportSet$delegate.getValue();
    }

    public final DINCondBold getSportThreeShowValue() {
        return (DINCondBold) this.sportThreeShowValue$delegate.getValue();
    }

    public final PFMedium getSportThreeShowValueDesc() {
        return (PFMedium) this.sportThreeShowValueDesc$delegate.getValue();
    }

    public final DINCondBold getSportTwoShowValue() {
        return (DINCondBold) this.sportTwoShowValue$delegate.getValue();
    }

    public final PFMedium getSportTwoShowValueDesc() {
        return (PFMedium) this.sportTwoShowValueDesc$delegate.getValue();
    }

    public final ViewGroup getStatuesPanel() {
        return (ViewGroup) this.statuesPanel$delegate.getValue();
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    public void handleSportState(int i) {
        i1O0OXO1O.OXO1.OXO1("handleSportState -> " + i);
        if (i == 1 || i == 2) {
            getSportPause().setVisibility(0);
            getSportPausePanel().setVisibility(4);
            enableBottomSheet();
            PopupWindow popupWindow = this.mLongPressPopup;
            if (popupWindow != null) {
                popupWindow.dismiss();
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            stopSport(false);
        } else {
            getSportPause().setVisibility(4);
            getSportPausePanel().setVisibility(0);
            disableBottomSheet();
        }
    }

    public void hideViewFeature(boolean z) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("initView -> mArg3: " + getMArg3());
        com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
        xo0o10.X111IO((getMArg3() instanceof BleDeviceSportData) ^ true);
        if (getMArg3() instanceof int[]) {
            Object mArg3 = getMArg3();
            Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type kotlin.IntArray");
            this.goals = (int[]) mArg3;
        }
        String string = Arrays.toString(this.goals);
        Intrinsics.O10IXXX0X(string, "toString(...)");
        i1o0oxo1o.OXO1("initView -> goals: " + string + ", isStartFromApp: " + xo0o10.X00XIX1());
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        String strValueOf = String.valueOf(getMArg1());
        Object js4Var = new js4(null, 1, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(strValueOf + '_' + js4.class.getName()), (Class<Object>) js4.class);
        if (objFromJson != null) {
            js4Var = objFromJson;
        }
        setSportDataOrder((js4) js4Var);
        checkSportModeView();
        getRootView().setKeepScreenOn(a01Var.IiI10X().getBoolean(b01.Ii0i));
        getSportEndProgress().IiI10X(new XIi00iiXO());
        getSportEndProgress().m38912iO(new C18956iO());
        getSlideLockView().I1XOi1(new XO0O10());
        AnchorBottomSheetBehavior<CustomNestedScollView> anchorBottomSheetBehaviorFrom = AnchorBottomSheetBehavior.from(getSportProcess());
        Intrinsics.O10IXXX0X(anchorBottomSheetBehaviorFrom, "from(...)");
        setBehavior(anchorBottomSheetBehaviorFrom);
        getBehavior().setHideable(false);
        getBehavior().addBottomSheetCallback(new O00());
        PFMedium sportModelName = getSportModelName();
        q62 q62Var = q62.OXO1;
        sportModelName.setText(q62Var.i01OOiI(getMArg1()));
        if (q62Var.XIXO0iiO(getMArg1())) {
            getBehavior().setState(3);
            showMapContent(this.isInChinaMainland);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iOiXi1i1O
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSportOnGoingActivity.initView$lambda$0(this.f8208IO);
                }
            }, 300L);
        } else {
            getHandleView().setVisibility(4);
            getStatuesPanel().setVisibility(0);
            setSportOneShowValue(100.0f);
            getBehavior().setState(4);
            getCardPanel().setRadius(SizeUtils.dp2px(0.0f));
            disableBottomSheet();
        }
        III011.OIi0(this).XXI();
        if (xo0o10.X00XIX1()) {
            startCountDown();
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OIOOi11I1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSportOnGoingActivity.initView$lambda$1(this.f3016IO);
                }
            }, 500L);
        }
        updateShowData$default(this, null, 1, null);
    }

    public final boolean isInChina(double d, double d2) {
        return i01I1i1X.OXO1.XO0O10(d, d2);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_on_going;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtils.m11128d(Integer.valueOf(i));
        if (8564 == i) {
            SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
            String strValueOf = String.valueOf(getMArg1());
            Object js4Var = new js4(null, 1, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(strValueOf + '_' + js4.class.getName()), (Class<Object>) js4.class);
            if (objFromJson != null) {
                js4Var = objFromJson;
            }
            js4 js4Var2 = (js4) js4Var;
            if (Intrinsics.XOO0ii0(getSportDataOrder(), js4Var2)) {
                return;
            }
            setSportDataOrder(js4Var2);
            checkSportModeView();
            updateShowData(com.sma.smartv3.p610ui.sport.XO0O10.OXO1.X0i1O());
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        super.onCreate(bundle);
        com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
        Application application = getApplication();
        Intrinsics.O10IXXX0X(application, "getApplication(...)");
        xo0o10.XX1Oi(application);
        xo0o10.XiOIii1(getMSportCallback());
        xo0o10.X00O0(true);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.sma.smartv3.p610ui.sport.XO0O10.OXO1.X00O0(false);
        if (this.isShowMap) {
            if (this.isInChinaMainland) {
                getMBMapView().onDestroy();
            } else {
                getMGMapView().onDestroy();
            }
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getScreenLockRl().getVisibility() != 0) {
            com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
            if (xo0o10.iOiXi11II()) {
                com.sma.smartv3.p610ui.sport.XO0O10.XOXiX0(xo0o10, false, 1, null);
                handleSportState(xo0o10.O001I());
            } else if (xo0o10.O001I() == 3) {
                showLongPressTip();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.isShowMap) {
            if (this.isInChinaMainland) {
                getMBMapView().onPause();
            } else {
                getMGMapView().onPause();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isShowMap) {
            if (this.isInChinaMainland) {
                getMBMapView().onResume();
            } else {
                getMGMapView().onResume();
            }
        }
    }

    @sf5(tag = b01.Ii0i)
    public final void onScreenOnChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onScreenOnChanged");
        getRootView().setKeepScreenOn(a01.OXO1.IiI10X().getBoolean(b01.Ii0i));
    }

    public final void setBehavior(@aa1 AnchorBottomSheetBehavior<CustomNestedScollView> anchorBottomSheetBehavior) {
        Intrinsics.X0O(anchorBottomSheetBehavior, "<set-?>");
        this.behavior = anchorBottomSheetBehavior;
    }

    public final void setGoals(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.goals = iArr;
    }

    public final void setMLongPressPopup(@tb1 PopupWindow popupWindow) {
        this.mLongPressPopup = popupWindow;
    }

    public final void setMSportShortPopup(@tb1 go0 go0Var) {
        this.mSportShortPopup = go0Var;
    }

    public final void setSportDataOrder(@aa1 js4 js4Var) {
        Intrinsics.X0O(js4Var, "<set-?>");
        this.sportDataOrder = js4Var;
    }

    public void setSportOneShowValue(float f) {
        getSportOneShowValue().setTextSize(1, f);
    }

    public void showGoalDoneDialog(int i) {
        int i2;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_goal_done_dg, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_goal_done);
        com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
        if (i == xo0o10.IXXOO()) {
            i2 = R.drawable.time_done_img;
        } else {
            i2 = i == xo0o10.i010I() ? R.drawable.calories_done_img : R.drawable.distance_done_img;
        }
        imageView.setImageResource(i2);
        Dialog dialog = new Dialog(this, R.style.AppDialogTheme);
        dialog.setContentView(viewInflate);
        dialog.show();
    }

    public void showGoalProgress(@aa1 SportDataType key, @aa1 SportData sportData) {
        Intrinsics.X0O(key, "key");
        Intrinsics.X0O(sportData, "sportData");
    }

    public void showLongPressTip() {
        PopupWindow popupWindow = this.mLongPressPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_bubble, (ViewGroup) null);
            Intrinsics.X1ii(viewInflate, "null cannot be cast to non-null type com.sma.smartv3.view.bubbleview.BubbleLayout");
            BubbleLayout bubbleLayout = (BubbleLayout) viewInflate;
            bubbleLayout.measure(0, 0);
            ((TextView) bubbleLayout.findViewById(R.id.f51423tv)).setText(R.string.long_press_end);
            bubbleLayout.requestLayout();
            this.mLongPressPopup = XXiOOOX.OXO1(getMContext(), bubbleLayout);
            bubbleLayout.O00(ArrowDirection.BOTTOM);
            PopupWindow popupWindow2 = this.mLongPressPopup;
            if (popupWindow2 != null) {
                popupWindow2.setOutsideTouchable(false);
            }
            int measuredWidth = (getSportEndProgress().getMeasuredWidth() - bubbleLayout.getMeasuredWidth()) / 2;
            int i = -(getSportEndProgress().getMeasuredHeight() + bubbleLayout.getMeasuredHeight() + SizeUtils.dp2px(4.0f));
            bubbleLayout.XOO0ii0((bubbleLayout.getMeasuredWidth() - bubbleLayout.getArrowWidth()) / 2.0f);
            PopupWindow popupWindow3 = this.mLongPressPopup;
            if (popupWindow3 != null) {
                popupWindow3.showAsDropDown(getSportEndProgress(), measuredWidth, i);
            }
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iXXO0i
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSportOnGoingActivity.showLongPressTip$lambda$0(this.f8403IO);
                }
            }, 3000L);
        }
    }

    @aa1
    public final Pair<String, String> showOneContent(@aa1 SportDataType key, @aa1 SportData sportData) {
        String str;
        Intrinsics.X0O(key, "key");
        Intrinsics.X0O(sportData, "sportData");
        showGoalProgress(key, sportData);
        switch (OXO1.OXO1[key.ordinal()]) {
            case 1:
                return new Pair<>(O0X11OiO.iXiX011(sportData.getMDuration() * 1000), getString(R.string.time));
            case 2:
                String strValueOf = String.valueOf(cp5.X1ii(sportData.getMDistance(), this.userProfile.getUnit(), false, 4, null));
                if (this.userProfile.getUnit() == 0) {
                    if (i72.OXO1.OXOO0X0i()) {
                        str = getString(R.string.distance) + I000IiI1O.C2156iO.XIi00iiXO + getString(R.string.weather_km) + I000IiI1O.C2156iO.f1007iO;
                    } else {
                        str = getString(R.string.distance) + I000IiI1O.C2156iO.XIi00iiXO + getString(R.string.f54356km) + I000IiI1O.C2156iO.f1007iO;
                    }
                } else if (i72.OXO1.OXOO0X0i()) {
                    str = getString(R.string.distance) + I000IiI1O.C2156iO.XIi00iiXO + getString(R.string.weather_mi) + I000IiI1O.C2156iO.f1007iO;
                } else {
                    str = getString(R.string.distance) + I000IiI1O.C2156iO.XIi00iiXO + getString(R.string.f54361mi) + I000IiI1O.C2156iO.f1007iO;
                }
                return new Pair<>(strValueOf, str);
            case 3:
                return new Pair<>(cp5.Ii1iii0(sportData.getMPace(), this.userProfile.getUnit()), getString(R.string.pace));
            case 4:
                return new Pair<>(String.valueOf(sportData.getMCalorie()), getString(R.string.calories));
            case 5:
                return new Pair<>(String.valueOf(sportData.getMStep()), getString(R.string.steps));
            case 6:
                return new Pair<>(String.valueOf(sportData.getMSpm()), getString(R.string.spm));
            case 7:
                return new Pair<>(String.valueOf(sportData.getMAltitude()), getString(R.string.altitude));
            case 8:
                return new Pair<>(UtilsKt.XOXiX0(String.valueOf(com.sma.smartv3.p610ui.sport.XO0O10.OXO1.m38659iI())), getString(R.string.heart_rate));
            case 9:
                return new Pair<>(String.valueOf(sportData.getMSpeed()), getString(R.string.speed));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void sportEndClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public void sportLock() {
        disableBottomSheet();
        getSlideLockView().XiOIii1();
        getSportRunPanel().setVisibility(4);
        getScreenLockRl().setVisibility(0);
        PopupWindow popupWindow = this.mLongPressPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void sportLockClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        sportLock();
    }

    public void sportPause() {
        com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
        com.sma.smartv3.p610ui.sport.XO0O10.XOXiX0(xo0o10, false, 1, null);
        handleSportState(xo0o10.O001I());
    }

    public final void sportPauseClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        sportPause();
    }

    public void sportResume() {
        com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
        com.sma.smartv3.p610ui.sport.XO0O10.m38654Oi(xo0o10, false, 1, null);
        handleSportState(xo0o10.O001I());
    }

    public final void sportResumeClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        sportResume();
    }

    public final void sportSetClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) SportSettingActivity.class));
    }

    public void sportStartVoice(long j) {
    }

    public void startCountDown() {
        getCountdownRl().setVisibility(0);
        getSportProcess().setVisibility(4);
        new OIi0().start();
    }

    public void startSport() {
        getCountdownRl().setVisibility(8);
        getScreenLockRl().setVisibility(4);
        getSportProcess().setVisibility(0);
        handleSportState(com.sma.smartv3.p610ui.sport.XO0O10.OXO1.O001I());
        if (q62.OXO1.XIXO0iiO(getMArg1())) {
            this.cardPanelSubMinHeight = getHandleView().getHeight() + getSportDataLL().getHeight() + getSportOnGoingFl().getHeight();
            getBehavior().setAnchorPoint(getRootView().getHeight() - this.cardPanelSubMinHeight);
            getBehavior().setPeekHeight(this.cardPanelSubMinHeight);
            RelativeLayout cardPanelSub = getCardPanelSub();
            Intrinsics.O10IXXX0X(cardPanelSub, "<get-cardPanelSub>(...)");
            LibExKt.X111IO(cardPanelSub, this.cardPanelSubMinHeight);
            ViewGroup.LayoutParams layoutParams = getMapPanel().getLayoutParams();
            Intrinsics.X1ii(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) layoutParams)).bottomMargin = (getHandleView().getHeight() + getSportDataLL().getHeight()) - SizeUtils.dp2px(20.0f);
        }
    }

    public void stopSport(boolean z) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("结束运动 " + z);
        PopupWindow popupWindow = this.mLongPressPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        if (!z || com.sma.smartv3.p610ui.sport.XO0O10.m38653OX(com.sma.smartv3.p610ui.sport.XO0O10.OXO1, false, 1, null)) {
            com.sma.smartv3.p610ui.sport.XO0O10 xo0o10 = com.sma.smartv3.p610ui.sport.XO0O10.OXO1;
            com.sma.smartv3.p610ui.sport.XO0O10.X01IiOiIi(xo0o10, false, 1, null);
            if (com.sma.smartv3.p610ui.sport.XO0O10.m38653OX(xo0o10, false, 1, null)) {
                xo0o10.IO0iXO0O();
                completeSport();
            }
            xo0o10.XOO0XOOii(getMSportCallback());
            xo0o10.m38656I1();
            i1o0oxo1o.OXO1("finish SportActivity");
            finish();
            return;
        }
        if (this.mSportShortPopup == null) {
            go0 go0Var = new go0(getMContext(), 0, 2, null);
            go0Var.O1O(R.string.sport_very_short);
            go0Var.iX1O1(Integer.valueOf(R.string.keep_moving), new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XXI
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseSportOnGoingActivity.stopSport$lambda$0$0(this.f1234IO));
                }
            });
            go0Var.X1IX(R.string.end_exercise, new Function0() { // from class: com.android.mltcode.paycertificationapi.iOX11
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseSportOnGoingActivity.stopSport$lambda$0$1(this.f8138IO));
                }
            });
            this.mSportShortPopup = go0Var;
        }
        go0 go0Var2 = this.mSportShortPopup;
        if (go0Var2 != null) {
            ViewGroup rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public void updateShowData(@aa1 SportData sportData) {
        Intrinsics.X0O(sportData, "sportData");
        for (Map.Entry<SportDataType, Integer> entry : getSportDataOrder().XO0O10().entrySet()) {
            SportDataType key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            Pair<String, String> pairShowOneContent = showOneContent(key, sportData);
            String strComponent1 = pairShowOneContent.component1();
            String strComponent2 = pairShowOneContent.component2();
            if (iIntValue == 1) {
                getSportOneShowValue().setText(strComponent1);
                getSportOneShowValueDesc().setText(strComponent2);
            } else if (iIntValue == 2) {
                if (!q62.OXO1.XO11O()) {
                    View sportLeftLayout = getSportLeftLayout();
                    Intrinsics.O10IXXX0X(sportLeftLayout, "<get-sportLeftLayout>(...)");
                    if (sportLeftLayout.getVisibility() == 0) {
                        View sportLeftLayout2 = getSportLeftLayout();
                        Intrinsics.O10IXXX0X(sportLeftLayout2, "<get-sportLeftLayout>(...)");
                        sportLeftLayout2.setVisibility(8);
                        ViewGroup.LayoutParams layoutParams = getSportRightLayout().getLayoutParams();
                        Intrinsics.X1ii(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.weight = 2.0f;
                        getSportRightLayout().setLayoutParams(layoutParams2);
                    }
                }
                getSportTwoShowValue().setText(strComponent1);
                getSportTwoShowValueDesc().setText(strComponent2);
            } else if (iIntValue == 3) {
                getSportThreeShowValue().setText(strComponent1);
                getSportThreeShowValueDesc().setText(strComponent2);
            } else if (iIntValue == 4) {
                getSportFourShowValue().setText(strComponent1);
                getSportFourShowValueDesc().setText(strComponent2);
            }
        }
    }
}
