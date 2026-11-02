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
        int r0 = R.id.bt_confirm;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_confirm);
        if (r4 == null) goto L15;
        r0 = R.id.phone;
        TextInputEditText r5 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.phone);
        if (r5 == null) goto L15;
        r0 = R.id.privacyAppCheck;
        AppCompatCheckBox r6 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.privacyAppCheck);
        if (r6 == null) goto L15;
        r0 = R.id.privacyAppTv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.privacyAppTv);
        if (r7 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_code;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
        if (r9 == null) goto L15;
        return new ActivityReceivePhoneBindBinding(r3, r4, r5, r6, r7, r3, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityReceivePhoneBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityReceivePhoneBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_receive_phone_bind, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
