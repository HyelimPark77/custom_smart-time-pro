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
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.text_time;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.text_time);
        if (pFMedium != null) {
            i = R.id.text_time_calendar;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.text_time_calendar);
            if (pFMedium2 != null) {
                return new ItemAiPlanItemGroupHeadBinding(linearLayout, linearLayout, pFMedium, pFMedium2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAiPlanItemGroupHeadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAiPlanItemGroupHeadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_ai_plan_item_group_head, parent, false);
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
