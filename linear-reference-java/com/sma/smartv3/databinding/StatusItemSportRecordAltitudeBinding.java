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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemSportRecordAltitudeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout rootViewAltitude;

    @NonNull
    public final DINCondBold sportRecordAP;

    @NonNull
    public final RelativeLayout sportRecordAPRl;

    @NonNull
    public final DINCondBold sportRecordAltitude;

    @NonNull
    public final RelativeLayout sportRecordAltitudeRl;

    @NonNull
    public final PFMedium sportRecordAltitudeUnit;

    @NonNull
    public final DINCondBold sportRecordCD;

    @NonNull
    public final RelativeLayout sportRecordCDRl;

    @NonNull
    public final PFMedium sportRecordCDUnit;

    @NonNull
    public final DINCondBold sportRecordCR;

    @NonNull
    public final RelativeLayout sportRecordCRRl;

    @NonNull
    public final PFMedium sportRecordCRUnit;

    private StatusItemSportRecordAltitudeBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout rootViewAltitude, @NonNull DINCondBold sportRecordAP, @NonNull RelativeLayout sportRecordAPRl, @NonNull DINCondBold sportRecordAltitude, @NonNull RelativeLayout sportRecordAltitudeRl, @NonNull PFMedium sportRecordAltitudeUnit, @NonNull DINCondBold sportRecordCD, @NonNull RelativeLayout sportRecordCDRl, @NonNull PFMedium sportRecordCDUnit, @NonNull DINCondBold sportRecordCR, @NonNull RelativeLayout sportRecordCRRl, @NonNull PFMedium sportRecordCRUnit) {
        this.rootView = rootView;
        this.rootViewAltitude = rootViewAltitude;
        this.sportRecordAP = sportRecordAP;
        this.sportRecordAPRl = sportRecordAPRl;
        this.sportRecordAltitude = sportRecordAltitude;
        this.sportRecordAltitudeRl = sportRecordAltitudeRl;
        this.sportRecordAltitudeUnit = sportRecordAltitudeUnit;
        this.sportRecordCD = sportRecordCD;
        this.sportRecordCDRl = sportRecordCDRl;
        this.sportRecordCDUnit = sportRecordCDUnit;
        this.sportRecordCR = sportRecordCR;
        this.sportRecordCRRl = sportRecordCRRl;
        this.sportRecordCRUnit = sportRecordCRUnit;
    }

    @NonNull
    public static StatusItemSportRecordAltitudeBinding bind(@NonNull View rootView) {
        LinearLayout r1 = (LinearLayout) rootView;
        int r0 = R.id.sportRecordAP;
        DINCondBold r3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAP);
        if (r3 == null) goto L27;
        r0 = R.id.sportRecordAPRl;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAPRl);
        if (r4 == null) goto L27;
        r0 = R.id.sportRecordAltitude;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAltitude);
        if (r5 == null) goto L27;
        r0 = R.id.sportRecordAltitudeRl;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAltitudeRl);
        if (r6 == null) goto L27;
        r0 = R.id.sportRecordAltitudeUnit;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordAltitudeUnit);
        if (r7 == null) goto L27;
        r0 = R.id.sportRecordCD;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCD);
        if (r8 == null) goto L27;
        r0 = R.id.sportRecordCDRl;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCDRl);
        if (r9 == null) goto L27;
        r0 = R.id.sportRecordCDUnit;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordCDUnit);
        if (r10 == null) goto L27;
        r0 = R.id.sportRecordCR;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCR);
        if (r11 == null) goto L27;
        r0 = R.id.sportRecordCRRl;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCRRl);
        if (r12 == null) goto L27;
        r0 = R.id.sportRecordCRUnit;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordCRUnit);
        if (r13 == null) goto L27;
        return new StatusItemSportRecordAltitudeBinding(r1, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemSportRecordAltitudeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSportRecordAltitudeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sport_record_altitude, parent, false);
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
