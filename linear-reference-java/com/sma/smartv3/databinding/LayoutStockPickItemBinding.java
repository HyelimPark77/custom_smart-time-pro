package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutStockPickItemBinding implements ViewBinding {

    @NonNull
    public final ImageView ivChangePercent;

    @NonNull
    public final AppCompatRadioButton rbSelectedState;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvChange;

    @NonNull
    public final PFMedium tvChangePercent;

    @NonNull
    public final PFMedium tvClose;

    @NonNull
    public final PFMedium tvCode;

    @NonNull
    public final PFMedium tvExchange;

    @NonNull
    public final PFMedium tvExchangeName;

    @NonNull
    public final PFMedium tvName;

    private LayoutStockPickItemBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivChangePercent, @NonNull AppCompatRadioButton rbSelectedState, @NonNull PFMedium tvChange, @NonNull PFMedium tvChangePercent, @NonNull PFMedium tvClose, @NonNull PFMedium tvCode, @NonNull PFMedium tvExchange, @NonNull PFMedium tvExchangeName, @NonNull PFMedium tvName) {
        this.rootView = rootView;
        this.ivChangePercent = ivChangePercent;
        this.rbSelectedState = rbSelectedState;
        this.tvChange = tvChange;
        this.tvChangePercent = tvChangePercent;
        this.tvClose = tvClose;
        this.tvCode = tvCode;
        this.tvExchange = tvExchange;
        this.tvExchangeName = tvExchangeName;
        this.tvName = tvName;
    }

    @NonNull
    public static LayoutStockPickItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_change_percent;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_change_percent);
        if (r4 == null) goto L23;
        r0 = R.id.rbSelectedState;
        AppCompatRadioButton r5 = (AppCompatRadioButton) ViewBindings.findChildViewById(rootView, R.id.rbSelectedState);
        if (r5 == null) goto L23;
        r0 = R.id.tv_change;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_change);
        if (r6 == null) goto L23;
        r0 = R.id.tv_change_percent;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_change_percent);
        if (r7 == null) goto L23;
        r0 = R.id.tv_close;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_close);
        if (r8 == null) goto L23;
        r0 = R.id.tv_code;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
        if (r9 == null) goto L23;
        r0 = R.id.tv_exchange;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_exchange);
        if (r10 == null) goto L23;
        r0 = R.id.tv_exchange_name;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_exchange_name);
        if (r11 == null) goto L23;
        r0 = R.id.tv_name;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r12 == null) goto L23;
        return new LayoutStockPickItemBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutStockPickItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutStockPickItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_stock_pick_item, parent, false);
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
