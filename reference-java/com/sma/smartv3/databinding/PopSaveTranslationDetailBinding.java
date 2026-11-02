package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopSaveTranslationDetailBinding implements ViewBinding {

    @NonNull
    public final PFMedium popTranslationDetailAudioDuration;

    @NonNull
    public final PFMedium popTranslationDetailAudioFileSize;

    @NonNull
    public final PFMedium popTranslationDetailAudioTextNumber;

    @NonNull
    public final PFMedium popTranslationDetailAudioTime;

    @NonNull
    public final PFMedium popTranslationDetailCopyText;

    @NonNull
    public final PFMedium popTranslationDetailDeleteAudio;

    @NonNull
    public final PFMedium popTranslationDetailExport;

    @NonNull
    private final LinearLayout rootView;

    private PopSaveTranslationDetailBinding(@NonNull LinearLayout rootView, @NonNull PFMedium popTranslationDetailAudioDuration, @NonNull PFMedium popTranslationDetailAudioFileSize, @NonNull PFMedium popTranslationDetailAudioTextNumber, @NonNull PFMedium popTranslationDetailAudioTime, @NonNull PFMedium popTranslationDetailCopyText, @NonNull PFMedium popTranslationDetailDeleteAudio, @NonNull PFMedium popTranslationDetailExport) {
        this.rootView = rootView;
        this.popTranslationDetailAudioDuration = popTranslationDetailAudioDuration;
        this.popTranslationDetailAudioFileSize = popTranslationDetailAudioFileSize;
        this.popTranslationDetailAudioTextNumber = popTranslationDetailAudioTextNumber;
        this.popTranslationDetailAudioTime = popTranslationDetailAudioTime;
        this.popTranslationDetailCopyText = popTranslationDetailCopyText;
        this.popTranslationDetailDeleteAudio = popTranslationDetailDeleteAudio;
        this.popTranslationDetailExport = popTranslationDetailExport;
    }

    @NonNull
    public static PopSaveTranslationDetailBinding bind(@NonNull View rootView) {
        int i = R.id.pop_translation_detail_audio_duration;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_audio_duration);
        if (pFMedium != null) {
            i = R.id.pop_translation_detail_audio_file_size;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_audio_file_size);
            if (pFMedium2 != null) {
                i = R.id.pop_translation_detail_audio_text_number;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_audio_text_number);
                if (pFMedium3 != null) {
                    i = R.id.pop_translation_detail_audio_time;
                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_audio_time);
                    if (pFMedium4 != null) {
                        i = R.id.pop_translation_detail_copy_text;
                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_copy_text);
                        if (pFMedium5 != null) {
                            i = R.id.pop_translation_detail_delete_audio;
                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_delete_audio);
                            if (pFMedium6 != null) {
                                i = R.id.pop_translation_detail_export;
                                PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_export);
                                if (pFMedium7 != null) {
                                    return new PopSaveTranslationDetailBinding((LinearLayout) rootView, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7);
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
    public static PopSaveTranslationDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopSaveTranslationDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_save_translation_detail, parent, false);
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
