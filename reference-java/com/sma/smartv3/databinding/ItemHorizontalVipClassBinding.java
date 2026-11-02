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
public final class ItemHorizontalVipClassBinding implements ViewBinding {

    @NonNull
    public final ImageView itemDialClassIv;

    @NonNull
    public final LinearLayout itemDialClassLl;

    @NonNull
    public final PFMedium itemDialClassTv;

    @NonNull
    private final LinearLayout rootView;

    private ItemHorizontalVipClassBinding(@NonNull LinearLayout rootView, @NonNull ImageView itemDialClassIv, @NonNull LinearLayout itemDialClassLl, @NonNull PFMedium itemDialClassTv) {
        this.rootView = rootView;
        this.itemDialClassIv = itemDialClassIv;
        this.itemDialClassLl = itemDialClassLl;
        this.itemDialClassTv = itemDialClassTv;
    }

    @NonNull
    public static ItemHorizontalVipClassBinding bind(@NonNull View rootView) {
        int i = R.id.item_dial_class_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_dial_class_iv);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_class_tv);
            if (pFMedium != null) {
                return new ItemHorizontalVipClassBinding(linearLayout, imageView, linearLayout, pFMedium);
            }
            i = R.id.item_dial_class_tv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemHorizontalVipClassBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemHorizontalVipClassBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_horizontal_vip_class, parent, false);
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
