package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceItemInfoBinding implements ViewBinding {

    @NonNull
    public final FrameLayout btnMultiDevice;

    @NonNull
    public final ImageView ivConnection;

    @NonNull
    public final ImageView ivDevice;

    @NonNull
    public final ImageView ivPower;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final DINCondBold tvPower;

    @NonNull
    public final RelativeLayout viewPaired;

    @NonNull
    public final LinearLayout viewUnpaired;

    private DeviceItemInfoBinding(@NonNull RelativeLayout rootView, @NonNull FrameLayout btnMultiDevice, @NonNull ImageView ivConnection, @NonNull ImageView ivDevice, @NonNull ImageView ivPower, @NonNull PFMedium tvName, @NonNull DINCondBold tvPower, @NonNull RelativeLayout viewPaired, @NonNull LinearLayout viewUnpaired) {
        this.rootView = rootView;
        this.btnMultiDevice = btnMultiDevice;
        this.ivConnection = ivConnection;
        this.ivDevice = ivDevice;
        this.ivPower = ivPower;
        this.tvName = tvName;
        this.tvPower = tvPower;
        this.viewPaired = viewPaired;
        this.viewUnpaired = viewUnpaired;
    }

    @NonNull
    public static DeviceItemInfoBinding bind(@NonNull View rootView) {
        int i = R.id.btn_multi_device;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.btn_multi_device);
        if (frameLayout != null) {
            i = R.id.iv_connection;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_connection);
            if (imageView != null) {
                i = R.id.iv_device;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device);
                if (imageView2 != null) {
                    i = R.id.iv_power;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_power);
                    if (imageView3 != null) {
                        i = R.id.tv_name;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                        if (pFMedium != null) {
                            i = R.id.tv_power;
                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_power);
                            if (dINCondBold != null) {
                                i = R.id.view_paired;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.view_paired);
                                if (relativeLayout != null) {
                                    i = R.id.view_unpaired;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.view_unpaired);
                                    if (linearLayout != null) {
                                        return new DeviceItemInfoBinding((RelativeLayout) rootView, frameLayout, imageView, imageView2, imageView3, pFMedium, dINCondBold, relativeLayout, linearLayout);
                                    }
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
    public static DeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_info, parent, false);
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
