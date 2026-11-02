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
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_HR = 1;

    @aa1
    private BleWritable mResponse;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleCalibrationData() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleCalibrationData copy$default(BleCalibrationData bleCalibrationData, int i, BleWritable bleWritable, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleCalibrationData.mType;
        }
        if ((i2 & 2) != 0) {
            bleWritable = bleCalibrationData.mResponse;
        }
        return bleCalibrationData.copy(i, bleWritable);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleWritable component2() {
        return this.mResponse;
    }

    @aa1
    public final BleCalibrationData copy(int i, @aa1 BleWritable mResponse) {
        Intrinsics.X0O(mResponse, "mResponse");
        return new BleCalibrationData(i, mResponse);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() throws IllegalAccessException, InstantiationException {
        BleWritable bleWritable;
        super.decode();
        this.mType = readUInt8();
        readInt8();
        if (this.mType == 1) {
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            int length = mBytes.length;
            Object objNewInstance = BleCalibrationHrData.class.newInstance();
            BleReadable bleReadable = (BleReadable) objNewInstance;
            bleReadable.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(mBytes, 2, length));
            bleReadable.decode();
            Intrinsics.O10IXXX0X(objNewInstance, "also(...)");
            bleWritable = (BleWritable) bleReadable;
        } else {
            bleWritable = new BleWritable();
        }
        this.mResponse = bleWritable;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeInt8(this.mResponse.getMLengthToWrite());
        writeObject(this.mResponse);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCalibrationData)) {
            return false;
        }
        BleCalibrationData bleCalibrationData = (BleCalibrationData) obj;
        return this.mType == bleCalibrationData.mType && Intrinsics.XOO0ii0(this.mResponse, bleCalibrationData.mResponse);
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

    public final void setMResponse(@aa1 BleWritable bleWritable) {
        Intrinsics.X0O(bleWritable, "<set-?>");
        this.mResponse = bleWritable;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleFactoryTest(mType=" + this.mType + ", mResponse=" + this.mResponse + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCalibrationData(int i, @aa1 BleWritable mResponse) {
        Intrinsics.X0O(mResponse, "mResponse");
        this.mType = i;
        this.mResponse = mResponse;
    }

    public /* synthetic */ BleCalibrationData(int i, BleWritable bleWritable, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new BleWritable() : bleWritable);
    }
}
