package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBloodGlucoseRecordSetBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsItem itemCalendar;

    @NonNull
    public final AbhSettingsItem itemEndDate;

    @NonNull
    public final AbhSettingsItem itemStartDate;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityBloodGlucoseRecordSetBinding(@NonNull LinearLayout rootView_, @NonNull AbhSettingsItem itemCalendar, @NonNull AbhSettingsItem itemEndDate, @NonNull AbhSettingsItem itemStartDate, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.itemCalendar = itemCalendar;
        this.itemEndDate = itemEndDate;
        this.itemStartDate = itemStartDate;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityBloodGlucoseRecordSetBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_calendar;
        AbhSettingsItem r4 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_calendar);
        if (r4 == null) goto L11;
        r0 = R.id.item_end_date;
        AbhSettingsItem r5 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_end_date);
        if (r5 == null) goto L11;
        r0 = R.id.item_start_date;
        AbhSettingsItem r6 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_start_date);
        if (r6 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityBloodGlucoseRecordSetBinding(r3, r4, r5, r6, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityBloodGlucoseRecordSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityBloodGlucoseRecordSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_blood_glucose_record_set, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
