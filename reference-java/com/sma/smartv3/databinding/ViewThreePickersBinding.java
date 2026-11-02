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
import com.sma.smartv3.view.WheelView.WheelView;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewThreePickersBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DINCondBold tvColon;

    @NonNull
    public final WheelView wv1;

    @NonNull
    public final WheelView wv2;

    @NonNull
    public final WheelView wv3;

    private ViewThreePickersBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold tvColon, @NonNull WheelView wv1, @NonNull WheelView wv2, @NonNull WheelView wv3) {
        this.rootView = rootView;
        this.tvColon = tvColon;
        this.wv1 = wv1;
        this.wv2 = wv2;
        this.wv3 = wv3;
    }

    @NonNull
    public static ViewThreePickersBinding bind(@NonNull View rootView) {
        int i = R.id.tvColon;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvColon);
        if (dINCondBold != null) {
            i = R.id.wv1;
            WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv1);
            if (wheelView != null) {
                i = R.id.wv2;
                WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv2);
                if (wheelView2 != null) {
                    i = R.id.wv3;
                    WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv3);
                    if (wheelView3 != null) {
                        return new ViewThreePickersBinding((LinearLayout) rootView, dINCondBold, wheelView, wheelView2, wheelView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewThreePickersBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewThreePickersBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_three_pickers, parent, false);
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
