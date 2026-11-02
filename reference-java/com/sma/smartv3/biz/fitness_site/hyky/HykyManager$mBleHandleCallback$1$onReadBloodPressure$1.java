package com.sma.smartv3.biz.fitness_site.hyky;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.szabh.smable3.entity.BleBloodPressure;
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
@DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$mBleHandleCallback$1$onReadBloodPressure$1", m39466f = "HykyManager.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
@SourceDebugExtension({"SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,391:1\n1869#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodPressure$1\n*L\n263#1:392,2\n*E\n"})
public final class HykyManager$mBleHandleCallback$1$onReadBloodPressure$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BleBloodPressure> $bloodPressures;
    int label;
    final /* synthetic */ HykyManager this$0;
    final /* synthetic */ HykyManager$mBleHandleCallback$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HykyManager$mBleHandleCallback$1$onReadBloodPressure$1(List<BleBloodPressure> list, HykyManager hykyManager, HykyManager$mBleHandleCallback$1 hykyManager$mBleHandleCallback$1, Continuation<? super HykyManager$mBleHandleCallback$1$onReadBloodPressure$1> continuation) {
        super(2, continuation);
        this.$bloodPressures = list;
        this.this$0 = hykyManager;
        this.this$1 = hykyManager$mBleHandleCallback$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HykyManager$mBleHandleCallback$1$onReadBloodPressure$1(this.$bloodPressures, this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((HykyManager$mBleHandleCallback$1$onReadBloodPressure$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        ArrayList arrayList = new ArrayList();
        List<BleBloodPressure> list = this.$bloodPressures;
        HykyManager$mBleHandleCallback$1 hykyManager$mBleHandleCallback$1 = this.this$1;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BloodPressure bloodPressure = new BloodPressure((BleBloodPressure) it.next(), hykyManager$mBleHandleCallback$1.getOffset());
            hykyManager$mBleHandleCallback$1.getDate().setTime(bloodPressure.getMTime());
            String str = hykyManager$mBleHandleCallback$1.getFormat().format(hykyManager$mBleHandleCallback$1.getDate());
            Intrinsics.O10IXXX0X(str, "format(...)");
            bloodPressure.setMLocalTime(str);
            arrayList.add(bloodPressure);
        }
        this.this$0.uploadData(arrayList);
        return Unit.OXO1;
    }
}
