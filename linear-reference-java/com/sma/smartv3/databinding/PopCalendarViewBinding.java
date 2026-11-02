package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CalendarView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopCalendarViewBinding implements ViewBinding {

    @NonNull
    public final CalendarView popCalendarView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView tvLastMonth;

    @NonNull
    public final ImageView tvNextMonth;

    @NonNull
    public final PFMedium tvTitleData;

    private PopCalendarViewBinding(@NonNull LinearLayout rootView, @NonNull CalendarView popCalendarView, @NonNull ImageView tvLastMonth, @NonNull ImageView tvNextMonth, @NonNull PFMedium tvTitleData) {
        this.rootView = rootView;
        this.popCalendarView = popCalendarView;
        this.tvLastMonth = tvLastMonth;
        this.tvNextMonth = tvNextMonth;
        this.tvTitleData = tvTitleData;
    }

    @NonNull
    public static PopCalendarViewBinding bind(@NonNull View rootView) {
        int r0 = R.id.pop_calendar_view;
        CalendarView r4 = (CalendarView) ViewBindings.findChildViewById(rootView, R.id.pop_calendar_view);
        if (r4 == null) goto L13;
        r0 = R.id.tv_last_month;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_last_month);
        if (r5 == null) goto L13;
        r0 = R.id.tv_next_month;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_next_month);
        if (r6 == null) goto L13;
        r0 = R.id.tv_title_data;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title_data);
        if (r7 == null) goto L13;
        return new PopCalendarViewBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopCalendarViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopCalendarViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_calendar_view, parent, false);
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
