package com.sma.smartv3.util;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityUtilKt {

    public static final class OXO1 implements IXiXI, FunctionAdapter {
        public final /* synthetic */ Function2<Object, Continuation<Object>, Object> IO;

        /* JADX WARN: Multi-variable type inference failed */
        public OXO1(Function2<Object, ? super Continuation<Object>, ? extends Object> r2) {
            Intrinsics.X0O(r2, "function");
            this.IO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public final /* synthetic */ Object emit(Object r2, Continuation r3) {
            return invoke(r2, r3);
        }

        public final boolean equals(@tb1 Object r3) {
            if ((r3 instanceof IXiXI) == true) goto L5;
        L8:
            return false;
        L5:
            if ((r3 instanceof FunctionAdapter) == false) goto L8;
            return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) r3).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void O00(@aa1 LifecycleOwner r7, @aa1 Function2<? super i00OIXiO, ? super Continuation<? super Unit>, ? extends Object> r8) {
        Intrinsics.X0O(r7, "<this>");
        Intrinsics.X0O(r8, "block");
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r7), null, null, new ActivityUtilKt$repeatLifeCycle$1(r7, r8, null), 3, null);
    }

    public static final <T> void OXO1(@aa1 LifecycleOwner r8, @aa1 ii0iIIX0<? extends T> r9, @aa1 Lifecycle.State r10, @aa1 Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> r11) {
        Intrinsics.X0O(r8, "<this>");
        Intrinsics.X0O(r9, "flow");
        Intrinsics.X0O(r10, "state");
        Intrinsics.X0O(r11, "collector");
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r8), null, null, new ActivityUtilKt$collectInLifecycle$1(r8, r10, r9, r11, null), 3, null);
    }

    public static /* synthetic */ void XIi00iiXO(LifecycleOwner r0, ii0iIIX0 r1, Lifecycle.State r2, Function2 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = Lifecycle.State.STARTED;
    L5:
        OXO1(r0, r1, r2, r3);
    }

    public static final void XO0O10(@aa1 AppCompatActivity r3) {
        Intrinsics.X0O(r3, "<this>");
        int r2 = 1;
        if (SPUtils.getInstance().getBoolean(BaseActivity.SCREEN_ORIENTATION_PORTRAIT, true) == true) goto L6;
        r2 = -1;
    L6:
        r3.setRequestedOrientation(r2);
    }

    public static final void iO(@aa1 AppCompatActivity r2) {
        Intrinsics.X0O(r2, "<this>");
        if (r2.getResources().getConfiguration().orientation != 2) goto L5;
        int r0 = 0;
    L6:
        r2.setRequestedOrientation(r0);
        return;
    L5:
        r0 = 1;
        goto L6
    }
}
