package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.FloatFrameLayout;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FloatingInterfaceBinding implements ViewBinding {

    @NonNull
    public final View bottomLine;

    @NonNull
    public final AppCompatCheckBox broadcastCheck;

    @NonNull
    public final FrameLayout flRecording;

    @NonNull
    public final AppCompatImageView imgClose;

    @NonNull
    public final ImageView imgRecord;

    @NonNull
    public final AppCompatImageView imgRecordShow;

    @NonNull
    public final ImageView imgRecording;

    @NonNull
    public final ImageView imgRecordingAnimation;

    @NonNull
    public final LinearLayout llHideContent;

    @NonNull
    public final LinearLayout llShowSet;

    @NonNull
    public final LinearLayout llTools;

    @NonNull
    public final AppCompatCheckBox originalCheck;

    @NonNull
    public final RelativeLayout rlShowAll;

    @NonNull
    public final FloatFrameLayout rootView;

    @NonNull
    private final FloatFrameLayout rootView_;

    @NonNull
    public final AppCompatCheckBox translateCheck;

    @NonNull
    public final PFMedium tvOriginalT;

    @NonNull
    public final PFMedium tvTranslate;

    @NonNull
    public final PFMedium tvTranslateT;

    private FloatingInterfaceBinding(@NonNull FloatFrameLayout rootView_, @NonNull View bottomLine, @NonNull AppCompatCheckBox broadcastCheck, @NonNull FrameLayout flRecording, @NonNull AppCompatImageView imgClose, @NonNull ImageView imgRecord, @NonNull AppCompatImageView imgRecordShow, @NonNull ImageView imgRecording, @NonNull ImageView imgRecordingAnimation, @NonNull LinearLayout llHideContent, @NonNull LinearLayout llShowSet, @NonNull LinearLayout llTools, @NonNull AppCompatCheckBox originalCheck, @NonNull RelativeLayout rlShowAll, @NonNull FloatFrameLayout rootView, @NonNull AppCompatCheckBox translateCheck, @NonNull PFMedium tvOriginalT, @NonNull PFMedium tvTranslate, @NonNull PFMedium tvTranslateT) {
        this.rootView_ = rootView_;
        this.bottomLine = bottomLine;
        this.broadcastCheck = broadcastCheck;
        this.flRecording = flRecording;
        this.imgClose = imgClose;
        this.imgRecord = imgRecord;
        this.imgRecordShow = imgRecordShow;
        this.imgRecording = imgRecording;
        this.imgRecordingAnimation = imgRecordingAnimation;
        this.llHideContent = llHideContent;
        this.llShowSet = llShowSet;
        this.llTools = llTools;
        this.originalCheck = originalCheck;
        this.rlShowAll = rlShowAll;
        this.rootView = rootView;
        this.translateCheck = translateCheck;
        this.tvOriginalT = tvOriginalT;
        this.tvTranslate = tvTranslate;
        this.tvTranslateT = tvTranslateT;
    }

    @NonNull
    public static FloatingInterfaceBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (viewFindChildViewById != null) {
            i = R.id.broadcast_check;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.broadcast_check);
            if (appCompatCheckBox != null) {
                i = R.id.fl_recording;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_recording);
                if (frameLayout != null) {
                    i = R.id.img_close;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.img_close);
                    if (appCompatImageView != null) {
                        i = R.id.img_record;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_record);
                        if (imageView != null) {
                            i = R.id.img_record_show;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.img_record_show);
                            if (appCompatImageView2 != null) {
                                i = R.id.img_recording;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording);
                                if (imageView2 != null) {
                                    i = R.id.img_recording_animation;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording_animation);
                                    if (imageView3 != null) {
                                        i = R.id.ll_hide_content;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hide_content);
                                        if (linearLayout != null) {
                                            i = R.id.ll_show_set;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_show_set);
                                            if (linearLayout2 != null) {
                                                i = R.id.ll_tools;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_tools);
                                                if (linearLayout3 != null) {
                                                    i = R.id.original_check;
                                                    AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.original_check);
                                                    if (appCompatCheckBox2 != null) {
                                                        i = R.id.rl_show_all;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_show_all);
                                                        if (relativeLayout != null) {
                                                            FloatFrameLayout floatFrameLayout = (FloatFrameLayout) rootView;
                                                            i = R.id.translate_check;
                                                            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.translate_check);
                                                            if (appCompatCheckBox3 != null) {
                                                                i = R.id.tv_original_t;
                                                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_original_t);
                                                                if (pFMedium != null) {
                                                                    i = R.id.tv_translate;
                                                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_translate);
                                                                    if (pFMedium2 != null) {
                                                                        i = R.id.tv_translate_t;
                                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_translate_t);
                                                                        if (pFMedium3 != null) {
                                                                            return new FloatingInterfaceBinding(floatFrameLayout, viewFindChildViewById, appCompatCheckBox, frameLayout, appCompatImageView, imageView, appCompatImageView2, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, appCompatCheckBox2, relativeLayout, floatFrameLayout, appCompatCheckBox3, pFMedium, pFMedium2, pFMedium3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FloatingInterfaceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FloatingInterfaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.floating_interface, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FloatFrameLayout getRoot() {
        return this.rootView_;
    }
}
