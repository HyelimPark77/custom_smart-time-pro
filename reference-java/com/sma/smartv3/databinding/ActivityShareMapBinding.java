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
public final class ActivityShareMapBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout shareMapBtnLl;

    @NonNull
    public final ImageView shareMapImage;

    @NonNull
    public final LinearLayout shareMapImageLl2;

    @NonNull
    public final LinearLayout shareMapVideoLl;

    @NonNull
    public final LinearLayout shareMapVideoLl2;

    @NonNull
    public final LinearLayout shareMapWxLayout;

    @NonNull
    public final LinearLayout shareMapWxPyqLayout;

    private ActivityShareMapBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout shareMapBtnLl, @NonNull ImageView shareMapImage, @NonNull LinearLayout shareMapImageLl2, @NonNull LinearLayout shareMapVideoLl, @NonNull LinearLayout shareMapVideoLl2, @NonNull LinearLayout shareMapWxLayout, @NonNull LinearLayout shareMapWxPyqLayout) {
        this.rootView = rootView;
        this.shareMapBtnLl = shareMapBtnLl;
        this.shareMapImage = shareMapImage;
        this.shareMapImageLl2 = shareMapImageLl2;
        this.shareMapVideoLl = shareMapVideoLl;
        this.shareMapVideoLl2 = shareMapVideoLl2;
        this.shareMapWxLayout = shareMapWxLayout;
        this.shareMapWxPyqLayout = shareMapWxPyqLayout;
    }

    @NonNull
    public static ActivityShareMapBinding bind(@NonNull View rootView) {
        int i = R.id.share_map_btn_ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_btn_ll);
        if (linearLayout != null) {
            i = R.id.share_map_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_map_image);
            if (imageView != null) {
                i = R.id.share_map_image_ll2;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_image_ll2);
                if (linearLayout2 != null) {
                    i = R.id.share_map_video_ll;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_video_ll);
                    if (linearLayout3 != null) {
                        i = R.id.share_map_video_ll2;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_video_ll2);
                        if (linearLayout4 != null) {
                            i = R.id.share_map_wx_layout;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_wx_layout);
                            if (linearLayout5 != null) {
                                i = R.id.share_map_wx_pyq_layout;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_wx_pyq_layout);
                                if (linearLayout6 != null) {
                                    return new ActivityShareMapBinding((LinearLayout) rootView, linearLayout, imageView, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityShareMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityShareMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_share_map, parent, false);
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
