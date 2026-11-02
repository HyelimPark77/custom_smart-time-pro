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
public final class ViewValuePickerBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final WheelView wv1;

    @NonNull
    public final LinearLayout wvs;

    private ViewValuePickerBinding(@NonNull RelativeLayout rootView, @NonNull WheelView wv1, @NonNull LinearLayout wvs) {
        this.rootView = rootView;
        this.wv1 = wv1;
        this.wvs = wvs;
    }

    @NonNull
    public static ViewValuePickerBinding bind(@NonNull View rootView) {
        int i = R.id.wv1;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv1);
        if (wheelView != null) {
            i = R.id.wvs;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.wvs);
            if (linearLayout != null) {
                return new ViewValuePickerBinding((RelativeLayout) rootView, wheelView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewValuePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewValuePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_value_picker, parent, false);
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
