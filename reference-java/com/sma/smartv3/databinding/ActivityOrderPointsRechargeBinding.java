package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityOrderPointsRechargeBinding implements ViewBinding {

    @NonNull
    public final FrameLayout aiAnswerFlBg;

    @NonNull
    public final CardView btRecharge;

    @NonNull
    public final Button btnRecharge;

    @NonNull
    public final AppCompatCheckBox cbPointsPrivacy;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final FrameLayout pointsRechargeBgLayout;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final FrameLayout rootView_;

    @NonNull
    public final RecyclerView rvPointsPack;

    @NonNull
    public final PFMedium tvNickname;

    @NonNull
    public final PFMedium tvPoints;

    @NonNull
    public final PFMedium tvPointsPrivacy;

    private ActivityOrderPointsRechargeBinding(@NonNull FrameLayout rootView_, @NonNull FrameLayout aiAnswerFlBg, @NonNull CardView btRecharge, @NonNull Button btnRecharge, @NonNull AppCompatCheckBox cbPointsPrivacy, @NonNull ImageViewRound ivAvatar, @NonNull FrameLayout pointsRechargeBgLayout, @NonNull LinearLayout rootView, @NonNull RecyclerView rvPointsPack, @NonNull PFMedium tvNickname, @NonNull PFMedium tvPoints, @NonNull PFMedium tvPointsPrivacy) {
        this.rootView_ = rootView_;
        this.aiAnswerFlBg = aiAnswerFlBg;
        this.btRecharge = btRecharge;
        this.btnRecharge = btnRecharge;
        this.cbPointsPrivacy = cbPointsPrivacy;
        this.ivAvatar = ivAvatar;
        this.pointsRechargeBgLayout = pointsRechargeBgLayout;
        this.rootView = rootView;
        this.rvPointsPack = rvPointsPack;
        this.tvNickname = tvNickname;
        this.tvPoints = tvPoints;
        this.tvPointsPrivacy = tvPointsPrivacy;
    }

    @NonNull
    public static ActivityOrderPointsRechargeBinding bind(@NonNull View rootView) {
        int i = R.id.ai_answer_fl_bg;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ai_answer_fl_bg);
        if (frameLayout != null) {
            i = R.id.btRecharge;
            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.btRecharge);
            if (cardView != null) {
                i = R.id.btn_recharge;
                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_recharge);
                if (button != null) {
                    i = R.id.cb_points_privacy;
                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_points_privacy);
                    if (appCompatCheckBox != null) {
                        i = R.id.iv_avatar;
                        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                        if (imageViewRound != null) {
                            FrameLayout frameLayout2 = (FrameLayout) rootView;
                            i = R.id.root_view;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.root_view);
                            if (linearLayout != null) {
                                i = R.id.rv_points_pack;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_points_pack);
                                if (recyclerView != null) {
                                    i = R.id.tv_nickname;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_nickname);
                                    if (pFMedium != null) {
                                        i = R.id.tv_points;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_points);
                                        if (pFMedium2 != null) {
                                            i = R.id.tv_points_privacy;
                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_points_privacy);
                                            if (pFMedium3 != null) {
                                                return new ActivityOrderPointsRechargeBinding(frameLayout2, frameLayout, cardView, button, appCompatCheckBox, imageViewRound, frameLayout2, linearLayout, recyclerView, pFMedium, pFMedium2, pFMedium3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOrderPointsRechargeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityOrderPointsRechargeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_order_points_recharge, parent, false);
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
