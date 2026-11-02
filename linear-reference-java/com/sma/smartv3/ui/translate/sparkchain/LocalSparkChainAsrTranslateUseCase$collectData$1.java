package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1iII1i1;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1", f = "LocalSparkChainAsrTranslateUseCase.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nLocalSparkChainAsrTranslateUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSparkChainAsrTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,137:1\n32#2:138\n17#2:139\n19#2:143\n17#2:144\n19#2:148\n49#2:149\n51#2:153\n46#3:140\n51#3:142\n46#3:145\n51#3:147\n46#3:150\n51#3:152\n105#4:141\n105#4:146\n105#4:151\n*S KotlinDebug\n*F\n+ 1 LocalSparkChainAsrTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$1\n*L\n76#1:138\n76#1:139\n76#1:143\n77#1:144\n77#1:148\n78#1:149\n78#1:153\n76#1:140\n76#1:142\n77#1:145\n77#1:147\n78#1:150\n78#1:152\n76#1:141\n77#1:146\n78#1:151\n*E\n"})
public final class LocalSparkChainAsrTranslateUseCase$collectData$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainAsrTranslateUseCase this$0;

    public static final class OXO1<T> implements IXiXI {
        public final /* synthetic */ LocalSparkChainAsrTranslateUseCase IO;

        public OXO1(LocalSparkChainAsrTranslateUseCase r1) {
            this.IO = r1;
        }

        public final Object OXO1(String r3, Continuation<? super Unit> r4) {
            LocalSparkChainAsrTranslateUseCase.IiI10X(this.IO).XO0O10(r3, LocalSparkChainAsrTranslateUseCase.O00(this.IO).X0O(), LocalSparkChainAsrTranslateUseCase.O00(this.IO).iIiiO());
            this.IO.I1();
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return OXO1((String) r1, r2);
        }
    }

    public LocalSparkChainAsrTranslateUseCase$collectData$1(LocalSparkChainAsrTranslateUseCase r1, Continuation<? super LocalSparkChainAsrTranslateUseCase$collectData$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new LocalSparkChainAsrTranslateUseCase$collectData$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalSparkChainAsrTranslateUseCase$collectData$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r5);
    L12:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r5);
        final l94<i1iII1i1> r6 = this.this$0.O10IXXX0X();
        final ii0iIIX0<Object> r2 = new LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filterIsInstance$1(r6);
        final ii0iIIX0<i1iII1i1> r7 = new LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filter$1(r2);
        ii0iIIX0<String> r3 = new LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$map$1(r7);
        OXO1 r8 = new OXO1(this.this$0);
        this.label = 1;
        if (r3.collect(r8, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
