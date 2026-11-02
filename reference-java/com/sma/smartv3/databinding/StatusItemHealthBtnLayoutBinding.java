package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemHealthBtnLayoutBinding implements ViewBinding {

    @NonNull
    public final Button btnCommonHeathy;

    @NonNull
    public final LinearLayout itemHealthBtnLayout;

    @NonNull
    public final LinearLayout questionsHealthyTipLayout;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvCommonHealthyQuestions;

    @NonNull
    public final PFMedium tvCommonHeathy;

    @NonNull
    public final PFMedium tvCommonHeathyTip;

    private StatusItemHealthBtnLayoutBinding(@NonNull LinearLayout rootView, @NonNull Button btnCommonHeathy, @NonNull LinearLayout itemHealthBtnLayout, @NonNull LinearLayout questionsHealthyTipLayout, @NonNull PFMedium tvCommonHealthyQuestions, @NonNull PFMedium tvCommonHeathy, @NonNull PFMedium tvCommonHeathyTip) {
        this.rootView = rootView;
        this.btnCommonHeathy = btnCommonHeathy;
        this.itemHealthBtnLayout = itemHealthBtnLayout;
        this.questionsHealthyTipLayout = questionsHealthyTipLayout;
        this.tvCommonHealthyQuestions = tvCommonHealthyQuestions;
        this.tvCommonHeathy = tvCommonHeathy;
        this.tvCommonHeathyTip = tvCommonHeathyTip;
    }

    @NonNull
    public static StatusItemHealthBtnLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.btn_common_heathy;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_common_heathy);
        if (button != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.questions_healthy_tip_layout;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.questions_healthy_tip_layout);
            if (linearLayout2 != null) {
                i = R.id.tv_common_healthy_questions;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_common_healthy_questions);
                if (pFMedium != null) {
                    i = R.id.tv_common_heathy;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_common_heathy);
                    if (pFMedium2 != null) {
                        i = R.id.tv_common_heathy_tip;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_common_heathy_tip);
                        if (pFMedium3 != null) {
                            return new StatusItemHealthBtnLayoutBinding(linearLayout, button, linearLayout, linearLayout2, pFMedium, pFMedium2, pFMedium3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemHealthBtnLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemHealthBtnLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_health_btn_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
