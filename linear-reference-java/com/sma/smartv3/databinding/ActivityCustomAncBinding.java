package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.otherdevice.jl.view.RulerView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCustomAncBinding implements ViewBinding {

    @NonNull
    public final LinearLayout clModifyVoiceLeft;

    @NonNull
    public final LinearLayout clModifyVoiceRight;

    @NonNull
    public final ImageView ivModifyVoiceEditLeft;

    @NonNull
    public final ImageView ivModifyVoiceEditRight;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RulerView rulerModifyVoiceLeft;

    @NonNull
    public final RulerView rulerModifyVoiceRight;

    @NonNull
    public final PFMedium tvModifyVoiceLeft;

    @NonNull
    public final PFMedium tvModifyVoiceLeftValue;

    @NonNull
    public final PFMedium tvModifyVoiceRight;

    @NonNull
    public final PFMedium tvModifyVoiceRightValue;

    private ActivityCustomAncBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout clModifyVoiceLeft, @NonNull LinearLayout clModifyVoiceRight, @NonNull ImageView ivModifyVoiceEditLeft, @NonNull ImageView ivModifyVoiceEditRight, @NonNull RulerView rulerModifyVoiceLeft, @NonNull RulerView rulerModifyVoiceRight, @NonNull PFMedium tvModifyVoiceLeft, @NonNull PFMedium tvModifyVoiceLeftValue, @NonNull PFMedium tvModifyVoiceRight, @NonNull PFMedium tvModifyVoiceRightValue) {
        this.rootView = rootView;
        this.clModifyVoiceLeft = clModifyVoiceLeft;
        this.clModifyVoiceRight = clModifyVoiceRight;
        this.ivModifyVoiceEditLeft = ivModifyVoiceEditLeft;
        this.ivModifyVoiceEditRight = ivModifyVoiceEditRight;
        this.rulerModifyVoiceLeft = rulerModifyVoiceLeft;
        this.rulerModifyVoiceRight = rulerModifyVoiceRight;
        this.tvModifyVoiceLeft = tvModifyVoiceLeft;
        this.tvModifyVoiceLeftValue = tvModifyVoiceLeftValue;
        this.tvModifyVoiceRight = tvModifyVoiceRight;
        this.tvModifyVoiceRightValue = tvModifyVoiceRightValue;
    }

    @NonNull
    public static ActivityCustomAncBinding bind(@NonNull View rootView) {
        int r0 = R.id.cl_modify_voice_left;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.cl_modify_voice_left);
        if (r4 == null) goto L25;
        r0 = R.id.cl_modify_voice_right;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.cl_modify_voice_right);
        if (r5 == null) goto L25;
        r0 = R.id.iv_modify_voice_edit_left;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_modify_voice_edit_left);
        if (r6 == null) goto L25;
        r0 = R.id.iv_modify_voice_edit_right;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_modify_voice_edit_right);
        if (r7 == null) goto L25;
        r0 = R.id.ruler_modify_voice_left;
        RulerView r8 = (RulerView) ViewBindings.findChildViewById(rootView, R.id.ruler_modify_voice_left);
        if (r8 == null) goto L25;
        r0 = R.id.ruler_modify_voice_right;
        RulerView r9 = (RulerView) ViewBindings.findChildViewById(rootView, R.id.ruler_modify_voice_right);
        if (r9 == null) goto L25;
        r0 = R.id.tv_modify_voice_left;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_modify_voice_left);
        if (r10 == null) goto L25;
        r0 = R.id.tv_modify_voice_left_value;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_modify_voice_left_value);
        if (r11 == null) goto L25;
        r0 = R.id.tv_modify_voice_right;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_modify_voice_right);
        if (r12 == null) goto L25;
        r0 = R.id.tv_modify_voice_right_value;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_modify_voice_right_value);
        if (r13 == null) goto L25;
        return new ActivityCustomAncBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCustomAncBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCustomAncBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_custom_anc, parent, false);
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
