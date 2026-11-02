package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCourseIntroduceBinding implements ViewBinding {

    @NonNull
    public final ImageButton beforeIntroduce;

    @NonNull
    public final ViewPager courseIntroduceViewpager;

    @NonNull
    public final RelativeLayout introduceBottomLayout;

    @NonNull
    public final TextView introduceTvCur;

    @NonNull
    public final ImageButton nextIntroduce;

    @NonNull
    private final RelativeLayout rootView;

    private ActivityCourseIntroduceBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton beforeIntroduce, @NonNull ViewPager courseIntroduceViewpager, @NonNull RelativeLayout introduceBottomLayout, @NonNull TextView introduceTvCur, @NonNull ImageButton nextIntroduce) {
        this.rootView = rootView;
        this.beforeIntroduce = beforeIntroduce;
        this.courseIntroduceViewpager = courseIntroduceViewpager;
        this.introduceBottomLayout = introduceBottomLayout;
        this.introduceTvCur = introduceTvCur;
        this.nextIntroduce = nextIntroduce;
    }

    @NonNull
    public static ActivityCourseIntroduceBinding bind(@NonNull View rootView) {
        int r0 = R.id.beforeIntroduce;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeIntroduce);
        if (r4 == null) goto L15;
        r0 = R.id.course_introduce_viewpager;
        ViewPager r5 = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.course_introduce_viewpager);
        if (r5 == null) goto L15;
        r0 = R.id.introduce_bottom_layout;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.introduce_bottom_layout);
        if (r6 == null) goto L15;
        r0 = R.id.introduce_tv_cur;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.introduce_tv_cur);
        if (r7 == null) goto L15;
        r0 = R.id.nextIntroduce;
        ImageButton r8 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextIntroduce);
        if (r8 == null) goto L15;
        return new ActivityCourseIntroduceBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCourseIntroduceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCourseIntroduceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_course_introduce, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
