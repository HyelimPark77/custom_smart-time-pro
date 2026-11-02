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
        int i = R.id.beforeTime;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (imageButton != null) {
            i = R.id.bmiEvaluation;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.bmiEvaluation);
            if (pFMedium != null) {
                i = R.id.bmiValue;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.bmiValue);
                if (pFMedium2 != null) {
                    i = R.id.bodyFatScaleBt;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bodyFatScaleBt);
                    if (imageButton2 != null) {
                        i = R.id.changeBt;
                        ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.changeBt);
                        if (imageButton3 != null) {
                            i = R.id.dataContent;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
                            if (linearLayout != null) {
                                i = R.id.deleteBt;
                                ImageButton imageButton4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.deleteBt);
                                if (imageButton4 != null) {
                                    i = R.id.image;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                                    if (imageView != null) {
                                        i = R.id.lineChart;
                                        LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
                                        if (lineChart != null) {
                                            i = R.id.ll_bottom_tool;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_tool);
                                            if (linearLayout2 != null) {
                                                i = R.id.loading;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                                                if (relativeLayout != null) {
                                                    i = R.id.nextTime;
                                                    ImageButton imageButton5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                                                    if (imageButton5 != null) {
                                                        i = R.id.nowTime;
                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                                                        if (pFMedium3 != null) {
                                                            i = R.id.nowTimeDetails;
                                                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                                            if (dINCondBold != null) {
                                                                i = R.id.nowValue;
                                                                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                                                if (dINCondBold2 != null) {
                                                                    LinearLayout linearLayout3 = (LinearLayout) rootView;
                                                                    i = R.id.sbv_bmi;
                                                                    CircleThumbSegmentedBarView circleThumbSegmentedBarView = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv_bmi);
                                                                    if (circleThumbSegmentedBarView != null) {
                                                                        i = R.id.scrollView;
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                                        if (nestedScrollView != null) {
                                                                            i = R.id.valueUnit;
                                                                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                            if (pFMedium4 != null) {
                                                                                i = R.id.weightUnit;
                                                                                PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.weightUnit);
                                                                                if (pFMedium5 != null) {
                                                                                    return new FragmentWeightRecordBinding(linearLayout3, imageButton, pFMedium, pFMedium2, imageButton2, imageButton3, linearLayout, imageButton4, imageView, lineChart, linearLayout2, relativeLayout, imageButton5, pFMedium3, dINCondBold, dINCondBold2, linearLayout3, circleThumbSegmentedBarView, nestedScrollView, pFMedium4, pFMedium5);
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
    public static FragmentWeightRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentWeightRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_weight_record, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
