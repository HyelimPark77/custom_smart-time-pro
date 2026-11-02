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
public final class LayoutGpsCommonBinding implements ViewBinding {

    @NonNull
    public final LinearLayout cumulativeRunningLl;

    @NonNull
    public final RelativeLayout distanceLl;

    @NonNull
    public final DINCondBold distanceNow;

    @NonNull
    public final PFMedium nowGoalUnit;

    @NonNull
    private final View rootView;

    @NonNull
    public final TintImageView sportGoalSet;

    @NonNull
    public final TintImageView sportSet;

    @NonNull
    public final ImageButton sportStart;

    private LayoutGpsCommonBinding(@NonNull View rootView, @NonNull LinearLayout cumulativeRunningLl, @NonNull RelativeLayout distanceLl, @NonNull DINCondBold distanceNow, @NonNull PFMedium nowGoalUnit, @NonNull TintImageView sportGoalSet, @NonNull TintImageView sportSet, @NonNull ImageButton sportStart) {
        this.rootView = rootView;
        this.cumulativeRunningLl = cumulativeRunningLl;
        this.distanceLl = distanceLl;
        this.distanceNow = distanceNow;
        this.nowGoalUnit = nowGoalUnit;
        this.sportGoalSet = sportGoalSet;
        this.sportSet = sportSet;
        this.sportStart = sportStart;
    }

    @NonNull
    public static LayoutGpsCommonBinding bind(@NonNull View rootView) {
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
                            i = R.id.sportSet;
                            TintImageView tintImageView2 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportSet);
                            if (tintImageView2 != null) {
                                i = R.id.sportStart;
                                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.sportStart);
                                if (imageButton != null) {
                                    return new LayoutGpsCommonBinding(rootView, linearLayout, relativeLayout, dINCondBold, pFMedium, tintImageView, tintImageView2, imageButton);
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
    public static LayoutGpsCommonBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutGpsCommonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_gps_common, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
