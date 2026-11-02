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
        int r0 = R.id.wv1;
        WheelView r1 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv1);
        if (r1 == null) goto L11;
        r0 = R.id.wv2;
        WheelView r2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv2);
        if (r2 == null) goto L11;
        r0 = R.id.wvs;
        LinearLayout r3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.wvs);
        if (r3 == null) goto L11;
        return new ViewWeightPickerBinding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ViewWeightPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ViewWeightPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.view_weight_picker, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
