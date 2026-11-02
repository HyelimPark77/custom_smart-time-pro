package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class TranslateHeaderBackTitleBinding implements ViewBinding {

    @NonNull
    public final ImageView abhTitleRight;

    @NonNull
    public final PFMedium dialogueTranslationLeftTv;

    @NonNull
    public final TextView dialogueTranslationRightTv;

    @NonNull
    public final ImageView imgDirection;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ImageView transformLanguageImg;

    @NonNull
    public final ImageView translateLeftIv;

    private TranslateHeaderBackTitleBinding(@NonNull RelativeLayout rootView, @NonNull ImageView abhTitleRight, @NonNull PFMedium dialogueTranslationLeftTv, @NonNull TextView dialogueTranslationRightTv, @NonNull ImageView imgDirection, @NonNull ImageView transformLanguageImg, @NonNull ImageView translateLeftIv) {
        this.rootView = rootView;
        this.abhTitleRight = abhTitleRight;
        this.dialogueTranslationLeftTv = dialogueTranslationLeftTv;
        this.dialogueTranslationRightTv = dialogueTranslationRightTv;
        this.imgDirection = imgDirection;
        this.transformLanguageImg = transformLanguageImg;
        this.translateLeftIv = translateLeftIv;
    }

    @NonNull
    public static TranslateHeaderBackTitleBinding bind(@NonNull View rootView) {
        int r0 = R.id.abh_title_right;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (r4 == null) goto L17;
        r0 = R.id.dialogue_translation_left_tv;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
        if (r5 == null) goto L17;
        r0 = R.id.dialogue_translation_right_tv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
        if (r6 == null) goto L17;
        r0 = R.id.img_direction;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_direction);
        if (r7 == null) goto L17;
        r0 = R.id.transform_language_img;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
        if (r8 == null) goto L17;
        r0 = R.id.translate_left_iv;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.translate_left_iv);
        if (r9 == null) goto L17;
        return new TranslateHeaderBackTitleBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static TranslateHeaderBackTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static TranslateHeaderBackTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.translate_header_back_title, parent, false);
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
