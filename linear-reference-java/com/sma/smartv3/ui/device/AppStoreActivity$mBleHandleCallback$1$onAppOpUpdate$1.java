package com.sma.smartv3.ui.device;

import android.view.View;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.pro.R;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.device.AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1", f = "AppStoreActivity.kt", i = {0}, l = {107}, m = "invokeSuspend", n = {"message"}, s = {"L$0"}, v = 1)
public final class AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AppStoreActivity this$0;

    public AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1(AppStoreActivity r1, Continuation<? super AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    public static /* synthetic */ boolean O00() {
        return invokeSuspend$lambda$0$0();
    }

    private static final boolean invokeSuspend$lambda$0$0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        go0 r2 = (go0) this.L$0;
        ResultKt.X1ii(r7);
    L13:
        if (r2.isShowing() == false) goto L16;
        r2.dismiss();
    L16:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        go0 r8 = new go0(AppStoreActivity.access$getMContext(this.this$0), 0, 2, null);
        r8.O1O(R.string.tip);
        r8.iX(Boxing.IiI10X(R.string.app_stfore_ailed_to_transmission));
        r8.X1IX(R.string.successful_confirm, new OXO1());
        go0.X11iII1O1(r8, null, null, 2, null);
        View r3 = this.this$0.findViewById(R.id.root);
        Intrinsics.O10IXXX0X(r3, "findViewById(...)");
        r8.XiOIO(r3);
        this.L$0 = r8;
        this.label = 1;
        if (DelayKt.XIi00iiXO(5000, this) != r0) goto L11;
        return r0;
    L11:
        r2 = r8;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
