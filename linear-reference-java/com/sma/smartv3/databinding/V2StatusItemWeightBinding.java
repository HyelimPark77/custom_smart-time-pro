package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.MHFont;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemWeightBinding implements ViewBinding {

    @NonNull
    public final PFRegular bmi;

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final LinearLayout emptyPanel;

    @NonNull
    public final LinearLayout llValue;

    @NonNull
    public final LinearLayout llValueSub;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final PFMedium tvNoData;

    @NonNull
    public final LineChart weightChart;

    @NonNull
    public final TintImageView weightIv;

    @NonNull
    public final DINCondBold weightLastTime;

    @NonNull
    public final MHFont weightLastValue;

    @NonNull
    public final PFRegular weightUnit;

    private V2StatusItemWeightBinding(@NonNull FrameLayout rootView, @NonNull PFRegular bmi, @NonNull LinearLayout dataPanel, @NonNull LinearLayout emptyPanel, @NonNull LinearLayout llValue, @NonNull LinearLayout llValueSub, @NonNull PFMedium tvNoData, @NonNull LineChart weightChart, @NonNull TintImageView weightIv, @NonNull DINCondBold weightLastTime, @NonNull MHFont weightLastValue, @NonNull PFRegular weightUnit) {
        this.rootView = rootView;
        this.bmi = bmi;
        this.dataPanel = dataPanel;
        this.emptyPanel = emptyPanel;
        this.llValue = llValue;
        this.llValueSub = llValueSub;
        this.tvNoData = tvNoData;
        this.weightChart = weightChart;
        this.weightIv = weightIv;
        this.weightLastTime = weightLastTime;
        this.weightLastValue = weightLastValue;
        this.weightUnit = weightUnit;
    }

    @NonNull
    public static V2StatusItemWeightBinding bind(@NonNull View rootView) {
        int r0 = R.id.bmi;
        PFRegular r4 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.bmi);
        if (r4 == null) goto L27;
        r0 = R.id.data_panel;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r5 == null) goto L27;
        r0 = R.id.empty_panel;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
        if (r6 == null) goto L27;
        r0 = R.id.ll_value;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
        if (r7 == null) goto L27;
        r0 = R.id.ll_value_sub;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value_sub);
        if (r8 == null) goto L27;
        r0 = R.id.tv_no_data;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
        if (r9 == null) goto L27;
        r0 = R.id.weightChart;
        LineChart r10 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.weightChart);
        if (r10 == null) goto L27;
        r0 = R.id.weightIv;
        TintImageView r11 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.weightIv);
        if (r11 == null) goto L27;
        r0 = R.id.weightLastTime;
        DINCondBold r12 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.weightLastTime);
        if (r12 == null) goto L27;
        r0 = R.id.weightLastValue;
        MHFont r13 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.weightLastValue);
        if (r13 == null) goto L27;
        r0 = R.id.weightUnit;
        PFRegular r14 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.weightUnit);
        if (r14 == null) goto L27;
        return new V2StatusItemWeightBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2StatusItemWeightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemWeightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_weight, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
