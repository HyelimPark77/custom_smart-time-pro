package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAiAnswerBinding implements ViewBinding {

    @NonNull
    public final ImageView abhTitleOtherRight;

    @NonNull
    public final EditText aiAnswerEdContent;

    @NonNull
    public final PFMedium aiAnswerEtClear;

    @NonNull
    public final PFMedium aiAnswerEtCount;

    @NonNull
    public final PFMedium aiAnswerEtDescribe;

    @NonNull
    public final FrameLayout aiAnswerFlBg;

    @NonNull
    public final LinearLayout aiAnswerLayout;

    @NonNull
    public final PFMedium aiAnswerTvExample;

    @NonNull
    public final PFMedium aiAnswerTvResults;

    @NonNull
    public final ImageButton aiCopyImgBtn;

    @NonNull
    public final FrameLayout generateResultsFrameLayout;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final FrameLayout rootView_;

    private ActivityAiAnswerBinding(@NonNull FrameLayout rootView_, @NonNull ImageView abhTitleOtherRight, @NonNull EditText aiAnswerEdContent, @NonNull PFMedium aiAnswerEtClear, @NonNull PFMedium aiAnswerEtCount, @NonNull PFMedium aiAnswerEtDescribe, @NonNull FrameLayout aiAnswerFlBg, @NonNull LinearLayout aiAnswerLayout, @NonNull PFMedium aiAnswerTvExample, @NonNull PFMedium aiAnswerTvResults, @NonNull ImageButton aiCopyImgBtn, @NonNull FrameLayout generateResultsFrameLayout, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.abhTitleOtherRight = abhTitleOtherRight;
        this.aiAnswerEdContent = aiAnswerEdContent;
        this.aiAnswerEtClear = aiAnswerEtClear;
        this.aiAnswerEtCount = aiAnswerEtCount;
        this.aiAnswerEtDescribe = aiAnswerEtDescribe;
        this.aiAnswerFlBg = aiAnswerFlBg;
        this.aiAnswerLayout = aiAnswerLayout;
        this.aiAnswerTvExample = aiAnswerTvExample;
        this.aiAnswerTvResults = aiAnswerTvResults;
        this.aiCopyImgBtn = aiCopyImgBtn;
        this.generateResultsFrameLayout = generateResultsFrameLayout;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityAiAnswerBinding bind(@NonNull View rootView) {
        int r1 = R.id.abh_title_other_right;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_other_right);
        if (r5 == null) goto L29;
        r1 = R.id.ai_answer_ed_content;
        EditText r6 = (EditText) ViewBindings.findChildViewById(rootView, R.id.ai_answer_ed_content);
        if (r6 == null) goto L29;
        r1 = R.id.ai_answer_et_clear;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_et_clear);
        if (r7 == null) goto L29;
        r1 = R.id.ai_answer_et_count;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_et_count);
        if (r8 == null) goto L29;
        r1 = R.id.ai_answer_et_describe;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_et_describe);
        if (r9 == null) goto L29;
        r1 = R.id.ai_answer_fl_bg;
        FrameLayout r10 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ai_answer_fl_bg);
        if (r10 == null) goto L29;
        r1 = R.id.ai_answer_layout;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ai_answer_layout);
        if (r11 == null) goto L29;
        r1 = R.id.ai_answer_tv_example;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_tv_example);
        if (r12 == null) goto L29;
        r1 = R.id.ai_answer_tv_results;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_tv_results);
        if (r13 == null) goto L29;
        r1 = R.id.ai_copy_imgBtn;
        ImageButton r14 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.ai_copy_imgBtn);
        if (r14 == null) goto L29;
        r1 = R.id.generate_results_frameLayout;
        FrameLayout r15 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.generate_results_frameLayout);
        if (r15 == null) goto L29;
        r1 = R.id.root_view;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.root_view);
        if (r16 == null) goto L29;
        return new ActivityAiAnswerBinding((FrameLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityAiAnswerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAiAnswerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_ai_answer, parent, false);
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
