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
        AbhSettingsItem r1 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_colortype);
        if (r1 == null) goto L7;
        LinearLayout r2 = (LinearLayout) rootView;
        return new ActivityStockSettingsBinding(r2, r1, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.item_colortype)));
    }

    @NonNull
    public static ActivityStockSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityStockSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_stock_settings, parent, false);
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
