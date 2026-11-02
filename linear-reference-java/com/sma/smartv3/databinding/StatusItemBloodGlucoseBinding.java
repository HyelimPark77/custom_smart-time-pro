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
        int r0 = R.id.lastTime;
        DINCondBold r4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.lastTime);
        if (r4 == null) goto L15;
        r0 = R.id.lastValue;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.lastValue);
        if (r5 == null) goto L15;
        r0 = R.id.tempIv;
        TintImageView r6 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.tempIv);
        if (r6 == null) goto L15;
        r0 = R.id.tmpUnit;
        PFRegular r7 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tmpUnit);
        if (r7 == null) goto L15;
        r0 = R.id.value_panel;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.value_panel);
        if (r8 == null) goto L15;
        return new StatusItemBloodGlucoseBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemBloodGlucoseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemBloodGlucoseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_blood_glucose, parent, false);
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
