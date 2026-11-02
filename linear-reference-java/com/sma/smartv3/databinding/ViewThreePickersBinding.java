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
        int r0 = R.id.tvColon;
        DINCondBold r4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvColon);
        if (r4 == null) goto L13;
        r0 = R.id.wv1;
        WheelView r5 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv1);
        if (r5 == null) goto L13;
        r0 = R.id.wv2;
        WheelView r6 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv2);
        if (r6 == null) goto L13;
        r0 = R.id.wv3;
        WheelView r7 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv3);
        if (r7 == null) goto L13;
        return new ViewThreePickersBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ViewThreePickersBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ViewThreePickersBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.view_three_pickers, parent, false);
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
