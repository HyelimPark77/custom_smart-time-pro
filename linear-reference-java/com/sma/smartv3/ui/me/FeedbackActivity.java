package com.sma.smartv3.ui.me;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I1101O1I;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X11i0O11;
import com.android.mltcode.paycertificationapi.XO1i0X0i1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0011XiI;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
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
import com.sma.smartv3.pro.R;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nFeedbackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,86:1\n19#2:87\n15#2:88\n55#3,12:89\n84#3,3:101\n183#4,4:104\n196#4:116\n252#5,7:108\n270#5:115\n*S KotlinDebug\n*F\n+ 1 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n*L\n27#1:87\n27#1:88\n40#1:89,12\n40#1:101,3\n63#1:104,4\n63#1:116\n63#1:108,7\n63#1:115\n*E\n"})
public final class FeedbackActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    private static final int MAX_LENGTH = 500;

    @aa1
    private final AppUser appUser;

    @aa1
    private final Lazy edtContact$delegate;

    @aa1
    private final Lazy edtFeedback$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvCount$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n41#2,5:83\n59#3:88\n62#4:89\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ FeedbackActivity IO;

        public XIi00iiXO(FeedbackActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r3) {
            if (r3 != null) goto L4;
        L6:
            FeedbackActivity.access$updateCount(this.IO);
            return;
        L4:
            if (r3.length() <= 500) goto L6;
            r3.delete(500, r3.length());
            goto L6
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public FeedbackActivity() {
        this.edtFeedback$delegate = LazyKt__LazyJVMKt.iO(new X11i0O11(this));
        this.edtContact$delegate = LazyKt__LazyJVMKt.iO(new i0011XiI(this));
        this.tvCount$delegate = LazyKt__LazyJVMKt.iO(new I1101O1I(this));
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new XO1i0X0i1(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.appUser = (AppUser) r2;
    }

    public static /* synthetic */ TextView I0iXXO(FeedbackActivity r0) {
        return tvCount_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText OIX0iXi(FeedbackActivity r0) {
        return edtContact_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1ii(FeedbackActivity r0) {
        return edtFeedback_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XXI(FeedbackActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$updateCount(FeedbackActivity r0) {
        r0.updateCount();
    }

    private static final EditText edtContact_delegate$lambda$0(FeedbackActivity r1) {
        return (EditText) r1.findViewById(R.id.edt_contact);
    }

    private static final EditText edtFeedback_delegate$lambda$0(FeedbackActivity r1) {
        return (EditText) r1.findViewById(R.id.edt_feedback);
    }

    private final EditText getEdtContact() {
        return (EditText) getValue();
    }

    private final EditText getEdtFeedback() {
        return (EditText) getValue();
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) getValue();
    }

    private final TextView getTvCount() {
        return (TextView) getValue();
    }

    private static final LinearLayout rootView_delegate$lambda$0(FeedbackActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rootView);
    }

    private static final TextView tvCount_delegate$lambda$0(FeedbackActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_count);
    }

    private final void updateCount() {
        int r0 = getEdtFeedback().getText().length();
        TextView r1 = getTvCount();
        StringCompanionObject r2 = StringCompanionObject.OXO1;
        String r3 = String.format("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(r0), 500}, 2));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        r1.setText(r3);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.feedback);
        if (this.appUser.getEmail().length() <= 0) goto L5;
        getEdtContact().setText(this.appUser.getEmail());
    L5:
        updateCount();
        EditText r0 = getEdtFeedback();
        Intrinsics.O10IXXX0X(r0, "<get-edtFeedback>(...)");
        r0.addTextChangedListener(new XIi00iiXO(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_feedback;
    }

    public final void onBottomClick(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (getEdtFeedback().getText().toString().length() != 0) goto L7;
        ToastUtils.showLong(R.string.detailed_description_of_the_problem);
        return;
    L7:
        if (getEdtContact().getText().toString().length() != 0) goto L10;
    L11:
        ToastUtils.showLong(R.string.email_format_error);
        return;
    L10:
        if (RegexUtils.isEmail(getEdtContact().getText()) == false) goto L11;
        NetWorkUtils r8 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r0 = RequestBodyKt.getFeedbackBody(getMContext(), getEdtContact().getText().toString(), getEdtFeedback().getText().toString());
        final O1XIiIO<String> r1 = new AnonymousClass1(this);
        final uq r2 = r8.loadPopup(this, getRootView());
        String r3 = r8.convertBaseUrl(Api.INSTANCE.getBASE_URL(), Feedback.URL);
        r8.printParam(r3 + Feedback.URL, r0);
        NetWork r9 = NetWork.OXO1;
        String r10 = r3 + Feedback.URL;
        final O1XIiIO<Response<String>> r4 = new FeedbackActivity$onBottomClick$$inlined$post$1(this, r1, r2);
        AndroidNetworking.post(r10).addBodyParameter(r0).setTag(r10).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new FeedbackActivity$onBottomClick$$inlined$post$2(r4));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
