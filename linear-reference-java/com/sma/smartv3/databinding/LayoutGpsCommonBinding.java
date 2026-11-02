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
        int r0 = R.id.cumulativeRunningLl;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.cumulativeRunningLl);
        if (r4 == null) goto L19;
        r0 = R.id.distanceLl;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.distanceLl);
        if (r5 == null) goto L19;
        r0 = R.id.distanceNow;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.distanceNow);
        if (r6 == null) goto L19;
        r0 = R.id.nowGoalUnit;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowGoalUnit);
        if (r7 == null) goto L19;
        r0 = R.id.sportGoalSet;
        TintImageView r8 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportGoalSet);
        if (r8 == null) goto L19;
        r0 = R.id.sportSet;
        TintImageView r9 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportSet);
        if (r9 == null) goto L19;
        r0 = R.id.sportStart;
        ImageButton r10 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.sportStart);
        if (r10 == null) goto L19;
        return new LayoutGpsCommonBinding(rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
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
        View r2 = inflater.inflate(R.layout.layout_gps_common, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }
}
