package com.sma.smartv3.biz.p606wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WAMessage extends JsonFieldContainer implements Serializable {

    @aa1
    private String chatId;

    @aa1
    private String content;

    @aa1
    private String eventName;

    @aa1
    private String filename;

    @aa1
    private String from;
    private boolean fromMe;

    /* JADX INFO: renamed from: id */
    @aa1
    private String f50951id;
    private boolean isGif;
    private boolean isGroupMsg;

    @aa1
    private String notifyName;

    @aa1
    private String pollName;

    @aa1
    private WAMessageSender sender;

    @aa1
    private String session;

    /* JADX INFO: renamed from: t */
    private long f50952t;

    /* JADX INFO: renamed from: to */
    @aa1
    private String f50953to;

    @aa1
    private String type;

    @aa1
    private String vcardFormattedName;

    public WAMessage() {
        this(null, null, null, null, null, null, false, false, 0L, false, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ WAMessage copy$default(WAMessage wAMessage, String str, String str2, String str3, String str4, String str5, WAMessageSender wAMessageSender, boolean z, boolean z2, long j, boolean z3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15 = (i & 1) != 0 ? wAMessage.f50951id : str;
        String str16 = (i & 2) != 0 ? wAMessage.type : str2;
        String str17 = (i & 4) != 0 ? wAMessage.from : str3;
        String str18 = (i & 8) != 0 ? wAMessage.f50953to : str4;
        String str19 = (i & 16) != 0 ? wAMessage.content : str5;
        WAMessageSender wAMessageSender2 = (i & 32) != 0 ? wAMessage.sender : wAMessageSender;
        boolean z4 = (i & 64) != 0 ? wAMessage.isGroupMsg : z;
        boolean z5 = (i & 128) != 0 ? wAMessage.fromMe : z2;
        long j2 = (i & 256) != 0 ? wAMessage.f50952t : j;
        boolean z6 = (i & 512) != 0 ? wAMessage.isGif : z3;
        String str20 = (i & 1024) != 0 ? wAMessage.notifyName : str6;
        String str21 = (i & 2048) != 0 ? wAMessage.chatId : str7;
        String str22 = (i & 4096) != 0 ? wAMessage.session : str8;
        String str23 = str15;
        String str24 = (i & 8192) != 0 ? wAMessage.vcardFormattedName : str9;
        String str25 = (i & 16384) != 0 ? wAMessage.filename : str10;
        String str26 = (i & 32768) != 0 ? wAMessage.pollName : str11;
        if ((i & 65536) != 0) {
            str14 = str26;
            str13 = wAMessage.eventName;
        } else {
            str13 = str12;
            str14 = str26;
        }
        return wAMessage.copy(str23, str16, str17, str18, str19, wAMessageSender2, z4, z5, j2, z6, str20, str21, str22, str24, str25, str14, str13);
    }

    @aa1
    public final String component1() {
        return this.f50951id;
    }

    public final boolean component10() {
        return this.isGif;
    }

    @aa1
    public final String component11() {
        return this.notifyName;
    }

    @aa1
    public final String component12() {
        return this.chatId;
    }

    @aa1
    public final String component13() {
        return this.session;
    }

    @aa1
    public final String component14() {
        return this.vcardFormattedName;
    }

    @aa1
    public final String component15() {
        return this.filename;
    }

    @aa1
    public final String component16() {
        return this.pollName;
    }

    @aa1
    public final String component17() {
        return this.eventName;
    }

    @aa1
    public final String component2() {
        return this.type;
    }

    @aa1
    public final String component3() {
        return this.from;
    }

    @aa1
    public final String component4() {
        return this.f50953to;
    }

    @aa1
    public final String component5() {
        return this.content;
    }

    @aa1
    public final WAMessageSender component6() {
        return this.sender;
    }

    public final boolean component7() {
        return this.isGroupMsg;
    }

    public final boolean component8() {
        return this.fromMe;
    }

    public final long component9() {
        return this.f50952t;
    }

    @aa1
    public final WAMessage copy(@aa1 String id, @aa1 String type, @aa1 String from, @aa1 String to, @aa1 String content, @aa1 WAMessageSender sender, boolean z, boolean z2, long j, boolean z3, @aa1 String notifyName, @aa1 String chatId, @aa1 String session, @aa1 String vcardFormattedName, @aa1 String filename, @aa1 String pollName, @aa1 String eventName) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(from, "from");
        Intrinsics.X0O(to, "to");
        Intrinsics.X0O(content, "content");
        Intrinsics.X0O(sender, "sender");
        Intrinsics.X0O(notifyName, "notifyName");
        Intrinsics.X0O(chatId, "chatId");
        Intrinsics.X0O(session, "session");
        Intrinsics.X0O(vcardFormattedName, "vcardFormattedName");
        Intrinsics.X0O(filename, "filename");
        Intrinsics.X0O(pollName, "pollName");
        Intrinsics.X0O(eventName, "eventName");
        return new WAMessage(id, type, from, to, content, sender, z, z2, j, z3, notifyName, chatId, session, vcardFormattedName, filename, pollName, eventName);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WAMessage)) {
            return false;
        }
        WAMessage wAMessage = (WAMessage) obj;
        return Intrinsics.XOO0ii0(this.f50951id, wAMessage.f50951id) && Intrinsics.XOO0ii0(this.type, wAMessage.type) && Intrinsics.XOO0ii0(this.from, wAMessage.from) && Intrinsics.XOO0ii0(this.f50953to, wAMessage.f50953to) && Intrinsics.XOO0ii0(this.content, wAMessage.content) && Intrinsics.XOO0ii0(this.sender, wAMessage.sender) && this.isGroupMsg == wAMessage.isGroupMsg && this.fromMe == wAMessage.fromMe && this.f50952t == wAMessage.f50952t && this.isGif == wAMessage.isGif && Intrinsics.XOO0ii0(this.notifyName, wAMessage.notifyName) && Intrinsics.XOO0ii0(this.chatId, wAMessage.chatId) && Intrinsics.XOO0ii0(this.session, wAMessage.session) && Intrinsics.XOO0ii0(this.vcardFormattedName, wAMessage.vcardFormattedName) && Intrinsics.XOO0ii0(this.filename, wAMessage.filename) && Intrinsics.XOO0ii0(this.pollName, wAMessage.pollName) && Intrinsics.XOO0ii0(this.eventName, wAMessage.eventName);
    }

    @aa1
    public final String getChatId() {
        return this.chatId;
    }

    @aa1
    public final String getContent() {
        return this.content;
    }

    @aa1
    public final String getEventName() {
        return this.eventName;
    }

    @aa1
    public final String getFilename() {
        return this.filename;
    }

    @aa1
    public final String getFrom() {
        return this.from;
    }

    public final boolean getFromMe() {
        return this.fromMe;
    }

    @aa1
    public final String getId() {
        return this.f50951id;
    }

    @aa1
    public final String getNotifyName() {
        return this.notifyName;
    }

    @aa1
    public final String getPollName() {
        return this.pollName;
    }

    @aa1
    public final WAMessageSender getSender() {
        return this.sender;
    }

    @aa1
    public final String getSession() {
        return this.session;
    }

    public final long getT() {
        return this.f50952t;
    }

    @aa1
    public final String getTo() {
        return this.f50953to;
    }

    @aa1
    public final String getType() {
        return this.type;
    }

    @aa1
    public final String getVcardFormattedName() {
        return this.vcardFormattedName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f50951id.hashCode() * 31) + this.type.hashCode()) * 31) + this.from.hashCode()) * 31) + this.f50953to.hashCode()) * 31) + this.content.hashCode()) * 31) + this.sender.hashCode()) * 31) + Boolean.hashCode(this.isGroupMsg)) * 31) + Boolean.hashCode(this.fromMe)) * 31) + Long.hashCode(this.f50952t)) * 31) + Boolean.hashCode(this.isGif)) * 31) + this.notifyName.hashCode()) * 31) + this.chatId.hashCode()) * 31) + this.session.hashCode()) * 31) + this.vcardFormattedName.hashCode()) * 31) + this.filename.hashCode()) * 31) + this.pollName.hashCode()) * 31) + this.eventName.hashCode();
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isGroupMsg() {
        return this.isGroupMsg;
    }

    public final void setChatId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.chatId = str;
    }

    public final void setContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.content = str;
    }

    public final void setEventName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.eventName = str;
    }

    public final void setFilename(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.filename = str;
    }

    public final void setFrom(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.from = str;
    }

    public final void setFromMe(boolean z) {
        this.fromMe = z;
    }

    public final void setGif(boolean z) {
        this.isGif = z;
    }

    public final void setGroupMsg(boolean z) {
        this.isGroupMsg = z;
    }

    public final void setId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f50951id = str;
    }

    public final void setNotifyName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.notifyName = str;
    }

    public final void setPollName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.pollName = str;
    }

    public final void setSender(@aa1 WAMessageSender wAMessageSender) {
        Intrinsics.X0O(wAMessageSender, "<set-?>");
        this.sender = wAMessageSender;
    }

    public final void setSession(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.session = str;
    }

    public final void setT(long j) {
        this.f50952t = j;
    }

    public final void setTo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f50953to = str;
    }

    public final void setType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.type = str;
    }

    public final void setVcardFormattedName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.vcardFormattedName = str;
    }

    @aa1
    public String toString() {
        return "WAMessage(id=" + this.f50951id + ", type=" + this.type + ", from=" + this.from + ", to=" + this.f50953to + ", content=" + this.content + ", sender=" + this.sender + ", isGroupMsg=" + this.isGroupMsg + ", fromMe=" + this.fromMe + ", t=" + this.f50952t + ", isGif=" + this.isGif + ", notifyName=" + this.notifyName + ", chatId=" + this.chatId + ", session=" + this.session + ", vcardFormattedName=" + this.vcardFormattedName + ", filename=" + this.filename + ", pollName=" + this.pollName + ", eventName=" + this.eventName + I000IiI1O.C2156iO.f1007iO;
    }

    public WAMessage(@aa1 String id, @aa1 String type, @aa1 String from, @aa1 String to, @aa1 String content, @aa1 WAMessageSender sender, boolean z, boolean z2, long j, boolean z3, @aa1 String notifyName, @aa1 String chatId, @aa1 String session, @aa1 String vcardFormattedName, @aa1 String filename, @aa1 String pollName, @aa1 String eventName) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(from, "from");
        Intrinsics.X0O(to, "to");
        Intrinsics.X0O(content, "content");
        Intrinsics.X0O(sender, "sender");
        Intrinsics.X0O(notifyName, "notifyName");
        Intrinsics.X0O(chatId, "chatId");
        Intrinsics.X0O(session, "session");
        Intrinsics.X0O(vcardFormattedName, "vcardFormattedName");
        Intrinsics.X0O(filename, "filename");
        Intrinsics.X0O(pollName, "pollName");
        Intrinsics.X0O(eventName, "eventName");
        this.f50951id = id;
        this.type = type;
        this.from = from;
        this.f50953to = to;
        this.content = content;
        this.sender = sender;
        this.isGroupMsg = z;
        this.fromMe = z2;
        this.f50952t = j;
        this.isGif = z3;
        this.notifyName = notifyName;
        this.chatId = chatId;
        this.session = session;
        this.vcardFormattedName = vcardFormattedName;
        this.filename = filename;
        this.pollName = pollName;
        this.eventName = eventName;
    }

    public /* synthetic */ WAMessage(String str, String str2, String str3, String str4, String str5, WAMessageSender wAMessageSender, boolean z, boolean z2, long j, boolean z3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? new WAMessageSender(null, null, null, false, 15, null) : wAMessageSender, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? 0L : j, (i & 512) == 0 ? z3 : false, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? "" : str8, (i & 8192) != 0 ? "" : str9, (i & 16384) != 0 ? "" : str10, (i & 32768) != 0 ? "" : str11, (i & 65536) != 0 ? "" : str12);
    }
}
