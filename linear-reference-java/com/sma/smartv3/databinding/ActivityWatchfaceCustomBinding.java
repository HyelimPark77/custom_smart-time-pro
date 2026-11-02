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
        int r1 = R.id.add_bg;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.add_bg);
        if (r5 == null) goto L37;
        r1 = R.id.controlViewCa;
        DialElementView r6 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewCa);
        if (r6 == null) goto L37;
        r1 = R.id.controlViewDis;
        DialElementView r7 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewDis);
        if (r7 == null) goto L37;
        r1 = R.id.controlViewHr;
        DialElementView r8 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewHr);
        if (r8 == null) goto L37;
        r1 = R.id.controlViewStep;
        DialElementView r9 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewStep);
        if (r9 == null) goto L37;
        r1 = R.id.customizeDialBg;
        ImageViewRound r10 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.customizeDialBg);
        if (r10 == null) goto L37;
        r1 = R.id.iv_add_top;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_add_top);
        if (r11 == null) goto L37;
        r1 = R.id.nestedScrollView;
        NestedScrollView r12 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.nestedScrollView);
        if (r12 == null) goto L37;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.rv_bg;
        RecyclerView r14 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_bg);
        if (r14 == null) goto L37;
        r1 = R.id.table;
        TabLayout r15 = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (r15 == null) goto L37;
        r1 = R.id.timeDigitalView;
        DialElementView r16 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.timeDigitalView);
        if (r16 == null) goto L37;
        r1 = R.id.timePointView;
        ImageView r17 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timePointView);
        if (r17 == null) goto L37;
        r1 = R.id.timeScaleView;
        ImageView r18 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timeScaleView);
        if (r18 == null) goto L37;
        r1 = R.id.tv_bg_title;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_bg_title);
        if (r19 == null) goto L37;
        r1 = R.id.view_pager;
        ViewPagerForScrollView r20 = (ViewPagerForScrollView) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r20 == null) goto L37;
        r1 = R.id.watchface_view;
        CardView r21 = (CardView) ViewBindings.findChildViewById(rootView, R.id.watchface_view);
        if (r21 == null) goto L37;
        return new ActivityWatchfaceCustomBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r4, r14, r15, r16, r17, r18, r19, r20, r21);
    L37:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityWatchfaceCustomBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityWatchfaceCustomBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_watchface_custom, parent, false);
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
