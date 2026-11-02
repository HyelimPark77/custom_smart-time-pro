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
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_IMEI = 1;
    public static final int TYPE_SN = 2;

    @aa1
    private byte[] mData;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleDeviceUniqueDataSettings() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleDeviceUniqueDataSettings copy$default(BleDeviceUniqueDataSettings bleDeviceUniqueDataSettings, int i, byte[] bArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleDeviceUniqueDataSettings.mType;
        }
        if ((i2 & 2) != 0) {
            bArr = bleDeviceUniqueDataSettings.mData;
        }
        return bleDeviceUniqueDataSettings.copy(i, bArr);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final byte[] component2() {
        return this.mData;
    }

    @aa1
    public final BleDeviceUniqueDataSettings copy(int i, @aa1 byte[] mData) {
        Intrinsics.X0O(mData, "mData");
        return new BleDeviceUniqueDataSettings(i, mData);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDeviceUniqueDataSettings)) {
            return false;
        }
        BleDeviceUniqueDataSettings bleDeviceUniqueDataSettings = (BleDeviceUniqueDataSettings) obj;
        return this.mType == bleDeviceUniqueDataSettings.mType && Intrinsics.XOO0ii0(this.mData, bleDeviceUniqueDataSettings.mData);
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

    public final void setMData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mData = bArr;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleDeviceUniqueDataSettings(mType=");
        sb.append(this.mType);
        sb.append(", mSize=");
        sb.append(this.mData.length);
        sb.append(", mData=");
        sb.append(this.mType == 1 ? new String(this.mData, Charsets.IiI10X) : ByteArrayExtKt.getMHexString(this.mData));
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleDeviceUniqueDataSettings(int i, @aa1 byte[] mData) {
        Intrinsics.X0O(mData, "mData");
        this.mType = i;
        this.mData = mData;
    }

    public /* synthetic */ BleDeviceUniqueDataSettings(int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new byte[0] : bArr);
    }
}
