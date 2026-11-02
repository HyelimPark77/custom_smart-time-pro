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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomBarChartView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusPressureDayBinding implements ViewBinding {

    @NonNull
    public final PFMedium avTV;

    @NonNull
    public final DINCondBold aveValue;

    @NonNull
    public final CustomBarChartView barChart;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

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
    public final PFMedium twoTV;

    @NonNull
    public final PFMedium twoUnit;

    @NonNull
    public final DINCondBold twoValue;

    private FragmentStatusPressureDayBinding(@NonNull LinearLayout rootView, @NonNull PFMedium avTV, @NonNull DINCondBold aveValue, @NonNull CustomBarChartView barChart, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull PFMedium twoTV, @NonNull PFMedium twoUnit, @NonNull DINCondBold twoValue) {
        this.rootView = rootView;
        this.avTV = avTV;
        this.aveValue = aveValue;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.twoTV = twoTV;
        this.twoUnit = twoUnit;
        this.twoValue = twoValue;
    }

    @NonNull
    public static FragmentStatusPressureDayBinding bind(@NonNull View rootView) {
        int i = R.id.avTV;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avTV);
        if (pFMedium != null) {
            i = R.id.aveValue;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.aveValue);
            if (dINCondBold != null) {
                i = R.id.barChart;
                CustomBarChartView customBarChartView = (CustomBarChartView) ViewBindings.findChildViewById(rootView, R.id.barChart);
                if (customBarChartView != null) {
                    i = R.id.beforeTime;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
                    if (imageButton != null) {
                        i = R.id.dataContent;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
                        if (linearLayout != null) {
                            i = R.id.image;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                            if (imageView != null) {
                                i = R.id.loading;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                                if (relativeLayout != null) {
                                    i = R.id.nextTime;
                                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                                    if (imageButton2 != null) {
                                        i = R.id.nowTime;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                                        if (pFMedium2 != null) {
                                            i = R.id.nowTimeDetails;
                                            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                            if (dINCondBold2 != null) {
                                                i = R.id.nowValue;
                                                DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                                if (dINCondBold3 != null) {
                                                    i = R.id.scrollView;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                    if (nestedScrollView != null) {
                                                        i = R.id.twoTV;
                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoTV);
                                                        if (pFMedium3 != null) {
                                                            i = R.id.twoUnit;
                                                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoUnit);
                                                            if (pFMedium4 != null) {
                                                                i = R.id.twoValue;
                                                                DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.twoValue);
                                                                if (dINCondBold4 != null) {
                                                                    return new FragmentStatusPressureDayBinding((LinearLayout) rootView, pFMedium, dINCondBold, customBarChartView, imageButton, linearLayout, imageView, relativeLayout, imageButton2, pFMedium2, dINCondBold2, dINCondBold3, nestedScrollView, pFMedium3, pFMedium4, dINCondBold4);
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
    public static FragmentStatusPressureDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusPressureDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_pressure_day, parent, false);
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
