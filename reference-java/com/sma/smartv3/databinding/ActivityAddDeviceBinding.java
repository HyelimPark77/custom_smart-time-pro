package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.PagerIndicator;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAddDeviceBinding implements ViewBinding {

    @NonNull
    public final PFMedium empty;

    @NonNull
    public final ImageView ivScanBg;

    @NonNull
    public final ListView listView;

    @NonNull
    public final PagerIndicator pagerIndicator;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tv2;

    @NonNull
    public final PFMedium tvBottom1;

    @NonNull
    public final PFMedium tvBottom2;

    @NonNull
    public final PFMedium tvMinute;

    private ActivityAddDeviceBinding(@NonNull LinearLayout rootView_, @NonNull PFMedium empty, @NonNull ImageView ivScanBg, @NonNull ListView listView, @NonNull PagerIndicator pagerIndicator, @NonNull LinearLayout rootView, @NonNull PFMedium tv2, @NonNull PFMedium tvBottom1, @NonNull PFMedium tvBottom2, @NonNull PFMedium tvMinute) {
        this.rootView_ = rootView_;
        this.empty = empty;
        this.ivScanBg = ivScanBg;
        this.listView = listView;
        this.pagerIndicator = pagerIndicator;
        this.rootView = rootView;
        this.tv2 = tv2;
        this.tvBottom1 = tvBottom1;
        this.tvBottom2 = tvBottom2;
        this.tvMinute = tvMinute;
    }

    @NonNull
    public static ActivityAddDeviceBinding bind(@NonNull View rootView) {
        int i = R.id.empty;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (pFMedium != null) {
            i = R.id.iv_scan_bg;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_scan_bg);
            if (imageView != null) {
                i = R.id.list_view;
                ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                if (listView != null) {
                    i = R.id.pager_indicator;
                    PagerIndicator pagerIndicator = (PagerIndicator) ViewBindings.findChildViewById(rootView, R.id.pager_indicator);
                    if (pagerIndicator != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        i = R.id.tv2;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv2);
                        if (pFMedium2 != null) {
                            i = R.id.tv_bottom1;
                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_bottom1);
                            if (pFMedium3 != null) {
                                i = R.id.tv_bottom2;
                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_bottom2);
                                if (pFMedium4 != null) {
                                    i = R.id.tv_minute;
                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_minute);
                                    if (pFMedium5 != null) {
                                        return new ActivityAddDeviceBinding(linearLayout, pFMedium, imageView, listView, pagerIndicator, linearLayout, pFMedium2, pFMedium3, pFMedium4, pFMedium5);
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
    public static ActivityAddDeviceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAddDeviceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_add_device, parent, false);
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
