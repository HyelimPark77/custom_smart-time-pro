package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAiRecordsBinding implements ViewBinding {

    @NonNull
    public final ADPAdContainerView adpAdContainerView;

    @NonNull
    public final ADPCAdContainerView adpcAdContainerView;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50967rv;

    @NonNull
    public final SwipeRefreshLayout srf;

    private ActivityAiRecordsBinding(@NonNull LinearLayout rootView, @NonNull ADPAdContainerView adpAdContainerView, @NonNull ADPCAdContainerView adpcAdContainerView, @NonNull RecyclerView rv, @NonNull SwipeRefreshLayout srf) {
        this.rootView = rootView;
        this.adpAdContainerView = adpAdContainerView;
        this.adpcAdContainerView = adpcAdContainerView;
        this.f50967rv = rv;
        this.srf = srf;
    }

    @NonNull
    public static ActivityAiRecordsBinding bind(@NonNull View rootView) {
        int i = R.id.adpAdContainerView;
        ADPAdContainerView aDPAdContainerView = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpAdContainerView);
        if (aDPAdContainerView != null) {
            i = R.id.adpcAdContainerView;
            ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpcAdContainerView);
            if (aDPCAdContainerView != null) {
                i = R.id.f51422rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                if (recyclerView != null) {
                    i = R.id.srf;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
                    if (swipeRefreshLayout != null) {
                        return new ActivityAiRecordsBinding((LinearLayout) rootView, aDPAdContainerView, aDPCAdContainerView, recyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAiRecordsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAiRecordsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_ai_records, parent, false);
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
