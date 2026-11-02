package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.FontTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class PopRechargeSuccessfulBinding implements ViewBinding {

    @NonNull
    public final Button popCenterPromptClosure;

    @NonNull
    public final ImageView popCenterPromptImg;

    @NonNull
    public final FontTextView popCenterPromptImgContent;

    @NonNull
    public final FontTextView popCenterPromptImgTitle;

    @NonNull
    private final CardView rootView;

    private PopRechargeSuccessfulBinding(@NonNull CardView rootView, @NonNull Button popCenterPromptClosure, @NonNull ImageView popCenterPromptImg, @NonNull FontTextView popCenterPromptImgContent, @NonNull FontTextView popCenterPromptImgTitle) {
        this.rootView = rootView;
        this.popCenterPromptClosure = popCenterPromptClosure;
        this.popCenterPromptImg = popCenterPromptImg;
        this.popCenterPromptImgContent = popCenterPromptImgContent;
        this.popCenterPromptImgTitle = popCenterPromptImgTitle;
    }

    @NonNull
    public static PopRechargeSuccessfulBinding bind(@NonNull View rootView) {
        int i = R.id.pop_center_prompt_closure;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_closure);
        if (button != null) {
            i = R.id.pop_center_prompt_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img);
            if (imageView != null) {
                i = R.id.pop_center_prompt_img_content;
                FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_content);
                if (fontTextView != null) {
                    i = R.id.pop_center_prompt_img_title;
                    FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_title);
                    if (fontTextView2 != null) {
                        return new PopRechargeSuccessfulBinding((CardView) rootView, button, imageView, fontTextView, fontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopRechargeSuccessfulBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopRechargeSuccessfulBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_recharge_successful, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
