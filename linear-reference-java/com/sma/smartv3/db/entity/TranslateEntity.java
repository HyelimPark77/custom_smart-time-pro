package com.sma.smartv3.db.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.ui.translate.ChatShowType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {JsonStorageKeyNames.SESSION_ID_KEY}, entity = TranslateSessionEntity.class, onDelete = 5, parentColumns = {JsonStorageKeyNames.SESSION_ID_KEY})}, indices = {@Index({JsonStorageKeyNames.SESSION_ID_KEY})})
public final class TranslateEntity {

    @aa1
    private String audioPath;
    private long createTime;
    private float duration;

    @aa1
    private String fromLanguage;
    private boolean isUpLoaded;

    @aa1
    @PrimaryKey
    private final String requestId;

    @aa1
    private final String sessionId;
    private final int showType;

    @aa1
    private final String text;

    @aa1
    private String toLanguage;

    @aa1
    private final String translate;

    public TranslateEntity(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, float r6, boolean r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, long r11, int r13) {
        Intrinsics.X0O(r2, "requestId");
        Intrinsics.X0O(r3, "text");
        Intrinsics.X0O(r4, "translate");
        Intrinsics.X0O(r5, JsonStorageKeyNames.SESSION_ID_KEY);
        Intrinsics.X0O(r8, "audioPath");
        Intrinsics.X0O(r9, "fromLanguage");
        Intrinsics.X0O(r10, "toLanguage");
        this.requestId = r2;
        this.text = r3;
        this.translate = r4;
        this.sessionId = r5;
        this.duration = r6;
        this.isUpLoaded = r7;
        this.audioPath = r8;
        this.fromLanguage = r9;
        this.toLanguage = r10;
        this.createTime = r11;
        this.showType = r13;
    }

    public static /* synthetic */ TranslateEntity copy$default(TranslateEntity r0, String r1, String r2, String r3, String r4, float r5, boolean r6, String r7, String r8, String r9, long r10, int r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.requestId;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.text;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.translate;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.sessionId;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.duration;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.isUpLoaded;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.audioPath;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.fromLanguage;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.toLanguage;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.createTime;
    L33:
        if ((r13 & 1024) == 0) goto L35;
        r12 = r0.showType;
    L35:
        int r15 = r12;
        long r16 = r10;
        String r11 = r8;
        String r17 = r9;
        boolean r18 = r6;
        String r19 = r7;
        String r20 = r4;
        float r21 = r5;
        String r22 = r3;
        String r23 = r1;
        return r0.copy(r23, r2, r22, r20, r21, r18, r19, r11, r17, r16, r15);
    }

    @aa1
    public final String component1() {
        return this.requestId;
    }

    public final long component10() {
        return this.createTime;
    }

    public final int component11() {
        return this.showType;
    }

    @aa1
    public final String component2() {
        return this.text;
    }

    @aa1
    public final String component3() {
        return this.translate;
    }

    @aa1
    public final String component4() {
        return this.sessionId;
    }

    public final float component5() {
        return this.duration;
    }

    public final boolean component6() {
        return this.isUpLoaded;
    }

    @aa1
    public final String component7() {
        return this.audioPath;
    }

    @aa1
    public final String component8() {
        return this.fromLanguage;
    }

    @aa1
    public final String component9() {
        return this.toLanguage;
    }

