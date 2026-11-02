package com.sma.smartv3.ui.sport.course;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.X001;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ii0XX;
import com.android.mltcode.paycertificationapi.jl1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseIntroduceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseIntroduceActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseIntroduceActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1869#2:92\n1870#2:109\n104#3,9:93\n113#3,3:103\n99#3,3:106\n1#4:102\n*S KotlinDebug\n*F\n+ 1 CourseIntroduceActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseIntroduceActivity\n*L\n85#1:92\n85#1:109\n86#1:93,9\n86#1:103,3\n86#1:106,3\n86#1:102\n*E\n"})
public final class CourseIntroduceActivity extends BaseActivity implements jl1 {
    private int curPosition;
    private CourseDetails mCourseDetails;
    protected BaseFragmentPagerAdapter mFragmentPagerAdapter;

    @aa1
    private final Lazy mIntroduceCur$delegate;

    @aa1
    private final Lazy mViewPager$delegate;

    public CourseIntroduceActivity() {
        this.mViewPager$delegate = LazyKt__LazyJVMKt.iO(new X001(this));
        this.mIntroduceCur$delegate = LazyKt__LazyJVMKt.iO(new ii0XX(this));
    }

    public static /* synthetic */ TextView I0iXXO(CourseIntroduceActivity r0) {
        return mIntroduceCur_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewPager OIX0iXi(CourseIntroduceActivity r0) {
        return mViewPager_delegate$lambda$0(r0);
    }

    private final ViewPager getMViewPager() {
        return (ViewPager) getValue();
    }

    private static final TextView mIntroduceCur_delegate$lambda$0(CourseIntroduceActivity r1) {
        return (TextView) r1.findViewById(R.id.introduce_tv_cur);
    }

    private static final ViewPager mViewPager_delegate$lambda$0(CourseIntroduceActivity r1) {
        return (ViewPager) r1.findViewById(R.id.course_introduce_viewpager);
    }

    public final int getCurPosition() {
        return this.curPosition;
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

    public final TextView getMIntroduceCur() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        this.curPosition = getMArg1();
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.model.CourseDetails");
        this.mCourseDetails = (CourseDetails) r3;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList r0 = new ArrayList();
        CourseDetails r1 = this.mCourseDetails;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mCourseDetails");
        r1 = null;
    L5:
        Iterator<T> r2 = r1.getProgressMarkers().iterator();
    L7:
        if (r2.hasNext() == false) goto L13;
        ProgressMarkers r3 = (ProgressMarkers) r2.next();
        BaseFragment.OXO1 r4 = BaseFragment.Companion;
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r3);
        BaseFragment r6 = (BaseFragment) CourseIntroduceFragment.class.newInstance();
        r6.setArguments(r5);
        if (r6 == null) goto L12;
        r0.add((CourseIntroduceFragment) r6);
        goto L7
    L12:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.CourseIntroduceFragment");
    L13:
        return r0;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        BaseFragmentPagerAdapter r0 = new BaseFragmentPagerAdapter(this);
        getMViewPager().setAdapter(r0);
        getMViewPager().setOffscreenPageLimit(r0.getCount());
        setMFragmentPagerAdapter(r0);
        getMViewPager().addOnPageChangeListener(new AnonymousClass2(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_course_introduce;
    }

    public final void onBeforeIntroduce(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        int r3 = this.curPosition;
        if (r3 == 0) goto L5;
        this.curPosition = r3 - 1;
    L9:
        getMViewPager().setCurrentItem(this.curPosition);
        return;
    L5:
        CourseDetails r4 = this.mCourseDetails;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mCourseDetails");
        r4 = null;
    L8:
        this.curPosition = r4.getProgressMarkers().size() - 1;
        goto L9
    }

    public final void onNextIntroduce(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        int r3 = this.curPosition;
        CourseDetails r0 = this.mCourseDetails;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mCourseDetails");
        r0 = null;
    L6:
        if (r3 != (r0.getProgressMarkers().size() - 1)) goto L8;
        this.curPosition = 0;
    L9:
        getMViewPager().setCurrentItem(this.curPosition);
        return;
    L8:
        this.curPosition++;
        goto L9
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

    public final void setCurPosition(int r1) {
        this.curPosition = r1;
    }

    public final void setMFragmentPagerAdapter(@aa1 BaseFragmentPagerAdapter r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFragmentPagerAdapter = r2;
    }
}
