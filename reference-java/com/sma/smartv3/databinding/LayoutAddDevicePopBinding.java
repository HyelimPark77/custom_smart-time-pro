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
import com.sma.smartv3.view.bubbleview.BubbleLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutAddDevicePopBinding implements ViewBinding {

    @NonNull
    public final BubbleLayout bubbleLayout;

    @NonNull
    public final LinearLayout llScan;

    @NonNull
    public final LinearLayout llSearch;

    @NonNull
    private final LinearLayout rootView;

    private LayoutAddDevicePopBinding(@NonNull LinearLayout rootView, @NonNull BubbleLayout bubbleLayout, @NonNull LinearLayout llScan, @NonNull LinearLayout llSearch) {
        this.rootView = rootView;
        this.bubbleLayout = bubbleLayout;
        this.llScan = llScan;
        this.llSearch = llSearch;
    }

    @NonNull
    public static LayoutAddDevicePopBinding bind(@NonNull View rootView) {
        int i = R.id.bubbleLayout;
        BubbleLayout bubbleLayout = (BubbleLayout) ViewBindings.findChildViewById(rootView, R.id.bubbleLayout);
        if (bubbleLayout != null) {
            i = R.id.ll_scan;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_scan);
            if (linearLayout != null) {
                i = R.id.ll_search;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_search);
                if (linearLayout2 != null) {
                    return new LayoutAddDevicePopBinding((LinearLayout) rootView, bubbleLayout, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutAddDevicePopBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutAddDevicePopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_add_device_pop, parent, false);
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
