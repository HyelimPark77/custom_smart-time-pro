package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemActionCourseBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemSpecialCourseIntro;

    @NonNull
    public final RelativeLayout itemSpecialCourseLayout;

    @NonNull
    public final TextView itemSpecialCourseName;

    @NonNull
    public final ImageView itemSpecialCoursePic;

    @NonNull
    public final View itemSpecialCourseView;

    @NonNull
    private final RelativeLayout rootView;

    private ItemActionCourseBinding(@NonNull RelativeLayout rootView, @NonNull PFMedium itemSpecialCourseIntro, @NonNull RelativeLayout itemSpecialCourseLayout, @NonNull TextView itemSpecialCourseName, @NonNull ImageView itemSpecialCoursePic, @NonNull View itemSpecialCourseView) {
        this.rootView = rootView;
        this.itemSpecialCourseIntro = itemSpecialCourseIntro;
        this.itemSpecialCourseLayout = itemSpecialCourseLayout;
        this.itemSpecialCourseName = itemSpecialCourseName;
        this.itemSpecialCoursePic = itemSpecialCoursePic;
        this.itemSpecialCourseView = itemSpecialCourseView;
    }

    @NonNull
    public static ItemActionCourseBinding bind(@NonNull View rootView) {
        int i = R.id.item_special_course_intro;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_special_course_intro);
        if (pFMedium != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = R.id.item_special_course_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_name);
            if (textView != null) {
                i = R.id.item_special_course_pic;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_pic);
                if (imageView != null) {
                    i = R.id.item_special_course_view;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.item_special_course_view);
                    if (viewFindChildViewById != null) {
                        return new ItemActionCourseBinding(relativeLayout, pFMedium, relativeLayout, textView, imageView, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemActionCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemActionCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_action_course, parent, false);
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
