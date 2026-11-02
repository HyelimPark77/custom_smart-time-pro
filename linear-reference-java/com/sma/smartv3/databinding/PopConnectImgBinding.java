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
        int r0 = R.id.img_close;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_close);
        if (r1 == null) goto L9;
        r0 = R.id.img_connect;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_connect);
        if (r2 == null) goto L9;
        return new PopConnectImgBinding((FrameLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopConnectImgBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopConnectImgBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_connect_img, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
