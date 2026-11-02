package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAllCourseBinding implements ViewBinding {

    @NonNull
    public final RecyclerView allCourseListCourse;

    @NonNull
    public final RecyclerView allCourseListType;

    @NonNull
    private final LinearLayout rootView;

    private ActivityAllCourseBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView allCourseListCourse, @NonNull RecyclerView allCourseListType) {
        this.rootView = rootView;
        this.allCourseListCourse = allCourseListCourse;
        this.allCourseListType = allCourseListType;
    }

    @NonNull
    public static ActivityAllCourseBinding bind(@NonNull View rootView) {
        int r0 = R.id.all_course_list_course;
        RecyclerView r1 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.all_course_list_course);
        if (r1 == null) goto L9;
        r0 = R.id.all_course_list_type;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.all_course_list_type);
        if (r2 == null) goto L9;
        return new ActivityAllCourseBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAllCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAllCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_all_course, parent, false);
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
