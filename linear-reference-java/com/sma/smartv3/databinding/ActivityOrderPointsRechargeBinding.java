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
        int r0 = R.id.ai_answer_fl_bg;
        FrameLayout r4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ai_answer_fl_bg);
        if (r4 == null) goto L25;
        r0 = R.id.btRecharge;
        CardView r5 = (CardView) ViewBindings.findChildViewById(rootView, R.id.btRecharge);
        if (r5 == null) goto L25;
        r0 = R.id.btn_recharge;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_recharge);
        if (r6 == null) goto L25;
        r0 = R.id.cb_points_privacy;
        AppCompatCheckBox r7 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_points_privacy);
        if (r7 == null) goto L25;
        r0 = R.id.iv_avatar;
        ImageViewRound r8 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r8 == null) goto L25;
        FrameLayout r3 = (FrameLayout) rootView;
        r0 = R.id.root_view;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.root_view);
        if (r10 == null) goto L25;
        r0 = R.id.rv_points_pack;
        RecyclerView r11 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_points_pack);
        if (r11 == null) goto L25;
        r0 = R.id.tv_nickname;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_nickname);
        if (r12 == null) goto L25;
        r0 = R.id.tv_points;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_points);
        if (r13 == null) goto L25;
        r0 = R.id.tv_points_privacy;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_points_privacy);
        if (r14 == null) goto L25;
        return new ActivityOrderPointsRechargeBinding(r3, r4, r5, r6, r7, r8, r3, r10, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityOrderPointsRechargeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityOrderPointsRechargeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_order_points_recharge, parent, false);
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
