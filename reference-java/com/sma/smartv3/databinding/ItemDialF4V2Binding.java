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

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageViewRound f51146iv;

    @NonNull
    public final TextView payAmount;

    /* JADX INFO: renamed from: pb */
    @NonNull
    public final ProgressButton f51147pb;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialF4V2Binding(@NonNull LinearLayout rootView, @NonNull LinearLayout dialLl, @NonNull ImageViewRound iv, @NonNull TextView payAmount, @NonNull ProgressButton pb) {
        this.rootView = rootView;
        this.dialLl = dialLl;
        this.f51146iv = iv;
        this.payAmount = payAmount;
        this.f51147pb = pb;
    }

    @NonNull
    public static ItemDialF4V2Binding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.f51417iv;
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageViewRound != null) {
            i = R.id.pay_amount;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.pay_amount);
            if (textView != null) {
                i = R.id.f51421pb;
                ProgressButton progressButton = (ProgressButton) ViewBindings.findChildViewById(rootView, R.id.f51421pb);
                if (progressButton != null) {
                    return new ItemDialF4V2Binding(linearLayout, linearLayout, imageViewRound, textView, progressButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDialF4V2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemDialF4V2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_dial_f4_v2, parent, false);
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
