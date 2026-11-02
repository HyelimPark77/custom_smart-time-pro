package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiCoachPersonalAssessmentCofirmBinding implements ViewBinding {

    @NonNull
    public final PFMedium assessmentDuration;

    @NonNull
    public final PFMedium assessmentYouLevel;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    private final FrameLayout rootView_;

    @NonNull
    public final PFMedium startTitleTv;

    private AiCoachPersonalAssessmentCofirmBinding(@NonNull FrameLayout rootView_, @NonNull PFMedium assessmentDuration, @NonNull PFMedium assessmentYouLevel, @NonNull FrameLayout rootView, @NonNull PFMedium startTitleTv) {
        this.rootView_ = rootView_;
        this.assessmentDuration = assessmentDuration;
        this.assessmentYouLevel = assessmentYouLevel;
        this.rootView = rootView;
        this.startTitleTv = startTitleTv;
    }

    @NonNull
    public static AiCoachPersonalAssessmentCofirmBinding bind(@NonNull View rootView) {
        int r0 = R.id.assessment_duration;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.assessment_duration);
        if (r4 == null) goto L11;
        r0 = R.id.assessment_you_level;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.assessment_you_level);
        if (r5 == null) goto L11;
        FrameLayout r3 = (FrameLayout) rootView;
        r0 = R.id.start_title_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_title_tv);
        if (r7 == null) goto L11;
        return new AiCoachPersonalAssessmentCofirmBinding(r3, r4, r5, r3, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiCoachPersonalAssessmentCofirmBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiCoachPersonalAssessmentCofirmBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_coach_personal_assessment_cofirm, parent, false);
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
