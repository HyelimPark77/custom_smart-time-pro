package com.sma.smartv3.p610ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.qu0;
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
import com.sma.smartv3.network.SetReceivePhone;
import com.sma.smartv3.p610ui.login.ReceivePhoneBindActivity;
import com.sma.smartv3.pro.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import me.zheteng.countrycodeselector.Country;
import me.zheteng.countrycodeselector.CountryCodeSelectorFragment;
import me.zheteng.countrycodeselector.PhoneInputView;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nReceivePhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReceivePhoneBindActivity.kt\ncom/sma/smartv3/ui/login/ReceivePhoneBindActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,119:1\n19#2:120\n15#2:121\n183#3,4:122\n196#3:134\n252#4,7:126\n270#4:133\n*S KotlinDebug\n*F\n+ 1 ReceivePhoneBindActivity.kt\ncom/sma/smartv3/ui/login/ReceivePhoneBindActivity\n*L\n37#1:120\n37#1:121\n75#1:122,4\n75#1:134\n75#1:126,7\n75#1:133\n*E\n"})
public final class ReceivePhoneBindActivity extends BaseActivity {

    @aa1
    private AppUser mAppUser;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mh2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ReceivePhoneBindActivity.rootView_delegate$lambda$0(this.f9699IO);
        }
    });

    @aa1
    private final Lazy tvCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nh2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ReceivePhoneBindActivity.tvCode_delegate$lambda$0(this.f9931IO);
        }
    });

    @aa1
    private final Lazy phone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oh2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ReceivePhoneBindActivity.phone_delegate$lambda$0(this.f10144IO);
        }
    });

    @aa1
    private final Lazy privacyAppCheck$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ph2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ReceivePhoneBindActivity.privacyAppCheck_delegate$lambda$0(this.f10364IO);
        }
    });

    public ReceivePhoneBindActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    private final TextInputEditText getPhone() {
        return (TextInputEditText) this.phone$delegate.getValue();
    }

    private final CheckBox getPrivacyAppCheck() {
        return (CheckBox) this.privacyAppCheck$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final TextView getTvCode() {
        return (TextView) this.tvCode$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCountryCode$lambda$0$0(ReceivePhoneBindActivity receivePhoneBindActivity, CountryCodeSelectorFragment countryCodeSelectorFragment, Country country) {
        String strM40012iO = country.m40012iO();
        Intrinsics.O10IXXX0X(strM40012iO, "getCode(...)");
        if (strM40012iO.length() > 0) {
            receivePhoneBindActivity.getTvCode().setText(qu0.O00 + country.m40012iO());
        } else {
            receivePhoneBindActivity.getTvCode().setText("");
        }
        countryCodeSelectorFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText phone_delegate$lambda$0(ReceivePhoneBindActivity receivePhoneBindActivity) {
        return (TextInputEditText) receivePhoneBindActivity.findViewById(R.id.phone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox privacyAppCheck_delegate$lambda$0(ReceivePhoneBindActivity receivePhoneBindActivity) {
        return (CheckBox) receivePhoneBindActivity.findViewById(R.id.privacyAppCheck);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(ReceivePhoneBindActivity receivePhoneBindActivity) {
        return receivePhoneBindActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCode_delegate$lambda$0(ReceivePhoneBindActivity receivePhoneBindActivity) {
        return (TextView) receivePhoneBindActivity.findViewById(R.id.tv_code);
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
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.phone_number);
        String receivePhone = this.mAppUser.getReceivePhone();
        if (TextUtils.isEmpty(receivePhone)) {
            return;
        }
        List listI1I = StringsKt__StringsKt.i1I(receivePhone, new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);
        getTvCode().setText((CharSequence) listI1I.get(0));
        getPhone().setText((CharSequence) listI1I.get(1));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_receive_phone_bind;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!getPrivacyAppCheck().isChecked()) {
            ToastUtils.showLong(R.string.privacy_tick_tip);
            return;
        }
        final String strValueOf = String.valueOf(getPhone().getText());
        if (strValueOf.length() == 0) {
            ToastUtils.showLong(R.string.input_phone_num_tip);
            return;
        }
        String string = getTvCode().getText().toString();
        if (string.length() != 0) {
            strValueOf = string + HelpFormatter.DEFAULT_OPT_PREFIX + strValueOf;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> setReceivePhoneBody = RequestBodyKt.getSetReceivePhoneBody(this.mAppUser.getIdentity(), strValueOf);
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.login.ReceivePhoneBindActivity.onBottomClick.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                LogUtils.m11128d("handleResponse -> " + str);
                ReceivePhoneBindActivity.this.mAppUser.setReceivePhone(strValueOf);
                a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(ReceivePhoneBindActivity.this.mAppUser));
                I01XX0.XIi00iiXO(I01XX0.Ii0i, null, 2, null);
                ReceivePhoneBindActivity.this.finish();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("handleError -> " + error);
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRootView());
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SetReceivePhone.URL);
        netWorkUtils.printParam(strConvertBaseUrl + SetReceivePhone.URL, setReceivePhoneBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + SetReceivePhone.URL;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.login.ReceivePhoneBindActivity$onBottomClick$$inlined$post$1
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
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) setReceivePhoneBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.login.ReceivePhoneBindActivity$onBottomClick$$inlined$post$2
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
    }

    public final void onCountryCode(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Intent intent = new Intent();
        intent.putExtra(PhoneInputView.Ii1iii0, 1);
        intent.putExtra(PhoneInputView.iXiiiO, ContextCompat.getColor(getMContext(), R.color.colorPrimary));
        final CountryCodeSelectorFragment countryCodeSelectorFragmentNewInstance = CountryCodeSelectorFragment.newInstance(intent);
        countryCodeSelectorFragmentNewInstance.show(getSupportFragmentManager(), "CountryCodeSelector");
        countryCodeSelectorFragmentNewInstance.setOnCountrySelectListener(new CountryCodeSelectorFragment.OXO1() { // from class: com.android.mltcode.paycertificationapi.qh2
            @Override // me.zheteng.countrycodeselector.CountryCodeSelectorFragment.OXO1
            public final void OXO1(Country country) {
                ReceivePhoneBindActivity.onCountryCode$lambda$0$0(this.OXO1, countryCodeSelectorFragmentNewInstance, country);
            }
        });
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
