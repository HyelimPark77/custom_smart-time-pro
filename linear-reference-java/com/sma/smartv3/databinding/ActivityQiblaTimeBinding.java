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
        int r0 = R.id.calendarView;
        FutureCalendarView r4 = (FutureCalendarView) ViewBindings.findChildViewById(rootView, R.id.calendarView);
        if (r4 == null) goto L15;
        r0 = R.id.recyclerView;
        RecyclerView r5 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
        if (r5 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_count_down;
        CountDownView r7 = (CountDownView) ViewBindings.findChildViewById(rootView, R.id.tv_count_down);
        if (r7 == null) goto L15;
        r0 = R.id.tv_next_time_name;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_next_time_name);
        if (r8 == null) goto L15;
        r0 = R.id.tv_next_time_value;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_next_time_value);
        if (r9 == null) goto L15;
        return new ActivityQiblaTimeBinding(r3, r4, r5, r3, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityQiblaTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityQiblaTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_qibla_time, parent, false);
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
