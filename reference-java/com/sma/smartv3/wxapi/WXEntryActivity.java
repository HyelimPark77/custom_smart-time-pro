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
    @Override // com.sma.androidthirdpartylogin.wechat.WeChatBaseActivity
    public void loginSuccess(@aa1 LoginResponse loginResponse) {
        Intrinsics.X0O(loginResponse, "loginResponse");
        I01XX0.OXO1(I01XX0.XO0X10iO, loginResponse);
    }

    @Override // com.sma.androidthirdpartylogin.wechat.WeChatBaseActivity
    public void toStartActivity(@tb1 String str) {
        if (str != null) {
            LogUtils.m11128d(str);
            ToastUtils.showLong(str, new Object[0]);
        }
        finish();
    }
}
