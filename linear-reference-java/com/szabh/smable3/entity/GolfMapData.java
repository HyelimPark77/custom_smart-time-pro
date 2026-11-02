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
        byte[] r2 = null;
        this(r2, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GolfMapData copy$default(GolfMapData r0, byte[] r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mapData;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.type;
    L9:
        return r0.copy(r1, r2);
    }

    @tb1
    public final byte[] component1() {
        return this.mapData;
    }

    public final int component2() {
        return this.type;
    }

    @aa1
    public final GolfMapData copy(@tb1 byte[] r2, int r3) {
        return new GolfMapData(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.type);
        byte[] r0 = this.mapData;
        if (r0 == null) goto L5;
        int r1 = r0.length;
    L6:
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r1, r2);
        byte[] r3 = this.mapData;
        if (r3 == null) goto L10;
        BleWritable.writeBytes$default(this, r3, null, 2, null);
        return;
    L10:
        return;
    L5:
        r1 = 0;
        goto L6
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GolfMapData) == true) goto L8;
        return false;
    L8:
        GolfMapData r6 = (GolfMapData) r5;
        if (Intrinsics.XOO0ii0(this.mapData, r6.mapData) == true) goto L12;
        return false;
    L12:
        if (this.type == r6.type) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mapData;
        if (r0 == null) goto L5;
        int r1 = r0.length;
    L7:
        return r1 + 5;
    L5:
        r1 = 0;
        goto L7
    }

    @tb1
    public final byte[] getMapData() {
        return this.mapData;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        byte[] r0 = this.mapData;
        if (r0 != null) goto L5;
        int r1 = 0;
    L7:
        return (r1 * 31) + Integer.hashCode(this.type);
    L5:
        r1 = Arrays.hashCode(r0);
        goto L7
    }

    public final void setMapData(@tb1 byte[] r1) {
        this.mapData = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("GolfMapData(type=");
        r0.append(this.type);
        r0.append(", mapData=");
        byte[] r1 = this.mapData;
        if (r1 == null) goto L5;
        int r2 = r1.length;
    L6:
        r0.append(r2);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    L5:
        r2 = 0;
        goto L6
    }

    public GolfMapData(@tb1 byte[] r1, int r2) {
        this.mapData = r1;
        this.type = r2;
    }

    public /* synthetic */ GolfMapData(byte[] r1, int r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
