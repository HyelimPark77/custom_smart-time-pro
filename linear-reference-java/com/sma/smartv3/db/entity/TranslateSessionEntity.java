package com.sma.smartv3.db.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.ui.translate.ActionDoneType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
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

    public TranslateSessionEntity(@aa1 String r2, @aa1 String r3, float r4, long r5, int r7) {
        Intrinsics.X0O(r2, JsonStorageKeyNames.SESSION_ID_KEY);
        Intrinsics.X0O(r3, "audioPath");
        this.sessionId = r2;
        this.audioPath = r3;
        this.duration = r4;
        this.createTime = r5;
        this.isDelete = r7;
    }

    public static /* synthetic */ TranslateSessionEntity copy$default(TranslateSessionEntity r0, String r1, String r2, float r3, long r4, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.sessionId;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.audioPath;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.duration;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.createTime;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = r0.isDelete;
    L17:
        int r9 = r6;
        long r10 = r4;
        float r5 = r3;
        String r11 = r1;
        return r0.copy(r11, r2, r5, r10, r9);
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
    public final TranslateSessionEntity copy(@aa1 String r9, @aa1 String r10, float r11, long r12, int r14) {
        Intrinsics.X0O(r9, JsonStorageKeyNames.SESSION_ID_KEY);
        Intrinsics.X0O(r10, "audioPath");
        return new TranslateSessionEntity(r9, r10, r11, r12, r14);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TranslateSessionEntity) == true) goto L8;
        return false;
    L8:
        TranslateSessionEntity r9 = (TranslateSessionEntity) r8;
        if (Intrinsics.XOO0ii0(this.sessionId, r9.sessionId) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.audioPath, r9.audioPath) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.duration, r9.duration) == 0) goto L18;
        return false;
    L18:
        if (this.createTime == r9.createTime) goto L21;
        return false;
    L21:
        if (this.isDelete == r9.isDelete) goto L23;
        return false;
    L23:
        return true;
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

    public final void setAudioPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.audioPath = r2;
    }

    public final void setCreateTime(long r1) {
        this.createTime = r1;
    }

    public final void setDelete(int r1) {
        this.isDelete = r1;
    }

    public final void setDuration(float r1) {
        this.duration = r1;
    }

    public final void setSelected(boolean r1) {
        this.isSelected = r1;
    }

    @aa1
    public String toString() {
        return "TranslateSessionEntity(sessionId=" + this.sessionId + ", audioPath=" + this.audioPath + ", duration=" + this.duration + ", createTime=" + this.createTime + ", isDelete=" + this.isDelete + I000IiI1O.iO.iO;
    }

    public /* synthetic */ TranslateSessionEntity(String r8, String r9, float r10, long r11, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 16) == 0) goto L5;
        r13 = ActionDoneType.INCOMPLETE.getFlag();
    L5:
        this(r8, r9, r10, r11, r13);
    }
}
