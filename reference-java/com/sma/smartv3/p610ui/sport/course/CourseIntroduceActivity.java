package com.sma.smartv3.p610ui.sport.course;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.jl1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.p610ui.sport.course.CourseIntroduceActivity;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseIntroduceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseIntroduceActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseIntroduceActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1869#2:92\n1870#2:109\n104#3,9:93\n113#3,3:103\n99#3,3:106\n1#4:102\n*S KotlinDebug\n*F\n+ 1 CourseIntroduceActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseIntroduceActivity\n*L\n85#1:92\n85#1:109\n86#1:93,9\n86#1:103,3\n86#1:106,3\n86#1:102\n*E\n"})
public final class CourseIntroduceActivity extends BaseActivity implements jl1 {
    private int curPosition;
    private CourseDetails mCourseDetails;
    protected BaseFragmentPagerAdapter mFragmentPagerAdapter;

    @aa1
    private final Lazy mViewPager$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X001
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseIntroduceActivity.mViewPager_delegate$lambda$0(this.f3856IO);
        }
    });

    @aa1
    private final Lazy mIntroduceCur$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0XX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseIntroduceActivity.mIntroduceCur_delegate$lambda$0(this.f8529IO);
        }
    });

    private final ViewPager getMViewPager() {
        return (ViewPager) this.mViewPager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mIntroduceCur_delegate$lambda$0(CourseIntroduceActivity courseIntroduceActivity) {
        return (TextView) courseIntroduceActivity.findViewById(R.id.introduce_tv_cur);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager mViewPager_delegate$lambda$0(CourseIntroduceActivity courseIntroduceActivity) {
        return (ViewPager) courseIntroduceActivity.findViewById(R.id.course_introduce_viewpager);
    }

    public final int getCurPosition() {
        return this.curPosition;
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

    public final TextView getMIntroduceCur() {
        return (TextView) this.mIntroduceCur$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.curPosition = getMArg1();
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.CourseDetails");
        this.mCourseDetails = (CourseDetails) mArg3;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList arrayList = new ArrayList();
        CourseDetails courseDetails = this.mCourseDetails;
        if (courseDetails == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails = null;
        }
        for (ProgressMarkers progressMarkers : courseDetails.getProgressMarkers()) {
            BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", null);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", progressMarkers);
            BaseFragment baseFragment = (BaseFragment) CourseIntroduceFragment.class.newInstance();
            baseFragment.setArguments(bundle);
            if (baseFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.CourseIntroduceFragment");
            }
            arrayList.add((CourseIntroduceFragment) baseFragment);
        }
        return arrayList;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        BaseFragmentPagerAdapter baseFragmentPagerAdapter = new BaseFragmentPagerAdapter(this);
        getMViewPager().setAdapter(baseFragmentPagerAdapter);
        getMViewPager().setOffscreenPageLimit(baseFragmentPagerAdapter.getCount());
        setMFragmentPagerAdapter(baseFragmentPagerAdapter);
        getMViewPager().addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sma.smartv3.ui.sport.course.CourseIntroduceActivity.initView.2
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                CourseIntroduceActivity.this.setCurPosition(i);
                CourseIntroduceActivity.this.getMIntroduceCur().setText(String.valueOf(CourseIntroduceActivity.this.getCurPosition() + 1));
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_course_introduce;
    }

    public final void onBeforeIntroduce(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int i = this.curPosition;
        if (i != 0) {
            this.curPosition = i - 1;
        } else {
            CourseDetails courseDetails = this.mCourseDetails;
            if (courseDetails == null) {
                Intrinsics.XXO("mCourseDetails");
                courseDetails = null;
            }
            this.curPosition = courseDetails.getProgressMarkers().size() - 1;
        }
        getMViewPager().setCurrentItem(this.curPosition);
    }

    public final void onNextIntroduce(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int i = this.curPosition;
        CourseDetails courseDetails = this.mCourseDetails;
        if (courseDetails == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails = null;
        }
        if (i == courseDetails.getProgressMarkers().size() - 1) {
            this.curPosition = 0;
        } else {
            this.curPosition++;
        }
        getMViewPager().setCurrentItem(this.curPosition);
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

    public final void setCurPosition(int i) {
        this.curPosition = i;
    }

    public final void setMFragmentPagerAdapter(@aa1 BaseFragmentPagerAdapter baseFragmentPagerAdapter) {
        Intrinsics.X0O(baseFragmentPagerAdapter, "<set-?>");
        this.mFragmentPagerAdapter = baseFragmentPagerAdapter;
    }
}
