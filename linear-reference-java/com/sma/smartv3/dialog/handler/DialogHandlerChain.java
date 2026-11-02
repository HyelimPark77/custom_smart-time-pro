package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XiOIO;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,79:1\n116#2,10:80\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain\n*L\n75#1:80,10\n*E\n"})
public final class DialogHandlerChain {

    @aa1
    public static final DialogHandlerChain OXO1 = null;

    @aa1
    public static final List<OiOI0Iii0> XIi00iiXO = null;

    @aa1
    public static final uy0 iO = null;

    static {
        OXO1 = new DialogHandlerChain();
        XIi00iiXO = new ArrayList();
        iO = MutexKt.XIi00iiXO(false, 1, null);
    }

    public DialogHandlerChain() {
    }

    public static final /* synthetic */ List OXO1() {
        return XIi00iiXO;
    }

    public static final /* synthetic */ uy0 XIi00iiXO() {
        return iO;
    }

    @aa1
    public final DialogHandlerChain IiI10X(@aa1 OiOI0Iii0... r2) {
        Intrinsics.X0O(r2, "handler");
        OIXO1IIOO.Oi(XIi00iiXO, r2);
        return this;
    }

    @aa1
    public final XiOIO O00(@aa1 FragmentActivity r8) {
        Intrinsics.X0O(r8, "activity");
        return I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r8), IXOX0Xiii.O00(), null, new DialogHandlerChain$dispatchNoPriority$1(r8, null), 2, null);
    }

    @aa1
    public final XiOIO XO0O10(@aa1 FragmentActivity r8) {
        Intrinsics.X0O(r8, "activity");
        return I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r8), IXOX0Xiii.O00(), null, new DialogHandlerChain$dispatch$1(r8, null), 2, null);
    }

    @tb1
    public final Object iO(@aa1 Continuation<? super Unit> r6) {
        if ((r6 instanceof DialogHandlerChain$clear$1) == false) goto L7;
        DialogHandlerChain$clear$1 r0 = (DialogHandlerChain$clear$1) r6;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        uy0 r4 = (uy0) r0.L$0;
        ResultKt.X1ii(r7);
    L24:
        XIi00iiXO.clear();     // Catch: Throwable -> L21
        Unit r8 = Unit.OXO1;     // Catch: Throwable -> L21
        r4.unlock(null);
        return r8;
    L21:
        th = move-exception;
        r4.unlock(null);
        throw th;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r7);
        uy0 r9 = iO;
        r0.L$0 = r9;
        r0.I$0 = 0;
        r0.label = 1;
        if (r9.lock(null, r0) != r2) goto L17;
        return r2;
    L17:
        r4 = r9;
    L7:
        r0 = new DialogHandlerChain$clear$1(this, r6);
        goto L8
    }
}
