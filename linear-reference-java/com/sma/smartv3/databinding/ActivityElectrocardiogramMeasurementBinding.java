package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityElectrocardiogramMeasurementBinding implements ViewBinding {

    @NonNull
    public final TextView eleMeasurementUnit;

    @NonNull
    public final TextView eleMeasurementValue;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityElectrocardiogramMeasurementBinding(@NonNull LinearLayout rootView, @NonNull TextView eleMeasurementUnit, @NonNull TextView eleMeasurementValue, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.eleMeasurementUnit = eleMeasurementUnit;
        this.eleMeasurementValue = eleMeasurementValue;
        this.root = root;
    }

    @NonNull
    public static ActivityElectrocardiogramMeasurementBinding bind(@NonNull View rootView) {
        int r0 = R.id.ele_measurement_unit;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ele_measurement_unit);
        if (r1 == null) goto L9;
        r0 = R.id.ele_measurement_value;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ele_measurement_value);
        if (r2 == null) goto L9;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityElectrocardiogramMeasurementBinding(r3, r1, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityElectrocardiogramMeasurementBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityElectrocardiogramMeasurementBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_electrocardiogram_measurement, parent, false);
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
