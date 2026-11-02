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
        int r0 = R.id.item_special_course_intro;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_special_course_intro);
        if (r4 == null) goto L13;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.item_special_course_name;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_name);
        if (r6 == null) goto L13;
        r0 = R.id.item_special_course_pic;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_special_course_pic);
        if (r7 == null) goto L13;
        r0 = R.id.item_special_course_view;
        View r8 = ViewBindings.findChildViewById(rootView, R.id.item_special_course_view);
        if (r8 == null) goto L13;
        return new ItemActionCourseBinding(r3, r4, r3, r6, r7, r8);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemActionCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemActionCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_action_course, parent, false);
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
