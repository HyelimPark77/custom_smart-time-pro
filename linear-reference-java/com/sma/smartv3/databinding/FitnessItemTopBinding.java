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
        int r0 = R.id.fitness_item_all_course;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.fitness_item_all_course);
        if (r1 == null) goto L9;
        r0 = R.id.search_item;
        LinearLayout r2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_item);
        if (r2 == null) goto L9;
        return new FitnessItemTopBinding((MyLinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FitnessItemTopBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FitnessItemTopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fitness_item_top, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public MyLinearLayout getRoot() {
        return this.rootView;
    }
}
