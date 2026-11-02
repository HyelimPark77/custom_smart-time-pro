package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
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

    public TTSMessage(@aa1 String r2, float r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "type");
        Intrinsics.X0O(r4, JsonStorageKeyNames.SESSION_ID_KEY);
        Intrinsics.X0O(r5, SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
        super(null);
        this.type = r2;
        this.duration = r3;
        this.sessionId = r4;
        this.request_id = r5;
    }

    public static /* synthetic */ TTSMessage copy$default(TTSMessage r0, String r1, float r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.duration;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.sessionId;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.request_id;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final TTSMessage copy(@aa1 String r2, float r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "type");
        Intrinsics.X0O(r4, JsonStorageKeyNames.SESSION_ID_KEY);
        Intrinsics.X0O(r5, SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
        return new TTSMessage(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TTSMessage) == true) goto L8;
        return false;
    L8:
        TTSMessage r6 = (TTSMessage) r5;
        if (Intrinsics.XOO0ii0(this.type, r6.type) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.duration, r6.duration) == 0) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.sessionId, r6.sessionId) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.request_id, r6.request_id) == true) goto L20;
        return false;
    L20:
        return true;
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
        return "TTSMessage(type=" + this.type + ", duration=" + this.duration + ", sessionId=" + this.sessionId + ", request_id=" + this.request_id + I000IiI1O.iO.iO;
    }
}
