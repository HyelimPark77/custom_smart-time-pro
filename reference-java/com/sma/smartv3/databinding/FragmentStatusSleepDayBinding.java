package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusSleepDayBinding implements ViewBinding {

    @NonNull
    public final DINCondBold awakeValue;

    @NonNull
    public final BarChart barChart;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final DINCondBold deepValue;

    @NonNull
    public final ImageView image;

    @NonNull
    public final DINCondBold lightValue;

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
    public final TextView sleepEndTime;

    @NonNull
    public final TextView sleepStartTime;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusSleepDayBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold awakeValue, @NonNull BarChart barChart, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull DINCondBold deepValue, @NonNull ImageView image, @NonNull DINCondBold lightValue, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull TextView sleepEndTime, @NonNull TextView sleepStartTime, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.awakeValue = awakeValue;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.deepValue = deepValue;
        this.image = image;
        this.lightValue = lightValue;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.sleepEndTime = sleepEndTime;
        this.sleepStartTime = sleepStartTime;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusSleepDayBinding bind(@NonNull View rootView) {
        int i = R.id.awakeValue;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.awakeValue);
        if (dINCondBold != null) {
            i = R.id.barChart;
            BarChart barChart = (BarChart) ViewBindings.findChildViewById(rootView, R.id.barChart);
            if (barChart != null) {
                i = R.id.beforeTime;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
                if (imageButton != null) {
                    i = R.id.dataContent;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
                    if (linearLayout != null) {
                        i = R.id.deepValue;
                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.deepValue);
                        if (dINCondBold2 != null) {
                            i = R.id.image;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                            if (imageView != null) {
                                i = R.id.lightValue;
                                DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.lightValue);
                                if (dINCondBold3 != null) {
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
                                                DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                                if (dINCondBold4 != null) {
                                                    i = R.id.nowValue;
                                                    DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                                    if (dINCondBold5 != null) {
                                                        i = R.id.scrollView;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                        if (nestedScrollView != null) {
                                                            i = R.id.sleepEndTime;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepEndTime);
                                                            if (textView != null) {
                                                                i = R.id.sleepStartTime;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime);
                                                                if (textView2 != null) {
                                                                    i = R.id.valueUnit;
                                                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                    if (pFMedium2 != null) {
                                                                        return new FragmentStatusSleepDayBinding((LinearLayout) rootView, dINCondBold, barChart, imageButton, linearLayout, dINCondBold2, imageView, dINCondBold3, relativeLayout, imageButton2, pFMedium, dINCondBold4, dINCondBold5, nestedScrollView, textView, textView2, pFMedium2);
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
    public static FragmentStatusSleepDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusSleepDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_sleep_day, parent, false);
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
