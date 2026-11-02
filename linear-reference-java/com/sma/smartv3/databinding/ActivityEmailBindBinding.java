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

    @NonNull
    public final LinearLayout rv;

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
        this.rv = rv;
        this.tvCodeError = tvCodeError;
        this.tvDescription = tvDescription;
        this.tvTitle = tvTitle;
        this.verificationCode = verificationCode;
    }

    @NonNull
    public static ActivityEmailBindBinding bind(@NonNull View rootView) {
        int r0 = R.id.bottom_btn;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.bottom_btn);
        if (r4 == null) goto L25;
        r0 = R.id.btGetVerificationCode;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btGetVerificationCode);
        if (r5 == null) goto L25;
        r0 = R.id.btn_codeErrorGoLogin;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_codeErrorGoLogin);
        if (r6 == null) goto L25;
        r0 = R.id.email;
        TextInputEditText r7 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.email);
        if (r7 == null) goto L25;
        r0 = R.id.llCheckCode;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCheckCode);
        if (r8 == null) goto L25;
        r0 = R.id.llInputEmail;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llInputEmail);
        if (r9 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tvCodeError;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvCodeError);
        if (r11 == null) goto L25;
        r0 = R.id.tvDescription;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvDescription);
        if (r12 == null) goto L25;
        r0 = R.id.tvTitle;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvTitle);
        if (r13 == null) goto L25;
        r0 = R.id.verificationCode;
        TextInputEditText r14 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verificationCode);
        if (r14 == null) goto L25;
        return new ActivityEmailBindBinding(r3, r4, r5, r6, r7, r8, r9, r3, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityEmailBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityEmailBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_email_bind, parent, false);
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
