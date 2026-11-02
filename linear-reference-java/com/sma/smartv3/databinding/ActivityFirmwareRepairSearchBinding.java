package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityFirmwareRepairSearchBinding implements ViewBinding {

    @NonNull
    public final Button btnSearchAgain;

    @NonNull
    public final ImageView ivRssi;

    @NonNull
    public final ListView listView;

    @NonNull
    public final NestedScrollView llSearchAgain;

    @NonNull
    public final LinearLayout llTryOrigin;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvAddress;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvSearchTip;

    private ActivityFirmwareRepairSearchBinding(@NonNull LinearLayout rootView_, @NonNull Button btnSearchAgain, @NonNull ImageView ivRssi, @NonNull ListView listView, @NonNull NestedScrollView llSearchAgain, @NonNull LinearLayout llTryOrigin, @NonNull LinearLayout rootView, @NonNull PFMedium tvAddress, @NonNull PFMedium tvName, @NonNull PFMedium tvSearchTip) {
        this.rootView_ = rootView_;
        this.btnSearchAgain = btnSearchAgain;
        this.ivRssi = ivRssi;
        this.listView = listView;
        this.llSearchAgain = llSearchAgain;
        this.llTryOrigin = llTryOrigin;
        this.rootView = rootView;
        this.tvAddress = tvAddress;
        this.tvName = tvName;
        this.tvSearchTip = tvSearchTip;
    }

    @NonNull
    public static ActivityFirmwareRepairSearchBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_search_again;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_search_again);
        if (r4 == null) goto L21;
        r0 = R.id.iv_rssi;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_rssi);
        if (r5 == null) goto L21;
        r0 = R.id.list_view;
        ListView r6 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r6 == null) goto L21;
        r0 = R.id.ll_search_again;
        NestedScrollView r7 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.ll_search_again);
        if (r7 == null) goto L21;
        r0 = R.id.ll_try_origin;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_try_origin);
        if (r8 == null) goto L21;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_address;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_address);
        if (r10 == null) goto L21;
        r0 = R.id.tv_name;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r11 == null) goto L21;
        r0 = R.id.tv_search_tip;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_search_tip);
        if (r12 == null) goto L21;
        return new ActivityFirmwareRepairSearchBinding(r3, r4, r5, r6, r7, r8, r3, r10, r11, r12);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityFirmwareRepairSearchBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityFirmwareRepairSearchBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_firmware_repair_search, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
