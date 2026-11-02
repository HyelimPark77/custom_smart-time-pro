package com.sma.smartv3.db.entity;

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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AIRecords() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        String r7 = null;
        String r8 = null;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        int r17 = 0;
        String r18 = null;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, 131071, null);
    }

    public static /* synthetic */ AIRecords copy$default(AIRecords r17, int r18, long r19, String r21, int r22, int r23, String r24, String r25, int r26, int r27, int r28, String r29, String r30, String r31, String r32, String r33, int r34, String r35, int r36, Object r37) {
        if ((r36 & 1) == 0) goto L5;
        int r2 = r17.mId;
    L7:
        if ((r36 & 2) == 0) goto L9;
        long r3 = r17.mTime;
    L11:
        if ((r36 & 4) == 0) goto L13;
        String r5 = r17.mLocalTime;
    L15:
        if ((r36 & 8) == 0) goto L17;
        int r6 = r17.mAIFuncType;
    L19:
        if ((r36 & 16) == 0) goto L21;
        int r7 = r17.mType;
    L23:
        if ((r36 & 32) == 0) goto L25;
        String r8 = r17.mContent;
    L27:
        if ((r36 & 64) == 0) goto L29;
        String r9 = r17.mExtraInfo;
    L31:
        if ((r36 & 128) == 0) goto L33;
        int r10 = r17.mStatus;
    L35:
        if ((r36 & 256) == 0) goto L37;
        int r11 = r17.mIsSync;
    L39:
        if ((r36 & 512) == 0) goto L41;
        int r12 = r17.mIsDelete;
    L43:
        if ((r36 & 1024) == 0) goto L45;
        String r13 = r17.mAITitle;
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r14 = r17.mTranslateLanguage;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        String r15 = r17.mTranslateToLanguage;
    L54:
        int r110 = r2;
        if ((r36 & 8192) == 0) goto L57;
        String r4 = r17.mLocation;
    L58:
        String r111 = r4;
        if ((r36 & 16384) == 0) goto L61;
        String r16 = r17.mAudioPath;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        int r1 = r17.mAudioDuration;
    L67:
        if ((r36 & 65536) == 0) goto L70;
        int r20 = r1;
        int r38 = r20;
        String r39 = r17.ttsVoiceName;
    L72:
        return r17.copy(r110, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r111, r16, r38, r39);
    L70:
        r39 = r35;
        r38 = r1;
        goto L72
    L65:
        r1 = r34;
        goto L67
    L61:
        r16 = r33;
        goto L63
    L57:
        r4 = r32;
        goto L58
    L53:
        r15 = r31;
        goto L54
    L49:
        r14 = r30;
        goto L51
    L45:
        r13 = r29;
        goto L47
    L41:
        r12 = r28;
        goto L43
    L37:
        r11 = r27;
        goto L39
    L33:
        r10 = r26;
        goto L35
    L29:
        r9 = r25;
        goto L31
    L25:
        r8 = r24;
        goto L27
    L21:
        r7 = r23;
        goto L23
    L17:
        r6 = r22;
        goto L19
    L13:
        r5 = r21;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
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
    public final AIRecords copy(int r21, long r22, @aa1 String r24, int r25, int r26, @aa1 String r27, @aa1 String r28, int r29, int r30, int r31, @aa1 String r32, @aa1 String r33, @aa1 String r34, @aa1 String r35, @aa1 String r36, int r37, @aa1 String r38) {
        Intrinsics.X0O(r24, "mLocalTime");
        Intrinsics.X0O(r27, "mContent");
        Intrinsics.X0O(r28, "mExtraInfo");
        Intrinsics.X0O(r32, "mAITitle");
        Intrinsics.X0O(r33, "mTranslateLanguage");
        Intrinsics.X0O(r34, "mTranslateToLanguage");
        Intrinsics.X0O(r35, "mLocation");
        Intrinsics.X0O(r36, "mAudioPath");
        Intrinsics.X0O(r38, "ttsVoiceName");
        return new AIRecords(r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AIRecords) == true) goto L8;
        return false;
    L8:
        AIRecords r9 = (AIRecords) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (this.mAIFuncType == r9.mAIFuncType) goto L21;
        return false;
    L21:
        if (this.mType == r9.mType) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mExtraInfo, r9.mExtraInfo) == true) goto L30;
        return false;
    L30:
        if (this.mStatus == r9.mStatus) goto L33;
        return false;
    L33:
        if (this.mIsSync == r9.mIsSync) goto L36;
        return false;
    L36:
        if (this.mIsDelete == r9.mIsDelete) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mAITitle, r9.mAITitle) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mTranslateLanguage, r9.mTranslateLanguage) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.mTranslateToLanguage, r9.mTranslateToLanguage) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mLocation, r9.mLocation) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.mAudioPath, r9.mAudioPath) == true) goto L54;
        return false;
    L54:
        if (this.mAudioDuration == r9.mAudioDuration) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.ttsVoiceName, r9.ttsVoiceName) == true) goto L59;
        return false;
    L59:
        return true;
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

    public final void setMAITitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAITitle = r2;
    }

    public final void setMAudioDuration(int r1) {
        this.mAudioDuration = r1;
    }

    public final void setMAudioPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAudioPath = r2;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMExtraInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mExtraInfo = r2;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocation(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocation = r2;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMTranslateLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTranslateLanguage = r2;
    }

    public final void setMTranslateToLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTranslateToLanguage = r2;
    }

    public final void setTtsVoiceName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ttsVoiceName = r2;
    }

    @aa1
    public String toString() {
        return "AIRecords(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mAIFuncType=" + this.mAIFuncType + ", mType=" + this.mType + ", mContent=" + this.mContent + ", mExtraInfo=" + this.mExtraInfo + ", mStatus=" + this.mStatus + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mAITitle=" + this.mAITitle + ", mTranslateLanguage=" + this.mTranslateLanguage + ", mTranslateToLanguage=" + this.mTranslateToLanguage + ", mLocation=" + this.mLocation + ", mAudioPath=" + this.mAudioPath + ", mAudioDuration=" + this.mAudioDuration + ", ttsVoiceName=" + this.ttsVoiceName + I000IiI1O.iO.iO;
    }

    public AIRecords(int r10, long r11, @aa1 String r13, int r14, int r15, @aa1 String r16, @aa1 String r17, int r18, int r19, int r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, int r26, @aa1 String r27) {
        Intrinsics.X0O(r13, "mLocalTime");
        Intrinsics.X0O(r16, "mContent");
        Intrinsics.X0O(r17, "mExtraInfo");
        Intrinsics.X0O(r21, "mAITitle");
        Intrinsics.X0O(r22, "mTranslateLanguage");
        Intrinsics.X0O(r23, "mTranslateToLanguage");
        Intrinsics.X0O(r24, "mLocation");
        Intrinsics.X0O(r25, "mAudioPath");
        Intrinsics.X0O(r27, "ttsVoiceName");
        this.mId = r10;
        this.mTime = r11;
        this.mLocalTime = r13;
        this.mAIFuncType = r14;
        this.mType = r15;
        this.mContent = r16;
        this.mExtraInfo = r17;
        this.mStatus = r18;
        this.mIsSync = r19;
        this.mIsDelete = r20;
        this.mAITitle = r21;
        this.mTranslateLanguage = r22;
        this.mTranslateToLanguage = r23;
        this.mLocation = r24;
        this.mAudioPath = r25;
        this.mAudioDuration = r26;
        this.ttsVoiceName = r27;
    }

    public /* synthetic */ AIRecords(int r19, long r20, String r22, int r23, int r24, String r25, String r26, int r27, int r28, int r29, String r30, String r31, String r32, String r33, String r34, int r35, String r36, int r37, DefaultConstructorMarker r38) {
        if ((r37 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r37 & 2) == 0) goto L9;
        long r3 = new Date().getTime();
    L11:
        if ((r37 & 4) == 0) goto L13;
        String r5 = O0X11OiO.XO0O10().format(new Date());
        Intrinsics.O10IXXX0X(r5, "format(...)");
    L15:
        if ((r37 & 8) == 0) goto L17;
        int r6 = 0;
    L19:
        if ((r37 & 16) == 0) goto L21;
        int r7 = 0;
    L23:
        if ((r37 & 32) == 0) goto L25;
        String r8 = "";
    L27:
        if ((r37 & 64) == 0) goto L29;
        String r10 = "";
    L31:
        if ((r37 & 128) == 0) goto L33;
        int r11 = 0;
    L35:
        if ((r37 & 256) == 0) goto L37;
        int r12 = 0;
    L39:
        if ((r37 & 512) == 0) goto L41;
        int r13 = 0;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        String r14 = "";
    L47:
        if ((r37 & 2048) == 0) goto L49;
        String r15 = "";
    L51:
        if ((r37 & 4096) == 0) goto L53;
        String r2 = "";
    L54:
        int r110 = r1;
        if ((r37 & 8192) == 0) goto L57;
        String r4 = "";
    L58:
        String r21 = r4;
        if ((r37 & 16384) == 0) goto L61;
        String r9 = "";
    L63:
        if ((r37 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r37 & 65536) == 0) goto L70;
        String r39 = "";
    L71:
        this(r110, r3, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r2, r21, r9, r16, r39);
        return;
    L70:
        r39 = r36;
        goto L71
    L65:
        r16 = r35;
        goto L67
    L61:
        r9 = r34;
        goto L63
    L57:
        r4 = r33;
        goto L58
    L53:
        r2 = r32;
        goto L54
    L49:
        r15 = r31;
        goto L51
    L45:
        r14 = r30;
        goto L47
    L41:
        r13 = r29;
        goto L43
    L37:
        r12 = r28;
        goto L39
    L33:
        r11 = r27;
        goto L35
    L29:
        r10 = r26;
        goto L31
    L25:
        r8 = r25;
        goto L27
    L21:
        r7 = r24;
        goto L23
    L17:
        r6 = r23;
        goto L19
    L13:
        r5 = r22;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
