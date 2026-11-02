package com.sma.smartv3.ui.device.model;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.device.model.AddDeviceViewModel$onDownload$1$handleResponse$1", f = "AddDeviceViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AddDeviceViewModel$onDownload$1$handleResponse$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ String $mFilePath;
    int label;
    final /* synthetic */ AddDeviceViewModel this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public AddDeviceViewModel$onDownload$1$handleResponse$1(AddDeviceViewModel r1, String r2, Function1<? super Boolean, Unit> r3, Continuation<? super AddDeviceViewModel$onDownload$1$handleResponse$1> r4) {
        this.this$0 = r1;
        this.$mFilePath = r2;
        this.$callback = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new AddDeviceViewModel$onDownload$1$handleResponse$1(this.this$0, this.$mFilePath, this.$callback, r5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AddDeviceViewModel$onDownload$1$handleResponse$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
    L11:
        AddDeviceViewModel.access$getFileData(this.this$0, this.$mFilePath, this.$callback);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        this.label = 1;
        if (DelayKt.XIi00iiXO(50, this) != r0) goto L11;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
