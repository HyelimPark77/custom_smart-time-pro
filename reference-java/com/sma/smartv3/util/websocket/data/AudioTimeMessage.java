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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTimeMessage(@aa1 String message, @tb1 String str, @aa1 String type, @tb1 String str2) {
        super(null);
        Intrinsics.X0O(message, "message");
        Intrinsics.X0O(type, "type");
        this.message = message;
        this.sessionId = str;
        this.type = type;
        this.request_id = str2;
    }

    public static /* synthetic */ AudioTimeMessage copy$default(AudioTimeMessage audioTimeMessage, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioTimeMessage.message;
        }
        if ((i & 2) != 0) {
            str2 = audioTimeMessage.sessionId;
        }
        if ((i & 4) != 0) {
            str3 = audioTimeMessage.type;
        }
        if ((i & 8) != 0) {
            str4 = audioTimeMessage.request_id;
        }
        return audioTimeMessage.copy(str, str2, str3, str4);
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
    public final AudioTimeMessage copy(@aa1 String message, @tb1 String str, @aa1 String type, @tb1 String str2) {
        Intrinsics.X0O(message, "message");
        Intrinsics.X0O(type, "type");
        return new AudioTimeMessage(message, str, type, str2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioTimeMessage)) {
            return false;
        }
        AudioTimeMessage audioTimeMessage = (AudioTimeMessage) obj;
        return Intrinsics.XOO0ii0(this.message, audioTimeMessage.message) && Intrinsics.XOO0ii0(this.sessionId, audioTimeMessage.sessionId) && Intrinsics.XOO0ii0(this.type, audioTimeMessage.type) && Intrinsics.XOO0ii0(this.request_id, audioTimeMessage.request_id);
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
        int iHashCode = this.message.hashCode() * 31;
        String str = this.sessionId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31;
        String str2 = this.request_id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @aa1
    public String toString() {
        return "AudioTimeMessage(message=" + this.message + ", sessionId=" + this.sessionId + ", type=" + this.type + ", request_id=" + this.request_id + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ AudioTimeMessage(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3, str4);
    }
}
