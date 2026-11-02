package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class StatusItemSportRecordActivityBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium sportName;

    @NonNull
    public final DINCondBold sportRecordCadence;

    @NonNull
    public final RelativeLayout sportRecordCadenceLl;

    @NonNull
    public final DINCondBold sportRecordCalories;

    @NonNull
    public final RelativeLayout sportRecordCaloriesLl;

    @NonNull
    public final DINCondBold sportRecordDistance;

    @NonNull
    public final RelativeLayout sportRecordDistanceLl;

    @NonNull
    public final PFMedium sportRecordDistanceUnit;

    @NonNull
    public final DINCondBold sportRecordPauseTime;

    @NonNull
    public final RelativeLayout sportRecordPauseTimeLl;

    @NonNull
    public final DINCondBold sportRecordStep;

    @NonNull
    public final RelativeLayout sportRecordStepLl;

    @NonNull
    public final ImageView sportSourceIv;

    @NonNull
    public final DINCondBold sportStartTime;

    @NonNull
    public final DINCondBold sportTime;

    private StatusItemSportRecordActivityBinding(@NonNull LinearLayout rootView, @NonNull PFMedium sportName, @NonNull DINCondBold sportRecordCadence, @NonNull RelativeLayout sportRecordCadenceLl, @NonNull DINCondBold sportRecordCalories, @NonNull RelativeLayout sportRecordCaloriesLl, @NonNull DINCondBold sportRecordDistance, @NonNull RelativeLayout sportRecordDistanceLl, @NonNull PFMedium sportRecordDistanceUnit, @NonNull DINCondBold sportRecordPauseTime, @NonNull RelativeLayout sportRecordPauseTimeLl, @NonNull DINCondBold sportRecordStep, @NonNull RelativeLayout sportRecordStepLl, @NonNull ImageView sportSourceIv, @NonNull DINCondBold sportStartTime, @NonNull DINCondBold sportTime) {
        this.rootView = rootView;
        this.sportName = sportName;
        this.sportRecordCadence = sportRecordCadence;
        this.sportRecordCadenceLl = sportRecordCadenceLl;
        this.sportRecordCalories = sportRecordCalories;
        this.sportRecordCaloriesLl = sportRecordCaloriesLl;
        this.sportRecordDistance = sportRecordDistance;
        this.sportRecordDistanceLl = sportRecordDistanceLl;
        this.sportRecordDistanceUnit = sportRecordDistanceUnit;
        this.sportRecordPauseTime = sportRecordPauseTime;
        this.sportRecordPauseTimeLl = sportRecordPauseTimeLl;
        this.sportRecordStep = sportRecordStep;
        this.sportRecordStepLl = sportRecordStepLl;
        this.sportSourceIv = sportSourceIv;
        this.sportStartTime = sportStartTime;
        this.sportTime = sportTime;
    }

    @NonNull
    public static StatusItemSportRecordActivityBinding bind(@NonNull View rootView) {
        int i = R.id.sportName;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
        if (pFMedium != null) {
            i = R.id.sportRecordCadence;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCadence);
            if (dINCondBold != null) {
                i = R.id.sportRecordCadenceLl;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCadenceLl);
                if (relativeLayout != null) {
                    i = R.id.sportRecordCalories;
                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCalories);
                    if (dINCondBold2 != null) {
                        i = R.id.sportRecordCaloriesLl;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCaloriesLl);
                        if (relativeLayout2 != null) {
                            i = R.id.sportRecordDistance;
                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistance);
                            if (dINCondBold3 != null) {
                                i = R.id.sportRecordDistanceLl;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistanceLl);
                                if (relativeLayout3 != null) {
                                    i = R.id.sportRecordDistanceUnit;
                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistanceUnit);
                                    if (pFMedium2 != null) {
                                        i = R.id.sportRecordPauseTime;
                                        DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordPauseTime);
                                        if (dINCondBold4 != null) {
                                            i = R.id.sportRecordPauseTimeLl;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordPauseTimeLl);
                                            if (relativeLayout4 != null) {
                                                i = R.id.sportRecordStep;
                                                DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStep);
                                                if (dINCondBold5 != null) {
                                                    i = R.id.sportRecordStepLl;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStepLl);
                                                    if (relativeLayout5 != null) {
                                                        i = R.id.sportSourceIv;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportSourceIv);
                                                        if (imageView != null) {
                                                            i = R.id.sportStartTime;
                                                            DINCondBold dINCondBold6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
                                                            if (dINCondBold6 != null) {
                                                                i = R.id.sportTime;
                                                                DINCondBold dINCondBold7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportTime);
                                                                if (dINCondBold7 != null) {
                                                                    return new StatusItemSportRecordActivityBinding((LinearLayout) rootView, pFMedium, dINCondBold, relativeLayout, dINCondBold2, relativeLayout2, dINCondBold3, relativeLayout3, pFMedium2, dINCondBold4, relativeLayout4, dINCondBold5, relativeLayout5, imageView, dINCondBold6, dINCondBold7);
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
    public static StatusItemSportRecordActivityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSportRecordActivityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sport_record_activity, parent, false);
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
