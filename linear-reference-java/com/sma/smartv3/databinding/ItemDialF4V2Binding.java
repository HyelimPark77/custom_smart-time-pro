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
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.ProgressButton;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemDialF4V2Binding implements ViewBinding {

    @NonNull
    public final LinearLayout dialLl;

    @NonNull
    public final ImageViewRound iv;

    @NonNull
    public final TextView payAmount;

    @NonNull
    public final ProgressButton pb;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialF4V2Binding(@NonNull LinearLayout rootView, @NonNull LinearLayout dialLl, @NonNull ImageViewRound iv, @NonNull TextView payAmount, @NonNull ProgressButton pb) {
        this.rootView = rootView;
        this.dialLl = dialLl;
        this.iv = iv;
        this.payAmount = payAmount;
        this.pb = pb;
    }

    @NonNull
    public static ItemDialF4V2Binding bind(@NonNull View rootView) {
        LinearLayout r1 = (LinearLayout) rootView;
        int r0 = R.id.iv;
        ImageViewRound r3 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r3 == null) goto L11;
        r0 = R.id.pay_amount;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pay_amount);
        if (r4 == null) goto L11;
        r0 = R.id.pb;
        ProgressButton r5 = (ProgressButton) ViewBindings.findChildViewById(rootView, R.id.pb);
        if (r5 == null) goto L11;
        return new ItemDialF4V2Binding(r1, r1, r3, r4, r5);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemDialF4V2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemDialF4V2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_dial_f4_v2, parent, false);
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
