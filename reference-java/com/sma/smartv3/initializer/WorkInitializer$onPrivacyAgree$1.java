package com.sma.smartv3.initializer;

import android.app.Application;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.initializer.WorkInitializer$onPrivacyAgree$1", m39466f = "WorkInitializer.kt", m39467i = {}, m39468l = {49, 50}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WorkInitializer$onPrivacyAgree$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.initializer.WorkInitializer$onPrivacyAgree$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.initializer.WorkInitializer$onPrivacyAgree$1$1", m39466f = "WorkInitializer.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C185921 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C185921(Continuation<? super C185921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C185921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C185921) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            WorkInitializer workInitializer = WorkInitializer.f51287IO;
            Application application = WorkInitializer.XXX11i;
            Application application2 = null;
            if (application == null) {
                Intrinsics.XXO("app");
                application = null;
            }
            workInitializer.XOO0ii0(application);
            Application application3 = WorkInitializer.XXX11i;
            if (application3 == null) {
                Intrinsics.XXO("app");
            } else {
                application2 = application3;
            }
            workInitializer.IiI10X(application2);
            return Unit.OXO1;
        }
    }

    public WorkInitializer$onPrivacyAgree$1(Continuation<? super WorkInitializer$onPrivacyAgree$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkInitializer$onPrivacyAgree$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WorkInitializer$onPrivacyAgree$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (com.android.mltcode.paycertificationapi.I100X1.I0IIOi(r6, r1, r5) == r0) goto L15;
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
            this.label = 1;
            if (DelayKt.XIi00iiXO(10000L, this) != objI0iXXO) {
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
        return Unit.OXO1;
        g10 g10VarO00 = IXOX0Xiii.O00();
        C185921 c185921 = new C185921(null);
        this.label = 2;
    }
}
