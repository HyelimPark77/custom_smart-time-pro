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

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityHardWareAlipayBinding implements ViewBinding {

    @NonNull
    public final LinearLayout hardWareAlipayRideCode;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityHardWareAlipayBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout hardWareAlipayRideCode, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.hardWareAlipayRideCode = hardWareAlipayRideCode;
        this.root = root;
    }

    @NonNull
    public static ActivityHardWareAlipayBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hard_ware_alipay_ride_code);
        if (linearLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.hard_ware_alipay_ride_code)));
        }
        LinearLayout linearLayout2 = (LinearLayout) rootView;
        return new ActivityHardWareAlipayBinding(linearLayout2, linearLayout, linearLayout2);
    }

    @NonNull
    public static ActivityHardWareAlipayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHardWareAlipayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_hard_ware_alipay, parent, false);
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
