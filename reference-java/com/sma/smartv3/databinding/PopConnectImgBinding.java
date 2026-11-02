package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopConnectImgBinding implements ViewBinding {

    @NonNull
    public final ImageView imgClose;

    @NonNull
    public final ImageView imgConnect;

    @NonNull
    private final FrameLayout rootView;

    private PopConnectImgBinding(@NonNull FrameLayout rootView, @NonNull ImageView imgClose, @NonNull ImageView imgConnect) {
        this.rootView = rootView;
        this.imgClose = imgClose;
        this.imgConnect = imgConnect;
    }

    @NonNull
    public static PopConnectImgBinding bind(@NonNull View rootView) {
        int i = R.id.img_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_close);
        if (imageView != null) {
            i = R.id.img_connect;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_connect);
            if (imageView2 != null) {
                return new PopConnectImgBinding((FrameLayout) rootView, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopConnectImgBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopConnectImgBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_connect_img, parent, false);
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
