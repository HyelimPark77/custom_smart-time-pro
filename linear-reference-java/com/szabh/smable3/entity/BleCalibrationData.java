package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleCalibrationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCalibrationData.kt\ncom/szabh/smable3/entity/BleCalibrationData\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n1#1,68:1\n277#2,5:69\n*S KotlinDebug\n*F\n+ 1 BleCalibrationData.kt\ncom/szabh/smable3/entity/BleCalibrationData\n*L\n55#1:69,5\n*E\n"})
public final class BleCalibrationData extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int TYPE_HR = 1;

    @aa1
    private BleWritable mResponse;
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
    public BleCalibrationData() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleCalibrationData copy$default(BleCalibrationData r0, int r1, BleWritable r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mResponse;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleWritable component2() {
        return this.mResponse;
    }

    @aa1
    public final BleCalibrationData copy(int r2, @aa1 BleWritable r3) {
        Intrinsics.X0O(r3, "mResponse");
        return new BleCalibrationData(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readUInt8();
        readInt8();
        if (this.mType != 1) goto L5;
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        int r1 = r0.length;
        Object r2 = BleCalibrationHrData.class.newInstance();
        BleReadable r3 = (BleReadable) r2;
        r3.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r0, 2, r1));
        r3.decode();
        Intrinsics.O10IXXX0X(r2, "also(...)");
        BleWritable r4 = (BleWritable) r3;
    L6:
        this.mResponse = r4;
        return;
    L5:
        r4 = new BleWritable();
        goto L6
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeInt8(this.mResponse.getMLengthToWrite());
        writeObject(this.mResponse);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCalibrationData) == true) goto L8;
        return false;
    L8:
        BleCalibrationData r6 = (BleCalibrationData) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mResponse, r6.mResponse) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mResponse.getMLengthToWrite() + 2;
    }

    @aa1
    public final BleWritable getMResponse() {
        return this.mResponse;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mType) * 31) + this.mResponse.hashCode();
    }

    public final void setMResponse(@aa1 BleWritable r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mResponse = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleFactoryTest(mType=" + this.mType + ", mResponse=" + this.mResponse + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCalibrationData(int r2, @aa1 BleWritable r3) {
        Intrinsics.X0O(r3, "mResponse");
        this.mType = r2;
        this.mResponse = r3;
    }

    public /* synthetic */ BleCalibrationData(int r1, BleWritable r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new BleWritable();
    L8:
        this(r1, r2);
    }
}
