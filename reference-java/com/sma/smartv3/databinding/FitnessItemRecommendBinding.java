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
public final class FitnessItemRecommendBinding implements ViewBinding {

    @NonNull
    public final RecyclerView itemRecommendRecyclerFirst;

    @NonNull
    public final RecyclerView itemRecommendRecyclerSecond;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTitle;

    @NonNull
    public final PFMedium tvTitle2;

    private FitnessItemRecommendBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView itemRecommendRecyclerFirst, @NonNull RecyclerView itemRecommendRecyclerSecond, @NonNull PFMedium tvTitle, @NonNull PFMedium tvTitle2) {
        this.rootView = rootView;
        this.itemRecommendRecyclerFirst = itemRecommendRecyclerFirst;
        this.itemRecommendRecyclerSecond = itemRecommendRecyclerSecond;
        this.tvTitle = tvTitle;
        this.tvTitle2 = tvTitle2;
    }

    @NonNull
    public static FitnessItemRecommendBinding bind(@NonNull View rootView) {
        int i = R.id.item_recommend_recycler_first;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.item_recommend_recycler_first);
        if (recyclerView != null) {
            i = R.id.item_recommend_recycler_second;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.item_recommend_recycler_second);
            if (recyclerView2 != null) {
                i = R.id.tv_title;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                if (pFMedium != null) {
                    i = R.id.tv_title2;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title2);
                    if (pFMedium2 != null) {
                        return new FitnessItemRecommendBinding((LinearLayout) rootView, recyclerView, recyclerView2, pFMedium, pFMedium2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FitnessItemRecommendBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FitnessItemRecommendBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fitness_item_recommend, parent, false);
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
