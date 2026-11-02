package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.sma.smartv3.p610ui.translate.AudioRepository;
import com.sma.smartv3.p610ui.translate.TranslateEntityRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$clear$1", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {}, m39468l = {213, 216}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WebsocketTranslateUseCase$clear$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketTranslateUseCase$clear$1(WebsocketTranslateUseCase websocketTranslateUseCase, Continuation<? super WebsocketTranslateUseCase$clear$1> continuation) {
        super(2, continuation);
        this.this$0 = websocketTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebsocketTranslateUseCase$clear$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WebsocketTranslateUseCase$clear$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r5.XIi00iiXO(r4) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.X1ii(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            return Unit.OXO1;
        }
        ResultKt.X1ii(obj);
        this.this$0.XIi00iiXO.IiI10X();
        AudioRepository audioRepository = this.this$0.f54877iO;
        this.label = 1;
        if (audioRepository.XXI(this) != objI0iXXO) {
        }
        return objI0iXXO;
        XiOIO xiOIO = this.this$0.OIX0iXi;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        this.this$0.OIX0iXi = null;
        TranslateEntityRepository translateEntityRepository = this.this$0.XO0O10;
        if (translateEntityRepository != null) {
            this.label = 2;
        }
        return Unit.OXO1;
    }
}
