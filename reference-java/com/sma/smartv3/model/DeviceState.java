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

    /* JADX INFO: renamed from: id */
    private int f51308id;

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
        this(0, null, null, 0, 0, null, 0L, null, 255, null);
    }

    public static /* synthetic */ DeviceState copy$default(DeviceState deviceState, int i, String str, String str2, int i2, int i3, String str3, long j, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = deviceState.f51308id;
        }
        if ((i4 & 2) != 0) {
            str = deviceState.payAddress;
        }
        if ((i4 & 4) != 0) {
            str2 = deviceState.oldAddress;
        }
        if ((i4 & 8) != 0) {
            i2 = deviceState.platform;
        }
        if ((i4 & 16) != 0) {
            i3 = deviceState.deviceState;
        }
        if ((i4 & 32) != 0) {
            str3 = deviceState.info;
        }
        if ((i4 & 64) != 0) {
            j = deviceState.createTime;
        }
        if ((i4 & 128) != 0) {
            str4 = deviceState.updateTime;
        }
        String str5 = str4;
        long j2 = j;
        int i5 = i3;
        String str6 = str3;
        return deviceState.copy(i, str, str2, i2, i5, str6, j2, str5);
    }

    public final int component1() {
        return this.f51308id;
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
    public final DeviceState copy(int i, @aa1 String payAddress, @aa1 String oldAddress, int i2, int i3, @aa1 String info, long j, @aa1 String updateTime) {
        Intrinsics.X0O(payAddress, "payAddress");
        Intrinsics.X0O(oldAddress, "oldAddress");
        Intrinsics.X0O(info, "info");
        Intrinsics.X0O(updateTime, "updateTime");
        return new DeviceState(i, payAddress, oldAddress, i2, i3, info, j, updateTime);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceState)) {
            return false;
        }
        DeviceState deviceState = (DeviceState) obj;
        return this.f51308id == deviceState.f51308id && Intrinsics.XOO0ii0(this.payAddress, deviceState.payAddress) && Intrinsics.XOO0ii0(this.oldAddress, deviceState.oldAddress) && this.platform == deviceState.platform && this.deviceState == deviceState.deviceState && Intrinsics.XOO0ii0(this.info, deviceState.info) && this.createTime == deviceState.createTime && Intrinsics.XOO0ii0(this.updateTime, deviceState.updateTime);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDeviceState() {
        return this.deviceState;
    }

    public final int getId() {
        return this.f51308id;
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
        return (((((((((((((Integer.hashCode(this.f51308id) * 31) + this.payAddress.hashCode()) * 31) + this.oldAddress.hashCode()) * 31) + Integer.hashCode(this.platform)) * 31) + Integer.hashCode(this.deviceState)) * 31) + this.info.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + this.updateTime.hashCode();
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDeviceState(int i) {
        this.deviceState = i;
    }

    public final void setId(int i) {
        this.f51308id = i;
    }

    public final void setInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.info = str;
    }

    public final void setOldAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.oldAddress = str;
    }

    public final void setPayAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.payAddress = str;
    }

    public final void setPlatform(int i) {
        this.platform = i;
    }

    public final void setUpdateTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.updateTime = str;
    }

    @aa1
    public String toString() {
        return "DeviceState(id=" + this.f51308id + ", payAddress=" + this.payAddress + ", oldAddress=" + this.oldAddress + ", platform=" + this.platform + ", deviceState=" + this.deviceState + ", info=" + this.info + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + I000IiI1O.C2156iO.f1007iO;
    }

    public DeviceState(int i, @aa1 String payAddress, @aa1 String oldAddress, int i2, int i3, @aa1 String info, long j, @aa1 String updateTime) {
        Intrinsics.X0O(payAddress, "payAddress");
        Intrinsics.X0O(oldAddress, "oldAddress");
        Intrinsics.X0O(info, "info");
        Intrinsics.X0O(updateTime, "updateTime");
        this.f51308id = i;
        this.payAddress = payAddress;
        this.oldAddress = oldAddress;
        this.platform = i2;
        this.deviceState = i3;
        this.info = info;
        this.createTime = j;
        this.updateTime = updateTime;
    }

    public /* synthetic */ DeviceState(int i, String str, String str2, int i2, int i3, String str3, long j, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? 0L : j, (i4 & 128) != 0 ? "" : str4);
    }
}
