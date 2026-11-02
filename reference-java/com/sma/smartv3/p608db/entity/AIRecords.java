package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity
public final class AIRecords implements Serializable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int STATUS_FAIL = 2;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_WAIT = 1;
    public static final int STATUS_WORKING = 3;
    public static final int TYPE_QUESTION_TIP = 6;
    public static final int TYPE_RECEIVED = 2;
    public static final int TYPE_RECEIVED_AUDIO = 3;
    public static final int TYPE_RECEIVED_PROMPT = 4;
    public static final int TYPE_RECEIVED_PROMPT_MORE = 5;
    public static final int TYPE_SEND = 1;
    public static final int TYPE_SYSTEM = 4;

    @ColumnInfo
    private final int mAIFuncType;

    @aa1
    @ColumnInfo
    private String mAITitle;

    @ColumnInfo
    private int mAudioDuration;

    @aa1
    @ColumnInfo
    private String mAudioPath;

    @aa1
    @ColumnInfo
    private String mContent;

    @aa1
    @ColumnInfo
    private String mExtraInfo;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private final String mLocalTime;

    @aa1
    @ColumnInfo
    private String mLocation;

    @ColumnInfo
    private int mStatus;

    @ColumnInfo
    private long mTime;

    @aa1
    @ColumnInfo
    private String mTranslateLanguage;

    @aa1
    @ColumnInfo
    private String mTranslateToLanguage;

    @ColumnInfo
    private final int mType;

    @aa1
    @ColumnInfo
    private String ttsVoiceName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AIRecords() {
        this(0, 0L, null, 0, 0, null, null, 0, 0, 0, null, null, null, null, null, 0, null, 131071, null);
    }

    public static /* synthetic */ AIRecords copy$default(AIRecords aIRecords, int i, long j, String str, int i2, int i3, String str2, String str3, int i4, int i5, int i6, String str4, String str5, String str6, String str7, String str8, int i7, String str9, int i8, Object obj) {
        String str10;
        int i9;
        int i10 = (i8 & 1) != 0 ? aIRecords.mId : i;
        long j2 = (i8 & 2) != 0 ? aIRecords.mTime : j;
        String str11 = (i8 & 4) != 0 ? aIRecords.mLocalTime : str;
        int i11 = (i8 & 8) != 0 ? aIRecords.mAIFuncType : i2;
        int i12 = (i8 & 16) != 0 ? aIRecords.mType : i3;
        String str12 = (i8 & 32) != 0 ? aIRecords.mContent : str2;
        String str13 = (i8 & 64) != 0 ? aIRecords.mExtraInfo : str3;
        int i13 = (i8 & 128) != 0 ? aIRecords.mStatus : i4;
        int i14 = (i8 & 256) != 0 ? aIRecords.mIsSync : i5;
        int i15 = (i8 & 512) != 0 ? aIRecords.mIsDelete : i6;
        String str14 = (i8 & 1024) != 0 ? aIRecords.mAITitle : str4;
        String str15 = (i8 & 2048) != 0 ? aIRecords.mTranslateLanguage : str5;
        String str16 = (i8 & 4096) != 0 ? aIRecords.mTranslateToLanguage : str6;
        int i16 = i10;
        String str17 = (i8 & 8192) != 0 ? aIRecords.mLocation : str7;
        String str18 = (i8 & 16384) != 0 ? aIRecords.mAudioPath : str8;
        int i17 = (i8 & 32768) != 0 ? aIRecords.mAudioDuration : i7;
        if ((i8 & 65536) != 0) {
            i9 = i17;
            str10 = aIRecords.ttsVoiceName;
        } else {
            str10 = str9;
            i9 = i17;
        }
        return aIRecords.copy(i16, j2, str11, i11, i12, str12, str13, i13, i14, i15, str14, str15, str16, str17, str18, i9, str10);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mIsDelete;
    }

    @aa1
    public final String component11() {
        return this.mAITitle;
    }

    @aa1
    public final String component12() {
        return this.mTranslateLanguage;
    }

    @aa1
    public final String component13() {
        return this.mTranslateToLanguage;
    }

    @aa1
    public final String component14() {
        return this.mLocation;
    }

    @aa1
    public final String component15() {
        return this.mAudioPath;
    }

    public final int component16() {
        return this.mAudioDuration;
    }

    @aa1
    public final String component17() {
        return this.ttsVoiceName;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mAIFuncType;
    }

    public final int component5() {
        return this.mType;
    }

    @aa1
    public final String component6() {
        return this.mContent;
    }

    @aa1
    public final String component7() {
        return this.mExtraInfo;
    }

    public final int component8() {
        return this.mStatus;
    }

    public final int component9() {
        return this.mIsSync;
    }

    @aa1
    public final AIRecords copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, @aa1 String mContent, @aa1 String mExtraInfo, int i4, int i5, int i6, @aa1 String mAITitle, @aa1 String mTranslateLanguage, @aa1 String mTranslateToLanguage, @aa1 String mLocation, @aa1 String mAudioPath, int i7, @aa1 String ttsVoiceName) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mContent, "mContent");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        Intrinsics.X0O(mAITitle, "mAITitle");
        Intrinsics.X0O(mTranslateLanguage, "mTranslateLanguage");
        Intrinsics.X0O(mTranslateToLanguage, "mTranslateToLanguage");
        Intrinsics.X0O(mLocation, "mLocation");
        Intrinsics.X0O(mAudioPath, "mAudioPath");
        Intrinsics.X0O(ttsVoiceName, "ttsVoiceName");
        return new AIRecords(i, j, mLocalTime, i2, i3, mContent, mExtraInfo, i4, i5, i6, mAITitle, mTranslateLanguage, mTranslateToLanguage, mLocation, mAudioPath, i7, ttsVoiceName);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRecords)) {
            return false;
        }
        AIRecords aIRecords = (AIRecords) obj;
        return this.mId == aIRecords.mId && this.mTime == aIRecords.mTime && Intrinsics.XOO0ii0(this.mLocalTime, aIRecords.mLocalTime) && this.mAIFuncType == aIRecords.mAIFuncType && this.mType == aIRecords.mType && Intrinsics.XOO0ii0(this.mContent, aIRecords.mContent) && Intrinsics.XOO0ii0(this.mExtraInfo, aIRecords.mExtraInfo) && this.mStatus == aIRecords.mStatus && this.mIsSync == aIRecords.mIsSync && this.mIsDelete == aIRecords.mIsDelete && Intrinsics.XOO0ii0(this.mAITitle, aIRecords.mAITitle) && Intrinsics.XOO0ii0(this.mTranslateLanguage, aIRecords.mTranslateLanguage) && Intrinsics.XOO0ii0(this.mTranslateToLanguage, aIRecords.mTranslateToLanguage) && Intrinsics.XOO0ii0(this.mLocation, aIRecords.mLocation) && Intrinsics.XOO0ii0(this.mAudioPath, aIRecords.mAudioPath) && this.mAudioDuration == aIRecords.mAudioDuration && Intrinsics.XOO0ii0(this.ttsVoiceName, aIRecords.ttsVoiceName);
    }

    public final int getMAIFuncType() {
        return this.mAIFuncType;
    }

    @aa1
    public final String getMAITitle() {
        return this.mAITitle;
    }

    public final int getMAudioDuration() {
        return this.mAudioDuration;
    }

    @aa1
    public final String getMAudioPath() {
        return this.mAudioPath;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @aa1
    public final String getMExtraInfo() {
        return this.mExtraInfo;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    @aa1
    public final String getMLocation() {
        return this.mLocation;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMTranslateLanguage() {
        return this.mTranslateLanguage;
    }

    @aa1
    public final String getMTranslateToLanguage() {
        return this.mTranslateToLanguage;
    }

    public final int getMType() {
        return this.mType;
    }

    @aa1
    public final String getTtsVoiceName() {
        return this.ttsVoiceName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mAIFuncType)) * 31) + Integer.hashCode(this.mType)) * 31) + this.mContent.hashCode()) * 31) + this.mExtraInfo.hashCode()) * 31) + Integer.hashCode(this.mStatus)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + this.mAITitle.hashCode()) * 31) + this.mTranslateLanguage.hashCode()) * 31) + this.mTranslateToLanguage.hashCode()) * 31) + this.mLocation.hashCode()) * 31) + this.mAudioPath.hashCode()) * 31) + Integer.hashCode(this.mAudioDuration)) * 31) + this.ttsVoiceName.hashCode();
    }

    public final void setMAITitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mAITitle = str;
    }

    public final void setMAudioDuration(int i) {
        this.mAudioDuration = i;
    }

    public final void setMAudioPath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mAudioPath = str;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMExtraInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mExtraInfo = str;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocation(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocation = str;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMTranslateLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTranslateLanguage = str;
    }

    public final void setMTranslateToLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTranslateToLanguage = str;
    }

    public final void setTtsVoiceName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.ttsVoiceName = str;
    }

    @aa1
    public String toString() {
        return "AIRecords(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mAIFuncType=" + this.mAIFuncType + ", mType=" + this.mType + ", mContent=" + this.mContent + ", mExtraInfo=" + this.mExtraInfo + ", mStatus=" + this.mStatus + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mAITitle=" + this.mAITitle + ", mTranslateLanguage=" + this.mTranslateLanguage + ", mTranslateToLanguage=" + this.mTranslateToLanguage + ", mLocation=" + this.mLocation + ", mAudioPath=" + this.mAudioPath + ", mAudioDuration=" + this.mAudioDuration + ", ttsVoiceName=" + this.ttsVoiceName + I000IiI1O.C2156iO.f1007iO;
    }

    public AIRecords(int i, long j, @aa1 String mLocalTime, int i2, int i3, @aa1 String mContent, @aa1 String mExtraInfo, int i4, int i5, int i6, @aa1 String mAITitle, @aa1 String mTranslateLanguage, @aa1 String mTranslateToLanguage, @aa1 String mLocation, @aa1 String mAudioPath, int i7, @aa1 String ttsVoiceName) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mContent, "mContent");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        Intrinsics.X0O(mAITitle, "mAITitle");
        Intrinsics.X0O(mTranslateLanguage, "mTranslateLanguage");
        Intrinsics.X0O(mTranslateToLanguage, "mTranslateToLanguage");
        Intrinsics.X0O(mLocation, "mLocation");
        Intrinsics.X0O(mAudioPath, "mAudioPath");
        Intrinsics.X0O(ttsVoiceName, "ttsVoiceName");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mAIFuncType = i2;
        this.mType = i3;
        this.mContent = mContent;
        this.mExtraInfo = mExtraInfo;
        this.mStatus = i4;
        this.mIsSync = i5;
        this.mIsDelete = i6;
        this.mAITitle = mAITitle;
        this.mTranslateLanguage = mTranslateLanguage;
        this.mTranslateToLanguage = mTranslateToLanguage;
        this.mLocation = mLocation;
        this.mAudioPath = mAudioPath;
        this.mAudioDuration = i7;
        this.ttsVoiceName = ttsVoiceName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AIRecords(int i, long j, String str, int i2, int i3, String str2, String str3, int i4, int i5, int i6, String str4, String str5, String str6, String str7, String str8, int i7, String str9, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        int i9 = (i8 & 1) != 0 ? 0 : i;
        long time = (i8 & 2) != 0 ? new Date().getTime() : j;
        if ((i8 & 4) != 0) {
            str10 = O0X11OiO.XO0O10().format(new Date());
            Intrinsics.O10IXXX0X(str10, "format(...)");
        } else {
            str10 = str;
        }
        this(i9, time, str10, (i8 & 8) != 0 ? 0 : i2, (i8 & 16) != 0 ? 0 : i3, (i8 & 32) != 0 ? "" : str2, (i8 & 64) != 0 ? "" : str3, (i8 & 128) != 0 ? 0 : i4, (i8 & 256) != 0 ? 0 : i5, (i8 & 512) != 0 ? 0 : i6, (i8 & 1024) != 0 ? "" : str4, (i8 & 2048) != 0 ? "" : str5, (i8 & 4096) != 0 ? "" : str6, (i8 & 8192) != 0 ? "" : str7, (i8 & 16384) != 0 ? "" : str8, (i8 & 32768) != 0 ? 0 : i7, (i8 & 65536) != 0 ? "" : str9);
    }
}
