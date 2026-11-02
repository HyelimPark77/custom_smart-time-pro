package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemTodayHealthDataBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView statusItemTodayHealthData;

    @NonNull
    public final LinearLayout todayHealthTitleLayout;

    private StatusItemTodayHealthDataBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView statusItemTodayHealthData, @NonNull LinearLayout todayHealthTitleLayout) {
        this.rootView = rootView;
        this.statusItemTodayHealthData = statusItemTodayHealthData;
        this.todayHealthTitleLayout = todayHealthTitleLayout;
    }

    @NonNull
    public static StatusItemTodayHealthDataBinding bind(@NonNull View rootView) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.status_item_today_health_data);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.status_item_today_health_data)));
        }
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new StatusItemTodayHealthDataBinding(linearLayout, recyclerView, linearLayout);
    }

    @NonNull
    public static StatusItemTodayHealthDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemTodayHealthDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_today_health_data, parent, false);
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
