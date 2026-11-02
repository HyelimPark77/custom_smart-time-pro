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
        int i = R.id.fitness_item_special_recycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.fitness_item_special_recycler);
        if (recyclerView != null) {
            i = R.id.tv_title;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
            if (pFMedium != null) {
                return new FitnessItemSpecialBinding((LinearLayout) rootView, recyclerView, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FitnessItemSpecialBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FitnessItemSpecialBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fitness_item_special, parent, false);
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
