package com.sma.smartv3.ui.sport;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.az4;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.ny4;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.oy4;
import com.android.mltcode.paycertificationapi.py4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qy4;
import com.android.mltcode.paycertificationapi.ry4;
import com.android.mltcode.paycertificationapi.sy4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty4;
import com.android.mltcode.paycertificationapi.uy4;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vy4;
import com.android.mltcode.paycertificationapi.wy4;
import com.android.mltcode.paycertificationapi.xy4;
import com.android.mltcode.paycertificationapi.yy4;
import com.android.mltcode.paycertificationapi.zy4;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.view.ImageViewRound;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailV2MapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2MapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2MapFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,531:1\n185#2,7:532\n192#2,3:540\n154#2,7:543\n195#2:550\n99#2,7:551\n106#2,3:559\n79#2,7:562\n109#2:569\n99#2,7:571\n106#2,3:579\n79#2,7:582\n109#2:589\n99#2,7:590\n106#2,3:598\n79#2,7:601\n109#2:608\n1#3:539\n1#3:558\n1#3:570\n1#3:578\n1#3:597\n*S KotlinDebug\n*F\n+ 1 SportDetailV2MapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2MapFragment\n*L\n103#1:532,7\n103#1:540,3\n103#1:543,7\n103#1:550\n109#1:551,7\n109#1:559,3\n109#1:562,7\n109#1:569\n522#1:571,7\n522#1:579,3\n522#1:582,7\n522#1:589\n443#1:590,7\n443#1:598,3\n443#1:601,7\n443#1:608\n103#1:539\n109#1:558\n522#1:578\n443#1:597\n*E\n"})
public final class SportDetailV2MapFragment extends SportDetailMapFragment {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    public static final String TAG = "SportDetailV2MapFragment";

    @aa1
    private final Lazy ivAvatar$delegate;

    @aa1
    private final Lazy ivAvatarV2$delegate;

    @tb1
    private Bitmap mChartBitmap;
    private long mEndTime;
    private boolean mHaveMapBitmap;

    @aa1
    private final Lazy mRecyclerView$delegate;
    private long mStartTime;
    private int mWorkoutId;

    @aa1
    private final Lazy mapViewLayout$delegate;

    @aa1
    private final Lazy sportDetailProgressbarLayout$delegate;

    @aa1
    private final Lazy tvAvatarV1Layout$delegate;

    @aa1
    private final Lazy tvAvatarV2Layout$delegate;

    @aa1
    private final Lazy tvDetailname$delegate;

    @aa1
    private final Lazy tvFieldExplanation$delegate;

    @aa1
    private final Lazy tvNickNameV2$delegate;

    @aa1
    private final Lazy tvNickname$delegate;

    @aa1
    private final Lazy tvNoMapDetailname$delegate;

