package com.sma.smartv3.biz.wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class Message extends JsonFieldContainer implements Serializable {

    @aa1
    private final WxString content;
    private final long create_time;

    @aa1
    private final WxString from_user_name;
    private final long msg_id;
    private final int msg_type;

    @aa1
    private final String new_msg_id;

    @aa1
    private final String push_content;

    @aa1
    private final WxString to_user_name;

    public Message() {
        long r1 = 0;
        WxString r3 = null;
        WxString r4 = null;
        int r5 = 0;
        WxString r6 = null;
        String r7 = null;
        long r8 = 0;
        String r10 = null;
        this(r1, r3, r4, r5, r6, r7, r8, r10, 255, null);
    }

    public static /* synthetic */ Message copy$default(Message r11, long r12, WxString r14, WxString r15, int r16, WxString r17, String r18, long r19, String r21, int r22, Object r23) {
        if ((r22 & 1) == 0) goto L5;
        r12 = r11.msg_id;
    L5:
        long r1 = r12;
        if ((r22 & 2) == 0) goto L8;
        r14 = r11.from_user_name;
    L8:
        WxString r3 = r14;
        if ((r22 & 4) == 0) goto L11;
        r15 = r11.to_user_name;
    L11:
        WxString r4 = r15;
        if ((r22 & 8) == 0) goto L14;
        int r5 = r11.msg_type;
    L16:
        if ((r22 & 16) == 0) goto L18;
        WxString r6 = r11.content;
    L20:
        if ((r22 & 32) == 0) goto L22;
        String r7 = r11.push_content;
    L24:
        if ((r22 & 64) == 0) goto L26;
        long r8 = r11.create_time;
    L28:
        if ((r22 & 128) == 0) goto L31;
        String r10 = r11.new_msg_id;
    L33:
        return r11.copy(r1, r3, r4, r5, r6, r7, r8, r10);
    L31:
        r10 = r21;
        goto L33
    L26:
        r8 = r19;
        goto L28
    L22:
        r7 = r18;
        goto L24
    L18:
        r6 = r17;
        goto L20
    L14:
        r5 = r16;
        goto L16
    }

    public final long component1() {
        return this.msg_id;
    }

    @aa1
    public final WxString component2() {
        return this.from_user_name;
    }

    @aa1
    public final WxString component3() {
        return this.to_user_name;
    }

    public final int component4() {
        return this.msg_type;
    }

    @aa1
    public final WxString component5() {
        return this.content;
    }

    @aa1
    public final String component6() {
        return this.push_content;
    }

    public final long component7() {
        return this.create_time;
    }

    @aa1
    public final String component8() {
        return this.new_msg_id;
    }

    @aa1
    public final Message copy(long r13, @aa1 WxString r15, @aa1 WxString r16, int r17, @aa1 WxString r18, @aa1 String r19, long r20, @aa1 String r22) {
        Intrinsics.X0O(r15, "from_user_name");
        Intrinsics.X0O(r16, "to_user_name");
        Intrinsics.X0O(r18, "content");
        Intrinsics.X0O(r19, "push_content");
        Intrinsics.X0O(r22, "new_msg_id");
        return new Message(r13, r15, r16, r17, r18, r19, r20, r22);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Message) == true) goto L8;
        return false;
    L8:
        Message r9 = (Message) r8;
        if (this.msg_id == r9.msg_id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.from_user_name, r9.from_user_name) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.to_user_name, r9.to_user_name) == true) goto L18;
        return false;
    L18:
        if (this.msg_type == r9.msg_type) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.content, r9.content) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.push_content, r9.push_content) == true) goto L27;
        return false;
    L27:
        if (this.create_time == r9.create_time) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.new_msg_id, r9.new_msg_id) == true) goto L32;
        return false;
    L32:
        return true;
    }

    @aa1
    public final WxString getContent() {
        return this.content;
    }

    public final long getCreate_time() {
        return this.create_time;
    }

    @aa1
    public final WxString getFrom_user_name() {
        return this.from_user_name;
    }

    public final long getMsg_id() {
        return this.msg_id;
    }

    public final int getMsg_type() {
        return this.msg_type;
    }

    @aa1
    public final String getNew_msg_id() {
        return this.new_msg_id;
    }

    @aa1
    public final String getPush_content() {
        return this.push_content;
    }

    @aa1
    public final WxString getTo_user_name() {
        return this.to_user_name;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.msg_id) * 31) + this.from_user_name.hashCode()) * 31) + this.to_user_name.hashCode()) * 31) + Integer.hashCode(this.msg_type)) * 31) + this.content.hashCode()) * 31) + this.push_content.hashCode()) * 31) + Long.hashCode(this.create_time)) * 31) + this.new_msg_id.hashCode();
    }

    @aa1
    public String toString() {
        return "Message(msg_id=" + this.msg_id + ", from_user_name=" + this.from_user_name + ", to_user_name=" + this.to_user_name + ", msg_type=" + this.msg_type + ", content=" + this.content + ", push_content=" + this.push_content + ", create_time=" + this.create_time + ", new_msg_id=" + this.new_msg_id + I000IiI1O.iO.iO;
    }

    public Message(long r2, @aa1 WxString r4, @aa1 WxString r5, int r6, @aa1 WxString r7, @aa1 String r8, long r9, @aa1 String r11) {
        Intrinsics.X0O(r4, "from_user_name");
        Intrinsics.X0O(r5, "to_user_name");
        Intrinsics.X0O(r7, "content");
        Intrinsics.X0O(r8, "push_content");
        Intrinsics.X0O(r11, "new_msg_id");
        this.msg_id = r2;
        this.from_user_name = r4;
        this.to_user_name = r5;
        this.msg_type = r6;
        this.content = r7;
        this.push_content = r8;
        this.create_time = r9;
        this.new_msg_id = r11;
    }

    public /* synthetic */ Message(long r12, WxString r14, WxString r15, int r16, WxString r17, String r18, long r19, String r21, int r22, DefaultConstructorMarker r23) {
        if ((r22 & 1) == 0) goto L5;
        r12 = -1;
    L5:
        long r1 = r12;
        if ((r22 & 2) == 0) goto L9;
        r14 = new WxString(null, 1, null);
    L9:
        if ((r22 & 4) == 0) goto L11;
        r15 = new WxString(null, 1, null);
    L11:
        WxString r4 = r15;
        if ((r22 & 8) == 0) goto L14;
        int r5 = 0;
    L16:
        if ((r22 & 16) == 0) goto L18;
        WxString r6 = new WxString(null, 1, null);
    L20:
        if ((r22 & 32) == 0) goto L22;
        String r7 = "";
    L24:
        if ((r22 & 64) == 0) goto L26;
        long r8 = 0;
    L28:
        if ((r22 & 128) == 0) goto L31;
        String r10 = "";
    L32:
        this(r1, r14, r4, r5, r6, r7, r8, r10);
        return;
    L31:
        r10 = r21;
        goto L32
    L26:
        r8 = r19;
        goto L28
    L22:
        r7 = r18;
        goto L24
    L18:
        r6 = r17;
        goto L20
    L14:
        r5 = r16;
        goto L16
    }
}
