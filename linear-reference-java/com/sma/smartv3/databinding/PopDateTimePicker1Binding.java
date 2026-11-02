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
public final class PopDateTimePicker1Binding implements ViewBinding {

    @NonNull
    public final DateTimePicker dateTimePicker;

    @NonNull
    private final LinearLayout rootView;

    private PopDateTimePicker1Binding(@NonNull LinearLayout rootView, @NonNull DateTimePicker dateTimePicker) {
        this.rootView = rootView;
        this.dateTimePicker = dateTimePicker;
    }

    @NonNull
    public static PopDateTimePicker1Binding bind(@NonNull View rootView) {
        DateTimePicker r1 = (DateTimePicker) ViewBindings.findChildViewById(rootView, R.id.date_time_picker);
        if (r1 == null) goto L7;
        return new PopDateTimePicker1Binding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.date_time_picker)));
    }

    @NonNull
    public static PopDateTimePicker1Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopDateTimePicker1Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_date_time_picker_1, parent, false);
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
