package com.sma.androidthirdpartylogin.wechat;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.mq6;
import com.android.mltcode.paycertificationapi.nx1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidthirdpartylogin.R;
import com.sma.androidthirdpartylogin.model.LoginResponse;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
public abstract class WeChatBaseActivity extends AppCompatActivity implements IWXAPIEventHandler {

    @aa1
    private final String ACCESS_TOKEN_URL;

    @aa1
    private final String WX_USER_INFO_URL;
    public IWXAPI api;
    private boolean isNoGetOpenId;

    public WeChatBaseActivity() {
        this.ACCESS_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";
        this.WX_USER_INFO_URL = "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s";
    }

    @aa1
    public final IWXAPI getApi() {
        IWXAPI r0 = this.api;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("api");
        return null;
    }

    public final boolean isNoGetOpenId() {
        return this.isNoGetOpenId;
    }

    public abstract void loginSuccess(@aa1 LoginResponse r1);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r2) {
        super.onCreate(r2);
        setContentView(R.layout.activity_we_chat_login);
        IWXAPI r3 = WXAPIFactory.createWXAPI(this, mq6.OXO1(this), false);
        Intrinsics.O10IXXX0X(r3, "createWXAPI(...)");
        setApi(r3);
        Intent r4 = getIntent();     // Catch: Exception -> L5
        getApi().handleIntent(r4, this);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@aa1 Intent r2) {
        Intrinsics.X0O(r2, SDKConstants.PARAM_INTENT);
        super.onNewIntent(r2);
        setIntent(r2);
        getApi().handleIntent(r2, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(@tb1 BaseReq r1) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(@aa1 BaseResp r13) {
        Intrinsics.X0O(r13, "resp");
        LogUtils.d(new Object[]{"onResp = " + r13});
        if (r13.getType() != 1) goto L11;
        final String r9 = ((SendAuth.Resp) r13).code;
        if (this.isNoGetOpenId == false) goto L8;
        Intrinsics.XXI(r9);
        loginSuccess(new LoginResponse(nx1.XIi00iiXO, null, null, null, null, null, null, null, r9, 254, null));
        toStartActivity(null);
        return;
    L8:
        StringCompanionObject r14 = StringCompanionObject.OXO1;
        String r2 = String.format(this.ACCESS_TOKEN_URL, Arrays.copyOf(new Object[]{mq6.OXO1(this), mq6.XIi00iiXO(this), r9}, 3));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        LogUtils.d(new Object[]{r2});
        NetWork.IO(NetWork.OXO1, r2, new AnonymousClass1(this, r9), 0, 4, null);
        return;
    L11:
        if (r13.getType() != 2) goto L14;
        finish();
        return;
    L14:
        toStartActivity(String.valueOf(r13.getType()));
    }

    public final void setApi(@aa1 IWXAPI r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.api = r2;
    }

    public final void setNoGetOpenId(boolean r1) {
        this.isNoGetOpenId = r1;
    }

    public abstract void toStartActivity(@tb1 String r1);
}
