package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButtonV2;
import com.sma.smartv3.view.SquareImageView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemDialF3V5Binding implements ViewBinding {

    @NonNull
    public final FrameLayout itemDialNewLl;

    @NonNull
    public final SquareImageView iv;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final ProgressButtonV2 pb;

    @NonNull
    public final PFMedium pbAmount;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialF3V5Binding(@NonNull LinearLayout rootView, @NonNull FrameLayout itemDialNewLl, @NonNull SquareImageView iv, @NonNull ImageView ivIcon, @NonNull ProgressButtonV2 pb, @NonNull PFMedium pbAmount) {
        this.rootView = rootView;
        this.itemDialNewLl = itemDialNewLl;
        this.iv = iv;
        this.ivIcon = ivIcon;
        this.pb = pb;
        this.pbAmount = pbAmount;
    }

    @NonNull
    public static ItemDialF3V5Binding bind(@NonNull View rootView) {
        int r0 = R.id.item_dial_new_ll;
        FrameLayout r4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_dial_new_ll);
        if (r4 == null) goto L15;
        r0 = R.id.iv;
        SquareImageView r5 = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r5 == null) goto L15;
        r0 = R.id.iv_icon;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
        if (r6 == null) goto L15;
        r0 = R.id.pb;
        ProgressButtonV2 r7 = (ProgressButtonV2) ViewBindings.findChildViewById(rootView, R.id.pb);
        if (r7 == null) goto L15;
        r0 = R.id.pb_amount;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pb_amount);
        if (r8 == null) goto L15;
        return new ItemDialF3V5Binding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemDialF3V5Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemDialF3V5Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_dial_f3_v5, parent, false);
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
