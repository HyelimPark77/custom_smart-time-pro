package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySosSettingsBinding implements ViewBinding {

    @NonNull
    public final View bottomLine;

    @NonNull
    public final TextInputEditText etPhoneValue;

    @NonNull
    public final AbhSettingsHeader fallDetectionHeader;

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final ImageView ivEnter;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final NestedScrollView rootView;

    @NonNull
    public final View topLine;

    @NonNull
    public final PFMedium tvCode;

    @NonNull
    public final PFMedium tvLabel;

    private ActivitySosSettingsBinding(@NonNull NestedScrollView rootView, @NonNull View bottomLine, @NonNull TextInputEditText etPhoneValue, @NonNull AbhSettingsHeader fallDetectionHeader, @NonNull AbhSettingsHeader itemHeader, @NonNull ImageView ivEnter, @NonNull LinearLayout root, @NonNull View topLine, @NonNull PFMedium tvCode, @NonNull PFMedium tvLabel) {
        this.rootView = rootView;
        this.bottomLine = bottomLine;
        this.etPhoneValue = etPhoneValue;
        this.fallDetectionHeader = fallDetectionHeader;
        this.itemHeader = itemHeader;
        this.ivEnter = ivEnter;
        this.root = root;
        this.topLine = topLine;
        this.tvCode = tvCode;
        this.tvLabel = tvLabel;
    }

    @NonNull
    public static ActivitySosSettingsBinding bind(@NonNull View rootView) {
        int r0 = R.id.bottom_line;
        View r3 = ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (r3 == null) goto L23;
        r0 = R.id.et_phone_value;
        TextInputEditText r4 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.et_phone_value);
        if (r4 == null) goto L23;
        r0 = R.id.fall_detection_header;
        AbhSettingsHeader r5 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.fall_detection_header);
        if (r5 == null) goto L23;
        r0 = R.id.item_header;
        AbhSettingsHeader r6 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (r6 == null) goto L23;
        r0 = R.id.iv_enter;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_enter);
        if (r7 == null) goto L23;
        r0 = R.id.root;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.root);
        if (r8 == null) goto L23;
        r0 = R.id.top_line;
        View r9 = ViewBindings.findChildViewById(rootView, R.id.top_line);
        if (r9 == null) goto L23;
        r0 = R.id.tv_code;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
        if (r10 == null) goto L23;
        r0 = R.id.tv_label;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_label);
        if (r11 == null) goto L23;
        return new ActivitySosSettingsBinding((NestedScrollView) rootView, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySosSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySosSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sos_settings, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
