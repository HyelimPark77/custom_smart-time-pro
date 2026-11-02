package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButtonV2;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDialPayWatchfaceDetailBinding implements ViewBinding {

    @NonNull
    public final LinearLayout dialPayDetailBtn;

    @NonNull
    public final NestedScrollView dialWatchfaceDetailScrollview;

    @NonNull
    public final PFMedium itemDialPayDetailAlsoLike;

    @NonNull
    public final ImageView iv;

    @NonNull
    public final ProgressButtonV2 openMembership;

    @NonNull
    public final FrameLayout openMembershipLayout;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityDialPayWatchfaceDetailBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout dialPayDetailBtn, @NonNull NestedScrollView dialWatchfaceDetailScrollview, @NonNull PFMedium itemDialPayDetailAlsoLike, @NonNull ImageView iv, @NonNull ProgressButtonV2 openMembership, @NonNull FrameLayout openMembershipLayout, @NonNull RecyclerView recyclerView, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.dialPayDetailBtn = dialPayDetailBtn;
        this.dialWatchfaceDetailScrollview = dialWatchfaceDetailScrollview;
        this.itemDialPayDetailAlsoLike = itemDialPayDetailAlsoLike;
        this.iv = iv;
        this.openMembership = openMembership;
        this.openMembershipLayout = openMembershipLayout;
        this.recyclerView = recyclerView;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityDialPayWatchfaceDetailBinding bind(@NonNull View rootView) {
        int r0 = R.id.dial_pay_detail_btn;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dial_pay_detail_btn);
        if (r4 == null) goto L19;
        r0 = R.id.dial_watchface_detail_scrollview;
        NestedScrollView r5 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.dial_watchface_detail_scrollview);
        if (r5 == null) goto L19;
        r0 = R.id.item_dial_pay_detail_also_like;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_also_like);
        if (r6 == null) goto L19;
        r0 = R.id.iv;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r7 == null) goto L19;
        r0 = R.id.open_membership;
        ProgressButtonV2 r8 = (ProgressButtonV2) ViewBindings.findChildViewById(rootView, R.id.open_membership);
        if (r8 == null) goto L19;
        r0 = R.id.open_membership_layout;
        FrameLayout r9 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.open_membership_layout);
        if (r9 == null) goto L19;
        r0 = R.id.recycler_view;
        RecyclerView r10 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
        if (r10 == null) goto L19;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityDialPayWatchfaceDetailBinding(r3, r4, r5, r6, r7, r8, r9, r10, r3);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDialPayWatchfaceDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDialPayWatchfaceDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_dial_pay_watchface_detail, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
