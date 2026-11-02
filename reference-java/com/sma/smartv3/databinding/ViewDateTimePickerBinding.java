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
import com.sma.smartv3.view.picker.DatePicker;
import com.sma.smartv3.view.picker.TimePicker;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewDateTimePickerBinding implements ViewBinding {

    @NonNull
    public final DatePicker datePicker;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TimePicker timePicker;

    private ViewDateTimePickerBinding(@NonNull LinearLayout rootView, @NonNull DatePicker datePicker, @NonNull TimePicker timePicker) {
        this.rootView = rootView;
        this.datePicker = datePicker;
        this.timePicker = timePicker;
    }

    @NonNull
    public static ViewDateTimePickerBinding bind(@NonNull View rootView) {
        int i = R.id.date_picker;
        DatePicker datePicker = (DatePicker) ViewBindings.findChildViewById(rootView, R.id.date_picker);
        if (datePicker != null) {
            i = R.id.time_picker;
            TimePicker timePicker = (TimePicker) ViewBindings.findChildViewById(rootView, R.id.time_picker);
            if (timePicker != null) {
                return new ViewDateTimePickerBinding((LinearLayout) rootView, datePicker, timePicker);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewDateTimePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewDateTimePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_date_time_picker, parent, false);
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
