package com.sma.smartv3.ui.me;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.al3;
import com.android.mltcode.paycertificationapi.bl3;
import com.android.mltcode.paycertificationapi.cl3;
import com.android.mltcode.paycertificationapi.dl3;
import com.android.mltcode.paycertificationapi.el3;
import com.android.mltcode.paycertificationapi.fl3;
import com.android.mltcode.paycertificationapi.gl3;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uk3;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.vk3;
import com.android.mltcode.paycertificationapi.wk3;
import com.android.mltcode.paycertificationapi.xk3;
import com.android.mltcode.paycertificationapi.yk3;
import com.android.mltcode.paycertificationapi.zk3;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.network.ResetPassword;
import com.sma.smartv3.pro.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nResetPasswordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetPasswordActivity.kt\ncom/sma/smartv3/ui/me/ResetPasswordActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n183#2,4:165\n196#2:177\n252#3,7:169\n270#3:176\n255#4:178\n*S KotlinDebug\n*F\n+ 1 ResetPasswordActivity.kt\ncom/sma/smartv3/ui/me/ResetPasswordActivity\n*L\n135#1:165,4\n135#1:177\n135#1:169,7\n135#1:176\n157#1:178\n*E\n"})
public final class ResetPasswordActivity extends BaseActivity {

    @aa1
    private final Lazy btGetVerificationCode$delegate;

    @aa1
    private final Lazy btnConfirm$delegate;

    @aa1
    private final Lazy btnNextStep$delegate;

    @aa1
    private final Lazy email$delegate;

    @aa1
    private final Lazy llGetVerificationCode$delegate;

    @aa1
    private final Lazy llSetNewPassword$delegate;

    @aa1
    private final Lazy newPassword$delegate;

    @aa1
    private final Lazy newPasswordAgain$delegate;

    @aa1
    private final Lazy resetPasswordTip$delegate;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final Lazy verificationCode$delegate;

    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ ResetPasswordActivity IO;

        public OXO1(ResetPasswordActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            View r0 = ResetPasswordActivity.access$getBtnNextStep(this.IO);
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
        public final /* synthetic */ ResetPasswordActivity IO;

        public XIi00iiXO(ResetPasswordActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            View r0 = ResetPasswordActivity.access$getBtnConfirm(this.IO);
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

    public ResetPasswordActivity() {
        this.llGetVerificationCode$delegate = LazyKt__LazyJVMKt.iO(new zk3(this));
        this.llSetNewPassword$delegate = LazyKt__LazyJVMKt.iO(new bl3(this));
        this.email$delegate = LazyKt__LazyJVMKt.iO(new cl3(this));
        this.verificationCode$delegate = LazyKt__LazyJVMKt.iO(new dl3(this));
        this.newPassword$delegate = LazyKt__LazyJVMKt.iO(new el3(this));
        this.newPasswordAgain$delegate = LazyKt__LazyJVMKt.iO(new fl3(this));
        this.btGetVerificationCode$delegate = LazyKt__LazyJVMKt.iO(new gl3(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new vk3(this));
        this.resetPasswordTip$delegate = LazyKt__LazyJVMKt.iO(new wk3(this));
        this.btnNextStep$delegate = LazyKt__LazyJVMKt.iO(new xk3(this));
        this.btnConfirm$delegate = LazyKt__LazyJVMKt.iO(new al3(this));
    }

    public static /* synthetic */ boolean I0iXXO(ResetPasswordActivity r0, TextView r1, int r2, KeyEvent r3) {
        return initView$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ TextInputEditText I1XOi1(ResetPasswordActivity r0) {
        return verificationCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(ResetPasswordActivity r0, TextView r1, int r2, KeyEvent r3) {
        return initView$lambda$2(r0, r1, r2, r3);
    }

    public static /* synthetic */ LinearLayout O10IXXX0X(ResetPasswordActivity r0) {
        return llGetVerificationCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextInputEditText OIX0iXi(ResetPasswordActivity r0) {
        return email_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout OiIIX101O(ResetPasswordActivity r0) {
        return llSetNewPassword_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0O(ResetPasswordActivity r0) {
        return btnConfirm_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(ResetPasswordActivity r0) {
        return resetPasswordTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextInputEditText XX0(ResetPasswordActivity r0) {
        return newPasswordAgain_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextInputEditText XXI(ResetPasswordActivity r0) {
        return newPassword_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XiOIO(ResetPasswordActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIii1(ResetPasswordActivity r0) {
        return btnNextStep_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ View access$getBtnConfirm(ResetPasswordActivity r0) {
        return r0.getBtnConfirm();
    }

    public static final /* synthetic */ View access$getBtnNextStep(ResetPasswordActivity r0) {
        return r0.getBtnNextStep();
    }

    private static final Button btGetVerificationCode_delegate$lambda$0(ResetPasswordActivity r1) {
        return (Button) r1.findViewById(R.id.btGetVerificationCode);
    }

    private static final View btnConfirm_delegate$lambda$0(ResetPasswordActivity r1) {
        return r1.findViewById(R.id.btn_confirm);
    }

    private static final View btnNextStep_delegate$lambda$0(ResetPasswordActivity r1) {
        return r1.findViewById(R.id.btn_nextStep);
    }

    private static final TextInputEditText email_delegate$lambda$0(ResetPasswordActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.email);
    }

    private final Button getBtGetVerificationCode() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (Button) r0;
    }

    private final View getBtnConfirm() {
        return (View) getValue();
    }

    private final View getBtnNextStep() {
        return (View) getValue();
    }

    private final TextInputEditText getEmail() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextInputEditText) r0;
    }

    private final LinearLayout getLlGetVerificationCode() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (LinearLayout) r0;
    }

    private final LinearLayout getLlSetNewPassword() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (LinearLayout) r0;
    }

    private final TextInputEditText getNewPassword() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextInputEditText) r0;
    }

    private final TextInputEditText getNewPasswordAgain() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextInputEditText) r0;
    }

    private final TextView getResetPasswordTip() {
        return (TextView) getValue();
    }

    private final LinearLayout getRv() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (LinearLayout) r0;
    }

    private final TextInputEditText getVerificationCode() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextInputEditText) r0;
    }

    public static /* synthetic */ Button iIiiO(ResetPasswordActivity r0) {
        return btGetVerificationCode_delegate$lambda$0(r0);
    }

    private static final boolean initView$lambda$1(ResetPasswordActivity r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        r0.nextStep(r0.getRv());
        return false;
    L7:
        return false;
    }

    private static final boolean initView$lambda$2(ResetPasswordActivity r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        r0.confirm(r0.getRv());
        return false;
    L7:
        return false;
    }

    private static final LinearLayout llGetVerificationCode_delegate$lambda$0(ResetPasswordActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.llGetVerificationCode);
    }

