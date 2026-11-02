package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySimultaneousInterpretationBinding implements ViewBinding {

    @NonNull
    public final TextView dialogueTranslationLeftTv;

    @NonNull
    public final TextView dialogueTranslationRightTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView simultaneousInterpretationAudioPlayImg;

    @NonNull
    public final TextView simultaneousInterpretationAudioPlayTime;

    @NonNull
    public final TextView simultaneousInterpretationBtnTv;

    @NonNull
    public final ImageView simultaneousInterpretationPlayBtn;

    @NonNull
    public final LinearLayout simultaneousInterpretationTopLayout;

    @NonNull
    public final PFMedium simultaneousInterpretationTopTv;

    @NonNull
    public final ImageView transformLanguageImg;

    private ActivitySimultaneousInterpretationBinding(@NonNull LinearLayout rootView, @NonNull TextView dialogueTranslationLeftTv, @NonNull TextView dialogueTranslationRightTv, @NonNull ImageView simultaneousInterpretationAudioPlayImg, @NonNull TextView simultaneousInterpretationAudioPlayTime, @NonNull TextView simultaneousInterpretationBtnTv, @NonNull ImageView simultaneousInterpretationPlayBtn, @NonNull LinearLayout simultaneousInterpretationTopLayout, @NonNull PFMedium simultaneousInterpretationTopTv, @NonNull ImageView transformLanguageImg) {
        this.rootView = rootView;
        this.dialogueTranslationLeftTv = dialogueTranslationLeftTv;
        this.dialogueTranslationRightTv = dialogueTranslationRightTv;
        this.simultaneousInterpretationAudioPlayImg = simultaneousInterpretationAudioPlayImg;
        this.simultaneousInterpretationAudioPlayTime = simultaneousInterpretationAudioPlayTime;
        this.simultaneousInterpretationBtnTv = simultaneousInterpretationBtnTv;
        this.simultaneousInterpretationPlayBtn = simultaneousInterpretationPlayBtn;
        this.simultaneousInterpretationTopLayout = simultaneousInterpretationTopLayout;
        this.simultaneousInterpretationTopTv = simultaneousInterpretationTopTv;
        this.transformLanguageImg = transformLanguageImg;
    }

    @NonNull
    public static ActivitySimultaneousInterpretationBinding bind(@NonNull View rootView) {
        int i = R.id.dialogue_translation_left_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
        if (textView != null) {
            i = R.id.dialogue_translation_right_tv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
            if (textView2 != null) {
                i = R.id.simultaneous_interpretation_audio_play_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_audio_play_img);
                if (imageView != null) {
                    i = R.id.simultaneous_interpretation_audio_play_time;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_audio_play_time);
                    if (textView3 != null) {
                        i = R.id.simultaneous_interpretation_btn_tv;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_btn_tv);
                        if (textView4 != null) {
                            i = R.id.simultaneous_interpretation_play_btn;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_play_btn);
                            if (imageView2 != null) {
                                i = R.id.simultaneous_interpretation_top_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_top_layout);
                                if (linearLayout != null) {
                                    i = R.id.simultaneous_interpretation_top_tv;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_top_tv);
                                    if (pFMedium != null) {
                                        i = R.id.transform_language_img;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
                                        if (imageView3 != null) {
                                            return new ActivitySimultaneousInterpretationBinding((LinearLayout) rootView, textView, textView2, imageView, textView3, textView4, imageView2, linearLayout, pFMedium, imageView3);
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
    public static ActivitySimultaneousInterpretationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySimultaneousInterpretationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_simultaneous_interpretation, parent, false);
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
