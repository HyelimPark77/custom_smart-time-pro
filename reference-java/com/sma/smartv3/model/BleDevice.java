package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleDevice extends JsonFieldContainer {

    @aa1
    private String address;
    private int agpsType;

    @aa1
    private String extraInfo;

    @aa1
    private String firmwareFlag;

    @aa1
    private String name;

    @aa1
    private String platform;

    @aa1
    private String prototype;

    @aa1
    private String settings;

    @aa1
    private String version;

    public BleDevice() {
        this(null, null, null, null, null, 0, null, null, null, 511, null);
    }

    public static /* synthetic */ BleDevice copy$default(BleDevice bleDevice, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleDevice.name;
        }
        if ((i2 & 2) != 0) {
            str2 = bleDevice.address;
        }
        if ((i2 & 4) != 0) {
            str3 = bleDevice.platform;
        }
        if ((i2 & 8) != 0) {
            str4 = bleDevice.prototype;
        }
        if ((i2 & 16) != 0) {
            str5 = bleDevice.firmwareFlag;
        }
        if ((i2 & 32) != 0) {
            i = bleDevice.agpsType;
        }
        if ((i2 & 64) != 0) {
            str6 = bleDevice.version;
        }
        if ((i2 & 128) != 0) {
            str7 = bleDevice.extraInfo;
        }
        if ((i2 & 256) != 0) {
            str8 = bleDevice.settings;
        }
        String str9 = str7;
        String str10 = str8;
        int i3 = i;
        String str11 = str6;
        String str12 = str5;
        String str13 = str3;
        return bleDevice.copy(str, str2, str13, str4, str12, i3, str11, str9, str10);
    }

    @aa1
    public final String component1() {
        return this.name;
    }

    @aa1
    public final String component2() {
        return this.address;
    }

    @aa1
    public final String component3() {
        return this.platform;
    }

    @aa1
    public final String component4() {
        return this.prototype;
    }

    @aa1
    public final String component5() {
        return this.firmwareFlag;
    }

    public final int component6() {
        return this.agpsType;
    }

    @aa1
    public final String component7() {
        return this.version;
    }

    @aa1
    public final String component8() {
        return this.extraInfo;
    }

    @aa1
    public final String component9() {
        return this.settings;
    }

    @aa1
    public final BleDevice copy(@aa1 String name, @aa1 String address, @aa1 String platform, @aa1 String prototype, @aa1 String firmwareFlag, int i, @aa1 String version, @aa1 String extraInfo, @aa1 String settings) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(address, "address");
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(prototype, "prototype");
        Intrinsics.X0O(firmwareFlag, "firmwareFlag");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(extraInfo, "extraInfo");
        Intrinsics.X0O(settings, "settings");
        return new BleDevice(name, address, platform, prototype, firmwareFlag, i, version, extraInfo, settings);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDevice)) {
            return false;
        }
        BleDevice bleDevice = (BleDevice) obj;
        return Intrinsics.XOO0ii0(this.name, bleDevice.name) && Intrinsics.XOO0ii0(this.address, bleDevice.address) && Intrinsics.XOO0ii0(this.platform, bleDevice.platform) && Intrinsics.XOO0ii0(this.prototype, bleDevice.prototype) && Intrinsics.XOO0ii0(this.firmwareFlag, bleDevice.firmwareFlag) && this.agpsType == bleDevice.agpsType && Intrinsics.XOO0ii0(this.version, bleDevice.version) && Intrinsics.XOO0ii0(this.extraInfo, bleDevice.extraInfo) && Intrinsics.XOO0ii0(this.settings, bleDevice.settings);
    }

    @aa1
    public final String getAddress() {
        return this.address;
    }

    public final int getAgpsType() {
        return this.agpsType;
    }

    @aa1
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    @aa1
    public final String getFirmwareFlag() {
        return this.firmwareFlag;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    @aa1
    public final String getPlatform() {
        return this.platform;
    }

    @aa1
    public final String getPrototype() {
        return this.prototype;
    }

    @aa1
    public final String getSettings() {
        return this.settings;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + this.address.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.prototype.hashCode()) * 31) + this.firmwareFlag.hashCode()) * 31) + Integer.hashCode(this.agpsType)) * 31) + this.version.hashCode()) * 31) + this.extraInfo.hashCode()) * 31) + this.settings.hashCode();
    }

    public final void setAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.address = str;
    }

    public final void setAgpsType(int i) {
        this.agpsType = i;
    }

    public final void setExtraInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.extraInfo = str;
    }

    public final void setFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.firmwareFlag = str;
    }

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setPlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.platform = str;
    }

    public final void setPrototype(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.prototype = str;
    }

    public final void setSettings(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.settings = str;
    }

    public final void setVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.version = str;
    }

    @aa1
    public String toString() {
        return "BleDevice(name=" + this.name + ", address=" + this.address + ", platform=" + this.platform + ", prototype=" + this.prototype + ", firmwareFlag=" + this.firmwareFlag + ", agpsType=" + this.agpsType + ", version=" + this.version + ", extraInfo=" + this.extraInfo + ", settings=" + this.settings + I000IiI1O.C2156iO.f1007iO;
    }

    public BleDevice(@aa1 String name, @aa1 String address, @aa1 String platform, @aa1 String prototype, @aa1 String firmwareFlag, int i, @aa1 String version, @aa1 String extraInfo, @aa1 String settings) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(address, "address");
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(prototype, "prototype");
        Intrinsics.X0O(firmwareFlag, "firmwareFlag");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(extraInfo, "extraInfo");
        Intrinsics.X0O(settings, "settings");
        this.name = name;
        this.address = address;
        this.platform = platform;
        this.prototype = prototype;
        this.firmwareFlag = firmwareFlag;
        this.agpsType = i;
        this.version = version;
        this.extraInfo = extraInfo;
        this.settings = settings;
    }

    public /* synthetic */ BleDevice(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8);
    }
}
