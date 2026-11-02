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
        int r0 = R.id.dial_qrcode_sycn_title3_tv;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_qrcode_sycn_title3_tv);
        if (r4 == null) goto L15;
        r0 = R.id.item_dial_pay_detail_limited_time_free;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_limited_time_free);
        if (r5 == null) goto L15;
        r0 = R.id.item_dial_pay_detail_memory;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_memory);
        if (r6 == null) goto L15;
        r0 = R.id.item_dial_pay_detail_new;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_new);
        if (r7 == null) goto L15;
        r0 = R.id.item_dial_pay_detail_title_amount;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_dial_pay_detail_title_amount);
        if (r8 == null) goto L15;
        return new ItemDialPayDetailTitleBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemDialPayDetailTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemDialPayDetailTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_dial_pay_detail_title, parent, false);
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
