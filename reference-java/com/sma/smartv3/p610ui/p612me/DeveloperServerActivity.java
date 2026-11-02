package com.sma.smartv3.p610ui.p612me;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.p612me.DeveloperServerActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeveloperServerActivity extends BaseActivity {

    @tb1
    private iii1ii mEditPop;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i01OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperServerActivity.rootView_delegate$lambda$0(this.f7308IO);
        }
    });

    @aa1
    private final Lazy kaiServerLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOOX0I0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperServerActivity.kaiServerLl_delegate$lambda$0(this.f8123IO);
        }
    });

    @aa1
    private final Lazy taoServerLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO0iIXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperServerActivity.taoServerLl_delegate$lambda$0(this.f4691IO);
        }
    });

    @aa1
    private final Lazy devServerLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX0OiXX1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperServerActivity.devServerLl_delegate$lambda$0(this.f4952IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean devServer$lambda$0$0(DeveloperServerActivity developerServerActivity, String text) {
        Intrinsics.X0O(text, "text");
        if (!Intrinsics.XOO0ii0(text, "752868")) {
            ToastUtils.showLong("error", new Object[0]);
            return true;
        }
        iii1ii iii1iiVar = developerServerActivity.mEditPop;
        if (iii1iiVar != null) {
            View rootView = developerServerActivity.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            iii1iiVar.I1XOi1(rootView);
        }
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.OXO1);
        a01Var.IiI10X().put(b01.II1Xi0, "Dev Server");
        developerServerActivity.toStartLogin();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout devServerLl_delegate$lambda$0(DeveloperServerActivity developerServerActivity) {
        return (LinearLayout) developerServerActivity.findViewById(R.id.devServerLl);
    }

    private final LinearLayout getDevServerLl() {
        return (LinearLayout) this.devServerLl$delegate.getValue();
    }

    private final LinearLayout getKaiServerLl() {
        return (LinearLayout) this.kaiServerLl$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final LinearLayout getTaoServerLl() {
        return (LinearLayout) this.taoServerLl$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout kaiServerLl_delegate$lambda$0(DeveloperServerActivity developerServerActivity) {
        return (LinearLayout) developerServerActivity.findViewById(R.id.kaiServerLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(DeveloperServerActivity developerServerActivity) {
        return developerServerActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout taoServerLl_delegate$lambda$0(DeveloperServerActivity developerServerActivity) {
        return (LinearLayout) developerServerActivity.findViewById(R.id.taoServerLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean testServer$lambda$0$0(DeveloperServerActivity developerServerActivity, String text) {
        Intrinsics.X0O(text, "text");
        if (!Intrinsics.XOO0ii0(text, "837765")) {
            ToastUtils.showLong("error", new Object[0]);
            return true;
        }
        iii1ii iii1iiVar = developerServerActivity.mEditPop;
        if (iii1iiVar != null) {
            View rootView = developerServerActivity.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            iii1iiVar.I1XOi1(rootView);
        }
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        a01Var.IiI10X().put(b01.II1Xi0, "Test Server");
        developerServerActivity.toStartLogin();
        return true;
    }

    private final void toStartLogin() {
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.O001I, true);
        a01Var.IiI10X().put(b01.iXiiiO, true);
        i72.OXO1.XOiXXOO(this);
    }

    public final void devServer(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        iii1ii iii1iiVar = new iii1ii(getMContext(), 0, 2, null);
        iii1iiVar.X01IiOiIi().setHint("Invitation code");
        iii1iiVar.iX1O1(2);
        iii1iiVar.X11iII1O1(new Function1() { // from class: com.android.mltcode.paycertificationapi.i00OIOXO0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeveloperServerActivity.devServer$lambda$0$0(this.f7278IO, (String) obj));
            }
        });
        this.mEditPop = iii1iiVar;
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        iii1iiVar.I1XOi1(rootView);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getKaiServerLl().setVisibility(8);
        getTaoServerLl().setVisibility(8);
        getDevServerLl().setVisibility(8);
    }

    public final void kaiServer(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.IiI10X);
        a01Var.IiI10X().put(b01.II1Xi0, "Kai Server");
        toStartLogin();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_test_server_select;
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public final void taoServer(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XOO0ii0);
        a01Var.IiI10X().put(b01.II1Xi0, "Tao Server");
        toStartLogin();
    }

    public final void testServer(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        iii1ii iii1iiVar = new iii1ii(getMContext(), 0, 2, null);
        iii1iiVar.X01IiOiIi().setHint("Invitation code");
        iii1iiVar.iX1O1(2);
        iii1iiVar.X11iII1O1(new Function1() { // from class: com.android.mltcode.paycertificationapi.OiOiXI1X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeveloperServerActivity.testServer$lambda$0$0(this.f3763IO, (String) obj));
            }
        });
        this.mEditPop = iii1iiVar;
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        iii1iiVar.I1XOi1(rootView);
    }
}
