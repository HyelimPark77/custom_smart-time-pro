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
        int i = R.id.item_tera_box_tip;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_tera_box_tip);
        if (pFMedium != null) {
            i = R.id.item_tera_box_title;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_tera_box_title);
            if (pFMedium2 != null) {
                return new ItemTeraBoxDirBinding((LinearLayout) rootView, pFMedium, pFMedium2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemTeraBoxDirBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemTeraBoxDirBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_tera_box_dir, parent, false);
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
