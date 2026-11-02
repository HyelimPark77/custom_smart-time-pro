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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class V2DeviceItemInfoBinding implements ViewBinding {

    @NonNull
    public final FrameLayout btnMultiDevice;

    @NonNull
    public final ImageView ivConnection;

    @NonNull
    public final ImageView ivDevice;

    @NonNull
    public final ImageView ivDeviceAdd;

    @NonNull
    public final ImageView ivDeviceUnpair;

    @NonNull
    public final ImageView ivPairType;

    @NonNull
    public final ImageView ivPower;

    @NonNull
    public final AppCompatImageView ivVoltage;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvMac;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final DINCondBold tvPower;

    @NonNull
    public final DINCondBold tvPower2;

    @NonNull
    public final DINCondBold tvState;

    @NonNull
    public final PFMedium tvUsageGuidLines;

    @NonNull
    public final PFMedium tvVersion;

    @NonNull
    public final RelativeLayout viewPaired;

    @NonNull
    public final LinearLayout viewUnpaired;

    private V2DeviceItemInfoBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout btnMultiDevice, @NonNull ImageView ivConnection, @NonNull ImageView ivDevice, @NonNull ImageView ivDeviceAdd, @NonNull ImageView ivDeviceUnpair, @NonNull ImageView ivPairType, @NonNull ImageView ivPower, @NonNull AppCompatImageView ivVoltage, @NonNull PFMedium tvMac, @NonNull PFMedium tvName, @NonNull DINCondBold tvPower, @NonNull DINCondBold tvPower2, @NonNull DINCondBold tvState, @NonNull PFMedium tvUsageGuidLines, @NonNull PFMedium tvVersion, @NonNull RelativeLayout viewPaired, @NonNull LinearLayout viewUnpaired) {
        this.rootView = rootView;
        this.btnMultiDevice = btnMultiDevice;
        this.ivConnection = ivConnection;
        this.ivDevice = ivDevice;
        this.ivDeviceAdd = ivDeviceAdd;
        this.ivDeviceUnpair = ivDeviceUnpair;
        this.ivPairType = ivPairType;
        this.ivPower = ivPower;
        this.ivVoltage = ivVoltage;
        this.tvMac = tvMac;
        this.tvName = tvName;
        this.tvPower = tvPower;
        this.tvPower2 = tvPower2;
        this.tvState = tvState;
        this.tvUsageGuidLines = tvUsageGuidLines;
        this.tvVersion = tvVersion;
        this.viewPaired = viewPaired;
        this.viewUnpaired = viewUnpaired;
    }

    @NonNull
    public static V2DeviceItemInfoBinding bind(@NonNull View rootView) {
        int i = R.id.btn_multi_device;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.btn_multi_device);
        if (frameLayout != null) {
            i = R.id.iv_connection;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_connection);
            if (imageView != null) {
                i = R.id.iv_device;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device);
                if (imageView2 != null) {
                    i = R.id.iv_device_add;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device_add);
                    if (imageView3 != null) {
                        i = R.id.iv_device_unpair;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device_unpair);
                        if (imageView4 != null) {
                            i = R.id.ivPairType;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivPairType);
                            if (imageView5 != null) {
                                i = R.id.iv_power;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_power);
                                if (imageView6 != null) {
                                    i = R.id.iv_voltage;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_voltage);
                                    if (appCompatImageView != null) {
                                        i = R.id.tv_mac;
                                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_mac);
                                        if (pFMedium != null) {
                                            i = R.id.tv_name;
                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                            if (pFMedium2 != null) {
                                                i = R.id.tv_power;
                                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_power);
                                                if (dINCondBold != null) {
                                                    i = R.id.tv_power2;
                                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_power2);
                                                    if (dINCondBold2 != null) {
                                                        i = R.id.tv_state;
                                                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_state);
                                                        if (dINCondBold3 != null) {
                                                            i = R.id.tv_usage_guid_lines;
                                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_usage_guid_lines);
                                                            if (pFMedium3 != null) {
                                                                i = R.id.tv_version;
                                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_version);
                                                                if (pFMedium4 != null) {
                                                                    i = R.id.view_paired;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.view_paired);
                                                                    if (relativeLayout != null) {
                                                                        i = R.id.view_unpaired;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.view_unpaired);
                                                                        if (linearLayout != null) {
                                                                            return new V2DeviceItemInfoBinding((LinearLayout) rootView, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, appCompatImageView, pFMedium, pFMedium2, dINCondBold, dINCondBold2, dINCondBold3, pFMedium3, pFMedium4, relativeLayout, linearLayout);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static V2DeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2DeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_device_item_info, parent, false);
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
