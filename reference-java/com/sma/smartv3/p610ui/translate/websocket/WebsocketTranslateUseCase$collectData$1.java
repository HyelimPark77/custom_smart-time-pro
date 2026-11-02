package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.sma.smartv3.util.websocket.ConnectionState;
import com.sma.smartv3.util.websocket.data.AudioEndMessage;
import com.sma.smartv3.util.websocket.data.STTMessage;
import com.sma.smartv3.util.websocket.data.WebSocketMessage;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WebsocketTranslateUseCase$collectData$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$1", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {}, m39468l = {149}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190411 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ WebsocketTranslateUseCase this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$1$OXO1 */
        public static final class OXO1<T> implements IXiXI {

            /* JADX INFO: renamed from: IO */
            public static final OXO1<T> f54878IO = new OXO1<>();

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public final Object emit(ConnectionState connectionState, Continuation<? super Unit> continuation) {
                i1O0OXO1O.OXO1.OXO1("服务端WebSocket连接状态：" + connectionState);
                return Unit.OXO1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190411(WebsocketTranslateUseCase websocketTranslateUseCase, Continuation<? super C190411> continuation) {
            super(2, continuation);
            this.this$0 = websocketTranslateUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190411(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190411) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                k85<ConnectionState> k85VarXiOIO = this.this$0.XiOIO();
                IXiXI<? super ConnectionState> iXiXI = OXO1.f54878IO;
                this.label = 1;
                if (k85VarXiOIO.collect(iXiXI, this) == objI0iXXO) {
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {}, m39468l = {154}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190422 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ WebsocketTranslateUseCase this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2$1 */
        public static final class AnonymousClass1<T> implements IXiXI {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ WebsocketTranslateUseCase f54879IO;

            public AnonymousClass1(WebsocketTranslateUseCase websocketTranslateUseCase) {
                this.f54879IO = websocketTranslateUseCase;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
            
                if (r5.f54879IO.XX0((com.sma.smartv3.util.websocket.data.STTMessage) r6, r0) == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
            
                if (r5.f54879IO.iIiiO((com.sma.smartv3.util.websocket.data.AudioEndMessage) r6, r0) == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
            
                return r1;
             */
            @Override // com.android.mltcode.paycertificationapi.IXiXI
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(WebSocketMessage webSocketMessage, Continuation<? super Unit> continuation) {
                WebsocketTranslateUseCase$collectData$1$2$1$emit$1 websocketTranslateUseCase$collectData$1$2$1$emit$1;
                if (continuation instanceof WebsocketTranslateUseCase$collectData$1$2$1$emit$1) {
                    websocketTranslateUseCase$collectData$1$2$1$emit$1 = (WebsocketTranslateUseCase$collectData$1$2$1$emit$1) continuation;
                    int i = websocketTranslateUseCase$collectData$1$2$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        websocketTranslateUseCase$collectData$1$2$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        websocketTranslateUseCase$collectData$1$2$1$emit$1 = new WebsocketTranslateUseCase$collectData$1$2$1$emit$1(this, continuation);
                    }
                } else {
                    websocketTranslateUseCase$collectData$1$2$1$emit$1 = new WebsocketTranslateUseCase$collectData$1$2$1$emit$1(this, continuation);
                }
                Object obj = websocketTranslateUseCase$collectData$1$2$1$emit$1.result;
                Object objI0iXXO = C2798pb.I0iXXO();
                int i2 = websocketTranslateUseCase$collectData$1$2$1$emit$1.label;
                if (i2 == 0) {
                    ResultKt.X1ii(obj);
                    if (webSocketMessage instanceof STTMessage) {
                        websocketTranslateUseCase$collectData$1$2$1$emit$1.L$0 = webSocketMessage;
                        websocketTranslateUseCase$collectData$1$2$1$emit$1.label = 1;
                    } else if (webSocketMessage instanceof AudioEndMessage) {
                        websocketTranslateUseCase$collectData$1$2$1$emit$1.L$0 = webSocketMessage;
                        websocketTranslateUseCase$collectData$1$2$1$emit$1.label = 2;
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webSocketMessage = (WebSocketMessage) websocketTranslateUseCase$collectData$1$2$1$emit$1.L$0;
                    ResultKt.X1ii(obj);
                }
                i1O0OXO1O.OXO1.OXO1("服务端WebSocket日志打印：" + webSocketMessage);
                return Unit.OXO1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190422(WebsocketTranslateUseCase websocketTranslateUseCase, Continuation<? super C190422> continuation) {
            super(2, continuation);
            this.this$0 = websocketTranslateUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190422(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190422) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                ii0iIIX0<WebSocketMessage> ii0iiix0XXIIO1i11 = this.this$0.XXIIO1i11();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                if (ii0iiix0XXIIO1i11.collect(anonymousClass1, this) == objI0iXXO) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketTranslateUseCase$collectData$1(WebsocketTranslateUseCase websocketTranslateUseCase, Continuation<? super WebsocketTranslateUseCase$collectData$1> continuation) {
        super(2, continuation);
        this.this$0 = websocketTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WebsocketTranslateUseCase$collectData$1 websocketTranslateUseCase$collectData$1 = new WebsocketTranslateUseCase$collectData$1(this.this$0, continuation);
        websocketTranslateUseCase$collectData$1.L$0 = obj;
        return websocketTranslateUseCase$collectData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WebsocketTranslateUseCase$collectData$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i00OIXiO i00oixio = (i00OIXiO) this.L$0;
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        XX01Oi.IiI10X(i00oixio, null, null, new C190411(this.this$0, null), 3, null);
        XX01Oi.IiI10X(i00oixio, IXOX0Xiii.m712iO(), null, new C190422(this.this$0, null), 2, null);
        return Unit.OXO1;
    }
}
