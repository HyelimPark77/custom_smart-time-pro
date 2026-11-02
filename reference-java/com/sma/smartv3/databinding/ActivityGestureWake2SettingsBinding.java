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
public final class ActivityGestureWake2SettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemAllHeader;

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsItem itemTimeRange;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityGestureWake2SettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemAllHeader, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsItem itemTimeRange, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemAllHeader = itemAllHeader;
        this.itemHeader = itemHeader;
        this.itemTimeRange = itemTimeRange;
        this.root = root;
    }

    @NonNull
    public static ActivityGestureWake2SettingsBinding bind(@NonNull View rootView) {
        int i = R.id.item_all_header;
        AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_all_header);
        if (abhSettingsHeader != null) {
            i = R.id.item_header;
            AbhSettingsHeader abhSettingsHeader2 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
            if (abhSettingsHeader2 != null) {
                i = R.id.item_time_range;
                AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_range);
                if (abhSettingsItem != null) {
                    LinearLayout linearLayout = (LinearLayout) rootView;
                    return new ActivityGestureWake2SettingsBinding(linearLayout, abhSettingsHeader, abhSettingsHeader2, abhSettingsItem, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityGestureWake2SettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGestureWake2SettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_gesture_wake2_settings, parent, false);
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
