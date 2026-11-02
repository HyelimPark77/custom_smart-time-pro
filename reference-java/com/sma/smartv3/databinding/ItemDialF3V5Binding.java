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

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final SquareImageView f51144iv;

    @NonNull
    public final ImageView ivIcon;

    /* JADX INFO: renamed from: pb */
    @NonNull
    public final ProgressButtonV2 f51145pb;

    @NonNull
    public final PFMedium pbAmount;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialF3V5Binding(@NonNull LinearLayout rootView, @NonNull FrameLayout itemDialNewLl, @NonNull SquareImageView iv, @NonNull ImageView ivIcon, @NonNull ProgressButtonV2 pb, @NonNull PFMedium pbAmount) {
        this.rootView = rootView;
        this.itemDialNewLl = itemDialNewLl;
        this.f51144iv = iv;
        this.ivIcon = ivIcon;
        this.f51145pb = pb;
        this.pbAmount = pbAmount;
    }

    @NonNull
    public static ItemDialF3V5Binding bind(@NonNull View rootView) {
        int i = R.id.item_dial_new_ll;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_dial_new_ll);
        if (frameLayout != null) {
            i = R.id.f51417iv;
            SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
            if (squareImageView != null) {
                i = R.id.iv_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
                if (imageView != null) {
                    i = R.id.f51421pb;
                    ProgressButtonV2 progressButtonV2 = (ProgressButtonV2) ViewBindings.findChildViewById(rootView, R.id.f51421pb);
                    if (progressButtonV2 != null) {
                        i = R.id.pb_amount;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pb_amount);
                        if (pFMedium != null) {
                            return new ItemDialF3V5Binding((LinearLayout) rootView, frameLayout, squareImageView, imageView, progressButtonV2, pFMedium);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDialF3V5Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemDialF3V5Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_dial_f3_v5, parent, false);
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
