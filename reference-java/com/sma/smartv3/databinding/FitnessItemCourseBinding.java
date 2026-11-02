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
        int i = R.id.fitness_item_all_course;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.fitness_item_all_course);
        if (pFMedium != null) {
            i = R.id.go_to_my_course;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.go_to_my_course);
            if (relativeLayout != null) {
                i = R.id.my_course_empty_recyclerView;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.my_course_empty_recyclerView);
                if (relativeLayout2 != null) {
                    i = R.id.my_course_recyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.my_course_recyclerView);
                    if (recyclerView != null) {
                        return new FitnessItemCourseBinding((LinearLayout) rootView, pFMedium, relativeLayout, relativeLayout2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FitnessItemCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FitnessItemCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fitness_item_course, parent, false);
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