    @aa1
    private final Lazy tvNoMapTime$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO {

        @aa1
        public String OXO1;

        @aa1
        public String XIi00iiXO;

        @aa1
        public String iO;

        public XIi00iiXO() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public static /* synthetic */ XIi00iiXO O00(XIi00iiXO r0, String r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.OXO1;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.XIi00iiXO;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.iO;
        L12:
            return r0.XO0O10(r1, r2, r3);
        }

        @aa1
        public final String I0IIOi() {
            return this.iO;
        }

        public final void IO(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.OXO1 = r2;
        }

        @aa1
        public final String IiI10X() {
            return this.XIi00iiXO;
        }

        public final void OIX0iXi(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.iO = r2;
        }

        public final void OIi0(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.XIi00iiXO = r2;
        }

        @aa1
        public final String OXO1() {
            return this.OXO1;
        }

        @aa1
        public final String XIi00iiXO() {
            return this.XIi00iiXO;
        }

        @aa1
        public final XIi00iiXO XO0O10(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
            Intrinsics.X0O(r2, "mState");
            Intrinsics.X0O(r3, "mContent");
            Intrinsics.X0O(r4, "mUnit");
            return new XIi00iiXO(r2, r3, r4);
        }

        @aa1
        public final String XOO0ii0() {
            return this.OXO1;
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof XIi00iiXO) == true) goto L8;
            return false;
        L8:
            XIi00iiXO r6 = (XIi00iiXO) r5;
            if (Intrinsics.XOO0ii0(this.OXO1, r6.OXO1) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.XIi00iiXO, r6.XIi00iiXO) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.iO, r6.iO) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode()) * 31) + this.iO.hashCode();
        }

        @aa1
        public final String iO() {
            return this.iO;
        }

        @aa1
        public String toString() {
            return "Item(mState=" + this.OXO1 + ", mContent=" + this.XIi00iiXO + ", mUnit=" + this.iO + I000IiI1O.iO.iO;
        }

        public XIi00iiXO(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
            Intrinsics.X0O(r2, "mState");
            Intrinsics.X0O(r3, "mContent");
            Intrinsics.X0O(r4, "mUnit");
            this.OXO1 = r2;
            this.XIi00iiXO = r3;
            this.iO = r4;
        }

        public /* synthetic */ XIi00iiXO(String r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = "";
        L11:
            this(r2, r3, r4);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public SportDetailV2MapFragment() {
        this.ivAvatar$delegate = LazyKt__LazyJVMKt.iO(new sy4(this));
        this.tvNickname$delegate = LazyKt__LazyJVMKt.iO(new wy4(this));
        this.tvDetailname$delegate = LazyKt__LazyJVMKt.iO(new xy4(this));
        this.tvNoMapDetailname$delegate = LazyKt__LazyJVMKt.iO(new yy4(this));
        this.tvNoMapTime$delegate = LazyKt__LazyJVMKt.iO(new zy4(this));
        this.tvFieldExplanation$delegate = LazyKt__LazyJVMKt.iO(new az4(this));
        this.mapViewLayout$delegate = LazyKt__LazyJVMKt.iO(new oy4(this));
        this.sportDetailProgressbarLayout$delegate = LazyKt__LazyJVMKt.iO(new py4(this));
        this.tvAvatarV2Layout$delegate = LazyKt__LazyJVMKt.iO(new qy4(this));
        this.ivAvatarV2$delegate = LazyKt__LazyJVMKt.iO(new ry4(this));
        this.tvNickNameV2$delegate = LazyKt__LazyJVMKt.iO(new ty4(this));
        this.tvAvatarV1Layout$delegate = LazyKt__LazyJVMKt.iO(new uy4(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new vy4(this));
        this.mHaveMapBitmap = true;
        setMStartIcon(R.drawable.icon_sport_map_start_v2);
        setMCurrentIcon(R.drawable.icon_sport_map_end_v2);
        setEndMarkerAnchorCenter(false);
        setGradient(true);
        setMMapLineColor(R.color.sport_detail_bg_startColor);
    }

    public static /* synthetic */ void I1(SportDetailV2MapFragment r0, View r1) {
        initList$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageViewRound II1Xi0(SportDetailV2MapFragment r0) {
        return ivAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IXXOO(SportDetailV2MapFragment r0) {
        return tvNoMapDetailname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound O1O(SportDetailV2MapFragment r0) {
        return ivAvatarV2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OX(SportDetailV2MapFragment r0) {
        return sportDetailProgressbarLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FrameLayout X01IiOiIi(SportDetailV2MapFragment r0) {
        return mapViewLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X11iII1O1(SportDetailV2MapFragment r0) {
        return tvDetailname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXIIO1i11(SportDetailV2MapFragment r0) {
        return tvNickname_delegate$lambda$0(r0);
    }

    private final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        getIvAvatarV2().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 r0 = sz0.OXO1;
        if (uz0.OIi0(r0).exists() == false) goto L6;
        getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(r0)));
        getIvAvatarV2().setImageURI(Uri.fromFile(uz0.OIi0(r0)));
        return;
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) getValue();
    }

    private final ImageViewRound getIvAvatarV2() {
        return (ImageViewRound) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final View getSportDetailProgressbarLayout() {
        return (View) getValue();
    }

    private final View getTvAvatarV1Layout() {
        return (View) getValue();
    }

    private final View getTvAvatarV2Layout() {
        return (View) getValue();
    }

    private final TextView getTvDetailname() {
        return (TextView) getValue();
    }

    private final TextView getTvFieldExplanation() {
        return (TextView) getValue();
    }

    private final TextView getTvNickNameV2() {
        return (TextView) getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) getValue();
    }

    private final TextView getTvNoMapDetailname() {
        return (TextView) getValue();
    }

    private final TextView getTvNoMapTime() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView i010I(SportDetailV2MapFragment r0) {
        return tvNoMapTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iI(SportDetailV2MapFragment r0) {
        return tvNickNameV2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView iOO1ii1(SportDetailV2MapFragment r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOOX010X(SportDetailV2MapFragment r0) {
        return tvFieldExplanation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iX(SportDetailV2MapFragment r0) {
        return tvAvatarV1Layout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iX1O1(SportDetailV2MapFragment r0) {
        return tvAvatarV2Layout_delegate$lambda$0(r0);
    }

    private static final void initList$lambda$0(SportDetailV2MapFragment r3, View r4) {
        Bundle r5 = new Bundle();
        r5.putString("mArg0", "https://api.iot-solution.net/web/help/gomer_help.html?type=3");
        r5.putInt("mArg1", 2);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), WebViewActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
    }

    private static final ImageViewRound ivAvatarV2_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (ImageViewRound) r1.getMView().findViewById(R.id.iv_avatar2);
    }

    private static final ImageViewRound ivAvatar_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (ImageViewRound) r1.getMView().findViewById(R.id.iv_avatar);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.sport_detail_map_v2_recycler);
    }

    private static final FrameLayout mapViewLayout_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (FrameLayout) r1.getMView().findViewById(R.id.mapView_layout);
    }

    private final void showProgressbarView() {
    }

    private static final View sportDetailProgressbarLayout_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return r1.getMView().findViewById(R.id.sport_detail_progressbar_layout);
    }

    private static final View tvAvatarV1Layout_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return r1.getMView().findViewById(R.id.iv_avatar1_layout);
    }

    private static final View tvAvatarV2Layout_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return r1.getMView().findViewById(R.id.iv_avatar2_layout);
    }

    private static final TextView tvDetailname_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_detail_name);
    }

    private static final TextView tvFieldExplanation_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_view_field_explanation);
    }

    private static final TextView tvNickNameV2_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.edt_nickname2);
    }

    private static final TextView tvNickname_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.edt_nickname);
    }

    private static final TextView tvNoMapDetailname_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_detail_name_noMap);
    }

    private static final TextView tvNoMapTime_delegate$lambda$0(SportDetailV2MapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_dateTime_noMap);
    }

    @tb1
    public final Bitmap getMChartBitmap() {
        return this.mChartBitmap;
    }

    public final boolean getMHaveMapBitmap() {
        return this.mHaveMapBitmap;
    }

    public final int getMWorkoutId() {
        return this.mWorkoutId;
    }

    public final FrameLayout getMapViewLayout() {
        return (FrameLayout) getValue();
    }

    @aa1
    public final String getTitle() {
        return q62.OXO1.i01OOiI(getMWorkout().getMMode());
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<XIi00iiXO> initList() {
        ArrayList r1 = new ArrayList();
        if (getMWorkout().getMMode() != 116) goto L6;
        String r2 = getString(R.string.game_time);
    L5:
        String r4 = r2;
        Intrinsics.XXI(r4);
        r1.add(new XIi00iiXO(r4, O0X11OiO.iXiX011(getMWorkout().getMDuration() * 1000), null, 4, null));
        if (getMWorkout().getMRestDuration() > 0) goto L10;
    L12:
        hu4 r3 = hu4.OXO1;
        if (r3.OXO1(getMWorkout().getMMode()) == true) goto L16;
        String r5 = getString(R.string.quantity_of_heat);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        String r6 = String.valueOf(getMWorkout().getMCalorie() / 1000);
        String r7 = getString(R.string.kcal);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        r1.add(new XIi00iiXO(r5, r6, r7));
    L16:
        if (r3.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L19;
        boolean r8 = r3.XIi00iiXO(getMWorkout().getMMode());
    L27:
        String r9 = "-'--''";
        if (r8 == true) goto L30;
    L38:
        int r10 = getMWorkout().getMType();
        String r11 = getMWorkout().getMPlatform();
        int r12 = getMWorkout().getMMode();
        q62 r13 = q62.OXO1;
        LogUtils.i(new Object[]{"SportDetailV2MapFragment mType" + r10 + " mPlatform=" + r11 + "mMode=" + r12 + " " + r13.Oii1I1I10()});
        boolean r14 = r3.O00(getMWorkout().getMMode(), getMWorkout().getMPlatform());
        String r15 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        if (r14 == false) goto L50;
        if (getMWorkout().getMSpeed() != 0) goto L43;
        String r16 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L44:
        LogUtils.i(new Object[]{"SportDetailV2MapFragment speedToFloat" + r16 + " unit=" + getUserProfile().getUnit()});
        String r17 = getString(R.string.avg_speed);
        Intrinsics.O10IXXX0X(r17, "getString(...)");
        if (getUserProfile().getUnit() != 0) goto L47;
        int r18 = R.string.pace_km;
    L48:
        String r19 = getString(r18);
        Intrinsics.O10IXXX0X(r19, "getString(...)");
        r1.add(new XIi00iiXO(r17, r16, r19));
        goto L50
    L47:
        r18 = R.string.pace_mi;
        goto L48
    L43:
        r16 = String.valueOf(cp5.i11I(((double) getMWorkout().getMSpeed()) / 1000.0d, getUserProfile().getUnit()));
    L50:
        if (o65.OXO1.O00(getMWorkout()) == true) goto L55;
        if (r13.OiXI1OiX0() == true) goto L55;
        String r110 = getString(R.string.ave_hr);
        Intrinsics.O10IXXX0X(r110, "getString(...)");
        String r111 = String.valueOf(getMWorkout().getMAvgBpm());
        String r112 = getString(R.string.ave_hr_unit);
        Intrinsics.O10IXXX0X(r112, "getString(...)");
        r1.add(new XIi00iiXO(r110, r111, r112));
    L55:
        if (r3.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L63;
        if (r3.IiI10X(getMWorkout().getMMode()) == true) goto L59;
    L61:
        boolean r20 = false;
    L67:
        if (r20 == false) goto L70;
        String r113 = getString(R.string.stepnum);
        Intrinsics.O10IXXX0X(r113, "getString(...)");
        String r114 = String.valueOf(getMWorkout().getMStep());
        String r21 = getString(R.string.steps);
        Intrinsics.O10IXXX0X(r21, "getString(...)");
        r1.add(new XIi00iiXO(r113, r114, r21));
    L70:
        if (getMWorkout().getMAirPressure() == 0) goto L81;
        String r22 = getString(R.string.air_pressure);
        Intrinsics.O10IXXX0X(r22, "getString(...)");
        if (getUserProfile().getUnit() != 0) goto L74;
        int r115 = getMWorkout().getMAirPressure();
    L75:
        String r116 = String.valueOf(r115);
        if (getUserProfile().getUnit() != 0) goto L78;
        int r117 = R.string.kpa;
    L79:
        String r118 = getString(r117);
        Intrinsics.O10IXXX0X(r118, "getString(...)");
        r1.add(new XIi00iiXO(r22, r116, r118));
        goto L81
    L78:
        r117 = R.string.psi;
        goto L79
    L74:
        r115 = (int) cp5.X0i1O(getMWorkout().getMAirPressure());
    L81:
        if (r3.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L84;
        boolean r23 = r13.iX00X1X(getMWorkout().getMMode());
    L87:
        if (r23 == false) goto L94;
        String r24 = getString(R.string.avg_altitude);
        Intrinsics.O10IXXX0X(r24, "getString(...)");
        String r119 = cp5.iIXi1iiXI(getMWorkout().getMAltitude(), getUserProfile().getUnit());
        if (getUserProfile().getUnit() != 0) goto L91;
        int r120 = R.string.m;
    L92:
        String r121 = getString(r120);
        Intrinsics.O10IXXX0X(r121, "getString(...)");
        r1.add(new XIi00iiXO(r24, r119, r121));
        goto L94
    L91:
        r120 = R.string.yd;
    L94:
        if (getMWorkout().getMType() == 1) goto L96;
    L126:
        return r1;
    L96:
        if (r3.I0iXXO(getMWorkout().getMMode()) == false) goto L110;
        String r25 = getString(R.string.lactic_acid_wide_value_heart_rate);
        Intrinsics.O10IXXX0X(r25, "getString(...)");
        if (getMWorkout().getMLactateThresholdHr() == 0) goto L101;
        r15 = String.valueOf(getMWorkout().getMLactateThresholdHr());
    L101:
        String r26 = getString(R.string.ave_hr_unit);
        Intrinsics.O10IXXX0X(r26, "getString(...)");
        r1.add(new XIi00iiXO(r25, r15, r26));
        if (getMWorkout().getMLactateThresholdPace() == 0) goto L105;
        r9 = cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit());
    L105:
        String r27 = getString(R.string.lavaic_acid_lapsee_packet);
        Intrinsics.O10IXXX0X(r27, "getString(...)");
        if (getUserProfile().getUnit() != 0) goto L108;
        int r28 = R.string.pace_km;
    L109:
        String r29 = getString(r28);
        Intrinsics.O10IXXX0X(r29, "getString(...)");
        r1.add(new XIi00iiXO(r27, r9, r29));
        goto L110
    L108:
        r28 = R.string.pace_mi;
    L110:
        int r30 = getMWorkout().getMMode();
        if (r30 == 25) goto L118;
        if (r30 != 52) goto L114;
        String r31 = getString(R.string.total_strokes);
        Intrinsics.O10IXXX0X(r31, "getString(...)");
        String r32 = String.valueOf(getMWorkout().getMCnt());
        String r122 = getString(R.string.times_key);
        Intrinsics.O10IXXX0X(r122, "getString(...)");
        r1.add(new XIi00iiXO(r31, r32, r122));
    L120:
        if (getMWorkout().getMMode() != 52) goto L123;
        String r33 = getString(R.string.avg_stroke_rate);
        Intrinsics.O10IXXX0X(r33, "getString(...)");
        String r34 = String.valueOf(getMWorkout().getMCadence());
        String r35 = getString(R.string.times_key);
        Intrinsics.O10IXXX0X(r35, "getString(...)");
        r1.add(new XIi00iiXO(r33, r34, r35));
    L125:
        String r36 = getString(R.string.metabolic_volume);
        Intrinsics.O10IXXX0X(r36, "getString(...)");
        r1.add(new XIi00iiXO(r36, String.valueOf(getMWorkout().getMMetTotal()), "METs"));
        getTvFieldExplanation().setVisibility(0);
        getTvFieldExplanation().setOnClickListener(new ny4(this));
        goto L126
    L123:
        if (r3.OIX0iXi(getMWorkout().getMMode()) == false) goto L125;
        String r37 = getString(R.string.avg_spm);
        Intrinsics.O10IXXX0X(r37, "getString(...)");
        String r38 = String.valueOf(getMWorkout().getMSpm());
        String r39 = getString(R.string.steps);
        Intrinsics.O10IXXX0X(r39, "getString(...)");
        r1.add(new XIi00iiXO(r37, r38, r39));
        goto L125
    L114:
        if (r30 != 55) goto L120;
        String r40 = getString(R.string.total_dumbbell_reps);
        Intrinsics.O10IXXX0X(r40, "getString(...)");
        String r41 = String.valueOf(getMWorkout().getMCnt());
        String r123 = getString(R.string.times_key);
        Intrinsics.O10IXXX0X(r123, "getString(...)");
        r1.add(new XIi00iiXO(r40, r41, r123));
        goto L120
    L118:
        String r42 = getString(R.string.total_boxing_reps);
        Intrinsics.O10IXXX0X(r42, "getString(...)");
        String r43 = String.valueOf(getMWorkout().getMCnt());
        String r124 = getString(R.string.times_key);
        Intrinsics.O10IXXX0X(r124, "getString(...)");
        r1.add(new XIi00iiXO(r42, r43, r124));
        goto L120
    L84:
        if (getMWorkout().getMType() != 1) goto L86;
        r23 = r3.XXI(getMWorkout().getMMode());
        goto L87
    L86:
        r23 = r13.I1XXi1Oi(getMWorkout().getMMode(), !isLocationEmpty());
        goto L87
    L59:
        if (r3.XiOIO(getMWorkout().getMMode()) == false) goto L61;
        r20 = true;
        goto L67
    L63:
        if (getMWorkout().getMType() != 1) goto L65;
        r20 = r3.IIX1OXO(getMWorkout().getMMode());
        goto L67
    L65:
        r20 = r13.O1XXXX(getMWorkout().getMMode());
        goto L67
    L30:
        if (getMWorkout().getMPace() != 0) goto L32;
        String r44 = "-'--''";
    L33:
        String r125 = getString(R.string.avg_pace);
        Intrinsics.O10IXXX0X(r125, "getString(...)");
        if (getUserProfile().getUnit() != 0) goto L36;
        int r126 = R.string.pace_km;
    L37:
        String r127 = getString(r126);
        Intrinsics.O10IXXX0X(r127, "getString(...)");
        r1.add(new XIi00iiXO(r125, r44, r127));
        goto L38
    L36:
        r126 = R.string.pace_mi;
        goto L37
    L32:
        r44 = cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit());
        goto L33
    L19:
        if (getMWorkout().getMType() != 1) goto L21;
        r8 = r3.XIi00iiXO(getMWorkout().getMMode());
        goto L27
    L21:
        q62 r45 = q62.OXO1;
        if (q62.X0XI11I(r45, getMWorkout().getMMode(), false, 2, null) == true) goto L24;
    L26:
        r8 = false;
        goto L27
    L24:
        if (r45.iXOiXII(getMWorkout().getMMode()) == true) goto L26;
        r8 = true;
        goto L27
    L10:
        if (getMWorkout().getMRestDuration() >= getMWorkout().getMDuration()) goto L12;
        String r46 = getString(R.string.sport_detail_rest_time);
        Intrinsics.O10IXXX0X(r46, "getString(...)");
        r1.add(new XIi00iiXO(r46, O0X11OiO.iXiX011(getMWorkout().getMRestDuration() * 1000), null, 4, null));
        goto L12
    L6:
        r2 = getString(R.string.exercise_time);
        goto L5
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        LogUtils.i(new Object[]{"SportDetailV2MapFragment initView}"});
        getTvDateTime().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(getMWorkout().getMStart())));
        o65 r0 = o65.OXO1;
        this.mStartTime = r0.OIX0iXi(getMWorkout().getMStart());
        this.mEndTime = r0.OIX0iXi(getMWorkout().getMEnd()) + ((long) 60000);
        getTvDetailname().setText(getTitle());
        getTvNickname().setText(getUserProfile().getNickname());
        getTvNickNameV2().setText(getUserProfile().getNickname());
        avatarShow();
        hu4 r1 = hu4.OXO1;
        if (r1.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L6;
        boolean r2 = q62.OXO1.OXXO0O1X(getMWorkout().getMMode());
    L15:
        if (r2 == false) goto L17;
        getTvAvatarV1Layout().setVisibility(0);
        getTvAvatarV2Layout().setVisibility(8);
    L18:
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getActivity(), 2));
        final Context r3 = getContext();
        final List<XIi00iiXO> r4 = initList();
        getMRecyclerView().setAdapter(new SportDetailV2MapFragment$initView$mRecyclerAdapter$1(r3, r4));
        showProgressbarView();
        return;
    L17:
        getTvAvatarV1Layout().setVisibility(8);
        getTvAvatarV2Layout().setVisibility(0);
        goto L18
    L6:
        if (getMWorkout().getMType() != 1) goto L9;
        r2 = r1.O10IXXX0X(getMWorkout().getMMode());
        goto L15
    L9:
        if (q62.X0XI11I(q62.OXO1, getMWorkout().getMMode(), false, 2, null) == true) goto L11;
    L13:
        r2 = false;
        goto L15
    L11:
        if (getMWorkout().getMMode() == 40) goto L13;
        r2 = true;
        goto L15
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        if (isInChinaMainland() == true) goto L6;
        getMGoogleMap().moveCamera(CameraUpdateFactory.zoomOut());
        return;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_map_v2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int r2, int r3, @tb1 Intent r4) {
        super.onActivityResult(r2, r3, r4);
        if (r3 == (-1)) goto L5;
        return;
    L5:
        if (r2 != 3) goto L9;
        int r5 = getMArg1();
        Bundle r6 = new Bundle();
        r6.putString("mArg0", "3");
        r6.putInt("mArg1", r5);
        r6.putParcelable("mArg2", null);
        r6.putSerializable("mArg3", null);
        Intent r7 = new Intent(getActivity(), MapShareActivity.class);
        r7.putExtras(r6);
        startActivity(r7);
        return;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void playTrack() {
        int r0 = getMArg1();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putInt("mArg1", r0);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", null);
        FragmentActivity r2 = getActivity();
        Intrinsics.XXI(r2);
        Intent r3 = new Intent(r2, ShareVideoActivity.class);
        r3.putExtras(r1);
        startActivityForResult(r3, 3);
    }

    public final void setChartFragmentBitmap(@aa1 Bitmap r2, int r3) {
        Intrinsics.X0O(r2, "chartBitmap");
        this.mChartBitmap = r2;
        this.mWorkoutId = r3;
    }

    public final void setMChartBitmap(@tb1 Bitmap r1) {
        this.mChartBitmap = r1;
    }

    public final void setMHaveMapBitmap(boolean r1) {
        this.mHaveMapBitmap = r1;
    }

    public final void setMWorkoutId(int r1) {
        this.mWorkoutId = r1;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void share(@aa1 Bitmap r2) {
        Intrinsics.X0O(r2, "topBitmap");
        if (this.mHaveMapBitmap == false) goto L6;
        super.share(r2);
        return;
    L6:
        shareMapBitmap(r2, r2);
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void shareMapBitmap(@aa1 Bitmap r7, @aa1 Bitmap r8) {
        Intrinsics.X0O(r7, "topBitmap");
        Intrinsics.X0O(r8, "mapBitmap");
        if (this.mChartBitmap != null) goto L6;
        super.shareMapBitmap(r7, r8);
        return;
    L6:
        int r9 = getRootView().getWidth();
        int r0 = getRootView().getHeight();
        Bitmap r1 = this.mChartBitmap;
        Intrinsics.XXI(r1);
        Bitmap r10 = Bitmap.createBitmap(r9, r0 + r1.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r10, "createBitmap(...)");
        Canvas r2 = new Canvas(r10);
        if (this.mHaveMapBitmap == false) goto L9;
        getMView().findViewById(R.id.check_layout).setVisibility(8);
        r2.drawBitmap(r8, 0.0f, 0.0f, null);
    L9:
        XIi1i01O r11 = XIi1i01O.OXO1;
        RelativeLayout r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        Bitmap r12 = r11.XIi00iiXO(r3);
        r2.drawBitmap(r12, 0.0f, 0.0f, null);
        Bitmap r4 = this.mChartBitmap;
        Intrinsics.XXI(r4);
        r2.drawBitmap(r4, 0.0f, r12.getHeight(), null);
        ImageUtils.save(r10, uz0.XOX0O0(sz0.OXO1), Bitmap.CompressFormat.JPEG);
        String r13 = String.valueOf(OiOX0i.iO(isLocationEmpty()));
        int r14 = this.mWorkoutId;
        Bundle r5 = new Bundle();
        r5.putString("mArg0", r13);
        r5.putInt("mArg1", r14);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r15 = new Intent(getActivity(), MapShareActivity.class);
        r15.putExtras(r5);
        startActivity(r15);
        if (this.mHaveMapBitmap == false) goto L13;
        getMView().findViewById(R.id.check_layout).setVisibility(0);
        return;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void showMapLocation(@aa1 List<Location> r6) {
        Intrinsics.X0O(r6, "locationList");
        ViewGroup.LayoutParams r0 = getRootView().getLayoutParams();
        LogUtils.d(new Object[]{TAG, "showMapLocation: " + r6.size()});
        if (r6.isEmpty() == false) goto L5;
    L12:
        getMapViewLayout().setBackgroundResource(R.drawable.sport_detail_map_v2_tap_bg);
        getMView().findViewById(R.id.check_layout).setVisibility(8);
        getBtnTrackPlay().setVisibility(4);
        this.mHaveMapBitmap = false;
        if (getMWorkout().getMType() != 1) goto L15;
        int r7 = SizeUtils.dp2px(700.0f);
    L16:
        r0.height = r7;
        getTvNoMapDetailname().setVisibility(0);
        getTvDetailname().setVisibility(8);
        getTvNoMapDetailname().setText(getTitle());
        getTvNoMapTime().setVisibility(0);
        getTvDateTime().setVisibility(8);
        getTvNoMapTime().setText(getTvDateTime().getText());
        getSportDetailProgressbarLayout().setVisibility(8);
    L17:
        getRootView().setLayoutParams(r0);
        return;
    L15:
        r7 = SizeUtils.dp2px(600.0f);
        goto L16
    L5:
        if (r6.size() < 2) goto L12;
        super.showMapLocation(r6);
        this.mHaveMapBitmap = true;
        if (getMWorkout().getMType() != 1) goto L10;
        int r8 = SizeUtils.dp2px(970.0f);
    L11:
        r0.height = r8;
        getSportDetailProgressbarLayout().setVisibility(0);
        goto L17
    L10:
        r8 = SizeUtils.dp2px(870.0f);
        goto L11
    }
}
