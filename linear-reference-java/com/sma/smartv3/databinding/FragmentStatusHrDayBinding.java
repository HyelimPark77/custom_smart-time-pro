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
public final class FragmentStatusHrDayBinding implements ViewBinding {

    @NonNull
    public final PFMedium avHrTV;

    @NonNull
    public final PFMedium avHrUnit;

    @NonNull
    public final DINCondBold avHrValue;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final PFMedium maxHrTV;

    @NonNull
    public final PFMedium maxHrUnit;

    @NonNull
    public final DINCondBold maxHrValue;

    @NonNull
    public final PFMedium minHrTV;

    @NonNull
    public final PFMedium minHrUnit;

    @NonNull
    public final DINCondBold minHrValue;

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

    private FragmentStatusHrDayBinding(@NonNull LinearLayout rootView, @NonNull PFMedium avHrTV, @NonNull PFMedium avHrUnit, @NonNull DINCondBold avHrValue, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull LineChart lineChart, @NonNull RelativeLayout loading, @NonNull PFMedium maxHrTV, @NonNull PFMedium maxHrUnit, @NonNull DINCondBold maxHrValue, @NonNull PFMedium minHrTV, @NonNull PFMedium minHrUnit, @NonNull DINCondBold minHrValue, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.avHrTV = avHrTV;
        this.avHrUnit = avHrUnit;
        this.avHrValue = avHrValue;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.lineChart = lineChart;
        this.loading = loading;
        this.maxHrTV = maxHrTV;
        this.maxHrUnit = maxHrUnit;
        this.maxHrValue = maxHrValue;
        this.minHrTV = minHrTV;
        this.minHrUnit = minHrUnit;
        this.minHrValue = minHrValue;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusHrDayBinding bind(@NonNull View rootView) {
        int r1 = R.id.avHrTV;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avHrTV);
        if (r5 == null) goto L45;
        r1 = R.id.avHrUnit;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avHrUnit);
        if (r6 == null) goto L45;
        r1 = R.id.avHrValue;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.avHrValue);
        if (r7 == null) goto L45;
        r1 = R.id.beforeTime;
        ImageButton r8 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r8 == null) goto L45;
        r1 = R.id.dataContent;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r9 == null) goto L45;
        r1 = R.id.image;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r10 == null) goto L45;
        r1 = R.id.lineChart;
        LineChart r11 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
        if (r11 == null) goto L45;
        r1 = R.id.loading;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r12 == null) goto L45;
        r1 = R.id.maxHrTV;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxHrTV);
        if (r13 == null) goto L45;
        r1 = R.id.maxHrUnit;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxHrUnit);
        if (r14 == null) goto L45;
        r1 = R.id.maxHrValue;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.maxHrValue);
        if (r15 == null) goto L45;
        r1 = R.id.minHrTV;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minHrTV);
        if (r16 == null) goto L45;
        r1 = R.id.minHrUnit;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minHrUnit);
        if (r17 == null) goto L45;
        r1 = R.id.minHrValue;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.minHrValue);
        if (r18 == null) goto L45;
        r1 = R.id.nextTime;
        ImageButton r19 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r19 == null) goto L45;
        r1 = R.id.nowTime;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r20 == null) goto L45;
        r1 = R.id.nowTimeDetails;
        DINCondBold r21 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r21 == null) goto L45;
        r1 = R.id.nowValue;
        DINCondBold r22 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r22 == null) goto L45;
        r1 = R.id.scrollView;
        NestedScrollView r23 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r23 == null) goto L45;
        r1 = R.id.valueUnit;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r24 == null) goto L45;
        return new FragmentStatusHrDayBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    L45:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusHrDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusHrDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_hr_day, parent, false);
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
