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
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemTemperatureBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TintImageView tempIv;

    @NonNull
    public final DINCondBold tempLastTime;

    @NonNull
    public final DINCondBold tempLastValue;

    @NonNull
    public final PFMedium tempTitle;

    @NonNull
    public final PFRegular tmpUnit;

    @NonNull
    public final LinearLayout valuePanel;

    private StatusItemTemperatureBinding(@NonNull LinearLayout rootView, @NonNull TintImageView tempIv, @NonNull DINCondBold tempLastTime, @NonNull DINCondBold tempLastValue, @NonNull PFMedium tempTitle, @NonNull PFRegular tmpUnit, @NonNull LinearLayout valuePanel) {
        this.rootView = rootView;
        this.tempIv = tempIv;
        this.tempLastTime = tempLastTime;
        this.tempLastValue = tempLastValue;
        this.tempTitle = tempTitle;
        this.tmpUnit = tmpUnit;
        this.valuePanel = valuePanel;
    }

    @NonNull
    public static StatusItemTemperatureBinding bind(@NonNull View rootView) {
        int i = R.id.tempIv;
        TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.tempIv);
        if (tintImageView != null) {
            i = R.id.tempLastTime;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempLastTime);
            if (dINCondBold != null) {
                i = R.id.tempLastValue;
                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempLastValue);
                if (dINCondBold2 != null) {
                    i = R.id.tempTitle;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tempTitle);
                    if (pFMedium != null) {
                        i = R.id.tmpUnit;
                        PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tmpUnit);
                        if (pFRegular != null) {
                            i = R.id.value_panel;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.value_panel);
                            if (linearLayout != null) {
                                return new StatusItemTemperatureBinding((LinearLayout) rootView, tintImageView, dINCondBold, dINCondBold2, pFMedium, pFRegular, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemTemperatureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemTemperatureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_temperature, parent, false);
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
