package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityOrderPointsDetailBinding implements ViewBinding {

    @NonNull
    public final FrameLayout aiAnswerFlBg;

    @NonNull
    public final Button btnRecharge;

    @NonNull
    public final LinearLayout orderPointsDetailTitleBg;

    @NonNull
    public final FrameLayout pointsRechargeBgLayout;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final FrameLayout rootView_;

    @NonNull
    public final RecyclerView rvPointsDetail;

    @NonNull
    public final PFMedium tvPoints;

    private ActivityOrderPointsDetailBinding(@NonNull FrameLayout rootView_, @NonNull FrameLayout aiAnswerFlBg, @NonNull Button btnRecharge, @NonNull LinearLayout orderPointsDetailTitleBg, @NonNull FrameLayout pointsRechargeBgLayout, @NonNull LinearLayout rootView, @NonNull RecyclerView rvPointsDetail, @NonNull PFMedium tvPoints) {
        this.rootView_ = rootView_;
        this.aiAnswerFlBg = aiAnswerFlBg;
        this.btnRecharge = btnRecharge;
        this.orderPointsDetailTitleBg = orderPointsDetailTitleBg;
        this.pointsRechargeBgLayout = pointsRechargeBgLayout;
        this.rootView = rootView;
        this.rvPointsDetail = rvPointsDetail;
        this.tvPoints = tvPoints;
    }

    @NonNull
    public static ActivityOrderPointsDetailBinding bind(@NonNull View rootView) {
        int r0 = R.id.ai_answer_fl_bg;
        FrameLayout r4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ai_answer_fl_bg);
        if (r4 == null) goto L17;
        r0 = R.id.btn_recharge;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_recharge);
        if (r5 == null) goto L17;
        r0 = R.id.order_points_detail_title_bg;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.order_points_detail_title_bg);
        if (r6 == null) goto L17;
        FrameLayout r3 = (FrameLayout) rootView;
        r0 = R.id.root_view;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.root_view);
        if (r8 == null) goto L17;
        r0 = R.id.rv_points_detail;
        RecyclerView r9 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_points_detail);
        if (r9 == null) goto L17;
        r0 = R.id.tv_points;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_points);
        if (r10 == null) goto L17;
        return new ActivityOrderPointsDetailBinding(r3, r4, r5, r6, r3, r8, r9, r10);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityOrderPointsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityOrderPointsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_order_points_detail, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView_;
    }
}
