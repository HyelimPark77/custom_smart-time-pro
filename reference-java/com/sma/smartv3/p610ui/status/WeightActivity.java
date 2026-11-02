package com.sma.smartv3.p610ui.status;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p610ui.status.WeightActivity;
import com.sma.smartv3.p610ui.status.fragment.WeightHistoryFragment;
import com.sma.smartv3.p610ui.status.fragment.WeightMeasureFragment;
import com.sma.smartv3.p610ui.status.fragment.WeightRecordsFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.NoScollViewPager;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class WeightActivity extends BaseFragmentPagerActivity {
    public WeightHistoryFragment weightHistoryFragment;
    public WeightMeasureFragment weightMeasureFragment;
    public WeightRecordsFragment weightRecordsFragment;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gy6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightActivity.table_delegate$lambda$0(this.f6995IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hy6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightActivity.abhTitleCenter_delegate$lambda$0(this.f7241IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iy6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightActivity.abhTitleRight_delegate$lambda$0(this.f8797IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(WeightActivity weightActivity) {
        return (PFMedium) weightActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(WeightActivity weightActivity) {
        return (ImageView) weightActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(WeightActivity weightActivity) {
        return (TabLayout) weightActivity.findViewById(R.id.table);
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

    @aa1
    public final WeightHistoryFragment getWeightHistoryFragment() {
        WeightHistoryFragment weightHistoryFragment = this.weightHistoryFragment;
        if (weightHistoryFragment != null) {
            return weightHistoryFragment;
        }
        Intrinsics.XXO("weightHistoryFragment");
        return null;
    }

    @aa1
    public final WeightMeasureFragment getWeightMeasureFragment() {
        WeightMeasureFragment weightMeasureFragment = this.weightMeasureFragment;
        if (weightMeasureFragment != null) {
            return weightMeasureFragment;
        }
        Intrinsics.XXO("weightMeasureFragment");
        return null;
    }

    @aa1
    public final WeightRecordsFragment getWeightRecordsFragment() {
        WeightRecordsFragment weightRecordsFragment = this.weightRecordsFragment;
        if (weightRecordsFragment != null) {
            return weightRecordsFragment;
        }
        Intrinsics.XXO("weightRecordsFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        initFragment();
    }

    public final void initFragment() {
        setWeightRecordsFragment(new WeightRecordsFragment());
        setWeightMeasureFragment(new WeightMeasureFragment());
        setWeightHistoryFragment(new WeightHistoryFragment());
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        return CollectionsKt__CollectionsKt.iXiX011(getWeightRecordsFragment(), getWeightMeasureFragment(), getWeightHistoryFragment());
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTable().setVisibility(i72.OXO1.i0O() ? 0 : 8);
        findViewById(R.id.line).setVisibility(getTable().getVisibility());
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_share);
        getTable().setupWithViewPager(getMViewPager());
        TabLayout table = getTable();
        table.setSelectedTabIndicatorHeight(0);
        TabLayout.Tab tabAt = table.getTabAt(0);
        if (tabAt != null) {
            tabAt.setIcon(R.drawable.selector_weight_tab_record);
        }
        TabLayout.Tab tabAt2 = table.getTabAt(1);
        if (tabAt2 != null) {
            tabAt2.setIcon(R.drawable.selector_weight_tab_measure);
        }
        TabLayout.Tab tabAt3 = table.getTabAt(2);
        if (tabAt3 != null) {
            tabAt3.setIcon(R.drawable.selector_weight_tab_history);
        }
        ViewPager mViewPager = getMViewPager();
        Intrinsics.X1ii(mViewPager, "null cannot be cast to non-null type com.sma.smartv3.view.NoScollViewPager");
        ((NoScollViewPager) mViewPager).setCanScoll(false);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_status_weight;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getWeightRecordsFragment().getUserVisibleHint()) {
            getWeightRecordsFragment().share();
        } else if (getWeightMeasureFragment().getUserVisibleHint()) {
            getWeightMeasureFragment().share();
        } else if (getWeightHistoryFragment().getUserVisibleHint()) {
            getWeightHistoryFragment().share();
        }
    }

    @aa1
    public final String setTitle() {
        String string = getString(R.string.weight);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }

    public final void setWeightHistoryFragment(@aa1 WeightHistoryFragment weightHistoryFragment) {
        Intrinsics.X0O(weightHistoryFragment, "<set-?>");
        this.weightHistoryFragment = weightHistoryFragment;
    }

    public final void setWeightMeasureFragment(@aa1 WeightMeasureFragment weightMeasureFragment) {
        Intrinsics.X0O(weightMeasureFragment, "<set-?>");
        this.weightMeasureFragment = weightMeasureFragment;
    }

    public final void setWeightRecordsFragment(@aa1 WeightRecordsFragment weightRecordsFragment) {
        Intrinsics.X0O(weightRecordsFragment, "<set-?>");
        this.weightRecordsFragment = weightRecordsFragment;
    }
}
