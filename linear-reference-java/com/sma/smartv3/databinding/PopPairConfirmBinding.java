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

    @NonNull
    public final ImageView iv;

    @NonNull
    public final PFMedium popPairConfirmTvTip;

    @NonNull
    public final PFMedium popPairConfirmTvTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tv;

    private PopPairConfirmBinding(@NonNull LinearLayout rootView, @NonNull ImageView iv, @NonNull PFMedium popPairConfirmTvTip, @NonNull PFMedium popPairConfirmTvTitle, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.iv = iv;
        this.popPairConfirmTvTip = popPairConfirmTvTip;
        this.popPairConfirmTvTitle = popPairConfirmTvTitle;
        this.tv = tv;
    }

    @NonNull
    public static PopPairConfirmBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r4 == null) goto L13;
        r0 = R.id.pop_pair_confirm_tv_tip;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_pair_confirm_tv_tip);
        if (r5 == null) goto L13;
        r0 = R.id.pop_pair_confirm_tv_title;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_pair_confirm_tv_title);
        if (r6 == null) goto L13;
        r0 = R.id.tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r7 == null) goto L13;
        return new PopPairConfirmBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopPairConfirmBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopPairConfirmBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_pair_confirm, parent, false);
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
