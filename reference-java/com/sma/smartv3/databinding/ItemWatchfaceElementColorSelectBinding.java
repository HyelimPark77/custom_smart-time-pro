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

/* JADX INFO: loaded from: classes19.dex */
public final class ItemWatchfaceElementColorSelectBinding implements ViewBinding {

    @NonNull
    public final ImageView colorIv;

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RelativeLayout f51168rv;

    @NonNull
    public final ImageView selectStatus;

    private ItemWatchfaceElementColorSelectBinding(@NonNull RelativeLayout rootView, @NonNull ImageView colorIv, @NonNull RelativeLayout rv, @NonNull ImageView selectStatus) {
        this.rootView = rootView;
        this.colorIv = colorIv;
        this.f51168rv = rv;
        this.selectStatus = selectStatus;
    }

    @NonNull
    public static ItemWatchfaceElementColorSelectBinding bind(@NonNull View rootView) {
        int i = R.id.colorIv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.colorIv);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.selectStatus);
            if (imageView2 != null) {
                return new ItemWatchfaceElementColorSelectBinding(relativeLayout, imageView, relativeLayout, imageView2);
            }
            i = R.id.selectStatus;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemWatchfaceElementColorSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemWatchfaceElementColorSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_watchface_element_color_select, parent, false);
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
