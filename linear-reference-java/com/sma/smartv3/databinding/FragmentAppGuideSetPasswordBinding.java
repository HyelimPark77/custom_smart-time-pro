package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAppGuideSetPasswordBinding implements ViewBinding {

    @NonNull
    public final Button btnConfirm;

    @NonNull
    public final LinearLayout llSetNewPassword;

    @NonNull
    public final TextInputEditText newPassword;

    @NonNull
    public final TextInputEditText newPasswordAgain;

    @NonNull
    public final PFMedium resetPasswordTip;

    @NonNull
    public final ScrollView rootView;

    @NonNull
    private final ScrollView rootView_;

    @NonNull
    public final View viewKeyboardHeight;

    private FragmentAppGuideSetPasswordBinding(@NonNull ScrollView rootView_, @NonNull Button btnConfirm, @NonNull LinearLayout llSetNewPassword, @NonNull TextInputEditText newPassword, @NonNull TextInputEditText newPasswordAgain, @NonNull PFMedium resetPasswordTip, @NonNull ScrollView rootView, @NonNull View viewKeyboardHeight) {
        this.rootView_ = rootView_;
        this.btnConfirm = btnConfirm;
        this.llSetNewPassword = llSetNewPassword;
        this.newPassword = newPassword;
        this.newPasswordAgain = newPasswordAgain;
        this.resetPasswordTip = resetPasswordTip;
        this.rootView = rootView;
        this.viewKeyboardHeight = viewKeyboardHeight;
    }

    @NonNull
    public static FragmentAppGuideSetPasswordBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_confirm;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_confirm);
        if (r4 == null) goto L17;
        r0 = R.id.llSetNewPassword;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSetNewPassword);
        if (r5 == null) goto L17;
        r0 = R.id.newPassword;
        TextInputEditText r6 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.newPassword);
        if (r6 == null) goto L17;
        r0 = R.id.newPasswordAgain;
        TextInputEditText r7 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.newPasswordAgain);
        if (r7 == null) goto L17;
        r0 = R.id.resetPasswordTip;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.resetPasswordTip);
        if (r8 == null) goto L17;
        ScrollView r3 = (ScrollView) rootView;
        r0 = R.id.view_keyboard_height;
        View r10 = ViewBindings.findChildViewById(rootView, R.id.view_keyboard_height);
        if (r10 == null) goto L17;
        return new FragmentAppGuideSetPasswordBinding(r3, r4, r5, r6, r7, r8, r3, r10);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentAppGuideSetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentAppGuideSetPasswordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_app_guide_set_password, parent, false);
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
