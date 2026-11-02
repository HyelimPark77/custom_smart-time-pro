package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutGpsCommonV3Binding implements ViewBinding {

    @NonNull
    public final LinearLayout cumulativeRunningLl;

    @NonNull
    public final RelativeLayout distanceLl;

    @NonNull
    public final DINCondBold distanceNow;

    @NonNull
    public final PFMedium nowGoalUnit;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TintImageView sportGoalSet;

    @NonNull
    public final TintImageView sportHot;

    @NonNull
    public final PFMedium sportSet;

    @NonNull
    public final ImageButton sportStart;

    private LayoutGpsCommonV3Binding(@NonNull LinearLayout rootView, @NonNull LinearLayout cumulativeRunningLl, @NonNull RelativeLayout distanceLl, @NonNull DINCondBold distanceNow, @NonNull PFMedium nowGoalUnit, @NonNull TintImageView sportGoalSet, @NonNull TintImageView sportHot, @NonNull PFMedium sportSet, @NonNull ImageButton sportStart) {
        this.rootView = rootView;
        this.cumulativeRunningLl = cumulativeRunningLl;
        this.distanceLl = distanceLl;
        this.distanceNow = distanceNow;
        this.nowGoalUnit = nowGoalUnit;
        this.sportGoalSet = sportGoalSet;
        this.sportHot = sportHot;
        this.sportSet = sportSet;
        this.sportStart = sportStart;
    }

    @NonNull
    public static LayoutGpsCommonV3Binding bind(@NonNull View rootView) {
        int i = R.id.cumulativeRunningLl;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.cumulativeRunningLl);
        if (linearLayout != null) {
            i = R.id.distanceLl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.distanceLl);
            if (relativeLayout != null) {
                i = R.id.distanceNow;
                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.distanceNow);
                if (dINCondBold != null) {
                    i = R.id.nowGoalUnit;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowGoalUnit);
                    if (pFMedium != null) {
                        i = R.id.sportGoalSet;
                        TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportGoalSet);
                        if (tintImageView != null) {
                            i = R.id.sportHot;
                            TintImageView tintImageView2 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportHot);
                            if (tintImageView2 != null) {
                                i = R.id.sportSet;
                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportSet);
                                if (pFMedium2 != null) {
                                    i = R.id.sportStart;
                                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.sportStart);
                                    if (imageButton != null) {
                                        return new LayoutGpsCommonV3Binding((LinearLayout) rootView, linearLayout, relativeLayout, dINCondBold, pFMedium, tintImageView, tintImageView2, pFMedium2, imageButton);
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
    public static LayoutGpsCommonV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutGpsCommonV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_gps_common_v3, parent, false);
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
