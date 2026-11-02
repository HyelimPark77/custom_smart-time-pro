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
        int r0 = R.id.pop_center_prompt_closure;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_closure);
        if (r4 == null) goto L13;
        r0 = R.id.pop_center_prompt_img;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img);
        if (r5 == null) goto L13;
        r0 = R.id.pop_center_prompt_img_content;
        FontTextView r6 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_content);
        if (r6 == null) goto L13;
        r0 = R.id.pop_center_prompt_img_title;
        FontTextView r7 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.pop_center_prompt_img_title);
        if (r7 == null) goto L13;
        return new PopCenterPromptFreePointBinding((RelativeLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopCenterPromptFreePointBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopCenterPromptFreePointBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_center_prompt_free_point, parent, false);
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
