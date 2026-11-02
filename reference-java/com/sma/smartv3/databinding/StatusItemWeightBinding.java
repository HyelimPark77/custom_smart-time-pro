package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemWeightBinding implements ViewBinding {

    @NonNull
    public final PFRegular bmi;

    @NonNull
    public final DINCondBold noData;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LineChart weightChart;

    @NonNull
    public final TintImageView weightIv;

    @NonNull
    public final DINCondBold weightLastTime;

    @NonNull
    public final DINCondBold weightLastValue;

    @NonNull
    public final PFRegular weightUnit;

    private StatusItemWeightBinding(@NonNull LinearLayout rootView, @NonNull PFRegular bmi, @NonNull DINCondBold noData, @NonNull LineChart weightChart, @NonNull TintImageView weightIv, @NonNull DINCondBold weightLastTime, @NonNull DINCondBold weightLastValue, @NonNull PFRegular weightUnit) {
        this.rootView = rootView;
        this.bmi = bmi;
        this.noData = noData;
        this.weightChart = weightChart;
        this.weightIv = weightIv;
        this.weightLastTime = weightLastTime;
        this.weightLastValue = weightLastValue;
        this.weightUnit = weightUnit;
    }

    @NonNull
    public static StatusItemWeightBinding bind(@NonNull View rootView) {
        int i = R.id.bmi;
        PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.bmi);
        if (pFRegular != null) {
            i = R.id.noData;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
            if (dINCondBold != null) {
                i = R.id.weightChart;
                LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.weightChart);
                if (lineChart != null) {
                    i = R.id.weightIv;
                    TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.weightIv);
                    if (tintImageView != null) {
                        i = R.id.weightLastTime;
                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.weightLastTime);
                        if (dINCondBold2 != null) {
                            i = R.id.weightLastValue;
                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.weightLastValue);
                            if (dINCondBold3 != null) {
                                i = R.id.weightUnit;
                                PFRegular pFRegular2 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.weightUnit);
                                if (pFRegular2 != null) {
                                    return new StatusItemWeightBinding((LinearLayout) rootView, pFRegular, dINCondBold, lineChart, tintImageView, dINCondBold2, dINCondBold3, pFRegular2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemWeightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemWeightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_weight, parent, false);
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
