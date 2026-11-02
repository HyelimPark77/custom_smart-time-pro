package com.sma.smartv3.biz.wx.data;

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
        String r1 = null;
        Message r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ WxMessage copy$default(WxMessage r0, String r1, Message r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.key;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.message;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.type;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final WxMessage copy(@aa1 String r2, @aa1 Message r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "key");
        Intrinsics.X0O(r3, "message");
        Intrinsics.X0O(r4, "type");
        return new WxMessage(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxMessage) == true) goto L8;
        return false;
    L8:
        WxMessage r6 = (WxMessage) r5;
        if (Intrinsics.XOO0ii0(this.key, r6.key) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.message, r6.message) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.type, r6.type) == true) goto L17;
        return false;
    L17:
        return true;
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
        return "WxMessage(key=" + this.key + ", message=" + this.message + ", type=" + this.type + I000IiI1O.iO.iO;
    }

    public WxMessage(@aa1 String r2, @aa1 Message r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "key");
        Intrinsics.X0O(r3, "message");
        Intrinsics.X0O(r4, "type");
        this.key = r2;
        this.message = r3;
        this.type = r4;
    }

    public /* synthetic */ WxMessage(String r17, Message r18, String r19, int r20, DefaultConstructorMarker r21) {
        String r1 = "";
        if ((r20 & 1) == 0) goto L5;
        String r0 = "";
    L7:
        if ((r20 & 2) == 0) goto L9;
        Message r3 = new Message(0, null, null, 0, null, null, 0, null, 255, null);
    L11:
        if ((r20 & 4) != 0) goto L14;
        r1 = r19;
    L14:
        this(r0, r3, r1);
        return;
    L9:
        r3 = r18;
        goto L11
    L5:
        r0 = r17;
        goto L7
    }
}
