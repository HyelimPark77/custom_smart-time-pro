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
public final class ActivityStandbyWatchfaceSettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemAllDayHeader;

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsHeader itemStandbyHeader;

    @NonNull
    public final AbhSettingsItem itemTimeRange;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout setPanel;

    private ActivityStandbyWatchfaceSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemAllDayHeader, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsHeader itemStandbyHeader, @NonNull AbhSettingsItem itemTimeRange, @NonNull LinearLayout root, @NonNull LinearLayout setPanel) {
        this.rootView = rootView;
        this.itemAllDayHeader = itemAllDayHeader;
        this.itemHeader = itemHeader;
        this.itemStandbyHeader = itemStandbyHeader;
        this.itemTimeRange = itemTimeRange;
        this.root = root;
        this.setPanel = setPanel;
    }

    @NonNull
    public static ActivityStandbyWatchfaceSettingsBinding bind(@NonNull View rootView) {
        int i = R.id.item_all_day_header;
        AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_all_day_header);
        if (abhSettingsHeader != null) {
            i = R.id.item_header;
            AbhSettingsHeader abhSettingsHeader2 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
            if (abhSettingsHeader2 != null) {
                i = R.id.item_standby_header;
                AbhSettingsHeader abhSettingsHeader3 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_standby_header);
                if (abhSettingsHeader3 != null) {
                    i = R.id.item_time_range;
                    AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_range);
                    if (abhSettingsItem != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        i = R.id.set_panel;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.set_panel);
                        if (linearLayout2 != null) {
                            return new ActivityStandbyWatchfaceSettingsBinding(linearLayout, abhSettingsHeader, abhSettingsHeader2, abhSettingsHeader3, abhSettingsItem, linearLayout, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityStandbyWatchfaceSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityStandbyWatchfaceSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_standby_watchface_settings, parent, false);
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
