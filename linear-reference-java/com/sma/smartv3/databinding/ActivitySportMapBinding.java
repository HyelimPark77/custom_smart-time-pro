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
        int r0 = R.id.bMapView;
        MapView r4 = (MapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r4 == null) goto L23;
        r0 = R.id.dataFourValue;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dataFourValue);
        if (r5 == null) goto L23;
        r0 = R.id.dataFourValueDesc;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dataFourValueDesc);
        if (r6 == null) goto L23;
        r0 = R.id.dataOneValue;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dataOneValue);
        if (r7 == null) goto L23;
        r0 = R.id.dataOneValueDesc;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dataOneValueDesc);
        if (r8 == null) goto L23;
        r0 = R.id.dataThreeValue;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dataThreeValue);
        if (r9 == null) goto L23;
        r0 = R.id.dataThreeValueDesc;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dataThreeValueDesc);
        if (r10 == null) goto L23;
        r0 = R.id.dataTwoValue;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dataTwoValue);
        if (r11 == null) goto L23;
        r0 = R.id.dataTwoValueDesc;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dataTwoValueDesc);
        if (r12 == null) goto L23;
        return new ActivitySportMapBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySportMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySportMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sport_map, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
