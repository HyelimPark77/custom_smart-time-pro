package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemListChooseLanguageBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout itemLayoutBookLearn;

    @NonNull
    public final ImageView listItemChooseIv;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tv;

    private ItemListChooseLanguageBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout itemLayoutBookLearn, @NonNull ImageView listItemChooseIv, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.itemLayoutBookLearn = itemLayoutBookLearn;
        this.listItemChooseIv = listItemChooseIv;
        this.tv = tv;
    }

    @NonNull
    public static ItemListChooseLanguageBinding bind(@NonNull View rootView) {
        RelativeLayout r0 = (RelativeLayout) rootView;
        int r1 = R.id.list_item_choose_iv;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.list_item_choose_iv);
        if (r2 == null) goto L9;
        r1 = R.id.tv;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r3 == null) goto L9;
        return new ItemListChooseLanguageBinding(r0, r0, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ItemListChooseLanguageBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemListChooseLanguageBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_list_choose_language, parent, false);
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
