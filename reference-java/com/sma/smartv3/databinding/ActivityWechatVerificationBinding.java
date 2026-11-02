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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.SquareVerificationCodeView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWechatVerificationBinding implements ViewBinding {

    @NonNull
    public final Button btnBottom;

    @NonNull
    public final SquareVerificationCodeView codeView;

    @NonNull
    private final LinearLayout rootView;

    private ActivityWechatVerificationBinding(@NonNull LinearLayout rootView, @NonNull Button btnBottom, @NonNull SquareVerificationCodeView codeView) {
        this.rootView = rootView;
        this.btnBottom = btnBottom;
        this.codeView = codeView;
    }

    @NonNull
    public static ActivityWechatVerificationBinding bind(@NonNull View rootView) {
        int i = R.id.btn_bottom;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_bottom);
        if (button != null) {
            i = R.id.codeView;
            SquareVerificationCodeView squareVerificationCodeView = (SquareVerificationCodeView) ViewBindings.findChildViewById(rootView, R.id.codeView);
            if (squareVerificationCodeView != null) {
                return new ActivityWechatVerificationBinding((LinearLayout) rootView, button, squareVerificationCodeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWechatVerificationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityWechatVerificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_wechat_verification, parent, false);
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
