package com.sma.smartv3.util;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.XX01Oi;
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

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function2<Object, Continuation<Object>, Object> f54893IO;

        /* JADX WARN: Multi-variable type inference failed */
        public OXO1(Function2<Object, ? super Continuation<Object>, ? extends Object> function) {
            Intrinsics.X0O(function, "function");
            this.f54893IO = function;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public final /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return this.f54893IO.invoke2(obj, continuation);
        }

        public final boolean equals(@tb1 Object obj) {
            if ((obj instanceof IXiXI) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.f54893IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void O00(@aa1 LifecycleOwner lifecycleOwner, @aa1 Function2<? super i00OIXiO, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.X0O(lifecycleOwner, "<this>");
        Intrinsics.X0O(block, "block");
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ActivityUtilKt$repeatLifeCycle$1(lifecycleOwner, block, null), 3, null);
    }

    public static final <T> void OXO1(@aa1 LifecycleOwner lifecycleOwner, @aa1 ii0iIIX0<? extends T> flow, @aa1 Lifecycle.State state, @aa1 Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> collector) {
        Intrinsics.X0O(lifecycleOwner, "<this>");
        Intrinsics.X0O(flow, "flow");
        Intrinsics.X0O(state, "state");
        Intrinsics.X0O(collector, "collector");
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ActivityUtilKt$collectInLifecycle$1(lifecycleOwner, state, flow, collector, null), 3, null);
    }

    public static /* synthetic */ void XIi00iiXO(LifecycleOwner lifecycleOwner, ii0iIIX0 ii0iiix0, Lifecycle.State state, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        OXO1(lifecycleOwner, ii0iiix0, state, function2);
    }

    public static final void XO0O10(@aa1 AppCompatActivity appCompatActivity) {
        Intrinsics.X0O(appCompatActivity, "<this>");
        appCompatActivity.setRequestedOrientation(SPUtils.getInstance().getBoolean(BaseActivity.SCREEN_ORIENTATION_PORTRAIT, true) ? 1 : -1);
    }

    /* JADX INFO: renamed from: iO */
    public static final void m38802iO(@aa1 AppCompatActivity appCompatActivity) {
        Intrinsics.X0O(appCompatActivity, "<this>");
        appCompatActivity.setRequestedOrientation(appCompatActivity.getResources().getConfiguration().orientation == 2 ? 0 : 1);
    }
}
