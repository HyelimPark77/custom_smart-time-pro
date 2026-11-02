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
        int i = R.id.fl_num;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_num);
        if (frameLayout != null) {
            i = R.id.tv_detail;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_detail);
            if (textView != null) {
                i = R.id.tv_num;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_num);
                if (textView2 != null) {
                    return new PopCountDownBinding((FrameLayout) rootView, frameLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopCountDownBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopCountDownBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_count_down, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
