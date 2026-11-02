package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityFirmwareUpgradeBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llDevInfo;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAlreadyOta;

    @NonNull
    public final PFBold tvCurrent;

    @NonNull
    public final PFBold tvFirmwareUpgradeTopTip;

    @NonNull
    public final TextView tvInfo;

    @NonNull
    public final PFBold tvLatest;

    @NonNull
    public final TextView tvSpeed;

    @NonNull
    public final PFBold tvStep;

    @NonNull
    public final PFMedium tvTip;

    @NonNull
    public final PFMedium tvUpdateDesc;

    private ActivityFirmwareUpgradeBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llDevInfo, @NonNull TextView tvAlreadyOta, @NonNull PFBold tvCurrent, @NonNull PFBold tvFirmwareUpgradeTopTip, @NonNull TextView tvInfo, @NonNull PFBold tvLatest, @NonNull TextView tvSpeed, @NonNull PFBold tvStep, @NonNull PFMedium tvTip, @NonNull PFMedium tvUpdateDesc) {
        this.rootView = rootView;
        this.llDevInfo = llDevInfo;
        this.tvAlreadyOta = tvAlreadyOta;
        this.tvCurrent = tvCurrent;
        this.tvFirmwareUpgradeTopTip = tvFirmwareUpgradeTopTip;
        this.tvInfo = tvInfo;
        this.tvLatest = tvLatest;
        this.tvSpeed = tvSpeed;
        this.tvStep = tvStep;
        this.tvTip = tvTip;
        this.tvUpdateDesc = tvUpdateDesc;
    }

    @NonNull
    public static ActivityFirmwareUpgradeBinding bind(@NonNull View rootView) {
        int r0 = R.id.ll_dev_info;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_dev_info);
        if (r4 == null) goto L25;
        r0 = R.id.tv_already_ota;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_ota);
        if (r5 == null) goto L25;
        r0 = R.id.tv_current;
        PFBold r6 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_current);
        if (r6 == null) goto L25;
        r0 = R.id.tv_firmware_upgrade_top_tip;
        PFBold r7 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_firmware_upgrade_top_tip);
        if (r7 == null) goto L25;
        r0 = R.id.tv_info;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info);
        if (r8 == null) goto L25;
        r0 = R.id.tv_latest;
        PFBold r9 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_latest);
        if (r9 == null) goto L25;
        r0 = R.id.tv_speed;
        TextView r10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_speed);
        if (r10 == null) goto L25;
        r0 = R.id.tv_step;
        PFBold r11 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_step);
        if (r11 == null) goto L25;
        r0 = R.id.tv_tip;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r12 == null) goto L25;
        r0 = R.id.tv_update_desc;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_update_desc);
        if (r13 == null) goto L25;
        return new ActivityFirmwareUpgradeBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityFirmwareUpgradeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityFirmwareUpgradeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_firmware_upgrade, parent, false);
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
