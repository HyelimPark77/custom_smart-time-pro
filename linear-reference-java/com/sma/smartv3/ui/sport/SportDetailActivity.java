package com.sma.smartv3.ui.sport;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.ks4;
import com.android.mltcode.paycertificationapi.ls4;
import com.android.mltcode.paycertificationapi.ms4;
import com.android.mltcode.paycertificationapi.ns4;
import com.android.mltcode.paycertificationapi.os4;
import com.android.mltcode.paycertificationapi.ps4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qs4;
import com.android.mltcode.paycertificationapi.rs4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.db.entity.WorkoutIndex;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailActivity.kt\ncom/sma/smartv3/ui/sport/SportDetailActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n104#2,9:171\n113#2,3:181\n99#2,3:184\n104#2,9:187\n113#2,3:197\n99#2,3:200\n104#2,9:203\n113#2,3:213\n99#2,3:216\n1#3:180\n1#3:196\n1#3:212\n37#4,2:219\n*S KotlinDebug\n*F\n+ 1 SportDetailActivity.kt\ncom/sma/smartv3/ui/sport/SportDetailActivity\n*L\n60#1:171,9\n60#1:181,3\n60#1:184,3\n61#1:187,9\n61#1:197,3\n61#1:200,3\n62#1:203,9\n62#1:213,3\n62#1:216,3\n60#1:180\n61#1:196\n62#1:212\n89#1:219,2\n*E\n"})
public final class SportDetailActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    private boolean isLocationEmpty;

    @aa1
    private final Lazy mLocationDao$delegate;
    private Workout mWorkout;

    @aa1
    private final Lazy mWorkoutDao$delegate;
    public SportDetailChartFragment sportDetailChartFragment;
    public SportDetailFragment sportDetailFragment;
    public SportDetailMapFragment sportDetailMapFragment;

    @aa1
    private final Lazy table$delegate;

    @aa1
    private final Lazy topPanel$delegate;

    public static final class OXO1 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ WorkoutIndex IO;

        public OXO1(WorkoutIndex r1) {
            this.IO = r1;
        }

        public static /* synthetic */ Unit OXO1(WorkoutIndex r0, boolean r1) {
            return XIi00iiXO(r0, r1);
        }

        public static final Unit XIi00iiXO(WorkoutIndex r0, boolean r1) {
            if (r1 == true) goto L5;
            MyDb.INSTANCE.getMDatabase().workoutIndexDao().insert(r0);
        L5:
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            Application r0 = Utils.getApp();
            Intrinsics.O10IXXX0X(r0, "getApp(...)");
            final WorkoutIndex r1 = this.IO;
            XXI0Xi.XOO0ii0(r0, r1, new rs4(r1));
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    public SportDetailActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new ks4(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new ls4(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new ms4(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new ns4(this));
        this.topPanel$delegate = LazyKt__LazyJVMKt.iO(new os4(this));
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new ps4());
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.iO(new qs4());
        this.isLocationEmpty = true;
    }

    public static /* synthetic */ ImageView I0iXXO(SportDetailActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LocationDao I1XOi1() {
        return mLocationDao_delegate$lambda$0();
    }

    public static /* synthetic */ PFMedium O10IXXX0X(SportDetailActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TabLayout OIX0iXi(SportDetailActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ WorkoutDao X0O() {
        return mWorkoutDao_delegate$lambda$0();
    }

    public static /* synthetic */ ImageView X1ii(SportDetailActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXI(SportDetailActivity r0) {
        return topPanel_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(SportDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(SportDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(SportDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) getValue();
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    private static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    private static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    private static final TabLayout table_delegate$lambda$0(SportDetailActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    private static final View topPanel_delegate$lambda$0(SportDetailActivity r1) {
        return r1.findViewById(R.id.top_panel);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final SportDetailChartFragment getSportDetailChartFragment() {
        SportDetailChartFragment r0 = this.sportDetailChartFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportDetailChartFragment");
        return null;
    }

    @aa1
    public final SportDetailFragment getSportDetailFragment() {
        SportDetailFragment r0 = this.sportDetailFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportDetailFragment");
        return null;
    }

    @aa1
    public final SportDetailMapFragment getSportDetailMapFragment() {
        SportDetailMapFragment r0 = this.sportDetailMapFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportDetailMapFragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    public final View getTopPanel() {
        return (View) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r6) {
        Workout r7 = getMWorkoutDao().getWorkoutById(getMArg1());
        this.mWorkout = r7;
        Workout r0 = null;
        if (r7 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r7 = null;
    L5:
        LogUtils.d(new Object[]{String.valueOf(r7)});
        LocationDao r8 = getMLocationDao();
        Workout r2 = this.mWorkout;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mWorkout");
        r2 = null;
    L8:
        long r3 = r2.getMStart();
        Workout r4 = this.mWorkout;
        if (r4 != null) goto L11;
        Intrinsics.XXO("mWorkout");
    L12:
        List<Location> r9 = r8.getLocation(r3, r0.getMEnd());
        if (r9.isEmpty() == false) goto L15;
    L18:
        boolean r10 = true;
    L19:
        this.isLocationEmpty = r10;
        initFragment();
        return;
    L15:
        if (r9.size() < 2) goto L18;
        r10 = false;
        goto L19
    L11:
        r0 = r4;
        goto L12
    }

    public final void initFragment() {
        BaseFragment.OXO1 r0 = BaseFragment.Companion;
        Workout r1 = this.mWorkout;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r1 = null;
    L5:
        Bundle r3 = new Bundle();
        r3.putString("mArg0", null);
        r3.putParcelable("mArg2", null);
        r3.putSerializable("mArg3", r1);
        BaseFragment r2 = (BaseFragment) SportDetailMapFragment.class.newInstance();
        r2.setArguments(r3);
        if (r2 == null) goto L24;
        setSportDetailMapFragment((SportDetailMapFragment) r2);
        Workout r4 = this.mWorkout;
        if (r4 != null) goto L10;
        Intrinsics.XXO("mWorkout");
        r4 = null;
    L10:
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r4);
        BaseFragment r6 = (BaseFragment) SportDetailChartFragment.class.newInstance();
        r6.setArguments(r5);
        if (r6 == null) goto L22;
        setSportDetailChartFragment((SportDetailChartFragment) r6);
        Workout r7 = this.mWorkout;
        if (r7 != null) goto L15;
        Intrinsics.XXO("mWorkout");
        r7 = null;
    L15:
        Bundle r8 = new Bundle();
        r8.putString("mArg0", null);
        r8.putParcelable("mArg2", null);
        r8.putSerializable("mArg3", r7);
        BaseFragment r9 = (BaseFragment) SportDetailFragment.class.newInstance();
        r9.setArguments(r8);
        if (r9 == null) goto L20;
        setSportDetailFragment((SportDetailFragment) r9);
        return;
    L20:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailFragment");
    L22:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailChartFragment");
    L24:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailMapFragment");
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList r0 = new ArrayList();
        if (this.isLocationEmpty == true) goto L5;
        r0.add(getSportDetailMapFragment());
    L5:
        r0.add(getSportDetailChartFragment());
        r0.add(getSportDetailFragment());
        return r0;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_share);
        ArrayList r0 = new ArrayList();
        if (this.isLocationEmpty == true) goto L5;
        String r2 = getString(R.string.track);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r0.add(r2);
    L5:
        String r3 = getString(R.string.chart);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        r0.add(r3);
        String r4 = getString(R.string.detail);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        r0.add(r4);
        getMFragmentPagerAdapter().setTitles((CharSequence[]) r0.toArray(new String[0]));
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        getTable().setupWithViewPager(getMViewPager());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_detail;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        XIi1i01O r4 = XIi1i01O.OXO1;
        View r0 = getTopPanel();
        Intrinsics.O10IXXX0X(r0, "<get-topPanel>(...)");
        Bitmap r5 = r4.XIi00iiXO(r0);
        if (getSportDetailMapFragment().getUserVisibleHint() == false) goto L9;
        if (this.isLocationEmpty == true) goto L9;
        getSportDetailMapFragment().share(r5);
        return;
    L9:
        if (getSportDetailChartFragment().getUserVisibleHint() == false) goto L13;
        getSportDetailChartFragment().share();
        share(r5);
        return;
    L13:
        if (getSportDetailFragment().getUserVisibleHint() == false) goto L16;
        getSportDetailFragment().share();
        share(r5);
        return;
    }

    public final void setSportDetailChartFragment(@aa1 SportDetailChartFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportDetailChartFragment = r2;
    }

    public final void setSportDetailFragment(@aa1 SportDetailFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportDetailFragment = r2;
    }

    public final void setSportDetailMapFragment(@aa1 SportDetailMapFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportDetailMapFragment = r2;
    }

    @aa1
    public final String setTitle() {
        q62 r0 = q62.OXO1;
        Workout r1 = this.mWorkout;
        if (r1 != null) goto L6;
        Intrinsics.XXO("mWorkout");
        r1 = null;
    L6:
        return r0.i01OOiI(r1.getMMode());
    }

    public final void share(@aa1 Bitmap r6) {
        Intrinsics.X0O(r6, "topBitmap");
        Bitmap r0 = ImageUtils.getBitmap(uz0.XOX0O0(sz0.OXO1));
        Bitmap r1 = Bitmap.createBitmap(r6.getWidth(), r6.getHeight() + r0.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r1, "createBitmap(...)");
        Canvas r2 = new Canvas(r1);
        r2.drawBitmap(r6, 0.0f, 0.0f, null);
        r2.drawBitmap(r0, 0.0f, r6.getHeight(), null);
        XIi1i01O.OXO1.XO0O10(this, r1);
    }

    public final void testUploadStrava() {
        Workout r0 = this.mWorkout;
        Workout r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r0 = null;
    L5:
        int r8 = r0.getMMode();
        Workout r2 = this.mWorkout;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mWorkout");
    L9:
        ThreadUtils.executeByIo(new OXO1(new WorkoutIndex(0, 2, r1.getMEnd(), r8, 0, 17, null)));
        return;
    L8:
        r1 = r2;
        goto L9
    }
}
