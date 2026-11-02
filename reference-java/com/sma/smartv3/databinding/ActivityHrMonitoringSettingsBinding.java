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
        int i = R.id.item_header;
        AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (abhSettingsHeader != null) {
            i = R.id.item_header_high;
            AbhSettingsHeader abhSettingsHeader2 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_high);
            if (abhSettingsHeader2 != null) {
                i = R.id.item_header_low;
                AbhSettingsHeader abhSettingsHeader3 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_low);
                if (abhSettingsHeader3 != null) {
                    i = R.id.item_header_real;
                    AbhSettingsHeader abhSettingsHeader4 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_real);
                    if (abhSettingsHeader4 != null) {
                        i = R.id.item_header_smart;
                        AbhSettingsHeader abhSettingsHeader5 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_smart);
                        if (abhSettingsHeader5 != null) {
                            i = R.id.item_high_value;
                            AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_high_value);
                            if (abhSettingsItem != null) {
                                i = R.id.item_interval;
                                AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_interval);
                                if (abhSettingsItem2 != null) {
                                    i = R.id.item_low_value;
                                    AbhSettingsItem abhSettingsItem3 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_low_value);
                                    if (abhSettingsItem3 != null) {
                                        i = R.id.item_time_range;
                                        AbhSettingsItem abhSettingsItem4 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_range);
                                        if (abhSettingsItem4 != null) {
                                            i = R.id.ll_mode_panel;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_mode_panel);
                                            if (linearLayout != null) {
                                                i = R.id.ll_time_panel;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_time_panel);
                                                if (linearLayout2 != null) {
                                                    i = R.id.ll_warn_panel;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_warn_panel);
                                                    if (linearLayout3 != null) {
                                                        LinearLayout linearLayout4 = (LinearLayout) rootView;
                                                        return new ActivityHrMonitoringSettingsBinding(linearLayout4, abhSettingsHeader, abhSettingsHeader2, abhSettingsHeader3, abhSettingsHeader4, abhSettingsHeader5, abhSettingsItem, abhSettingsItem2, abhSettingsItem3, abhSettingsItem4, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static ActivityHrMonitoringSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHrMonitoringSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_hr_monitoring_settings, parent, false);
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
