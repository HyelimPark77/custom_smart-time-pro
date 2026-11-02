package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.ViewPagerForScrollView;
import com.sma.smartv3.view.dial.DialElementView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWatchfaceVideoBinding implements ViewBinding {

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
    public final EditText etFrameEdit;

    @NonNull
    public final ImageView ivFrameAdd;

    @NonNull
    public final ImageView ivFrameReduce;

    @NonNull
    public final NestedScrollView nestedScrollView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final DialElementView timeDigitalView;

    @NonNull
    public final ImageView timePointView;

    @NonNull
    public final ImageView timeScaleView;

    @NonNull
    public final TextView tvMaxCount;

    @NonNull
    public final ViewPagerForScrollView viewPager;

    @NonNull
    public final CardView watchfaceView;

    private ActivityWatchfaceVideoBinding(@NonNull LinearLayout rootView_, @NonNull DialElementView controlViewCa, @NonNull DialElementView controlViewDis, @NonNull DialElementView controlViewHr, @NonNull DialElementView controlViewStep, @NonNull ImageViewRound customizeDialBg, @NonNull EditText etFrameEdit, @NonNull ImageView ivFrameAdd, @NonNull ImageView ivFrameReduce, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout rootView, @NonNull TabLayout table, @NonNull DialElementView timeDigitalView, @NonNull ImageView timePointView, @NonNull ImageView timeScaleView, @NonNull TextView tvMaxCount, @NonNull ViewPagerForScrollView viewPager, @NonNull CardView watchfaceView) {
        this.rootView_ = rootView_;
        this.controlViewCa = controlViewCa;
        this.controlViewDis = controlViewDis;
        this.controlViewHr = controlViewHr;
        this.controlViewStep = controlViewStep;
        this.customizeDialBg = customizeDialBg;
        this.etFrameEdit = etFrameEdit;
        this.ivFrameAdd = ivFrameAdd;
        this.ivFrameReduce = ivFrameReduce;
        this.nestedScrollView = nestedScrollView;
        this.rootView = rootView;
        this.table = table;
        this.timeDigitalView = timeDigitalView;
        this.timePointView = timePointView;
        this.timeScaleView = timeScaleView;
        this.tvMaxCount = tvMaxCount;
        this.viewPager = viewPager;
        this.watchfaceView = watchfaceView;
    }

    @NonNull
    public static ActivityWatchfaceVideoBinding bind(@NonNull View rootView) {
        int r1 = R.id.controlViewCa;
        DialElementView r5 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewCa);
        if (r5 == null) goto L37;
        r1 = R.id.controlViewDis;
        DialElementView r6 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewDis);
        if (r6 == null) goto L37;
        r1 = R.id.controlViewHr;
        DialElementView r7 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewHr);
        if (r7 == null) goto L37;
        r1 = R.id.controlViewStep;
        DialElementView r8 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewStep);
        if (r8 == null) goto L37;
        r1 = R.id.customizeDialBg;
        ImageViewRound r9 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.customizeDialBg);
        if (r9 == null) goto L37;
        r1 = R.id.et_frame_edit;
        EditText r10 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_frame_edit);
        if (r10 == null) goto L37;
        r1 = R.id.iv_frame_add;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_frame_add);
        if (r11 == null) goto L37;
        r1 = R.id.iv_frame_reduce;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_frame_reduce);
        if (r12 == null) goto L37;
        r1 = R.id.nestedScrollView;
        NestedScrollView r13 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.nestedScrollView);
        if (r13 == null) goto L37;
        LinearLayout r4 = (LinearLayout) rootView;
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
        r1 = R.id.tv_max_count;
        TextView r19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_max_count);
        if (r19 == null) goto L37;
        r1 = R.id.view_pager;
        ViewPagerForScrollView r20 = (ViewPagerForScrollView) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r20 == null) goto L37;
        r1 = R.id.watchface_view;
        CardView r21 = (CardView) ViewBindings.findChildViewById(rootView, R.id.watchface_view);
        if (r21 == null) goto L37;
        return new ActivityWatchfaceVideoBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r4, r15, r16, r17, r18, r19, r20, r21);
    L37:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityWatchfaceVideoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityWatchfaceVideoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_watchface_video, parent, false);
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
