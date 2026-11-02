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
        int r0 = R.id.ll_choices;
        RecyclerView r1 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.ll_choices);
        if (r1 == null) goto L10;
        FrameLayout r2 = (FrameLayout) rootView;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_title_tv);
        if (r3 != null) goto L7;
        r0 = R.id.start_title_tv;
        goto L10
    L7:
        return new AiCoachChooseDayBinding(r2, r1, r2, r3);
    L10:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiCoachChooseDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiCoachChooseDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_coach_choose_day, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView_;
    }
}
