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
        int r0 = R.id.btn_multi_device;
        FrameLayout r4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.btn_multi_device);
        if (r4 == null) goto L21;
        r0 = R.id.iv_connection;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_connection);
        if (r5 == null) goto L21;
        r0 = R.id.iv_device;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device);
        if (r6 == null) goto L21;
        r0 = R.id.iv_power;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_power);
        if (r7 == null) goto L21;
        r0 = R.id.tv_name;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r8 == null) goto L21;
        r0 = R.id.tv_power;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_power);
        if (r9 == null) goto L21;
        r0 = R.id.view_paired;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.view_paired);
        if (r10 == null) goto L21;
        r0 = R.id.view_unpaired;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.view_unpaired);
        if (r11 == null) goto L21;
        return new DeviceItemInfoBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static DeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.device_item_info, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
