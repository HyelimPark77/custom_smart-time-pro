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
        int r1 = R.id.sportName;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
        if (r5 == null) goto L35;
        r1 = R.id.sportRecordCadence;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCadence);
        if (r6 == null) goto L35;
        r1 = R.id.sportRecordCadenceLl;
        RelativeLayout r7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCadenceLl);
        if (r7 == null) goto L35;
        r1 = R.id.sportRecordCalories;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCalories);
        if (r8 == null) goto L35;
        r1 = R.id.sportRecordCaloriesLl;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCaloriesLl);
        if (r9 == null) goto L35;
        r1 = R.id.sportRecordDistance;
        DINCondBold r10 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistance);
        if (r10 == null) goto L35;
        r1 = R.id.sportRecordDistanceLl;
        RelativeLayout r11 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistanceLl);
        if (r11 == null) goto L35;
        r1 = R.id.sportRecordDistanceUnit;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistanceUnit);
        if (r12 == null) goto L35;
        r1 = R.id.sportRecordPauseTime;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordPauseTime);
        if (r13 == null) goto L35;
        r1 = R.id.sportRecordPauseTimeLl;
        RelativeLayout r14 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordPauseTimeLl);
        if (r14 == null) goto L35;
        r1 = R.id.sportRecordStep;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStep);
        if (r15 == null) goto L35;
        r1 = R.id.sportRecordStepLl;
        RelativeLayout r16 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStepLl);
        if (r16 == null) goto L35;
        r1 = R.id.sportSourceIv;
        ImageView r17 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportSourceIv);
        if (r17 == null) goto L35;
        r1 = R.id.sportStartTime;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
        if (r18 == null) goto L35;
        r1 = R.id.sportTime;
        DINCondBold r19 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportTime);
        if (r19 == null) goto L35;
        return new StatusItemSportRecordActivityBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
    L35:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static StatusItemSportRecordActivityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSportRecordActivityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sport_record_activity, parent, false);
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
