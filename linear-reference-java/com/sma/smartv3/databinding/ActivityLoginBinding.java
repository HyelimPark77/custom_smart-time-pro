package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityLoginBinding implements ViewBinding {

    @NonNull
    public final Button btGetVerificationCode;

    @NonNull
    public final Button btLoginType;

    @NonNull
    public final Button btnLogin;

    @NonNull
    public final TextInputEditText email;

    @NonNull
    public final PFMedium loginRemind;

    @NonNull
    public final TextInputEditText password;

    @NonNull
    public final RelativeLayout passwordTil;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout rv;

    @NonNull
    public final TextInputEditText verificationCode;

    @NonNull
    public final LinearLayout verificationCodeLl;

    private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull Button btGetVerificationCode, @NonNull Button btLoginType, @NonNull Button btnLogin, @NonNull TextInputEditText email, @NonNull PFMedium loginRemind, @NonNull TextInputEditText password, @NonNull RelativeLayout passwordTil, @NonNull LinearLayout rv, @NonNull TextInputEditText verificationCode, @NonNull LinearLayout verificationCodeLl) {
        this.rootView = rootView;
        this.btGetVerificationCode = btGetVerificationCode;
        this.btLoginType = btLoginType;
        this.btnLogin = btnLogin;
        this.email = email;
        this.loginRemind = loginRemind;
        this.password = password;
        this.passwordTil = passwordTil;
        this.rv = rv;
        this.verificationCode = verificationCode;
        this.verificationCodeLl = verificationCodeLl;
    }

    @NonNull
    public static ActivityLoginBinding bind(@NonNull View rootView) {
        int r0 = R.id.btGetVerificationCode;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btGetVerificationCode);
        if (r4 == null) goto L23;
        r0 = R.id.btLoginType;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btLoginType);
        if (r5 == null) goto L23;
        r0 = R.id.btn_login;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_login);
        if (r6 == null) goto L23;
        r0 = R.id.email;
        TextInputEditText r7 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.email);
        if (r7 == null) goto L23;
        r0 = R.id.loginRemind;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.loginRemind);
        if (r8 == null) goto L23;
        r0 = R.id.password;
        TextInputEditText r9 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.password);
        if (r9 == null) goto L23;
        r0 = R.id.passwordTil;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.passwordTil);
        if (r10 == null) goto L23;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.verificationCode;
        TextInputEditText r12 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verificationCode);
        if (r12 == null) goto L23;
        r0 = R.id.verificationCodeLl;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.verificationCodeLl);
        if (r13 == null) goto L23;
        return new ActivityLoginBinding(r3, r4, r5, r6, r7, r8, r9, r10, r3, r12, r13);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_login, parent, false);
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
