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
import com.sma.smartv3.view.picker.DateTimePicker;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDateTimePickerBinding implements ViewBinding {

    @NonNull
    public final DateTimePicker dateTimePicker;

    @NonNull
    private final LinearLayout rootView;

    private PopDateTimePickerBinding(@NonNull LinearLayout rootView, @NonNull DateTimePicker dateTimePicker) {
        this.rootView = rootView;
        this.dateTimePicker = dateTimePicker;
    }

    @NonNull
    public static PopDateTimePickerBinding bind(@NonNull View rootView) {
        DateTimePicker dateTimePicker = (DateTimePicker) ViewBindings.findChildViewById(rootView, R.id.date_time_picker);
        if (dateTimePicker != null) {
            return new PopDateTimePickerBinding((LinearLayout) rootView, dateTimePicker);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.date_time_picker)));
    }

    @NonNull
    public static PopDateTimePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopDateTimePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_date_time_picker, parent, false);
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
