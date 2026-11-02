package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase", f = "WebsocketTranslateUseCase.kt", i = {0, 1, 1, 2, 2}, l = {169, 171, 172}, m = "handleAudioEnd", n = {"it", "it", "currentPath", "it", "currentPath"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"}, v = 1)
public final class WebsocketTranslateUseCase$handleAudioEnd$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    public WebsocketTranslateUseCase$handleAudioEnd$1(WebsocketTranslateUseCase r1, Continuation<? super WebsocketTranslateUseCase$handleAudioEnd$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return WebsocketTranslateUseCase.I0IIOi(this.this$0, null, this);
    }
}
