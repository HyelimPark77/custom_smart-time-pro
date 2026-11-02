package com.sma.smartv3.initializer;

import android.app.Application;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.initializer.WorkInitializer$onPrivacyAgree$1", f = "WorkInitializer.kt", i = {}, l = {49, 50}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WorkInitializer$onPrivacyAgree$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.initializer.WorkInitializer$onPrivacyAgree$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.initializer.WorkInitializer$onPrivacyAgree$1$1", f = "WorkInitializer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
            return new AnonymousClass1(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            pb.I0iXXO();
            if (this.label != 0) goto L14;
            ResultKt.X1ii(r4);
            WorkInitializer r5 = WorkInitializer.IO;
            Application r0 = WorkInitializer.O00();
            Application r1 = null;
            if (r0 != null) goto L7;
            Intrinsics.XXO("app");
            r0 = null;
        L7:
            WorkInitializer.XO0O10(r5, r0);
            Application r2 = WorkInitializer.O00();
            if (r2 != null) goto L10;
            Intrinsics.XXO("app");
        L11:
            WorkInitializer.iO(r5, r1);
            return Unit.OXO1;
        L10:
            r1 = r2;
            goto L11
        L14:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public WorkInitializer$onPrivacyAgree$1(Continuation<? super WorkInitializer$onPrivacyAgree$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new WorkInitializer$onPrivacyAgree$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WorkInitializer$onPrivacyAgree$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        ResultKt.X1ii(r6);
    L17:
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r6);
    L13:
        g10 r7 = IXOX0Xiii.O00();
        AnonymousClass1 r2 = new AnonymousClass1(null);
        this.label = 2;
        if (I100X1.I0IIOi(r7, r2, this) != r0) goto L17;
    L15:
        return r0;
    L10:
        ResultKt.X1ii(r6);
        this.label = 1;
        if (DelayKt.XIi00iiXO(10000, this) != r0) goto L13;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
