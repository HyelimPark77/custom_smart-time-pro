package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ChargeItemSplitLine2Binding implements ViewBinding {

    @NonNull
    private final View rootView;

    private ChargeItemSplitLine2Binding(@NonNull View rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static ChargeItemSplitLine2Binding bind(@NonNull View rootView) {
        if (rootView != null) {
            return new ChargeItemSplitLine2Binding(rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ChargeItemSplitLine2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ChargeItemSplitLine2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.charge_item_split_line_2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
