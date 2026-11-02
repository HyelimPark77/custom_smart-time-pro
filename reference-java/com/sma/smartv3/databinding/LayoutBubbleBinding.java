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

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final TextView f51173tv;

    private LayoutBubbleBinding(@NonNull BubbleLayout rootView, @NonNull TextView tv) {
        this.rootView = rootView;
        this.f51173tv = tv;
    }

    @NonNull
    public static LayoutBubbleBinding bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
        if (textView != null) {
            return new LayoutBubbleBinding((BubbleLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51423tv)));
    }

    @NonNull
    public static LayoutBubbleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutBubbleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_bubble, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public BubbleLayout getRoot() {
        return this.rootView;
    }
}
