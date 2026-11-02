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
public final class ItemQuranListBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemQuranSize;

    @NonNull
    public final PFMedium itemQuranTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvRenew;

    private ItemQuranListBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemQuranSize, @NonNull PFMedium itemQuranTitle, @NonNull PFMedium tvRenew) {
        this.rootView = rootView;
        this.itemQuranSize = itemQuranSize;
        this.itemQuranTitle = itemQuranTitle;
        this.tvRenew = tvRenew;
    }

    @NonNull
    public static ItemQuranListBinding bind(@NonNull View rootView) {
        int i = R.id.item_quran_size;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_quran_size);
        if (pFMedium != null) {
            i = R.id.item_quran_title;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_quran_title);
            if (pFMedium2 != null) {
                i = R.id.tv_renew;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_renew);
                if (pFMedium3 != null) {
                    return new ItemQuranListBinding((LinearLayout) rootView, pFMedium, pFMedium2, pFMedium3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemQuranListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemQuranListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_quran_list, parent, false);
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
