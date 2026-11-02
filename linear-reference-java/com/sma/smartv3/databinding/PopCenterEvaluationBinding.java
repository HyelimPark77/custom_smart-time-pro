package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopCenterEvaluationBinding implements ViewBinding {

    @NonNull
    public final TextView popCenterEvaluationFeedback;

    @NonNull
    public final Button popCenterEvaluationPraise;

    @NonNull
    public final ImageView popCenterPromptImg;

    @NonNull
    public final TextView popCenterPromptImgContent;

    @NonNull
    public final TextView popCenterPromptImgTitle;

    @NonNull
    public final TextView popCenterPromptReminders;

    @NonNull
    private final RelativeLayout rootView;

    private PopCenterEvaluationBinding(@NonNull RelativeLayout rootView, @NonNull TextView popCenterEvaluationFeedback, @NonNull Button popCenterEvaluationPraise, @NonNull ImageView popCenterPromptImg, @NonNull TextView popCenterPromptImgContent, @NonNull TextView popCenterPromptImgTitle, @NonNull TextView popCenterPromptReminders) {
        this.rootView = rootView;
        this.popCenterEvaluationFeedback = popCenterEvaluationFeedback;
        this.popCenterEvaluationPraise = popCenterEvaluationPraise;
        this.popCenterPromptImg = popCenterPromptImg;
        this.popCenterPromptImgContent = popCenterPromptImgContent;
        this.popCenterPromptImgTitle = popCenterPromptImgTitle;
        this.popCenterPromptReminders = popCenterPromptReminders;
    }

    @NonNull
    public static PopCenterEvaluationBinding bind(@NonNull View rootView) {
        int r0 = R.id.pop_center_evaluation_feedback;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_evaluation_feedback);
        if (r4 == null) goto L17;
        r0 = R.id.pop_center_evaluation_praise;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_center_evaluation_praise);
        if (r5 == null) goto L17;
        r0 = R.id.pop_center_prompt_img;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img);
        if (r6 == null) goto L17;
        r0 = R.id.pop_center_prompt_img_content;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_content);
        if (r7 == null) goto L17;
        r0 = R.id.pop_center_prompt_img_title;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_title);
        if (r8 == null) goto L17;
        r0 = R.id.pop_center_prompt_reminders;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_reminders);
        if (r9 == null) goto L17;
        return new PopCenterEvaluationBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopCenterEvaluationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopCenterEvaluationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_center_evaluation, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
