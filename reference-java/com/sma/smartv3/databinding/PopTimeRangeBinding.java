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
import com.sma.smartv3.view.picker.TimeRangePicker;

/* JADX INFO: loaded from: classes19.dex */
public final class PopTimeRangeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TimeRangePicker timeRangePicker;

    private PopTimeRangeBinding(@NonNull LinearLayout rootView, @NonNull TimeRangePicker timeRangePicker) {
        this.rootView = rootView;
        this.timeRangePicker = timeRangePicker;
    }

    @NonNull
    public static PopTimeRangeBinding bind(@NonNull View rootView) {
        TimeRangePicker timeRangePicker = (TimeRangePicker) ViewBindings.findChildViewById(rootView, R.id.time_range_picker);
        if (timeRangePicker != null) {
            return new PopTimeRangeBinding((LinearLayout) rootView, timeRangePicker);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.time_range_picker)));
    }

    @NonNull
    public static PopTimeRangeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopTimeRangeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_time_range, parent, false);
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
