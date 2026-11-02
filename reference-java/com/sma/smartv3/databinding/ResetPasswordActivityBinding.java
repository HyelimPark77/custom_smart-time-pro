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
public final class ResetPasswordActivityBinding implements ViewBinding {

    @NonNull
    public final Button btGetVerificationCode;

    @NonNull
    public final Button btnConfirm;

    @NonNull
    public final Button btnNextStep;

    @NonNull
    public final TextInputEditText email;

    @NonNull
    public final LinearLayout llGetVerificationCode;

    @NonNull
    public final LinearLayout llSetNewPassword;

    @NonNull
    public final TextInputEditText newPassword;

    @NonNull
    public final TextInputEditText newPasswordAgain;

    @NonNull
    public final PFMedium resetPasswordTip;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final LinearLayout f51187rv;

    @NonNull
    public final TextInputEditText verificationCode;

    private ResetPasswordActivityBinding(@NonNull LinearLayout rootView, @NonNull Button btGetVerificationCode, @NonNull Button btnConfirm, @NonNull Button btnNextStep, @NonNull TextInputEditText email, @NonNull LinearLayout llGetVerificationCode, @NonNull LinearLayout llSetNewPassword, @NonNull TextInputEditText newPassword, @NonNull TextInputEditText newPasswordAgain, @NonNull PFMedium resetPasswordTip, @NonNull LinearLayout rv, @NonNull TextInputEditText verificationCode) {
        this.rootView = rootView;
        this.btGetVerificationCode = btGetVerificationCode;
        this.btnConfirm = btnConfirm;
        this.btnNextStep = btnNextStep;
        this.email = email;
        this.llGetVerificationCode = llGetVerificationCode;
        this.llSetNewPassword = llSetNewPassword;
        this.newPassword = newPassword;
        this.newPasswordAgain = newPasswordAgain;
        this.resetPasswordTip = resetPasswordTip;
        this.f51187rv = rv;
        this.verificationCode = verificationCode;
    }

    @NonNull
    public static ResetPasswordActivityBinding bind(@NonNull View rootView) {
        int i = R.id.btGetVerificationCode;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btGetVerificationCode);
        if (button != null) {
            i = R.id.btn_confirm;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_confirm);
            if (button2 != null) {
                i = R.id.btn_nextStep;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_nextStep);
                if (button3 != null) {
                    i = R.id.email;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.email);
                    if (textInputEditText != null) {
                        i = R.id.llGetVerificationCode;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llGetVerificationCode);
                        if (linearLayout != null) {
                            i = R.id.llSetNewPassword;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSetNewPassword);
                            if (linearLayout2 != null) {
                                i = R.id.newPassword;
                                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.newPassword);
                                if (textInputEditText2 != null) {
                                    i = R.id.newPasswordAgain;
                                    TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.newPasswordAgain);
                                    if (textInputEditText3 != null) {
                                        i = R.id.resetPasswordTip;
                                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.resetPasswordTip);
                                        if (pFMedium != null) {
                                            LinearLayout linearLayout3 = (LinearLayout) rootView;
                                            i = R.id.verificationCode;
                                            TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verificationCode);
                                            if (textInputEditText4 != null) {
                                                return new ResetPasswordActivityBinding(linearLayout3, button, button2, button3, textInputEditText, linearLayout, linearLayout2, textInputEditText2, textInputEditText3, pFMedium, linearLayout3, textInputEditText4);
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
    public static ResetPasswordActivityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ResetPasswordActivityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.reset_password_activity, parent, false);
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
