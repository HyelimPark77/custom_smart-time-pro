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
        int i = R.id.abh_title_other_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_other_right);
        if (imageView != null) {
            i = R.id.ai_answer_ed_content;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.ai_answer_ed_content);
            if (editText != null) {
                i = R.id.ai_answer_et_clear;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_et_clear);
                if (pFMedium != null) {
                    i = R.id.ai_answer_et_count;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_et_count);
                    if (pFMedium2 != null) {
                        i = R.id.ai_answer_et_describe;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_et_describe);
                        if (pFMedium3 != null) {
                            i = R.id.ai_answer_fl_bg;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ai_answer_fl_bg);
                            if (frameLayout != null) {
                                i = R.id.ai_answer_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ai_answer_layout);
                                if (linearLayout != null) {
                                    i = R.id.ai_answer_tv_example;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_tv_example);
                                    if (pFMedium4 != null) {
                                        i = R.id.ai_answer_tv_results;
                                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_tv_results);
                                        if (pFMedium5 != null) {
                                            i = R.id.ai_copy_imgBtn;
                                            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.ai_copy_imgBtn);
                                            if (imageButton != null) {
                                                i = R.id.generate_results_frameLayout;
                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.generate_results_frameLayout);
                                                if (frameLayout2 != null) {
                                                    i = R.id.root_view;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.root_view);
                                                    if (linearLayout2 != null) {
                                                        return new ActivityAiAnswerBinding((FrameLayout) rootView, imageView, editText, pFMedium, pFMedium2, pFMedium3, frameLayout, linearLayout, pFMedium4, pFMedium5, imageButton, frameLayout2, linearLayout2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAiAnswerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAiAnswerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_ai_answer, parent, false);
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
