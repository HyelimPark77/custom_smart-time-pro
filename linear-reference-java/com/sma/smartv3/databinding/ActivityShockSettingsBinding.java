package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityShockSettingsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llAlarmClockCirculation;

    @NonNull
    public final LinearLayout llAlarmClockShockMode;

    @NonNull
    public final LinearLayout llIncomingCallCirculation;

    @NonNull
    public final LinearLayout llIncomingCallShockMode;

    @NonNull
    public final LinearLayout llMessagePushCirculation;

    @NonNull
    public final LinearLayout llMessagePushShockMode;

    @NonNull
    public final LinearLayout llScheduleCirculation;

    @NonNull
    public final LinearLayout llScheduleShockMode;

    @NonNull
    public final LinearLayout llSedentaryCirculation;

    @NonNull
    public final LinearLayout llSedentaryShockMode;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium tvAlarmClockCirculation;

    @NonNull
    public final PFMedium tvAlarmClockShockMode;

    @NonNull
    public final PFMedium tvIncomingCallCirculation;

    @NonNull
    public final PFMedium tvIncomingCallShockMode;

    @NonNull
    public final PFMedium tvMessagePushCirculation;

    @NonNull
    public final PFMedium tvMessagePushShockMode;

    @NonNull
    public final PFMedium tvScheduleCirculation;

    @NonNull
    public final PFMedium tvScheduleShockMode;

    @NonNull
    public final PFMedium tvSedentaryCirculation;

    @NonNull
    public final PFMedium tvSedentaryShockMode;

    private ActivityShockSettingsBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout llAlarmClockCirculation, @NonNull LinearLayout llAlarmClockShockMode, @NonNull LinearLayout llIncomingCallCirculation, @NonNull LinearLayout llIncomingCallShockMode, @NonNull LinearLayout llMessagePushCirculation, @NonNull LinearLayout llMessagePushShockMode, @NonNull LinearLayout llScheduleCirculation, @NonNull LinearLayout llScheduleShockMode, @NonNull LinearLayout llSedentaryCirculation, @NonNull LinearLayout llSedentaryShockMode, @NonNull LinearLayout rootView, @NonNull NestedScrollView scrollView, @NonNull PFMedium tvAlarmClockCirculation, @NonNull PFMedium tvAlarmClockShockMode, @NonNull PFMedium tvIncomingCallCirculation, @NonNull PFMedium tvIncomingCallShockMode, @NonNull PFMedium tvMessagePushCirculation, @NonNull PFMedium tvMessagePushShockMode, @NonNull PFMedium tvScheduleCirculation, @NonNull PFMedium tvScheduleShockMode, @NonNull PFMedium tvSedentaryCirculation, @NonNull PFMedium tvSedentaryShockMode) {
        this.rootView_ = rootView_;
        this.llAlarmClockCirculation = llAlarmClockCirculation;
        this.llAlarmClockShockMode = llAlarmClockShockMode;
        this.llIncomingCallCirculation = llIncomingCallCirculation;
        this.llIncomingCallShockMode = llIncomingCallShockMode;
        this.llMessagePushCirculation = llMessagePushCirculation;
        this.llMessagePushShockMode = llMessagePushShockMode;
        this.llScheduleCirculation = llScheduleCirculation;
        this.llScheduleShockMode = llScheduleShockMode;
        this.llSedentaryCirculation = llSedentaryCirculation;
        this.llSedentaryShockMode = llSedentaryShockMode;
        this.rootView = rootView;
        this.scrollView = scrollView;
        this.tvAlarmClockCirculation = tvAlarmClockCirculation;
        this.tvAlarmClockShockMode = tvAlarmClockShockMode;
        this.tvIncomingCallCirculation = tvIncomingCallCirculation;
        this.tvIncomingCallShockMode = tvIncomingCallShockMode;
        this.tvMessagePushCirculation = tvMessagePushCirculation;
        this.tvMessagePushShockMode = tvMessagePushShockMode;
        this.tvScheduleCirculation = tvScheduleCirculation;
        this.tvScheduleShockMode = tvScheduleShockMode;
        this.tvSedentaryCirculation = tvSedentaryCirculation;
        this.tvSedentaryShockMode = tvSedentaryShockMode;
    }

    @NonNull
    public static ActivityShockSettingsBinding bind(@NonNull View rootView) {
        int r1 = R.id.ll_alarm_clock_circulation;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_alarm_clock_circulation);
        if (r5 == null) goto L47;
        r1 = R.id.ll_alarm_clock_shock_mode;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_alarm_clock_shock_mode);
        if (r6 == null) goto L47;
        r1 = R.id.ll_incoming_call_circulation;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_incoming_call_circulation);
        if (r7 == null) goto L47;
        r1 = R.id.ll_incoming_call_shock_mode;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_incoming_call_shock_mode);
        if (r8 == null) goto L47;
        r1 = R.id.ll_message_push_circulation;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_message_push_circulation);
        if (r9 == null) goto L47;
        r1 = R.id.ll_message_push_shock_mode;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_message_push_shock_mode);
        if (r10 == null) goto L47;
        r1 = R.id.ll_schedule_circulation;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_schedule_circulation);
        if (r11 == null) goto L47;
        r1 = R.id.ll_schedule_shock_mode;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_schedule_shock_mode);
        if (r12 == null) goto L47;
        r1 = R.id.ll_sedentary_circulation;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_sedentary_circulation);
        if (r13 == null) goto L47;
        r1 = R.id.ll_sedentary_shock_mode;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_sedentary_shock_mode);
        if (r14 == null) goto L47;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.scrollView;
        NestedScrollView r16 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r16 == null) goto L47;
        r1 = R.id.tv_alarm_clock_circulation;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_alarm_clock_circulation);
        if (r17 == null) goto L47;
        r1 = R.id.tv_alarm_clock_shock_mode;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_alarm_clock_shock_mode);
        if (r18 == null) goto L47;
        r1 = R.id.tv_incoming_call_circulation;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_incoming_call_circulation);
        if (r19 == null) goto L47;
        r1 = R.id.tv_incoming_call_shock_mode;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_incoming_call_shock_mode);
        if (r20 == null) goto L47;
        r1 = R.id.tv_message_push_circulation;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_message_push_circulation);
        if (r21 == null) goto L47;
        r1 = R.id.tv_message_push_shock_mode;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_message_push_shock_mode);
        if (r22 == null) goto L47;
        r1 = R.id.tv_schedule_circulation;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_schedule_circulation);
        if (r23 == null) goto L47;
        r1 = R.id.tv_schedule_shock_mode;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_schedule_shock_mode);
        if (r24 == null) goto L47;
        r1 = R.id.tv_sedentary_circulation;
        PFMedium r25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_sedentary_circulation);
        if (r25 == null) goto L47;
        r1 = R.id.tv_sedentary_shock_mode;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_sedentary_shock_mode);
        if (r26 == null) goto L47;
        return new ActivityShockSettingsBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r4, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    L47:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityShockSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityShockSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_shock_settings, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
