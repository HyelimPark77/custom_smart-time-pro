package com.sma.smartv3.biz.p607wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxMessage extends JsonFieldContainer implements Serializable {

    @aa1
    private final String key;

    @aa1
    private final Message message;

    @aa1
    private final String type;

    public WxMessage() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WxMessage copy$default(WxMessage wxMessage, String str, Message message, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wxMessage.key;
        }
        if ((i & 2) != 0) {
            message = wxMessage.message;
        }
        if ((i & 4) != 0) {
            str2 = wxMessage.type;
        }
        return wxMessage.copy(str, message, str2);
    }

    @aa1
    public final String component1() {
        return this.key;
    }

    @aa1
    public final Message component2() {
        return this.message;
    }

    @aa1
    public final String component3() {
        return this.type;
    }

    @aa1
    public final WxMessage copy(@aa1 String key, @aa1 Message message, @aa1 String type) {
        Intrinsics.X0O(key, "key");
        Intrinsics.X0O(message, "message");
        Intrinsics.X0O(type, "type");
        return new WxMessage(key, message, type);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxMessage)) {
            return false;
        }
        WxMessage wxMessage = (WxMessage) obj;
        return Intrinsics.XOO0ii0(this.key, wxMessage.key) && Intrinsics.XOO0ii0(this.message, wxMessage.message) && Intrinsics.XOO0ii0(this.type, wxMessage.type);
    }

    @aa1
    public final String getKey() {
        return this.key;
    }

    @aa1
    public final Message getMessage() {
        return this.message;
    }

    @aa1
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
    }

    @aa1
    public String toString() {
        return "WxMessage(key=" + this.key + ", message=" + this.message + ", type=" + this.type + I000IiI1O.C2156iO.f1007iO;
    }

    public WxMessage(@aa1 String key, @aa1 Message message, @aa1 String type) {
        Intrinsics.X0O(key, "key");
        Intrinsics.X0O(message, "message");
        Intrinsics.X0O(type, "type");
        this.key = key;
        this.message = message;
        this.type = type;
    }

    public /* synthetic */ WxMessage(String str, Message message, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new Message(0L, null, null, 0, null, null, 0L, null, 255, null) : message, (i & 4) == 0 ? str2 : "");
    }
}
