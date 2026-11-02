package com.sma.smartv3.biz.wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WAMessageSender extends JsonFieldContainer implements Serializable {

    @aa1
    private String id;
    private boolean isMe;

    @aa1
    private String pushname;

    @aa1
    private String type;

    public WAMessageSender() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        boolean r4 = false;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ WAMessageSender copy$default(WAMessageSender r0, String r1, String r2, String r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.pushname;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.type;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.isMe;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    @aa1
    public final String component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.pushname;
    }

    @aa1
    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.isMe;
    }

    @aa1
    public final WAMessageSender copy(@aa1 String r2, @aa1 String r3, @aa1 String r4, boolean r5) {
        Intrinsics.X0O(r2, "id");
        Intrinsics.X0O(r3, "pushname");
        Intrinsics.X0O(r4, "type");
        return new WAMessageSender(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WAMessageSender) == true) goto L8;
        return false;
    L8:
        WAMessageSender r6 = (WAMessageSender) r5;
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.pushname, r6.pushname) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.type, r6.type) == true) goto L18;
        return false;
    L18:
        if (this.isMe == r6.isMe) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getId() {
        return this.id;
    }

    @aa1
    public final String getPushname() {
        return this.pushname;
    }

    @aa1
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.pushname.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isMe);
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public final void setId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.id = r2;
    }

    public final void setMe(boolean r1) {
        this.isMe = r1;
    }

    public final void setPushname(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.pushname = r2;
    }

    public final void setType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.type = r2;
    }

    @aa1
    public String toString() {
        return "WAMessageSender(id=" + this.id + ", pushname=" + this.pushname + ", type=" + this.type + ", isMe=" + this.isMe + I000IiI1O.iO.iO;
    }

    public WAMessageSender(@aa1 String r2, @aa1 String r3, @aa1 String r4, boolean r5) {
        Intrinsics.X0O(r2, "id");
        Intrinsics.X0O(r3, "pushname");
        Intrinsics.X0O(r4, "type");
        this.id = r2;
        this.pushname = r3;
        this.type = r4;
        this.isMe = r5;
    }

    public /* synthetic */ WAMessageSender(String r2, String r3, String r4, boolean r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = false;
    L14:
        this(r2, r3, r4, r5);
    }
}
