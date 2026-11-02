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
        int i = R.id.activityDataLl;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.activityDataLl);
        if (linearLayout != null) {
            i = R.id.bottomView;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottomView);
            if (viewFindChildViewById != null) {
                i = R.id.downloadGpxIb;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
                if (imageButton != null) {
                    i = R.id.ivAvatar;
                    ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.ivAvatar);
                    if (imageViewRound != null) {
                        i = R.id.mapPbRl;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.mapPbRl);
                        if (relativeLayout != null) {
                            i = R.id.mapViewFrameLayout;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mapViewFrameLayout);
                            if (frameLayout != null) {
                                i = R.id.nestedScrollView;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.nestedScrollView);
                                if (nestedScrollView != null) {
                                    i = R.id.nickName;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nickName);
                                    if (pFMedium != null) {
                                        i = R.id.otherDataLl;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.otherDataLl);
                                        if (linearLayout2 != null) {
                                            RelativeLayout relativeLayout2 = (RelativeLayout) rootView;
                                            i = R.id.sportName;
                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
                                            if (pFMedium2 != null) {
                                                i = R.id.sportRecordCadence;
                                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCadence);
                                                if (dINCondBold != null) {
                                                    i = R.id.sportRecordCadenceLl;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCadenceLl);
                                                    if (relativeLayout3 != null) {
                                                        i = R.id.sportRecordCalories;
                                                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordCalories);
                                                        if (dINCondBold2 != null) {
                                                            i = R.id.sportRecordCaloriesLl;
                                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordCaloriesLl);
                                                            if (relativeLayout4 != null) {
                                                                i = R.id.sportRecordDistance;
                                                                DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistance);
                                                                if (dINCondBold3 != null) {
                                                                    i = R.id.sportRecordDistanceLl;
                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistanceLl);
                                                                    if (relativeLayout5 != null) {
                                                                        i = R.id.sportRecordDistanceUnit;
                                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecordDistanceUnit);
                                                                        if (pFMedium3 != null) {
                                                                            i = R.id.sportRecordPauseTime;
                                                                            DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordPauseTime);
                                                                            if (dINCondBold4 != null) {
                                                                                i = R.id.sportRecordPauseTimeLl;
                                                                                RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordPauseTimeLl);
                                                                                if (relativeLayout6 != null) {
                                                                                    i = R.id.sportRecordStep;
                                                                                    DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStep);
                                                                                    if (dINCondBold5 != null) {
                                                                                        i = R.id.sportRecordStepLl;
                                                                                        RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStepLl);
                                                                                        if (relativeLayout7 != null) {
                                                                                            i = R.id.sportSourceIv;
                                                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportSourceIv);
                                                                                            if (imageView != null) {
                                                                                                i = R.id.sportStartTime;
                                                                                                DINCondBold dINCondBold6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
                                                                                                if (dINCondBold6 != null) {
                                                                                                    i = R.id.sportTime;
                                                                                                    DINCondBold dINCondBold7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportTime);
                                                                                                    if (dINCondBold7 != null) {
                                                                                                        return new ActivitySportRecordsDetailBinding(relativeLayout2, linearLayout, viewFindChildViewById, imageButton, imageViewRound, relativeLayout, frameLayout, nestedScrollView, pFMedium, linearLayout2, relativeLayout2, pFMedium2, dINCondBold, relativeLayout3, dINCondBold2, relativeLayout4, dINCondBold3, relativeLayout5, pFMedium3, dINCondBold4, relativeLayout6, dINCondBold5, relativeLayout7, imageView, dINCondBold6, dINCondBold7);
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
    public static ActivitySportRecordsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySportRecordsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sport_records_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
