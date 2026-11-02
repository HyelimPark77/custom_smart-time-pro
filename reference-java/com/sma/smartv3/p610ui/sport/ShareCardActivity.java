package com.sma.smartv3.p610ui.sport;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.ShareCardActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nShareCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareCardActivity.kt\ncom/sma/smartv3/ui/sport/ShareCardActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,143:1\n104#2,9:144\n113#2,3:154\n99#2,3:157\n104#2,9:160\n113#2,3:170\n99#2,3:173\n104#2,9:176\n113#2,3:186\n99#2,3:189\n104#2,9:192\n113#2,3:202\n99#2,3:205\n104#2,9:208\n113#2,3:218\n99#2,3:221\n104#2,9:224\n113#2,3:234\n99#2,3:237\n104#2,9:240\n113#2,3:250\n99#2,3:253\n1#3:153\n1#3:169\n1#3:185\n1#3:201\n1#3:217\n1#3:233\n1#3:249\n37#4,2:256\n*S KotlinDebug\n*F\n+ 1 ShareCardActivity.kt\ncom/sma/smartv3/ui/sport/ShareCardActivity\n*L\n47#1:144,9\n47#1:154,3\n47#1:157,3\n48#1:160,9\n48#1:170,3\n48#1:173,3\n49#1:176,9\n49#1:186,3\n49#1:189,3\n50#1:192,9\n50#1:202,3\n50#1:205,3\n52#1:208,9\n52#1:218,3\n52#1:221,3\n53#1:224,9\n53#1:234,3\n53#1:237,3\n54#1:240,9\n54#1:250,3\n54#1:253,3\n47#1:153\n48#1:169\n49#1:185\n50#1:201\n52#1:217\n53#1:233\n54#1:249\n114#1:256,2\n*E\n"})
public final class ShareCardActivity extends BaseFragmentPagerActivity implements ViewPager.OnPageChangeListener {
    private DetailCaloriesCardFragment mDetailCaloriesCardFragment;
    private DetailCustomizeCardFragment mDetailCustomizeCardFragment;
    private DetailDataCardFragment mDetailDataCardFragment;
    private DetailMapCardFragment mDetailMapCardFragment;
    private DetailRouteCardFragment mDetailRouteCardFragment;
    private Workout mWorkout;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r84
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShareCardActivity.table_delegate$lambda$0(this.f10769IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s84
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShareCardActivity.abhTitleCenter_delegate$lambda$0(this.f10985IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t84
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShareCardActivity.abhTitleRight_delegate$lambda$0(this.f11214IO);
        }
    });

    @aa1
    private final Lazy mLocationDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u84
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShareCardActivity.mLocationDao_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.v84
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShareCardActivity.mWorkoutDao_delegate$lambda$0();
        }
    });
    private boolean isLocationEmpty = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(ShareCardActivity shareCardActivity) {
        return (PFMedium) shareCardActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(ShareCardActivity shareCardActivity) {
        return (ImageView) shareCardActivity.findViewById(R.id.abh_title_right);
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
    public static final TabLayout table_delegate$lambda$0(ShareCardActivity shareCardActivity) {
        return (TabLayout) shareCardActivity.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.mWorkout = getMWorkoutDao().getWorkoutById(getMArg1());
        LocationDao mLocationDao = getMLocationDao();
        Workout workout = this.mWorkout;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        long mStart = workout.getMStart();
        Workout workout2 = this.mWorkout;
        if (workout2 == null) {
            Intrinsics.XXO("mWorkout");
            workout2 = null;
        }
        List<Location> location = mLocationDao.getLocation(mStart, workout2.getMEnd());
        boolean z = location.isEmpty() || location.size() < 2;
        this.isLocationEmpty = z;
        if (z) {
            BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
            Workout workout3 = this.mWorkout;
            if (workout3 == null) {
                Intrinsics.XXO("mWorkout");
                workout3 = null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("mArg0", null);
            bundle2.putParcelable("mArg2", null);
            bundle2.putSerializable("mArg3", workout3);
            BaseFragment baseFragment = (BaseFragment) DetailDataCardFragment.class.newInstance();
            baseFragment.setArguments(bundle2);
            if (baseFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailDataCardFragment");
            }
            this.mDetailDataCardFragment = (DetailDataCardFragment) baseFragment;
            Workout workout4 = this.mWorkout;
            if (workout4 == null) {
                Intrinsics.XXO("mWorkout");
                workout4 = null;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("mArg0", null);
            bundle3.putParcelable("mArg2", null);
            bundle3.putSerializable("mArg3", workout4);
            BaseFragment baseFragment2 = (BaseFragment) DetailCaloriesCardFragment.class.newInstance();
            baseFragment2.setArguments(bundle3);
            if (baseFragment2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCaloriesCardFragment");
            }
            this.mDetailCaloriesCardFragment = (DetailCaloriesCardFragment) baseFragment2;
            Workout workout5 = this.mWorkout;
            if (workout5 == null) {
                Intrinsics.XXO("mWorkout");
                workout5 = null;
            }
            Bundle bundle4 = new Bundle();
            bundle4.putString("mArg0", null);
            bundle4.putParcelable("mArg2", null);
            bundle4.putSerializable("mArg3", workout5);
            BaseFragment baseFragment3 = (BaseFragment) DetailCustomizeCardFragment.class.newInstance();
            baseFragment3.setArguments(bundle4);
            if (baseFragment3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCustomizeCardFragment");
            }
            this.mDetailCustomizeCardFragment = (DetailCustomizeCardFragment) baseFragment3;
            return;
        }
        BaseFragment.OXO1 oxo2 = BaseFragment.Companion;
        Workout workout6 = this.mWorkout;
        if (workout6 == null) {
            Intrinsics.XXO("mWorkout");
            workout6 = null;
        }
        Bundle bundle5 = new Bundle();
        bundle5.putString("mArg0", null);
        bundle5.putParcelable("mArg2", null);
        bundle5.putSerializable("mArg3", workout6);
        BaseFragment baseFragment4 = (BaseFragment) DetailMapCardFragment.class.newInstance();
        baseFragment4.setArguments(bundle5);
        if (baseFragment4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailMapCardFragment");
        }
        this.mDetailMapCardFragment = (DetailMapCardFragment) baseFragment4;
        Workout workout7 = this.mWorkout;
        if (workout7 == null) {
            Intrinsics.XXO("mWorkout");
            workout7 = null;
        }
        Bundle bundle6 = new Bundle();
        bundle6.putString("mArg0", null);
        bundle6.putParcelable("mArg2", null);
        bundle6.putSerializable("mArg3", workout7);
        BaseFragment baseFragment5 = (BaseFragment) DetailCaloriesCardFragment.class.newInstance();
        baseFragment5.setArguments(bundle6);
        if (baseFragment5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCaloriesCardFragment");
        }
        this.mDetailCaloriesCardFragment = (DetailCaloriesCardFragment) baseFragment5;
        Workout workout8 = this.mWorkout;
        if (workout8 == null) {
            Intrinsics.XXO("mWorkout");
            workout8 = null;
        }
        Bundle bundle7 = new Bundle();
        bundle7.putString("mArg0", null);
        bundle7.putParcelable("mArg2", null);
        bundle7.putSerializable("mArg3", workout8);
        BaseFragment baseFragment6 = (BaseFragment) DetailRouteCardFragment.class.newInstance();
        baseFragment6.setArguments(bundle7);
        if (baseFragment6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailRouteCardFragment");
        }
        this.mDetailRouteCardFragment = (DetailRouteCardFragment) baseFragment6;
        Workout workout9 = this.mWorkout;
        if (workout9 == null) {
            Intrinsics.XXO("mWorkout");
            workout9 = null;
        }
        Bundle bundle8 = new Bundle();
        bundle8.putString("mArg0", null);
        bundle8.putParcelable("mArg2", null);
        bundle8.putSerializable("mArg3", workout9);
        BaseFragment baseFragment7 = (BaseFragment) DetailCustomizeCardFragment.class.newInstance();
        baseFragment7.setArguments(bundle8);
        if (baseFragment7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCustomizeCardFragment");
        }
        this.mDetailCustomizeCardFragment = (DetailCustomizeCardFragment) baseFragment7;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList arrayList = new ArrayList();
        DetailCustomizeCardFragment detailCustomizeCardFragment = null;
        if (this.isLocationEmpty) {
            DetailDataCardFragment detailDataCardFragment = this.mDetailDataCardFragment;
            if (detailDataCardFragment == null) {
                Intrinsics.XXO("mDetailDataCardFragment");
                detailDataCardFragment = null;
            }
            arrayList.add(detailDataCardFragment);
            DetailCaloriesCardFragment detailCaloriesCardFragment = this.mDetailCaloriesCardFragment;
            if (detailCaloriesCardFragment == null) {
                Intrinsics.XXO("mDetailCaloriesCardFragment");
                detailCaloriesCardFragment = null;
            }
            arrayList.add(detailCaloriesCardFragment);
            DetailCustomizeCardFragment detailCustomizeCardFragment2 = this.mDetailCustomizeCardFragment;
            if (detailCustomizeCardFragment2 == null) {
                Intrinsics.XXO("mDetailCustomizeCardFragment");
            } else {
                detailCustomizeCardFragment = detailCustomizeCardFragment2;
            }
            arrayList.add(detailCustomizeCardFragment);
            return arrayList;
        }
        DetailMapCardFragment detailMapCardFragment = this.mDetailMapCardFragment;
        if (detailMapCardFragment == null) {
            Intrinsics.XXO("mDetailMapCardFragment");
            detailMapCardFragment = null;
        }
        arrayList.add(detailMapCardFragment);
        DetailCaloriesCardFragment detailCaloriesCardFragment2 = this.mDetailCaloriesCardFragment;
        if (detailCaloriesCardFragment2 == null) {
            Intrinsics.XXO("mDetailCaloriesCardFragment");
            detailCaloriesCardFragment2 = null;
        }
        arrayList.add(detailCaloriesCardFragment2);
        DetailRouteCardFragment detailRouteCardFragment = this.mDetailRouteCardFragment;
        if (detailRouteCardFragment == null) {
            Intrinsics.XXO("mDetailRouteCardFragment");
            detailRouteCardFragment = null;
        }
        arrayList.add(detailRouteCardFragment);
        DetailCustomizeCardFragment detailCustomizeCardFragment3 = this.mDetailCustomizeCardFragment;
        if (detailCustomizeCardFragment3 == null) {
            Intrinsics.XXO("mDetailCustomizeCardFragment");
        } else {
            detailCustomizeCardFragment = detailCustomizeCardFragment3;
        }
        arrayList.add(detailCustomizeCardFragment);
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @SuppressLint({"SuspiciousIndentation"})
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.share));
        ArrayList arrayList = new ArrayList();
        if (this.isLocationEmpty) {
            String string = getString(R.string.data);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            arrayList.add(string);
            String string2 = getString(R.string.calories);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            arrayList.add(string2);
            String string3 = getString(R.string.eq_user);
            Intrinsics.O10IXXX0X(string3, "getString(...)");
            arrayList.add(string3);
        } else {
            String string4 = getString(R.string.map);
            Intrinsics.O10IXXX0X(string4, "getString(...)");
            arrayList.add(string4);
            String string5 = getString(R.string.calories);
            Intrinsics.O10IXXX0X(string5, "getString(...)");
            arrayList.add(string5);
            String string6 = getString(R.string.route);
            Intrinsics.O10IXXX0X(string6, "getString(...)");
            arrayList.add(string6);
            String string7 = getString(R.string.eq_user);
            Intrinsics.O10IXXX0X(string7, "getString(...)");
            arrayList.add(string7);
        }
        getMFragmentPagerAdapter().setTitles((CharSequence[]) arrayList.toArray(new String[0]));
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        getTable().setupWithViewPager(getMViewPager());
        getMViewPager().addOnPageChangeListener(this);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_share_map_card;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IOException {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = null;
        if (this.isLocationEmpty) {
            if (getMViewPager().getCurrentItem() == 1) {
                DetailDataCardFragment detailDataCardFragment = this.mDetailDataCardFragment;
                if (detailDataCardFragment == null) {
                    Intrinsics.XXO("mDetailDataCardFragment");
                } else {
                    fragment = detailDataCardFragment;
                }
                fragment.onActivityResult(i, i2, intent);
                return;
            }
            if (getMViewPager().getCurrentItem() == 2) {
                DetailCustomizeCardFragment detailCustomizeCardFragment = this.mDetailCustomizeCardFragment;
                if (detailCustomizeCardFragment == null) {
                    Intrinsics.XXO("mDetailCustomizeCardFragment");
                } else {
                    fragment = detailCustomizeCardFragment;
                }
                fragment.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        if (getMViewPager().getCurrentItem() == 2) {
            DetailRouteCardFragment detailRouteCardFragment = this.mDetailRouteCardFragment;
            if (detailRouteCardFragment == null) {
                Intrinsics.XXO("mDetailRouteCardFragment");
            } else {
                fragment = detailRouteCardFragment;
            }
            fragment.onActivityResult(i, i2, intent);
            return;
        }
        if (getMViewPager().getCurrentItem() == 3) {
            DetailCustomizeCardFragment detailCustomizeCardFragment2 = this.mDetailCustomizeCardFragment;
            if (detailCustomizeCardFragment2 == null) {
                Intrinsics.XXO("mDetailCustomizeCardFragment");
            } else {
                fragment = detailCustomizeCardFragment2;
            }
            fragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (i != 2 || this.isLocationEmpty) {
            return;
        }
        DetailRouteCardFragment detailRouteCardFragment = this.mDetailRouteCardFragment;
        if (detailRouteCardFragment == null) {
            Intrinsics.XXO("mDetailRouteCardFragment");
            detailRouteCardFragment = null;
        }
        detailRouteCardFragment.getSnapShot();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
