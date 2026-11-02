package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CountDownView;
import com.sma.smartv3.view.FutureCalendarView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityQiblaTimeBinding implements ViewBinding {

    @NonNull
    public final FutureCalendarView calendarView;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CountDownView tvCountDown;

    @NonNull
    public final PFMedium tvNextTimeName;

    @NonNull
    public final PFMedium tvNextTimeValue;

    private ActivityQiblaTimeBinding(@NonNull LinearLayout rootView, @NonNull FutureCalendarView calendarView, @NonNull RecyclerView recyclerView, @NonNull LinearLayout root, @NonNull CountDownView tvCountDown, @NonNull PFMedium tvNextTimeName, @NonNull PFMedium tvNextTimeValue) {
        this.rootView = rootView;
        this.calendarView = calendarView;
        this.recyclerView = recyclerView;
        this.root = root;
        this.tvCountDown = tvCountDown;
        this.tvNextTimeName = tvNextTimeName;
        this.tvNextTimeValue = tvNextTimeValue;
    }

    @NonNull
    public static ActivityQiblaTimeBinding bind(@NonNull View rootView) {
        int i = R.id.calendarView;
        FutureCalendarView futureCalendarView = (FutureCalendarView) ViewBindings.findChildViewById(rootView, R.id.calendarView);
        if (futureCalendarView != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
            if (recyclerView != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.tv_count_down;
                CountDownView countDownView = (CountDownView) ViewBindings.findChildViewById(rootView, R.id.tv_count_down);
                if (countDownView != null) {
                    i = R.id.tv_next_time_name;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_next_time_name);
                    if (pFMedium != null) {
                        i = R.id.tv_next_time_value;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_next_time_value);
                        if (pFMedium2 != null) {
                            return new ActivityQiblaTimeBinding(linearLayout, futureCalendarView, recyclerView, linearLayout, countDownView, pFMedium, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityQiblaTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityQiblaTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_qibla_time, parent, false);
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
