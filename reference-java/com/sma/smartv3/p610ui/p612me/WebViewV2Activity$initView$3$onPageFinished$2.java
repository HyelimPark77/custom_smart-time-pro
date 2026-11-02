package com.sma.smartv3.p610ui.p612me;

import android.webkit.WebView;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.me.WebViewV2Activity$initView$3$onPageFinished$2", m39466f = "WebViewV2Activity.kt", m39467i = {}, m39468l = {135}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WebViewV2Activity$initView$3$onPageFinished$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ WebView $view;
    int label;
    final /* synthetic */ WebViewV2Activity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewV2Activity$initView$3$onPageFinished$2(WebViewV2Activity webViewV2Activity, WebView webView, Continuation<? super WebViewV2Activity$initView$3$onPageFinished$2> continuation) {
        super(2, continuation);
        this.this$0 = webViewV2Activity;
        this.$view = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebViewV2Activity$initView$3$onPageFinished$2(this.this$0, this.$view, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WebViewV2Activity$initView$3$onPageFinished$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            this.label = 1;
            if (DelayKt.XIi00iiXO(300L, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.this$0.getTitleCenter().setText(this.$view.getTitle());
        return Unit.OXO1;
    }
}
