package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class AltaSpaceItemBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final View view;

    private AltaSpaceItemBinding(@NonNull View rootView, @NonNull View view) {
        this.rootView = rootView;
        this.view = view;
    }

    @NonNull
    public static AltaSpaceItemBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        return new AltaSpaceItemBinding(rootView, rootView);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static AltaSpaceItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AltaSpaceItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.alta_space_item, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }
}
