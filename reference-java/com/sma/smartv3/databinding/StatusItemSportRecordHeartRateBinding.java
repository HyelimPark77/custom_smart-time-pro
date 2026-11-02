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
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.sportRecordAerobic;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobic);
        if (dINCondBold != null) {
            i = R.id.sportRecordAerobicRl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobicRl);
            if (relativeLayout != null) {
                i = R.id.sportRecordAnaerobic;
                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobic);
                if (dINCondBold2 != null) {
                    i = R.id.sportRecordAnaerobicRl;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobicRl);
                    if (relativeLayout2 != null) {
                        i = R.id.sportRecordAvgHR;
                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgHR);
                        if (dINCondBold3 != null) {
                            i = R.id.sportRecordAvgHRRl;
                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgHRRl);
                            if (relativeLayout3 != null) {
                                i = R.id.sportRecordFatBurning;
                                DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurning);
                                if (dINCondBold4 != null) {
                                    i = R.id.sportRecordFatBurningRl;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurningRl);
                                    if (relativeLayout4 != null) {
                                        i = R.id.sportRecordLineChartHR;
                                        LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.sportRecordLineChartHR);
                                        if (lineChart != null) {
                                            i = R.id.sportRecordLineChartHRRl;
                                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordLineChartHRRl);
                                            if (relativeLayout5 != null) {
                                                i = R.id.sportRecordMaxHR;
                                                DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordMaxHR);
                                                if (dINCondBold5 != null) {
                                                    i = R.id.sportRecordMaxHRRl;
                                                    RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordMaxHRRl);
                                                    if (relativeLayout6 != null) {
                                                        i = R.id.sportRecordStrenuous;
                                                        DINCondBold dINCondBold6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuous);
                                                        if (dINCondBold6 != null) {
                                                            i = R.id.sportRecordStrenuousRl;
                                                            RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuousRl);
                                                            if (relativeLayout7 != null) {
                                                                i = R.id.sportRecordWarmUp;
                                                                DINCondBold dINCondBold7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUp);
                                                                if (dINCondBold7 != null) {
                                                                    i = R.id.sportRecordWarmUpRl;
                                                                    RelativeLayout relativeLayout8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUpRl);
                                                                    if (relativeLayout8 != null) {
                                                                        return new StatusItemSportRecordHeartRateBinding(linearLayout, linearLayout, dINCondBold, relativeLayout, dINCondBold2, relativeLayout2, dINCondBold3, relativeLayout3, dINCondBold4, relativeLayout4, lineChart, relativeLayout5, dINCondBold5, relativeLayout6, dINCondBold6, relativeLayout7, dINCondBold7, relativeLayout8);
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
    public static StatusItemSportRecordHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSportRecordHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sport_record_heart_rate, parent, false);
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
