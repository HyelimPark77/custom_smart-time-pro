package com.sma.smartv3.biz.p607wx.data;

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
        this(0L, null, null, 0, null, null, 0L, null, 255, null);
    }

    public static /* synthetic */ Message copy$default(Message message, long j, WxString wxString, WxString wxString2, int i, WxString wxString3, String str, long j2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = message.msg_id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            wxString = message.from_user_name;
        }
        WxString wxString4 = wxString;
        if ((i2 & 4) != 0) {
            wxString2 = message.to_user_name;
        }
        return message.copy(j3, wxString4, wxString2, (i2 & 8) != 0 ? message.msg_type : i, (i2 & 16) != 0 ? message.content : wxString3, (i2 & 32) != 0 ? message.push_content : str, (i2 & 64) != 0 ? message.create_time : j2, (i2 & 128) != 0 ? message.new_msg_id : str2);
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
    public final Message copy(long j, @aa1 WxString from_user_name, @aa1 WxString to_user_name, int i, @aa1 WxString content, @aa1 String push_content, long j2, @aa1 String new_msg_id) {
        Intrinsics.X0O(from_user_name, "from_user_name");
        Intrinsics.X0O(to_user_name, "to_user_name");
        Intrinsics.X0O(content, "content");
        Intrinsics.X0O(push_content, "push_content");
        Intrinsics.X0O(new_msg_id, "new_msg_id");
        return new Message(j, from_user_name, to_user_name, i, content, push_content, j2, new_msg_id);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return this.msg_id == message.msg_id && Intrinsics.XOO0ii0(this.from_user_name, message.from_user_name) && Intrinsics.XOO0ii0(this.to_user_name, message.to_user_name) && this.msg_type == message.msg_type && Intrinsics.XOO0ii0(this.content, message.content) && Intrinsics.XOO0ii0(this.push_content, message.push_content) && this.create_time == message.create_time && Intrinsics.XOO0ii0(this.new_msg_id, message.new_msg_id);
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
        return "Message(msg_id=" + this.msg_id + ", from_user_name=" + this.from_user_name + ", to_user_name=" + this.to_user_name + ", msg_type=" + this.msg_type + ", content=" + this.content + ", push_content=" + this.push_content + ", create_time=" + this.create_time + ", new_msg_id=" + this.new_msg_id + I000IiI1O.C2156iO.f1007iO;
    }

    public Message(long j, @aa1 WxString from_user_name, @aa1 WxString to_user_name, int i, @aa1 WxString content, @aa1 String push_content, long j2, @aa1 String new_msg_id) {
        Intrinsics.X0O(from_user_name, "from_user_name");
        Intrinsics.X0O(to_user_name, "to_user_name");
        Intrinsics.X0O(content, "content");
        Intrinsics.X0O(push_content, "push_content");
        Intrinsics.X0O(new_msg_id, "new_msg_id");
        this.msg_id = j;
        this.from_user_name = from_user_name;
        this.to_user_name = to_user_name;
        this.msg_type = i;
        this.content = content;
        this.push_content = push_content;
        this.create_time = j2;
        this.new_msg_id = new_msg_id;
    }

    public /* synthetic */ Message(long j, WxString wxString, WxString wxString2, int i, WxString wxString3, String str, long j2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1L : j, (i2 & 2) != 0 ? new WxString(null, 1, null) : wxString, (i2 & 4) != 0 ? new WxString(null, 1, null) : wxString2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new WxString(null, 1, null) : wxString3, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? 0L : j2, (i2 & 128) != 0 ? "" : str2);
    }
}
