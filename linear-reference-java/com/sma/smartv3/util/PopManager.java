package com.sma.smartv3.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a22;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ii1XXIXi;
import com.android.mltcode.paycertificationapi.lp4;
import com.android.mltcode.paycertificationapi.lu5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.s12;
import com.android.mltcode.paycertificationapi.t12;
import com.android.mltcode.paycertificationapi.u12;
import com.android.mltcode.paycertificationapi.v12;
import com.android.mltcode.paycertificationapi.w12;
import com.android.mltcode.paycertificationapi.x12;
import com.android.mltcode.paycertificationapi.y12;
import com.android.mltcode.paycertificationapi.yy5;
import com.android.mltcode.paycertificationapi.z12;
import com.android.mltcode.paycertificationapi.z16;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPopManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopManager.kt\ncom/sma/smartv3/util/PopManager\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n87#2,7:153\n94#2,3:161\n70#2,7:164\n97#2:171\n1#3:160\n*S KotlinDebug\n*F\n+ 1 PopManager.kt\ncom/sma/smartv3/util/PopManager\n*L\n55#1:153,7\n55#1:161,3\n55#1:164,7\n55#1:171\n55#1:160\n*E\n"})
public final class PopManager {

    @aa1
    public static final PopManager OXO1 = null;

    static {
        OXO1 = new PopManager();
    }

    public PopManager() {
    }

    public static /* synthetic */ boolean I0IIOi(AppCompatActivity r0) {
        return iIiiO(r0);
    }

    public static final void I1(z16 r0, View r1) {
        r0.XiOIO(r1);
    }

    public static final /* synthetic */ Object IO(PopManager r0, Continuation r1) {
        return r0.OIX0iXi(r1);
    }

    public static /* synthetic */ boolean IiI10X(Activity r0) {
        return O10IXXX0X(r0);
    }

    public static /* synthetic */ boolean O00() {
        return XiOIO();
    }

    public static final boolean O10IXXX0X(Activity r3) {
        if (lp4.OXO1() == false) goto L7;
        yy5.OIX0iXi(yy5.OXO1, r3, null, 2, null);
        return true;
    L7:
        return true;
    }

    public static final void OII(String r1, CompoundButton r2, boolean r3) {
        Intrinsics.X0O(r2, "<unused var>");
        LogUtils.d(new Object[]{"isChecked = " + r3});
        a01.OXO1.OXO1().put(r1, r3);
    }

    public static /* synthetic */ void OIi0(AppCompatActivity r0, go0 r1, View r2) {
        XX0(r0, r1, r2);
    }

