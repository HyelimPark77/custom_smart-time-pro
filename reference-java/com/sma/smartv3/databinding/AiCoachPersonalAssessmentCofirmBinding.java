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
        int i = R.id.assessment_duration;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.assessment_duration);
        if (pFMedium != null) {
            i = R.id.assessment_you_level;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.assessment_you_level);
            if (pFMedium2 != null) {
                FrameLayout frameLayout = (FrameLayout) rootView;
                i = R.id.start_title_tv;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_title_tv);
                if (pFMedium3 != null) {
                    return new AiCoachPersonalAssessmentCofirmBinding(frameLayout, pFMedium, pFMedium2, frameLayout, pFMedium3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiCoachPersonalAssessmentCofirmBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiCoachPersonalAssessmentCofirmBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_coach_personal_assessment_cofirm, parent, false);
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
