package com.sma.smartv3.util.websocket;

import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class WebSocketServiceClient implements bw6 {

    @aa1
    public final ry0<ByteString> I0IIOi;

    @aa1
    public final ry0<String> IiI10X;

    @aa1
    public final k85<ConnectionState> O00;

    @aa1
    public final l94<ByteString> OIi0;

    @aa1
    public final OkHttpClient OXO1;

    @tb1
    public WebSocket XIi00iiXO;

    @aa1
    public final ty0<ConnectionState> XO0O10;

    @aa1
    public final l94<String> XOO0ii0;

    @aa1
    public i00OIXiO iO;

    public WebSocketServiceClient() {
        this.OXO1 = new OkHttpClient();
        this.iO = I0IIOi.OXO1(IXOX0Xiii.iO());
        ty0<ConnectionState> r0 = l85.OXO1(ConnectionState.iO.OXO1);
        this.XO0O10 = r0;
        this.O00 = iX0XiO.XXI(r0);
        ry0<String> r4 = m94.XIi00iiXO(0, 64, null, 5, null);
        this.IiI10X = r4;
        this.XOO0ii0 = iX0XiO.I0iXXO(r4);
        ry0<ByteString> r1 = m94.XIi00iiXO(0, 64, null, 5, null);
        this.I0IIOi = r1;
        this.OIi0 = iX0XiO.I0iXXO(r1);
    }

    public static final /* synthetic */ ry0 I0IIOi(WebSocketServiceClient r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ ty0 IiI10X(WebSocketServiceClient r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ i00OIXiO O00(WebSocketServiceClient r0) {
        return r0.iO;
    }

    public static final /* synthetic */ ry0 XOO0ii0(WebSocketServiceClient r0) {
        return r0.I0IIOi;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.sma.smartv3.util.websocket.WebSocketServiceClient$createListener$1] */
    public final WebSocketServiceClient$createListener$1 OIi0() {
        return new WebSocketServiceClient$createListener$1(this);
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    @aa1
    public k85<ConnectionState> OXO1() {
        return this.O00;
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    @aa1
    public l94<ByteString> XIi00iiXO() {
        return this.OIi0;
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    public void XO0O10(@aa1 Request r3) {
        Intrinsics.X0O(r3, "request");
        disconnect();
        setValue(ConnectionState.XIi00iiXO.OXO1);
        this.XIi00iiXO = newWebSocket(r3, OIi0());     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        setValue(new ConnectionState.XO0O10(e));
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    public void disconnect() {
        WebSocket r0 = this.XIi00iiXO;
        if (r0 == null) goto L5;
        r0.close(1000, "Client disconnect");
    L5:
        this.XIi00iiXO = null;
        setValue(ConnectionState.iO.OXO1);
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    @aa1
    public l94<String> iO() {
        return this.XOO0ii0;
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    public void send(@aa1 String r2) {
        Intrinsics.X0O(r2, "text");
        WebSocket r0 = this.XIi00iiXO;
        if (r0 == null) goto L6;
        r0.send(r2);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    public void send(@aa1 byte[] r4) {
        Intrinsics.X0O(r4, "bytes");
        WebSocket r0 = this.XIi00iiXO;
        if (r0 == null) goto L6;
        r0.send(ByteString.Companion.of(Arrays.copyOf(r4, r4.length)));
        return;
    }
}
