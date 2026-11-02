package com.sma.androidthirdpartylogin.wechat;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cd1;
import com.android.mltcode.paycertificationapi.mq6;
import com.android.mltcode.paycertificationapi.nx1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.un4;
import com.blankj.utilcode.util.JsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidthirdpartylogin.C15427R;
import com.sma.androidthirdpartylogin.model.LoginResponse;
import com.tencent.p613mm.opensdk.modelbase.BaseReq;
import com.tencent.p613mm.opensdk.modelbase.BaseResp;
import com.tencent.p613mm.opensdk.modelmsg.SendAuth;
import com.tencent.p613mm.opensdk.openapi.IWXAPI;
import com.tencent.p613mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p613mm.opensdk.openapi.WXAPIFactory;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public abstract class WeChatBaseActivity extends AppCompatActivity implements IWXAPIEventHandler {

    @aa1
    private final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";

    @aa1
    private final String WX_USER_INFO_URL = "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s";
    public IWXAPI api;
    private boolean isNoGetOpenId;

    @aa1
    public final IWXAPI getApi() {
        IWXAPI iwxapi = this.api;
        if (iwxapi != null) {
            return iwxapi;
        }
        Intrinsics.XXO("api");
        return null;
    }

    public final boolean isNoGetOpenId() {
        return this.isNoGetOpenId;
    }

    public abstract void loginSuccess(@aa1 LoginResponse loginResponse);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C15427R.layout.activity_we_chat_login);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, mq6.OXO1(this), false);
        Intrinsics.O10IXXX0X(iwxapiCreateWXAPI, "createWXAPI(...)");
        setApi(iwxapiCreateWXAPI);
        try {
            getApi().handleIntent(getIntent(), this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@aa1 Intent intent) {
        Intrinsics.X0O(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        getApi().handleIntent(intent, this);
    }

    @Override // com.tencent.p613mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(@tb1 BaseReq baseReq) {
    }

    @Override // com.tencent.p613mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(@aa1 BaseResp resp) {
        Intrinsics.X0O(resp, "resp");
        LogUtils.m11128d("onResp = " + resp);
        if (resp.getType() != 1) {
            if (resp.getType() == 2) {
                finish();
                return;
            } else {
                toStartActivity(String.valueOf(resp.getType()));
                return;
            }
        }
        final String str = ((SendAuth.Resp) resp).code;
        if (this.isNoGetOpenId) {
            Intrinsics.XXI(str);
            loginSuccess(new LoginResponse(nx1.XIi00iiXO, null, null, null, null, null, null, null, str, 254, null));
            toStartActivity(null);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str2 = String.format(this.ACCESS_TOKEN_URL, Arrays.copyOf(new Object[]{mq6.OXO1(this), mq6.XIi00iiXO(this), str}, 3));
            Intrinsics.O10IXXX0X(str2, "format(...)");
            LogUtils.m11128d(str2);
            NetWork.m38061IO(NetWork.OXO1, str2, new O1XIiIO<JSONObject>() { // from class: com.sma.androidthirdpartylogin.wechat.WeChatBaseActivity.onResp.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(JSONObject jSONObject) {
                    String string;
                    StringBuilder sb = new StringBuilder();
                    sb.append("result ==");
                    sb.append(jSONObject != null ? jSONObject.toString() : null);
                    LogUtils.m11130i(sb.toString());
                    String string2 = JsonUtils.getString(jSONObject, "openid", "");
                    String string3 = JsonUtils.getString(jSONObject, "access_token", "");
                    String string4 = JsonUtils.getString(jSONObject, cd1.f5954IO, "");
                    String string5 = JsonUtils.getString(jSONObject, un4.f11531IO, "");
                    String str3 = (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
                    int i = JsonUtils.getInt(jSONObject, "errcode", -1);
                    Intrinsics.XXI(string2);
                    if (string2.length() == 0) {
                        String strValueOf = String.valueOf(jSONObject);
                        if (i == 40029) {
                            strValueOf = "取消登录";
                        }
                        WeChatBaseActivity.this.toStartActivity(strValueOf);
                        return;
                    }
                    Intrinsics.XXI(string3);
                    Intrinsics.XXI(string4);
                    Intrinsics.XXI(string5);
                    String str4 = str;
                    Intrinsics.XXI(str4);
                    WeChatBaseActivity.this.loginSuccess(new LoginResponse(nx1.XIi00iiXO, string2, string3, string4, null, null, str3, string5, str4, 48, null));
                    WeChatBaseActivity.this.toStartActivity(null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    WeChatBaseActivity.this.toStartActivity(error);
                }
            }, 0, 4, null);
        }
    }

    public final void setApi(@aa1 IWXAPI iwxapi) {
        Intrinsics.X0O(iwxapi, "<set-?>");
        this.api = iwxapi;
    }

    public final void setNoGetOpenId(boolean z) {
        this.isNoGetOpenId = z;
    }

    public abstract void toStartActivity(@tb1 String str);
}
