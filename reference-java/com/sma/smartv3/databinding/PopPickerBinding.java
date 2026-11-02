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

/* JADX INFO: loaded from: classes19.dex */
public final class PopPickerBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: wv */
    @NonNull
    public final WheelView f51186wv;

    private PopPickerBinding(@NonNull LinearLayout rootView, @NonNull WheelView wv) {
        this.rootView = rootView;
        this.f51186wv = wv;
    }

    @NonNull
    public static PopPickerBinding bind(@NonNull View rootView) {
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.f51425wv);
        if (wheelView != null) {
            return new PopPickerBinding((LinearLayout) rootView, wheelView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51425wv)));
    }

    @NonNull
    public static PopPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_picker, parent, false);
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
