package com.sma.smartv3.p610ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.login.ServerSelectActivity;
import com.sma.smartv3.p610ui.p612me.DeveloperServerActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSelectActivity.kt\ncom/sma/smartv3/ui/login/ServerSelectActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n257#2,2:188\n69#3,3:190\n72#3,5:194\n1#4:193\n*S KotlinDebug\n*F\n+ 1 ServerSelectActivity.kt\ncom/sma/smartv3/ui/login/ServerSelectActivity\n*L\n77#1:188,2\n168#1:190,3\n168#1:194,5\n168#1:193\n*E\n"})
public final class ServerSelectActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    private static final String IS_FORCE_LOGIN = "is_force_login";
    private boolean isForceLogin;

    @tb1
    private go0 mTestServerRemindPop;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerSelectActivity.rootView_delegate$lambda$0(this.f12095IO);
        }
    });

    @aa1
    private final Lazy taiWanServerLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerSelectActivity.taiWanServerLl_delegate$lambda$0(this.f12298IO);
        }
    });

    @aa1
    private final Lazy selectServerButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerSelectActivity.selectServerButton_delegate$lambda$0(this.f12530IO);
        }
    });

    @aa1
    private final Lazy selectServerIsShow$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a44
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerSelectActivity.selectServerIsShow_delegate$lambda$0(this.f5419IO);
        }
    });

    @aa1
    private final Lazy llItemContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b44
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerSelectActivity.llItemContent_delegate$lambda$0(this.f5662IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final String OXO1() {
            return ServerSelectActivity.IS_FORCE_LOGIN;
        }

        public OXO1() {
        }
    }

    private final LinearLayout getLlItemContent() {
        return (LinearLayout) this.llItemContent$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final View getSelectServerButton() {
        return (View) this.selectServerButton$delegate.getValue();
    }

    private final View getSelectServerIsShow() {
        return (View) this.selectServerIsShow$delegate.getValue();
    }

    private final LinearLayout getTaiWanServerLl() {
        return (LinearLayout) this.taiWanServerLl$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$0(ServerSelectActivity serverSelectActivity, View view) {
        serverSelectActivity.getSelectServerButton().setVisibility(0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llItemContent_delegate$lambda$0(ServerSelectActivity serverSelectActivity) {
        return (LinearLayout) serverSelectActivity.findViewById(R.id.llItemContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean moreSetting$lambda$0$0(ServerSelectActivity serverSelectActivity) {
        serverSelectActivity.startActivity(new Intent(serverSelectActivity, (Class<?>) DeveloperServerActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(ServerSelectActivity serverSelectActivity) {
        return serverSelectActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View selectServerButton_delegate$lambda$0(ServerSelectActivity serverSelectActivity) {
        return serverSelectActivity.findViewById(R.id.server_select_img_button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View selectServerIsShow_delegate$lambda$0(ServerSelectActivity serverSelectActivity) {
        return serverSelectActivity.findViewById(R.id.server_select_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout taiWanServerLl_delegate$lambda$0(ServerSelectActivity serverSelectActivity) {
        return (LinearLayout) serverSelectActivity.findViewById(R.id.taiWanServerLl);
    }

    private final void toStartLogin() {
        I01XX0.XIi00iiXO(I01XX0.I0XXi0X, null, 2, null);
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.O001I, true);
        a01Var.IiI10X().put(b01.iXiiiO, true);
        i72.OXO1.XOiXXOO(this);
    }

    public final void SiliconValleyServerLl(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.O00);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.silicon_valley_of_america_name));
        toStartLogin();
    }

    public final void african(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.african));
        toStartLogin();
    }

    public final void asiaPacific(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.asia_pacific));
        toStartLogin();
    }

    public final void asiaPacificTaiWan(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.tai_wan));
        toStartLogin();
    }

    public final void chinaMainland(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.f6332iO);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.china_mainland));
        toStartLogin();
    }

    public final void europAmerica(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.XIi00iiXO);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.europe_and_america));
        toStartLogin();
    }

    public final void indiaBeatxp(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.XO0O10);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.india));
        toStartLogin();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.isForceLogin = getIntent().getBooleanExtra(IS_FORCE_LOGIN, false);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (i72.OXO1.iI0I()) {
            getTaiWanServerLl().setVisibility(0);
        } else {
            getTaiWanServerLl().setVisibility(8);
        }
        getSelectServerButton().setVisibility(8);
        getSelectServerIsShow().setOnLongClickListener(new View.OnLongClickListener() { // from class: com.android.mltcode.paycertificationapi.c44
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ServerSelectActivity.initView$lambda$0(this.f5900IO, view);
            }
        });
        View viewFindViewById = findViewById(R.id.ll_african);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_server_select;
    }

    public final void moreSetting(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTestServerRemindPop == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.test_function_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.open_test_function, new Function0() { // from class: com.android.mltcode.paycertificationapi.d44
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(ServerSelectActivity.moreSetting$lambda$0$0(this.f6126IO));
                }
            });
            this.mTestServerRemindPop = go0Var;
        }
        go0 go0Var2 = this.mTestServerRemindPop;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void noLogin(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        a01.OXO1.IiI10X().put(b01.O001I, false);
        i72.OXO1.m2053XX(this);
        finish();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.isForceLogin) {
            return;
        }
        super.onHandleBackPressed();
    }
}
