package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.otherdevice.p609jl.view.VerticalSeekBarView;
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
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        VerticalSeekBarView verticalSeekBarView = (VerticalSeekBarView) ViewBindings.findChildViewById(rootView, R.id.vsb_eq);
        if (verticalSeekBarView != null) {
            return new ItemEqSeekbarBinding(constraintLayout, constraintLayout, verticalSeekBarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.vsb_eq)));
    }

    @NonNull
    public static ItemEqSeekbarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemEqSeekbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_eq_seekbar, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
