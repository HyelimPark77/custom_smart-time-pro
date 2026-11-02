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
        int i = R.id.pop_center_evaluation_feedback;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_evaluation_feedback);
        if (textView != null) {
            i = R.id.pop_center_evaluation_praise;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_center_evaluation_praise);
            if (button != null) {
                i = R.id.pop_center_prompt_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img);
                if (imageView != null) {
                    i = R.id.pop_center_prompt_img_content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_content);
                    if (textView2 != null) {
                        i = R.id.pop_center_prompt_img_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_title);
                        if (textView3 != null) {
                            i = R.id.pop_center_prompt_reminders;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_reminders);
                            if (textView4 != null) {
                                return new PopCenterEvaluationBinding((RelativeLayout) rootView, textView, button, imageView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopCenterEvaluationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopCenterEvaluationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_center_evaluation, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
