package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopCountDownBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flNum;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvDetail;

    @NonNull
    public final TextView tvNum;

    private PopCountDownBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout flNum, @NonNull TextView tvDetail, @NonNull TextView tvNum) {
        this.rootView = rootView;
        this.flNum = flNum;
        this.tvDetail = tvDetail;
        this.tvNum = tvNum;
    }

    @NonNull
    public static PopCountDownBinding bind(@NonNull View rootView) {
        int r0 = R.id.fl_num;
        FrameLayout r1 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_num);
        if (r1 == null) goto L11;
        r0 = R.id.tv_detail;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_detail);
        if (r2 == null) goto L11;
        r0 = R.id.tv_num;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_num);
        if (r3 == null) goto L11;
        return new PopCountDownBinding((FrameLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopCountDownBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopCountDownBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_count_down, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
