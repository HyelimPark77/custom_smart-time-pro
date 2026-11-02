package com.sma.smartv3.util;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.android.mltcode.paycertificationapi.O110O1III;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.PopManager$showLoadPop$1", f = "PopManager.kt", i = {0, 0, 1}, l = {80, 84}, m = "invokeSuspend", n = {"countDownPop", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "countDownPop"}, s = {"L$0", "I$0", "L$0"}, v = 1)
public final class PopManager$showLoadPop$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $action;
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ View $rootView;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    public PopManager$showLoadPop$1(AppCompatActivity r1, Function1<? super Continuation<? super Unit>, ? extends Object> r2, View r3, Continuation<? super PopManager$showLoadPop$1> r4) {
        this.$activity = r1;
        this.$action = r2;
        this.$rootView = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new PopManager$showLoadPop$1(this.$activity, this.$action, this.$rootView, r5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((PopManager$showLoadPop$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:15:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r9) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        O110O1III r2 = (O110O1III) this.L$0;
        ResultKt.X1ii(r9);
    L20:
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        int r3 = this.I$0;
        O110O1III r5 = (O110O1III) this.L$0;
        ResultKt.X1ii(r9);
    L15:
        r5.XiOIii1(String.valueOf(r3));
        r3 = r3 - 1;
    L11:
        if ((-1) >= r3) goto L16;
        this.L$0 = r5;
        this.I$0 = r3;
        this.label = 1;
        if (DelayKt.XIi00iiXO(1000, this) != r0) goto L15;
    L18:
        return r0;
    L16:
        r5.dismiss();
        Function1<Continuation<? super Unit>, Object> r10 = this.$action;
        this.L$0 = SpillingKt.OXO1(r5);
        this.label = 2;
        if (r10.invoke(this) != r0) goto L20;
    L10:
        ResultKt.X1ii(r9);
        O110O1III r11 = new O110O1III(this.$activity);
        View r4 = this.$rootView;
        r11.I0iXXO(false);
        r11.XiOIii1("3");
        r11.XiOIO(r4);
        r5 = r11;
        r3 = 2;
        goto L11
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
