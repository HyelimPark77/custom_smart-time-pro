package com.sma.smartv3.p610ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.textfield.TextInputEditText;
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
import com.sma.smartv3.p610ui.login.EmailBindActivity;
import com.sma.smartv3.p610ui.main.MainActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nEmailBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,289:1\n176#2,11:290\n196#2:309\n176#2,11:310\n196#2:329\n252#3,7:301\n270#3:308\n252#3,7:321\n270#3:328\n69#4,3:330\n72#4,5:334\n69#4,3:339\n72#4,5:343\n1#5:333\n1#5:342\n19#6:348\n15#6:349\n*S KotlinDebug\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity\n*L\n140#1:290,11\n140#1:309\n166#1:310,11\n166#1:329\n140#1:301,7\n140#1:308\n166#1:321,7\n166#1:328\n200#1:330,3\n200#1:334,5\n275#1:339,3\n275#1:343,5\n200#1:333\n275#1:342\n48#1:348\n48#1:349\n*E\n"})
public final class EmailBindActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_FORCED = 2;
    public static final int TYPE_NEW_MAIL = 1;
    public static final int TYPE_RECOVER_DEFAULT = 3;
    private boolean isExistsEmail;
    private int nowPage;
    private int verificationType;

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiXXIIXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.rv_delegate$lambda$0(this.f2301IO);
        }
    });

    @aa1
    private final Lazy llInputEmail$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00XII1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.llInputEmail_delegate$lambda$0(this.f1028IO);
        }
    });

    @aa1
    private final Lazy llCheckCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOII0iii1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.llCheckCode_delegate$lambda$0(this.f8064IO);
        }
    });

    @aa1
    private final Lazy tvTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIOXXI0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.tvTitle_delegate$lambda$0(this.f1630IO);
        }
    });

    @aa1
    private final Lazy tvDescription$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIOX10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.tvDescription_delegate$lambda$0(this.f7881IO);
        }
    });

    @aa1
    private final Lazy email$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX0iXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.email_delegate$lambda$0(this.f3419IO);
        }
    });

    @aa1
    private final Lazy verificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI1O1XO00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.verificationCode_delegate$lambda$0(this.f2914IO);
        }
    });

    @aa1
    private final Lazy btGetVerificationCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I110II
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.btGetVerificationCode_delegate$lambda$0(this.f1336IO);
        }
    });

    @aa1
    private final Lazy bottomBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0II0XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.bottomBtn_delegate$lambda$0(this.f3955IO);
        }
    });

    @aa1
    private final Lazy tvCodeError$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1IX01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.tvCodeError_delegate$lambda$0(this.f7585IO);
        }
    });

    @aa1
    private final Lazy bottomErrorLogin$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXiI0IX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.bottomErrorLogin_delegate$lambda$0(this.f5156IO);
        }
    });

    @aa1
    private final Lazy mAppUser$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO1OII10O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EmailBindActivity.mAppUser_delegate$lambda$0();
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO implements TextWatcher {
        public XIi00iiXO() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EmailBindActivity.this.getBottomBtn().setEnabled(StringsKt__StringsKt.iIi011O(String.valueOf(EmailBindActivity.this.getEmail().getText()), "@", false, 2, null));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.login.EmailBindActivity$iO */
    public static final class C18841iO implements TextWatcher {
        public C18841iO() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (String.valueOf(EmailBindActivity.this.getVerificationCode().getText()).length() == 4) {
                EmailBindActivity emailBindActivity = EmailBindActivity.this;
                emailBindActivity.changeEmail(String.valueOf(emailBindActivity.getVerificationCode().getText()));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EmailBindActivity.this.getTvCodeError().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button bottomBtn_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (Button) emailBindActivity.findViewById(R.id.bottom_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button bottomErrorLogin_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (Button) emailBindActivity.findViewById(R.id.btn_codeErrorGoLogin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btGetVerificationCode_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (Button) emailBindActivity.findViewById(R.id.btGetVerificationCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeEmail(String str) {
        final Activity activity = null;
        if (getMAppUser().getEmail().length() == 0 || getMArg1() == 1) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            HashMap<String, String> setEmailBody = RequestBodyKt.getSetEmailBody(getMAppUser().getIdentity(), String.valueOf(getEmail().getText()), str);
            final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.login.EmailBindActivity.changeEmail.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(AppUser appUser) {
                    EmailBindActivity.this.getMAppUser().setEmail(String.valueOf(EmailBindActivity.this.getEmail().getText()));
                    a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(EmailBindActivity.this.getMAppUser()));
                    I01XX0.XIi00iiXO(I01XX0.IXOIIIO, null, 2, null);
                    if (EmailBindActivity.this.getMArg1() == 2) {
                        EmailBindActivity emailBindActivity = EmailBindActivity.this;
                        emailBindActivity.startActivity(new Intent(emailBindActivity, (Class<?>) MainActivity.class));
                    }
                    EmailBindActivity.this.finish();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    EmailBindActivity.this.getTvCodeError().setVisibility(0);
                }
            };
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
            String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SetEmail.URL);
            netWorkUtils.printParam(strConvertBaseUrl + SetEmail.URL, setEmailBody);
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + SetEmail.URL;
            final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.EmailBindActivity$changeEmail$$inlined$post$default$1
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
            AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) setEmailBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.EmailBindActivity$changeEmail$$inlined$post$default$2
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
        HashMap<String, String> verificationCodeCheckBody = RequestBodyKt.getVerificationCodeCheckBody(String.valueOf(getEmail().getText()), str);
        final O1XIiIO<String> o1XIiIO3 = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.login.EmailBindActivity.changeEmail.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str3) {
                EmailBindActivity emailBindActivity = EmailBindActivity.this;
                Bundle bundle = new Bundle();
                bundle.putString("mArg0", null);
                bundle.putInt("mArg1", 1);
                bundle.putParcelable("mArg2", null);
                bundle.putSerializable("mArg3", null);
                Intent intent = new Intent(emailBindActivity, (Class<?>) EmailBindActivity.class);
                intent.putExtras(bundle);
                emailBindActivity.startActivity(intent);
                EmailBindActivity.this.finish();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                EmailBindActivity.this.getTvCodeError().setVisibility(0);
            }
        };
        final C3006uq c3006uqLoadPopup2 = netWorkUtils2.loadPopup(null, null);
        String strConvertBaseUrl2 = netWorkUtils2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), VerificationCodeCheck.URL);
        netWorkUtils2.printParam(strConvertBaseUrl2 + VerificationCodeCheck.URL, verificationCodeCheckBody);
        NetWork netWork2 = NetWork.OXO1;
        String str3 = strConvertBaseUrl2 + VerificationCodeCheck.URL;
        final O1XIiIO<Response<String>> o1XIiIO4 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.login.EmailBindActivity$changeEmail$$inlined$post$default$3
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
        AndroidNetworking.post(str3).addBodyParameter((Map<String, String>) verificationCodeCheckBody).setTag((Object) str3).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.login.EmailBindActivity$changeEmail$$inlined$post$default$4
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
    public static final TextInputEditText email_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (TextInputEditText) emailBindActivity.findViewById(R.id.email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Button getBottomBtn() {
        return (Button) this.bottomBtn$delegate.getValue();
    }

    private final Button getBottomErrorLogin() {
        return (Button) this.bottomErrorLogin$delegate.getValue();
    }

    private final Button getBtGetVerificationCode() {
        return (Button) this.btGetVerificationCode$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputEditText getEmail() {
        return (TextInputEditText) this.email$delegate.getValue();
    }

    private final LinearLayout getLlCheckCode() {
        return (LinearLayout) this.llCheckCode$delegate.getValue();
    }

    private final LinearLayout getLlInputEmail() {
        return (LinearLayout) this.llInputEmail$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppUser getMAppUser() {
        return (AppUser) this.mAppUser$delegate.getValue();
    }

    private final LinearLayout getRv() {
        return (LinearLayout) this.rv$delegate.getValue();
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
    public static final void initView$lambda$0(EmailBindActivity emailBindActivity) {
        TextInputEditText email = emailBindActivity.getEmail();
        Intrinsics.O10IXXX0X(email, "<get-email>(...)");
        emailBindActivity.getVerificationCode(email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$1(EmailBindActivity emailBindActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        TextInputEditText email = emailBindActivity.getEmail();
        Intrinsics.O10IXXX0X(email, "<get-email>(...)");
        emailBindActivity.getVerificationCode(email);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$2(EmailBindActivity emailBindActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        emailBindActivity.changeEmail(String.valueOf(emailBindActivity.getVerificationCode().getText()));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llCheckCode_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (LinearLayout) emailBindActivity.findViewById(R.id.llCheckCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llInputEmail_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (LinearLayout) emailBindActivity.findViewById(R.id.llInputEmail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppUser mAppUser_delegate$lambda$0() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        return (AppUser) appUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rv_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (LinearLayout) emailBindActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvCodeError_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (PFMedium) emailBindActivity.findViewById(R.id.tvCodeError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvDescription_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (PFMedium) emailBindActivity.findViewById(R.id.tvDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvTitle_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (PFMedium) emailBindActivity.findViewById(R.id.tvTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText verificationCode_delegate$lambda$0(EmailBindActivity emailBindActivity) {
        return (TextInputEditText) emailBindActivity.findViewById(R.id.verificationCode);
    }

    public final void backClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int mArg1 = getMArg1();
        if (mArg1 == 2) {
            if (this.nowPage > 0) {
                onHandleBackPressed();
                return;
            } else {
                ToastUtils.showShort(R.string.input_email);
                return;
            }
        }
        if (mArg1 != 3) {
            a01.OXO1.IiI10X().put(b01.X1IX, true);
            finish();
        } else {
            if (this.nowPage > 0) {
                onHandleBackPressed();
                return;
            }
            a01.OXO1.IiI10X().put(b01.X1IX, true);
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getBottomErrorLogin().setVisibility(8);
        if (getMAppUser().getEmail().length() == 0) {
            this.verificationType = 2;
            this.isExistsEmail = false;
            getTvTitle().setText(R.string.bind_email);
            getTvDescription().setText(R.string.bind_email_tips);
        } else if (getMArg1() == 1) {
            this.nowPage++;
            this.verificationType = 2;
            this.isExistsEmail = false;
            getTvTitle().setText(R.string.update_email);
            getTvDescription().setText(R.string.safety_verification_tips);
            getLlInputEmail().setVisibility(0);
            getBottomBtn().setVisibility(0);
            getLlCheckCode().setVisibility(8);
        } else {
            this.verificationType = 1;
            this.nowPage = -1;
            this.isExistsEmail = true;
            getTvTitle().setText(R.string.safety_verification);
            getTvDescription().setText(R.string.safety_verification_tips);
            getEmail().setText(getMAppUser().getEmail());
            getBottomBtn().setVisibility(8);
            ToastUtils.showShort(getString(R.string.verifying_information), new Object[0]);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O11X
                @Override // java.lang.Runnable
                public final void run() {
                    EmailBindActivity.initView$lambda$0(this.f2680IO);
                }
            }, 2000L);
        }
        getBottomBtn().setEnabled(false);
        getEmail().addTextChangedListener(new XIi00iiXO());
        getVerificationCode().addTextChangedListener(new C18841iO());
        getEmail().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.O0X000O0i
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return EmailBindActivity.initView$lambda$1(this.f2524IO, textView, i, keyEvent);
            }
        });
        getVerificationCode().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.Ii11OOIO
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return EmailBindActivity.initView$lambda$2(this.f2200IO, textView, i, keyEvent);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_email_bind;
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
            getLlInputEmail().setVisibility(0);
            getBottomBtn().setVisibility(0);
            getLlCheckCode().setVisibility(8);
        }
    }

    public final void onLogOut(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) ServerSelectActivity.class));
        finish();
    }

    public final void getVerificationCode(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!RegexUtils.isEmail(String.valueOf(getEmail().getText()))) {
            ToastUtils.showShort(R.string.email_format_error);
            return;
        }
        int i = this.nowPage;
        if (i == 0) {
            this.nowPage = i + 1;
        }
        getLlInputEmail().setVisibility(8);
        getLlCheckCode().setVisibility(0);
        getTvCodeError().setVisibility(8);
        if (getMArg1() == 3 || getMArg1() == 2) {
            getBottomErrorLogin().setVisibility(0);
        }
        RequestCommonMethod requestCommonMethod = RequestCommonMethod.INSTANCE;
        LinearLayout rv = getRv();
        String strValueOf = String.valueOf(getEmail().getText());
        Button btGetVerificationCode = getBtGetVerificationCode();
        Intrinsics.O10IXXX0X(btGetVerificationCode, "<get-btGetVerificationCode>(...)");
        requestCommonMethod.requestVerificationCode(this, rv, strValueOf, btGetVerificationCode, this.verificationType, new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.login.EmailBindActivity.getVerificationCode.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                if (!StringsKt__StringsKt.iIi011O(error, "code=2003", false, 2, null)) {
                    if (StringsKt__StringsKt.iIi011O(error, "code=2002", false, 2, null)) {
                        EmailBindActivity.this.getTvCodeError().setVisibility(0);
                        EmailBindActivity.this.getTvCodeError().setText(EmailBindActivity.this.getString(R.string.verification_code_error));
                        return;
                    }
                    return;
                }
                EmailBindActivity.this.getTvCodeError().setVisibility(0);
                EmailBindActivity emailBindActivity = EmailBindActivity.this;
                String string = emailBindActivity.getString(R.string.input_email_error_tip, emailBindActivity.getString(R.string.app_name));
                Intrinsics.O10IXXX0X(string, "getString(...)");
                EmailBindActivity.this.getTvCodeError().setText(string);
                ToastUtils.showShort(string, new Object[0]);
            }
        });
    }
}
