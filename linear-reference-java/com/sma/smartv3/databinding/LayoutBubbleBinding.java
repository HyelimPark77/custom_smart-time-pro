package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.bubbleview.BubbleLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutBubbleBinding implements ViewBinding {

    @NonNull
    private final BubbleLayout rootView;

    @NonNull
    public final TextView tv;

    private LayoutBubbleBinding(@NonNull BubbleLayout rootView, @NonNull TextView tv) {
        this.rootView = rootView;
        this.tv = tv;
    }

    @NonNull
    public static LayoutBubbleBinding bind(@NonNull View rootView) {
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r1 == null) goto L7;
        return new LayoutBubbleBinding((BubbleLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv)));
    }

    @NonNull
    public static LayoutBubbleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutBubbleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_bubble, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public BubbleLayout getRoot() {
        return this.rootView;
    }
}
