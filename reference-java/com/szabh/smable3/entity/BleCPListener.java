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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 32;
    public static final int STATUS_CLOSE = 2;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_OPEN = 1;
    private long mLastReceivedRecordTimes;
    private int mLastRecordNum;
    private long mLastSendRecordTimes;
    private int mStatus;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPListener() {
        this(0, 0L, 0L, 0, 15, null);
    }

    public static /* synthetic */ BleCPListener copy$default(BleCPListener bleCPListener, int i, long j, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleCPListener.mStatus;
        }
        if ((i3 & 2) != 0) {
            j = bleCPListener.mLastSendRecordTimes;
        }
        if ((i3 & 4) != 0) {
            j2 = bleCPListener.mLastReceivedRecordTimes;
        }
        if ((i3 & 8) != 0) {
            i2 = bleCPListener.mLastRecordNum;
        }
        int i4 = i2;
        return bleCPListener.copy(i, j, j2, i4);
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
    public final BleCPListener copy(int i, long j, long j2, int i2) {
        return new BleCPListener(i, j, j2, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStatus = readInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLastSendRecordTimes = readInt64(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLastReceivedRecordTimes = readInt64(LITTLE_ENDIAN);
        this.mLastRecordNum = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mStatus);
        long j = this.mLastSendRecordTimes;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        long j2 = this.mLastReceivedRecordTimes;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j2, LITTLE_ENDIAN);
        writeInt8(this.mLastRecordNum);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPListener)) {
            return false;
        }
        BleCPListener bleCPListener = (BleCPListener) obj;
        return this.mStatus == bleCPListener.mStatus && this.mLastSendRecordTimes == bleCPListener.mLastSendRecordTimes && this.mLastReceivedRecordTimes == bleCPListener.mLastReceivedRecordTimes && this.mLastRecordNum == bleCPListener.mLastRecordNum;
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

    public final void setMLastReceivedRecordTimes(long j) {
        this.mLastReceivedRecordTimes = j;
    }

    public final void setMLastRecordNum(int i) {
        this.mLastRecordNum = i;
    }

    public final void setMLastSendRecordTimes(long j) {
        this.mLastSendRecordTimes = j;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
    }

    @aa1
    public String toString() {
        return "BleCPListener(mStatus=" + this.mStatus + ", mLastSendRecordTimes=" + this.mLastSendRecordTimes + ", mLastReceivedRecordTimes=" + this.mLastReceivedRecordTimes + ", mLastRecordNum=" + this.mLastRecordNum + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPListener(int i, long j, long j2, int i2) {
        this.mStatus = i;
        this.mLastSendRecordTimes = j;
        this.mLastReceivedRecordTimes = j2;
        this.mLastRecordNum = i2;
    }

    public /* synthetic */ BleCPListener(int i, long j, long j2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0L : j2, (i3 & 8) != 0 ? 0 : i2);
    }
}
