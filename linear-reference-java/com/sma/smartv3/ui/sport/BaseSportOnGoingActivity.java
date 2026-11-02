package com.sma.smartv3.ui.sport;

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
import androidx.compose.ui.layout.LayoutKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I0XOOII;
import com.android.mltcode.paycertificationapi.I0XXI;
import com.android.mltcode.paycertificationapi.I10I0iIOI;
import com.android.mltcode.paycertificationapi.I1Xi1;
import com.android.mltcode.paycertificationapi.III011;
import com.android.mltcode.paycertificationapi.IIOOX;
import com.android.mltcode.paycertificationapi.IOIOXiIIX;
import com.android.mltcode.paycertificationapi.IX1i1III;
import com.android.mltcode.paycertificationapi.IiO1O0;
import com.android.mltcode.paycertificationapi.O0OIii0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XI1X;
import com.android.mltcode.paycertificationapi.OI0011OiX;
import com.android.mltcode.paycertificationapi.OIIIX0i10;
import com.android.mltcode.paycertificationapi.OIOOi11I1;
import com.android.mltcode.paycertificationapi.OXIii10;
import com.android.mltcode.paycertificationapi.OXXiO001;
import com.android.mltcode.paycertificationapi.X0110iiO;
import com.android.mltcode.paycertificationapi.X10O0;
import com.android.mltcode.paycertificationapi.XI1011OX;
import com.android.mltcode.paycertificationapi.XI1X0;
import com.android.mltcode.paycertificationapi.XO1Ii00;
import com.android.mltcode.paycertificationapi.XOIIiIOIX;
import com.android.mltcode.paycertificationapi.XX0Oi10i;
import com.android.mltcode.paycertificationapi.XXIX0OO;
import com.android.mltcode.paycertificationapi.XXOO;
import com.android.mltcode.paycertificationapi.XXXXIiIX;
import com.android.mltcode.paycertificationapi.XXiOOOX;
import com.android.mltcode.paycertificationapi.XiIOiXiX;
import com.android.mltcode.paycertificationapi.XiO0X;
import com.android.mltcode.paycertificationapi.XiX1X00i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i01I1i1X;
import com.android.mltcode.paycertificationapi.i0OXO1;
import com.android.mltcode.paycertificationapi.i0XXiIX;
import com.android.mltcode.paycertificationapi.i11iXOi;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1Xi;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIXX0;
import com.android.mltcode.paycertificationapi.iIXXO1;
import com.android.mltcode.paycertificationapi.iOO1O0i;
import com.android.mltcode.paycertificationapi.iOX11;
import com.android.mltcode.paycertificationapi.iOXXXXI;
import com.android.mltcode.paycertificationapi.iOiXi1i1O;
import com.android.mltcode.paycertificationapi.iXXO0i;
import com.android.mltcode.paycertificationapi.iiiOii0O;
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
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.SportData;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaseSportOnGoingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportOnGoingActivity.kt\ncom/sma/smartv3/ui/sport/BaseSportOnGoingActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,901:1\n19#2:902\n15#2:903\n94#2:904\n90#2:905\n94#2:909\n90#2:910\n255#3:906\n257#3,2:907\n173#4,7:911\n180#4,3:919\n143#4,7:922\n183#4:929\n173#4,7:930\n180#4,3:938\n143#4,7:941\n183#4:948\n173#4,7:949\n180#4,3:957\n143#4,7:960\n183#4:967\n173#4,7:968\n180#4,3:976\n143#4,7:979\n183#4:986\n69#4,3:987\n72#4,5:991\n1#5:918\n1#5:937\n1#5:956\n1#5:975\n1#5:990\n*S KotlinDebug\n*F\n+ 1 BaseSportOnGoingActivity.kt\ncom/sma/smartv3/ui/sport/BaseSportOnGoingActivity\n*L\n111#1:902\n111#1:903\n209#1:904\n209#1:905\n816#1:909\n816#1:910\n704#1:906\n705#1:907,2\n826#1:911,7\n826#1:919,3\n826#1:922,7\n826#1:929\n830#1:930,7\n830#1:938,3\n830#1:941,7\n830#1:948\n834#1:949,7\n834#1:957,3\n834#1:960,7\n834#1:967\n838#1:968,7\n838#1:976,3\n838#1:979,7\n838#1:986\n842#1:987,3\n842#1:991,5\n826#1:918\n830#1:937\n834#1:956\n838#1:975\n842#1:990\n*E\n"})
public abstract class BaseSportOnGoingActivity extends BaseActivity {
    protected AnchorBottomSheetBehavior<CustomNestedScollView> behavior;

    @aa1
    private final Lazy cardPanel$delegate;

    @aa1
    private final Lazy cardPanelSub$delegate;
    private int cardPanelSubMinHeight;

    @aa1
    private final Lazy countdownRl$delegate;

    @aa1
    private final Lazy countdownTv$delegate;

    @aa1
    private int[] goals;

    @aa1
    private final Lazy handleView$delegate;
    private boolean isBaiduMapReady;
    private boolean isGoogleMapReady;
    private final boolean isInChinaMainland;
    private boolean isShowMap;

    @aa1
    private final Lazy ivGpsSignal$delegate;

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

    @aa1
    private final Lazy mapPanel$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy screenLockRl$delegate;

    @aa1
    private final Lazy slideLockView$delegate;

    @aa1
    private final Lazy sportDataLL$delegate;
    public js4 sportDataOrder;

    @aa1
    private final Lazy sportEndProgress$delegate;

    @aa1
    private final Lazy sportFourShowValue$delegate;

    @aa1
    private final Lazy sportFourShowValueDesc$delegate;

    @aa1
    private final Lazy sportLeftLayout$delegate;

    @aa1
    private final Lazy sportModelName$delegate;

    @aa1
    private final Lazy sportOnGoingFl$delegate;

    @aa1
    private final Lazy sportOneShowValue$delegate;

    @aa1
    private final Lazy sportOneShowValueDesc$delegate;

    @aa1
    private final Lazy sportPause$delegate;

    @aa1
    private final Lazy sportPausePanel$delegate;

    @aa1
    private final Lazy sportProcess$delegate;

    @aa1
    private final Lazy sportRightLayout$delegate;

    @aa1
    private final Lazy sportRunPanel$delegate;

    @aa1
    private final Lazy sportSet$delegate;

    @aa1
    private final Lazy sportThreeShowValue$delegate;

    @aa1
    private final Lazy sportThreeShowValueDesc$delegate;

    @aa1
    private final Lazy sportTwoShowValue$delegate;

    @aa1
    private final Lazy sportTwoShowValueDesc$delegate;

    @aa1
    private final Lazy statuesPanel$delegate;

    @aa1
    private final AppUser userProfile;

    public static final class I0IIOi implements CustomGoogleMapView.OXO1 {
        public final /* synthetic */ BaseSportOnGoingActivity OXO1;

        public I0IIOi(BaseSportOnGoingActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.CustomGoogleMapView.OXO1
        public void OXO1(MotionEvent r2) {
            Intrinsics.X0O(r2, "motionEvent");
            if (r2.getAction() != 1) goto L6;
            this.OXO1.getSportProcess().requestDisallowInterceptTouchEvent(false);
            return;
        L6:
            this.OXO1.getSportProcess().requestDisallowInterceptTouchEvent(true);
        }
    }

    public static final class IiI10X implements com.sma.smartv3.ui.sport.XO0O10.OXO1 {
        public final /* synthetic */ BaseSportOnGoingActivity OXO1;

