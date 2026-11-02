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
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityHealthCareSettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsItem itemCycleLength;

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsItem itemLast;

    @NonNull
    public final AbhSettingsItem itemOvulationReminder;

    @NonNull
    public final AbhSettingsItem itemPeriodLength;

    @NonNull
    public final AbhSettingsItem itemPeriodReminder;

    @NonNull
    public final AbhSettingsItem itemReminderTime;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityHealthCareSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsItem itemCycleLength, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsItem itemLast, @NonNull AbhSettingsItem itemOvulationReminder, @NonNull AbhSettingsItem itemPeriodLength, @NonNull AbhSettingsItem itemPeriodReminder, @NonNull AbhSettingsItem itemReminderTime, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemCycleLength = itemCycleLength;
        this.itemHeader = itemHeader;
        this.itemLast = itemLast;
        this.itemOvulationReminder = itemOvulationReminder;
        this.itemPeriodLength = itemPeriodLength;
        this.itemPeriodReminder = itemPeriodReminder;
        this.itemReminderTime = itemReminderTime;
        this.root = root;
    }

    @NonNull
    public static ActivityHealthCareSettingsBinding bind(@NonNull View rootView) {
        int i = R.id.item_cycle_length;
        AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_cycle_length);
        if (abhSettingsItem != null) {
            i = R.id.item_header;
            AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
            if (abhSettingsHeader != null) {
                i = R.id.item_last;
                AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_last);
                if (abhSettingsItem2 != null) {
                    i = R.id.item_ovulation_reminder;
                    AbhSettingsItem abhSettingsItem3 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_ovulation_reminder);
                    if (abhSettingsItem3 != null) {
                        i = R.id.item_period_length;
                        AbhSettingsItem abhSettingsItem4 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_period_length);
                        if (abhSettingsItem4 != null) {
                            i = R.id.item_period_reminder;
                            AbhSettingsItem abhSettingsItem5 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_period_reminder);
                            if (abhSettingsItem5 != null) {
                                i = R.id.item_reminder_time;
                                AbhSettingsItem abhSettingsItem6 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_reminder_time);
                                if (abhSettingsItem6 != null) {
                                    LinearLayout linearLayout = (LinearLayout) rootView;
                                    return new ActivityHealthCareSettingsBinding(linearLayout, abhSettingsItem, abhSettingsHeader, abhSettingsItem2, abhSettingsItem3, abhSettingsItem4, abhSettingsItem5, abhSettingsItem6, linearLayout);
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
    public static ActivityHealthCareSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHealthCareSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_health_care_settings, parent, false);
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
