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
        int r0 = R.id.bt_changes;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_changes);
        if (r4 == null) goto L21;
        r0 = R.id.bt_exercise_sessions;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bt_exercise_sessions);
        if (r5 == null) goto L21;
        r0 = R.id.bt_input_readings;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_input_readings);
        if (r6 == null) goto L21;
        r0 = R.id.bt_sleep_sessions;
        Button r7 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_sleep_sessions);
        if (r7 == null) goto L21;
        r0 = R.id.check_health_connect;
        AppCompatCheckBox r8 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_health_connect);
        if (r8 == null) goto L21;
        r0 = R.id.iv_health_connect;
        AppCompatImageView r9 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_health_connect);
        if (r9 == null) goto L21;
        ConstraintLayout r3 = (ConstraintLayout) rootView;
        r0 = R.id.tv_hint_title;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_hint_title);
        if (r11 == null) goto L21;
        r0 = R.id.welcome_tv;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.welcome_tv);
        if (r12 == null) goto L21;
        return new ActivityHealthConnectBinding(r3, r4, r5, r6, r7, r8, r9, r3, r11, r12);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityHealthConnectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityHealthConnectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_health_connect, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
