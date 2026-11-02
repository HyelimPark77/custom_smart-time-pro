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
public final class ActivityLiveRecordingBinding implements ViewBinding {

    @NonNull
    public final ImageView abhTitleRight;

    @NonNull
    public final TextView dialogueTranslationLeftTv;

    @NonNull
    public final TextView dialogueTranslationRightTv;

    @NonNull
    public final ImageView imgPlay;

    @NonNull
    public final ImageView imgRecordingStatus;

    @NonNull
    public final ImageView imgSelect;

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
    public final PFMedium tvTime;

    private ActivityLiveRecordingBinding(@NonNull LinearLayout rootView_, @NonNull ImageView abhTitleRight, @NonNull TextView dialogueTranslationLeftTv, @NonNull TextView dialogueTranslationRightTv, @NonNull ImageView imgPlay, @NonNull ImageView imgRecordingStatus, @NonNull ImageView imgSelect, @NonNull WaveformView recordLine, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull ImageView transformLanguageImg, @NonNull PFMedium tvTime) {
        this.rootView_ = rootView_;
        this.abhTitleRight = abhTitleRight;
        this.dialogueTranslationLeftTv = dialogueTranslationLeftTv;
        this.dialogueTranslationRightTv = dialogueTranslationRightTv;
        this.imgPlay = imgPlay;
        this.imgRecordingStatus = imgRecordingStatus;
        this.imgSelect = imgSelect;
        this.recordLine = recordLine;
        this.rootView = rootView;
        this.rv = rv;
        this.transformLanguageImg = transformLanguageImg;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ActivityLiveRecordingBinding bind(@NonNull View rootView) {
        int r0 = R.id.abh_title_right;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (r4 == null) goto L25;
        r0 = R.id.dialogue_translation_left_tv;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
        if (r5 == null) goto L25;
        r0 = R.id.dialogue_translation_right_tv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
        if (r6 == null) goto L25;
        r0 = R.id.img_play;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_play);
        if (r7 == null) goto L25;
        r0 = R.id.img_recording_status;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording_status);
        if (r8 == null) goto L25;
        r0 = R.id.img_select;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_select);
        if (r9 == null) goto L25;
        r0 = R.id.record_line;
        WaveformView r10 = (WaveformView) ViewBindings.findChildViewById(rootView, R.id.record_line);
        if (r10 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r12 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r12 == null) goto L25;
        r0 = R.id.transform_language_img;
        ImageView r13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
        if (r13 == null) goto L25;
        r0 = R.id.tv_time;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r14 == null) goto L25;
        return new ActivityLiveRecordingBinding(r3, r4, r5, r6, r7, r8, r9, r10, r3, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityLiveRecordingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityLiveRecordingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_live_recording, parent, false);
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
