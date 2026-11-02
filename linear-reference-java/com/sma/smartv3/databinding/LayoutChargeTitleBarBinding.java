package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutChargeTitleBarBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout titleBar;

    private LayoutChargeTitleBarBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout titleBar) {
        this.rootView = rootView;
        this.titleBar = titleBar;
    }

    @NonNull
    public static LayoutChargeTitleBarBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        LinearLayout r1 = (LinearLayout) rootView;
        return new LayoutChargeTitleBarBinding(r1, r1);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static LayoutChargeTitleBarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutChargeTitleBarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_charge_title_bar, parent, false);
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
