package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AbhSettingsHeaderBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkEnabled;

    @NonNull
    public final FrameLayout flRightView;

    @NonNull
    public final ImageView ivEnter;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvDescription;

    @NonNull
    public final PFMedium tvTitle;

    private AbhSettingsHeaderBinding(@NonNull LinearLayout rootView, @NonNull AppCompatCheckBox checkEnabled, @NonNull FrameLayout flRightView, @NonNull ImageView ivEnter, @NonNull PFMedium tvDescription, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.checkEnabled = checkEnabled;
        this.flRightView = flRightView;
        this.ivEnter = ivEnter;
        this.tvDescription = tvDescription;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static AbhSettingsHeaderBinding bind(@NonNull View rootView) {
        int i = R.id.check_enabled;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_enabled);
        if (appCompatCheckBox != null) {
            i = R.id.fl_right_view;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_right_view);
            if (frameLayout != null) {
                i = R.id.iv_enter;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_enter);
                if (imageView != null) {
                    i = R.id.tv_description;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_description);
                    if (pFMedium != null) {
                        i = R.id.tv_title;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                        if (pFMedium2 != null) {
                            return new AbhSettingsHeaderBinding((LinearLayout) rootView, appCompatCheckBox, frameLayout, imageView, pFMedium, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AbhSettingsHeaderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AbhSettingsHeaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.abh_settings_header, parent, false);
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
