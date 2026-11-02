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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50990rv;

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
        this.f50990rv = rv;
        this.transformLanguageImg = transformLanguageImg;
        this.translateLeftIv = translateLeftIv;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ActivityNewSimultaneousInterpretationBinding bind(@NonNull View rootView) {
        int i = R.id.abh_title_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (imageView != null) {
            i = R.id.dialogue_translation_left_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
            if (textView != null) {
                i = R.id.dialogue_translation_right_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
                if (textView2 != null) {
                    i = R.id.img_broadcast;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_broadcast);
                    if (imageView2 != null) {
                        i = R.id.img_direction;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_direction);
                        if (imageView3 != null) {
                            i = R.id.img_play;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_play);
                            if (imageView4 != null) {
                                i = R.id.img_recording_status;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording_status);
                                if (imageView5 != null) {
                                    i = R.id.record_line;
                                    WaveformView waveformView = (WaveformView) ViewBindings.findChildViewById(rootView, R.id.record_line);
                                    if (waveformView != null) {
                                        LinearLayout linearLayout = (LinearLayout) rootView;
                                        i = R.id.f51422rv;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                        if (recyclerView != null) {
                                            i = R.id.transform_language_img;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
                                            if (imageView6 != null) {
                                                i = R.id.translate_left_iv;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.translate_left_iv);
                                                if (imageView7 != null) {
                                                    i = R.id.tv_time;
                                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                                                    if (pFMedium != null) {
                                                        return new ActivityNewSimultaneousInterpretationBinding(linearLayout, imageView, textView, textView2, imageView2, imageView3, imageView4, imageView5, waveformView, linearLayout, recyclerView, imageView6, imageView7, pFMedium);
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
    public static ActivityNewSimultaneousInterpretationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityNewSimultaneousInterpretationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_new_simultaneous_interpretation, parent, false);
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
