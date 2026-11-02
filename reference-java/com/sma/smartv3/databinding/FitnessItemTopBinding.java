package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.MyLinearLayout;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FitnessItemTopBinding implements ViewBinding {

    @NonNull
    public final PFMedium fitnessItemAllCourse;

    @NonNull
    private final MyLinearLayout rootView;

    @NonNull
    public final LinearLayout searchItem;

    private FitnessItemTopBinding(@NonNull MyLinearLayout rootView, @NonNull PFMedium fitnessItemAllCourse, @NonNull LinearLayout searchItem) {
        this.rootView = rootView;
        this.fitnessItemAllCourse = fitnessItemAllCourse;
        this.searchItem = searchItem;
    }

    @NonNull
    public static FitnessItemTopBinding bind(@NonNull View rootView) {
        int i = R.id.fitness_item_all_course;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.fitness_item_all_course);
        if (pFMedium != null) {
            i = R.id.search_item;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_item);
            if (linearLayout != null) {
                return new FitnessItemTopBinding((MyLinearLayout) rootView, pFMedium, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FitnessItemTopBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FitnessItemTopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fitness_item_top, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public MyLinearLayout getRoot() {
        return this.rootView;
    }
}
