package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemStockBinding implements ViewBinding {

    @NonNull
    public final ImageButton btDelete;

    @NonNull
    public final ImageView ivChangePercent;

    @NonNull
    public final LinearLayout llItemPanel;

    @NonNull
    public final LinearLayout menuWrapLayout;

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
    public final PFMedium tvName;

    private ItemStockBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btDelete, @NonNull ImageView ivChangePercent, @NonNull LinearLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull PFMedium tvChange, @NonNull PFMedium tvChangePercent, @NonNull PFMedium tvClose, @NonNull PFMedium tvCode, @NonNull PFMedium tvExchange, @NonNull PFMedium tvName) {
        this.rootView = rootView;
        this.btDelete = btDelete;
        this.ivChangePercent = ivChangePercent;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.tvChange = tvChange;
        this.tvChangePercent = tvChangePercent;
        this.tvClose = tvClose;
        this.tvCode = tvCode;
        this.tvExchange = tvExchange;
        this.tvName = tvName;
    }

    @NonNull
    public static ItemStockBinding bind(@NonNull View rootView) {
        int i = R.id.bt_delete;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete);
        if (imageButton != null) {
            i = R.id.iv_change_percent;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_change_percent);
            if (imageView != null) {
                i = R.id.ll_item_panel;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
                if (linearLayout != null) {
                    i = R.id.menu_wrap_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
                    if (linearLayout2 != null) {
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
                                            i = R.id.tv_name;
                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                            if (pFMedium6 != null) {
                                                return new ItemStockBinding((RelativeLayout) rootView, imageButton, imageView, linearLayout, linearLayout2, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6);
                                            }
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
    public static ItemStockBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemStockBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_stock, parent, false);
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
