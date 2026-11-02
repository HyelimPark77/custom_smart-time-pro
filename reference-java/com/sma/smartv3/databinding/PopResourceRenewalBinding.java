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

/* JADX INFO: loaded from: classes19.dex */
public final class PopResourceRenewalBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llChoices;

    @NonNull
    private final LinearLayout rootView;

    private PopResourceRenewalBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llChoices) {
        this.rootView = rootView;
        this.llChoices = llChoices;
    }

    @NonNull
    public static PopResourceRenewalBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_choices);
        if (linearLayout != null) {
            return new PopResourceRenewalBinding((LinearLayout) rootView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ll_choices)));
    }

    @NonNull
    public static PopResourceRenewalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopResourceRenewalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_resource_renewal, parent, false);
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
