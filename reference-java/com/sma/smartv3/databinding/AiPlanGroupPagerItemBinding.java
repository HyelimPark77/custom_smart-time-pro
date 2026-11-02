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
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) rootView;
        return new AiPlanGroupPagerItemBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static AiPlanGroupPagerItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiPlanGroupPagerItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_plan_group_pager_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
