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
        int r0 = R.id.iv_exception_message;
        AppCompatImageView r4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_exception_message);
        if (r4 == null) goto L13;
        r0 = R.id.line_view;
        View r5 = ViewBindings.findChildViewById(rootView, R.id.line_view);
        if (r5 == null) goto L13;
        r0 = R.id.tv_exception_message;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_exception_message);
        if (r6 == null) goto L13;
        r0 = R.id.tv_time;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r7 == null) goto L13;
        return new HistoryReportsItemBinding((ConstraintLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static HistoryReportsItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static HistoryReportsItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.history_reports_item, parent, false);
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
