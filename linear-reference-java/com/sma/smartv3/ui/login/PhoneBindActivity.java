package com.sma.smartv3.ui.login;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.mu1;
import com.android.mltcode.paycertificationapi.nu1;
import com.android.mltcode.paycertificationapi.ou1;
import com.android.mltcode.paycertificationapi.pu1;
import com.android.mltcode.paycertificationapi.qu1;
import com.android.mltcode.paycertificationapi.ru1;
import com.android.mltcode.paycertificationapi.su1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tu1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uu1;
import com.android.mltcode.paycertificationapi.vu1;
import com.android.mltcode.paycertificationapi.wu1;
import com.android.mltcode.paycertificationapi.xu1;
import com.android.mltcode.paycertificationapi.yu1;
import com.android.mltcode.paycertificationapi.zu1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,214:1\n19#2:215\n15#2:216\n176#3,11:217\n196#3:236\n176#3,11:237\n196#3:256\n252#4,7:228\n270#4:235\n252#4,7:248\n270#4:255\n*S KotlinDebug\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity\n*L\n46#1:215\n46#1:216\n139#1:217,11\n139#1:236\n161#1:237,11\n161#1:256\n139#1:228,7\n139#1:235\n161#1:248,7\n161#1:255\n*E\n"})
public final class PhoneBindActivity extends BaseActivity {

    @aa1
    private final Lazy bottomBtn$delegate;

    @aa1
    private final Lazy btGetVerificationCode$delegate;
    private boolean isExistsPhone;

    @aa1
    private final Lazy llCheckCode$delegate;

    @aa1
    private final Lazy llInputPhone$delegate;

    @aa1
    private AppUser mAppUser;
    private int nowPage;

    @aa1
    private final Lazy phone$delegate;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final Lazy tvCode$delegate;

    @aa1
    private final Lazy tvCodeError$delegate;

    @aa1
    private final Lazy tvDescription$delegate;

    @aa1
    private final Lazy tvTitle$delegate;

    @aa1
    private final Lazy verificationCode$delegate;
    private int verificationType;

    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ PhoneBindActivity IO;

        public OXO1(PhoneBindActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            Button r3 = PhoneBindActivity.access$getBottomBtn(this.IO);
            if (String.valueOf(PhoneBindActivity.access$getPhone(this.IO).getText()).length() <= 0) goto L5;
            boolean r0 = true;
        L6:
            r3.setEnabled(r0);
            return;
        L5:
            r0 = false;
            goto L6
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ PhoneBindActivity IO;

        public XIi00iiXO(PhoneBindActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            if (String.valueOf(PhoneBindActivity.access$getVerificationCode(this.IO).getText()).length() != 4) goto L6;
            PhoneBindActivity r3 = this.IO;
            PhoneBindActivity.access$changePhone(r3, String.valueOf(PhoneBindActivity.access$getVerificationCode(r3).getText()));
            return;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
            PhoneBindActivity.access$getTvCodeError(this.IO).setVisibility(8);
        }
    }

