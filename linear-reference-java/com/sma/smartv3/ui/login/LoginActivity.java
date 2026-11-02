package com.sma.smartv3.ui.login;

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
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aw;
import com.android.mltcode.paycertificationapi.bw;
import com.android.mltcode.paycertificationapi.cw;
import com.android.mltcode.paycertificationapi.dw;
import com.android.mltcode.paycertificationapi.ew;
import com.android.mltcode.paycertificationapi.fw;
import com.android.mltcode.paycertificationapi.gw;
import com.android.mltcode.paycertificationapi.hw;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iw;
import com.android.mltcode.paycertificationapi.jw;
import com.android.mltcode.paycertificationapi.kw;
import com.android.mltcode.paycertificationapi.q40;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.zv;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.textfield.TextInputEditText;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.ResetPasswordActivity;
import com.sma.smartv3.view.text.PFMedium;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginActivity.kt\ncom/sma/smartv3/ui/login/LoginActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,193:1\n69#2,3:194\n72#2,5:198\n1#3:197\n183#4,4:203\n196#4:215\n183#4,4:216\n196#4:228\n252#5,7:207\n270#5:214\n252#5,7:220\n270#5:227\n*S KotlinDebug\n*F\n+ 1 LoginActivity.kt\ncom/sma/smartv3/ui/login/LoginActivity\n*L\n101#1:194,3\n101#1:198,5\n101#1:197\n164#1:203,4\n164#1:215\n179#1:216,4\n179#1:228\n164#1:207,7\n164#1:214\n179#1:220,7\n179#1:227\n*E\n"})
public final class LoginActivity extends BaseActivity {

    @aa1
    private final Lazy btGetVerificationCode$delegate;

    @aa1
    private final Lazy btLoginType$delegate;

    @aa1
    private final Lazy btnLogin$delegate;

    @aa1
    private final Lazy email$delegate;

    @aa1
    private final Lazy loginRemind$delegate;

    @aa1
    private final Lazy password$delegate;

    @aa1
    private final Lazy passwordTil$delegate;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final Lazy verificationCode$delegate;

    @aa1
    private final Lazy verificationCodeLl$delegate;

    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ LoginActivity IO;

