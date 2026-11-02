package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceState extends JsonFieldContainer {
    private long createTime;
    private int deviceState;
    private int id;

    @aa1
    private String info;

    @aa1
    private String oldAddress;

    @aa1
    private String payAddress;
    private int platform;

    @aa1
    private String updateTime;

    public DeviceState() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        int r5 = 0;
        String r6 = null;
        long r7 = 0;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r9, 255, null);
    }

    public static /* synthetic */ DeviceState copy$default(DeviceState r0, int r1, String r2, String r3, int r4, int r5, String r6, long r7, String r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.payAddress;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.oldAddress;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.platform;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.deviceState;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.info;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.createTime;
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = r0.updateTime;
    L26:
        String r12 = r9;
        long r13 = r7;
        int r8 = r5;
        String r14 = r6;
        String r15 = r3;
        int r16 = r4;
        return r0.copy(r1, r2, r15, r16, r8, r14, r13, r12);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.payAddress;
    }

    @aa1
    public final String component3() {
        return this.oldAddress;
    }

    public final int component4() {
        return this.platform;
    }

    public final int component5() {
        return this.deviceState;
    }

    @aa1
    public final String component6() {
        return this.info;
    }

    public final long component7() {
        return this.createTime;
    }

    @aa1
    public final String component8() {
        return this.updateTime;
    }

    @aa1
    public final DeviceState copy(int r12, @aa1 String r13, @aa1 String r14, int r15, int r16, @aa1 String r17, long r18, @aa1 String r20) {
        Intrinsics.X0O(r13, "payAddress");
        Intrinsics.X0O(r14, "oldAddress");
        Intrinsics.X0O(r17, "info");
        Intrinsics.X0O(r20, "updateTime");
        return new DeviceState(r12, r13, r14, r15, r16, r17, r18, r20);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof DeviceState) == true) goto L8;
        return false;
    L8:
        DeviceState r9 = (DeviceState) r8;
        if (this.id == r9.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.payAddress, r9.payAddress) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.oldAddress, r9.oldAddress) == true) goto L18;
        return false;
    L18:
        if (this.platform == r9.platform) goto L21;
        return false;
    L21:
        if (this.deviceState == r9.deviceState) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.info, r9.info) == true) goto L27;
        return false;
    L27:
        if (this.createTime == r9.createTime) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.updateTime, r9.updateTime) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDeviceState() {
        return this.deviceState;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final String getInfo() {
        return this.info;
    }

    @aa1
    public final String getOldAddress() {
        return this.oldAddress;
    }

    @aa1
    public final String getPayAddress() {
        return this.payAddress;
    }

    public final int getPlatform() {
        return this.platform;
    }

    @aa1
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.id) * 31) + this.payAddress.hashCode()) * 31) + this.oldAddress.hashCode()) * 31) + Integer.hashCode(this.platform)) * 31) + Integer.hashCode(this.deviceState)) * 31) + this.info.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + this.updateTime.hashCode();
    }

    public final void setCreateTime(long r1) {
        this.createTime = r1;
    }

    public final void setDeviceState(int r1) {
        this.deviceState = r1;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.info = r2;
    }

    public final void setOldAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.oldAddress = r2;
    }

    public final void setPayAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.payAddress = r2;
    }

    public final void setPlatform(int r1) {
        this.platform = r1;
    }

    public final void setUpdateTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.updateTime = r2;
    }

    @aa1
    public String toString() {
        return "DeviceState(id=" + this.id + ", payAddress=" + this.payAddress + ", oldAddress=" + this.oldAddress + ", platform=" + this.platform + ", deviceState=" + this.deviceState + ", info=" + this.info + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + I000IiI1O.iO.iO;
    }

    public DeviceState(int r2, @aa1 String r3, @aa1 String r4, int r5, int r6, @aa1 String r7, long r8, @aa1 String r10) {
        Intrinsics.X0O(r3, "payAddress");
        Intrinsics.X0O(r4, "oldAddress");
        Intrinsics.X0O(r7, "info");
        Intrinsics.X0O(r10, "updateTime");
        this.id = r2;
        this.payAddress = r3;
        this.oldAddress = r4;
        this.platform = r5;
        this.deviceState = r6;
        this.info = r7;
        this.createTime = r8;
        this.updateTime = r10;
    }

    public /* synthetic */ DeviceState(int r3, String r4, String r5, int r6, int r7, String r8, long r9, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        String r14 = "";
    L26:
        long r10 = r9;
        String r15 = r8;
        int r16 = r7;
        int r17 = r6;
        String r18 = r5;
        this(r3, r4, r18, r17, r16, r15, r10, r14);
        return;
    L27:
        r14 = r11;
        goto L26
    }
}
