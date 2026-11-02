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
        int i = R.id.tv_state_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_state_view);
        if (textView != null) {
            i = R.id.tv_top_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_top_title);
            if (textView2 != null) {
                i = R.id.tv_value;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_value);
                if (textView3 != null) {
                    return new HeathReportsItemBinding((ConstraintLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeathReportsItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeathReportsItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heath_reports_item, parent, false);
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
