package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemElectrocardiogramBinding implements ViewBinding {

    @NonNull
    public final TintImageView hrIv;

    @NonNull
    public final DINCondBold hrLastTime;

    @NonNull
    public final DINCondBold hrLastValue;

    @NonNull
    public final LineChart hrLineChart;

    @NonNull
    public final DINCondBold noData;

    @NonNull
    private final LinearLayout rootView;

    private StatusItemElectrocardiogramBinding(@NonNull LinearLayout rootView, @NonNull TintImageView hrIv, @NonNull DINCondBold hrLastTime, @NonNull DINCondBold hrLastValue, @NonNull LineChart hrLineChart, @NonNull DINCondBold noData) {
        this.rootView = rootView;
        this.hrIv = hrIv;
        this.hrLastTime = hrLastTime;
        this.hrLastValue = hrLastValue;
        this.hrLineChart = hrLineChart;
        this.noData = noData;
    }

    @NonNull
    public static StatusItemElectrocardiogramBinding bind(@NonNull View rootView) {
        int r0 = R.id.hrIv;
        TintImageView r4 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.hrIv);
        if (r4 == null) goto L15;
        r0 = R.id.hrLastTime;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.hrLastTime);
        if (r5 == null) goto L15;
        r0 = R.id.hrLastValue;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.hrLastValue);
        if (r6 == null) goto L15;
        r0 = R.id.hrLineChart;
        LineChart r7 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
        if (r7 == null) goto L15;
        r0 = R.id.noData;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
        if (r8 == null) goto L15;
        return new StatusItemElectrocardiogramBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemElectrocardiogramBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemElectrocardiogramBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_electrocardiogram, parent, false);
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
