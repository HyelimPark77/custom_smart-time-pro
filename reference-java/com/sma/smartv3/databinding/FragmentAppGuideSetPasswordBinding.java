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
        int i = R.id.btn_confirm;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_confirm);
        if (button != null) {
            i = R.id.llSetNewPassword;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSetNewPassword);
            if (linearLayout != null) {
                i = R.id.newPassword;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.newPassword);
                if (textInputEditText != null) {
                    i = R.id.newPasswordAgain;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.newPasswordAgain);
                    if (textInputEditText2 != null) {
                        i = R.id.resetPasswordTip;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.resetPasswordTip);
                        if (pFMedium != null) {
                            ScrollView scrollView = (ScrollView) rootView;
                            i = R.id.view_keyboard_height;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_keyboard_height);
                            if (viewFindChildViewById != null) {
                                return new FragmentAppGuideSetPasswordBinding(scrollView, button, linearLayout, textInputEditText, textInputEditText2, pFMedium, scrollView, viewFindChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentAppGuideSetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentAppGuideSetPasswordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_app_guide_set_password, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.rootView_;
    }
}
