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
        int i = R.id.calendar_view;
        ChooseStartCalendarView chooseStartCalendarView = (ChooseStartCalendarView) ViewBindings.findChildViewById(rootView, R.id.calendar_view);
        if (chooseStartCalendarView != null) {
            i = R.id.calendar_view_title;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.calendar_view_title);
            if (pFMedium != null) {
                FrameLayout frameLayout = (FrameLayout) rootView;
                i = R.id.today_is_time;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.today_is_time);
                if (pFMedium2 != null) {
                    return new AiCoachStartTimeBinding(frameLayout, chooseStartCalendarView, pFMedium, frameLayout, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiCoachStartTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiCoachStartTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_coach_start_time, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView_;
    }
}
