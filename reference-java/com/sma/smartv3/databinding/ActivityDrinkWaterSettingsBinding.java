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
public final class ActivityDrinkWaterSettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsItem itemInterval;

    @NonNull
    public final AbhSettingsItem itemRepeat;

    @NonNull
    public final AbhSettingsItem itemTimeRange;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityDrinkWaterSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsItem itemInterval, @NonNull AbhSettingsItem itemRepeat, @NonNull AbhSettingsItem itemTimeRange, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemHeader = itemHeader;
        this.itemInterval = itemInterval;
        this.itemRepeat = itemRepeat;
        this.itemTimeRange = itemTimeRange;
        this.root = root;
    }

    @NonNull
    public static ActivityDrinkWaterSettingsBinding bind(@NonNull View rootView) {
        int i = R.id.item_header;
        AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (abhSettingsHeader != null) {
            i = R.id.item_interval;
            AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_interval);
            if (abhSettingsItem != null) {
                i = R.id.item_repeat;
                AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_repeat);
                if (abhSettingsItem2 != null) {
                    i = R.id.item_time_range;
                    AbhSettingsItem abhSettingsItem3 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_range);
                    if (abhSettingsItem3 != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        return new ActivityDrinkWaterSettingsBinding(linearLayout, abhSettingsHeader, abhSettingsItem, abhSettingsItem2, abhSettingsItem3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDrinkWaterSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDrinkWaterSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_drink_water_settings, parent, false);
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
