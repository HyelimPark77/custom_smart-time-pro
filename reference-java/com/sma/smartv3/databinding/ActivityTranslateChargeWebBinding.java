package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTranslateChargeWebBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final WebView webView;

    private ActivityTranslateChargeWebBinding(@NonNull LinearLayout rootView, @NonNull WebView webView) {
        this.rootView = rootView;
        this.webView = webView;
    }

    @NonNull
    public static ActivityTranslateChargeWebBinding bind(@NonNull View rootView) {
        WebView webView = (WebView) ViewBindings.findChildViewById(rootView, R.id.webView);
        if (webView != null) {
            return new ActivityTranslateChargeWebBinding((LinearLayout) rootView, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.webView)));
    }

    @NonNull
    public static ActivityTranslateChargeWebBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTranslateChargeWebBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_translate_charge_web, parent, false);
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
