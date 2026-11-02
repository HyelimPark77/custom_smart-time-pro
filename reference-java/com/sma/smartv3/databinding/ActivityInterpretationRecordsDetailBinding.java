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
        int i = R.id.interpretation_records_audio_duration;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_audio_duration);
        if (pFMedium != null) {
            i = R.id.interpretation_records_audio_seekbar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_audio_seekbar);
            if (progressBar != null) {
                i = R.id.interpretation_records_content;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_content);
                if (pFMedium2 != null) {
                    i = R.id.interpretation_records_extraInfo;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_extraInfo);
                    if (pFMedium3 != null) {
                        i = R.id.interpretation_records_language;
                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_language);
                        if (pFMedium4 != null) {
                            i = R.id.interpretation_records_location;
                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_location);
                            if (pFMedium5 != null) {
                                i = R.id.interpretation_records_time;
                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_time);
                                if (pFMedium6 != null) {
                                    i = R.id.interpretation_records_title;
                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_title);
                                    if (pFMedium7 != null) {
                                        i = R.id.interpretation_records_to_language;
                                        PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_to_language);
                                        if (pFMedium8 != null) {
                                            i = R.id.simultaneous_play_audio_icon;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_play_audio_icon);
                                            if (imageView != null) {
                                                i = R.id.simultaneous_play_audio_volume_icon;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.simultaneous_play_audio_volume_icon);
                                                if (imageView2 != null) {
                                                    i = R.id.transform_language_img;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
                                                    if (imageView3 != null) {
                                                        i = R.id.transform_title_edit_img;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_title_edit_img);
                                                        if (imageView4 != null) {
                                                            return new ActivityInterpretationRecordsDetailBinding((LinearLayout) rootView, pFMedium, progressBar, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, imageView, imageView2, imageView3, imageView4);
                                                        }
                                                    }
                                                }
                                            }
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
    public static ActivityInterpretationRecordsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityInterpretationRecordsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_interpretation_records_detail, parent, false);
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
