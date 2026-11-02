package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.flexbox.FlexboxLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusSleepAllDayBinding implements ViewBinding {

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
    public final ConstraintLayout flTimeX;

    @NonNull
    public final FlexboxLayout flexboxLayout;

    @NonNull
    public final DINCondBold lightValue;

    @NonNull
    public final LinearLayout llInfoPiecemeal;

    @NonNull
    public final LinearLayout llInfoRem;

    @NonNull
    public final LinearLayout llPiecemeal;

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
    public final DINCondBold piecemealValue;

    @NonNull
    public final DINCondBold remValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvPiecemeal;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final TextView sleepEndTime;

    @NonNull
    public final TextView sleepStartTime;

    @NonNull
    public final TextView sleepStartTime1;

    @NonNull
    public final TextView sleepStartTime2;

    @NonNull
    public final TextView sleepStartTime3;

    @NonNull
    public final PFMedium tvPiecemealAvg;

    @NonNull
    public final PFMedium tvPiecemealCount;

    @NonNull
    public final PFMedium tvTotalPiecemealTime;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusSleepAllDayBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold awakeValue, @NonNull BarChart barChart, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull DINCondBold deepValue, @NonNull ConstraintLayout flTimeX, @NonNull FlexboxLayout flexboxLayout, @NonNull DINCondBold lightValue, @NonNull LinearLayout llInfoPiecemeal, @NonNull LinearLayout llInfoRem, @NonNull LinearLayout llPiecemeal, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull DINCondBold piecemealValue, @NonNull DINCondBold remValue, @NonNull RecyclerView rvPiecemeal, @NonNull NestedScrollView scrollView, @NonNull TextView sleepEndTime, @NonNull TextView sleepStartTime, @NonNull TextView sleepStartTime1, @NonNull TextView sleepStartTime2, @NonNull TextView sleepStartTime3, @NonNull PFMedium tvPiecemealAvg, @NonNull PFMedium tvPiecemealCount, @NonNull PFMedium tvTotalPiecemealTime, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.awakeValue = awakeValue;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.deepValue = deepValue;
        this.flTimeX = flTimeX;
        this.flexboxLayout = flexboxLayout;
        this.lightValue = lightValue;
        this.llInfoPiecemeal = llInfoPiecemeal;
        this.llInfoRem = llInfoRem;
        this.llPiecemeal = llPiecemeal;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.piecemealValue = piecemealValue;
        this.remValue = remValue;
        this.rvPiecemeal = rvPiecemeal;
        this.scrollView = scrollView;
        this.sleepEndTime = sleepEndTime;
        this.sleepStartTime = sleepStartTime;
        this.sleepStartTime1 = sleepStartTime1;
        this.sleepStartTime2 = sleepStartTime2;
        this.sleepStartTime3 = sleepStartTime3;
        this.tvPiecemealAvg = tvPiecemealAvg;
        this.tvPiecemealCount = tvPiecemealCount;
        this.tvTotalPiecemealTime = tvTotalPiecemealTime;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusSleepAllDayBinding bind(@NonNull View rootView) {
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
                            i = R.id.fl_time_x;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.fl_time_x);
                            if (constraintLayout != null) {
                                i = R.id.flexboxLayout;
                                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.flexboxLayout);
                                if (flexboxLayout != null) {
                                    i = R.id.lightValue;
                                    DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.lightValue);
                                    if (dINCondBold3 != null) {
                                        i = R.id.ll_info_piecemeal;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_info_piecemeal);
                                        if (linearLayout2 != null) {
                                            i = R.id.ll_info_rem;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_info_rem);
                                            if (linearLayout3 != null) {
                                                i = R.id.ll_piecemeal;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_piecemeal);
                                                if (linearLayout4 != null) {
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
                                                                        i = R.id.piecemealValue;
                                                                        DINCondBold dINCondBold6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.piecemealValue);
                                                                        if (dINCondBold6 != null) {
                                                                            i = R.id.remValue;
                                                                            DINCondBold dINCondBold7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.remValue);
                                                                            if (dINCondBold7 != null) {
                                                                                i = R.id.rv_piecemeal;
                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_piecemeal);
                                                                                if (recyclerView != null) {
                                                                                    i = R.id.scrollView;
                                                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                                                    if (nestedScrollView != null) {
                                                                                        i = R.id.sleepEndTime;
                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepEndTime);
                                                                                        if (textView != null) {
                                                                                            i = R.id.sleepStartTime;
                                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime);
                                                                                            if (textView2 != null) {
                                                                                                i = R.id.sleepStartTime1;
                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime1);
                                                                                                if (textView3 != null) {
                                                                                                    i = R.id.sleepStartTime2;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime2);
                                                                                                    if (textView4 != null) {
                                                                                                        i = R.id.sleepStartTime3;
                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime3);
                                                                                                        if (textView5 != null) {
                                                                                                            i = R.id.tv_piecemeal_avg;
                                                                                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_piecemeal_avg);
                                                                                                            if (pFMedium2 != null) {
                                                                                                                i = R.id.tv_piecemeal_count;
                                                                                                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_piecemeal_count);
                                                                                                                if (pFMedium3 != null) {
                                                                                                                    i = R.id.tv_total_piecemeal_time;
                                                                                                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_piecemeal_time);
                                                                                                                    if (pFMedium4 != null) {
                                                                                                                        i = R.id.valueUnit;
                                                                                                                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                                                                        if (pFMedium5 != null) {
                                                                                                                            return new FragmentStatusSleepAllDayBinding((LinearLayout) rootView, dINCondBold, barChart, imageButton, linearLayout, dINCondBold2, constraintLayout, flexboxLayout, dINCondBold3, linearLayout2, linearLayout3, linearLayout4, relativeLayout, imageButton2, pFMedium, dINCondBold4, dINCondBold5, dINCondBold6, dINCondBold7, recyclerView, nestedScrollView, textView, textView2, textView3, textView4, textView5, pFMedium2, pFMedium3, pFMedium4, pFMedium5);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentStatusSleepAllDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusSleepAllDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_sleep_all_day, parent, false);
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
