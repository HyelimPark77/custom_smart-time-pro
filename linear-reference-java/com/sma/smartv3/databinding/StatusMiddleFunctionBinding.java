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
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusMiddleFunctionBinding implements ViewBinding {

    @NonNull
    public final PFMedium distanceUnit;

    @NonNull
    public final LinearLayout llCalories;

    @NonNull
    public final LinearLayout llDistance;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DINCondBold tvCalorie;

    @NonNull
    public final DINCondBold tvDistance;

    private StatusMiddleFunctionBinding(@NonNull LinearLayout rootView, @NonNull PFMedium distanceUnit, @NonNull LinearLayout llCalories, @NonNull LinearLayout llDistance, @NonNull DINCondBold tvCalorie, @NonNull DINCondBold tvDistance) {
        this.rootView = rootView;
        this.distanceUnit = distanceUnit;
        this.llCalories = llCalories;
        this.llDistance = llDistance;
        this.tvCalorie = tvCalorie;
        this.tvDistance = tvDistance;
    }

    @NonNull
    public static StatusMiddleFunctionBinding bind(@NonNull View rootView) {
        int r0 = R.id.distanceUnit;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
        if (r4 == null) goto L15;
        r0 = R.id.llCalories;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
        if (r5 == null) goto L15;
        r0 = R.id.llDistance;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
        if (r6 == null) goto L15;
        r0 = R.id.tvCalorie;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvCalorie);
        if (r7 == null) goto L15;
        r0 = R.id.tvDistance;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvDistance);
        if (r8 == null) goto L15;
        return new StatusMiddleFunctionBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusMiddleFunctionBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusMiddleFunctionBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_middle_function, parent, false);
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
