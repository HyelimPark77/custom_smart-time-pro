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
        int i = R.id.item_today_healthy_data_layout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_layout);
        if (relativeLayout != null) {
            i = R.id.item_today_healthy_data_state;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_state);
            if (pFMedium != null) {
                i = R.id.item_today_healthy_data_time;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_time);
                if (pFMedium2 != null) {
                    i = R.id.item_today_healthy_data_title;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_title);
                    if (pFMedium3 != null) {
                        i = R.id.item_today_healthy_data_value;
                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_today_healthy_data_value);
                        if (pFMedium4 != null) {
                            i = R.id.today_healthy_data_btn_view;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.today_healthy_data_btn_view);
                            if (viewFindChildViewById != null) {
                                i = R.id.today_healthy_data_top_view;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.today_healthy_data_top_view);
                                if (viewFindChildViewById2 != null) {
                                    return new ItemTodayHealthyDataBinding((RelativeLayout) rootView, relativeLayout, pFMedium, pFMedium2, pFMedium3, pFMedium4, viewFindChildViewById, viewFindChildViewById2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemTodayHealthyDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemTodayHealthyDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_today_healthy_data, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
