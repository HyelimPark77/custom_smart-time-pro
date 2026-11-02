package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentWeightRecordBinding implements ViewBinding {

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final PFMedium bmiEvaluation;

    @NonNull
    public final PFMedium bmiValue;

    @NonNull
    public final ImageButton bodyFatScaleBt;

    @NonNull
    public final ImageButton changeBt;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageButton deleteBt;

    @NonNull
    public final ImageView image;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final LinearLayout llBottomTool;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    public final DINCondBold nowTimeDetails;

    @NonNull
    public final DINCondBold nowValue;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final CircleThumbSegmentedBarView sbvBmi;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium valueUnit;

    @NonNull
    public final PFMedium weightUnit;

    private FragmentWeightRecordBinding(@NonNull LinearLayout rootView_, @NonNull ImageButton beforeTime, @NonNull PFMedium bmiEvaluation, @NonNull PFMedium bmiValue, @NonNull ImageButton bodyFatScaleBt, @NonNull ImageButton changeBt, @NonNull LinearLayout dataContent, @NonNull ImageButton deleteBt, @NonNull ImageView image, @NonNull LineChart lineChart, @NonNull LinearLayout llBottomTool, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull LinearLayout rootView, @NonNull CircleThumbSegmentedBarView sbvBmi, @NonNull NestedScrollView scrollView, @NonNull PFMedium valueUnit, @NonNull PFMedium weightUnit) {
        this.rootView_ = rootView_;
        this.beforeTime = beforeTime;
        this.bmiEvaluation = bmiEvaluation;
        this.bmiValue = bmiValue;
        this.bodyFatScaleBt = bodyFatScaleBt;
        this.changeBt = changeBt;
        this.dataContent = dataContent;
        this.deleteBt = deleteBt;
        this.image = image;
        this.lineChart = lineChart;
        this.llBottomTool = llBottomTool;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.rootView = rootView;
        this.sbvBmi = sbvBmi;
        this.scrollView = scrollView;
        this.valueUnit = valueUnit;
        this.weightUnit = weightUnit;
    }

    @NonNull
    public static FragmentWeightRecordBinding bind(@NonNull View rootView) {
        int r1 = R.id.beforeTime;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r5 == null) goto L43;
        r1 = R.id.bmiEvaluation;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.bmiEvaluation);
        if (r6 == null) goto L43;
        r1 = R.id.bmiValue;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.bmiValue);
        if (r7 == null) goto L43;
        r1 = R.id.bodyFatScaleBt;
        ImageButton r8 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bodyFatScaleBt);
        if (r8 == null) goto L43;
        r1 = R.id.changeBt;
        ImageButton r9 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.changeBt);
        if (r9 == null) goto L43;
        r1 = R.id.dataContent;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r10 == null) goto L43;
        r1 = R.id.deleteBt;
        ImageButton r11 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.deleteBt);
        if (r11 == null) goto L43;
        r1 = R.id.image;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r12 == null) goto L43;
        r1 = R.id.lineChart;
        LineChart r13 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
        if (r13 == null) goto L43;
        r1 = R.id.ll_bottom_tool;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_tool);
        if (r14 == null) goto L43;
        r1 = R.id.loading;
        RelativeLayout r15 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r15 == null) goto L43;
        r1 = R.id.nextTime;
        ImageButton r16 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r16 == null) goto L43;
        r1 = R.id.nowTime;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r17 == null) goto L43;
        r1 = R.id.nowTimeDetails;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r18 == null) goto L43;
        r1 = R.id.nowValue;
        DINCondBold r19 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r19 == null) goto L43;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.sbv_bmi;
        CircleThumbSegmentedBarView r21 = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv_bmi);
        if (r21 == null) goto L43;
        r1 = R.id.scrollView;
        NestedScrollView r22 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r22 == null) goto L43;
        r1 = R.id.valueUnit;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r23 == null) goto L43;
        r1 = R.id.weightUnit;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.weightUnit);
        if (r24 == null) goto L43;
        return new FragmentWeightRecordBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r4, r21, r22, r23, r24);
    L43:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentWeightRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentWeightRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_weight_record, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
