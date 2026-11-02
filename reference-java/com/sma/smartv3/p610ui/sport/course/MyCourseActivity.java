package com.sma.smartv3.p610ui.sport.course;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.jl1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p610ui.sport.course.MyCourseActivity;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MyCourseActivity extends BaseActivity implements jl1 {
    protected BaseFragmentPagerAdapter mFragmentPagerAdapter;
    protected ViewPager mViewPager;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qz0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MyCourseActivity.table_delegate$lambda$0(this.f10713IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(MyCourseActivity myCourseActivity) {
        return (TabLayout) myCourseActivity.findViewById(R.id.table);
    }

    @aa1
    public final BaseFragmentPagerAdapter getMFragmentPagerAdapter() {
        BaseFragmentPagerAdapter baseFragmentPagerAdapter = this.mFragmentPagerAdapter;
        if (baseFragmentPagerAdapter != null) {
            return baseFragmentPagerAdapter;
        }
        Intrinsics.XXO("mFragmentPagerAdapter");
        return null;
    }

    @aa1
    public final ViewPager getMViewPager() {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            return viewPager;
        }
        Intrinsics.XXO("mViewPager");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        return CollectionsKt__CollectionsKt.iXiX011(new MyExerciseCourseFragment(), new MyCollectCourseFragment());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        TextView textView = (TextView) findViewById(R.id.abh_title_center);
        if (textView != null) {
            textView.setText("功能开发中..");
        }
        View viewFindViewById = findViewById(R.id.view_pager);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        setMViewPager((ViewPager) viewFindViewById);
        BaseFragmentPagerAdapter baseFragmentPagerAdapter = new BaseFragmentPagerAdapter(this);
        getMViewPager().setAdapter(baseFragmentPagerAdapter);
        getMViewPager().setOffscreenPageLimit(baseFragmentPagerAdapter.getCount());
        setMFragmentPagerAdapter(baseFragmentPagerAdapter);
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(new String[]{"已锻炼", "已收藏"});
        getTable().setupWithViewPager(getMViewPager());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_course_my;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public FragmentManager provideFragmentManager() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.O10IXXX0X(supportFragmentManager, "getSupportFragmentManager(...)");
        return supportFragmentManager;
    }

    public final void setMFragmentPagerAdapter(@aa1 BaseFragmentPagerAdapter baseFragmentPagerAdapter) {
        Intrinsics.X0O(baseFragmentPagerAdapter, "<set-?>");
        this.mFragmentPagerAdapter = baseFragmentPagerAdapter;
    }

    public final void setMViewPager(@aa1 ViewPager viewPager) {
        Intrinsics.X0O(viewPager, "<set-?>");
        this.mViewPager = viewPager;
    }
}
