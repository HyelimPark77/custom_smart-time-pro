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
        int r0 = R.id.barChart;
        CustomBarChartView r4 = (CustomBarChartView) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (r4 == null) goto L27;
        r0 = R.id.beforeTime;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r5 == null) goto L27;
        r0 = R.id.dataContent;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r6 == null) goto L27;
        r0 = R.id.loading;
        RelativeLayout r7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r7 == null) goto L27;
        r0 = R.id.nextTime;
        ImageButton r8 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r8 == null) goto L27;
        r0 = R.id.nowTime;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r9 == null) goto L27;
        r0 = R.id.nowTimeDetails;
        DINCondBold r10 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r10 == null) goto L27;
        r0 = R.id.nowValue;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r11 == null) goto L27;
        r0 = R.id.scrollView;
        NestedScrollView r12 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r12 == null) goto L27;
        r0 = R.id.segmentedbar;
        VerticalSegmentedBarView r13 = (VerticalSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.segmentedbar);
        if (r13 == null) goto L27;
        r0 = R.id.valueUnit;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r14 == null) goto L27;
        return new FragmentStatusBloodGlucose2MonthBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentStatusBloodGlucose2MonthBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusBloodGlucose2MonthBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_blood_glucose2_month, parent, false);
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
