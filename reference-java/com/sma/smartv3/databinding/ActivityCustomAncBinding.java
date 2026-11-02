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
import com.sma.smartv3.otherdevice.p609jl.view.RulerView;
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
        int i = R.id.cl_modify_voice_left;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.cl_modify_voice_left);
        if (linearLayout != null) {
            i = R.id.cl_modify_voice_right;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.cl_modify_voice_right);
            if (linearLayout2 != null) {
                i = R.id.iv_modify_voice_edit_left;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_modify_voice_edit_left);
                if (imageView != null) {
                    i = R.id.iv_modify_voice_edit_right;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_modify_voice_edit_right);
                    if (imageView2 != null) {
                        i = R.id.ruler_modify_voice_left;
                        RulerView rulerView = (RulerView) ViewBindings.findChildViewById(rootView, R.id.ruler_modify_voice_left);
                        if (rulerView != null) {
                            i = R.id.ruler_modify_voice_right;
                            RulerView rulerView2 = (RulerView) ViewBindings.findChildViewById(rootView, R.id.ruler_modify_voice_right);
                            if (rulerView2 != null) {
                                i = R.id.tv_modify_voice_left;
                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_modify_voice_left);
                                if (pFMedium != null) {
                                    i = R.id.tv_modify_voice_left_value;
                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_modify_voice_left_value);
                                    if (pFMedium2 != null) {
                                        i = R.id.tv_modify_voice_right;
                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_modify_voice_right);
                                        if (pFMedium3 != null) {
                                            i = R.id.tv_modify_voice_right_value;
                                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_modify_voice_right_value);
                                            if (pFMedium4 != null) {
                                                return new ActivityCustomAncBinding((LinearLayout) rootView, linearLayout, linearLayout2, imageView, imageView2, rulerView, rulerView2, pFMedium, pFMedium2, pFMedium3, pFMedium4);
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
    public static ActivityCustomAncBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCustomAncBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_custom_anc, parent, false);
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
