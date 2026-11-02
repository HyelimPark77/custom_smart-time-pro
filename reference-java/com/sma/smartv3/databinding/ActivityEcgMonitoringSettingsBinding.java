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
public final class ActivityEcgMonitoringSettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsItem itemInterval;

    @NonNull
    public final AbhSettingsItem itemTimeRange;

    @NonNull
    public final LinearLayout llTimePanel;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityEcgMonitoringSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsItem itemInterval, @NonNull AbhSettingsItem itemTimeRange, @NonNull LinearLayout llTimePanel, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemHeader = itemHeader;
        this.itemInterval = itemInterval;
        this.itemTimeRange = itemTimeRange;
        this.llTimePanel = llTimePanel;
        this.root = root;
    }

    @NonNull
    public static ActivityEcgMonitoringSettingsBinding bind(@NonNull View rootView) {
        int i = R.id.item_header;
        AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (abhSettingsHeader != null) {
            i = R.id.item_interval;
            AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_interval);
            if (abhSettingsItem != null) {
                i = R.id.item_time_range;
                AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_range);
                if (abhSettingsItem2 != null) {
                    i = R.id.ll_time_panel;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_time_panel);
                    if (linearLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) rootView;
                        return new ActivityEcgMonitoringSettingsBinding(linearLayout2, abhSettingsHeader, abhSettingsItem, abhSettingsItem2, linearLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityEcgMonitoringSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityEcgMonitoringSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_ecg_monitoring_settings, parent, false);
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
