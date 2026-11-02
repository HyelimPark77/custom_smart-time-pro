package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentCourseIntroduceBinding implements ViewBinding {

    @NonNull
    public final TextView itemSpecialCourseIntroduce;

    @NonNull
    public final ImageView itemSpecialCoursePic;

    @NonNull
    public final TextView itemSpecialCourseTitle;

    @NonNull
    private final LinearLayout rootView;

    private FragmentCourseIntroduceBinding(@NonNull LinearLayout rootView, @NonNull TextView itemSpecialCourseIntroduce, @NonNull ImageView itemSpecialCoursePic, @NonNull TextView itemSpecialCourseTitle) {
        this.rootView = rootView;
        this.itemSpecialCourseIntroduce = itemSpecialCourseIntroduce;
        this.itemSpecialCoursePic = itemSpecialCoursePic;
        this.itemSpecialCourseTitle = itemSpecialCourseTitle;
    }

    @NonNull
    public static FragmentCourseIntroduceBinding bind(@NonNull View rootView) {
        int i = R.id.item_special_course_introduce;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_introduce);
        if (textView != null) {
            i = R.id.item_special_course_pic;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_pic);
            if (imageView != null) {
                i = R.id.item_special_course_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_title);
                if (textView2 != null) {
                    return new FragmentCourseIntroduceBinding((LinearLayout) rootView, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCourseIntroduceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentCourseIntroduceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_course_introduce, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
