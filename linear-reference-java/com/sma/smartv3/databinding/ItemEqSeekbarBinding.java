package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.otherdevice.jl.view.VerticalSeekBarView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemEqSeekbarBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout clMain;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final VerticalSeekBarView vsbEq;

    private ItemEqSeekbarBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout clMain, @NonNull VerticalSeekBarView vsbEq) {
        this.rootView = rootView;
        this.clMain = clMain;
        this.vsbEq = vsbEq;
    }

    @NonNull
    public static ItemEqSeekbarBinding bind(@NonNull View rootView) {
        ConstraintLayout r0 = (ConstraintLayout) rootView;
        VerticalSeekBarView r2 = (VerticalSeekBarView) ViewBindings.findChildViewById(rootView, R.id.vsb_eq);
        if (r2 == null) goto L7;
        return new ItemEqSeekbarBinding(r0, r0, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.vsb_eq)));
    }

    @NonNull
    public static ItemEqSeekbarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemEqSeekbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_eq_seekbar, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
