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

    @NonNull
    public final ImageViewRound iv;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout rv;

    @NonNull
    public final ImageView selectStatus;

    private ItemChargeScreensaverSelectBinding(@NonNull RelativeLayout rootView, @NonNull ImageViewRound iv, @NonNull RelativeLayout rv, @NonNull ImageView selectStatus) {
        this.rootView = rootView;
        this.iv = iv;
        this.rv = rv;
        this.selectStatus = selectStatus;
    }

    @NonNull
    public static ItemChargeScreensaverSelectBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv;
        ImageViewRound r1 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L10;
        RelativeLayout r2 = (RelativeLayout) rootView;
        ImageView r3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.selectStatus);
        if (r3 != null) goto L7;
        r0 = R.id.selectStatus;
        goto L10
    L7:
        return new ItemChargeScreensaverSelectBinding(r2, r1, r2, r3);
    L10:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemChargeScreensaverSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemChargeScreensaverSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_charge_screensaver_select, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
