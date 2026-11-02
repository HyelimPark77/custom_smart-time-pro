package com.sma.smartv3.p610ui.sport;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.p610ui.sport.SportDetailV2MapFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailV2MapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2MapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2MapFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,531:1\n185#2,7:532\n192#2,3:540\n154#2,7:543\n195#2:550\n99#2,7:551\n106#2,3:559\n79#2,7:562\n109#2:569\n99#2,7:571\n106#2,3:579\n79#2,7:582\n109#2:589\n99#2,7:590\n106#2,3:598\n79#2,7:601\n109#2:608\n1#3:539\n1#3:558\n1#3:570\n1#3:578\n1#3:597\n*S KotlinDebug\n*F\n+ 1 SportDetailV2MapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2MapFragment\n*L\n103#1:532,7\n103#1:540,3\n103#1:543,7\n103#1:550\n109#1:551,7\n109#1:559,3\n109#1:562,7\n109#1:569\n522#1:571,7\n522#1:579,3\n522#1:582,7\n522#1:589\n443#1:590,7\n443#1:598,3\n443#1:601,7\n443#1:608\n103#1:539\n109#1:558\n522#1:578\n443#1:597\n*E\n"})
public final class SportDetailV2MapFragment extends SportDetailMapFragment {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    public static final String TAG = "SportDetailV2MapFragment";

    @tb1
    private Bitmap mChartBitmap;
    private long mEndTime;
    private long mStartTime;
    private int mWorkoutId;

