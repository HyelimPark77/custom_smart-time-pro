package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemTodayHealthyDataBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout itemTodayHealthyDataLayout;

    @NonNull
    public final PFMedium itemTodayHealthyDataState;

    @NonNull
    public final PFMedium itemTodayHealthyDataTime;

    @NonNull
    public final PFMedium itemTodayHealthyDataTitle;

    @NonNull
    public final PFMedium itemTodayHealthyDataValue;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final View todayHealthyDataBtnView;

    @NonNull
    public final View todayHealthyDataTopView;

    private ItemTodayHealthyDataBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout itemTodayHealthyDataLayout, @NonNull PFMedium itemTodayHealthyDataState, @NonNull PFMedium itemTodayHealthyDataTime, @NonNull PFMedium itemTodayHealthyDataTitle, @NonNull PFMedium itemTodayHealthyDataValue, @NonNull View todayHealthyDataBtnView, @NonNull View todayHealthyDataTopView) {
        this.rootView = rootView;
        this.itemTodayHealthyDataLayout = itemTodayHealthyDataLayout;
        this.itemTodayHealthyDataState = itemTodayHealthyDataState;
        this.itemTodayHealthyDataTime = itemTodayHealthyDataTime;
        this.itemTodayHealthyDataTitle = itemTodayHealthyDataTitle;
        this.itemTodayHealthyDataValue = itemTodayHealthyDataValue;
        this.todayHealthyDataBtnView = todayHealthyDataBtnView;
        this.todayHealthyDataTopView = todayHealthyDataTopView;
    }

    @NonNull
    public static ItemTodayHealthyDataBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_today_healthy_data_layout;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_layout);
        if (r4 == null) goto L19;
        r0 = R.id.item_today_healthy_data_state;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_state);
        if (r5 == null) goto L19;
        r0 = R.id.item_today_healthy_data_time;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_time);
        if (r6 == null) goto L19;
        r0 = R.id.item_today_healthy_data_title;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_title);
        if (r7 == null) goto L19;
        r0 = R.id.item_today_healthy_data_value;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_value);
        if (r8 == null) goto L19;
        r0 = R.id.today_healthy_data_btn_view;
        View r9 = ViewBindings.findChildViewById(rootView, R.id.today_healthy_data_btn_view);
        if (r9 == null) goto L19;
        r0 = R.id.today_healthy_data_top_view;
        View r10 = ViewBindings.findChildViewById(rootView, R.id.today_healthy_data_top_view);
        if (r10 == null) goto L19;
        return new ItemTodayHealthyDataBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemTodayHealthyDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemTodayHealthyDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_today_healthy_data, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
