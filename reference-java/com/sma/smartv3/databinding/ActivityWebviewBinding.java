package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWebviewBinding implements ViewBinding {

    @NonNull
    private final WebView rootView;

    @NonNull
    public final WebView webView;

    private ActivityWebviewBinding(@NonNull WebView rootView, @NonNull WebView webView) {
        this.rootView = rootView;
        this.webView = webView;
    }

    @NonNull
    public static ActivityWebviewBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        WebView webView = (WebView) rootView;
        return new ActivityWebviewBinding(webView, webView);
    }

    @NonNull
    public static ActivityWebviewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityWebviewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_webview, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public WebView getRoot() {
        return this.rootView;
    }
}
