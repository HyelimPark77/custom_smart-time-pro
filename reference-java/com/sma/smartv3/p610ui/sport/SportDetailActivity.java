package com.sma.smartv3.p610ui.sport;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.q62;
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
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p608db.entity.WorkoutIndex;
import com.sma.smartv3.p610ui.sport.SportDetailActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailActivity.kt\ncom/sma/smartv3/ui/sport/SportDetailActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n104#2,9:171\n113#2,3:181\n99#2,3:184\n104#2,9:187\n113#2,3:197\n99#2,3:200\n104#2,9:203\n113#2,3:213\n99#2,3:216\n1#3:180\n1#3:196\n1#3:212\n37#4,2:219\n*S KotlinDebug\n*F\n+ 1 SportDetailActivity.kt\ncom/sma/smartv3/ui/sport/SportDetailActivity\n*L\n60#1:171,9\n60#1:181,3\n60#1:184,3\n61#1:187,9\n61#1:197,3\n61#1:200,3\n62#1:203,9\n62#1:213,3\n62#1:216,3\n60#1:180\n61#1:196\n62#1:212\n89#1:219,2\n*E\n"})
public final class SportDetailActivity extends BaseFragmentPagerActivity {
    private Workout mWorkout;
    public SportDetailChartFragment sportDetailChartFragment;
    public SportDetailFragment sportDetailFragment;
    public SportDetailMapFragment sportDetailMapFragment;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ks4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailActivity.table_delegate$lambda$0(this.f9273IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ls4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailActivity.abhTitleCenter_delegate$lambda$0(this.f9507IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ms4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailActivity.abhTitleRight_delegate$lambda$0(this.f9776IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ns4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailActivity.abhTitleOtherRight_delegate$lambda$0(this.f10007IO);
        }
    });

