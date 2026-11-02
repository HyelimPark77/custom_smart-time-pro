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
        int r0 = R.id.bt_delete_language;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_language);
        if (r4 == null) goto L23;
        r0 = R.id.checkBox;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.checkBox);
        if (r5 == null) goto L23;
        r0 = R.id.ll_item_panel;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
        if (r6 == null) goto L23;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r7 == null) goto L23;
        r0 = R.id.tv_btn;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_btn);
        if (r8 == null) goto L23;
        r0 = R.id.tv_state1;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_state1);
        if (r9 == null) goto L23;
        r0 = R.id.tv_state2;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_state2);
        if (r10 == null) goto L23;
        r0 = R.id.tv_title1;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title1);
        if (r11 == null) goto L23;
        r0 = R.id.tv_title2;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_title2);
        if (r12 == null) goto L23;
        return new ItemLanguageUpdateBinding((CardView) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemLanguageUpdateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemLanguageUpdateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_language_update, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
