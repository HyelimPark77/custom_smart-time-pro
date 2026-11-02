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
        int i = R.id.abh_maskView;
        MaskView maskView = (MaskView) ViewBindings.findChildViewById(rootView, R.id.abh_maskView);
        if (maskView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.abh_search_map_et;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.abh_search_map_et);
            if (linearLayout2 != null) {
                i = R.id.bMapView;
                TextureMapView textureMapView = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
                if (textureMapView != null) {
                    i = R.id.download_maps_tip_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.download_maps_tip_title);
                    if (textView != null) {
                        i = R.id.gMapView;
                        CustomGoogleMapView customGoogleMapView = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
                        if (customGoogleMapView != null) {
                            i = R.id.search_func_ll;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_func_ll);
                            if (linearLayout3 != null) {
                                i = R.id.search_view;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.search_view);
                                if (textView2 != null) {
                                    return new ActivityDownloadMapBinding(linearLayout, maskView, linearLayout, linearLayout2, textureMapView, textView, customGoogleMapView, linearLayout3, textView2);
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
    public static ActivityDownloadMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDownloadMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_download_map, parent, false);
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
