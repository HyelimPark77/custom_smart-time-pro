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
        LinearLayout r0 = (LinearLayout) rootView;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r2 == null) goto L7;
        return new ItemCommonBinding(r0, r0, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_name)));
    }

    @NonNull
    public static ItemCommonBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemCommonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_common, parent, false);
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
