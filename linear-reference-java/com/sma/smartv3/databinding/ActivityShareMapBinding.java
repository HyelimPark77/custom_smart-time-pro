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
        int r0 = R.id.share_map_btn_ll;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_btn_ll);
        if (r4 == null) goto L19;
        r0 = R.id.share_map_image;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_map_image);
        if (r5 == null) goto L19;
        r0 = R.id.share_map_image_ll2;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_image_ll2);
        if (r6 == null) goto L19;
        r0 = R.id.share_map_video_ll;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_video_ll);
        if (r7 == null) goto L19;
        r0 = R.id.share_map_video_ll2;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_video_ll2);
        if (r8 == null) goto L19;
        r0 = R.id.share_map_wx_layout;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_wx_layout);
        if (r9 == null) goto L19;
        r0 = R.id.share_map_wx_pyq_layout;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_map_wx_pyq_layout);
        if (r10 == null) goto L19;
        return new ActivityShareMapBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityShareMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityShareMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_share_map, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
