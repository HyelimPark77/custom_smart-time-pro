package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSosCallLog extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 48;
    private static final int PHONE_LENGTH = 24;
    private int mBOValue;
    private int mBpm;
    private int mDuration;
    private int mLastBOTime;
    private int mLastHrTime;

    @aa1
    private String mPhone;
    private int mTime;
    private int mType;

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

    public BleSosCallLog() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ BleSosCallLog copy$default(BleSosCallLog r0, int r1, int r2, int r3, String r4, int r5, int r6, int r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mDuration;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mType;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mPhone;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mLastHrTime;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mLastBOTime;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mBpm;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mBOValue;
    L26:
        int r11 = r7;
        int r12 = r8;
        int r13 = r5;
        int r14 = r6;
        int r15 = r3;
        String r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mDuration;
    }

    public final int component3() {
        return this.mType;
    }

    @aa1
    public final String component4() {
        return this.mPhone;
    }

    public final int component5() {
        return this.mLastHrTime;
    }

    public final int component6() {
        return this.mLastBOTime;
    }

    public final int component7() {
        return this.mBpm;
    }

    public final int component8() {
        return this.mBOValue;
    }

    @aa1
    public final BleSosCallLog copy(int r11, int r12, int r13, @aa1 String r14, int r15, int r16, int r17, int r18) {
        Intrinsics.X0O(r14, "mPhone");
        return new BleSosCallLog(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = (int) readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDuration = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mType = readUInt16(r0);
        this.mPhone = BleReadable.readString$default(this, 24, null, 2, null);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLastHrTime = (int) readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLastBOTime = (int) readUInt32(r0);
        this.mBpm = readUInt8();
        this.mBOValue = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSosCallLog) == true) goto L8;
        return false;
    L8:
        BleSosCallLog r6 = (BleSosCallLog) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mDuration == r6.mDuration) goto L15;
        return false;
    L15:
        if (this.mType == r6.mType) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mPhone, r6.mPhone) == true) goto L21;
        return false;
    L21:
        if (this.mLastHrTime == r6.mLastHrTime) goto L24;
        return false;
    L24:
        if (this.mLastBOTime == r6.mLastBOTime) goto L27;
        return false;
    L27:
        if (this.mBpm == r6.mBpm) goto L30;
        return false;
    L30:
        if (this.mBOValue == r6.mBOValue) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMBOValue() {
        return this.mBOValue;
    }

    public final int getMBpm() {
        return this.mBpm;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMLastBOTime() {
        return this.mLastBOTime;
    }

    public final int getMLastHrTime() {
        return this.mLastHrTime;
    }

    @aa1
    public final String getMPhone() {
        return this.mPhone;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mType)) * 31) + this.mPhone.hashCode()) * 31) + Integer.hashCode(this.mLastHrTime)) * 31) + Integer.hashCode(this.mLastBOTime)) * 31) + Integer.hashCode(this.mBpm)) * 31) + Integer.hashCode(this.mBOValue);
    }

    public final void setMBOValue(int r1) {
        this.mBOValue = r1;
    }

    public final void setMBpm(int r1) {
        this.mBpm = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMLastBOTime(int r1) {
        this.mLastBOTime = r1;
    }

    public final void setMLastHrTime(int r1) {
        this.mLastHrTime = r1;
    }

    public final void setMPhone(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPhone = r2;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleSosCallLog(mTime=" + this.mTime + ", mDuration=" + this.mDuration + ", mType=" + this.mType + ", mPhone=" + this.mPhone + ", mLastHrTime=" + this.mLastHrTime + ", mLastBOTime=" + this.mLastBOTime + ", mBpm=" + this.mBpm + ", mBOValue=" + this.mBOValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSosCallLog(int r2, int r3, int r4, @aa1 String r5, int r6, int r7, int r8, int r9) {
        Intrinsics.X0O(r5, "mPhone");
        this.mTime = r2;
        this.mDuration = r3;
        this.mType = r4;
        this.mPhone = r5;
        this.mLastHrTime = r6;
        this.mLastBOTime = r7;
        this.mBpm = r8;
        this.mBOValue = r9;
    }

    public /* synthetic */ BleSosCallLog(int r2, int r3, int r4, String r5, int r6, int r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r10 & 128) == 0) goto L27;
        int r12 = 0;
    L26:
        int r13 = r8;
        int r14 = r7;
        int r15 = r6;
        String r16 = r5;
        int r17 = r4;
        this(r2, r3, r17, r16, r15, r14, r13, r12);
        return;
    L27:
        r12 = r9;
        goto L26
    }
}
