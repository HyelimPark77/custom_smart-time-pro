package com.sma.smartv3.util.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.cw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
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

    /* JADX INFO: renamed from: iO */
    @aa1
    public final AtomicBoolean f54943iO;

    public WebSocketConnectManager(@aa1 cw6 config, @aa1 bw6 client) {
        Intrinsics.X0O(config, "config");
        Intrinsics.X0O(client, "client");
        this.OXO1 = config;
        this.XIi00iiXO = client;
        this.f54943iO = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    public final Object O00(@aa1 Request request, @aa1 Continuation<? super Unit> continuation) {
        WebSocketConnectManager$reconnect$1 webSocketConnectManager$reconnect$1;
        if (continuation instanceof WebSocketConnectManager$reconnect$1) {
            webSocketConnectManager$reconnect$1 = (WebSocketConnectManager$reconnect$1) continuation;
            int i = webSocketConnectManager$reconnect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketConnectManager$reconnect$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketConnectManager$reconnect$1 = new WebSocketConnectManager$reconnect$1(this, continuation);
            }
        } else {
            webSocketConnectManager$reconnect$1 = new WebSocketConnectManager$reconnect$1(this, continuation);
        }
        Object obj = webSocketConnectManager$reconnect$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = webSocketConnectManager$reconnect$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            if (!this.f54943iO.get() && this.OXO1.OIX0iXi()) {
                if (this.OXO1.m1641IO() && this.OXO1.O10IXXX0X() >= this.OXO1.XXI()) {
                    return Unit.OXO1;
                }
                this.f54943iO.set(true);
                long jX0O = this.OXO1.X0O();
                webSocketConnectManager$reconnect$1.L$0 = request;
                webSocketConnectManager$reconnect$1.label = 1;
                if (DelayKt.XIi00iiXO(jX0O, webSocketConnectManager$reconnect$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
            return Unit.OXO1;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        request = (Request) webSocketConnectManager$reconnect$1.L$0;
        ResultKt.X1ii(obj);
        this.XIi00iiXO.disconnect();
        cw6 cw6Var = this.OXO1;
        cw6Var.XX0(cw6Var.O10IXXX0X() + 1);
        this.XIi00iiXO.XO0O10(request);
        this.f54943iO.set(false);
        return Unit.OXO1;
    }

    public final void XO0O10(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        m38867iO();
        if (this.OXO1.X1ii()) {
            this.XO0O10 = XX01Oi.IiI10X(scope, IXOX0Xiii.m712iO(), null, new WebSocketConnectManager$heartBeat$1(this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: iO */
    public final void m38867iO() {
        XiOIO xiOIO = this.XO0O10;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        this.XO0O10 = null;
    }

    public /* synthetic */ WebSocketConnectManager(cw6 cw6Var, bw6 bw6Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new cw6(0, 0, 0L, false, false, false, 0L, 127, null) : cw6Var, bw6Var);
    }
}
