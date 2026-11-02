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
        int r1 = R.id.btn_multi_device;
        FrameLayout r5 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.btn_multi_device);
        if (r5 == null) goto L39;
        r1 = R.id.iv_connection;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_connection);
        if (r6 == null) goto L39;
        r1 = R.id.iv_device;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device);
        if (r7 == null) goto L39;
        r1 = R.id.iv_device_add;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device_add);
        if (r8 == null) goto L39;
        r1 = R.id.iv_device_unpair;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device_unpair);
        if (r9 == null) goto L39;
        r1 = R.id.ivPairType;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivPairType);
        if (r10 == null) goto L39;
        r1 = R.id.iv_power;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_power);
        if (r11 == null) goto L39;
        r1 = R.id.iv_voltage;
        AppCompatImageView r12 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_voltage);
        if (r12 == null) goto L39;
        r1 = R.id.tv_mac;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_mac);
        if (r13 == null) goto L39;
        r1 = R.id.tv_name;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r14 == null) goto L39;
        r1 = R.id.tv_power;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_power);
        if (r15 == null) goto L39;
        r1 = R.id.tv_power2;
        DINCondBold r16 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_power2);
        if (r16 == null) goto L39;
        r1 = R.id.tv_state;
        DINCondBold r17 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_state);
        if (r17 == null) goto L39;
        r1 = R.id.tv_usage_guid_lines;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_usage_guid_lines);
        if (r18 == null) goto L39;
        r1 = R.id.tv_version;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_version);
        if (r19 == null) goto L39;
        r1 = R.id.view_paired;
        RelativeLayout r20 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.view_paired);
        if (r20 == null) goto L39;
        r1 = R.id.view_unpaired;
        LinearLayout r21 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.view_unpaired);
        if (r21 == null) goto L39;
        return new V2DeviceItemInfoBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    L39:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static V2DeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2DeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_device_item_info, parent, false);
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
