package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
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
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$2", f = "LocalSparkChainAsrTranslateUseCase.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nLocalSparkChainAsrTranslateUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSparkChainAsrTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,137:1\n17#2:138\n19#2:142\n46#3:139\n51#3:141\n105#4:140\n*S KotlinDebug\n*F\n+ 1 LocalSparkChainAsrTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$2\n*L\n86#1:138\n86#1:142\n86#1:139\n86#1:141\n86#1:140\n*E\n"})
public final class LocalSparkChainAsrTranslateUseCase$collectData$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainAsrTranslateUseCase this$0;

    public static final class OXO1<T> implements IXiXI {
        public final /* synthetic */ LocalSparkChainAsrTranslateUseCase IO;

        public OXO1(LocalSparkChainAsrTranslateUseCase r1) {
            this.IO = r1;
        }

        public final Object OXO1(String r2, Continuation<? super Unit> r3) {
            if (LocalSparkChainAsrTranslateUseCase.O00(this.IO).OiIIX101O() == false) goto L6;
            LocalSparkChainAsrTranslateUseCase.IO(this.IO).I0IIOi(r2, LocalSparkChainAsrTranslateUseCase.O00(this.IO).XiOIO());
        L6:
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return OXO1((String) r1, r2);
        }
    }

    public LocalSparkChainAsrTranslateUseCase$collectData$2(LocalSparkChainAsrTranslateUseCase r1, Continuation<? super LocalSparkChainAsrTranslateUseCase$collectData$2> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new LocalSparkChainAsrTranslateUseCase$collectData$2(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalSparkChainAsrTranslateUseCase$collectData$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
        final l94<String> r6 = this.this$0.IIX1OXO();
        ii0iIIX0<String> r2 = new LocalSparkChainAsrTranslateUseCase$collectData$2$invokeSuspend$$inlined$filter$1(r6);
        OXO1 r7 = new OXO1(this.this$0);
        this.label = 1;
        if (r2.collect(r7, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
