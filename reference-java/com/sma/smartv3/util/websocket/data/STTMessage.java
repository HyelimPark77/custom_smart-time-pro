package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public STTMessage(@aa1 String type, float f, @aa1 String to_lang, @tb1 String str, @aa1 String text, @tb1 Integer num, @aa1 String sessionId, @aa1 String request_id) {
        super(null);
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(to_lang, "to_lang");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(sessionId, "sessionId");
        Intrinsics.X0O(request_id, "request_id");
        this.type = type;
        this.duration = f;
        this.to_lang = to_lang;
        this.translation = str;
        this.text = text;
        this.tts_end = num;
        this.sessionId = sessionId;
        this.request_id = request_id;
    }

    public static /* synthetic */ STTMessage copy$default(STTMessage sTTMessage, String str, float f, String str2, String str3, String str4, Integer num, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sTTMessage.type;
        }
        if ((i & 2) != 0) {
            f = sTTMessage.duration;
        }
        if ((i & 4) != 0) {
            str2 = sTTMessage.to_lang;
        }
        if ((i & 8) != 0) {
            str3 = sTTMessage.translation;
        }
        if ((i & 16) != 0) {
            str4 = sTTMessage.text;
        }
        if ((i & 32) != 0) {
            num = sTTMessage.tts_end;
        }
        if ((i & 64) != 0) {
            str5 = sTTMessage.sessionId;
        }
        if ((i & 128) != 0) {
            str6 = sTTMessage.request_id;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        Integer num2 = num;
        return sTTMessage.copy(str, f, str2, str3, str9, num2, str7, str8);
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
    public final STTMessage copy(@aa1 String type, float f, @aa1 String to_lang, @tb1 String str, @aa1 String text, @tb1 Integer num, @aa1 String sessionId, @aa1 String request_id) {
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(to_lang, "to_lang");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(sessionId, "sessionId");
        Intrinsics.X0O(request_id, "request_id");
        return new STTMessage(type, f, to_lang, str, text, num, sessionId, request_id);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof STTMessage)) {
            return false;
        }
        STTMessage sTTMessage = (STTMessage) obj;
        return Intrinsics.XOO0ii0(this.type, sTTMessage.type) && Float.compare(this.duration, sTTMessage.duration) == 0 && Intrinsics.XOO0ii0(this.to_lang, sTTMessage.to_lang) && Intrinsics.XOO0ii0(this.translation, sTTMessage.translation) && Intrinsics.XOO0ii0(this.text, sTTMessage.text) && Intrinsics.XOO0ii0(this.tts_end, sTTMessage.tts_end) && Intrinsics.XOO0ii0(this.sessionId, sTTMessage.sessionId) && Intrinsics.XOO0ii0(this.request_id, sTTMessage.request_id);
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
        int iHashCode = ((((this.type.hashCode() * 31) + Float.hashCode(this.duration)) * 31) + this.to_lang.hashCode()) * 31;
        String str = this.translation;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.text.hashCode()) * 31;
        Integer num = this.tts_end;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.sessionId.hashCode()) * 31) + this.request_id.hashCode();
    }

    @aa1
    public String toString() {
        return "STTMessage(type=" + this.type + ", duration=" + this.duration + ", to_lang=" + this.to_lang + ", translation=" + this.translation + ", text=" + this.text + ", tts_end=" + this.tts_end + ", sessionId=" + this.sessionId + ", request_id=" + this.request_id + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ STTMessage(String str, float f, String str2, String str3, String str4, Integer num, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, str2, (i & 8) != 0 ? "" : str3, str4, (i & 32) != 0 ? null : num, str5, str6);
    }
}
