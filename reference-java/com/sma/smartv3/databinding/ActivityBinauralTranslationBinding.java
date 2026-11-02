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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50970rv;

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
        this.f50970rv = rv;
        this.transformLanguageImg = transformLanguageImg;
        this.tvLeftSelectLanguage = tvLeftSelectLanguage;
        this.tvRightSelectLanguage = tvRightSelectLanguage;
        this.tvTime = tvTime;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityBinauralTranslationBinding bind(@NonNull View rootView) {
        int i = R.id.abh_title_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (imageView != null) {
            i = R.id.dialogue_translation_left_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
            if (textView != null) {
                i = R.id.dialogue_translation_right_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
                if (textView2 != null) {
                    i = R.id.img_change_big;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_change_big);
                    if (imageView2 != null) {
                        i = R.id.img_play;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_play);
                        if (imageView3 != null) {
                            i = R.id.img_recording_status;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording_status);
                            if (imageView4 != null) {
                                i = R.id.ll_left_language;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_left_language);
                                if (linearLayout != null) {
                                    i = R.id.ll_right_language;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_right_language);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_top_select_language;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_top_select_language);
                                        if (linearLayout3 != null) {
                                            i = R.id.record_line;
                                            WaveformView waveformView = (WaveformView) ViewBindings.findChildViewById(rootView, R.id.record_line);
                                            if (waveformView != null) {
                                                LinearLayout linearLayout4 = (LinearLayout) rootView;
                                                i = R.id.f51422rv;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                                if (recyclerView != null) {
                                                    i = R.id.transform_language_img;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
                                                    if (imageView5 != null) {
                                                        i = R.id.tv_left_select_language;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_left_select_language);
                                                        if (textView3 != null) {
                                                            i = R.id.tv_right_select_language;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_right_select_language);
                                                            if (textView4 != null) {
                                                                i = R.id.tv_time;
                                                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                                                                if (pFMedium != null) {
                                                                    i = R.id.tv_tip;
                                                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                                                                    if (pFMedium2 != null) {
                                                                        return new ActivityBinauralTranslationBinding(linearLayout4, imageView, textView, textView2, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, waveformView, linearLayout4, recyclerView, imageView5, textView3, textView4, pFMedium, pFMedium2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBinauralTranslationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityBinauralTranslationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_binaural_translation, parent, false);
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
