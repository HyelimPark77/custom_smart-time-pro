package com.sma.smartv3.dto;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class ThirdPartyDeviceData {

    @tb1
    private final String aiServerName;

    @aa1
    private final Batch batch;

    @aa1
    private final String bleName;

    @aa1
    private final String code;

    @aa1
    private final Object createdAt;

    @aa1
    private final String createdBy;
    private final int duration;

    @aa1
    private final String flag;
    private final int id;

    @aa1
    private final String macAdd;
    private final int modelId;
    private final int status;

    @aa1
    private final Object updateAt;

    @aa1
    private final String updateBy;

    @aa1
    private final String usageTime;
    private final int version;

    public ThirdPartyDeviceData(@aa1 Batch r5, @aa1 String r6, @aa1 String r7, @aa1 Object r8, @aa1 String r9, int r10, @aa1 String r11, int r12, @aa1 String r13, int r14, int r15, @aa1 Object r16, @aa1 String r17, @aa1 String r18, int r19, @tb1 String r20) {
        Intrinsics.X0O(r5, "batch");
        Intrinsics.X0O(r6, "bleName");
        Intrinsics.X0O(r7, "code");
        Intrinsics.X0O(r8, "createdAt");
        Intrinsics.X0O(r9, "createdBy");
        Intrinsics.X0O(r11, "flag");
        Intrinsics.X0O(r13, "macAdd");
        Intrinsics.X0O(r16, "updateAt");
        Intrinsics.X0O(r17, "updateBy");
        Intrinsics.X0O(r18, "usageTime");
        this.batch = r5;
        this.bleName = r6;
        this.code = r7;
        this.createdAt = r8;
        this.createdBy = r9;
        this.duration = r10;
        this.flag = r11;
        this.id = r12;
        this.macAdd = r13;
        this.modelId = r14;
        this.status = r15;
        this.updateAt = r16;
        this.updateBy = r17;
        this.usageTime = r18;
        this.version = r19;
        this.aiServerName = r20;
    }

    public static /* synthetic */ ThirdPartyDeviceData copy$default(ThirdPartyDeviceData r17, Batch r18, String r19, String r20, Object r21, String r22, int r23, String r24, int r25, String r26, int r27, int r28, Object r29, String r30, String r31, int r32, String r33, int r34, Object r35) {
        if ((r34 & 1) == 0) goto L5;
        Batch r2 = r17.batch;
    L7:
        if ((r34 & 2) == 0) goto L9;
        String r3 = r17.bleName;
    L11:
        if ((r34 & 4) == 0) goto L13;
        String r4 = r17.code;
    L15:
        if ((r34 & 8) == 0) goto L17;
        Object r5 = r17.createdAt;
    L19:
        if ((r34 & 16) == 0) goto L21;
        String r6 = r17.createdBy;
    L23:
        if ((r34 & 32) == 0) goto L25;
        int r7 = r17.duration;
    L27:
        if ((r34 & 64) == 0) goto L29;
        String r8 = r17.flag;
    L31:
        if ((r34 & 128) == 0) goto L33;
        int r9 = r17.id;
    L35:
        if ((r34 & 256) == 0) goto L37;
        String r10 = r17.macAdd;
    L39:
        if ((r34 & 512) == 0) goto L41;
        int r11 = r17.modelId;
    L43:
        if ((r34 & 1024) == 0) goto L45;
        int r12 = r17.status;
    L47:
        if ((r34 & 2048) == 0) goto L49;
        Object r13 = r17.updateAt;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        String r14 = r17.updateBy;
    L55:
        if ((r34 & 8192) == 0) goto L57;
        String r15 = r17.usageTime;
    L58:
        Batch r110 = r2;
        if ((r34 & 16384) == 0) goto L61;
        int r16 = r17.version;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        String r36 = r17.aiServerName;
    L68:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r36);
    L66:
        r36 = r33;
        goto L68
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    @aa1
    public final Batch component1() {
        return this.batch;
    }

    public final int component10() {
        return this.modelId;
    }

    public final int component11() {
        return this.status;
    }

    @aa1
    public final Object component12() {
        return this.updateAt;
    }

    @aa1
    public final String component13() {
        return this.updateBy;
    }

    @aa1
    public final String component14() {
        return this.usageTime;
    }

    public final int component15() {
        return this.version;
    }

    @tb1
    public final String component16() {
        return this.aiServerName;
    }

    @aa1
    public final String component2() {
        return this.bleName;
    }

    @aa1
    public final String component3() {
        return this.code;
    }

    @aa1
    public final Object component4() {
        return this.createdAt;
    }

    @aa1
    public final String component5() {
        return this.createdBy;
    }

    public final int component6() {
        return this.duration;
    }

    @aa1
    public final String component7() {
        return this.flag;
    }

    public final int component8() {
        return this.id;
    }

    @aa1
    public final String component9() {
        return this.macAdd;
    }

    @aa1
    public final ThirdPartyDeviceData copy(@aa1 Batch r19, @aa1 String r20, @aa1 String r21, @aa1 Object r22, @aa1 String r23, int r24, @aa1 String r25, int r26, @aa1 String r27, int r28, int r29, @aa1 Object r30, @aa1 String r31, @aa1 String r32, int r33, @tb1 String r34) {
        Intrinsics.X0O(r19, "batch");
        Intrinsics.X0O(r20, "bleName");
        Intrinsics.X0O(r21, "code");
        Intrinsics.X0O(r22, "createdAt");
        Intrinsics.X0O(r23, "createdBy");
        Intrinsics.X0O(r25, "flag");
        Intrinsics.X0O(r27, "macAdd");
        Intrinsics.X0O(r30, "updateAt");
        Intrinsics.X0O(r31, "updateBy");
        Intrinsics.X0O(r32, "usageTime");
        return new ThirdPartyDeviceData(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ThirdPartyDeviceData) == true) goto L8;
        return false;
    L8:
        ThirdPartyDeviceData r6 = (ThirdPartyDeviceData) r5;
        if (Intrinsics.XOO0ii0(this.batch, r6.batch) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.code, r6.code) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.createdAt, r6.createdAt) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.createdBy, r6.createdBy) == true) goto L24;
        return false;
    L24:
        if (this.duration == r6.duration) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.flag, r6.flag) == true) goto L30;
        return false;
    L30:
        if (this.id == r6.id) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.macAdd, r6.macAdd) == true) goto L36;
        return false;
    L36:
        if (this.modelId == r6.modelId) goto L39;
        return false;
    L39:
        if (this.status == r6.status) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.updateAt, r6.updateAt) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.updateBy, r6.updateBy) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.usageTime, r6.usageTime) == true) goto L51;
        return false;
    L51:
        if (this.version == r6.version) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.aiServerName, r6.aiServerName) == true) goto L56;
        return false;
    L56:
        return true;
    }

    @tb1
    public final String getAiServerName() {
        return this.aiServerName;
    }

    @aa1
    public final Batch getBatch() {
        return this.batch;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getCode() {
        return this.code;
    }

    @aa1
    public final Object getCreatedAt() {
        return this.createdAt;
    }

    @aa1
    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final int getDuration() {
        return this.duration;
    }

    @aa1
    public final String getFlag() {
        return this.flag;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final String getMacAdd() {
        return this.macAdd;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final int getStatus() {
        return this.status;
    }

    @aa1
    public final Object getUpdateAt() {
        return this.updateAt;
    }

    @aa1
    public final String getUpdateBy() {
        return this.updateBy;
    }

    @aa1
    public final String getUsageTime() {
        return this.usageTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int r0 = ((((((((((((((((((((((((((((this.batch.hashCode() * 31) + this.bleName.hashCode()) * 31) + this.code.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + this.flag.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + this.macAdd.hashCode()) * 31) + Integer.hashCode(this.modelId)) * 31) + Integer.hashCode(this.status)) * 31) + this.updateAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.usageTime.hashCode()) * 31) + Integer.hashCode(this.version)) * 31;
        String r1 = this.aiServerName;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    @aa1
    public String toString() {
        return "ThirdPartyDeviceData(batch=" + this.batch + ", bleName=" + this.bleName + ", code=" + this.code + ", createdAt=" + this.createdAt + ", createdBy=" + this.createdBy + ", duration=" + this.duration + ", flag=" + this.flag + ", id=" + this.id + ", macAdd=" + this.macAdd + ", modelId=" + this.modelId + ", status=" + this.status + ", updateAt=" + this.updateAt + ", updateBy=" + this.updateBy + ", usageTime=" + this.usageTime + ", version=" + this.version + ", aiServerName=" + this.aiServerName + I000IiI1O.iO.iO;
    }

    public /* synthetic */ ThirdPartyDeviceData(Batch r19, String r20, String r21, Object r22, String r23, int r24, String r25, int r26, String r27, int r28, int r29, Object r30, String r31, String r32, int r33, String r34, int r35, DefaultConstructorMarker r36) {
        if ((r35 & 32) == 0) goto L5;
        int r7 = 0;
    L7:
        if ((r35 & 32768) == 0) goto L10;
        String r17 = "";
    L11:
        this(r19, r20, r21, r22, r23, r7, r25, r26, r27, r28, r29, r30, r31, r32, r33, r17);
        return;
    L10:
        r17 = r34;
        goto L11
    L5:
        r7 = r24;
        goto L7
    }
}
