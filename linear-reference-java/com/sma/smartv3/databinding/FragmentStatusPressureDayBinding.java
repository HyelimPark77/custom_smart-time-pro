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
        int r1 = R.id.avTV;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avTV);
        if (r5 == null) goto L35;
        r1 = R.id.aveValue;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.aveValue);
        if (r6 == null) goto L35;
        r1 = R.id.barChart;
        CustomBarChartView r7 = (CustomBarChartView) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (r7 == null) goto L35;
        r1 = R.id.beforeTime;
        ImageButton r8 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r8 == null) goto L35;
        r1 = R.id.dataContent;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r9 == null) goto L35;
        r1 = R.id.image;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r10 == null) goto L35;
        r1 = R.id.loading;
        RelativeLayout r11 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r11 == null) goto L35;
        r1 = R.id.nextTime;
        ImageButton r12 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r12 == null) goto L35;
        r1 = R.id.nowTime;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r13 == null) goto L35;
        r1 = R.id.nowTimeDetails;
        DINCondBold r14 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r14 == null) goto L35;
        r1 = R.id.nowValue;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r15 == null) goto L35;
        r1 = R.id.scrollView;
        NestedScrollView r16 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r16 == null) goto L35;
        r1 = R.id.twoTV;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoTV);
        if (r17 == null) goto L35;
        r1 = R.id.twoUnit;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoUnit);
        if (r18 == null) goto L35;
        r1 = R.id.twoValue;
        DINCondBold r19 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.twoValue);
        if (r19 == null) goto L35;
        return new FragmentStatusPressureDayBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
    L35:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusPressureDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusPressureDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_pressure_day, parent, false);
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
