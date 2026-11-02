package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.ui.translate.AudioRepository;
import com.sma.smartv3.ui.translate.TranslateEntityRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$clear$1", f = "WebsocketTranslateUseCase.kt", i = {}, l = {213, 216}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WebsocketTranslateUseCase$clear$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    public WebsocketTranslateUseCase$clear$1(WebsocketTranslateUseCase r1, Continuation<? super WebsocketTranslateUseCase$clear$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new WebsocketTranslateUseCase$clear$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WebsocketTranslateUseCase$clear$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        ResultKt.X1ii(r5);
    L22:
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r5);
    L13:
        XiOIO r6 = WebsocketTranslateUseCase.XO0O10(this.this$0);
        if (r6 == null) goto L16;
        XiOIO.OXO1.XIi00iiXO(r6, null, 1, null);
    L16:
        WebsocketTranslateUseCase.IO(this.this$0, null);
        TranslateEntityRepository r7 = WebsocketTranslateUseCase.IiI10X(this.this$0);
        if (r7 == null) goto L22;
        this.label = 2;
        if (r7.XIi00iiXO(this) != r0) goto L22;
    L20:
        return r0;
    L10:
        ResultKt.X1ii(r5);
        WebsocketTranslateUseCase.XOO0ii0(this.this$0).IiI10X();
        AudioRepository r8 = WebsocketTranslateUseCase.iO(this.this$0);
        this.label = 1;
        if (r8.XXI(this) != r0) goto L13;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
