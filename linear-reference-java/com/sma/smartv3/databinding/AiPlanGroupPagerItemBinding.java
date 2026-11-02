package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class AiPlanGroupPagerItemBinding implements ViewBinding {

    @NonNull
    public final RecyclerView aiPlanItemGroupHeadRecycle;

    @NonNull
    private final RecyclerView rootView;

    private AiPlanGroupPagerItemBinding(@NonNull RecyclerView rootView, @NonNull RecyclerView aiPlanItemGroupHeadRecycle) {
        this.rootView = rootView;
        this.aiPlanItemGroupHeadRecycle = aiPlanItemGroupHeadRecycle;
    }

    @NonNull
    public static AiPlanGroupPagerItemBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        RecyclerView r1 = (RecyclerView) rootView;
        return new AiPlanGroupPagerItemBinding(r1, r1);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static AiPlanGroupPagerItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiPlanGroupPagerItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_plan_group_pager_item, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
