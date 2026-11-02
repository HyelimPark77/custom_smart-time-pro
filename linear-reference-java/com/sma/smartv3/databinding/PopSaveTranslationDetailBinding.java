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
        int r0 = R.id.pop_translation_detail_audio_duration;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_audio_duration);
        if (r4 == null) goto L19;
        r0 = R.id.pop_translation_detail_audio_file_size;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_audio_file_size);
        if (r5 == null) goto L19;
        r0 = R.id.pop_translation_detail_audio_text_number;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_audio_text_number);
        if (r6 == null) goto L19;
        r0 = R.id.pop_translation_detail_audio_time;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_audio_time);
        if (r7 == null) goto L19;
        r0 = R.id.pop_translation_detail_copy_text;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_copy_text);
        if (r8 == null) goto L19;
        r0 = R.id.pop_translation_detail_delete_audio;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_delete_audio);
        if (r9 == null) goto L19;
        r0 = R.id.pop_translation_detail_export;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_detail_export);
        if (r10 == null) goto L19;
        return new PopSaveTranslationDetailBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopSaveTranslationDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopSaveTranslationDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_save_translation_detail, parent, false);
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
