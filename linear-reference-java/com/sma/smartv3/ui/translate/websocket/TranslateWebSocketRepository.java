package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.util.websocket.ConnectionState;
import com.sma.smartv3.util.websocket.WebSocketConnectManager;
import com.sma.smartv3.util.websocket.data.WebSocketMessage;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.flow.OXO1;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTranslateWebSocketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateWebSocketRepository.kt\ncom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,62:1\n56#2:63\n59#2:67\n46#3:64\n51#3:66\n105#4:65\n*S KotlinDebug\n*F\n+ 1 TranslateWebSocketRepository.kt\ncom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository\n*L\n27#1:63\n27#1:67\n27#1:64\n27#1:66\n27#1:65\n*E\n"})
public final class TranslateWebSocketRepository {

    @aa1
    public final ii0iIIX0<WebSocketMessage> O00;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final bw6 XIi00iiXO;
    public Request XO0O10;

    @tb1
    public final WebSocketConnectManager iO;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$1", f = "TranslateWebSocketRepository.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ TranslateWebSocketRepository this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$1$OXO1 */
        public static final class OXO1<T> implements IXiXI {
            public final /* synthetic */ TranslateWebSocketRepository IO;

            public OXO1(TranslateWebSocketRepository r1) {
                this.IO = r1;
            }

            public final Object OXO1(ConnectionState r2, Continuation<? super Unit> r3) {
                if ((r2 instanceof ConnectionState.XO0O10) == false) goto L20;
                WebSocketConnectManager r4 = TranslateWebSocketRepository.XIi00iiXO(this.IO);
                if (r4 == null) goto L8;
                r4.iO();
            L8:
                if (TranslateWebSocketRepository.OXO1(this.IO) == null) goto L25;
                WebSocketConnectManager r5 = TranslateWebSocketRepository.XIi00iiXO(this.IO);
                if (r5 == null) goto L25;
                Request r0 = TranslateWebSocketRepository.OXO1(this.IO);
                if (r0 != null) goto L14;
                Intrinsics.XXO("lastRequest");
                r0 = null;
            L14:
                Object r6 = r5.O00(r0, r3);
                if (r6 != pb.I0iXXO()) goto L18;
                return r6;
            L18:
                return Unit.OXO1;
            L25:
                return Unit.OXO1;
            L20:
                if ((r2 instanceof ConnectionState.OXO1) == false) goto L25;
                WebSocketConnectManager r7 = TranslateWebSocketRepository.XIi00iiXO(this.IO);
                if (r7 == null) goto L25;
                r7.XO0O10(TranslateWebSocketRepository.iO(this.IO));
                goto L25
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                return OXO1((ConnectionState) r1, r2);
            }
        }

        public AnonymousClass1(TranslateWebSocketRepository r1, Continuation<? super AnonymousClass1> r2) {
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
            k85<ConnectionState> r6 = this.this$0.XOO0ii0().OXO1();
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

    public TranslateWebSocketRepository(@aa1 i00OIXiO r8, @aa1 bw6 r9, @tb1 WebSocketConnectManager r10) {
        Intrinsics.X0O(r8, "scope");
        Intrinsics.X0O(r9, "client");
        this.OXO1 = r8;
        this.XIi00iiXO = r9;
        this.iO = r10;
        final l94<String> r11 = r9.iO();
        this.O00 = iX0XiO.XOO0Xi(new TranslateWebSocketRepository$special$$inlined$mapNotNull$1(r11), r8, OXO1.C0655OXO1.XIi00iiXO(OXO1.OXO1, 0, 0, 3, null), 0);
        I100X1.O00(r8, IXOX0Xiii.iO(), null, new AnonymousClass1(this, null), 2, null);
    }

    public static final /* synthetic */ Request OXO1(TranslateWebSocketRepository r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ WebSocketConnectManager XIi00iiXO(TranslateWebSocketRepository r0) {
        return r0.iO;
    }

    public static final /* synthetic */ i00OIXiO iO(TranslateWebSocketRepository r0) {
        return r0.OXO1;
    }

    @aa1
    public final k85<ConnectionState> I0IIOi() {
        return OXO1();
    }

    public final void IiI10X() {
        disconnect();
    }

    public final void O00(@aa1 Request r2) {
        Intrinsics.X0O(r2, "request");
        this.XO0O10 = r2;
        XO0O10(r2);
    }

    @aa1
    public final ii0iIIX0<WebSocketMessage> OIi0() {
        return this.O00;
    }

    public final void XO0O10() {
        IiI10X();
        I0IIOi.IiI10X(this.OXO1, null, 1, null);
    }

    @aa1
    public final bw6 XOO0ii0() {
        return this.XIi00iiXO;
    }
}
