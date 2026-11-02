package com.sma.smartv3.ui.login;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cy6;
import com.android.mltcode.paycertificationapi.ga2;
import com.android.mltcode.paycertificationapi.i0I01iiO0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iXI0OOOIi;
import com.android.mltcode.paycertificationapi.lq6;
import com.android.mltcode.paycertificationapi.mq6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r75;
import com.android.mltcode.paycertificationapi.s75;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.t75;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u75;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.v75;
import com.android.mltcode.paycertificationapi.w75;
import com.android.mltcode.paycertificationapi.wq5;
import com.android.mltcode.paycertificationapi.x75;
import com.android.mltcode.paycertificationapi.xq5;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.androidthirdpartylogin.model.LoginResponse;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.ThirdPartyLogin;
import com.sma.smartv3.pro.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartActivity.kt\ncom/sma/smartv3/ui/login/StartActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,229:1\n183#2,4:230\n196#2:242\n252#3,7:234\n270#3:241\n*S KotlinDebug\n*F\n+ 1 StartActivity.kt\ncom/sma/smartv3/ui/login/StartActivity\n*L\n174#1:230,4\n174#1:242\n174#1:234,7\n174#1:241\n*E\n"})
public final class StartActivity extends BaseActivity {

    @aa1
    private final Lazy QQRl$delegate;

    @aa1
    private final String TAG;

    @aa1
    private final Lazy faceBookRl$delegate;

    @aa1
    private final Lazy googleRl$delegate;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final OXO1 thirdPartyCallback;

    @aa1
    private final Lazy twitterRl$delegate;

    @aa1
    private final Lazy weChatRl$delegate;

    @aa1
    private final Lazy weiBoRl$delegate;

    public static final class OXO1 implements wq5 {
        public final /* synthetic */ StartActivity OXO1;

        public OXO1(StartActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.wq5
        public void OXO1(String r2) {
            Intrinsics.X0O(r2, "lb");
            ToastUtils.showLong(r2, new Object[0]);
        }

        @Override // com.android.mltcode.paycertificationapi.wq5
        public void XIi00iiXO(LoginResponse r2) {
            if (r2 != null) goto L5;
            ToastUtils.showLong(R.string.login_failed_please_try_again);
            return;
        L5:
            StartActivity.access$thirdPartyLogin(this.OXO1, r2);
        }
    }

    public StartActivity() {
        this.TAG = "StartActivity";
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new r75(this));
        this.weChatRl$delegate = LazyKt__LazyJVMKt.iO(new s75(this));
        this.QQRl$delegate = LazyKt__LazyJVMKt.iO(new t75(this));
        this.weiBoRl$delegate = LazyKt__LazyJVMKt.iO(new u75(this));
        this.faceBookRl$delegate = LazyKt__LazyJVMKt.iO(new v75(this));
        this.twitterRl$delegate = LazyKt__LazyJVMKt.iO(new w75(this));
        this.googleRl$delegate = LazyKt__LazyJVMKt.iO(new x75(this));
        this.thirdPartyCallback = new OXO1(this);
    }

    public static /* synthetic */ RelativeLayout I0iXXO(StartActivity r0) {
        return weiBoRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout I1XOi1(StartActivity r0) {
        return QQRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView O10IXXX0X(StartActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout OIX0iXi(StartActivity r0) {
        return googleRl_delegate$lambda$0(r0);
    }

    private static final RelativeLayout QQRl_delegate$lambda$0(StartActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.QQRl);
    }

    public static /* synthetic */ RelativeLayout X0O(StartActivity r0) {
        return faceBookRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout X1ii(StartActivity r0) {
        return weChatRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XXI(StartActivity r0) {
        return twitterRl_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$thirdPartyLogin(StartActivity r0, LoginResponse r1) {
        r0.thirdPartyLogin(r1);
    }

    private static final RelativeLayout faceBookRl_delegate$lambda$0(StartActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.faceBookRl);
    }

    private static final RelativeLayout googleRl_delegate$lambda$0(StartActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.googleRl);
    }

    private static final NestedScrollView rv_delegate$lambda$0(StartActivity r1) {
        return (NestedScrollView) r1.findViewById(R.id.rv);
    }

    private final void thirdPartyLogin(LoginResponse r8) {
        LogUtils.d(new Object[]{r8});
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getThirdPartyBody(r8.I0IIOi(), r8.XOO0ii0(), r8.iO(), r8.IiI10X(), r8.O00(), r8.XO0O10());
        final O1XIiIO<AppUser> r1 = new AnonymousClass1(this);
        final uq r2 = r0.loadPopup(this, getRv());
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ThirdPartyLogin.URL);
        r0.printParam(r3 + ThirdPartyLogin.URL, r9);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + ThirdPartyLogin.URL;
        final O1XIiIO<Response<AppUser>> r6 = new StartActivity$thirdPartyLogin$$inlined$post$1(this, r1, r2);
        AndroidNetworking.post(r5).addBodyParameter(r9).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new StartActivity$thirdPartyLogin$$inlined$post$2(r6));
    }

    private static final RelativeLayout twitterRl_delegate$lambda$0(StartActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.twitterRl);
    }

