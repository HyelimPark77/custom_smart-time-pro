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
import com.sma.smartv3.view.ImageViewRound;

/* JADX INFO: loaded from: classes19.dex */
public final class HeathReportsTopItemBinding implements ViewBinding {

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvAbnormal;

    @NonNull
    public final TextView tvHeightWeight;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final TextView tvReportTimes;

    @NonNull
    public final TextView tvThisContent;

    private HeathReportsTopItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageViewRound ivAvatar, @NonNull TextView tvAbnormal, @NonNull TextView tvHeightWeight, @NonNull TextView tvName, @NonNull TextView tvReportTimes, @NonNull TextView tvThisContent) {
        this.rootView = rootView;
        this.ivAvatar = ivAvatar;
        this.tvAbnormal = tvAbnormal;
        this.tvHeightWeight = tvHeightWeight;
        this.tvName = tvName;
        this.tvReportTimes = tvReportTimes;
        this.tvThisContent = tvThisContent;
    }

    @NonNull
    public static HeathReportsTopItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_avatar;
        ImageViewRound r4 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r4 == null) goto L17;
        r0 = R.id.tv_abnormal;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_abnormal);
        if (r5 == null) goto L17;
        r0 = R.id.tv_height_weight;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_height_weight);
        if (r6 == null) goto L17;
        r0 = R.id.tv_name;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r7 == null) goto L17;
        r0 = R.id.tv_report_times;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_report_times);
        if (r8 == null) goto L17;
        r0 = R.id.tv_this_content;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_this_content);
        if (r9 == null) goto L17;
        return new HeathReportsTopItemBinding((ConstraintLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static HeathReportsTopItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static HeathReportsTopItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.heath_reports_top_item, parent, false);
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
