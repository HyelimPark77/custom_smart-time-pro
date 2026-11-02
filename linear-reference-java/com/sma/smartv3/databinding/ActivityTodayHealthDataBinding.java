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
        int r1 = R.id.ac_today_health_data_calorie;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_calorie);
        if (r5 == null) goto L29;
        r1 = R.id.ac_today_health_data_distance;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_distance);
        if (r6 == null) goto L29;
        r1 = R.id.ac_today_health_data_distanceUnit;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_distanceUnit);
        if (r7 == null) goto L29;
        r1 = R.id.ac_today_health_data_sleep;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_sleep);
        if (r8 == null) goto L29;
        r1 = R.id.ac_today_health_data_steps;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.ac_today_health_data_steps);
        if (r9 == null) goto L29;
        r1 = R.id.iv_calories;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_calories);
        if (r10 == null) goto L29;
        r1 = R.id.iv_distance;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_distance);
        if (r11 == null) goto L29;
        r1 = R.id.llCalories;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
        if (r12 == null) goto L29;
        r1 = R.id.llDistance;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
        if (r13 == null) goto L29;
        r1 = R.id.llSleep;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSleep);
        if (r14 == null) goto L29;
        r1 = R.id.llStep;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llStep);
        if (r15 == null) goto L29;
        r1 = R.id.status_item_today_health_data;
        RecyclerView r16 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.status_item_today_health_data);
        if (r16 == null) goto L29;
        return new ActivityTodayHealthDataBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityTodayHealthDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityTodayHealthDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_today_health_data, parent, false);
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
