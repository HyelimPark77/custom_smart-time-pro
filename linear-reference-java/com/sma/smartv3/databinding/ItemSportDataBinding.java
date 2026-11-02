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

    @NonNull
    public final ImageView iv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tv;

    private ItemSportDataBinding(@NonNull LinearLayout rootView, @NonNull ImageView iv, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.iv = iv;
        this.tv = tv;
    }

    @NonNull
    public static ItemSportDataBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L9;
        r0 = R.id.tv;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r2 == null) goto L9;
        return new ItemSportDataBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSportDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSportDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sport_data, parent, false);
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
