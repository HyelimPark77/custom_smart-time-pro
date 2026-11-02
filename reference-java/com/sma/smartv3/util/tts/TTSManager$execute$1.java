package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.jl5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.tts.TTSManager$execute$1", m39466f = "TTSManager.kt", m39467i = {0}, m39468l = {28}, m39469m = "invokeSuspend", m39470n = {"$this$launch"}, m39472s = {"L$0"}, m39473v = 1)
public final class TTSManager$execute$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ TTSData $ttsData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TTSManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTSManager$execute$1(TTSManager tTSManager, TTSData tTSData, Continuation<? super TTSManager$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = tTSManager;
        this.$ttsData = tTSData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TTSManager$execute$1 tTSManager$execute$1 = new TTSManager$execute$1(this.this$0, this.$ttsData, continuation);
        tTSManager$execute$1.L$0 = obj;
        return tTSManager$execute$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((TTSManager$execute$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        X1XXX0I0 x1xxx0i0;
        i00OIXiO i00oixio = (i00OIXiO) this.L$0;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            jl5 jl5Var = this.this$0.OXO1;
            if (jl5Var != null) {
                TTSData tTSData = this.$ttsData;
                this.L$0 = SpillingKt.OXO1(i00oixio);
                this.label = 1;
                obj = jl5Var.OXO1(tTSData, i00oixio, this);
                if (obj == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                str = null;
            }
            x1xxx0i0 = this.this$0.XIi00iiXO;
            if (x1xxx0i0 != null) {
                x1xxx0i0.mo1187iO(str);
            }
            return Unit.OXO1;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        str = (String) obj;
        x1xxx0i0 = this.this$0.XIi00iiXO;
        if (x1xxx0i0 != null) {
            x1xxx0i0.mo1187iO(str);
        }
        return Unit.OXO1;
    }
}
