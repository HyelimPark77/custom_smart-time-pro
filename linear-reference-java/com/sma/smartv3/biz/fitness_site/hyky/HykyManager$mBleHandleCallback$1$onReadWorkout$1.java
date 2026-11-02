package com.sma.smartv3.biz.fitness_site.hyky;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.db.entity.Workout;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleWorkout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$mBleHandleCallback$1$onReadWorkout$1", f = "HykyManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadWorkout$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,391:1\n1869#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadWorkout$1\n*L\n316#1:392,2\n*E\n"})
public final class HykyManager$mBleHandleCallback$1$onReadWorkout$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BleWorkout> $workouts;
    int label;
    final /* synthetic */ HykyManager this$0;
    final /* synthetic */ HykyManager$mBleHandleCallback$1 this$1;

    public HykyManager$mBleHandleCallback$1$onReadWorkout$1(List<BleWorkout> r1, HykyManager r2, HykyManager$mBleHandleCallback$1 r3, Continuation<? super HykyManager$mBleHandleCallback$1$onReadWorkout$1> r4) {
        this.$workouts = r1;
        this.this$0 = r2;
        this.this$1 = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new HykyManager$mBleHandleCallback$1$onReadWorkout$1(this.$workouts, this.this$0, this.this$1, r5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((HykyManager$mBleHandleCallback$1$onReadWorkout$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        pb.I0iXXO();
        if (this.label != 0) goto L14;
        ResultKt.X1ii(r7);
        ArrayList r8 = new ArrayList();
        List<BleWorkout> r0 = this.$workouts;
        HykyManager$mBleHandleCallback$1 r1 = this.this$1;
        Iterator<T> r2 = r0.iterator();
    L6:
        if (r2.hasNext() == false) goto L11;
        Workout r3 = new Workout((BleWorkout) r2.next(), r1.getOffset());
        r1.getDate().setTime(r3.getMStart());
        String r4 = r1.getFormat().format(r1.getDate());
        Intrinsics.O10IXXX0X(r4, "format(...)");
        r3.setMLocalTime(r4);
        BleCache r5 = BleCache.INSTANCE;
        if (r5.getMBleName().length() <= 0) goto L10;
        r3.setMFirmwareFlag(r5.getMFirmwareFlag());
        r3.setMPrototype(r5.getMPrototype());
        r3.setMBleName(r5.getMBleName());
        r3.setMPlatform(r5.getMPlatform());
        r3.setMAGpsType(r5.getMAGpsType());
    L10:
        r8.add(r3);
        goto L6
    L11:
        this.this$0.uploadData(r8);
        return Unit.OXO1;
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
