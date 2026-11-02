package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class STTMessage extends WebSocketMessage {
    private final float duration;

    @aa1
    private final String request_id;

    @aa1
    private final String sessionId;

    @aa1
    private final String text;

    @aa1
    private final String to_lang;

    @tb1
    private final String translation;

    @tb1
    private final Integer tts_end;

    @aa1
    private final String type;

    public STTMessage(@aa1 String r2, float r3, @aa1 String r4, @tb1 String r5, @aa1 String r6, @tb1 Integer r7, @aa1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r2, "type");
        Intrinsics.X0O(r4, "to_lang");
        Intrinsics.X0O(r6, "text");
        Intrinsics.X0O(r8, JsonStorageKeyNames.SESSION_ID_KEY);
        Intrinsics.X0O(r9, SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
        super(null);
        this.type = r2;
        this.duration = r3;
        this.to_lang = r4;
        this.translation = r5;
        this.text = r6;
        this.tts_end = r7;
        this.sessionId = r8;
        this.request_id = r9;
    }

    public static /* synthetic */ STTMessage copy$default(STTMessage r0, String r1, float r2, String r3, String r4, String r5, Integer r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.duration;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.to_lang;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.translation;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.text;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.tts_end;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.sessionId;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.request_id;
    L26:
        String r11 = r7;
        String r12 = r8;
        String r13 = r5;
        Integer r14 = r6;
        String r15 = r3;
        String r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
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
        return this.to_lang;
    }

    @tb1
    public final String component4() {
        return this.translation;
    }

    @aa1
    public final String component5() {
        return this.text;
    }

    @tb1
    public final Integer component6() {
        return this.tts_end;
    }

    @aa1
    public final String component7() {
        return this.sessionId;
    }

    @aa1
    public final String component8() {
        return this.request_id;
    }

    @aa1
    public final STTMessage copy(@aa1 String r11, float r12, @aa1 String r13, @tb1 String r14, @aa1 String r15, @tb1 Integer r16, @aa1 String r17, @aa1 String r18) {
        Intrinsics.X0O(r11, "type");
        Intrinsics.X0O(r13, "to_lang");
        Intrinsics.X0O(r15, "text");
        Intrinsics.X0O(r17, JsonStorageKeyNames.SESSION_ID_KEY);
        Intrinsics.X0O(r18, SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
        return new STTMessage(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof STTMessage) == true) goto L8;
        return false;
    L8:
        STTMessage r6 = (STTMessage) r5;
        if (Intrinsics.XOO0ii0(this.type, r6.type) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.duration, r6.duration) == 0) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.to_lang, r6.to_lang) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.translation, r6.translation) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.tts_end, r6.tts_end) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.sessionId, r6.sessionId) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.request_id, r6.request_id) == true) goto L32;
        return false;
    L32:
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
    public final String getText() {
        return this.text;
    }

    @aa1
    public final String getTo_lang() {
        return this.to_lang;
    }

    @tb1
    public final String getTranslation() {
        return this.translation;
    }

    @tb1
    public final Integer getTts_end() {
        return this.tts_end;
    }

    @aa1
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int r0 = ((((this.type.hashCode() * 31) + Float.hashCode(this.duration)) * 31) + this.to_lang.hashCode()) * 31;
        String r1 = this.translation;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (((r0 + r3) * 31) + this.text.hashCode()) * 31;
        Integer r5 = this.tts_end;
        if (r5 == null) goto L11;
        r2 = r5.hashCode();
    L11:
        return ((((r4 + r2) * 31) + this.sessionId.hashCode()) * 31) + this.request_id.hashCode();
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    @aa1
    public String toString() {
        return "STTMessage(type=" + this.type + ", duration=" + this.duration + ", to_lang=" + this.to_lang + ", translation=" + this.translation + ", text=" + this.text + ", tts_end=" + this.tts_end + ", sessionId=" + this.sessionId + ", request_id=" + this.request_id + I000IiI1O.iO.iO;
    }

    public /* synthetic */ STTMessage(String r10, float r11, String r12, String r13, String r14, Integer r15, String r16, String r17, int r18, DefaultConstructorMarker r19) {
        if ((r18 & 8) == 0) goto L5;
        r13 = "";
    L5:
        String r4 = r13;
        if ((r18 & 32) == 0) goto L9;
        Integer r6 = null;
    L10:
        this(r10, r11, r12, r4, r14, r6, r16, r17);
        return;
    L9:
        r6 = r15;
        goto L10
    }
}
