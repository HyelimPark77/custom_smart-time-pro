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

    @NonNull
    public final ImageViewRound iv;

    @NonNull
    public final ImageView ivStatus;

    @NonNull
    private final RelativeLayout rootView;

    private ItemWatchfaceBgRBinding(@NonNull RelativeLayout rootView, @NonNull ImageViewRound iv, @NonNull ImageView ivStatus) {
        this.rootView = rootView;
        this.iv = iv;
        this.ivStatus = ivStatus;
    }

    @NonNull
    public static ItemWatchfaceBgRBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv;
        ImageViewRound r1 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L9;
        r0 = R.id.iv_status;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_status);
        if (r2 == null) goto L9;
        return new ItemWatchfaceBgRBinding((RelativeLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemWatchfaceBgRBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemWatchfaceBgRBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_watchface_bg_r, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
