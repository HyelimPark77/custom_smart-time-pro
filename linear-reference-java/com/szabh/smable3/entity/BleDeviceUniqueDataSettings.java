package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleDeviceUniqueDataSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int TYPE_IMEI = 1;
    public static final int TYPE_SN = 2;

    @aa1
    private byte[] mData;
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

    /* JADX WARN: Multi-variable type inference failed */
    public BleDeviceUniqueDataSettings() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleDeviceUniqueDataSettings copy$default(BleDeviceUniqueDataSettings r0, int r1, byte[] r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mData;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final byte[] component2() {
        return this.mData;
    }

    @aa1
    public final BleDeviceUniqueDataSettings copy(int r2, @aa1 byte[] r3) {
        Intrinsics.X0O(r3, "mData");
        return new BleDeviceUniqueDataSettings(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readUInt8();
        this.mData = readBytes(readInt8());
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeInt8(this.mData.length);
        BleWritable.writeBytes$default(this, this.mData, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDeviceUniqueDataSettings) == true) goto L8;
        return false;
    L8:
        BleDeviceUniqueDataSettings r6 = (BleDeviceUniqueDataSettings) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mData, r6.mData) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final byte[] getMData() {
        return this.mData;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mData.length + 2;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mType) * 31) + Arrays.hashCode(this.mData);
    }

    public final void setMData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mData = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleDeviceUniqueDataSettings(mType=");
        r0.append(this.mType);
        r0.append(", mSize=");
        r0.append(this.mData.length);
        r0.append(", mData=");
        if (this.mType != 1) goto L5;
        String r1 = new String(this.mData, Charsets.IiI10X);
    L6:
        r0.append(r1);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    L5:
        r1 = ByteArrayExtKt.getMHexString(this.mData);
        goto L6
    }

    public BleDeviceUniqueDataSettings(int r2, @aa1 byte[] r3) {
        Intrinsics.X0O(r3, "mData");
        this.mType = r2;
        this.mData = r3;
    }

    public /* synthetic */ BleDeviceUniqueDataSettings(int r2, byte[] r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = new byte[0];
    L8:
        this(r2, r3);
    }
}
