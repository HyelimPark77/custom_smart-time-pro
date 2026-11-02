package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMainWebviewJsbridgeBinding implements ViewBinding {

    @NonNull
    public final TextView rightTitleTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final BridgeWebView webView;

    private ActivityMainWebviewJsbridgeBinding(@NonNull LinearLayout rootView, @NonNull TextView rightTitleTv, @NonNull BridgeWebView webView) {
        this.rootView = rootView;
        this.rightTitleTv = rightTitleTv;
        this.webView = webView;
    }

    @NonNull
    public static ActivityMainWebviewJsbridgeBinding bind(@NonNull View rootView) {
        int r0 = R.id.rightTitleTv;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rightTitleTv);
        if (r1 == null) goto L9;
        r0 = R.id.webView;
        BridgeWebView r2 = (BridgeWebView) ViewBindings.findChildViewById(rootView, R.id.webView);
        if (r2 == null) goto L9;
        return new ActivityMainWebviewJsbridgeBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityMainWebviewJsbridgeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMainWebviewJsbridgeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_main_webview_jsbridge, parent, false);
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
