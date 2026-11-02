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
public final class ItemHeathReportsListBinding implements ViewBinding {

    @NonNull
    public final ImageView itemHeathIv;

    @NonNull
    public final PFMedium itemHeathTime;

    @NonNull
    public final PFMedium itemHeathTitle;

    @NonNull
    private final LinearLayout rootView;

    private ItemHeathReportsListBinding(@NonNull LinearLayout rootView, @NonNull ImageView itemHeathIv, @NonNull PFMedium itemHeathTime, @NonNull PFMedium itemHeathTitle) {
        this.rootView = rootView;
        this.itemHeathIv = itemHeathIv;
        this.itemHeathTime = itemHeathTime;
        this.itemHeathTitle = itemHeathTitle;
    }

    @NonNull
    public static ItemHeathReportsListBinding bind(@NonNull View rootView) {
        int i = R.id.item_heath_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_heath_iv);
        if (imageView != null) {
            i = R.id.item_heath_time;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_heath_time);
            if (pFMedium != null) {
                i = R.id.item_heath_title;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_heath_title);
                if (pFMedium2 != null) {
                    return new ItemHeathReportsListBinding((LinearLayout) rootView, imageView, pFMedium, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemHeathReportsListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemHeathReportsListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_heath_reports_list, parent, false);
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
