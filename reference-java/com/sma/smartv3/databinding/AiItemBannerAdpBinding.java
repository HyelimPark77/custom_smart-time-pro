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
import com.sma.smartv3.view.p256ad.ADPAdContainerView;

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
        ADPAdContainerView aDPAdContainerView = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adContainerView);
        if (aDPAdContainerView != null) {
            return new AiItemBannerAdpBinding((LinearLayout) rootView, aDPAdContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.adContainerView)));
    }

    @NonNull
    public static AiItemBannerAdpBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiItemBannerAdpBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_item_banner_adp, parent, false);
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
