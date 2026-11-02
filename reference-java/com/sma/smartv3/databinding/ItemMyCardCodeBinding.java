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
public final class ItemMyCardCodeBinding implements ViewBinding {

    @NonNull
    public final ImageViewRound ivQrcode;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvNumber;

    private ItemMyCardCodeBinding(@NonNull RelativeLayout rootView, @NonNull ImageViewRound ivQrcode, @NonNull PFMedium tvName, @NonNull PFMedium tvNumber) {
        this.rootView = rootView;
        this.ivQrcode = ivQrcode;
        this.tvName = tvName;
        this.tvNumber = tvNumber;
    }

    @NonNull
    public static ItemMyCardCodeBinding bind(@NonNull View rootView) {
        int i = R.id.iv_qrcode;
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_qrcode);
        if (imageViewRound != null) {
            i = R.id.tv_name;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
            if (pFMedium != null) {
                i = R.id.tv_number;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_number);
                if (pFMedium2 != null) {
                    return new ItemMyCardCodeBinding((RelativeLayout) rootView, imageViewRound, pFMedium, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMyCardCodeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemMyCardCodeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_my_card_code, parent, false);
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
