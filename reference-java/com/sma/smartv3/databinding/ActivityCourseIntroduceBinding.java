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
        int i = R.id.beforeIntroduce;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeIntroduce);
        if (imageButton != null) {
            i = R.id.course_introduce_viewpager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.course_introduce_viewpager);
            if (viewPager != null) {
                i = R.id.introduce_bottom_layout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.introduce_bottom_layout);
                if (relativeLayout != null) {
                    i = R.id.introduce_tv_cur;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.introduce_tv_cur);
                    if (textView != null) {
                        i = R.id.nextIntroduce;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextIntroduce);
                        if (imageButton2 != null) {
                            return new ActivityCourseIntroduceBinding((RelativeLayout) rootView, imageButton, viewPager, relativeLayout, textView, imageButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCourseIntroduceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCourseIntroduceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_course_introduce, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
