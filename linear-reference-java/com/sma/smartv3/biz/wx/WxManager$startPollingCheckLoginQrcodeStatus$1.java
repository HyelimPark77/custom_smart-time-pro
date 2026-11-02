package com.sma.smartv3.biz.wx;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.facebook.login.widget.ToolTipPopup;
import com.sma.smartv3.biz.wx.data.WxLoginQrCodeState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wx.WxManager$startPollingCheckLoginQrcodeStatus$1", f = "WxManager.kt", i = {0, 0, 0, 1, 1, 1}, l = {1143, 1148}, m = "invokeSuspend", n = {"result", "retryCount", "maxRetries", "result", "retryCount", "maxRetries"}, s = {"L$0", "I$0", "I$1", "L$0", "I$0", "I$1"}, v = 1)
public final class WxManager$startPollingCheckLoginQrcodeStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    int label;

    public WxManager$startPollingCheckLoginQrcodeStatus$1(Continuation<? super WxManager$startPollingCheckLoginQrcodeStatus$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new WxManager$startPollingCheckLoginQrcodeStatus$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WxManager$startPollingCheckLoginQrcodeStatus$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c0 -> B:34:0x00c3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r11) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        int r2 = this.I$1;
        int r4 = this.I$0;
        WxLoginQrCodeState r5 = (WxLoginQrCodeState) this.L$0;
        ResultKt.X1ii(r11);
    L34:
        r4 = r4 + 1;
    L11:
        if (r4 >= r2) goto L35;
        WxManager r12 = WxManager.OXO1;
        WxLoginQrCodeState r6 = WxManager.XOO0ii0(r12);
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus -> " + r4 + ", " + r6 + ", " + WxManager.XXI());
        if (r6 != WxLoginQrCodeState.Verification) goto L22;
        if (Intrinsics.XOO0ii0(WxManager.XXI(), "ipad") == false) goto L19;
        r12.Xii();
        return Unit.OXO1;
    L19:
        if (WxManager.I1XOi1() == false) goto L22;
        r12.X0iO();
    L22:
        if (r6 != WxLoginQrCodeState.Scanning) goto L25;
        r12.Xii11I();
    L25:
        if (r6 != WxLoginQrCodeState.Scanned) goto L31;
        r12.Xii11I();
        this.L$0 = SpillingKt.OXO1(r6);
        this.I$0 = r4;
        this.I$1 = r2;
        this.label = 1;
        if (DelayKt.XIi00iiXO(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, this) == r0) goto L33;
    L29:
        WxManager.XXIIO1i11(WxManager.OXO1, null, 1, null);
        return Unit.OXO1;
    L33:
        return r0;
    L31:
        this.L$0 = SpillingKt.OXO1(r6);
        this.I$0 = r4;
        this.I$1 = r2;
        this.label = 2;
        if (DelayKt.XIi00iiXO(2000, this) != r0) goto L34;
    L35:
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus -> timeout");
        WxManager.OXO1.X00O0();
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        WxLoginQrCodeState r3 = (WxLoginQrCodeState) this.L$0;
        ResultKt.X1ii(r11);
        goto L29
    L10:
        ResultKt.X1ii(r11);
        r2 = 30;
        r4 = 0;
        goto L11
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
