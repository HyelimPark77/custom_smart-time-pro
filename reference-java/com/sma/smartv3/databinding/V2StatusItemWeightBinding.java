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
        int i = R.id.bmi;
        PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.bmi);
        if (pFRegular != null) {
            i = R.id.data_panel;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
            if (linearLayout != null) {
                i = R.id.empty_panel;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
                if (linearLayout2 != null) {
                    i = R.id.ll_value;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
                    if (linearLayout3 != null) {
                        i = R.id.ll_value_sub;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value_sub);
                        if (linearLayout4 != null) {
                            i = R.id.tv_no_data;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
                            if (pFMedium != null) {
                                i = R.id.weightChart;
                                LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.weightChart);
                                if (lineChart != null) {
                                    i = R.id.weightIv;
                                    TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.weightIv);
                                    if (tintImageView != null) {
                                        i = R.id.weightLastTime;
                                        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.weightLastTime);
                                        if (dINCondBold != null) {
                                            i = R.id.weightLastValue;
                                            MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.weightLastValue);
                                            if (mHFont != null) {
                                                i = R.id.weightUnit;
                                                PFRegular pFRegular2 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.weightUnit);
                                                if (pFRegular2 != null) {
                                                    return new V2StatusItemWeightBinding((FrameLayout) rootView, pFRegular, linearLayout, linearLayout2, linearLayout3, linearLayout4, pFMedium, lineChart, tintImageView, dINCondBold, mHFont, pFRegular2);
                                                }
                                            }
                                        }
                                    }
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
    public static V2StatusItemWeightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemWeightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_weight, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
