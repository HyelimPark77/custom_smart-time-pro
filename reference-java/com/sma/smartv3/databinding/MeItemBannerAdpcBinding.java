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
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;

/* JADX INFO: loaded from: classes19.dex */
public final class MeItemBannerAdpcBinding implements ViewBinding {

    @NonNull
    public final ADPCAdContainerView adContainerView;

    @NonNull
    private final LinearLayout rootView;

    private MeItemBannerAdpcBinding(@NonNull LinearLayout rootView, @NonNull ADPCAdContainerView adContainerView) {
        this.rootView = rootView;
        this.adContainerView = adContainerView;
    }

    @NonNull
    public static MeItemBannerAdpcBinding bind(@NonNull View rootView) {
        ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adContainerView);
        if (aDPCAdContainerView != null) {
            return new MeItemBannerAdpcBinding((LinearLayout) rootView, aDPCAdContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.adContainerView)));
    }

    @NonNull
    public static MeItemBannerAdpcBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MeItemBannerAdpcBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.me_item_banner_adpc, parent, false);
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
