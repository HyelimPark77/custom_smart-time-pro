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
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ClockViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DINCondBold tv1;

    @NonNull
    public final PFMedium tv2;

    private ClockViewBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold tv1, @NonNull PFMedium tv2) {
        this.rootView = rootView;
        this.tv1 = tv1;
        this.tv2 = tv2;
    }

    @NonNull
    public static ClockViewBinding bind(@NonNull View rootView) {
        int r0 = R.id.tv1;
        DINCondBold r1 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv1);
        if (r1 == null) goto L9;
        r0 = R.id.tv2;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv2);
        if (r2 == null) goto L9;
        return new ClockViewBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ClockViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ClockViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.clock_view, parent, false);
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
