package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMainImmersiveWebviewBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final WebView webView;

    private ActivityMainImmersiveWebviewBinding(@NonNull RelativeLayout rootView, @NonNull WebView webView) {
        this.rootView = rootView;
        this.webView = webView;
    }

    @NonNull
    public static ActivityMainImmersiveWebviewBinding bind(@NonNull View rootView) {
        WebView r1 = (WebView) ViewBindings.findChildViewById(rootView, R.id.webView);
        if (r1 == null) goto L7;
        return new ActivityMainImmersiveWebviewBinding((RelativeLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.webView)));
    }

    @NonNull
    public static ActivityMainImmersiveWebviewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMainImmersiveWebviewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_main_immersive_webview, parent, false);
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
