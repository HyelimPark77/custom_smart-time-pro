package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSportDataBinding implements ViewBinding {

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51160iv;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final PFMedium f51161tv;

    private ItemSportDataBinding(@NonNull LinearLayout rootView, @NonNull ImageView iv, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.f51160iv = iv;
        this.f51161tv = tv;
    }

    @NonNull
    public static ItemSportDataBinding bind(@NonNull View rootView) {
        int i = R.id.f51417iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageView != null) {
            i = R.id.f51423tv;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
            if (pFMedium != null) {
                return new ItemSportDataBinding((LinearLayout) rootView, imageView, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_data, parent, false);
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
