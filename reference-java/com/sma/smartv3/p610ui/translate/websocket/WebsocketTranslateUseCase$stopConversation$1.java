package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.sma.smartv3.p610ui.translate.AudioRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$stopConversation$1", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {}, m39468l = {120}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WebsocketTranslateUseCase$stopConversation$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ TranslateUseCaseMODE $mode;
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    public static final /* synthetic */ class OXO1 {
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
    public WebsocketTranslateUseCase$stopConversation$1(TranslateUseCaseMODE translateUseCaseMODE, WebsocketTranslateUseCase websocketTranslateUseCase, Continuation<? super WebsocketTranslateUseCase$stopConversation$1> continuation) {
        super(2, continuation);
        this.$mode = translateUseCaseMODE;
        this.this$0 = websocketTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebsocketTranslateUseCase$stopConversation$1(this.$mode, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WebsocketTranslateUseCase$stopConversation$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            int i2 = OXO1.OXO1[this.$mode.ordinal()];
            if (i2 == 1) {
                this.this$0.f54877iO.O10IXXX0X();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AudioRepository audioRepository = this.this$0.f54877iO;
                this.label = 1;
                if (audioRepository.X0O(this) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.this$0.XIi00iiXO.IiI10X();
        return Unit.OXO1;
    }
}
