package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemReceiptCodeBinding implements ViewBinding {

    @NonNull
    public final ImageViewRound ivQrcode;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvNumber;

    private ItemReceiptCodeBinding(@NonNull RelativeLayout rootView, @NonNull ImageViewRound ivQrcode, @NonNull PFMedium tvName, @NonNull PFMedium tvNumber) {
        this.rootView = rootView;
        this.ivQrcode = ivQrcode;
        this.tvName = tvName;
        this.tvNumber = tvNumber;
    }

    @NonNull
    public static ItemReceiptCodeBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_qrcode;
        ImageViewRound r1 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_qrcode);
        if (r1 == null) goto L11;
        r0 = R.id.tv_name;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r2 == null) goto L11;
        r0 = R.id.tv_number;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_number);
        if (r3 == null) goto L11;
        return new ItemReceiptCodeBinding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemReceiptCodeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemReceiptCodeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_receipt_code, parent, false);
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
