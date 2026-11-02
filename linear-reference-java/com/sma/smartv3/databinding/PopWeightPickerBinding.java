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
import com.sma.smartv3.view.picker.WeightPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class PopWeightPickerBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final WeightPicker weightPicker;

    private PopWeightPickerBinding(@NonNull LinearLayout rootView, @NonNull WeightPicker weightPicker) {
        this.rootView = rootView;
        this.weightPicker = weightPicker;
    }

    @NonNull
    public static PopWeightPickerBinding bind(@NonNull View rootView) {
        WeightPicker r1 = (WeightPicker) ViewBindings.findChildViewById(rootView, R.id.weight_picker);
        if (r1 == null) goto L7;
        return new PopWeightPickerBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.weight_picker)));
    }

    @NonNull
    public static PopWeightPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopWeightPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_weight_picker, parent, false);
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