        public OXO1(LoginActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            View r0 = LoginActivity.access$getBtnLogin(this.IO);
            if (r2 != null) goto L5;
        L7:
            boolean r3 = false;
        L8:
            r0.setEnabled(r3);
            return;
        L5:
            if (r2.toString().length() <= 0) goto L7;
            r3 = true;
            goto L8
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ LoginActivity IO;

        public XIi00iiXO(LoginActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            View r0 = LoginActivity.access$getBtnLogin(this.IO);
            if (r2 != null) goto L5;
        L7:
            boolean r3 = false;
        L8:
            r0.setEnabled(r3);
            return;
        L5:
            if (r2.toString().length() <= 0) goto L7;
            r3 = true;
            goto L8
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public LoginActivity() {
        this.email$delegate = LazyKt__LazyJVMKt.iO(new dw(this));
        this.passwordTil$delegate = LazyKt__LazyJVMKt.iO(new ew(this));
        this.password$delegate = LazyKt__LazyJVMKt.iO(new fw(this));
        this.verificationCodeLl$delegate = LazyKt__LazyJVMKt.iO(new gw(this));
        this.verificationCode$delegate = LazyKt__LazyJVMKt.iO(new hw(this));
        this.btGetVerificationCode$delegate = LazyKt__LazyJVMKt.iO(new iw(this));
        this.btLoginType$delegate = LazyKt__LazyJVMKt.iO(new jw(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new kw(this));
        this.loginRemind$delegate = LazyKt__LazyJVMKt.iO(new aw(this));
        this.btnLogin$delegate = LazyKt__LazyJVMKt.iO(new bw(this));
    }

    public static /* synthetic */ TextInputEditText I0iXXO(LoginActivity r0) {
        return email_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(LoginActivity r0, TextView r1, int r2, KeyEvent r3) {
        return initView$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ RelativeLayout IIX1OXO(LoginActivity r0) {
        return passwordTil_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(LoginActivity r0) {
        return btnLogin_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(LoginActivity r0, TextView r1, int r2, KeyEvent r3) {
        return initView$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ TextInputEditText OiIIX101O(LoginActivity r0) {
        return password_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button X0O(LoginActivity r0) {
        return btLoginType_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextInputEditText X1ii(LoginActivity r0) {
        return verificationCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XX0(LoginActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XXI(LoginActivity r0) {
        return btGetVerificationCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XiOIO(LoginActivity r0) {
        return verificationCodeLl_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ View access$getBtnLogin(LoginActivity r0) {
        return r0.getBtnLogin();
    }

    public static final /* synthetic */ void access$getDeviceInfo(LoginActivity r0, String r1) {
        r0.getDeviceInfo(r1);
    }

    private static final Button btGetVerificationCode_delegate$lambda$0(LoginActivity r1) {
        return (Button) r1.findViewById(R.id.btGetVerificationCode);
    }

    private static final Button btLoginType_delegate$lambda$0(LoginActivity r1) {
        return (Button) r1.findViewById(R.id.btLoginType);
    }

    private static final View btnLogin_delegate$lambda$0(LoginActivity r1) {
        return r1.findViewById(R.id.btn_login);
    }

    private static final TextInputEditText email_delegate$lambda$0(LoginActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.email);
    }

    private final Button getBtGetVerificationCode() {
        return (Button) getValue();
    }

    private final Button getBtLoginType() {
        return (Button) getValue();
    }

    private final View getBtnLogin() {
        return (View) getValue();
    }

    private final void getDeviceInfo(String r7) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        Map<String, String> r8 = q40.OIX0iXi(TuplesKt.OXO1("identity", r7));
        final O1XIiIO<BleDevice> r1 = new AnonymousClass1(this);
        final uq r2 = r0.loadPopup(this, getRv());
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetDevice.URL);
        r0.printParam(r3 + GetDevice.URL, r8);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + GetDevice.URL;
        final O1XIiIO<Response<BleDevice>> r6 = new LoginActivity$getDeviceInfo$$inlined$post$1(this, r1, r2);
        AndroidNetworking.post(r5).addBodyParameter(r8).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{BleDevice.class}), new LoginActivity$getDeviceInfo$$inlined$post$2(r6));
    }

    private final TextInputEditText getEmail() {
        return (TextInputEditText) getValue();
    }

    private final PFMedium getLoginRemind() {
        return (PFMedium) getValue();
    }

    private final TextInputEditText getPassword() {
        return (TextInputEditText) getValue();
    }

    private final RelativeLayout getPasswordTil() {
        return (RelativeLayout) getValue();
    }

    private final LinearLayout getRv() {
        return (LinearLayout) getValue();
    }

    private final TextInputEditText getVerificationCode() {
        return (TextInputEditText) getValue();
    }

    private final LinearLayout getVerificationCodeLl() {
        return (LinearLayout) getValue();
    }

    public static /* synthetic */ PFMedium iIiiO(LoginActivity r0) {
        return loginRemind_delegate$lambda$0(r0);
    }

    private static final boolean initView$lambda$0(LoginActivity r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        LinearLayout r4 = r0.getRv();
        Intrinsics.O10IXXX0X(r4, "<get-rv>(...)");
        r0.login(r4);
        return false;
    L7:
        return false;
    }

    private static final boolean initView$lambda$1(LoginActivity r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        LinearLayout r4 = r0.getRv();
        Intrinsics.O10IXXX0X(r4, "<get-rv>(...)");
        r0.login(r4);
        return false;
    L7:
        return false;
    }

    private static final PFMedium loginRemind_delegate$lambda$0(LoginActivity r1) {
        return (PFMedium) r1.findViewById(R.id.loginRemind);
    }

    private final void loginRequest(HashMap<String, String> r6, String r7) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        final O1XIiIO<AppUser> r1 = new C34681(this);
        final uq r2 = r0.loadPopup(this, getRv());
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r7);
        r0.printParam(r3 + r7, r6);
        NetWork r4 = NetWork.OXO1;
        String r8 = r3 + r7;
        final O1XIiIO<Response<AppUser>> r5 = new LoginActivity$loginRequest$$inlined$post$1(this, r1, r2);
        AndroidNetworking.post(r8).addBodyParameter(r6).setTag(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new LoginActivity$loginRequest$$inlined$post$2(r5));
    }

    private static final RelativeLayout passwordTil_delegate$lambda$0(LoginActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.passwordTil);
    }

    private static final TextInputEditText password_delegate$lambda$0(LoginActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.password);
    }

    private static final LinearLayout rv_delegate$lambda$0(LoginActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rv);
    }

    private final void showLoginRemind() {
        if (i72.OXO1.XOX0O0() == false) goto L6;
        getLoginRemind().setVisibility(0);
        return;
    L6:
        getLoginRemind().setVisibility(8);
    }

    private static final LinearLayout verificationCodeLl_delegate$lambda$0(LoginActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.verificationCodeLl);
    }

    private static final TextInputEditText verificationCode_delegate$lambda$0(LoginActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.verificationCode);
    }

    public final void forgetPassword(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, ResetPasswordActivity.class));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        showLoginRemind();
        getBtnLogin().setEnabled(false);
        getPassword().setOnEditorActionListener(new zv(this));
        getPassword().addTextChangedListener(new OXO1(this));
        getVerificationCode().setOnEditorActionListener(new cw(this));
        getVerificationCode().addTextChangedListener(new XIi00iiXO(this));
        TextView r0 = (TextView) findViewById(R.id.tv_link);
        if (r0 == null) goto L6;
        r0.setMovementMethod(LinkMovementMethod.getInstance());
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_login;
    }

