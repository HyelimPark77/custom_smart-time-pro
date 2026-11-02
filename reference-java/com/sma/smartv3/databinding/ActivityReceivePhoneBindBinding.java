package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityReceivePhoneBindBinding implements ViewBinding {

    @NonNull
    public final Button btConfirm;

    @NonNull
    public final TextInputEditText phone;

    @NonNull
    public final AppCompatCheckBox privacyAppCheck;

    @NonNull
    public final PFMedium privacyAppTv;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvCode;

    private ActivityReceivePhoneBindBinding(@NonNull LinearLayout rootView_, @NonNull Button btConfirm, @NonNull TextInputEditText phone, @NonNull AppCompatCheckBox privacyAppCheck, @NonNull PFMedium privacyAppTv, @NonNull LinearLayout rootView, @NonNull PFMedium tvCode) {
        this.rootView_ = rootView_;
        this.btConfirm = btConfirm;
        this.phone = phone;
        this.privacyAppCheck = privacyAppCheck;
        this.privacyAppTv = privacyAppTv;
        this.rootView = rootView;
        this.tvCode = tvCode;
    }

    @NonNull
    public static ActivityReceivePhoneBindBinding bind(@NonNull View rootView) {
        int i = R.id.bt_confirm;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_confirm);
        if (button != null) {
            i = R.id.phone;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.phone);
            if (textInputEditText != null) {
                i = R.id.privacyAppCheck;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.privacyAppCheck);
                if (appCompatCheckBox != null) {
                    i = R.id.privacyAppTv;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.privacyAppTv);
                    if (pFMedium != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        i = R.id.tv_code;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
                        if (pFMedium2 != null) {
                            return new ActivityReceivePhoneBindBinding(linearLayout, button, textInputEditText, appCompatCheckBox, pFMedium, linearLayout, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityReceivePhoneBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityReceivePhoneBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_receive_phone_bind, parent, false);
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
