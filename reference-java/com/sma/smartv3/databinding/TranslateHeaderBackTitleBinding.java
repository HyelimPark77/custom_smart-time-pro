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
        int i = R.id.abh_title_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (imageView != null) {
            i = R.id.dialogue_translation_left_tv;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
            if (pFMedium != null) {
                i = R.id.dialogue_translation_right_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
                if (textView != null) {
                    i = R.id.img_direction;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_direction);
                    if (imageView2 != null) {
                        i = R.id.transform_language_img;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
                        if (imageView3 != null) {
                            i = R.id.translate_left_iv;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.translate_left_iv);
                            if (imageView4 != null) {
                                return new TranslateHeaderBackTitleBinding((RelativeLayout) rootView, imageView, pFMedium, textView, imageView2, imageView3, imageView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static TranslateHeaderBackTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TranslateHeaderBackTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.translate_header_back_title, parent, false);
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
