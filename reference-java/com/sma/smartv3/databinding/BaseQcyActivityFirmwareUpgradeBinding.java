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

/* JADX INFO: loaded from: classes19.dex */
public final class BaseQcyActivityFirmwareUpgradeBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llDevInfo;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAlreadyOta;

    @NonNull
    public final TextView tvCurrent;

    @NonNull
    public final TextView tvFirmwareUpgradeTopTip;

    @NonNull
    public final TextView tvInfo;

    @NonNull
    public final TextView tvLatest;

    @NonNull
    public final TextView tvSpeed;

    @NonNull
    public final TextView tvStep;

    @NonNull
    public final TextView tvTip;

    @NonNull
    public final TextView tvUpdateDesc;

    private BaseQcyActivityFirmwareUpgradeBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llDevInfo, @NonNull TextView tvAlreadyOta, @NonNull TextView tvCurrent, @NonNull TextView tvFirmwareUpgradeTopTip, @NonNull TextView tvInfo, @NonNull TextView tvLatest, @NonNull TextView tvSpeed, @NonNull TextView tvStep, @NonNull TextView tvTip, @NonNull TextView tvUpdateDesc) {
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
    public static BaseQcyActivityFirmwareUpgradeBinding bind(@NonNull View rootView) {
        int i = R.id.ll_dev_info;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_dev_info);
        if (linearLayout != null) {
            i = R.id.tv_already_ota;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_ota);
            if (textView != null) {
                i = R.id.tv_current;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_current);
                if (textView2 != null) {
                    i = R.id.tv_firmware_upgrade_top_tip;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_firmware_upgrade_top_tip);
                    if (textView3 != null) {
                        i = R.id.tv_info;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info);
                        if (textView4 != null) {
                            i = R.id.tv_latest;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_latest);
                            if (textView5 != null) {
                                i = R.id.tv_speed;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_speed);
                                if (textView6 != null) {
                                    i = R.id.tv_step;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_step);
                                    if (textView7 != null) {
                                        i = R.id.tv_tip;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                                        if (textView8 != null) {
                                            i = R.id.tv_update_Desc;
                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_update_Desc);
                                            if (textView9 != null) {
                                                return new BaseQcyActivityFirmwareUpgradeBinding((LinearLayout) rootView, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
    public static BaseQcyActivityFirmwareUpgradeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static BaseQcyActivityFirmwareUpgradeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.base_qcy_activity_firmware_upgrade, parent, false);
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
