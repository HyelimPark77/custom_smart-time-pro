package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.ViewPagerForScrollView;
import com.sma.smartv3.view.dial.DialElementView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWatchfaceCustomBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout addBg;

    @NonNull
    public final DialElementView controlViewCa;

    @NonNull
    public final DialElementView controlViewDis;

    @NonNull
    public final DialElementView controlViewHr;

    @NonNull
    public final DialElementView controlViewStep;

    @NonNull
    public final ImageViewRound customizeDialBg;

    @NonNull
    public final ImageView ivAddTop;

    @NonNull
    public final NestedScrollView nestedScrollView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rvBg;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final DialElementView timeDigitalView;

    @NonNull
    public final ImageView timePointView;

    @NonNull
    public final ImageView timeScaleView;

    @NonNull
    public final PFMedium tvBgTitle;

    @NonNull
    public final ViewPagerForScrollView viewPager;

    @NonNull
    public final CardView watchfaceView;

    private ActivityWatchfaceCustomBinding(@NonNull LinearLayout rootView_, @NonNull RelativeLayout addBg, @NonNull DialElementView controlViewCa, @NonNull DialElementView controlViewDis, @NonNull DialElementView controlViewHr, @NonNull DialElementView controlViewStep, @NonNull ImageViewRound customizeDialBg, @NonNull ImageView ivAddTop, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout rootView, @NonNull RecyclerView rvBg, @NonNull TabLayout table, @NonNull DialElementView timeDigitalView, @NonNull ImageView timePointView, @NonNull ImageView timeScaleView, @NonNull PFMedium tvBgTitle, @NonNull ViewPagerForScrollView viewPager, @NonNull CardView watchfaceView) {
        this.rootView_ = rootView_;
        this.addBg = addBg;
        this.controlViewCa = controlViewCa;
        this.controlViewDis = controlViewDis;
        this.controlViewHr = controlViewHr;
        this.controlViewStep = controlViewStep;
        this.customizeDialBg = customizeDialBg;
        this.ivAddTop = ivAddTop;
        this.nestedScrollView = nestedScrollView;
        this.rootView = rootView;
        this.rvBg = rvBg;
        this.table = table;
        this.timeDigitalView = timeDigitalView;
        this.timePointView = timePointView;
        this.timeScaleView = timeScaleView;
        this.tvBgTitle = tvBgTitle;
        this.viewPager = viewPager;
        this.watchfaceView = watchfaceView;
    }

    @NonNull
    public static ActivityWatchfaceCustomBinding bind(@NonNull View rootView) {
        int i = R.id.add_bg;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.add_bg);
        if (relativeLayout != null) {
            i = R.id.controlViewCa;
            DialElementView dialElementView = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewCa);
            if (dialElementView != null) {
                i = R.id.controlViewDis;
                DialElementView dialElementView2 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewDis);
                if (dialElementView2 != null) {
                    i = R.id.controlViewHr;
                    DialElementView dialElementView3 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewHr);
                    if (dialElementView3 != null) {
                        i = R.id.controlViewStep;
                        DialElementView dialElementView4 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewStep);
                        if (dialElementView4 != null) {
                            i = R.id.customizeDialBg;
                            ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.customizeDialBg);
                            if (imageViewRound != null) {
                                i = R.id.iv_add_top;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_add_top);
                                if (imageView != null) {
                                    i = R.id.nestedScrollView;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.nestedScrollView);
                                    if (nestedScrollView != null) {
                                        LinearLayout linearLayout = (LinearLayout) rootView;
                                        i = R.id.rv_bg;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_bg);
                                        if (recyclerView != null) {
                                            i = R.id.table;
                                            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
                                            if (tabLayout != null) {
                                                i = R.id.timeDigitalView;
                                                DialElementView dialElementView5 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.timeDigitalView);
                                                if (dialElementView5 != null) {
                                                    i = R.id.timePointView;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timePointView);
                                                    if (imageView2 != null) {
                                                        i = R.id.timeScaleView;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timeScaleView);
                                                        if (imageView3 != null) {
                                                            i = R.id.tv_bg_title;
                                                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_bg_title);
                                                            if (pFMedium != null) {
                                                                i = R.id.view_pager;
                                                                ViewPagerForScrollView viewPagerForScrollView = (ViewPagerForScrollView) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                                                                if (viewPagerForScrollView != null) {
                                                                    i = R.id.watchface_view;
                                                                    CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.watchface_view);
                                                                    if (cardView != null) {
                                                                        return new ActivityWatchfaceCustomBinding(linearLayout, relativeLayout, dialElementView, dialElementView2, dialElementView3, dialElementView4, imageViewRound, imageView, nestedScrollView, linearLayout, recyclerView, tabLayout, dialElementView5, imageView2, imageView3, pFMedium, viewPagerForScrollView, cardView);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWatchfaceCustomBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityWatchfaceCustomBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_watchface_custom, parent, false);
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
