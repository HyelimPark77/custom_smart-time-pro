package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.MapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySportMapBinding implements ViewBinding {

    @NonNull
    public final MapView bMapView;

    @NonNull
    public final DINCondBold dataFourValue;

    @NonNull
    public final PFMedium dataFourValueDesc;

    @NonNull
    public final DINCondBold dataOneValue;

    @NonNull
    public final PFMedium dataOneValueDesc;

    @NonNull
    public final DINCondBold dataThreeValue;

    @NonNull
    public final PFMedium dataThreeValueDesc;

    @NonNull
    public final DINCondBold dataTwoValue;

    @NonNull
    public final PFMedium dataTwoValueDesc;

    @NonNull
    private final RelativeLayout rootView;

    private ActivitySportMapBinding(@NonNull RelativeLayout rootView, @NonNull MapView bMapView, @NonNull DINCondBold dataFourValue, @NonNull PFMedium dataFourValueDesc, @NonNull DINCondBold dataOneValue, @NonNull PFMedium dataOneValueDesc, @NonNull DINCondBold dataThreeValue, @NonNull PFMedium dataThreeValueDesc, @NonNull DINCondBold dataTwoValue, @NonNull PFMedium dataTwoValueDesc) {
        this.rootView = rootView;
        this.bMapView = bMapView;
        this.dataFourValue = dataFourValue;
        this.dataFourValueDesc = dataFourValueDesc;
        this.dataOneValue = dataOneValue;
        this.dataOneValueDesc = dataOneValueDesc;
        this.dataThreeValue = dataThreeValue;
        this.dataThreeValueDesc = dataThreeValueDesc;
        this.dataTwoValue = dataTwoValue;
        this.dataTwoValueDesc = dataTwoValueDesc;
    }

    @NonNull
    public static ActivitySportMapBinding bind(@NonNull View rootView) {
        int i = R.id.bMapView;
        MapView mapView = (MapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (mapView != null) {
            i = R.id.dataFourValue;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dataFourValue);
            if (dINCondBold != null) {
                i = R.id.dataFourValueDesc;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dataFourValueDesc);
                if (pFMedium != null) {
                    i = R.id.dataOneValue;
                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dataOneValue);
                    if (dINCondBold2 != null) {
                        i = R.id.dataOneValueDesc;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dataOneValueDesc);
                        if (pFMedium2 != null) {
                            i = R.id.dataThreeValue;
                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dataThreeValue);
                            if (dINCondBold3 != null) {
                                i = R.id.dataThreeValueDesc;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dataThreeValueDesc);
                                if (pFMedium3 != null) {
                                    i = R.id.dataTwoValue;
                                    DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dataTwoValue);
                                    if (dINCondBold4 != null) {
                                        i = R.id.dataTwoValueDesc;
                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dataTwoValueDesc);
                                        if (pFMedium4 != null) {
                                            return new ActivitySportMapBinding((RelativeLayout) rootView, mapView, dINCondBold, pFMedium, dINCondBold2, pFMedium2, dINCondBold3, pFMedium3, dINCondBold4, pFMedium4);
                                        }
                                    }
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
    public static ActivitySportMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySportMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sport_map, parent, false);
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
