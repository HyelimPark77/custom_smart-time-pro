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
public final class ItemTeraBoxDirBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemTeraBoxTip;

    @NonNull
    public final PFMedium itemTeraBoxTitle;

    @NonNull
    private final LinearLayout rootView;

    private ItemTeraBoxDirBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemTeraBoxTip, @NonNull PFMedium itemTeraBoxTitle) {
        this.rootView = rootView;
        this.itemTeraBoxTip = itemTeraBoxTip;
        this.itemTeraBoxTitle = itemTeraBoxTitle;
    }

    @NonNull
    public static ItemTeraBoxDirBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_tera_box_tip;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_tera_box_tip);
        if (r1 == null) goto L9;
        r0 = R.id.item_tera_box_title;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_tera_box_title);
        if (r2 == null) goto L9;
        return new ItemTeraBoxDirBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemTeraBoxDirBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemTeraBoxDirBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_tera_box_dir, parent, false);
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
