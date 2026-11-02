package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemDialPayDetailTitleBinding implements ViewBinding {

    @NonNull
    public final PFMedium dialQrcodeSycnTitle3Tv;

    @NonNull
    public final PFMedium itemDialPayDetailLimitedTimeFree;

    @NonNull
    public final PFMedium itemDialPayDetailMemory;

    @NonNull
    public final PFMedium itemDialPayDetailNew;

    @NonNull
    public final TextView itemDialPayDetailTitleAmount;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialPayDetailTitleBinding(@NonNull LinearLayout rootView, @NonNull PFMedium dialQrcodeSycnTitle3Tv, @NonNull PFMedium itemDialPayDetailLimitedTimeFree, @NonNull PFMedium itemDialPayDetailMemory, @NonNull PFMedium itemDialPayDetailNew, @NonNull TextView itemDialPayDetailTitleAmount) {
        this.rootView = rootView;
        this.dialQrcodeSycnTitle3Tv = dialQrcodeSycnTitle3Tv;
        this.itemDialPayDetailLimitedTimeFree = itemDialPayDetailLimitedTimeFree;
        this.itemDialPayDetailMemory = itemDialPayDetailMemory;
        this.itemDialPayDetailNew = itemDialPayDetailNew;
        this.itemDialPayDetailTitleAmount = itemDialPayDetailTitleAmount;
    }

    @NonNull
    public static ItemDialPayDetailTitleBinding bind(@NonNull View rootView) {
        int i = R.id.dial_qrcode_sycn_title3_tv;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_qrcode_sycn_title3_tv);
        if (pFMedium != null) {
            i = R.id.item_dial_pay_detail_limited_time_free;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_limited_time_free);
            if (pFMedium2 != null) {
                i = R.id.item_dial_pay_detail_memory;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_memory);
                if (pFMedium3 != null) {
                    i = R.id.item_dial_pay_detail_new;
                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_new);
                    if (pFMedium4 != null) {
                        i = R.id.item_dial_pay_detail_title_amount;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_title_amount);
                        if (textView != null) {
                            return new ItemDialPayDetailTitleBinding((LinearLayout) rootView, pFMedium, pFMedium2, pFMedium3, pFMedium4, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDialPayDetailTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemDialPayDetailTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_dial_pay_detail_title, parent, false);
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
