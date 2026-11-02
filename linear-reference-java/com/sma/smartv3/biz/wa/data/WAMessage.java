package com.sma.smartv3.biz.wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.C2985d4;
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

    @aa1
    private String id;
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
    private long t;

    @aa1
    private String to;

    @aa1
    private String type;

    @aa1
    private String vcardFormattedName;

    public WAMessage() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        WAMessageSender r6 = null;
        boolean r7 = false;
        boolean r8 = false;
        long r9 = 0;
        boolean r11 = false;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, 131071, null);
    }

    public static /* synthetic */ WAMessage copy$default(WAMessage r17, String r18, String r19, String r20, String r21, String r22, WAMessageSender r23, boolean r24, boolean r25, long r26, boolean r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, int r36, Object r37) {
        if ((r36 & 1) == 0) goto L5;
        String r2 = r17.id;
    L7:
        if ((r36 & 2) == 0) goto L9;
        String r3 = r17.type;
    L11:
        if ((r36 & 4) == 0) goto L13;
        String r4 = r17.from;
    L15:
        if ((r36 & 8) == 0) goto L17;
        String r5 = r17.to;
    L19:
        if ((r36 & 16) == 0) goto L21;
        String r6 = r17.content;
    L23:
        if ((r36 & 32) == 0) goto L25;
        WAMessageSender r7 = r17.sender;
    L27:
        if ((r36 & 64) == 0) goto L29;
        boolean r8 = r17.isGroupMsg;
    L31:
        if ((r36 & 128) == 0) goto L33;
        boolean r9 = r17.fromMe;
    L35:
        if ((r36 & 256) == 0) goto L37;
        long r10 = r17.t;
    L39:
        if ((r36 & 512) == 0) goto L41;
        boolean r12 = r17.isGif;
    L43:
        if ((r36 & 1024) == 0) goto L45;
        String r13 = r17.notifyName;
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r14 = r17.chatId;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        String r15 = r17.session;
    L54:
        String r110 = r2;
        if ((r36 & 8192) == 0) goto L57;
        String r11 = r17.vcardFormattedName;
    L58:
        String r111 = r11;
        if ((r36 & 16384) == 0) goto L61;
        String r16 = r17.filename;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        String r1 = r17.pollName;
    L67:
        if ((r36 & 65536) == 0) goto L70;
        String r27 = r1;
        String r38 = r27;
        String r39 = r17.eventName;
    L72:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r111, r16, r38, r39);
    L70:
        r39 = r35;
        r38 = r1;
        goto L72
    L65:
        r1 = r34;
        goto L67
    L61:
        r16 = r33;
        goto L63
    L57:
        r11 = r32;
        goto L58
    L53:
        r15 = r31;
        goto L54
    L49:
        r14 = r30;
        goto L51
    L45:
        r13 = r29;
        goto L47
    L41:
        r12 = r28;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    @aa1
    public final String component1() {
        return this.id;
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
        return this.to;
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
        return this.t;
    }

    @aa1
    public final WAMessage copy(@aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, @aa1 WAMessageSender r26, boolean r27, boolean r28, long r29, boolean r31, @aa1 String r32, @aa1 String r33, @aa1 String r34, @aa1 String r35, @aa1 String r36, @aa1 String r37, @aa1 String r38) {
        Intrinsics.X0O(r21, "id");
        Intrinsics.X0O(r22, "type");
        Intrinsics.X0O(r23, "from");
        Intrinsics.X0O(r24, "to");
        Intrinsics.X0O(r25, "content");
        Intrinsics.X0O(r26, "sender");
        Intrinsics.X0O(r32, "notifyName");
        Intrinsics.X0O(r33, "chatId");
        Intrinsics.X0O(r34, "session");
        Intrinsics.X0O(r35, "vcardFormattedName");
        Intrinsics.X0O(r36, "filename");
        Intrinsics.X0O(r37, "pollName");
        Intrinsics.X0O(r38, C2985d4.i.j0);
        return new WAMessage(r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WAMessage) == true) goto L8;
        return false;
    L8:
        WAMessage r9 = (WAMessage) r8;
        if (Intrinsics.XOO0ii0(this.id, r9.id) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.type, r9.type) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.from, r9.from) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.to, r9.to) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.content, r9.content) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.sender, r9.sender) == true) goto L27;
        return false;
    L27:
        if (this.isGroupMsg == r9.isGroupMsg) goto L30;
        return false;
    L30:
        if (this.fromMe == r9.fromMe) goto L33;
        return false;
    L33:
        if (this.t == r9.t) goto L36;
        return false;
    L36:
        if (this.isGif == r9.isGif) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.notifyName, r9.notifyName) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.chatId, r9.chatId) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.session, r9.session) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.vcardFormattedName, r9.vcardFormattedName) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.filename, r9.filename) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.pollName, r9.pollName) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.eventName, r9.eventName) == true) goto L59;
        return false;
    L59:
        return true;
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
        return this.id;
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
        return this.t;
    }

    @aa1
    public final String getTo() {
        return this.to;
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
        return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.content.hashCode()) * 31) + this.sender.hashCode()) * 31) + Boolean.hashCode(this.isGroupMsg)) * 31) + Boolean.hashCode(this.fromMe)) * 31) + Long.hashCode(this.t)) * 31) + Boolean.hashCode(this.isGif)) * 31) + this.notifyName.hashCode()) * 31) + this.chatId.hashCode()) * 31) + this.session.hashCode()) * 31) + this.vcardFormattedName.hashCode()) * 31) + this.filename.hashCode()) * 31) + this.pollName.hashCode()) * 31) + this.eventName.hashCode();
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isGroupMsg() {
        return this.isGroupMsg;
    }

    public final void setChatId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.chatId = r2;
    }

    public final void setContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.content = r2;
    }

    public final void setEventName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.eventName = r2;
    }

    public final void setFilename(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.filename = r2;
    }

    public final void setFrom(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.from = r2;
    }

    public final void setFromMe(boolean r1) {
        this.fromMe = r1;
    }

    public final void setGif(boolean r1) {
        this.isGif = r1;
    }

    public final void setGroupMsg(boolean r1) {
        this.isGroupMsg = r1;
    }

    public final void setId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.id = r2;
    }

    public final void setNotifyName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.notifyName = r2;
    }

    public final void setPollName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.pollName = r2;
    }

    public final void setSender(@aa1 WAMessageSender r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sender = r2;
    }

    public final void setSession(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.session = r2;
    }

    public final void setT(long r1) {
        this.t = r1;
    }

    public final void setTo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.to = r2;
    }

    public final void setType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.type = r2;
    }

    public final void setVcardFormattedName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.vcardFormattedName = r2;
    }

    @aa1
    public String toString() {
        return "WAMessage(id=" + this.id + ", type=" + this.type + ", from=" + this.from + ", to=" + this.to + ", content=" + this.content + ", sender=" + this.sender + ", isGroupMsg=" + this.isGroupMsg + ", fromMe=" + this.fromMe + ", t=" + this.t + ", isGif=" + this.isGif + ", notifyName=" + this.notifyName + ", chatId=" + this.chatId + ", session=" + this.session + ", vcardFormattedName=" + this.vcardFormattedName + ", filename=" + this.filename + ", pollName=" + this.pollName + ", eventName=" + this.eventName + I000IiI1O.iO.iO;
    }

    public WAMessage(@aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 WAMessageSender r19, boolean r20, boolean r21, long r22, boolean r24, @aa1 String r25, @aa1 String r26, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31) {
        Intrinsics.X0O(r14, "id");
        Intrinsics.X0O(r15, "type");
        Intrinsics.X0O(r16, "from");
        Intrinsics.X0O(r17, "to");
        Intrinsics.X0O(r18, "content");
        Intrinsics.X0O(r19, "sender");
        Intrinsics.X0O(r25, "notifyName");
        Intrinsics.X0O(r26, "chatId");
        Intrinsics.X0O(r27, "session");
        Intrinsics.X0O(r28, "vcardFormattedName");
        Intrinsics.X0O(r29, "filename");
        Intrinsics.X0O(r30, "pollName");
        Intrinsics.X0O(r31, C2985d4.i.j0);
        this.id = r14;
        this.type = r15;
        this.from = r16;
        this.to = r17;
        this.content = r18;
        this.sender = r19;
        this.isGroupMsg = r20;
        this.fromMe = r21;
        this.t = r22;
        this.isGif = r24;
        this.notifyName = r25;
        this.chatId = r26;
        this.session = r27;
        this.vcardFormattedName = r28;
        this.filename = r29;
        this.pollName = r30;
        this.eventName = r31;
    }

    public /* synthetic */ WAMessage(String r19, String r20, String r21, String r22, String r23, WAMessageSender r24, boolean r25, boolean r26, long r27, boolean r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, int r37, DefaultConstructorMarker r38) {
        if ((r37 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r37 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r37 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r37 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r37 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r37 & 32) == 0) goto L25;
        WAMessageSender r8 = new WAMessageSender(null, null, null, false, 15, null);
    L26:
        boolean r9 = false;
        if ((r37 & 64) == 0) goto L29;
        boolean r7 = false;
    L31:
        if ((r37 & 128) == 0) goto L33;
        boolean r10 = false;
    L35:
        if ((r37 & 256) == 0) goto L37;
        long r11 = 0;
    L39:
        if ((r37 & 512) != 0) goto L43;
        r9 = r29;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        String r13 = "";
    L47:
        if ((r37 & 2048) == 0) goto L49;
        String r14 = "";
    L51:
        if ((r37 & 4096) == 0) goto L53;
        String r15 = "";
    L54:
        String r110 = r1;
        if ((r37 & 8192) == 0) goto L57;
        String r2 = "";
    L58:
        String r28 = r2;
        if ((r37 & 16384) == 0) goto L61;
        String r12 = "";
    L63:
        if ((r37 & 32768) == 0) goto L65;
        String r16 = "";
    L67:
        if ((r37 & 65536) == 0) goto L70;
        String r39 = "";
    L71:
        this(r110, r3, r4, r5, r6, r8, r7, r10, r11, r9, r13, r14, r15, r28, r12, r16, r39);
        return;
    L70:
        r39 = r36;
        goto L71
    L65:
        r16 = r35;
        goto L67
    L61:
        r12 = r34;
        goto L63
    L57:
        r2 = r33;
        goto L58
    L53:
        r15 = r32;
        goto L54
    L49:
        r14 = r31;
        goto L51
    L45:
        r13 = r30;
        goto L47
    L37:
        r11 = r27;
        goto L39
    L33:
        r10 = r26;
        goto L35
    L29:
        r7 = r25;
        goto L31
    L25:
        r8 = r24;
        goto L26
    L21:
        r6 = r23;
        goto L23
    L17:
        r5 = r22;
        goto L19
    L13:
        r4 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
