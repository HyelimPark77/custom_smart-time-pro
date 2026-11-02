package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.FontTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class PopCenterPromptFreePointBinding implements ViewBinding {

    @NonNull
    public final ImageView popCenterPromptClosure;

    @NonNull
    public final ImageView popCenterPromptImg;

    @NonNull
    public final FontTextView popCenterPromptImgContent;

    @NonNull
    public final FontTextView popCenterPromptImgTitle;

    @NonNull
    private final RelativeLayout rootView;

    private PopCenterPromptFreePointBinding(@NonNull RelativeLayout rootView, @NonNull ImageView popCenterPromptClosure, @NonNull ImageView popCenterPromptImg, @NonNull FontTextView popCenterPromptImgContent, @NonNull FontTextView popCenterPromptImgTitle) {
        this.rootView = rootView;
        this.popCenterPromptClosure = popCenterPromptClosure;
        this.popCenterPromptImg = popCenterPromptImg;
        this.popCenterPromptImgContent = popCenterPromptImgContent;
        this.popCenterPromptImgTitle = popCenterPromptImgTitle;
    }

    @NonNull
    public static PopCenterPromptFreePointBinding bind(@NonNull View rootView) {
        int i = R.id.pop_center_prompt_closure;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_closure);
        if (imageView != null) {
            i = R.id.pop_center_prompt_img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img);
            if (imageView2 != null) {
                i = R.id.pop_center_prompt_img_content;
                FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_content);
                if (fontTextView != null) {
                    i = R.id.pop_center_prompt_img_title;
                    FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_title);
                    if (fontTextView2 != null) {
                        return new PopCenterPromptFreePointBinding((RelativeLayout) rootView, imageView, imageView2, fontTextView, fontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopCenterPromptFreePointBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopCenterPromptFreePointBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_center_prompt_free_point, parent, false);
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
