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
        int i = R.id.hrIv;
        TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.hrIv);
        if (tintImageView != null) {
            i = R.id.hrLastTime;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.hrLastTime);
            if (dINCondBold != null) {
                i = R.id.hrLastValue;
                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.hrLastValue);
                if (dINCondBold2 != null) {
                    i = R.id.hrLineChart;
                    LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
                    if (lineChart != null) {
                        i = R.id.noData;
                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
                        if (dINCondBold3 != null) {
                            return new StatusItemElectrocardiogramBinding((LinearLayout) rootView, tintImageView, dINCondBold, dINCondBold2, lineChart, dINCondBold3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemElectrocardiogramBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemElectrocardiogramBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_electrocardiogram, parent, false);
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
