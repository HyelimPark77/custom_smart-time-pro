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
        int i = R.id.ele_measurement_unit;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ele_measurement_unit);
        if (textView != null) {
            i = R.id.ele_measurement_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ele_measurement_value);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                return new ActivityElectrocardiogramMeasurementBinding(linearLayout, textView, textView2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityElectrocardiogramMeasurementBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityElectrocardiogramMeasurementBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_electrocardiogram_measurement, parent, false);
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
