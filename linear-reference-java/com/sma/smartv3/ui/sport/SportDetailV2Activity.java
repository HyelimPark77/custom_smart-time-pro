package com.sma.smartv3.ui.sport;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iiIOX;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.gw4;
import com.android.mltcode.paycertificationapi.hw4;
import com.android.mltcode.paycertificationapi.iw4;
import com.android.mltcode.paycertificationapi.jw4;
import com.android.mltcode.paycertificationapi.kw4;
import com.android.mltcode.paycertificationapi.lw4;
import com.android.mltcode.paycertificationapi.mw4;
import com.android.mltcode.paycertificationapi.nw4;
import com.android.mltcode.paycertificationapi.ow4;
import com.android.mltcode.paycertificationapi.pw4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qw4;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.EvaluationKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.model.SportDetailViewModel;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2Activity.kt\ncom/sma/smartv3/ui/sport/SportDetailV2Activity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n104#2,9:213\n113#2,3:223\n99#2,3:226\n104#2,9:229\n113#2,3:239\n99#2,3:242\n1#3:222\n1#3:238\n*S KotlinDebug\n*F\n+ 1 SportDetailV2Activity.kt\ncom/sma/smartv3/ui/sport/SportDetailV2Activity\n*L\n81#1:213,9\n81#1:223,3\n81#1:226,3\n82#1:229,9\n82#1:239,3\n82#1:242,3\n81#1:222\n82#1:238\n*E\n"})
public final class SportDetailV2Activity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    private boolean initializationEvaluate;
    private boolean isLocationEmpty;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private I0iiIOX mEvaluationPopup;

    @aa1
    private final Lazy mLocationDao$delegate;

    @aa1
    private final SportDetailViewModel mSportViewModel;
    private Workout mWorkout;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    @aa1
    private final Lazy rootView$delegate;
    public SportDetailV2ChartFragment sportDetailChartFragment;
    public SportDetailV2MapFragment sportDetailMapFragment;

    @aa1
    private final Lazy topPanel$delegate;

    public static final class OXO1 implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 IO;

        public OXO1(Function1 r2) {
            Intrinsics.X0O(r2, "function");
            this.IO = r2;
        }

        public final boolean equals(@tb1 Object r3) {
            if ((r3 instanceof Observer) == true) goto L5;
        L8:
            return false;
        L5:
            if ((r3 instanceof FunctionAdapter) == false) goto L8;
            return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) r3).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object r2) {
            invoke(r2);
        }
    }

    public SportDetailV2Activity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new gw4(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new iw4(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new jw4(this));
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new kw4(this));
        this.initializationEvaluate = true;
        this.topPanel$delegate = LazyKt__LazyJVMKt.iO(new lw4(this));
        this.mSportViewModel = (SportDetailViewModel) new ViewModelProvider.NewInstanceFactory().create(SportDetailViewModel.class);
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new mw4());
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.iO(new nw4());
        this.isLocationEmpty = true;
    }

    public static /* synthetic */ Unit I0iXXO(SportDetailV2Activity r0, Bitmap r1, boolean r2) {
        return onTitleRightOtherClick$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ WorkoutDao I1XOi1() {
        return mWorkoutDao_delegate$lambda$0();
    }

    public static /* synthetic */ void IIX1OXO(SportDetailV2Activity r0, View r1, int r2, int r3, int r4, int r5) {
        initView$lambda$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ boolean O10IXXX0X(SportDetailV2Activity r0) {
        return showDeletePopup$lambda$0$0(r0);
    }

    public static /* synthetic */ LocationDao OIX0iXi() {
        return mLocationDao_delegate$lambda$0();
    }

    public static /* synthetic */ View X0O(SportDetailV2Activity r0) {
        return topPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X1ii(SportDetailV2Activity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XX0(SportDetailV2Activity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView XXI(SportDetailV2Activity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XiOIO(SportDetailV2Activity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(SportDetailV2Activity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(SportDetailV2Activity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(SportDetailV2Activity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) getValue();
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    public static /* synthetic */ Unit iIiiO(SportDetailV2Activity r0, ArrayList r1) {
        return intiObserve$lambda$0(r0, r1);
    }

    private static final void initView$lambda$0(SportDetailV2Activity r0, View r1, int r2, int r3, int r4, int r5) {
        if ((r3 + r0.getRootView().getHeight()) < r0.getRootView().getChildAt(0).getMeasuredHeight()) goto L6;
        r0.initializationEvaluateNumber();
        return;
    }

    private final void initializationEvaluateNumber() {
        if (this.initializationEvaluate == false) goto L8;
        a01 r0 = a01.OXO1;
        int r2 = r0.IiI10X().getInt(b01.OI, 0);
        if (r2 <= 1) goto L7;
        onShowEvaluationStatus();
    L7:
        r0.IiI10X().put(b01.OI, r2 + 1);
    L8:
        this.initializationEvaluate = false;
    }

    private final void intiObserve() {
        this.mSportViewModel.getMarkLiveData().observe(this, new OXO1(new qw4(this)));
    }

    private static final Unit intiObserve$lambda$0(SportDetailV2Activity r0, ArrayList r1) {
        SportDetailV2MapFragment r2 = r0.getSportDetailMapFragment();
        Intrinsics.XXI(r1);
        r2.onLoadMarkView(r1);
        return Unit.OXO1;
    }

    private static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    private static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    private static final Unit onTitleRightOtherClick$lambda$0(SportDetailV2Activity r2, Bitmap r3, boolean r4) {
        r2.getSportDetailMapFragment().setChartFragmentBitmap(r2.getSportDetailChartFragment().getBitmap(), r2.getMArg1());
        r2.getSportDetailMapFragment().share(r3);
        return Unit.OXO1;
    }

    private static final NestedScrollView rootView_delegate$lambda$0(SportDetailV2Activity r1) {
        return (NestedScrollView) r1.findViewById(R.id.root_View);
    }

    private final void showDeletePopup() {
        if (this.mDeletePopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.delete_reminder);
        r0.iX(Integer.valueOf(R.string.delete_reminder_hint));
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.confirm, new ow4(this));
        this.mDeletePopup = r0;
    L5:
        go0 r1 = this.mDeletePopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final boolean showDeletePopup$lambda$0$0(SportDetailV2Activity r0) {
        r0.sportDetailDelete();
        r0.finish();
        return true;
    }

    private final void sportDetailDelete() {
        Workout r0 = this.mWorkout;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r0 = null;
    L5:
        LogUtils.d(new Object[]{"detail source " + r0.getMSource()});
        Workout r1 = this.mWorkout;
        if (r1 != null) goto L8;
        Intrinsics.XXO("mWorkout");
        r1 = null;
    L8:
        r1.setMIsSync(0);
        Workout r2 = this.mWorkout;
        if (r2 != null) goto L11;
        Intrinsics.XXO("mWorkout");
        r2 = null;
    L11:
        r2.setMIsDelete(1);
        WorkoutDao r3 = getMWorkoutDao();
        Workout r4 = this.mWorkout;
        if (r4 != null) goto L14;
        Intrinsics.XXO("mWorkout");
        r4 = null;
    L14:
        r3.update(r4);
        I01XX0.XIi00iiXO(I01XX0.IX1XiI, null, 2, null);
    }

    private static final View topPanel_delegate$lambda$0(SportDetailV2Activity r1) {
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

    public final boolean getInitializationEvaluate() {
        return this.initializationEvaluate;
    }

    @aa1
    public final SportDetailViewModel getMSportViewModel() {
        return this.mSportViewModel;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public int getMStatusStyle() {
        return 1;
    }

    public final NestedScrollView getRootView() {
        return (NestedScrollView) getValue();
    }

    @aa1
    public final SportDetailV2ChartFragment getSportDetailChartFragment() {
        SportDetailV2ChartFragment r0 = this.sportDetailChartFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportDetailChartFragment");
        return null;
    }

    @aa1
    public final SportDetailV2MapFragment getSportDetailMapFragment() {
        SportDetailV2MapFragment r0 = this.sportDetailMapFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportDetailMapFragment");
        return null;
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

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    public final void initFragment() {
        BaseFragment.OXO1 r0 = BaseFragment.Companion;
        int r1 = getMArg1();
        Workout r2 = this.mWorkout;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r2 = null;
    L5:
        Bundle r4 = new Bundle();
        r4.putString("mArg0", null);
        r4.putInt("mArg1", r1);
        r4.putParcelable("mArg2", null);
        r4.putSerializable("mArg3", r2);
        BaseFragment r3 = (BaseFragment) SportDetailV2MapFragment.class.newInstance();
        r3.setArguments(r4);
        if (r3 == null) goto L17;
        setSportDetailMapFragment((SportDetailV2MapFragment) r3);
        int r5 = getMArg1();
        Workout r6 = this.mWorkout;
        if (r6 != null) goto L10;
        Intrinsics.XXO("mWorkout");
        r6 = null;
    L10:
        Bundle r7 = new Bundle();
        r7.putString("mArg0", null);
        r7.putInt("mArg1", r5);
        r7.putParcelable("mArg2", null);
        r7.putSerializable("mArg3", r6);
        BaseFragment r8 = (BaseFragment) SportDetailV2ChartFragment.class.newInstance();
        r8.setArguments(r7);
        if (r8 == null) goto L15;
        setSportDetailChartFragment((SportDetailV2ChartFragment) r8);
        intiObserve();
        return;
    L15:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2ChartFragment");
    L17:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2MapFragment");
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        transparentStatusBar();
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_title_other_right);
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.ic_share_v2);
        getRootView().setOnScrollChangeListener(new pw4(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_detail_v2;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction().replace(R.id.sport_detail_v2_map_fragment, getSportDetailMapFragment()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.sport_detail_v2_chart_fragment, getSportDetailChartFragment()).commit();
    }

    public final void onShowEvaluationStatus() {
        if (EvaluationKt.isShowEvaluationDialog() == false) goto L18;
        int r1 = 2;
        if (getMWorkoutDao().getList().size() >= 2) goto L7;
        return;
    L7:
        if (this.mEvaluationPopup != null) goto L9;
        this.mEvaluationPopup = new I0iiIOX(this, 0, r1, null);
    L9:
        I0iiIOX r0 = this.mEvaluationPopup;
        if (r0 != null) goto L12;
    L14:
        I0iiIOX r2 = this.mEvaluationPopup;
        if (r2 == null) goto L20;
        NestedScrollView r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        r2.XiOIO(r3);
        return;
    L20:
        return;
    L12:
        if (r0.isShowing() != true) goto L14;
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showDeletePopup();
    }

    public final void onTitleRightOtherClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        XIi1i01O r4 = XIi1i01O.OXO1;
        View r0 = getTopPanel();
        Intrinsics.O10IXXX0X(r0, "<get-topPanel>(...)");
        final Bitmap r5 = r4.XIi00iiXO(r0);
        getSportDetailChartFragment().showQCCode(new hw4(this, r5));
    }

    public final void setInitializationEvaluate(boolean r1) {
        this.initializationEvaluate = r1;
    }

    public final void setSportDetailChartFragment(@aa1 SportDetailV2ChartFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportDetailChartFragment = r2;
    }

    public final void setSportDetailMapFragment(@aa1 SportDetailV2MapFragment r2) {
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

    @sf5(tag = I01XX0.XXiO0i)
    public final void syncDapSportDetailExperience(int r4) {
        Workout r0 = this.mWorkout;
        Workout r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r0 = null;
    L5:
        r0.setMFeel(r4);
        WorkoutDao r5 = getMWorkoutDao();
        Workout r2 = this.mWorkout;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mWorkout");
    L9:
        r5.update(r1);
        return;
    L8:
        r1 = r2;
        goto L9
    }
}
