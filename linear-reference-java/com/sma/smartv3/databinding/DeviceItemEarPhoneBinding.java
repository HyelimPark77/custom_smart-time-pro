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
        int r0 = R.id.device_item_ear_phone_type_layout;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_item_ear_phone_type_layout);
        if (r4 == null) goto L23;
        r0 = R.id.ear_phone_l_img;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ear_phone_l_img);
        if (r5 == null) goto L23;
        r0 = R.id.ear_phone_r_img;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ear_phone_r_img);
        if (r6 == null) goto L23;
        r0 = R.id.iv_connection;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_connection);
        if (r7 == null) goto L23;
        r0 = R.id.iv_device;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device);
        if (r8 == null) goto L23;
        r0 = R.id.tv_l;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_l);
        if (r9 == null) goto L23;
        r0 = R.id.tv_name;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r10 == null) goto L23;
        r0 = R.id.tv_r;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_r);
        if (r11 == null) goto L23;
        r0 = R.id.tv_version;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_version);
        if (r12 == null) goto L23;
        RelativeLayout r3 = (RelativeLayout) rootView;
        return new DeviceItemEarPhoneBinding(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r3);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static DeviceItemEarPhoneBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DeviceItemEarPhoneBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.device_item_ear_phone, parent, false);
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
