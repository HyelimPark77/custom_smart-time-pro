package com.sma.smartv3.dto;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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

    /* JADX INFO: renamed from: id */
    private final int f51200id;
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

    public Batch(@aa1 Object authCodeDo, @aa1 String batchNum, @aa1 Object createdAt, @aa1 String createdBy, int i, @aa1 Object expirationTime, int i2, int i3, int i4, int i5, int i6, @aa1 Object updateAt, @aa1 String updateBy, @aa1 Object userId, int i7) {
        Intrinsics.X0O(authCodeDo, "authCodeDo");
        Intrinsics.X0O(batchNum, "batchNum");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(expirationTime, "expirationTime");
        Intrinsics.X0O(updateAt, "updateAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(userId, "userId");
        this.authCodeDo = authCodeDo;
        this.batchNum = batchNum;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.duration = i;
        this.expirationTime = expirationTime;
        this.generateCount = i2;
        this.f51200id = i3;
        this.modelId = i4;
        this.status = i5;
        this.thirdParty = i6;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.userId = userId;
        this.version = i7;
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
        return this.f51200id;
    }

    public final int component9() {
        return this.modelId;
    }

    @aa1
    public final Batch copy(@aa1 Object authCodeDo, @aa1 String batchNum, @aa1 Object createdAt, @aa1 String createdBy, int i, @aa1 Object expirationTime, int i2, int i3, int i4, int i5, int i6, @aa1 Object updateAt, @aa1 String updateBy, @aa1 Object userId, int i7) {
        Intrinsics.X0O(authCodeDo, "authCodeDo");
        Intrinsics.X0O(batchNum, "batchNum");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(expirationTime, "expirationTime");
        Intrinsics.X0O(updateAt, "updateAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(userId, "userId");
        return new Batch(authCodeDo, batchNum, createdAt, createdBy, i, expirationTime, i2, i3, i4, i5, i6, updateAt, updateBy, userId, i7);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Batch)) {
            return false;
        }
        Batch batch = (Batch) obj;
        return Intrinsics.XOO0ii0(this.authCodeDo, batch.authCodeDo) && Intrinsics.XOO0ii0(this.batchNum, batch.batchNum) && Intrinsics.XOO0ii0(this.createdAt, batch.createdAt) && Intrinsics.XOO0ii0(this.createdBy, batch.createdBy) && this.duration == batch.duration && Intrinsics.XOO0ii0(this.expirationTime, batch.expirationTime) && this.generateCount == batch.generateCount && this.f51200id == batch.f51200id && this.modelId == batch.modelId && this.status == batch.status && this.thirdParty == batch.thirdParty && Intrinsics.XOO0ii0(this.updateAt, batch.updateAt) && Intrinsics.XOO0ii0(this.updateBy, batch.updateBy) && Intrinsics.XOO0ii0(this.userId, batch.userId) && this.version == batch.version;
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
        return this.f51200id;
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
        return (((((((((((((((((((((((((((this.authCodeDo.hashCode() * 31) + this.batchNum.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + this.expirationTime.hashCode()) * 31) + Integer.hashCode(this.generateCount)) * 31) + Integer.hashCode(this.f51200id)) * 31) + Integer.hashCode(this.modelId)) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.thirdParty)) * 31) + this.updateAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    @aa1
    public String toString() {
        return "Batch(authCodeDo=" + this.authCodeDo + ", batchNum=" + this.batchNum + ", createdAt=" + this.createdAt + ", createdBy=" + this.createdBy + ", duration=" + this.duration + ", expirationTime=" + this.expirationTime + ", generateCount=" + this.generateCount + ", id=" + this.f51200id + ", modelId=" + this.modelId + ", status=" + this.status + ", thirdParty=" + this.thirdParty + ", updateAt=" + this.updateAt + ", updateBy=" + this.updateBy + ", userId=" + this.userId + ", version=" + this.version + I000IiI1O.C2156iO.f1007iO;
    }
}
