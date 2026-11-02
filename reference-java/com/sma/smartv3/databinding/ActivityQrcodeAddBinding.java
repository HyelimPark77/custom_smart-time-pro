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
public final class ActivityQrcodeAddBinding implements ViewBinding {

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvTip1;

    private ActivityQrcodeAddBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout rootView, @NonNull PFMedium tvTip1) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.tvTip1 = tvTip1;
    }

    @NonNull
    public static ActivityQrcodeAddBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip1);
        if (pFMedium != null) {
            return new ActivityQrcodeAddBinding(linearLayout, linearLayout, pFMedium);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_tip1)));
    }

    @NonNull
    public static ActivityQrcodeAddBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityQrcodeAddBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_qrcode_add, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
