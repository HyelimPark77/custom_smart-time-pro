package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiDeviceItemInfoBinding implements ViewBinding {

    @NonNull
    public final FrameLayout btnDelete;

    @NonNull
    public final ImageView ivConnection;

    @NonNull
    public final ImageView ivDevice;

    @NonNull
    public final ImageView ivPower;

    @NonNull
    public final RelativeLayout multiDeviceItemInfoLayout;

    @NonNull
    public final ProgressBar pbConnecting;

    @NonNull
    public final LinearLayout powerPanel;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvMac;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvReconnect;

    @NonNull
    public final DINCondBold tvState;

    private MultiDeviceItemInfoBinding(@NonNull RelativeLayout rootView, @NonNull FrameLayout btnDelete, @NonNull ImageView ivConnection, @NonNull ImageView ivDevice, @NonNull ImageView ivPower, @NonNull RelativeLayout multiDeviceItemInfoLayout, @NonNull ProgressBar pbConnecting, @NonNull LinearLayout powerPanel, @NonNull PFMedium tvMac, @NonNull PFMedium tvName, @NonNull PFMedium tvReconnect, @NonNull DINCondBold tvState) {
        this.rootView = rootView;
        this.btnDelete = btnDelete;
        this.ivConnection = ivConnection;
        this.ivDevice = ivDevice;
        this.ivPower = ivPower;
        this.multiDeviceItemInfoLayout = multiDeviceItemInfoLayout;
        this.pbConnecting = pbConnecting;
        this.powerPanel = powerPanel;
        this.tvMac = tvMac;
        this.tvName = tvName;
        this.tvReconnect = tvReconnect;
        this.tvState = tvState;
    }

    @NonNull
    public static MultiDeviceItemInfoBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_delete;
        FrameLayout r4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.btn_delete);
        if (r4 == null) goto L25;
        r0 = R.id.iv_connection;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_connection);
        if (r5 == null) goto L25;
        r0 = R.id.iv_device;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device);
        if (r6 == null) goto L25;
        r0 = R.id.iv_power;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_power);
        if (r7 == null) goto L25;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.pb_connecting;
        ProgressBar r9 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_connecting);
        if (r9 == null) goto L25;
        r0 = R.id.power_panel;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.power_panel);
        if (r10 == null) goto L25;
        r0 = R.id.tv_mac;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_mac);
        if (r11 == null) goto L25;
        r0 = R.id.tv_name;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r12 == null) goto L25;
        r0 = R.id.tv_reconnect;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_reconnect);
        if (r13 == null) goto L25;
        r0 = R.id.tv_state;
        DINCondBold r14 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_state);
        if (r14 == null) goto L25;
        return new MultiDeviceItemInfoBinding(r3, r4, r5, r6, r7, r3, r9, r10, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static MultiDeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static MultiDeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.multi_device_item_info, parent, false);
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
