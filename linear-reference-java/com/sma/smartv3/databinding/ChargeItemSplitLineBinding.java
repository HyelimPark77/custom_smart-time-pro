package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ChargeItemSplitLineBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    private ChargeItemSplitLineBinding(@NonNull View rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static ChargeItemSplitLineBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        return new ChargeItemSplitLineBinding(rootView);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ChargeItemSplitLineBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ChargeItemSplitLineBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.charge_item_split_line, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }
}
