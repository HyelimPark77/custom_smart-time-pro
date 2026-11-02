package com.sma.smartv3.p610ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.network.SetEmail;
import com.sma.smartv3.network.VerificationCodeCheck;
import com.sma.smartv3.p610ui.login.PhoneBindActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,214:1\n19#2:215\n15#2:216\n176#3,11:217\n196#3:236\n176#3,11:237\n196#3:256\n252#4,7:228\n270#4:235\n252#4,7:248\n270#4:255\n*S KotlinDebug\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity\n*L\n46#1:215\n46#1:216\n139#1:217,11\n139#1:236\n161#1:237,11\n161#1:256\n139#1:228,7\n139#1:235\n161#1:248,7\n161#1:255\n*E\n"})
public final class PhoneBindActivity extends BaseActivity {
    private boolean isExistsPhone;

    @aa1
    private AppUser mAppUser;
    private int nowPage;
    private int verificationType;

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.rv_delegate$lambda$0(this.f9789IO);
        }
    });

    @aa1
    private final Lazy llInputPhone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.su1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.llInputPhone_delegate$lambda$0(this.f11131IO);
        }
    });

    @aa1
    private final Lazy llCheckCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.llCheckCode_delegate$lambda$0(this.f11360IO);
        }
    });

    @aa1
    private final Lazy tvTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.tvTitle_delegate$lambda$0(this.f11571IO);
        }
    });

    @aa1
    private final Lazy tvDescription$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.tvDescription_delegate$lambda$0(this.f11813IO);
        }
    });

    @aa1
    private final Lazy tvCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.tvCode_delegate$lambda$0(this.f12036IO);
        }
    });

    @aa1
    private final Lazy phone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.phone_delegate$lambda$0(this.f12236IO);
        }
    });

    @aa1
    private final Lazy verificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.verificationCode_delegate$lambda$0(this.f12451IO);
        }
    });

    @aa1
    private final Lazy btGetVerificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.btGetVerificationCode_delegate$lambda$0(this.f12695IO);
        }
    });

    @aa1
    private final Lazy bottomBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.bottomBtn_delegate$lambda$0(this.f10013IO);
        }
    });

    @aa1
    private final Lazy tvCodeError$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ru1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PhoneBindActivity.tvCodeError_delegate$lambda$0(this.f10907IO);
        }
    });

    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            PhoneBindActivity.this.getBottomBtn().setEnabled(String.valueOf(PhoneBindActivity.this.getPhone().getText()).length() > 0);
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
            if (String.valueOf(PhoneBindActivity.this.getVerificationCode().getText()).length() == 4) {
                PhoneBindActivity phoneBindActivity = PhoneBindActivity.this;
                phoneBindActivity.changePhone(String.valueOf(phoneBindActivity.getVerificationCode().getText()));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PhoneBindActivity.this.getTvCodeError().setVisibility(8);
        }
    }

    public PhoneBindActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button bottomBtn_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (Button) phoneBindActivity.findViewById(R.id.bottom_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btGetVerificationCode_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (Button) phoneBindActivity.findViewById(R.id.btGetVerificationCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void changePhone(String str) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Activity activity = null;
        objectRef.element = RequestCommonMethod.getPhoneWithCode$default(RequestCommonMethod.INSTANCE, null, String.valueOf(getPhone().getText()), 1, null);
        if (this.mAppUser.getPhone().length() == 0 || getMArg1() == 1) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            HashMap<String, String> setEmailBody = RequestBodyKt.getSetEmailBody(this.mAppUser.getIdentity(), (String) objectRef.element, str);
            final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.login.PhoneBindActivity.changePhone.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(AppUser appUser) {
                    PhoneBindActivity.this.mAppUser.setPhone(objectRef.element);
                    a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(PhoneBindActivity.this.mAppUser));
                    I01XX0.XIi00iiXO(I01XX0.IO0II0i, null, 2, null);
                    PhoneBindActivity.this.finish();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    PhoneBindActivity.this.getTvCodeError().setVisibility(0);
                }
            };
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
            String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SetEmail.URL);
            netWorkUtils.printParam(strConvertBaseUrl + SetEmail.URL, setEmailBody);
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + SetEmail.URL;
            final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.PhoneBindActivity$changePhone$$inlined$post$default$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<AppUser> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity2 = activity;
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    C3006uq c3006uq = c3006uqLoadPopup;
                    LogUtils.m11128d(yn0.I0IIOi + response);
                    if (response == null) {
                        response = new Response<>();
                        response.setCode(-1000);
                    }
                    netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
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
            AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) setEmailBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.PhoneBindActivity$changePhone$$inlined$post$default$2
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
            return;
        }
        NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
        HashMap<String, String> verificationCodeCheckBody = RequestBodyKt.getVerificationCodeCheckBody((String) objectRef.element, str);
        final O1XIiIO<String> o1XIiIO3 = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.login.PhoneBindActivity.changePhone.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str3) {
                PhoneBindActivity phoneBindActivity = PhoneBindActivity.this;
                Bundle bundle = new Bundle();
                bundle.putString("mArg0", null);
                bundle.putInt("mArg1", 1);
                bundle.putParcelable("mArg2", null);
                bundle.putSerializable("mArg3", null);
                Intent intent = new Intent(phoneBindActivity, (Class<?>) PhoneBindActivity.class);
                intent.putExtras(bundle);
                phoneBindActivity.startActivity(intent);
                PhoneBindActivity.this.finish();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                PhoneBindActivity.this.getTvCodeError().setVisibility(0);
            }
        };
        final C3006uq c3006uqLoadPopup2 = netWorkUtils2.loadPopup(null, null);
        String strConvertBaseUrl2 = netWorkUtils2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), VerificationCodeCheck.URL);
        netWorkUtils2.printParam(strConvertBaseUrl2 + VerificationCodeCheck.URL, verificationCodeCheckBody);
        NetWork netWork2 = NetWork.OXO1;
        String str3 = strConvertBaseUrl2 + VerificationCodeCheck.URL;
        final O1XIiIO<Response<String>> o1XIiIO4 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.login.PhoneBindActivity$changePhone$$inlined$post$default$3
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils3 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO5 = o1XIiIO3;
                C3006uq c3006uq = c3006uqLoadPopup2;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils3.responseWhenCheck(activity2, response, o1XIiIO5);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO3, c3006uqLoadPopup2);
            }
        };
        AndroidNetworking.post(str3).addBodyParameter((Map<String, String>) verificationCodeCheckBody).setTag((Object) str3).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.login.PhoneBindActivity$changePhone$$inlined$post$default$4
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO4.handleResponse(response);
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
                o1XIiIO4.handleError(String.valueOf(numValueOf));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Button getBottomBtn() {
        return (Button) this.bottomBtn$delegate.getValue();
    }

    private final Button getBtGetVerificationCode() {
        return (Button) this.btGetVerificationCode$delegate.getValue();
    }

    private final LinearLayout getLlCheckCode() {
        return (LinearLayout) this.llCheckCode$delegate.getValue();
    }

    private final LinearLayout getLlInputPhone() {
        return (LinearLayout) this.llInputPhone$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputEditText getPhone() {
        return (TextInputEditText) this.phone$delegate.getValue();
    }

    private final LinearLayout getRv() {
        return (LinearLayout) this.rv$delegate.getValue();
    }

    private final TextView getTvCode() {
        return (TextView) this.tvCode$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PFMedium getTvCodeError() {
        return (PFMedium) this.tvCodeError$delegate.getValue();
    }

    private final PFMedium getTvDescription() {
        return (PFMedium) this.tvDescription$delegate.getValue();
    }

    private final PFMedium getTvTitle() {
        return (PFMedium) this.tvTitle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputEditText getVerificationCode() {
        return (TextInputEditText) this.verificationCode$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(PhoneBindActivity phoneBindActivity) {
        TextInputEditText phone = phoneBindActivity.getPhone();
        Intrinsics.O10IXXX0X(phone, "<get-phone>(...)");
        phoneBindActivity.getVerificationCode(phone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$2(PhoneBindActivity phoneBindActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        TextInputEditText phone = phoneBindActivity.getPhone();
        Intrinsics.O10IXXX0X(phone, "<get-phone>(...)");
        phoneBindActivity.getVerificationCode(phone);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$3(PhoneBindActivity phoneBindActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        phoneBindActivity.changePhone(String.valueOf(phoneBindActivity.getVerificationCode().getText()));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llCheckCode_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (LinearLayout) phoneBindActivity.findViewById(R.id.llCheckCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llInputPhone_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (LinearLayout) phoneBindActivity.findViewById(R.id.llInputPhone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText phone_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (TextInputEditText) phoneBindActivity.findViewById(R.id.phone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rv_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (LinearLayout) phoneBindActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvCodeError_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (PFMedium) phoneBindActivity.findViewById(R.id.tvCodeError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCode_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (TextView) phoneBindActivity.findViewById(R.id.tv_code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvDescription_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (PFMedium) phoneBindActivity.findViewById(R.id.tvDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvTitle_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (PFMedium) phoneBindActivity.findViewById(R.id.tvTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText verificationCode_delegate$lambda$0(PhoneBindActivity phoneBindActivity) {
        return (TextInputEditText) phoneBindActivity.findViewById(R.id.verificationCode);
    }

    public final void backClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01.OXO1.IiI10X().put(b01.X0i1O, true);
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (this.mAppUser.getPhone().length() == 0) {
            this.verificationType = 2;
            this.isExistsPhone = false;
            getTvTitle().setText(R.string.bind_phone_num);
            getTvDescription().setText(R.string.bind_phone_tips);
        } else if (getMArg1() == 1) {
            this.nowPage++;
            this.verificationType = 2;
            this.isExistsPhone = false;
            getTvTitle().setText(R.string.update_phone);
            getTvDescription().setText(R.string.safety_verification_tips);
            getLlInputPhone().setVisibility(0);
            getBottomBtn().setVisibility(0);
            getLlCheckCode().setVisibility(8);
        } else {
            this.verificationType = 1;
            this.nowPage = -1;
            this.isExistsPhone = true;
            getTvTitle().setText(R.string.safety_verification);
            getTvDescription().setText(R.string.safety_verification_tips);
            List listI1I = StringsKt__StringsKt.i1I(this.mAppUser.getPhone(), new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);
            if (listI1I.size() > 1) {
                getTvCode().setText((CharSequence) listI1I.get(0));
                getPhone().setText((CharSequence) listI1I.get(1));
            } else {
                getTvCode().setText("+86");
                getPhone().setText(this.mAppUser.getPhone());
            }
            getBottomBtn().setVisibility(8);
            ToastUtils.showShort(getString(R.string.verifying_information), new Object[0]);
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ou1
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneBindActivity.initView$lambda$1(this.f10222IO);
                }
            }, 2000L);
        }
        getBottomBtn().setEnabled(false);
        getPhone().addTextChangedListener(new OXO1());
        getVerificationCode().addTextChangedListener(new XIi00iiXO());
        getPhone().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.pu1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return PhoneBindActivity.initView$lambda$2(this.f10437IO, textView, i, keyEvent);
            }
        });
        getVerificationCode().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.qu1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return PhoneBindActivity.initView$lambda$3(this.f10681IO, textView, i, keyEvent);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_phone_bind;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        int i = this.nowPage;
        if (i <= 0) {
            LinearLayout rv = getRv();
            Intrinsics.O10IXXX0X(rv, "<get-rv>(...)");
            backClick(rv);
        } else {
            this.nowPage = i - 1;
            getLlInputPhone().setVisibility(0);
            getBottomBtn().setVisibility(0);
            getLlCheckCode().setVisibility(8);
        }
    }

    public final void getVerificationCode(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!UtilsKt.IXOIIIO(String.valueOf(getPhone().getText()))) {
            ToastUtils.showShort(R.string.input_phone_format_error);
            return;
        }
        int i = this.nowPage;
        if (i == 0) {
            this.nowPage = i + 1;
        }
        getLlInputPhone().setVisibility(8);
        getLlCheckCode().setVisibility(0);
        getTvCodeError().setVisibility(8);
        RequestCommonMethod requestCommonMethod = RequestCommonMethod.INSTANCE;
        LinearLayout rv = getRv();
        String strValueOf = String.valueOf(getPhone().getText());
        Button btGetVerificationCode = getBtGetVerificationCode();
        Intrinsics.O10IXXX0X(btGetVerificationCode, "<get-btGetVerificationCode>(...)");
        RequestCommonMethod.requestVerificationCode$default(requestCommonMethod, this, rv, strValueOf, btGetVerificationCode, this.verificationType, null, 32, null);
    }
}
