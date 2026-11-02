package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.MaskView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDownloadMapBinding implements ViewBinding {

    @NonNull
    public final MaskView abhMaskView;

    @NonNull
    public final LinearLayout abhRootView;

    @NonNull
    public final LinearLayout abhSearchMapEt;

    @NonNull
    public final TextureMapView bMapView;

    @NonNull
    public final TextView downloadMapsTipTitle;

    @NonNull
    public final CustomGoogleMapView gMapView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout searchFuncLl;

    @NonNull
    public final TextView searchView;

    private ActivityDownloadMapBinding(@NonNull LinearLayout rootView, @NonNull MaskView abhMaskView, @NonNull LinearLayout abhRootView, @NonNull LinearLayout abhSearchMapEt, @NonNull TextureMapView bMapView, @NonNull TextView downloadMapsTipTitle, @NonNull CustomGoogleMapView gMapView, @NonNull LinearLayout searchFuncLl, @NonNull TextView searchView) {
        this.rootView = rootView;
        this.abhMaskView = abhMaskView;
        this.abhRootView = abhRootView;
        this.abhSearchMapEt = abhSearchMapEt;
        this.bMapView = bMapView;
        this.downloadMapsTipTitle = downloadMapsTipTitle;
        this.gMapView = gMapView;
        this.searchFuncLl = searchFuncLl;
        this.searchView = searchView;
    }

    @NonNull
    public static ActivityDownloadMapBinding bind(@NonNull View rootView) {
        int r0 = R.id.abh_maskView;
        MaskView r4 = (MaskView) ViewBindings.findChildViewById(rootView, R.id.abh_maskView);
        if (r4 == null) goto L19;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.abh_search_map_et;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.abh_search_map_et);
        if (r6 == null) goto L19;
        r0 = R.id.bMapView;
        TextureMapView r7 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r7 == null) goto L19;
        r0 = R.id.download_maps_tip_title;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.download_maps_tip_title);
        if (r8 == null) goto L19;
        r0 = R.id.gMapView;
        CustomGoogleMapView r9 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
        if (r9 == null) goto L19;
        r0 = R.id.search_func_ll;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_func_ll);
        if (r10 == null) goto L19;
        r0 = R.id.search_view;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.search_view);
        if (r11 == null) goto L19;
        return new ActivityDownloadMapBinding(r3, r4, r3, r6, r7, r8, r9, r10, r11);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDownloadMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDownloadMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_download_map, parent, false);
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
