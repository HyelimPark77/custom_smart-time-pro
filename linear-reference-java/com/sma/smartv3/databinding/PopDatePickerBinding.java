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
        DatePicker r1 = (DatePicker) ViewBindings.findChildViewById(rootView, R.id.date_picker);
        if (r1 == null) goto L7;
        return new PopDatePickerBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.date_picker)));
    }

    @NonNull
    public static PopDatePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopDatePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_date_picker, parent, false);
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
