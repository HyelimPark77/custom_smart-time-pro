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
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        Banner banner = (Banner) rootView;
        return new LayoutOnlineWatchfaceBannerHeadBinding(banner, banner);
    }

    @NonNull
    public static LayoutOnlineWatchfaceBannerHeadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutOnlineWatchfaceBannerHeadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_online_watchface_banner_head, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public Banner getRoot() {
        return this.rootView;
    }
}
