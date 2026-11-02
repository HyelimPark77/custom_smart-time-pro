package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDialSpaceLowBinding implements ViewBinding {

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivGif;

    @NonNull
    private final LinearLayout rootView;

    private PopDialSpaceLowBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivClose, @NonNull ImageView ivGif) {
        this.rootView = rootView;
        this.ivClose = ivClose;
        this.ivGif = ivGif;
    }

    @NonNull
    public static PopDialSpaceLowBinding bind(@NonNull View rootView) {
        int i = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_close);
        if (imageView != null) {
            i = R.id.iv_gif;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_gif);
            if (imageView2 != null) {
                return new PopDialSpaceLowBinding((LinearLayout) rootView, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopDialSpaceLowBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopDialSpaceLowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_dial_space_low, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
