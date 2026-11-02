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
public final class LayoutPopBottomBtnBinding implements ViewBinding {

    @NonNull
    public final PFMedium action1;

    @NonNull
    public final PFMedium action2;

    @NonNull
    public final LinearLayout llButton;

    @NonNull
    private final LinearLayout rootView;

    private LayoutPopBottomBtnBinding(@NonNull LinearLayout rootView, @NonNull PFMedium action1, @NonNull PFMedium action2, @NonNull LinearLayout llButton) {
        this.rootView = rootView;
        this.action1 = action1;
        this.action2 = action2;
        this.llButton = llButton;
    }

    @NonNull
    public static LayoutPopBottomBtnBinding bind(@NonNull View rootView) {
        int r0 = R.id.action1;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.action1);
        if (r1 == null) goto L9;
        r0 = R.id.action2;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.action2);
        if (r2 == null) goto L9;
        LinearLayout r3 = (LinearLayout) rootView;
        return new LayoutPopBottomBtnBinding(r3, r1, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutPopBottomBtnBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutPopBottomBtnBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_pop_bottom_btn, parent, false);
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
