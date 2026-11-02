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
public final class ActivityNewSimultaneousInterpretationBinding implements ViewBinding {

    @NonNull
    public final ImageView abhTitleRight;

    @NonNull
    public final TextView dialogueTranslationLeftTv;

    @NonNull
    public final TextView dialogueTranslationRightTv;

    @NonNull
    public final ImageView imgBroadcast;

    @NonNull
    public final ImageView imgDirection;

    @NonNull
    public final ImageView imgPlay;

    @NonNull
    public final ImageView imgRecordingStatus;

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
    public final ImageView translateLeftIv;

    @NonNull
    public final PFMedium tvTime;

    private ActivityNewSimultaneousInterpretationBinding(@NonNull LinearLayout rootView_, @NonNull ImageView abhTitleRight, @NonNull TextView dialogueTranslationLeftTv, @NonNull TextView dialogueTranslationRightTv, @NonNull ImageView imgBroadcast, @NonNull ImageView imgDirection, @NonNull ImageView imgPlay, @NonNull ImageView imgRecordingStatus, @NonNull WaveformView recordLine, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull ImageView transformLanguageImg, @NonNull ImageView translateLeftIv, @NonNull PFMedium tvTime) {
        this.rootView_ = rootView_;
        this.abhTitleRight = abhTitleRight;
        this.dialogueTranslationLeftTv = dialogueTranslationLeftTv;
        this.dialogueTranslationRightTv = dialogueTranslationRightTv;
        this.imgBroadcast = imgBroadcast;
        this.imgDirection = imgDirection;
        this.imgPlay = imgPlay;
        this.imgRecordingStatus = imgRecordingStatus;
        this.recordLine = recordLine;
        this.rootView = rootView;
        this.rv = rv;
        this.transformLanguageImg = transformLanguageImg;
        this.translateLeftIv = translateLeftIv;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ActivityNewSimultaneousInterpretationBinding bind(@NonNull View rootView) {
        int r1 = R.id.abh_title_right;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (r5 == null) goto L29;
        r1 = R.id.dialogue_translation_left_tv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
        if (r6 == null) goto L29;
        r1 = R.id.dialogue_translation_right_tv;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
        if (r7 == null) goto L29;
        r1 = R.id.img_broadcast;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_broadcast);
        if (r8 == null) goto L29;
        r1 = R.id.img_direction;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_direction);
        if (r9 == null) goto L29;
        r1 = R.id.img_play;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_play);
        if (r10 == null) goto L29;
        r1 = R.id.img_recording_status;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording_status);
        if (r11 == null) goto L29;
        r1 = R.id.record_line;
        WaveformView r12 = (WaveformView) ViewBindings.findChildViewById(rootView, R.id.record_line);
        if (r12 == null) goto L29;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.rv;
        RecyclerView r14 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r14 == null) goto L29;
        r1 = R.id.transform_language_img;
        ImageView r15 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
        if (r15 == null) goto L29;
        r1 = R.id.translate_left_iv;
        ImageView r16 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.translate_left_iv);
        if (r16 == null) goto L29;
        r1 = R.id.tv_time;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r17 == null) goto L29;
        return new ActivityNewSimultaneousInterpretationBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r4, r14, r15, r16, r17);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityNewSimultaneousInterpretationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityNewSimultaneousInterpretationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_new_simultaneous_interpretation, parent, false);
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
