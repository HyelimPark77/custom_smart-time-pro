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
public final class ItemCommonBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llItemPanel;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvName;

    private ItemCommonBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llItemPanel, @NonNull PFMedium tvName) {
        this.rootView = rootView;
        this.llItemPanel = llItemPanel;
        this.tvName = tvName;
    }

    @NonNull
    public static ItemCommonBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (pFMedium != null) {
            return new ItemCommonBinding(linearLayout, linearLayout, pFMedium);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_name)));
    }

    @NonNull
    public static ItemCommonBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemCommonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_common, parent, false);
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
