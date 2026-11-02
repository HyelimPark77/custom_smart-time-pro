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
        int r0 = R.id.btn_bottom;
        Button r1 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_bottom);
        if (r1 == null) goto L9;
        r0 = R.id.codeView;
        SquareVerificationCodeView r2 = (SquareVerificationCodeView) ViewBindings.findChildViewById(rootView, R.id.codeView);
        if (r2 == null) goto L9;
        return new ActivityWechatVerificationBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityWechatVerificationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityWechatVerificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_wechat_verification, parent, false);
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
