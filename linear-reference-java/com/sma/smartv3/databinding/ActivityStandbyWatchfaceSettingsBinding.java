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
        int r0 = R.id.item_all_day_header;
        AbhSettingsHeader r4 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_all_day_header);
        if (r4 == null) goto L15;
        r0 = R.id.item_header;
        AbhSettingsHeader r5 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (r5 == null) goto L15;
        r0 = R.id.item_standby_header;
        AbhSettingsHeader r6 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_standby_header);
        if (r6 == null) goto L15;
        r0 = R.id.item_time_range;
        AbhSettingsItem r7 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_range);
        if (r7 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.set_panel;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.set_panel);
        if (r9 == null) goto L15;
        return new ActivityStandbyWatchfaceSettingsBinding(r3, r4, r5, r6, r7, r3, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityStandbyWatchfaceSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityStandbyWatchfaceSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_standby_watchface_settings, parent, false);
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
