package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.qr;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.ui.translate.AudioRepository;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectTranslatorState$1", f = "LocalSparkChainTranslateUseCase.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class LocalSparkChainTranslateUseCase$collectTranslatorState$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    public static final class OXO1<T> implements IXiXI {
        public final /* synthetic */ LocalSparkChainTranslateUseCase IO;

        public OXO1(LocalSparkChainTranslateUseCase r1) {
            this.IO = r1;
        }

        public static final Unit IiI10X(LocalSparkChainTranslateUseCase r1, byte[] r2) {
            Intrinsics.X0O(r2, "data");
            LocalSparkChainTranslateUseCase.XOO0ii0(r1).OIi0(r2);
            return Unit.OXO1;
        }

        public static /* synthetic */ Unit OXO1(LocalSparkChainTranslateUseCase r0, byte[] r1) {
            return IiI10X(r0, r1);
        }

        public final Object O00(O00 r3, Continuation<? super Unit> r4) {
            i1O0OXO1O.OXO1.OXO1(LocalSparkChainTranslateUseCase.IiI10X(this.IO) + " STATE :" + r3);
            if ((r3 instanceof O00.iO) == false) goto L6;
            AudioRepository r5 = LocalSparkChainTranslateUseCase.iO(this.IO);
            final LocalSparkChainTranslateUseCase r6 = this.IO;
            r5.OXO1(new qr(r6));
        L10:
            return Unit.OXO1;
        L6:
            if ((r3 instanceof O00.OXO1) == false) goto L8;
            ToastUtils.showLong(((O00.OXO1) r3).IiI10X(), new Object[0]);
            LocalSparkChainTranslateUseCase.iO(this.IO).stop();
            goto L10
        L8:
            LocalSparkChainTranslateUseCase.iO(this.IO).stop();
            goto L10
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return O00((O00) r1, r2);
        }
    }

    public LocalSparkChainTranslateUseCase$collectTranslatorState$1(LocalSparkChainTranslateUseCase r1, Continuation<? super LocalSparkChainTranslateUseCase$collectTranslatorState$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new LocalSparkChainTranslateUseCase$collectTranslatorState$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalSparkChainTranslateUseCase$collectTranslatorState$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L6;
        ResultKt.X1ii(r5);
    L12:
        throw new KotlinNothingValueException();
    L6:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r5);
        k85<O00> r6 = this.this$0.IIX1OXO();
        OXO1 r2 = new OXO1(this.this$0);
        this.label = 1;
        if (r6.collect(r2, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
