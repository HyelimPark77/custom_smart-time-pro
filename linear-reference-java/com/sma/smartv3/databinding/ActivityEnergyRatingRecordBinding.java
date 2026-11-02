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
        int r0 = R.id.ac_calendar_view;
        ProgressCalendarView r4 = (ProgressCalendarView) ViewBindings.findChildViewById(rootView, R.id.ac_calendar_view);
        if (r4 == null) goto L13;
        r0 = R.id.beforeTime;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r5 == null) goto L13;
        r0 = R.id.nextTime;
        ImageButton r6 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r6 == null) goto L13;
        r0 = R.id.nowTime;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r7 == null) goto L13;
        return new ActivityEnergyRatingRecordBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityEnergyRatingRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityEnergyRatingRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_energy_rating_record, parent, false);
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
