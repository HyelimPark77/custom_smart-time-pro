package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ChooseStartCalendarView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiCoachStartTimeBinding implements ViewBinding {

    @NonNull
    public final ChooseStartCalendarView calendarView;

    @NonNull
    public final PFMedium calendarViewTitle;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    private final FrameLayout rootView_;

    @NonNull
    public final PFMedium todayIsTime;

    private AiCoachStartTimeBinding(@NonNull FrameLayout rootView_, @NonNull ChooseStartCalendarView calendarView, @NonNull PFMedium calendarViewTitle, @NonNull FrameLayout rootView, @NonNull PFMedium todayIsTime) {
        this.rootView_ = rootView_;
        this.calendarView = calendarView;
        this.calendarViewTitle = calendarViewTitle;
        this.rootView = rootView;
        this.todayIsTime = todayIsTime;
    }

    @NonNull
    public static AiCoachStartTimeBinding bind(@NonNull View rootView) {
        int r0 = R.id.calendar_view;
        ChooseStartCalendarView r4 = (ChooseStartCalendarView) ViewBindings.findChildViewById(rootView, R.id.calendar_view);
        if (r4 == null) goto L11;
        r0 = R.id.calendar_view_title;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.calendar_view_title);
        if (r5 == null) goto L11;
        FrameLayout r3 = (FrameLayout) rootView;
        r0 = R.id.today_is_time;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.today_is_time);
        if (r7 == null) goto L11;
        return new AiCoachStartTimeBinding(r3, r4, r5, r3, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiCoachStartTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiCoachStartTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_coach_start_time, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView_;
    }
}
