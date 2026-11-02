package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiCoachChooseDayBinding implements ViewBinding {

    @NonNull
    public final RecyclerView llChoices;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    private final FrameLayout rootView_;

    @NonNull
    public final PFMedium startTitleTv;

    private AiCoachChooseDayBinding(@NonNull FrameLayout rootView_, @NonNull RecyclerView llChoices, @NonNull FrameLayout rootView, @NonNull PFMedium startTitleTv) {
        this.rootView_ = rootView_;
        this.llChoices = llChoices;
        this.rootView = rootView;
        this.startTitleTv = startTitleTv;
    }

    @NonNull
    public static AiCoachChooseDayBinding bind(@NonNull View rootView) {
        int i = R.id.ll_choices;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.ll_choices);
        if (recyclerView != null) {
            FrameLayout frameLayout = (FrameLayout) rootView;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_title_tv);
            if (pFMedium != null) {
                return new AiCoachChooseDayBinding(frameLayout, recyclerView, frameLayout, pFMedium);
            }
            i = R.id.start_title_tv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiCoachChooseDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiCoachChooseDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_coach_choose_day, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView_;
    }
}
