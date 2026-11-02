package com.sma.smartv3.p610ui.translate;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iXOIii;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.sma.smartv3.util.audio_recorder.AudioFileOutputManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.LocalAudioInputService$start$1", m39466f = "LocalAudioInputService.kt", m39467i = {0}, m39468l = {31}, m39469m = "invokeSuspend", m39470n = {"$this$launch"}, m39472s = {"L$0"}, m39473v = 1)
public final class LocalAudioInputService$start$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ iXOIii $sink;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocalAudioInputService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAudioInputService$start$1(LocalAudioInputService localAudioInputService, iXOIii ixoiii, Continuation<? super LocalAudioInputService$start$1> continuation) {
        super(2, continuation);
        this.this$0 = localAudioInputService;
        this.$sink = ixoiii;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalAudioInputService$start$1 localAudioInputService$start$1 = new LocalAudioInputService$start$1(this.this$0, this.$sink, continuation);
        localAudioInputService$start$1.L$0 = obj;
        return localAudioInputService$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((LocalAudioInputService$start$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final i00OIXiO i00oixio = (i00OIXiO) this.L$0;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            ii0iIIX0<byte[]> ii0iiix0O00 = this.this$0.OXO1.O00();
            final iXOIii ixoiii = this.$sink;
            final LocalAudioInputService localAudioInputService = this.this$0;
            IXiXI<? super byte[]> iXiXI = new IXiXI() { // from class: com.sma.smartv3.ui.translate.LocalAudioInputService$start$1.1

                /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.LocalAudioInputService$start$1$1$2 */
                @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.LocalAudioInputService$start$1$1$2", m39466f = "LocalAudioInputService.kt", m39467i = {}, m39468l = {34}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
                    final /* synthetic */ byte[] $audio;
                    int label;
                    final /* synthetic */ LocalAudioInputService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(LocalAudioInputService localAudioInputService, byte[] bArr, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = localAudioInputService;
                        this.$audio = bArr;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.this$0, this.$audio, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objI0iXXO = C2798pb.I0iXXO();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.X1ii(obj);
                            AudioFileOutputManager audioFileOutputManager = this.this$0.XIi00iiXO;
                            if (audioFileOutputManager != null) {
                                byte[] bArr = this.$audio;
                                this.label = 1;
                                if (audioFileOutputManager.IiI10X(bArr, this) == objI0iXXO) {
                                    return objI0iXXO;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.X1ii(obj);
                        }
                        return Unit.OXO1;
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public final Object emit(byte[] bArr, Continuation<? super Unit> continuation) {
                    iXOIii ixoiii2 = ixoiii;
                    if (ixoiii2 != null) {
                        XX01Oi.IiI10X(i00oixio, null, null, new LocalAudioInputService$start$1$1$1$1(ixoiii2, bArr, null), 3, null);
                    }
                    XX01Oi.IiI10X(i00oixio, null, null, new AnonymousClass2(localAudioInputService, bArr, null), 3, null);
                    return Unit.OXO1;
                }
            };
            this.L$0 = SpillingKt.OXO1(i00oixio);
            this.label = 1;
            if (ii0iiix0O00.collect(iXiXI, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        return Unit.OXO1;
    }
}
