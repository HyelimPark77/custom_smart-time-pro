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

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51114iv;

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
        this.f51114iv = iv;
        this.llContent = llContent;
        this.phone = phone;
        this.rootView = rootView;
        this.tvGetVerificationCode = tvGetVerificationCode;
        this.verificationCode = verificationCode;
        this.viewKeyboardHeight = viewKeyboardHeight;
    }

    @NonNull
    public static FragmentAppGuidePhoneBindBinding bind(@NonNull View rootView) {
        int i = R.id.btnDone;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btnDone);
        if (button != null) {
            i = R.id.f51417iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
            if (imageView != null) {
                i = R.id.llContent;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llContent);
                if (linearLayout != null) {
                    i = R.id.phone;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.phone);
                    if (textInputEditText != null) {
                        ScrollView scrollView = (ScrollView) rootView;
                        i = R.id.tvGetVerificationCode;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvGetVerificationCode);
                        if (textView != null) {
                            i = R.id.verification_code;
                            TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.verification_code);
                            if (textInputEditText2 != null) {
                                i = R.id.view_keyboard_height;
                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_keyboard_height);
                                if (viewFindChildViewById != null) {
                                    return new FragmentAppGuidePhoneBindBinding(scrollView, button, imageView, linearLayout, textInputEditText, scrollView, textView, textInputEditText2, viewFindChildViewById);
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
    public static FragmentAppGuidePhoneBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentAppGuidePhoneBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_app_guide_phone_bind, parent, false);
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
