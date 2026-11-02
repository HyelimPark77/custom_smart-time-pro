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
        HeightPicker r1 = (HeightPicker) ViewBindings.findChildViewById(rootView, R.id.height_picker);
        if (r1 == null) goto L7;
        return new PopHeightPickerBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.height_picker)));
    }

    @NonNull
    public static PopHeightPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopHeightPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_height_picker, parent, false);
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
