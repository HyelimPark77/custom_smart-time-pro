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
public final class FragmentStatusWeekV2Binding implements ViewBinding {

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
    public final LinearLayout oneLl;

    @NonNull
    public final PFMedium oneTV;

    @NonNull
    public final PFMedium oneUnit;

    @NonNull
    public final DINCondBold oneValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final DINCondBold stepV2CaloriesValue;

    @NonNull
    public final DINCondBold stepV2DistanceValue;

    @NonNull
    public final PFMedium twoTV;

    @NonNull
    public final PFMedium twoUnit;

    @NonNull
    public final DINCondBold twoValue;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusWeekV2Binding(@NonNull LinearLayout rootView, @NonNull CustomBarChartView barChart, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull LinearLayout oneLl, @NonNull PFMedium oneTV, @NonNull PFMedium oneUnit, @NonNull DINCondBold oneValue, @NonNull NestedScrollView scrollView, @NonNull DINCondBold stepV2CaloriesValue, @NonNull DINCondBold stepV2DistanceValue, @NonNull PFMedium twoTV, @NonNull PFMedium twoUnit, @NonNull DINCondBold twoValue, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.oneLl = oneLl;
        this.oneTV = oneTV;
        this.oneUnit = oneUnit;
        this.oneValue = oneValue;
        this.scrollView = scrollView;
        this.stepV2CaloriesValue = stepV2CaloriesValue;
        this.stepV2DistanceValue = stepV2DistanceValue;
        this.twoTV = twoTV;
        this.twoUnit = twoUnit;
        this.twoValue = twoValue;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusWeekV2Binding bind(@NonNull View rootView) {
        int i = R.id.barChart;
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
                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                                if (pFMedium != null) {
                                    i = R.id.nowTimeDetails;
                                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                    if (dINCondBold != null) {
                                        i = R.id.nowValue;
                                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                        if (dINCondBold2 != null) {
                                            i = R.id.oneLl;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.oneLl);
                                            if (linearLayout2 != null) {
                                                i = R.id.oneTV;
                                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.oneTV);
                                                if (pFMedium2 != null) {
                                                    i = R.id.oneUnit;
                                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.oneUnit);
                                                    if (pFMedium3 != null) {
                                                        i = R.id.oneValue;
                                                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.oneValue);
                                                        if (dINCondBold3 != null) {
                                                            i = R.id.scrollView;
                                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                            if (nestedScrollView != null) {
                                                                i = R.id.step_v2_calories_value;
                                                                DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.step_v2_calories_value);
                                                                if (dINCondBold4 != null) {
                                                                    i = R.id.step_v2_distance_value;
                                                                    DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.step_v2_distance_value);
                                                                    if (dINCondBold5 != null) {
                                                                        i = R.id.twoTV;
                                                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoTV);
                                                                        if (pFMedium4 != null) {
                                                                            i = R.id.twoUnit;
                                                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoUnit);
                                                                            if (pFMedium5 != null) {
                                                                                i = R.id.twoValue;
                                                                                DINCondBold dINCondBold6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.twoValue);
                                                                                if (dINCondBold6 != null) {
                                                                                    i = R.id.valueUnit;
                                                                                    PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                                    if (pFMedium6 != null) {
                                                                                        return new FragmentStatusWeekV2Binding((LinearLayout) rootView, customBarChartView, imageButton, linearLayout, imageView, relativeLayout, imageButton2, pFMedium, dINCondBold, dINCondBold2, linearLayout2, pFMedium2, pFMedium3, dINCondBold3, nestedScrollView, dINCondBold4, dINCondBold5, pFMedium4, pFMedium5, dINCondBold6, pFMedium6);
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
    public static FragmentStatusWeekV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusWeekV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_week_v2, parent, false);
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
