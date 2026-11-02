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
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusDayBinding implements ViewBinding {

    @NonNull
    public final BarChart barChart;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final View healthBtnView;

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
    public final PFMedium twoTV;

    @NonNull
    public final PFMedium twoUnit;

    @NonNull
    public final DINCondBold twoValue;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusDayBinding(@NonNull LinearLayout rootView, @NonNull BarChart barChart, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull View healthBtnView, @NonNull ImageView image, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull PFMedium oneTV, @NonNull PFMedium oneUnit, @NonNull DINCondBold oneValue, @NonNull NestedScrollView scrollView, @NonNull PFMedium twoTV, @NonNull PFMedium twoUnit, @NonNull DINCondBold twoValue, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.healthBtnView = healthBtnView;
        this.image = image;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.oneTV = oneTV;
        this.oneUnit = oneUnit;
        this.oneValue = oneValue;
        this.scrollView = scrollView;
        this.twoTV = twoTV;
        this.twoUnit = twoUnit;
        this.twoValue = twoValue;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusDayBinding bind(@NonNull View rootView) {
        int r1 = R.id.barChart;
        BarChart r5 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (r5 == null) goto L41;
        r1 = R.id.beforeTime;
        ImageButton r6 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r6 == null) goto L41;
        r1 = R.id.dataContent;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r7 == null) goto L41;
        r1 = R.id.health_btn_view;
        View r8 = ViewBindings.findChildViewById(rootView, R.id.health_btn_view);
        if (r8 == null) goto L41;
        r1 = R.id.image;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r9 == null) goto L41;
        r1 = R.id.loading;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r10 == null) goto L41;
        r1 = R.id.nextTime;
        ImageButton r11 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r11 == null) goto L41;
        r1 = R.id.nowTime;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r12 == null) goto L41;
        r1 = R.id.nowTimeDetails;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r13 == null) goto L41;
        r1 = R.id.nowValue;
        DINCondBold r14 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r14 == null) goto L41;
        r1 = R.id.oneTV;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.oneTV);
        if (r15 == null) goto L41;
        r1 = R.id.oneUnit;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.oneUnit);
        if (r16 == null) goto L41;
        r1 = R.id.oneValue;
        DINCondBold r17 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.oneValue);
        if (r17 == null) goto L41;
        r1 = R.id.scrollView;
        NestedScrollView r18 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r18 == null) goto L41;
        r1 = R.id.twoTV;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoTV);
        if (r19 == null) goto L41;
        r1 = R.id.twoUnit;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoUnit);
        if (r20 == null) goto L41;
        r1 = R.id.twoValue;
        DINCondBold r21 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.twoValue);
        if (r21 == null) goto L41;
        r1 = R.id.valueUnit;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r22 == null) goto L41;
        return new FragmentStatusDayBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    L41:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_day, parent, false);
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
