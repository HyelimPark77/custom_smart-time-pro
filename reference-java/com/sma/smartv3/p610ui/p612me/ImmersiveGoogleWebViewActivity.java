package com.sma.smartv3.p610ui.p612me;

import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public class ImmersiveGoogleWebViewActivity extends GoogleWebViewActivity {
    @Override // com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity, com.sma.smartv3.p610ui.p612me.WebViewActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        transparentNavBar();
        transparentStatusBar();
        super.initView();
    }

    @Override // com.sma.smartv3.p610ui.p612me.WebViewActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_main_immersive_webview;
    }
}
