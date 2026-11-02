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
        int r0 = R.id.dfu_progress;
        DfuProgress r4 = (DfuProgress) ViewBindings.findChildViewById(rootView, R.id.dfu_progress);
        if (r4 == null) goto L13;
        r0 = R.id.tv_name;
        PFBold r5 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r5 == null) goto L13;
        r0 = R.id.tv_size;
        PFBold r6 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.tv_size);
        if (r6 == null) goto L13;
        r0 = R.id.tv_tip;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r7 == null) goto L13;
        return new ActivityFirmwareRepairBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityFirmwareRepairBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityFirmwareRepairBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_firmware_repair, parent, false);
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
