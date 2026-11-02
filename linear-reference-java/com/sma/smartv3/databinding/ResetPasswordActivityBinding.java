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

    @NonNull
    public final LinearLayout rv;

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
        this.rv = rv;
        this.verificationCode = verificationCode;
    }

    @NonNull
    public static ResetPasswordActivityBinding bind(@NonNull View rootView) {
        int r0 = R.id.btGetVerificationCode;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btGetVerificationCode);
        if (r4 == null) goto L25;
        r0 = R.id.btn_confirm;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_confirm);
        if (r5 == null) goto L25;
        r0 = R.id.btn_nextStep;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_nextStep);
        if (r6 == null) goto L25;
        r0 = R.id.email;
        TextInputEditText r7 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.email);
        if (r7 == null) goto L25;
        r0 = R.id.llGetVerificationCode;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llGetVerificationCode);
        if (r8 == null) goto L25;
        r0 = R.id.llSetNewPassword;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSetNewPassword);
        if (r9 == null) goto L25;
        r0 = R.id.newPassword;
        TextInputEditText r10 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.newPassword);
        if (r10 == null) goto L25;
        r0 = R.id.newPasswordAgain;
        TextInputEditText r11 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.newPasswordAgain);
        if (r11 == null) goto L25;
        r0 = R.id.resetPasswordTip;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.resetPasswordTip);
        if (r12 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.verificationCode;
        TextInputEditText r14 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verificationCode);
        if (r14 == null) goto L25;
        return new ResetPasswordActivityBinding(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r3, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ResetPasswordActivityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ResetPasswordActivityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.reset_password_activity, parent, false);
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
