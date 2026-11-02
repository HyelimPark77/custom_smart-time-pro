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
        int r0 = R.id.bt_delete;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete);
        if (r4 == null) goto L25;
        r0 = R.id.iv_change_percent;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_change_percent);
        if (r5 == null) goto L25;
        r0 = R.id.ll_item_panel;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
        if (r6 == null) goto L25;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r7 == null) goto L25;
        r0 = R.id.tv_change;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_change);
        if (r8 == null) goto L25;
        r0 = R.id.tv_change_percent;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_change_percent);
        if (r9 == null) goto L25;
        r0 = R.id.tv_close;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_close);
        if (r10 == null) goto L25;
        r0 = R.id.tv_code;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_code);
        if (r11 == null) goto L25;
        r0 = R.id.tv_exchange;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_exchange);
        if (r12 == null) goto L25;
        r0 = R.id.tv_name;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r13 == null) goto L25;
        return new ItemStockBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemStockBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemStockBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_stock, parent, false);
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
