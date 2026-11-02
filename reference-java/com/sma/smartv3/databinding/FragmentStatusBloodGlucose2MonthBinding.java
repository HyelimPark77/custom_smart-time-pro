package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomBarChartView;
import com.sma.smartv3.view.segmentedbar.VerticalSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusBloodGlucose2MonthBinding implements ViewBinding {

    @NonNull
    public final CustomBarChartView barChart;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

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
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final VerticalSegmentedBarView segmentedbar;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusBloodGlucose2MonthBinding(@NonNull LinearLayout rootView, @NonNull CustomBarChartView barChart, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull VerticalSegmentedBarView segmentedbar, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.segmentedbar = segmentedbar;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusBloodGlucose2MonthBinding bind(@NonNull View rootView) {
        int i = R.id.barChart;
        CustomBarChartView customBarChartView = (CustomBarChartView) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (customBarChartView != null) {
            i = R.id.beforeTime;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
            if (imageButton != null) {
                i = R.id.dataContent;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
                if (linearLayout != null) {
                    i = R.id.loading;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                    if (relativeLayout != null) {
                        i = R.id.nextTime;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                        if (imageButton2 != null) {
                            i = R.id.nowTime;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                            if (pFMedium != null) {
                                i = R.id.nowTimeDetails;
                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                if (dINCondBold != null) {
                                    i = R.id.nowValue;
                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                    if (dINCondBold2 != null) {
                                        i = R.id.scrollView;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                        if (nestedScrollView != null) {
                                            i = R.id.segmentedbar;
                                            VerticalSegmentedBarView verticalSegmentedBarView = (VerticalSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.segmentedbar);
                                            if (verticalSegmentedBarView != null) {
                                                i = R.id.valueUnit;
                                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                if (pFMedium2 != null) {
                                                    return new FragmentStatusBloodGlucose2MonthBinding((LinearLayout) rootView, customBarChartView, imageButton, linearLayout, relativeLayout, imageButton2, pFMedium, dINCondBold, dINCondBold2, nestedScrollView, verticalSegmentedBarView, pFMedium2);
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
    public static FragmentStatusBloodGlucose2MonthBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusBloodGlucose2MonthBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_blood_glucose2_month, parent, false);
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
