package com.sma.smartv3.ui.device.guide;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.av1;
import com.android.mltcode.paycertificationapi.bv1;
import com.android.mltcode.paycertificationapi.cv1;
import com.android.mltcode.paycertificationapi.dv1;
import com.android.mltcode.paycertificationapi.ev1;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
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
import com.sma.smartv3.network.BindPhoneHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "杭研项目遗弃")
@SourceDebugExtension({"SMAP\nPhoneBindGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,261:1\n19#2:262\n15#2:263\n176#3,11:264\n196#3:283\n252#4,7:275\n270#4:282\n*S KotlinDebug\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment\n*L\n56#1:262\n56#1:263\n216#1:264,11\n216#1:283\n216#1:275,7\n216#1:282\n*E\n"})
public final class PhoneBindGuideFragment extends BaseFragment implements SlideSelectionListener {

    @aa1
    private final String TAG;
    private Button btnDone;
    private LinearLayout llContent;

    @aa1
    private AppUser mAppUser;
    private TextInputEditText phone;
    private ScrollView rootScrollView;
    private TextView tvGetVerificationCode;
    private TextInputEditText verificationCode;
    private View viewKeyboardHeight;

    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ PhoneBindGuideFragment IO;

        public OXO1(PhoneBindGuideFragment r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r1) {
            PhoneBindGuideFragment.access$checkEnableButton(this.IO);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ PhoneBindGuideFragment IO;

        public XIi00iiXO(PhoneBindGuideFragment r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r1) {
            PhoneBindGuideFragment.access$checkEnableButton(this.IO);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1", f = "PhoneBindGuideFragment.kt", i = {}, l = {185, 193, 193, 193}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<String> $account;
        final /* synthetic */ String $code;
        final /* synthetic */ uq $loadingPopup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ PhoneBindGuideFragment this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1$1, reason: invalid class name and collision with other inner class name */
        @DebugMetadata(c = "com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1$1", f = "PhoneBindGuideFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class C05691 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ uq $loadingPopup;
            int label;

            public C05691(uq r1, Continuation<? super C05691> r2) {
                this.$loadingPopup = r1;
                super(2, r2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
                return new C05691(this.$loadingPopup, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((C05691) create(r1, r2)).invokeSuspend(Unit.OXO1);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object r2) {
                pb.I0iXXO();
                if (this.label != 0) goto L11;
                ResultKt.X1ii(r2);
                uq r3 = this.$loadingPopup;
                if (r3 == null) goto L8;
                r3.dismiss();
                return Unit.OXO1;
            L8:
                return null;
            L11:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
                return invoke2(r1, r2);
            }
        }

        public AnonymousClass1(PhoneBindGuideFragment r1, Ref.ObjectRef<String> r2, String r3, uq r4, Continuation<? super AnonymousClass1> r5) {
            this.this$0 = r1;
            this.$account = r2;
            this.$code = r3;
            this.$loadingPopup = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new AnonymousClass1(this.this$0, this.$account, this.$code, this.$loadingPopup, r8);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L18;
            if (r1 == 1) goto L14;
            if (r1 == 2) goto L12;
            if (r1 == 3) goto L11;
            if (r1 != 4) goto L9;
            Throwable r2 = (Throwable) this.L$0;
            ResultKt.X1ii(r9);
            throw r2;
        L9:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L11:
            ResultKt.X1ii(r9);
        L33:
            if (PhoneBindGuideFragment.access$getMAppUser$p(this.this$0).getPasswordStatus() == false) goto L35;
            ToastUtils.showShort(R.string.bind_success);
            FragmentActivity r10 = this.this$0.getActivity();
            if (r10 == null) goto L43;
            r10.setResult(-1);
        L43:
            FragmentActivity r11 = this.this$0.getActivity();
            if (r11 == null) goto L47;
            r11.finish();
        L47:
            return Unit.OXO1;
        L35:
            if ((this.this$0.getActivity() instanceof AppGuideActivity) == false) goto L38;
            FragmentActivity r12 = this.this$0.getActivity();
            Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.AppGuideActivity");
            ((AppGuideActivity) r12).getNext().performClick();
            goto L47
        L38:
            if ((this.this$0.getActivity() instanceof HykyGuideActivity) == false) goto L47;
            FragmentActivity r13 = this.this$0.getActivity();
            Intrinsics.X1ii(r13, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.HykyGuideActivity");
            ((HykyGuideActivity) r13).getNext().performClick();
            goto L47
        L12:
            Unit r3 = (Unit) this.L$0;
            ResultKt.X1ii(r9);
            return r3;
        L14:
            ResultKt.X1ii(r9);     // Catch: Throwable -> L16
        L22:
            boolean r14 = ((Boolean) r9).booleanValue();     // Catch: Throwable -> L16
            if (r14 == true) goto L29;
            Unit r4 = Unit.OXO1;     // Catch: Throwable -> L16
            g10 r5 = IXOX0Xiii.O00();
            C05691 r6 = new C05691(this.$loadingPopup, null);
            this.L$0 = r4;
            this.Z$0 = r14;
            this.label = 2;
            if (I100X1.I0IIOi(r5, r6, this) == r0) goto L50;
            return r4;
        L50:
            return r0;
        L29:
            g10 r15 = IXOX0Xiii.O00();
            C05691 r7 = new C05691(this.$loadingPopup, null);
            this.label = 3;
            if (I100X1.I0IIOi(r15, r7, this) != r0) goto L33;
        L18:
            ResultKt.X1ii(r9);
            PhoneBindGuideFragment r16 = this.this$0;     // Catch: Throwable -> L16
            String r8 = this.$account.element;     // Catch: Throwable -> L16
            String r17 = this.$code;     // Catch: Throwable -> L16
            this.label = 1;     // Catch: Throwable -> L16
            r9 = PhoneBindGuideFragment.access$bindPhone(r16, r8, r17, this);     // Catch: Throwable -> L16
            if (r9 != r0) goto L22;
        L16:
            th = move-exception;
            g10 r18 = IXOX0Xiii.O00();
            C05691 r19 = new C05691(this.$loadingPopup, null);
            this.L$0 = th;
            this.label = 4;
            if (I100X1.I0IIOi(r18, r19, this) == r0) goto L50;
            throw th;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public PhoneBindGuideFragment() {
        this.TAG = "PhoneBindGuideFragment";
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ void IiI10X(PhoneBindGuideFragment r0, View r1) {
        initView$lambda$5(r0, r1);
    }

    public static /* synthetic */ void O00(PhoneBindGuideFragment r0, View r1) {
        initView$lambda$4$0(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(PhoneBindGuideFragment r0) {
        initView$lambda$0$0$0(r0);
    }

    public static /* synthetic */ void XO0O10(PhoneBindGuideFragment r0, int r1) {
        initView$lambda$1$0(r0, r1);
    }

    public static final /* synthetic */ Object access$bindPhone(PhoneBindGuideFragment r0, String r1, String r2, Continuation r3) {
        return r0.bindPhone(r1, r2, r3);
    }

    public static final /* synthetic */ void access$checkEnableButton(PhoneBindGuideFragment r0) {
        r0.checkEnableButton();
    }

    public static final /* synthetic */ AppUser access$getMAppUser$p(PhoneBindGuideFragment r0) {
        return r0.mAppUser;
    }

    private final Object bindPhone(final String r8, String r9, Continuation<? super Boolean> r10) {
        final SafeContinuation r0 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(r10));
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap r11 = kotlin.collections.OXO1.XXX11i(new Pair[]{TuplesKt.OXO1("identity", this.mAppUser.getIdentity()), TuplesKt.OXO1("phone", r8), TuplesKt.OXO1("code", r9)});
        final O1XIiIO<String> r2 = new PhoneBindGuideFragment$bindPhone$2$1(this, r8, r0);
        final Activity r12 = null;
        final uq r3 = r1.loadPopup(null, null);
        String r4 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BindPhoneHYKY.URL);
        r1.printParam(r4 + BindPhoneHYKY.URL, r11);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + BindPhoneHYKY.URL;
        final O1XIiIO<Response<String>> r7 = new PhoneBindGuideFragment$bindPhone$lambda$0$$inlined$post$default$1(r12, r2, r3);
        AndroidNetworking.post(r6).addBodyParameter(r11).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new PhoneBindGuideFragment$bindPhone$lambda$0$$inlined$post$default$2(r7));
        Object r13 = r0.XIi00iiXO();
        if (r13 != pb.I0iXXO()) goto L5;
        DebugProbesKt.iO(r10);
    L5:
        return r13;
    }

    private final void checkEnableButton() {
        Button r0 = this.btnDone;
        TextInputEditText r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("btnDone");
        r0 = null;
    L5:
        TextInputEditText r2 = this.phone;
        if (r2 != null) goto L9;
        Intrinsics.XXO("phone");
        r2 = null;
    L9:
        if (UtilsKt.IXOIIIO(String.valueOf(r2.getText())) == false) goto L17;
        TextInputEditText r3 = this.verificationCode;
        if (r3 != null) goto L13;
        Intrinsics.XXO("verificationCode");
    L15:
        if (StringsKt__StringsKt.iX1X1(String.valueOf(r1.getText())).toString().length() <= 0) goto L17;
        boolean r4 = true;
    L18:
        r0.setEnabled(r4);
        return;
    L13:
        r1 = r3;
    L17:
        r4 = false;
        goto L18
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    private final void done() {
        Ref.ObjectRef r2 = new Ref.ObjectRef();
        TextInputEditText r0 = this.phone;
        ScrollView r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("phone");
        r0 = null;
    L5:
        r2.element = StringsKt__StringsKt.iX1X1(String.valueOf(r0.getText())).toString();
        TextInputEditText r3 = this.verificationCode;
        if (r3 != null) goto L8;
        Intrinsics.XXO("verificationCode");
        r3 = null;
    L8:
        String r4 = StringsKt__StringsKt.iX1X1(String.valueOf(r3.getText())).toString();
        if (UtilsKt.IXOIIIO((String) r2.element) == true) goto L12;
        ToastUtils.showLong(R.string.input_phone_format_error);
        return;
    L12:
        TextInputEditText r5 = this.verificationCode;
        if (r5 != null) goto L16;
        Intrinsics.XXO("verificationCode");
        r5 = null;
    L16:
        if (StringsKt__StringsKt.iX1X1(String.valueOf(r5.getText())).toString().length() != 0) goto L19;
        ToastUtils.showLong(R.string.enter_confirmation_code);
        return;
    L19:
        NetWorkUtils r6 = NetWorkUtils.INSTANCE;
        FragmentActivity r7 = getActivity();
        ScrollView r8 = this.rootScrollView;
        if (r8 != null) goto L22;
        Intrinsics.XXO("rootScrollView");
    L23:
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(this, r2, r4, r6.loadPopup(r7, r1), null), 2, null);
        return;
    L22:
        r1 = r8;
        goto L23
    }

    private final void getVerificationCode() {
        TextInputEditText r0 = this.phone;
        if (r0 != null) goto L6;
        Intrinsics.XXO("phone");
        r0 = null;
    L6:
        if (UtilsKt.IXOIIIO(String.valueOf(r0.getText())) == true) goto L9;
        ToastUtils.showShort(R.string.input_phone_format_error);
        return;
    L9:
        RequestCommonMethod r1 = RequestCommonMethod.INSTANCE;
        FragmentActivity r2 = getActivity();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.app.Activity");
        ScrollView r4 = this.rootScrollView;
        if (r4 != null) goto L12;
        Intrinsics.XXO("rootScrollView");
        r4 = null;
    L12:
        TextInputEditText r5 = this.phone;
        if (r5 != null) goto L15;
        Intrinsics.XXO("phone");
        r5 = null;
    L15:
        String r3 = String.valueOf(r5.getText());
        TextView r6 = this.tvGetVerificationCode;
        if (r6 != null) goto L18;
        Intrinsics.XXO("tvGetVerificationCode");
        r6 = null;
    L18:
        RequestCommonMethod.requestVerificationCode$default(r1, r2, r4, r3, r6, 2, null, 32, null);
    }

    public static /* synthetic */ void iO(PhoneBindGuideFragment r0, int r1) {
        initView$lambda$1$0$1(r0, r1);
    }

    private static final void initView$lambda$0$0$0(PhoneBindGuideFragment r2) {
        LinearLayout r0 = r2.llContent;
        if (r0 != null) goto L5;
        Intrinsics.XXO("llContent");
        r0 = null;
    L5:
        ViewGroup.LayoutParams r1 = r0.getLayoutParams();
        r1.height = r2.getMView().getHeight();
        r0.requestLayout();
    }

    private static final void initView$lambda$1$0(final PhoneBindGuideFragment r3, final int r4) {
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
        r1.post(new av1(r3, r4));
        return;
    L8:
        r1 = r2;
        goto L9
    }

    private static final void initView$lambda$1$0$1(PhoneBindGuideFragment r1, int r2) {
        ScrollView r3 = r1.rootScrollView;
        if (r3 != null) goto L5;
        Intrinsics.XXO("rootScrollView");
        r3 = null;
    L5:
        r3.smoothScrollTo(0, r2 / 2);
    }

    private static final void initView$lambda$4$0(PhoneBindGuideFragment r0, View r1) {
        FragmentActivity r2 = r0.getActivity();
        if (r2 == null) goto L5;
        KeyboardUtils.hideSoftInput(r2);
    L5:
        r0.done();
    }

    private static final void initView$lambda$5(PhoneBindGuideFragment r0, View r1) {
        r0.getVerificationCode();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        View r0 = getMView();
        View r1 = r0.findViewById(R.id.btnDone);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        this.btnDone = (Button) r1;
        View r2 = r0.findViewById(R.id.view_keyboard_height);
        Intrinsics.O10IXXX0X(r2, "findViewById(...)");
        this.viewKeyboardHeight = r2;
        View r3 = r0.findViewById(R.id.llContent);
        Intrinsics.O10IXXX0X(r3, "findViewById(...)");
        this.llContent = (LinearLayout) r3;
        View r4 = r0.findViewById(R.id.tvGetVerificationCode);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.tvGetVerificationCode = (TextView) r4;
        View r5 = r0.findViewById(R.id.verification_code);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        this.verificationCode = (TextInputEditText) r5;
        View r6 = r0.findViewById(R.id.phone);
        Intrinsics.O10IXXX0X(r6, "findViewById(...)");
        this.phone = (TextInputEditText) r6;
        View r7 = r0.findViewById(R.id.root_view);
        ScrollView r8 = (ScrollView) r7;
        r8.post(new bv1(this));
        Intrinsics.O10IXXX0X(r7, "apply(...)");
        this.rootScrollView = r8;
        FragmentActivity r9 = getActivity();
        if (r9 == null) goto L5;
        KeyboardUtils.registerSoftInputChangedListener(r9.getWindow(), new cv1(this));
    L5:
        TextInputEditText r10 = this.verificationCode;
        TextView r11 = null;
        if (r10 != null) goto L8;
        Intrinsics.XXO("verificationCode");
        r10 = null;
    L8:
        r10.addTextChangedListener(new OXO1(this));
        TextInputEditText r12 = this.phone;
        if (r12 != null) goto L11;
        Intrinsics.XXO("phone");
        r12 = null;
    L11:
        r12.addTextChangedListener(new XIi00iiXO(this));
        Button r13 = this.btnDone;
        if (r13 != null) goto L15;
        Intrinsics.XXO("btnDone");
        r13 = null;
    L15:
        if (this.mAppUser.getPasswordStatus() == true) goto L17;
        r13.setText(getString(R.string.next));
    L17:
        r13.setOnClickListener(new dv1(this));
        TextView r14 = this.tvGetVerificationCode;
        if (r14 != null) goto L20;
        Intrinsics.XXO("tvGetVerificationCode");
    L21:
        r11.setOnClickListener(new ev1(this));
        return;
    L20:
        r11 = r14;
        goto L21
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_app_guide_phone_bind;
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
