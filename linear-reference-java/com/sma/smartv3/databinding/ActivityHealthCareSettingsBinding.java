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
        int r0 = R.id.item_cycle_length;
        AbhSettingsItem r4 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_cycle_length);
        if (r4 == null) goto L19;
        r0 = R.id.item_header;
        AbhSettingsHeader r5 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (r5 == null) goto L19;
        r0 = R.id.item_last;
        AbhSettingsItem r6 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_last);
        if (r6 == null) goto L19;
        r0 = R.id.item_ovulation_reminder;
        AbhSettingsItem r7 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_ovulation_reminder);
        if (r7 == null) goto L19;
        r0 = R.id.item_period_length;
        AbhSettingsItem r8 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_period_length);
        if (r8 == null) goto L19;
        r0 = R.id.item_period_reminder;
        AbhSettingsItem r9 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_period_reminder);
        if (r9 == null) goto L19;
        r0 = R.id.item_reminder_time;
        AbhSettingsItem r10 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_reminder_time);
        if (r10 == null) goto L19;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityHealthCareSettingsBinding(r3, r4, r5, r6, r7, r8, r9, r10, r3);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityHealthCareSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityHealthCareSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_health_care_settings, parent, false);
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
