package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
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
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.AudioOutStreamManager$start$1", m39466f = "AudioOutStreamManager.kt", m39467i = {}, m39468l = {22}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioOutStreamManager$start$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AudioOutStreamManager this$0;

    public static final class OXO1<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ AudioOutStreamManager f54871IO;

        public OXO1(AudioOutStreamManager audioOutStreamManager) {
            this.f54871IO = audioOutStreamManager;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public final Object emit(ByteString byteString, Continuation<? super Unit> continuation) {
            this.f54871IO.XIi00iiXO.X1ii(byteString.toByteArray());
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioOutStreamManager$start$1(AudioOutStreamManager audioOutStreamManager, Continuation<? super AudioOutStreamManager$start$1> continuation) {
        super(2, continuation);
        this.this$0 = audioOutStreamManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioOutStreamManager$start$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AudioOutStreamManager$start$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            l94<ByteString> l94VarXIi00iiXO = this.this$0.OXO1.XIi00iiXO();
            OXO1 oxo1 = new OXO1(this.this$0);
            this.label = 1;
            if (l94VarXIi00iiXO.collect(oxo1, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        throw new KotlinNothingValueException();
    }
}
