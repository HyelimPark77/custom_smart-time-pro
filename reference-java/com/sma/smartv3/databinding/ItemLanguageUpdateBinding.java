package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemLanguageUpdateBinding implements ViewBinding {

    @NonNull
    public final ImageButton btDeleteLanguage;

    @NonNull
    public final ImageView checkBox;

    @NonNull
    public final LinearLayout llItemPanel;

    @NonNull
    public final LinearLayout menuWrapLayout;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final PFMedium tvBtn;

    @NonNull
    public final PFMedium tvState1;

    @NonNull
    public final PFMedium tvState2;

    @NonNull
    public final PFMedium tvTitle1;

    @NonNull
    public final TextView tvTitle2;

    private ItemLanguageUpdateBinding(@NonNull CardView rootView, @NonNull ImageButton btDeleteLanguage, @NonNull ImageView checkBox, @NonNull LinearLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull PFMedium tvBtn, @NonNull PFMedium tvState1, @NonNull PFMedium tvState2, @NonNull PFMedium tvTitle1, @NonNull TextView tvTitle2) {
        this.rootView = rootView;
        this.btDeleteLanguage = btDeleteLanguage;
        this.checkBox = checkBox;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.tvBtn = tvBtn;
        this.tvState1 = tvState1;
        this.tvState2 = tvState2;
        this.tvTitle1 = tvTitle1;
        this.tvTitle2 = tvTitle2;
    }

    @NonNull
    public static ItemLanguageUpdateBinding bind(@NonNull View rootView) {
        int i = R.id.bt_delete_language;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_language);
        if (imageButton != null) {
            i = R.id.checkBox;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.checkBox);
            if (imageView != null) {
                i = R.id.ll_item_panel;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
                if (linearLayout != null) {
                    i = R.id.menu_wrap_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
                    if (linearLayout2 != null) {
                        i = R.id.tv_btn;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_btn);
                        if (pFMedium != null) {
                            i = R.id.tv_state1;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_state1);
                            if (pFMedium2 != null) {
                                i = R.id.tv_state2;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_state2);
                                if (pFMedium3 != null) {
                                    i = R.id.tv_title1;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title1);
                                    if (pFMedium4 != null) {
                                        i = R.id.tv_title2;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_title2);
                                        if (textView != null) {
                                            return new ItemLanguageUpdateBinding((CardView) rootView, imageButton, imageView, linearLayout, linearLayout2, pFMedium, pFMedium2, pFMedium3, pFMedium4, textView);
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
    public static ItemLanguageUpdateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemLanguageUpdateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_language_update, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
