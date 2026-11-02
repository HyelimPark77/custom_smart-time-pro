package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.Q6;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
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

    public AudioEndMessage(float r2, boolean r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @tb1 String r7) {
        Intrinsics.X0O(r4, Q6.q);
        Intrinsics.X0O(r5, SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
        Intrinsics.X0O(r6, JsonStorageKeyNames.SESSION_ID_KEY);
        super(null);
        this.duration = r2;
        this.audio_end = r3;
        this.lang = r4;
        this.request_id = r5;
        this.sessionId = r6;
        this.pcmPath = r7;
    }

    public static /* synthetic */ AudioEndMessage copy$default(AudioEndMessage r0, float r1, boolean r2, String r3, String r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.duration;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.audio_end;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.lang;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.request_id;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.sessionId;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.pcmPath;
    L20:
        String r9 = r5;
        String r10 = r6;
        String r11 = r3;
        String r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final AudioEndMessage copy(float r9, boolean r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @tb1 String r14) {
        Intrinsics.X0O(r11, Q6.q);
        Intrinsics.X0O(r12, SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
        Intrinsics.X0O(r13, JsonStorageKeyNames.SESSION_ID_KEY);
        return new AudioEndMessage(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AudioEndMessage) == true) goto L8;
        return false;
    L8:
        AudioEndMessage r6 = (AudioEndMessage) r5;
        if (Float.compare(this.duration, r6.duration) == 0) goto L12;
        return false;
    L12:
        if (this.audio_end == r6.audio_end) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.lang, r6.lang) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.request_id, r6.request_id) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.sessionId, r6.sessionId) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.pcmPath, r6.pcmPath) == true) goto L26;
        return false;
    L26:
        return true;
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
        int r0 = ((((((((Float.hashCode(this.duration) * 31) + Boolean.hashCode(this.audio_end)) * 31) + this.lang.hashCode()) * 31) + this.request_id.hashCode()) * 31) + this.sessionId.hashCode()) * 31;
        String r1 = this.pcmPath;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final void setPcmPath(@tb1 String r1) {
        this.pcmPath = r1;
    }

    @aa1
    public String toString() {
        return "AudioEndMessage(duration=" + this.duration + ", audio_end=" + this.audio_end + ", lang=" + this.lang + ", request_id=" + this.request_id + ", sessionId=" + this.sessionId + ", pcmPath=" + this.pcmPath + I000IiI1O.iO.iO;
    }

    public /* synthetic */ AudioEndMessage(float r8, boolean r9, String r10, String r11, String r12, String r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 32) == 0) goto L5;
        r13 = "";
    L5:
        this(r8, r9, r10, r11, r12, r13);
    }
}
