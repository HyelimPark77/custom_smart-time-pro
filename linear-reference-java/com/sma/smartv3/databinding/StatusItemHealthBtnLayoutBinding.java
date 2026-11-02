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
        int r0 = R.id.btn_common_heathy;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_common_heathy);
        if (r4 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.questions_healthy_tip_layout;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.questions_healthy_tip_layout);
        if (r6 == null) goto L15;
        r0 = R.id.tv_common_healthy_questions;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_common_healthy_questions);
        if (r7 == null) goto L15;
        r0 = R.id.tv_common_heathy;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_common_heathy);
        if (r8 == null) goto L15;
        r0 = R.id.tv_common_heathy_tip;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_common_heathy_tip);
        if (r9 == null) goto L15;
        return new StatusItemHealthBtnLayoutBinding(r3, r4, r3, r6, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemHealthBtnLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemHealthBtnLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_health_btn_layout, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
