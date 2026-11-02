package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityResourceRenewalBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView ivReportsGeneration;

    @NonNull
    public final ConstraintLayout main;

    @NonNull
    private final ConstraintLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50995rv;

    @NonNull
    public final LinearLayout shareLayout;

    @NonNull
    public final SwipeRefreshLayout srf;

    @NonNull
    public final TextView tvReportsGeneration;

    private ActivityResourceRenewalBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView ivReportsGeneration, @NonNull ConstraintLayout main, @NonNull RecyclerView rv, @NonNull LinearLayout shareLayout, @NonNull SwipeRefreshLayout srf, @NonNull TextView tvReportsGeneration) {
        this.rootView = rootView;
        this.ivReportsGeneration = ivReportsGeneration;
        this.main = main;
        this.f50995rv = rv;
        this.shareLayout = shareLayout;
        this.srf = srf;
        this.tvReportsGeneration = tvReportsGeneration;
    }

    @NonNull
    public static ActivityResourceRenewalBinding bind(@NonNull View rootView) {
        int i = R.id.iv_reports_generation;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_reports_generation);
        if (appCompatImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i = R.id.f51422rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (recyclerView != null) {
                i = R.id.share_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_layout);
                if (linearLayout != null) {
                    i = R.id.srf;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
                    if (swipeRefreshLayout != null) {
                        i = R.id.tv_reports_generation;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_reports_generation);
                        if (textView != null) {
                            return new ActivityResourceRenewalBinding(constraintLayout, appCompatImageView, constraintLayout, recyclerView, linearLayout, swipeRefreshLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityResourceRenewalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityResourceRenewalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_resource_renewal, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
