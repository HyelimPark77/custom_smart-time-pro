package com.sma.smartv3.ui.me;

import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public class ImmersiveGoogleWebViewActivity extends GoogleWebViewActivity {
    public ImmersiveGoogleWebViewActivity() {
    }

    @Override // com.sma.smartv3.ui.me.GoogleWebViewActivity, com.sma.smartv3.ui.me.WebViewActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        transparentNavBar();
        transparentStatusBar();
        super.initView();
    }

    @Override // com.sma.smartv3.ui.me.WebViewActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_main_immersive_webview;
    }
}
