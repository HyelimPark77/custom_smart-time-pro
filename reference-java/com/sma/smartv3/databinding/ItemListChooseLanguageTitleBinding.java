package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemListChooseLanguageTitleBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final PFMedium f51152tv;

    private ItemListChooseLanguageTitleBinding(@NonNull RelativeLayout rootView, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.f51152tv = tv;
    }

    @NonNull
    public static ItemListChooseLanguageTitleBinding bind(@NonNull View rootView) {
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
        if (pFMedium != null) {
            return new ItemListChooseLanguageTitleBinding((RelativeLayout) rootView, pFMedium);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51423tv)));
    }

    @NonNull
    public static ItemListChooseLanguageTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemListChooseLanguageTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_list_choose_language_title, parent, false);
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