    public final void login(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (String.valueOf(getEmail().getText()).length() != 0) goto L7;
        ToastUtils.showLong(R.string.input_email);
        return;
    L7:
        if (getPasswordTil().isShown() == false) goto L15;
        if (String.valueOf(getPassword().getText()).length() != 0) goto L12;
        ToastUtils.showLong(R.string.input_password);
        return;
    L12:
        loginRequest(RequestBodyKt.getLoginByPasswordBody(String.valueOf(getEmail().getText()), String.valueOf(getPassword().getText())), Signin.URL);
        return;
    L15:
        if (String.valueOf(getVerificationCode().getText()).length() != 0) goto L18;
        ToastUtils.showLong(R.string.enter_confirmation_code);
        return;
    L18:
        loginRequest(RequestBodyKt.getLoginByCodeBody(String.valueOf(getEmail().getText()), String.valueOf(getVerificationCode().getText())), SignInByVerificationCode.URL);
    }

    public final void passwordLoginType(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        boolean r1 = true;
        if (Intrinsics.XOO0ii0(getBtLoginType().getText(), getText(R.string.password_login)) == false) goto L12;
        getBtLoginType().setText(R.string.code_login);
        getVerificationCodeLl().setVisibility(8);
        getPasswordTil().setVisibility(0);
        showLoginRemind();
        View r6 = getBtnLogin();
        if (getPassword().getText() != null) goto L7;
    L9:
        r1 = false;
    L10:
        r6.setEnabled(r1);
        return;
    L7:
        if (String.valueOf(getPassword().getText()).length() <= 0) goto L9;
    L12:
        getBtLoginType().setText(R.string.password_login);
        getVerificationCodeLl().setVisibility(0);
        getPasswordTil().setVisibility(8);
        getLoginRemind().setVisibility(0);
        View r7 = getBtnLogin();
        if (getVerificationCode().getText() != null) goto L15;
    L17:
        r1 = false;
    L18:
        r7.setEnabled(r1);
        return;
    L15:
        if (String.valueOf(getVerificationCode().getText()).length() <= 0) goto L17;
        goto L17
    }

    public final void getVerificationCode(@aa1 View r11) {
        Intrinsics.X0O(r11, "view");
        RequestCommonMethod r1 = RequestCommonMethod.INSTANCE;
        LinearLayout r3 = getRv();
        String r4 = String.valueOf(getEmail().getText());
        Button r5 = getBtGetVerificationCode();
        Intrinsics.O10IXXX0X(r5, "<get-btGetVerificationCode>(...)");
        RequestCommonMethod.requestVerificationCode$default(r1, this, r3, r4, r5, 0, null, 48, null);
    }
}
