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
        int i = R.id.rightTitleTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.rightTitleTv);
        if (textView != null) {
            i = R.id.webView;
            BridgeWebView bridgeWebView = (BridgeWebView) ViewBindings.findChildViewById(rootView, R.id.webView);
            if (bridgeWebView != null) {
                return new ActivityMainWebviewJsbridgeBinding((LinearLayout) rootView, textView, bridgeWebView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMainWebviewJsbridgeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMainWebviewJsbridgeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_main_webview_jsbridge, parent, false);
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
