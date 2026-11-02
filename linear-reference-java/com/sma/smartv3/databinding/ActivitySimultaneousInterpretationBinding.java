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
        int r0 = R.id.dialogue_translation_left_tv;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
        if (r4 == null) goto L23;
        r0 = R.id.dialogue_translation_right_tv;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
        if (r5 == null) goto L23;
        r0 = R.id.simultaneous_interpretation_audio_play_img;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_audio_play_img);
        if (r6 == null) goto L23;
        r0 = R.id.simultaneous_interpretation_audio_play_time;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_audio_play_time);
        if (r7 == null) goto L23;
        r0 = R.id.simultaneous_interpretation_btn_tv;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_btn_tv);
        if (r8 == null) goto L23;
        r0 = R.id.simultaneous_interpretation_play_btn;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_play_btn);
        if (r9 == null) goto L23;
        r0 = R.id.simultaneous_interpretation_top_layout;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_top_layout);
        if (r10 == null) goto L23;
        r0 = R.id.simultaneous_interpretation_top_tv;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.simultaneous_interpretation_top_tv);
        if (r11 == null) goto L23;
        r0 = R.id.transform_language_img;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
        if (r12 == null) goto L23;
        return new ActivitySimultaneousInterpretationBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySimultaneousInterpretationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySimultaneousInterpretationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_simultaneous_interpretation, parent, false);
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
