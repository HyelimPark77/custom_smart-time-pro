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
        int i = R.id.bottom_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_view);
        if (viewFindChildViewById != null) {
            i = R.id.guide_bottom_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.guide_bottom_view);
            if (appCompatImageView != null) {
                i = R.id.guide_middle_view;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.guide_middle_view);
                if (appCompatImageView2 != null) {
                    i = R.id.guide_top_view;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.guide_top_view);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.iv_binding_complete;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_binding_complete);
                        if (appCompatImageView3 != null) {
                            i = R.id.iv_binding_complete_bottom;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_binding_complete_bottom);
                            if (appCompatImageView4 != null) {
                                i = R.id.iv_close;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_close);
                                if (appCompatImageView5 != null) {
                                    i = R.id.iv_ll_bottom_1;
                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_1);
                                    if (appCompatImageView6 != null) {
                                        i = R.id.iv_ll_bottom_2;
                                        AppCompatImageView appCompatImageView7 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_2);
                                        if (appCompatImageView7 != null) {
                                            i = R.id.iv_ll_bottom_3;
                                            AppCompatImageView appCompatImageView8 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_3);
                                            if (appCompatImageView8 != null) {
                                                i = R.id.iv_ll_bottom_4;
                                                AppCompatImageView appCompatImageView9 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_4);
                                                if (appCompatImageView9 != null) {
                                                    i = R.id.iv_ll_bottom_5;
                                                    AppCompatImageView appCompatImageView10 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_5);
                                                    if (appCompatImageView10 != null) {
                                                        i = R.id.iv_ll_bottom_view_1;
                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_1);
                                                        if (viewFindChildViewById3 != null) {
                                                            i = R.id.iv_ll_bottom_view_2;
                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_2);
                                                            if (viewFindChildViewById4 != null) {
                                                                i = R.id.iv_ll_bottom_view_3;
                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_3);
                                                                if (viewFindChildViewById5 != null) {
                                                                    i = R.id.iv_ll_bottom_view_4;
                                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_4);
                                                                    if (viewFindChildViewById6 != null) {
                                                                        i = R.id.iv_ll_bottom_view_5;
                                                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.iv_ll_bottom_view_5);
                                                                        if (viewFindChildViewById7 != null) {
                                                                            i = R.id.ll_bottom_view_1;
                                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_1);
                                                                            if (linearLayoutCompat != null) {
                                                                                i = R.id.ll_bottom_view_2;
                                                                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_2);
                                                                                if (linearLayoutCompat2 != null) {
                                                                                    i = R.id.ll_bottom_view_3;
                                                                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_3);
                                                                                    if (linearLayoutCompat3 != null) {
                                                                                        i = R.id.ll_bottom_view_4;
                                                                                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_4);
                                                                                        if (linearLayoutCompat4 != null) {
                                                                                            i = R.id.ll_bottom_view_5;
                                                                                            LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_bottom_view_5);
                                                                                            if (linearLayoutCompat5 != null) {
                                                                                                i = R.id.ll_point_layout;
                                                                                                LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.ll_point_layout);
                                                                                                if (linearLayoutCompat6 != null) {
                                                                                                    i = R.id.point_view_1;
                                                                                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(rootView, R.id.point_view_1);
                                                                                                    if (viewFindChildViewById8 != null) {
                                                                                                        i = R.id.point_view_2;
                                                                                                        View viewFindChildViewById9 = ViewBindings.findChildViewById(rootView, R.id.point_view_2);
                                                                                                        if (viewFindChildViewById9 != null) {
                                                                                                            i = R.id.point_view_3;
                                                                                                            View viewFindChildViewById10 = ViewBindings.findChildViewById(rootView, R.id.point_view_3);
                                                                                                            if (viewFindChildViewById10 != null) {
                                                                                                                i = R.id.point_view_4;
                                                                                                                View viewFindChildViewById11 = ViewBindings.findChildViewById(rootView, R.id.point_view_4);
                                                                                                                if (viewFindChildViewById11 != null) {
                                                                                                                    i = R.id.tv_binding_complete_title;
                                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_binding_complete_title);
                                                                                                                    if (textView != null) {
                                                                                                                        i = R.id.tv_bundle_device_title;
                                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_bundle_device_title);
                                                                                                                        if (textView2 != null) {
                                                                                                                            i = R.id.tv_next;
                                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_next);
                                                                                                                            if (textView3 != null) {
                                                                                                                                i = R.id.tv_top_hint_title;
                                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_top_hint_title);
                                                                                                                                if (textView4 != null) {
                                                                                                                                    i = R.id.tv_top_middle_title;
                                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_top_middle_title);
                                                                                                                                    if (textView5 != null) {
                                                                                                                                        return new ActivityMainGuideLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, appCompatImageView, appCompatImageView2, viewFindChildViewById2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, appCompatImageView9, appCompatImageView10, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, linearLayoutCompat6, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10, viewFindChildViewById11, textView, textView2, textView3, textView4, textView5);
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
    public static ActivityMainGuideLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMainGuideLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_main_guide_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
