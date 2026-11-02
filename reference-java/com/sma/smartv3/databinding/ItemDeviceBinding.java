package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemDeviceBinding implements ViewBinding {

    @NonNull
    public final View bottomLine;

    @NonNull
    public final ImageView ivRssi;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvAddress;

    @NonNull
    public final PFMedium tvName;

    private ItemDeviceBinding(@NonNull RelativeLayout rootView, @NonNull View bottomLine, @NonNull ImageView ivRssi, @NonNull PFMedium tvAddress, @NonNull PFMedium tvName) {
        this.rootView = rootView;
        this.bottomLine = bottomLine;
        this.ivRssi = ivRssi;
        this.tvAddress = tvAddress;
        this.tvName = tvName;
    }

    @NonNull
    public static ItemDeviceBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (viewFindChildViewById != null) {
            i = R.id.iv_rssi;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_rssi);
            if (imageView != null) {
                i = R.id.tv_address;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_address);
                if (pFMedium != null) {
                    i = R.id.tv_name;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                    if (pFMedium2 != null) {
                        return new ItemDeviceBinding((RelativeLayout) rootView, viewFindChildViewById, imageView, pFMedium, pFMedium2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDeviceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemDeviceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_device, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
