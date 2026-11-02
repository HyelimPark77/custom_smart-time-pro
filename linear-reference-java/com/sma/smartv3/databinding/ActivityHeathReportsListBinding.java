package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityHeathReportsListBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView ivReportsGeneration;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final LinearLayout shareLayout;

    @NonNull
    public final TextView tvReportsGeneration;

    private ActivityHeathReportsListBinding(@NonNull LinearLayout rootView, @NonNull AppCompatImageView ivReportsGeneration, @NonNull RecyclerView rv, @NonNull LinearLayout shareLayout, @NonNull TextView tvReportsGeneration) {
        this.rootView = rootView;
        this.ivReportsGeneration = ivReportsGeneration;
        this.rv = rv;
        this.shareLayout = shareLayout;
        this.tvReportsGeneration = tvReportsGeneration;
    }

    @NonNull
    public static ActivityHeathReportsListBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_reports_generation;
        AppCompatImageView r4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_reports_generation);
        if (r4 == null) goto L13;
        r0 = R.id.rv;
        RecyclerView r5 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r5 == null) goto L13;
        r0 = R.id.share_layout;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_layout);
        if (r6 == null) goto L13;
        r0 = R.id.tv_reports_generation;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_reports_generation);
        if (r7 == null) goto L13;
        return new ActivityHeathReportsListBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityHeathReportsListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityHeathReportsListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_heath_reports_list, parent, false);
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
