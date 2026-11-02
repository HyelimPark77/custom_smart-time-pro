package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class HeathReportsItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvStateView;

    @NonNull
    public final TextView tvTopTitle;

    @NonNull
    public final TextView tvValue;

    private HeathReportsItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView tvStateView, @NonNull TextView tvTopTitle, @NonNull TextView tvValue) {
        this.rootView = rootView;
        this.tvStateView = tvStateView;
        this.tvTopTitle = tvTopTitle;
        this.tvValue = tvValue;
    }

    @NonNull
    public static HeathReportsItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.tv_state_view;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_state_view);
        if (r1 == null) goto L11;
        r0 = R.id.tv_top_title;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_top_title);
        if (r2 == null) goto L11;
        r0 = R.id.tv_value;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_value);
        if (r3 == null) goto L11;
        return new HeathReportsItemBinding((ConstraintLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static HeathReportsItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static HeathReportsItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.heath_reports_item, parent, false);
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
