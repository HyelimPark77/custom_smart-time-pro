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
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemBloodGlucoseBinding implements ViewBinding {

    @NonNull
    public final DINCondBold lastTime;

    @NonNull
    public final DINCondBold lastValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TintImageView tempIv;

    @NonNull
    public final PFRegular tmpUnit;

    @NonNull
    public final LinearLayout valuePanel;

    private StatusItemBloodGlucoseBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold lastTime, @NonNull DINCondBold lastValue, @NonNull TintImageView tempIv, @NonNull PFRegular tmpUnit, @NonNull LinearLayout valuePanel) {
        this.rootView = rootView;
        this.lastTime = lastTime;
        this.lastValue = lastValue;
        this.tempIv = tempIv;
        this.tmpUnit = tmpUnit;
        this.valuePanel = valuePanel;
    }

    @NonNull
    public static StatusItemBloodGlucoseBinding bind(@NonNull View rootView) {
        int i = R.id.lastTime;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.lastTime);
        if (dINCondBold != null) {
            i = R.id.lastValue;
            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.lastValue);
            if (dINCondBold2 != null) {
                i = R.id.tempIv;
                TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.tempIv);
                if (tintImageView != null) {
                    i = R.id.tmpUnit;
                    PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tmpUnit);
                    if (pFRegular != null) {
                        i = R.id.value_panel;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.value_panel);
                        if (linearLayout != null) {
                            return new StatusItemBloodGlucoseBinding((LinearLayout) rootView, dINCondBold, dINCondBold2, tintImageView, pFRegular, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemBloodGlucoseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemBloodGlucoseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_blood_glucose, parent, false);
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
