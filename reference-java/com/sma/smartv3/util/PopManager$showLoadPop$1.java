package com.sma.smartv3.util;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.O110O1III;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.PopManager$showLoadPop$1", m39466f = "PopManager.kt", m39467i = {0, 0, 1}, m39468l = {80, 84}, m39469m = "invokeSuspend", m39470n = {"countDownPop", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "countDownPop"}, m39472s = {"L$0", "I$0", "L$0"}, m39473v = 1)
public final class PopManager$showLoadPop$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $action;
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ View $rootView;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PopManager$showLoadPop$1(AppCompatActivity appCompatActivity, Function1<? super Continuation<? super Unit>, ? extends Object> function1, View view, Continuation<? super PopManager$showLoadPop$1> continuation) {
        super(2, continuation);
        this.$activity = appCompatActivity;
        this.$action = function1;
        this.$rootView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PopManager$showLoadPop$1(this.$activity, this.$action, this.$rootView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((PopManager$showLoadPop$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (kotlinx.coroutines.DelayKt.XIi00iiXO(1000, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (r9.invoke2(r8) == r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:15:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        O110O1III o110o1iii;
        int i;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            O110O1III o110o1iii2 = new O110O1III(this.$activity);
            View view = this.$rootView;
            o110o1iii2.I0iXXO(false);
            o110o1iii2.XiOIii1("3");
            o110o1iii2.XiOIO(view);
            o110o1iii = o110o1iii2;
            i = 2;
            if (-1 < i) {
                this.L$0 = o110o1iii;
                this.I$0 = i;
                this.label = 1;
            } else {
                o110o1iii.dismiss();
                Function1<Continuation<? super Unit>, Object> function1 = this.$action;
                this.L$0 = SpillingKt.OXO1(o110o1iii);
                this.label = 2;
            }
            return objI0iXXO;
        }
        if (i2 == 1) {
            i = this.I$0;
            o110o1iii = (O110O1III) this.L$0;
            ResultKt.X1ii(obj);
            o110o1iii.XiOIii1(String.valueOf(i));
            i--;
            if (-1 < i) {
                this.L$0 = o110o1iii;
                this.I$0 = i;
                this.label = 1;
            } else {
                o110o1iii.dismiss();
                Function1<Continuation<? super Unit>, Object> function2 = this.$action;
                this.L$0 = SpillingKt.OXO1(o110o1iii);
                this.label = 2;
            }
            return objI0iXXO;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        return Unit.OXO1;
    }
}
