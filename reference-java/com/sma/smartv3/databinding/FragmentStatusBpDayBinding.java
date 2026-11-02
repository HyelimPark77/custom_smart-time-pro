package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusBpDayBinding implements ViewBinding {

    @NonNull
    public final BarChart barChart;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final Button btnCalibration;

    @NonNull
    public final LinearLayout calibrationPanel;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final DINCondBold dbpAvgValue;

    @NonNull
    public final DINCondBold dbpValue;

    @NonNull
    public final ImageView image;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final View measureView;

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
    public final DINCondBold sbpAvgValue;

    @NonNull
    public final DINCondBold sbpValue;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFRegular tvHigh;

    @NonNull
    public final PFRegular tvLow;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusBpDayBinding(@NonNull LinearLayout rootView, @NonNull BarChart barChart, @NonNull ImageButton beforeTime, @NonNull Button btnCalibration, @NonNull LinearLayout calibrationPanel, @NonNull LinearLayout dataContent, @NonNull DINCondBold dbpAvgValue, @NonNull DINCondBold dbpValue, @NonNull ImageView image, @NonNull RelativeLayout loading, @NonNull View measureView, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull DINCondBold sbpAvgValue, @NonNull DINCondBold sbpValue, @NonNull NestedScrollView scrollView, @NonNull PFRegular tvHigh, @NonNull PFRegular tvLow, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.btnCalibration = btnCalibration;
        this.calibrationPanel = calibrationPanel;
        this.dataContent = dataContent;
        this.dbpAvgValue = dbpAvgValue;
        this.dbpValue = dbpValue;
        this.image = image;
        this.loading = loading;
        this.measureView = measureView;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.sbpAvgValue = sbpAvgValue;
        this.sbpValue = sbpValue;
        this.scrollView = scrollView;
        this.tvHigh = tvHigh;
        this.tvLow = tvLow;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusBpDayBinding bind(@NonNull View rootView) {
        int i = R.id.barChart;
        BarChart barChart = (BarChart) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (barChart != null) {
            i = R.id.beforeTime;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
            if (imageButton != null) {
                i = R.id.btn_calibration;
                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_calibration);
                if (button != null) {
                    i = R.id.calibration_panel;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.calibration_panel);
                    if (linearLayout != null) {
                        i = R.id.dataContent;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
                        if (linearLayout2 != null) {
                            i = R.id.dbpAvgValue;
                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dbpAvgValue);
                            if (dINCondBold != null) {
                                i = R.id.dbpValue;
                                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dbpValue);
                                if (dINCondBold2 != null) {
                                    i = R.id.image;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                                    if (imageView != null) {
                                        i = R.id.loading;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                                        if (relativeLayout != null) {
                                            i = R.id.measure_view;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.measure_view);
                                            if (viewFindChildViewById != null) {
                                                i = R.id.nextTime;
                                                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                                                if (imageButton2 != null) {
                                                    i = R.id.nowTime;
                                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                                                    if (pFMedium != null) {
                                                        i = R.id.nowTimeDetails;
                                                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                                        if (dINCondBold3 != null) {
                                                            i = R.id.nowValue;
                                                            DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                                            if (dINCondBold4 != null) {
                                                                i = R.id.sbpAvgValue;
                                                                DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sbpAvgValue);
                                                                if (dINCondBold5 != null) {
                                                                    i = R.id.sbpValue;
                                                                    DINCondBold dINCondBold6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sbpValue);
                                                                    if (dINCondBold6 != null) {
                                                                        i = R.id.scrollView;
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                                        if (nestedScrollView != null) {
                                                                            i = R.id.tv_high;
                                                                            PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tv_high);
                                                                            if (pFRegular != null) {
                                                                                i = R.id.tv_low;
                                                                                PFRegular pFRegular2 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tv_low);
                                                                                if (pFRegular2 != null) {
                                                                                    i = R.id.valueUnit;
                                                                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                                    if (pFMedium2 != null) {
                                                                                        return new FragmentStatusBpDayBinding((LinearLayout) rootView, barChart, imageButton, button, linearLayout, linearLayout2, dINCondBold, dINCondBold2, imageView, relativeLayout, viewFindChildViewById, imageButton2, pFMedium, dINCondBold3, dINCondBold4, dINCondBold5, dINCondBold6, nestedScrollView, pFRegular, pFRegular2, pFMedium2);
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
    public static FragmentStatusBpDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusBpDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_bp_day, parent, false);
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
