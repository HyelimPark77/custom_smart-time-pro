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
import com.sma.smartv3.view.ad.ADPAdContainerView;

/* JADX INFO: loaded from: classes19.dex */
public final class AiItemBannerAdpBinding implements ViewBinding {

    @NonNull
    public final ADPAdContainerView adContainerView;

    @NonNull
    private final LinearLayout rootView;

    private AiItemBannerAdpBinding(@NonNull LinearLayout rootView, @NonNull ADPAdContainerView adContainerView) {
        this.rootView = rootView;
        this.adContainerView = adContainerView;
    }

    @NonNull
    public static AiItemBannerAdpBinding bind(@NonNull View rootView) {
        ADPAdContainerView r1 = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adContainerView);
        if (r1 == null) goto L7;
        return new AiItemBannerAdpBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.adContainerView)));
    }

    @NonNull
    public static AiItemBannerAdpBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiItemBannerAdpBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_item_banner_adp, parent, false);
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
