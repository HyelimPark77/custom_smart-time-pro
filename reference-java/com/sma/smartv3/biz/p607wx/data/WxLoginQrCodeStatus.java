package com.sma.smartv3.biz.p607wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxLoginQrCodeStatus extends JsonFieldContainer implements Serializable {
    private final int effective_time;

    @aa1
    private final String msg;
    private final boolean othersInServerLogin;
    private final int push_login_url_expired_time;
    private final int ret;
    private final int state;

    @aa1
    private final String tarGetServerIp;
    private final int unknow;

    @aa1
    private final String uuId;

    @aa1
    private final String uuid;

    public WxLoginQrCodeStatus() {
        this(null, 0, 0, 0, 0, 0, false, null, null, null, 1023, null);
    }

    public static /* synthetic */ WxLoginQrCodeStatus copy$default(WxLoginQrCodeStatus wxLoginQrCodeStatus, String str, int i, int i2, int i3, int i4, int i5, boolean z, String str2, String str3, String str4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = wxLoginQrCodeStatus.uuid;
        }
        if ((i6 & 2) != 0) {
            i = wxLoginQrCodeStatus.state;
        }
        if ((i6 & 4) != 0) {
            i2 = wxLoginQrCodeStatus.push_login_url_expired_time;
        }
        if ((i6 & 8) != 0) {
            i3 = wxLoginQrCodeStatus.effective_time;
        }
        if ((i6 & 16) != 0) {
            i4 = wxLoginQrCodeStatus.unknow;
        }
        if ((i6 & 32) != 0) {
            i5 = wxLoginQrCodeStatus.ret;
        }
        if ((i6 & 64) != 0) {
            z = wxLoginQrCodeStatus.othersInServerLogin;
        }
        if ((i6 & 128) != 0) {
            str2 = wxLoginQrCodeStatus.tarGetServerIp;
        }
        if ((i6 & 256) != 0) {
            str3 = wxLoginQrCodeStatus.uuId;
        }
        if ((i6 & 512) != 0) {
            str4 = wxLoginQrCodeStatus.msg;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z2 = z;
        String str7 = str2;
        int i7 = i4;
        int i8 = i5;
        return wxLoginQrCodeStatus.copy(str, i, i2, i3, i7, i8, z2, str7, str5, str6);
    }

    @aa1
    public final String component1() {
        return this.uuid;
    }

    @aa1
    public final String component10() {
        return this.msg;
    }

    public final int component2() {
        return this.state;
    }

    public final int component3() {
        return this.push_login_url_expired_time;
    }

    public final int component4() {
        return this.effective_time;
    }

    public final int component5() {
        return this.unknow;
    }

    public final int component6() {
        return this.ret;
    }

    public final boolean component7() {
        return this.othersInServerLogin;
    }

    @aa1
    public final String component8() {
        return this.tarGetServerIp;
    }

    @aa1
    public final String component9() {
        return this.uuId;
    }

    @aa1
    public final WxLoginQrCodeStatus copy(@aa1 String uuid, int i, int i2, int i3, int i4, int i5, boolean z, @aa1 String tarGetServerIp, @aa1 String uuId, @aa1 String msg) {
        Intrinsics.X0O(uuid, "uuid");
        Intrinsics.X0O(tarGetServerIp, "tarGetServerIp");
        Intrinsics.X0O(uuId, "uuId");
        Intrinsics.X0O(msg, "msg");
        return new WxLoginQrCodeStatus(uuid, i, i2, i3, i4, i5, z, tarGetServerIp, uuId, msg);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxLoginQrCodeStatus)) {
            return false;
        }
        WxLoginQrCodeStatus wxLoginQrCodeStatus = (WxLoginQrCodeStatus) obj;
        return Intrinsics.XOO0ii0(this.uuid, wxLoginQrCodeStatus.uuid) && this.state == wxLoginQrCodeStatus.state && this.push_login_url_expired_time == wxLoginQrCodeStatus.push_login_url_expired_time && this.effective_time == wxLoginQrCodeStatus.effective_time && this.unknow == wxLoginQrCodeStatus.unknow && this.ret == wxLoginQrCodeStatus.ret && this.othersInServerLogin == wxLoginQrCodeStatus.othersInServerLogin && Intrinsics.XOO0ii0(this.tarGetServerIp, wxLoginQrCodeStatus.tarGetServerIp) && Intrinsics.XOO0ii0(this.uuId, wxLoginQrCodeStatus.uuId) && Intrinsics.XOO0ii0(this.msg, wxLoginQrCodeStatus.msg);
    }

    public final int getEffective_time() {
        return this.effective_time;
    }

    @aa1
    public final String getMsg() {
        return this.msg;
    }

    public final boolean getOthersInServerLogin() {
        return this.othersInServerLogin;
    }

    public final int getPush_login_url_expired_time() {
        return this.push_login_url_expired_time;
    }

    public final int getRet() {
        return this.ret;
    }

    public final int getState() {
        return this.state;
    }

    @aa1
    public final String getTarGetServerIp() {
        return this.tarGetServerIp;
    }

    public final int getUnknow() {
        return this.unknow;
    }

    @aa1
    public final String getUuId() {
        return this.uuId;
    }

    @aa1
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((((((((((this.uuid.hashCode() * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.push_login_url_expired_time)) * 31) + Integer.hashCode(this.effective_time)) * 31) + Integer.hashCode(this.unknow)) * 31) + Integer.hashCode(this.ret)) * 31) + Boolean.hashCode(this.othersInServerLogin)) * 31) + this.tarGetServerIp.hashCode()) * 31) + this.uuId.hashCode()) * 31) + this.msg.hashCode();
    }

    @aa1
    public String toString() {
        return "WxLoginQrCodeStatus(uuid=" + this.uuid + ", state=" + this.state + ", push_login_url_expired_time=" + this.push_login_url_expired_time + ", effective_time=" + this.effective_time + ", unknow=" + this.unknow + ", ret=" + this.ret + ", othersInServerLogin=" + this.othersInServerLogin + ", tarGetServerIp=" + this.tarGetServerIp + ", uuId=" + this.uuId + ", msg=" + this.msg + I000IiI1O.C2156iO.f1007iO;
    }

    public WxLoginQrCodeStatus(@aa1 String uuid, int i, int i2, int i3, int i4, int i5, boolean z, @aa1 String tarGetServerIp, @aa1 String uuId, @aa1 String msg) {
        Intrinsics.X0O(uuid, "uuid");
        Intrinsics.X0O(tarGetServerIp, "tarGetServerIp");
        Intrinsics.X0O(uuId, "uuId");
        Intrinsics.X0O(msg, "msg");
        this.uuid = uuid;
        this.state = i;
        this.push_login_url_expired_time = i2;
        this.effective_time = i3;
        this.unknow = i4;
        this.ret = i5;
        this.othersInServerLogin = z;
        this.tarGetServerIp = tarGetServerIp;
        this.uuId = uuId;
        this.msg = msg;
    }

    public /* synthetic */ WxLoginQrCodeStatus(String str, int i, int i2, int i3, int i4, int i5, boolean z, String str2, String str3, String str4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5, (i6 & 64) != 0 ? false : z, (i6 & 128) != 0 ? "" : str2, (i6 & 256) != 0 ? "" : str3, (i6 & 512) != 0 ? "" : str4);
    }
}
