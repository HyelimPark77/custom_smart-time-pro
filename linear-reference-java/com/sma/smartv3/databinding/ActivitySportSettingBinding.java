package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySportSettingBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llVoiceBroadcast;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatCheckBox screenAlwaysOnCB;

    @NonNull
    public final AppCompatCheckBox voiceBroadcastCB;

    private ActivitySportSettingBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llVoiceBroadcast, @NonNull AppCompatCheckBox screenAlwaysOnCB, @NonNull AppCompatCheckBox voiceBroadcastCB) {
        this.rootView = rootView;
        this.llVoiceBroadcast = llVoiceBroadcast;
        this.screenAlwaysOnCB = screenAlwaysOnCB;
        this.voiceBroadcastCB = voiceBroadcastCB;
    }

    @NonNull
    public static ActivitySportSettingBinding bind(@NonNull View rootView) {
        int r0 = R.id.llVoiceBroadcast;
        LinearLayout r1 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llVoiceBroadcast);
        if (r1 == null) goto L11;
        r0 = R.id.screenAlwaysOnCB;
        AppCompatCheckBox r2 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.screenAlwaysOnCB);
        if (r2 == null) goto L11;
        r0 = R.id.voiceBroadcastCB;
        AppCompatCheckBox r3 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.voiceBroadcastCB);
        if (r3 == null) goto L11;
        return new ActivitySportSettingBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySportSettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySportSettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sport_setting, parent, false);
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
