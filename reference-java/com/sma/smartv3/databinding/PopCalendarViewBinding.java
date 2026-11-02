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
        int i = R.id.pop_calendar_view;
        CalendarView calendarView = (CalendarView) ViewBindings.findChildViewById(rootView, R.id.pop_calendar_view);
        if (calendarView != null) {
            i = R.id.tv_last_month;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_last_month);
            if (imageView != null) {
                i = R.id.tv_next_month;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_next_month);
                if (imageView2 != null) {
                    i = R.id.tv_title_data;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title_data);
                    if (pFMedium != null) {
                        return new PopCalendarViewBinding((LinearLayout) rootView, calendarView, imageView, imageView2, pFMedium);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopCalendarViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopCalendarViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_calendar_view, parent, false);
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
