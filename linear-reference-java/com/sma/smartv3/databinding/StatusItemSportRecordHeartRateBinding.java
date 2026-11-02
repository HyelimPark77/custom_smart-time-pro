package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemSportRecordHeartRateBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout rootViewHeartRate;

    @NonNull
    public final DINCondBold sportRecordAerobic;

    @NonNull
    public final RelativeLayout sportRecordAerobicRl;

    @NonNull
    public final DINCondBold sportRecordAnaerobic;

    @NonNull
    public final RelativeLayout sportRecordAnaerobicRl;

    @NonNull
    public final DINCondBold sportRecordAvgHR;

    @NonNull
    public final RelativeLayout sportRecordAvgHRRl;

    @NonNull
    public final DINCondBold sportRecordFatBurning;

    @NonNull
    public final RelativeLayout sportRecordFatBurningRl;

    @NonNull
    public final LineChart sportRecordLineChartHR;

    @NonNull
    public final RelativeLayout sportRecordLineChartHRRl;

    @NonNull
    public final DINCondBold sportRecordMaxHR;

    @NonNull
    public final RelativeLayout sportRecordMaxHRRl;

    @NonNull
    public final DINCondBold sportRecordStrenuous;

    @NonNull
    public final RelativeLayout sportRecordStrenuousRl;

    @NonNull
    public final DINCondBold sportRecordWarmUp;

    @NonNull
    public final RelativeLayout sportRecordWarmUpRl;

    private StatusItemSportRecordHeartRateBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout rootViewHeartRate, @NonNull DINCondBold sportRecordAerobic, @NonNull RelativeLayout sportRecordAerobicRl, @NonNull DINCondBold sportRecordAnaerobic, @NonNull RelativeLayout sportRecordAnaerobicRl, @NonNull DINCondBold sportRecordAvgHR, @NonNull RelativeLayout sportRecordAvgHRRl, @NonNull DINCondBold sportRecordFatBurning, @NonNull RelativeLayout sportRecordFatBurningRl, @NonNull LineChart sportRecordLineChartHR, @NonNull RelativeLayout sportRecordLineChartHRRl, @NonNull DINCondBold sportRecordMaxHR, @NonNull RelativeLayout sportRecordMaxHRRl, @NonNull DINCondBold sportRecordStrenuous, @NonNull RelativeLayout sportRecordStrenuousRl, @NonNull DINCondBold sportRecordWarmUp, @NonNull RelativeLayout sportRecordWarmUpRl) {
        this.rootView = rootView;
        this.rootViewHeartRate = rootViewHeartRate;
        this.sportRecordAerobic = sportRecordAerobic;
        this.sportRecordAerobicRl = sportRecordAerobicRl;
        this.sportRecordAnaerobic = sportRecordAnaerobic;
        this.sportRecordAnaerobicRl = sportRecordAnaerobicRl;
        this.sportRecordAvgHR = sportRecordAvgHR;
        this.sportRecordAvgHRRl = sportRecordAvgHRRl;
        this.sportRecordFatBurning = sportRecordFatBurning;
        this.sportRecordFatBurningRl = sportRecordFatBurningRl;
        this.sportRecordLineChartHR = sportRecordLineChartHR;
        this.sportRecordLineChartHRRl = sportRecordLineChartHRRl;
        this.sportRecordMaxHR = sportRecordMaxHR;
        this.sportRecordMaxHRRl = sportRecordMaxHRRl;
        this.sportRecordStrenuous = sportRecordStrenuous;
        this.sportRecordStrenuousRl = sportRecordStrenuousRl;
        this.sportRecordWarmUp = sportRecordWarmUp;
        this.sportRecordWarmUpRl = sportRecordWarmUpRl;
    }

    @NonNull
    public static StatusItemSportRecordHeartRateBinding bind(@NonNull View rootView) {
        LinearLayout r1 = (LinearLayout) rootView;
        int r2 = R.id.sportRecordAerobic;
        DINCondBold r3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobic);
        if (r3 == null) goto L37;
        r2 = R.id.sportRecordAerobicRl;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobicRl);
        if (r4 == null) goto L37;
        r2 = R.id.sportRecordAnaerobic;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobic);
        if (r5 == null) goto L37;
        r2 = R.id.sportRecordAnaerobicRl;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobicRl);
        if (r6 == null) goto L37;
        r2 = R.id.sportRecordAvgHR;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgHR);
        if (r7 == null) goto L37;
        r2 = R.id.sportRecordAvgHRRl;
        RelativeLayout r8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgHRRl);
        if (r8 == null) goto L37;
        r2 = R.id.sportRecordFatBurning;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurning);
        if (r9 == null) goto L37;
        r2 = R.id.sportRecordFatBurningRl;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurningRl);
        if (r10 == null) goto L37;
        r2 = R.id.sportRecordLineChartHR;
        LineChart r11 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.sportRecordLineChartHR);
        if (r11 == null) goto L37;
        r2 = R.id.sportRecordLineChartHRRl;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordLineChartHRRl);
        if (r12 == null) goto L37;
        r2 = R.id.sportRecordMaxHR;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordMaxHR);
        if (r13 == null) goto L37;
        r2 = R.id.sportRecordMaxHRRl;
        RelativeLayout r14 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordMaxHRRl);
        if (r14 == null) goto L37;
        r2 = R.id.sportRecordStrenuous;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuous);
        if (r15 == null) goto L37;
        r2 = R.id.sportRecordStrenuousRl;
        RelativeLayout r16 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuousRl);
        if (r16 == null) goto L37;
        r2 = R.id.sportRecordWarmUp;
        DINCondBold r17 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUp);
        if (r17 == null) goto L37;
        r2 = R.id.sportRecordWarmUpRl;
        RelativeLayout r18 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUpRl);
        if (r18 == null) goto L37;
        return new StatusItemSportRecordHeartRateBinding(r1, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
    L37:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r2)));
    }

    @NonNull
    public static StatusItemSportRecordHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSportRecordHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sport_record_heart_rate, parent, false);
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
