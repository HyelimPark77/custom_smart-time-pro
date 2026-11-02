package com.sma.androidthirdpartylogin.wechat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.mq6;
import com.android.mltcode.paycertificationapi.tb1;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WeChatRegister extends BroadcastReceiver {
    public WeChatRegister() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@aa1 Context r2, @tb1 Intent r3) {
        Intrinsics.X0O(r2, "context");
        WXAPIFactory.createWXAPI(r2, mq6.OXO1(r2), false);
    }
}
