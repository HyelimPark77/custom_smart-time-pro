package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class HistoryReportsItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView ivExceptionMessage;

    @NonNull
    public final View lineView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvExceptionMessage;

    @NonNull
    public final TextView tvTime;

    private HistoryReportsItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView ivExceptionMessage, @NonNull View lineView, @NonNull TextView tvExceptionMessage, @NonNull TextView tvTime) {
        this.rootView = rootView;
        this.ivExceptionMessage = ivExceptionMessage;
        this.lineView = lineView;
        this.tvExceptionMessage = tvExceptionMessage;
        this.tvTime = tvTime;
    }

    @NonNull
    public static HistoryReportsItemBinding bind(@NonNull View rootView) {
        int i = R.id.iv_exception_message;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_exception_message);
        if (appCompatImageView != null) {
            i = R.id.line_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.line_view);
            if (viewFindChildViewById != null) {
                i = R.id.tv_exception_message;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_exception_message);
                if (textView != null) {
                    i = R.id.tv_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                    if (textView2 != null) {
                        return new HistoryReportsItemBinding((ConstraintLayout) rootView, appCompatImageView, viewFindChildViewById, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HistoryReportsItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HistoryReportsItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.history_reports_item, parent, false);
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
