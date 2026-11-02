package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class BannerItemBinding implements ViewBinding {

    @NonNull
    public final ImageView bannerImage;

    @NonNull
    private final ImageView rootView;

    private BannerItemBinding(@NonNull ImageView rootView, @NonNull ImageView bannerImage) {
        this.rootView = rootView;
        this.bannerImage = bannerImage;
    }

    @NonNull
    public static BannerItemBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) rootView;
        return new BannerItemBinding(imageView, imageView);
    }

    @NonNull
    public static BannerItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static BannerItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.banner_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
