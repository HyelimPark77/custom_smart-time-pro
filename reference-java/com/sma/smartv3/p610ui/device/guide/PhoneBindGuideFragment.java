package com.sma.smartv3.p610ui.device.guide;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
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
import com.sma.smartv3.p610ui.device.guide.PhoneBindGuideFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
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
    private final String TAG = "PhoneBindGuideFragment";
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
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            PhoneBindGuideFragment.this.checkEnableButton();
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
            PhoneBindGuideFragment.this.checkEnableButton();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1", m39466f = "PhoneBindGuideFragment.kt", m39467i = {}, m39468l = {185, 193, 193, 193}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C188171 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<String> $account;
        final /* synthetic */ String $code;
        final /* synthetic */ C3006uq $loadingPopup;
        Object L$0;
        boolean Z$0;
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1$1 */
        @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1$1", m39466f = "PhoneBindGuideFragment.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ C3006uq $loadingPopup;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C3006uq c3006uq, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$loadingPopup = c3006uq;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$loadingPopup, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C2798pb.I0iXXO();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
                C3006uq c3006uq = this.$loadingPopup;
                if (c3006uq == null) {
                    return null;
                }
                c3006uq.dismiss();
                return Unit.OXO1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188171(Ref.ObjectRef<String> objectRef, String str, C3006uq c3006uq, Continuation<? super C188171> continuation) {
            super(2, continuation);
            this.$account = objectRef;
            this.$code = str;
            this.$loadingPopup = c3006uq;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PhoneBindGuideFragment.this.new C188171(this.$account, this.$code, this.$loadingPopup, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C188171) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        
            if (com.android.mltcode.paycertificationapi.I100X1.I0IIOi(r9, r1, r8) == r0) goto L50;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.X1ii(obj);
                    PhoneBindGuideFragment phoneBindGuideFragment = PhoneBindGuideFragment.this;
                    String str = this.$account.element;
                    String str2 = this.$code;
                    this.label = 1;
                    obj = phoneBindGuideFragment.bindPhone(str, str2, this);
                    if (obj == objI0iXXO) {
                    }
                    return objI0iXXO;
                }
                if (i == 1) {
                    ResultKt.X1ii(obj);
                } else {
                    if (i == 2) {
                        Unit unit = (Unit) this.L$0;
                        ResultKt.X1ii(obj);
                        return unit;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.L$0;
                        ResultKt.X1ii(obj);
                        throw th;
                    }
                    ResultKt.X1ii(obj);
                }
                if (PhoneBindGuideFragment.this.mAppUser.getPasswordStatus()) {
                    ToastUtils.showShort(R.string.bind_success);
                    FragmentActivity activity = PhoneBindGuideFragment.this.getActivity();
                    if (activity != null) {
                        activity.setResult(-1);
                    }
                    FragmentActivity activity2 = PhoneBindGuideFragment.this.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                } else if (PhoneBindGuideFragment.this.getActivity() instanceof AppGuideActivity) {
                    FragmentActivity activity3 = PhoneBindGuideFragment.this.getActivity();
                    Intrinsics.X1ii(activity3, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.AppGuideActivity");
                    ((AppGuideActivity) activity3).getNext().performClick();
                } else if (PhoneBindGuideFragment.this.getActivity() instanceof HykyGuideActivity) {
                    FragmentActivity activity4 = PhoneBindGuideFragment.this.getActivity();
                    Intrinsics.X1ii(activity4, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.HykyGuideActivity");
                    ((HykyGuideActivity) activity4).getNext().performClick();
                }
                return Unit.OXO1;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    g10 g10VarO00 = IXOX0Xiii.O00();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$loadingPopup, null);
                    this.label = 3;
                } else {
                    Unit unit2 = Unit.OXO1;
                    g10 g10VarO01 = IXOX0Xiii.O00();
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.$loadingPopup, null);
                    this.L$0 = unit2;
                    this.Z$0 = zBooleanValue;
                    this.label = 2;
                    if (I100X1.I0IIOi(g10VarO01, anonymousClass2, this) != objI0iXXO) {
                        return unit2;
                    }
                }
            } catch (Throwable th2) {
                g10 g10VarO02 = IXOX0Xiii.O00();
                AnonymousClass1 anonymousClass3 = new AnonymousClass1(this.$loadingPopup, null);
                this.L$0 = th2;
                this.label = 4;
                if (I100X1.I0IIOi(g10VarO02, anonymousClass3, this) != objI0iXXO) {
                    throw th2;
                }
            }
            return objI0iXXO;
        }
    }

    public PhoneBindGuideFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bindPhone(final String str, String str2, Continuation<? super Boolean> continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation));
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap mapXXX11i = kotlin.collections.OXO1.XXX11i(TuplesKt.OXO1("identity", this.mAppUser.getIdentity()), TuplesKt.OXO1("phone", str), TuplesKt.OXO1("code", str2));
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$bindPhone$2$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str3) {
                LogUtils.m11128d("handleResponse -> " + str3);
                this.OXO1.mAppUser.setPhone(str);
                a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(this.OXO1.mAppUser));
                I01XX0.XIi00iiXO(I01XX0.Ii0i, null, 2, null);
                Continuation<Boolean> continuation2 = safeContinuation;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m48333constructorimpl(Boolean.TRUE));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("handleError -> " + error);
                ToastUtils.showLong(R.string.fail);
                Continuation<Boolean> continuation2 = safeContinuation;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m48333constructorimpl(Boolean.FALSE));
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BindPhoneHYKY.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BindPhoneHYKY.URL, mapXXX11i);
        NetWork netWork = NetWork.OXO1;
        String str3 = strConvertBaseUrl + BindPhoneHYKY.URL;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$bindPhone$lambda$0$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
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
        AndroidNetworking.post(str3).addBodyParameter((Map<String, String>) mapXXX11i).setTag((Object) str3).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$bindPhone$lambda$0$$inlined$post$default$2
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
        Object objXIi00iiXO = safeContinuation.XIi00iiXO();
        if (objXIi00iiXO == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objXIi00iiXO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public final void checkEnableButton() {
        boolean z;
        Button button = this.btnDone;
        TextInputEditText textInputEditText = null;
        if (button == null) {
            Intrinsics.XXO("btnDone");
            button = null;
        }
        TextInputEditText textInputEditText2 = this.phone;
        if (textInputEditText2 == null) {
            Intrinsics.XXO("phone");
            textInputEditText2 = null;
        }
        if (UtilsKt.IXOIIIO(String.valueOf(textInputEditText2.getText()))) {
            TextInputEditText textInputEditText3 = this.verificationCode;
            if (textInputEditText3 == null) {
                Intrinsics.XXO("verificationCode");
            } else {
                textInputEditText = textInputEditText3;
            }
            if (StringsKt__StringsKt.iX1X1(String.valueOf(textInputEditText.getText())).toString().length() > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        button.setEnabled(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    private final void done() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TextInputEditText textInputEditText = this.phone;
        ScrollView scrollView = null;
        if (textInputEditText == null) {
            Intrinsics.XXO("phone");
            textInputEditText = null;
        }
        objectRef.element = StringsKt__StringsKt.iX1X1(String.valueOf(textInputEditText.getText())).toString();
        TextInputEditText textInputEditText2 = this.verificationCode;
        if (textInputEditText2 == null) {
            Intrinsics.XXO("verificationCode");
            textInputEditText2 = null;
        }
        String string = StringsKt__StringsKt.iX1X1(String.valueOf(textInputEditText2.getText())).toString();
        if (!UtilsKt.IXOIIIO((String) objectRef.element)) {
            ToastUtils.showLong(R.string.input_phone_format_error);
            return;
        }
        TextInputEditText textInputEditText3 = this.verificationCode;
        if (textInputEditText3 == null) {
            Intrinsics.XXO("verificationCode");
            textInputEditText3 = null;
        }
        if (StringsKt__StringsKt.iX1X1(String.valueOf(textInputEditText3.getText())).toString().length() == 0) {
            ToastUtils.showLong(R.string.enter_confirmation_code);
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        FragmentActivity activity = getActivity();
        ScrollView scrollView2 = this.rootScrollView;
        if (scrollView2 == null) {
            Intrinsics.XXO("rootScrollView");
        } else {
            scrollView = scrollView2;
        }
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), IXOX0Xiii.m712iO(), null, new C188171(objectRef, string, netWorkUtils.loadPopup(activity, scrollView), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getVerificationCode() {
        TextInputEditText textInputEditText = this.phone;
        if (textInputEditText == null) {
            Intrinsics.XXO("phone");
            textInputEditText = null;
        }
        if (!UtilsKt.IXOIIIO(String.valueOf(textInputEditText.getText()))) {
            ToastUtils.showShort(R.string.input_phone_format_error);
            return;
        }
        RequestCommonMethod requestCommonMethod = RequestCommonMethod.INSTANCE;
        FragmentActivity activity = getActivity();
        Intrinsics.X1ii(activity, "null cannot be cast to non-null type android.app.Activity");
        ScrollView scrollView = this.rootScrollView;
        if (scrollView == null) {
            Intrinsics.XXO("rootScrollView");
            scrollView = null;
        }
        TextInputEditText textInputEditText2 = this.phone;
        if (textInputEditText2 == null) {
            Intrinsics.XXO("phone");
            textInputEditText2 = null;
        }
        String strValueOf = String.valueOf(textInputEditText2.getText());
        TextView textView = this.tvGetVerificationCode;
        if (textView == null) {
            Intrinsics.XXO("tvGetVerificationCode");
            textView = null;
        }
        RequestCommonMethod.requestVerificationCode$default(requestCommonMethod, activity, scrollView, strValueOf, textView, 2, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0$0(PhoneBindGuideFragment phoneBindGuideFragment) {
        LinearLayout linearLayout = phoneBindGuideFragment.llContent;
        if (linearLayout == null) {
            Intrinsics.XXO("llContent");
            linearLayout = null;
        }
        linearLayout.getLayoutParams().height = phoneBindGuideFragment.getMView().getHeight();
        linearLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1$0(final PhoneBindGuideFragment phoneBindGuideFragment, final int i) {
        View view = phoneBindGuideFragment.viewKeyboardHeight;
        ScrollView scrollView = null;
        if (view == null) {
            Intrinsics.XXO("viewKeyboardHeight");
            view = null;
        }
        view.getLayoutParams().height = i;
        view.requestLayout();
        ScrollView scrollView2 = phoneBindGuideFragment.rootScrollView;
        if (scrollView2 == null) {
            Intrinsics.XXO("rootScrollView");
        } else {
            scrollView = scrollView2;
        }
        scrollView.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.av1
            @Override // java.lang.Runnable
            public final void run() {
                PhoneBindGuideFragment.initView$lambda$1$0$1(this.f5580IO, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1$0$1(PhoneBindGuideFragment phoneBindGuideFragment, int i) {
        ScrollView scrollView = phoneBindGuideFragment.rootScrollView;
        if (scrollView == null) {
            Intrinsics.XXO("rootScrollView");
            scrollView = null;
        }
        scrollView.smoothScrollTo(0, i / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4$0(PhoneBindGuideFragment phoneBindGuideFragment, View view) {
        FragmentActivity activity = phoneBindGuideFragment.getActivity();
        if (activity != null) {
            KeyboardUtils.hideSoftInput(activity);
        }
        phoneBindGuideFragment.done();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        View mView = getMView();
        View viewFindViewById = mView.findViewById(R.id.btnDone);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.btnDone = (Button) viewFindViewById;
        View viewFindViewById2 = mView.findViewById(R.id.view_keyboard_height);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.viewKeyboardHeight = viewFindViewById2;
        View viewFindViewById3 = mView.findViewById(R.id.llContent);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.llContent = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = mView.findViewById(R.id.tvGetVerificationCode);
        Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
        this.tvGetVerificationCode = (TextView) viewFindViewById4;
        View viewFindViewById5 = mView.findViewById(R.id.verification_code);
        Intrinsics.O10IXXX0X(viewFindViewById5, "findViewById(...)");
        this.verificationCode = (TextInputEditText) viewFindViewById5;
        View viewFindViewById6 = mView.findViewById(R.id.phone);
        Intrinsics.O10IXXX0X(viewFindViewById6, "findViewById(...)");
        this.phone = (TextInputEditText) viewFindViewById6;
        View viewFindViewById7 = mView.findViewById(R.id.root_view);
        ScrollView scrollView = (ScrollView) viewFindViewById7;
        scrollView.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.bv1
            @Override // java.lang.Runnable
            public final void run() {
                PhoneBindGuideFragment.initView$lambda$0$0$0(this.f5829IO);
            }
        });
        Intrinsics.O10IXXX0X(viewFindViewById7, "apply(...)");
        this.rootScrollView = scrollView;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.registerSoftInputChangedListener(activity.getWindow(), new KeyboardUtils.OnSoftInputChangedListener() { // from class: com.android.mltcode.paycertificationapi.cv1
                @Override // com.blankj.utilcode.util.KeyboardUtils.OnSoftInputChangedListener
                public final void onSoftInputChanged(int i) {
                    PhoneBindGuideFragment.initView$lambda$1$0(this.OXO1, i);
                }
            });
        }
        TextInputEditText textInputEditText = this.verificationCode;
        TextView textView = null;
        if (textInputEditText == null) {
            Intrinsics.XXO("verificationCode");
            textInputEditText = null;
        }
        textInputEditText.addTextChangedListener(new OXO1());
        TextInputEditText textInputEditText2 = this.phone;
        if (textInputEditText2 == null) {
            Intrinsics.XXO("phone");
            textInputEditText2 = null;
        }
        textInputEditText2.addTextChangedListener(new XIi00iiXO());
        Button button = this.btnDone;
        if (button == null) {
            Intrinsics.XXO("btnDone");
            button = null;
        }
        if (!this.mAppUser.getPasswordStatus()) {
            button.setText(getString(R.string.next));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.dv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBindGuideFragment.initView$lambda$4$0(this.f6275IO, view);
            }
        });
        TextView textView2 = this.tvGetVerificationCode;
        if (textView2 == null) {
            Intrinsics.XXO("tvGetVerificationCode");
        } else {
            textView = textView2;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ev1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6494IO.getVerificationCode();
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_app_guide_phone_bind;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.unregisterSoftInputChangedListener(activity.getWindow());
        }
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }
}
