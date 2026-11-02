package com.sma.smartv3.ui.me;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OiOiXI1X;
import com.android.mltcode.paycertificationapi.XO0iIXi;
import com.android.mltcode.paycertificationapi.XX0OiXX1i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00OIOXO0;
import com.android.mltcode.paycertificationapi.i01OX;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iOOX0I0X;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeveloperServerActivity extends BaseActivity {

    @aa1
    private final Lazy devServerLl$delegate;

    @aa1
    private final Lazy kaiServerLl$delegate;

    @tb1
    private iii1ii mEditPop;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy taoServerLl$delegate;

    public DeveloperServerActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new i01OX(this));
        this.kaiServerLl$delegate = LazyKt__LazyJVMKt.iO(new iOOX0I0X(this));
        this.taoServerLl$delegate = LazyKt__LazyJVMKt.iO(new XO0iIXi(this));
        this.devServerLl$delegate = LazyKt__LazyJVMKt.iO(new XX0OiXX1i(this));
    }

    public static /* synthetic */ LinearLayout I0iXXO(DeveloperServerActivity r0) {
        return taoServerLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout O10IXXX0X(DeveloperServerActivity r0) {
        return devServerLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(DeveloperServerActivity r0, String r1) {
        return devServer$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View X0O(DeveloperServerActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X1ii(DeveloperServerActivity r0) {
        return kaiServerLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XXI(DeveloperServerActivity r0, String r1) {
        return testServer$lambda$0$0(r0, r1);
    }

    private static final boolean devServer$lambda$0$0(DeveloperServerActivity r3, String r4) {
        Intrinsics.X0O(r4, "text");
        if (Intrinsics.XOO0ii0(r4, "752868") == false) goto L8;
        iii1ii r5 = r3.mEditPop;
        if (r5 == null) goto L7;
        View r0 = r3.getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
    L7:
        a01 r6 = a01.OXO1;
        r6.IiI10X().put(b01.X01IiOiIi, iX1IIO10.OXO1);
        r6.IiI10X().put(b01.II1Xi0, "Dev Server");
        r3.toStartLogin();
        return true;
    L8:
        ToastUtils.showLong("error", new Object[0]);
        return true;
    }

    private static final LinearLayout devServerLl_delegate$lambda$0(DeveloperServerActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.devServerLl);
    }

    private final LinearLayout getDevServerLl() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getKaiServerLl() {
        return (LinearLayout) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final LinearLayout getTaoServerLl() {
        return (LinearLayout) getValue();
    }

    private static final LinearLayout kaiServerLl_delegate$lambda$0(DeveloperServerActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.kaiServerLl);
    }

    private static final View rootView_delegate$lambda$0(DeveloperServerActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final LinearLayout taoServerLl_delegate$lambda$0(DeveloperServerActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.taoServerLl);
    }

    private static final boolean testServer$lambda$0$0(DeveloperServerActivity r3, String r4) {
        Intrinsics.X0O(r4, "text");
        if (Intrinsics.XOO0ii0(r4, "837765") == false) goto L8;
        iii1ii r5 = r3.mEditPop;
        if (r5 == null) goto L7;
        View r0 = r3.getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
    L7:
        a01 r6 = a01.OXO1;
        r6.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        r6.IiI10X().put(b01.II1Xi0, "Test Server");
        r3.toStartLogin();
        return true;
    L8:
        ToastUtils.showLong("error", new Object[0]);
        return true;
    }

    private final void toStartLogin() {
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(b01.O001I, true);
        r0.IiI10X().put(b01.iXiiiO, true);
        i72.OXO1.XOiXXOO(this);
    }

    public final void devServer(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        int r2 = 0;
        int r3 = 2;
        iii1ii r6 = new iii1ii(getMContext(), r2, r3, null);
        r6.X01IiOiIi().setHint("Invitation code");
        r6.iX1O1(2);
        r6.X11iII1O1(new i00OIOXO0(this));
        this.mEditPop = r6;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
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
        getKaiServerLl().setVisibility(8);
        getTaoServerLl().setVisibility(8);
        getDevServerLl().setVisibility(8);
    }

    public final void kaiServer(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, iX1IIO10.IiI10X);
        r5.IiI10X().put(b01.II1Xi0, "Kai Server");
        toStartLogin();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_test_server_select;
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        if (isFinishing() == true) goto L6;
        finish();
        return;
    }

    public final void taoServer(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XOO0ii0);
        r5.IiI10X().put(b01.II1Xi0, "Tao Server");
        toStartLogin();
    }

    public final void testServer(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        int r2 = 0;
        int r3 = 2;
        iii1ii r6 = new iii1ii(getMContext(), r2, r3, null);
        r6.X01IiOiIi().setHint("Invitation code");
        r6.iX1O1(2);
        r6.X11iII1O1(new OiOiXI1X(this));
        this.mEditPop = r6;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
    }
}
