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

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final SquareImageView f51130iv;

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
        this.f51130iv = iv;
        this.ivNewIcon = ivNewIcon;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.tvBtn = tvBtn;
        this.tvName = tvName;
        this.tvSize = tvSize;
    }

    @NonNull
    public static ItemAppStoreBinding bind(@NonNull View rootView) {
        int i = R.id.bt_delete_record;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_record);
        if (imageButton != null) {
            i = R.id.f51417iv;
            SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
            if (squareImageView != null) {
                i = R.id.iv_new_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_new_icon);
                if (imageView != null) {
                    i = R.id.ll_item_panel;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
                    if (linearLayout != null) {
                        i = R.id.menu_wrap_layout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
                        if (linearLayout2 != null) {
                            i = R.id.tv_btn;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_btn);
                            if (textView != null) {
                                i = R.id.tv_name;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                if (textView2 != null) {
                                    i = R.id.tv_size;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_size);
                                    if (textView3 != null) {
                                        return new ItemAppStoreBinding((RelativeLayout) rootView, imageButton, squareImageView, imageView, linearLayout, linearLayout2, textView, textView2, textView3);
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
    public static ItemAppStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAppStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_app_store, parent, false);
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
