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
        int r0 = R.id.item_special_course_intro;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_special_course_intro);
        if (r4 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.item_special_course_name;
        PFBold r6 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.item_special_course_name);
        if (r6 == null) goto L15;
        r0 = R.id.item_special_course_pic;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_pic);
        if (r7 == null) goto L15;
        r0 = R.id.item_special_course_view;
        View r8 = ViewBindings.findChildViewById(rootView, R.id.item_special_course_view);
        if (r8 == null) goto L15;
        r0 = R.id.tv_course_class;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_course_class);
        if (r9 == null) goto L15;
        return new ItemSpecialCourseBinding(r3, r4, r3, r6, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSpecialCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSpecialCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_special_course, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