    private static final LinearLayout llSetNewPassword_delegate$lambda$0(ResetPasswordActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.llSetNewPassword);
    }

    private static final TextInputEditText newPasswordAgain_delegate$lambda$0(ResetPasswordActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.newPasswordAgain);
    }

    private static final TextInputEditText newPassword_delegate$lambda$0(ResetPasswordActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.newPassword);
    }

    private static final TextView resetPasswordTip_delegate$lambda$0(ResetPasswordActivity r1) {
        return (TextView) r1.findViewById(R.id.resetPasswordTip);
    }

    private static final LinearLayout rv_delegate$lambda$0(ResetPasswordActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rv);
    }

    private static final TextInputEditText verificationCode_delegate$lambda$0(ResetPasswordActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.verificationCode);
    }

    public final void backClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (getLlSetNewPassword().getVisibility() != 0) goto L6;
        getLlSetNewPassword().setVisibility(8);
        getLlGetVerificationCode().setVisibility(0);
        return;
    L6:
        finish();
    }

    public final void confirm(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (String.valueOf(getNewPassword().getText()).length() != 0) goto L7;
        ToastUtils.showLong(R.string.input_password);
        return;
    L7:
        if (String.valueOf(getNewPasswordAgain().getText()).length() != 0) goto L10;
        ToastUtils.showLong(R.string.input_password_again);
        return;
    L10:
        Editable r8 = getNewPassword().getText();
        Intrinsics.XXI(r8);
        if (r8.length() < 6) goto L21;
        Editable r9 = getNewPassword().getText();
        Intrinsics.XXI(r9);
        if (r9.length() > 32) goto L21;
        if (Intrinsics.XOO0ii0(String.valueOf(getNewPassword().getText()), String.valueOf(getNewPasswordAgain().getText())) == true) goto L19;
        ToastUtils.showLong(R.string.inconsistent_passwords);
        return;
    L19:
        NetWorkUtils r10 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r0 = RequestBodyKt.getResetPasswordBody(String.valueOf(getEmail().getText()), String.valueOf(getNewPassword().getText()), String.valueOf(getVerificationCode().getText()));
        final O1XIiIO<String> r1 = new AnonymousClass1(this);
        final uq r2 = r10.loadPopup(this, getRv());
        String r3 = r10.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ResetPassword.URL);
        r10.printParam(r3 + ResetPassword.URL, r0);
        NetWork r11 = NetWork.OXO1;
        String r12 = r3 + ResetPassword.URL;
        final O1XIiIO<Response<String>> r4 = new ResetPasswordActivity$confirm$$inlined$post$1(this, r1, r2);
        AndroidNetworking.post(r12).addBodyParameter(r0).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new ResetPasswordActivity$confirm$$inlined$post$2(r4));
        return;
    L21:
        ToastUtils.showLong(R.string.length_passwords);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getLlGetVerificationCode().setVisibility(0);
        int r2 = 8;
        getLlSetNewPassword().setVisibility(8);
        TextView r0 = getResetPasswordTip();
        if (i72.OXO1.iIi1() == false) goto L5;
        r2 = 0;
    L5:
        r0.setVisibility(r2);
        getVerificationCode().setOnEditorActionListener(new uk3(this));
        getBtnNextStep().setEnabled(false);
        getVerificationCode().addTextChangedListener(new OXO1(this));
        getNewPasswordAgain().setOnEditorActionListener(new yk3(this));
        getBtnConfirm().setEnabled(false);
        getNewPasswordAgain().addTextChangedListener(new XIi00iiXO(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.reset_password_activity;
    }

    public final void nextStep(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (String.valueOf(getEmail().getText()).length() != 0) goto L7;
        ToastUtils.showLong(R.string.input_email);
        return;
    L7:
        if (String.valueOf(getVerificationCode().getText()).length() != 0) goto L10;
        ToastUtils.showLong(R.string.enter_confirmation_code);
        return;
    L10:
        getLlGetVerificationCode().setVisibility(8);
        getLlSetNewPassword().setVisibility(0);
    }

    public final void getVerificationCode(@aa1 View r11) {
        Intrinsics.X0O(r11, "view");
        RequestCommonMethod.requestVerificationCode$default(RequestCommonMethod.INSTANCE, this, getRv(), String.valueOf(getEmail().getText()), getBtGetVerificationCode(), 0, null, 48, null);
    }
}
