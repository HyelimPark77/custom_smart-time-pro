package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemResourceRenewalListBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemQuranSize;

    @NonNull
    public final PFMedium itemQuranTitle;

    @NonNull
    private final LinearLayout rootView;

    private ItemResourceRenewalListBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemQuranSize, @NonNull PFMedium itemQuranTitle) {
        this.rootView = rootView;
        this.itemQuranSize = itemQuranSize;
        this.itemQuranTitle = itemQuranTitle;
    }

    @NonNull
    public static ItemResourceRenewalListBinding bind(@NonNull View rootView) {
        int i = R.id.item_quran_size;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_quran_size);
        if (pFMedium != null) {
            i = R.id.item_quran_title;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_quran_title);
            if (pFMedium2 != null) {
                return new ItemResourceRenewalListBinding((LinearLayout) rootView, pFMedium, pFMedium2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemResourceRenewalListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemResourceRenewalListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_resource_renewal_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
