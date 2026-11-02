package com.sma.smartv3.util.websocket;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.cw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.XiOIO;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class WebSocketConnectManager {

    @aa1
    public final cw6 OXO1;

    @aa1
    public final bw6 XIi00iiXO;

    @tb1
    public XiOIO XO0O10;

    @aa1
    public final AtomicBoolean iO;

    public WebSocketConnectManager(@aa1 cw6 r2, @aa1 bw6 r3) {
        Intrinsics.X0O(r2, DTBMetricsConfiguration.CONFIG_DIR);
        Intrinsics.X0O(r3, "client");
        this.OXO1 = r2;
        this.XIi00iiXO = r3;
        this.iO = new AtomicBoolean(false);
    }

    public static final /* synthetic */ bw6 OXO1(WebSocketConnectManager r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ cw6 XIi00iiXO(WebSocketConnectManager r0) {
        return r0.OXO1;
    }

    @tb1
    public final Object O00(@aa1 Request r7, @aa1 Continuation<? super Unit> r8) {
        if ((r8 instanceof WebSocketConnectManager$reconnect$1) == false) goto L7;
        WebSocketConnectManager$reconnect$1 r0 = (WebSocketConnectManager$reconnect$1) r8;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        r7 = (Request) r0.L$0;
        ResultKt.X1ii(r9);
    L31:
        disconnect();
        cw6 r10 = this.OXO1;
        r10.XX0(r10.O10IXXX0X() + 1);
        XO0O10(r7);
        this.iO.set(false);
        return Unit.OXO1;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r9);
        if (this.iO.get() == false) goto L19;
        return Unit.OXO1;
    L19:
        if (OIX0iXi() == true) goto L23;
        return Unit.OXO1;
    L23:
        if (IO() == true) goto L25;
    L28:
        this.iO.set(true);
        long r4 = X0O();
        r0.L$0 = r7;
        r0.label = 1;
        if (DelayKt.XIi00iiXO(r4, r0) != r2) goto L31;
        return r2;
    L25:
        if (O10IXXX0X() < XXI()) goto L28;
        return Unit.OXO1;
    L7:
        r0 = new WebSocketConnectManager$reconnect$1(this, r8);
        goto L8
    }

    public final void XO0O10(@aa1 i00OIXiO r8) {
        Intrinsics.X0O(r8, "scope");
        iO();
        if (X1ii() == true) goto L5;
        return;
    L5:
        this.XO0O10 = I100X1.O00(r8, IXOX0Xiii.iO(), null, new WebSocketConnectManager$heartBeat$1(this, null), 2, null);
    }

    public final void iO() {
        XiOIO r0 = this.XO0O10;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        this.XO0O10 = null;
    }

    public /* synthetic */ WebSocketConnectManager(cw6 r14, bw6 r15, int r16, DefaultConstructorMarker r17) {
        if ((r16 & 1) == 0) goto L5;
        int r2 = 0;
        int r3 = 0;
        long r4 = 0;
        boolean r6 = false;
        boolean r7 = false;
        boolean r8 = false;
        long r9 = 0;
        r14 = new cw6(r2, r3, r4, r6, r7, r8, r9, 127, null);
    L5:
        this(r14, r15);
    }
}
