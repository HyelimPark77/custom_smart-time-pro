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
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusBloodGlucoseWeekBinding implements ViewBinding {

    @NonNull
    public final DINCondBold avValue;

    @NonNull
    public final PFMedium avValueTV;

    @NonNull
    public final PFMedium avValueUnit;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final LinearLayout llAvgValue;

    @NonNull
    public final LinearLayout llMaxValue;

    @NonNull
    public final LinearLayout llMinValue;

    @NonNull
    public final LinearLayout llMonitoringResultsValue;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final DINCondBold maxValue;

    @NonNull
    public final PFMedium maxValueTV;

    @NonNull
    public final PFMedium maxValueUnit;

    @NonNull
    public final DINCondBold minValue;

    @NonNull
    public final PFMedium minValueTV;

    @NonNull
    public final PFMedium minValueUnit;

    @NonNull
    public final DINCondBold monitoringResultsValue;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    public final DINCondBold nowTimeDetails;

    @NonNull
    public final DINCondBold nowValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusBloodGlucoseWeekBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold avValue, @NonNull PFMedium avValueTV, @NonNull PFMedium avValueUnit, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull LineChart lineChart, @NonNull LinearLayout llAvgValue, @NonNull LinearLayout llMaxValue, @NonNull LinearLayout llMinValue, @NonNull LinearLayout llMonitoringResultsValue, @NonNull RelativeLayout loading, @NonNull DINCondBold maxValue, @NonNull PFMedium maxValueTV, @NonNull PFMedium maxValueUnit, @NonNull DINCondBold minValue, @NonNull PFMedium minValueTV, @NonNull PFMedium minValueUnit, @NonNull DINCondBold monitoringResultsValue, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.avValue = avValue;
        this.avValueTV = avValueTV;
        this.avValueUnit = avValueUnit;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.lineChart = lineChart;
        this.llAvgValue = llAvgValue;
        this.llMaxValue = llMaxValue;
        this.llMinValue = llMinValue;
        this.llMonitoringResultsValue = llMonitoringResultsValue;
        this.loading = loading;
        this.maxValue = maxValue;
        this.maxValueTV = maxValueTV;
        this.maxValueUnit = maxValueUnit;
        this.minValue = minValue;
        this.minValueTV = minValueTV;
        this.minValueUnit = minValueUnit;
        this.monitoringResultsValue = monitoringResultsValue;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusBloodGlucoseWeekBinding bind(@NonNull View rootView) {
        int i = R.id.avValue;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.avValue);
        if (dINCondBold != null) {
            i = R.id.avValueTV;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avValueTV);
            if (pFMedium != null) {
                i = R.id.avValueUnit;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avValueUnit);
                if (pFMedium2 != null) {
                    i = R.id.beforeTime;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
                    if (imageButton != null) {
                        i = R.id.dataContent;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
                        if (linearLayout != null) {
                            i = R.id.image;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                            if (imageView != null) {
                                i = R.id.lineChart;
                                LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
                                if (lineChart != null) {
                                    i = R.id.ll_avg_value;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_avg_value);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_max_value;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_max_value);
                                        if (linearLayout3 != null) {
                                            i = R.id.ll_min_value;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_min_value);
                                            if (linearLayout4 != null) {
                                                i = R.id.ll_monitoring_results_value;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_monitoring_results_value);
                                                if (linearLayout5 != null) {
                                                    i = R.id.loading;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                                                    if (relativeLayout != null) {
                                                        i = R.id.maxValue;
                                                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.maxValue);
                                                        if (dINCondBold2 != null) {
                                                            i = R.id.maxValueTV;
                                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxValueTV);
                                                            if (pFMedium3 != null) {
                                                                i = R.id.maxValueUnit;
                                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxValueUnit);
                                                                if (pFMedium4 != null) {
                                                                    i = R.id.minValue;
                                                                    DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.minValue);
                                                                    if (dINCondBold3 != null) {
                                                                        i = R.id.minValueTV;
                                                                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minValueTV);
                                                                        if (pFMedium5 != null) {
                                                                            i = R.id.minValueUnit;
                                                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minValueUnit);
                                                                            if (pFMedium6 != null) {
                                                                                i = R.id.monitoring_results_value;
                                                                                DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.monitoring_results_value);
                                                                                if (dINCondBold4 != null) {
                                                                                    i = R.id.nextTime;
                                                                                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                                                                                    if (imageButton2 != null) {
                                                                                        i = R.id.nowTime;
                                                                                        PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                                                                                        if (pFMedium7 != null) {
                                                                                            i = R.id.nowTimeDetails;
                                                                                            DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                                                                            if (dINCondBold5 != null) {
                                                                                                i = R.id.nowValue;
                                                                                                DINCondBold dINCondBold6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                                                                                if (dINCondBold6 != null) {
                                                                                                    i = R.id.scrollView;
                                                                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                                                                    if (nestedScrollView != null) {
                                                                                                        i = R.id.valueUnit;
                                                                                                        PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                                                        if (pFMedium8 != null) {
                                                                                                            return new FragmentStatusBloodGlucoseWeekBinding((LinearLayout) rootView, dINCondBold, pFMedium, pFMedium2, imageButton, linearLayout, imageView, lineChart, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout, dINCondBold2, pFMedium3, pFMedium4, dINCondBold3, pFMedium5, pFMedium6, dINCondBold4, imageButton2, pFMedium7, dINCondBold5, dINCondBold6, nestedScrollView, pFMedium8);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentStatusBloodGlucoseWeekBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusBloodGlucoseWeekBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_blood_glucose_week, parent, false);
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
