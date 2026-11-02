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
        int i = R.id.bt_tip;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_tip);
        if (button != null) {
            i = R.id.img_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_close);
            if (imageView != null) {
                i = R.id.img_tip;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_tip);
                if (imageView2 != null) {
                    i = R.id.tip_check;
                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.tip_check);
                    if (appCompatCheckBox != null) {
                        i = R.id.tv_tip_1;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip_1);
                        if (pFMedium != null) {
                            i = R.id.tv_tip_2;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip_2);
                            if (pFMedium2 != null) {
                                i = R.id.tv_tip_title;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip_title);
                                if (pFMedium3 != null) {
                                    return new PopTipTranslationBinding((FrameLayout) rootView, button, imageView, imageView2, appCompatCheckBox, pFMedium, pFMedium2, pFMedium3);
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
    public static PopTipTranslationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopTipTranslationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_tip_translation, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
