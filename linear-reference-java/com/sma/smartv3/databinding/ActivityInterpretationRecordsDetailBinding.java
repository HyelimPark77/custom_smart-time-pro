package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityInterpretationRecordsDetailBinding implements ViewBinding {

    @NonNull
    public final PFMedium interpretationRecordsAudioDuration;

    @NonNull
    public final ProgressBar interpretationRecordsAudioSeekbar;

    @NonNull
    public final PFMedium interpretationRecordsContent;

    @NonNull
    public final PFMedium interpretationRecordsExtraInfo;

    @NonNull
    public final PFMedium interpretationRecordsLanguage;

    @NonNull
    public final PFMedium interpretationRecordsLocation;

    @NonNull
    public final PFMedium interpretationRecordsTime;

    @NonNull
    public final PFMedium interpretationRecordsTitle;

    @NonNull
    public final PFMedium interpretationRecordsToLanguage;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView simultaneousPlayAudioIcon;

    @NonNull
    public final ImageView simultaneousPlayAudioVolumeIcon;

    @NonNull
    public final ImageView transformLanguageImg;

    @NonNull
    public final ImageView transformTitleEditImg;

    private ActivityInterpretationRecordsDetailBinding(@NonNull LinearLayout rootView, @NonNull PFMedium interpretationRecordsAudioDuration, @NonNull ProgressBar interpretationRecordsAudioSeekbar, @NonNull PFMedium interpretationRecordsContent, @NonNull PFMedium interpretationRecordsExtraInfo, @NonNull PFMedium interpretationRecordsLanguage, @NonNull PFMedium interpretationRecordsLocation, @NonNull PFMedium interpretationRecordsTime, @NonNull PFMedium interpretationRecordsTitle, @NonNull PFMedium interpretationRecordsToLanguage, @NonNull ImageView simultaneousPlayAudioIcon, @NonNull ImageView simultaneousPlayAudioVolumeIcon, @NonNull ImageView transformLanguageImg, @NonNull ImageView transformTitleEditImg) {
        this.rootView = rootView;
        this.interpretationRecordsAudioDuration = interpretationRecordsAudioDuration;
        this.interpretationRecordsAudioSeekbar = interpretationRecordsAudioSeekbar;
        this.interpretationRecordsContent = interpretationRecordsContent;
        this.interpretationRecordsExtraInfo = interpretationRecordsExtraInfo;
        this.interpretationRecordsLanguage = interpretationRecordsLanguage;
        this.interpretationRecordsLocation = interpretationRecordsLocation;
        this.interpretationRecordsTime = interpretationRecordsTime;
        this.interpretationRecordsTitle = interpretationRecordsTitle;
        this.interpretationRecordsToLanguage = interpretationRecordsToLanguage;
        this.simultaneousPlayAudioIcon = simultaneousPlayAudioIcon;
        this.simultaneousPlayAudioVolumeIcon = simultaneousPlayAudioVolumeIcon;
        this.transformLanguageImg = transformLanguageImg;
        this.transformTitleEditImg = transformTitleEditImg;
    }

    @NonNull
    public static ActivityInterpretationRecordsDetailBinding bind(@NonNull View rootView) {
        int r1 = R.id.interpretation_records_audio_duration;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_audio_duration);
        if (r5 == null) goto L31;
        r1 = R.id.interpretation_records_audio_seekbar;
        ProgressBar r6 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_audio_seekbar);
        if (r6 == null) goto L31;
        r1 = R.id.interpretation_records_content;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_content);
        if (r7 == null) goto L31;
        r1 = R.id.interpretation_records_extraInfo;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_extraInfo);
        if (r8 == null) goto L31;
        r1 = R.id.interpretation_records_language;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_language);
        if (r9 == null) goto L31;
        r1 = R.id.interpretation_records_location;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_location);
        if (r10 == null) goto L31;
        r1 = R.id.interpretation_records_time;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_time);
        if (r11 == null) goto L31;
        r1 = R.id.interpretation_records_title;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_title);
        if (r12 == null) goto L31;
        r1 = R.id.interpretation_records_to_language;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_to_language);
        if (r13 == null) goto L31;
        r1 = R.id.simultaneous_play_audio_icon;
        ImageView r14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_play_audio_icon);
        if (r14 == null) goto L31;
        r1 = R.id.simultaneous_play_audio_volume_icon;
        ImageView r15 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_play_audio_volume_icon);
        if (r15 == null) goto L31;
        r1 = R.id.transform_language_img;
        ImageView r16 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
        if (r16 == null) goto L31;
        r1 = R.id.transform_title_edit_img;
        ImageView r17 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_title_edit_img);
        if (r17 == null) goto L31;
        return new ActivityInterpretationRecordsDetailBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
    L31:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityInterpretationRecordsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityInterpretationRecordsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_interpretation_records_detail, parent, false);
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
