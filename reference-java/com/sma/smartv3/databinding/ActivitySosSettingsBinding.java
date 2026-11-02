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
        int i = R.id.bottom_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (viewFindChildViewById != null) {
            i = R.id.et_phone_value;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.et_phone_value);
            if (textInputEditText != null) {
                i = R.id.fall_detection_header;
                AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.fall_detection_header);
                if (abhSettingsHeader != null) {
                    i = R.id.item_header;
                    AbhSettingsHeader abhSettingsHeader2 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
                    if (abhSettingsHeader2 != null) {
                        i = R.id.iv_enter;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_enter);
                        if (imageView != null) {
                            i = R.id.root;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.root);
                            if (linearLayout != null) {
                                i = R.id.top_line;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.top_line);
                                if (viewFindChildViewById2 != null) {
                                    i = R.id.tv_code;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
                                    if (pFMedium != null) {
                                        i = R.id.tv_label;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_label);
                                        if (pFMedium2 != null) {
                                            return new ActivitySosSettingsBinding((NestedScrollView) rootView, viewFindChildViewById, textInputEditText, abhSettingsHeader, abhSettingsHeader2, imageView, linearLayout, viewFindChildViewById2, pFMedium, pFMedium2);
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
    public static ActivitySosSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySosSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sos_settings, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
