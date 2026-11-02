package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.ui.translate.AudioRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$stopConversation$1", f = "WebsocketTranslateUseCase.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WebsocketTranslateUseCase$stopConversation$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ TranslateUseCaseMODE $mode;
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    public static final /* synthetic */ class OXO1 {
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

    public WebsocketTranslateUseCase$stopConversation$1(TranslateUseCaseMODE r1, WebsocketTranslateUseCase r2, Continuation<? super WebsocketTranslateUseCase$stopConversation$1> r3) {
        this.$mode = r1;
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new WebsocketTranslateUseCase$stopConversation$1(this.$mode, this.this$0, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WebsocketTranslateUseCase$stopConversation$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
    L18:
        WebsocketTranslateUseCase.XOO0ii0(this.this$0).IiI10X();
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        TranslateUseCaseMODE r5 = this.$mode;
        int r6 = OXO1.OXO1[r5.ordinal()];
        if (r6 != 1) goto L11;
        WebsocketTranslateUseCase.iO(this.this$0).O10IXXX0X();
        goto L18
    L11:
        if (r6 != 2) goto L16;
        AudioRepository r7 = WebsocketTranslateUseCase.iO(this.this$0);
        this.label = 1;
        if (r7.X0O(this) != r0) goto L18;
        return r0;
    L16:
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
