package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
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
    public static final DialogHandlerChain OXO1 = new DialogHandlerChain();

    @aa1
    public static final List<OiOI0Iii0> XIi00iiXO = new ArrayList();

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final uy0 f51198iO = MutexKt.XIi00iiXO(false, 1, null);

    @aa1
    public final DialogHandlerChain IiI10X(@aa1 OiOI0Iii0... handler) {
        Intrinsics.X0O(handler, "handler");
        OIXO1IIOO.m878Oi(XIi00iiXO, handler);
        return this;
    }

    @aa1
    public final XiOIO O00(@aa1 FragmentActivity activity) {
        Intrinsics.X0O(activity, "activity");
        return XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(activity), IXOX0Xiii.O00(), null, new DialogHandlerChain$dispatchNoPriority$1(activity, null), 2, null);
    }

    @aa1
    public final XiOIO XO0O10(@aa1 FragmentActivity activity) {
        Intrinsics.X0O(activity, "activity");
        return XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(activity), IXOX0Xiii.O00(), null, new DialogHandlerChain$dispatch$1(activity, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    /* JADX INFO: renamed from: iO */
    public final Object m38201iO(@aa1 Continuation<? super Unit> continuation) {
        DialogHandlerChain$clear$1 dialogHandlerChain$clear$1;
        uy0 uy0Var;
        if (continuation instanceof DialogHandlerChain$clear$1) {
            dialogHandlerChain$clear$1 = (DialogHandlerChain$clear$1) continuation;
            int i = dialogHandlerChain$clear$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dialogHandlerChain$clear$1.label = i - Integer.MIN_VALUE;
            } else {
                dialogHandlerChain$clear$1 = new DialogHandlerChain$clear$1(this, continuation);
            }
        } else {
            dialogHandlerChain$clear$1 = new DialogHandlerChain$clear$1(this, continuation);
        }
        Object obj = dialogHandlerChain$clear$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = dialogHandlerChain$clear$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            uy0 uy0Var2 = f51198iO;
            dialogHandlerChain$clear$1.L$0 = uy0Var2;
            dialogHandlerChain$clear$1.I$0 = 0;
            dialogHandlerChain$clear$1.label = 1;
            if (uy0Var2.lock(null, dialogHandlerChain$clear$1) == objI0iXXO) {
                return objI0iXXO;
            }
            uy0Var = uy0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uy0Var = (uy0) dialogHandlerChain$clear$1.L$0;
            ResultKt.X1ii(obj);
        }
        try {
            XIi00iiXO.clear();
            return Unit.OXO1;
        } finally {
            uy0Var.unlock(null);
        }
    }
}
