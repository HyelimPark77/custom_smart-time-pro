package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class AudioTimeMessage extends WebSocketMessage {

    @aa1
    private final String message;

    @tb1
    private final String request_id;

    @tb1
    private final String sessionId;

    @aa1
    private final String type;

    public AudioTimeMessage(@aa1 String r2, @tb1 String r3, @aa1 String r4, @tb1 String r5) {
        Intrinsics.X0O(r2, "message");
        Intrinsics.X0O(r4, "type");
        super(null);
        this.message = r2;
        this.sessionId = r3;
        this.type = r4;
        this.request_id = r5;
    }

    public static /* synthetic */ AudioTimeMessage copy$default(AudioTimeMessage r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.message;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.sessionId;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.type;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.request_id;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    @aa1
    public final String component1() {
        return this.message;
    }

    @tb1
    public final String component2() {
        return this.sessionId;
    }

    @aa1
    public final String component3() {
        return this.type;
    }

    @tb1
    public final String component4() {
        return this.request_id;
    }

    @aa1
    public final AudioTimeMessage copy(@aa1 String r2, @tb1 String r3, @aa1 String r4, @tb1 String r5) {
        Intrinsics.X0O(r2, "message");
        Intrinsics.X0O(r4, "type");
        return new AudioTimeMessage(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AudioTimeMessage) == true) goto L8;
        return false;
    L8:
        AudioTimeMessage r6 = (AudioTimeMessage) r5;
        if (Intrinsics.XOO0ii0(this.message, r6.message) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.sessionId, r6.sessionId) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.type, r6.type) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.request_id, r6.request_id) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getMessage() {
        return this.message;
    }

    @Override // com.sma.smartv3.util.websocket.data.WebSocketMessage
    @tb1
    public String getRequest_id() {
        return this.request_id;
    }

    @Override // com.sma.smartv3.util.websocket.data.WebSocketMessage
    @tb1
    public String getSessionId() {
        return this.sessionId;
    }

    @aa1
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int r0 = this.message.hashCode() * 31;
        String r1 = this.sessionId;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (((r0 + r3) * 31) + this.type.hashCode()) * 31;
        String r5 = this.request_id;
        if (r5 == null) goto L11;
        r2 = r5.hashCode();
    L11:
        return r4 + r2;
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    @aa1
    public String toString() {
        return "AudioTimeMessage(message=" + this.message + ", sessionId=" + this.sessionId + ", type=" + this.type + ", request_id=" + this.request_id + I000IiI1O.iO.iO;
    }

    public /* synthetic */ AudioTimeMessage(String r1, String r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 2) == 0) goto L5;
        r2 = "";
    L5:
        this(r1, r2, r3, r4);
    }
}
