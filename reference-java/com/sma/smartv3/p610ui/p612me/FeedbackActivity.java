package com.sma.smartv3.p610ui.p612me;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.Feedback;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.p612me.FeedbackActivity;
import com.sma.smartv3.pro.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nFeedbackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,86:1\n19#2:87\n15#2:88\n55#3,12:89\n84#3,3:101\n183#4,4:104\n196#4:116\n252#5,7:108\n270#5:115\n*S KotlinDebug\n*F\n+ 1 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n*L\n27#1:87\n27#1:88\n40#1:89,12\n40#1:101,3\n63#1:104,4\n63#1:116\n63#1:108,7\n63#1:115\n*E\n"})
public final class FeedbackActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private static final int MAX_LENGTH = 500;

    @aa1
    private final AppUser appUser;

    @aa1
    private final Lazy edtFeedback$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X11i0O11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FeedbackActivity.edtFeedback_delegate$lambda$0(this.f4233IO);
        }
    });

    @aa1
    private final Lazy edtContact$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0011XiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FeedbackActivity.edtContact_delegate$lambda$0(this.f7258IO);
        }
    });

    @aa1
    private final Lazy tvCount$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1101O1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FeedbackActivity.tvCount_delegate$lambda$0(this.f1335IO);
        }
    });

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO1i0X0i1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FeedbackActivity.rootView_delegate$lambda$0(this.f4740IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n41#2,5:83\n59#3:88\n62#4:89\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {
        public XIi00iiXO() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable != null && editable.length() > 500) {
                editable.delete(500, editable.length());
            }
            FeedbackActivity.this.updateCount();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public FeedbackActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.appUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText edtContact_delegate$lambda$0(FeedbackActivity feedbackActivity) {
        return (EditText) feedbackActivity.findViewById(R.id.edt_contact);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText edtFeedback_delegate$lambda$0(FeedbackActivity feedbackActivity) {
        return (EditText) feedbackActivity.findViewById(R.id.edt_feedback);
    }

    private final EditText getEdtContact() {
        return (EditText) this.edtContact$delegate.getValue();
    }

    private final EditText getEdtFeedback() {
        return (EditText) this.edtFeedback$delegate.getValue();
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) this.rootView$delegate.getValue();
    }

    private final TextView getTvCount() {
        return (TextView) this.tvCount$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootView_delegate$lambda$0(FeedbackActivity feedbackActivity) {
        return (LinearLayout) feedbackActivity.findViewById(R.id.rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCount_delegate$lambda$0(FeedbackActivity feedbackActivity) {
        return (TextView) feedbackActivity.findViewById(R.id.tv_count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCount() {
        int length = getEdtFeedback().getText().length();
        TextView tvCount = getTvCount();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(length), 500}, 2));
        Intrinsics.O10IXXX0X(str, "format(...)");
        tvCount.setText(str);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.feedback);
        if (this.appUser.getEmail().length() > 0) {
            getEdtContact().setText(this.appUser.getEmail());
        }
        updateCount();
        EditText edtFeedback = getEdtFeedback();
        Intrinsics.O10IXXX0X(edtFeedback, "<get-edtFeedback>(...)");
        edtFeedback.addTextChangedListener(new XIi00iiXO());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_feedback;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getEdtFeedback().getText().toString().length() == 0) {
            ToastUtils.showLong(R.string.detailed_description_of_the_problem);
            return;
        }
        if (getEdtContact().getText().toString().length() == 0 || !RegexUtils.isEmail(getEdtContact().getText())) {
            ToastUtils.showLong(R.string.email_format_error);
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> feedbackBody = RequestBodyKt.getFeedbackBody(getMContext(), getEdtContact().getText().toString(), getEdtFeedback().getText().toString());
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.FeedbackActivity.onBottomClick.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                ToastUtils.showLong(R.string.feedback_success);
                FeedbackActivity.this.finish();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRootView());
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), Feedback.URL);
        netWorkUtils.printParam(strConvertBaseUrl + Feedback.URL, feedbackBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + Feedback.URL;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.me.FeedbackActivity$onBottomClick$$inlined$post$1
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
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) feedbackBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.me.FeedbackActivity$onBottomClick$$inlined$post$2
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

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
