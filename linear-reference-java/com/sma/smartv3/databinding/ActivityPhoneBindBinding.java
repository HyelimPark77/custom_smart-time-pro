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

    @NonNull
    public final LinearLayout rv;

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
        this.rv = rv;
        this.tvCode = tvCode;
        this.tvCodeError = tvCodeError;
        this.tvDescription = tvDescription;
        this.tvTitle = tvTitle;
        this.verificationCode = verificationCode;
    }

    @NonNull
    public static ActivityPhoneBindBinding bind(@NonNull View rootView) {
        int r0 = R.id.bottom_btn;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.bottom_btn);
        if (r4 == null) goto L25;
        r0 = R.id.btGetVerificationCode;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btGetVerificationCode);
        if (r5 == null) goto L25;
        r0 = R.id.llCheckCode;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCheckCode);
        if (r6 == null) goto L25;
        r0 = R.id.llInputPhone;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llInputPhone);
        if (r7 == null) goto L25;
        r0 = R.id.phone;
        TextInputEditText r8 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.phone);
        if (r8 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_code;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
        if (r10 == null) goto L25;
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
        return new ActivityPhoneBindBinding(r3, r4, r5, r6, r7, r8, r3, r10, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityPhoneBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityPhoneBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_phone_bind, parent, false);
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
