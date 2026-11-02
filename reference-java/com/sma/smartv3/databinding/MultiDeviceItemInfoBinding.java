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
        int i = R.id.btn_delete;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.btn_delete);
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
                        RelativeLayout relativeLayout = (RelativeLayout) rootView;
                        i = R.id.pb_connecting;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_connecting);
                        if (progressBar != null) {
                            i = R.id.power_panel;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.power_panel);
                            if (linearLayout != null) {
                                i = R.id.tv_mac;
                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_mac);
                                if (pFMedium != null) {
                                    i = R.id.tv_name;
                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                    if (pFMedium2 != null) {
                                        i = R.id.tv_reconnect;
                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_reconnect);
                                        if (pFMedium3 != null) {
                                            i = R.id.tv_state;
                                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_state);
                                            if (dINCondBold != null) {
                                                return new MultiDeviceItemInfoBinding(relativeLayout, frameLayout, imageView, imageView2, imageView3, relativeLayout, progressBar, linearLayout, pFMedium, pFMedium2, pFMedium3, dINCondBold);
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
    public static MultiDeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MultiDeviceItemInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.multi_device_item_info, parent, false);
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
