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
        int i = R.id.tv1;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv1);
        if (dINCondBold != null) {
            i = R.id.tv2;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv2);
            if (pFMedium != null) {
                return new ClockViewBinding((LinearLayout) rootView, dINCondBold, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ClockViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ClockViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.clock_view, parent, false);
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
