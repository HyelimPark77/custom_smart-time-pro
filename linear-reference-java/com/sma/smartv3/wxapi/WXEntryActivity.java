package com.sma.smartv3.wxapi;

import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.androidthirdpartylogin.model.LoginResponse;
import com.sma.androidthirdpartylogin.wechat.WeChatBaseActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class WXEntryActivity extends WeChatBaseActivity {
    public WXEntryActivity() {
    }

    @Override // com.sma.androidthirdpartylogin.wechat.WeChatBaseActivity
    public void loginSuccess(@aa1 LoginResponse r2) {
        Intrinsics.X0O(r2, "loginResponse");
        I01XX0.OXO1(I01XX0.XO0X10iO, r2);
    }

    @Override // com.sma.androidthirdpartylogin.wechat.WeChatBaseActivity
    public void toStartActivity(@tb1 String r2) {
        if (r2 == null) goto L4;
        LogUtils.d(new Object[]{r2});
        ToastUtils.showLong(r2, new Object[0]);
    L4:
        finish();
    }
}
