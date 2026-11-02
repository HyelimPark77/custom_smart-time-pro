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

    @NonNull
    public final RecyclerView rv;

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
        this.rv = rv;
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
        int r1 = R.id.pacePF;
        PFRegular r5 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.pacePF);
        if (r5 == null) goto L37;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.rv;
        RecyclerView r7 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r7 == null) goto L37;
        r1 = R.id.speedPf;
        PFRegular r8 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.speedPf);
        if (r8 == null) goto L37;
        r1 = R.id.sportRecordAvgPace;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgPace);
        if (r9 == null) goto L37;
        r1 = R.id.sportRecordAvgPaceRl;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgPaceRl);
        if (r10 == null) goto L37;
        r1 = R.id.sportRecordAvgPaceUnit;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgPaceUnit);
        if (r11 == null) goto L37;
        r1 = R.id.sportRecordAvgSpeed;
        DINCondBold r12 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgSpeed);
        if (r12 == null) goto L37;
        r1 = R.id.sportRecordAvgSpeedRl;
        RelativeLayout r13 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgSpeedRl);
        if (r13 == null) goto L37;
        r1 = R.id.sportRecordAvgSpeedUnit;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordAvgSpeedUnit);
        if (r14 == null) goto L37;
        r1 = R.id.sportRecordFastestPace;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestPace);
        if (r15 == null) goto L37;
        r1 = R.id.sportRecordFastestPaceRl;
        RelativeLayout r16 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestPaceRl);
        if (r16 == null) goto L37;
        r1 = R.id.sportRecordFastestPaceUnit;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestPaceUnit);
        if (r17 == null) goto L37;
        r1 = R.id.sportRecordFastestSpeed;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestSpeed);
        if (r18 == null) goto L37;
        r1 = R.id.sportRecordFastestSpeedRl;
        RelativeLayout r19 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestSpeedRl);
        if (r19 == null) goto L37;
        r1 = R.id.sportRecordFastestSpeedUnit;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordFastestSpeedUnit);
        if (r20 == null) goto L37;
        r1 = R.id.sportRecordPaceChartRl;
        LinearLayout r21 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordPaceChartRl);
        if (r21 == null) goto L37;
        return new StatusItemSportRecordSpeedBinding(r4, r5, r4, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    L37:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static StatusItemSportRecordSpeedBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSportRecordSpeedBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sport_record_speed, parent, false);
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
