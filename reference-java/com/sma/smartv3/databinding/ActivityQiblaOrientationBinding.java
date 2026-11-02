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
        int i = R.id.iv_qibla_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_qibla_arrow);
        if (imageView != null) {
            i = R.id.iv_qibla_arrow_top;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_qibla_arrow_top);
            if (imageView2 != null) {
                i = R.id.iv_qibla_dial;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_qibla_dial);
                if (imageView3 != null) {
                    i = R.id.qibla_panel;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.qibla_panel);
                    if (relativeLayout != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        i = R.id.tv_address;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_address);
                        if (pFMedium != null) {
                            i = R.id.tv_angle_big;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_angle_big);
                            if (pFMedium2 != null) {
                                i = R.id.tv_cal;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cal);
                                if (pFMedium3 != null) {
                                    i = R.id.tv_next_time;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_next_time);
                                    if (pFMedium4 != null) {
                                        i = R.id.tv_next_time_name;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_next_time_name);
                                        if (imageView4 != null) {
                                            i = R.id.tv_qibla_angle;
                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_qibla_angle);
                                            if (pFMedium5 != null) {
                                                return new ActivityQiblaOrientationBinding(linearLayout, imageView, imageView2, imageView3, relativeLayout, linearLayout, pFMedium, pFMedium2, pFMedium3, pFMedium4, imageView4, pFMedium5);
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
    public static ActivityQiblaOrientationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityQiblaOrientationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_qibla_orientation, parent, false);
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
