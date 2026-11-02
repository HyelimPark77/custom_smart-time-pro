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
import com.sma.smartv3.view.picker.TimePicker;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewTimeRangePickerBinding implements ViewBinding {

    @NonNull
    public final TimePicker pickerEnd;

    @NonNull
    public final TimePicker pickerStart;

    @NonNull
    private final LinearLayout rootView;

    private ViewTimeRangePickerBinding(@NonNull LinearLayout rootView, @NonNull TimePicker pickerEnd, @NonNull TimePicker pickerStart) {
        this.rootView = rootView;
        this.pickerEnd = pickerEnd;
        this.pickerStart = pickerStart;
    }

    @NonNull
    public static ViewTimeRangePickerBinding bind(@NonNull View rootView) {
        int r0 = R.id.picker_end;
        TimePicker r1 = (TimePicker) ViewBindings.findChildViewById(rootView, R.id.picker_end);
        if (r1 == null) goto L9;
        r0 = R.id.picker_start;
        TimePicker r2 = (TimePicker) ViewBindings.findChildViewById(rootView, R.id.picker_start);
        if (r2 == null) goto L9;
        return new ViewTimeRangePickerBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ViewTimeRangePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ViewTimeRangePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.view_time_range_picker, parent, false);
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
