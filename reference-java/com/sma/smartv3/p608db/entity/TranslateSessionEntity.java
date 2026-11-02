package com.sma.smartv3.p608db.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p610ui.translate.ActionDoneType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity
public final class TranslateSessionEntity {

    @aa1
    private String audioPath;
    private long createTime;
    private float duration;
    private int isDelete;

    @Ignore
    private boolean isSelected;

    @aa1
    @PrimaryKey
    private final String sessionId;

    public TranslateSessionEntity(@aa1 String sessionId, @aa1 String audioPath, float f, long j, int i) {
        Intrinsics.X0O(sessionId, "sessionId");
        Intrinsics.X0O(audioPath, "audioPath");
        this.sessionId = sessionId;
        this.audioPath = audioPath;
        this.duration = f;
        this.createTime = j;
        this.isDelete = i;
    }

    public static /* synthetic */ TranslateSessionEntity copy$default(TranslateSessionEntity translateSessionEntity, String str, String str2, float f, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = translateSessionEntity.sessionId;
        }
        if ((i2 & 2) != 0) {
            str2 = translateSessionEntity.audioPath;
        }
        if ((i2 & 4) != 0) {
            f = translateSessionEntity.duration;
        }
        if ((i2 & 8) != 0) {
            j = translateSessionEntity.createTime;
        }
        if ((i2 & 16) != 0) {
            i = translateSessionEntity.isDelete;
        }
        int i3 = i;
        float f2 = f;
        return translateSessionEntity.copy(str, str2, f2, j, i3);
    }

    @aa1
    public final String component1() {
        return this.sessionId;
    }

    @aa1
    public final String component2() {
        return this.audioPath;
    }

    public final float component3() {
        return this.duration;
    }

    public final long component4() {
        return this.createTime;
    }

    public final int component5() {
        return this.isDelete;
    }

    @aa1
    public final TranslateSessionEntity copy(@aa1 String sessionId, @aa1 String audioPath, float f, long j, int i) {
        Intrinsics.X0O(sessionId, "sessionId");
        Intrinsics.X0O(audioPath, "audioPath");
        return new TranslateSessionEntity(sessionId, audioPath, f, j, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateSessionEntity)) {
            return false;
        }
        TranslateSessionEntity translateSessionEntity = (TranslateSessionEntity) obj;
        return Intrinsics.XOO0ii0(this.sessionId, translateSessionEntity.sessionId) && Intrinsics.XOO0ii0(this.audioPath, translateSessionEntity.audioPath) && Float.compare(this.duration, translateSessionEntity.duration) == 0 && this.createTime == translateSessionEntity.createTime && this.isDelete == translateSessionEntity.isDelete;
    }

    @aa1
    public final String getAudioPath() {
        return this.audioPath;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final float getDuration() {
        return this.duration;
    }

    @aa1
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (((((((this.sessionId.hashCode() * 31) + this.audioPath.hashCode()) * 31) + Float.hashCode(this.duration)) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.isDelete);
    }

    public final int isDelete() {
        return this.isDelete;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAudioPath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.audioPath = str;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDelete(int i) {
        this.isDelete = i;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @aa1
    public String toString() {
        return "TranslateSessionEntity(sessionId=" + this.sessionId + ", audioPath=" + this.audioPath + ", duration=" + this.duration + ", createTime=" + this.createTime + ", isDelete=" + this.isDelete + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ TranslateSessionEntity(String str, String str2, float f, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f, j, (i2 & 16) != 0 ? ActionDoneType.INCOMPLETE.getFlag() : i);
    }
}
