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
        int r0 = R.id.iv_bind_tip_1;
        GifImageView r4 = (GifImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bind_tip_1);
        if (r4 == null) goto L15;
        r0 = R.id.iv_bind_tip_2;
        GifImageView r5 = (GifImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bind_tip_2);
        if (r5 == null) goto L15;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.top_panel;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.top_panel);
        if (r7 == null) goto L15;
        r0 = R.id.tv_tip1;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip1);
        if (r8 == null) goto L15;
        r0 = R.id.tv_tip2;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip2);
        if (r9 == null) goto L15;
        return new ActivityAutobindBinding(r3, r4, r5, r3, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAutobindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAutobindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_autobind, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