        public IiI10X(BaseSportOnGoingActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void IO(SportData r2) {
            Intrinsics.X0O(r2, "sportData");
            this.OXO1.updateShowData(r2);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void O00(boolean r2) {
            super.O00(r2);
            this.OXO1.changeDeviceConnectStatus(r2);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void OIi0(Location r3) {
            Intrinsics.X0O(r3, "location");
            BaseSportOnGoingActivity r0 = this.OXO1;
            BaseSportOnGoingActivity.access$updateMap(r0, BaseSportOnGoingActivity.access$isInChinaMainland$p(r0), r3);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void XO0O10(BleAppSportState r2) {
            Intrinsics.X0O(r2, "sportState");
            this.OXO1.handleSportState(r2.getMState());
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void iO(int r4) {
            this.OXO1.showGoalDoneDialog(r4);     // Catch: Exception -> L4
            return;
        L4:
            e = move-exception;
            i1O0OXO1O.OXO1.OXO1("BaseSportOnGoingActivity  onGoalDone  showGoalDoneDialog try Exception = " + e);
        }
    }

    public static final class O00 extends AnchorBottomSheetBehavior.XIi00iiXO {
        public final /* synthetic */ BaseSportOnGoingActivity OXO1;

        public O00(BaseSportOnGoingActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.AnchorBottomSheetBehavior.XIi00iiXO
        public void OXO1(View r3, float r4) {
            Intrinsics.X0O(r3, "bottomSheet");
            float r5 = this.OXO1.getBehavior().getPeekHeight() + ((this.OXO1.getRootView().getHeight() - this.OXO1.getBehavior().getPeekHeight()) * r4);
            if (r5 <= BaseSportOnGoingActivity.access$getCardPanelSubMinHeight$p(this.OXO1)) goto L6;
            RelativeLayout r6 = this.OXO1.getCardPanelSub();
            Intrinsics.O10IXXX0X(r6, "<get-cardPanelSub>(...)");
            LibExKt.X111IO(r6, (int) r5);
            return;
        L6:
            RelativeLayout r7 = this.OXO1.getCardPanelSub();
            Intrinsics.O10IXXX0X(r7, "<get-cardPanelSub>(...)");
            LibExKt.X111IO(r7, BaseSportOnGoingActivity.access$getCardPanelSubMinHeight$p(this.OXO1));
        }

        @Override // com.sma.smartv3.view.AnchorBottomSheetBehavior.XIi00iiXO
        public void XIi00iiXO(View r2, int r3) {
            Intrinsics.X0O(r2, "bottomSheet");
            if (r3 != 3) goto L5;
        L10:
            this.OXO1.getCardPanel().setRadius(SizeUtils.dp2px(20.0f));
            this.OXO1.getStatuesPanel().setVisibility(8);
            this.OXO1.setSportOneShowValue(55.0f);
        L11:
            this.OXO1.getSportProcess().requestLayout();
            return;
        L5:
            if (r3 != 4) goto L7;
            this.OXO1.getCardPanel().setRadius(SizeUtils.dp2px(0.0f));
            this.OXO1.getStatuesPanel().setVisibility(0);
            this.OXO1.setSportOneShowValue(70.0f);
            goto L11
        L7:
            if (r3 == 5) goto L10;
            goto L10
        }
    }

    public static final class OIi0 extends CountDownTimer {
        public final /* synthetic */ BaseSportOnGoingActivity OXO1;

        public OIi0(BaseSportOnGoingActivity r5) {
            this.OXO1 = r5;
            super(4000, 1000);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VibrateUtils.vibrate(200);
            this.OXO1.startSport();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r10) {
            if (this.OXO1.getCountdownTv().isShown() == false) goto L10;
            long r11 = r10 / ((long) 1000);
            this.OXO1.sportStartVoice(r11);
            DINCondBold r0 = this.OXO1.getCountdownTv();
            if (r11 <= 0) goto L7;
            String r12 = String.valueOf(r11);
        L8:
            r0.setText(r12);
            return;
        L7:
            com.sma.smartv3.ui.sport.XO0O10.i100IXOX(com.sma.smartv3.ui.sport.XO0O10.OXO1, this.OXO1.getMArg1(), false, this.OXO1.getGoals()[0], this.OXO1.getGoals()[1], this.OXO1.getGoals()[2], 2, null);
            r12 = this.OXO1.getString(R.string.GO);
            Intrinsics.XXI(r12);
            goto L8
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[SportDataType.values().length];
            r0[SportDataType.TIME.ordinal()] = 1;     // Catch: NoSuchFieldError -> L14
        L25:
            r0[SportDataType.DISTANCE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L15
        L39:
            r0[SportDataType.PACE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L16
        L29:
            r0[SportDataType.CALORIES.ordinal()] = 4;     // Catch: NoSuchFieldError -> L17
        L31:
            r0[SportDataType.STEP.ordinal()] = 5;     // Catch: NoSuchFieldError -> L18
        L23:
            r0[SportDataType.SPM.ordinal()] = 6;     // Catch: NoSuchFieldError -> L19
        L33:
            r0[SportDataType.ALTITUDE.ordinal()] = 7;     // Catch: NoSuchFieldError -> L20
        L35:
            r0[SportDataType.HEARTRATE.ordinal()] = 8;     // Catch: NoSuchFieldError -> L21
        L27:
            r0[SportDataType.SPEED.ordinal()] = 9;     // Catch: NoSuchFieldError -> L22
        L12:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO implements SportEndProgress.XIi00iiXO {
        public final /* synthetic */ BaseSportOnGoingActivity OXO1;

        public XIi00iiXO(BaseSportOnGoingActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.SportEndProgress.XIi00iiXO
        public void start(boolean r1) {
            if (r1 == false) goto L5;
            this.OXO1.showLongPressTip();
            return;
        }
    }

    public static final class XO0O10 implements SlideLockView.iO {
        public final /* synthetic */ BaseSportOnGoingActivity OXO1;

        public XO0O10(BaseSportOnGoingActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.SlideLockView.iO
        public void OXO1() {
            this.OXO1.getSlideLockView().XiOIii1();
            this.OXO1.getSportRunPanel().setVisibility(0);
            this.OXO1.getScreenLockRl().setVisibility(4);
            if (com.sma.smartv3.ui.sport.XO0O10.OXO1.O001I() == 3) goto L6;
            this.OXO1.enableBottomSheet();
            return;
        }
    }

    public static final class XOO0ii0 implements OnMapReadyCallback {
        public final /* synthetic */ CustomGoogleMapView OXO1;
        public final /* synthetic */ BaseSportOnGoingActivity XIi00iiXO;

        public XOO0ii0(CustomGoogleMapView r1, BaseSportOnGoingActivity r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public void onMapReady(GoogleMap r2) {
            Intrinsics.X0O(r2, "googleMap");
            MapsInitializer.initialize(this.OXO1.getContext());
            BaseSportOnGoingActivity.access$setMGoogleMap$p(this.XIi00iiXO, r2);
            BaseSportOnGoingActivity.access$setGoogleMapReady$p(this.XIi00iiXO, true);
            if (BaseSportOnGoingActivity.access$getMGooglePoints$p(this.XIi00iiXO).isEmpty() == true) goto L6;
            BaseSportOnGoingActivity.access$updateGoogleMap(this.XIi00iiXO);
            return;
        }
    }

    public static final class iO implements SportEndProgress.OXO1 {
        public final /* synthetic */ BaseSportOnGoingActivity OXO1;

        public iO(BaseSportOnGoingActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.SportEndProgress.OXO1
        public void end() {
            this.OXO1.stopSport(true);
        }
    }

    public BaseSportOnGoingActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new i1Xi(this));
        this.countdownRl$delegate = LazyKt__LazyJVMKt.iO(new XXOO(this));
        this.countdownTv$delegate = LazyKt__LazyJVMKt.iO(new XO1Ii00(this));
        this.sportProcess$delegate = LazyKt__LazyJVMKt.iO(new i0XXiIX(this));
        this.sportSet$delegate = LazyKt__LazyJVMKt.iO(new i11iXOi(this));
        this.sportPause$delegate = LazyKt__LazyJVMKt.iO(new iiiOii0O(this));
        this.sportOneShowValue$delegate = LazyKt__LazyJVMKt.iO(new IX1i1III(this));
        this.sportTwoShowValue$delegate = LazyKt__LazyJVMKt.iO(new XXIX0OO(this));
        this.sportThreeShowValue$delegate = LazyKt__LazyJVMKt.iO(new XiX1X00i(this));
        this.sportFourShowValue$delegate = LazyKt__LazyJVMKt.iO(new I0XOOII(this));
        this.sportOneShowValueDesc$delegate = LazyKt__LazyJVMKt.iO(new OIIIX0i10(this));
        this.sportTwoShowValueDesc$delegate = LazyKt__LazyJVMKt.iO(new XiO0X(this));
        this.sportThreeShowValueDesc$delegate = LazyKt__LazyJVMKt.iO(new O1XI1X(this));
        this.sportFourShowValueDesc$delegate = LazyKt__LazyJVMKt.iO(new XOIIiIOIX(this));
        this.sportEndProgress$delegate = LazyKt__LazyJVMKt.iO(new OI0011OiX(this));
        this.mapPanel$delegate = LazyKt__LazyJVMKt.iO(new O0OIii0(this));
        this.sportRunPanel$delegate = LazyKt__LazyJVMKt.iO(new i0OXO1(this));
        this.sportPausePanel$delegate = LazyKt__LazyJVMKt.iO(new XXXXIiIX(this));
        this.screenLockRl$delegate = LazyKt__LazyJVMKt.iO(new OXIii10(this));
        this.slideLockView$delegate = LazyKt__LazyJVMKt.iO(new iIXX0(this));
        this.sportDataLL$delegate = LazyKt__LazyJVMKt.iO(new X0110iiO(this));
        this.sportOnGoingFl$delegate = LazyKt__LazyJVMKt.iO(new IIOOX(this));
        this.cardPanel$delegate = LazyKt__LazyJVMKt.iO(new XX0Oi10i(this));
        this.cardPanelSub$delegate = LazyKt__LazyJVMKt.iO(new iOXXXXI(this));
        this.handleView$delegate = LazyKt__LazyJVMKt.iO(new iOO1O0i(this));
        this.statuesPanel$delegate = LazyKt__LazyJVMKt.iO(new XI1011OX(this));
        this.ivGpsSignal$delegate = LazyKt__LazyJVMKt.iO(new XI1X0(this));
        this.sportModelName$delegate = LazyKt__LazyJVMKt.iO(new IiO1O0(this));
        this.sportLeftLayout$delegate = LazyKt__LazyJVMKt.iO(new XiIOiXiX(this));
        this.sportRightLayout$delegate = LazyKt__LazyJVMKt.iO(new OXXiO001(this));
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        this.userProfile = (AppUser) r3;
        this.mGMapView$delegate = LazyKt__LazyJVMKt.iO(new X10O0(this));
        this.mBMapView$delegate = LazyKt__LazyJVMKt.iO(new IOIOXiIIX(this));
        this.isInChinaMainland = r1.OXO1().getBoolean(b01.XiOIO, false);
        this.mBaiduPoints = new ArrayList();
        this.mGooglePoints = new ArrayList();
        this.goals = new int[3];
        this.mSportCallback$delegate = LazyKt__LazyJVMKt.iO(new I10I0iIOI(this));
    }

    public static /* synthetic */ CustomGoogleMapView I0iXXO(BaseSportOnGoingActivity r0) {
        return mGMapView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup I1(BaseSportOnGoingActivity r0) {
        return sportPausePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void I1XOi1(BaseSportOnGoingActivity r0) {
        initView$lambda$1(r0);
    }

    public static /* synthetic */ CardView II1Xi0(BaseSportOnGoingActivity r0) {
        return cardPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold IIX1OXO(BaseSportOnGoingActivity r0) {
        return sportThreeShowValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IXXOO(BaseSportOnGoingActivity r0) {
        showLongPressTip$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold Ii1iii0(BaseSportOnGoingActivity r0) {
        return sportOneShowValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout O001I(BaseSportOnGoingActivity r0) {
        return countdownRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(BaseSportOnGoingActivity r0) {
        return sportFourShowValueDesc_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup O1O(BaseSportOnGoingActivity r0) {
        return statuesPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup OII(BaseSportOnGoingActivity r0) {
        return sportOnGoingFl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ IiI10X OIX0iXi(BaseSportOnGoingActivity r0) {
        return mSportCallback_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SlideLockView OX(BaseSportOnGoingActivity r0) {
        return slideLockView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OiIIX101O(BaseSportOnGoingActivity r0) {
        return ivGpsSignal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageButton X01IiOiIi(BaseSportOnGoingActivity r0) {
        return sportPause_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextureMapView X0O(BaseSportOnGoingActivity r0) {
        return mBMapView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout X0i1O(BaseSportOnGoingActivity r0) {
        return cardPanelSub_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SportEndProgress X11I(BaseSportOnGoingActivity r0) {
        return sportEndProgress_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageButton X11iII1O1(BaseSportOnGoingActivity r0) {
        return sportSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1IX(BaseSportOnGoingActivity r0, MotionEvent r1) {
        showBaiDuMap$lambda$2(r0, r1);
    }

    public static /* synthetic */ PFMedium X1ii(BaseSportOnGoingActivity r0) {
        return sportModelName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XX0(BaseSportOnGoingActivity r0) {
        return stopSport$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean XXI(BaseSportOnGoingActivity r0) {
        return stopSport$lambda$0$1(r0);
    }

    public static /* synthetic */ ViewGroup XXIIO1i11(BaseSportOnGoingActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup XXO(BaseSportOnGoingActivity r0) {
        return sportRunPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XXX11i(BaseSportOnGoingActivity r0) {
        return screenLockRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XiOIO(BaseSportOnGoingActivity r0) {
        return sportTwoShowValueDesc_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIii1(BaseSportOnGoingActivity r0) {
        initView$lambda$0(r0);
    }

    public static final /* synthetic */ int access$getCardPanelSubMinHeight$p(BaseSportOnGoingActivity r0) {
        return r0.cardPanelSubMinHeight;
    }

    public static final /* synthetic */ List access$getMGooglePoints$p(BaseSportOnGoingActivity r0) {
        return r0.mGooglePoints;
    }

    public static final /* synthetic */ boolean access$isInChinaMainland$p(BaseSportOnGoingActivity r0) {
        return r0.isInChinaMainland;
    }

    public static final /* synthetic */ void access$setGoogleMapReady$p(BaseSportOnGoingActivity r0, boolean r1) {
        r0.isGoogleMapReady = r1;
    }

    public static final /* synthetic */ void access$setMGoogleMap$p(BaseSportOnGoingActivity r0, GoogleMap r1) {
        r0.mGoogleMap = r1;
    }

    public static final /* synthetic */ void access$updateGoogleMap(BaseSportOnGoingActivity r0) {
        r0.updateGoogleMap();
    }

    public static final /* synthetic */ void access$updateMap(BaseSportOnGoingActivity r0, boolean r1, Location r2) {
        r0.updateMap(r1, r2);
    }

    private static final RelativeLayout cardPanelSub_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.cardPanelSub);
    }

    private static final CardView cardPanel_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (CardView) r1.findViewById(R.id.cardPanel);
    }

    private static final LinearLayout countdownRl_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.countdownRl);
    }

    private static final DINCondBold countdownTv_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.countdownTv);
    }

    private final Overlay createBaiduIcon(int r3, LatLng r4, boolean r5) {
        BaiduMap r0 = this.mBaiDuMap;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mBaiDuMap");
        r0 = null;
    L5:
        MarkerOptions r6 = new MarkerOptions().position(r4).icon(BitmapDescriptorFactory.fromResource(r3)).draggable(false).flat(true).zIndex(9);
        if (r5 == false) goto L8;
        r6.anchor(0.5f, 0.5f);
    L8:
        Overlay r7 = r0.addOverlay(r6);
        Intrinsics.O10IXXX0X(r7, "addOverlay(...)");
        return r7;
    }

    public static /* synthetic */ Overlay createBaiduIcon$default(BaseSportOnGoingActivity r0, int r1, LatLng r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = false;
    L7:
        return r0.createBaiduIcon(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBaiduIcon");
    }

    private final TextureMapView getMBMapView() {
        return (TextureMapView) getValue();
    }

    private final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) getValue();
    }

    private static final ViewGroup handleView_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.fl_handle);
    }

    public static /* synthetic */ PFMedium i010I(BaseSportOnGoingActivity r0) {
        return sportOneShowValueDesc_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CustomNestedScollView iI(BaseSportOnGoingActivity r0) {
        return sportProcess_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup iIXi1iiXI(BaseSportOnGoingActivity r0) {
        return handleView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iIiiO(BaseSportOnGoingActivity r0) {
        return sportFourShowValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iOO1ii1(BaseSportOnGoingActivity r0) {
        return sportLeftLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iOOX010X(BaseSportOnGoingActivity r0) {
        return countdownTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iX(BaseSportOnGoingActivity r0) {
        return sportTwoShowValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iX1O1(BaseSportOnGoingActivity r0) {
        return sportRightLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup iXiX011(BaseSportOnGoingActivity r0) {
        return mapPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iXiiiO(BaseSportOnGoingActivity r0) {
        return sportThreeShowValueDesc_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup iiiO(BaseSportOnGoingActivity r0) {
        return sportDataLL_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(BaseSportOnGoingActivity r19) {
        CustomLocation r1 = UtilsKt.XXIIO1i11();
        if (r1.OXO1() != 0.0d) goto L6;
        return;
    L6:
        if (r1.IiI10X() != 0.0d) goto L8;
        return;
    L8:
        boolean r2 = r19.isInChinaMainland;
        float r13 = (float) r1.XO0O10();
        r19.updateMap(r2, new Location(0, 0, null, 0, 0, (float) r1.IiI10X(), r13, 0, 0, 0, 927, null));
    }

    private static final void initView$lambda$1(BaseSportOnGoingActivity r8) {
        com.sma.smartv3.ui.sport.XO0O10 r0 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        int r1 = r8.getMArg1();
        int[] r2 = r8.goals;
        com.sma.smartv3.ui.sport.XO0O10.i100IXOX(r0, r1, false, r2[0], r2[1], r2[2], 2, null);
        r8.startSport();
    }

    private static final ImageView ivGpsSignal_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ImageView) r1.findViewById(R.id.ivGpsSignal);
    }

    private static final TextureMapView mBMapView_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (TextureMapView) r1.findViewById(R.id.bMapView);
    }

    private static final CustomGoogleMapView mGMapView_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (CustomGoogleMapView) r1.findViewById(R.id.gMapView);
    }

    private static final IiI10X mSportCallback_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return new IiI10X(r1);
    }

    private static final ViewGroup mapPanel_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.fl_map);
    }

    private static final ViewGroup rootView_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.root_view);
    }

    private static final RelativeLayout screenLockRl_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.screenLockRl);
    }

    private final void showBaiDuMap() {
        getMBMapView().setVisibility(0);
        TextureMapView r0 = getMBMapView();
        r0.showZoomControls(false);
        r0.showScaleControl(false);
        BaiduMap r1 = getMBMapView().getMap();
        r1.setCompassEnable(false);
        Intrinsics.O10IXXX0X(r1, "apply(...)");
        this.mBaiDuMap = r1;
        this.isBaiduMapReady = true;
        if (this.mBaiduPoints.isEmpty() == true) goto L5;
        updateBaiduMap();
    L5:
        BaiduMap r2 = this.mBaiDuMap;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mBaiDuMap");
        r2 = null;
    L8:
        r2.setOnMapTouchListener(new I1Xi1(this));
    }

    private static final void showBaiDuMap$lambda$2(BaseSportOnGoingActivity r1, MotionEvent r2) {
        if (r2.getAction() != 1) goto L8;
        CustomNestedScollView r3 = r1.getSportProcess();
        if (r3 == null) goto L12;
        r3.requestDisallowInterceptTouchEvent(false);
        return;
    L12:
        return;
    L8:
        CustomNestedScollView r4 = r1.getSportProcess();
        if (r4 == null) goto L13;
        r4.requestDisallowInterceptTouchEvent(true);
        return;
    }

    private final void showGoogleMap() {
        CustomGoogleMapView r0 = getMGMapView();
        r0.setVisibility(0);
        r0.onCreate(null);
        r0.getMapAsync(new XOO0ii0(r0, this));
        r0.setOnMapTouchListener(new I0IIOi(this));
    }

    private static final void showLongPressTip$lambda$0(BaseSportOnGoingActivity r0) {
        PopupWindow r1 = r0.mLongPressPopup;
        if (r1 == null) goto L6;
        r1.dismiss();
        return;
    }

    private final void showMapContent(boolean r2) {
        this.isShowMap = true;
        if (r2 == false) goto L6;
        showBaiDuMap();
        return;
    L6:
        showGoogleMap();
    }

    private static final SlideLockView slideLockView_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (SlideLockView) r1.findViewById(R.id.slideLockView);
    }

    private static final ViewGroup sportDataLL_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.sportDataLl);
    }

    private static final SportEndProgress sportEndProgress_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (SportEndProgress) r1.findViewById(R.id.sportEndProgress);
    }

    private static final PFMedium sportFourShowValueDesc_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportFourShowValueDesc);
    }

    private static final DINCondBold sportFourShowValue_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportFourShowValue);
    }

    private static final View sportLeftLayout_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return r1.findViewById(R.id.sport_on_going_left_layout);
    }

    private static final PFMedium sportModelName_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportModelName);
    }

    private static final ViewGroup sportOnGoingFl_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.sportOnGoingFl);
    }

    private static final PFMedium sportOneShowValueDesc_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportOneShowValueDesc);
    }

    private static final DINCondBold sportOneShowValue_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportOneShowValue);
    }

    private static final ViewGroup sportPausePanel_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.sportPausePanel);
    }

    private static final ImageButton sportPause_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ImageButton) r1.findViewById(R.id.sportPause);
    }

    private static final CustomNestedScollView sportProcess_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (CustomNestedScollView) r1.findViewById(R.id.sportProcess);
    }

    private static final LinearLayout sportRightLayout_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.sport_on_going_right_layout);
    }

    private static final ViewGroup sportRunPanel_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.sportRunPanel);
    }

