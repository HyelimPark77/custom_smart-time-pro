package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.EnergySegmentProgressView;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemEnergyTatingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final EnergySegmentProgressView swSegmentProgress;

    @NonNull
    public final TintImageView tempIv;

    @NonNull
    public final DINCondBold tempLastTime;

    @NonNull
    public final DINCondBold tempLastValue;

    @NonNull
    public final LinearLayout tempLastlayout;

    @NonNull
    public final PFRegular tmpUnit;

    private StatusItemEnergyTatingBinding(@NonNull LinearLayout rootView, @NonNull EnergySegmentProgressView swSegmentProgress, @NonNull TintImageView tempIv, @NonNull DINCondBold tempLastTime, @NonNull DINCondBold tempLastValue, @NonNull LinearLayout tempLastlayout, @NonNull PFRegular tmpUnit) {
        this.rootView = rootView;
        this.swSegmentProgress = swSegmentProgress;
        this.tempIv = tempIv;
        this.tempLastTime = tempLastTime;
        this.tempLastValue = tempLastValue;
        this.tempLastlayout = tempLastlayout;
        this.tmpUnit = tmpUnit;
    }

    @NonNull
    public static StatusItemEnergyTatingBinding bind(@NonNull View rootView) {
        int i = R.id.sw_segmentProgress;
        EnergySegmentProgressView energySegmentProgressView = (EnergySegmentProgressView) ViewBindings.findChildViewById(rootView, R.id.sw_segmentProgress);
        if (energySegmentProgressView != null) {
            i = R.id.tempIv;
            TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.tempIv);
            if (tintImageView != null) {
                i = R.id.tempLastTime;
                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempLastTime);
                if (dINCondBold != null) {
                    i = R.id.tempLastValue;
                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempLastValue);
                    if (dINCondBold2 != null) {
                        i = R.id.tempLastlayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.tempLastlayout);
                        if (linearLayout != null) {
                            i = R.id.tmpUnit;
                            PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tmpUnit);
                            if (pFRegular != null) {
                                return new StatusItemEnergyTatingBinding((LinearLayout) rootView, energySegmentProgressView, tintImageView, dINCondBold, dINCondBold2, linearLayout, pFRegular);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemEnergyTatingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemEnergyTatingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_energy_tating, parent, false);
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
