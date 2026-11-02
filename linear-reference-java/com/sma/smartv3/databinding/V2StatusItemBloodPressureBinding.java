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
        int r0 = R.id.data_panel;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r4 == null) goto L21;
        r0 = R.id.empty_panel;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
        if (r5 == null) goto L21;
        r0 = R.id.sbvLevel;
        SegmentedBarView r6 = (SegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbvLevel);
        if (r6 == null) goto L21;
        r0 = R.id.tempIv;
        TintImageView r7 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.tempIv);
        if (r7 == null) goto L21;
        r0 = R.id.tempLastTime;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempLastTime);
        if (r8 == null) goto L21;
        r0 = R.id.tempLastValue;
        MHFont r9 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tempLastValue);
        if (r9 == null) goto L21;
        r0 = R.id.tmpUnit;
        PFRegular r10 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tmpUnit);
        if (r10 == null) goto L21;
        r0 = R.id.tv_no_data;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
        if (r11 == null) goto L21;
        return new V2StatusItemBloodPressureBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2StatusItemBloodPressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemBloodPressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_blood_pressure, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
