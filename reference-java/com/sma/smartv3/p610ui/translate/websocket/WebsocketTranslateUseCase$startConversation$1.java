package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iXOIii;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$startConversation$1", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WebsocketTranslateUseCase$startConversation$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ TranslateUseCaseMODE $mode;
    final /* synthetic */ boolean $play;
    final /* synthetic */ boolean $record;
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    public static final class OXO1 implements iXOIii {
        public final /* synthetic */ WebsocketTranslateUseCase OXO1;

        public OXO1(WebsocketTranslateUseCase websocketTranslateUseCase) {
            this.OXO1 = websocketTranslateUseCase;
        }

        @Override // com.android.mltcode.paycertificationapi.iXOIii
        public final Object OXO1(byte[] bArr, Continuation<? super Unit> continuation) {
            this.OXO1.XIi00iiXO.XOO0ii0().send(bArr);
            return Unit.OXO1;
        }
    }

    public static final class XIi00iiXO implements iXOIii {
        public final /* synthetic */ WebsocketTranslateUseCase OXO1;

        public XIi00iiXO(WebsocketTranslateUseCase websocketTranslateUseCase) {
            this.OXO1 = websocketTranslateUseCase;
        }

        @Override // com.android.mltcode.paycertificationapi.iXOIii
        public final Object OXO1(byte[] bArr, Continuation<? super Unit> continuation) {
            this.OXO1.XIi00iiXO.XOO0ii0().send(bArr);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$startConversation$1$iO */
    public static final /* synthetic */ class C19043iO {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[TranslateUseCaseMODE.values().length];
            try {
                iArr[TranslateUseCaseMODE.STREAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TranslateUseCaseMODE.FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketTranslateUseCase$startConversation$1(TranslateUseCaseMODE translateUseCaseMODE, WebsocketTranslateUseCase websocketTranslateUseCase, boolean z, boolean z2, Continuation<? super WebsocketTranslateUseCase$startConversation$1> continuation) {
        super(2, continuation);
        this.$mode = translateUseCaseMODE;
        this.this$0 = websocketTranslateUseCase;
        this.$record = z;
        this.$play = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebsocketTranslateUseCase$startConversation$1(this.$mode, this.this$0, this.$record, this.$play, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WebsocketTranslateUseCase$startConversation$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        int i = C19043iO.OXO1[this.$mode.ordinal()];
        if (i == 1) {
            this.this$0.XIi00iiXO.O00(this.this$0.I0IIOi.OXO1());
            if (this.$record) {
                this.this$0.f54877iO.OIi0(this.$play, new OXO1(this.this$0));
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.XIi00iiXO.O00(this.this$0.I0IIOi.OXO1());
            this.this$0.f54877iO.OIX0iXi(new XIi00iiXO(this.this$0));
        }
        return Unit.OXO1;
    }
}
