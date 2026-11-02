package com.sma.smartv3.p610ui.trans_charge;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOOiIIII;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.trans_charge.AudioOutputService$start$1", m39466f = "AudioOutputService.kt", m39467i = {}, m39468l = {26, 28}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioOutputService$start$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ i00OIXiO $scope;
    int label;
    final /* synthetic */ AudioOutputService this$0;

    public static final class OXO1<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ AudioOutputService f54818IO;

        public OXO1(AudioOutputService audioOutputService) {
            this.f54818IO = audioOutputService;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public final Object emit(ByteString byteString, Continuation<? super Unit> continuation) {
            Object objIiI10X = this.f54818IO.XIi00iiXO.IiI10X(byteString.toByteArray(), continuation);
            return objIiI10X == C2798pb.I0iXXO() ? objIiI10X : Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioOutputService$start$1(AudioOutputService audioOutputService, i00OIXiO i00oixio, Continuation<? super AudioOutputService$start$1> continuation) {
        super(2, continuation);
        this.this$0 = audioOutputService;
        this.$scope = i00oixio;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioOutputService$start$1(this.this$0, this.$scope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AudioOutputService$start$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            IXOOiIIII iXOOiIIII = this.this$0.XIi00iiXO;
            this.label = 1;
            if (iXOOiIIII.XO0O10(this) != objI0iXXO) {
            }
            return objI0iXXO;
        }
        if (i == 1) {
            ResultKt.X1ii(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        throw new KotlinNothingValueException();
        this.this$0.XIi00iiXO.XIi00iiXO(this.$scope);
        l94<ByteString> l94VarXIi00iiXO = this.this$0.OXO1.XIi00iiXO();
        OXO1 oxo1 = new OXO1(this.this$0);
        this.label = 2;
    }
}
