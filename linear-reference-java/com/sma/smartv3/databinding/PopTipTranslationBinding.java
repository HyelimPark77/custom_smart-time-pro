package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopTipTranslationBinding implements ViewBinding {

    @NonNull
    public final Button btTip;

    @NonNull
    public final ImageView imgClose;

    @NonNull
    public final ImageView imgTip;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final AppCompatCheckBox tipCheck;

    @NonNull
    public final PFMedium tvTip1;

    @NonNull
    public final PFMedium tvTip2;

    @NonNull
    public final PFMedium tvTipTitle;

    private PopTipTranslationBinding(@NonNull FrameLayout rootView, @NonNull Button btTip, @NonNull ImageView imgClose, @NonNull ImageView imgTip, @NonNull AppCompatCheckBox tipCheck, @NonNull PFMedium tvTip1, @NonNull PFMedium tvTip2, @NonNull PFMedium tvTipTitle) {
        this.rootView = rootView;
        this.btTip = btTip;
        this.imgClose = imgClose;
        this.imgTip = imgTip;
        this.tipCheck = tipCheck;
        this.tvTip1 = tvTip1;
        this.tvTip2 = tvTip2;
        this.tvTipTitle = tvTipTitle;
    }

    @NonNull
    public static PopTipTranslationBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_tip;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_tip);
        if (r4 == null) goto L19;
        r0 = R.id.img_close;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_close);
        if (r5 == null) goto L19;
        r0 = R.id.img_tip;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_tip);
        if (r6 == null) goto L19;
        r0 = R.id.tip_check;
        AppCompatCheckBox r7 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.tip_check);
        if (r7 == null) goto L19;
        r0 = R.id.tv_tip_1;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip_1);
        if (r8 == null) goto L19;
        r0 = R.id.tv_tip_2;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip_2);
        if (r9 == null) goto L19;
        r0 = R.id.tv_tip_title;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip_title);
        if (r10 == null) goto L19;
        return new PopTipTranslationBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopTipTranslationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopTipTranslationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_tip_translation, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
