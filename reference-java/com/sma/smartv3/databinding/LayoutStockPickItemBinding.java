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
        int i = R.id.iv_change_percent;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_change_percent);
        if (imageView != null) {
            i = R.id.rbSelectedState;
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(rootView, R.id.rbSelectedState);
            if (appCompatRadioButton != null) {
                i = R.id.tv_change;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_change);
                if (pFMedium != null) {
                    i = R.id.tv_change_percent;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_change_percent);
                    if (pFMedium2 != null) {
                        i = R.id.tv_close;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_close);
                        if (pFMedium3 != null) {
                            i = R.id.tv_code;
                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
                            if (pFMedium4 != null) {
                                i = R.id.tv_exchange;
                                PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_exchange);
                                if (pFMedium5 != null) {
                                    i = R.id.tv_exchange_name;
                                    PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_exchange_name);
                                    if (pFMedium6 != null) {
                                        i = R.id.tv_name;
                                        PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                        if (pFMedium7 != null) {
                                            return new LayoutStockPickItemBinding((RelativeLayout) rootView, imageView, appCompatRadioButton, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutStockPickItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutStockPickItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_stock_pick_item, parent, false);
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
