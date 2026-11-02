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

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final PFMedium f51151tv;

    private ItemListChooseLanguageBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout itemLayoutBookLearn, @NonNull ImageView listItemChooseIv, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.itemLayoutBookLearn = itemLayoutBookLearn;
        this.listItemChooseIv = listItemChooseIv;
        this.f51151tv = tv;
    }

    @NonNull
    public static ItemListChooseLanguageBinding bind(@NonNull View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i = R.id.list_item_choose_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.list_item_choose_iv);
        if (imageView != null) {
            i = R.id.f51423tv;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
            if (pFMedium != null) {
                return new ItemListChooseLanguageBinding(relativeLayout, relativeLayout, imageView, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemListChooseLanguageBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemListChooseLanguageBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_list_choose_language, parent, false);
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
