package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiCoachPersonalAssessmentBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout btnLayoutView;

    @NonNull
    public final PFMedium btnLayoutViewTitle;

    @NonNull
    public final PFMedium coachRankAthleticTv;

    @NonNull
    public final PFMedium coachRankBeginnerTv;

    @NonNull
    public final PFMedium coachRankChallengerTv;

    @NonNull
    public final PFMedium coachRankElementaryTv;

    @NonNull
    public final PFMedium coachRankIntermediateTv;

    @NonNull
    public final PFMedium personalGoalTv;

    @NonNull
    public final ImageView personalTipImg;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium startTitleTv;

    private AiCoachPersonalAssessmentBinding(@NonNull LinearLayout rootView_, @NonNull RelativeLayout btnLayoutView, @NonNull PFMedium btnLayoutViewTitle, @NonNull PFMedium coachRankAthleticTv, @NonNull PFMedium coachRankBeginnerTv, @NonNull PFMedium coachRankChallengerTv, @NonNull PFMedium coachRankElementaryTv, @NonNull PFMedium coachRankIntermediateTv, @NonNull PFMedium personalGoalTv, @NonNull ImageView personalTipImg, @NonNull LinearLayout rootView, @NonNull PFMedium startTitleTv) {
        this.rootView_ = rootView_;
        this.btnLayoutView = btnLayoutView;
        this.btnLayoutViewTitle = btnLayoutViewTitle;
        this.coachRankAthleticTv = coachRankAthleticTv;
        this.coachRankBeginnerTv = coachRankBeginnerTv;
        this.coachRankChallengerTv = coachRankChallengerTv;
        this.coachRankElementaryTv = coachRankElementaryTv;
        this.coachRankIntermediateTv = coachRankIntermediateTv;
        this.personalGoalTv = personalGoalTv;
        this.personalTipImg = personalTipImg;
        this.rootView = rootView;
        this.startTitleTv = startTitleTv;
    }

    @NonNull
    public static AiCoachPersonalAssessmentBinding bind(@NonNull View rootView) {
        int i = R.id.btn_layout_view;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btn_layout_view);
        if (relativeLayout != null) {
            i = R.id.btn_layout_view_title;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.btn_layout_view_title);
            if (pFMedium != null) {
                i = R.id.coach_rank_athletic_tv;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_athletic_tv);
                if (pFMedium2 != null) {
                    i = R.id.coach_rank_beginner_tv;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_beginner_tv);
                    if (pFMedium3 != null) {
                        i = R.id.coach_rank_challenger_tv;
                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_challenger_tv);
                        if (pFMedium4 != null) {
                            i = R.id.coach_rank_elementary_tv;
                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_elementary_tv);
                            if (pFMedium5 != null) {
                                i = R.id.coach_rank_intermediate_tv;
                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_intermediate_tv);
                                if (pFMedium6 != null) {
                                    i = R.id.personal_goal_tv;
                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_goal_tv);
                                    if (pFMedium7 != null) {
                                        i = R.id.personal_tip_img;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.personal_tip_img);
                                        if (imageView != null) {
                                            LinearLayout linearLayout = (LinearLayout) rootView;
                                            i = R.id.start_title_tv;
                                            PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_title_tv);
                                            if (pFMedium8 != null) {
                                                return new AiCoachPersonalAssessmentBinding(linearLayout, relativeLayout, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, imageView, linearLayout, pFMedium8);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiCoachPersonalAssessmentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiCoachPersonalAssessmentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_coach_personal_assessment, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
