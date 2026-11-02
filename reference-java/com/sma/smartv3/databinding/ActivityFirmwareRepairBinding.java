package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.DfuProgress;
import com.sma.smartv3.view.text.PFBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityFirmwareRepairBinding implements ViewBinding {

    @NonNull
    public final DfuProgress dfuProgress;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFBold tvName;

    @NonNull
    public final PFBold tvSize;

    @NonNull
    public final PFMedium tvTip;

    private ActivityFirmwareRepairBinding(@NonNull LinearLayout rootView, @NonNull DfuProgress dfuProgress, @NonNull PFBold tvName, @NonNull PFBold tvSize, @NonNull PFMedium tvTip) {
        this.rootView = rootView;
        this.dfuProgress = dfuProgress;
        this.tvName = tvName;
        this.tvSize = tvSize;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityFirmwareRepairBinding bind(@NonNull View rootView) {
        int i = R.id.dfu_progress;
        DfuProgress dfuProgress = (DfuProgress) ViewBindings.findChildViewById(rootView, R.id.dfu_progress);
        if (dfuProgress != null) {
            i = R.id.tv_name;
            PFBold pFBold = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_name);
            if (pFBold != null) {
                i = R.id.tv_size;
                PFBold pFBold2 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_size);
                if (pFBold2 != null) {
                    i = R.id.tv_tip;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                    if (pFMedium != null) {
                        return new ActivityFirmwareRepairBinding((LinearLayout) rootView, dfuProgress, pFBold, pFBold2, pFMedium);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityFirmwareRepairBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityFirmwareRepairBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_firmware_repair, parent, false);
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