    private static final ImageButton sportSet_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ImageButton) r1.findViewById(R.id.sportSet);
    }

    private static final PFMedium sportThreeShowValueDesc_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportThreeShowValueDesc);
    }

    private static final DINCondBold sportThreeShowValue_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportThreeShowValue);
    }

    private static final PFMedium sportTwoShowValueDesc_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportTwoShowValueDesc);
    }

    private static final DINCondBold sportTwoShowValue_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportTwoShowValue);
    }

    private static final ViewGroup statuesPanel_delegate$lambda$0(BaseSportOnGoingActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.status_panel);
    }

    private static final boolean stopSport$lambda$0$0(BaseSportOnGoingActivity r4) {
        com.sma.smartv3.ui.sport.XO0O10 r0 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        com.sma.smartv3.ui.sport.XO0O10.Oi(r0, false, 1, null);
        r4.handleSportState(r0.O001I());
        return true;
    }

    private static final boolean stopSport$lambda$0$1(BaseSportOnGoingActivity r4) {
        com.sma.smartv3.ui.sport.XO0O10 r0 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        com.sma.smartv3.ui.sport.XO0O10.X01IiOiIi(r0, false, 1, null);
        r0.XOO0XOOii(r4.getMSportCallback());
        r0.I1();
        r4.finish();
        return true;
    }

    private final void updateBaiduMap() {
        if (this.isBaiduMapReady == true) goto L7;
        i1O0OXO1O.OXO1.OXO1("updateBaiduMap: BaiduMap not ready yet");
        return;
    L7:
        if (com.sma.smartv3.ui.sport.XO0O10.OXO1.X11iII1O1().isEmpty() == false) goto L10;
        return;
    L10:
        if (this.mBaiDuMap != null) goto L12;
        Intrinsics.XXO("mBaiDuMap");
    L12:
        LatLng r0 = (LatLng) CollectionsKt___CollectionsKt.Xi1XO00(this.mBaiduPoints);
        BaiduMap r2 = this.mBaiDuMap;
        BaiduMap r3 = null;
        if (r2 != null) goto L15;
        Intrinsics.XXO("mBaiDuMap");
        r2 = null;
    L15:
        r2.setMapStatus(MapStatusUpdateFactory.newLatLng(r0));
        Overlay r4 = this.mBaiduLineEnd;
        if (r4 == null) goto L18;
        r4.remove();
    L18:
        this.mBaiduLineEnd = createBaiduIcon(R.drawable.icon_sport_map_end, r0, true);
        BaiduMap r1 = this.mBaiDuMap;
        if (r1 != null) goto L21;
        Intrinsics.XXO("mBaiDuMap");
        r1 = null;
    L21:
        r1.setMapStatus(MapStatusUpdateFactory.zoomTo(19.0f));
        if (this.mBaiduPoints.size() <= 1) goto L35;
        Overlay r5 = this.mBaiduLine;
        if (r5 == null) goto L26;
        r5.remove();
    L26:
        PolylineOptions r6 = new PolylineOptions().width(14).color(ContextCompat.getColor(getMContext(), R.color.colorAccent)).points(this.mBaiduPoints);
        Intrinsics.O10IXXX0X(r6, "points(...)");
        BaiduMap r7 = this.mBaiDuMap;
        if (r7 != null) goto L29;
        Intrinsics.XXO("mBaiDuMap");
    L30:
        this.mBaiduLine = r3.addOverlay(r6);
        Overlay r8 = this.mBaiduLineStart;
        if (r8 == null) goto L33;
        r8.remove();
    L33:
        this.mBaiduLineStart = createBaiduIcon$default(this, R.drawable.icon_sport_map_start, (LatLng) CollectionsKt___CollectionsKt.IIII0iI(this.mBaiduPoints), false, 4, null);
        goto L35
    L29:
        r3 = r7;
    L35:
        getMBMapView().setLogoPosition(LogoPosition.logoPostionRightTop);
    }

    private final void updateGoogleMap() {
        if (this.isGoogleMapReady == true) goto L6;
        i1O0OXO1O.OXO1.OXO1("updateGoogleMap: GoogleMap not ready yet");
        return;
    L6:
        GoogleMap r0 = this.mGoogleMap;
        if (r0 != null) goto L10;
        Intrinsics.XXO("mGoogleMap");
        r0 = null;
    L10:
        if (com.sma.smartv3.ui.sport.XO0O10.OXO1.X11iII1O1().isEmpty() == true) goto L26;
        com.google.android.gms.maps.model.LatLng r1 = (com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.Xi1XO00(this.mGooglePoints);
        r0.moveCamera(CameraUpdateFactory.newLatLngZoom(r1, 18.0f));
        Marker r2 = this.mGoogleLineEnd;
        if (r2 == null) goto L15;
        r2.remove();
    L15:
        this.mGoogleLineEnd = r0.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(r1).anchor(0.5f, 0.5f).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.icon_sport_map_end)));
        if (this.mGooglePoints.size() <= 1) goto L25;
        Polyline r3 = this.mGoogleLine;
        if (r3 == null) goto L20;
        r3.remove();
    L20:
        com.google.android.gms.maps.model.PolylineOptions r4 = new com.google.android.gms.maps.model.PolylineOptions();
        r4.addAll(this.mGooglePoints);
        r4.width(14.0f);
        r4.color(ContextCompat.getColor(getMContext(), R.color.map_track_color));
        Unit r5 = Unit.OXO1;
        this.mGoogleLine = r0.addPolyline(r4);
        Marker r6 = this.mGoogleLineStart;
        if (r6 == null) goto L23;
        r6.remove();
    L23:
        this.mGoogleLineStart = r0.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.IIII0iI(this.mGooglePoints)).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.icon_sport_map_start)));
        return;
    L25:
        return;
    }

    private final void updateMap(boolean r6, Location r7) {
        if (com.sma.smartv3.ui.sport.XO0O10.OXO1.X11iII1O1().size() != 1) goto L5;
        this.mBaiduPoints.clear();
        this.mGooglePoints.clear();
    L5:
        if (r6 == false) goto L9;
        this.mBaiduPoints.add(new LatLng(r7.getMLatitude(), r7.getMLongitude()));
        updateBaiduMap();
        return;
    L9:
        if (isInChina(r7.getMLatitude(), r7.getMLongitude()) == false) goto L11;
        Pair<Double, Double> r8 = i01I1i1X.OXO1.OIi0(r7.getMLatitude(), r7.getMLongitude());
        this.mGooglePoints.add(new com.google.android.gms.maps.model.LatLng(r8.getFirst().doubleValue(), r8.getSecond().doubleValue()));
    L17:
        updateGoogleMap();     // Catch: Exception -> L14
        return;
    L14:
        e = move-exception;
        e.printStackTrace();
        return;
    L11:
        this.mGooglePoints.add(new com.google.android.gms.maps.model.LatLng(r7.getMLatitude(), r7.getMLongitude()));
        goto L17
    }

    public static /* synthetic */ void updateShowData$default(BaseSportOnGoingActivity r20, SportData r21, int r22, Object r23) {
        if (r23 != null) goto L11;
        if ((r22 & 1) == 0) goto L7;
        SportData r1 = new SportData(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
    L8:
        r20.updateShowData(r1);
        return;
    L7:
        r1 = r21;
        goto L8
    L11:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateShowData");
    }

    public void changeDeviceConnectStatus(boolean r1) {
    }

    public final void checkSportModeView() {
        if (a15.O00(getMArg1()) == true) goto L6;
        com.sma.smartv3.ui.sport.XO0O10.OXO1.X0i1O().setMMode(getMArg1());
        setSportDataOrder(j65.OXO1(getSportDataOrder()));
        hideViewFeature(true);
        return;
    L6:
        hideViewFeature(false);
    }

    public void completeSport() {
    }

    public final void dataFourClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 4);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, SportShowDataSelectActivity.class);
        r0.putExtras(r5);
        startActivityForResult(r0, iIXXO1.OXO1);
    }

    public final void dataOneClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, SportShowDataSelectActivity.class);
        r0.putExtras(r5);
        startActivityForResult(r0, iIXXO1.OXO1);
    }

    public final void dataThreeClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 3);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, SportShowDataSelectActivity.class);
        r0.putExtras(r5);
        startActivityForResult(r0, iIXXO1.OXO1);
    }

    public final void dataTwoClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 2);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, SportShowDataSelectActivity.class);
        r0.putExtras(r5);
        startActivityForResult(r0, iIXXO1.OXO1);
    }

    public void disableBottomSheet() {
        getSportProcess().setNestedScrollingEnabled(false);
        getSportProcess().disableNestedInterceptTouchEvent(true);
    }

    public void enableBottomSheet() {
        if (q62.OXO1.XIXO0iiO(getMArg1()) == false) goto L6;
        getSportProcess().setNestedScrollingEnabled(true);
        getSportProcess().disableNestedInterceptTouchEvent(false);
        return;
    L6:
        disableBottomSheet();
    }

    @aa1
    public final AnchorBottomSheetBehavior<CustomNestedScollView> getBehavior() {
        AnchorBottomSheetBehavior<CustomNestedScollView> r0 = this.behavior;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("behavior");
        return null;
    }

    public final CardView getCardPanel() {
        return (CardView) getValue();
    }

    public final RelativeLayout getCardPanelSub() {
        return (RelativeLayout) getValue();
    }

    public final LinearLayout getCountdownRl() {
        return (LinearLayout) getValue();
    }

    public final DINCondBold getCountdownTv() {
        return (DINCondBold) getValue();
    }

    @aa1
    public final int[] getGoals() {
        return this.goals;
    }

    public final ViewGroup getHandleView() {
        return (ViewGroup) getValue();
    }

    public final ImageView getIvGpsSignal() {
        return (ImageView) getValue();
    }

    @tb1
    public final PopupWindow getMLongPressPopup() {
        return this.mLongPressPopup;
    }

    @aa1
    public final com.sma.smartv3.ui.sport.XO0O10.OXO1 getMSportCallback() {
        return (com.sma.smartv3.ui.sport.XO0O10.OXO1) getValue();
    }

    @tb1
    public final go0 getMSportShortPopup() {
        return this.mSportShortPopup;
    }

    public final ViewGroup getMapPanel() {
        return (ViewGroup) getValue();
    }

    public final ViewGroup getRootView() {
        return (ViewGroup) getValue();
    }

    public final RelativeLayout getScreenLockRl() {
        return (RelativeLayout) getValue();
    }

    public final SlideLockView getSlideLockView() {
        return (SlideLockView) getValue();
    }

    public final ViewGroup getSportDataLL() {
        return (ViewGroup) getValue();
    }

    @aa1
    public final js4 getSportDataOrder() {
        js4 r0 = this.sportDataOrder;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportDataOrder");
        return null;
    }

    public final SportEndProgress getSportEndProgress() {
        return (SportEndProgress) getValue();
    }

    public final DINCondBold getSportFourShowValue() {
        return (DINCondBold) getValue();
    }

    public final PFMedium getSportFourShowValueDesc() {
        return (PFMedium) getValue();
    }

    public final View getSportLeftLayout() {
        return (View) getValue();
    }

    public final PFMedium getSportModelName() {
        return (PFMedium) getValue();
    }

    public final ViewGroup getSportOnGoingFl() {
        return (ViewGroup) getValue();
    }

    public final DINCondBold getSportOneShowValue() {
        return (DINCondBold) getValue();
    }

    public final PFMedium getSportOneShowValueDesc() {
        return (PFMedium) getValue();
    }

    public final ImageButton getSportPause() {
        return (ImageButton) getValue();
    }

    public final ViewGroup getSportPausePanel() {
        return (ViewGroup) getValue();
    }

    public final CustomNestedScollView getSportProcess() {
        return (CustomNestedScollView) getValue();
    }

    public final LinearLayout getSportRightLayout() {
        return (LinearLayout) getValue();
    }

    public final ViewGroup getSportRunPanel() {
        return (ViewGroup) getValue();
    }

    public final ImageButton getSportSet() {
        return (ImageButton) getValue();
    }

    public final DINCondBold getSportThreeShowValue() {
        return (DINCondBold) getValue();
    }

    public final PFMedium getSportThreeShowValueDesc() {
        return (PFMedium) getValue();
    }

    public final DINCondBold getSportTwoShowValue() {
        return (DINCondBold) getValue();
    }

    public final PFMedium getSportTwoShowValueDesc() {
        return (PFMedium) getValue();
    }

    public final ViewGroup getStatuesPanel() {
        return (ViewGroup) getValue();
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    public void handleSportState(int r4) {
        i1O0OXO1O.OXO1.OXO1("handleSportState -> " + r4);
        if (r4 != 1) goto L5;
    L14:
        getSportPause().setVisibility(0);
        getSportPausePanel().setVisibility(4);
        enableBottomSheet();
        PopupWindow r5 = this.mLongPressPopup;
        if (r5 == null) goto L18;
        r5.dismiss();
        return;
    L18:
        return;
    L5:
        if (r4 == 2) goto L14;
        if (r4 == 3) goto L12;
        if (r4 != 4) goto L19;
        stopSport(false);
        return;
    L19:
        return;
    L12:
        getSportPause().setVisibility(4);
        getSportPausePanel().setVisibility(0);
        disableBottomSheet();
    }

    public void hideViewFeature(boolean r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1("initView -> mArg3: " + getMArg3());
        com.sma.smartv3.ui.sport.XO0O10 r1 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        int r3 = 1;
        r1.X111IO((getMArg3() instanceof BleDeviceSportData) ^ true);
        if ((getMArg3() instanceof int[]) == false) goto L5;
        Serializable r2 = getMArg3();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type kotlin.IntArray");
        this.goals = (int[]) r2;
    L5:
        String r4 = Arrays.toString(this.goals);
        Intrinsics.O10IXXX0X(r4, "toString(...)");
        r0.OXO1("initView -> goals: " + r4 + ", isStartFromApp: " + r1.X00XIX1());
        a01 r5 = a01.OXO1;
        SPUtils r6 = r5.IiI10X();
        String r7 = String.valueOf(getMArg1());
        Object r8 = new js4(null, r3, 0 == true ? 1 : 0);
        Object r9 = new Gson().fromJson(r6.getString(r7 + '_' + js4.class.getName()), js4.class);
        if (r9 == null) goto L9;
        r8 = r9;
    L9:
        setSportDataOrder((js4) r8);
        checkSportModeView();
        getRootView().setKeepScreenOn(r5.IiI10X().getBoolean(b01.Ii0i));
        getSportEndProgress().IiI10X(new XIi00iiXO(this));
        getSportEndProgress().iO(new iO(this));
        getSlideLockView().I1XOi1(new XO0O10(this));
        AnchorBottomSheetBehavior<CustomNestedScollView> r10 = AnchorBottomSheetBehavior.from(getSportProcess());
        Intrinsics.O10IXXX0X(r10, "from(...)");
        setBehavior(r10);
        getBehavior().setHideable(false);
        getBehavior().addBottomSheetCallback(new O00(this));
        PFMedium r11 = getSportModelName();
        q62 r12 = q62.OXO1;
        r11.setText(r12.i01OOiI(getMArg1()));
        if (r12.XIXO0iiO(getMArg1()) == false) goto L12;
        getBehavior().setState(3);
        showMapContent(this.isInChinaMainland);
        new Handler(Looper.getMainLooper()).postDelayed(new iOiXi1i1O(this), 300);
    L13:
        III011.OIi0(this).XXI();
        if (r1.X00XIX1() == false) goto L16;
        startCountDown();
    L17:
        updateShowData$default(this, null, 1, null);
        return;
    L16:
        new Handler().postDelayed(new OIOOi11I1(this), 500);
        goto L17
    L12:
        getHandleView().setVisibility(4);
        getStatuesPanel().setVisibility(0);
        setSportOneShowValue(100.0f);
        getBehavior().setState(4);
        getCardPanel().setRadius(SizeUtils.dp2px(0.0f));
        disableBottomSheet();
        goto L13
    }

    public final boolean isInChina(double r2, double r4) {
        return i01I1i1X.OXO1.XO0O10(r2, r4);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_on_going;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r4, int r5, @tb1 Intent r6) {
        super.onActivityResult(r4, r5, r6);
        LogUtils.d(new Object[]{Integer.valueOf(r4)});
        if (8564 != r4) goto L12;
        SPUtils r7 = a01.OXO1.IiI10X();
        String r8 = String.valueOf(getMArg1());
        Object r9 = new js4(null, 1, 0 == true ? 1 : 0);
        Object r10 = new Gson().fromJson(r7.getString(r8 + '_' + js4.class.getName()), js4.class);
        if (r10 == null) goto L8;
        r9 = r10;
    L8:
        js4 r11 = (js4) r9;
        if (Intrinsics.XOO0ii0(getSportDataOrder(), r11) == true) goto L13;
        setSportDataOrder(r11);
        checkSportModeView();
        updateShowData(com.sma.smartv3.ui.sport.XO0O10.OXO1.X0i1O());
        return;
    L13:
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r3) {
        super.onCreate(r3);
        com.sma.smartv3.ui.sport.XO0O10 r4 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        Application r0 = getApplication();
        Intrinsics.O10IXXX0X(r0, "getApplication(...)");
        r4.XX1Oi(r0);
        r4.XiOIii1(getMSportCallback());
        r4.X00O0(true);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.sma.smartv3.ui.sport.XO0O10.OXO1.X00O0(false);
        if (this.isShowMap == true) goto L5;
        return;
    L5:
        if (this.isInChinaMainland == false) goto L8;
        getMBMapView().onDestroy();
        return;
    L8:
        getMGMapView().onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getScreenLockRl().getVisibility() == 0) goto L12;
        com.sma.smartv3.ui.sport.XO0O10 r0 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        if (r0.iOiXi11II() == false) goto L9;
        com.sma.smartv3.ui.sport.XO0O10.XOXiX0(r0, false, 1, null);
        handleSportState(r0.O001I());
        return;
    L9:
        if (r0.O001I() != 3) goto L13;
        showLongPressTip();
        return;
    L13:
        return;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.isShowMap == true) goto L5;
        return;
    L5:
        if (this.isInChinaMainland == false) goto L8;
        getMBMapView().onPause();
        return;
    L8:
        getMGMapView().onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isShowMap == true) goto L5;
        return;
    L5:
        if (this.isInChinaMainland == false) goto L8;
        getMBMapView().onResume();
        return;
    L8:
        getMGMapView().onResume();
    }

    @sf5(tag = b01.Ii0i)
    public final void onScreenOnChanged(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        LogUtils.v(new Object[]{"onScreenOnChanged"});
        getRootView().setKeepScreenOn(a01.OXO1.IiI10X().getBoolean(b01.Ii0i));
    }

    public final void setBehavior(@aa1 AnchorBottomSheetBehavior<CustomNestedScollView> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.behavior = r2;
    }

    public final void setGoals(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.goals = r2;
    }

    public final void setMLongPressPopup(@tb1 PopupWindow r1) {
        this.mLongPressPopup = r1;
    }

    public final void setMSportShortPopup(@tb1 go0 r1) {
        this.mSportShortPopup = r1;
    }

    public final void setSportDataOrder(@aa1 js4 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportDataOrder = r2;
    }

    public void setSportOneShowValue(float r3) {
        getSportOneShowValue().setTextSize(1, r3);
    }

    public void showGoalDoneDialog(int r5) {
        View r0 = LayoutInflater.from(this).inflate(R.layout.layout_goal_done_dg, null);
        ImageView r1 = (ImageView) r0.findViewById(R.id.iv_goal_done);
        com.sma.smartv3.ui.sport.XO0O10 r2 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        if (r5 != r2.IXXOO()) goto L6;
        int r6 = R.drawable.time_done_img;
    L9:
        r1.setImageResource(r6);
        Dialog r7 = new Dialog(this, R.style.AppDialogTheme);
        r7.setContentView(r0);
        r7.show();
        return;
    L6:
        if (r5 != r2.i010I()) goto L8;
        r6 = R.drawable.calories_done_img;
        goto L9
    L8:
        r6 = R.drawable.distance_done_img;
        goto L9
    }

    public void showGoalProgress(@aa1 SportDataType r2, @aa1 SportData r3) {
        Intrinsics.X0O(r2, "key");
        Intrinsics.X0O(r3, "sportData");
    }

    public void showLongPressTip() {
        PopupWindow r0 = this.mLongPressPopup;
        if (r0 != null) goto L5;
    L7:
        View r1 = LayoutInflater.from(this).inflate(R.layout.layout_bubble, null);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.view.bubbleview.BubbleLayout");
        BubbleLayout r2 = (BubbleLayout) r1;
        r2.measure(0, 0);
        ((TextView) r2.findViewById(R.id.tv)).setText(R.string.long_press_end);
        r2.requestLayout();
        this.mLongPressPopup = XXiOOOX.OXO1(getMContext(), r2);
        r2.O00(ArrowDirection.BOTTOM);
        PopupWindow r3 = this.mLongPressPopup;
        if (r3 == null) goto L10;
        r3.setOutsideTouchable(false);
    L10:
        int r4 = (getSportEndProgress().getMeasuredWidth() - r2.getMeasuredWidth()) / 2;
        int r5 = -((getSportEndProgress().getMeasuredHeight() + r2.getMeasuredHeight()) + SizeUtils.dp2px(4.0f));
        r2.XOO0ii0((r2.getMeasuredWidth() - r2.getArrowWidth()) / 2.0f);
        PopupWindow r6 = this.mLongPressPopup;
        if (r6 == null) goto L13;
        r6.showAsDropDown(getSportEndProgress(), r4, r5);
    L13:
        new Handler().postDelayed(new iXXO0i(this), 3000);
        return;
    L5:
        if (r0.isShowing() != true) goto L7;
    }

    @aa1
    public final Pair<String, String> showOneContent(@aa1 SportDataType r6, @aa1 SportData r7) {
        Intrinsics.X0O(r6, "key");
        Intrinsics.X0O(r7, "sportData");
        showGoalProgress(r6, r7);
        switch(OXO1.OXO1[r6.ordinal()]) {
            case 1: goto L33;
            case 2: goto L20;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L20:
        String r8 = String.valueOf(cp5.X1ii(r7.getMDistance(), this.userProfile.getUnit(), false, 4, null));
        if (this.userProfile.getUnit() != 0) goto L27;
        if (i72.OXO1.OXOO0X0i() == false) goto L25;
        String r0 = getString(R.string.distance) + I000IiI1O.iO.XIi00iiXO + getString(R.string.weather_km) + I000IiI1O.iO.iO;
    L31:
        return new Pair(r8, r0);
    L25:
        r0 = getString(R.string.distance) + I000IiI1O.iO.XIi00iiXO + getString(R.string.km) + I000IiI1O.iO.iO;
        goto L31
    L27:
        if (i72.OXO1.OXOO0X0i() == false) goto L29;
        r0 = getString(R.string.distance) + I000IiI1O.iO.XIi00iiXO + getString(R.string.weather_mi) + I000IiI1O.iO.iO;
        goto L31
    L29:
        r0 = getString(R.string.distance) + I000IiI1O.iO.XIi00iiXO + getString(R.string.mi) + I000IiI1O.iO.iO;
        goto L31
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        return new Pair(String.valueOf(r7.getMSpeed()), getString(R.string.speed));
    L9:
        return new Pair(UtilsKt.XOXiX0(String.valueOf(com.sma.smartv3.ui.sport.XO0O10.OXO1.iI())), getString(R.string.heart_rate));
    L11:
        return new Pair(String.valueOf(r7.getMAltitude()), getString(R.string.altitude));
    L13:
        return new Pair(String.valueOf(r7.getMSpm()), getString(R.string.spm));
    L15:
        return new Pair(String.valueOf(r7.getMStep()), getString(R.string.steps));
    L17:
        return new Pair(String.valueOf(r7.getMCalorie()), getString(R.string.calories));
    L19:
        return new Pair(cp5.Ii1iii0(r7.getMPace(), this.userProfile.getUnit()), getString(R.string.pace));
    L33:
        return new Pair(O0X11OiO.iXiX011(r7.getMDuration() * 1000), getString(R.string.time));
    }

    public final void sportEndClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public void sportLock() {
        disableBottomSheet();
        getSlideLockView().XiOIii1();
        getSportRunPanel().setVisibility(4);
        getScreenLockRl().setVisibility(0);
        PopupWindow r0 = this.mLongPressPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    public final void sportLockClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        sportLock();
    }

    public void sportPause() {
        com.sma.smartv3.ui.sport.XO0O10 r0 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        com.sma.smartv3.ui.sport.XO0O10.XOXiX0(r0, false, 1, null);
        handleSportState(r0.O001I());
    }

    public final void sportPauseClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        sportPause();
    }

    public void sportResume() {
        com.sma.smartv3.ui.sport.XO0O10 r0 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        com.sma.smartv3.ui.sport.XO0O10.Oi(r0, false, 1, null);
        handleSportState(r0.O001I());
    }

    public final void sportResumeClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        sportResume();
    }

    public final void sportSetClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, SportSettingActivity.class));
    }

    public void sportStartVoice(long r1) {
    }

    public void startCountDown() {
        getCountdownRl().setVisibility(0);
        getSportProcess().setVisibility(4);
        new OIi0(this).start();
    }

    public void startSport() {
        getCountdownRl().setVisibility(8);
        getScreenLockRl().setVisibility(4);
        getSportProcess().setVisibility(0);
        handleSportState(com.sma.smartv3.ui.sport.XO0O10.OXO1.O001I());
        if (q62.OXO1.XIXO0iiO(getMArg1()) == false) goto L6;
        this.cardPanelSubMinHeight = (getHandleView().getHeight() + getSportDataLL().getHeight()) + getSportOnGoingFl().getHeight();
        getBehavior().setAnchorPoint(getRootView().getHeight() - this.cardPanelSubMinHeight);
        getBehavior().setPeekHeight(this.cardPanelSubMinHeight);
        RelativeLayout r0 = getCardPanelSub();
        Intrinsics.O10IXXX0X(r0, "<get-cardPanelSub>(...)");
        LibExKt.X111IO(r0, this.cardPanelSubMinHeight);
        ViewGroup.LayoutParams r1 = getMapPanel().getLayoutParams();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        int r2 = (getHandleView().getHeight() + getSportDataLL().getHeight()) - SizeUtils.dp2px(20.0f);
        ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) r1)).bottomMargin = r2;
        return;
    }

    public void stopSport(boolean r5) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1("结束运动 " + r5);
        PopupWindow r1 = this.mLongPressPopup;
        if (r1 == null) goto L5;
        r1.dismiss();
    L5:
        DefaultConstructorMarker r2 = null;
        int r3 = 0;
        if (r5 == true) goto L8;
    L16:
        com.sma.smartv3.ui.sport.XO0O10 r6 = com.sma.smartv3.ui.sport.XO0O10.OXO1;
        com.sma.smartv3.ui.sport.XO0O10.X01IiOiIi(r6, false, 1, null);
        if (com.sma.smartv3.ui.sport.XO0O10.OX(r6, false, 1, null) == false) goto L19;
        r6.IO0iXO0O();
        completeSport();
    L19:
        r6.XOO0XOOii(getMSportCallback());
        r6.I1();
        r0.OXO1("finish SportActivity");
        finish();
        return;
    L8:
        if (com.sma.smartv3.ui.sport.XO0O10.OX(com.sma.smartv3.ui.sport.XO0O10.OXO1, false, 1, null) == true) goto L16;
        if (this.mSportShortPopup != null) goto L12;
        go0 r7 = new go0(getMContext(), r3, 2, r2);
        r7.O1O(R.string.sport_very_short);
        r7.iX1O1(Integer.valueOf(R.string.keep_moving), new I0XXI(this));
        r7.X1IX(R.string.end_exercise, new iOX11(this));
        this.mSportShortPopup = r7;
    L12:
        go0 r8 = this.mSportShortPopup;
        if (r8 == null) goto L21;
        ViewGroup r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r8.I1XOi1(r4);
        return;
    }

    public void updateShowData(@aa1 SportData r6) {
        Intrinsics.X0O(r6, "sportData");
        Iterator<Map.Entry<SportDataType, Integer>> r0 = getSportDataOrder().XO0O10().entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L23;
        Map.Entry<SportDataType, Integer> r1 = r0.next();
        SportDataType r2 = r1.getKey();
        int r3 = r1.getValue().intValue();
        Pair<String, String> r4 = showOneContent(r2, r6);
        String r5 = r4.component1();
        String r7 = r4.component2();
        if (r3 != 1) goto L8;
        getSportOneShowValue().setText(r5);
        getSportOneShowValueDesc().setText(r7);
        goto L4
    L8:
        if (r3 != 2) goto L10;
        if (q62.OXO1.XO11O() == true) goto L21;
        View r8 = getSportLeftLayout();
        Intrinsics.O10IXXX0X(r8, "<get-sportLeftLayout>(...)");
        if (r8.getVisibility() != 0) goto L21;
        View r9 = getSportLeftLayout();
        Intrinsics.O10IXXX0X(r9, "<get-sportLeftLayout>(...)");
        r9.setVisibility(8);
        ViewGroup.LayoutParams r10 = getSportRightLayout().getLayoutParams();
        Intrinsics.X1ii(r10, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams r11 = (LinearLayout.LayoutParams) r10;
        r11.weight = 2.0f;
        getSportRightLayout().setLayoutParams(r11);
    L21:
        getSportTwoShowValue().setText(r5);
        getSportTwoShowValueDesc().setText(r7);
        goto L4
    L10:
        if (r3 != 3) goto L12;
        getSportThreeShowValue().setText(r5);
        getSportThreeShowValueDesc().setText(r7);
        goto L4
    L12:
        if (r3 != 4) goto L4;
        getSportFourShowValue().setText(r5);
        getSportFourShowValueDesc().setText(r7);
        goto L4
    }
}
