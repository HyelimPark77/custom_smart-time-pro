package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityQiblaOrientationBinding implements ViewBinding {

    @NonNull
    public final ImageView ivQiblaArrow;

    @NonNull
    public final ImageView ivQiblaArrowTop;

    @NonNull
    public final ImageView ivQiblaDial;

    @NonNull
    public final RelativeLayout qiblaPanel;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvAddress;

    @NonNull
    public final PFMedium tvAngleBig;

    @NonNull
    public final PFMedium tvCal;

    @NonNull
    public final PFMedium tvNextTime;

    @NonNull
    public final ImageView tvNextTimeName;

    @NonNull
    public final PFMedium tvQiblaAngle;

    private ActivityQiblaOrientationBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivQiblaArrow, @NonNull ImageView ivQiblaArrowTop, @NonNull ImageView ivQiblaDial, @NonNull RelativeLayout qiblaPanel, @NonNull LinearLayout root, @NonNull PFMedium tvAddress, @NonNull PFMedium tvAngleBig, @NonNull PFMedium tvCal, @NonNull PFMedium tvNextTime, @NonNull ImageView tvNextTimeName, @NonNull PFMedium tvQiblaAngle) {
        this.rootView = rootView;
        this.ivQiblaArrow = ivQiblaArrow;
        this.ivQiblaArrowTop = ivQiblaArrowTop;
        this.ivQiblaDial = ivQiblaDial;
        this.qiblaPanel = qiblaPanel;
        this.root = root;
        this.tvAddress = tvAddress;
        this.tvAngleBig = tvAngleBig;
        this.tvCal = tvCal;
        this.tvNextTime = tvNextTime;
        this.tvNextTimeName = tvNextTimeName;
        this.tvQiblaAngle = tvQiblaAngle;
    }

    @NonNull
    public static ActivityQiblaOrientationBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_qibla_arrow;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_qibla_arrow);
        if (r4 == null) goto L25;
        r0 = R.id.iv_qibla_arrow_top;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_qibla_arrow_top);
        if (r5 == null) goto L25;
        r0 = R.id.iv_qibla_dial;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_qibla_dial);
        if (r6 == null) goto L25;
        r0 = R.id.qibla_panel;
        RelativeLayout r7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.qibla_panel);
        if (r7 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_address;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_address);
        if (r9 == null) goto L25;
        r0 = R.id.tv_angle_big;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_angle_big);
        if (r10 == null) goto L25;
        r0 = R.id.tv_cal;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cal);
        if (r11 == null) goto L25;
        r0 = R.id.tv_next_time;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_next_time);
        if (r12 == null) goto L25;
        r0 = R.id.tv_next_time_name;
        ImageView r13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_next_time_name);
        if (r13 == null) goto L25;
        r0 = R.id.tv_qibla_angle;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_qibla_angle);
        if (r14 == null) goto L25;
        return new ActivityQiblaOrientationBinding(r3, r4, r5, r6, r7, r3, r9, r10, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityQiblaOrientationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityQiblaOrientationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_qibla_orientation, parent, false);
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
