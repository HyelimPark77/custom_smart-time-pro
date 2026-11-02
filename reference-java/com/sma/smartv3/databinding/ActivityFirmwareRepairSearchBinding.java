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
        int i = R.id.btn_search_again;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_search_again);
        if (button != null) {
            i = R.id.iv_rssi;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_rssi);
            if (imageView != null) {
                i = R.id.list_view;
                ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                if (listView != null) {
                    i = R.id.ll_search_again;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.ll_search_again);
                    if (nestedScrollView != null) {
                        i = R.id.ll_try_origin;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_try_origin);
                        if (linearLayout != null) {
                            LinearLayout linearLayout2 = (LinearLayout) rootView;
                            i = R.id.tv_address;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_address);
                            if (pFMedium != null) {
                                i = R.id.tv_name;
                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                if (pFMedium2 != null) {
                                    i = R.id.tv_search_tip;
                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_search_tip);
                                    if (pFMedium3 != null) {
                                        return new ActivityFirmwareRepairSearchBinding(linearLayout2, button, imageView, listView, nestedScrollView, linearLayout, linearLayout2, pFMedium, pFMedium2, pFMedium3);
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
    public static ActivityFirmwareRepairSearchBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityFirmwareRepairSearchBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_firmware_repair_search, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
