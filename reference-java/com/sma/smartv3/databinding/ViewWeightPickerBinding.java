package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WheelView.WheelView;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewWeightPickerBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final WheelView wv1;

    @NonNull
    public final WheelView wv2;

    @NonNull
    public final LinearLayout wvs;

    private ViewWeightPickerBinding(@NonNull RelativeLayout rootView, @NonNull WheelView wv1, @NonNull WheelView wv2, @NonNull LinearLayout wvs) {
        this.rootView = rootView;
        this.wv1 = wv1;
        this.wv2 = wv2;
        this.wvs = wvs;
    }

    @NonNull
    public static ViewWeightPickerBinding bind(@NonNull View rootView) {
        int i = R.id.wv1;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv1);
        if (wheelView != null) {
            i = R.id.wv2;
            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv2);
            if (wheelView2 != null) {
                i = R.id.wvs;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.wvs);
                if (linearLayout != null) {
                    return new ViewWeightPickerBinding((RelativeLayout) rootView, wheelView, wheelView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewWeightPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewWeightPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_weight_picker, parent, false);
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
