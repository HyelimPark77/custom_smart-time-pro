package com.sma.smartv3.biz.wx.data;

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
        String r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        boolean r7 = false;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ WxLoginQrCodeStatus copy$default(WxLoginQrCodeStatus r0, String r1, int r2, int r3, int r4, int r5, int r6, boolean r7, String r8, String r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.uuid;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.state;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.push_login_url_expired_time;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.effective_time;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.unknow;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.ret;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.othersInServerLogin;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.tarGetServerIp;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.uuId;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.msg;
    L32:
        String r13 = r9;
        String r14 = r10;
        boolean r15 = r7;
        String r16 = r8;
        int r17 = r5;
        int r18 = r6;
        int r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
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
    public final WxLoginQrCodeStatus copy(@aa1 String r13, int r14, int r15, int r16, int r17, int r18, boolean r19, @aa1 String r20, @aa1 String r21, @aa1 String r22) {
        Intrinsics.X0O(r13, "uuid");
        Intrinsics.X0O(r20, "tarGetServerIp");
        Intrinsics.X0O(r21, "uuId");
        Intrinsics.X0O(r22, "msg");
        return new WxLoginQrCodeStatus(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxLoginQrCodeStatus) == true) goto L8;
        return false;
    L8:
        WxLoginQrCodeStatus r6 = (WxLoginQrCodeStatus) r5;
        if (Intrinsics.XOO0ii0(this.uuid, r6.uuid) == true) goto L12;
        return false;
    L12:
        if (this.state == r6.state) goto L15;
        return false;
    L15:
        if (this.push_login_url_expired_time == r6.push_login_url_expired_time) goto L18;
        return false;
    L18:
        if (this.effective_time == r6.effective_time) goto L21;
        return false;
    L21:
        if (this.unknow == r6.unknow) goto L24;
        return false;
    L24:
        if (this.ret == r6.ret) goto L27;
        return false;
    L27:
        if (this.othersInServerLogin == r6.othersInServerLogin) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.tarGetServerIp, r6.tarGetServerIp) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.uuId, r6.uuId) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.msg, r6.msg) == true) goto L38;
        return false;
    L38:
        return true;
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
        return "WxLoginQrCodeStatus(uuid=" + this.uuid + ", state=" + this.state + ", push_login_url_expired_time=" + this.push_login_url_expired_time + ", effective_time=" + this.effective_time + ", unknow=" + this.unknow + ", ret=" + this.ret + ", othersInServerLogin=" + this.othersInServerLogin + ", tarGetServerIp=" + this.tarGetServerIp + ", uuId=" + this.uuId + ", msg=" + this.msg + I000IiI1O.iO.iO;
    }

    public WxLoginQrCodeStatus(@aa1 String r2, int r3, int r4, int r5, int r6, int r7, boolean r8, @aa1 String r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r2, "uuid");
        Intrinsics.X0O(r9, "tarGetServerIp");
        Intrinsics.X0O(r10, "uuId");
        Intrinsics.X0O(r11, "msg");
        this.uuid = r2;
        this.state = r3;
        this.push_login_url_expired_time = r4;
        this.effective_time = r5;
        this.unknow = r6;
        this.ret = r7;
        this.othersInServerLogin = r8;
        this.tarGetServerIp = r9;
        this.uuId = r10;
        this.msg = r11;
    }

    public /* synthetic */ WxLoginQrCodeStatus(String r3, int r4, int r5, int r6, int r7, int r8, boolean r9, String r10, String r11, String r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = false;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = "";
    L30:
        if ((r13 & 512) == 0) goto L33;
        String r15 = "";
    L32:
        String r16 = r11;
        String r17 = r10;
        boolean r18 = r9;
        int r19 = r8;
        int r20 = r7;
        int r21 = r6;
        int r22 = r5;
        this(r3, r4, r22, r21, r20, r19, r18, r17, r16, r15);
        return;
    L33:
        r15 = r12;
        goto L32
    }
}
