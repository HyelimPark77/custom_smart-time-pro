package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class MeItemUserOrderBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout btPointsDetail;

    @NonNull
    public final FrameLayout btRecharge;

    @NonNull
    public final RelativeLayout btUserOrder;

    @NonNull
    public final RelativeLayout mePointsLayout;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvRecharge;

    @NonNull
    public final PFMedium userOrderAiBenefitPackage;

    @NonNull
    public final PFMedium userOrderAiBenefitPackageTip;

    @NonNull
    public final RecyclerView userOrderHorizontalRecycler;

    private MeItemUserOrderBinding(@NonNull LinearLayout rootView, @NonNull RelativeLayout btPointsDetail, @NonNull FrameLayout btRecharge, @NonNull RelativeLayout btUserOrder, @NonNull RelativeLayout mePointsLayout, @NonNull TextView tvRecharge, @NonNull PFMedium userOrderAiBenefitPackage, @NonNull PFMedium userOrderAiBenefitPackageTip, @NonNull RecyclerView userOrderHorizontalRecycler) {
        this.rootView = rootView;
        this.btPointsDetail = btPointsDetail;
        this.btRecharge = btRecharge;
        this.btUserOrder = btUserOrder;
        this.mePointsLayout = mePointsLayout;
        this.tvRecharge = tvRecharge;
        this.userOrderAiBenefitPackage = userOrderAiBenefitPackage;
        this.userOrderAiBenefitPackageTip = userOrderAiBenefitPackageTip;
        this.userOrderHorizontalRecycler = userOrderHorizontalRecycler;
    }

    @NonNull
    public static MeItemUserOrderBinding bind(@NonNull View rootView) {
        int r0 = R.id.btPointsDetail;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btPointsDetail);
        if (r4 == null) goto L21;
        r0 = R.id.btRecharge;
        FrameLayout r5 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.btRecharge);
        if (r5 == null) goto L21;
        r0 = R.id.btUserOrder;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btUserOrder);
        if (r6 == null) goto L21;
        r0 = R.id.me_points_layout;
        RelativeLayout r7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.me_points_layout);
        if (r7 == null) goto L21;
        r0 = R.id.tvRecharge;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvRecharge);
        if (r8 == null) goto L21;
        r0 = R.id.user_order_ai_benefit_package;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.user_order_ai_benefit_package);
        if (r9 == null) goto L21;
        r0 = R.id.user_order_ai_benefit_package_tip;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.user_order_ai_benefit_package_tip);
        if (r10 == null) goto L21;
        r0 = R.id.user_order_horizontal_recycler;
        RecyclerView r11 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.user_order_horizontal_recycler);
        if (r11 == null) goto L21;
        return new MeItemUserOrderBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static MeItemUserOrderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static MeItemUserOrderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.me_item_user_order, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
