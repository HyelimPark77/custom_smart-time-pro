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
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutStatusPressureBottomBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CircleThumbSegmentedBarView sbv;

    private LayoutStatusPressureBottomBinding(@NonNull LinearLayout rootView, @NonNull CircleThumbSegmentedBarView sbv) {
        this.rootView = rootView;
        this.sbv = sbv;
    }

    @NonNull
    public static LayoutStatusPressureBottomBinding bind(@NonNull View rootView) {
        CircleThumbSegmentedBarView r1 = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv);
        if (r1 == null) goto L7;
        return new LayoutStatusPressureBottomBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.sbv)));
    }

    @NonNull
    public static LayoutStatusPressureBottomBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutStatusPressureBottomBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_status_pressure_bottom, parent, false);
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
