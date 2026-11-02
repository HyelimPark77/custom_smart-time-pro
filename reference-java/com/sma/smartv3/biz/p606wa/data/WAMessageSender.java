package com.sma.smartv3.biz.p606wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WAMessageSender extends JsonFieldContainer implements Serializable {

    /* JADX INFO: renamed from: id */
    @aa1
    private String f50954id;
    private boolean isMe;

    @aa1
    private String pushname;

    @aa1
    private String type;

    public WAMessageSender() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ WAMessageSender copy$default(WAMessageSender wAMessageSender, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wAMessageSender.f50954id;
        }
        if ((i & 2) != 0) {
            str2 = wAMessageSender.pushname;
        }
        if ((i & 4) != 0) {
            str3 = wAMessageSender.type;
        }
        if ((i & 8) != 0) {
            z = wAMessageSender.isMe;
        }
        return wAMessageSender.copy(str, str2, str3, z);
    }

    @aa1
    public final String component1() {
        return this.f50954id;
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
    public final WAMessageSender copy(@aa1 String id, @aa1 String pushname, @aa1 String type, boolean z) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(pushname, "pushname");
        Intrinsics.X0O(type, "type");
        return new WAMessageSender(id, pushname, type, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WAMessageSender)) {
            return false;
        }
        WAMessageSender wAMessageSender = (WAMessageSender) obj;
        return Intrinsics.XOO0ii0(this.f50954id, wAMessageSender.f50954id) && Intrinsics.XOO0ii0(this.pushname, wAMessageSender.pushname) && Intrinsics.XOO0ii0(this.type, wAMessageSender.type) && this.isMe == wAMessageSender.isMe;
    }

    @aa1
    public final String getId() {
        return this.f50954id;
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
        return (((((this.f50954id.hashCode() * 31) + this.pushname.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isMe);
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public final void setId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f50954id = str;
    }

    public final void setMe(boolean z) {
        this.isMe = z;
    }

    public final void setPushname(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.pushname = str;
    }

    public final void setType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.type = str;
    }

    @aa1
    public String toString() {
        return "WAMessageSender(id=" + this.f50954id + ", pushname=" + this.pushname + ", type=" + this.type + ", isMe=" + this.isMe + I000IiI1O.C2156iO.f1007iO;
    }

    public WAMessageSender(@aa1 String id, @aa1 String pushname, @aa1 String type, boolean z) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(pushname, "pushname");
        Intrinsics.X0O(type, "type");
        this.f50954id = id;
        this.pushname = pushname;
        this.type = type;
        this.isMe = z;
    }

    public /* synthetic */ WAMessageSender(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }
}
