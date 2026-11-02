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
        int r0 = R.id.item_heath_iv;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_heath_iv);
        if (r1 == null) goto L11;
        r0 = R.id.item_heath_time;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_heath_time);
        if (r2 == null) goto L11;
        r0 = R.id.item_heath_title;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_heath_title);
        if (r3 == null) goto L11;
        return new ItemHeathReportsListBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemHeathReportsListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemHeathReportsListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_heath_reports_list, parent, false);
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
