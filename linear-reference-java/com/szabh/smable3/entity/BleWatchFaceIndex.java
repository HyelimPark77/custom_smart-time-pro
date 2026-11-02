package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWatchFaceIndex extends BleWritable {
    public static final int BLE_WATCHFACE_TYPE_BUILTIN = 0;
    public static final int BLE_WATCHFACE_TYPE_CLOUDY = 1;
    public static final int BLE_WATCHFACE_TYPE_CUSTOM = 2;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2;
    private int mIndex;
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

    public BleWatchFaceIndex() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleWatchFaceIndex copy$default(BleWatchFaceIndex r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mIndex;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mIndex;
    }

    @aa1
    public final BleWatchFaceIndex copy(int r2, int r3) {
        return new BleWatchFaceIndex(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readUInt8();
        this.mIndex = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeInt8(this.mIndex);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWatchFaceIndex) == true) goto L8;
        return false;
    L8:
        BleWatchFaceIndex r6 = (BleWatchFaceIndex) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (this.mIndex == r6.mIndex) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMIndex() {
        return this.mIndex;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 2;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mIndex);
    }

    public final void setMIndex(int r1) {
        this.mIndex = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleWatchFaceIndex(mType=" + this.mType + ", mIndex=" + this.mIndex + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWatchFaceIndex(int r1, int r2) {
        this.mType = r1;
        this.mIndex = r2;
    }

    public /* synthetic */ BleWatchFaceIndex(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
