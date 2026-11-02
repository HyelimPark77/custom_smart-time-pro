package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class TTSMessage extends WebSocketMessage {
    private final float duration;

    @aa1
    private final String request_id;

    @aa1
    private final String sessionId;

    @aa1
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTSMessage(@aa1 String type, float f, @aa1 String sessionId, @aa1 String request_id) {
        super(null);
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(sessionId, "sessionId");
        Intrinsics.X0O(request_id, "request_id");
        this.type = type;
        this.duration = f;
        this.sessionId = sessionId;
        this.request_id = request_id;
    }

    public static /* synthetic */ TTSMessage copy$default(TTSMessage tTSMessage, String str, float f, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTSMessage.type;
        }
        if ((i & 2) != 0) {
            f = tTSMessage.duration;
        }
        if ((i & 4) != 0) {
            str2 = tTSMessage.sessionId;
        }
        if ((i & 8) != 0) {
            str3 = tTSMessage.request_id;
        }
        return tTSMessage.copy(str, f, str2, str3);
    }

    @aa1
    public final String component1() {
        return this.type;
    }

    public final float component2() {
        return this.duration;
    }

    @aa1
    public final String component3() {
        return this.sessionId;
    }

    @aa1
    public final String component4() {
        return this.request_id;
    }

    @aa1
    public final TTSMessage copy(@aa1 String type, float f, @aa1 String sessionId, @aa1 String request_id) {
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(sessionId, "sessionId");
        Intrinsics.X0O(request_id, "request_id");
        return new TTSMessage(type, f, sessionId, request_id);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSMessage)) {
            return false;
        }
        TTSMessage tTSMessage = (TTSMessage) obj;
        return Intrinsics.XOO0ii0(this.type, tTSMessage.type) && Float.compare(this.duration, tTSMessage.duration) == 0 && Intrinsics.XOO0ii0(this.sessionId, tTSMessage.sessionId) && Intrinsics.XOO0ii0(this.request_id, tTSMessage.request_id);
    }

    public final float getDuration() {
        return this.duration;
    }

    @Override // com.sma.smartv3.util.websocket.data.WebSocketMessage
    @aa1
    public String getRequest_id() {
        return this.request_id;
    }

    @Override // com.sma.smartv3.util.websocket.data.WebSocketMessage
    @aa1
    public String getSessionId() {
        return this.sessionId;
    }

    @aa1
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + Float.hashCode(this.duration)) * 31) + this.sessionId.hashCode()) * 31) + this.request_id.hashCode();
    }

    @aa1
    public String toString() {
        return "TTSMessage(type=" + this.type + ", duration=" + this.duration + ", sessionId=" + this.sessionId + ", request_id=" + this.request_id + I000IiI1O.C2156iO.f1007iO;
    }
}
