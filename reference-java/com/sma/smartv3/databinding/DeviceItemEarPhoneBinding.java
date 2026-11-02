package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class DeviceItemEarPhoneBinding implements ViewBinding {

    @NonNull
    public final LinearLayout deviceItemEarPhoneTypeLayout;

    @NonNull
    public final ImageView earPhoneLImg;

    @NonNull
    public final ImageView earPhoneRImg;

    @NonNull
    public final ImageView ivConnection;

    @NonNull
    public final ImageView ivDevice;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final DINCondBold tvL;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final DINCondBold tvR;

    @NonNull
    public final PFMedium tvVersion;

    @NonNull
    public final RelativeLayout viewPaired;

    private DeviceItemEarPhoneBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout deviceItemEarPhoneTypeLayout, @NonNull ImageView earPhoneLImg, @NonNull ImageView earPhoneRImg, @NonNull ImageView ivConnection, @NonNull ImageView ivDevice, @NonNull DINCondBold tvL, @NonNull PFMedium tvName, @NonNull DINCondBold tvR, @NonNull PFMedium tvVersion, @NonNull RelativeLayout viewPaired) {
        this.rootView = rootView;
        this.deviceItemEarPhoneTypeLayout = deviceItemEarPhoneTypeLayout;
        this.earPhoneLImg = earPhoneLImg;
        this.earPhoneRImg = earPhoneRImg;
        this.ivConnection = ivConnection;
        this.ivDevice = ivDevice;
        this.tvL = tvL;
        this.tvName = tvName;
        this.tvR = tvR;
        this.tvVersion = tvVersion;
        this.viewPaired = viewPaired;
    }

    @NonNull
    public static DeviceItemEarPhoneBinding bind(@NonNull View rootView) {
        int i = R.id.device_item_ear_phone_type_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_item_ear_phone_type_layout);
        if (linearLayout != null) {
            i = R.id.ear_phone_l_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ear_phone_l_img);
            if (imageView != null) {
                i = R.id.ear_phone_r_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ear_phone_r_img);
                if (imageView2 != null) {
                    i = R.id.iv_connection;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_connection);
                    if (imageView3 != null) {
                        i = R.id.iv_device;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device);
                        if (imageView4 != null) {
                            i = R.id.tv_l;
                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_l);
                            if (dINCondBold != null) {
                                i = R.id.tv_name;
                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                if (pFMedium != null) {
                                    i = R.id.tv_r;
                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_r);
                                    if (dINCondBold2 != null) {
                                        i = R.id.tv_version;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_version);
                                        if (pFMedium2 != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                            return new DeviceItemEarPhoneBinding(relativeLayout, linearLayout, imageView, imageView2, imageView3, imageView4, dINCondBold, pFMedium, dINCondBold2, pFMedium2, relativeLayout);
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
    public static DeviceItemEarPhoneBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DeviceItemEarPhoneBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_ear_phone, parent, false);
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
