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

/* JADX INFO: loaded from: classes19.dex */
public final class PopDatePickerBinding implements ViewBinding {

    @NonNull
    public final DatePicker datePicker;

    @NonNull
    private final LinearLayout rootView;

    private PopDatePickerBinding(@NonNull LinearLayout rootView, @NonNull DatePicker datePicker) {
        this.rootView = rootView;
        this.datePicker = datePicker;
    }

    @NonNull
    public static PopDatePickerBinding bind(@NonNull View rootView) {
        DatePicker datePicker = (DatePicker) ViewBindings.findChildViewById(rootView, R.id.date_picker);
        if (datePicker != null) {
            return new PopDatePickerBinding((LinearLayout) rootView, datePicker);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.date_picker)));
    }

    @NonNull
    public static PopDatePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopDatePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_date_picker, parent, false);
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
