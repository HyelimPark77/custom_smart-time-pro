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
import com.sma.smartv3.view.ImageViewRound;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemWatchfaceBgRBinding implements ViewBinding {

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageViewRound f51167iv;

    @NonNull
    public final ImageView ivStatus;

    @NonNull
    private final RelativeLayout rootView;

    private ItemWatchfaceBgRBinding(@NonNull RelativeLayout rootView, @NonNull ImageViewRound iv, @NonNull ImageView ivStatus) {
        this.rootView = rootView;
        this.f51167iv = iv;
        this.ivStatus = ivStatus;
    }

    @NonNull
    public static ItemWatchfaceBgRBinding bind(@NonNull View rootView) {
        int i = R.id.f51417iv;
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageViewRound != null) {
            i = R.id.iv_status;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_status);
            if (imageView != null) {
                return new ItemWatchfaceBgRBinding((RelativeLayout) rootView, imageViewRound, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemWatchfaceBgRBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemWatchfaceBgRBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_watchface_bg_r, parent, false);
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