    public static final void OX(AppCompatActivity r3, lu5 r4, View r5) {
        q62 r6 = q62.OXO1;
        if (q62.OiO0IOX(r6, null, 1, null) == false) goto L6;
        String r7 = "2";
    L9:
        String r8 = "https://api.iot-solution.net/videoPlayer/?type=" + r7 + "&id=" + r4.OIX0iXi();
        int r9 = WebViewActivity.Companion.iO();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r8);
        r0.putInt("mArg1", r9);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r10 = new Intent(r3, WebViewActivity.class);
        r10.putExtras(r0);
        r3.startActivity(r10);
        return;
    L6:
        if (r6.X0100I() == false) goto L8;
        r7 = "3";
        goto L9
    L8:
        r7 = "1";
        goto L9
    }

    public static /* synthetic */ void OXO1(z16 r0, View r1) {
        I1(r0, r1);
    }

    public static final void X0O(Activity r1, go0 r2) {
        if (r1.isDestroyed() == true) goto L6;
        View r3 = ii1XXIXi.OXO1(r1);
        Intrinsics.XXI(r3);
        r2.XiOIO(r3);
        return;
    }

    public static final boolean X1ii(boolean r0, Activity r1) {
        if (r0 == false) goto L6;
        r1.finish();
        return true;
    L6:
        return true;
    }

    public static /* synthetic */ boolean XIi00iiXO(boolean r0, Activity r1) {
        return X1ii(r0, r1);
    }

    public static /* synthetic */ void XO0O10(String r0, CompoundButton r1, boolean r2) {
        OII(r0, r1, r2);
    }

    public static /* synthetic */ void XOO0ii0(AppCompatActivity r0, lu5 r1, View r2) {
        OX(r0, r1, r2);
    }

    public static final void XX0(AppCompatActivity r0, go0 r1, View r2) {
        if (r0.isDestroyed() == true) goto L6;
        Intrinsics.XXI(r2);
        r1.XiOIO(r2);
        return;
    }

    public static /* synthetic */ void XXI(PopManager r0, Activity r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = false;
    L5:
        r0.I0iXXO(r1, r2, r3);
    }

    public static final boolean XiOIO() {
        return true;
    }

    public static final boolean iIiiO(AppCompatActivity r1) {
        i72.OXO1.Oi1I(r1);
        return true;
    }

    public static /* synthetic */ void iO(Activity r0, go0 r1) {
        X0O(r0, r1);
    }

    public final void I0iXXO(@aa1 final Activity r5, @aa1 String r6, final boolean r7) {
        Intrinsics.X0O(r5, "activity");
        Intrinsics.X0O(r6, "message");
        int r3 = 0;
        final go0 r0 = new go0(r5, r3, 2, null);
        r0.O1O(R.string.tip);
        r0.iOO1ii1(r6);
        r0.I0iXXO(false);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new s12(r7, r5));
        r0.X1IX(R.string.confirm, new t12(r5));
        View r8 = ii1XXIXi.OXO1(r5);
        if (r8 == null) goto L6;
        r8.post(new u12(r5, r0));
        return;
    }

    public final void I1XOi1(@aa1 AppCompatActivity r5, @aa1 View r6, @aa1 String r7) {
        Intrinsics.X0O(r5, "activity");
        Intrinsics.X0O(r6, "rootView");
        Intrinsics.X0O(r7, "hideFlag");
        boolean r0 = a01.OXO1.OXO1().getBoolean(r7, false);
        i1O0OXO1O.OXO1.OXO1("PopManager :" + r7 + " is  " + r0);
        if (r0 == true) goto L6;
        XiOIii1(r5, r6, r7);
        return;
    }

    public final void IIX1OXO(final AppCompatActivity r6, String r7) {
        final View r0 = r6.getWindow().getDecorView().findViewById(android.R.id.content);
        int r4 = 0;
        final go0 r1 = new go0(r6, r4, 2, null);
        r1.O1O(R.string.tip);
        r1.iOO1ii1(r7);
        r1.I0iXXO(true);
        r1.iX1O1(Integer.valueOf(R.string.cancel), new y12());
        r1.X1IX(R.string.confirm, new z12(r6));
        r0.post(new a22(r6, r1, r0));
    }

    public final Object OIX0iXi(Continuation<? super Unit> r1) {
        return Unit.OXO1;
    }

    public final void OiIIX101O(@aa1 View r8, @aa1 AppCompatActivity r9, @aa1 Function1<? super Continuation<? super Unit>, ? extends Object> r10) {
        Intrinsics.X0O(r8, "rootView");
        Intrinsics.X0O(r9, "activity");
        Intrinsics.X0O(r10, "action");
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r9), null, null, new PopManager$showLoadPop$1(r9, r10, r8, null), 3, null);
    }

    public final void XiOIii1(@aa1 final AppCompatActivity r5, @aa1 final View r6, @aa1 final String r7) {
        Intrinsics.X0O(r5, "activity");
        Intrinsics.X0O(r6, "rootView");
        Intrinsics.X0O(r7, "hideFlag");
        final lu5 r0 = lu5.IiI10X.OXO1(r7);
        final z16 r1 = new z16(r5);
        r1.X11iII1O1(r0.XXI());
        r1.XXX11i(r0.X1ii());
        r1.XXIIO1i11(Integer.valueOf(r0.I0iXXO()));
        r1.X1IX(Boolean.valueOf(a01.OXO1.OXO1().getBoolean(r7, false)));
        r1.iX().setOnCheckedChangeListener(new v12(r7));
        r1.OII().setOnClickListener(new w12(r5, r0));
        r6.post(new x12(r1, r6));
    }
}
