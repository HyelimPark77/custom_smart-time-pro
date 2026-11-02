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
        int r1 = R.id.bottom_line;
        View r4 = ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (r4 == null) goto L39;
        r1 = R.id.broadcast_check;
        AppCompatCheckBox r5 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.broadcast_check);
        if (r5 == null) goto L39;
        r1 = R.id.fl_recording;
        FrameLayout r6 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_recording);
        if (r6 == null) goto L39;
        r1 = R.id.img_close;
        AppCompatImageView r7 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.img_close);
        if (r7 == null) goto L39;
        r1 = R.id.img_record;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_record);
        if (r8 == null) goto L39;
        r1 = R.id.img_record_show;
        AppCompatImageView r9 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.img_record_show);
        if (r9 == null) goto L39;
        r1 = R.id.img_recording;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording);
        if (r10 == null) goto L39;
        r1 = R.id.img_recording_animation;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_recording_animation);
        if (r11 == null) goto L39;
        r1 = R.id.ll_hide_content;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hide_content);
        if (r12 == null) goto L39;
        r1 = R.id.ll_show_set;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_show_set);
        if (r13 == null) goto L39;
        r1 = R.id.ll_tools;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_tools);
        if (r14 == null) goto L39;
        r1 = R.id.original_check;
        AppCompatCheckBox r15 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.original_check);
        if (r15 == null) goto L39;
        r1 = R.id.rl_show_all;
        RelativeLayout r16 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_show_all);
        if (r16 == null) goto L39;
        FloatFrameLayout r3 = (FloatFrameLayout) rootView;
        r1 = R.id.translate_check;
        AppCompatCheckBox r18 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.translate_check);
        if (r18 == null) goto L39;
        r1 = R.id.tv_original_t;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_original_t);
        if (r19 == null) goto L39;
        r1 = R.id.tv_translate;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_translate);
        if (r20 == null) goto L39;
        r1 = R.id.tv_translate_t;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_translate_t);
        if (r21 == null) goto L39;
        return new FloatingInterfaceBinding(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r3, r18, r19, r20, r21);
    L39:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FloatingInterfaceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FloatingInterfaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.floating_interface, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FloatFrameLayout getRoot() {
        return this.rootView_;
    }
}
