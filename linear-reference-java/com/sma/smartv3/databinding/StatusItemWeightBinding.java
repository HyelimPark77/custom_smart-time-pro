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
        int r0 = R.id.bmi;
        PFRegular r4 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.bmi);
        if (r4 == null) goto L19;
        r0 = R.id.noData;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
        if (r5 == null) goto L19;
        r0 = R.id.weightChart;
        LineChart r6 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.weightChart);
        if (r6 == null) goto L19;
        r0 = R.id.weightIv;
        TintImageView r7 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.weightIv);
        if (r7 == null) goto L19;
        r0 = R.id.weightLastTime;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.weightLastTime);
        if (r8 == null) goto L19;
        r0 = R.id.weightLastValue;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.weightLastValue);
        if (r9 == null) goto L19;
        r0 = R.id.weightUnit;
        PFRegular r10 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.weightUnit);
        if (r10 == null) goto L19;
        return new StatusItemWeightBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemWeightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemWeightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_weight, parent, false);
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
