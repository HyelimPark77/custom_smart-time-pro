package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSpecialCourseBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemSpecialCourseIntro;

    @NonNull
    public final LinearLayout itemSpecialCourseLayout;

    @NonNull
    public final PFBold itemSpecialCourseName;

    @NonNull
    public final ImageView itemSpecialCoursePic;

    @NonNull
    public final View itemSpecialCourseView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvCourseClass;

    private ItemSpecialCourseBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemSpecialCourseIntro, @NonNull LinearLayout itemSpecialCourseLayout, @NonNull PFBold itemSpecialCourseName, @NonNull ImageView itemSpecialCoursePic, @NonNull View itemSpecialCourseView, @NonNull PFMedium tvCourseClass) {
        this.rootView = rootView;
        this.itemSpecialCourseIntro = itemSpecialCourseIntro;
        this.itemSpecialCourseLayout = itemSpecialCourseLayout;
        this.itemSpecialCourseName = itemSpecialCourseName;
        this.itemSpecialCoursePic = itemSpecialCoursePic;
        this.itemSpecialCourseView = itemSpecialCourseView;
        this.tvCourseClass = tvCourseClass;
    }

    @NonNull
    public static ItemSpecialCourseBinding bind(@NonNull View rootView) {
        int i = R.id.item_special_course_intro;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_special_course_intro);
        if (pFMedium != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.item_special_course_name;
            PFBold pFBold = (PFBold) ViewBindings.findChildViewById(rootView, R.id.item_special_course_name);
            if (pFBold != null) {
                i = R.id.item_special_course_pic;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_pic);
                if (imageView != null) {
                    i = R.id.item_special_course_view;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.item_special_course_view);
                    if (viewFindChildViewById != null) {
                        i = R.id.tv_course_class;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_course_class);
                        if (pFMedium2 != null) {
                            return new ItemSpecialCourseBinding(linearLayout, pFMedium, linearLayout, pFBold, imageView, viewFindChildViewById, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSpecialCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSpecialCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_special_course, parent, false);
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
