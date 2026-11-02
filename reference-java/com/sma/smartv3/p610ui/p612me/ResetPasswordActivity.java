package com.sma.smartv3.p610ui.p612me;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
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
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.network.ResetPassword;
import com.sma.smartv3.p610ui.p612me.ResetPasswordActivity;
import com.sma.smartv3.pro.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nResetPasswordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetPasswordActivity.kt\ncom/sma/smartv3/ui/me/ResetPasswordActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n183#2,4:165\n196#2:177\n252#3,7:169\n270#3:176\n255#4:178\n*S KotlinDebug\n*F\n+ 1 ResetPasswordActivity.kt\ncom/sma/smartv3/ui/me/ResetPasswordActivity\n*L\n135#1:165,4\n135#1:177\n135#1:169,7\n135#1:176\n157#1:178\n*E\n"})
public final class ResetPasswordActivity extends BaseActivity {

    @aa1
    private final Lazy llGetVerificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zk3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.llGetVerificationCode_delegate$lambda$0(this.f12633IO);
        }
    });

    @aa1
    private final Lazy llSetNewPassword$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bl3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.llSetNewPassword_delegate$lambda$0(this.f5750IO);
        }
    });

    @aa1
    private final Lazy email$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cl3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.email_delegate$lambda$0(this.f5996IO);
        }
    });

    @aa1
    private final Lazy verificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dl3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.verificationCode_delegate$lambda$0(this.f6217IO);
        }
    });

    @aa1
    private final Lazy newPassword$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.el3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.newPassword_delegate$lambda$0(this.f6441IO);
        }
    });

    @aa1
    private final Lazy newPasswordAgain$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fl3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.newPasswordAgain_delegate$lambda$0(this.f6662IO);
        }
    });

    @aa1
    private final Lazy btGetVerificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gl3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.btGetVerificationCode_delegate$lambda$0(this.f6909IO);
        }
    });

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vk3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.rv_delegate$lambda$0(this.f11740IO);
        }
    });

    @aa1
    private final Lazy resetPasswordTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wk3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.resetPasswordTip_delegate$lambda$0(this.f11966IO);
        }
    });

    @aa1
    private final Lazy btnNextStep$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xk3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.btnNextStep_delegate$lambda$0(this.f12185IO);
        }
    });

    @aa1
    private final Lazy btnConfirm$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.al3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ResetPasswordActivity.btnConfirm_delegate$lambda$0(this.f5516IO);
        }
    });

    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ResetPasswordActivity.this.getBtnNextStep().setEnabled(editable != null && editable.toString().length() > 0);
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
            ResetPasswordActivity.this.getBtnConfirm().setEnabled(editable != null && editable.toString().length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btGetVerificationCode_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (Button) resetPasswordActivity.findViewById(R.id.btGetVerificationCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnConfirm_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return resetPasswordActivity.findViewById(R.id.btn_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnNextStep_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return resetPasswordActivity.findViewById(R.id.btn_nextStep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText email_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (TextInputEditText) resetPasswordActivity.findViewById(R.id.email);
    }

    private final Button getBtGetVerificationCode() {
        Object value = this.btGetVerificationCode$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (Button) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBtnConfirm() {
        return (View) this.btnConfirm$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBtnNextStep() {
        return (View) this.btnNextStep$delegate.getValue();
    }

    private final TextInputEditText getEmail() {
        Object value = this.email$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextInputEditText) value;
    }

    private final LinearLayout getLlGetVerificationCode() {
        Object value = this.llGetVerificationCode$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (LinearLayout) value;
    }

    private final LinearLayout getLlSetNewPassword() {
        Object value = this.llSetNewPassword$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (LinearLayout) value;
    }

    private final TextInputEditText getNewPassword() {
        Object value = this.newPassword$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextInputEditText) value;
    }

    private final TextInputEditText getNewPasswordAgain() {
        Object value = this.newPasswordAgain$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextInputEditText) value;
    }

    private final TextView getResetPasswordTip() {
        return (TextView) this.resetPasswordTip$delegate.getValue();
    }

    private final LinearLayout getRv() {
        Object value = this.rv$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (LinearLayout) value;
    }

    private final TextInputEditText getVerificationCode() {
        Object value = this.verificationCode$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextInputEditText) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$1(ResetPasswordActivity resetPasswordActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        resetPasswordActivity.nextStep(resetPasswordActivity.getRv());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$2(ResetPasswordActivity resetPasswordActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        resetPasswordActivity.confirm(resetPasswordActivity.getRv());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llGetVerificationCode_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (LinearLayout) resetPasswordActivity.findViewById(R.id.llGetVerificationCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llSetNewPassword_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (LinearLayout) resetPasswordActivity.findViewById(R.id.llSetNewPassword);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText newPasswordAgain_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (TextInputEditText) resetPasswordActivity.findViewById(R.id.newPasswordAgain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText newPassword_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (TextInputEditText) resetPasswordActivity.findViewById(R.id.newPassword);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView resetPasswordTip_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (TextView) resetPasswordActivity.findViewById(R.id.resetPasswordTip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rv_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (LinearLayout) resetPasswordActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText verificationCode_delegate$lambda$0(ResetPasswordActivity resetPasswordActivity) {
        return (TextInputEditText) resetPasswordActivity.findViewById(R.id.verificationCode);
    }

    public final void backClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getLlSetNewPassword().getVisibility() != 0) {
            finish();
        } else {
            getLlSetNewPassword().setVisibility(8);
            getLlGetVerificationCode().setVisibility(0);
        }
    }

    public final void confirm(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (String.valueOf(getNewPassword().getText()).length() == 0) {
            ToastUtils.showLong(R.string.input_password);
            return;
        }
        if (String.valueOf(getNewPasswordAgain().getText()).length() == 0) {
            ToastUtils.showLong(R.string.input_password_again);
            return;
        }
        Editable text = getNewPassword().getText();
        Intrinsics.XXI(text);
        if (text.length() >= 6) {
            Editable text2 = getNewPassword().getText();
            Intrinsics.XXI(text2);
            if (text2.length() <= 32) {
                if (!Intrinsics.XOO0ii0(String.valueOf(getNewPassword().getText()), String.valueOf(getNewPasswordAgain().getText()))) {
                    ToastUtils.showLong(R.string.inconsistent_passwords);
                    return;
                }
                NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                HashMap<String, String> resetPasswordBody = RequestBodyKt.getResetPasswordBody(String.valueOf(getEmail().getText()), String.valueOf(getNewPassword().getText()), String.valueOf(getVerificationCode().getText()));
                final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.ResetPasswordActivity.confirm.1
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(String str) {
                        ToastUtils.showLong(R.string.password_updated_successfully);
                        ResetPasswordActivity.this.finish();
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        ToastUtils.showLong(error.toString(), new Object[0]);
                    }
                };
                final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRv());
                String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ResetPassword.URL);
                netWorkUtils.printParam(strConvertBaseUrl + ResetPassword.URL, resetPasswordBody);
                NetWork netWork = NetWork.OXO1;
                String str = strConvertBaseUrl + ResetPassword.URL;
                final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.me.ResetPasswordActivity$confirm$$inlined$post$1
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(Response<String> response) {
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
                AndroidNetworking.post(str).addBodyParameter((Map<String, String>) resetPasswordBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.me.ResetPasswordActivity$confirm$$inlined$post$2
                    @Override // com.androidnetworking.interfaces.ParsedRequestListener
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void onResponse(Response<String> response) {
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
                return;
            }
        }
        ToastUtils.showLong(R.string.length_passwords);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getLlGetVerificationCode().setVisibility(0);
        getLlSetNewPassword().setVisibility(8);
        getResetPasswordTip().setVisibility(i72.OXO1.iIi1() ? 0 : 8);
        getVerificationCode().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.uk3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ResetPasswordActivity.initView$lambda$1(this.f11505IO, textView, i, keyEvent);
            }
        });
        getBtnNextStep().setEnabled(false);
        getVerificationCode().addTextChangedListener(new OXO1());
        getNewPasswordAgain().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.yk3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ResetPasswordActivity.initView$lambda$2(this.f12385IO, textView, i, keyEvent);
            }
        });
        getBtnConfirm().setEnabled(false);
        getNewPasswordAgain().addTextChangedListener(new XIi00iiXO());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.reset_password_activity;
    }

    public final void nextStep(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (String.valueOf(getEmail().getText()).length() == 0) {
            ToastUtils.showLong(R.string.input_email);
        } else if (String.valueOf(getVerificationCode().getText()).length() == 0) {
            ToastUtils.showLong(R.string.enter_confirmation_code);
        } else {
            getLlGetVerificationCode().setVisibility(8);
            getLlSetNewPassword().setVisibility(0);
        }
    }

    public final void getVerificationCode(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        RequestCommonMethod.requestVerificationCode$default(RequestCommonMethod.INSTANCE, this, getRv(), String.valueOf(getEmail().getText()), getBtGetVerificationCode(), 0, null, 48, null);
    }
}
