package com.sma.smartv3.ui.me;

import android.webkit.WebView;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.me.WebViewV2Activity$initView$3$onPageFinished$2", f = "WebViewV2Activity.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WebViewV2Activity$initView$3$onPageFinished$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ WebView $view;
    int label;
    final /* synthetic */ WebViewV2Activity this$0;

    public WebViewV2Activity$initView$3$onPageFinished$2(WebViewV2Activity r1, WebView r2, Continuation<? super WebViewV2Activity$initView$3$onPageFinished$2> r3) {
        this.this$0 = r1;
        this.$view = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new WebViewV2Activity$initView$3$onPageFinished$2(this.this$0, this.$view, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WebViewV2Activity$initView$3$onPageFinished$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
    L11:
        this.this$0.getTitleCenter().setText(this.$view.getTitle());
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        this.label = 1;
        if (DelayKt.XIi00iiXO(300, this) != r0) goto L11;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