    @aa1
    private final Lazy ivAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.ivAvatar_delegate$lambda$0(this.f11157IO);
        }
    });

    @aa1
    private final Lazy tvNickname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.tvNickname_delegate$lambda$0(this.f12069IO);
        }
    });

    @aa1
    private final Lazy tvDetailname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.tvDetailname_delegate$lambda$0(this.f12268IO);
        }
    });

    @aa1
    private final Lazy tvNoMapDetailname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.tvNoMapDetailname_delegate$lambda$0(this.f12482IO);
        }
    });

    @aa1
    private final Lazy tvNoMapTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.tvNoMapTime_delegate$lambda$0(this.f12721IO);
        }
    });

    @aa1
    private final Lazy tvFieldExplanation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.az4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.tvFieldExplanation_delegate$lambda$0(this.f5617IO);
        }
    });

    @aa1
    private final Lazy mapViewLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.mapViewLayout_delegate$lambda$0(this.f10250IO);
        }
    });

    @aa1
    private final Lazy sportDetailProgressbarLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.py4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.sportDetailProgressbarLayout_delegate$lambda$0(this.f10463IO);
        }
    });

    @aa1
    private final Lazy tvAvatarV2Layout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.tvAvatarV2Layout_delegate$lambda$0(this.f10708IO);
        }
    });

    @aa1
    private final Lazy ivAvatarV2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ry4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.ivAvatarV2_delegate$lambda$0(this.f10928IO);
        }
    });

    @aa1
    private final Lazy tvNickNameV2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ty4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.tvNickNameV2_delegate$lambda$0(this.f11388IO);
        }
    });

    @aa1
    private final Lazy tvAvatarV1Layout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.tvAvatarV1Layout_delegate$lambda$0(this.f11601IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2MapFragment.mRecyclerView_delegate$lambda$0(this.f11841IO);
        }
    });
    private boolean mHaveMapBitmap = true;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
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

        /* JADX INFO: renamed from: iO */
        @aa1
        public String f54773iO;

        public XIi00iiXO() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ XIi00iiXO O00(XIi00iiXO xIi00iiXO, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xIi00iiXO.OXO1;
            }
            if ((i & 2) != 0) {
                str2 = xIi00iiXO.XIi00iiXO;
            }
            if ((i & 4) != 0) {
                str3 = xIi00iiXO.f54773iO;
            }
            return xIi00iiXO.XO0O10(str, str2, str3);
        }

        @aa1
        public final String I0IIOi() {
            return this.f54773iO;
        }

        /* JADX INFO: renamed from: IO */
        public final void m38636IO(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.OXO1 = str;
        }

        @aa1
        public final String IiI10X() {
            return this.XIi00iiXO;
        }

        public final void OIX0iXi(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f54773iO = str;
        }

        public final void OIi0(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.XIi00iiXO = str;
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
        public final XIi00iiXO XO0O10(@aa1 String mState, @aa1 String mContent, @aa1 String mUnit) {
            Intrinsics.X0O(mState, "mState");
            Intrinsics.X0O(mContent, "mContent");
            Intrinsics.X0O(mUnit, "mUnit");
            return new XIi00iiXO(mState, mContent, mUnit);
        }

        @aa1
        public final String XOO0ii0() {
            return this.OXO1;
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof XIi00iiXO)) {
                return false;
            }
            XIi00iiXO xIi00iiXO = (XIi00iiXO) obj;
            return Intrinsics.XOO0ii0(this.OXO1, xIi00iiXO.OXO1) && Intrinsics.XOO0ii0(this.XIi00iiXO, xIi00iiXO.XIi00iiXO) && Intrinsics.XOO0ii0(this.f54773iO, xIi00iiXO.f54773iO);
        }

        public int hashCode() {
            return (((this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode()) * 31) + this.f54773iO.hashCode();
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final String m38637iO() {
            return this.f54773iO;
        }

        @aa1
        public String toString() {
            return "Item(mState=" + this.OXO1 + ", mContent=" + this.XIi00iiXO + ", mUnit=" + this.f54773iO + I000IiI1O.C2156iO.f1007iO;
        }

        public XIi00iiXO(@aa1 String mState, @aa1 String mContent, @aa1 String mUnit) {
            Intrinsics.X0O(mState, "mState");
            Intrinsics.X0O(mContent, "mContent");
            Intrinsics.X0O(mUnit, "mUnit");
            this.OXO1 = mState;
            this.XIi00iiXO = mContent;
            this.f54773iO = mUnit;
        }

        public /* synthetic */ XIi00iiXO(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }

    public SportDetailV2MapFragment() {
        setMStartIcon(R.drawable.icon_sport_map_start_v2);
        setMCurrentIcon(R.drawable.icon_sport_map_end_v2);
        setEndMarkerAnchorCenter(false);
        setGradient(true);
        setMMapLineColor(R.color.sport_detail_bg_startColor);
    }

    private final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        getIvAvatarV2().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        if (uz0.OIi0(sz0Var).exists()) {
            getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
            getIvAvatarV2().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
        }
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) this.ivAvatar$delegate.getValue();
    }

    private final ImageViewRound getIvAvatarV2() {
        return (ImageViewRound) this.ivAvatarV2$delegate.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    private final View getSportDetailProgressbarLayout() {
        return (View) this.sportDetailProgressbarLayout$delegate.getValue();
    }

    private final View getTvAvatarV1Layout() {
        return (View) this.tvAvatarV1Layout$delegate.getValue();
    }

    private final View getTvAvatarV2Layout() {
        return (View) this.tvAvatarV2Layout$delegate.getValue();
    }

    private final TextView getTvDetailname() {
        return (TextView) this.tvDetailname$delegate.getValue();
    }

    private final TextView getTvFieldExplanation() {
        return (TextView) this.tvFieldExplanation$delegate.getValue();
    }

    private final TextView getTvNickNameV2() {
        return (TextView) this.tvNickNameV2$delegate.getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) this.tvNickname$delegate.getValue();
    }

    private final TextView getTvNoMapDetailname() {
        return (TextView) this.tvNoMapDetailname$delegate.getValue();
    }

    private final TextView getTvNoMapTime() {
        return (TextView) this.tvNoMapTime$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initList$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/web/help/gomer_help.html?type=3");
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(sportDetailV2MapFragment.getActivity(), (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        sportDetailV2MapFragment.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound ivAvatarV2_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (ImageViewRound) sportDetailV2MapFragment.getMView().findViewById(R.id.iv_avatar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound ivAvatar_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (ImageViewRound) sportDetailV2MapFragment.getMView().findViewById(R.id.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (RecyclerView) sportDetailV2MapFragment.getMView().findViewById(R.id.sport_detail_map_v2_recycler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout mapViewLayout_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (FrameLayout) sportDetailV2MapFragment.getMView().findViewById(R.id.mapView_layout);
    }

    private final void showProgressbarView() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View sportDetailProgressbarLayout_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return sportDetailV2MapFragment.getMView().findViewById(R.id.sport_detail_progressbar_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvAvatarV1Layout_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return sportDetailV2MapFragment.getMView().findViewById(R.id.iv_avatar1_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvAvatarV2Layout_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return sportDetailV2MapFragment.getMView().findViewById(R.id.iv_avatar2_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDetailname_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (TextView) sportDetailV2MapFragment.getMView().findViewById(R.id.tv_detail_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvFieldExplanation_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (TextView) sportDetailV2MapFragment.getMView().findViewById(R.id.tv_view_field_explanation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNickNameV2_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (TextView) sportDetailV2MapFragment.getMView().findViewById(R.id.edt_nickname2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNickname_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (TextView) sportDetailV2MapFragment.getMView().findViewById(R.id.edt_nickname);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNoMapDetailname_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (TextView) sportDetailV2MapFragment.getMView().findViewById(R.id.tv_detail_name_noMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNoMapTime_delegate$lambda$0(SportDetailV2MapFragment sportDetailV2MapFragment) {
        return (TextView) sportDetailV2MapFragment.getMView().findViewById(R.id.tv_dateTime_noMap);
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
        return (FrameLayout) this.mapViewLayout$delegate.getValue();
    }

    @aa1
    public final String getTitle() {
        return q62.OXO1.i01OOiI(getMWorkout().getMMode());
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<XIi00iiXO> initList() {
        boolean zXIi00iiXO;
        boolean zIIX1OXO;
        boolean zXXI;
        ArrayList arrayList = new ArrayList();
        String string = getMWorkout().getMMode() == 116 ? getString(R.string.game_time) : getString(R.string.exercise_time);
        Intrinsics.XXI(string);
        arrayList.add(new XIi00iiXO(string, O0X11OiO.iXiX011(getMWorkout().getMDuration() * 1000), null, 4, null));
        if (getMWorkout().getMRestDuration() > 0 && getMWorkout().getMRestDuration() < getMWorkout().getMDuration()) {
            String string2 = getString(R.string.sport_detail_rest_time);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            arrayList.add(new XIi00iiXO(string2, O0X11OiO.iXiX011(getMWorkout().getMRestDuration() * 1000), null, 4, null));
        }
        hu4 hu4Var = hu4.OXO1;
        if (!hu4Var.OXO1(getMWorkout().getMMode())) {
            String string3 = getString(R.string.quantity_of_heat);
            Intrinsics.O10IXXX0X(string3, "getString(...)");
            String strValueOf = String.valueOf(getMWorkout().getMCalorie() / 1000);
            String string4 = getString(R.string.kcal);
            Intrinsics.O10IXXX0X(string4, "getString(...)");
            arrayList.add(new XIi00iiXO(string3, strValueOf, string4));
        }
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform()) || getMWorkout().getMType() == 1) {
            zXIi00iiXO = hu4Var.XIi00iiXO(getMWorkout().getMMode());
        } else {
            q62 q62Var = q62.OXO1;
            zXIi00iiXO = q62.X0XI11I(q62Var, getMWorkout().getMMode(), false, 2, null) && !q62Var.iXOiXII(getMWorkout().getMMode());
        }
        if (zXIi00iiXO) {
            String strIi1iii0 = getMWorkout().getMPace() == 0 ? "-'--''" : cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit());
            String string5 = getString(R.string.avg_pace);
            Intrinsics.O10IXXX0X(string5, "getString(...)");
            String string6 = getString(getUserProfile().getUnit() == 0 ? R.string.pace_km : R.string.pace_mi);
            Intrinsics.O10IXXX0X(string6, "getString(...)");
            arrayList.add(new XIi00iiXO(string5, strIi1iii0, string6));
        }
        int mType = getMWorkout().getMType();
        String mPlatform = getMWorkout().getMPlatform();
        int mMode = getMWorkout().getMMode();
        q62 q62Var2 = q62.OXO1;
        LogUtils.m11130i("SportDetailV2MapFragment mType" + mType + " mPlatform=" + mPlatform + "mMode=" + mMode + " " + q62Var2.Oii1I1I10());
        boolean zO00 = hu4Var.O00(getMWorkout().getMMode(), getMWorkout().getMPlatform());
        String strValueOf2 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        if (zO00) {
            String strValueOf3 = getMWorkout().getMSpeed() == 0 ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : String.valueOf(cp5.i11I(((double) getMWorkout().getMSpeed()) / 1000.0d, getUserProfile().getUnit()));
            LogUtils.m11130i("SportDetailV2MapFragment speedToFloat" + strValueOf3 + " unit=" + getUserProfile().getUnit());
            String string7 = getString(R.string.avg_speed);
            Intrinsics.O10IXXX0X(string7, "getString(...)");
            String string8 = getString(getUserProfile().getUnit() == 0 ? R.string.pace_km : R.string.pace_mi);
            Intrinsics.O10IXXX0X(string8, "getString(...)");
            arrayList.add(new XIi00iiXO(string7, strValueOf3, string8));
        }
        if (!o65.OXO1.O00(getMWorkout()) && !q62Var2.OiXI1OiX0()) {
            String string9 = getString(R.string.ave_hr);
            Intrinsics.O10IXXX0X(string9, "getString(...)");
            String strValueOf4 = String.valueOf(getMWorkout().getMAvgBpm());
            String string10 = getString(R.string.ave_hr_unit);
            Intrinsics.O10IXXX0X(string10, "getString(...)");
            arrayList.add(new XIi00iiXO(string9, strValueOf4, string10));
        }
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform())) {
            zIIX1OXO = hu4Var.IiI10X(getMWorkout().getMMode()) && hu4Var.XiOIO(getMWorkout().getMMode());
        } else {
            zIIX1OXO = getMWorkout().getMType() == 1 ? hu4Var.IIX1OXO(getMWorkout().getMMode()) : q62Var2.O1XXXX(getMWorkout().getMMode());
        }
        if (zIIX1OXO) {
            String string11 = getString(R.string.stepnum);
            Intrinsics.O10IXXX0X(string11, "getString(...)");
            String strValueOf5 = String.valueOf(getMWorkout().getMStep());
            String string12 = getString(R.string.steps);
            Intrinsics.O10IXXX0X(string12, "getString(...)");
            arrayList.add(new XIi00iiXO(string11, strValueOf5, string12));
        }
        if (getMWorkout().getMAirPressure() != 0) {
            String string13 = getString(R.string.air_pressure);
            Intrinsics.O10IXXX0X(string13, "getString(...)");
            String strValueOf6 = String.valueOf(getUserProfile().getUnit() == 0 ? getMWorkout().getMAirPressure() : (int) cp5.X0i1O(getMWorkout().getMAirPressure()));
            String string14 = getString(getUserProfile().getUnit() == 0 ? R.string.kpa : R.string.psi);
            Intrinsics.O10IXXX0X(string14, "getString(...)");
            arrayList.add(new XIi00iiXO(string13, strValueOf6, string14));
        }
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform())) {
            zXXI = q62Var2.iX00X1X(getMWorkout().getMMode());
        } else {
            zXXI = getMWorkout().getMType() == 1 ? hu4Var.XXI(getMWorkout().getMMode()) : q62Var2.I1XXi1Oi(getMWorkout().getMMode(), !isLocationEmpty());
        }
        if (zXXI) {
            String string15 = getString(R.string.avg_altitude);
            Intrinsics.O10IXXX0X(string15, "getString(...)");
            String strIIXi1iiXI = cp5.iIXi1iiXI(getMWorkout().getMAltitude(), getUserProfile().getUnit());
            String string16 = getString(getUserProfile().getUnit() == 0 ? R.string.f54360m : R.string.f54374yd);
            Intrinsics.O10IXXX0X(string16, "getString(...)");
            arrayList.add(new XIi00iiXO(string15, strIIXi1iiXI, string16));
        }
        if (getMWorkout().getMType() == 1) {
            if (hu4Var.I0iXXO(getMWorkout().getMMode())) {
                String string17 = getString(R.string.lactic_acid_wide_value_heart_rate);
                Intrinsics.O10IXXX0X(string17, "getString(...)");
                if (getMWorkout().getMLactateThresholdHr() != 0) {
                    strValueOf2 = String.valueOf(getMWorkout().getMLactateThresholdHr());
                }
                String string18 = getString(R.string.ave_hr_unit);
                Intrinsics.O10IXXX0X(string18, "getString(...)");
                arrayList.add(new XIi00iiXO(string17, strValueOf2, string18));
                String strIi1iii1 = getMWorkout().getMLactateThresholdPace() != 0 ? cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit()) : "-'--''";
                String string19 = getString(R.string.lavaic_acid_lapsee_packet);
                Intrinsics.O10IXXX0X(string19, "getString(...)");
                String string20 = getString(getUserProfile().getUnit() == 0 ? R.string.pace_km : R.string.pace_mi);
                Intrinsics.O10IXXX0X(string20, "getString(...)");
                arrayList.add(new XIi00iiXO(string19, strIi1iii1, string20));
            }
            int mMode2 = getMWorkout().getMMode();
            if (mMode2 == 25) {
                String string21 = getString(R.string.total_boxing_reps);
                Intrinsics.O10IXXX0X(string21, "getString(...)");
                String strValueOf7 = String.valueOf(getMWorkout().getMCnt());
                String string22 = getString(R.string.times_key);
                Intrinsics.O10IXXX0X(string22, "getString(...)");
                arrayList.add(new XIi00iiXO(string21, strValueOf7, string22));
            } else if (mMode2 == 52) {
                String string23 = getString(R.string.total_strokes);
                Intrinsics.O10IXXX0X(string23, "getString(...)");
                String strValueOf8 = String.valueOf(getMWorkout().getMCnt());
                String string24 = getString(R.string.times_key);
                Intrinsics.O10IXXX0X(string24, "getString(...)");
                arrayList.add(new XIi00iiXO(string23, strValueOf8, string24));
            } else if (mMode2 == 55) {
                String string25 = getString(R.string.total_dumbbell_reps);
                Intrinsics.O10IXXX0X(string25, "getString(...)");
                String strValueOf9 = String.valueOf(getMWorkout().getMCnt());
                String string26 = getString(R.string.times_key);
                Intrinsics.O10IXXX0X(string26, "getString(...)");
                arrayList.add(new XIi00iiXO(string25, strValueOf9, string26));
            }
            if (getMWorkout().getMMode() == 52) {
                String string27 = getString(R.string.avg_stroke_rate);
                Intrinsics.O10IXXX0X(string27, "getString(...)");
                String strValueOf10 = String.valueOf(getMWorkout().getMCadence());
                String string28 = getString(R.string.times_key);
                Intrinsics.O10IXXX0X(string28, "getString(...)");
                arrayList.add(new XIi00iiXO(string27, strValueOf10, string28));
            } else if (hu4Var.OIX0iXi(getMWorkout().getMMode())) {
                String string29 = getString(R.string.avg_spm);
                Intrinsics.O10IXXX0X(string29, "getString(...)");
                String strValueOf11 = String.valueOf(getMWorkout().getMSpm());
                String string30 = getString(R.string.steps);
                Intrinsics.O10IXXX0X(string30, "getString(...)");
                arrayList.add(new XIi00iiXO(string29, strValueOf11, string30));
            }
            String string31 = getString(R.string.metabolic_volume);
            Intrinsics.O10IXXX0X(string31, "getString(...)");
            arrayList.add(new XIi00iiXO(string31, String.valueOf(getMWorkout().getMMetTotal()), "METs"));
            getTvFieldExplanation().setVisibility(0);
            getTvFieldExplanation().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ny4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportDetailV2MapFragment.initList$lambda$0(this.f10040IO, view);
                }
            });
        }
        return arrayList;
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        boolean zO10IXXX0X;
        super.initView();
        LogUtils.m11130i("SportDetailV2MapFragment initView}");
        getTvDateTime().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(getMWorkout().getMStart())));
        o65 o65Var = o65.OXO1;
        this.mStartTime = o65Var.OIX0iXi(getMWorkout().getMStart());
        this.mEndTime = o65Var.OIX0iXi(getMWorkout().getMEnd()) + ((long) 60000);
        getTvDetailname().setText(getTitle());
        getTvNickname().setText(getUserProfile().getNickname());
        getTvNickNameV2().setText(getUserProfile().getNickname());
        avatarShow();
        hu4 hu4Var = hu4.OXO1;
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform())) {
            zO10IXXX0X = q62.OXO1.OXXO0O1X(getMWorkout().getMMode());
        } else if (getMWorkout().getMType() == 1) {
            zO10IXXX0X = hu4Var.O10IXXX0X(getMWorkout().getMMode());
        } else {
            zO10IXXX0X = q62.X0XI11I(q62.OXO1, getMWorkout().getMMode(), false, 2, null) && getMWorkout().getMMode() != 40;
        }
        if (zO10IXXX0X) {
            getTvAvatarV1Layout().setVisibility(0);
            getTvAvatarV2Layout().setVisibility(8);
        } else {
            getTvAvatarV1Layout().setVisibility(8);
            getTvAvatarV2Layout().setVisibility(0);
        }
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getActivity(), 2));
        final Context context = getContext();
        final List<XIi00iiXO> listInitList = initList();
        getMRecyclerView().setAdapter(new CommonAdapter<XIi00iiXO>(context, listInitList) { // from class: com.sma.smartv3.ui.sport.SportDetailV2MapFragment$initView$mRecyclerAdapter$1
            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public void convert(ViewHolder viewHolder, SportDetailV2MapFragment.XIi00iiXO item, int i) {
                Intrinsics.X0O(viewHolder, "viewHolder");
                Intrinsics.X0O(item, "item");
                viewHolder.setText(R.id.item_sport_detail_title, item.XOO0ii0());
                viewHolder.setText(R.id.item_sport_detail_content, item.IiI10X());
                viewHolder.setText(R.id.item_sport_detail_unit, item.I0IIOi());
            }
        });
        showProgressbarView();
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        if (isInChinaMainland()) {
            return;
        }
        getMGoogleMap().moveCamera(CameraUpdateFactory.zoomOut());
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_map_v2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 3) {
            int mArg1 = getMArg1();
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", "3");
            bundle.putInt("mArg1", mArg1);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent2 = new Intent(getActivity(), (Class<?>) MapShareActivity.class);
            intent2.putExtras(bundle);
            startActivity(intent2);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void playTrack() {
        int mArg1 = getMArg1();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        FragmentActivity activity = getActivity();
        Intrinsics.XXI(activity);
        Intent intent = new Intent(activity, (Class<?>) ShareVideoActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 3);
    }

    public final void setChartFragmentBitmap(@aa1 Bitmap chartBitmap, int i) {
        Intrinsics.X0O(chartBitmap, "chartBitmap");
        this.mChartBitmap = chartBitmap;
        this.mWorkoutId = i;
    }

    public final void setMChartBitmap(@tb1 Bitmap bitmap) {
        this.mChartBitmap = bitmap;
    }

    public final void setMHaveMapBitmap(boolean z) {
        this.mHaveMapBitmap = z;
    }

    public final void setMWorkoutId(int i) {
        this.mWorkoutId = i;
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void share(@aa1 Bitmap topBitmap) {
        Intrinsics.X0O(topBitmap, "topBitmap");
        if (this.mHaveMapBitmap) {
            super.share(topBitmap);
        } else {
            shareMapBitmap(topBitmap, topBitmap);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void shareMapBitmap(@aa1 Bitmap topBitmap, @aa1 Bitmap mapBitmap) {
        Intrinsics.X0O(topBitmap, "topBitmap");
        Intrinsics.X0O(mapBitmap, "mapBitmap");
        if (this.mChartBitmap == null) {
            super.shareMapBitmap(topBitmap, mapBitmap);
            return;
        }
        int width = getRootView().getWidth();
        int height = getRootView().getHeight();
        Bitmap bitmap = this.mChartBitmap;
        Intrinsics.XXI(bitmap);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height + bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (this.mHaveMapBitmap) {
            getMView().findViewById(R.id.check_layout).setVisibility(8);
            canvas.drawBitmap(mapBitmap, 0.0f, 0.0f, (Paint) null);
        }
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        RelativeLayout rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        Bitmap bitmapXIi00iiXO = xIi1i01O.XIi00iiXO(rootView);
        canvas.drawBitmap(bitmapXIi00iiXO, 0.0f, 0.0f, (Paint) null);
        Bitmap bitmap2 = this.mChartBitmap;
        Intrinsics.XXI(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, bitmapXIi00iiXO.getHeight(), (Paint) null);
        ImageUtils.save(bitmapCreateBitmap, uz0.XOX0O0(sz0.OXO1), Bitmap.CompressFormat.JPEG);
        String strValueOf = String.valueOf(OiOX0i.m1037iO(isLocationEmpty()));
        int i = this.mWorkoutId;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strValueOf);
        bundle.putInt("mArg1", i);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(getActivity(), (Class<?>) MapShareActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        if (this.mHaveMapBitmap) {
            getMView().findViewById(R.id.check_layout).setVisibility(0);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void showMapLocation(@aa1 List<Location> locationList) {
        Intrinsics.X0O(locationList, "locationList");
        ViewGroup.LayoutParams layoutParams = getRootView().getLayoutParams();
        LogUtils.m11128d(TAG, "showMapLocation: " + locationList.size());
        if (locationList.isEmpty() || locationList.size() < 2) {
            getMapViewLayout().setBackgroundResource(R.drawable.sport_detail_map_v2_tap_bg);
            getMView().findViewById(R.id.check_layout).setVisibility(8);
            getBtnTrackPlay().setVisibility(4);
            this.mHaveMapBitmap = false;
            layoutParams.height = getMWorkout().getMType() == 1 ? SizeUtils.dp2px(700.0f) : SizeUtils.dp2px(600.0f);
            getTvNoMapDetailname().setVisibility(0);
            getTvDetailname().setVisibility(8);
            getTvNoMapDetailname().setText(getTitle());
            getTvNoMapTime().setVisibility(0);
            getTvDateTime().setVisibility(8);
            getTvNoMapTime().setText(getTvDateTime().getText());
            getSportDetailProgressbarLayout().setVisibility(8);
        } else {
            super.showMapLocation(locationList);
            this.mHaveMapBitmap = true;
            layoutParams.height = getMWorkout().getMType() == 1 ? SizeUtils.dp2px(970.0f) : SizeUtils.dp2px(870.0f);
            getSportDetailProgressbarLayout().setVisibility(0);
        }
        getRootView().setLayoutParams(layoutParams);
    }
}
