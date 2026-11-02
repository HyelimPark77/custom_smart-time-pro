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
import com.sma.smartv3.view.picker.CalibrationPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDateCalibrationBinding implements ViewBinding {

    @NonNull
    public final CalibrationPicker datePicker;

    @NonNull
    private final LinearLayout rootView;

    private PopDateCalibrationBinding(@NonNull LinearLayout rootView, @NonNull CalibrationPicker datePicker) {
        this.rootView = rootView;
        this.datePicker = datePicker;
    }

    @NonNull
    public static PopDateCalibrationBinding bind(@NonNull View rootView) {
        CalibrationPicker calibrationPicker = (CalibrationPicker) ViewBindings.findChildViewById(rootView, R.id.date_picker);
        if (calibrationPicker != null) {
            return new PopDateCalibrationBinding((LinearLayout) rootView, calibrationPicker);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.date_picker)));
    }

    @NonNull
    public static PopDateCalibrationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopDateCalibrationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_date_calibration, parent, false);
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
