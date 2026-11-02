package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPListener extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 32;
    public static final int STATUS_CLOSE = 2;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_OPEN = 1;
    private long mLastReceivedRecordTimes;
    private int mLastRecordNum;
    private long mLastSendRecordTimes;
    private int mStatus;

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

    public BleCPListener() {
        int r1 = 0;
        long r2 = 0;
        long r4 = 0;
        int r6 = 0;
        this(r1, r2, r4, r6, 15, null);
    }

    public static /* synthetic */ BleCPListener copy$default(BleCPListener r0, int r1, long r2, long r4, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mStatus;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mLastSendRecordTimes;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = r0.mLastReceivedRecordTimes;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = r0.mLastRecordNum;
    L14:
        int r9 = r6;
        long r10 = r4;
        int r3 = r1;
        return r0.copy(r3, r2, r10, r9);
    }

    public final int component1() {
        return this.mStatus;
    }

    public final long component2() {
        return this.mLastSendRecordTimes;
    }

    public final long component3() {
        return this.mLastReceivedRecordTimes;
    }

    public final int component4() {
        return this.mLastRecordNum;
    }

    @aa1
    public final BleCPListener copy(int r8, long r9, long r11, int r13) {
        return new BleCPListener(r8, r9, r11, r13);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStatus = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLastSendRecordTimes = readInt64(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLastReceivedRecordTimes = readInt64(r0);
        this.mLastRecordNum = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mStatus);
        long r0 = this.mLastSendRecordTimes;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        long r1 = this.mLastReceivedRecordTimes;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r1, r2);
        writeInt8(this.mLastRecordNum);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPListener) == true) goto L8;
        return false;
    L8:
        BleCPListener r9 = (BleCPListener) r8;
        if (this.mStatus == r9.mStatus) goto L12;
        return false;
    L12:
        if (this.mLastSendRecordTimes == r9.mLastSendRecordTimes) goto L15;
        return false;
    L15:
        if (this.mLastReceivedRecordTimes == r9.mLastReceivedRecordTimes) goto L18;
        return false;
    L18:
        if (this.mLastRecordNum == r9.mLastRecordNum) goto L20;
        return false;
    L20:
        return true;
    }

    public final long getMLastReceivedRecordTimes() {
        return this.mLastReceivedRecordTimes;
    }

    public final int getMLastRecordNum() {
        return this.mLastRecordNum;
    }

    public final long getMLastSendRecordTimes() {
        return this.mLastSendRecordTimes;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 32;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mStatus) * 31) + Long.hashCode(this.mLastSendRecordTimes)) * 31) + Long.hashCode(this.mLastReceivedRecordTimes)) * 31) + Integer.hashCode(this.mLastRecordNum);
    }

    public final void setMLastReceivedRecordTimes(long r1) {
        this.mLastReceivedRecordTimes = r1;
    }

    public final void setMLastRecordNum(int r1) {
        this.mLastRecordNum = r1;
    }

    public final void setMLastSendRecordTimes(long r1) {
        this.mLastSendRecordTimes = r1;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    @aa1
    public String toString() {
        return "BleCPListener(mStatus=" + this.mStatus + ", mLastSendRecordTimes=" + this.mLastSendRecordTimes + ", mLastReceivedRecordTimes=" + this.mLastReceivedRecordTimes + ", mLastRecordNum=" + this.mLastRecordNum + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPListener(int r1, long r2, long r4, int r6) {
        this.mStatus = r1;
        this.mLastSendRecordTimes = r2;
        this.mLastReceivedRecordTimes = r4;
        this.mLastRecordNum = r6;
    }

    public /* synthetic */ BleCPListener(int r4, long r5, long r7, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r5 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r7 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        int r12 = 0;
    L16:
        this(r4, r5, r7, r12);
        return;
    L15:
        r12 = r9;
        goto L16
    }
}
