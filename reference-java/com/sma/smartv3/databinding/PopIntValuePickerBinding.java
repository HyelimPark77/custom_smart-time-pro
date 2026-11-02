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
import com.sma.smartv3.view.picker.IntValuePicker;

/* JADX INFO: loaded from: classes19.dex */
public final class PopIntValuePickerBinding implements ViewBinding {

    @NonNull
    public final IntValuePicker intValuePicker;

    @NonNull
    private final LinearLayout rootView;

    private PopIntValuePickerBinding(@NonNull LinearLayout rootView, @NonNull IntValuePicker intValuePicker) {
        this.rootView = rootView;
        this.intValuePicker = intValuePicker;
    }

    @NonNull
    public static PopIntValuePickerBinding bind(@NonNull View rootView) {
        IntValuePicker intValuePicker = (IntValuePicker) ViewBindings.findChildViewById(rootView, R.id.int_value_picker);
        if (intValuePicker != null) {
            return new PopIntValuePickerBinding((LinearLayout) rootView, intValuePicker);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.int_value_picker)));
    }

    @NonNull
    public static PopIntValuePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopIntValuePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_int_value_picker, parent, false);
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
