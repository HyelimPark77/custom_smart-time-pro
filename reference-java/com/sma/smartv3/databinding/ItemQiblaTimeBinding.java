package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemQiblaTimeBinding implements ViewBinding {

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final LinearLayout llContent;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final PFMedium tvMin;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvTime;

    private ItemQiblaTimeBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout container, @NonNull ImageView ivIcon, @NonNull LinearLayout llContent, @NonNull PFMedium tvMin, @NonNull PFMedium tvName, @NonNull PFMedium tvTime) {
        this.rootView = rootView;
        this.container = container;
        this.ivIcon = ivIcon;
        this.llContent = llContent;
        this.tvMin = tvMin;
        this.tvName = tvName;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ItemQiblaTimeBinding bind(@NonNull View rootView) {
        FrameLayout frameLayout = (FrameLayout) rootView;
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
        if (imageView != null) {
            i = R.id.ll_content;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_content);
            if (linearLayout != null) {
                i = R.id.tv_min;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min);
                if (pFMedium != null) {
                    i = R.id.tv_name;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                    if (pFMedium2 != null) {
                        i = R.id.tv_time;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                        if (pFMedium3 != null) {
                            return new ItemQiblaTimeBinding(frameLayout, frameLayout, imageView, linearLayout, pFMedium, pFMedium2, pFMedium3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemQiblaTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemQiblaTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_qibla_time, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
