package com.sma.smartv3.p610ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q40;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.BleDevice;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetDevice;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.network.SignInByVerificationCode;
import com.sma.smartv3.network.Signin;
import com.sma.smartv3.p610ui.login.LoginActivity;
import com.sma.smartv3.p610ui.p612me.ResetPasswordActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginActivity.kt\ncom/sma/smartv3/ui/login/LoginActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,193:1\n69#2,3:194\n72#2,5:198\n1#3:197\n183#4,4:203\n196#4:215\n183#4,4:216\n196#4:228\n252#5,7:207\n270#5:214\n252#5,7:220\n270#5:227\n*S KotlinDebug\n*F\n+ 1 LoginActivity.kt\ncom/sma/smartv3/ui/login/LoginActivity\n*L\n101#1:194,3\n101#1:198,5\n101#1:197\n164#1:203,4\n164#1:215\n179#1:216,4\n179#1:228\n164#1:207,7\n164#1:214\n179#1:220,7\n179#1:227\n*E\n"})
public final class LoginActivity extends BaseActivity {

    @aa1
    private final Lazy email$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.email_delegate$lambda$0(this.f6281IO);
        }
    });

    @aa1
    private final Lazy passwordTil$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ew
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.passwordTil_delegate$lambda$0(this.f6498IO);
        }
    });

    @aa1
    private final Lazy password$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.password_delegate$lambda$0(this.f6747IO);
        }
    });

    @aa1
    private final Lazy verificationCodeLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.verificationCodeLl_delegate$lambda$0(this.f6974IO);
        }
    });

    @aa1
    private final Lazy verificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.verificationCode_delegate$lambda$0(this.f7219IO);
        }
    });

    @aa1
    private final Lazy btGetVerificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.btGetVerificationCode_delegate$lambda$0(this.f8776IO);
        }
    });

    @aa1
    private final Lazy btLoginType$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.btLoginType_delegate$lambda$0(this.f9052IO);
        }
    });

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.rv_delegate$lambda$0(this.f9293IO);
        }
    });

    @aa1
    private final Lazy loginRemind$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.aw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.loginRemind_delegate$lambda$0(this.f5584IO);
        }
    });

    @aa1
    private final Lazy btnLogin$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bw
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LoginActivity.btnLogin_delegate$lambda$0(this.f5834IO);
        }
    });

    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LoginActivity.this.getBtnLogin().setEnabled(editable != null && editable.toString().length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class XIi00iiXO implements TextWatcher {
        public XIi00iiXO() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LoginActivity.this.getBtnLogin().setEnabled(editable != null && editable.toString().length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btGetVerificationCode_delegate$lambda$0(LoginActivity loginActivity) {
        return (Button) loginActivity.findViewById(R.id.btGetVerificationCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btLoginType_delegate$lambda$0(LoginActivity loginActivity) {
        return (Button) loginActivity.findViewById(R.id.btLoginType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnLogin_delegate$lambda$0(LoginActivity loginActivity) {
        return loginActivity.findViewById(R.id.btn_login);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText email_delegate$lambda$0(LoginActivity loginActivity) {
        return (TextInputEditText) loginActivity.findViewById(R.id.email);
    }

    private final Button getBtGetVerificationCode() {
        return (Button) this.btGetVerificationCode$delegate.getValue();
    }

    private final Button getBtLoginType() {
        return (Button) this.btLoginType$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBtnLogin() {
        return (View) this.btnLogin$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getDeviceInfo(String str) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        Map<String, String> mapOIX0iXi = q40.OIX0iXi(TuplesKt.OXO1("identity", str));
        final O1XIiIO<BleDevice> o1XIiIO = new O1XIiIO<BleDevice>() { // from class: com.sma.smartv3.ui.login.LoginActivity.getDeviceInfo.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(BleDevice bleDevice) {
                OOiOOO1OI.OXO1.iOO1ii1(bleDevice);
                i72.OXO1.m2053XX(LoginActivity.this);
                I01XX0.XIi00iiXO(I01XX0.Ii0X0X, null, 2, null);
                LoginActivity.this.finish();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRv());
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetDevice.URL);
        netWorkUtils.printParam(strConvertBaseUrl + GetDevice.URL, mapOIX0iXi);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetDevice.URL;
        final O1XIiIO<Response<BleDevice>> o1XIiIO2 = new O1XIiIO<Response<BleDevice>>() { // from class: com.sma.smartv3.ui.login.LoginActivity$getDeviceInfo$$inlined$post$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<BleDevice> response) {
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
        AndroidNetworking.post(str2).addBodyParameter(mapOIX0iXi).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, BleDevice.class), new ParsedRequestListener<Response<BleDevice>>() { // from class: com.sma.smartv3.ui.login.LoginActivity$getDeviceInfo$$inlined$post$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<BleDevice> response) {
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

    private final TextInputEditText getEmail() {
        return (TextInputEditText) this.email$delegate.getValue();
    }

    private final PFMedium getLoginRemind() {
        return (PFMedium) this.loginRemind$delegate.getValue();
    }

    private final TextInputEditText getPassword() {
        return (TextInputEditText) this.password$delegate.getValue();
    }

    private final RelativeLayout getPasswordTil() {
        return (RelativeLayout) this.passwordTil$delegate.getValue();
    }

    private final LinearLayout getRv() {
        return (LinearLayout) this.rv$delegate.getValue();
    }

    private final TextInputEditText getVerificationCode() {
        return (TextInputEditText) this.verificationCode$delegate.getValue();
    }

    private final LinearLayout getVerificationCodeLl() {
        return (LinearLayout) this.verificationCodeLl$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$0(LoginActivity loginActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        LinearLayout rv = loginActivity.getRv();
        Intrinsics.O10IXXX0X(rv, "<get-rv>(...)");
        loginActivity.login(rv);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$1(LoginActivity loginActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        LinearLayout rv = loginActivity.getRv();
        Intrinsics.O10IXXX0X(rv, "<get-rv>(...)");
        loginActivity.login(rv);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium loginRemind_delegate$lambda$0(LoginActivity loginActivity) {
        return (PFMedium) loginActivity.findViewById(R.id.loginRemind);
    }

    private final void loginRequest(HashMap<String, String> map, String str) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.login.LoginActivity.loginRequest.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser) {
                String identity;
                a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser));
                if (appUser == null || (identity = appUser.getIdentity()) == null) {
                    return;
                }
                LoginActivity.this.getDeviceInfo(identity);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRv());
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), str);
        netWorkUtils.printParam(strConvertBaseUrl + str, map);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + str;
        final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.LoginActivity$loginRequest$$inlined$post$1
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
        AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) map).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.LoginActivity$loginRequest$$inlined$post$2
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
    public static final RelativeLayout passwordTil_delegate$lambda$0(LoginActivity loginActivity) {
        return (RelativeLayout) loginActivity.findViewById(R.id.passwordTil);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText password_delegate$lambda$0(LoginActivity loginActivity) {
        return (TextInputEditText) loginActivity.findViewById(R.id.password);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rv_delegate$lambda$0(LoginActivity loginActivity) {
        return (LinearLayout) loginActivity.findViewById(R.id.f51422rv);
    }

    private final void showLoginRemind() {
        if (i72.OXO1.XOX0O0()) {
            getLoginRemind().setVisibility(0);
        } else {
            getLoginRemind().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout verificationCodeLl_delegate$lambda$0(LoginActivity loginActivity) {
        return (LinearLayout) loginActivity.findViewById(R.id.verificationCodeLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText verificationCode_delegate$lambda$0(LoginActivity loginActivity) {
        return (TextInputEditText) loginActivity.findViewById(R.id.verificationCode);
    }

    public final void forgetPassword(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) ResetPasswordActivity.class));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        showLoginRemind();
        getBtnLogin().setEnabled(false);
        getPassword().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.zv
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return LoginActivity.initView$lambda$0(this.f12699IO, textView, i, keyEvent);
            }
        });
        getPassword().addTextChangedListener(new OXO1());
        getVerificationCode().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.cw
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return LoginActivity.initView$lambda$1(this.f6065IO, textView, i, keyEvent);
            }
        });
        getVerificationCode().addTextChangedListener(new XIi00iiXO());
        TextView textView = (TextView) findViewById(R.id.tv_link);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_login;
    }

    public final void login(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (String.valueOf(getEmail().getText()).length() == 0) {
            ToastUtils.showLong(R.string.input_email);
            return;
        }
        if (getPasswordTil().isShown()) {
            if (String.valueOf(getPassword().getText()).length() == 0) {
                ToastUtils.showLong(R.string.input_password);
                return;
            } else {
                loginRequest(RequestBodyKt.getLoginByPasswordBody(String.valueOf(getEmail().getText()), String.valueOf(getPassword().getText())), Signin.URL);
                return;
            }
        }
        if (String.valueOf(getVerificationCode().getText()).length() == 0) {
            ToastUtils.showLong(R.string.enter_confirmation_code);
        } else {
            loginRequest(RequestBodyKt.getLoginByCodeBody(String.valueOf(getEmail().getText()), String.valueOf(getVerificationCode().getText())), SignInByVerificationCode.URL);
        }
    }

    public final void passwordLoginType(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (Intrinsics.XOO0ii0(getBtLoginType().getText(), getText(R.string.password_login))) {
            getBtLoginType().setText(R.string.code_login);
            getVerificationCodeLl().setVisibility(8);
            getPasswordTil().setVisibility(0);
            showLoginRemind();
            getBtnLogin().setEnabled(getPassword().getText() != null && String.valueOf(getPassword().getText()).length() > 0);
            return;
        }
        getBtLoginType().setText(R.string.password_login);
        getVerificationCodeLl().setVisibility(0);
        getPasswordTil().setVisibility(8);
        getLoginRemind().setVisibility(0);
        getBtnLogin().setEnabled(getVerificationCode().getText() != null && String.valueOf(getVerificationCode().getText()).length() > 0);
    }

    public final void getVerificationCode(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        RequestCommonMethod requestCommonMethod = RequestCommonMethod.INSTANCE;
        LinearLayout rv = getRv();
        String strValueOf = String.valueOf(getEmail().getText());
        Button btGetVerificationCode = getBtGetVerificationCode();
        Intrinsics.O10IXXX0X(btGetVerificationCode, "<get-btGetVerificationCode>(...)");
        RequestCommonMethod.requestVerificationCode$default(requestCommonMethod, this, rv, strValueOf, btGetVerificationCode, 0, null, 48, null);
    }
}
