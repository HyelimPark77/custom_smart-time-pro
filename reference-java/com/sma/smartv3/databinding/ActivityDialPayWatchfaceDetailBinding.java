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

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f50975iv;

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
        this.f50975iv = iv;
        this.openMembership = openMembership;
        this.openMembershipLayout = openMembershipLayout;
        this.recyclerView = recyclerView;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityDialPayWatchfaceDetailBinding bind(@NonNull View rootView) {
        int i = R.id.dial_pay_detail_btn;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dial_pay_detail_btn);
        if (linearLayout != null) {
            i = R.id.dial_watchface_detail_scrollview;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.dial_watchface_detail_scrollview);
            if (nestedScrollView != null) {
                i = R.id.item_dial_pay_detail_also_like;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_also_like);
                if (pFMedium != null) {
                    i = R.id.f51417iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
                    if (imageView != null) {
                        i = R.id.open_membership;
                        ProgressButtonV2 progressButtonV2 = (ProgressButtonV2) ViewBindings.findChildViewById(rootView, R.id.open_membership);
                        if (progressButtonV2 != null) {
                            i = R.id.open_membership_layout;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.open_membership_layout);
                            if (frameLayout != null) {
                                i = R.id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
                                if (recyclerView != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) rootView;
                                    return new ActivityDialPayWatchfaceDetailBinding(linearLayout2, linearLayout, nestedScrollView, pFMedium, imageView, progressButtonV2, frameLayout, recyclerView, linearLayout2);
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
    public static ActivityDialPayWatchfaceDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDialPayWatchfaceDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_dial_pay_watchface_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
