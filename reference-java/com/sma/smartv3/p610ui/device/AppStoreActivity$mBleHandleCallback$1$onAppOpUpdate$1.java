package com.sma.smartv3.p610ui.device;

import android.view.View;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.sma.smartv3.pro.R;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.device.AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1", m39466f = "AppStoreActivity.kt", m39467i = {0}, m39468l = {107}, m39469m = "invokeSuspend", m39470n = {"message"}, m39472s = {"L$0"}, m39473v = 1)
public final class AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AppStoreActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1(AppStoreActivity appStoreActivity, Continuation<? super AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = appStoreActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0$0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        go0 go0Var;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            go0 go0Var2 = new go0(this.this$0.getMContext(), 0, 2, null);
            go0Var2.O1O(R.string.tip);
            go0Var2.m1865iX(Boxing.IiI10X(R.string.app_stfore_ailed_to_transmission));
            go0Var2.X1IX(R.string.successful_confirm, new Function0() { // from class: com.sma.smartv3.ui.device.OXO1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1.invokeSuspend$lambda$0$0());
                }
            });
            go0.X11iII1O1(go0Var2, null, null, 2, null);
            View viewFindViewById = this.this$0.findViewById(R.id.root);
            Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
            go0Var2.XiOIO(viewFindViewById);
            this.L$0 = go0Var2;
            this.label = 1;
            if (DelayKt.XIi00iiXO(5000L, this) == objI0iXXO) {
                return objI0iXXO;
            }
            go0Var = go0Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            go0Var = (go0) this.L$0;
            ResultKt.X1ii(obj);
        }
        if (go0Var.isShowing()) {
            go0Var.dismiss();
        }
        return Unit.OXO1;
    }
}
