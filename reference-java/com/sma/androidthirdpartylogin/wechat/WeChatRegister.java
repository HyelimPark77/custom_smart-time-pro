package com.sma.androidthirdpartylogin.wechat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.mq6;
import com.android.mltcode.paycertificationapi.tb1;
import com.tencent.p613mm.opensdk.openapi.WXAPIFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WeChatRegister extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@aa1 Context context, @tb1 Intent intent) {
        Intrinsics.X0O(context, "context");
        WXAPIFactory.createWXAPI(context, mq6.OXO1(context), false);
    }
}
