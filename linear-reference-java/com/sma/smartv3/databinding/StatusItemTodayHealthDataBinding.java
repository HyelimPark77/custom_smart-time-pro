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
        RecyclerView r1 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.status_item_today_health_data);
        if (r1 == null) goto L7;
        LinearLayout r2 = (LinearLayout) rootView;
        return new StatusItemTodayHealthDataBinding(r2, r1, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.status_item_today_health_data)));
    }

    @NonNull
    public static StatusItemTodayHealthDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemTodayHealthDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_today_health_data, parent, false);
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
