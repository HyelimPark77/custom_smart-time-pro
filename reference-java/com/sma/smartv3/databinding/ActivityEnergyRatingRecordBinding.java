package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressCalendarView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityEnergyRatingRecordBinding implements ViewBinding {

    @NonNull
    public final ProgressCalendarView acCalendarView;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    private final LinearLayout rootView;

    private ActivityEnergyRatingRecordBinding(@NonNull LinearLayout rootView, @NonNull ProgressCalendarView acCalendarView, @NonNull ImageButton beforeTime, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime) {
        this.rootView = rootView;
        this.acCalendarView = acCalendarView;
        this.beforeTime = beforeTime;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
    }

    @NonNull
    public static ActivityEnergyRatingRecordBinding bind(@NonNull View rootView) {
        int i = R.id.ac_calendar_view;
        ProgressCalendarView progressCalendarView = (ProgressCalendarView) ViewBindings.findChildViewById(rootView, R.id.ac_calendar_view);
        if (progressCalendarView != null) {
            i = R.id.beforeTime;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
            if (imageButton != null) {
                i = R.id.nextTime;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                if (imageButton2 != null) {
                    i = R.id.nowTime;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                    if (pFMedium != null) {
                        return new ActivityEnergyRatingRecordBinding((LinearLayout) rootView, progressCalendarView, imageButton, imageButton2, pFMedium);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityEnergyRatingRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityEnergyRatingRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_energy_rating_record, parent, false);
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
