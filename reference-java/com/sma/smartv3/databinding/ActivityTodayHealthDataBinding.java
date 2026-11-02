package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTodayHealthDataBinding implements ViewBinding {

    @NonNull
    public final DINCondBold acTodayHealthDataCalorie;

    @NonNull
    public final DINCondBold acTodayHealthDataDistance;

    @NonNull
    public final PFMedium acTodayHealthDataDistanceUnit;

    @NonNull
    public final DINCondBold acTodayHealthDataSleep;

    @NonNull
    public final DINCondBold acTodayHealthDataSteps;

    @NonNull
    public final ImageView ivCalories;

    @NonNull
    public final ImageView ivDistance;

    @NonNull
    public final LinearLayout llCalories;

    @NonNull
    public final LinearLayout llDistance;

    @NonNull
    public final LinearLayout llSleep;

    @NonNull
    public final LinearLayout llStep;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView statusItemTodayHealthData;

    private ActivityTodayHealthDataBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold acTodayHealthDataCalorie, @NonNull DINCondBold acTodayHealthDataDistance, @NonNull PFMedium acTodayHealthDataDistanceUnit, @NonNull DINCondBold acTodayHealthDataSleep, @NonNull DINCondBold acTodayHealthDataSteps, @NonNull ImageView ivCalories, @NonNull ImageView ivDistance, @NonNull LinearLayout llCalories, @NonNull LinearLayout llDistance, @NonNull LinearLayout llSleep, @NonNull LinearLayout llStep, @NonNull RecyclerView statusItemTodayHealthData) {
        this.rootView = rootView;
        this.acTodayHealthDataCalorie = acTodayHealthDataCalorie;
        this.acTodayHealthDataDistance = acTodayHealthDataDistance;
        this.acTodayHealthDataDistanceUnit = acTodayHealthDataDistanceUnit;
        this.acTodayHealthDataSleep = acTodayHealthDataSleep;
        this.acTodayHealthDataSteps = acTodayHealthDataSteps;
        this.ivCalories = ivCalories;
        this.ivDistance = ivDistance;
        this.llCalories = llCalories;
        this.llDistance = llDistance;
        this.llSleep = llSleep;
        this.llStep = llStep;
        this.statusItemTodayHealthData = statusItemTodayHealthData;
    }

    @NonNull
    public static ActivityTodayHealthDataBinding bind(@NonNull View rootView) {
        int i = R.id.ac_today_health_data_calorie;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_calorie);
        if (dINCondBold != null) {
            i = R.id.ac_today_health_data_distance;
            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_distance);
            if (dINCondBold2 != null) {
                i = R.id.ac_today_health_data_distanceUnit;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_distanceUnit);
                if (pFMedium != null) {
                    i = R.id.ac_today_health_data_sleep;
                    DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_sleep);
                    if (dINCondBold3 != null) {
                        i = R.id.ac_today_health_data_steps;
                        DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_steps);
                        if (dINCondBold4 != null) {
                            i = R.id.iv_calories;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_calories);
                            if (imageView != null) {
                                i = R.id.iv_distance;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_distance);
                                if (imageView2 != null) {
                                    i = R.id.llCalories;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
                                    if (linearLayout != null) {
                                        i = R.id.llDistance;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
                                        if (linearLayout2 != null) {
                                            i = R.id.llSleep;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSleep);
                                            if (linearLayout3 != null) {
                                                i = R.id.llStep;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llStep);
                                                if (linearLayout4 != null) {
                                                    i = R.id.status_item_today_health_data;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.status_item_today_health_data);
                                                    if (recyclerView != null) {
                                                        return new ActivityTodayHealthDataBinding((LinearLayout) rootView, dINCondBold, dINCondBold2, pFMedium, dINCondBold3, dINCondBold4, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, recyclerView);
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
    public static ActivityTodayHealthDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTodayHealthDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_today_health_data, parent, false);
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
