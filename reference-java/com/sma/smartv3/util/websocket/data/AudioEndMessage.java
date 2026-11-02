package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class AudioEndMessage extends WebSocketMessage {
    private final boolean audio_end;
    private final float duration;

    @aa1
    private final String lang;

    @tb1
    private String pcmPath;

    @aa1
    private final String request_id;

    @aa1
    private final String sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEndMessage(float f, boolean z, @aa1 String lang, @aa1 String request_id, @aa1 String sessionId, @tb1 String str) {
        super(null);
        Intrinsics.X0O(lang, "lang");
        Intrinsics.X0O(request_id, "request_id");
        Intrinsics.X0O(sessionId, "sessionId");
        this.duration = f;
        this.audio_end = z;
        this.lang = lang;
        this.request_id = request_id;
        this.sessionId = sessionId;
        this.pcmPath = str;
    }

    public static /* synthetic */ AudioEndMessage copy$default(AudioEndMessage audioEndMessage, float f, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = audioEndMessage.duration;
        }
        if ((i & 2) != 0) {
            z = audioEndMessage.audio_end;
        }
        if ((i & 4) != 0) {
            str = audioEndMessage.lang;
        }
        if ((i & 8) != 0) {
            str2 = audioEndMessage.request_id;
        }
        if ((i & 16) != 0) {
            str3 = audioEndMessage.sessionId;
        }
        if ((i & 32) != 0) {
            str4 = audioEndMessage.pcmPath;
        }
        String str5 = str3;
        String str6 = str4;
        return audioEndMessage.copy(f, z, str, str2, str5, str6);
    }

    public final float component1() {
        return this.duration;
    }

    public final boolean component2() {
        return this.audio_end;
    }

    @aa1
    public final String component3() {
        return this.lang;
    }

    @aa1
    public final String component4() {
        return this.request_id;
    }

    @aa1
    public final String component5() {
        return this.sessionId;
    }

    @tb1
    public final String component6() {
        return this.pcmPath;
    }

    @aa1
    public final AudioEndMessage copy(float f, boolean z, @aa1 String lang, @aa1 String request_id, @aa1 String sessionId, @tb1 String str) {
        Intrinsics.X0O(lang, "lang");
        Intrinsics.X0O(request_id, "request_id");
        Intrinsics.X0O(sessionId, "sessionId");
        return new AudioEndMessage(f, z, lang, request_id, sessionId, str);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioEndMessage)) {
            return false;
        }
        AudioEndMessage audioEndMessage = (AudioEndMessage) obj;
        return Float.compare(this.duration, audioEndMessage.duration) == 0 && this.audio_end == audioEndMessage.audio_end && Intrinsics.XOO0ii0(this.lang, audioEndMessage.lang) && Intrinsics.XOO0ii0(this.request_id, audioEndMessage.request_id) && Intrinsics.XOO0ii0(this.sessionId, audioEndMessage.sessionId) && Intrinsics.XOO0ii0(this.pcmPath, audioEndMessage.pcmPath);
    }

    public final boolean getAudio_end() {
        return this.audio_end;
    }

    public final float getDuration() {
        return this.duration;
    }

    @aa1
    public final String getLang() {
        return this.lang;
    }

    @tb1
    public final String getPcmPath() {
        return this.pcmPath;
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

    public int hashCode() {
        int iHashCode = ((((((((Float.hashCode(this.duration) * 31) + Boolean.hashCode(this.audio_end)) * 31) + this.lang.hashCode()) * 31) + this.request_id.hashCode()) * 31) + this.sessionId.hashCode()) * 31;
        String str = this.pcmPath;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setPcmPath(@tb1 String str) {
        this.pcmPath = str;
    }

    @aa1
    public String toString() {
        return "AudioEndMessage(duration=" + this.duration + ", audio_end=" + this.audio_end + ", lang=" + this.lang + ", request_id=" + this.request_id + ", sessionId=" + this.sessionId + ", pcmPath=" + this.pcmPath + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ AudioEndMessage(float f, boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, z, str, str2, str3, (i & 32) != 0 ? "" : str4);
    }
}
