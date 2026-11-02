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
        int i = R.id.tempItemStatus;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tempItemStatus);
        if (pFMedium != null) {
            i = R.id.tempItemTime;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempItemTime);
            if (dINCondBold != null) {
                i = R.id.tempItemUnit;
                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempItemUnit);
                if (dINCondBold2 != null) {
                    i = R.id.tempItemValue;
                    DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tempItemValue);
                    if (dINCondBold3 != null) {
                        return new TempDayItemBinding((RelativeLayout) rootView, pFMedium, dINCondBold, dINCondBold2, dINCondBold3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static TempDayItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TempDayItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.temp_day_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
