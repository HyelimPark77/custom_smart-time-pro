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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FitnessItemSpecialBinding implements ViewBinding {

    @NonNull
    public final RecyclerView fitnessItemSpecialRecycler;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTitle;

    private FitnessItemSpecialBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView fitnessItemSpecialRecycler, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.fitnessItemSpecialRecycler = fitnessItemSpecialRecycler;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static FitnessItemSpecialBinding bind(@NonNull View rootView) {
        int r0 = R.id.fitness_item_special_recycler;
        RecyclerView r1 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.fitness_item_special_recycler);
        if (r1 == null) goto L9;
        r0 = R.id.tv_title;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r2 == null) goto L9;
        return new FitnessItemSpecialBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FitnessItemSpecialBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FitnessItemSpecialBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fitness_item_special, parent, false);
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
