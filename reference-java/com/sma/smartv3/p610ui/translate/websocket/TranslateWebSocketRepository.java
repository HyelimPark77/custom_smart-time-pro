package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.iw6;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.util.websocket.ConnectionState;
import com.sma.smartv3.util.websocket.WebSocketConnectManager;
import com.sma.smartv3.util.websocket.data.WebSocketMessage;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
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

    /* JADX INFO: renamed from: iO */
    @tb1
    public final WebSocketConnectManager f54872iO;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$1", m39466f = "TranslateWebSocketRepository.kt", m39467i = {}, m39468l = {34}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190391 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$1$OXO1 */
        public static final class OXO1<T> implements IXiXI {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ TranslateWebSocketRepository f54873IO;

            public OXO1(TranslateWebSocketRepository translateWebSocketRepository) {
                this.f54873IO = translateWebSocketRepository;
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public final Object emit(ConnectionState connectionState, Continuation<? super Unit> continuation) {
                WebSocketConnectManager webSocketConnectManager;
                WebSocketConnectManager webSocketConnectManager2;
                if (connectionState instanceof ConnectionState.XO0O10) {
                    WebSocketConnectManager webSocketConnectManager3 = this.f54873IO.f54872iO;
                    if (webSocketConnectManager3 != null) {
                        webSocketConnectManager3.m38867iO();
                    }
                    if (this.f54873IO.XO0O10 != null && (webSocketConnectManager2 = this.f54873IO.f54872iO) != null) {
                        Request request = this.f54873IO.XO0O10;
                        if (request == null) {
                            Intrinsics.XXO("lastRequest");
                            request = null;
                        }
                        Object objO00 = webSocketConnectManager2.O00(request, continuation);
                        return objO00 == C2798pb.I0iXXO() ? objO00 : Unit.OXO1;
                    }
                } else if ((connectionState instanceof ConnectionState.OXO1) && (webSocketConnectManager = this.f54873IO.f54872iO) != null) {
                    webSocketConnectManager.XO0O10(this.f54873IO.OXO1);
                }
                return Unit.OXO1;
            }
        }

        public C190391(Continuation<? super C190391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TranslateWebSocketRepository.this.new C190391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190391) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                k85<ConnectionState> k85VarOXO1 = TranslateWebSocketRepository.this.XOO0ii0().OXO1();
                OXO1 oxo1 = new OXO1(TranslateWebSocketRepository.this);
                this.label = 1;
                if (k85VarOXO1.collect(oxo1, this) == objI0iXXO) {
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

    public TranslateWebSocketRepository(@aa1 i00OIXiO scope, @aa1 bw6 client, @tb1 WebSocketConnectManager webSocketConnectManager) {
        Intrinsics.X0O(scope, "scope");
        Intrinsics.X0O(client, "client");
        this.OXO1 = scope;
        this.XIi00iiXO = client;
        this.f54872iO = webSocketConnectManager;
        final l94<String> l94VarMo1570iO = client.mo1570iO();
        this.O00 = iX0XiO.XOO0Xi(new ii0iIIX0<WebSocketMessage>() { // from class: com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$special$$inlined$mapNotNull$1$2 */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TranslateWebSocketRepository.kt\ncom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository\n*L\n1#1,218:1\n57#2:219\n58#2:221\n27#3:220\n*E\n"})
            public static final class C190402<T> implements IXiXI {

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ IXiXI f54875IO;

                /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$special$$inlined$mapNotNull$1$2$1 */
                @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.TranslateWebSocketRepository$special$$inlined$mapNotNull$1$2", m39466f = "TranslateWebSocketRepository.kt", m39467i = {0, 0, 0, 0, 0, 0}, m39468l = {221}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, m39473v = 1)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @tb1
                    public final Object invokeSuspend(@aa1 Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190402.this.emit(null, this);
                    }
                }

                public C190402(IXiXI iXiXI) {
                    this.f54875IO = iXiXI;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // com.android.mltcode.paycertificationapi.IXiXI
                @tb1
                public final Object emit(Object obj, @aa1 Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objI0iXXO = C2798pb.I0iXXO();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.X1ii(obj2);
                        IXiXI iXiXI = this.f54875IO;
                        WebSocketMessage webSocketMessageOXO1 = iw6.OXO1.OXO1((String) obj);
                        if (webSocketMessageOXO1 != null) {
                            anonymousClass1.L$0 = SpillingKt.OXO1(obj);
                            anonymousClass1.L$1 = SpillingKt.OXO1(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.OXO1(obj);
                            anonymousClass1.L$3 = SpillingKt.OXO1(iXiXI);
                            anonymousClass1.L$4 = SpillingKt.OXO1(webSocketMessageOXO1);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (iXiXI.emit(webSocketMessageOXO1, anonymousClass1) == objI0iXXO) {
                                return objI0iXXO;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.X1ii(obj2);
                    }
                    return Unit.OXO1;
                }
            }

            @Override // com.android.mltcode.paycertificationapi.ii0iIIX0
            @tb1
            public Object collect(@aa1 IXiXI<? super WebSocketMessage> iXiXI, @aa1 Continuation continuation) {
                Object objCollect = l94VarMo1570iO.collect(new C190402(iXiXI), continuation);
                return objCollect == C2798pb.I0iXXO() ? objCollect : Unit.OXO1;
            }
        }, scope, OXO1.C22077OXO1.XIi00iiXO(OXO1.OXO1, 0L, 0L, 3, null), 0);
        XX01Oi.IiI10X(scope, IXOX0Xiii.m712iO(), null, new C190391(null), 2, null);
    }

    @aa1
    public final k85<ConnectionState> I0IIOi() {
        return this.XIi00iiXO.OXO1();
    }

    public final void IiI10X() {
        this.XIi00iiXO.disconnect();
    }

    public final void O00(@aa1 Request request) {
        Intrinsics.X0O(request, "request");
        this.XO0O10 = request;
        this.XIi00iiXO.XO0O10(request);
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
