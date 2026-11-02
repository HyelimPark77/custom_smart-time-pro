package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAiPlanItemGroupHeadBinding implements ViewBinding {

    @NonNull
    public final LinearLayout planItemGroupHeadTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium textTime;

    @NonNull
    public final PFMedium textTimeCalendar;

    private ItemAiPlanItemGroupHeadBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout planItemGroupHeadTitle, @NonNull PFMedium textTime, @NonNull PFMedium textTimeCalendar) {
        this.rootView = rootView;
        this.planItemGroupHeadTitle = planItemGroupHeadTitle;
        this.textTime = textTime;
        this.textTimeCalendar = textTimeCalendar;
    }

    @NonNull
    public static ItemAiPlanItemGroupHeadBinding bind(@NonNull View rootView) {
        LinearLayout r0 = (LinearLayout) rootView;
        int r1 = R.id.text_time;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.text_time);
        if (r2 == null) goto L9;
        r1 = R.id.text_time_calendar;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.text_time_calendar);
        if (r3 == null) goto L9;
        return new ItemAiPlanItemGroupHeadBinding(r0, r0, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ItemAiPlanItemGroupHeadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAiPlanItemGroupHeadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_ai_plan_item_group_head, parent, false);
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
