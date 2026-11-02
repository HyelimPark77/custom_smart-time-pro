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
import com.sma.smartv3.view.WheelView.WheelView;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewTwoCalibrationBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final WheelView wv1;

    @NonNull
    public final WheelView wv2;

    private ViewTwoCalibrationBinding(@NonNull LinearLayout rootView, @NonNull WheelView wv1, @NonNull WheelView wv2) {
        this.rootView = rootView;
        this.wv1 = wv1;
        this.wv2 = wv2;
    }

    @NonNull
    public static ViewTwoCalibrationBinding bind(@NonNull View rootView) {
        int r0 = R.id.wv1;
        WheelView r1 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv1);
        if (r1 == null) goto L9;
        r0 = R.id.wv2;
        WheelView r2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv2);
        if (r2 == null) goto L9;
        return new ViewTwoCalibrationBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ViewTwoCalibrationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ViewTwoCalibrationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.view_two_calibration, parent, false);
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
