package com.sma.smartv3.ui.trans_charge;

import com.android.mltcode.paycertificationapi.IXOOiIIII;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.trans_charge.AudioOutputService$start$1", f = "AudioOutputService.kt", i = {}, l = {26, 28}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AudioOutputService$start$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ i00OIXiO $scope;
    int label;
    final /* synthetic */ AudioOutputService this$0;

    public static final class OXO1<T> implements IXiXI {
        public final /* synthetic */ AudioOutputService IO;

        public OXO1(AudioOutputService r1) {
            this.IO = r1;
        }

        public final Object OXO1(ByteString r2, Continuation<? super Unit> r3) {
            Object r4 = AudioOutputService.iO(this.IO).IiI10X(r2.toByteArray(), r3);
            if (r4 != pb.I0iXXO()) goto L6;
            return r4;
        L6:
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return OXO1((ByteString) r1, r2);
        }
    }

    public AudioOutputService$start$1(AudioOutputService r1, i00OIXiO r2, Continuation<? super AudioOutputService$start$1> r3) {
        this.this$0 = r1;
        this.$scope = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new AudioOutputService$start$1(this.this$0, this.$scope, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AudioOutputService$start$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L7;
        ResultKt.X1ii(r5);
    L17:
        throw new KotlinNothingValueException();
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r5);
    L13:
        AudioOutputService.iO(this.this$0).XIi00iiXO(this.$scope);
        l94<ByteString> r6 = AudioOutputService.O00(this.this$0).XIi00iiXO();
        OXO1 r2 = new OXO1(this.this$0);
        this.label = 2;
        if (r6.collect(r2, this) != r0) goto L17;
    L15:
        return r0;
    L10:
        ResultKt.X1ii(r5);
        IXOOiIIII r7 = AudioOutputService.iO(this.this$0);
        this.label = 1;
        if (r7.XO0O10(this) != r0) goto L13;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
