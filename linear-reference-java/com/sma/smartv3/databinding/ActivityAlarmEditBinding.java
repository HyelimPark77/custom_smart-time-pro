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
import com.sma.smartv3.view.AbhSettingsItem;
import com.sma.smartv3.view.picker.TimePicker;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAlarmEditBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsItem itemLabel;

    @NonNull
    public final AbhSettingsItem itemRepeat;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TimePicker timePicker;

    private ActivityAlarmEditBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsItem itemLabel, @NonNull AbhSettingsItem itemRepeat, @NonNull LinearLayout root, @NonNull TimePicker timePicker) {
        this.rootView = rootView;
        this.itemLabel = itemLabel;
        this.itemRepeat = itemRepeat;
        this.root = root;
        this.timePicker = timePicker;
    }

    @NonNull
    public static ActivityAlarmEditBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_label;
        AbhSettingsItem r4 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_label);
        if (r4 == null) goto L11;
        r0 = R.id.item_repeat;
        AbhSettingsItem r5 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_repeat);
        if (r5 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.time_picker;
        TimePicker r7 = (TimePicker) ViewBindings.findChildViewById(rootView, R.id.time_picker);
        if (r7 == null) goto L11;
        return new ActivityAlarmEditBinding(r3, r4, r5, r3, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAlarmEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAlarmEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_alarm_edit, parent, false);
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
