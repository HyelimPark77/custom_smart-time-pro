package com.sma.smartv3.ui.sport;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.wz4;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportGoalSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalSetActivity.kt\ncom/sma/smartv3/ui/sport/SportGoalSetActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n104#2,9:56\n113#2,3:66\n99#2,3:69\n104#2,9:72\n113#2,3:82\n99#2,3:85\n104#2,9:88\n113#2,3:98\n99#2,3:101\n1#3:65\n1#3:81\n1#3:97\n*S KotlinDebug\n*F\n+ 1 SportGoalSetActivity.kt\ncom/sma/smartv3/ui/sport/SportGoalSetActivity\n*L\n26#1:56,9\n26#1:66,3\n26#1:69,3\n27#1:72,9\n27#1:82,3\n27#1:85,3\n28#1:88,9\n28#1:98,3\n28#1:101,3\n26#1:65\n27#1:81\n28#1:97\n*E\n"})
public final class SportGoalSetActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy table$delegate;

    public SportGoalSetActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new wz4(this));
    }

    public static /* synthetic */ TabLayout OIX0iXi(SportGoalSetActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    private final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    private static final TabLayout table_delegate$lambda$0(SportGoalSetActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        BaseFragment.OXO1 r0 = BaseFragment.Companion;
        int r1 = getMArg1();
        Bundle r2 = new Bundle();
        r2.putString("mArg0", null);
        r2.putInt("mArg1", r1);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        BaseFragment r6 = (BaseFragment) SportGoalDistanceFragment.class.newInstance();
        r6.setArguments(r2);
        if (r6 == null) goto L15;
        SportGoalDistanceFragment r7 = (SportGoalDistanceFragment) r6;
        int r3 = getMArg1();
        Bundle r8 = new Bundle();
        r8.putString("mArg0", null);
        r8.putInt("mArg1", r3);
        r8.putParcelable("mArg2", null);
        r8.putSerializable("mArg3", null);
        BaseFragment r4 = (BaseFragment) SportGoalTimeFragment.class.newInstance();
        r4.setArguments(r8);
        if (r4 == null) goto L13;
        SportGoalTimeFragment r5 = (SportGoalTimeFragment) r4;
        int r9 = getMArg1();
        Bundle r10 = new Bundle();
        r10.putString("mArg0", null);
        r10.putInt("mArg1", r9);
        r10.putParcelable("mArg2", null);
        r10.putSerializable("mArg3", null);
        BaseFragment r11 = (BaseFragment) SportGoalCaloriesFragment.class.newInstance();
        r11.setArguments(r10);
        if (r11 == null) goto L11;
        return CollectionsKt__CollectionsKt.iXiX011(new Fragment[]{r7, r5, (SportGoalCaloriesFragment) r11});
    L11:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportGoalCaloriesFragment");
    L13:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportGoalTimeFragment");
    L15:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportGoalDistanceFragment");
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((PFMedium) findViewById(R.id.abh_title_center)).setText(R.string.set_goals);
        getMFragmentPagerAdapter().setTitles(new String[]{getString(R.string.distance), getString(R.string.time), getString(R.string.calories)});
        getTable().setBackgroundColor(gk4.iO(this, R.color.view_page_tablayout_bg));
        getTable().setupWithViewPager(getMViewPager());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_goal_set;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
