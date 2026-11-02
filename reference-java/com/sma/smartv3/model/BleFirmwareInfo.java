package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleFirmwareInfo extends JsonFieldContainer implements Serializable {

    @aa1
    private String bleName;

    @aa1
    private String flag;

    /* JADX INFO: renamed from: id */
    private int f51303id;
    private int projectId;

    @aa1
    private String remark;

    public BleFirmwareInfo() {
        this(0, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ BleFirmwareInfo copy$default(BleFirmwareInfo bleFirmwareInfo, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleFirmwareInfo.f51303id;
        }
        if ((i3 & 2) != 0) {
            i2 = bleFirmwareInfo.projectId;
        }
        if ((i3 & 4) != 0) {
            str = bleFirmwareInfo.bleName;
        }
        if ((i3 & 8) != 0) {
            str2 = bleFirmwareInfo.flag;
        }
        if ((i3 & 16) != 0) {
            str3 = bleFirmwareInfo.remark;
        }
        String str4 = str3;
        String str5 = str;
        return bleFirmwareInfo.copy(i, i2, str5, str2, str4);
    }

    public final int component1() {
        return this.f51303id;
    }

    public final int component2() {
        return this.projectId;
    }

    @aa1
    public final String component3() {
        return this.bleName;
    }

    @aa1
    public final String component4() {
        return this.flag;
    }

    @aa1
    public final String component5() {
        return this.remark;
    }

    @aa1
    public final BleFirmwareInfo copy(int i, int i2, @aa1 String bleName, @aa1 String flag, @aa1 String remark) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(remark, "remark");
        return new BleFirmwareInfo(i, i2, bleName, flag, remark);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleFirmwareInfo)) {
            return false;
        }
        BleFirmwareInfo bleFirmwareInfo = (BleFirmwareInfo) obj;
        return this.f51303id == bleFirmwareInfo.f51303id && this.projectId == bleFirmwareInfo.projectId && Intrinsics.XOO0ii0(this.bleName, bleFirmwareInfo.bleName) && Intrinsics.XOO0ii0(this.flag, bleFirmwareInfo.flag) && Intrinsics.XOO0ii0(this.remark, bleFirmwareInfo.remark);
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getFlag() {
        return this.flag;
    }

    public final int getId() {
        return this.f51303id;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    @aa1
    public final String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f51303id) * 31) + Integer.hashCode(this.projectId)) * 31) + this.bleName.hashCode()) * 31) + this.flag.hashCode()) * 31) + this.remark.hashCode();
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.flag = str;
    }

    public final void setId(int i) {
        this.f51303id = i;
    }

    public final void setProjectId(int i) {
        this.projectId = i;
    }

    public final void setRemark(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.remark = str;
    }

    @aa1
    public String toString() {
        return "BleFirmwareInfo(id=" + this.f51303id + ", projectId=" + this.projectId + ", bleName=" + this.bleName + ", flag=" + this.flag + ", remark=" + this.remark + I000IiI1O.C2156iO.f1007iO;
    }

    public BleFirmwareInfo(int i, int i2, @aa1 String bleName, @aa1 String flag, @aa1 String remark) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(remark, "remark");
        this.f51303id = i;
        this.projectId = i2;
        this.bleName = bleName;
        this.flag = flag;
        this.remark = remark;
    }

    public /* synthetic */ BleFirmwareInfo(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3);
    }
}
