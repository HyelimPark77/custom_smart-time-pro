package com.sma.smartv3.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ii1XXIXi;
import com.android.mltcode.paycertificationapi.lp4;
import com.android.mltcode.paycertificationapi.lu5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.yy5;
import com.android.mltcode.paycertificationapi.z16;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.PopManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPopManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopManager.kt\ncom/sma/smartv3/util/PopManager\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n87#2,7:153\n94#2,3:161\n70#2,7:164\n97#2:171\n1#3:160\n*S KotlinDebug\n*F\n+ 1 PopManager.kt\ncom/sma/smartv3/util/PopManager\n*L\n55#1:153,7\n55#1:161,3\n55#1:164,7\n55#1:171\n55#1:160\n*E\n"})
public final class PopManager {

    @aa1
    public static final PopManager OXO1 = new PopManager();

    /* JADX INFO: renamed from: I1 */
    public static final void m38835I1(z16 z16Var, View view) {
        z16Var.XiOIO(view);
    }

    public static final boolean O10IXXX0X(Activity activity) {
        if (!lp4.OXO1()) {
            return true;
        }
        yy5.OIX0iXi(yy5.OXO1, activity, null, 2, null);
        return true;
    }

    public static final void OII(String str, CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        LogUtils.m11128d("isChecked = " + z);
        a01.OXO1.OXO1().put(str, z);
    }

    /* JADX INFO: renamed from: OX */
    public static final void m38837OX(AppCompatActivity appCompatActivity, lu5 lu5Var, View view) {
        String str;
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            str = "2";
        } else {
            str = q62Var.X0100I() ? "3" : "1";
        }
        String str2 = "https://api.iot-solution.net/videoPlayer/?type=" + str + "&id=" + lu5Var.OIX0iXi();
        int iM38573iO = WebViewActivity.Companion.m38573iO();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", str2);
        bundle.putInt("mArg1", iM38573iO);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(appCompatActivity, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        appCompatActivity.startActivity(intent);
    }

    public static final void X0O(Activity activity, go0 go0Var) {
        if (activity.isDestroyed()) {
            return;
        }
        View viewOXO1 = ii1XXIXi.OXO1(activity);
        Intrinsics.XXI(viewOXO1);
        go0Var.XiOIO(viewOXO1);
    }

    public static final boolean X1ii(boolean z, Activity activity) {
        if (!z) {
            return true;
        }
        activity.finish();
        return true;
    }

    public static final void XX0(AppCompatActivity appCompatActivity, go0 go0Var, View view) {
        if (appCompatActivity.isDestroyed()) {
            return;
        }
        Intrinsics.XXI(view);
        go0Var.XiOIO(view);
    }

    public static /* synthetic */ void XXI(PopManager popManager, Activity activity, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        popManager.I0iXXO(activity, str, z);
    }

    public static final boolean XiOIO() {
        return true;
    }

    public static final boolean iIiiO(AppCompatActivity appCompatActivity) {
        i72.OXO1.Oi1I(appCompatActivity);
        return true;
    }

    public final void I0iXXO(@aa1 final Activity activity, @aa1 String message, final boolean z) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(message, "message");
        final go0 go0Var = new go0(activity, 0, 2, null);
        go0Var.O1O(R.string.tip);
        go0Var.iOO1ii1(message);
        go0Var.I0iXXO(false);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.s12
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(PopManager.X1ii(z, activity));
            }
        });
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.t12
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(PopManager.O10IXXX0X(activity));
            }
        });
        View viewOXO1 = ii1XXIXi.OXO1(activity);
        if (viewOXO1 != null) {
            viewOXO1.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.u12
                @Override // java.lang.Runnable
                public final void run() {
                    PopManager.X0O(activity, go0Var);
                }
            });
        }
    }

    public final void I1XOi1(@aa1 AppCompatActivity activity, @aa1 View rootView, @aa1 String hideFlag) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(rootView, "rootView");
        Intrinsics.X0O(hideFlag, "hideFlag");
        boolean z = a01.OXO1.OXO1().getBoolean(hideFlag, false);
        i1O0OXO1O.OXO1.OXO1("PopManager :" + hideFlag + " is  " + z);
        if (z) {
            return;
        }
        XiOIii1(activity, rootView, hideFlag);
    }

    public final void IIX1OXO(final AppCompatActivity appCompatActivity, String str) {
        final View viewFindViewById = appCompatActivity.getWindow().getDecorView().findViewById(android.R.id.content);
        final go0 go0Var = new go0(appCompatActivity, 0, 2, null);
        go0Var.O1O(R.string.tip);
        go0Var.iOO1ii1(str);
        go0Var.I0iXXO(true);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.y12
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(PopManager.XiOIO());
            }
        });
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.z12
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(PopManager.iIiiO(appCompatActivity));
            }
        });
        viewFindViewById.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.a22
            @Override // java.lang.Runnable
            public final void run() {
                PopManager.XX0(appCompatActivity, go0Var, viewFindViewById);
            }
        });
    }

    public final Object OIX0iXi(Continuation<? super Unit> continuation) {
        return Unit.OXO1;
    }

    public final void OiIIX101O(@aa1 View rootView, @aa1 AppCompatActivity activity, @aa1 Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.X0O(rootView, "rootView");
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(action, "action");
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new PopManager$showLoadPop$1(activity, action, rootView, null), 3, null);
    }

    public final void XiOIii1(@aa1 final AppCompatActivity activity, @aa1 final View rootView, @aa1 final String hideFlag) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(rootView, "rootView");
        Intrinsics.X0O(hideFlag, "hideFlag");
        final lu5 lu5VarOXO1 = lu5.IiI10X.OXO1(hideFlag);
        final z16 z16Var = new z16(activity);
        z16Var.X11iII1O1(lu5VarOXO1.XXI());
        z16Var.XXX11i(lu5VarOXO1.X1ii());
        z16Var.XXIIO1i11(Integer.valueOf(lu5VarOXO1.I0iXXO()));
        z16Var.X1IX(Boolean.valueOf(a01.OXO1.OXO1().getBoolean(hideFlag, false)));
        z16Var.m3361iX().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.v12
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PopManager.OII(hideFlag, compoundButton, z);
            }
        });
        z16Var.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.w12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PopManager.m38837OX(activity, lu5VarOXO1, view);
            }
        });
        rootView.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.x12
            @Override // java.lang.Runnable
            public final void run() {
                PopManager.m38835I1(z16Var, rootView);
            }
        });
    }
}
