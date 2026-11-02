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
        int i = R.id.ll_dev_info;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_dev_info);
        if (linearLayout != null) {
            i = R.id.tv_already_ota;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_ota);
            if (textView != null) {
                i = R.id.tv_current;
                PFBold pFBold = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_current);
                if (pFBold != null) {
                    i = R.id.tv_firmware_upgrade_top_tip;
                    PFBold pFBold2 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_firmware_upgrade_top_tip);
                    if (pFBold2 != null) {
                        i = R.id.tv_info;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info);
                        if (textView2 != null) {
                            i = R.id.tv_latest;
                            PFBold pFBold3 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_latest);
                            if (pFBold3 != null) {
                                i = R.id.tv_speed;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_speed);
                                if (textView3 != null) {
                                    i = R.id.tv_step;
                                    PFBold pFBold4 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_step);
                                    if (pFBold4 != null) {
                                        i = R.id.tv_tip;
                                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                                        if (pFMedium != null) {
                                            i = R.id.tv_update_desc;
                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_update_desc);
                                            if (pFMedium2 != null) {
                                                return new ActivityFirmwareUpgradeBinding((LinearLayout) rootView, linearLayout, textView, pFBold, pFBold2, textView2, pFBold3, textView3, pFBold4, pFMedium, pFMedium2);
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
    public static ActivityFirmwareUpgradeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityFirmwareUpgradeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_firmware_upgrade, parent, false);
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
