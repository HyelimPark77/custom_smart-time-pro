package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMainGuideLayoutBinding implements ViewBinding {

    @NonNull
    public final View bottomView;

    @NonNull
    public final AppCompatImageView guideBottomView;

    @NonNull
    public final AppCompatImageView guideMiddleView;

    @NonNull
    public final View guideTopView;

    @NonNull
    public final AppCompatImageView ivBindingComplete;

    @NonNull
    public final AppCompatImageView ivBindingCompleteBottom;

    @NonNull
    public final AppCompatImageView ivClose;

    @NonNull
    public final AppCompatImageView ivLlBottom1;

    @NonNull
    public final AppCompatImageView ivLlBottom2;

    @NonNull
    public final AppCompatImageView ivLlBottom3;

    @NonNull
    public final AppCompatImageView ivLlBottom4;

    @NonNull
    public final AppCompatImageView ivLlBottom5;

    @NonNull
    public final View ivLlBottomView1;

    @NonNull
    public final View ivLlBottomView2;

    @NonNull
    public final View ivLlBottomView3;

    @NonNull
    public final View ivLlBottomView4;

    @NonNull
    public final View ivLlBottomView5;

    @NonNull
    public final LinearLayoutCompat llBottomView1;

    @NonNull
    public final LinearLayoutCompat llBottomView2;

    @NonNull
    public final LinearLayoutCompat llBottomView3;

    @NonNull
    public final LinearLayoutCompat llBottomView4;

    @NonNull
    public final LinearLayoutCompat llBottomView5;

    @NonNull
    public final LinearLayoutCompat llPointLayout;

    @NonNull
    public final View pointView1;

    @NonNull
    public final View pointView2;

    @NonNull
    public final View pointView3;

    @NonNull
    public final View pointView4;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvBindingCompleteTitle;

    @NonNull
    public final TextView tvBundleDeviceTitle;

    @NonNull
    public final TextView tvNext;

    @NonNull
    public final TextView tvTopHintTitle;

    @NonNull
    public final TextView tvTopMiddleTitle;

    private ActivityMainGuideLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bottomView, @NonNull AppCompatImageView guideBottomView, @NonNull AppCompatImageView guideMiddleView, @NonNull View guideTopView, @NonNull AppCompatImageView ivBindingComplete, @NonNull AppCompatImageView ivBindingCompleteBottom, @NonNull AppCompatImageView ivClose, @NonNull AppCompatImageView ivLlBottom1, @NonNull AppCompatImageView ivLlBottom2, @NonNull AppCompatImageView ivLlBottom3, @NonNull AppCompatImageView ivLlBottom4, @NonNull AppCompatImageView ivLlBottom5, @NonNull View ivLlBottomView1, @NonNull View ivLlBottomView2, @NonNull View ivLlBottomView3, @NonNull View ivLlBottomView4, @NonNull View ivLlBottomView5, @NonNull LinearLayoutCompat llBottomView1, @NonNull LinearLayoutCompat llBottomView2, @NonNull LinearLayoutCompat llBottomView3, @NonNull LinearLayoutCompat llBottomView4, @NonNull LinearLayoutCompat llBottomView5, @NonNull LinearLayoutCompat llPointLayout, @NonNull View pointView1, @NonNull View pointView2, @NonNull View pointView3, @NonNull View pointView4, @NonNull TextView tvBindingCompleteTitle, @NonNull TextView tvBundleDeviceTitle, @NonNull TextView tvNext, @NonNull TextView tvTopHintTitle, @NonNull TextView tvTopMiddleTitle) {
        this.rootView = rootView;
        this.bottomView = bottomView;
        this.guideBottomView = guideBottomView;
        this.guideMiddleView = guideMiddleView;
        this.guideTopView = guideTopView;
        this.ivBindingComplete = ivBindingComplete;
        this.ivBindingCompleteBottom = ivBindingCompleteBottom;
        this.ivClose = ivClose;
        this.ivLlBottom1 = ivLlBottom1;
        this.ivLlBottom2 = ivLlBottom2;
        this.ivLlBottom3 = ivLlBottom3;
        this.ivLlBottom4 = ivLlBottom4;
        this.ivLlBottom5 = ivLlBottom5;
        this.ivLlBottomView1 = ivLlBottomView1;
        this.ivLlBottomView2 = ivLlBottomView2;
        this.ivLlBottomView3 = ivLlBottomView3;
        this.ivLlBottomView4 = ivLlBottomView4;
        this.ivLlBottomView5 = ivLlBottomView5;
        this.llBottomView1 = llBottomView1;
        this.llBottomView2 = llBottomView2;
        this.llBottomView3 = llBottomView3;
        this.llBottomView4 = llBottomView4;
        this.llBottomView5 = llBottomView5;
        this.llPointLayout = llPointLayout;
        this.pointView1 = pointView1;
        this.pointView2 = pointView2;
        this.pointView3 = pointView3;
        this.pointView4 = pointView4;
        this.tvBindingCompleteTitle = tvBindingCompleteTitle;
        this.tvBundleDeviceTitle = tvBundleDeviceTitle;
        this.tvNext = tvNext;
        this.tvTopHintTitle = tvTopHintTitle;
        this.tvTopMiddleTitle = tvTopMiddleTitle;
    }

    @NonNull
    public static ActivityMainGuideLayoutBinding bind(@NonNull View rootView) {
        int r1 = R.id.bottom_view;
        View r4 = ViewBindings.findChildViewById(rootView, R.id.bottom_view);
        if (r4 == null) goto L69;
        r1 = R.id.guide_bottom_view;
        AppCompatImageView r5 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.guide_bottom_view);
        if (r5 == null) goto L69;
        r1 = R.id.guide_middle_view;
        AppCompatImageView r6 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.guide_middle_view);
        if (r6 == null) goto L69;
        r1 = R.id.guide_top_view;
        View r7 = ViewBindings.findChildViewById(rootView, R.id.guide_top_view);
        if (r7 == null) goto L69;
        r1 = R.id.iv_binding_complete;
        AppCompatImageView r8 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_binding_complete);
        if (r8 == null) goto L69;
        r1 = R.id.iv_binding_complete_bottom;
        AppCompatImageView r9 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_binding_complete_bottom);
        if (r9 == null) goto L69;
        r1 = R.id.iv_close;
        AppCompatImageView r10 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_close);
        if (r10 == null) goto L69;
        r1 = R.id.iv_ll_bottom_1;
        AppCompatImageView r11 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_1);
        if (r11 == null) goto L69;
        r1 = R.id.iv_ll_bottom_2;
        AppCompatImageView r12 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_2);
        if (r12 == null) goto L69;
        r1 = R.id.iv_ll_bottom_3;
        AppCompatImageView r13 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_3);
        if (r13 == null) goto L69;
        r1 = R.id.iv_ll_bottom_4;
        AppCompatImageView r14 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_4);
        if (r14 == null) goto L69;
        r1 = R.id.iv_ll_bottom_5;
        AppCompatImageView r15 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_5);
        if (r15 == null) goto L69;
        r1 = R.id.iv_ll_bottom_view_1;
        View r16 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_1);
        if (r16 == null) goto L69;
        r1 = R.id.iv_ll_bottom_view_2;
        View r17 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_2);
        if (r17 == null) goto L69;
        r1 = R.id.iv_ll_bottom_view_3;
        View r18 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_3);
        if (r18 == null) goto L69;
        r1 = R.id.iv_ll_bottom_view_4;
        View r19 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_4);
        if (r19 == null) goto L69;
        r1 = R.id.iv_ll_bottom_view_5;
        View r20 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_5);
        if (r20 == null) goto L69;
        r1 = R.id.ll_bottom_view_1;
        LinearLayoutCompat r21 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_1);
        if (r21 == null) goto L69;
        r1 = R.id.ll_bottom_view_2;
        LinearLayoutCompat r22 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_2);
        if (r22 == null) goto L69;
        r1 = R.id.ll_bottom_view_3;
        LinearLayoutCompat r23 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_3);
        if (r23 == null) goto L69;
        r1 = R.id.ll_bottom_view_4;
        LinearLayoutCompat r24 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_4);
        if (r24 == null) goto L69;
        r1 = R.id.ll_bottom_view_5;
        LinearLayoutCompat r25 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_5);
        if (r25 == null) goto L69;
        r1 = R.id.ll_point_layout;
        LinearLayoutCompat r26 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_point_layout);
        if (r26 == null) goto L69;
        r1 = R.id.point_view_1;
        View r27 = ViewBindings.findChildViewById(rootView, R.id.point_view_1);
        if (r27 == null) goto L69;
        r1 = R.id.point_view_2;
        View r28 = ViewBindings.findChildViewById(rootView, R.id.point_view_2);
        if (r28 == null) goto L69;
        r1 = R.id.point_view_3;
        View r29 = ViewBindings.findChildViewById(rootView, R.id.point_view_3);
        if (r29 == null) goto L69;
        r1 = R.id.point_view_4;
        View r30 = ViewBindings.findChildViewById(rootView, R.id.point_view_4);
        if (r30 == null) goto L69;
        r1 = R.id.tv_binding_complete_title;
        TextView r31 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_binding_complete_title);
        if (r31 == null) goto L69;
        r1 = R.id.tv_bundle_device_title;
        TextView r32 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_bundle_device_title);
        if (r32 == null) goto L69;
        r1 = R.id.tv_next;
        TextView r33 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_next);
        if (r33 == null) goto L69;
        r1 = R.id.tv_top_hint_title;
        TextView r34 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_top_hint_title);
        if (r34 == null) goto L69;
        r1 = R.id.tv_top_middle_title;
        TextView r35 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_top_middle_title);
        if (r35 == null) goto L69;
        return new ActivityMainGuideLayoutBinding((ConstraintLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35);
    L69:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityMainGuideLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMainGuideLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_main_guide_layout, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
