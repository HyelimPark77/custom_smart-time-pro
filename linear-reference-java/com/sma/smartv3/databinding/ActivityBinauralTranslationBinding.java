package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WaveformView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBinauralTranslationBinding implements ViewBinding {

    @NonNull
    public final ImageView abhTitleRight;

    @NonNull
    public final TextView dialogueTranslationLeftTv;

    @NonNull
    public final TextView dialogueTranslationRightTv;

    @NonNull
    public final ImageView imgChangeBig;

    @NonNull
    public final ImageView imgPlay;

    @NonNull
    public final ImageView imgRecordingStatus;

    @NonNull
    public final LinearLayout llLeftLanguage;

    @NonNull
    public final LinearLayout llRightLanguage;

    @NonNull
    public final LinearLayout llTopSelectLanguage;

    @NonNull
    public final WaveformView recordLine;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final ImageView transformLanguageImg;

    @NonNull
    public final TextView tvLeftSelectLanguage;

    @NonNull
    public final TextView tvRightSelectLanguage;

    @NonNull
    public final PFMedium tvTime;

    @NonNull
    public final PFMedium tvTip;

    private ActivityBinauralTranslationBinding(@NonNull LinearLayout rootView_, @NonNull ImageView abhTitleRight, @NonNull TextView dialogueTranslationLeftTv, @NonNull TextView dialogueTranslationRightTv, @NonNull ImageView imgChangeBig, @NonNull ImageView imgPlay, @NonNull ImageView imgRecordingStatus, @NonNull LinearLayout llLeftLanguage, @NonNull LinearLayout llRightLanguage, @NonNull LinearLayout llTopSelectLanguage, @NonNull WaveformView recordLine, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull ImageView transformLanguageImg, @NonNull TextView tvLeftSelectLanguage, @NonNull TextView tvRightSelectLanguage, @NonNull PFMedium tvTime, @NonNull PFMedium tvTip) {
        this.rootView_ = rootView_;
        this.abhTitleRight = abhTitleRight;
        this.dialogueTranslationLeftTv = dialogueTranslationLeftTv;
        this.dialogueTranslationRightTv = dialogueTranslationRightTv;
        this.imgChangeBig = imgChangeBig;
        this.imgPlay = imgPlay;
        this.imgRecordingStatus = imgRecordingStatus;
        this.llLeftLanguage = llLeftLanguage;
        this.llRightLanguage = llRightLanguage;
        this.llTopSelectLanguage = llTopSelectLanguage;
        this.recordLine = recordLine;
        this.rootView = rootView;
        this.rv = rv;
        this.transformLanguageImg = transformLanguageImg;
        this.tvLeftSelectLanguage = tvLeftSelectLanguage;
        this.tvRightSelectLanguage = tvRightSelectLanguage;
        this.tvTime = tvTime;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityBinauralTranslationBinding bind(@NonNull View rootView) {
        int r1 = R.id.abh_title_right;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (r5 == null) goto L37;
        r1 = R.id.dialogue_translation_left_tv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
        if (r6 == null) goto L37;
        r1 = R.id.dialogue_translation_right_tv;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
        if (r7 == null) goto L37;
        r1 = R.id.img_change_big;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_change_big);
        if (r8 == null) goto L37;
        r1 = R.id.img_play;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_play);
        if (r9 == null) goto L37;
        r1 = R.id.img_recording_status;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording_status);
        if (r10 == null) goto L37;
        r1 = R.id.ll_left_language;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_left_language);
        if (r11 == null) goto L37;
        r1 = R.id.ll_right_language;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_right_language);
        if (r12 == null) goto L37;
        r1 = R.id.ll_top_select_language;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_top_select_language);
        if (r13 == null) goto L37;
        r1 = R.id.record_line;
        WaveformView r14 = (WaveformView) ViewBindings.findChildViewById(rootView, R.id.record_line);
        if (r14 == null) goto L37;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.rv;
        RecyclerView r16 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r16 == null) goto L37;
        r1 = R.id.transform_language_img;
        ImageView r17 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
        if (r17 == null) goto L37;
        r1 = R.id.tv_left_select_language;
        TextView r18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_left_select_language);
        if (r18 == null) goto L37;
        r1 = R.id.tv_right_select_language;
        TextView r19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_right_select_language);
        if (r19 == null) goto L37;
        r1 = R.id.tv_time;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r20 == null) goto L37;
        r1 = R.id.tv_tip;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r21 == null) goto L37;
        return new ActivityBinauralTranslationBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r4, r16, r17, r18, r19, r20, r21);
    L37:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityBinauralTranslationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityBinauralTranslationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_binaural_translation, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
