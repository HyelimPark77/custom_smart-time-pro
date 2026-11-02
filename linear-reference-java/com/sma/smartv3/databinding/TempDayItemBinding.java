package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class TempDayItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tempItemStatus;

    @NonNull
    public final DINCondBold tempItemTime;

    @NonNull
    public final DINCondBold tempItemUnit;

    @NonNull
    public final DINCondBold tempItemValue;

    private TempDayItemBinding(@NonNull RelativeLayout rootView, @NonNull PFMedium tempItemStatus, @NonNull DINCondBold tempItemTime, @NonNull DINCondBold tempItemUnit, @NonNull DINCondBold tempItemValue) {
        this.rootView = rootView;
        this.tempItemStatus = tempItemStatus;
        this.tempItemTime = tempItemTime;
        this.tempItemUnit = tempItemUnit;
        this.tempItemValue = tempItemValue;
    }

    @NonNull
    public static TempDayItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.tempItemStatus;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tempItemStatus);
        if (r4 == null) goto L13;
        r0 = R.id.tempItemTime;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempItemTime);
        if (r5 == null) goto L13;
        r0 = R.id.tempItemUnit;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempItemUnit);
        if (r6 == null) goto L13;
        r0 = R.id.tempItemValue;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempItemValue);
        if (r7 == null) goto L13;
        return new TempDayItemBinding((RelativeLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static TempDayItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static TempDayItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.temp_day_item, parent, false);
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
