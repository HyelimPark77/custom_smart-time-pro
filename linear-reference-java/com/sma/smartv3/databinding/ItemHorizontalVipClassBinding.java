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
        int r0 = R.id.item_dial_class_iv;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_dial_class_iv);
        if (r1 == null) goto L10;
        LinearLayout r2 = (LinearLayout) rootView;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_class_tv);
        if (r3 != null) goto L7;
        r0 = R.id.item_dial_class_tv;
        goto L10
    L7:
        return new ItemHorizontalVipClassBinding(r2, r1, r2, r3);
    L10:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemHorizontalVipClassBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemHorizontalVipClassBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_horizontal_vip_class, parent, false);
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
