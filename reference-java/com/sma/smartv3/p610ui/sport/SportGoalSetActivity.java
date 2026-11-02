package com.sma.smartv3.p610ui.sport;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p610ui.sport.SportGoalSetActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportGoalSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalSetActivity.kt\ncom/sma/smartv3/ui/sport/SportGoalSetActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n104#2,9:56\n113#2,3:66\n99#2,3:69\n104#2,9:72\n113#2,3:82\n99#2,3:85\n104#2,9:88\n113#2,3:98\n99#2,3:101\n1#3:65\n1#3:81\n1#3:97\n*S KotlinDebug\n*F\n+ 1 SportGoalSetActivity.kt\ncom/sma/smartv3/ui/sport/SportGoalSetActivity\n*L\n26#1:56,9\n26#1:66,3\n26#1:69,3\n27#1:72,9\n27#1:82,3\n27#1:85,3\n28#1:88,9\n28#1:98,3\n28#1:101,3\n26#1:65\n27#1:81\n28#1:97\n*E\n"})
public final class SportGoalSetActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportGoalSetActivity.table_delegate$lambda$0(this.f12078IO);
        }
    });

    private final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(SportGoalSetActivity sportGoalSetActivity) {
        return (TabLayout) sportGoalSetActivity.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        int mArg1 = getMArg1();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        BaseFragment baseFragment = (BaseFragment) SportGoalDistanceFragment.class.newInstance();
        baseFragment.setArguments(bundle);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportGoalDistanceFragment");
        }
        SportGoalDistanceFragment sportGoalDistanceFragment = (SportGoalDistanceFragment) baseFragment;
        int mArg2 = getMArg1();
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", null);
        bundle2.putInt("mArg1", mArg2);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", null);
        BaseFragment baseFragment2 = (BaseFragment) SportGoalTimeFragment.class.newInstance();
        baseFragment2.setArguments(bundle2);
        if (baseFragment2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportGoalTimeFragment");
        }
        SportGoalTimeFragment sportGoalTimeFragment = (SportGoalTimeFragment) baseFragment2;
        int mArg3 = getMArg1();
        Bundle bundle3 = new Bundle();
        bundle3.putString("mArg0", null);
        bundle3.putInt("mArg1", mArg3);
        bundle3.putParcelable("mArg2", null);
        bundle3.putSerializable("mArg3", null);
        BaseFragment baseFragment3 = (BaseFragment) SportGoalCaloriesFragment.class.newInstance();
        baseFragment3.setArguments(bundle3);
        if (baseFragment3 != null) {
            return CollectionsKt__CollectionsKt.iXiX011(sportGoalDistanceFragment, sportGoalTimeFragment, (SportGoalCaloriesFragment) baseFragment3);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportGoalCaloriesFragment");
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((PFMedium) findViewById(R.id.abh_title_center)).setText(R.string.set_goals);
        getMFragmentPagerAdapter().setTitles(new String[]{getString(R.string.distance), getString(R.string.time), getString(R.string.calories)});
        getTable().setBackgroundColor(gk4.m1859iO(this, R.color.view_page_tablayout_bg));
        getTable().setupWithViewPager(getMViewPager());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_goal_set;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
