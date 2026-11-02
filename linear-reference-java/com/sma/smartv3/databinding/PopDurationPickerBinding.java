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
import com.sma.smartv3.view.picker.DurationPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDurationPickerBinding implements ViewBinding {

    @NonNull
    public final DurationPicker durationPicker;

    @NonNull
    private final LinearLayout rootView;

    private PopDurationPickerBinding(@NonNull LinearLayout rootView, @NonNull DurationPicker durationPicker) {
        this.rootView = rootView;
        this.durationPicker = durationPicker;
    }

    @NonNull
    public static PopDurationPickerBinding bind(@NonNull View rootView) {
        DurationPicker r1 = (DurationPicker) ViewBindings.findChildViewById(rootView, R.id.duration_picker);
        if (r1 == null) goto L7;
        return new PopDurationPickerBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.duration_picker)));
    }

    @NonNull
    public static PopDurationPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopDurationPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_duration_picker, parent, false);
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
