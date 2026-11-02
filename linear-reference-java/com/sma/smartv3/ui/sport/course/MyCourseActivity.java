package com.sma.smartv3.ui.sport.course;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.jl1;
import com.android.mltcode.paycertificationapi.qz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MyCourseActivity extends BaseActivity implements jl1 {
    protected BaseFragmentPagerAdapter mFragmentPagerAdapter;
    protected ViewPager mViewPager;

    @aa1
    private final Lazy table$delegate;

    public MyCourseActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new qz0(this));
    }

    public static /* synthetic */ TabLayout OIX0iXi(MyCourseActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    private static final TabLayout table_delegate$lambda$0(MyCourseActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    @aa1
    public final BaseFragmentPagerAdapter getMFragmentPagerAdapter() {
        BaseFragmentPagerAdapter r0 = this.mFragmentPagerAdapter;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mFragmentPagerAdapter");
        return null;
    }

    @aa1
    public final ViewPager getMViewPager() {
        ViewPager r0 = this.mViewPager;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mViewPager");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        return CollectionsKt__CollectionsKt.iXiX011(new MyHaveCourseFragment[]{new MyExerciseCourseFragment(), new MyCollectCourseFragment()});
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        if (r0 == null) goto L5;
        r0.setText("功能开发中..");
    L5:
        View r1 = findViewById(R.id.view_pager);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        setMViewPager((ViewPager) r1);
        BaseFragmentPagerAdapter r2 = new BaseFragmentPagerAdapter(this);
        getMViewPager().setAdapter(r2);
        getMViewPager().setOffscreenPageLimit(r2.getCount());
        setMFragmentPagerAdapter(r2);
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(new String[]{"已锻炼", "已收藏"});
        getTable().setupWithViewPager(getMViewPager());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_course_my;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public FragmentManager provideFragmentManager() {
        FragmentManager r0 = getSupportFragmentManager();
        Intrinsics.O10IXXX0X(r0, "getSupportFragmentManager(...)");
        return r0;
    }

    public final void setMFragmentPagerAdapter(@aa1 BaseFragmentPagerAdapter r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFragmentPagerAdapter = r2;
    }

    public final void setMViewPager(@aa1 ViewPager r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mViewPager = r2;
    }
}
