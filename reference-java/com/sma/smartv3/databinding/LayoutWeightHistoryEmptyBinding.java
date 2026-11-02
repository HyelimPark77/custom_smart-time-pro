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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutWeightHistoryEmptyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvMeasureTip;

    private LayoutWeightHistoryEmptyBinding(@NonNull LinearLayout rootView, @NonNull PFMedium tvMeasureTip) {
        this.rootView = rootView;
        this.tvMeasureTip = tvMeasureTip;
    }

    @NonNull
    public static LayoutWeightHistoryEmptyBinding bind(@NonNull View rootView) {
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_tip);
        if (pFMedium != null) {
            return new LayoutWeightHistoryEmptyBinding((LinearLayout) rootView, pFMedium);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_measure_tip)));
    }

    @NonNull
    public static LayoutWeightHistoryEmptyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutWeightHistoryEmptyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_weight_history_empty, parent, false);
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
