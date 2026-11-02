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
        int i = R.id.item_label;
        AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_label);
        if (abhSettingsItem != null) {
            i = R.id.item_repeat;
            AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_repeat);
            if (abhSettingsItem2 != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.time_picker;
                TimePicker timePicker = (TimePicker) ViewBindings.findChildViewById(rootView, R.id.time_picker);
                if (timePicker != null) {
                    return new ActivityAlarmEditBinding(linearLayout, abhSettingsItem, abhSettingsItem2, linearLayout, timePicker);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAlarmEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAlarmEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_alarm_edit, parent, false);
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
