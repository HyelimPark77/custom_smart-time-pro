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
public final class ActivityEmailBindBinding implements ViewBinding {

    @NonNull
    public final Button bottomBtn;

    @NonNull
    public final Button btGetVerificationCode;

    @NonNull
    public final Button btnCodeErrorGoLogin;

    @NonNull
    public final TextInputEditText email;

    @NonNull
    public final LinearLayout llCheckCode;

    @NonNull
    public final LinearLayout llInputEmail;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final LinearLayout f50978rv;

    @NonNull
    public final PFMedium tvCodeError;

    @NonNull
    public final PFMedium tvDescription;

    @NonNull
    public final PFMedium tvTitle;

    @NonNull
    public final TextInputEditText verificationCode;

    private ActivityEmailBindBinding(@NonNull LinearLayout rootView, @NonNull Button bottomBtn, @NonNull Button btGetVerificationCode, @NonNull Button btnCodeErrorGoLogin, @NonNull TextInputEditText email, @NonNull LinearLayout llCheckCode, @NonNull LinearLayout llInputEmail, @NonNull LinearLayout rv, @NonNull PFMedium tvCodeError, @NonNull PFMedium tvDescription, @NonNull PFMedium tvTitle, @NonNull TextInputEditText verificationCode) {
        this.rootView = rootView;
        this.bottomBtn = bottomBtn;
        this.btGetVerificationCode = btGetVerificationCode;
        this.btnCodeErrorGoLogin = btnCodeErrorGoLogin;
        this.email = email;
        this.llCheckCode = llCheckCode;
        this.llInputEmail = llInputEmail;
        this.f50978rv = rv;
        this.tvCodeError = tvCodeError;
        this.tvDescription = tvDescription;
        this.tvTitle = tvTitle;
        this.verificationCode = verificationCode;
    }

    @NonNull
    public static ActivityEmailBindBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_btn;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.bottom_btn);
        if (button != null) {
            i = R.id.btGetVerificationCode;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btGetVerificationCode);
            if (button2 != null) {
                i = R.id.btn_codeErrorGoLogin;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_codeErrorGoLogin);
                if (button3 != null) {
                    i = R.id.email;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.email);
                    if (textInputEditText != null) {
                        i = R.id.llCheckCode;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCheckCode);
                        if (linearLayout != null) {
                            i = R.id.llInputEmail;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llInputEmail);
                            if (linearLayout2 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) rootView;
                                i = R.id.tvCodeError;
                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvCodeError);
                                if (pFMedium != null) {
                                    i = R.id.tvDescription;
                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvDescription);
                                    if (pFMedium2 != null) {
                                        i = R.id.tvTitle;
                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvTitle);
                                        if (pFMedium3 != null) {
                                            i = R.id.verificationCode;
                                            TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verificationCode);
                                            if (textInputEditText2 != null) {
                                                return new ActivityEmailBindBinding(linearLayout3, button, button2, button3, textInputEditText, linearLayout, linearLayout2, linearLayout3, pFMedium, pFMedium2, pFMedium3, textInputEditText2);
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
    public static ActivityEmailBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityEmailBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_email_bind, parent, false);
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
