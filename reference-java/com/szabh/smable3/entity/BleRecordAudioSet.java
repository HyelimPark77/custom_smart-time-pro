package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRecordAudioSet extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    private int mDuration;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleRecordAudioSet() {
        this(0, 1, null);
    }

    public static /* synthetic */ BleRecordAudioSet copy$default(BleRecordAudioSet bleRecordAudioSet, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleRecordAudioSet.mDuration;
        }
        return bleRecordAudioSet.copy(i);
    }

    public final int component1() {
        return this.mDuration;
    }

    @aa1
    public final BleRecordAudioSet copy(int i) {
        return new BleRecordAudioSet(i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mDuration = readInt16(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int i = this.mDuration;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleRecordAudioSet) && this.mDuration == ((BleRecordAudioSet) obj).mDuration;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public int hashCode() {
        return Integer.hashCode(this.mDuration);
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    @aa1
    public String toString() {
        return "BleRecordAudioSet(mDuration=" + this.mDuration + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRecordAudioSet(int i) {
        this.mDuration = i;
    }

    public /* synthetic */ BleRecordAudioSet(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
