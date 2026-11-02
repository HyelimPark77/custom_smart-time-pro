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
public final class FragmentStatusHrvDayBinding implements ViewBinding {

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final LinearLayout llHrvInfo;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final PFMedium maxUnit;

    @NonNull
    public final DINCondBold maxValue;

    @NonNull
    public final PFMedium maxValueTV;

    @NonNull
    public final PFMedium minHrTV;

    @NonNull
    public final PFMedium minUnit;

    @NonNull
    public final DINCondBold minValue;

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

    private FragmentStatusHrvDayBinding(@NonNull LinearLayout rootView, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull LineChart lineChart, @NonNull LinearLayout llHrvInfo, @NonNull RelativeLayout loading, @NonNull PFMedium maxUnit, @NonNull DINCondBold maxValue, @NonNull PFMedium maxValueTV, @NonNull PFMedium minHrTV, @NonNull PFMedium minUnit, @NonNull DINCondBold minValue, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.lineChart = lineChart;
        this.llHrvInfo = llHrvInfo;
        this.loading = loading;
        this.maxUnit = maxUnit;
        this.maxValue = maxValue;
        this.maxValueTV = maxValueTV;
        this.minHrTV = minHrTV;
        this.minUnit = minUnit;
        this.minValue = minValue;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusHrvDayBinding bind(@NonNull View rootView) {
        int i = R.id.beforeTime;
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
                        i = R.id.ll_hrv_info;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hrv_info);
                        if (linearLayout2 != null) {
                            i = R.id.loading;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                            if (relativeLayout != null) {
                                i = R.id.maxUnit;
                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxUnit);
                                if (pFMedium != null) {
                                    i = R.id.maxValue;
                                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.maxValue);
                                    if (dINCondBold != null) {
                                        i = R.id.maxValueTV;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxValueTV);
                                        if (pFMedium2 != null) {
                                            i = R.id.minHrTV;
                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minHrTV);
                                            if (pFMedium3 != null) {
                                                i = R.id.minUnit;
                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minUnit);
                                                if (pFMedium4 != null) {
                                                    i = R.id.minValue;
                                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.minValue);
                                                    if (dINCondBold2 != null) {
                                                        i = R.id.nextTime;
                                                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                                                        if (imageButton2 != null) {
                                                            i = R.id.nowTime;
                                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                                                            if (pFMedium5 != null) {
                                                                i = R.id.nowTimeDetails;
                                                                DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                                                if (dINCondBold3 != null) {
                                                                    i = R.id.nowValue;
                                                                    DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                                                    if (dINCondBold4 != null) {
                                                                        i = R.id.scrollView;
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                                        if (nestedScrollView != null) {
                                                                            i = R.id.valueUnit;
                                                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                            if (pFMedium6 != null) {
                                                                                return new FragmentStatusHrvDayBinding((LinearLayout) rootView, imageButton, linearLayout, imageView, lineChart, linearLayout2, relativeLayout, pFMedium, dINCondBold, pFMedium2, pFMedium3, pFMedium4, dINCondBold2, imageButton2, pFMedium5, dINCondBold3, dINCondBold4, nestedScrollView, pFMedium6);
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
    public static FragmentStatusHrvDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusHrvDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_hrv_day, parent, false);
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