    @aa1
    public final TranslateEntity copy(@aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, float r19, boolean r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, long r24, int r26) {
        Intrinsics.X0O(r15, "requestId");
        Intrinsics.X0O(r16, "text");
        Intrinsics.X0O(r17, "translate");
        Intrinsics.X0O(r18, JsonStorageKeyNames.SESSION_ID_KEY);
        Intrinsics.X0O(r21, "audioPath");
        Intrinsics.X0O(r22, "fromLanguage");
        Intrinsics.X0O(r23, "toLanguage");
        return new TranslateEntity(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TranslateEntity) == true) goto L8;
        return false;
    L8:
        TranslateEntity r9 = (TranslateEntity) r8;
        if (Intrinsics.XOO0ii0(this.requestId, r9.requestId) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.text, r9.text) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.translate, r9.translate) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.sessionId, r9.sessionId) == true) goto L21;
        return false;
    L21:
        if (Float.compare(this.duration, r9.duration) == 0) goto L24;
        return false;
    L24:
        if (this.isUpLoaded == r9.isUpLoaded) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.audioPath, r9.audioPath) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.fromLanguage, r9.fromLanguage) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.toLanguage, r9.toLanguage) == true) goto L36;
        return false;
    L36:
        if (this.createTime == r9.createTime) goto L39;
        return false;
    L39:
        if (this.showType == r9.showType) goto L41;
        return false;
    L41:
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
    public final String getFromLanguage() {
        return this.fromLanguage;
    }

    @aa1
    public final String getRequestId() {
        return this.requestId;
    }

    @aa1
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getShowType() {
        return this.showType;
    }

    @aa1
    public final String getText() {
        return this.text;
    }

    @aa1
    public final String getToLanguage() {
        return this.toLanguage;
    }

    @aa1
    public final String getTranslate() {
        return this.translate;
    }

    public int hashCode() {
        return (((((((((((((((((((this.requestId.hashCode() * 31) + this.text.hashCode()) * 31) + this.translate.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + Float.hashCode(this.duration)) * 31) + Boolean.hashCode(this.isUpLoaded)) * 31) + this.audioPath.hashCode()) * 31) + this.fromLanguage.hashCode()) * 31) + this.toLanguage.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.showType);
    }

    public final boolean isUpLoaded() {
        return this.isUpLoaded;
    }

    public final void setAudioPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.audioPath = r2;
    }

    public final void setCreateTime(long r1) {
        this.createTime = r1;
    }

    public final void setDuration(float r1) {
        this.duration = r1;
    }

    public final void setFromLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fromLanguage = r2;
    }

    public final void setToLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.toLanguage = r2;
    }

    public final void setUpLoaded(boolean r1) {
        this.isUpLoaded = r1;
    }

    @aa1
    public String toString() {
        return "TranslateEntity(requestId=" + this.requestId + ", text=" + this.text + ", translate=" + this.translate + ", sessionId=" + this.sessionId + ", duration=" + this.duration + ", isUpLoaded=" + this.isUpLoaded + ", audioPath=" + this.audioPath + ", fromLanguage=" + this.fromLanguage + ", toLanguage=" + this.toLanguage + ", createTime=" + this.createTime + ", showType=" + this.showType + I000IiI1O.iO.iO;
    }

    @aa1
    public final iOIXXXII0 transferToAiMessageData() {
        String r1 = this.audioPath;
        String r7 = this.fromLanguage;
        String r8 = this.toLanguage;
        String r6 = this.text;
        String r5 = this.translate;
        String r9 = this.sessionId;
        String r3 = null;
        Float r4 = null;
        String r10 = null;
        boolean r12 = false;
        return new iOIXXXII0(r1, Integer.valueOf(this.showType), r3, r4, r5, r6, r7, r8, r9, r10, 1, r12, 2572, null);
    }

    @aa1
    public final AIRecords transferToAiRecords() {
        String r14 = this.fromLanguage;
        String r15 = this.toLanguage;
        return new AIRecords(0, 0, null, 0, 0, this.text, null, 0, 0, 0, this.sessionId, r14, r15, null, null, 0, null, 123871, null);
    }

    public /* synthetic */ TranslateEntity(String r16, String r17, String r18, String r19, float r20, boolean r21, String r22, String r23, String r24, long r25, int r27, int r28, DefaultConstructorMarker r29) {
        if ((r28 & 32) == 0) goto L5;
        boolean r8 = false;
    L7:
        if ((r28 & 64) == 0) goto L9;
        String r9 = "";
    L11:
        if ((r28 & 1024) == 0) goto L14;
        int r14 = ChatShowType.FROM.getFlag();
    L15:
        this(r16, r17, r18, r19, r20, r8, r9, r23, r24, r25, r14);
        return;
    L14:
        r14 = r27;
        goto L15
    L9:
        r9 = r22;
        goto L11
    L5:
        r8 = r21;
        goto L7
    }
}
