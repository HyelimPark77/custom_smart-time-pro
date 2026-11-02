package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.UploadOtaRecord;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleFirmwareInfo extends JsonFieldContainer implements Serializable {

    @aa1
    private String bleName;

    @aa1
    private String flag;
    private int id;
    private int projectId;

    @aa1
    private String remark;

    public BleFirmwareInfo() {
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleFirmwareInfo copy$default(BleFirmwareInfo r0, int r1, int r2, String r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.projectId;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.bleName;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.flag;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.remark;
    L17:
        String r8 = r4;
        String r9 = r5;
        String r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.id;
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
    public final BleFirmwareInfo copy(int r8, int r9, @aa1 String r10, @aa1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r10, "bleName");
        Intrinsics.X0O(r11, "flag");
        Intrinsics.X0O(r12, UploadOtaRecord.REMARK);
        return new BleFirmwareInfo(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleFirmwareInfo) == true) goto L8;
        return false;
    L8:
        BleFirmwareInfo r6 = (BleFirmwareInfo) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (this.projectId == r6.projectId) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.flag, r6.flag) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.remark, r6.remark) == true) goto L23;
        return false;
    L23:
        return true;
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
        return this.id;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    @aa1
    public final String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.projectId)) * 31) + this.bleName.hashCode()) * 31) + this.flag.hashCode()) * 31) + this.remark.hashCode();
    }

    public final void setBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleName = r2;
    }

    public final void setFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.flag = r2;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setProjectId(int r1) {
        this.projectId = r1;
    }

    public final void setRemark(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.remark = r2;
    }

    @aa1
    public String toString() {
        return "BleFirmwareInfo(id=" + this.id + ", projectId=" + this.projectId + ", bleName=" + this.bleName + ", flag=" + this.flag + ", remark=" + this.remark + I000IiI1O.iO.iO;
    }

    public BleFirmwareInfo(int r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "bleName");
        Intrinsics.X0O(r5, "flag");
        Intrinsics.X0O(r6, UploadOtaRecord.REMARK);
        this.id = r2;
        this.projectId = r3;
        this.bleName = r4;
        this.flag = r5;
        this.remark = r6;
    }

    public /* synthetic */ BleFirmwareInfo(int r2, int r3, String r4, String r5, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r9 = "";
    L17:
        String r10 = r5;
        String r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
