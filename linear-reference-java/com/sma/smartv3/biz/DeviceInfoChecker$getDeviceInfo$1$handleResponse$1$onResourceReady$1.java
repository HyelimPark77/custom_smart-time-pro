package com.sma.smartv3.biz;

import android.graphics.Bitmap;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ImageUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1", f = "DeviceInfoChecker.kt", i = {}, l = {679}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bleName;
    final /* synthetic */ String $firmwareFlag;
    final /* synthetic */ Bitmap $resource;
    int label;

    public DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1(Bitmap r1, String r2, String r3, Continuation<? super DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1> r4) {
        this.$resource = r1;
        this.$bleName = r2;
        this.$firmwareFlag = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1(this.$resource, this.$bleName, this.$firmwareFlag, r5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r6);
    L11:
        I01XX0.XIi00iiXO(I01XX0.XXX11i, null, 2, null);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r6);
        ImageUtils.save(this.$resource, uz0.X1(sz0.OXO1, this.$bleName, this.$firmwareFlag), Bitmap.CompressFormat.PNG);
        this.label = 1;
        if (DelayKt.XIi00iiXO(100, this) != r0) goto L11;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
