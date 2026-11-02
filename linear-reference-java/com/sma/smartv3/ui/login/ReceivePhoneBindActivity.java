package com.sma.smartv3.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.mh2;
import com.android.mltcode.paycertificationapi.nh2;
import com.android.mltcode.paycertificationapi.oh2;
import com.android.mltcode.paycertificationapi.ph2;
import com.android.mltcode.paycertificationapi.qh2;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
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
import com.sma.smartv3.network.SetReceivePhone;
import com.sma.smartv3.pro.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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
    private final Lazy phone$delegate;

    @aa1
    private final Lazy privacyAppCheck$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvCode$delegate;

    public ReceivePhoneBindActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new mh2(this));
        this.tvCode$delegate = LazyKt__LazyJVMKt.iO(new nh2(this));
        this.phone$delegate = LazyKt__LazyJVMKt.iO(new oh2(this));
        this.privacyAppCheck$delegate = LazyKt__LazyJVMKt.iO(new ph2(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ TextInputEditText I0iXXO(ReceivePhoneBindActivity r0) {
        return phone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(ReceivePhoneBindActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(ReceivePhoneBindActivity r0) {
        return tvCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(ReceivePhoneBindActivity r0, CountryCodeSelectorFragment r1, Country r2) {
        onCountryCode$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ CheckBox XXI(ReceivePhoneBindActivity r0) {
        return privacyAppCheck_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ AppUser access$getMAppUser$p(ReceivePhoneBindActivity r0) {
        return r0.mAppUser;
    }

    private final TextInputEditText getPhone() {
        return (TextInputEditText) getValue();
    }

    private final CheckBox getPrivacyAppCheck() {
        return (CheckBox) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final TextView getTvCode() {
        return (TextView) getValue();
    }

    private static final void onCountryCode$lambda$0$0(ReceivePhoneBindActivity r2, CountryCodeSelectorFragment r3, Country r4) {
        String r0 = r4.iO();
        Intrinsics.O10IXXX0X(r0, "getCode(...)");
        if (r0.length() <= 0) goto L5;
        r2.getTvCode().setText(qu0.O00 + r4.iO());
    L6:
        r3.dismiss();
        return;
    L5:
        r2.getTvCode().setText("");
        goto L6
    }

    private static final TextInputEditText phone_delegate$lambda$0(ReceivePhoneBindActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.phone);
    }

    private static final CheckBox privacyAppCheck_delegate$lambda$0(ReceivePhoneBindActivity r1) {
        return (CheckBox) r1.findViewById(R.id.privacyAppCheck);
    }

    private static final View rootView_delegate$lambda$0(ReceivePhoneBindActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final TextView tvCode_delegate$lambda$0(ReceivePhoneBindActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_code);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.phone_number);
        String r1 = this.mAppUser.getReceivePhone();
        if (TextUtils.isEmpty(r1) == true) goto L6;
        List r0 = StringsKt__StringsKt.i1I(r1, new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);
        getTvCode().setText((CharSequence) r0.get(0));
        getPhone().setText((CharSequence) r0.get(1));
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_receive_phone_bind;
    }

    public final void onBottomClick(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (getPrivacyAppCheck().isChecked() == true) goto L6;
        ToastUtils.showLong(R.string.privacy_tick_tip);
        return;
    L6:
        final String r8 = String.valueOf(getPhone().getText());
        if (r8.length() != 0) goto L10;
        ToastUtils.showLong(R.string.input_phone_num_tip);
        return;
    L10:
        String r0 = getTvCode().getText().toString();
        if (r0.length() == 0) goto L14;
        r8 = r0 + HelpFormatter.DEFAULT_OPT_PREFIX + r8;
    L14:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getSetReceivePhoneBody(this.mAppUser.getIdentity(), r8);
        final O1XIiIO<String> r3 = new AnonymousClass1(this, r8);
        final uq r9 = r1.loadPopup(this, getRootView());
        String r4 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SetReceivePhone.URL);
        r1.printParam(r4 + SetReceivePhone.URL, r2);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + SetReceivePhone.URL;
        final O1XIiIO<Response<String>> r10 = new ReceivePhoneBindActivity$onBottomClick$$inlined$post$1(this, r3, r9);
        AndroidNetworking.post(r6).addBodyParameter(r2).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new ReceivePhoneBindActivity$onBottomClick$$inlined$post$2(r10));
    }

    public final void onCountryCode(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        Intent r4 = new Intent();
        r4.putExtra(PhoneInputView.Ii1iii0, 1);
        r4.putExtra(PhoneInputView.iXiiiO, ContextCompat.getColor(getMContext(), R.color.colorPrimary));
        final CountryCodeSelectorFragment r5 = CountryCodeSelectorFragment.newInstance(r4);
        r5.show(getSupportFragmentManager(), "CountryCodeSelector");
        r5.setOnCountrySelectListener(new qh2(this, r5));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
