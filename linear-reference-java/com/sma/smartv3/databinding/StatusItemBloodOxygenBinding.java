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
public final class StatusItemBloodOxygenBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TintImageView tempIv;

    @NonNull
    public final DINCondBold tempLastTime;

    @NonNull
    public final DINCondBold tempLastValue;

    @NonNull
    public final PFRegular tmpUnit;

    private StatusItemBloodOxygenBinding(@NonNull LinearLayout rootView, @NonNull TintImageView tempIv, @NonNull DINCondBold tempLastTime, @NonNull DINCondBold tempLastValue, @NonNull PFRegular tmpUnit) {
        this.rootView = rootView;
        this.tempIv = tempIv;
        this.tempLastTime = tempLastTime;
        this.tempLastValue = tempLastValue;
        this.tmpUnit = tmpUnit;
    }

    @NonNull
    public static StatusItemBloodOxygenBinding bind(@NonNull View rootView) {
        int r0 = R.id.tempIv;
        TintImageView r4 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.tempIv);
        if (r4 == null) goto L13;
        r0 = R.id.tempLastTime;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempLastTime);
        if (r5 == null) goto L13;
        r0 = R.id.tempLastValue;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempLastValue);
        if (r6 == null) goto L13;
        r0 = R.id.tmpUnit;
        PFRegular r7 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tmpUnit);
        if (r7 == null) goto L13;
        return new StatusItemBloodOxygenBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemBloodOxygenBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemBloodOxygenBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_blood_oxygen, parent, false);
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
