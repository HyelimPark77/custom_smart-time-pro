package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemCoachingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivSync;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvDescription;

    @NonNull
    public final PFMedium tvTitle;

    private ItemCoachingBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivSync, @NonNull PFMedium tvDescription, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.ivSync = ivSync;
        this.tvDescription = tvDescription;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static ItemCoachingBinding bind(@NonNull View rootView) {
        int i = R.id.iv_sync;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_sync);
        if (imageView != null) {
            i = R.id.tv_description;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_description);
            if (pFMedium != null) {
                i = R.id.tv_title;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                if (pFMedium2 != null) {
                    return new ItemCoachingBinding((RelativeLayout) rootView, imageView, pFMedium, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemCoachingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemCoachingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_coaching, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
