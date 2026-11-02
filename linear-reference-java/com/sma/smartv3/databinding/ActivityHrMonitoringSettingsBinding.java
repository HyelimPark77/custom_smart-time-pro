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
public final class ActivityHrMonitoringSettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsHeader itemHeaderHigh;

    @NonNull
    public final AbhSettingsHeader itemHeaderLow;

    @NonNull
    public final AbhSettingsHeader itemHeaderReal;

    @NonNull
    public final AbhSettingsHeader itemHeaderSmart;

    @NonNull
    public final AbhSettingsItem itemHighValue;

    @NonNull
    public final AbhSettingsItem itemInterval;

    @NonNull
    public final AbhSettingsItem itemLowValue;

    @NonNull
    public final AbhSettingsItem itemTimeRange;

    @NonNull
    public final LinearLayout llModePanel;

    @NonNull
    public final LinearLayout llTimePanel;

    @NonNull
    public final LinearLayout llWarnPanel;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityHrMonitoringSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsHeader itemHeaderHigh, @NonNull AbhSettingsHeader itemHeaderLow, @NonNull AbhSettingsHeader itemHeaderReal, @NonNull AbhSettingsHeader itemHeaderSmart, @NonNull AbhSettingsItem itemHighValue, @NonNull AbhSettingsItem itemInterval, @NonNull AbhSettingsItem itemLowValue, @NonNull AbhSettingsItem itemTimeRange, @NonNull LinearLayout llModePanel, @NonNull LinearLayout llTimePanel, @NonNull LinearLayout llWarnPanel, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemHeader = itemHeader;
        this.itemHeaderHigh = itemHeaderHigh;
        this.itemHeaderLow = itemHeaderLow;
        this.itemHeaderReal = itemHeaderReal;
        this.itemHeaderSmart = itemHeaderSmart;
        this.itemHighValue = itemHighValue;
        this.itemInterval = itemInterval;
        this.itemLowValue = itemLowValue;
        this.itemTimeRange = itemTimeRange;
        this.llModePanel = llModePanel;
        this.llTimePanel = llTimePanel;
        this.llWarnPanel = llWarnPanel;
        this.root = root;
    }

    @NonNull
    public static ActivityHrMonitoringSettingsBinding bind(@NonNull View rootView) {
        int r1 = R.id.item_header;
        AbhSettingsHeader r5 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (r5 == null) goto L29;
        r1 = R.id.item_header_high;
        AbhSettingsHeader r6 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_high);
        if (r6 == null) goto L29;
        r1 = R.id.item_header_low;
        AbhSettingsHeader r7 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_low);
        if (r7 == null) goto L29;
        r1 = R.id.item_header_real;
        AbhSettingsHeader r8 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_real);
        if (r8 == null) goto L29;
        r1 = R.id.item_header_smart;
        AbhSettingsHeader r9 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_smart);
        if (r9 == null) goto L29;
        r1 = R.id.item_high_value;
        AbhSettingsItem r10 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_high_value);
        if (r10 == null) goto L29;
        r1 = R.id.item_interval;
        AbhSettingsItem r11 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_interval);
        if (r11 == null) goto L29;
        r1 = R.id.item_low_value;
        AbhSettingsItem r12 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_low_value);
        if (r12 == null) goto L29;
        r1 = R.id.item_time_range;
        AbhSettingsItem r13 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_range);
        if (r13 == null) goto L29;
        r1 = R.id.ll_mode_panel;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_mode_panel);
        if (r14 == null) goto L29;
        r1 = R.id.ll_time_panel;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_time_panel);
        if (r15 == null) goto L29;
        r1 = R.id.ll_warn_panel;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_warn_panel);
        if (r16 == null) goto L29;
        LinearLayout r4 = (LinearLayout) rootView;
        return new ActivityHrMonitoringSettingsBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r4);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityHrMonitoringSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityHrMonitoringSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_hr_monitoring_settings, parent, false);
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
