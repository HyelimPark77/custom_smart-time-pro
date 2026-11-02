package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityHealthConnectBinding implements ViewBinding {

    @NonNull
    public final Button btChanges;

    @NonNull
    public final TextView btExerciseSessions;

    @NonNull
    public final Button btInputReadings;

    @NonNull
    public final Button btSleepSessions;

    @NonNull
    public final AppCompatCheckBox checkHealthConnect;

    @NonNull
    public final AppCompatImageView ivHealthConnect;

    @NonNull
    public final ConstraintLayout main;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final PFMedium tvHintTitle;

    @NonNull
    public final PFMedium welcomeTv;

    private ActivityHealthConnectBinding(@NonNull ConstraintLayout rootView, @NonNull Button btChanges, @NonNull TextView btExerciseSessions, @NonNull Button btInputReadings, @NonNull Button btSleepSessions, @NonNull AppCompatCheckBox checkHealthConnect, @NonNull AppCompatImageView ivHealthConnect, @NonNull ConstraintLayout main, @NonNull PFMedium tvHintTitle, @NonNull PFMedium welcomeTv) {
        this.rootView = rootView;
        this.btChanges = btChanges;
        this.btExerciseSessions = btExerciseSessions;
        this.btInputReadings = btInputReadings;
        this.btSleepSessions = btSleepSessions;
        this.checkHealthConnect = checkHealthConnect;
        this.ivHealthConnect = ivHealthConnect;
        this.main = main;
        this.tvHintTitle = tvHintTitle;
        this.welcomeTv = welcomeTv;
    }

    @NonNull
    public static ActivityHealthConnectBinding bind(@NonNull View rootView) {
        int i = R.id.bt_changes;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_changes);
        if (button != null) {
            i = R.id.bt_exercise_sessions;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bt_exercise_sessions);
            if (textView != null) {
                i = R.id.bt_input_readings;
                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_input_readings);
                if (button2 != null) {
                    i = R.id.bt_sleep_sessions;
                    Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_sleep_sessions);
                    if (button3 != null) {
                        i = R.id.check_health_connect;
                        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_health_connect);
                        if (appCompatCheckBox != null) {
                            i = R.id.iv_health_connect;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_health_connect);
                            if (appCompatImageView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                i = R.id.tv_hint_title;
                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_hint_title);
                                if (pFMedium != null) {
                                    i = R.id.welcome_tv;
                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.welcome_tv);
                                    if (pFMedium2 != null) {
                                        return new ActivityHealthConnectBinding(constraintLayout, button, textView, button2, button3, appCompatCheckBox, appCompatImageView, constraintLayout, pFMedium, pFMedium2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHealthConnectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHealthConnectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_health_connect, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
