package com.sma.smartv3.biz;

import android.graphics.Bitmap;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
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

/* JADX INFO: renamed from: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1 */
/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1", m39466f = "DeviceInfoChecker.kt", m39467i = {}, m39468l = {679}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class C15438x57bc11a5 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bleName;
    final /* synthetic */ String $firmwareFlag;
    final /* synthetic */ Bitmap $resource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15438x57bc11a5(Bitmap bitmap, String str, String str2, Continuation<? super C15438x57bc11a5> continuation) {
        super(2, continuation);
        this.$resource = bitmap;
        this.$bleName = str;
        this.$firmwareFlag = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C15438x57bc11a5(this.$resource, this.$bleName, this.$firmwareFlag, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((C15438x57bc11a5) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            ImageUtils.save(this.$resource, uz0.m3190X1(sz0.OXO1, this.$bleName, this.$firmwareFlag), Bitmap.CompressFormat.PNG);
            this.label = 1;
            if (DelayKt.XIi00iiXO(100L, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        I01XX0.XIi00iiXO(I01XX0.XXX11i, null, 2, null);
        return Unit.OXO1;
    }
}
