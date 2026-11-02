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
import com.sma.smartv3.view.picker.HeightPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class PopHeightPickerBinding implements ViewBinding {

    @NonNull
    public final HeightPicker heightPicker;

    @NonNull
    private final LinearLayout rootView;

    private PopHeightPickerBinding(@NonNull LinearLayout rootView, @NonNull HeightPicker heightPicker) {
        this.rootView = rootView;
        this.heightPicker = heightPicker;
    }

    @NonNull
    public static PopHeightPickerBinding bind(@NonNull View rootView) {
        HeightPicker heightPicker = (HeightPicker) ViewBindings.findChildViewById(rootView, R.id.height_picker);
        if (heightPicker != null) {
            return new PopHeightPickerBinding((LinearLayout) rootView, heightPicker);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.height_picker)));
    }

    @NonNull
    public static PopHeightPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopHeightPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_height_picker, parent, false);
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
