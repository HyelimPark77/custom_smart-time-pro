package com.sma.smartv3.dto;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class Batch {

    @aa1
    private final Object authCodeDo;

    @aa1
    private final String batchNum;

    @aa1
    private final Object createdAt;

    @aa1
    private final String createdBy;
    private final int duration;

    @aa1
    private final Object expirationTime;
    private final int generateCount;
    private final int id;
    private final int modelId;
    private final int status;
    private final int thirdParty;

    @aa1
    private final Object updateAt;

    @aa1
    private final String updateBy;

    @aa1
    private final Object userId;
    private final int version;

    public Batch(@aa1 Object r5, @aa1 String r6, @aa1 Object r7, @aa1 String r8, int r9, @aa1 Object r10, int r11, int r12, int r13, int r14, int r15, @aa1 Object r16, @aa1 String r17, @aa1 Object r18, int r19) {
        Intrinsics.X0O(r5, "authCodeDo");
        Intrinsics.X0O(r6, "batchNum");
        Intrinsics.X0O(r7, "createdAt");
        Intrinsics.X0O(r8, "createdBy");
        Intrinsics.X0O(r10, SDKConstants.PARAM_EXPIRATION_TIME);
        Intrinsics.X0O(r16, "updateAt");
        Intrinsics.X0O(r17, "updateBy");
        Intrinsics.X0O(r18, "userId");
        this.authCodeDo = r5;
        this.batchNum = r6;
        this.createdAt = r7;
        this.createdBy = r8;
        this.duration = r9;
        this.expirationTime = r10;
        this.generateCount = r11;
        this.id = r12;
        this.modelId = r13;
        this.status = r14;
        this.thirdParty = r15;
        this.updateAt = r16;
        this.updateBy = r17;
        this.userId = r18;
        this.version = r19;
    }

    public static /* synthetic */ Batch copy$default(Batch r16, Object r17, String r18, Object r19, String r20, int r21, Object r22, int r23, int r24, int r25, int r26, int r27, Object r28, String r29, Object r30, int r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        Object r2 = r16.authCodeDo;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = r16.batchNum;
    L11:
        if ((r32 & 4) == 0) goto L13;
        Object r4 = r16.createdAt;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = r16.createdBy;
    L19:
        if ((r32 & 16) == 0) goto L21;
        int r6 = r16.duration;
    L23:
        if ((r32 & 32) == 0) goto L25;
        Object r7 = r16.expirationTime;
    L27:
        if ((r32 & 64) == 0) goto L29;
        int r8 = r16.generateCount;
    L31:
        if ((r32 & 128) == 0) goto L33;
        int r9 = r16.id;
    L35:
        if ((r32 & 256) == 0) goto L37;
        int r10 = r16.modelId;
    L39:
        if ((r32 & 512) == 0) goto L41;
        int r11 = r16.status;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        int r12 = r16.thirdParty;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        Object r13 = r16.updateAt;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        String r14 = r16.updateBy;
    L55:
        if ((r32 & 8192) == 0) goto L57;
        Object r15 = r16.userId;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        int r34 = r16.version;
    L64:
        return r16.copy(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r34);
    L62:
        r34 = r31;
        goto L64
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    @aa1
    public final Object component1() {
        return this.authCodeDo;
    }

    public final int component10() {
        return this.status;
    }

    public final int component11() {
        return this.thirdParty;
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
    public final Object component14() {
        return this.userId;
    }

    public final int component15() {
        return this.version;
    }

    @aa1
    public final String component2() {
        return this.batchNum;
    }

    @aa1
    public final Object component3() {
        return this.createdAt;
    }

    @aa1
    public final String component4() {
        return this.createdBy;
    }

    public final int component5() {
        return this.duration;
    }

    @aa1
    public final Object component6() {
        return this.expirationTime;
    }

    public final int component7() {
        return this.generateCount;
    }

    public final int component8() {
        return this.id;
    }

    public final int component9() {
        return this.modelId;
    }

    @aa1
    public final Batch copy(@aa1 Object r18, @aa1 String r19, @aa1 Object r20, @aa1 String r21, int r22, @aa1 Object r23, int r24, int r25, int r26, int r27, int r28, @aa1 Object r29, @aa1 String r30, @aa1 Object r31, int r32) {
        Intrinsics.X0O(r18, "authCodeDo");
        Intrinsics.X0O(r19, "batchNum");
        Intrinsics.X0O(r20, "createdAt");
        Intrinsics.X0O(r21, "createdBy");
        Intrinsics.X0O(r23, SDKConstants.PARAM_EXPIRATION_TIME);
        Intrinsics.X0O(r29, "updateAt");
        Intrinsics.X0O(r30, "updateBy");
        Intrinsics.X0O(r31, "userId");
        return new Batch(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Batch) == true) goto L8;
        return false;
    L8:
        Batch r6 = (Batch) r5;
        if (Intrinsics.XOO0ii0(this.authCodeDo, r6.authCodeDo) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.batchNum, r6.batchNum) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.createdAt, r6.createdAt) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.createdBy, r6.createdBy) == true) goto L21;
        return false;
    L21:
        if (this.duration == r6.duration) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.expirationTime, r6.expirationTime) == true) goto L27;
        return false;
    L27:
        if (this.generateCount == r6.generateCount) goto L30;
        return false;
    L30:
        if (this.id == r6.id) goto L33;
        return false;
    L33:
        if (this.modelId == r6.modelId) goto L36;
        return false;
    L36:
        if (this.status == r6.status) goto L39;
        return false;
    L39:
        if (this.thirdParty == r6.thirdParty) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.updateAt, r6.updateAt) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.updateBy, r6.updateBy) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.userId, r6.userId) == true) goto L51;
        return false;
    L51:
        if (this.version == r6.version) goto L53;
        return false;
    L53:
        return true;
    }

    @aa1
    public final Object getAuthCodeDo() {
        return this.authCodeDo;
    }

    @aa1
    public final String getBatchNum() {
        return this.batchNum;
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
    public final Object getExpirationTime() {
        return this.expirationTime;
    }

    public final int getGenerateCount() {
        return this.generateCount;
    }

    public final int getId() {
        return this.id;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getThirdParty() {
        return this.thirdParty;
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
    public final Object getUserId() {
        return this.userId;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.authCodeDo.hashCode() * 31) + this.batchNum.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + this.expirationTime.hashCode()) * 31) + Integer.hashCode(this.generateCount)) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.modelId)) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.thirdParty)) * 31) + this.updateAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    @aa1
    public String toString() {
        return "Batch(authCodeDo=" + this.authCodeDo + ", batchNum=" + this.batchNum + ", createdAt=" + this.createdAt + ", createdBy=" + this.createdBy + ", duration=" + this.duration + ", expirationTime=" + this.expirationTime + ", generateCount=" + this.generateCount + ", id=" + this.id + ", modelId=" + this.modelId + ", status=" + this.status + ", thirdParty=" + this.thirdParty + ", updateAt=" + this.updateAt + ", updateBy=" + this.updateBy + ", userId=" + this.userId + ", version=" + this.version + I000IiI1O.iO.iO;
    }
}
