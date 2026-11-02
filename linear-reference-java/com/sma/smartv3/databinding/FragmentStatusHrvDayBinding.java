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
        int r1 = R.id.beforeTime;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r5 == null) goto L41;
        r1 = R.id.dataContent;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r6 == null) goto L41;
        r1 = R.id.image;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r7 == null) goto L41;
        r1 = R.id.lineChart;
        LineChart r8 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
        if (r8 == null) goto L41;
        r1 = R.id.ll_hrv_info;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hrv_info);
        if (r9 == null) goto L41;
        r1 = R.id.loading;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r10 == null) goto L41;
        r1 = R.id.maxUnit;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxUnit);
        if (r11 == null) goto L41;
        r1 = R.id.maxValue;
        DINCondBold r12 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.maxValue);
        if (r12 == null) goto L41;
        r1 = R.id.maxValueTV;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxValueTV);
        if (r13 == null) goto L41;
        r1 = R.id.minHrTV;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minHrTV);
        if (r14 == null) goto L41;
        r1 = R.id.minUnit;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minUnit);
        if (r15 == null) goto L41;
        r1 = R.id.minValue;
        DINCondBold r16 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.minValue);
        if (r16 == null) goto L41;
        r1 = R.id.nextTime;
        ImageButton r17 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r17 == null) goto L41;
        r1 = R.id.nowTime;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r18 == null) goto L41;
        r1 = R.id.nowTimeDetails;
        DINCondBold r19 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r19 == null) goto L41;
        r1 = R.id.nowValue;
        DINCondBold r20 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r20 == null) goto L41;
        r1 = R.id.scrollView;
        NestedScrollView r21 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r21 == null) goto L41;
        r1 = R.id.valueUnit;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r22 == null) goto L41;
        return new FragmentStatusHrvDayBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    L41:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusHrvDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusHrvDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_hrv_day, parent, false);
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
