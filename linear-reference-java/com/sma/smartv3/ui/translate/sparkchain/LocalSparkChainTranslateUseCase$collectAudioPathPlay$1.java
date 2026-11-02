package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.pr;
import com.sma.smartv3.db.entity.AIRecords;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectAudioPathPlay$1", f = "LocalSparkChainTranslateUseCase.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class LocalSparkChainTranslateUseCase$collectAudioPathPlay$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements IXiXI {
        public final /* synthetic */ LocalSparkChainTranslateUseCase IO;

        public AnonymousClass1(LocalSparkChainTranslateUseCase r1) {
            this.IO = r1;
        }

        public static final Unit IiI10X(String r1, AIRecords r2) {
            Intrinsics.X0O(r2, "$this$updateAiRecord");
            r2.setMAudioPath(r1);
            return Unit.OXO1;
        }

        public static /* synthetic */ Unit OXO1(String r0, AIRecords r1) {
            return IiI10X(r0, r1);
        }

        public final Object O00(final String r5, Continuation<? super Unit> r6) {
            if ((r6 instanceof LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1) == false) goto L7;
            LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1 r0 = (LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1) r6;
            int r1 = r0.label;
            if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
            r0.label = r1 - Integer.MIN_VALUE;
        L8:
            Object r7 = r0.result;
            Object r2 = pb.I0iXXO();
            int r3 = r0.label;
            if (r3 == 0) goto L14;
            if (r3 != 1) goto L13;
            r5 = (String) r0.L$0;
            ResultKt.X1ii(r7);
        L17:
            LocalSparkChainTranslateUseCase.XIi00iiXO(this.IO).iO(r5);
            return Unit.OXO1;
        L13:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L14:
            ResultKt.X1ii(r7);
            LocalSparkChainTranslateUseCase r8 = this.IO;
            Function1<? super AIRecords, Unit> r4 = new pr(r5);
            r0.L$0 = r5;
            r0.label = 1;
            if (r8.iOOX010X(r4, r0) != r2) goto L17;
            return r2;
        L7:
            r0 = new LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1(this, r6);
            goto L8
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return O00((String) r1, r2);
        }
    }

    public LocalSparkChainTranslateUseCase$collectAudioPathPlay$1(LocalSparkChainTranslateUseCase r1, Continuation<? super LocalSparkChainTranslateUseCase$collectAudioPathPlay$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new LocalSparkChainTranslateUseCase$collectAudioPathPlay$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalSparkChainTranslateUseCase$collectAudioPathPlay$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
        l94<String> r6 = LocalSparkChainTranslateUseCase.OIi0(this.this$0).O00();
        AnonymousClass1 r2 = new AnonymousClass1(this.this$0);
        this.label = 1;
        if (r6.collect(r2, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