    private final void weChatLogin() {
        mq6.XO0O10(0);
        lq6.OXO1.OXO1(this);
    }

    private static final RelativeLayout weChatRl_delegate$lambda$0(StartActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.weChatRl);
    }

    private static final RelativeLayout weiBoRl_delegate$lambda$0(StartActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.weiBoRl);
    }

    public final void emailLogin(@aa1 View r2) {
        Intrinsics.X0O(r2, "View");
        i72.OXO1.i10X0X0i(getMContext());
    }

    public final void faceBook(@aa1 View r2) {
        Intrinsics.X0O(r2, "View");
        iXI0OOOIi.OXO1.XIi00iiXO(this, this.thirdPartyCallback);
    }

    public final RelativeLayout getFaceBookRl() {
        return (RelativeLayout) getValue();
    }

    public final RelativeLayout getGoogleRl() {
        return (RelativeLayout) getValue();
    }

    public final RelativeLayout getQQRl() {
        return (RelativeLayout) getValue();
    }

    public final NestedScrollView getRv() {
        return (NestedScrollView) getValue();
    }

    public final RelativeLayout getTwitterRl() {
        return (RelativeLayout) getValue();
    }

    public final RelativeLayout getWeChatRl() {
        return (RelativeLayout) getValue();
    }

    public final RelativeLayout getWeiBoRl() {
        return (RelativeLayout) getValue();
    }

    public final void google(@aa1 View r4) {
        Intrinsics.X0O(r4, "View");
        String r5 = i0I01iiO0.OXO1.XO0O10(this, this.thirdPartyCallback);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " google : clientID = " + r5);
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
        iXI0OOOIi r0 = iXI0OOOIi.OXO1;
        Application r1 = getApplication();
        Intrinsics.O10IXXX0X(r1, "getApplication(...)");
        r0.OXO1(r1);
        cy6 r2 = cy6.OXO1;
        Application r3 = getApplication();
        Intrinsics.O10IXXX0X(r3, "getApplication(...)");
        r2.OXO1(r3);
        i72.OXO1.OOIIOX(getWeChatRl(), getQQRl(), getWeiBoRl(), getFaceBookRl(), getTwitterRl(), getGoogleRl());
        TextView r4 = (TextView) findViewById(R.id.tv_link);
        if (r4 == null) goto L6;
        r4.setMovementMethod(LinkMovementMethod.getInstance());
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_start;
    }

    public final void noLogin(@aa1 View r3) {
        Intrinsics.X0O(r3, "View");
        if (q62.OXO1.iIIX0XI() == false) goto L6;
        ToastUtils.showLong(R.string.please_login);
        return;
    L6:
        a01.OXO1.IiI10X().put(b01.O001I, false);
        i72.OXO1.XX(this);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r2, int r3, @tb1 Intent r4) {
        super.onActivityResult(r2, r3, r4);
        iXI0OOOIi.OXO1.iO(r2, r3, r4);
        i0I01iiO0.OXO1.O00(r2, r4);
        ga2.OXO1.XIi00iiXO(r2, r3, r4);
        cy6.OXO1.iO(this, r2, r3, r4);
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        if (isFinishing() == true) goto L6;
        finish();
        return;
    }

    @sf5(tag = I01XX0.XO0X10iO)
    public final void onThirdPartyLogin(@aa1 LoginResponse r2) {
        Intrinsics.X0O(r2, "data");
        thirdPartyLogin(r2);
    }

    public final void qq(@aa1 View r2) {
        Intrinsics.X0O(r2, "View");
        if (xq5.OXO1.XIi00iiXO(getMContext()) == false) goto L6;
        ga2.OXO1.OXO1(this, this.thirdPartyCallback);
        return;
    L6:
        ToastUtils.showLong(R.string.client_no_installed);
    }

    public final void startVisitor(@aa1 View r3) {
        Intrinsics.X0O(r3, "View");
        a01.OXO1.IiI10X().put(b01.O001I, false);
        i72.OXO1.XX(this);
        finish();
    }

    public final void twitter(@aa1 View r2) {
        Intrinsics.X0O(r2, "View");
        ToastUtils.showLong("twitter", new Object[0]);
    }

    public final void weChat(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        weChatLogin();
    }

    public final void weiBo(@aa1 View r2) {
        Intrinsics.X0O(r2, "View");
        cy6.OXO1.XIi00iiXO(this, this.thirdPartyCallback);
    }
}
