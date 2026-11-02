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
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.sportRecordAP;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAP);
        if (dINCondBold != null) {
            i = R.id.sportRecordAPRl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAPRl);
            if (relativeLayout != null) {
                i = R.id.sportRecordAltitude;
                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAltitude);
                if (dINCondBold2 != null) {
                    i = R.id.sportRecordAltitudeRl;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAltitudeRl);
                    if (relativeLayout2 != null) {
                        i = R.id.sportRecordAltitudeUnit;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordAltitudeUnit);
                        if (pFMedium != null) {
                            i = R.id.sportRecordCD;
                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCD);
                            if (dINCondBold3 != null) {
                                i = R.id.sportRecordCDRl;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCDRl);
                                if (relativeLayout3 != null) {
                                    i = R.id.sportRecordCDUnit;
                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordCDUnit);
                                    if (pFMedium2 != null) {
                                        i = R.id.sportRecordCR;
                                        DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCR);
                                        if (dINCondBold4 != null) {
                                            i = R.id.sportRecordCRRl;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCRRl);
                                            if (relativeLayout4 != null) {
                                                i = R.id.sportRecordCRUnit;
                                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordCRUnit);
                                                if (pFMedium3 != null) {
                                                    return new StatusItemSportRecordAltitudeBinding(linearLayout, linearLayout, dINCondBold, relativeLayout, dINCondBold2, relativeLayout2, pFMedium, dINCondBold3, relativeLayout3, pFMedium2, dINCondBold4, relativeLayout4, pFMedium3);
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
    public static StatusItemSportRecordAltitudeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSportRecordAltitudeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sport_record_altitude, parent, false);
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
