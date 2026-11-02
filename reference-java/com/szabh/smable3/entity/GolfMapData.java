package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GolfMapData extends BleWritable {

    @tb1
    private byte[] mapData;
    private final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public GolfMapData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GolfMapData copy$default(GolfMapData golfMapData, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr = golfMapData.mapData;
        }
        if ((i2 & 2) != 0) {
            i = golfMapData.type;
        }
        return golfMapData.copy(bArr, i);
    }

    @tb1
    public final byte[] component1() {
        return this.mapData;
    }

    public final int component2() {
        return this.type;
    }

    @aa1
    public final GolfMapData copy(@tb1 byte[] bArr, int i) {
        return new GolfMapData(bArr, i);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.type);
        byte[] bArr = this.mapData;
        int length = bArr != null ? bArr.length : 0;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length, LITTLE_ENDIAN);
        byte[] bArr2 = this.mapData;
        if (bArr2 != null) {
            BleWritable.writeBytes$default(this, bArr2, null, 2, null);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GolfMapData)) {
            return false;
        }
        GolfMapData golfMapData = (GolfMapData) obj;
        return Intrinsics.XOO0ii0(this.mapData, golfMapData.mapData) && this.type == golfMapData.type;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] bArr = this.mapData;
        return (bArr != null ? bArr.length : 0) + 5;
    }

    @tb1
    public final byte[] getMapData() {
        return this.mapData;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        byte[] bArr = this.mapData;
        return ((bArr == null ? 0 : Arrays.hashCode(bArr)) * 31) + Integer.hashCode(this.type);
    }

    public final void setMapData(@tb1 byte[] bArr) {
        this.mapData = bArr;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GolfMapData(type=");
        sb.append(this.type);
        sb.append(", mapData=");
        byte[] bArr = this.mapData;
        sb.append(bArr != null ? bArr.length : 0);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public GolfMapData(@tb1 byte[] bArr, int i) {
        this.mapData = bArr;
        this.type = i;
    }

    public /* synthetic */ GolfMapData(byte[] bArr, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bArr, (i2 & 2) != 0 ? 0 : i);
    }
}
