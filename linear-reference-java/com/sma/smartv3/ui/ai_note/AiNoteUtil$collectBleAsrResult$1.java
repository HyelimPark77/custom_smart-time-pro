package com.sma.smartv3.ui.ai_note;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.xp5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1", f = "AiNoteUtil.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nAiNoteUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,238:1\n17#2:239\n19#2:243\n46#3:240\n51#3:242\n105#4:241\n*S KotlinDebug\n*F\n+ 1 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n*L\n152#1:239\n152#1:243\n152#1:240\n152#1:242\n152#1:241\n*E\n"})
public final class AiNoteUtil$collectBleAsrResult$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1$1", f = "AiNoteUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<mq4, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            AnonymousClass1 r0 = new AnonymousClass1(r3);
            r0.L$0 = r2;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(mq4 r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            mq4 r0 = (mq4) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            r0.I0iXXO();
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(mq4 r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public static final class OXO1<T> implements IXiXI {
        public static final OXO1<T> IO = null;

        static {
            IO = new OXO1();
        }

        public OXO1() {
        }

        public final Object OXO1(mq4 r14, Continuation<? super Unit> r15) {
            mq4 r16 = (mq4) AiNoteUtil.X0O().getValue();
            String r0 = r16.OIi0();
            String r1 = r14.OIi0();
            String r2 = "";
            if (r1 != null) goto L5;
            r1 = "";
        L5:
            String r6 = r0 + r1;
            String r17 = r16.X1ii();
            String r3 = r14.X1ii();
            if (r3 == null) goto L9;
            r2 = r3;
        L9:
            Integer r5 = null;
            String r8 = null;
            AiNoteUtil.X0O().setValue(new mq4(r5, r6, r14.OIX0iXi(), r8, r17 + r2, null, 41, null));
            String r18 = r14.OIi0();
            if (r18 == null) goto L12;
            String r19 = xp5.OXO1(r18);
        L13:
            String r110 = r14.X1ii();
            if (r110 == null) goto L16;
            String r111 = xp5.OXO1(r110);
        L17:
            AiNoteUtil r4 = AiNoteUtil.OXO1;
            AiNoteUtil.iX1O1(r4, r19, 0, 2, null);
            if (AiNoteUtil.I1XOi1() == true) goto L21;
            AiNoteUtil.IIX1OXO(r4, r111, 1);
        L21:
            return Unit.OXO1;
        L16:
            r111 = null;
            goto L17
        L12:
            r19 = null;
            goto L13
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return OXO1((mq4) r1, r2);
        }
    }

    public AiNoteUtil$collectBleAsrResult$1(Continuation<? super AiNoteUtil$collectBleAsrResult$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new AiNoteUtil$collectBleAsrResult$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AiNoteUtil$collectBleAsrResult$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
        final ii0iIIX0 r6 = iX0XiO.OXi001(AiNoteUtil.O10IXXX0X(AiNoteUtil.OXO1).IiI10X(), new AnonymousClass1(null));
        ii0iIIX0<mq4> r2 = new AiNoteUtil$collectBleAsrResult$1$invokeSuspend$$inlined$filter$1(r6);
        IXiXI<? super mq4> r7 = OXO1.IO;
        this.label = 1;
        if (r2.collect(r7, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
