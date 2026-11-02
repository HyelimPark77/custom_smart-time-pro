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
        int r0 = R.id.item_recommend_recycler_first;
        RecyclerView r4 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.item_recommend_recycler_first);
        if (r4 == null) goto L13;
        r0 = R.id.item_recommend_recycler_second;
        RecyclerView r5 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.item_recommend_recycler_second);
        if (r5 == null) goto L13;
        r0 = R.id.tv_title;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r6 == null) goto L13;
        r0 = R.id.tv_title2;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title2);
        if (r7 == null) goto L13;
        return new FitnessItemRecommendBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FitnessItemRecommendBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FitnessItemRecommendBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fitness_item_recommend, parent, false);
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
