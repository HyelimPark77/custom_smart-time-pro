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
        int r0 = R.id.date_picker;
        DatePicker r1 = (DatePicker) ViewBindings.findChildViewById(rootView, R.id.date_picker);
        if (r1 == null) goto L9;
        r0 = R.id.time_picker;
        TimePicker r2 = (TimePicker) ViewBindings.findChildViewById(rootView, R.id.time_picker);
        if (r2 == null) goto L9;
        return new ViewDateTimePickerBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ViewDateTimePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ViewDateTimePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.view_date_time_picker, parent, false);
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
