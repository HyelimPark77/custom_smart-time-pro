package com.sma.smartv3.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a44;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.b44;
import com.android.mltcode.paycertificationapi.c44;
import com.android.mltcode.paycertificationapi.d44;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.x34;
import com.android.mltcode.paycertificationapi.y34;
import com.android.mltcode.paycertificationapi.z34;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.DeveloperServerActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSelectActivity.kt\ncom/sma/smartv3/ui/login/ServerSelectActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n257#2,2:188\n69#3,3:190\n72#3,5:194\n1#4:193\n*S KotlinDebug\n*F\n+ 1 ServerSelectActivity.kt\ncom/sma/smartv3/ui/login/ServerSelectActivity\n*L\n77#1:188,2\n168#1:190,3\n168#1:194,5\n168#1:193\n*E\n"})
public final class ServerSelectActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    private static final String IS_FORCE_LOGIN = null;
    private boolean isForceLogin;

    @aa1
    private final Lazy llItemContent$delegate;

    @tb1
    private go0 mTestServerRemindPop;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy selectServerButton$delegate;

    @aa1
    private final Lazy selectServerIsShow$delegate;

    @aa1
    private final Lazy taiWanServerLl$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final String OXO1() {
            return ServerSelectActivity.access$getIS_FORCE_LOGIN$cp();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
        IS_FORCE_LOGIN = "is_force_login";
    }

    public ServerSelectActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new x34(this));
        this.taiWanServerLl$delegate = LazyKt__LazyJVMKt.iO(new y34(this));
        this.selectServerButton$delegate = LazyKt__LazyJVMKt.iO(new z34(this));
        this.selectServerIsShow$delegate = LazyKt__LazyJVMKt.iO(new a44(this));
        this.llItemContent$delegate = LazyKt__LazyJVMKt.iO(new b44(this));
    }

    public static /* synthetic */ boolean I0iXXO(ServerSelectActivity r0, View r1) {
        return initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ View I1XOi1(ServerSelectActivity r0) {
        return selectServerButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(ServerSelectActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(ServerSelectActivity r0) {
        return moreSetting$lambda$0$0(r0);
    }

    public static /* synthetic */ LinearLayout X0O(ServerSelectActivity r0) {
        return taiWanServerLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X1ii(ServerSelectActivity r0) {
        return llItemContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXI(ServerSelectActivity r0) {
        return selectServerIsShow_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ String access$getIS_FORCE_LOGIN$cp() {
        return IS_FORCE_LOGIN;
    }

    private final LinearLayout getLlItemContent() {
        return (LinearLayout) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final View getSelectServerButton() {
        return (View) getValue();
    }

    private final View getSelectServerIsShow() {
        return (View) getValue();
    }

    private final LinearLayout getTaiWanServerLl() {
        return (LinearLayout) getValue();
    }

    private static final boolean initView$lambda$0(ServerSelectActivity r0, View r1) {
        r0.getSelectServerButton().setVisibility(0);
        return true;
    }

    private static final LinearLayout llItemContent_delegate$lambda$0(ServerSelectActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.llItemContent);
    }

    private static final boolean moreSetting$lambda$0$0(ServerSelectActivity r2) {
        r2.startActivity(new Intent(r2, DeveloperServerActivity.class));
        return true;
    }

    private static final View rootView_delegate$lambda$0(ServerSelectActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final View selectServerButton_delegate$lambda$0(ServerSelectActivity r1) {
        return r1.findViewById(R.id.server_select_img_button);
    }

    private static final View selectServerIsShow_delegate$lambda$0(ServerSelectActivity r1) {
        return r1.findViewById(R.id.server_select_tv);
    }

    private static final LinearLayout taiWanServerLl_delegate$lambda$0(ServerSelectActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.taiWanServerLl);
    }

    private final void toStartLogin() {
        I01XX0.XIi00iiXO(I01XX0.I0XXi0X, null, 2, null);
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(b01.O001I, true);
        r0.IiI10X().put(b01.iXiiiO, true);
        i72.OXO1.XOiXXOO(this);
    }

    public final void SiliconValleyServerLl(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, e44.O00);
        r5.IiI10X().put(b01.II1Xi0, getString(R.string.silicon_valley_of_america_name));
        toStartLogin();
    }

    public final void african(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        r5.IiI10X().put(b01.II1Xi0, getString(R.string.african));
        toStartLogin();
    }

    public final void asiaPacific(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        r5.IiI10X().put(b01.II1Xi0, getString(R.string.asia_pacific));
        toStartLogin();
    }

    public final void asiaPacificTaiWan(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        r5.IiI10X().put(b01.II1Xi0, getString(R.string.tai_wan));
        toStartLogin();
    }

    public final void chinaMainland(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, e44.iO);
        r5.IiI10X().put(b01.II1Xi0, getString(R.string.china_mainland));
        toStartLogin();
    }

    public final void europAmerica(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, e44.XIi00iiXO);
        r5.IiI10X().put(b01.II1Xi0, getString(R.string.europe_and_america));
        toStartLogin();
    }

    public final void indiaBeatxp(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, e44.XO0O10);
        r5.IiI10X().put(b01.II1Xi0, getString(R.string.india));
        toStartLogin();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r3) {
        this.isForceLogin = getIntent().getBooleanExtra(IS_FORCE_LOGIN, false);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (i72.OXO1.iI0I() == false) goto L5;
        getTaiWanServerLl().setVisibility(0);
    L6:
        getSelectServerButton().setVisibility(8);
        getSelectServerIsShow().setOnLongClickListener(new c44(this));
        View r0 = findViewById(R.id.ll_african);
        if (r0 == null) goto L10;
        r0.setVisibility(8);
        return;
    L10:
        return;
    L5:
        getTaiWanServerLl().setVisibility(8);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_server_select;
    }

    public final void moreSetting(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mTestServerRemindPop != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.test_function_remind);
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.open_test_function, new d44(this));
        this.mTestServerRemindPop = r5;
    L5:
        go0 r6 = this.mTestServerRemindPop;
        if (r6 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public final void noLogin(@aa1 View r3) {
        Intrinsics.X0O(r3, "View");
        a01.OXO1.IiI10X().put(b01.O001I, false);
        i72.OXO1.XX(this);
        finish();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        if (isFinishing() == true) goto L6;
        finish();
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.isForceLogin == false) goto L5;
        return;
    L5:
        super.onHandleBackPressed();
    }
}
