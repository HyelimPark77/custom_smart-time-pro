package com.sma.smartv3.p610ui.login;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cy6;
import com.android.mltcode.paycertificationapi.ga2;
import com.android.mltcode.paycertificationapi.i0I01iiO0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iXI0OOOIi;
import com.android.mltcode.paycertificationapi.lq6;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.wq5;
import com.android.mltcode.paycertificationapi.xq5;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.androidthirdpartylogin.model.LoginResponse;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.ThirdPartyLogin;
import com.sma.smartv3.p610ui.login.StartGoogleActivity;
import com.sma.smartv3.pro.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nStartGoogleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartGoogleActivity.kt\ncom/sma/smartv3/ui/login/StartGoogleActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,170:1\n183#2,4:171\n196#2:183\n252#3,7:175\n270#3:182\n*S KotlinDebug\n*F\n+ 1 StartGoogleActivity.kt\ncom/sma/smartv3/ui/login/StartGoogleActivity\n*L\n128#1:171,4\n128#1:183\n128#1:175,7\n128#1:182\n*E\n"})
public final class StartGoogleActivity extends BaseActivity {

    @aa1
    private final String TAG = "StartGoogleActivity";

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y75
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StartGoogleActivity.rv_delegate$lambda$0(this.f12327IO);
        }
    });

    @aa1
    private final Lazy weChatRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z75
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StartGoogleActivity.weChatRl_delegate$lambda$0(this.f12551IO);
        }
    });

    @aa1
    private final Lazy QQRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a85
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StartGoogleActivity.QQRl_delegate$lambda$0(this.f5442IO);
        }
    });

    @aa1
    private final Lazy weiBoRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b85
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StartGoogleActivity.weiBoRl_delegate$lambda$0(this.f5687IO);
        }
    });

    @aa1
    private final Lazy faceBookRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c85
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StartGoogleActivity.faceBookRl_delegate$lambda$0(this.f5928IO);
        }
    });

    @aa1
    private final Lazy twitterRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d85
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StartGoogleActivity.twitterRl_delegate$lambda$0(this.f6148IO);
        }
    });

    @aa1
    private final Lazy googleRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e85
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StartGoogleActivity.googleRl_delegate$lambda$0(this.f6353IO);
        }
    });

    @aa1
    private final OXO1 thirdPartyCallback = new OXO1();

    public static final class OXO1 implements wq5 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.wq5
        public void OXO1(String lb) {
            Intrinsics.X0O(lb, "lb");
            ToastUtils.showLong(lb, new Object[0]);
        }

        @Override // com.android.mltcode.paycertificationapi.wq5
        public void XIi00iiXO(LoginResponse loginResponse) {
            if (loginResponse == null) {
                ToastUtils.showLong(R.string.login_failed_please_try_again);
            } else {
                StartGoogleActivity.this.thirdPartyLogin(loginResponse);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout QQRl_delegate$lambda$0(StartGoogleActivity startGoogleActivity) {
        return (RelativeLayout) startGoogleActivity.findViewById(R.id.QQRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout faceBookRl_delegate$lambda$0(StartGoogleActivity startGoogleActivity) {
        return (RelativeLayout) startGoogleActivity.findViewById(R.id.faceBookRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout googleRl_delegate$lambda$0(StartGoogleActivity startGoogleActivity) {
        return (RelativeLayout) startGoogleActivity.findViewById(R.id.googleRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView rv_delegate$lambda$0(StartGoogleActivity startGoogleActivity) {
        return (NestedScrollView) startGoogleActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void thirdPartyLogin(LoginResponse loginResponse) {
        LogUtils.m11128d(loginResponse);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap thirdPartyBody$default = RequestBodyKt.getThirdPartyBody$default(loginResponse.I0IIOi(), loginResponse.XOO0ii0(), loginResponse.m38064iO(), null, null, null, 56, null);
        final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.login.StartGoogleActivity.thirdPartyLogin.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser) {
                a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser));
                i72.OXO1.m2053XX(StartGoogleActivity.this);
                I01XX0.XIi00iiXO(I01XX0.Ii0X0X, null, 2, null);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRv());
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ThirdPartyLogin.URL);
        netWorkUtils.printParam(strConvertBaseUrl + ThirdPartyLogin.URL, thirdPartyBody$default);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + ThirdPartyLogin.URL;
        final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.StartGoogleActivity$thirdPartyLogin$$inlined$post$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppUser> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity = this;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) thirdPartyBody$default).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.StartGoogleActivity$thirdPartyLogin$$inlined$post$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AppUser> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout twitterRl_delegate$lambda$0(StartGoogleActivity startGoogleActivity) {
        return (RelativeLayout) startGoogleActivity.findViewById(R.id.twitterRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout weChatRl_delegate$lambda$0(StartGoogleActivity startGoogleActivity) {
        return (RelativeLayout) startGoogleActivity.findViewById(R.id.weChatRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout weiBoRl_delegate$lambda$0(StartGoogleActivity startGoogleActivity) {
        return (RelativeLayout) startGoogleActivity.findViewById(R.id.weiBoRl);
    }

    public final void emailLogin(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        i72.OXO1.i10X0X0i(getMContext());
    }

    public final void faceBook(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        iXI0OOOIi.OXO1.XIi00iiXO(this, this.thirdPartyCallback);
    }

    public final RelativeLayout getFaceBookRl() {
        return (RelativeLayout) this.faceBookRl$delegate.getValue();
    }

    public final RelativeLayout getGoogleRl() {
        return (RelativeLayout) this.googleRl$delegate.getValue();
    }

    public final RelativeLayout getQQRl() {
        return (RelativeLayout) this.QQRl$delegate.getValue();
    }

    public final NestedScrollView getRv() {
        return (NestedScrollView) this.rv$delegate.getValue();
    }

    public final RelativeLayout getTwitterRl() {
        return (RelativeLayout) this.twitterRl$delegate.getValue();
    }

    public final RelativeLayout getWeChatRl() {
        return (RelativeLayout) this.weChatRl$delegate.getValue();
    }

    public final RelativeLayout getWeiBoRl() {
        return (RelativeLayout) this.weiBoRl$delegate.getValue();
    }

    public final void google(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        String strXO0O10 = i0I01iiO0.OXO1.XO0O10(this, this.thirdPartyCallback);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " google : clientID = " + strXO0O10);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        iXI0OOOIi ixi0oooii = iXI0OOOIi.OXO1;
        Application application = getApplication();
        Intrinsics.O10IXXX0X(application, "getApplication(...)");
        ixi0oooii.OXO1(application);
        cy6 cy6Var = cy6.OXO1;
        Application application2 = getApplication();
        Intrinsics.O10IXXX0X(application2, "getApplication(...)");
        cy6Var.OXO1(application2);
        i72.OXO1.OOIIOX(getWeChatRl(), getQQRl(), getWeiBoRl(), getFaceBookRl(), getTwitterRl(), getGoogleRl());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_start_google;
    }

    public final void noLogin(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        ToastUtils.showLong("noLogin", new Object[0]);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        iXI0OOOIi.OXO1.m2180iO(i, i2, intent);
        i0I01iiO0.OXO1.O00(i, intent);
        ga2.OXO1.XIi00iiXO(i, i2, intent);
        cy6.OXO1.m1643iO(this, i, i2, intent);
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @sf5(tag = I01XX0.XO0X10iO)
    public final void onThirdPartyLogin(@aa1 LoginResponse data) {
        Intrinsics.X0O(data, "data");
        thirdPartyLogin(data);
    }

    /* JADX INFO: renamed from: qq */
    public final void m38497qq(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        if (xq5.OXO1.XIi00iiXO(getMContext())) {
            ga2.OXO1.OXO1(this, this.thirdPartyCallback);
        } else {
            ToastUtils.showLong(R.string.client_no_installed);
        }
    }

    public final void twitter(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        ToastUtils.showLong("twitter", new Object[0]);
    }

    public final void weChat(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        lq6.OXO1.OXO1(this);
    }

    public final void weiBo(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        cy6.OXO1.XIi00iiXO(this, this.thirdPartyCallback);
    }
}
