package com.sma.smartv3.databinding;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutTabCustomBinding implements ViewBinding {

    @NonNull
    public final ImageView icon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView text1;

    private LayoutTabCustomBinding(@NonNull LinearLayout rootView, @NonNull ImageView icon, @NonNull TextView text1) {
        this.rootView = rootView;
        this.icon = icon;
        this.text1 = text1;
    }

    @NonNull
    public static LayoutTabCustomBinding bind(@NonNull View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
        if (imageView != null) {
            i = R.id.text1;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text1);
            if (textView != null) {
                return new LayoutTabCustomBinding((LinearLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutTabCustomBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutTabCustomBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(com.sma.smartv3.pro.R.layout.layout_tab_custom, parent, false);
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
