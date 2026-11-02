package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.MHFont;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemBloodPressureBinding implements ViewBinding {

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final LinearLayout emptyPanel;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final SegmentedBarView sbvLevel;

    @NonNull
    public final TintImageView tempIv;

    @NonNull
    public final DINCondBold tempLastTime;

    @NonNull
    public final MHFont tempLastValue;

    @NonNull
    public final PFRegular tmpUnit;

    @NonNull
    public final PFMedium tvNoData;

    private V2StatusItemBloodPressureBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout dataPanel, @NonNull LinearLayout emptyPanel, @NonNull SegmentedBarView sbvLevel, @NonNull TintImageView tempIv, @NonNull DINCondBold tempLastTime, @NonNull MHFont tempLastValue, @NonNull PFRegular tmpUnit, @NonNull PFMedium tvNoData) {
        this.rootView = rootView;
        this.dataPanel = dataPanel;
        this.emptyPanel = emptyPanel;
        this.sbvLevel = sbvLevel;
        this.tempIv = tempIv;
        this.tempLastTime = tempLastTime;
        this.tempLastValue = tempLastValue;
        this.tmpUnit = tmpUnit;
        this.tvNoData = tvNoData;
    }

    @NonNull
    public static V2StatusItemBloodPressureBinding bind(@NonNull View rootView) {
        int i = R.id.data_panel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (linearLayout != null) {
            i = R.id.empty_panel;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
            if (linearLayout2 != null) {
                i = R.id.sbvLevel;
                SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbvLevel);
                if (segmentedBarView != null) {
                    i = R.id.tempIv;
                    TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.tempIv);
                    if (tintImageView != null) {
                        i = R.id.tempLastTime;
                        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempLastTime);
                        if (dINCondBold != null) {
                            i = R.id.tempLastValue;
                            MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tempLastValue);
                            if (mHFont != null) {
                                i = R.id.tmpUnit;
                                PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tmpUnit);
                                if (pFRegular != null) {
                                    i = R.id.tv_no_data;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
                                    if (pFMedium != null) {
                                        return new V2StatusItemBloodPressureBinding((FrameLayout) rootView, linearLayout, linearLayout2, segmentedBarView, tintImageView, dINCondBold, mHFont, pFRegular, pFMedium);
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
    public static V2StatusItemBloodPressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemBloodPressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_blood_pressure, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
