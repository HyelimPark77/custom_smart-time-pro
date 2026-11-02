package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopPairConfirmBinding implements ViewBinding {

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51183iv;

    @NonNull
    public final PFMedium popPairConfirmTvTip;

    @NonNull
    public final PFMedium popPairConfirmTvTitle;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final PFMedium f51184tv;

    private PopPairConfirmBinding(@NonNull LinearLayout rootView, @NonNull ImageView iv, @NonNull PFMedium popPairConfirmTvTip, @NonNull PFMedium popPairConfirmTvTitle, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.f51183iv = iv;
        this.popPairConfirmTvTip = popPairConfirmTvTip;
        this.popPairConfirmTvTitle = popPairConfirmTvTitle;
        this.f51184tv = tv;
    }

    @NonNull
    public static PopPairConfirmBinding bind(@NonNull View rootView) {
        int i = R.id.f51417iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageView != null) {
            i = R.id.pop_pair_confirm_tv_tip;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_pair_confirm_tv_tip);
            if (pFMedium != null) {
                i = R.id.pop_pair_confirm_tv_title;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_pair_confirm_tv_title);
                if (pFMedium2 != null) {
                    i = R.id.f51423tv;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
                    if (pFMedium3 != null) {
                        return new PopPairConfirmBinding((LinearLayout) rootView, imageView, pFMedium, pFMedium2, pFMedium3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopPairConfirmBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopPairConfirmBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_pair_confirm, parent, false);
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
