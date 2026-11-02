package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemSportRecordSpeedBinding implements ViewBinding {

    @NonNull
    public final PFRegular pacePF;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout rootViewSpeed;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51191rv;

    @NonNull
    public final PFRegular speedPf;

    @NonNull
    public final DINCondBold sportRecordAvgPace;

    @NonNull
    public final RelativeLayout sportRecordAvgPaceRl;

    @NonNull
    public final PFMedium sportRecordAvgPaceUnit;

    @NonNull
    public final DINCondBold sportRecordAvgSpeed;

    @NonNull
    public final RelativeLayout sportRecordAvgSpeedRl;

    @NonNull
    public final PFMedium sportRecordAvgSpeedUnit;

    @NonNull
    public final DINCondBold sportRecordFastestPace;

    @NonNull
    public final RelativeLayout sportRecordFastestPaceRl;

    @NonNull
    public final PFMedium sportRecordFastestPaceUnit;

    @NonNull
    public final DINCondBold sportRecordFastestSpeed;

    @NonNull
    public final RelativeLayout sportRecordFastestSpeedRl;

    @NonNull
    public final PFMedium sportRecordFastestSpeedUnit;

    @NonNull
    public final LinearLayout sportRecordPaceChartRl;

    private StatusItemSportRecordSpeedBinding(@NonNull LinearLayout rootView, @NonNull PFRegular pacePF, @NonNull LinearLayout rootViewSpeed, @NonNull RecyclerView rv, @NonNull PFRegular speedPf, @NonNull DINCondBold sportRecordAvgPace, @NonNull RelativeLayout sportRecordAvgPaceRl, @NonNull PFMedium sportRecordAvgPaceUnit, @NonNull DINCondBold sportRecordAvgSpeed, @NonNull RelativeLayout sportRecordAvgSpeedRl, @NonNull PFMedium sportRecordAvgSpeedUnit, @NonNull DINCondBold sportRecordFastestPace, @NonNull RelativeLayout sportRecordFastestPaceRl, @NonNull PFMedium sportRecordFastestPaceUnit, @NonNull DINCondBold sportRecordFastestSpeed, @NonNull RelativeLayout sportRecordFastestSpeedRl, @NonNull PFMedium sportRecordFastestSpeedUnit, @NonNull LinearLayout sportRecordPaceChartRl) {
        this.rootView = rootView;
        this.pacePF = pacePF;
        this.rootViewSpeed = rootViewSpeed;
        this.f51191rv = rv;
        this.speedPf = speedPf;
        this.sportRecordAvgPace = sportRecordAvgPace;
        this.sportRecordAvgPaceRl = sportRecordAvgPaceRl;
        this.sportRecordAvgPaceUnit = sportRecordAvgPaceUnit;
        this.sportRecordAvgSpeed = sportRecordAvgSpeed;
        this.sportRecordAvgSpeedRl = sportRecordAvgSpeedRl;
        this.sportRecordAvgSpeedUnit = sportRecordAvgSpeedUnit;
        this.sportRecordFastestPace = sportRecordFastestPace;
        this.sportRecordFastestPaceRl = sportRecordFastestPaceRl;
        this.sportRecordFastestPaceUnit = sportRecordFastestPaceUnit;
        this.sportRecordFastestSpeed = sportRecordFastestSpeed;
        this.sportRecordFastestSpeedRl = sportRecordFastestSpeedRl;
        this.sportRecordFastestSpeedUnit = sportRecordFastestSpeedUnit;
        this.sportRecordPaceChartRl = sportRecordPaceChartRl;
    }

    @NonNull
    public static StatusItemSportRecordSpeedBinding bind(@NonNull View rootView) {
        int i = R.id.pacePF;
        PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.pacePF);
        if (pFRegular != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.f51422rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (recyclerView != null) {
                i = R.id.speedPf;
                PFRegular pFRegular2 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.speedPf);
                if (pFRegular2 != null) {
                    i = R.id.sportRecordAvgPace;
                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgPace);
                    if (dINCondBold != null) {
                        i = R.id.sportRecordAvgPaceRl;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgPaceRl);
                        if (relativeLayout != null) {
                            i = R.id.sportRecordAvgPaceUnit;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgPaceUnit);
                            if (pFMedium != null) {
                                i = R.id.sportRecordAvgSpeed;
                                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgSpeed);
                                if (dINCondBold2 != null) {
                                    i = R.id.sportRecordAvgSpeedRl;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgSpeedRl);
                                    if (relativeLayout2 != null) {
                                        i = R.id.sportRecordAvgSpeedUnit;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgSpeedUnit);
                                        if (pFMedium2 != null) {
                                            i = R.id.sportRecordFastestPace;
                                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestPace);
                                            if (dINCondBold3 != null) {
                                                i = R.id.sportRecordFastestPaceRl;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestPaceRl);
                                                if (relativeLayout3 != null) {
                                                    i = R.id.sportRecordFastestPaceUnit;
                                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestPaceUnit);
                                                    if (pFMedium3 != null) {
                                                        i = R.id.sportRecordFastestSpeed;
                                                        DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestSpeed);
                                                        if (dINCondBold4 != null) {
                                                            i = R.id.sportRecordFastestSpeedRl;
                                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestSpeedRl);
                                                            if (relativeLayout4 != null) {
                                                                i = R.id.sportRecordFastestSpeedUnit;
                                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestSpeedUnit);
                                                                if (pFMedium4 != null) {
                                                                    i = R.id.sportRecordPaceChartRl;
                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordPaceChartRl);
                                                                    if (linearLayout2 != null) {
                                                                        return new StatusItemSportRecordSpeedBinding(linearLayout, pFRegular, linearLayout, recyclerView, pFRegular2, dINCondBold, relativeLayout, pFMedium, dINCondBold2, relativeLayout2, pFMedium2, dINCondBold3, relativeLayout3, pFMedium3, dINCondBold4, relativeLayout4, pFMedium4, linearLayout2);
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
    public static StatusItemSportRecordSpeedBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSportRecordSpeedBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sport_record_speed, parent, false);
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
