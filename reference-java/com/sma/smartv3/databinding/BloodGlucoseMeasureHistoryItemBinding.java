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
public final class BloodGlucoseMeasureHistoryItemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTime;

    @NonNull
    public final PFMedium tvValue;

    private BloodGlucoseMeasureHistoryItemBinding(@NonNull LinearLayout rootView, @NonNull PFMedium tvTime, @NonNull PFMedium tvValue) {
        this.rootView = rootView;
        this.tvTime = tvTime;
        this.tvValue = tvValue;
    }

    @NonNull
    public static BloodGlucoseMeasureHistoryItemBinding bind(@NonNull View rootView) {
        int i = R.id.tv_time;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (pFMedium != null) {
            i = R.id.tv_value;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
            if (pFMedium2 != null) {
                return new BloodGlucoseMeasureHistoryItemBinding((LinearLayout) rootView, pFMedium, pFMedium2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static BloodGlucoseMeasureHistoryItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static BloodGlucoseMeasureHistoryItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.blood_glucose_measure_history_item, parent, false);
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
