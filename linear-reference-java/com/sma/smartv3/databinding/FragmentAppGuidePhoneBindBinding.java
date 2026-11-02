package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAppGuidePhoneBindBinding implements ViewBinding {

    @NonNull
    public final Button btnDone;

    @NonNull
    public final ImageView iv;

    @NonNull
    public final LinearLayout llContent;

    @NonNull
    public final TextInputEditText phone;

    @NonNull
    public final ScrollView rootView;

    @NonNull
    private final ScrollView rootView_;

    @NonNull
    public final TextView tvGetVerificationCode;

    @NonNull
    public final TextInputEditText verificationCode;

    @NonNull
    public final View viewKeyboardHeight;

    private FragmentAppGuidePhoneBindBinding(@NonNull ScrollView rootView_, @NonNull Button btnDone, @NonNull ImageView iv, @NonNull LinearLayout llContent, @NonNull TextInputEditText phone, @NonNull ScrollView rootView, @NonNull TextView tvGetVerificationCode, @NonNull TextInputEditText verificationCode, @NonNull View viewKeyboardHeight) {
        this.rootView_ = rootView_;
        this.btnDone = btnDone;
        this.iv = iv;
        this.llContent = llContent;
        this.phone = phone;
        this.rootView = rootView;
        this.tvGetVerificationCode = tvGetVerificationCode;
        this.verificationCode = verificationCode;
        this.viewKeyboardHeight = viewKeyboardHeight;
    }

    @NonNull
    public static FragmentAppGuidePhoneBindBinding bind(@NonNull View rootView) {
        int r0 = R.id.btnDone;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btnDone);
        if (r4 == null) goto L19;
        r0 = R.id.iv;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r5 == null) goto L19;
        r0 = R.id.llContent;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llContent);
        if (r6 == null) goto L19;
        r0 = R.id.phone;
        TextInputEditText r7 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.phone);
        if (r7 == null) goto L19;
        ScrollView r3 = (ScrollView) rootView;
        r0 = R.id.tvGetVerificationCode;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvGetVerificationCode);
        if (r9 == null) goto L19;
        r0 = R.id.verification_code;
        TextInputEditText r10 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verification_code);
        if (r10 == null) goto L19;
        r0 = R.id.view_keyboard_height;
        View r11 = ViewBindings.findChildViewById(rootView, R.id.view_keyboard_height);
        if (r11 == null) goto L19;
        return new FragmentAppGuidePhoneBindBinding(r3, r4, r5, r6, r7, r3, r9, r10, r11);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentAppGuidePhoneBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentAppGuidePhoneBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_app_guide_phone_bind, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.rootView_;
    }
}
