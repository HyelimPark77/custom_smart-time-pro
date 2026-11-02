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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50984rv;

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
        this.f50984rv = rv;
        this.transformLanguageImg = transformLanguageImg;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ActivityLiveRecordingBinding bind(@NonNull View rootView) {
        int i = R.id.abh_title_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (imageView != null) {
            i = R.id.dialogue_translation_left_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
            if (textView != null) {
                i = R.id.dialogue_translation_right_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
                if (textView2 != null) {
                    i = R.id.img_play;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_play);
                    if (imageView2 != null) {
                        i = R.id.img_recording_status;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording_status);
                        if (imageView3 != null) {
                            i = R.id.img_select;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_select);
                            if (imageView4 != null) {
                                i = R.id.record_line;
                                WaveformView waveformView = (WaveformView) ViewBindings.findChildViewById(rootView, R.id.record_line);
                                if (waveformView != null) {
                                    LinearLayout linearLayout = (LinearLayout) rootView;
                                    i = R.id.f51422rv;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                    if (recyclerView != null) {
                                        i = R.id.transform_language_img;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
                                        if (imageView5 != null) {
                                            i = R.id.tv_time;
                                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                                            if (pFMedium != null) {
                                                return new ActivityLiveRecordingBinding(linearLayout, imageView, textView, textView2, imageView2, imageView3, imageView4, waveformView, linearLayout, recyclerView, imageView5, pFMedium);
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
    public static ActivityLiveRecordingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityLiveRecordingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_live_recording, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