    @aa1
    private final Lazy topPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.os4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailActivity.topPanel_delegate$lambda$0(this.f10213IO);
        }
    });

    @aa1
    private final Lazy mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ps4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailActivity.mWorkoutDao_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy mLocationDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qs4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailActivity.mLocationDao_delegate$lambda$0();
        }
    });
    private boolean isLocationEmpty = true;

    public static final class OXO1 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ WorkoutIndex f54766IO;

        public OXO1(WorkoutIndex workoutIndex) {
            this.f54766IO = workoutIndex;
        }

        public static final Unit XIi00iiXO(WorkoutIndex workoutIndex, boolean z) {
            if (!z) {
                MyDb.INSTANCE.getMDatabase().workoutIndexDao().insert(workoutIndex);
            }
            return Unit.OXO1;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            final WorkoutIndex workoutIndex = this.f54766IO;
            XXI0Xi.XOO0ii0(app, workoutIndex, new Function1() { // from class: com.android.mltcode.paycertificationapi.rs4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailActivity.OXO1.XIi00iiXO(workoutIndex, ((Boolean) obj).booleanValue());
                }
            });
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(SportDetailActivity sportDetailActivity) {
        return (PFMedium) sportDetailActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(SportDetailActivity sportDetailActivity) {
        return (ImageView) sportDetailActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(SportDetailActivity sportDetailActivity) {
        return (ImageView) sportDetailActivity.findViewById(R.id.abh_title_right);
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) this.mLocationDao$delegate.getValue();
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) this.mWorkoutDao$delegate.getValue();
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
    public static final TabLayout table_delegate$lambda$0(SportDetailActivity sportDetailActivity) {
        return (TabLayout) sportDetailActivity.findViewById(R.id.table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View topPanel_delegate$lambda$0(SportDetailActivity sportDetailActivity) {
        return sportDetailActivity.findViewById(R.id.top_panel);
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

    @aa1
    public final SportDetailChartFragment getSportDetailChartFragment() {
        SportDetailChartFragment sportDetailChartFragment = this.sportDetailChartFragment;
        if (sportDetailChartFragment != null) {
            return sportDetailChartFragment;
        }
        Intrinsics.XXO("sportDetailChartFragment");
        return null;
    }

    @aa1
    public final SportDetailFragment getSportDetailFragment() {
        SportDetailFragment sportDetailFragment = this.sportDetailFragment;
        if (sportDetailFragment != null) {
            return sportDetailFragment;
        }
        Intrinsics.XXO("sportDetailFragment");
        return null;
    }

    @aa1
    public final SportDetailMapFragment getSportDetailMapFragment() {
        SportDetailMapFragment sportDetailMapFragment = this.sportDetailMapFragment;
        if (sportDetailMapFragment != null) {
            return sportDetailMapFragment;
        }
        Intrinsics.XXO("sportDetailMapFragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
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

    public final void initFragment() {
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        Workout workout = this.mWorkout;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", workout);
        BaseFragment baseFragment = (BaseFragment) SportDetailMapFragment.class.newInstance();
        baseFragment.setArguments(bundle);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailMapFragment");
        }
        setSportDetailMapFragment((SportDetailMapFragment) baseFragment);
        Workout workout2 = this.mWorkout;
        if (workout2 == null) {
            Intrinsics.XXO("mWorkout");
            workout2 = null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", null);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", workout2);
        BaseFragment baseFragment2 = (BaseFragment) SportDetailChartFragment.class.newInstance();
        baseFragment2.setArguments(bundle2);
        if (baseFragment2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailChartFragment");
        }
        setSportDetailChartFragment((SportDetailChartFragment) baseFragment2);
        Workout workout3 = this.mWorkout;
        if (workout3 == null) {
            Intrinsics.XXO("mWorkout");
            workout3 = null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("mArg0", null);
        bundle3.putParcelable("mArg2", null);
        bundle3.putSerializable("mArg3", workout3);
        BaseFragment baseFragment3 = (BaseFragment) SportDetailFragment.class.newInstance();
        baseFragment3.setArguments(bundle3);
        if (baseFragment3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailFragment");
        }
        setSportDetailFragment((SportDetailFragment) baseFragment3);
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList arrayList = new ArrayList();
        if (!this.isLocationEmpty) {
            arrayList.add(getSportDetailMapFragment());
        }
        arrayList.add(getSportDetailChartFragment());
        arrayList.add(getSportDetailFragment());
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_share);
        ArrayList arrayList = new ArrayList();
        if (!this.isLocationEmpty) {
            String string = getString(R.string.track);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            arrayList.add(string);
        }
        String string2 = getString(R.string.chart);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        arrayList.add(string2);
        String string3 = getString(R.string.detail);
        Intrinsics.O10IXXX0X(string3, "getString(...)");
        arrayList.add(string3);
        getMFragmentPagerAdapter().setTitles((CharSequence[]) arrayList.toArray(new String[0]));
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        getTable().setupWithViewPager(getMViewPager());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_detail;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        View topPanel = getTopPanel();
        Intrinsics.O10IXXX0X(topPanel, "<get-topPanel>(...)");
        Bitmap bitmapXIi00iiXO = xIi1i01O.XIi00iiXO(topPanel);
        if (getSportDetailMapFragment().getUserVisibleHint() && !this.isLocationEmpty) {
            getSportDetailMapFragment().share(bitmapXIi00iiXO);
            return;
        }
        if (getSportDetailChartFragment().getUserVisibleHint()) {
            getSportDetailChartFragment().share();
            share(bitmapXIi00iiXO);
        } else if (getSportDetailFragment().getUserVisibleHint()) {
            getSportDetailFragment().share();
            share(bitmapXIi00iiXO);
        }
    }

    public final void setSportDetailChartFragment(@aa1 SportDetailChartFragment sportDetailChartFragment) {
        Intrinsics.X0O(sportDetailChartFragment, "<set-?>");
        this.sportDetailChartFragment = sportDetailChartFragment;
    }

    public final void setSportDetailFragment(@aa1 SportDetailFragment sportDetailFragment) {
        Intrinsics.X0O(sportDetailFragment, "<set-?>");
        this.sportDetailFragment = sportDetailFragment;
    }

    public final void setSportDetailMapFragment(@aa1 SportDetailMapFragment sportDetailMapFragment) {
        Intrinsics.X0O(sportDetailMapFragment, "<set-?>");
        this.sportDetailMapFragment = sportDetailMapFragment;
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

    public final void share(@aa1 Bitmap topBitmap) {
        Intrinsics.X0O(topBitmap, "topBitmap");
        Bitmap bitmap = ImageUtils.getBitmap(uz0.XOX0O0(sz0.OXO1));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(topBitmap.getWidth(), topBitmap.getHeight() + bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(topBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap, 0.0f, topBitmap.getHeight(), (Paint) null);
        XIi1i01O.OXO1.XO0O10(this, bitmapCreateBitmap);
    }

    public final void testUploadStrava() {
        Workout workout = this.mWorkout;
        Workout workout2 = null;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        int mMode = workout.getMMode();
        Workout workout3 = this.mWorkout;
        if (workout3 == null) {
            Intrinsics.XXO("mWorkout");
        } else {
            workout2 = workout3;
        }
        ThreadUtils.executeByIo(new OXO1(new WorkoutIndex(0, 2, workout2.getMEnd(), mMode, 0, 17, null)));
    }
}
