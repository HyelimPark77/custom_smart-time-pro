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
        int r1 = R.id.awakeValue;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.awakeValue);
        if (r5 == null) goto L63;
        r1 = R.id.barChart;
        BarChart r6 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (r6 == null) goto L63;
        r1 = R.id.beforeTime;
        ImageButton r7 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r7 == null) goto L63;
        r1 = R.id.dataContent;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r8 == null) goto L63;
        r1 = R.id.deepValue;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.deepValue);
        if (r9 == null) goto L63;
        r1 = R.id.fl_time_x;
        ConstraintLayout r10 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.fl_time_x);
        if (r10 == null) goto L63;
        r1 = R.id.flexboxLayout;
        FlexboxLayout r11 = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.flexboxLayout);
        if (r11 == null) goto L63;
        r1 = R.id.lightValue;
        DINCondBold r12 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.lightValue);
        if (r12 == null) goto L63;
        r1 = R.id.ll_info_piecemeal;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_info_piecemeal);
        if (r13 == null) goto L63;
        r1 = R.id.ll_info_rem;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_info_rem);
        if (r14 == null) goto L63;
        r1 = R.id.ll_piecemeal;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_piecemeal);
        if (r15 == null) goto L63;
        r1 = R.id.loading;
        RelativeLayout r16 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r16 == null) goto L63;
        r1 = R.id.nextTime;
        ImageButton r17 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r17 == null) goto L63;
        r1 = R.id.nowTime;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r18 == null) goto L63;
        r1 = R.id.nowTimeDetails;
        DINCondBold r19 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r19 == null) goto L63;
        r1 = R.id.nowValue;
        DINCondBold r20 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r20 == null) goto L63;
        r1 = R.id.piecemealValue;
        DINCondBold r21 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.piecemealValue);
        if (r21 == null) goto L63;
        r1 = R.id.remValue;
        DINCondBold r22 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.remValue);
        if (r22 == null) goto L63;
        r1 = R.id.rv_piecemeal;
        RecyclerView r23 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_piecemeal);
        if (r23 == null) goto L63;
        r1 = R.id.scrollView;
        NestedScrollView r24 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r24 == null) goto L63;
        r1 = R.id.sleepEndTime;
        TextView r25 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepEndTime);
        if (r25 == null) goto L63;
        r1 = R.id.sleepStartTime;
        TextView r26 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime);
        if (r26 == null) goto L63;
        r1 = R.id.sleepStartTime1;
        TextView r27 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime1);
        if (r27 == null) goto L63;
        r1 = R.id.sleepStartTime2;
        TextView r28 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime2);
        if (r28 == null) goto L63;
        r1 = R.id.sleepStartTime3;
        TextView r29 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime3);
        if (r29 == null) goto L63;
        r1 = R.id.tv_piecemeal_avg;
        PFMedium r30 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_piecemeal_avg);
        if (r30 == null) goto L63;
        r1 = R.id.tv_piecemeal_count;
        PFMedium r31 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_piecemeal_count);
        if (r31 == null) goto L63;
        r1 = R.id.tv_total_piecemeal_time;
        PFMedium r32 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_piecemeal_time);
        if (r32 == null) goto L63;
        r1 = R.id.valueUnit;
        PFMedium r33 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r33 == null) goto L63;
        return new FragmentStatusSleepAllDayBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);
    L63:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusSleepAllDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusSleepAllDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_sleep_all_day, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
