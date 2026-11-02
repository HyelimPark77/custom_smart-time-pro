package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemChargeScreensaverSelectBinding implements ViewBinding {

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageViewRound f51131iv;

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RelativeLayout f51132rv;

    @NonNull
    public final ImageView selectStatus;

    private ItemChargeScreensaverSelectBinding(@NonNull RelativeLayout rootView, @NonNull ImageViewRound iv, @NonNull RelativeLayout rv, @NonNull ImageView selectStatus) {
        this.rootView = rootView;
        this.f51131iv = iv;
        this.f51132rv = rv;
        this.selectStatus = selectStatus;
    }

    @NonNull
    public static ItemChargeScreensaverSelectBinding bind(@NonNull View rootView) {
        int i = R.id.f51417iv;
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageViewRound != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.selectStatus);
            if (imageView != null) {
                return new ItemChargeScreensaverSelectBinding(relativeLayout, imageViewRound, relativeLayout, imageView);
            }
            i = R.id.selectStatus;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemChargeScreensaverSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemChargeScreensaverSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_charge_screensaver_select, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
