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
import com.sma.smartv3.view.text.FontTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class PopPowerHintBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FontTextView tvContent;

    @NonNull
    public final FontTextView tvTitle;

    private PopPowerHintBinding(@NonNull LinearLayout rootView, @NonNull FontTextView tvContent, @NonNull FontTextView tvTitle) {
        this.rootView = rootView;
        this.tvContent = tvContent;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static PopPowerHintBinding bind(@NonNull View rootView) {
        int i = R.id.tv_content;
        FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_content);
        if (fontTextView != null) {
            i = R.id.tv_title;
            FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_title);
            if (fontTextView2 != null) {
                return new PopPowerHintBinding((LinearLayout) rootView, fontTextView, fontTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopPowerHintBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopPowerHintBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_power_hint, parent, false);
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
