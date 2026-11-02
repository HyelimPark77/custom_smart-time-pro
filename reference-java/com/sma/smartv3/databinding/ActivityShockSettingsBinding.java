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
        int i = R.id.ll_alarm_clock_circulation;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_alarm_clock_circulation);
        if (linearLayout != null) {
            i = R.id.ll_alarm_clock_shock_mode;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_alarm_clock_shock_mode);
            if (linearLayout2 != null) {
                i = R.id.ll_incoming_call_circulation;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_incoming_call_circulation);
                if (linearLayout3 != null) {
                    i = R.id.ll_incoming_call_shock_mode;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_incoming_call_shock_mode);
                    if (linearLayout4 != null) {
                        i = R.id.ll_message_push_circulation;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_message_push_circulation);
                        if (linearLayout5 != null) {
                            i = R.id.ll_message_push_shock_mode;
                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_message_push_shock_mode);
                            if (linearLayout6 != null) {
                                i = R.id.ll_schedule_circulation;
                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_schedule_circulation);
                                if (linearLayout7 != null) {
                                    i = R.id.ll_schedule_shock_mode;
                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_schedule_shock_mode);
                                    if (linearLayout8 != null) {
                                        i = R.id.ll_sedentary_circulation;
                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_sedentary_circulation);
                                        if (linearLayout9 != null) {
                                            i = R.id.ll_sedentary_shock_mode;
                                            LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_sedentary_shock_mode);
                                            if (linearLayout10 != null) {
                                                LinearLayout linearLayout11 = (LinearLayout) rootView;
                                                i = R.id.scrollView;
                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                if (nestedScrollView != null) {
                                                    i = R.id.tv_alarm_clock_circulation;
                                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_alarm_clock_circulation);
                                                    if (pFMedium != null) {
                                                        i = R.id.tv_alarm_clock_shock_mode;
                                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_alarm_clock_shock_mode);
                                                        if (pFMedium2 != null) {
                                                            i = R.id.tv_incoming_call_circulation;
                                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_incoming_call_circulation);
                                                            if (pFMedium3 != null) {
                                                                i = R.id.tv_incoming_call_shock_mode;
                                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_incoming_call_shock_mode);
                                                                if (pFMedium4 != null) {
                                                                    i = R.id.tv_message_push_circulation;
                                                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_message_push_circulation);
                                                                    if (pFMedium5 != null) {
                                                                        i = R.id.tv_message_push_shock_mode;
                                                                        PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_message_push_shock_mode);
                                                                        if (pFMedium6 != null) {
                                                                            i = R.id.tv_schedule_circulation;
                                                                            PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_schedule_circulation);
                                                                            if (pFMedium7 != null) {
                                                                                i = R.id.tv_schedule_shock_mode;
                                                                                PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_schedule_shock_mode);
                                                                                if (pFMedium8 != null) {
                                                                                    i = R.id.tv_sedentary_circulation;
                                                                                    PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_sedentary_circulation);
                                                                                    if (pFMedium9 != null) {
                                                                                        i = R.id.tv_sedentary_shock_mode;
                                                                                        PFMedium pFMedium10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_sedentary_shock_mode);
                                                                                        if (pFMedium10 != null) {
                                                                                            return new ActivityShockSettingsBinding(linearLayout11, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, nestedScrollView, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9, pFMedium10);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static ActivityShockSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityShockSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_shock_settings, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
