package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAppStoreTitleNameBinding implements ViewBinding {

    @NonNull
    public final PFMedium appStoreMoreTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final PFMedium tvName;

    private ItemAppStoreTitleNameBinding(@NonNull ConstraintLayout rootView, @NonNull PFMedium appStoreMoreTv, @NonNull PFMedium tvName) {
        this.rootView = rootView;
        this.appStoreMoreTv = appStoreMoreTv;
        this.tvName = tvName;
    }

    @NonNull
    public static ItemAppStoreTitleNameBinding bind(@NonNull View rootView) {
        int i = R.id.app_store_more_tv;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.app_store_more_tv);
        if (pFMedium != null) {
            i = R.id.tv_name;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
            if (pFMedium2 != null) {
                return new ItemAppStoreTitleNameBinding((ConstraintLayout) rootView, pFMedium, pFMedium2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAppStoreTitleNameBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAppStoreTitleNameBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_app_store_title_name, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
