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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityQrcodeSyncBinding implements ViewBinding {

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvTip1;

    private ActivityQrcodeSyncBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout rootView, @NonNull PFMedium tvTip1) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.tvTip1 = tvTip1;
    }

    @NonNull
    public static ActivityQrcodeSyncBinding bind(@NonNull View rootView) {
        LinearLayout r0 = (LinearLayout) rootView;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip1);
        if (r2 == null) goto L7;
        return new ActivityQrcodeSyncBinding(r0, r0, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_tip1)));
    }

    @NonNull
    public static ActivityQrcodeSyncBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityQrcodeSyncBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_qrcode_sync, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
