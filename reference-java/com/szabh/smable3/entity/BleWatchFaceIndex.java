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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 2;
    private int mIndex;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleWatchFaceIndex() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleWatchFaceIndex copy$default(BleWatchFaceIndex bleWatchFaceIndex, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleWatchFaceIndex.mType;
        }
        if ((i3 & 2) != 0) {
            i2 = bleWatchFaceIndex.mIndex;
        }
        return bleWatchFaceIndex.copy(i, i2);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mIndex;
    }

    @aa1
    public final BleWatchFaceIndex copy(int i, int i2) {
        return new BleWatchFaceIndex(i, i2);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWatchFaceIndex)) {
            return false;
        }
        BleWatchFaceIndex bleWatchFaceIndex = (BleWatchFaceIndex) obj;
        return this.mType == bleWatchFaceIndex.mType && this.mIndex == bleWatchFaceIndex.mIndex;
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

    public final void setMIndex(int i) {
        this.mIndex = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleWatchFaceIndex(mType=" + this.mType + ", mIndex=" + this.mIndex + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWatchFaceIndex(int i, int i2) {
        this.mType = i;
        this.mIndex = i2;
    }

    public /* synthetic */ BleWatchFaceIndex(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
