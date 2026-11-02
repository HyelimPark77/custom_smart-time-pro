package com.sma.smartv3.ui.status;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gy6;
import com.android.mltcode.paycertificationapi.hy6;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iy6;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.fragment.WeightHistoryFragment;
import com.sma.smartv3.ui.status.fragment.WeightMeasureFragment;
import com.sma.smartv3.ui.status.fragment.WeightRecordsFragment;
import com.sma.smartv3.view.NoScollViewPager;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class WeightActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy table$delegate;
    public WeightHistoryFragment weightHistoryFragment;
    public WeightMeasureFragment weightMeasureFragment;
    public WeightRecordsFragment weightRecordsFragment;

    public WeightActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new gy6(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new hy6(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new iy6(this));
    }

    public static /* synthetic */ TabLayout I0iXXO(WeightActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(WeightActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XXI(WeightActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(WeightActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(WeightActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private static final TabLayout table_delegate$lambda$0(WeightActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @aa1
    public final WeightHistoryFragment getWeightHistoryFragment() {
        WeightHistoryFragment r0 = this.weightHistoryFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("weightHistoryFragment");
        return null;
    }

    @aa1
    public final WeightMeasureFragment getWeightMeasureFragment() {
        WeightMeasureFragment r0 = this.weightMeasureFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("weightMeasureFragment");
        return null;
    }

    @aa1
    public final WeightRecordsFragment getWeightRecordsFragment() {
        WeightRecordsFragment r0 = this.weightRecordsFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("weightRecordsFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
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
        return CollectionsKt__CollectionsKt.iXiX011(new Fragment[]{getWeightRecordsFragment(), getWeightMeasureFragment(), getWeightHistoryFragment()});
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        TabLayout r0 = getTable();
        if (i72.OXO1.i0O() == false) goto L5;
        int r1 = 0;
    L6:
        r0.setVisibility(r1);
        findViewById(R.id.line).setVisibility(getTable().getVisibility());
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_share);
        getTable().setupWithViewPager(getMViewPager());
        TabLayout r2 = getTable();
        r2.setSelectedTabIndicatorHeight(0);
        TabLayout.Tab r3 = r2.getTabAt(0);
        if (r3 == null) goto L9;
        r3.setIcon(R.drawable.selector_weight_tab_record);
    L9:
        TabLayout.Tab r4 = r2.getTabAt(1);
        if (r4 == null) goto L12;
        r4.setIcon(R.drawable.selector_weight_tab_measure);
    L12:
        TabLayout.Tab r5 = r2.getTabAt(2);
        if (r5 == null) goto L15;
        r5.setIcon(R.drawable.selector_weight_tab_history);
    L15:
        ViewPager r6 = getMViewPager();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type com.sma.smartv3.view.NoScollViewPager");
        ((NoScollViewPager) r6).setCanScoll(false);
        return;
    L5:
        r1 = 8;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_status_weight;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (getWeightRecordsFragment().getUserVisibleHint() == false) goto L7;
        getWeightRecordsFragment().share();
        return;
    L7:
        if (getWeightMeasureFragment().getUserVisibleHint() == false) goto L11;
        getWeightMeasureFragment().share();
        return;
    L11:
        if (getWeightHistoryFragment().getUserVisibleHint() == false) goto L14;
        getWeightHistoryFragment().share();
        return;
    }

    @aa1
    public final String setTitle() {
        String r0 = getString(R.string.weight);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }

    public final void setWeightHistoryFragment(@aa1 WeightHistoryFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weightHistoryFragment = r2;
    }

    public final void setWeightMeasureFragment(@aa1 WeightMeasureFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weightMeasureFragment = r2;
    }

    public final void setWeightRecordsFragment(@aa1 WeightRecordsFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weightRecordsFragment = r2;
    }
}
