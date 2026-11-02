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
import com.sma.smartv3.view.AbhSettingsItem;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityStockSettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsItem itemColortype;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityStockSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsItem itemColortype, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemColortype = itemColortype;
        this.root = root;
    }

    @NonNull
    public static ActivityStockSettingsBinding bind(@NonNull View rootView) {
        AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_colortype);
        if (abhSettingsItem == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.item_colortype)));
        }
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new ActivityStockSettingsBinding(linearLayout, abhSettingsItem, linearLayout);
    }

    @NonNull
    public static ActivityStockSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityStockSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_stock_settings, parent, false);
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
