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
        int i = R.id.llVoiceBroadcast;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llVoiceBroadcast);
        if (linearLayout != null) {
            i = R.id.screenAlwaysOnCB;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.screenAlwaysOnCB);
            if (appCompatCheckBox != null) {
                i = R.id.voiceBroadcastCB;
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.voiceBroadcastCB);
                if (appCompatCheckBox2 != null) {
                    return new ActivitySportSettingBinding((LinearLayout) rootView, linearLayout, appCompatCheckBox, appCompatCheckBox2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySportSettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySportSettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sport_setting, parent, false);
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
