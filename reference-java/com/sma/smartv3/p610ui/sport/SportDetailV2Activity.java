package com.sma.smartv3.p610ui.sport;

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
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.model.EvaluationKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.sport.course.model.SportDetailViewModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2Activity.kt\ncom/sma/smartv3/ui/sport/SportDetailV2Activity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n104#2,9:213\n113#2,3:223\n99#2,3:226\n104#2,9:229\n113#2,3:239\n99#2,3:242\n1#3:222\n1#3:238\n*S KotlinDebug\n*F\n+ 1 SportDetailV2Activity.kt\ncom/sma/smartv3/ui/sport/SportDetailV2Activity\n*L\n81#1:213,9\n81#1:223,3\n81#1:226,3\n82#1:229,9\n82#1:239,3\n82#1:242,3\n81#1:222\n82#1:238\n*E\n"})
public final class SportDetailV2Activity extends BaseActivity {

    @tb1
    private go0 mDeletePopup;

    @tb1
    private I0iiIOX mEvaluationPopup;
    private Workout mWorkout;
    public SportDetailV2ChartFragment sportDetailChartFragment;
    public SportDetailV2MapFragment sportDetailMapFragment;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2Activity.abhTitleCenter_delegate$lambda$0(this.f6977IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2Activity.abhTitleRight_delegate$lambda$0(this.f8781IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2Activity.abhTitleOtherRight_delegate$lambda$0(this.f9054IO);
        }
    });

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2Activity.rootView_delegate$lambda$0(this.f9296IO);
        }
    });
    private boolean initializationEvaluate = true;

    @aa1
    private final Lazy topPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2Activity.topPanel_delegate$lambda$0(this.f9535IO);
        }
    });

    @aa1
    private final SportDetailViewModel mSportViewModel = (SportDetailViewModel) new ViewModelProvider.NewInstanceFactory().create(SportDetailViewModel.class);

    @aa1
    private final Lazy mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2Activity.mWorkoutDao_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy mLocationDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2Activity.mLocationDao_delegate$lambda$0();
        }
    });
    private boolean isLocationEmpty = true;

    public static final class OXO1 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function1 f54768IO;

        public OXO1(Function1 function) {
            Intrinsics.X0O(function, "function");
            this.f54768IO = function;
        }

        public final boolean equals(@tb1 Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.f54768IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54768IO.invoke2(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(SportDetailV2Activity sportDetailV2Activity) {
        return (PFMedium) sportDetailV2Activity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(SportDetailV2Activity sportDetailV2Activity) {
        return (ImageView) sportDetailV2Activity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(SportDetailV2Activity sportDetailV2Activity) {
        return (ImageView) sportDetailV2Activity.findViewById(R.id.abh_title_right);
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) this.mLocationDao$delegate.getValue();
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) this.mWorkoutDao$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailV2Activity sportDetailV2Activity, View view, int i, int i2, int i3, int i4) {
        if (i2 + sportDetailV2Activity.getRootView().getHeight() >= sportDetailV2Activity.getRootView().getChildAt(0).getMeasuredHeight()) {
            sportDetailV2Activity.initializationEvaluateNumber();
        }
    }

    private final void initializationEvaluateNumber() {
        if (this.initializationEvaluate) {
            a01 a01Var = a01.OXO1;
            int i = a01Var.IiI10X().getInt(b01.f5629OI, 0);
            if (i > 1) {
                onShowEvaluationStatus();
            }
            a01Var.IiI10X().put(b01.f5629OI, i + 1);
        }
        this.initializationEvaluate = false;
    }

    private final void intiObserve() {
        this.mSportViewModel.getMarkLiveData().observe(this, new OXO1(new Function1() { // from class: com.android.mltcode.paycertificationapi.qw4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailV2Activity.intiObserve$lambda$0(this.f10695IO, (ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intiObserve$lambda$0(SportDetailV2Activity sportDetailV2Activity, ArrayList arrayList) {
        SportDetailV2MapFragment sportDetailMapFragment = sportDetailV2Activity.getSportDetailMapFragment();
        Intrinsics.XXI(arrayList);
        sportDetailMapFragment.onLoadMarkView(arrayList);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTitleRightOtherClick$lambda$0(SportDetailV2Activity sportDetailV2Activity, Bitmap bitmap, boolean z) {
        sportDetailV2Activity.getSportDetailMapFragment().setChartFragmentBitmap(sportDetailV2Activity.getSportDetailChartFragment().getBitmap(), sportDetailV2Activity.getMArg1());
        sportDetailV2Activity.getSportDetailMapFragment().share(bitmap);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView rootView_delegate$lambda$0(SportDetailV2Activity sportDetailV2Activity) {
        return (NestedScrollView) sportDetailV2Activity.findViewById(R.id.root_View);
    }

    private final void showDeletePopup() {
        if (this.mDeletePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.delete_reminder);
            go0Var.m1865iX(Integer.valueOf(R.string.delete_reminder_hint));
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.ow4
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SportDetailV2Activity.showDeletePopup$lambda$0$0(this.f10238IO));
                }
            });
            this.mDeletePopup = go0Var;
        }
        go0 go0Var2 = this.mDeletePopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePopup$lambda$0$0(SportDetailV2Activity sportDetailV2Activity) {
        sportDetailV2Activity.sportDetailDelete();
        sportDetailV2Activity.finish();
        return true;
    }

    private final void sportDetailDelete() {
        Workout workout = this.mWorkout;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        LogUtils.m11128d("detail source " + workout.getMSource());
        Workout workout2 = this.mWorkout;
        if (workout2 == null) {
            Intrinsics.XXO("mWorkout");
            workout2 = null;
        }
        workout2.setMIsSync(0);
        Workout workout3 = this.mWorkout;
        if (workout3 == null) {
            Intrinsics.XXO("mWorkout");
            workout3 = null;
        }
        workout3.setMIsDelete(1);
        WorkoutDao mWorkoutDao = getMWorkoutDao();
        Workout workout4 = this.mWorkout;
        if (workout4 == null) {
            Intrinsics.XXO("mWorkout");
            workout4 = null;
        }
        mWorkoutDao.update(workout4);
        I01XX0.XIi00iiXO(I01XX0.IX1XiI, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View topPanel_delegate$lambda$0(SportDetailV2Activity sportDetailV2Activity) {
        return sportDetailV2Activity.findViewById(R.id.top_panel);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
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
        return (NestedScrollView) this.rootView$delegate.getValue();
    }

    @aa1
    public final SportDetailV2ChartFragment getSportDetailChartFragment() {
        SportDetailV2ChartFragment sportDetailV2ChartFragment = this.sportDetailChartFragment;
        if (sportDetailV2ChartFragment != null) {
            return sportDetailV2ChartFragment;
        }
        Intrinsics.XXO("sportDetailChartFragment");
        return null;
    }

    @aa1
    public final SportDetailV2MapFragment getSportDetailMapFragment() {
        SportDetailV2MapFragment sportDetailV2MapFragment = this.sportDetailMapFragment;
        if (sportDetailV2MapFragment != null) {
            return sportDetailV2MapFragment;
        }
        Intrinsics.XXO("sportDetailMapFragment");
        return null;
    }

    public final View getTopPanel() {
        return (View) this.topPanel$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Workout workoutById = getMWorkoutDao().getWorkoutById(getMArg1());
        this.mWorkout = workoutById;
        Workout workout = null;
        if (workoutById == null) {
            Intrinsics.XXO("mWorkout");
            workoutById = null;
        }
        LogUtils.m11128d(String.valueOf(workoutById));
        LocationDao mLocationDao = getMLocationDao();
        Workout workout2 = this.mWorkout;
        if (workout2 == null) {
            Intrinsics.XXO("mWorkout");
            workout2 = null;
        }
        long mStart = workout2.getMStart();
        Workout workout3 = this.mWorkout;
        if (workout3 == null) {
            Intrinsics.XXO("mWorkout");
        } else {
            workout = workout3;
        }
        List<Location> location = mLocationDao.getLocation(mStart, workout.getMEnd());
        this.isLocationEmpty = location.isEmpty() || location.size() < 2;
        initFragment();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public final void initFragment() {
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        int mArg1 = getMArg1();
        Workout workout = this.mWorkout;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", workout);
        BaseFragment baseFragment = (BaseFragment) SportDetailV2MapFragment.class.newInstance();
        baseFragment.setArguments(bundle);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2MapFragment");
        }
        setSportDetailMapFragment((SportDetailV2MapFragment) baseFragment);
        int mArg2 = getMArg1();
        Workout workout2 = this.mWorkout;
        if (workout2 == null) {
            Intrinsics.XXO("mWorkout");
            workout2 = null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", null);
        bundle2.putInt("mArg1", mArg2);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", workout2);
        BaseFragment baseFragment2 = (BaseFragment) SportDetailV2ChartFragment.class.newInstance();
        baseFragment2.setArguments(bundle2);
        if (baseFragment2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2ChartFragment");
        }
        setSportDetailChartFragment((SportDetailV2ChartFragment) baseFragment2);
        intiObserve();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        transparentStatusBar();
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_title_other_right);
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.ic_share_v2);
        getRootView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.android.mltcode.paycertificationapi.pw4
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                SportDetailV2Activity.initView$lambda$0(this.OXO1, view, i, i2, i3, i4);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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
        I0iiIOX i0iiIOX;
        if (EvaluationKt.isShowEvaluationDialog()) {
            int i = 2;
            if (getMWorkoutDao().getList().size() >= 2) {
                if (this.mEvaluationPopup == null) {
                    this.mEvaluationPopup = new I0iiIOX(this, 0, i, null);
                }
                I0iiIOX i0iiIOX2 = this.mEvaluationPopup;
                if ((i0iiIOX2 == null || !i0iiIOX2.isShowing()) && (i0iiIOX = this.mEvaluationPopup) != null) {
                    NestedScrollView rootView = getRootView();
                    Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                    i0iiIOX.XiOIO(rootView);
                }
            }
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showDeletePopup();
    }

    public final void onTitleRightOtherClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        View topPanel = getTopPanel();
        Intrinsics.O10IXXX0X(topPanel, "<get-topPanel>(...)");
        final Bitmap bitmapXIi00iiXO = xIi1i01O.XIi00iiXO(topPanel);
        getSportDetailChartFragment().showQCCode(new Function1() { // from class: com.android.mltcode.paycertificationapi.hw4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailV2Activity.onTitleRightOtherClick$lambda$0(this.f7223IO, bitmapXIi00iiXO, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setInitializationEvaluate(boolean z) {
        this.initializationEvaluate = z;
    }

    public final void setSportDetailChartFragment(@aa1 SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        Intrinsics.X0O(sportDetailV2ChartFragment, "<set-?>");
        this.sportDetailChartFragment = sportDetailV2ChartFragment;
    }

    public final void setSportDetailMapFragment(@aa1 SportDetailV2MapFragment sportDetailV2MapFragment) {
        Intrinsics.X0O(sportDetailV2MapFragment, "<set-?>");
        this.sportDetailMapFragment = sportDetailV2MapFragment;
    }

    @aa1
    public final String setTitle() {
        q62 q62Var = q62.OXO1;
        Workout workout = this.mWorkout;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        return q62Var.i01OOiI(workout.getMMode());
    }

    @sf5(tag = I01XX0.XXiO0i)
    public final void syncDapSportDetailExperience(int i) {
        Workout workout = this.mWorkout;
        Workout workout2 = null;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        workout.setMFeel(i);
        WorkoutDao mWorkoutDao = getMWorkoutDao();
        Workout workout3 = this.mWorkout;
        if (workout3 == null) {
            Intrinsics.XXO("mWorkout");
        } else {
            workout2 = workout3;
        }
        mWorkoutDao.update(workout2);
    }
}
