package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.pb;
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
@DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1", f = "WebsocketTranslateUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WebsocketTranslateUseCase$collectData$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$1", f = "WebsocketTranslateUseCase.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ WebsocketTranslateUseCase this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$1$OXO1 */
        public static final class OXO1<T> implements IXiXI {
            public static final OXO1<T> IO = null;

            static {
                IO = new OXO1();
            }

            public OXO1() {
            }

            public final Object OXO1(ConnectionState r3, Continuation<? super Unit> r4) {
                i1O0OXO1O.OXO1.OXO1("服务端WebSocket连接状态：" + r3);
                return Unit.OXO1;
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                return OXO1((ConnectionState) r1, r2);
            }
        }

        public AnonymousClass1(WebsocketTranslateUseCase r1, Continuation<? super AnonymousClass1> r2) {
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
            if (r1 != 1) goto L6;
            ResultKt.X1ii(r4);
        L12:
            throw new KotlinNothingValueException();
        L6:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            k85<ConnectionState> r5 = this.this$0.XiOIO();
            IXiXI<? super ConnectionState> r2 = OXO1.IO;
            this.label = 1;
            if (r5.collect(r2, this) != r0) goto L12;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2", f = "WebsocketTranslateUseCase.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ WebsocketTranslateUseCase this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements IXiXI {
            public final /* synthetic */ WebsocketTranslateUseCase IO;

            public AnonymousClass1(WebsocketTranslateUseCase r1) {
                this.IO = r1;
            }

            public final Object OXO1(WebSocketMessage r6, Continuation<? super Unit> r7) {
                if ((r7 instanceof WebsocketTranslateUseCase$collectData$1$2$1$emit$1) == false) goto L7;
                WebsocketTranslateUseCase$collectData$1$2$1$emit$1 r0 = (WebsocketTranslateUseCase$collectData$1$2$1$emit$1) r7;
                int r1 = r0.label;
                if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
                r0.label = r1 - Integer.MIN_VALUE;
            L8:
                Object r8 = r0.result;
                Object r2 = pb.I0iXXO();
                int r3 = r0.label;
                if (r3 == 0) goto L16;
                if (r3 == 1) goto L15;
                if (r3 == 2) goto L15;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L15:
                r6 = (WebSocketMessage) r0.L$0;
                ResultKt.X1ii(r8);
            L26:
                i1O0OXO1O.OXO1.OXO1("服务端WebSocket日志打印：" + r6);
                return Unit.OXO1;
            L16:
                ResultKt.X1ii(r8);
                if ((r6 instanceof STTMessage) == false) goto L22;
                r0.L$0 = r6;
                r0.label = 1;
                if (WebsocketTranslateUseCase.OIi0(this.IO, (STTMessage) r6, r0) != r2) goto L26;
            L25:
                return r2;
            L22:
                if ((r6 instanceof AudioEndMessage) == false) goto L26;
                r0.L$0 = r6;
                r0.label = 2;
                if (WebsocketTranslateUseCase.I0IIOi(this.IO, (AudioEndMessage) r6, r0) != r2) goto L26;
            L7:
                r0 = new WebsocketTranslateUseCase$collectData$1$2$1$emit$1(this, r7);
                goto L8
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                return OXO1((WebSocketMessage) r1, r2);
            }
        }

        public AnonymousClass2(WebsocketTranslateUseCase r1, Continuation<? super AnonymousClass2> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass2(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
            ii0iIIX0<WebSocketMessage> r6 = this.this$0.XXIIO1i11();
            AnonymousClass1 r2 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (r6.collect(r2, this) != r0) goto L12;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public WebsocketTranslateUseCase$collectData$1(WebsocketTranslateUseCase r1, Continuation<? super WebsocketTranslateUseCase$collectData$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        WebsocketTranslateUseCase$collectData$1 r0 = new WebsocketTranslateUseCase$collectData$1(this.this$0, r4);
        r0.L$0 = r3;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WebsocketTranslateUseCase$collectData$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r8) {
        i00OIXiO r1 = (i00OIXiO) this.L$0;
        pb.I0iXXO();
        if (this.label != 0) goto L7;
        ResultKt.X1ii(r8);
        I100X1.O00(r1, null, null, new AnonymousClass1(this.this$0, null), 3, null);
        I100X1.O00(r1, IXOX0Xiii.iO(), null, new AnonymousClass2(this.this$0, null), 2, null);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
