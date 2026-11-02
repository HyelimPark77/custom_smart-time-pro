package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;
import com.youth.banner.Banner;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutOnlineWatchfaceBannerHeadBinding implements ViewBinding {

    @NonNull
    public final Banner banner;

    @NonNull
    private final Banner rootView;

    private LayoutOnlineWatchfaceBannerHeadBinding(@NonNull Banner rootView, @NonNull Banner banner) {
        this.rootView = rootView;
        this.banner = banner;
    }

    @NonNull
    public static LayoutOnlineWatchfaceBannerHeadBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        Banner r1 = (Banner) rootView;
        return new LayoutOnlineWatchfaceBannerHeadBinding(r1, r1);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static LayoutOnlineWatchfaceBannerHeadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutOnlineWatchfaceBannerHeadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_online_watchface_banner_head, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public Banner getRoot() {
        return this.rootView;
    }
}
