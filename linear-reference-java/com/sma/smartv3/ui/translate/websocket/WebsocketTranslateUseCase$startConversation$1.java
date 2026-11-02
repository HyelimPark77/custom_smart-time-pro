package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iXOIii;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$startConversation$1", f = "WebsocketTranslateUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WebsocketTranslateUseCase$startConversation$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ TranslateUseCaseMODE $mode;
    final /* synthetic */ boolean $play;
    final /* synthetic */ boolean $record;
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    public static final class OXO1 implements iXOIii {
        public final /* synthetic */ WebsocketTranslateUseCase OXO1;

        public OXO1(WebsocketTranslateUseCase r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.iXOIii
        public final Object OXO1(byte[] r1, Continuation<? super Unit> r2) {
            WebsocketTranslateUseCase.XOO0ii0(this.OXO1).XOO0ii0().send(r1);
            return Unit.OXO1;
        }
    }

    public static final class XIi00iiXO implements iXOIii {
        public final /* synthetic */ WebsocketTranslateUseCase OXO1;

        public XIi00iiXO(WebsocketTranslateUseCase r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.iXOIii
        public final Object OXO1(byte[] r1, Continuation<? super Unit> r2) {
            WebsocketTranslateUseCase.XOO0ii0(this.OXO1).XOO0ii0().send(r1);
            return Unit.OXO1;
        }
    }

    public static final /* synthetic */ class iO {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[TranslateUseCaseMODE.values().length];
            r0[TranslateUseCaseMODE.STREAM.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[TranslateUseCaseMODE.FILE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    public WebsocketTranslateUseCase$startConversation$1(TranslateUseCaseMODE r1, WebsocketTranslateUseCase r2, boolean r3, boolean r4, Continuation<? super WebsocketTranslateUseCase$startConversation$1> r5) {
        this.$mode = r1;
        this.this$0 = r2;
        this.$record = r3;
        this.$play = r4;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        return new WebsocketTranslateUseCase$startConversation$1(this.$mode, this.this$0, this.$record, this.$play, r8);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WebsocketTranslateUseCase$startConversation$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        pb.I0iXXO();
        if (this.label != 0) goto L17;
        ResultKt.X1ii(r4);
        TranslateUseCaseMODE r5 = this.$mode;
        int r6 = iO.OXO1[r5.ordinal()];
        if (r6 != 1) goto L7;
        WebsocketTranslateUseCase.XOO0ii0(this.this$0).O00(WebsocketTranslateUseCase.XIi00iiXO(this.this$0).OXO1());
        if (this.$record == false) goto L15;
        WebsocketTranslateUseCase.iO(this.this$0).OIi0(this.$play, new OXO1(this.this$0));
    L15:
        return Unit.OXO1;
    L7:
        if (r6 != 2) goto L10;
        WebsocketTranslateUseCase.XOO0ii0(this.this$0).O00(WebsocketTranslateUseCase.XIi00iiXO(this.this$0).OXO1());
        WebsocketTranslateUseCase.iO(this.this$0).OIX0iXi(new XIi00iiXO(this.this$0));
        goto L15
    L10:
        throw new NoWhenBranchMatchedException();
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
