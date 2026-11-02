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
        int i = R.id.distanceUnit;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
        if (pFMedium != null) {
            i = R.id.llCalories;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
            if (linearLayout != null) {
                i = R.id.llDistance;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
                if (linearLayout2 != null) {
                    i = R.id.tvCalorie;
                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvCalorie);
                    if (dINCondBold != null) {
                        i = R.id.tvDistance;
                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvDistance);
                        if (dINCondBold2 != null) {
                            return new StatusMiddleFunctionBinding((LinearLayout) rootView, pFMedium, linearLayout, linearLayout2, dINCondBold, dINCondBold2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusMiddleFunctionBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusMiddleFunctionBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_middle_function, parent, false);
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
