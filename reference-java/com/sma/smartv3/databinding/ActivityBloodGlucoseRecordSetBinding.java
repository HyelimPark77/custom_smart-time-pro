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
        int i = R.id.item_calendar;
        AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_calendar);
        if (abhSettingsItem != null) {
            i = R.id.item_end_date;
            AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_end_date);
            if (abhSettingsItem2 != null) {
                i = R.id.item_start_date;
                AbhSettingsItem abhSettingsItem3 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_start_date);
                if (abhSettingsItem3 != null) {
                    LinearLayout linearLayout = (LinearLayout) rootView;
                    return new ActivityBloodGlucoseRecordSetBinding(linearLayout, abhSettingsItem, abhSettingsItem2, abhSettingsItem3, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBloodGlucoseRecordSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityBloodGlucoseRecordSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_blood_glucose_record_set, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
