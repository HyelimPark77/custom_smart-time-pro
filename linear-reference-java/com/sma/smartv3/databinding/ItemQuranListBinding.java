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
        int r0 = R.id.item_quran_size;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_quran_size);
        if (r1 == null) goto L11;
        r0 = R.id.item_quran_title;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_quran_title);
        if (r2 == null) goto L11;
        r0 = R.id.tv_renew;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_renew);
        if (r3 == null) goto L11;
        return new ItemQuranListBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemQuranListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemQuranListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_quran_list, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
