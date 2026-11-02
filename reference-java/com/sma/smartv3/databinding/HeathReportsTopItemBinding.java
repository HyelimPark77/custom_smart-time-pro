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
        int i = R.id.iv_avatar;
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (imageViewRound != null) {
            i = R.id.tv_abnormal;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_abnormal);
            if (textView != null) {
                i = R.id.tv_height_weight;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_height_weight);
                if (textView2 != null) {
                    i = R.id.tv_name;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                    if (textView3 != null) {
                        i = R.id.tv_report_times;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_report_times);
                        if (textView4 != null) {
                            i = R.id.tv_this_content;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_this_content);
                            if (textView5 != null) {
                                return new HeathReportsTopItemBinding((ConstraintLayout) rootView, imageViewRound, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeathReportsTopItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeathReportsTopItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heath_reports_top_item, parent, false);
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
