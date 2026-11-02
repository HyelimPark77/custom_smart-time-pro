package com.sma.smartv3.ui.login;

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
import com.android.mltcode.paycertificationapi.I00XII1i;
import com.android.mltcode.paycertificationapi.I110II;
import com.android.mltcode.paycertificationapi.IIOXXI0X;
import com.android.mltcode.paycertificationapi.Ii11OOIO;
import com.android.mltcode.paycertificationapi.IiXXIIXO;
import com.android.mltcode.paycertificationapi.O0X000O0i;
import com.android.mltcode.paycertificationapi.O11X;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OI1O1XO00;
import com.android.mltcode.paycertificationapi.OX0iXI;
import com.android.mltcode.paycertificationapi.X0II0XO;
import com.android.mltcode.paycertificationapi.XO1OII10O;
import com.android.mltcode.paycertificationapi.XXiI0IX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1IX01;
import com.android.mltcode.paycertificationapi.iIOX10;
import com.android.mltcode.paycertificationapi.iOII0iii1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.main.MainActivity;
import com.sma.smartv3.view.text.PFMedium;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nEmailBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,289:1\n176#2,11:290\n196#2:309\n176#2,11:310\n196#2:329\n252#3,7:301\n270#3:308\n252#3,7:321\n270#3:328\n69#4,3:330\n72#4,5:334\n69#4,3:339\n72#4,5:343\n1#5:333\n1#5:342\n19#6:348\n15#6:349\n*S KotlinDebug\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity\n*L\n140#1:290,11\n140#1:309\n166#1:310,11\n166#1:329\n140#1:301,7\n140#1:308\n166#1:321,7\n166#1:328\n200#1:330,3\n200#1:334,5\n275#1:339,3\n275#1:343,5\n200#1:333\n275#1:342\n48#1:348\n48#1:349\n*E\n"})
public final class EmailBindActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_FORCED = 2;
    public static final int TYPE_NEW_MAIL = 1;
    public static final int TYPE_RECOVER_DEFAULT = 3;

    @aa1
    private final Lazy bottomBtn$delegate;

    @aa1
    private final Lazy bottomErrorLogin$delegate;

    @aa1
    private final Lazy btGetVerificationCode$delegate;

    @aa1
    private final Lazy email$delegate;
    private boolean isExistsEmail;

    @aa1
    private final Lazy llCheckCode$delegate;

    @aa1
    private final Lazy llInputEmail$delegate;

    @aa1
    private final Lazy mAppUser$delegate;
    private int nowPage;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final Lazy tvCodeError$delegate;

    @aa1
    private final Lazy tvDescription$delegate;

    @aa1
    private final Lazy tvTitle$delegate;

    @aa1
    private final Lazy verificationCode$delegate;
    private int verificationType;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ EmailBindActivity IO;

        public XIi00iiXO(EmailBindActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r6) {
            EmailBindActivity.access$getBottomBtn(this.IO).setEnabled(StringsKt__StringsKt.iIi011O(String.valueOf(EmailBindActivity.access$getEmail(this.IO).getText()), "@", false, 2, null));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class iO implements TextWatcher {
        public final /* synthetic */ EmailBindActivity IO;

        public iO(EmailBindActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            if (String.valueOf(EmailBindActivity.access$getVerificationCode(this.IO).getText()).length() != 4) goto L6;
            EmailBindActivity r3 = this.IO;
            EmailBindActivity.access$changeEmail(r3, String.valueOf(EmailBindActivity.access$getVerificationCode(r3).getText()));
            return;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
            EmailBindActivity.access$getTvCodeError(this.IO).setVisibility(8);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public EmailBindActivity() {
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new IiXXIIXO(this));
        this.llInputEmail$delegate = LazyKt__LazyJVMKt.iO(new I00XII1i(this));
        this.llCheckCode$delegate = LazyKt__LazyJVMKt.iO(new iOII0iii1(this));
        this.tvTitle$delegate = LazyKt__LazyJVMKt.iO(new IIOXXI0X(this));
        this.tvDescription$delegate = LazyKt__LazyJVMKt.iO(new iIOX10(this));
        this.email$delegate = LazyKt__LazyJVMKt.iO(new OX0iXI(this));
        this.verificationCode$delegate = LazyKt__LazyJVMKt.iO(new OI1O1XO00(this));
        this.btGetVerificationCode$delegate = LazyKt__LazyJVMKt.iO(new I110II(this));
        this.bottomBtn$delegate = LazyKt__LazyJVMKt.iO(new X0II0XO(this));
        this.tvCodeError$delegate = LazyKt__LazyJVMKt.iO(new i1IX01(this));
        this.bottomErrorLogin$delegate = LazyKt__LazyJVMKt.iO(new XXiI0IX(this));
        this.mAppUser$delegate = LazyKt__LazyJVMKt.iO(new XO1OII10O());
    }

    public static /* synthetic */ boolean I0iXXO(EmailBindActivity r0, TextView r1, int r2, KeyEvent r3) {
        return initView$lambda$2(r0, r1, r2, r3);
    }

    public static /* synthetic */ LinearLayout I1XOi1(EmailBindActivity r0) {
        return llCheckCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout IIX1OXO(EmailBindActivity r0) {
        return llInputEmail_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(EmailBindActivity r0) {
        return tvDescription_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button OII(EmailBindActivity r0) {
        return bottomBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(EmailBindActivity r0) {
        return tvTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button OX(EmailBindActivity r0) {
        return btGetVerificationCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextInputEditText OiIIX101O(EmailBindActivity r0) {
        return verificationCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(EmailBindActivity r0, TextView r1, int r2, KeyEvent r3) {
        return initView$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ LinearLayout X1ii(EmailBindActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XX0(EmailBindActivity r0) {
        return tvCodeError_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextInputEditText XXI(EmailBindActivity r0) {
        return email_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AppUser XiOIO() {
        return mAppUser_delegate$lambda$0();
    }

    public static /* synthetic */ Button XiOIii1(EmailBindActivity r0) {
        return bottomErrorLogin_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$changeEmail(EmailBindActivity r0, String r1) {
        r0.changeEmail(r1);
    }

    public static final /* synthetic */ Button access$getBottomBtn(EmailBindActivity r0) {
        return r0.getBottomBtn();
    }

    public static final /* synthetic */ TextInputEditText access$getEmail(EmailBindActivity r0) {
        return r0.getEmail();
    }

    public static final /* synthetic */ AppUser access$getMAppUser(EmailBindActivity r0) {
        return r0.getMAppUser();
    }

    public static final /* synthetic */ PFMedium access$getTvCodeError(EmailBindActivity r0) {
        return r0.getTvCodeError();
    }

    public static final /* synthetic */ TextInputEditText access$getVerificationCode(EmailBindActivity r0) {
        return r0.getVerificationCode();
    }

    private static final Button bottomBtn_delegate$lambda$0(EmailBindActivity r1) {
        return (Button) r1.findViewById(R.id.bottom_btn);
    }

    private static final Button bottomErrorLogin_delegate$lambda$0(EmailBindActivity r1) {
        return (Button) r1.findViewById(R.id.btn_codeErrorGoLogin);
    }

    private static final Button btGetVerificationCode_delegate$lambda$0(EmailBindActivity r1) {
        return (Button) r1.findViewById(R.id.btGetVerificationCode);
    }

    private final void changeEmail(String r11) {
        final Activity r4 = null;
        if (getMAppUser().getEmail().length() != 0) goto L6;
    L7:
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getSetEmailBody(getMAppUser().getIdentity(), String.valueOf(getEmail().getText()), r11);
        final O1XIiIO<AppUser> r5 = new AnonymousClass1(this);
        final uq r6 = r2.loadPopup(null, null);
        String r7 = r2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SetEmail.URL);
        r2.printParam(r7 + SetEmail.URL, r12);
        NetWork r3 = NetWork.OXO1;
        String r8 = r7 + SetEmail.URL;
        final O1XIiIO<Response<AppUser>> r9 = new EmailBindActivity$changeEmail$$inlined$post$default$1(r4, r5, r6);
        AndroidNetworking.post(r8).addBodyParameter(r12).setTag(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new EmailBindActivity$changeEmail$$inlined$post$default$2(r9));
        return;
    L6:
        if (getMArg1() == 1) goto L7;
        NetWorkUtils r10 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r13 = RequestBodyKt.getVerificationCodeCheckBody(String.valueOf(getEmail().getText()), r11);
        final O1XIiIO<String> r14 = new AnonymousClass2(this);
        final uq r15 = r10.loadPopup(null, null);
        String r16 = r10.convertBaseUrl(Api.INSTANCE.getBASE_URL(), VerificationCodeCheck.URL);
        r10.printParam(r16 + VerificationCodeCheck.URL, r13);
        NetWork r17 = NetWork.OXO1;
        String r18 = r16 + VerificationCodeCheck.URL;
        final O1XIiIO<Response<String>> r19 = new EmailBindActivity$changeEmail$$inlined$post$default$3(r4, r14, r15);
        AndroidNetworking.post(r18).addBodyParameter(r13).setTag(r18).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new EmailBindActivity$changeEmail$$inlined$post$default$4(r19));
    }

    private static final TextInputEditText email_delegate$lambda$0(EmailBindActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.email);
    }

    private final Button getBottomBtn() {
        return (Button) getValue();
    }

    private final Button getBottomErrorLogin() {
        return (Button) getValue();
    }

    private final Button getBtGetVerificationCode() {
        return (Button) getValue();
    }

    private final TextInputEditText getEmail() {
        return (TextInputEditText) getValue();
    }

    private final LinearLayout getLlCheckCode() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlInputEmail() {
        return (LinearLayout) getValue();
    }

    private final AppUser getMAppUser() {
        return (AppUser) getValue();
    }

    private final LinearLayout getRv() {
        return (LinearLayout) getValue();
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

    public static /* synthetic */ void iIiiO(EmailBindActivity r0) {
        initView$lambda$0(r0);
    }

    private static final void initView$lambda$0(EmailBindActivity r2) {
        TextInputEditText r0 = r2.getEmail();
        Intrinsics.O10IXXX0X(r0, "<get-email>(...)");
        r2.getVerificationCode(r0);
    }

    private static final boolean initView$lambda$1(EmailBindActivity r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        TextInputEditText r4 = r0.getEmail();
        Intrinsics.O10IXXX0X(r4, "<get-email>(...)");
        r0.getVerificationCode(r4);
        return false;
    L7:
        return false;
    }

    private static final boolean initView$lambda$2(EmailBindActivity r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        r0.changeEmail(String.valueOf(r0.getVerificationCode().getText()));
        return false;
    L7:
        return false;
    }

    private static final LinearLayout llCheckCode_delegate$lambda$0(EmailBindActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.llCheckCode);
    }

    private static final LinearLayout llInputEmail_delegate$lambda$0(EmailBindActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.llInputEmail);
    }

    private static final AppUser mAppUser_delegate$lambda$0() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L7;
        r1 = r2;
    L7:
        return (AppUser) r1;
    }

    private static final LinearLayout rv_delegate$lambda$0(EmailBindActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rv);
    }

    private static final PFMedium tvCodeError_delegate$lambda$0(EmailBindActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tvCodeError);
    }

    private static final PFMedium tvDescription_delegate$lambda$0(EmailBindActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tvDescription);
    }

    private static final PFMedium tvTitle_delegate$lambda$0(EmailBindActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tvTitle);
    }

    private static final TextInputEditText verificationCode_delegate$lambda$0(EmailBindActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.verificationCode);
    }

    public final void backClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        int r5 = getMArg1();
        if (r5 == 2) goto L15;
        if (r5 == 3) goto L9;
        a01.OXO1.IiI10X().put(b01.X1IX, true);
        finish();
        return;
    L9:
        if (this.nowPage <= 0) goto L12;
        onHandleBackPressed();
        return;
    L12:
        a01.OXO1.IiI10X().put(b01.X1IX, true);
        startActivity(new Intent(this, MainActivity.class));
        finish();
        return;
    L15:
        if (this.nowPage <= 0) goto L18;
        onHandleBackPressed();
        return;
    L18:
        ToastUtils.showShort(R.string.input_email);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getBottomErrorLogin().setVisibility(8);
        if (getMAppUser().getEmail().length() != 0) goto L6;
        this.verificationType = 2;
        this.isExistsEmail = false;
        getTvTitle().setText(R.string.bind_email);
        getTvDescription().setText(R.string.bind_email_tips);
    L9:
        getBottomBtn().setEnabled(false);
        getEmail().addTextChangedListener(new XIi00iiXO(this));
        getVerificationCode().addTextChangedListener(new iO(this));
        getEmail().setOnEditorActionListener(new O0X000O0i(this));
        getVerificationCode().setOnEditorActionListener(new Ii11OOIO(this));
        return;
    L6:
        if (getMArg1() != 1) goto L8;
        this.nowPage++;
        this.verificationType = 2;
        this.isExistsEmail = false;
        getTvTitle().setText(R.string.update_email);
        getTvDescription().setText(R.string.safety_verification_tips);
        getLlInputEmail().setVisibility(0);
        getBottomBtn().setVisibility(0);
        getLlCheckCode().setVisibility(8);
        goto L9
    L8:
        this.verificationType = 1;
        this.nowPage = -1;
        this.isExistsEmail = true;
        getTvTitle().setText(R.string.safety_verification);
        getTvDescription().setText(R.string.safety_verification_tips);
        getEmail().setText(getMAppUser().getEmail());
        getBottomBtn().setVisibility(8);
        ToastUtils.showShort(getString(R.string.verifying_information), new Object[0]);
        new Handler(Looper.getMainLooper()).postDelayed(new O11X(this), 2000);
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_email_bind;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        int r0 = this.nowPage;
        if (r0 <= 0) goto L6;
        this.nowPage = r0 - 1;
        getLlInputEmail().setVisibility(0);
        getBottomBtn().setVisibility(0);
        getLlCheckCode().setVisibility(8);
        return;
    L6:
        LinearLayout r1 = getRv();
        Intrinsics.O10IXXX0X(r1, "<get-rv>(...)");
        backClick(r1);
    }

    public final void onLogOut(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, ServerSelectActivity.class));
        finish();
    }

    public final void getVerificationCode(@aa1 View r10) {
        Intrinsics.X0O(r10, "view");
        if (RegexUtils.isEmail(String.valueOf(getEmail().getText())) == true) goto L6;
        ToastUtils.showShort(R.string.email_format_error);
        return;
    L6:
        int r11 = this.nowPage;
        if (r11 != 0) goto L9;
        this.nowPage = r11 + 1;
    L9:
        getLlInputEmail().setVisibility(8);
        getLlCheckCode().setVisibility(0);
        getTvCodeError().setVisibility(8);
        if (getMArg1() != 3) goto L12;
    L13:
        getBottomErrorLogin().setVisibility(0);
    L14:
        RequestCommonMethod r2 = RequestCommonMethod.INSTANCE;
        LinearLayout r4 = getRv();
        String r5 = String.valueOf(getEmail().getText());
        Button r6 = getBtGetVerificationCode();
        Intrinsics.O10IXXX0X(r6, "<get-btGetVerificationCode>(...)");
        r2.requestVerificationCode(this, r4, r5, r6, this.verificationType, new C34671(this));
        return;
    L12:
        if (getMArg1() != 2) goto L14;
        goto L13
    }
}
