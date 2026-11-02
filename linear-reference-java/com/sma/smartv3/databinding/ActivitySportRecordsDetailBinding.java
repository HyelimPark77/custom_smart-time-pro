package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySportRecordsDetailBinding implements ViewBinding {

    @NonNull
    public final LinearLayout activityDataLl;

    @NonNull
    public final View bottomView;

    @NonNull
    public final ImageButton downloadGpxIb;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final RelativeLayout mapPbRl;

    @NonNull
    public final FrameLayout mapViewFrameLayout;

    @NonNull
    public final NestedScrollView nestedScrollView;

    @NonNull
    public final PFMedium nickName;

    @NonNull
    public final LinearLayout otherDataLl;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

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

    private ActivitySportRecordsDetailBinding(@NonNull RelativeLayout rootView_, @NonNull LinearLayout activityDataLl, @NonNull View bottomView, @NonNull ImageButton downloadGpxIb, @NonNull ImageViewRound ivAvatar, @NonNull RelativeLayout mapPbRl, @NonNull FrameLayout mapViewFrameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull PFMedium nickName, @NonNull LinearLayout otherDataLl, @NonNull RelativeLayout rootView, @NonNull PFMedium sportName, @NonNull DINCondBold sportRecordCadence, @NonNull RelativeLayout sportRecordCadenceLl, @NonNull DINCondBold sportRecordCalories, @NonNull RelativeLayout sportRecordCaloriesLl, @NonNull DINCondBold sportRecordDistance, @NonNull RelativeLayout sportRecordDistanceLl, @NonNull PFMedium sportRecordDistanceUnit, @NonNull DINCondBold sportRecordPauseTime, @NonNull RelativeLayout sportRecordPauseTimeLl, @NonNull DINCondBold sportRecordStep, @NonNull RelativeLayout sportRecordStepLl, @NonNull ImageView sportSourceIv, @NonNull DINCondBold sportStartTime, @NonNull DINCondBold sportTime) {
        this.rootView_ = rootView_;
        this.activityDataLl = activityDataLl;
        this.bottomView = bottomView;
        this.downloadGpxIb = downloadGpxIb;
        this.ivAvatar = ivAvatar;
        this.mapPbRl = mapPbRl;
        this.mapViewFrameLayout = mapViewFrameLayout;
        this.nestedScrollView = nestedScrollView;
        this.nickName = nickName;
        this.otherDataLl = otherDataLl;
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
    public static ActivitySportRecordsDetailBinding bind(@NonNull View rootView) {
        int r1 = R.id.activityDataLl;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.activityDataLl);
        if (r5 == null) goto L53;
        r1 = R.id.bottomView;
        View r6 = ViewBindings.findChildViewById(rootView, R.id.bottomView);
        if (r6 == null) goto L53;
        r1 = R.id.downloadGpxIb;
        ImageButton r7 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
        if (r7 == null) goto L53;
        r1 = R.id.ivAvatar;
        ImageViewRound r8 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.ivAvatar);
        if (r8 == null) goto L53;
        r1 = R.id.mapPbRl;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.mapPbRl);
        if (r9 == null) goto L53;
        r1 = R.id.mapViewFrameLayout;
        FrameLayout r10 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mapViewFrameLayout);
        if (r10 == null) goto L53;
        r1 = R.id.nestedScrollView;
        NestedScrollView r11 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.nestedScrollView);
        if (r11 == null) goto L53;
        r1 = R.id.nickName;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nickName);
        if (r12 == null) goto L53;
        r1 = R.id.otherDataLl;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.otherDataLl);
        if (r13 == null) goto L53;
        RelativeLayout r4 = (RelativeLayout) rootView;
        r1 = R.id.sportName;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
        if (r15 == null) goto L53;
        r1 = R.id.sportRecordCadence;
        DINCondBold r16 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCadence);
        if (r16 == null) goto L53;
        r1 = R.id.sportRecordCadenceLl;
        RelativeLayout r17 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCadenceLl);
        if (r17 == null) goto L53;
        r1 = R.id.sportRecordCalories;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCalories);
        if (r18 == null) goto L53;
        r1 = R.id.sportRecordCaloriesLl;
        RelativeLayout r19 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCaloriesLl);
        if (r19 == null) goto L53;
        r1 = R.id.sportRecordDistance;
        DINCondBold r20 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistance);
        if (r20 == null) goto L53;
        r1 = R.id.sportRecordDistanceLl;
        RelativeLayout r21 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistanceLl);
        if (r21 == null) goto L53;
        r1 = R.id.sportRecordDistanceUnit;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistanceUnit);
        if (r22 == null) goto L53;
        r1 = R.id.sportRecordPauseTime;
        DINCondBold r23 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordPauseTime);
        if (r23 == null) goto L53;
        r1 = R.id.sportRecordPauseTimeLl;
        RelativeLayout r24 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordPauseTimeLl);
        if (r24 == null) goto L53;
        r1 = R.id.sportRecordStep;
        DINCondBold r25 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStep);
        if (r25 == null) goto L53;
        r1 = R.id.sportRecordStepLl;
        RelativeLayout r26 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStepLl);
        if (r26 == null) goto L53;
        r1 = R.id.sportSourceIv;
        ImageView r27 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportSourceIv);
        if (r27 == null) goto L53;
        r1 = R.id.sportStartTime;
        DINCondBold r28 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
        if (r28 == null) goto L53;
        r1 = R.id.sportTime;
        DINCondBold r29 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportTime);
        if (r29 == null) goto L53;
        return new ActivitySportRecordsDetailBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r4, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
    L53:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivitySportRecordsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySportRecordsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sport_records_detail, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
