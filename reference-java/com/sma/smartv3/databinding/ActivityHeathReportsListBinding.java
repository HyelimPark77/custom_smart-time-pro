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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50980rv;

    @NonNull
    public final LinearLayout shareLayout;

    @NonNull
    public final TextView tvReportsGeneration;

    private ActivityHeathReportsListBinding(@NonNull LinearLayout rootView, @NonNull AppCompatImageView ivReportsGeneration, @NonNull RecyclerView rv, @NonNull LinearLayout shareLayout, @NonNull TextView tvReportsGeneration) {
        this.rootView = rootView;
        this.ivReportsGeneration = ivReportsGeneration;
        this.f50980rv = rv;
        this.shareLayout = shareLayout;
        this.tvReportsGeneration = tvReportsGeneration;
    }

    @NonNull
    public static ActivityHeathReportsListBinding bind(@NonNull View rootView) {
        int i = R.id.iv_reports_generation;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_reports_generation);
        if (appCompatImageView != null) {
            i = R.id.f51422rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (recyclerView != null) {
                i = R.id.share_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_layout);
                if (linearLayout != null) {
                    i = R.id.tv_reports_generation;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_reports_generation);
                    if (textView != null) {
                        return new ActivityHeathReportsListBinding((LinearLayout) rootView, appCompatImageView, recyclerView, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHeathReportsListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHeathReportsListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_heath_reports_list, parent, false);
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
