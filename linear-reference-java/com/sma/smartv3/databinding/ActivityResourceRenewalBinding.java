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

    @NonNull
    public final RecyclerView rv;

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
        this.rv = rv;
        this.shareLayout = shareLayout;
        this.srf = srf;
        this.tvReportsGeneration = tvReportsGeneration;
    }

    @NonNull
    public static ActivityResourceRenewalBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_reports_generation;
        AppCompatImageView r4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_reports_generation);
        if (r4 == null) goto L15;
        ConstraintLayout r3 = (ConstraintLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r6 == null) goto L15;
        r0 = R.id.share_layout;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_layout);
        if (r7 == null) goto L15;
        r0 = R.id.srf;
        SwipeRefreshLayout r8 = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
        if (r8 == null) goto L15;
        r0 = R.id.tv_reports_generation;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_reports_generation);
        if (r9 == null) goto L15;
        return new ActivityResourceRenewalBinding(r3, r4, r3, r6, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityResourceRenewalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityResourceRenewalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_resource_renewal, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
