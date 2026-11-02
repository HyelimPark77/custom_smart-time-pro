package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleInfo {

    @aa1
    private String bleName;

    @aa1
    private String bleVersion;

    @aa1
    private String flag;

    @aa1
    private String mac;

    @aa1
    private String pVersion;
    private int phoneOs;

    @aa1
    private String pid;

    @aa1
    private String uid;

    public BleInfo() {
        this(null, null, null, null, null, null, null, 0, 255, null);
    }

    public static /* synthetic */ BleInfo copy$default(BleInfo bleInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleInfo.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = bleInfo.bleName;
        }
        if ((i2 & 4) != 0) {
            str3 = bleInfo.flag;
        }
        if ((i2 & 8) != 0) {
            str4 = bleInfo.pid;
        }
        if ((i2 & 16) != 0) {
            str5 = bleInfo.bleVersion;
        }
        if ((i2 & 32) != 0) {
            str6 = bleInfo.pVersion;
        }
        if ((i2 & 64) != 0) {
            str7 = bleInfo.mac;
        }
        if ((i2 & 128) != 0) {
            i = bleInfo.phoneOs;
        }
        String str8 = str7;
        int i3 = i;
        String str9 = str5;
        String str10 = str6;
        return bleInfo.copy(str, str2, str3, str4, str9, str10, str8, i3);
    }

    @aa1
    public final String component1() {
        return this.uid;
    }

    @aa1
    public final String component2() {
        return this.bleName;
    }

    @aa1
    public final String component3() {
        return this.flag;
    }

    @aa1
    public final String component4() {
        return this.pid;
    }

    @aa1
    public final String component5() {
        return this.bleVersion;
    }

    @aa1
    public final String component6() {
        return this.pVersion;
    }

    @aa1
    public final String component7() {
        return this.mac;
    }

    public final int component8() {
        return this.phoneOs;
    }

    @aa1
    public final BleInfo copy(@aa1 String uid, @aa1 String bleName, @aa1 String flag, @aa1 String pid, @aa1 String bleVersion, @aa1 String pVersion, @aa1 String mac, int i) {
        Intrinsics.X0O(uid, "uid");
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(pid, "pid");
        Intrinsics.X0O(bleVersion, "bleVersion");
        Intrinsics.X0O(pVersion, "pVersion");
        Intrinsics.X0O(mac, "mac");
        return new BleInfo(uid, bleName, flag, pid, bleVersion, pVersion, mac, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleInfo)) {
            return false;
        }
        BleInfo bleInfo = (BleInfo) obj;
        return Intrinsics.XOO0ii0(this.uid, bleInfo.uid) && Intrinsics.XOO0ii0(this.bleName, bleInfo.bleName) && Intrinsics.XOO0ii0(this.flag, bleInfo.flag) && Intrinsics.XOO0ii0(this.pid, bleInfo.pid) && Intrinsics.XOO0ii0(this.bleVersion, bleInfo.bleVersion) && Intrinsics.XOO0ii0(this.pVersion, bleInfo.pVersion) && Intrinsics.XOO0ii0(this.mac, bleInfo.mac) && this.phoneOs == bleInfo.phoneOs;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getBleVersion() {
        return this.bleVersion;
    }

    @aa1
    public final String getFlag() {
        return this.flag;
    }

    @aa1
    public final String getMac() {
        return this.mac;
    }

    @aa1
    public final String getPVersion() {
        return this.pVersion;
    }

    public final int getPhoneOs() {
        return this.phoneOs;
    }

    @aa1
    public final String getPid() {
        return this.pid;
    }

    @aa1
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return (((((((((((((this.uid.hashCode() * 31) + this.bleName.hashCode()) * 31) + this.flag.hashCode()) * 31) + this.pid.hashCode()) * 31) + this.bleVersion.hashCode()) * 31) + this.pVersion.hashCode()) * 31) + this.mac.hashCode()) * 31) + Integer.hashCode(this.phoneOs);
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setBleVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleVersion = str;
    }

    public final void setFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.flag = str;
    }

    public final void setMac(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mac = str;
    }

    public final void setPVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.pVersion = str;
    }

    public final void setPhoneOs(int i) {
        this.phoneOs = i;
    }

    public final void setPid(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.pid = str;
    }

    public final void setUid(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.uid = str;
    }

    @aa1
    public String toString() {
        return "BleInfo(uid=" + this.uid + ", bleName=" + this.bleName + ", flag=" + this.flag + ", pid=" + this.pid + ", bleVersion=" + this.bleVersion + ", pVersion=" + this.pVersion + ", mac=" + this.mac + ", phoneOs=" + this.phoneOs + I000IiI1O.C2156iO.f1007iO;
    }

    public BleInfo(@aa1 String uid, @aa1 String bleName, @aa1 String flag, @aa1 String pid, @aa1 String bleVersion, @aa1 String pVersion, @aa1 String mac, int i) {
        Intrinsics.X0O(uid, "uid");
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(pid, "pid");
        Intrinsics.X0O(bleVersion, "bleVersion");
        Intrinsics.X0O(pVersion, "pVersion");
        Intrinsics.X0O(mac, "mac");
        this.uid = uid;
        this.bleName = bleName;
        this.flag = flag;
        this.pid = pid;
        this.bleVersion = bleVersion;
        this.pVersion = pVersion;
        this.mac = mac;
        this.phoneOs = i;
    }

    public /* synthetic */ BleInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? 0 : i);
    }
}
