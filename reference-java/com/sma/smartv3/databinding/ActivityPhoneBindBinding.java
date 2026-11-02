package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityPhoneBindBinding implements ViewBinding {

    @NonNull
    public final Button bottomBtn;

    @NonNull
    public final Button btGetVerificationCode;

    @NonNull
    public final LinearLayout llCheckCode;

    @NonNull
    public final LinearLayout llInputPhone;

    @NonNull
    public final TextInputEditText phone;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final LinearLayout f50994rv;

    @NonNull
    public final PFMedium tvCode;

    @NonNull
    public final PFMedium tvCodeError;

    @NonNull
    public final PFMedium tvDescription;

    @NonNull
    public final PFMedium tvTitle;

    @NonNull
    public final TextInputEditText verificationCode;

    private ActivityPhoneBindBinding(@NonNull LinearLayout rootView, @NonNull Button bottomBtn, @NonNull Button btGetVerificationCode, @NonNull LinearLayout llCheckCode, @NonNull LinearLayout llInputPhone, @NonNull TextInputEditText phone, @NonNull LinearLayout rv, @NonNull PFMedium tvCode, @NonNull PFMedium tvCodeError, @NonNull PFMedium tvDescription, @NonNull PFMedium tvTitle, @NonNull TextInputEditText verificationCode) {
        this.rootView = rootView;
        this.bottomBtn = bottomBtn;
        this.btGetVerificationCode = btGetVerificationCode;
        this.llCheckCode = llCheckCode;
        this.llInputPhone = llInputPhone;
        this.phone = phone;
        this.f50994rv = rv;
        this.tvCode = tvCode;
        this.tvCodeError = tvCodeError;
        this.tvDescription = tvDescription;
        this.tvTitle = tvTitle;
        this.verificationCode = verificationCode;
    }

    @NonNull
    public static ActivityPhoneBindBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_btn;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.bottom_btn);
        if (button != null) {
            i = R.id.btGetVerificationCode;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btGetVerificationCode);
            if (button2 != null) {
                i = R.id.llCheckCode;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCheckCode);
                if (linearLayout != null) {
                    i = R.id.llInputPhone;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llInputPhone);
                    if (linearLayout2 != null) {
                        i = R.id.phone;
                        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.phone);
                        if (textInputEditText != null) {
                            LinearLayout linearLayout3 = (LinearLayout) rootView;
                            i = R.id.tv_code;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
                            if (pFMedium != null) {
                                i = R.id.tvCodeError;
                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvCodeError);
                                if (pFMedium2 != null) {
                                    i = R.id.tvDescription;
                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvDescription);
                                    if (pFMedium3 != null) {
                                        i = R.id.tvTitle;
                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvTitle);
                                        if (pFMedium4 != null) {
                                            i = R.id.verificationCode;
                                            TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verificationCode);
                                            if (textInputEditText2 != null) {
                                                return new ActivityPhoneBindBinding(linearLayout3, button, button2, linearLayout, linearLayout2, textInputEditText, linearLayout3, pFMedium, pFMedium2, pFMedium3, pFMedium4, textInputEditText2);
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
    public static ActivityPhoneBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPhoneBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_phone_bind, parent, false);
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
