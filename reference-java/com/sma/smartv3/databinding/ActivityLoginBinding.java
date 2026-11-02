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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final LinearLayout f50985rv;

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
        this.f50985rv = rv;
        this.verificationCode = verificationCode;
        this.verificationCodeLl = verificationCodeLl;
    }

    @NonNull
    public static ActivityLoginBinding bind(@NonNull View rootView) {
        int i = R.id.btGetVerificationCode;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btGetVerificationCode);
        if (button != null) {
            i = R.id.btLoginType;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btLoginType);
            if (button2 != null) {
                i = R.id.btn_login;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_login);
                if (button3 != null) {
                    i = R.id.email;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.email);
                    if (textInputEditText != null) {
                        i = R.id.loginRemind;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.loginRemind);
                        if (pFMedium != null) {
                            i = R.id.password;
                            TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.password);
                            if (textInputEditText2 != null) {
                                i = R.id.passwordTil;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.passwordTil);
                                if (relativeLayout != null) {
                                    LinearLayout linearLayout = (LinearLayout) rootView;
                                    i = R.id.verificationCode;
                                    TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verificationCode);
                                    if (textInputEditText3 != null) {
                                        i = R.id.verificationCodeLl;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.verificationCodeLl);
                                        if (linearLayout2 != null) {
                                            return new ActivityLoginBinding(linearLayout, button, button2, button3, textInputEditText, pFMedium, textInputEditText2, relativeLayout, linearLayout, textInputEditText3, linearLayout2);
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
    public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_login, parent, false);
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
