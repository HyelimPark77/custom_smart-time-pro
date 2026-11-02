package com.sma.smartv3.util.websocket;

import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
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

    @tb1
    public WebSocket XIi00iiXO;

    @aa1
    public final ty0<ConnectionState> XO0O10;

    @aa1
    public final l94<String> XOO0ii0;

    @aa1
    public final OkHttpClient OXO1 = new OkHttpClient();

    /* JADX INFO: renamed from: iO */
    @aa1
    public i00OIXiO f54944iO = I0IIOi.OXO1(IXOX0Xiii.m712iO());

    public WebSocketServiceClient() {
        ty0<ConnectionState> ty0VarOXO1 = l85.OXO1(ConnectionState.C19062iO.OXO1);
        this.XO0O10 = ty0VarOXO1;
        this.O00 = iX0XiO.XXI(ty0VarOXO1);
        ry0<String> ry0VarXIi00iiXO = m94.XIi00iiXO(0, 64, null, 5, null);
        this.IiI10X = ry0VarXIi00iiXO;
        this.XOO0ii0 = iX0XiO.I0iXXO(ry0VarXIi00iiXO);
        ry0<ByteString> ry0VarXIi00iiXO2 = m94.XIi00iiXO(0, 64, null, 5, null);
        this.I0IIOi = ry0VarXIi00iiXO2;
        this.OIi0 = iX0XiO.I0iXXO(ry0VarXIi00iiXO2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.sma.smartv3.util.websocket.WebSocketServiceClient$createListener$1] */
    public final WebSocketServiceClient$createListener$1 OIi0() {
        return new WebSocketListener() { // from class: com.sma.smartv3.util.websocket.WebSocketServiceClient$createListener$1
            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int i, String reason) {
                Intrinsics.X0O(webSocket, "webSocket");
                Intrinsics.X0O(reason, "reason");
                this.OXO1.XO0O10.setValue(ConnectionState.C19062iO.OXO1);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                Intrinsics.X0O(webSocket, "webSocket");
                Intrinsics.X0O(t, "t");
                this.OXO1.XO0O10.setValue(new ConnectionState.XO0O10(t));
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String text) {
                Intrinsics.X0O(webSocket, "webSocket");
                Intrinsics.X0O(text, "text");
                XX01Oi.IiI10X(this.OXO1.f54944iO, IXOX0Xiii.OXO1(), null, new WebSocketServiceClient$createListener$1$onMessage$1(this.OXO1, text, null), 2, null);
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                Intrinsics.X0O(webSocket, "webSocket");
                Intrinsics.X0O(response, "response");
                i1O0OXO1O.OXO1.OXO1("onOpen:" + response);
                this.OXO1.XO0O10.setValue(ConnectionState.OXO1.OXO1);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                Intrinsics.X0O(webSocket, "webSocket");
                Intrinsics.X0O(bytes, "bytes");
                XX01Oi.IiI10X(this.OXO1.f54944iO, IXOX0Xiii.OXO1(), null, new WebSocketServiceClient$createListener$1$onMessage$2(this.OXO1, bytes, null), 2, null);
            }
        };
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
    public void XO0O10(@aa1 Request request) {
        Intrinsics.X0O(request, "request");
        disconnect();
        this.XO0O10.setValue(ConnectionState.XIi00iiXO.OXO1);
        try {
            this.XIi00iiXO = this.OXO1.newWebSocket(request, OIi0());
        } catch (Exception e) {
            e.printStackTrace();
            this.XO0O10.setValue(new ConnectionState.XO0O10(e));
        }
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    public void disconnect() {
        WebSocket webSocket = this.XIi00iiXO;
        if (webSocket != null) {
            webSocket.close(1000, "Client disconnect");
        }
        this.XIi00iiXO = null;
        this.XO0O10.setValue(ConnectionState.C19062iO.OXO1);
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    @aa1
    /* JADX INFO: renamed from: iO */
    public l94<String> mo1570iO() {
        return this.XOO0ii0;
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    public void send(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        WebSocket webSocket = this.XIi00iiXO;
        if (webSocket != null) {
            webSocket.send(text);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.bw6
    public void send(@aa1 byte[] bytes) {
        Intrinsics.X0O(bytes, "bytes");
        WebSocket webSocket = this.XIi00iiXO;
        if (webSocket != null) {
            webSocket.send(ByteString.Companion.m40028of(Arrays.copyOf(bytes, bytes.length)));
        }
    }
}
