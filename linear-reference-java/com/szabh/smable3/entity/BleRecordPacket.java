package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bm;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRecordPacket extends BleWritable {
    public static final int AI_MODE_BAIDU = 0;
    public static final int AI_MODE_DEEP_SEEK = 3;
    public static final int AI_MODE_OPENAI = 1;
    public static final int AI_MODE_SPARK_CHAIN = 2;

    @aa1
    public static final Companion Companion = null;
    public static final int MODE_VOICE_AI_CONTINUOUS_DIALOGUE = 10;
    public static final int MODE_VOICE_AI_IDENTIFY = 6;
    public static final int MODE_VOICE_AI_TRANSLATION = 2;
    public static final int MODE_VOICE_AI_WATCHFACE = 1;
    public static final int MODE_VOICE_ALIPAY = 11;
    public static final int MODE_VOICE_EARPHONE_NORMAL = 3;
    public static final int MODE_VOICE_EARPHONE_TRANSLATE = 4;
    public static final int MODE_VOICE_NORMAL = 0;
    public static final int MODE_VOICE_REAL_TIME_CONVERSATION = 7;
    public static final int TRANSFER_STATUE_CANCEL = 9;
    public static final int TRANSFER_STATUE_CONFIRM = 10;
    public static final int TRANSFER_STATUE_END_CONTEXT = 4;
    public static final int TRANSFER_STATUE_RESET = 8;
    public static final int TRANSFER_STATUE_SAVE_ANSWER = 5;
    public static final int TRANSFER_STATUE_VOICE_PLAY_START = 6;
    public static final int TRANSFER_STATUE_VOICE_PLAY_STOP = 7;
    public static final int TRANSFER_STATUS_END = 2;
    public static final int TRANSFER_STATUS_GO_ON = 1;
    public static final int TRANSFER_STATUS_REPLY_DCS = 5;
    public static final int TRANSFER_STATUS_START = 0;
    public static final int TRANSFER_STATUS_SUSPEND = 3;
    private int mAIMode;
    private int mDay;
    private int mEarDirection;
    private int mHour;
    private int mLanguage;
    private int mLength;
    private final int mLengthToWrite;
    private int mMinute;
    private int mMode;
    private int mMonth;

    @aa1
    private byte[] mPacket;
    private int mSecond;
    private int mStatus;
    private int mToLanguage;
    private int mYear;

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

    public BleRecordPacket() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        byte[] r14 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, bm.OXO1, null);
    }

    public static /* synthetic */ BleRecordPacket copy$default(BleRecordPacket r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, byte[] r28, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        int r1 = r14.mYear;
    L7:
        if ((r29 & 2) == 0) goto L9;
        int r2 = r14.mMonth;
    L11:
        if ((r29 & 4) == 0) goto L13;
        int r3 = r14.mDay;
    L15:
        if ((r29 & 8) == 0) goto L17;
        int r4 = r14.mHour;
    L19:
        if ((r29 & 16) == 0) goto L21;
        int r5 = r14.mMinute;
    L23:
        if ((r29 & 32) == 0) goto L25;
        int r6 = r14.mSecond;
    L27:
        if ((r29 & 64) == 0) goto L29;
        int r7 = r14.mLength;
    L31:
        if ((r29 & 128) == 0) goto L33;
        int r8 = r14.mStatus;
    L35:
        if ((r29 & 256) == 0) goto L37;
        int r9 = r14.mMode;
    L39:
        if ((r29 & 512) == 0) goto L41;
        int r10 = r14.mLanguage;
    L43:
        if ((r29 & 1024) == 0) goto L45;
        int r11 = r14.mToLanguage;
    L47:
        if ((r29 & 2048) == 0) goto L49;
        int r12 = r14.mEarDirection;
    L51:
        if ((r29 & 4096) == 0) goto L53;
        int r13 = r14.mAIMode;
    L55:
        if ((r29 & 8192) == 0) goto L58;
        byte[] r210 = r14.mPacket;
    L60:
        return r14.copy(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r210);
    L58:
        r210 = r28;
        goto L60
    L53:
        r13 = r27;
        goto L55
    L49:
        r12 = r26;
        goto L51
    L45:
        r11 = r25;
        goto L47
    L41:
        r10 = r24;
        goto L43
    L37:
        r9 = r23;
        goto L39
    L33:
        r8 = r22;
        goto L35
    L29:
        r7 = r21;
        goto L31
    L25:
        r6 = r20;
        goto L27
    L21:
        r5 = r19;
        goto L23
    L17:
        r4 = r18;
        goto L19
    L13:
        r3 = r17;
        goto L15
    L9:
        r2 = r16;
        goto L11
    L5:
        r1 = r15;
        goto L7
    }

    public final int component1() {
        return this.mYear;
    }

    public final int component10() {
        return this.mLanguage;
    }

    public final int component11() {
        return this.mToLanguage;
    }

    public final int component12() {
        return this.mEarDirection;
    }

    public final int component13() {
        return this.mAIMode;
    }

    @aa1
    public final byte[] component14() {
        return this.mPacket;
    }

    public final int component2() {
        return this.mMonth;
    }

    public final int component3() {
        return this.mDay;
    }

    public final int component4() {
        return this.mHour;
    }

    public final int component5() {
        return this.mMinute;
    }

    public final int component6() {
        return this.mSecond;
    }

    public final int component7() {
        return this.mLength;
    }

    public final int component8() {
        return this.mStatus;
    }

    public final int component9() {
        return this.mMode;
    }

    @aa1
    public final BleRecordPacket copy(int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, @aa1 byte[] r30) {
        Intrinsics.X0O(r30, "mPacket");
        return new BleRecordPacket(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mYear = readUInt8() + 2000;
        this.mMonth = readUInt8();
        this.mDay = readUInt8();
        this.mHour = readUInt8();
        this.mMinute = readUInt8();
        this.mSecond = readUInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLength = readUInt16(r0);
        this.mStatus = readUInt8();
        this.mMode = readUInt8();
        this.mLanguage = readUInt8();
        this.mToLanguage = readUInt8();
        this.mEarDirection = readInt8();
        this.mAIMode = readInt8();
        readBytes(18);
        this.mPacket = readBytes(this.mLength);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mYear - 2000);
        writeInt8(this.mMonth);
        writeInt8(this.mDay);
        writeInt8(this.mHour);
        writeInt8(this.mMinute);
        writeInt8(this.mSecond);
        int r0 = this.mLength;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        writeInt8(this.mStatus);
        writeInt8(this.mMode);
        writeInt8(this.mLanguage);
        writeInt8(this.mToLanguage);
        writeInt8(this.mEarDirection);
        writeInt8(this.mAIMode);
        BleWritable.writeBytes$default(this, new byte[18], null, 2, null);
        BleWritable.writeBytes$default(this, this.mPacket, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleRecordPacket) == true) goto L8;
        return false;
    L8:
        BleRecordPacket r6 = (BleRecordPacket) r5;
        if (this.mYear == r6.mYear) goto L12;
        return false;
    L12:
        if (this.mMonth == r6.mMonth) goto L15;
        return false;
    L15:
        if (this.mDay == r6.mDay) goto L18;
        return false;
    L18:
        if (this.mHour == r6.mHour) goto L21;
        return false;
    L21:
        if (this.mMinute == r6.mMinute) goto L24;
        return false;
    L24:
        if (this.mSecond == r6.mSecond) goto L27;
        return false;
    L27:
        if (this.mLength == r6.mLength) goto L30;
        return false;
    L30:
        if (this.mStatus == r6.mStatus) goto L33;
        return false;
    L33:
        if (this.mMode == r6.mMode) goto L36;
        return false;
    L36:
        if (this.mLanguage == r6.mLanguage) goto L39;
        return false;
    L39:
        if (this.mToLanguage == r6.mToLanguage) goto L42;
        return false;
    L42:
        if (this.mEarDirection == r6.mEarDirection) goto L45;
        return false;
    L45:
        if (this.mAIMode == r6.mAIMode) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mPacket, r6.mPacket) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final int getMAIMode() {
        return this.mAIMode;
    }

    public final int getMDay() {
        return this.mDay;
    }

    public final int getMEarDirection() {
        return this.mEarDirection;
    }

    public final int getMHour() {
        return this.mHour;
    }

    public final int getMLanguage() {
        return this.mLanguage;
    }

    public final int getMLength() {
        return this.mLength;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mLengthToWrite;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMMonth() {
        return this.mMonth;
    }

    @aa1
    public final byte[] getMPacket() {
        return this.mPacket;
    }

    public final int getMSecond() {
        return this.mSecond;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public final int getMToLanguage() {
        return this.mToLanguage;
    }

    public final int getMYear() {
        return this.mYear;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.mYear) * 31) + Integer.hashCode(this.mMonth)) * 31) + Integer.hashCode(this.mDay)) * 31) + Integer.hashCode(this.mHour)) * 31) + Integer.hashCode(this.mMinute)) * 31) + Integer.hashCode(this.mSecond)) * 31) + Integer.hashCode(this.mLength)) * 31) + Integer.hashCode(this.mStatus)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mLanguage)) * 31) + Integer.hashCode(this.mToLanguage)) * 31) + Integer.hashCode(this.mEarDirection)) * 31) + Integer.hashCode(this.mAIMode)) * 31) + Arrays.hashCode(this.mPacket);
    }

    public final void setMAIMode(int r1) {
        this.mAIMode = r1;
    }

    public final void setMDay(int r1) {
        this.mDay = r1;
    }

    public final void setMEarDirection(int r1) {
        this.mEarDirection = r1;
    }

    public final void setMHour(int r1) {
        this.mHour = r1;
    }

    public final void setMLanguage(int r1) {
        this.mLanguage = r1;
    }

    public final void setMLength(int r1) {
        this.mLength = r1;
    }

    public final void setMMinute(int r1) {
        this.mMinute = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMMonth(int r1) {
        this.mMonth = r1;
    }

    public final void setMPacket(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPacket = r2;
    }

    public final void setMSecond(int r1) {
        this.mSecond = r1;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    public final void setMToLanguage(int r1) {
        this.mToLanguage = r1;
    }

    public final void setMYear(int r1) {
        this.mYear = r1;
    }

    @aa1
    public String toString() {
        return "BleRecordPacket(mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mSecond=" + this.mSecond + ", mLength=" + this.mLength + ", mStatus=" + this.mStatus + ", mMode=" + this.mMode + ", mLanguage=" + this.mLanguage + ", mToLanguage=" + this.mToLanguage + ", mEarDirection=" + this.mEarDirection + ", mAIMode=" + this.mAIMode + ", mPacket=" + this.mPacket.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRecordPacket(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, @aa1 byte[] r15) {
        Intrinsics.X0O(r15, "mPacket");
        this.mYear = r2;
        this.mMonth = r3;
        this.mDay = r4;
        this.mHour = r5;
        this.mMinute = r6;
        this.mSecond = r7;
        this.mLength = r8;
        this.mStatus = r9;
        this.mMode = r10;
        this.mLanguage = r11;
        this.mToLanguage = r12;
        this.mEarDirection = r13;
        this.mAIMode = r14;
        this.mPacket = r15;
        this.mLengthToWrite = r15.length + 32;
    }

    public /* synthetic */ BleRecordPacket(int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, byte[] r29, int r30, DefaultConstructorMarker r31) {
        if ((r30 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r30 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r30 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r30 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r30 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r30 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r30 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r30 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r30 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r30 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r30 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r30 & 2048) == 0) goto L49;
        int r13 = 0;
    L51:
        if ((r30 & 4096) == 0) goto L53;
        int r14 = 0;
    L55:
        if ((r30 & 8192) == 0) goto L58;
        byte[] r32 = new byte[0];
    L59:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r32);
        return;
    L58:
        r32 = r29;
        goto L59
    L53:
        r14 = r28;
        goto L55
    L49:
        r13 = r27;
        goto L51
    L45:
        r12 = r26;
        goto L47
    L41:
        r11 = r25;
        goto L43
    L37:
        r10 = r24;
        goto L39
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r7 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L23
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
