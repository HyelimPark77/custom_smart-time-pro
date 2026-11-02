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
        int i = R.id.btPointsDetail;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btPointsDetail);
        if (relativeLayout != null) {
            i = R.id.btRecharge;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.btRecharge);
            if (frameLayout != null) {
                i = R.id.btUserOrder;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btUserOrder);
                if (relativeLayout2 != null) {
                    i = R.id.me_points_layout;
                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.me_points_layout);
                    if (relativeLayout3 != null) {
                        i = R.id.tvRecharge;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvRecharge);
                        if (textView != null) {
                            i = R.id.user_order_ai_benefit_package;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.user_order_ai_benefit_package);
                            if (pFMedium != null) {
                                i = R.id.user_order_ai_benefit_package_tip;
                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.user_order_ai_benefit_package_tip);
                                if (pFMedium2 != null) {
                                    i = R.id.user_order_horizontal_recycler;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.user_order_horizontal_recycler);
                                    if (recyclerView != null) {
                                        return new MeItemUserOrderBinding((LinearLayout) rootView, relativeLayout, frameLayout, relativeLayout2, relativeLayout3, textView, pFMedium, pFMedium2, recyclerView);
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
    public static MeItemUserOrderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MeItemUserOrderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.me_item_user_order, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