    public PhoneBindActivity() {
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new mu1(this));
        this.llInputPhone$delegate = LazyKt__LazyJVMKt.iO(new su1(this));
        this.llCheckCode$delegate = LazyKt__LazyJVMKt.iO(new tu1(this));
        this.tvTitle$delegate = LazyKt__LazyJVMKt.iO(new uu1(this));
        this.tvDescription$delegate = LazyKt__LazyJVMKt.iO(new vu1(this));
        this.tvCode$delegate = LazyKt__LazyJVMKt.iO(new wu1(this));
        this.phone$delegate = LazyKt__LazyJVMKt.iO(new xu1(this));
        this.verificationCode$delegate = LazyKt__LazyJVMKt.iO(new yu1(this));
        this.btGetVerificationCode$delegate = LazyKt__LazyJVMKt.iO(new zu1(this));
        this.bottomBtn$delegate = LazyKt__LazyJVMKt.iO(new nu1(this));
        this.tvCodeError$delegate = LazyKt__LazyJVMKt.iO(new ru1(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ void I0iXXO(PhoneBindActivity r0) {
        initView$lambda$1(r0);
    }

    public static /* synthetic */ PFMedium I1XOi1(PhoneBindActivity r0) {
        return tvDescription_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(PhoneBindActivity r0) {
        return tvCodeError_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextInputEditText O10IXXX0X(PhoneBindActivity r0) {
        return phone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button OII(PhoneBindActivity r0) {
        return bottomBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(PhoneBindActivity r0, TextView r1, int r2, KeyEvent r3) {
        return initView$lambda$3(r0, r1, r2, r3);
    }

    public static /* synthetic */ LinearLayout OiIIX101O(PhoneBindActivity r0) {
        return llCheckCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(PhoneBindActivity r0, TextView r1, int r2, KeyEvent r3) {
        return initView$lambda$2(r0, r1, r2, r3);
    }

    public static /* synthetic */ LinearLayout X1ii(PhoneBindActivity r0) {
        return llInputPhone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextInputEditText XX0(PhoneBindActivity r0) {
        return verificationCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XXI(PhoneBindActivity r0) {
        return btGetVerificationCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(PhoneBindActivity r0) {
        return tvCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XiOIii1(PhoneBindActivity r0) {
        return tvTitle_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$changePhone(PhoneBindActivity r0, String r1) {
        r0.changePhone(r1);
    }

    public static final /* synthetic */ Button access$getBottomBtn(PhoneBindActivity r0) {
        return r0.getBottomBtn();
    }

    public static final /* synthetic */ AppUser access$getMAppUser$p(PhoneBindActivity r0) {
        return r0.mAppUser;
    }

    public static final /* synthetic */ TextInputEditText access$getPhone(PhoneBindActivity r0) {
        return r0.getPhone();
    }

    public static final /* synthetic */ PFMedium access$getTvCodeError(PhoneBindActivity r0) {
        return r0.getTvCodeError();
    }

    public static final /* synthetic */ TextInputEditText access$getVerificationCode(PhoneBindActivity r0) {
        return r0.getVerificationCode();
    }

    private static final Button bottomBtn_delegate$lambda$0(PhoneBindActivity r1) {
        return (Button) r1.findViewById(R.id.bottom_btn);
    }

    private static final Button btGetVerificationCode_delegate$lambda$0(PhoneBindActivity r1) {
        return (Button) r1.findViewById(R.id.btGetVerificationCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    private final void changePhone(String r11) {
        final Ref.ObjectRef r1 = new Ref.ObjectRef();
        final Activity r4 = null;
        r1.element = RequestCommonMethod.getPhoneWithCode$default(RequestCommonMethod.INSTANCE, null, String.valueOf(getPhone().getText()), 1, null);
        if (this.mAppUser.getPhone().length() != 0) goto L6;
    L7:
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getSetEmailBody(this.mAppUser.getIdentity(), (String) r1.element, r11);
        final O1XIiIO<AppUser> r6 = new AnonymousClass1(this, r1);
        final uq r3 = r2.loadPopup(null, null);
        String r7 = r2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SetEmail.URL);
        r2.printParam(r7 + SetEmail.URL, r12);
        NetWork r5 = NetWork.OXO1;
        String r8 = r7 + SetEmail.URL;
        final O1XIiIO<Response<AppUser>> r9 = new PhoneBindActivity$changePhone$$inlined$post$default$1(r4, r6, r3);
        AndroidNetworking.post(r8).addBodyParameter(r12).setTag(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new PhoneBindActivity$changePhone$$inlined$post$default$2(r9));
        return;
    L6:
        if (getMArg1() == 1) goto L7;
        NetWorkUtils r10 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r13 = RequestBodyKt.getVerificationCodeCheckBody((String) r1.element, r11);
        final O1XIiIO<String> r14 = new AnonymousClass2(this);
        final uq r15 = r10.loadPopup(null, null);
        String r16 = r10.convertBaseUrl(Api.INSTANCE.getBASE_URL(), VerificationCodeCheck.URL);
        r10.printParam(r16 + VerificationCodeCheck.URL, r13);
        NetWork r17 = NetWork.OXO1;
        String r18 = r16 + VerificationCodeCheck.URL;
        final O1XIiIO<Response<String>> r19 = new PhoneBindActivity$changePhone$$inlined$post$default$3(r4, r14, r15);
        AndroidNetworking.post(r18).addBodyParameter(r13).setTag(r18).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new PhoneBindActivity$changePhone$$inlined$post$default$4(r19));
    }

    private final Button getBottomBtn() {
        return (Button) getValue();
    }

    private final Button getBtGetVerificationCode() {
        return (Button) getValue();
    }

    private final LinearLayout getLlCheckCode() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlInputPhone() {
        return (LinearLayout) getValue();
    }

    private final TextInputEditText getPhone() {
        return (TextInputEditText) getValue();
    }

    private final LinearLayout getRv() {
        return (LinearLayout) getValue();
    }

    private final TextView getTvCode() {
        return (TextView) getValue();
    }

    private final PFMedium getTvCodeError() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvDescription() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvTitle() {
        return (PFMedium) getValue();
    }

    private final TextInputEditText getVerificationCode() {
        return (TextInputEditText) getValue();
    }

    public static /* synthetic */ LinearLayout iIiiO(PhoneBindActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$1(PhoneBindActivity r2) {
        TextInputEditText r0 = r2.getPhone();
        Intrinsics.O10IXXX0X(r0, "<get-phone>(...)");
        r2.getVerificationCode(r0);
    }

    private static final boolean initView$lambda$2(PhoneBindActivity r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        TextInputEditText r4 = r0.getPhone();
        Intrinsics.O10IXXX0X(r4, "<get-phone>(...)");
        r0.getVerificationCode(r4);
        return false;
    L7:
        return false;
    }

    private static final boolean initView$lambda$3(PhoneBindActivity r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        r0.changePhone(String.valueOf(r0.getVerificationCode().getText()));
        return false;
    L7:
        return false;
    }

    private static final LinearLayout llCheckCode_delegate$lambda$0(PhoneBindActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.llCheckCode);
    }

    private static final LinearLayout llInputPhone_delegate$lambda$0(PhoneBindActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.llInputPhone);
    }

    private static final TextInputEditText phone_delegate$lambda$0(PhoneBindActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.phone);
    }

    private static final LinearLayout rv_delegate$lambda$0(PhoneBindActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rv);
    }

    private static final PFMedium tvCodeError_delegate$lambda$0(PhoneBindActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tvCodeError);
    }

    private static final TextView tvCode_delegate$lambda$0(PhoneBindActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_code);
    }

    private static final PFMedium tvDescription_delegate$lambda$0(PhoneBindActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tvDescription);
    }

    private static final PFMedium tvTitle_delegate$lambda$0(PhoneBindActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tvTitle);
    }

    private static final TextInputEditText verificationCode_delegate$lambda$0(PhoneBindActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.verificationCode);
    }

    public final void backClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        a01.OXO1.IiI10X().put(b01.X0i1O, true);
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (this.mAppUser.getPhone().length() != 0) goto L6;
        this.verificationType = 2;
        this.isExistsPhone = false;
        getTvTitle().setText(R.string.bind_phone_num);
        getTvDescription().setText(R.string.bind_phone_tips);
    L13:
        getBottomBtn().setEnabled(false);
        getPhone().addTextChangedListener(new OXO1(this));
        getVerificationCode().addTextChangedListener(new XIi00iiXO(this));
        getPhone().setOnEditorActionListener(new pu1(this));
        getVerificationCode().setOnEditorActionListener(new qu1(this));
        return;
    L6:
        if (getMArg1() != 1) goto L8;
        this.nowPage++;
        this.verificationType = 2;
        this.isExistsPhone = false;
        getTvTitle().setText(R.string.update_phone);
        getTvDescription().setText(R.string.safety_verification_tips);
        getLlInputPhone().setVisibility(0);
        getBottomBtn().setVisibility(0);
        getLlCheckCode().setVisibility(8);
        goto L13
    L8:
        this.verificationType = 1;
        this.nowPage = -1;
        this.isExistsPhone = true;
        getTvTitle().setText(R.string.safety_verification);
        getTvDescription().setText(R.string.safety_verification_tips);
        List r0 = StringsKt__StringsKt.i1I(this.mAppUser.getPhone(), new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);
        if (r0.size() <= 1) goto L11;
        getTvCode().setText((CharSequence) r0.get(0));
        getPhone().setText((CharSequence) r0.get(1));
    L12:
        getBottomBtn().setVisibility(8);
        ToastUtils.showShort(getString(R.string.verifying_information), new Object[0]);
        new Handler().postDelayed(new ou1(this), 2000);
        goto L13
    L11:
        getTvCode().setText("+86");
        getPhone().setText(this.mAppUser.getPhone());
        goto L12
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_phone_bind;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        int r0 = this.nowPage;
        if (r0 <= 0) goto L6;
        this.nowPage = r0 - 1;
        getLlInputPhone().setVisibility(0);
        getBottomBtn().setVisibility(0);
        getLlCheckCode().setVisibility(8);
        return;
    L6:
        LinearLayout r1 = getRv();
        Intrinsics.O10IXXX0X(r1, "<get-rv>(...)");
        backClick(r1);
    }

    public final void getVerificationCode(@aa1 View r11) {
        Intrinsics.X0O(r11, "view");
        if (UtilsKt.IXOIIIO(String.valueOf(getPhone().getText())) == true) goto L6;
        ToastUtils.showShort(R.string.input_phone_format_error);
        return;
    L6:
        int r12 = this.nowPage;
        if (r12 != 0) goto L9;
        this.nowPage = r12 + 1;
    L9:
        getLlInputPhone().setVisibility(8);
        getLlCheckCode().setVisibility(0);
        getTvCodeError().setVisibility(8);
        RequestCommonMethod r1 = RequestCommonMethod.INSTANCE;
        LinearLayout r3 = getRv();
        String r4 = String.valueOf(getPhone().getText());
        Button r5 = getBtGetVerificationCode();
        Intrinsics.O10IXXX0X(r5, "<get-btGetVerificationCode>(...)");
        RequestCommonMethod.requestVerificationCode$default(r1, this, r3, r4, r5, this.verificationType, null, 32, null);
    }
}
