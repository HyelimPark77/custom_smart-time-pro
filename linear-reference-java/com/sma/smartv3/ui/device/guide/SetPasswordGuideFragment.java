package com.sma.smartv3.ui.device.guide;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.autofill.HintConstants;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.f54;
import com.android.mltcode.paycertificationapi.g54;
import com.android.mltcode.paycertificationapi.h54;
import com.android.mltcode.paycertificationapi.i54;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.github.appintro.SlideSelectionListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.SetPasswordHYKY;
import com.sma.smartv3.pro.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.OXO1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSetPasswordGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,137:1\n19#2:138\n15#2:139\n183#3,4:140\n196#3:152\n252#4,7:144\n270#4:151\n*S KotlinDebug\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment\n*L\n31#1:138\n31#1:139\n92#1:140,4\n92#1:152\n92#1:144,7\n92#1:151\n*E\n"})
public final class SetPasswordGuideFragment extends BaseFragment implements SlideSelectionListener {
    private Button btnConfirm;

    @aa1
    private AppUser mAppUser;
    private TextInputEditText newPassword;
    private TextInputEditText newPasswordAgain;
    private ScrollView rootScrollView;
    private View viewKeyboardHeight;

    public SetPasswordGuideFragment() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        this.mAppUser = (AppUser) r1;
    }

    public static /* synthetic */ void O00(SetPasswordGuideFragment r0, int r1) {
        initView$lambda$2$0$1(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(SetPasswordGuideFragment r0, View r1) {
        initView$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ void XO0O10(View r0, SetPasswordGuideFragment r1) {
        initView$lambda$0$0(r0, r1);
    }

    public static final /* synthetic */ AppUser access$getMAppUser$p(SetPasswordGuideFragment r0) {
        return r0.mAppUser;
    }

    public static /* synthetic */ void iO(SetPasswordGuideFragment r0, int r1) {
        initView$lambda$2$0(r0, r1);
    }

    private static final void initView$lambda$0$0(View r1, SetPasswordGuideFragment r2) {
        ViewGroup.LayoutParams r0 = r1.getLayoutParams();
        r0.height = r2.getMView().getHeight();
        r1.requestLayout();
    }

    private static final void initView$lambda$1$0(SetPasswordGuideFragment r0, View r1) {
        r0.confirm();
    }

    private static final void initView$lambda$2$0(final SetPasswordGuideFragment r3, final int r4) {
        View r0 = r3.viewKeyboardHeight;
        ScrollView r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("viewKeyboardHeight");
        r0 = null;
    L5:
        r0.getLayoutParams().height = r4;
        r0.requestLayout();
        ScrollView r2 = r3.rootScrollView;
        if (r2 != null) goto L8;
        Intrinsics.XXO("rootScrollView");
    L9:
        r1.post(new i54(r3, r4));
        return;
    L8:
        r1 = r2;
        goto L9
    }

    private static final void initView$lambda$2$0$1(SetPasswordGuideFragment r1, int r2) {
        ScrollView r3 = r1.rootScrollView;
        if (r3 != null) goto L5;
        Intrinsics.XXO("rootScrollView");
        r3 = null;
    L5:
        r3.smoothScrollTo(0, r2 / 2);
    }

    public final void confirm() {
        TextInputEditText r0 = this.newPassword;
        ScrollView r2 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
        r0 = null;
    L6:
        if (String.valueOf(r0.getText()).length() != 0) goto L9;
        ToastUtils.showLong(R.string.input_password);
        return;
    L9:
        TextInputEditText r1 = this.newPasswordAgain;
        if (r1 != null) goto L13;
        Intrinsics.XXO("newPasswordAgain");
        r1 = null;
    L13:
        if (String.valueOf(r1.getText()).length() != 0) goto L16;
        ToastUtils.showLong(R.string.input_password_again);
        return;
    L16:
        TextInputEditText r3 = this.newPassword;
        if (r3 != null) goto L19;
        Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
        r3 = null;
    L19:
        Editable r4 = r3.getText();
        Intrinsics.XXI(r4);
        if (r4.length() < 6) goto L46;
        TextInputEditText r5 = this.newPassword;
        if (r5 != null) goto L24;
        Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
        r5 = null;
    L24:
        Editable r6 = r5.getText();
        Intrinsics.XXI(r6);
        if (r6.length() > 32) goto L46;
        TextInputEditText r7 = this.newPassword;
        if (r7 != null) goto L30;
        Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
        r7 = null;
    L30:
        String r8 = String.valueOf(r7.getText());
        TextInputEditText r9 = this.newPasswordAgain;
        if (r9 != null) goto L34;
        Intrinsics.XXO("newPasswordAgain");
        r9 = null;
    L34:
        if (Intrinsics.XOO0ii0(r8, String.valueOf(r9.getText())) == true) goto L37;
        ToastUtils.showLong(R.string.inconsistent_passwords);
        return;
    L37:
        NetWorkUtils r10 = NetWorkUtils.INSTANCE;
        Pair r11 = TuplesKt.OXO1("identity", this.mAppUser.getIdentity());
        Pair r12 = TuplesKt.OXO1("projectId", RequestBodyKt.PROJECT_ID);
        TextInputEditText r13 = this.newPassword;
        if (r13 != null) goto L40;
        Intrinsics.XXO(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
        r13 = null;
    L40:
        HashMap r14 = OXO1.XXX11i(new Pair[]{r11, r12, TuplesKt.OXO1("password", String.valueOf(r13.getText()))});
        final O1XIiIO<String> r15 = new AnonymousClass1(this);
        final FragmentActivity r16 = getActivity();
        ScrollView r17 = this.rootScrollView;
        if (r17 != null) goto L43;
        Intrinsics.XXO("rootScrollView");
    L44:
        final uq r18 = r10.loadPopup(r16, r2);
        String r19 = r10.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SetPasswordHYKY.URL);
        r10.printParam(r19 + SetPasswordHYKY.URL, r14);
        NetWork r20 = NetWork.OXO1;
        String r21 = r19 + SetPasswordHYKY.URL;
        final O1XIiIO<Response<String>> r22 = new SetPasswordGuideFragment$confirm$$inlined$post$1(r16, r15, r18);
        AndroidNetworking.post(r21).addBodyParameter(r14).setTag(r21).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new SetPasswordGuideFragment$confirm$$inlined$post$2(r22));
        return;
    L43:
        r2 = r17;
    L46:
        ToastUtils.showLong(R.string.length_passwords);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        View r0 = getMView();
        View r1 = r0.findViewById(R.id.view_keyboard_height);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        this.viewKeyboardHeight = r1;
        View r2 = r0.findViewById(R.id.btn_confirm);
        Intrinsics.O10IXXX0X(r2, "findViewById(...)");
        this.btnConfirm = (Button) r2;
        View r3 = r0.findViewById(R.id.newPassword);
        Intrinsics.O10IXXX0X(r3, "findViewById(...)");
        this.newPassword = (TextInputEditText) r3;
        View r4 = r0.findViewById(R.id.newPasswordAgain);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.newPasswordAgain = (TextInputEditText) r4;
        View r5 = r0.findViewById(R.id.root_view);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        this.rootScrollView = (ScrollView) r5;
        final View r6 = r0.findViewById(R.id.llSetNewPassword);
        r0.post(new f54(r6, this));
        Button r7 = this.btnConfirm;
        if (r7 != null) goto L5;
        Intrinsics.XXO("btnConfirm");
        r7 = null;
    L5:
        r7.setOnClickListener(new g54(this));
        FragmentActivity r8 = getActivity();
        if (r8 == null) goto L9;
        KeyboardUtils.registerSoftInputChangedListener(r8.getWindow(), new h54(this));
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_app_guide_set_password;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentActivity r0 = getActivity();
        if (r0 == null) goto L6;
        KeyboardUtils.unregisterSoftInputChangedListener(r0.getWindow());
        return;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }
}
