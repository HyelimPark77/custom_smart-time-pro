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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    private int mDuration;

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

    public BleRecordAudioSet() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ BleRecordAudioSet copy$default(BleRecordAudioSet r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mDuration;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.mDuration;
    }

    @aa1
    public final BleRecordAudioSet copy(int r2) {
        return new BleRecordAudioSet(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDuration = readInt16(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mDuration;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleRecordAudioSet) == true) goto L9;
        return false;
    L9:
        if (this.mDuration == ((BleRecordAudioSet) r4).mDuration) goto L11;
        return false;
    L11:
        return true;
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

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    @aa1
    public String toString() {
        return "BleRecordAudioSet(mDuration=" + this.mDuration + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRecordAudioSet(int r1) {
        this.mDuration = r1;
    }

    public /* synthetic */ BleRecordAudioSet(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
