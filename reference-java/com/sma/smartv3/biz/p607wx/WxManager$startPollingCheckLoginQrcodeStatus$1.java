package com.sma.smartv3.biz.p607wx;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.biz.p607wx.data.WxLoginQrCodeState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wx.WxManager$startPollingCheckLoginQrcodeStatus$1", m39466f = "WxManager.kt", m39467i = {0, 0, 0, 1, 1, 1}, m39468l = {1143, 1148}, m39469m = "invokeSuspend", m39470n = {"result", "retryCount", "maxRetries", "result", "retryCount", "maxRetries"}, m39472s = {"L$0", "I$0", "I$1", "L$0", "I$0", "I$1"}, m39473v = 1)
public final class WxManager$startPollingCheckLoginQrcodeStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    int label;

    public WxManager$startPollingCheckLoginQrcodeStatus$1(Continuation<? super WxManager$startPollingCheckLoginQrcodeStatus$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WxManager$startPollingCheckLoginQrcodeStatus$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WxManager$startPollingCheckLoginQrcodeStatus$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (kotlinx.coroutines.DelayKt.XIi00iiXO(com.facebook.login.widget.ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, r10) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        if (kotlinx.coroutines.DelayKt.XIi00iiXO(2000, r10) == r0) goto L33;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0035, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c0 -> B:34:0x00c3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        int i;
        int i2;
        WxManager wxManager;
        WxLoginQrCodeState wxLoginQrCodeStateIOO1ii1;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.X1ii(obj);
            i = 30;
            i2 = 0;
            if (i2 < i) {
                i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus -> timeout");
                WxManager.OXO1.X00O0();
                return Unit.OXO1;
            }
            wxManager = WxManager.OXO1;
            wxLoginQrCodeStateIOO1ii1 = wxManager.iOO1ii1();
            i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus -> " + i2 + ", " + wxLoginQrCodeStateIOO1ii1 + ", " + WxManager.X0O);
            if (wxLoginQrCodeStateIOO1ii1 == WxLoginQrCodeState.Verification) {
                if (!Intrinsics.XOO0ii0(WxManager.X0O, "ipad")) {
                    wxManager.Xii();
                    return Unit.OXO1;
                }
                if (WxManager.I1XOi1) {
                    wxManager.X0iO();
                }
            }
            if (wxLoginQrCodeStateIOO1ii1 == WxLoginQrCodeState.Scanning) {
                wxManager.Xii11I();
            }
            if (wxLoginQrCodeStateIOO1ii1 == WxLoginQrCodeState.Scanned) {
                wxManager.Xii11I();
                this.L$0 = SpillingKt.OXO1(wxLoginQrCodeStateIOO1ii1);
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
            } else {
                this.L$0 = SpillingKt.OXO1(wxLoginQrCodeStateIOO1ii1);
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 2;
            }
            return objI0iXXO;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$1;
            i2 = this.I$0;
            ResultKt.X1ii(obj);
            i2++;
            if (i2 < i) {
                i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus -> timeout");
                WxManager.OXO1.X00O0();
                return Unit.OXO1;
            }
            wxManager = WxManager.OXO1;
            wxLoginQrCodeStateIOO1ii1 = wxManager.iOO1ii1();
            i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus -> " + i2 + ", " + wxLoginQrCodeStateIOO1ii1 + ", " + WxManager.X0O);
            if (wxLoginQrCodeStateIOO1ii1 == WxLoginQrCodeState.Verification) {
                if (!Intrinsics.XOO0ii0(WxManager.X0O, "ipad")) {
                    wxManager.Xii();
                    return Unit.OXO1;
                }
                if (WxManager.I1XOi1) {
                    wxManager.X0iO();
                }
            }
            if (wxLoginQrCodeStateIOO1ii1 == WxLoginQrCodeState.Scanning) {
                wxManager.Xii11I();
            }
            if (wxLoginQrCodeStateIOO1ii1 == WxLoginQrCodeState.Scanned) {
                wxManager.Xii11I();
                this.L$0 = SpillingKt.OXO1(wxLoginQrCodeStateIOO1ii1);
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
            } else {
                this.L$0 = SpillingKt.OXO1(wxLoginQrCodeStateIOO1ii1);
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 2;
            }
            return objI0iXXO;
        }
        ResultKt.X1ii(obj);
        WxManager.XXIIO1i11(WxManager.OXO1, null, 1, null);
        return Unit.OXO1;
    }
}
