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
public final class ActivitySedentarinessSettingsBinding implements ViewBinding {

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

    private ActivitySedentarinessSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsItem itemInterval, @NonNull AbhSettingsItem itemRepeat, @NonNull AbhSettingsItem itemTimeRange, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemHeader = itemHeader;
        this.itemInterval = itemInterval;
        this.itemRepeat = itemRepeat;
        this.itemTimeRange = itemTimeRange;
        this.root = root;
    }

    @NonNull
    public static ActivitySedentarinessSettingsBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_header;
        AbhSettingsHeader r4 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (r4 == null) goto L13;
        r0 = R.id.item_interval;
        AbhSettingsItem r5 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_interval);
        if (r5 == null) goto L13;
        r0 = R.id.item_repeat;
        AbhSettingsItem r6 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_repeat);
        if (r6 == null) goto L13;
        r0 = R.id.item_time_range;
        AbhSettingsItem r7 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_range);
        if (r7 == null) goto L13;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivitySedentarinessSettingsBinding(r3, r4, r5, r6, r7, r3);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySedentarinessSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySedentarinessSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sedentariness_settings, parent, false);
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
