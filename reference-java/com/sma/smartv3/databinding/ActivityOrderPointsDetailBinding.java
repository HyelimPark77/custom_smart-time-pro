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
        int i = R.id.ai_answer_fl_bg;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ai_answer_fl_bg);
        if (frameLayout != null) {
            i = R.id.btn_recharge;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_recharge);
            if (button != null) {
                i = R.id.order_points_detail_title_bg;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.order_points_detail_title_bg);
                if (linearLayout != null) {
                    FrameLayout frameLayout2 = (FrameLayout) rootView;
                    i = R.id.root_view;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.root_view);
                    if (linearLayout2 != null) {
                        i = R.id.rv_points_detail;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_points_detail);
                        if (recyclerView != null) {
                            i = R.id.tv_points;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_points);
                            if (pFMedium != null) {
                                return new ActivityOrderPointsDetailBinding(frameLayout2, frameLayout, button, linearLayout, frameLayout2, linearLayout2, recyclerView, pFMedium);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOrderPointsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityOrderPointsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_order_points_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView_;
    }
}
