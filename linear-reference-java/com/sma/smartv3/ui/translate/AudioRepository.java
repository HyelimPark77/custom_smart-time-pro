package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X0I1OO1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b06;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1Ii0IIi0;
import com.android.mltcode.paycertificationapi.iXOIii;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioRepository implements b06 {

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final i1Ii0IIi0 XIi00iiXO;

    @aa1
    public final k85<Boolean> XO0O10;

    @aa1
    public final X0I1OO1 iO;

    public static final class OXO1 implements iXOIii {
        public final /* synthetic */ Function1<byte[], Unit> OXO1;

        /* JADX WARN: Multi-variable type inference failed */
        public OXO1(Function1<? super byte[], Unit> r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.iXOIii
        public final Object OXO1(byte[] r1, Continuation<? super Unit> r2) {
            invoke(r1);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.AudioRepository$stop$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.AudioRepository$stop$1", f = "AudioRepository.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudioRepository this$0;

        public AnonymousClass1(AudioRepository r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L12:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            X0I1OO1 r5 = AudioRepository.XIi00iiXO(this.this$0);
            this.label = 1;
            if (r5.XIi00iiXO(this) != r0) goto L12;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public AudioRepository(@aa1 i00OIXiO r2, @aa1 i1Ii0IIi0 r3, @aa1 X0I1OO1 r4) {
        Intrinsics.X0O(r2, "scope");
        Intrinsics.X0O(r3, "audioOutput");
        Intrinsics.X0O(r4, "audioInput");
        this.OXO1 = r2;
        this.XIi00iiXO = r3;
        this.iO = r4;
        this.XO0O10 = r4.iO();
    }

    public static /* synthetic */ void I0iXXO(AudioRepository r0, iXOIii r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.OIX0iXi(r1);
    }

    public static /* synthetic */ void IO(AudioRepository r0, boolean r1, iXOIii r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.OIi0(r1, r2);
    }

    public static final /* synthetic */ X0I1OO1 XIi00iiXO(AudioRepository r0) {
        return r0.iO;
    }

    public final void I0IIOi(@tb1 iXOIii r3) {
        IiI10X(this.OXO1, r3);
    }

    @tb1
    public final Object I1XOi1(@aa1 Continuation<? super Unit> r2) {
        Object r3 = XIi00iiXO(r2);
        if (r3 != pb.I0iXXO()) goto L6;
        return r3;
    L6:
        return Unit.OXO1;
    }

    public final void IiI10X() {
        OXO1(this.OXO1);
    }

    @tb1
    public final Object O00(@aa1 Continuation<? super String> r3) {
        return XO0O10(this.OXO1, r3);
    }

    @aa1
    public final XiOIO O10IXXX0X() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new AudioRepository$stopRecordAndStreamPlayer$1(this, null), 2, null);
    }

    public final void OIX0iXi(@tb1 iXOIii r3) {
        IiI10X(this.OXO1, r3);
        OXO1(this.OXO1);
    }

    public final void OIi0(boolean r3, @tb1 iXOIii r4) {
        IiI10X(this.OXO1, r4);
        if (r3 == false) goto L6;
        IiI10X();
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.b06
    public void OXO1(@aa1 Function1<? super byte[], Unit> r4) {
        Intrinsics.X0O(r4, "audioByte");
        IiI10X(this.OXO1, new OXO1(r4));
    }

    @tb1
    public final Object X0O(@aa1 Continuation<? super Unit> r2) {
        Object r3 = XIi00iiXO(r2);
        if (r3 != pb.I0iXXO()) goto L6;
        return r3;
    L6:
        return Unit.OXO1;
    }

    @aa1
    public final XiOIO X1ii() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new AudioRepository$stopRecord$1(this, null), 2, null);
    }

    @tb1
    public final Object XO0O10(@aa1 Continuation<? super String> r3) {
        return XO0O10(this.OXO1, r3);
    }

    public final void XOO0ii0() {
        play();
    }

    @tb1
    public final Object XXI(@aa1 Continuation<? super Unit> r7) {
        if ((r7 instanceof AudioRepository$stopAllJob$1) == false) goto L7;
        AudioRepository$stopAllJob$1 r0 = (AudioRepository$stopAllJob$1) r7;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L22;
        if (r3 == 1) goto L20;
        if (r3 != 2) goto L19;
        ResultKt.X1ii(r8);     // Catch: Throwable -> L14 Exception -> L16
    L29:
        clear();     // Catch: Throwable -> L14 Exception -> L16
        clear();     // Catch: Throwable -> L14 Exception -> L16
    L30:
        I0IIOi.IiI10X(this.OXO1, null, 1, null);
        return Unit.OXO1;
    L19:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L20:
        ResultKt.X1ii(r8);     // Catch: Throwable -> L14 Exception -> L16
    L26:
        i1Ii0IIi0 r9 = this.XIi00iiXO;     // Catch: Throwable -> L14 Exception -> L16
        r0.label = 2;     // Catch: Throwable -> L14 Exception -> L16
        if (r9.XIi00iiXO(r0) != r2) goto L29;
    L28:
        return r2;
    L22:
        ResultKt.X1ii(r8);
        X0I1OO1 r10 = this.iO;     // Catch: Throwable -> L14 Exception -> L16
        r0.label = 1;     // Catch: Throwable -> L14 Exception -> L16
        if (r10.XIi00iiXO(r0) != r2) goto L26;
    L16:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        I0IIOi.IiI10X(this.OXO1, null, 1, null);
        throw th;
    L7:
        r0 = new AudioRepository$stopAllJob$1(this, r7);
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.b06
    @aa1
    public k85<Boolean> iO() {
        return this.XO0O10;
    }

    @Override // com.android.mltcode.paycertificationapi.b06
    public void stop() {
        I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new AnonymousClass1(this, null), 2, null);
    }
}
