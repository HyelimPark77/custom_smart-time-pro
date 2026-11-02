package com.sma.smartv3.p608db.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p610ui.translate.ChatShowType;
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

    public TranslateEntity(@aa1 String requestId, @aa1 String text, @aa1 String translate, @aa1 String sessionId, float f, boolean z, @aa1 String audioPath, @aa1 String fromLanguage, @aa1 String toLanguage, long j, int i) {
        Intrinsics.X0O(requestId, "requestId");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(translate, "translate");
        Intrinsics.X0O(sessionId, "sessionId");
        Intrinsics.X0O(audioPath, "audioPath");
        Intrinsics.X0O(fromLanguage, "fromLanguage");
        Intrinsics.X0O(toLanguage, "toLanguage");
        this.requestId = requestId;
        this.text = text;
        this.translate = translate;
        this.sessionId = sessionId;
        this.duration = f;
        this.isUpLoaded = z;
        this.audioPath = audioPath;
        this.fromLanguage = fromLanguage;
        this.toLanguage = toLanguage;
        this.createTime = j;
        this.showType = i;
    }

    public static /* synthetic */ TranslateEntity copy$default(TranslateEntity translateEntity, String str, String str2, String str3, String str4, float f, boolean z, String str5, String str6, String str7, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = translateEntity.requestId;
        }
        if ((i2 & 2) != 0) {
            str2 = translateEntity.text;
        }
        if ((i2 & 4) != 0) {
            str3 = translateEntity.translate;
        }
        if ((i2 & 8) != 0) {
            str4 = translateEntity.sessionId;
        }
        if ((i2 & 16) != 0) {
            f = translateEntity.duration;
        }
        if ((i2 & 32) != 0) {
            z = translateEntity.isUpLoaded;
        }
        if ((i2 & 64) != 0) {
            str5 = translateEntity.audioPath;
        }
        if ((i2 & 128) != 0) {
            str6 = translateEntity.fromLanguage;
        }
        if ((i2 & 256) != 0) {
            str7 = translateEntity.toLanguage;
        }
        if ((i2 & 512) != 0) {
            j = translateEntity.createTime;
        }
        if ((i2 & 1024) != 0) {
            i = translateEntity.showType;
        }
        int i3 = i;
        long j2 = j;
        String str8 = str6;
        String str9 = str7;
        boolean z2 = z;
        String str10 = str5;
        float f2 = f;
        String str11 = str3;
        return translateEntity.copy(str, str2, str11, str4, f2, z2, str10, str8, str9, j2, i3);
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
    public final TranslateEntity copy(@aa1 String requestId, @aa1 String text, @aa1 String translate, @aa1 String sessionId, float f, boolean z, @aa1 String audioPath, @aa1 String fromLanguage, @aa1 String toLanguage, long j, int i) {
        Intrinsics.X0O(requestId, "requestId");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(translate, "translate");
        Intrinsics.X0O(sessionId, "sessionId");
        Intrinsics.X0O(audioPath, "audioPath");
        Intrinsics.X0O(fromLanguage, "fromLanguage");
        Intrinsics.X0O(toLanguage, "toLanguage");
        return new TranslateEntity(requestId, text, translate, sessionId, f, z, audioPath, fromLanguage, toLanguage, j, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateEntity)) {
            return false;
        }
        TranslateEntity translateEntity = (TranslateEntity) obj;
        return Intrinsics.XOO0ii0(this.requestId, translateEntity.requestId) && Intrinsics.XOO0ii0(this.text, translateEntity.text) && Intrinsics.XOO0ii0(this.translate, translateEntity.translate) && Intrinsics.XOO0ii0(this.sessionId, translateEntity.sessionId) && Float.compare(this.duration, translateEntity.duration) == 0 && this.isUpLoaded == translateEntity.isUpLoaded && Intrinsics.XOO0ii0(this.audioPath, translateEntity.audioPath) && Intrinsics.XOO0ii0(this.fromLanguage, translateEntity.fromLanguage) && Intrinsics.XOO0ii0(this.toLanguage, translateEntity.toLanguage) && this.createTime == translateEntity.createTime && this.showType == translateEntity.showType;
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

    public final void setAudioPath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.audioPath = str;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    public final void setFromLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fromLanguage = str;
    }

    public final void setToLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.toLanguage = str;
    }

    public final void setUpLoaded(boolean z) {
        this.isUpLoaded = z;
    }

    @aa1
    public String toString() {
        return "TranslateEntity(requestId=" + this.requestId + ", text=" + this.text + ", translate=" + this.translate + ", sessionId=" + this.sessionId + ", duration=" + this.duration + ", isUpLoaded=" + this.isUpLoaded + ", audioPath=" + this.audioPath + ", fromLanguage=" + this.fromLanguage + ", toLanguage=" + this.toLanguage + ", createTime=" + this.createTime + ", showType=" + this.showType + I000IiI1O.C2156iO.f1007iO;
    }

    @aa1
    public final iOIXXXII0 transferToAiMessageData() {
        String str = this.audioPath;
        String str2 = this.fromLanguage;
        String str3 = this.toLanguage;
        String str4 = this.text;
        return new iOIXXXII0(str, Integer.valueOf(this.showType), null, null, this.translate, str4, str2, str3, this.sessionId, null, 1, false, 2572, null);
    }

    @aa1
    public final AIRecords transferToAiRecords() {
        return new AIRecords(0, 0L, null, 0, 0, this.text, null, 0, 0, 0, this.sessionId, this.fromLanguage, this.toLanguage, null, null, 0, null, 123871, null);
    }

    public /* synthetic */ TranslateEntity(String str, String str2, String str3, String str4, float f, boolean z, String str5, String str6, String str7, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, f, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str5, str6, str7, j, (i2 & 1024) != 0 ? ChatShowType.FROM.getFlag() : i);
    }
}
