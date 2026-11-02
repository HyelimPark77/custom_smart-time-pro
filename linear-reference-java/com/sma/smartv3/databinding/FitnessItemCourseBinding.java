package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FitnessItemCourseBinding implements ViewBinding {

    @NonNull
    public final PFMedium fitnessItemAllCourse;

    @NonNull
    public final RelativeLayout goToMyCourse;

    @NonNull
    public final RelativeLayout myCourseEmptyRecyclerView;

    @NonNull
    public final RecyclerView myCourseRecyclerView;

    @NonNull
    private final LinearLayout rootView;

    private FitnessItemCourseBinding(@NonNull LinearLayout rootView, @NonNull PFMedium fitnessItemAllCourse, @NonNull RelativeLayout goToMyCourse, @NonNull RelativeLayout myCourseEmptyRecyclerView, @NonNull RecyclerView myCourseRecyclerView) {
        this.rootView = rootView;
        this.fitnessItemAllCourse = fitnessItemAllCourse;
        this.goToMyCourse = goToMyCourse;
        this.myCourseEmptyRecyclerView = myCourseEmptyRecyclerView;
        this.myCourseRecyclerView = myCourseRecyclerView;
    }

    @NonNull
    public static FitnessItemCourseBinding bind(@NonNull View rootView) {
        int r0 = R.id.fitness_item_all_course;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.fitness_item_all_course);
        if (r4 == null) goto L13;
        r0 = R.id.go_to_my_course;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.go_to_my_course);
        if (r5 == null) goto L13;
        r0 = R.id.my_course_empty_recyclerView;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.my_course_empty_recyclerView);
        if (r6 == null) goto L13;
        r0 = R.id.my_course_recyclerView;
        RecyclerView r7 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.my_course_recyclerView);
        if (r7 == null) goto L13;
        return new FitnessItemCourseBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FitnessItemCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FitnessItemCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fitness_item_course, parent, false);
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
