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
        int r0 = R.id.bubbleLayout;
        BubbleLayout r1 = (BubbleLayout) ViewBindings.findChildViewById(rootView, R.id.bubbleLayout);
        if (r1 == null) goto L11;
        r0 = R.id.ll_scan;
        LinearLayout r2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_scan);
        if (r2 == null) goto L11;
        r0 = R.id.ll_search;
        LinearLayout r3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_search);
        if (r3 == null) goto L11;
        return new LayoutAddDevicePopBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutAddDevicePopBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutAddDevicePopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_add_device_pop, parent, false);
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
