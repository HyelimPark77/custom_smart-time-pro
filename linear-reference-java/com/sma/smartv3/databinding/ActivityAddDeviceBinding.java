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
        int r0 = R.id.empty;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r4 == null) goto L21;
        r0 = R.id.iv_scan_bg;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_scan_bg);
        if (r5 == null) goto L21;
        r0 = R.id.list_view;
        ListView r6 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r6 == null) goto L21;
        r0 = R.id.pager_indicator;
        PagerIndicator r7 = (PagerIndicator) ViewBindings.findChildViewById(rootView, R.id.pager_indicator);
        if (r7 == null) goto L21;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv2;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv2);
        if (r9 == null) goto L21;
        r0 = R.id.tv_bottom1;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_bottom1);
        if (r10 == null) goto L21;
        r0 = R.id.tv_bottom2;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_bottom2);
        if (r11 == null) goto L21;
        r0 = R.id.tv_minute;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_minute);
        if (r12 == null) goto L21;
        return new ActivityAddDeviceBinding(r3, r4, r5, r6, r7, r3, r9, r10, r11, r12);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAddDeviceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAddDeviceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_add_device, parent, false);
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
