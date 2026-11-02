package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemTempreatureHeathBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout rootView;

    private V2StatusItemTempreatureHeathBinding(@NonNull ConstraintLayout rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static V2StatusItemTempreatureHeathBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        return new V2StatusItemTempreatureHeathBinding((ConstraintLayout) rootView);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static V2StatusItemTempreatureHeathBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemTempreatureHeathBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_tempreature_heath, parent, false);
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
