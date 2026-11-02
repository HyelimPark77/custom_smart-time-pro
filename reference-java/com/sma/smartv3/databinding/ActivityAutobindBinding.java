package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.GifImageView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAutobindBinding implements ViewBinding {

    @NonNull
    public final GifImageView ivBindTip1;

    @NonNull
    public final GifImageView ivBindTip2;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final LinearLayout topPanel;

    @NonNull
    public final PFMedium tvTip1;

    @NonNull
    public final PFMedium tvTip2;

    private ActivityAutobindBinding(@NonNull RelativeLayout rootView_, @NonNull GifImageView ivBindTip1, @NonNull GifImageView ivBindTip2, @NonNull RelativeLayout rootView, @NonNull LinearLayout topPanel, @NonNull PFMedium tvTip1, @NonNull PFMedium tvTip2) {
        this.rootView_ = rootView_;
        this.ivBindTip1 = ivBindTip1;
        this.ivBindTip2 = ivBindTip2;
        this.rootView = rootView;
        this.topPanel = topPanel;
        this.tvTip1 = tvTip1;
        this.tvTip2 = tvTip2;
    }

    @NonNull
    public static ActivityAutobindBinding bind(@NonNull View rootView) {
        int i = R.id.iv_bind_tip_1;
        GifImageView gifImageView = (GifImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bind_tip_1);
        if (gifImageView != null) {
            i = R.id.iv_bind_tip_2;
            GifImageView gifImageView2 = (GifImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bind_tip_2);
            if (gifImageView2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                i = R.id.top_panel;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.top_panel);
                if (linearLayout != null) {
                    i = R.id.tv_tip1;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip1);
                    if (pFMedium != null) {
                        i = R.id.tv_tip2;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip2);
                        if (pFMedium2 != null) {
                            return new ActivityAutobindBinding(relativeLayout, gifImageView, gifImageView2, relativeLayout, linearLayout, pFMedium, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAutobindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAutobindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_autobind, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
