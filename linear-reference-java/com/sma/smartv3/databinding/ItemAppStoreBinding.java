package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.SquareImageView;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAppStoreBinding implements ViewBinding {

    @NonNull
    public final ImageButton btDeleteRecord;

    @NonNull
    public final SquareImageView iv;

    @NonNull
    public final ImageView ivNewIcon;

    @NonNull
    public final LinearLayout llItemPanel;

    @NonNull
    public final LinearLayout menuWrapLayout;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvBtn;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final TextView tvSize;

    private ItemAppStoreBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btDeleteRecord, @NonNull SquareImageView iv, @NonNull ImageView ivNewIcon, @NonNull LinearLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull TextView tvBtn, @NonNull TextView tvName, @NonNull TextView tvSize) {
        this.rootView = rootView;
        this.btDeleteRecord = btDeleteRecord;
        this.iv = iv;
        this.ivNewIcon = ivNewIcon;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.tvBtn = tvBtn;
        this.tvName = tvName;
        this.tvSize = tvSize;
    }

    @NonNull
    public static ItemAppStoreBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_delete_record;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_record);
        if (r4 == null) goto L21;
        r0 = R.id.iv;
        SquareImageView r5 = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r5 == null) goto L21;
        r0 = R.id.iv_new_icon;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_new_icon);
        if (r6 == null) goto L21;
        r0 = R.id.ll_item_panel;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
        if (r7 == null) goto L21;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r8 == null) goto L21;
        r0 = R.id.tv_btn;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_btn);
        if (r9 == null) goto L21;
        r0 = R.id.tv_name;
        TextView r10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r10 == null) goto L21;
        r0 = R.id.tv_size;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_size);
        if (r11 == null) goto L21;
        return new ItemAppStoreBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemAppStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAppStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_app_store, parent, false);
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
