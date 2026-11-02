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
        int r0 = R.id.check_enabled;
        AppCompatCheckBox r4 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_enabled);
        if (r4 == null) goto L15;
        r0 = R.id.fl_right_view;
        FrameLayout r5 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_right_view);
        if (r5 == null) goto L15;
        r0 = R.id.iv_enter;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_enter);
        if (r6 == null) goto L15;
        r0 = R.id.tv_description;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_description);
        if (r7 == null) goto L15;
        r0 = R.id.tv_title;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r8 == null) goto L15;
        return new AbhSettingsHeaderBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AbhSettingsHeaderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AbhSettingsHeaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.abh_settings_header, parent, false);
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
