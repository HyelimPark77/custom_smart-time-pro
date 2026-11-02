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
        int r0 = R.id.btn_layout_view;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btn_layout_view);
        if (r4 == null) goto L25;
        r0 = R.id.btn_layout_view_title;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.btn_layout_view_title);
        if (r5 == null) goto L25;
        r0 = R.id.coach_rank_athletic_tv;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_athletic_tv);
        if (r6 == null) goto L25;
        r0 = R.id.coach_rank_beginner_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_beginner_tv);
        if (r7 == null) goto L25;
        r0 = R.id.coach_rank_challenger_tv;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_challenger_tv);
        if (r8 == null) goto L25;
        r0 = R.id.coach_rank_elementary_tv;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_elementary_tv);
        if (r9 == null) goto L25;
        r0 = R.id.coach_rank_intermediate_tv;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_rank_intermediate_tv);
        if (r10 == null) goto L25;
        r0 = R.id.personal_goal_tv;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_goal_tv);
        if (r11 == null) goto L25;
        r0 = R.id.personal_tip_img;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.personal_tip_img);
        if (r12 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.start_title_tv;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_title_tv);
        if (r14 == null) goto L25;
        return new AiCoachPersonalAssessmentBinding(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r3, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiCoachPersonalAssessmentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiCoachPersonalAssessmentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_coach_personal_assessment, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
